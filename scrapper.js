const puppeteer = require('puppeteer');
const fs = require('fs');


/**
 * Main function. Opens browser, logs into website and navigates to recipes.
 *
 * TODO:
 *
 * Make it headless OR make it all through requests (if I can figure out how to get it to work... javascript complains on the server)
 */

var username = ""
var password = ""
async function scraper() {
    const browser = await puppeteer.launch({headless: false});
    const page = await browser.newPage();
    await page.goto('http://americastestkitchen.com/sign_in?next=%2F');

    //log in
    await page.type('#email', username);
    await page.type('#app-content > main > section > section > article.auth-content__primary > form > fieldset > div.appForm__fields > div:nth-child(2) > input', password);
    await page.click("#app-content > main > section > section > article.auth-content__primary > form > fieldset > div.appForm__action > button");

    //go to recipes
    await page.waitFor(1000);
    await page.click("#app-content > div.content.global-header > div.atkGobalWrapper > div.atkGlobalSiteNav > div > nav > ul > li:nth-child(2) > a");

    //go to soups and stews
    await page.waitFor(1000);
    await page.click("#app > div > main > section > menu > div.browse-facet-link-list > div.browse-facet-link-list__links > a:nth-child(14)");

    //expand the recipe list
    let state = true;
    while (state) {
        try {
            await page.waitFor(1000);
            await page.click("#app > div > main > section > section > div.browse-load-more__wrapper > a");
        } catch {
            state = false;
            break;
        }
    }

    getRecipes(page, browser);

}

/**
 * Gets the name and URL of each recipe in the open page. This is called from the context of the main recipes page.
 * @param {page} main recipe page to get information out of. Should always be the main recipe page.
 */
async function recordRecipes(page) {
    let recipeData = await page.evaluate( async () => {
        const recipes = [];
        // get the recipes in the page
        let recipeElms = document.querySelectorAll('div.recipe[data-index]');
        // get the recipe data from each element
        recipeElms.forEach(async (recipe) => {
            //write elements of recipe in a json format
            let recipeJson = {};
            recipeJson.name = recipe.querySelector('a.result__title-link').innerText;
            recipeJson.link = 'http://americastestkitchen.com' + recipe.querySelector('a.result__title-link').getAttribute('href') + '/print';
            //add recipe to array
            recipes.push(recipeJson);
        });
        return recipes;
    });
    console.dir(recipeData);
    //write recipes array to json file
    fs.writeFile('recipes.json', JSON.stringify(recipeData), 'utf8', function(err){
        if(err) throw err;
    });
}

/**
 * Writes recipes' name and link to a json file, then reads the file and opens each link to scrape the ingredients.
 * @param {page} main recipe page to get information out of. Should always be the main recipe page.
 * @param {browser} browser
 */
function getRecipes (page, browser) {
    //write json file with links
    recordRecipes(page);
    let temp = [];
    //reads json file
    fs.readFile('recipes.json', 'utf8', async function (err, data) {
        if (err) throw err;
        const info = JSON.parse(data);

        for (const link of info) {
            console.dir(link.link);
            //opens a new tab with the link
            const newPage = await browser.newPage();
            await newPage.goto(link.link, {waitUntil: 'networkidle2'});
            await newPage.waitFor(1000);

            let data = await newPage.evaluate(() => {
                //dictionary for determining if the element contains a measuring unit
                let dictionary = [
                    'teaspoon', 'teaspoons','tsp','tsps',
                    'tablespoon', 'tablespoons','tbsp','tbsps',
                    'cup','cups',
                    'quart', 'quarts','qt','qts',
                    'pound', 'pounds', 'lb','lbs',
                    'kilogram','kilograms','kg','kgs',
                    'ounce','ounces','oz','ozs',
                ];
                const ingredients = [];
                //selects all elements of the ingredient table
                let trs = Array.from(document.querySelectorAll('table tr'));
                trs.forEach(tr => {
                    let json = {};
                    let tds = Array.from(tr.querySelectorAll('td'))
                    json.amount = tds[0].innerText;
                    json.ingredient = tds[1].innerText;

                    let str = tds[1].innerText;
                    str = str.split(' ');
                    for (const dic of dictionary) {
                        //if the ingredient element has a word in the dictionary (measurement), it sets so
                        if (str.includes(dic)){
                            json.ingredient = '';
                            json.measurement = dic;
                            //deletes the measurement from the ingredient
                            str.splice(str.indexOf(dic), 1);
                            str.forEach( word => {
                                json.ingredient = json.ingredient + word + ' ';
                            });
                            break;
                        } else {
                            //if no measurement, unit is implicit and is made explicit in wording
                            json.measurement = 'unit';
                        }
                    }

                    ingredients.push(json);
                    console.dir(json);
                });
                return ingredients;
            });
            //sets ingredient in json format
            let jsontemp = {
                name: link.name,
                link: link.link,
                ingredients: data
            };

            temp.push(jsontemp);
            console.dir(jsontemp);
            await newPage.close();
            //writes json
            fs.writeFile('ingredients.json', JSON.stringify(temp) , 'utf8', function(err){
                if(err) throw err;
                console.dir('wrote to file');
            });
        }
    });
}

scraper();

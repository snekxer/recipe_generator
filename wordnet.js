const natural = require('natural');
const wordnet = new natural.WordNet();
const fs = require('fs');

fs.readFile("ingredients.json", "UTF-8", function(err, data){
    if (err) throw err;
    let recipeJson = JSON.parse(data);
    for(let i=0; i<recipeJson.length; i++){
        for(let j=0; j<recipeJson[i].ingredients.length; j++) {
            //console.log(recipeJson[i].ingredients);
            let ingredient_words = recipeJson[i].ingredients[j].ingredient.split(' ');
            for(let k=0; k<ingredient_words.length; k++){

            }
        }
    }
});



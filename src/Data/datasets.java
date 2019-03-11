package Data;

import Models.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class datasets extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //Flavors
    public Flavor base = new Flavor("Base");
    public Flavor fatty = new Flavor("Fatty");
    public Flavor sweet = new Flavor("Sweet");
    public Flavor sour = new Flavor("Sour");
    public Flavor bitter = new Flavor("Bitter");
    public Flavor salty = new Flavor("Salty");
    public Flavor spicy = new Flavor("Spicy");
    public Flavor savory = new Flavor("Savory");
    public Flavor pungent = new Flavor("Pungent");

    public Role carbohydrate = new Role("Carbohydrate");
    public Role protein = new Role("Protein");
    public Role fiber = new Role("Fiber");
    public Role fat = new Role("Fat");

    public Type vegetable = new Type(carbohydrate, "Vegetable");
    public Type diaryP = new Type(protein, "Diary");
    public Type diaryF = new Type(fat, "Diary");
    public Type dressing = new Type(fat, "Dressing");
    public Type vegetalF = new Type(fat, "Vegetable fat");
    public Type fruit = new Type(carbohydrate, "Fruit");
    public Type cereal = new Type(fiber, "Cereal");
    public Type legumen = new Type(carbohydrate, "Legumen");
    public Type unlimited = new Type(carbohydrate, "Unlimited");
    public Type animal = new Type(protein, "Animal");
    public Type processed = new Type(protein, "Processed Vegetable");

    public Ingredient artichoke = new Ingredient("Artichoke", base, vegetable, 1, "cup");
    public Ingredient eggplant = new Ingredient("Eggplant", base, vegetable, 1, "cup");
    public Ingredient pumpkin = new Ingredient("Pumpkin", base, vegetable, 1, "cup");
    public Ingredient whiteCabbage = new Ingredient("White Cabbage", base, vegetable, 1, "cup");
    public Ingredient cabbage = new Ingredient("Cabbage", base, vegetable, 1, "cup");
    public Ingredient bruselSprouts = new Ingredient("Brusel Sprouts", base, vegetable, 1, "cup");
    public Ingredient cabbagehead = new Ingredient("Cabbagehead", base, vegetable, 1, "cup");
    public Ingredient onion = new Ingredient("Onion", base, vegetable, 1, "cup");
    public Ingredient aspargus = new Ingredient("Aspargus", base, vegetable, 1, "cup");
    public Ingredient green_beans = new Ingredient("Green Beans", base, vegetable, 1, "cup");
    public Ingredient turnip = new Ingredient("Turnip", base, vegetable, 1, "cup");
    public Ingredient palmHeart = new Ingredient("Plam Heart", base, vegetable, 1, "cup");
    public Ingredient parsley = new Ingredient("Pasley", base, vegetable, 1, "cup");
    public Ingredient redPepper = new Ingredient("Red Pepper", base, vegetable, 1, "cup");
    public Ingredient leek = new Ingredient("Leek", base, vegetable, 1, "cup");
    public Ingredient beet = new Ingredient("Beet", base, vegetable, 1, "cup");
    public Ingredient aurugula = new Ingredient("Aurugula", base, vegetable, 1, "cup");
    public Ingredient tomato = new Ingredient("Tomato", base, vegetable, 1, "cup");
    public Ingredient carrot = new Ingredient("Carrot", base, vegetable, 1, "cup");
    public Ingredient veggieSoup = new Ingredient("Veggie Soup", base, vegetable, 1, "cup");
    public Ingredient veggieCream = new Ingredient("Veggie Cream", base, vegetable, 1, "cup");

    public Ingredient chard = new Ingredient("Chard", base, unlimited, 1, "cup");
    public Ingredient celery = new Ingredient("Celery", base, unlimited, 1, "cup");
    public Ingredient brocoli = new Ingredient("Brocoli", base, unlimited, 1, "cup");
    public Ingredient soySprouts = new Ingredient("Soy Sprouts", base, unlimited, 1, "cup");
    public Ingredient zuccini = new Ingredient("Zuccini", base, unlimited, 1, "cup");
    public Ingredient mushrooms = new Ingredient("Mushrooms", base, unlimited, 1, "cup");
    public Ingredient cauliflower = new Ingredient("Cauliflower", base, unlimited, 1, "cup");
    public Ingredient spinach = new Ingredient("Spinach", base, unlimited, 1, "cup");
    public Ingredient lettuce = new Ingredient("Lettuce", base, unlimited, 1, "cup");
    public Ingredient cucumber = new Ingredient("Cucumber", base, unlimited, 1, "cup");
    public Ingredient pickles = new Ingredient("Pickles", base, unlimited, 1, "cup");
    public Ingredient greenPepper = new Ingredient("Green Pepper", base, unlimited, 1, "cup");
    public Ingredient radish = new Ingredient("Radish", base, unlimited, 1, "cup");

    public Ingredient date = new Ingredient("Date", sweet, fruit, 2, "units");
    public Ingredient cherry = new Ingredient("Cherry", sweet, fruit, 20, "units");
    public Ingredient peach = new Ingredient("Peach", sweet, fruit, 1, "unit");
    public Ingredient strawberry = new Ingredient("Strawberry", sweet, fruit, 8, "units");
    public Ingredient passionfruit = new Ingredient("Passionfruit", sweet, fruit, 2, "units");
    public Ingredient mandarin = new Ingredient("Mandarin", sweet, fruit, 1, "unit");
    public Ingredient apple = new Ingredient("Apple", sweet, fruit, 1, "unit");
    public Ingredient blackberry = new Ingredient("Blackberry", sweet, fruit, 0.5, "cups");
    public Ingredient orange = new Ingredient("Orange", sweet, fruit, 1, "unit");
    public Ingredient pear = new Ingredient("Pear", sweet, fruit, 0.5, "unit");
    public Ingredient grapefruit = new Ingredient("Grapefruit", sour, fruit, 1, "unit");
    public Ingredient banana = new Ingredient("Banana", sweet, fruit, 0.5, "unit");
    public Ingredient dryDate = new Ingredient("Dry Date", sweet, fruit, 4, "units");
    public Ingredient coconut = new Ingredient("Coconut", sweet, fruit, 1, "unit");
    public Ingredient fig = new Ingredient("Fig", sweet, fruit, 1, "unit");
    public Ingredient kiwi = new Ingredient("Kiwi", sour, fruit, 0.5, "cup");
    public Ingredient mango = new Ingredient("Mango", sweet, fruit, 2, "slices");
    public Ingredient pineapple = new Ingredient("Pineapple", sour, fruit, 0.5, "cup");
    public Ingredient grape = new Ingredient("Grape", sweet, fruit, 8, "units");
    public Ingredient raisin = new Ingredient("Raisin", sweet, fruit, 10, "units");
    public Ingredient cantaloupe = new Ingredient("Peach", sweet, fruit, 0.5, "cup");
    public Ingredient watermelon = new Ingredient("Strawberry", sweet, fruit, 0.5, "cup");
    public Ingredient papaya = new Ingredient("Passionfruit", sweet, fruit, 0.5, "cup");

    public Ingredient rawOat = new Ingredient("Raw Oat", base, cereal, 0.33, "cups");
    public Ingredient wildRice = new Ingredient("Wild Rice", base, cereal, 0.5, "cups");
    public Ingredient couscous = new Ingredient("Couscous", base, cereal, 0.5, "cups");
    public Ingredient oatmeal = new Ingredient("Oatmeal", base, cereal, 0.33, "cups");
    public Ingredient wholePitaBread = new Ingredient("Whole Wheat Pita Bread", base, cereal, 1, "slice");
    public Ingredient proteinPancake = new Ingredient("Protein Pancake", base, cereal, 1, "unit");
    public Ingredient quinoa = new Ingredient("Quinoa", base, cereal, 0.5, "cups");
    public Ingredient almondFlour = new Ingredient("Almond Flour", base, cereal, 0.5, "cups");
    public Ingredient carobFlour = new Ingredient("Carob Flour", base, cereal, 0.2, "cups");
    public Ingredient coconutFlour = new Ingredient("Coconut Flour", base, cereal, 0.33, "cups");
    public Ingredient garbanzoFlour = new Ingredient("Garbanzo Flour", base, cereal, 0.25, "cups");
    public Ingredient soyFlour = new Ingredient("Soy Flour", base, cereal, 0.5, "cups");
    public Ingredient brownRice = new Ingredient("Brown Rice", base, cereal, 0.5, "cups");
    public Ingredient cookedOat = new Ingredient("Cooked Oat", base, cereal, 0.75, "cups");
    public Ingredient sweetPotato = new Ingredient("Sweet Potato", base, cereal, 1, "unit");
    public Ingredient muesli = new Ingredient("Muesli", base, cereal, 2, "tbsp");
    public Ingredient wholeWheatBread = new Ingredient("Whole Wheat Bread", base, cereal, 1, "slice");
    public Ingredient wholeWheatPasta = new Ingredient("Whole Wheat Pasta", base, cereal, 0.5, "cups");
    public Ingredient tortilla = new Ingredient("Tortilla", base, cereal, 0.5, "units");
    public Ingredient maizeTortilla = new Ingredient("Maize Tortilla", base, cereal, 1, "unit");
    public Ingredient wholeWheatToast = new Ingredient("Whole Wheat Toast", base, cereal, 3, "units");
    public Ingredient Wheat = new Ingredient("Wheat", base, cereal, 2, "tbsp");
    public Ingredient plantain = new Ingredient("Plantain", base, cereal, 0.5, "units");
    public Ingredient wholeWheatFlour = new Ingredient("Whole Wheat Flour", base, cereal, 0.25, "cups");
    public Ingredient whiteRice = new Ingredient("White Rice", base, cereal, 0.5, "cups");
    public Ingredient granolaBar = new Ingredient("Granola Bar", base, cereal, 0.5, "units");
    public Ingredient mariaCookies = new Ingredient("Maria Cookies", base, cereal, 3, "units");
    public Ingredient saltCrackers = new Ingredient("Salt Crackers", base, cereal, 2, "units");
    public Ingredient corn = new Ingredient("Corn", base, cereal, 1, "unit");
    public Ingredient ripePlantain = new Ingredient("Ripe Plantain", base, cereal, 0.3, "units");
    public Ingredient potato = new Ingredient("Potato", base, cereal, 2, "small units");
    public Ingredient mashedPotatoes = new Ingredient("Mashed Potatoes", base, cereal, 0.25, "cups");
    public Ingredient pancake = new Ingredient("Pancake", base, cereal, 0.5, "units");
    public Ingredient riceCake = new Ingredient("Rice Cake", base, cereal, 3, "units");
    public Ingredient cassava = new Ingredient("Cassava", base, cereal, 0.5, "cups");
    public Ingredient riceFlour = new Ingredient("Rice Flour", base, cereal, 0.25, "cups");
    public Ingredient cornstarch = new Ingredient("Cornstarch", base, cereal, 0.16, "cups");

    public Ingredient peas = new Ingredient("Peas", base, legumen, 0.5, "cups");
    public Ingredient boiledBeans = new Ingredient("Boiled Beans", base, legumen, 0.5, "cups");
    public Ingredient menestra = new Ingredient("Menestra", base, legumen, 0.33, "cups");
    public Ingredient lentil = new Ingredient("Lentils", base, legumen, 0.33, "cups");
    public Ingredient garbanzo = new Ingredient("Garbanzo", base, legumen, 0.75, "cups");
    public Ingredient limaBeans = new Ingredient("Lima Beans", base, legumen, 0.5, "cups");
    public Ingredient cookedSoy = new Ingredient("Cooked Soy", base, legumen, 0.33, "cups");

    public Ingredient tuna = new Ingredient("Tuna", savory, animal, 40, "g");
    public Ingredient shrimp = new Ingredient("Shrimp", savory, animal, 8, "units");
    public Ingredient eggWhite = new Ingredient("Egg White", savory, animal, 3, "units");
    public Ingredient egg = new Ingredient("Whole Egg", savory, animal, 1, "unit");
    public Ingredient quailEgg = new Ingredient("Quail Egg", savory, animal, 6, "units");
    public Ingredient chickenSausage = new Ingredient("Chicken Sausage", savory, animal, 1, "unit");
    public Ingredient turkeyHam = new Ingredient("Turkey Ham", savory, animal, 2, "slices");
    public Ingredient chicken = new Ingredient("Chicken", savory, animal, 50, "g");
    public Ingredient turkey = new Ingredient("Turkey", savory, animal, 50, "g");
    public Ingredient beef = new Ingredient("Beef", savory, animal, 50, "g");
    public Ingredient pork = new Ingredient("Pork", savory, animal, 40, "g");
    public Ingredient fish = new Ingredient("Fish", savory, animal, 50, "g");
    public Ingredient salmon = new Ingredient("Salmon", savory, animal, 40, "g");
    public Ingredient crab = new Ingredient("Crab", savory, animal, 100, "g");
    public Ingredient oyster = new Ingredient("Oyster", savory, animal, 100, "g");
    public Ingredient prawn = new Ingredient("Prawn", savory, animal, 75, "g");
    public Ingredient octopus = new Ingredient("Octopus", savory, animal, 75, "g");
    public Ingredient peanutButter = new Ingredient("Peanut Butter", fatty, processed, 1, "tbsp");
    public Ingredient almondButter = new Ingredient("Almond Butter", fatty, processed, 1, "tbsp");
    public Ingredient powderProtein = new Ingredient("Powder Protein", base, processed, 1, "scoop");
    public Ingredient proteinBar = new Ingredient("Protein Bar", sweet, processed, 1, "unit");
    public Ingredient mozarella = new Ingredient("Mozzarella cheese", fatty, diaryP, 30, "g");
    public Ingredient ricotta = new Ingredient("Ricotta Cheese", fatty, diaryP, 2, "tbsp");
    public Ingredient fresco = new Ingredient("Fresco Cheese", fatty, diaryP, 60, "g");
    public Ingredient parmesan = new Ingredient("Parmesan Cheese", fatty, diaryP, 3, "tbsp");
    public Ingredient manchego = new Ingredient("Manchego Cheese", fatty, diaryP, 40, "g");
    public Ingredient chevre = new Ingredient("Chevre Cheese", fatty, diaryP, 2, "tbsp");
    public Ingredient yogurtDiet = new Ingredient("Diet Yogurt", fatty, diaryP, 1, "cup");
    public Ingredient yogurtLight = new Ingredient("Light Yogurt", fatty, diaryP, 0.75, "cup");
    public Ingredient yogurt = new Ingredient("Yogurt", fatty, diaryP, 0.5, "cup");
    public Ingredient yogurtGreek = new Ingredient("Greek Yogurt", fatty, diaryP, 0.75, "cup");
    public Ingredient milkFatFree = new Ingredient("Fat Free Milk", fatty, diaryP, 1, "cup");
    public Ingredient vegetableMilk = new Ingredient("Vegetable Milk", fatty, diaryP, 0.5, "cup");

    public Ingredient oliveOil = new Ingredient("", fatty, vegetalF, 1, "tsp");
    public Ingredient olives = new Ingredient("", fatty, vegetalF, 10, "units");
    public Ingredient avocado = new Ingredient("", fatty, vegetalF, 0.33, "unit");
    public Ingredient sesameSeeds = new Ingredient("", fatty, vegetalF, 0.5, "tbsp");
    public Ingredient almonds = new Ingredient("", fatty, vegetalF, 7, "units");
    public Ingredient ranchDressing = new Ingredient("", fatty, dressing, 1, "tsp");
    public Ingredient blueCheeseDressing = new Ingredient("", fatty, dressing,1, "tsp");
    public Ingredient ceasarDressing = new Ingredient("", fatty, dressing, 1, "tsp");
    public Ingredient italianDressing = new Ingredient("", fatty, dressing, 1, "tsp");
    public Ingredient chia = new Ingredient("", fatty, vegetalF, 1, "tbsp");
    public Ingredient chocolate = new Ingredient("", fatty, vegetalF, 10, "g");
    public Ingredient cocoa = new Ingredient("", fatty, vegetalF, 1, "tsp");
    public Ingredient guacamole = new Ingredient("", fatty, vegetalF, 2, "tbsp");
    public Ingredient linseed = new Ingredient("", fatty, vegetalF, 1, "tbsp");
    public Ingredient nuts = new Ingredient("", fatty, vegetalF, 3, "units");
    public Ingredient pate = new Ingredient("", fatty, diaryF, 2, "tsp");
    public Ingredient creamCheese = new Ingredient("", fatty, diaryF, 2, "tsp");
    public Ingredient vinagrete = new Ingredient("", fatty, dressing, 3, "tsp");

    @Override
    public void start(Stage primaryStage) {

    }
}

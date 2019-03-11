package Models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Breakfast implements Filters{
    static Component vegetable = new Component (1, Ingredient vegetal);
    Component fruit;
    Component cereal;
    Component protein;
    Component fat;

    public ArrayList<ArrayList<Ingredient>> sortIngredients(ArrayList<Ingredient> all){
        ArrayList<ArrayList<Ingredient>> ingredients = new ArrayList<>();
        if()
        return ingredients;
    }

    public ArrayList<ArrayList<Ingredient>> filterIngredients(ArrayList<ArrayList<Ingredient>> all){
        ArrayList<ArrayList<Ingredient>> ingredients = new ArrayList<>();
        return ingredients;
    }

    public ArrayList<ArrayList<Ingredient>> evaluate(ArrayList<ArrayList<Ingredient>> all, int meal){ // 0=breakfast, 1=lunch, 2=snack, 3=dinner
        ArrayList<ArrayList<Ingredient>> ingredients = new ArrayList<>();
        return ingredients;
    }

    public ArrayList<ArrayList<Ingredient>> fill(ArrayList<ArrayList<Ingredient>> all, int meal ){ // 0=breakfast, 1=lunch, 2=snack, 3=dinner
        ArrayList<ArrayList<Ingredient>> ingredients = new ArrayList<>();
        return ingredients;
    }

    public Breakfast(ArrayList<ArrayList<Ingredient>> all){


        Component veggie = new Component(1, vegetable);
        Component fruits = new Component(0.5, fruit);
        Component cereals = new Component(2, cereal);
        Component proteins = new Component(3, protein);
        Component fats = new Component(2, fat);

        this.vegetable = veggie;
        this.fruit = fruits;
        this.cereal = cereals;
        this.protein = proteins;
        this.fat = fats;
    }

    public Component getVegetable() {
        return vegetable;
    }

    public void setVegetable(Component vegetable) {
        this.vegetable = vegetable;
    }

    public Component getFruit() {
        return fruit;
    }

    public void setFruit(Component fruit) {
        this.fruit = fruit;
    }

    public Component getCereal() {
        return cereal;
    }

    public void setCereal(Component cereal) {
        this.cereal = cereal;
    }

    public Component getProtein() {
        return protein;
    }

    public void setProtein(Component protein) {
        this.protein = protein;
    }

    public Component getFat() {
        return fat;
    }

    public void setFat(Component fat) {
        this.fat = fat;
    }
}

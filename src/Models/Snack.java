package Models;

public class Snack {
    Component fruit;
    Component cereal;
    Component protein;
    Component fat;

    public Snack(char whatIs, Ingredient fruitCereal, Ingredient protein, Ingredient fat) {
        if(whatIs=='F'){
            Component fruits = new Component(1, fruitCereal);
            this.fruit = fruits;
        } else if (whatIs=='C'){
            Component cereals = new Component(0.5, fruitCereal);
            this.cereal = cereals;
        }
        Component proteins = new Component(1, protein);
        Component fats = new Component(1, fat);

        this.protein = proteins;
        this.fat = fats;
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

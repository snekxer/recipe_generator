package Models;

public class Dinner {
    Component vegetable;
    Component cereal;
    Component legume;
    Component protein;
    Component fat;

    public Dinner(char whatIs, Ingredient vegetable, Ingredient cereal_legume, Ingredient protein, Ingredient fat) {
        Component veggie = new Component(1, vegetable);
        Component proteins = new Component(4, protein);
        Component fats = new Component(1, fat);
        if(whatIs=='C'){
            Component cereals = new Component(0.5, cereal_legume);
            this.cereal = cereals;
        } else if (whatIs=='L'){
            Component legumens = new Component(1, cereal_legume);
            this.legume = legumens;
        }
        this.vegetable = veggie;
        this.protein = proteins;
        this.fat = fats;
    }

    public Component getVegetable() {
        return vegetable;
    }

    public void setVegetable(Component vegetable) {
        this.vegetable = vegetable;
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

    public Component getLegume() {
        return legume;
    }

    public void setLegume(Component legume) {
        this.legume = legume;
    }
}


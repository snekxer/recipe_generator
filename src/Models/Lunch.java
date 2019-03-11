package Models;

public class Lunch {
    Component vegetable;
    Component cereal;
    Component legumen;
    Component protein;
    Component fat;

    public Lunch(Ingredient vegetable, Ingredient cereal, Ingredient legumen, Ingredient protein, Ingredient fat) {
        Component vegetables = new Component(1, vegetable);
        Component legumens = new Component(1, legumen);
        Component cereals = new Component(1, cereal);
        Component proteins = new Component(4, protein);
        Component fats = new Component(3, fat);

        this.vegetable = vegetables;
        this.cereal = cereals;
        this.legumen = legumens;
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

    public Component getLegumen() {
        return legumen;
    }

    public void setLegumen(Component legumen) {
        this.legumen = legumen;
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

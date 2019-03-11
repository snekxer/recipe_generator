package Models;

public class Ingredient {
    String name;
    Flavor flavor;
    Type type;
    double size;
    String measurement;

    public Ingredient(String name, Flavor flavor, Type type, double size, String measurement) {
        this.name = name;
        this.flavor = flavor;
        this.type = type;
        this.size = size;
        this.measurement = measurement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
}

package Models;
import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Filters {

    public ArrayList<ArrayList<Ingredient>> sortIngredients(ArrayList<Ingredient> all);
    public ArrayList<ArrayList<Ingredient>> filterIngredients(ArrayList<ArrayList<Ingredient>> all);
    public ArrayList<ArrayList<Ingredient>> evaluate(ArrayList<ArrayList<Ingredient>> all, int meal); // 0=breakfast, 1=lunch, 2=snack, 3=dinner
    public ArrayList<ArrayList<Ingredient>> fill(ArrayList<ArrayList<Ingredient>> all, int meal ); // 0=breakfast, 1=lunch, 2=snack, 3=dinner


}

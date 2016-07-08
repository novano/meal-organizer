import java.util.HashSet;
import java.util.Set;

/**
 * Created by jan.novak on 8.7.2016.
 */
public class Meal extends AbstractMeal {

    Set<Ingredient> obligatoryIngredients = new HashSet<>();
    Set<Ingredient> optionalIngredients = new HashSet<>();

    public void addIngredient(Ingredient ingredient, boolean obligatory) {

        if (containsIngredient(ingredient))
            throw new IllegalArgumentException("Ingredient already in meal!");

        Set<Ingredient> collection;
        if (obligatory)
            collection = obligatoryIngredients;
        else
            collection = optionalIngredients;
        collection.add(ingredient);

        this.energy += ingredient.getEnergy();
        this.carbohzdrate += ingredient.getCarbohzdrate();
        this.fat += ingredient.getFat();
        this.fibre += ingredient.getFibre();
        this.protein += ingredient.getProtein();
        
    }

    private boolean containsIngredient(Ingredient ingredient) {
        if (ingredient == null)
            throw new IllegalArgumentException("Ingredient cannot be NULL!");

        for (Ingredient obligatoryIngredient : obligatoryIngredients) {
            if (ingredient.equals(obligatoryIngredient))
                return true;
        }

        for (Ingredient optionalIngredient : optionalIngredients) {
            if (ingredient.equals(optionalIngredient))
                return true;
        }

        return false;
    }
}

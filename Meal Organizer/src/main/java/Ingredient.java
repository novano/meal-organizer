/**
 * Created by jan.novak on 8.7.2016.
 */
public class Ingredient extends AbstractMeal{

    public Ingredient(String name) {
        this.name = name;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setCarbohzdrate(double carbohzdrate) {
        this.carbohzdrate = carbohzdrate;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setFibre(double fibre) {
        this.fibre = fibre;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}

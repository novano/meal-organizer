/**
 * Created by jan.novak on 8.7.2016.
 */
public abstract class AbstractMeal implements Dietable{

    protected double energy;

    protected double carbohzdrate;
    protected double fat;
    protected double fibre;
    protected double protein;

    protected String name;

    @Override
    public double getEnergy() {
        return energy;
    }
    @Override
    public double getCarbohzdrate() {
        return carbohzdrate;
    }
    @Override
    public double getFat() {
        return fat;
    }
    @Override
    public double getFibre() {
        return fibre;
    }
    @Override
    public double getProtein() {
        return protein;
    }
    @Override
    public String getName() {
        return name;
    }
}

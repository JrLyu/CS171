// Write the Drink class in this Java program file
public class Drink extends MenuItem{
    private double volume;

    Drink(String n, double p, double ounce) {
        super(n, p);
        volume = ounce;
    }

    public String toString() {
        return getName() + "(" + volume + "oz)";
    }
}
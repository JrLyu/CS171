// Write the Drink class in this Java program file
public class Drink extends MenuItem{ // inherit from MenuItem
    private double volume;

    Drink(String n, double p, double ounce) {
        super(n, p); // use the constructor to assign n to name and p to price
        volume = ounce; // assign ounce to volume
    }

    public String toString() {
        return getName() + "(" + volume + "oz)"; // override the toString() method
    }
}
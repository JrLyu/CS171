// Write the Salad class in this Java program file
public class Salad extends MenuItem { // inherit from MenuItem
    private double weight;
    public Salad(String n, double p, double pounds) {
        super(n, p); // use the constructor to assign n to name and p to price
        weight = pounds; // assign pounds to weight
    }

    public String toString() {
        return getName() + "(" + weight + "lb)"; // override the toString() method
    }
}
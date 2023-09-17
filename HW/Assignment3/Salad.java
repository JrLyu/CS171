// Write the Salad class in this Java program file
public class Salad extends MenuItem {
    private double weight;
    public Salad(String n, double p, double pounds) {
        super(n, p);
        weight = pounds;
    }

    public String toString() {
        return getName() + "(" + weight + "lb)";
    }
}
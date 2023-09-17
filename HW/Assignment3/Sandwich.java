// Write the Sandwich class in this Java program file
public class Sandwich extends MenuItem{
    private String size;

    Sandwich(String n, double p, String s) {
        super(n, p);
        size = s;
    }

    public String toString() {
       return getName() + "(" + size + ")";
    }
}
// Write the Sandwich class in this Java program file
public class Sandwich extends MenuItem{ // inherit from MenuItem
    private String size;

    Sandwich(String n, double p, String s) {
        super(n, p); // use the constructor to assign n to name and p to price
        size = s; // assign s to size
    }

    public String toString() {
       return getName() + "(" + size + ")"; // override the toString() method
    }
}
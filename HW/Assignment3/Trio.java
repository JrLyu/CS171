
public class Trio
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;


    // Part B: write the getPrice() method for the Trio class
    public double getPrice() {
        // Price of a trio (combo meal) is the sum of the 2 highest priced
        // items in the trio
        //
        // Compute the price of a trio and return it
        double[] price = new double[]{sandwich.getPrice(), salad.getPrice(), drink.getPrice()}; // create an array of prices
        double minPrice = price[0]; // initiation
        double sumPrice = price[0]; // initiation
        for (int i = 1; i < price.length; i++) { // loop over the array
            if (minPrice > price[i]) { // if we find a smaller price
                minPrice = price[i]; // update minPrice
            }
            sumPrice += price[i]; // compute sumPrice
        }
        return sumPrice - minPrice; // compute the final price
    }

    // Constructor
    public Trio(Sandwich s1, Salad s2, Drink d) {
        sandwich = s1;
        salad    = s2;
        drink    = d;
    }

    // toString(): converts a trio object to a String
    public String toString() {
        return sandwich.toString() + " "
                + salad.toString() + " " + drink.toString();
    }
}
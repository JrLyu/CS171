
/* ------------------------------------------------------------
   MenuItem: this is the super class used to construct
	     the Sandwich, Salad and Drink classes
	     in this homework assignment

   ***** Do NOT make changes to this program file !!! *****
   ----------------------------------------------------------- */

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String n, double p) {
        name = n;
        price = p;
        nItems++;
    }

    public String getName() {
        nGetName++;
        return name;
    }

    public double getPrice() {
        nGetPrice++;
        return price;
    }


    // *********************************************************************
    // I use the variables and methods below to check whether your 
    // implementation of the Sandwich, Salad and Drink classes are correct
    //
    // You must NOT change anything below or my test programs will fail
    // *********************************************************************
    private static int nItems = 0;
    private static int nGetName = 0;
    private static int nGetPrice = 0;

    public static int getNItems() {
        return nItems;
    }

    public static int getNName() {
        return nGetName;
    }

    public static int getNPrice() {
        return nGetPrice;
    }
}
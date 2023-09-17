public class HW3TestB {
    public static void main(String[] args) {
        int err = 0;

        MenuItem[] menu = new MenuItem[10];

        Sandwich a1 = new Sandwich("Cheeseburger",  2.00, "small");
        Sandwich a2 = new Sandwich("Cheeseburger",  4.00, "large");
        Sandwich a3 = new Sandwich("Club Sandwich", 2.75, "small");

        Salad b1 = new Salad("Coleslaw", 1.50, 0.25);
        Salad b2 = new Salad("Caesar Salad", 1.15, 0.1);
        Salad b3 = new Salad("Caesar Salad", 2.50, 0.45);

        Drink c1 = new Drink("Coke", 1.45, 1);
        Drink c2 = new Drink("Coke", 1.75, 2);
        Drink c3 = new Drink("Sprite", 1.00, 1);
        Drink c4 = new Drink("Pepsi", 2.60, 4);

        double[] ans = { 3.5, 3.75, 5.1, 5.35 };

        Trio[] t = new Trio[4];

        t[0] = new Trio( a1, b1, c1);
        t[1] = new Trio( a1, b1, c2);
        t[2] = new Trio( a1, b3, c4);
        t[3] = new Trio( a3, b3, c4);

        for (int i = 0; i < t.length; i++) {
            if (Math.abs(t[i].getPrice() - ans[i]) > 0.01) {
                err++;
                System.out.println( t[i] + ": price = " + t[i].getPrice() +
                                    " --- Wrong");
                System.out.println("Correct trio price = " + ans[i] + "\n");
            }
        }

        // System.out.println( MenuItem.getNPrice() );
        if (MenuItem.getNPrice() < 12) {
            err++;
            System.out.println("TestB failed:");
            System.out.println("   Some subclass (Sandwich,Salad,Drink) did not");
            System.out.println("   use getPrice() in the MenuItem class");
        }

        if (err == 0)
            System.out.println("Test B passed");
    }
}

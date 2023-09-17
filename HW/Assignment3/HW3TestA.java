public class HW3TestA {
    public static void main(String[] args) {
        int err = 0;

        MenuItem[] menu = new MenuItem[10];

        menu[0] = new Sandwich("Cheeseburger",  2.00, "small");
        menu[1] = new Sandwich("Cheeseburger",  4.00, "large");
        menu[2] = new Sandwich("Club Sandwich", 2.75, "small");

        if (MenuItem.getNItems() != 3) {
            err++;
            System.out.println("TestA failed:");
            System.out.println("The constructor in Sandwich class is incorrect");
            System.out.println("You did not use the MenuItem class to build Sandwich");
        }

        menu[3] = new Salad("Coleslaw", 1.50, 0.25);
        menu[4] = new Salad("Caesar Salad", 1.15, 0.1);
        menu[5] = new Salad("Caesar Salad", 1.85, 0.25);

        if (MenuItem.getNItems() != 6) {
            err++;
            System.out.println("TestA failed:");
            System.out.println("The constructor in Salad class is incorrect");
            System.out.println("You did not use the MenuItem class to build Salad");
        }

        menu[6] = new Drink("Coke", 1.45, 1);
        menu[7] = new Drink("Coke", 1.75, 2);
        menu[8] = new Drink("Sprite", 1.00, 1);
        menu[9] = new Drink("Pepsi", 1.60, 2);

        if (MenuItem.getNItems() != 10) {
            err++;
            System.out.println("TestA failed:");
            System.out.println("The constructor in Drink class is incorrect");
            System.out.println("You did not use the MenuItem class to build Drink");
        }

        String[] ans = { "Cheeseburger(small)",
                "Cheeseburger(large)",
                "Club Sandwich(small)",
                "Coleslaw(0.25lb)",
                "Caesar Salad(0.1lb)",
                "Caesar Salad(0.25lb)",
                "Coke(1.0oz)",
                "Coke(2.0oz)",
                "Sprite(1.0oz)",
                "Pepsi(2.0oz)"};

        // Test toString() in Sandwich
        for ( int i = 0; i < 3; i++) {
            if (! menu[i].toString().equals(ans[i])) {
                err++;
                System.out.println("Student: " + menu[i]
                                    + "   correct: " + ans[i]);
            }
        }

        if (MenuItem.getNName() != 3) {
            err++;
            System.out.println("TestA failed:");
            System.out.println("   The toString() method in Sandwich is incorrect");
            System.out.println("   It must use getName() in MenuItem");
        }

        // Test toString() in Salad
        for (int i = 3; i < 6; i++) {
            if (! menu[i].toString().equals(ans[i])) {
                err++;
                System.out.println("Student: " + menu[i]
                                    + "   correct: " + ans[i]);
            }
        }

        if (MenuItem.getNName() != 6) {
            err++;
            System.out.println("TestA failed:");
            System.out.println("   The toString() method in Salad is incorrect"
            );
            System.out.println("   It must use getName() in MenuItem");
        }

        // Test toString() in Drink
        for (int i = 6; i < 10; i++) {
            if (! menu[i].toString().equals(ans[i])) {
                err++;
                System.out.println("Student: " + menu[i]
                                    + "   correct: " + ans[i]);
            }
        }

        if (MenuItem.getNName() != 10) {
            err++;
            System.out.println("TestA failed:");
            System.out.println("   The toString() method in Drink is incorrect"
            );
            System.out.println("   It must use getName() in MenuItem");
        }

        if (err == 0)
            System.out.println("Test A passed");
    }
}

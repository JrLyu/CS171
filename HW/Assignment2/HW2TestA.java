public class HW2TestA {
    public static void main(String[] args) {
        int nErr = 0;
        Card a = null;
        String[] tests = {"Ace", "3", "Jack"};

        for (int i = 0; i < tests.length; i++) {
            a = new Card("Clubs", tests[i]);

            if (a.getRank().compareTo(tests[i]) != 0) {
                System.out.println("Test A failed: card rank = " +
                        tests[i] + ", but getRank() returns: " +
                        a.getRank());
                nErr++;
            }
        }

        a.update(3, 13);
        if (a.getRank().compareTo( "King" ) != 0) {
            System.out.println("Test A failed: card rank = King," +
                    " but getRank() returns: " +
                    a.getRank());
            nErr++;
        }

        if (nErr == 0) {
            System.out.println("Test A passed");
        }
    }
}

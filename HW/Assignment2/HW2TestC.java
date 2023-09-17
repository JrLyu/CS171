// Test copy constructor of Card
public class HW2TestC {
    public static void main(String[] args) {
        int nErr = 0;

        DeckOfCards d1 = new DeckOfCards();

        d1.deal();
        d1.deal();
        d1.deal();
        d1.deal();

        // Make a duplicate deck of cards
        DeckOfCards d2 = new DeckOfCards(d1);

        // Copy test: check if cards dealt from d1 and d2 are the same
        Card a, b;

        for ( int i = 0; i < 10; i++ ) {
            a = d1.deal();
            b = d2.deal();

            if ( a.getSuit().compareTo(b.getSuit()) != 0 ) {
                nErr++;
                System.out.println("Equal test " + i +
                        " failed: a.getSuit() != b.getSuit()");
            }
        }
        // ****************************************************************
        // Alias test
        //
        // You will fail this test if your copy constructor makes an alias
        // ****************************************************************
        d1.shuffle();
        d2.shuffle();

        int n = 0;
        for ( int i = 0; i < 50; i++ ) {
            a = d1.deal();
            b = d2.deal();

            if ( a.getSuit().compareTo(b.getSuit()) == 0 ) {
                n++;
            }
        }

        if ( n == 50 ) {
            nErr++;
            System.out.println("Alias test failed: "
                    + "copy constructor made an alias for deck");
        }

        if ( nErr == 0 ) {
            System.out.println("Test C passed");
        }
    }
}

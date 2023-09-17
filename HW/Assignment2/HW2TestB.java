// Test copy constructor of Card
public class HW2TestB {
    public static void main(String[] args) {
        int nErr = 0;

        Card a = new Card("Clubs", "4");
        Card b = new Card(a);

        if ( a.getSuit().compareTo(b.getSuit()) != 0 ) {
            nErr++;
            System.out.println("Copy test failed: a.getSuit() != b.getSuit()\n");
        }

        a.update(0, 0); // Change Card a, a and b must now be different
        if ( a.getSuit().compareTo(b.getSuit()) == 0 ) {
            nErr++;
            System.out.println("Alias test failed: a.getSuit() == b.getSuit()\n");
        }

        if ( nErr == 0 ) {
            System.out.println("Test B passed");
        }
    }
}

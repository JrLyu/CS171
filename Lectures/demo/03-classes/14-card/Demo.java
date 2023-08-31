public class Demo
{
    public static void main(String[] args)
    {
        DeckOfCards d = new DeckOfCards();   // Create 1 deck of cards
        
        for ( int i = 0; i < 5; i++ )
            System.out.println( d.deal() );  // Deal out 5 cards
        System.out.println();
            
        d.shuffle();                         // Shuffle the deck d
        for ( int i = 0; i < 5; i++ )
            System.out.println( d.deal() );  // Deal out 5 cards after shuffle
    } 
}

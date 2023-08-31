/* ----------------------------------------
   Represent a playing card

     properties:  suit and rank
   ----------------------------------------*/

public class Card
{
    private static String[] suitToString = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private static String[] rankToString = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "Jack", "Queen", "King" };

    private int suit;
    private int rank;

    public Card(String cardSuit, String cardRank)
    {
	// Find i such that suitToString[i].equals(cardSuit)
        for ( int i = 0; i < suitToString.length; i++ )
 	    if ( cardSuit.equals( suitToString[i] ) )
	    {
		suit = i;
		break;
	    }

	// Find i such that rankToString[i].equals(cardRank)
        for ( int i = 0; i < rankToString.length; i++ )
 	    if ( cardRank.equals( rankToString[i] ) )
	    {
		rank = i;
		break;
	    }
    }

    public String getSuit()  // Return the suit of card as String
    {
        return suitToString[suit];
    }

    // Define the toString() method to control object print out
    public String toString() // Used to print an object
    {
        return rankToString[rank] + " of " + suitToString[suit];
    }
}

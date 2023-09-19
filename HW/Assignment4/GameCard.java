/* ---------------------------------------------------------
   GameCard: model a card for a card game

   ******** DO NOT make any change to this class **********
   --------------------------------------------------------- */

public class GameCard
{
    private static String[] suitToString = { "Diamonds", "Clubs",
            "Hearts",   "Spades"   };
    private static String[] rankToString = {"Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack",
            "Queen", "King" };

    /* ----------------------------------------------------------
       The suit of the card is represented as follows:
	  0 = Diamond  1 = Clubs   2 = Hearts   3 = Spades
       ---------------------------------------------------------- */
    private int suit;

    /* ----------------------------------------------------------
       The rank of the card is represented as follows:
	  0 = Ace      	4 = 5	    8  = 9       12 = King
	  1 = 2		5 = 6	    9  = 10
	  2 = 3		6 = 7	    10 = Jack
	  3 = 4		7 = 8	    11 = Queen
       ---------------------------------------------------------- */
    private int rank;

    // Constructor
    public GameCard(String cardSuit, String cardRank)
    {
        // Find i such that suitToString[i].equals(cardSuit)
        for ( int i = 0; i < suitToString.length; i++ )
            if ( cardSuit.equals( suitToString[i] ) )
            {
                suit = i;    	// suit of card is equal to index i
                break;
            }

        // Find i such that rankToString[i].equals(cardRank)
        for ( int i = 0; i < rankToString.length; i++ )
            if ( cardRank.equals( rankToString[i] ) )
            {
                rank = i;	// rank of card is equal to index i
                break;
            }

        nConstructor++;		// Tracking variable
    }

    // getSuit(): return the suit of the card
    public int getSuit()
    {
        nSuit++;	// Tracking variable
        return suit;
    }

    // getSuit(): return the rank of the card
    public int getRank()
    {
        nRank++;	// Tracking variable
        return rank;
    }


    /* -----------------------------------------------------------------
       The card ranking impose a ranking on each card

       The ranking is base on:
		the rank of the card
		the suit of the card

       Different type of card games will use different card ranking
       ------------------------------------------------------------------ */
    public int getCardRanking()
    {
        return 0;
    }


    public String toString() // Used to print an Card object
    {
        return rankToString[rank] + " of " + suitToString[suit];
    }

    // ************************************************************
    // Variable to make sure student use inheritance
    // Make sure student makes use of inheritance
    // ************************************************************
    private static int nConstructor;  // Track # times student called GameCard()
    private static int nSuit = 0;     // Track # times student called getSuit()
    private static int nRank = 0;     // Track # times student called getRank()

    public static int getNConstructor()
    {
        return nConstructor;
    }

    public static int getNSuit()
    {
        return nSuit;
    }

    public static int getNRank()
    {
        return nRank;
    }
}
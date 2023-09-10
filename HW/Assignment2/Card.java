/* ----------------------------------------
   Represent a playing card

     properties:  suit and rank
   ----------------------------------------*/

public class Card {
    private static String[] suitToString = {"Spades", "Hearts",
                                            "Diamonds", "Clubs"};
    private static String[] rankToString = {"Ace", "2", "3", "4", "5",
                                            "6", "7", "8", "9", "10", "Jack",
                                            "Queen", "King" };

    private int suit;	// Suit of this Card
    private int rank;	// Rank of this Card

    // ======================================================================
    // Constructor: instantiate a Card with suit cardSuit and rank cardRank
    // ======================================================================
    public Card(String cardSuit, String cardRank) {
        // Find i such that suitToString[i].equals(cardSuit)
        for ( int i = 0; i < suitToString.length; i++ ) {
            if (cardSuit.equals(suitToString[i])) {
                suit = i;
                break;
            }
        }

        // Find i such that rankToString[i].equals(cardRank)
        for ( int i = 0; i < rankToString.length; i++ ) {
            if (cardRank.equals(rankToString[i])) {
                rank = i;
                break;
            }
        }
    }

    // ******************************************************************
    // Part 2
    // crad(Card c): copy constructor, create a copy of Card c
    // ******************************************************************
    public Card(Card c) {
        // Write your code here
        suit = c.suit;
        rank = c.rank;
    }

    // getSuit(): returns the string representation of the suit of this card
    public String getSuit() { // Return the suit of card as String

        return suitToString[suit];
    }

    // ******************************************************************
    // Part 1
    // getRank(): returns the string representation of the rank of this card
    // ******************************************************************
    public String getRank() { // Return the suit of card as String
        return rankToString[rank];      // Make changes
    }

    // Define the toString() method to control object print out
    public String toString() {// Used to print an object
        return rankToString[rank] + " of " + suitToString[suit];
    }

    // ***************************************************************
    // Do not make any changes to the method below this line
    // They are used to grade this project
    // ***************************************************************

    public void update(int s, int r) {
        suit = s;
        rank = r; // not sure why it is s here...
    }
}

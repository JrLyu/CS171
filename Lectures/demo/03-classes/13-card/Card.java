/* ----------------------------------------
   Represent a playing card

     properties:  suit and rank
   ----------------------------------------*/

public class Card
{
    private String suit;
    private String rank;

    public Card(String cardSuit, String cardRank)
    {
        suit = cardSuit;
        rank = cardRank;
    }

    // Define the toString() method to control object print out
    public String toString() // Used to print an object
    {
        return rank + " of " + suit;
    }
}

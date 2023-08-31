public class Demo
{
    public static void main(String[] args)
    {
        Card c1 = new Card("Spades", "Ace");
        Card c2 = new Card("Hearts", "10");
        
	if ( c1.getSuit().compareTo("Spades") == 0 ||
             c1.getSuit().compareTo("Clubs") == 0    )
	    System.out.println(c1 + " is a black card");
        else
	    System.out.println(c1 + " is a red card");

	if ( c2.getSuit().compareTo("Spades") == 0 ||
             c2.getSuit().compareTo("Clubs") == 0    )
	    System.out.println(c2 + " is a black card");
        else
	    System.out.println(c2 + " is a red card");
    } 
}

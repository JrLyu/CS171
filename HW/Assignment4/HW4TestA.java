//public class HW4TestA
//{
//    public static void main(String[] args)
//    {
//        int err = 0;
//        GameCard[] myList = new GameCard[5]; // Array of GameCards objs
//
//        // Make 4 PlayingCards
//        myList[0] = new PlayingCard("Spades", "2");
//        myList[1] = new PlayingCard("Clubs", "King");
//        myList[2] = new PlayingCard("Diamonds", "Ace");
//        myList[3] = new PlayingCard("Hearts", "Jack");
//        myList[4] = new PlayingCard("Clubs", "4");
//
//        System.out.println("\nSorting 5 PlayingCard objects....\n");
//
//        String out = "   ";
//        System.out.println("\nBefore sorting:");
//        for ( int i = 0; i < myList.length; i++)
//            out = out + " " + myList[i] + " |";
//        System.out.println(out);
//
//        Sort.selectionSort(myList);
//
//        System.out.println("After sorting:");
//        out = "   ";
//        for ( int i = 0; i < myList.length; i++)
//            out = out + " " + myList[i] + " |";
//        System.out.println(out);
//
//        String ans = "    Ace of Diamonds | 2 of Spades | 4 of Clubs | Jack of Hearts | King of Clubs |";
//
//        if ( out.compareTo(ans) != 0 )
//        {
//            err++;
//            System.out.println("\nSort failed: getCardRanking() is incorrect");
//            System.out.println("The correct sorted ordering is:");
//            System.out.println(ans + "\n");
//        }
//
//        // System.out.println("\n" + GameCard.getNConstructor() );
//
//        if ( GameCard.getNConstructor() != 5 )
//        {
//            err++;
//            System.out.println("\nPlayingCard class does not make correct use of GameCard");
//            System.out.println("The constructor in PlayingCard class is incorrect\n");
//        }
//
//        // System.out.println("\n" + GameCard.getNRank() );
//
//        if ( GameCard.getNRank() < 10 )
//        {
//            err++;
//            System.out.println("\nPlayingCard class does not make correct use of GameCard");
//            System.out.println("The getCardRanking() in PlayingCard class is incorrect\n");
//        }
//
//        if ( err == 0 )
//            System.out.println("\nTest A passed\n");
//    }
//
//}
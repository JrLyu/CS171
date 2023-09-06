public class DeckOfCards {
    private Card[] deck;
    private int dealPosition;

    // Constructor to make a FRESH deck of cards
    DeckOfCards() {
        deck = new Card[52];    // Make a holder for 52 cards

        String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                         "9", "10", "Jack", "Queen", "King"};
        int k = 0;   // Index into deck[ ]
        // Use a nested loop to make all 52 cards and assign to deck[ ]
        for ( int i = 0; i < suit.length; i++ ) {
            for (int j = 0; j < rank.length; j++) {
                deck[k] = new Card(suit[i], rank[j]);
                k++;
            }
        }
    }

    // Constructor to make a EXACT COPY of this deck of cards
    DeckOfCards(DeckOfCards d) {
        // Write your code here
        deck = new Card[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = d.deck[i];
        }
        dealPosition = d.dealPosition;
    }

    // Shuffle this deck of cards
    public void shuffle() {
        for (int i = 0; i < deck.length; i++) {
            // Generate an index j randomly
            int j = (int)(Math.random() * deck.length);

            Card temp = deck[i];   // Swap card[i] and card[j]
            deck[i] = deck[j];
            deck[j] = temp;
        }
        dealPosition = 0; // Reset the next deal card position
    }

    // Deals (= returns) the next card in this deck
    public Card deal() {
        Card nextCard = deck[dealPosition];
        dealPosition++;
        return nextCard;
    }
}
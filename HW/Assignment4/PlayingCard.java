/* ---------------------------------------------------------------------
   Part A: Implement the PlayingCard class as a subclass of GameCard
   --------------------------------------------------------------------- */

public class PlayingCard extends GameCard {
    // Constructor: initialize the suit and the rank of this card
    public PlayingCard(String s, String r) {
        // Implement the constructor
        super(s, r);
    }

    // getCardRanking() return an integer that represents the ranking of this card.
    // A smaller value means the ranking is lower
    // The getCardRanking() must rank the cards as follows:
    //   Ace < 2 < 3 < 4 < 5 < 6 < 7 < 8 < 9 < 10 < Jack < Queen < King
    @Override
    public int getCardRanking() {
        // Implement the getCardRanking() that rank the cards in the order given abov
        return getRank();
    }
}


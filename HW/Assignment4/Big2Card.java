/* ---------------------------------------------------------------------
   Part C: Implement the Big2Card class as a subclass of GameCard
   --------------------------------------------------------------------- */

public class Big2Card extends GameCard {
    // Constructor: initialize the suit and the rank of this card
    public Big2Card(String s, String r) {
        // Implement the constructor
        super(s, r);
    }

    // getCardRanking() return an integer that represents the ranking of this card.
    // A smaller value means the ranking is lower
    // The getCardRanking() must rank the cards as follows:
    //   3 < 4 < 5 < 6 < 7 < 8 < 9 < 10 < Jack < Queen < King < Ace < 2
    @Override
    public int getCardRanking() {
        // Implement the getCardRanking() that rank the cards in the order given above
        if (getRank() == 0) {
            return 11;
        } else if (getRank() == 1) {
            return 12;
        }
        return getRank() - 2;
    }
}


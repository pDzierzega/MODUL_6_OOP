package Day4_Enum.TailOfCards;

public class Card {
    private RankEnum rank;
    private SuitEnum suit;

    public Card(RankEnum rank, SuitEnum suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public RankEnum getRank() {
        return rank;
    }
    public SuitEnum getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("Card: %8s %8s",suit,rank);
    }
}

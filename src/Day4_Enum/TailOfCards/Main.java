package Day4_Enum.TailOfCards;

/**
 * Created by RENT on 2017-08-25.
 */
public class Main {
    public static void main(String[] args) {
        Deck deck=new Deck();
        deck.printDeck();

        deck.suffleDeck();
        System.out.println("\nPo przetasowaniu\n\n");
        deck.printDeck();
    }
}

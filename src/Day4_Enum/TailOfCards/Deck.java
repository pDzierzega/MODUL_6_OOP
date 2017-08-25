package Day4_Enum.TailOfCards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck (){
        deck=new ArrayList<>();

        for (SuitEnum s :SuitEnum.values()) {
            for (RankEnum r :RankEnum.values()) {
                deck.add(new Card(r,s));
            }
        }
    }

    public void printDeck(){
        for (Card card :deck) {
            System.out.println(card);
        }
    }

    public void suffleDeck(){
        Collections.shuffle(deck);
    }

}

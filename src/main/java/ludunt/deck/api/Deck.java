package ludunt.deck.api;

import java.util.List;

/**
 * Created by iaroslav.ostrovsyi on 21.11.2014.
 */
public interface Deck {
    List<Card> getAvailableCards();

    void reset();

    void shuffle();

    int rest();

    Card peek();

    Card pop();

    default void merge(Deck deck) {
        this.getAvailableCards().addAll(deck.getAvailableCards());
    }
}

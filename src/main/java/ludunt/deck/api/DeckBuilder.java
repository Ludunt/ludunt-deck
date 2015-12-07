package ludunt.deck.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
* Created by iaroslav.ostrovsyi on 21.11.2014.
*/
public class DeckBuilder {
    private final List<Card> cards;

    public DeckBuilder(int capacity) {
        cards = new ArrayList<>(capacity);
    }

    public DeckBuilder addCard(Card card) {
        cards.add(card);
        return this;
    }

    public DeckBuilder merge(Deck deck) {
        cards.addAll(deck.getAvailableCards());
        return this;
    }

    public Deck build() {
        return new DeckImpl(cards);
    }

    /**
     * Created by iaroslav.ostrovsyi on 21.11.2014.
     */
    private static class DeckImpl implements Deck {

        private final List<Card> availableCards;
        private List<Card> deck;

        private DeckImpl(List<Card> availableCards) {
            this.availableCards = Collections.unmodifiableList(availableCards);
            reset();
        }

        @Override
        public  List<Card> getAvailableCards() {
            return availableCards;
        }

        @Override
        public void reset() {
            deck = new ArrayList<>(availableCards);
        }

        @Override
        public void shuffle() {
            Collections.shuffle(deck);
            deck = new LinkedList<>(deck);
        }

        @Override
        public int rest() {
            return deck.size();
        }

        @Override
        public Card peek() {
            return deck.get(0);
        }

        @Override
        public Card pop() {
            return deck.remove(0);
        }

    }
}

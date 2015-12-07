package ludunt.deck.french;

import ludunt.deck.api.Deck;
import ludunt.deck.api.DeckBuilder;

/**
 * Created by iaroslav.ostrovsyi on 21.11.2014.
 */
public interface Decks {

    static Deck getFrenchDeck32() {
        DeckBuilder deckBuilder = new DeckBuilder(32);

        for (Suits suits : Suits.values()) {
            deckBuilder.addCard(new Card(suits, CardValues.SEVEN));
            deckBuilder.addCard(new Card(suits, CardValues.EIGHT));
            deckBuilder.addCard(new Card(suits, CardValues.NINE));
            deckBuilder.addCard(new Card(suits, CardValues.TEN));
            deckBuilder.addCard(new Card(suits, CardValues.JACK));
            deckBuilder.addCard(new Card(suits, CardValues.QUEEN));
            deckBuilder.addCard(new Card(suits, CardValues.KING));
            deckBuilder.addCard(new Card(suits, CardValues.ACE));
        }

        return deckBuilder.build();
    }

    static Deck getFrenchDeck36() {
        DeckBuilder deckBuilder = new DeckBuilder(36);

        deckBuilder.merge(getFrenchDeck32());

        for (Suits suits : Suits.values()) {
            deckBuilder.addCard(new Card(suits, CardValues.SIX));
        }

        return deckBuilder.build();
    }

    static Deck getFrenchDeck52() {
        DeckBuilder deckBuilder = new DeckBuilder(52);

        deckBuilder.merge(getFrenchDeck36());

        for (Suits suits : Suits.values()) {
            deckBuilder.addCard(new Card(suits, CardValues.TWO));
            deckBuilder.addCard(new Card(suits, CardValues.THREE));
            deckBuilder.addCard(new Card(suits, CardValues.FOUR));
            deckBuilder.addCard(new Card(suits, CardValues.FIVE));
        }

        return deckBuilder.build();
    }

    static Deck getFrenchDeck54() {
        DeckBuilder deckBuilder = new DeckBuilder(54);

        deckBuilder.merge(getFrenchDeck52());

        deckBuilder.addCard(new Card(null, CardValues.JOKER, CardColor.BLACK));
        deckBuilder.addCard(new Card(null, CardValues.JOKER, CardColor.RED));

        return deckBuilder.build();
    }
}

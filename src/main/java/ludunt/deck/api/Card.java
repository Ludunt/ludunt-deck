package ludunt.deck.api;

/**
 * @author Iaroslav Ostrovskyi
 */
public class Card {
    private final Suit suit;
    private final CardValue value;

    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }
}

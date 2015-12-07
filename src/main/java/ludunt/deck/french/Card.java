package ludunt.deck.french;

import ludunt.deck.api.CardValue;

/**
 * Created by iaroslav.ostrovsyi on 27.12.2014.
 */
public class Card extends ludunt.deck.api.Card {

    private final CardColor color;

    public Card(Suits suit, CardValue value) {
        this(suit, value, suit == null ? null : suit.getColor());
    }

    public Card(Suits suit, CardValue value, CardColor color) {
        super(suit, value);
        this.color = color;
    }

    public CardColor getColor() {
        return color;
    }
}

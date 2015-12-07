package ludunt.deck.french;

import ludunt.deck.api.Suit;

/**
 * @author Iaroslav Ostrovskyi
 */
public enum Suits implements Suit {

    HEARTS(CardColor.RED),
    DIAMONDS(CardColor.RED),
    CLUBS(CardColor.BLACK),
    SPADES(CardColor.BLACK);

    private final CardColor color;

    Suits(CardColor color) {
        this.color = color;
    }

    public CardColor getColor() {
        return color;
    }
}

package ludunt.deck.api

import spock.lang.Specification

/**
 * Created by iaroslav.ostrovsyi on 27.12.2014.
 */
class DeckBuilderTest extends Specification {

    def "test addCard()"() {
        setup:
        def builder = new DeckBuilder(2)

        def card1 = Mock(Card)
        def card2 = Mock(Card)

        when:
        builder.addCard(card1)
        builder.addCard(card2)

        Deck deck = builder.build()

        then:
        deck.availableCards.containsAll([card1, card2])

        deck == null

    }

}

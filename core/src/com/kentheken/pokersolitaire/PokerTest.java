package com.kentheken.pokersolitaire;

import com.badlogic.gdx.utils.Array;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by kenneth on 4/8/15.
 */
public class PokerTest {
    @Test
    public void evaluatesFlush() {
        Array<Card> hand = new Array<Card>();
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE, null));
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.FIVE, null));
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.TEN, null));
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.THREE, null));
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT, null));
        PokerUtils.setHand(hand);
        assertTrue(PokerUtils.isFlush());
    }
}

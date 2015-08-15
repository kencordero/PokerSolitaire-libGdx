package com.kentheken.pokersolitaire;

import com.badlogic.gdx.utils.Array;

/**
 * Created by kenneth on 4/6/15.
 */
public class PokerUtils {
    public static final class HandRank {
        public static final int NONE = 0;
        public static final int ONE_PAIR = 1;
        public static final int TWO_PAIRS = 2;
        public static final int THREE_OF_A_KIND = 3;
        public static final int STRAIGHT = 4;
        public static final int FLUSH = 5;
        public static final int FULL_HOUSE = 6;
        public static final int FOUR_OF_A_KIND = 7;
        public static final int STRAIGHT_FLUSH = 8;
        public static final int ROYAL_FLUSH = 9;
    }

    private static Array<Integer> mTiebreakers;
    private static Array<Card> mHand;

    public static int getHandRank(Array<Card> hand) {
        mHand = hand;
        if (isFlush()) {
            if (isStraight()) {
                if (getLowCard() == 10) return HandRank.ROYAL_FLUSH;
                return HandRank.STRAIGHT_FLUSH;
            }
            return HandRank.FLUSH;
        }
        if (isStraight()) return HandRank.STRAIGHT;
        return HandRank.NONE;
    }

    private static int getLowCard() {
        return 0;
    }

    public static void sortHand(Array<Card> hand) {

    }

    public static void setHand(Array<Card> hand) {
        mHand = hand;
    }

    public static boolean isFlush() {
        if (mHand.size != 5) return false;
        return mHand.get(0).getSuit() == mHand.get(1).getSuit() &&
               mHand.get(0).getSuit() == mHand.get(2).getSuit() &&
               mHand.get(0).getSuit() == mHand.get(3).getSuit() &&
               mHand.get(0).getSuit() == mHand.get(4).getSuit();
    }

    public static boolean isStraight() {
        if (mHand.size != 5) return false;
        return false;
    }
}

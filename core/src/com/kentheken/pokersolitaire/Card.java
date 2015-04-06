package com.kentheken.pokersolitaire;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

import java.io.File;

/**
 * Created by kenneth on 3/25/15.
 */
public class Card {
    public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
    public enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }

    private final Suit suit;
    private final Rank rank;
    private final FileHandle fileHandle;
    private Texture texture;

    public Card(Suit suit, Rank rank, FileHandle fileHandle) {
        this.suit = suit;
        this.rank = rank;
        this.fileHandle = fileHandle;
    }

    public Suit getSuit() { return suit; }

    public Rank getRank() {
        return rank;
    }

    public Texture getTexture() {
        if (texture == null) {
            texture = new Texture(fileHandle);
        }
        return texture;
    }
}

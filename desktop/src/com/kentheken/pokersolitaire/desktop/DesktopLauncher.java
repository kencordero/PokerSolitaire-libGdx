package com.kentheken.pokersolitaire.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kentheken.pokersolitaire.PokerSolitaireGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		new LwjglApplication(new PokerSolitaireGame(), new LwjglApplicationConfiguration());
	}
}

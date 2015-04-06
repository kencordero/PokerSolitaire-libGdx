package com.kentheken.pokersolitaire;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.Array;

/**
 * Created by kenneth on 3/24/15.
 */
public class GameScreen implements Screen {
    final PokerSolitaireGame game;
    OrthographicCamera camera;

    Array<Card> cards;

    public GameScreen(PokerSolitaireGame game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        cards = new Array<Card>();
        for (int i = 0; i < 5; ++i) {
            cards.add(CardDeck.get().getNext(false));
        }
    }

    @Override
    public void show() {}

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        if (Gdx.input.isTouched()) {

            //card = CardDeck.get().getNext(true);
        }

        game.batch.begin();
        for (int i = 0; i < 5; ++i) {
            game.batch.draw(cards.get(i).getTexture(), 175 + 100 * i, 240);
        }
        //game.font.draw(game.batch, card.getRank().toString() + " of " + card.getSuit().toString(), 380, 100);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {}
}

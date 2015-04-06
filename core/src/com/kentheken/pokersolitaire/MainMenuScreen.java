package com.kentheken.pokersolitaire;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by kenneth on 3/24/15.
 */
public class MainMenuScreen implements Screen {
    final PokerSolitaireGame game;
    OrthographicCamera camera;
    BitmapFont bigFont;

    public MainMenuScreen(PokerSolitaireGame game) {
        this.game = game;
        bigFont = new BitmapFont();
        bigFont.setScale(7);

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {}

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "Poker Solitaire", 350, 350);
        game.font.draw(game.batch, "Tap anywhere to start", 330, 100);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }
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

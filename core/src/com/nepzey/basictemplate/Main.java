package com.nepzey.basictemplate;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.nepzey.basictemplate.utils.FontRenderer;

public class Main extends Game{
    SpriteBatch batch;
    ShapeRenderer shapeRenderer;
    FontRenderer fontRenderer;
    @Override
    public void create() {
    batch= new SpriteBatch();
    shapeRenderer= new ShapeRenderer();
    fontRenderer =  new FontRenderer(18);

    setScreen(new MainMenu(this));
    }

    @Override
    public void dispose() {
        batch.dispose();
        shapeRenderer.dispose();
        fontRenderer.dispose();
    }
}
package com.nepzey.basictemplate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;

public class MainMenu extends ScreenAdapter {
    Main main;


    public MainMenu(Main main) {
        this.main = main;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(Gdx.gl.GL_COLOR_BUFFER_BIT);

        main.fontRenderer.setSize(200);
        main.fontRenderer.drawFont(main.batch,Color.GOLD,"GAME TITLE",Gdx.graphics.getWidth()*0.10f,Gdx.graphics.getHeight()*0.75f,Gdx.graphics.getWidth()*0.80f);
        main.fontRenderer.setSize(150);
        main.fontRenderer.drawFont(main.batch,Color.LIME,"PLAY",Gdx.graphics.getWidth()*0.10f,Gdx.graphics.getHeight()*0.35f,Gdx.graphics.getWidth()*0.80f);
        main.fontRenderer.setSize(30);
        main.fontRenderer.drawFont(main.batch,Color.LIME,"About Game" ,Gdx.graphics.getWidth()*0.10f,Gdx.graphics.getHeight()*0.10f,Gdx.graphics.getWidth()*0.80f);


    }
}

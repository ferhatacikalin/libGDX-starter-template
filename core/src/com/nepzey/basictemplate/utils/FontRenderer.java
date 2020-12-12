package com.nepzey.basictemplate.utils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class FontRenderer {
    int size=18;
    FreeTypeFontGenerator fontGenerator;
    FreeTypeFontGenerator.FreeTypeFontParameter parameter;
    BitmapFont gameFont;

    public FontRenderer(int size) {
        fontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("game_font.ttf"));
        parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        this.size=size;
        generateFont();
    }
    public void generateFont(){
        parameter.size=size;
        parameter.borderWidth=6;
        parameter.borderColor = Color.BLACK;
        parameter.shadowColor= new Color(0, 0, 0, 0.75f);
        parameter.shadowOffsetX=3;
        parameter.shadowOffsetY=3;
        parameter.characters=FreeTypeFontGenerator.DEFAULT_CHARS+"IĞğÜüŞşİÖöÇç";
        gameFont = fontGenerator.generateFont(parameter);
    }
    public void drawFont(SpriteBatch batch,Color color,String text,float x,float y,float targetWidth){
        batch.begin();
    gameFont.setColor(color);
    gameFont.draw(batch,text,x,y,targetWidth,1,true);
    batch.end();
    }
    public void dispose(){
        gameFont.dispose();
        fontGenerator.dispose();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        generateFont();
    }

}

package com.example.customcoloring;

import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class Drawing extends SurfaceView {

    private Heart heart;
    private Stem stem;
    private RosePetals petals;
    private Candle candle;
    private Flame flame;

    public Drawing(Context context) {
        super(context);
        initialize();
    }

    public Drawing(Context context, AttributeSet attrib) {
        super(context, attrib);
        initialize();
    }

    /**
     * initializes the drawings
     */
    private void initialize() {
        setWillNotDraw(false);

        this.setBackgroundColor(Color.BLACK);

        heart = new Heart(400,300,255, 192, 203);
        stem = new Stem(800, 100,0,128,0);
        petals = new RosePetals(800,50,825,150,255,0,0);
        candle =  new Candle(100,100,255,252,187);
        flame = new Flame(200,0,255, 83, 73);

    }


    /**
     * Draws the image onto the surface view
     */
    @Override
    public void onDraw(Canvas c){

        heart.drawHeart(c);
        stem.drawStem(c);
        petals.drawPetals(c);
        candle.drawCandle(c);
        flame.drawFlame(c);

    }
}
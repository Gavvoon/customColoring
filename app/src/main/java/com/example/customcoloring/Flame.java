package com.example.customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class Flame {
    private Paint paint;
    private int r;
    private int g;
    private int b;
    private float X;
    private float Y;

    public Flame(float sX, float sY, int initRed, int initGreen, int initBlue) {
        X = sX;
        Y = sY;
        r = initRed;
        g = initGreen;
        b = initBlue;

        int color = Color.rgb(r, g, b);
        paint = new Paint();
        paint.setColor(color);
    }

    public void drawFlame(Canvas c) {

        Paint orange = new Paint();
        orange.setColor(0xffFF5349);
        orange.setStyle(Paint.Style.FILL);

        Path fire = new Path();
        fire.moveTo(X + 50, Y + 375);
        fire.lineTo(X + 75, Y + 425);
        fire.lineTo(X + 100, Y + 375);
        fire.lineTo(X + 75, Y + 300);

        c.drawPath(fire, orange);
    }
}
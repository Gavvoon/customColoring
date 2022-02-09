package com.example.customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class Heart {

    private Paint paint;
    private int r;
    private int g;
    private int b;
    private float X;
    private float Y;

    public Heart(float sX, float sY, int initRed, int initGreen, int initBlue) {
        X = sX;
        Y = sY;
        r = initRed;
        g = initGreen;
        b = initBlue;

        int color = Color.rgb(r,g,b);
        paint = new Paint();
        paint.setColor(color);

    }

    public void drawHeart(Canvas c) {
        Paint pink = new Paint();
        pink.setColor(Color.MAGENTA);
        pink.setStyle(Paint.Style.FILL);

        Path heart = new Path();
        heart.moveTo(X + 200,Y + 100);
        heart.lineTo(X + 200,Y + 200);
        heart.lineTo(X + 500,Y + 425);
        heart.lineTo(X + 800,Y + 200);
        heart.lineTo(X + 800,Y + 100);
        heart.lineTo(X + 700,Y + 0);
        heart.lineTo(X + 600,Y + 0);
        heart.lineTo(X + 500,Y + 100);
        heart.lineTo(X + 400,Y + 0);
        heart.lineTo(X + 300,Y + 0);

        c.drawPath(heart, pink);
    }
}

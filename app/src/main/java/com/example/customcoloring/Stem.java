package com.example.customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class Stem {
    private Paint paint;
    private int r;
    private int g;
    private int b;
    private float X;
    private float Y;

    public Stem(float sX, float sY, int initRed, int initGreen, int initBlue) {
        X = sX;
        Y = sY;
        r = initRed;
        g = initGreen;
        b = initBlue;

        int color = Color.rgb(r, g, b);
        paint = new Paint();
        paint.setColor(color);
    }

    public void drawStem(Canvas c) {
        Paint green = new Paint();
        green.setColor(Color.GREEN);
        green.setStyle(Paint.Style.FILL);

        Path stem = new Path();
        stem.moveTo(X + 800, Y + 100);
        stem.lineTo(X + 800, Y + 500);
        stem.lineTo(X + 825, Y + 500);
        stem.lineTo(X + 825, Y + 100);

        c.drawPath(stem, green);
    }
}
package com.example.customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class Candle {
    private Paint paint;
    private int r;
    private int g;
    private int b;
    private float X;
    private float Y;

    public Candle(float sX, float sY, int initRed, int initGreen, int initBlue) {
        X = sX;
        Y = sY;
        r = initRed;
        g = initGreen;
        b = initBlue;

        int color = Color.rgb(r, g, b);
        paint = new Paint();
        paint.setColor(color);
    }

    public void drawCandle(Canvas c) {
        Paint yellow = new Paint();
        yellow.setColor(Color.YELLOW);
        yellow.setStyle(Paint.Style.FILL);

        Path candle = new Path();
        candle.moveTo(X + 100, Y + 300);
        candle.lineTo(X + 100, Y + 500);
        candle.lineTo(X + 250, Y + 500);
        candle.lineTo(X + 250, Y + 300);

        c.drawPath(candle, yellow);
    }
}
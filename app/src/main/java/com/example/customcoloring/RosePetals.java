package com.example.customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class RosePetals {
    private Paint paint;
    private int r;
    private int g;
    private int b;
    private float sX;
    private float sY;
    private float eX;
    private float eY;

    public RosePetals(float startX, float startY, float endX, float endY, int initRed, int initGreen, int initBlue) {
        sX = startX;
        sY = startY;
        eX = endX;
        eY = endY;
        r = initRed;
        g = initGreen;
        b = initBlue;

        int color = Color.rgb(r, g, b);
        paint = new Paint();
        paint.setColor(color);
    }

    public void drawPetals(Canvas c) {
        Paint red = new Paint();
        red.setColor(Color.RED);
        red.setStyle(Paint.Style.FILL);

        c.drawOval(sX + 750, sY + 50, eX + 850, eY + 100, paint);

    }
}

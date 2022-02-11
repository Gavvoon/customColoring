package com.example.customcoloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;


public class CustomColoringView extends SurfaceView {

    //paints that are used in drawing
    Paint flamePaint = new Paint();
    Paint candlePaint = new Paint();
    Paint rosePaint = new Paint();
    Paint stemPaint = new Paint();
    Paint heartPaint = new Paint();

    private CustomColoringModel colorModel;


    public CustomColoringView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        colorModel = new CustomColoringModel();

        setWillNotDraw(false);

    }

    @Override
    public void onDraw(Canvas c) {


        int candleColor = Color.rgb(colorModel.candleR, colorModel.candleG, colorModel.candleB);
        int flameColor = Color.rgb(colorModel.flameR, colorModel.flameG, colorModel.flameB);
        int roseColor = Color.rgb(colorModel.roseR, colorModel.roseG, colorModel.roseB);
        int stemColor = Color.rgb(colorModel.stemR, colorModel.stemG, colorModel.stemB);
        int backgroundColor = Color.rgb(colorModel.backgroundR, colorModel.backgroundG, colorModel.backgroundB);
        int heartColor = Color.rgb(colorModel.heartR, colorModel.heartG, colorModel.heartB);


        //setup colors
        candlePaint.setColor(candleColor); //yellow
        candlePaint.setStyle(Paint.Style.FILL);

        flamePaint.setColor(flameColor); // red-orange
        flamePaint.setStyle(Paint.Style.FILL);

        rosePaint.setColor(roseColor); //red
        rosePaint.setStyle(Paint.Style.FILL);

        stemPaint.setColor(stemColor); //green
        stemPaint.setStyle(Paint.Style.FILL);

        heartPaint.setColor(heartColor); //pink/magenta
        heartPaint.setStyle(Paint.Style.FILL);

        setBackgroundColor(backgroundColor);

        // draws heart 400,300,255, 192, 203
        Path heart = new Path();
        heart.moveTo(600 ,400);
        heart.lineTo(600,500);
        heart.lineTo(900,725);
        heart.lineTo(1200,500);
        heart.lineTo(1200,400);
        heart.lineTo(1100,300);
        heart.lineTo(1000,300);
        heart.lineTo(900,400);
        heart.lineTo(800,300);
        heart.lineTo(700,300);

        c.drawPath(heart,heartPaint);

        //draw stem
        Path stem = new Path();
        stem.moveTo(1600, 200);
        stem.lineTo(1600, 600);
        stem.lineTo(1625, 600);
        stem.lineTo(1625, 200);

        c.drawPath(stem, stemPaint);

        //draw rose head
        c.drawOval(1550, 100,  1675 , 250, rosePaint);

        //draws candle
        Path candle = new Path();
        candle.moveTo(200,  400);
        candle.lineTo(200, 600);
        candle.lineTo(350, 600);
        candle.lineTo(350, 400);

        c.drawPath(candle, candlePaint);

        //draws flame/fire
        Path fire = new Path();
        fire.moveTo(250, 375);
        fire.lineTo(275, 425);
        fire.lineTo(300, 375);
        fire.lineTo(275, 300);

        c.drawPath(fire, flamePaint);

    }

    public CustomColoringModel getColorModel() {
        return colorModel;
    }
}



package com.example.customcoloring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Allows the red seekbar and it's count to increment
         */
        //Create and connect the max seekbar listener
        TextView maxTV = findViewById(R.id.redSeekbarCount);
        RedSeekBar redTV = new RedSeekBar(maxTV);
        SeekBar maxRedSB = findViewById(R.id.seekBarRed);
        maxRedSB.setOnSeekBarChangeListener(redTV);

        //Create and connect the min seekbar listener
        TextView minTV = findViewById(R.id.redSeekbarCount);
        RedSeekBar redTV2 = new RedSeekBar(minTV);
        SeekBar minRedSB = findViewById(R.id.seekBarRed);
        minRedSB.setOnSeekBarChangeListener(redTV2);

        /**
         * Allows the green seekbar and it's count to increment
         */
        //Create and connect the max seekbar listener
        TextView maxGreenTV = findViewById(R.id.greenSeekbarCount);
        GreenSeekBar greenTV = new GreenSeekBar(maxGreenTV);
        SeekBar maxGreenSB = findViewById(R.id.seekBarGreen);
        maxGreenSB.setOnSeekBarChangeListener(greenTV);

        //Create and connect the min seekbar listener
        TextView minGreenTV = findViewById(R.id.greenSeekbarCount);
        RedSeekBar greenTV2 = new RedSeekBar(minGreenTV);
        SeekBar minGreenSB = findViewById(R.id.seekBarGreen);
        minGreenSB.setOnSeekBarChangeListener(greenTV2);

        /**
         * Allows the blue seekbar and it's count to increment
         */
        //Create and connect the max seekbar listener
        TextView maxBlueTV = findViewById(R.id.blueSeekbarCount);
        BlueSeekBar blueTV = new BlueSeekBar(maxBlueTV);
        SeekBar maxBlueSB = findViewById(R.id.seekBarBlue);
        maxBlueSB.setOnSeekBarChangeListener(blueTV);

        //Create and connect the min seekbar listener
        TextView minBlueTV = findViewById(R.id.blueSeekbarCount);
        BlueSeekBar blueTV2 = new BlueSeekBar(minBlueTV);
        SeekBar minBlueSB = findViewById(R.id.seekBarBlue);
        minBlueSB.setOnSeekBarChangeListener(blueTV2);

    }

    public void OnProgressChanged(SeekBar seekbar, int progress, boolean user) {
        if()
    }

    public boolean onTouch(View v, MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();
        return true;

        TextView object = findViewById(R.id.Item);
        SeekBar minBlueSB = findViewById(R.id.seekBarBlue);
        minBlueSB.setOnTouchListener(object);
    }
}

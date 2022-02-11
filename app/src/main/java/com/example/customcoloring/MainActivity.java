package com.example.customcoloring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CustomColoringView view;
    private DrawingController controller;
    private View touch;
    private SeekBar redSB;
    private SeekBar greenSB;
    private SeekBar blueSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleTV = findViewById(R.id.Item);
        TextView red = findViewById(R.id.redSeekbarCount);
        TextView green = findViewById(R.id.greenSeekbarCount);
        TextView blue = findViewById(R.id.blueSeekbarCount);

        //assign variable name's to the id of RGB seek bars
        redSB = findViewById(R.id.seekBarRed);
        greenSB = findViewById(R.id.seekBarGreen);
        blueSB = findViewById(R.id.seekBarBlue);


        view = findViewById(R.id.DrawView);
        controller = new DrawingController(view, titleTV,red,green,blue,redSB,greenSB,blueSB);

        touch = findViewById(R.id.DrawView);
        touch.setOnTouchListener(controller);
        redSB.setOnSeekBarChangeListener(controller);
        greenSB.setOnSeekBarChangeListener(controller);
        blueSB.setOnSeekBarChangeListener(controller);


    }
}

package com.example.customcoloring;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Listen when seek bars are scrolled by user
 */
public class BlueSeekBar implements SeekBar.OnSeekBarChangeListener {

    private TextView blueSeekbarTV;

    public BlueSeekBar(TextView initTV) {
        this.blueSeekbarTV = initTV;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        this.blueSeekbarTV.setText("" + progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //don't care about this event
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //do nothing for this event
    }
}


package com.example.customcoloring;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Listen when seek bars are scrolled by user
 */
public class GreenSeekBar implements SeekBar.OnSeekBarChangeListener {

    private TextView greenSeekbarTV;

    public GreenSeekBar(TextView initTV) {
        this.greenSeekbarTV = initTV;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        this.greenSeekbarTV.setText("" + progress);
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


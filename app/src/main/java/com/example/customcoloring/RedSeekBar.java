package com.example.customcoloring;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Listen when seek bars are scrolled by user
 */
public class RedSeekBar implements SeekBar.OnSeekBarChangeListener {

    private TextView redSeekbarTV;

    public RedSeekBar(TextView initTV) {
        this.redSeekbarTV = initTV;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        this.redSeekbarTV.setText("" + progress);
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


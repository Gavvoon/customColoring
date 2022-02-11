package com.example.customcoloring;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class DrawingController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    private CustomColoringView view;
    private CustomColoringModel model;
    private TextView title;
    private TextView titleRed;
    private TextView titleGreen;
    private TextView titleBlue;
    private SeekBar seekbarR;
    private SeekBar seekbarG;
    private SeekBar seekbarB;

    public DrawingController(CustomColoringView initView, TextView initTitle,
                             TextView initRed, TextView initGreen, TextView initBlue,
                             SeekBar red, SeekBar green, SeekBar blue) {
        view = initView;
        model = view.getColorModel();
        title = initTitle;
        titleRed = initRed;
        titleGreen = initGreen;
        titleBlue = initBlue;
        seekbarR = red;
        seekbarG = green;
        seekbarB = blue;
    }

    public boolean onTouch(View v, MotionEvent event) {
        float x = (float)event.getX();
        float y = (float)event.getY();

        model.background = false;
        model.heart = false;
        model.flame = false;
        model.candle = false;
        model.rose = false;
        model.stem = false;

        if((x > 600.0f) && (x < 1200.0f) && (y > 300.0f) && (y < 725.0f)) { //for the heart
            model.heart = true;
            title.setText("Heart");
            seekbarR.setProgress(model.heartR);
            seekbarG.setProgress(model.heartG);
            seekbarB.setProgress(model.heartB);
            titleRed.setText("" + model.heartR);
            titleGreen.setText("" + model.heartG);
            titleBlue.setText("" + model.heartB);
        } else if((x > 200.0f) && (x < 350.0f) && (y > 400.0f) && (y < 600.0f)) { //for candle
            model.candle = true;
            title.setText("Candle");
            seekbarR.setProgress(model.candleR);
            seekbarG.setProgress(model.candleG);
            seekbarB.setProgress(model.candleB);
            titleRed.setText("" + model.candleR);
            titleGreen.setText("" + model.candleG);
            titleBlue.setText("" + model.candleB);
        } else if ((x > 250.0f) && (x < 300.0f) && (y > 300.0f) && (y < 415.0f)) { //for fire
            model.flame = true;
            title.setText("Fire");
            seekbarR.setProgress(model.flameR);
            seekbarG.setProgress(model.flameG);
            seekbarB.setProgress(model.flameB);
            titleRed.setText("" + model.flameR);
            titleGreen.setText("" + model.flameG);
            titleBlue.setText("" + model.flameB);
        } else if ((x > 1550.0f) && (x < 1675.0f) && (y > 100.0f) && (y < 250.0f)) { //for rose
            model.rose = true;
            title.setText("Rose");
            seekbarR.setProgress(model.roseR);
            seekbarG.setProgress(model.roseG);
            seekbarB.setProgress(model.roseB);
            titleRed.setText("" + model.roseR);
            titleGreen.setText("" + model.roseG);
            titleBlue.setText("" + model.roseB);
        } else if ((x > 1600.0f) && (x < 1625.0f) && (y > 200.0f) && (y < 600.0f)) { //for stem
            model.stem = true;
            title.setText("Stem");
            seekbarR.setProgress(model.stemR);
            seekbarG.setProgress(model.stemG);
            seekbarB.setProgress(model.stemB);
            titleRed.setText("" + model.stemR);
            titleGreen.setText("" + model.stemG);
            titleBlue.setText("" + model.stemB);
        } else { // for background
            model.background = true;
            title.setText("Background");
            seekbarR.setProgress(model.backgroundR);
            seekbarG.setProgress(model.backgroundG);
            seekbarB.setProgress(model.backgroundB);
            titleRed.setText("" + model.backgroundR);
            titleGreen.setText("" + model.backgroundG);
            titleBlue.setText("" + model.backgroundB);
        }


        return true;

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
        int seekBarID = seekBar.getId();

        if(seekBarID == R.id.seekBarRed) {
            if(model.heart == true) {
                model.heartR = progress;
            } else if(model.stem == true) {
                model.stemR = progress;
            } else if(model.rose == true) {
                model.roseR = progress;
            } else if(model.flame == true) {
                model.flameR = progress;
            }else if(model.candle == true) {
                model.candleR = progress;
            }else if(model.background == true) {
                model.backgroundR = progress;
            }
            titleRed.setText("" + progress);


        } else if(seekBarID == R.id.seekBarGreen) {
            if(model.heart == true) {
                model.heartG = progress;
            } else if(model.stem == true) {
                model.stemG = progress;
            } else if(model.rose == true) {
                model.roseG = progress;
            } else if(model.flame == true) {
                model.flameG = progress;
            }else if(model.candle == true) {
                model.candleG = progress;
            }else if(model.background == true) {
                model.backgroundG = progress;
            }
            titleGreen.setText("" + progress);

        } else if(seekBarID == R.id.seekBarBlue) {
            if(model.heart == true) {
                model.heartB = progress;
            } else if(model.stem == true) {
                model.stemB = progress;
            } else if(model.rose == true) {
                model.roseB = progress;
            } else if(model.flame == true) {
                model.flameB = progress;
            }else if(model.candle == true) {
                model.candleB = progress;
            }else if(model.background == true) {
                model.backgroundB = progress;
            }
            titleBlue.setText("" + progress);
        }

        view.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //DON'T CARE
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //STILL DON'T CARE
    }
}

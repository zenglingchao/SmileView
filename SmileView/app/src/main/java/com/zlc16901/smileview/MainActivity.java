package com.zlc16901.smileview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    LinearLayout backGround;
    ImageView smileFace;

    SmileView smileView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        backGround = (LinearLayout) findViewById(R.id.backGround);
        smileFace = (ImageView) findViewById(R.id.smileFace);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) smileFace.getLayoutParams();
                layoutParams.bottomMargin = i*3;
                smileFace.setLayoutParams(layoutParams);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        smileView = (SmileView) findViewById(R.id.smileView);
        smileView.setNum(60,40);
    }
}

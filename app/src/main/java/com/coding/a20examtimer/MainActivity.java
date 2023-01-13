package com.coding.a20examtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this, R.raw.three);  // finding the tune from raw

        final TextView mnumber = findViewById(R.id.mnumber);
        final TextView done = findViewById(R.id.done);

        new CountDownTimer(10000, 1000){
            // by the first number given above you can change the time of the timer

            public void onTick(long millisecondsUntilDone){

                mnumber.setText("Time: " + String.valueOf(millisecondsUntilDone/1000));

            }
            public void onFinish(){

                done.setText("Done !!");  // isse not done wala text done ho gya
                m1.start();   // isse sound bajja timer khatam hone pe

            }


        }.start();

    }
}
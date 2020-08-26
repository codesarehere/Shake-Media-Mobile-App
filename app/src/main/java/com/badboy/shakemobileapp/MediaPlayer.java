package com.badboy.shakemobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MediaPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);


        final android.media.MediaPlayer mPlayer = android.media.MediaPlayer.create(this, R.raw.mysong);

        Button buttonPlay = (Button) findViewById(R.id.button1);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.start();
            }
        });

        Button buttonStop = (Button) findViewById(R.id.buttonStop);

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.pause();


            }
        });


    }
}

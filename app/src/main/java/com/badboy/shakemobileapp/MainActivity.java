package com.badboy.shakemobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Toast;

import com.squareup.seismic.ShakeDetector;

public class MainActivity extends AppCompatActivity implements ShakeDetector.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector shakeDetector = new ShakeDetector(this);
        shakeDetector.start(sensorManager);
    }

    @Override
    public void hearShake() {

        Intent intent = new Intent(this, MediaPlayer.class);
        startActivity(intent);

    }

}

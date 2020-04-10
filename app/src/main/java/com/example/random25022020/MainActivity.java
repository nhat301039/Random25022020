package com.example.random25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       long a = Math.round(1.5);
        Log.d( "BBB",String.valueOf(a));
    }
}

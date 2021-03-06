package com.c4q.myhelloworldandriodproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: onResume is running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: onPause is running");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: onStop running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: onDestroy is running");
    }
}

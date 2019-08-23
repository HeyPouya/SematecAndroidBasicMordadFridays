package com.sematec.sematecandroidbasicmordadfridays;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MYTAG","We are in onCreate method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYTAG","We are in onStart method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG","We are in onResume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

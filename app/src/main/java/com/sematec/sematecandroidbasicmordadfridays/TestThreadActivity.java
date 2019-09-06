package com.sematec.sematecandroidbasicmordadfridays;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);


        String threadName = Thread.currentThread().getName();
        Log.d("MYTAG", threadName);


         new Thread(new Runnable() {
            @Override
            public void run() {
                String newThreadName = Thread.currentThread().getName();
                Log.d("MYTAG", newThreadName);
            }
        }).start();
    }
}

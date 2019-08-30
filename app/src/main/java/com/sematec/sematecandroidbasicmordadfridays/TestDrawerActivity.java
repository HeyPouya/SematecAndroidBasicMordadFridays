package com.sematec.sematecandroidbasicmordadfridays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TestDrawerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_drawer);

        Button btnShow = findViewById(R.id.btnShow);
    }
}

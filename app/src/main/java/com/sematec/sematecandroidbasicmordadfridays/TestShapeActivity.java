package com.sematec.sematecandroidbasicmordadfridays;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TestShapeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shape);


        Intent intent = new Intent(this, TestService.class);
        startService(intent);
    }
}

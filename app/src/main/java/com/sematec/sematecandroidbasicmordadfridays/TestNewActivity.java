package com.sematec.sematecandroidbasicmordadfridays;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_new);

        TextView txtName = findViewById(R.id.txtName);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");


        txtName.setText(name);
    }
}

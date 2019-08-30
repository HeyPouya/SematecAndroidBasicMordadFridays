package com.sematec.sematecandroidbasicmordadfridays;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestSharedPrefrencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_prefrences);

        final EditText edtName = findViewById(R.id.edtName);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnShow = findViewById(R.id.btnShow);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();

                PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrencesActivity.this).edit().putString("name", name).apply();
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrencesActivity.this).getString("name", "Unknown Name!!!");
                Toast.makeText(TestSharedPrefrencesActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

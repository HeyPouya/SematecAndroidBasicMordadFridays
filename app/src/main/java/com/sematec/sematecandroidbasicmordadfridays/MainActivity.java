package com.sematec.sematecandroidbasicmordadfridays;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSave = findViewById(R.id.btnSave);
        final EditText edtName = findViewById(R.id.edtName);
        ImageView imgProfile = findViewById(R.id.imgProfile);


        TextView txtTitle = findViewById(R.id.txtTitle);
        txtTitle.setText("Pouya");

        txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MYTAG", "User has clicked!");
            }
        });


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_LONG).show();
            }
        });


        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TestNewActivity.class);
                String name = edtName.getText().toString();
                i.putExtra("name", name);
                startActivity(i);
            }
        });

    }

}

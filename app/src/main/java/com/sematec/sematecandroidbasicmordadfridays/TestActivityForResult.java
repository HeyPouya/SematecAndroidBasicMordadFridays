package com.sematec.sematecandroidbasicmordadfridays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivityForResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_for_result);


        final EditText edtName = findViewById(R.id.edtName);
        Button btnOk = findViewById(R.id.btnOk);


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();

                Intent intent = new Intent(TestActivityForResult.this, TestActivityForResultDestination.class);

                intent.putExtra("name", name);

                startActivityForResult(intent, 4576);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4576){
            if (resultCode == Activity.RESULT_OK){
                String family = data.getStringExtra("family");
                Toast.makeText(TestActivityForResult.this, family, Toast.LENGTH_LONG).show();
            }
        }

    }
}

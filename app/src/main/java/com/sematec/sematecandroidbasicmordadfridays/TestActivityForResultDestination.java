package com.sematec.sematecandroidbasicmordadfridays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivityForResultDestination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_for_result_destination);

        TextView txtName = findViewById(R.id.txtName);
        final EditText edtFamily = findViewById(R.id.edtFamily);
        Button btnOk = findViewById(R.id.btnOk);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");


        txtName.setText(name);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String family = edtFamily.getText().toString();
                Intent intent1 = new Intent();
                intent1.putExtra("family", family);
                setResult(Activity.RESULT_OK, intent1);
                finish();
            }
        });

    }
}

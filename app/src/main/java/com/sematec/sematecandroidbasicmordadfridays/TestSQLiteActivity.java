package com.sematec.sematecandroidbasicmordadfridays;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestSQLiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_sqlite);

        TestSQLiteHelper helper = new TestSQLiteHelper(TestSQLiteActivity.this, "sematecdb", null, 2);


        helper.insertStudent("Pouya", "Heydari", 90);
        helper.insertStudent("Qoli", "QoliPour", 80);


        String result = helper.getAllStudentsNames();
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}

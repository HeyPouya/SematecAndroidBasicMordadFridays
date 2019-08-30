package com.sematec.sematecandroidbasicmordadfridays;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_acctivity);

        ArrayList<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Mojtaba Ahmadi");
        list.add("Arpi Eskandari");
        list.add("Amir Amiri");
        list.add("Shahab Teymoorian");
        list.add("Matin Rezae");
        list.add("Roozbeh Shafiee");
        list.add("Javad Sabaq");
        list.add("Reza Sanati");
        list.add("Farzaneh Mortazavi");
        list.add("Reza Nashveh");
        list.add("Mohammad Karimi");




        RecyclerView recycler = findViewById(R.id.recycler);

        TestRecyclerAdapter adapter = new TestRecyclerAdapter(list);
        recycler.setAdapter(adapter);


        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));

    }
}

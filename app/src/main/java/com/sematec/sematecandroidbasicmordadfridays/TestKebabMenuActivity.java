package com.sematec.sematecandroidbasicmordadfridays;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TestKebabMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_kebab_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0,1,0,"Activity Added menu");

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.firstItem:
                Toast.makeText(this, "first item clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.secondItem:
                Toast.makeText(this, "second item clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.thirdItem:
                Toast.makeText(this, "third item clicked", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Activity Added menu item clicked", Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}

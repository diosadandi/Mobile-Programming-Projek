package com.hfad.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drinkmessage(View view) {
        Intent intent = new Intent(this, DrinkMenu.class);
        startActivity(intent);
    }

    public void foodmessage(View view) {
        Intent intent = new Intent(this, FoodMenu.class);
        startActivity(intent);
    }

    public void snackmessage(View view) {
        Intent intent = new Intent(this, SnackMenu.class);
        startActivity(intent);
    }

    public void topupmessage(View view) {
        Intent intent = new Intent(this, TopupMenu.class);
        startActivity(intent);
    }
}
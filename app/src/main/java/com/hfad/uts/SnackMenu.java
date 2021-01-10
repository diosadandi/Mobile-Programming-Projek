package com.hfad.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SnackMenu extends AppCompatActivity {

    Button taroButton,chitosButton,laysButton;
    String choices = "";
    Double price = 0.00;
    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_menu);

        taroButton = (Button) findViewById(R.id.taroButton);
        chitosButton = (Button) findViewById(R.id.chitosButton);
        laysButton = (Button) findViewById(R.id.laysButton);
    }

    public void add_to_list(View view) {
        if (view == findViewById(R.id.taroButton))
        {
            choices = choices+"Pizza"+"\n";
            quantity++;
            price = price+200;
        }
        else if (view == findViewById(R.id.chitosButton))
        {
            choices = choices+"Burger"+"\n";
            quantity++;
            price = price+123;
        }
        else if (view == findViewById(R.id.laysButton))
        {
            choices = choices+"Nuget"+"\n";
            quantity++;
            price = price+150;
        }
    }

    public void placeOrder(View view) {
        Intent intent = new Intent(this, MyOrder.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices", choices);
        bundle.putDouble("price",price);
        bundle.putInt("quantity",quantity);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
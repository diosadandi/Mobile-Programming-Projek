package com.hfad.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinkMenu extends AppCompatActivity {

    Button airmineralButton,jusmanggaButton,jusapelButton;

    String choices = "";
    Double price = 0.00;
    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_menu);

        airmineralButton = (Button) findViewById(R.id.airmineralButton);
        jusmanggaButton = (Button) findViewById(R.id.jusmanggaButton);
        jusapelButton = (Button) findViewById(R.id.jusapelButton);
    }

    public void add_to_list(View view) {
        if (view == findViewById(R.id.airmineralButton))
        {
            choices = choices+"Air Mineral"+"\n";
            quantity++;
            price = price+200;
        }
        else if (view == findViewById(R.id.jusmanggaButton))
        {
            choices = choices+"Jus Mangga"+"\n";
            quantity++;
            price = price+123;
        }
        else if (view == findViewById(R.id.jusapelButton))
        {
            choices = choices+"Jus Apel"+"\n";
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
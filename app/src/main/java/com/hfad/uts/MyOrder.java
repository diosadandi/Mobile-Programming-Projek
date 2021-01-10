package com.hfad.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyOrder extends AppCompatActivity {

    Button hapusButton;
    TextView listView,priceView;
    String listChoice;
    Double price_rp;
    int quantity_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);
        hapusButton = (Button) findViewById(R.id.hapusButton);


        Bundle bundle = getIntent().getExtras();
        listChoice = bundle.getString("choices");
        price_rp=bundle.getDouble("price");
        quantity_now = bundle.getInt("quantity");


        priceView.setText("Total: Rp."+price_rp.toString()+"Total");
        listView.setText(listChoice);

    }

    public void pay(View view) {
        Intent intent = new Intent(this, Pay.class);
        startActivity(intent);
    }

    public void hapuskan(View view) {
        listView.clearComposingText();
        quantity_now--;
        priceView.clearComposingText();

    }
}
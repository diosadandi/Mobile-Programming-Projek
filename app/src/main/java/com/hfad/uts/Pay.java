package com.hfad.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pay extends AppCompatActivity {

    TextView listView,priceView;
    String listChoice;
    Double price_rp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);


        Bundle bundle = getIntent().getExtras();
        listChoice = bundle.getString("choices");
        price_rp=bundle.getDouble("price");


        priceView.setText("Total: Rp."+price_rp.toString()+"Total");
        listView.setText(listChoice);
    }
}
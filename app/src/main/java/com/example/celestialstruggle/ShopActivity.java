package com.example.celestialstruggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        if (getIntent().hasExtra("com.example.celestialstruggle.SOMETHING")){
            TextView shopTextView = (TextView) findViewById(R.id.shopTextView);
            shopTextView.setText(getIntent().getExtras().getString("com.example.celestialstruggle.SOMETHING"));

        }

    }
}

package com.example.celestialstruggle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shopButton = (Button) findViewById(R.id.shopButton);
        Button googleButton = (Button) findViewById(R.id.googleButton);

        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ShopActivity.class);
                startIntent.putExtra("com.example.celestialstruggle.SOMETHING", "Welcome to the shop");
                startActivity(startIntent);
            }
        });

    }
}

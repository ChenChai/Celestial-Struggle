package com.example.celestialstruggle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

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

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webAddress = Uri.parse("https://www.google.com/");

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webAddress);
                // check to see if there is a response from request to see if there is an app that can do this
                if(goToGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(goToGoogle);
                }
            }
        });


    }
}

package com.example.celestialstruggle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shopButton = (Button) findViewById(R.id.shopButton);
        Button googleButton = (Button) findViewById(R.id.googleButton);
    }

    // can use setOnClickListener instead of xml file android:onClick
    public void shopButtonClickHandler (View view){
        Intent startIntent = new Intent(getApplicationContext(), ShopActivity.class);
        startIntent.putExtra("com.example.celestialstruggle.SOMETHING", "Welcome to the shop");
        startActivity(startIntent);
    }

    public void googleButtonClickHandler (View view){
        String google = "http://www.google.com";
        Uri webAddress = Uri.parse(google);

        Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webAddress);
        // if there is something that can actually go to the web address
        if (goToGoogle.resolveActivity(getPackageManager()) != null){
            startActivity(goToGoogle);
        }


    }
}

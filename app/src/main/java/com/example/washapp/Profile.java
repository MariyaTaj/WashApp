package com.example.washapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setTitle("Profile");

        //Intialize and assign variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.profile);


        //Perform itemselected listener

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:

                        startActivity(new Intent(getApplicationContext(),
                                HomePage.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.ratecard:
                        startActivity(new Intent(getApplicationContext(),
                                RateCard.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.profile:

                        return true;

                }
                return false;
            }
        });


    }
}
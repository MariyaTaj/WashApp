package com.example.washapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class RateCard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_card);


                 //Intialize and assign variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.ratecard);

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

                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),
                                Profile.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;
            }
        });


    }


}
package com.example.washapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_form);
        getSupportActionBar().setTitle("Sign Up Form");
    }

    public void btn_HomePage(View view) {
        startActivity(new Intent(getApplicationContext(),HomePage.class));
    }
}
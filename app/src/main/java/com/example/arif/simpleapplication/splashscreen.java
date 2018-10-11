package com.example.arif.simpleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.arif.simpleapplication.util.PreferencesHelper;

public class splashscreen extends AppCompatActivity {
    PreferencesHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!instance.isLogin()) {
                    startActivity(new Intent(splashscreen.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(splashscreen.this, MainActivity.class));
                }
            }
        },splashInterval);
    }
}
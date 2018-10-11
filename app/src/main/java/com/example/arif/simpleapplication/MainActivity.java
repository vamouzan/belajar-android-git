package com.example.arif.simpleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String nama;
    private String KEY_NAME = "NAMA";
    private TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (TextView) findViewById(R.id.name);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        hello.setText("Hello, " + nama + " !");

    }

    public void adduser(View view) {
    }

    public void listuser(View view) {
    }

    public void gotofragment(View view) {
        Intent intent=new Intent(MainActivity.this, FragmentActivity.class);
        startActivity(intent);
    }

    public void gotoact(View view) {
        Intent intent=new Intent(MainActivity.this, Second_activity.class);
        startActivity(intent);
    }
}

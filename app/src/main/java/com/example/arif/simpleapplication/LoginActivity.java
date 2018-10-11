package com.example.arif.simpleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.arif.simpleapplication.util.PreferencesHelper;

public class LoginActivity extends AppCompatActivity {

    PreferencesHelper instance;
    private EditText name;
    private EditText email;
    private Button button;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = PreferencesHelper.getInstance(getApplicationContext());

        name = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
        button = (Button) findViewById(R.id.kirim);
    }

    public void Login (View view) {
        String n = name.getText().toString();
        String e = email.getText().toString();
        Toast.makeText(getApplicationContext(),"Succes Login",Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(n);

        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        intent.putExtra(KEY_NAME, n);
        startActivity(intent);
    }


}

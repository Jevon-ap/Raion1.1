package com.example.raion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.et_password);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamekey = username.getText().toString();
                String passwordkey = password.getText().toString();
                if(usernamekey.equals("123") && passwordkey.equals("123")){
                    Intent intent = new Intent(Login.this , Menu.class);
                    Login.this.startActivity(intent);}
                    else{
                        AlertDialog.Builder salah = new AlertDialog.Builder(Login.this);
                        salah.setMessage("Username atau Password salah!").setNegativeButton("Retry",null).create().show();
                    }
                };
            });
        };

    }

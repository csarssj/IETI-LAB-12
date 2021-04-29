package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Login(View view){
        EditText editEmail = (EditText) findViewById(R.id.email);
        EditText editPassword = (EditText) findViewById(R.id.password);
        String user = editEmail.getText().toString();
        String password = editPassword.getText().toString();
        if(user.equals("")){
            editEmail.setError("Ingrese un nombre de usuario");
        }
        if(password.equals("")){
            editPassword.setError("Ingrese contraseña");
        }

    }
}

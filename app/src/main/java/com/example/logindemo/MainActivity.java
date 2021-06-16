package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText nameUsernameText =(EditText) findViewById(R.id.editUsernameText);

        EditText namePasswordText =(EditText) findViewById(R.id.editPasswordText);

        Log.i("Info", "Logged In Succesful");

        Log.i("User Name",nameUsernameText.getText().toString());

        Log.i("Password",namePasswordText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
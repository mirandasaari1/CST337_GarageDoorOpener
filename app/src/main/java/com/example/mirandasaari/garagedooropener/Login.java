package com.example.mirandasaari.garagedooropener;

/**
 * Created by Miranda Saari on 4/22/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Miranda Saari on 4/21/2017.
 */

public class Login extends Activity implements View.OnClickListener {

    //widget variables
    private EditText passwordEditText;
    private Button loginButton;
    private CharSequence text = "";
    private int duration = Toast.LENGTH_SHORT;
    private int errorCount=0;
    private int flag=0;

    private String passwordString = "";
    private String TAG = "test";

    //sharedPreferences object
    private SharedPreferences savedValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_);

        // get references to the widgets);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        loginButton = (Button) findViewById(R.id.loginButton);


        // set the listeners
        passwordEditText.setOnClickListener(this);
        loginButton.setOnClickListener(this);

    }

    //verifies user put in info (not checking values as of now)
    public void verifyUser() {
        passwordString = passwordEditText.getText().toString();
        if(passwordString.isEmpty()){
            text = "Incorrect login";
            duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(this, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            flag=1;
        }
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.loginButton && flag==0) {
            Intent intent = new Intent(Login.this, MainActivity.class);
        }
    }
}

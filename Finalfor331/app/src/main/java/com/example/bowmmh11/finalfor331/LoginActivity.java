package com.example.bowmmh11.finalfor331;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Context context = getApplicationContext();
        CharSequence failText = "Invalid Username/Password";
        CharSequence successText = "Login Successful";
        int duration = Toast.LENGTH_LONG;

        final Toast loginFailureToast = Toast.makeText(context, failText, duration);
        final Toast loginSuccessToast = Toast.makeText(context, successText, duration);

        Button registerbutton = (Button) findViewById(R.id.register_button);
        registerbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Call the register activity
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        Button loginbutton = (Button) findViewById(R.id.email_sign_in_button);
        loginbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Scrape information from data fields
                EditText eUsername = (EditText) findViewById(R.id.username);
                String sUsername = eUsername.getText().toString();
                EditText ePassword = (EditText) findViewById(R.id.password);
                String sPassword = ePassword.getText().toString();

                //Pass this information to the database handler

                if(sUsername.equals("bowmmh11") && sPassword.equals("csc331")) {
                    Intent i = new Intent(LoginActivity.this, OptionsActivity.class);
                    startActivity(i);
                    loginSuccessToast.show();
                } else {
                    loginFailureToast.show();
                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

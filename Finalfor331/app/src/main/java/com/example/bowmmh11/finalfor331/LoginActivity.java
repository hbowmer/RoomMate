package com.example.bowmmh11.finalfor331;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


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

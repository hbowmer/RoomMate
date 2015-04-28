package com.example.bowmmh11.finalfor331;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class OptionsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Button searchbutton = (Button) findViewById(R.id.button_search);
        searchbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Call the new screen
                Intent i = new Intent(OptionsActivity.this, SearchActivity.class);
                startActivity(i);
            }
        });

        Button addlistingbutton = (Button) findViewById(R.id.button_listing);
        addlistingbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Call the new activity
                Intent i = new Intent(OptionsActivity.this, ListingActivity.class);
                startActivity(i);
            }
        });

        Button messagesbutton = (Button) findViewById(R.id.button_messages);
        messagesbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Call the new activity
                Intent i = new Intent(OptionsActivity.this, SendMessageActivity.class);
                startActivity(i);
            }
        });

        Button logoutbutton = (Button) findViewById(R.id.button_logout);
        logoutbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Call the new activity
                setResult(RESULT_OK);
                finish();

                Toast logoutSuccessToast = Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_LONG);
                logoutSuccessToast.show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_options, menu);
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

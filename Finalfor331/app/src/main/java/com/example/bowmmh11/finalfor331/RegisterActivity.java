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


public class RegisterActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Context context = getApplicationContext();
        CharSequence text = "Account Creation Successful";
        int duration = Toast.LENGTH_LONG;

        final Toast registrationSuccessfulToast = Toast.makeText(context, text, duration);

        Button registerbutton = (Button) findViewById(R.id.confirm_registration);
        registerbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Scrape information from data fields
                EditText eName = (EditText) findViewById(R.id.register_name);
                String sName = eName.getText().toString();
                EditText eUser = (EditText) findViewById(R.id.register_username);
                String sUser = eUser.getText().toString();
                EditText ePass = (EditText) findViewById(R.id.register_password);
                String sPass = ePass.getText().toString();

                //Push information to database handler somehow


                setResult(RESULT_OK);
                finish();

                Intent i = new Intent(RegisterActivity.this, OptionsActivity.class);
                startActivity(i);

                registrationSuccessfulToast.show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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

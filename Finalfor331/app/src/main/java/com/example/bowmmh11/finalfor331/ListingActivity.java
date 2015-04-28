package com.example.bowmmh11.finalfor331;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ListingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        Button addlisting = (Button) findViewById(R.id.add_listing);
        addlisting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Scrape information from data fields
                EditText eType = (EditText) findViewById(R.id.type);
                String sType = eType.getText().toString();
                EditText eSqFoot = (EditText) findViewById(R.id.squarefeet);
                String sSqFoot = eSqFoot.getText().toString();
                EditText eBedrooms = (EditText) findViewById(R.id.beds);
                String sBedrooms = eBedrooms.getText().toString();
                EditText eBathrooms = (EditText) findViewById(R.id.bath);
                String sBathrooms = eBathrooms.getText().toString();
                EditText ePrice = (EditText) findViewById(R.id.price);
                String sPrice = ePrice.getText().toString();
                EditText eYear = (EditText) findViewById(R.id.year);
                String sYear = eYear.getText().toString();

                //Push this information to the Database Handler somehow

                setResult(RESULT_OK);
                finish();

                Toast listingSuccessToast = Toast.makeText(getApplicationContext(), "Listing Created", Toast.LENGTH_LONG);
                listingSuccessToast.show();


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listing, menu);
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

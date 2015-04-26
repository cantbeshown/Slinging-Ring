package com.cantbeshown.slingingring;
import android.graphics.Color;
import android.util.*;
import android.widget.*;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Switch onOffSwitch = (Switch) findViewById(R.id.Difficulty);
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("Switch State=", ""+isChecked);
                if(!isChecked) {
                    buttonView.setTextColor(Color.parseColor("#ff47a14f"));
                    buttonView.setText(onOffSwitch.getTextOff());

                }
                else {
                    buttonView.setTextColor(Color.parseColor("#ffa13145"));
                    buttonView.setText(onOffSwitch.getTextOn());

                }
            }

        });


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

// Sets the text for when the button is not in the checked state.


// Sets the text for when the button is in the checked state.
}

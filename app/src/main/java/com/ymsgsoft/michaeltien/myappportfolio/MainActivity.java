package com.ymsgsoft.michaeltien.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    private void showToast(String s)
    {
        Context context = getApplicationContext();
        CharSequence text = s;
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
    public void OnClickButton(View view)
    {
        // show the title
        switch( view.getId()) {
            case R.id.spotifyStreamerButton:
                showToast("This button will lanuch spotify streamer!");
                break;
            case R.id.scoreAppButton:
                showToast( "This button will lanuch score app!");
                break;
            case R.id.libraryAppBtn:
                showToast( "This button will lanuch library app!");
                break;
            case R.id.buildItBiggerButton:
                showToast( "This button will lanuch build it bigger app!");
                break;
            case R.id.xyzReaderButton:
                showToast( "This button will lanuch xyz reader app!");
                break;
            case R.id.capstoneButton:
                showToast( "This button will lanuch capstone app!");
                break;
        } // switch
    }
}

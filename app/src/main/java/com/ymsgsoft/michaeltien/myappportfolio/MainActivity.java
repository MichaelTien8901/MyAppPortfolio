package com.ymsgsoft.michaeltien.myappportfolio;

import android.content.Context;
import android.content.Intent;
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
    public boolean launchApp(Context context, String package_name) {
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(package_name);
        if ( intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
            return true;
        } else
            return false;
    }
    public void OnClickButton(View view)
    {
        // show the title
        switch( view.getId()) {
            case R.id.popularMoviesButton:
                if ( !launchApp(this, getString(R.string.popular_movies_package_name))) {
                    showToast( "Popular Movies app not installed!");
                }
                break;
            case R.id.scoreAppButton:
                if ( !launchApp(this, getString(R.string.football_score_package_name))) {
                    showToast( "Football Score app not installed!");
                }
                break;
            case R.id.libraryAppBtn:
                if ( !launchApp(this, getString(R.string.alexandria_package_name))) {
                    showToast( "Library app not installed!");
                }
                break;
            case R.id.buildItBiggerButton:
                if ( !launchApp(this, getString(R.string.build_it_bigger_package_name))) {
                    showToast( "Build it bigger app not installed!");
                }
                break;
            case R.id.xyzReaderButton:
                if ( !launchApp(this, getString(R.string.xyz_reader_package_name))) {
                    showToast( "Xyz reader app not installed!");
                }
                break;
            case R.id.androidWearWatchButton:
                if ( !launchApp(this, getString(R.string.udacity_watch_package_name))) {
                    showToast( "Udacity Watch app not installed!");
                }
                break;
            case R.id.capstoneButton:
                if ( !launchApp(this, getString(R.string.capstone_package_name))) {
                       showToast( "Capstone app not installed!");
                }
                break;
        } // switch
    }
}

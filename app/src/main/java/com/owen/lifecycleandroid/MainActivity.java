package com.owen.lifecycleandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //the method is called when the app is stoped
    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","Activity Stoped");
    }

    //The method is called when the app is being lauch and used by the user
    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity", "App started");

    }

    //The method is called whew the user completely closes the app
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity", "App Destroyed");
    }

    //The methods gets executed when the App is minimzed and not destroyed
    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity", "App Paused");
    }

    //The method gets called when the app from its state is continued after a pause state
    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","App Resumed");
    }
}

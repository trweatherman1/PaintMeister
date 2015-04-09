package com.example.trent.paintmeister;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;


public class SplashScreen extends ActionBarActivity {

    ProgressBar progress;
    android.os.Handler handler;
    static final int DELAY = 5000;
    Class nextActivity = MainMenu.class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progress = (ProgressBar)this.findViewById(R.id.progressBar);
    }

    public void onStart(){
        super.onStart();
        handler = new android.os.Handler();
        handler.postDelayed(r, DELAY);
    }

    Runnable r = new Runnable(){
        public void run(){
            goToNextScreen();
        }
    };

    public void goToNextScreen(){
        Intent nextScreen = new Intent(this,nextActivity);
        this.startActivity(nextScreen);
        finish();
    }


}

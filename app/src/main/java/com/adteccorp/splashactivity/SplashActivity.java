package com.adteccorp.splashactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends Activity {
    Handler handler;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.splashscreen );
        handler = new Handler();
        handler.postDelayed( new Runnable() {

            @Override
            public void run() {
                startActivity( new Intent( SplashActivity.this, MainActivity.class ) );
                finish();

            }
        }, 3000 );

    }
}

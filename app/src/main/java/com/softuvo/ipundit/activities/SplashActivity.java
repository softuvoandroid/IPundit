package com.softuvo.ipundit.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softuvo.ipundit.R;
import com.softuvo.ipundit.config.App;
import com.softuvo.ipundit.receivers.ConnectivityReceivers;
import com.softuvo.ipundit.utils.SnackbarUtil;

public class SplashActivity extends AppCompatActivity implements ConnectivityReceivers.ConnectivityListener {

    private int SPLASH_TIME_OUT = 1000;
    private Context context = SplashActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        nextActivity();
    }

    private void nextActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent intent = new Intent(context, DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
        checkConnection();
    }

    @Override
    protected void onResume() {
        super.onResume();
        App.getAppContext().setConnectivityListener(this);
    }

    private void checkConnection() {
        String message;
        boolean isConnected = ConnectivityReceivers.isConnected();
        if (isConnected) {
            message = "Good! Connected to Internet";
        } else {
            message = "Sorry! Not connected to internet";
        }
        SnackbarUtil.showLongSnackbar(SplashActivity.this, message);
    }


    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        String message;
        if (isConnected) {
            message = "Good! Connected to Internet";
        } else {
            message = "Sorry! Not connected to internet";
        }
        SnackbarUtil.showLongSnackbar(SplashActivity.this, message);
    }


}

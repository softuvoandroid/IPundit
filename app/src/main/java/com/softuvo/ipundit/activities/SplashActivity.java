package com.softuvo.ipundit.activities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softuvo.ipundit.R;
import com.softuvo.ipundit.config.App;
import com.softuvo.ipundit.receivers.ConnectivityReceivers;
import com.softuvo.ipundit.utils.SnackbarUtil;

public class SplashActivity extends AppCompatActivity implements ConnectivityReceivers.ConnectivityListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

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

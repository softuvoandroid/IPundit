package com.softuvo.ipundit.config;

import android.support.multidex.MultiDexApplication;

import com.softuvo.ipundit.receivers.ConnectivityReceivers;

/**
 * Created by softuvo on 6/13/2017.
 */

public class App extends MultiDexApplication {
    private static App appInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        appInstance = this;
    }

    public static App getAppContext() {
        return appInstance;
    }

    public void setConnectivityListener(ConnectivityReceivers.ConnectivityListener connectivityListener) {
        ConnectivityReceivers.connectivityListener = connectivityListener;
    }
}

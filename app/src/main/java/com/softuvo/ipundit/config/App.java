package com.softuvo.ipundit.config;

import android.support.multidex.MultiDexApplication;

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
}

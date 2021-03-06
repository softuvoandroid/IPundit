package com.softuvo.ipundit.utils;

import android.widget.Toast;

import com.softuvo.ipundit.config.App;

public class ToastUtil {
    public static void showSmallToast(String message) {
        Toast.makeText(App.getAppContext(), message, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(String message) {
        Toast.makeText(App.getAppContext(), message, Toast.LENGTH_LONG).show();
    }
}

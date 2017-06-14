package com.softuvo.ipundit.utils;

import android.app.Activity;
import android.support.design.widget.Snackbar;

import com.softuvo.ipundit.config.App;

/**
 * Created by softuvo on 6/13/2017.
 */

public class SnackbarUtil {

    public static void showSmallSnackbar(Activity activity, String message) {
        Snackbar.make(activity.findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }

    public static void showLongSnackbar(Activity activity, String message) {
        Snackbar.make(activity.findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG).show();
    }
}

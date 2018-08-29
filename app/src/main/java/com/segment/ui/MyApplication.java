package com.segment.ui;

import android.app.Application;
import android.content.Context;

import com.segment.lib.util.AndroidUtilities;

public class MyApplication extends Application{
    public static Context sApplication;


    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        AndroidUtilities.init(this);

    }
}

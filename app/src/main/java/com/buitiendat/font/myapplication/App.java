package com.buitiendat.font.myapplication;

import android.app.Application;

/**
 * Created by dattien on 5/29/17.
 */

public class App extends Application {
    private static Application mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }
    public static Application getInstance() {
        return mApplication;
    }
}

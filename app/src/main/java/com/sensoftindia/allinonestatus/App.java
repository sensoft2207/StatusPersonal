package com.sensoftindia.allinonestatus;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by mxi on 30/1/18.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this, "ca-app-pub-7186285195463888~7923693144");
    }
}

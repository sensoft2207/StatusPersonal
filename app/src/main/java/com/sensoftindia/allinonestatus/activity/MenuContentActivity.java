package com.sensoftindia.allinonestatus.activity;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.sensoftindia.allinonestatus.R;

/**
 * Created by mxi on 29/12/17.
 */

public class MenuContentActivity extends AppCompatActivity {

    LinearLayout ln_home,ln_favourite,ln_used,ln_about_us,ln_rate,ln_logout;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.menu_content_activity);


        init();

        mAdView = (AdView) findViewById(R.id.adView);



        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                // Check the LogCat to get your test device ID
                //.addTestDevice("5ABF1C85B25F8307141BF8160DD42CD3")
                .build();


        mAdView.loadAd(adRequest);

    }

    private void init() {

        ln_home = (LinearLayout)findViewById(R.id.ln_home);
        ln_favourite = (LinearLayout)findViewById(R.id.ln_favourite);
        ln_used = (LinearLayout)findViewById(R.id.ln_used);
        ln_about_us = (LinearLayout)findViewById(R.id.ln_about_us);
        ln_rate = (LinearLayout)findViewById(R.id.ln_rate);
        ln_logout = (LinearLayout)findViewById(R.id.ln_logout);


        clickListner();
    }

    private void clickListner() {

        ln_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        ln_favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentFav = new Intent(MenuContentActivity.this,FavouriteStatus.class);
                startActivity(intentFav);

            }
        });

        ln_used.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentUsed = new Intent(MenuContentActivity.this,UsedStatus.class);
                startActivity(intentUsed);
            }
        });

        ln_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                shareApp();
            }
        });

        ln_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rateApp();
            }
        });

       /* ln_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showExitDialog();
            }
        });*/

    }

    private void shareApp() {

        final String appPackageName = getPackageName();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Download and Check out All in one status at: https://play.google.com/store/apps/details?id=" + appPackageName);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    private void rateApp() {

        Uri uri = Uri.parse("market://details?id=" + getPackageName());
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        // To count with Play market backstack, After pressing back button,
        // to taken back to our application, we need to add following flags to intent.
        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }

    private void showExitDialog() {

        final Dialog dialog = new Dialog(MenuContentActivity.this);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.exit_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.onWindowFocusChanged(false);

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        dialog.getWindow().setLayout((6 * width) / 7, ActionBar.LayoutParams.WRAP_CONTENT);

        LinearLayout ln_submit = (LinearLayout)dialog.findViewById(R.id.ln_submit);
        LinearLayout ln_close = (LinearLayout)dialog.findViewById(R.id.ln_close);


        ln_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.dismiss();
                finish();
            }
        });

        ln_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.dismiss();
            }
        });

        dialog.show();

    }

    @Override
    public void onPause() {
        // This method should be called in the parent Activity's onPause() method.
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        // This method should be called in the parent Activity's onResume() method.
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        // This method should be called in the parent Activity's onDestroy() method.
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}

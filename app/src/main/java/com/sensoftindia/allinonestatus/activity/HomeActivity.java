package com.sensoftindia.allinonestatus.activity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.sensoftindia.allinonestatus.R;

/**
 * Created by mxi on 29/12/17.
 */

public class HomeActivity extends AppCompatActivity {


    LinearLayout ln_1,ln_2,ln_3,ln_4,ln_5,ln_6,ln_7,ln_8,ln_9,ln_10,ln_11,ln_12;
    LinearLayout ln_nav_main,ln_close;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        init();

        mAdView = (AdView) findViewById(R.id.adView);



        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                // Check the LogCat to get your test device ID
               // .addTestDevice("5ABF1C85B25F8307141BF8160DD42CD3")
                .build();


        mAdView.loadAd(adRequest);

    }

    private void init() {

        ln_1 = (LinearLayout)findViewById(R.id.ln_1);
        ln_2 = (LinearLayout)findViewById(R.id.ln_2);
        ln_3 = (LinearLayout)findViewById(R.id.ln_3);
        ln_4 = (LinearLayout)findViewById(R.id.ln_4);
        ln_5 = (LinearLayout)findViewById(R.id.ln_5);
        ln_6 = (LinearLayout)findViewById(R.id.ln_6);
        ln_7 = (LinearLayout)findViewById(R.id.ln_7);
        ln_8 = (LinearLayout)findViewById(R.id.ln_8);
        ln_9 = (LinearLayout)findViewById(R.id.ln_9);
        ln_10 = (LinearLayout)findViewById(R.id.ln_10);
        ln_11 = (LinearLayout)findViewById(R.id.ln_11);
        ln_12 = (LinearLayout)findViewById(R.id.ln_12);

        ln_nav_main = (LinearLayout)findViewById(R.id.ln_nav_main);
        ln_close = (LinearLayout)findViewById(R.id.ln_close);

        clickListner();

    }

    private void clickListner() {


        ln_nav_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentMenu = new Intent(HomeActivity.this,MenuContentActivity.class);
                startActivity(intentMenu);

            }
        });

        ln_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showExitDialog();
            }
        });

        ln_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Love Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);

            }
        });

        ln_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Sad Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Cool Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Attitude Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Funny Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Motivational Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Angry Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Breakup Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Miss you Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Gym/Fitness Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Alone Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        ln_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,StatusListing.class);
                intentOne.putExtra("c_name","Heart Touching Status");
                startActivity(intentOne);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });
    }




    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {

        showExitDialog();
        //super.onBackPressed();
    }


    private void showExitDialog() {

        final Dialog dialog = new Dialog(HomeActivity.this);

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

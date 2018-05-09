package com.sensoftindia.allinonestatus.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.sensoftindia.allinonestatus.R;
import com.sensoftindia.allinonestatus.adapter.FavouriteStatusAdapter;
import com.sensoftindia.allinonestatus.helper.DatabaseHelper;
import com.sensoftindia.allinonestatus.model.HaptoData;
import com.sensoftindia.allinonestatus.model.PointTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mxi on 25/1/18.
 */

public class FavouriteStatus extends AppCompatActivity {

    ImageView iv_back;
    RecyclerView rc_favourite_status;

    FavouriteStatusAdapter fAdapter;

    ArrayList<HaptoData> favourite_list;

    DatabaseHelper db;

    String statusAll;
    String statusID;

    private AdView mAdView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourite_status);

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

        db = new DatabaseHelper(this);

        iv_back = (ImageView)findViewById(R.id.iv_back);

        rc_favourite_status = (RecyclerView) findViewById(R.id.rc_favourite_status);
        rc_favourite_status.setLayoutManager(new LinearLayoutManager(FavouriteStatus.this));
        rc_favourite_status.setItemAnimator(new DefaultItemAnimator());

        favourite_list = new ArrayList<HaptoData>();

        List<PointTable> allPoint = db.getAllPointsFromTableOne();

        for (int i = 0; i < allPoint.size(); i++) {

            HaptoData hd = new HaptoData();

            statusAll = allPoint.get(i).getPoints();
            statusID = String.valueOf(allPoint.get(i).getId());

            hd.setMember_name(statusAll);
            hd.setStatusID(statusID);

            favourite_list.add(hd);

            Log.e("Total status.......", statusAll);
        }

        fAdapter = new FavouriteStatusAdapter(favourite_list, R.layout.favourite_status_item,FavouriteStatus.this);
        rc_favourite_status.setAdapter(fAdapter);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

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

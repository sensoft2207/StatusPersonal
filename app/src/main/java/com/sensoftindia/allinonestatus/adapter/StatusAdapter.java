package com.sensoftindia.allinonestatus.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.text.ClipboardManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sensoftindia.allinonestatus.R;
import com.sensoftindia.allinonestatus.comman.CommanClass;
import com.sensoftindia.allinonestatus.helper.DatabaseHelper;
import com.sensoftindia.allinonestatus.model.HaptoData;
import com.sensoftindia.allinonestatus.model.PointTable;

import java.util.Calendar;
import java.util.List;

/**
 * Created by mxi on 30/12/17.
 */

public class StatusAdapter  extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {

    CommanClass cc;

    private List<HaptoData> memberList;
    private int rowLayout;
    public static Context mContext;

    long tag1_id,tag2_id;

    Calendar dobChoose = Calendar.getInstance();

    boolean isFav = false;

    DatabaseHelper db;

    String statusAll;
    String usedStatusAll;


    public StatusAdapter(List<HaptoData> memberList, int rowLayout, Context context) {


        this.memberList = memberList;
        this.rowLayout = rowLayout;
        this.mContext = context;

        db = new DatabaseHelper(context);
        cc = new CommanClass(context);

    }
    @Override
    public int getItemCount() {
        return memberList == null ? 0 : memberList.size();
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new ViewHolder(v);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        HaptoData myItem = memberList.get(i);
        viewHolder.tv_member_name.setText(myItem.getMember_name());



        viewHolder.ln_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(mContext);

                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.add_hapto_dialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.onWindowFocusChanged(false);

                DisplayMetrics metrics = mContext.getResources().getDisplayMetrics();
                int width = metrics.widthPixels;
                int height = metrics.heightPixels;
                dialog.getWindow().setLayout((6 * width) / 7, ActionBar.LayoutParams.WRAP_CONTENT);

                LinearLayout ln_submit = (LinearLayout)dialog.findViewById(R.id.ln_submit);
                LinearLayout ln_close = (LinearLayout)dialog.findViewById(R.id.ln_close);
                LinearLayout ln_dialog_copy = (LinearLayout)dialog.findViewById(R.id.ln_dialog_copy);
                LinearLayout ln_dialog_share = (LinearLayout)dialog.findViewById(R.id.ln_dialog_share);
                LinearLayout ln_dialog_favourite = (LinearLayout)dialog.findViewById(R.id.ln_dialog_favourite);
                final ImageView iv_dialog_favourite = (ImageView) dialog.findViewById(R.id.iv_dialog_favourite);
                TextView tv_view = (TextView) dialog.findViewById(R.id.tv_view);

                setStatus(viewHolder.getAdapterPosition(),tv_view);

                iv_dialog_favourite.setImageResource(R.drawable.heart_rate_two);


                ln_dialog_copy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        ClipboardManager cm = (ClipboardManager)mContext.getSystemService(Context.CLIPBOARD_SERVICE);
                        cm.setText(viewHolder.tv_member_name.getText().toString());

                        cc.showToast("Status Copied");
                    }
                });

                ln_dialog_share.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        shareToWhatsapp(viewHolder.tv_member_name.getText().toString());

                        addedToUsedstatus(viewHolder.tv_member_name.getText().toString());
                    }
                });

                ln_dialog_favourite.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (isFav == false){

                            iv_dialog_favourite.setImageResource(R.drawable.heart_rate);

                            isFav = true;

                            addedToFavourite(viewHolder.tv_member_name.getText().toString());

                            cc.showToast("Favourite Added successfully");

                        }else {

                            iv_dialog_favourite.setImageResource(R.drawable.heart_rate_two);

                            isFav = false;

                            db.deleteStatus(tag1_id);

                            cc.showToast("Favourite Remove successfully");
                        }

                    }
                });

                ln_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.dismiss();
                        isFav = false;
                    }
                });

                dialog.show();

            }
        });

    }

    private void addedToUsedstatus(String usedStatus) {

        PointTable point = new PointTable(usedStatus);

        tag2_id = db.createTableUsed(point);

        Log.e("usedstatus", String.valueOf(tag2_id));

        List<PointTable> allPointUsed = db.getAllStatusFromTable();

        for (int i = 0; i < allPointUsed.size(); i++) {

            usedStatusAll = allPointUsed.get(i).getPoints();
            Log.e("used status.......", usedStatusAll);
        }



        db.closeDB();
    }

    private void shareToWhatsapp(String s) {

        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
        whatsappIntent.setType("text/plain");
        whatsappIntent.setPackage("com.whatsapp");
        whatsappIntent.putExtra(Intent.EXTRA_TEXT,s);
        try {
            mContext.startActivity(whatsappIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            cc.showToast("Whatsapp have not been installed.");
        }
    }

    private void addedToFavourite(String status) {

        PointTable point = new PointTable(status);

        tag1_id = db.createTableOne(point);

        Log.e("status", String.valueOf(tag1_id));

        List<PointTable> allPoint = db.getAllPointsFromTableOne();

        for (int i = 0; i < allPoint.size(); i++) {

            statusAll = allPoint.get(i).getPoints();
            Log.e("Total status.......", statusAll);
        }



        db.closeDB();
    }

    private void setStatus(int adapterPosition, TextView tv_view) {

        HaptoData hd = memberList.get(adapterPosition);

        tv_view.setText(hd.getMember_name());

    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tv_member_name;
        public LinearLayout ln_status;
        ImageView tv_status;

        public ViewHolder(View itemView) {
            super(itemView);


            tv_member_name = itemView.findViewById(R.id.tv_member_name);
            tv_status = itemView.findViewById(R.id.tv_status);
            ln_status = itemView.findViewById(R.id.ln_status);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {



        }

    }
}



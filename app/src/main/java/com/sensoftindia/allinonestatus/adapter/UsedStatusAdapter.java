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

import java.util.List;

/**
 * Created by mxi on 29/1/18.
 */

public class UsedStatusAdapter extends RecyclerView.Adapter<UsedStatusAdapter.ViewHolder> {

    CommanClass cc;

    private List<HaptoData> memberList;
    private int rowLayout;
    public static Context mContext;

    DatabaseHelper db;

    String statusAll;


    public UsedStatusAdapter(List<HaptoData> memberList, int rowLayout, Context context) {


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
    public UsedStatusAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new UsedStatusAdapter.ViewHolder(v);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(final UsedStatusAdapter.ViewHolder viewHolder, int i) {
        HaptoData myItem = memberList.get(i);
        viewHolder.tv_member_name.setText(myItem.getMember_name());


        viewHolder.ln_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                deleteStatus(viewHolder.getAdapterPosition());
            }
        });

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
                LinearLayout ln_fav_status = (LinearLayout)dialog.findViewById(R.id.ln_fav_status);
                TextView tv_view = (TextView) dialog.findViewById(R.id.tv_view);

                setStatus(viewHolder.getAdapterPosition(),tv_view);


                ln_fav_status.setVisibility(View.GONE);


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
        });


    }

    private void deleteStatus(int adapterPosition) {

        HaptoData hdd = memberList.get(adapterPosition);

        db.deleteUsedStatus(hdd.getStatusID());

        memberList.remove(adapterPosition);

        notifyItemRemoved(adapterPosition);

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


    private void setStatus(int adapterPosition, TextView tv_view) {

        HaptoData hd = memberList.get(adapterPosition);

        tv_view.setText(hd.getMember_name());


    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tv_member_name;
        public LinearLayout ln_status,ln_delete;
        ImageView tv_status,tv_delete;

        public ViewHolder(View itemView) {
            super(itemView);


            tv_member_name = itemView.findViewById(R.id.tv_member_name);
            tv_status = itemView.findViewById(R.id.tv_status);
            tv_delete = itemView.findViewById(R.id.tv_delete);
            ln_status = itemView.findViewById(R.id.ln_status);
            ln_delete = itemView.findViewById(R.id.ln_delete);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {



        }

    }
}



package me.wawa.player.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AlertDialog;
import android.view.View;

import me.wawa.player.R;
import me.wawa.player.util.StatusBarUtil;


public class BaseActivity extends Activity {

    protected BaseActivity mContext;
    private AlertDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;

        StatusBarUtil.setColor(mContext, ContextCompat.getColor(mContext, R.color.my_black), false);
    }

    @Override
    protected void onStart() {
        super.onStart();

        StatusBarUtil.setColor(this, Color.WHITE, true);
    }

    protected void showProDialog(){

        dismissDialog();

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setCancelable(false);
        View view = View.inflate(mContext, R.layout.dialog_loading, null);
        builder.setView(view);
        dialog = builder.create();
        dialog.show();
    }

    protected void dismissDialog(){

        if(dialog != null){
            dialog.dismiss();
            dialog = null;
        }
    }
}

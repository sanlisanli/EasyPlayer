package me.wawa.player.util;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import android.view.View;

import com.zhaoss.videoplayerdemo.activity.VideoDetailsActivity;
import com.zhaoss.videoplayerdemo.bean.MainVideoBean;

import java.util.ArrayList;



public class IntentUtil {

    public static final String INTENT_DATA_LIST = "intent_data_list";
    public static final String INTENT_PLAY_POSITION = "intent_play_position";

    public static void gotoVideoDetailsActivity(Activity activity, ArrayList<MainVideoBean> dataList, int playPosition, View animationView){

        Intent intent = new Intent(activity, VideoDetailsActivity.class);
        intent.putExtra(INTENT_DATA_LIST, dataList);
        intent.putExtra(INTENT_PLAY_POSITION, playPosition);

        ActivityOptionsCompat compat = ActivityOptionsCompat.makeClipRevealAnimation(animationView, 0, 0, animationView.getWidth(), animationView.getHeight());
        ActivityCompat.startActivity(activity, intent, compat.toBundle());
    }
}

package me.wawa.player;

import android.app.Application;

import me.wawa.player.util.VideoLRUCacheUtil;

public class MyApplication extends Application {

    public static MyApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        this.mContext = this;

        //清理超过大小和存储时间的视频缓存文件
        VideoLRUCacheUtil.checkCacheSize();
    }
}

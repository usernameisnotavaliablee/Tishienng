package com.bytedance.android.live.base.api.outer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILiveView {
    android.view.View getView();

    void onDislike();

    void openLive();

    void release();

    void reportShow();

    void setLiveStatusListener(com.bytedance.android.live.base.api.outer.ILiveStatusListener r1);

    void setMute(boolean r1);

    void show();

    void stream();
}

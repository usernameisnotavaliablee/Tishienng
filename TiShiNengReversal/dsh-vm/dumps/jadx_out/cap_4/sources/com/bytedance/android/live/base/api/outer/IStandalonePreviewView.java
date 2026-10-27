package com.bytedance.android.live.base.api.outer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IStandalonePreviewView {
    android.view.View getView();

    void release();

    void setLiveStatusListener(com.bytedance.android.live.base.api.outer.ILiveStatusListener r1);

    void setMute(boolean r1);

    void show();

    void stream();
}

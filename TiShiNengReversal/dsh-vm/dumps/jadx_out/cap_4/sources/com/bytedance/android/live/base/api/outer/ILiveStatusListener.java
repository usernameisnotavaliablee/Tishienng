package com.bytedance.android.live.base.api.outer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILiveStatusListener {
    void onError(java.lang.String r1);

    void onFirstFrame();

    void onLiveStatusChange(boolean r1);

    void onPrepare();

    void onRoomInvalid();

    void onVideoSizeChanged(int r1, int r2);
}

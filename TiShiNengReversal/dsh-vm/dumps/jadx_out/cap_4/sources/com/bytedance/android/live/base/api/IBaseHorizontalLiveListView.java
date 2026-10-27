package com.bytedance.android.live.base.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IBaseHorizontalLiveListView {
    void refresh();

    android.view.View self();

    void setEmptyListener(com.bytedance.android.live.base.api.callback.Callback<java.lang.Boolean> r1);

    void setErrorListener(com.bytedance.android.live.base.api.callback.Callback<java.lang.Boolean> r1);

    void setRoomCountListener(com.bytedance.android.live.base.api.callback.Callback<java.lang.Integer> r1);
}

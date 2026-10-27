package com.bytedance.android.live.base.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILiveOuterPreviewCoverView {
    void cancelAutoEnterGuide(boolean r1);

    android.view.View getView();

    void onShow();

    void release();

    void setCustomBottomView(android.view.View r1);

    void setOnDislikeCallback(com.bytedance.android.live.base.api.callback.EmptyCallback r1);

    void stream(java.lang.String r1);
}

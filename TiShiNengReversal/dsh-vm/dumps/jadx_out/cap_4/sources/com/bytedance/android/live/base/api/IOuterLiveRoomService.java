package com.bytedance.android.live.base.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IOuterLiveRoomService {
    void addEventListener(com.bytedance.android.live.base.api.IEventListener r1);

    java.lang.Object callExpandMethod(java.lang.String r1, java.lang.Object... r2);

    @java.lang.Deprecated
    void enterRoomWithDraw();

    void enterRoomWithDraw(android.os.Bundle r1);

    com.bytedance.android.live.base.api.outer.ILiveProvider getLiveProvider();

    com.bytedance.android.live.base.api.push.ILivePush getPushService();

    com.bytedance.android.live.base.api.outer.data.OpenUserInfo getUserInfo();

    com.bytedance.android.live.base.api.IBaseHorizontalLiveListView makeFollowListView(android.content.Context r1, android.os.Bundle r2, com.bytedance.android.live.base.api.ILiveBorderAnimController r3);

    void removeEventListener(com.bytedance.android.live.base.api.IEventListener r1);

    @java.lang.Deprecated
    void setEventListener(com.bytedance.android.live.base.api.IEventListener r1);

    void setNeedPersonalRecommend(boolean r1);

    void setUseBlackNavigationBar(boolean r1);

    void updateConsumer(int r1, com.bytedance.android.live.base.api.callback.Callback<java.lang.Object> r2, boolean r3);
}

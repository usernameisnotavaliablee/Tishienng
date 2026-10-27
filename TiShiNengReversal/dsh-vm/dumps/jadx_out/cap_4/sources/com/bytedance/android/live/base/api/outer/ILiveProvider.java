package com.bytedance.android.live.base.api.outer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILiveProvider {
    java.lang.String getCirculationData();

    com.bytedance.android.live.base.api.outer.ILivePreviewLayout getILivePreviewLayout(com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder r1);

    java.lang.String getIdentity();

    com.bytedance.android.live.base.api.outer.ILiveView getLiveView(android.content.Context r1, int r2, java.lang.String r3, boolean r4, android.os.Bundle r5);

    @java.lang.Deprecated
    java.util.List<com.bytedance.android.live.base.api.outer.data.RoomInfo> getRoomInfoList(int r1, int r2, int r3);

    java.util.List<com.bytedance.android.live.base.api.outer.data.RoomInfo> getRoomInfoList(int r1, int r2, int r3, android.os.Bundle r4);

    com.bytedance.android.live.base.api.outer.IStandalonePreviewView makeStandalonePreviewView(android.content.Context r1, int r2, android.os.Bundle r3);

    void reportShow(int r1, java.lang.String r2, android.os.Bundle r3);

    void startLive(android.content.Context r1, int r2, java.lang.String r3, android.os.Bundle r4);
}

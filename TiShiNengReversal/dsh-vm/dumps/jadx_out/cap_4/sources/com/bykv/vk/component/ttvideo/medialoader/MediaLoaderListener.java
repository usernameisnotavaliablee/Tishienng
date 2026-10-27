package com.bykv.vk.component.ttvideo.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface MediaLoaderListener {
    long getInt64Value(int r1, long r2);

    void onDataLoaderError(int r1, java.lang.String r2);

    void onLogInfo(int r1, java.lang.String r2, org.json.JSONObject r3);

    void onNotify(int r1, long r2, long r4, java.lang.String r6);

    void onSwitchLoaderType(int r1, java.lang.String r2);
}

package com.bykv.vk.component.ttvideo.mediakit.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface AVMDLDataLoaderListener {
    java.lang.String getCheckSumInfo(java.lang.String r1);

    long getInt64Value(int r1, long r2);

    java.lang.String getStringValue(int r1, long r2, java.lang.String r4);

    void onNotify(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r1);
}

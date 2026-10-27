package com.bytedance.android.live.base.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IHostPermission {
    boolean alist();

    java.lang.String getAndroidID();

    java.lang.String getDevImei();

    java.lang.String getDevOaid();

    java.lang.String getMacAddress();

    com.bytedance.android.live.base.api.LocationProvider getTTLocation();

    boolean isCanGetAndUseAndroidID();

    boolean isCanUseLocation();

    boolean isCanUsePhoneState();

    boolean isCanUseWifiState();

    boolean isCanUseWriteExternal();
}

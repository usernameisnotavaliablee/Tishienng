package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NetUtils {
    public static final int NETTYPE_UNKNOWN = -1;

    public NetUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getNetExtraInfo(android.content.Context r2) {
            r0 = 0
            android.net.NetworkInfo r2 = getNetworkInfo(r2)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L12
            boolean r1 = r2.isAvailable()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            java.lang.String r2 = r2.getExtraInfo()     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
    }

    public static int getNetType(android.content.Context r2) {
            r0 = -1
            android.net.NetworkInfo r2 = getNetworkInfo(r2)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L12
            boolean r1 = r2.isAvailable()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            int r2 = r2.getType()     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
    }

    public static android.net.NetworkInfo getNetworkInfo(android.content.Context r1) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> Ld
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> Ld
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = 0
            return r1
    }
}

package com.bykv.vk.component.ttvideo.net;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AVNetwork {
    public static final int IS_MOBILE_NETWORK = 2;
    public static final int IS_UNKOWN_NETWORK = 0;
    public static final int IS_WIFF_NETWORK = 1;

    public AVNetwork() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static int getNetworkType(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L20
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L10
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L20
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L14
            return r0
        L14:
            int r2 = r2.getType()     // Catch: java.lang.Throwable -> L20
            r1 = 1
            if (r2 != r1) goto L1c
            return r1
        L1c:
            if (r2 != 0) goto L20
            r2 = 2
            return r2
        L20:
            return r0
    }
}

package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.net.wifi.WifiInfo r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.getBSSID()
            return r0
    }

    public static java.lang.String b(android.net.wifi.WifiInfo r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.getSSID()
            return r0
    }

    public static int c(android.net.wifi.WifiInfo r0) {
            if (r0 != 0) goto L4
            r0 = -1
            return r0
        L4:
            int r0 = r0.getRssi()
            return r0
    }
}

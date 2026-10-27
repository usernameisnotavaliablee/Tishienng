package com.baidu.idl.main.facesdk.statistic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NetWorkUtil {
    public NetWorkUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Integer getNetworkState(android.content.Context r7) {
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r7 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r7.getSystemService(r2)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L8a
            boolean r3 = r2.isConnected()
            if (r3 != 0) goto L1e
            goto L8a
        L1e:
            int r1 = r2.getType()
            r3 = 1
            if (r1 != r3) goto L27
            r0 = 1
            goto L85
        L27:
            r4 = 9
            r5 = 5
            if (r1 != 0) goto L82
            int r1 = r2.getSubtype()
            java.lang.String r2 = "phone"
            java.lang.Object r7 = r7.getSystemService(r2)
            android.telephony.TelephonyManager r7 = (android.telephony.TelephonyManager) r7
            r2 = 13
            r6 = 4
            if (r1 != r2) goto L45
            boolean r2 = r7.isNetworkRoaming()
            if (r2 != 0) goto L45
            r0 = 4
            goto L85
        L45:
            r2 = 3
            if (r1 == r2) goto L80
            if (r1 == r5) goto L80
            r5 = 6
            if (r1 == r5) goto L80
            r5 = 8
            if (r1 == r5) goto L80
            if (r1 == r4) goto L80
            r4 = 10
            if (r1 == r4) goto L80
            r4 = 12
            if (r1 == r4) goto L80
            r4 = 14
            if (r1 == r4) goto L80
            r4 = 15
            if (r1 != r4) goto L6a
            boolean r4 = r7.isNetworkRoaming()
            if (r4 != 0) goto L6a
            goto L80
        L6a:
            r2 = 2
            if (r1 == r3) goto L7e
            if (r1 == r2) goto L7e
            if (r1 == r6) goto L7e
            r3 = 7
            if (r1 == r3) goto L7e
            r3 = 11
            if (r1 != r3) goto L85
            boolean r7 = r7.isNetworkRoaming()
            if (r7 != 0) goto L85
        L7e:
            r0 = 2
            goto L85
        L80:
            r0 = 3
            goto L85
        L82:
            if (r1 != r4) goto L85
            r0 = 5
        L85:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
        L8a:
            return r1
    }
}

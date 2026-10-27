package com.umeng.commonsdk.debug;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMLogUtils {
    public UMLogUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String makeUrl(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://developer.umeng.com/docs/66632/detail/"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "?um_channel=sdk"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

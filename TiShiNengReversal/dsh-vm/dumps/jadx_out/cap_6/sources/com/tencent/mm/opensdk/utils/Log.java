package com.tencent.mm.opensdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Log {
    private static com.tencent.mm.opensdk.utils.ILog logImpl;

    public Log() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r1, java.lang.String r2) {
            com.tencent.mm.opensdk.utils.ILog r0 = com.tencent.mm.opensdk.utils.Log.logImpl
            if (r0 != 0) goto L5
            return
        L5:
            r0.d(r1, r2)
            return
    }

    public static void e(java.lang.String r1, java.lang.String r2) {
            com.tencent.mm.opensdk.utils.ILog r0 = com.tencent.mm.opensdk.utils.Log.logImpl
            if (r0 != 0) goto L5
            return
        L5:
            r0.e(r1, r2)
            return
    }

    public static void i(java.lang.String r1, java.lang.String r2) {
            com.tencent.mm.opensdk.utils.ILog r0 = com.tencent.mm.opensdk.utils.Log.logImpl
            if (r0 != 0) goto L5
            return
        L5:
            r0.i(r1, r2)
            return
    }

    public static void setLogImpl(com.tencent.mm.opensdk.utils.ILog r0) {
            com.tencent.mm.opensdk.utils.Log.logImpl = r0
            return
    }

    public static void v(java.lang.String r1, java.lang.String r2) {
            com.tencent.mm.opensdk.utils.ILog r0 = com.tencent.mm.opensdk.utils.Log.logImpl
            if (r0 != 0) goto L5
            return
        L5:
            r0.v(r1, r2)
            return
    }

    public static void w(java.lang.String r1, java.lang.String r2) {
            com.tencent.mm.opensdk.utils.ILog r0 = com.tencent.mm.opensdk.utils.Log.logImpl
            if (r0 != 0) goto L5
            return
        L5:
            r0.w(r1, r2)
            return
    }
}

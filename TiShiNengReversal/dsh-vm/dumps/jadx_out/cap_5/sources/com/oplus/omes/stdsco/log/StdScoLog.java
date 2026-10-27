package com.oplus.omes.stdsco.log;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class StdScoLog {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = Integer.MAX_VALUE;
    public static final int h = Integer.MIN_VALUE;

    public StdScoLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void a(int r2, java.lang.String r3) {
            java.lang.Class<com.oplus.omes.stdsco.log.StdScoLog> r0 = com.oplus.omes.stdsco.log.StdScoLog.class
            monitor-enter(r0)
            if (r3 == 0) goto L10
            java.lang.String r1 = ""
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L12
            goto L10
        Le:
            r2 = move-exception
            goto L17
        L10:
            java.lang.String r3 = "[\\s\\S]*"
        L12:
            nativeLogInit(r2, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    private static native void nativeLogInit(int r0, java.lang.String r1);
}

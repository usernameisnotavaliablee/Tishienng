package com.umeng.socialize.tracker.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static final int a = 1;
    private static java.util.concurrent.ExecutorService b;

    static {
            r0 = 1
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            com.umeng.socialize.tracker.utils.c.b = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.Runnable r1) {
            if (r1 == 0) goto L7
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.tracker.utils.c.b
            r0.execute(r1)
        L7:
            return
    }
}

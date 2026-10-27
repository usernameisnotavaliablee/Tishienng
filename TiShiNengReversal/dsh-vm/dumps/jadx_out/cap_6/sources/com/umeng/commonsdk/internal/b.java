package com.umeng.commonsdk.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static com.umeng.commonsdk.internal.b b;
    private android.content.Context a;
    private com.umeng.commonsdk.internal.c c;

    private b(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            com.umeng.commonsdk.internal.c r0 = new com.umeng.commonsdk.internal.c
            r0.<init>(r2)
            r1.c = r0
            return
    }

    public static synchronized com.umeng.commonsdk.internal.b a(android.content.Context r2) {
            java.lang.Class<com.umeng.commonsdk.internal.b> r0 = com.umeng.commonsdk.internal.b.class
            monitor-enter(r0)
            com.umeng.commonsdk.internal.b r1 = com.umeng.commonsdk.internal.b.b     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.umeng.commonsdk.internal.b r1 = new com.umeng.commonsdk.internal.b     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.umeng.commonsdk.internal.b.b = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1d
        L19:
            com.umeng.commonsdk.internal.b r2 = com.umeng.commonsdk.internal.b.b     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public com.umeng.commonsdk.internal.c a() {
            r1 = this;
            com.umeng.commonsdk.internal.c r0 = r1.c
            return r0
    }
}

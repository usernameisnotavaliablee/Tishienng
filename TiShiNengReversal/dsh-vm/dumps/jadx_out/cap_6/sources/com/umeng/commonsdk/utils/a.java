package com.umeng.commonsdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class a {
    private static final int e = 1;
    private final long a;
    private final long b;
    private long c;
    private boolean d;
    private android.os.HandlerThread f;
    private android.os.Handler g;
    private android.os.Handler.Callback h;


    public a(long r2, long r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            com.umeng.commonsdk.utils.a$1 r0 = new com.umeng.commonsdk.utils.a$1
            r0.<init>(r1)
            r1.h = r0
            r1.a = r2
            r1.b = r4
            boolean r2 = r1.d()
            if (r2 != 0) goto L33
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r3 = "CountDownTimerThread"
            r2.<init>(r3)
            r1.f = r2
            r2.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.HandlerThread r3 = r1.f
            android.os.Looper r3 = r3.getLooper()
            android.os.Handler$Callback r4 = r1.h
            r2.<init>(r3, r4)
            r1.g = r2
            return
        L33:
            android.os.Handler r2 = new android.os.Handler
            android.os.Handler$Callback r3 = r1.h
            r2.<init>(r3)
            r1.g = r2
            return
    }

    static /* synthetic */ boolean a(com.umeng.commonsdk.utils.a r0) {
            boolean r0 = r0.d
            return r0
    }

    static /* synthetic */ long b(com.umeng.commonsdk.utils.a r2) {
            long r0 = r2.c
            return r0
    }

    static /* synthetic */ android.os.HandlerThread c(com.umeng.commonsdk.utils.a r0) {
            android.os.HandlerThread r0 = r0.f
            return r0
    }

    static /* synthetic */ long d(com.umeng.commonsdk.utils.a r2) {
            long r0 = r2.b
            return r0
    }

    private boolean d() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            boolean r0 = r0.equals(r1)
            return r0
    }

    static /* synthetic */ android.os.Handler e(com.umeng.commonsdk.utils.a r0) {
            android.os.Handler r0 = r0.g
            return r0
    }

    public final synchronized void a() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.d = r0     // Catch: java.lang.Throwable -> Lb
            android.os.Handler r1 = r2.g     // Catch: java.lang.Throwable -> Lb
            r1.removeMessages(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public abstract void a(long r1);

    public final synchronized com.umeng.commonsdk.utils.a b() {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.d = r0     // Catch: java.lang.Throwable -> L11
            long r0 = r5.a     // Catch: java.lang.Throwable -> L11
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L13
            r5.c()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return r5
        L11:
            r0 = move-exception
            goto L28
        L13:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L11
            long r2 = r5.a     // Catch: java.lang.Throwable -> L11
            long r0 = r0 + r2
            r5.c = r0     // Catch: java.lang.Throwable -> L11
            android.os.Handler r0 = r5.g     // Catch: java.lang.Throwable -> L11
            r1 = 1
            android.os.Message r1 = r0.obtainMessage(r1)     // Catch: java.lang.Throwable -> L11
            r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return r5
        L28:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    public abstract void c();
}

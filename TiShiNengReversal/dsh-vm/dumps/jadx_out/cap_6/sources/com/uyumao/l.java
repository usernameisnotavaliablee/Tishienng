package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class l {
    public static com.uyumao.l a;
    public java.util.concurrent.ExecutorService b;

    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.uyumao.l a() {
            com.uyumao.l r0 = com.uyumao.l.a
            if (r0 != 0) goto L19
            java.lang.Class<com.uyumao.l> r0 = com.uyumao.l.class
            monitor-enter(r0)
            com.uyumao.l r1 = com.uyumao.l.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.uyumao.l r1 = new com.uyumao.l     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.uyumao.l.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.uyumao.l r0 = com.uyumao.l.a
            return r0
    }

    public java.util.concurrent.ExecutorService b() {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.b
            if (r0 != 0) goto L18
            java.lang.Class<com.uyumao.l> r0 = com.uyumao.l.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = r2.b     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Throwable -> L12
            r2.b = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L18:
            java.util.concurrent.ExecutorService r0 = r2.b
            return r0
    }
}

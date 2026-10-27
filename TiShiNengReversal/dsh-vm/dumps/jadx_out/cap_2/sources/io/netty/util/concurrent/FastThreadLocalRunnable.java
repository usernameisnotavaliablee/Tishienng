package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class FastThreadLocalRunnable implements java.lang.Runnable {
    private final java.lang.Runnable runnable;

    private FastThreadLocalRunnable(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "runnable"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.runnable = r2
            return
    }

    static java.lang.Runnable wrap(java.lang.Runnable r1) {
            boolean r0 = r1 instanceof io.netty.util.concurrent.FastThreadLocalRunnable
            if (r0 == 0) goto L5
            return r1
        L5:
            io.netty.util.concurrent.FastThreadLocalRunnable r0 = new io.netty.util.concurrent.FastThreadLocalRunnable
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            java.lang.Runnable r0 = r1.runnable     // Catch: java.lang.Throwable -> L9
            r0.run()     // Catch: java.lang.Throwable -> L9
            io.netty.util.concurrent.FastThreadLocal.removeAll()
            return
        L9:
            r0 = move-exception
            io.netty.util.concurrent.FastThreadLocal.removeAll()
            throw r0
    }
}

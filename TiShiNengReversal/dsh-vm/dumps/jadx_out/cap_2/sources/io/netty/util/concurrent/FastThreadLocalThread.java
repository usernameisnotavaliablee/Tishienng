package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FastThreadLocalThread extends java.lang.Thread {
    private final boolean cleanupFastThreadLocals;
    private io.netty.util.internal.InternalThreadLocalMap threadLocalMap;

    public FastThreadLocalThread() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cleanupFastThreadLocals = r0
            return
    }

    public FastThreadLocalThread(java.lang.Runnable r1) {
            r0 = this;
            java.lang.Runnable r1 = io.netty.util.concurrent.FastThreadLocalRunnable.wrap(r1)
            r0.<init>(r1)
            r1 = 1
            r0.cleanupFastThreadLocals = r1
            return
    }

    public FastThreadLocalThread(java.lang.Runnable r1, java.lang.String r2) {
            r0 = this;
            java.lang.Runnable r1 = io.netty.util.concurrent.FastThreadLocalRunnable.wrap(r1)
            r0.<init>(r1, r2)
            r1 = 1
            r0.cleanupFastThreadLocals = r1
            return
    }

    public FastThreadLocalThread(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.cleanupFastThreadLocals = r1
            return
    }

    public FastThreadLocalThread(java.lang.ThreadGroup r1, java.lang.Runnable r2) {
            r0 = this;
            java.lang.Runnable r2 = io.netty.util.concurrent.FastThreadLocalRunnable.wrap(r2)
            r0.<init>(r1, r2)
            r1 = 1
            r0.cleanupFastThreadLocals = r1
            return
    }

    public FastThreadLocalThread(java.lang.ThreadGroup r1, java.lang.Runnable r2, java.lang.String r3) {
            r0 = this;
            java.lang.Runnable r2 = io.netty.util.concurrent.FastThreadLocalRunnable.wrap(r2)
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.cleanupFastThreadLocals = r1
            return
    }

    public FastThreadLocalThread(java.lang.ThreadGroup r7, java.lang.Runnable r8, java.lang.String r9, long r10) {
            r6 = this;
            java.lang.Runnable r2 = io.netty.util.concurrent.FastThreadLocalRunnable.wrap(r8)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            r7 = 1
            r0.cleanupFastThreadLocals = r7
            return
    }

    public FastThreadLocalThread(java.lang.ThreadGroup r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.cleanupFastThreadLocals = r1
            return
    }

    public static boolean willCleanupFastThreadLocals(java.lang.Thread r1) {
            boolean r0 = r1 instanceof io.netty.util.concurrent.FastThreadLocalThread
            if (r0 == 0) goto Le
            io.netty.util.concurrent.FastThreadLocalThread r1 = (io.netty.util.concurrent.FastThreadLocalThread) r1
            boolean r1 = r1.willCleanupFastThreadLocals()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final void setThreadLocalMap(io.netty.util.internal.InternalThreadLocalMap r1) {
            r0 = this;
            r0.threadLocalMap = r1
            return
    }

    public final io.netty.util.internal.InternalThreadLocalMap threadLocalMap() {
            r1 = this;
            io.netty.util.internal.InternalThreadLocalMap r0 = r1.threadLocalMap
            return r0
    }

    public boolean willCleanupFastThreadLocals() {
            r1 = this;
            boolean r0 = r1.cleanupFastThreadLocals
            return r0
    }
}

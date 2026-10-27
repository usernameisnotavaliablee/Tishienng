package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
    private final java.util.concurrent.ThreadFactory threadFactory;

    public ThreadPerTaskExecutor(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.threadFactory = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "threadFactory"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = r1.threadFactory
            java.lang.Thread r2 = r0.newThread(r2)
            r2.start()
            return
    }
}

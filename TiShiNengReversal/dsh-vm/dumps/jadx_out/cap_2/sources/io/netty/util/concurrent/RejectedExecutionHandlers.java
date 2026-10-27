package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class RejectedExecutionHandlers {
    private static final io.netty.util.concurrent.RejectedExecutionHandler REJECT = null;



    static {
            io.netty.util.concurrent.RejectedExecutionHandlers$1 r0 = new io.netty.util.concurrent.RejectedExecutionHandlers$1
            r0.<init>()
            io.netty.util.concurrent.RejectedExecutionHandlers.REJECT = r0
            return
    }

    private RejectedExecutionHandlers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.util.concurrent.RejectedExecutionHandler backoff(int r1, long r2, java.util.concurrent.TimeUnit r4) {
            java.lang.String r0 = "retries"
            io.netty.util.internal.ObjectUtil.checkPositive(r1, r0)
            long r2 = r4.toNanos(r2)
            io.netty.util.concurrent.RejectedExecutionHandlers$2 r4 = new io.netty.util.concurrent.RejectedExecutionHandlers$2
            r4.<init>(r1, r2)
            return r4
    }

    public static io.netty.util.concurrent.RejectedExecutionHandler reject() {
            io.netty.util.concurrent.RejectedExecutionHandler r0 = io.netty.util.concurrent.RejectedExecutionHandlers.REJECT
            return r0
    }
}

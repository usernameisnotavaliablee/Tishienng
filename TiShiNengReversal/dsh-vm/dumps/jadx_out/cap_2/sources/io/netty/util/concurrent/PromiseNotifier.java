package io.netty.util.concurrent;

import io.netty.util.concurrent.Future;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class PromiseNotifier<V, F extends io.netty.util.concurrent.Future<V>> implements io.netty.util.concurrent.GenericFutureListener<F> {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean logNotifyFailure;
    private final io.netty.util.concurrent.Promise<? super V>[] promises;

    static {
            java.lang.Class<io.netty.util.concurrent.PromiseNotifier> r0 = io.netty.util.concurrent.PromiseNotifier.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.PromiseNotifier.logger = r0
            return
    }

    @java.lang.SafeVarargs
    public PromiseNotifier(boolean r4, io.netty.util.concurrent.Promise<? super V>... r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "promises"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            int r0 = r5.length
            r1 = 0
        La:
            if (r1 >= r0) goto L1b
            r2 = r5[r1]
            if (r2 == 0) goto L13
            int r1 = r1 + 1
            goto La
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "promises contains null Promise"
            r4.<init>(r5)
            throw r4
        L1b:
            java.lang.Object r5 = r5.clone()
            io.netty.util.concurrent.Promise[] r5 = (io.netty.util.concurrent.Promise[]) r5
            r3.promises = r5
            r3.logNotifyFailure = r4
            return
    }

    @java.lang.SafeVarargs
    public PromiseNotifier(io.netty.util.concurrent.Promise<? super V>... r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.util.concurrent.GenericFutureListener
    public void operationComplete(F r6) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r5.logNotifyFailure
            if (r0 == 0) goto L7
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.concurrent.PromiseNotifier.logger
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r1 = r6.isSuccess()
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.Object r6 = r6.get()
            io.netty.util.concurrent.Promise<? super V>[] r1 = r5.promises
            int r3 = r1.length
        L16:
            if (r2 >= r3) goto L44
            r4 = r1[r2]
            io.netty.util.internal.PromiseNotificationUtil.trySuccess(r4, r6, r0)
            int r2 = r2 + 1
            goto L16
        L20:
            boolean r1 = r6.isCancelled()
            if (r1 == 0) goto L33
            io.netty.util.concurrent.Promise<? super V>[] r6 = r5.promises
            int r1 = r6.length
        L29:
            if (r2 >= r1) goto L44
            r3 = r6[r2]
            io.netty.util.internal.PromiseNotificationUtil.tryCancel(r3, r0)
            int r2 = r2 + 1
            goto L29
        L33:
            java.lang.Throwable r6 = r6.cause()
            io.netty.util.concurrent.Promise<? super V>[] r1 = r5.promises
            int r3 = r1.length
        L3a:
            if (r2 >= r3) goto L44
            r4 = r1[r2]
            io.netty.util.internal.PromiseNotificationUtil.tryFailure(r4, r6, r0)
            int r2 = r2 + 1
            goto L3a
        L44:
            return
    }
}

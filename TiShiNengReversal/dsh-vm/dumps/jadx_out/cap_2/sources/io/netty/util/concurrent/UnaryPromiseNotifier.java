package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class UnaryPromiseNotifier<T> implements io.netty.util.concurrent.FutureListener<T> {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.util.concurrent.Promise<? super T> promise;

    static {
            java.lang.Class<io.netty.util.concurrent.UnaryPromiseNotifier> r0 = io.netty.util.concurrent.UnaryPromiseNotifier.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.UnaryPromiseNotifier.logger = r0
            return
    }

    public UnaryPromiseNotifier(io.netty.util.concurrent.Promise<? super T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "promise"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.Promise r2 = (io.netty.util.concurrent.Promise) r2
            r1.promise = r2
            return
    }

    public static <X> void cascadeTo(io.netty.util.concurrent.Future<X> r2, io.netty.util.concurrent.Promise<? super X> r3) {
            boolean r0 = r2.isSuccess()
            if (r0 == 0) goto L18
            java.lang.Object r2 = r2.getNow()
            boolean r2 = r3.trySuccess(r2)
            if (r2 != 0) goto L42
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.concurrent.UnaryPromiseNotifier.logger
            java.lang.String r0 = "Failed to mark a promise as success because it is done already: {}"
            r2.warn(r0, r3)
            return
        L18:
            boolean r0 = r2.isCancelled()
            if (r0 == 0) goto L2d
            r2 = 0
            boolean r2 = r3.cancel(r2)
            if (r2 != 0) goto L42
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.concurrent.UnaryPromiseNotifier.logger
            java.lang.String r0 = "Failed to cancel a promise because it is done already: {}"
            r2.warn(r0, r3)
            return
        L2d:
            java.lang.Throwable r0 = r2.cause()
            boolean r0 = r3.tryFailure(r0)
            if (r0 != 0) goto L42
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.concurrent.UnaryPromiseNotifier.logger
            java.lang.String r1 = "Failed to mark a promise as failure because it's done already: {}"
            java.lang.Throwable r2 = r2.cause()
            r0.warn(r1, r3, r2)
        L42:
            return
    }

    @Override // io.netty.util.concurrent.GenericFutureListener
    public void operationComplete(io.netty.util.concurrent.Future<T> r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.concurrent.Promise<? super T> r0 = r1.promise
            cascadeTo(r2, r0)
            return
    }
}

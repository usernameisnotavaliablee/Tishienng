package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FailedFuture<V> extends io.netty.util.concurrent.CompleteFuture<V> {
    private final java.lang.Throwable cause;

    public FailedFuture(io.netty.util.concurrent.EventExecutor r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.cause = r2
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "cause"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.util.concurrent.Future
    public java.lang.Throwable cause() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public V getNow() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isSuccess() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> sync() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return r1
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> syncUninterruptibly() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return r1
    }
}

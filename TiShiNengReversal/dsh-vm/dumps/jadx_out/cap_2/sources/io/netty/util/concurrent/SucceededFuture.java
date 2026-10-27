package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SucceededFuture<V> extends io.netty.util.concurrent.CompleteFuture<V> {
    private final V result;

    public SucceededFuture(io.netty.util.concurrent.EventExecutor r1, V r2) {
            r0 = this;
            r0.<init>(r1)
            r0.result = r2
            return
    }

    @Override // io.netty.util.concurrent.Future
    public java.lang.Throwable cause() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public V getNow() {
            r1 = this;
            V r0 = r1.result
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isSuccess() {
            r1 = this;
            r0 = 1
            return r0
    }
}

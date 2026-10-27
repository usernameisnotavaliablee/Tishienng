package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface EventExecutor extends io.netty.util.concurrent.EventExecutorGroup {
    boolean inEventLoop();

    boolean inEventLoop(java.lang.Thread r1);

    <V> io.netty.util.concurrent.Future<V> newFailedFuture(java.lang.Throwable r1);

    <V> io.netty.util.concurrent.ProgressivePromise<V> newProgressivePromise();

    <V> io.netty.util.concurrent.Promise<V> newPromise();

    <V> io.netty.util.concurrent.Future<V> newSucceededFuture(V r1);

    @Override // io.netty.util.concurrent.EventExecutorGroup
    io.netty.util.concurrent.EventExecutor next();

    io.netty.util.concurrent.EventExecutorGroup parent();
}

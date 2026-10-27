package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface ProgressiveFuture<V> extends io.netty.util.concurrent.Future<V> {
    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1);

    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1);

    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> await() throws java.lang.InterruptedException;

    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> awaitUninterruptibly();

    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1);

    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1);

    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> sync() throws java.lang.InterruptedException;

    @Override // io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressiveFuture<V> syncUninterruptibly();
}

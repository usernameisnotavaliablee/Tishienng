package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface ProgressivePromise<V> extends io.netty.util.concurrent.Promise<V>, io.netty.util.concurrent.ProgressiveFuture<V> {
    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> await() throws java.lang.InterruptedException;

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> awaitUninterruptibly();

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1);

    io.netty.util.concurrent.ProgressivePromise<V> setFailure(java.lang.Throwable r1);

    io.netty.util.concurrent.ProgressivePromise<V> setProgress(long r1, long r3);

    io.netty.util.concurrent.ProgressivePromise<V> setSuccess(V r1);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> sync() throws java.lang.InterruptedException;

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    io.netty.util.concurrent.ProgressivePromise<V> syncUninterruptibly();

    boolean tryProgress(long r1, long r3);
}

package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Future<V> extends java.util.concurrent.Future<V> {
    io.netty.util.concurrent.Future<V> addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1);

    io.netty.util.concurrent.Future<V> addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1);

    io.netty.util.concurrent.Future<V> await() throws java.lang.InterruptedException;

    boolean await(long r1) throws java.lang.InterruptedException;

    boolean await(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException;

    io.netty.util.concurrent.Future<V> awaitUninterruptibly();

    boolean awaitUninterruptibly(long r1);

    boolean awaitUninterruptibly(long r1, java.util.concurrent.TimeUnit r3);

    @Override // java.util.concurrent.Future
    boolean cancel(boolean r1);

    java.lang.Throwable cause();

    V getNow();

    boolean isCancellable();

    boolean isSuccess();

    io.netty.util.concurrent.Future<V> removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1);

    io.netty.util.concurrent.Future<V> removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1);

    io.netty.util.concurrent.Future<V> sync() throws java.lang.InterruptedException;

    io.netty.util.concurrent.Future<V> syncUninterruptibly();
}

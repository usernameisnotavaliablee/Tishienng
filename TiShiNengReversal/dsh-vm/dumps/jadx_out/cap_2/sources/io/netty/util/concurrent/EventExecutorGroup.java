package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface EventExecutorGroup extends java.util.concurrent.ScheduledExecutorService, java.lang.Iterable<io.netty.util.concurrent.EventExecutor> {
    boolean isShuttingDown();

    java.util.Iterator<io.netty.util.concurrent.EventExecutor> iterator();

    io.netty.util.concurrent.EventExecutor next();

    @Override // java.util.concurrent.ScheduledExecutorService
    io.netty.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r1, long r2, java.util.concurrent.TimeUnit r4);

    @Override // java.util.concurrent.ScheduledExecutorService
    io.netty.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);

    @Override // java.util.concurrent.ScheduledExecutorService
    io.netty.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6);

    @java.lang.Deprecated
    void shutdown();

    io.netty.util.concurrent.Future<?> shutdownGracefully();

    io.netty.util.concurrent.Future<?> shutdownGracefully(long r1, long r3, java.util.concurrent.TimeUnit r5);

    @java.lang.Deprecated
    java.util.List<java.lang.Runnable> shutdownNow();

    io.netty.util.concurrent.Future<?> submit(java.lang.Runnable r1);

    <T> io.netty.util.concurrent.Future<T> submit(java.lang.Runnable r1, T r2);

    <T> io.netty.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r1);

    io.netty.util.concurrent.Future<?> terminationFuture();
}

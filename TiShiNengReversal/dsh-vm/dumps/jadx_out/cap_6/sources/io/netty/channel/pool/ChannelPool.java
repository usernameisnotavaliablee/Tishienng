package io.netty.channel.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelPool extends java.io.Closeable {
    io.netty.util.concurrent.Future<io.netty.channel.Channel> acquire();

    io.netty.util.concurrent.Future<io.netty.channel.Channel> acquire(io.netty.util.concurrent.Promise<io.netty.channel.Channel> r1);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    io.netty.util.concurrent.Future<java.lang.Void> release(io.netty.channel.Channel r1);

    io.netty.util.concurrent.Future<java.lang.Void> release(io.netty.channel.Channel r1, io.netty.util.concurrent.Promise<java.lang.Void> r2);
}

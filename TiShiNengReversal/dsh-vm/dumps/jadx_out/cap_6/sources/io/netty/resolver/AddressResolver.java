package io.netty.resolver;

import java.net.SocketAddress;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface AddressResolver<T extends java.net.SocketAddress> extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean isResolved(java.net.SocketAddress r1);

    boolean isSupported(java.net.SocketAddress r1);

    io.netty.util.concurrent.Future<T> resolve(java.net.SocketAddress r1);

    io.netty.util.concurrent.Future<T> resolve(java.net.SocketAddress r1, io.netty.util.concurrent.Promise<T> r2);

    io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.net.SocketAddress r1);

    io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.net.SocketAddress r1, io.netty.util.concurrent.Promise<java.util.List<T>> r2);
}

package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class InetNameResolver extends io.netty.resolver.SimpleNameResolver<java.net.InetAddress> {
    private volatile io.netty.resolver.AddressResolver<java.net.InetSocketAddress> addressResolver;

    protected InetNameResolver(io.netty.util.concurrent.EventExecutor r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public io.netty.resolver.AddressResolver<java.net.InetSocketAddress> asAddressResolver() {
            r2 = this;
            io.netty.resolver.AddressResolver<java.net.InetSocketAddress> r0 = r2.addressResolver
            if (r0 != 0) goto L1b
            monitor-enter(r2)
            io.netty.resolver.AddressResolver<java.net.InetSocketAddress> r0 = r2.addressResolver     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            io.netty.resolver.InetSocketAddressResolver r0 = new io.netty.resolver.InetSocketAddressResolver     // Catch: java.lang.Throwable -> L15
            io.netty.util.concurrent.EventExecutor r1 = r2.executor()     // Catch: java.lang.Throwable -> L15
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L15
            r2.addressResolver = r0     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L19
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
        L1b:
            return r0
    }
}

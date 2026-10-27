package io.netty.resolver;

import java.net.SocketAddress;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractAddressResolver<T extends java.net.SocketAddress> implements io.netty.resolver.AddressResolver<T> {
    private final io.netty.util.concurrent.EventExecutor executor;
    private final io.netty.util.internal.TypeParameterMatcher matcher;

    protected AbstractAddressResolver(io.netty.util.concurrent.EventExecutor r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "executor"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.EventExecutor r2 = (io.netty.util.concurrent.EventExecutor) r2
            r1.executor = r2
            java.lang.Class<io.netty.resolver.AbstractAddressResolver> r2 = io.netty.resolver.AbstractAddressResolver.class
            java.lang.String r0 = "T"
            io.netty.util.internal.TypeParameterMatcher r2 = io.netty.util.internal.TypeParameterMatcher.find(r1, r2, r0)
            r1.matcher = r2
            return
    }

    protected AbstractAddressResolver(io.netty.util.concurrent.EventExecutor r2, java.lang.Class<? extends T> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "executor"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.EventExecutor r2 = (io.netty.util.concurrent.EventExecutor) r2
            r1.executor = r2
            io.netty.util.internal.TypeParameterMatcher r2 = io.netty.util.internal.TypeParameterMatcher.get(r3)
            r1.matcher = r2
            return
    }

    @Override // io.netty.resolver.AddressResolver, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    protected abstract boolean doIsResolved(T r1);

    protected abstract void doResolve(T r1, io.netty.util.concurrent.Promise<T> r2) throws java.lang.Exception;

    protected abstract void doResolveAll(T r1, io.netty.util.concurrent.Promise<java.util.List<T>> r2) throws java.lang.Exception;

    protected io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            return r0
    }

    @Override // io.netty.resolver.AddressResolver
    public final boolean isResolved(java.net.SocketAddress r2) {
            r1 = this;
            boolean r0 = r1.isSupported(r2)
            if (r0 == 0) goto Lb
            boolean r2 = r1.doIsResolved(r2)
            return r2
        Lb:
            java.nio.channels.UnsupportedAddressTypeException r2 = new java.nio.channels.UnsupportedAddressTypeException
            r2.<init>()
            throw r2
    }

    @Override // io.netty.resolver.AddressResolver
    public boolean isSupported(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.matcher
            boolean r2 = r0.match(r2)
            return r2
    }

    @Override // io.netty.resolver.AddressResolver
    public final io.netty.util.concurrent.Future<T> resolve(java.net.SocketAddress r2) {
            r1 = this;
            java.lang.String r0 = "address"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.net.SocketAddress r0 = (java.net.SocketAddress) r0
            boolean r0 = r1.isSupported(r0)
            if (r0 != 0) goto L1c
            io.netty.util.concurrent.EventExecutor r2 = r1.executor()
            java.nio.channels.UnsupportedAddressTypeException r0 = new java.nio.channels.UnsupportedAddressTypeException
            r0.<init>()
            io.netty.util.concurrent.Future r2 = r2.newFailedFuture(r0)
            return r2
        L1c:
            boolean r0 = r1.isResolved(r2)
            if (r0 == 0) goto L29
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            io.netty.util.concurrent.Future r2 = r0.newSucceededFuture(r2)
            return r2
        L29:
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()     // Catch: java.lang.Exception -> L35
            io.netty.util.concurrent.Promise r0 = r0.newPromise()     // Catch: java.lang.Exception -> L35
            r1.doResolve(r2, r0)     // Catch: java.lang.Exception -> L35
            return r0
        L35:
            r2 = move-exception
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()
            io.netty.util.concurrent.Future r2 = r0.newFailedFuture(r2)
            return r2
    }

    @Override // io.netty.resolver.AddressResolver
    public final io.netty.util.concurrent.Future<T> resolve(java.net.SocketAddress r2, io.netty.util.concurrent.Promise<T> r3) {
            r1 = this;
            java.lang.String r0 = "address"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            boolean r0 = r1.isSupported(r2)
            if (r0 != 0) goto L1a
            java.nio.channels.UnsupportedAddressTypeException r2 = new java.nio.channels.UnsupportedAddressTypeException
            r2.<init>()
            io.netty.util.concurrent.Promise r2 = r3.setFailure(r2)
            return r2
        L1a:
            boolean r0 = r1.isResolved(r2)
            if (r0 == 0) goto L25
            io.netty.util.concurrent.Promise r2 = r3.setSuccess(r2)
            return r2
        L25:
            r1.doResolve(r2, r3)     // Catch: java.lang.Exception -> L29
            return r3
        L29:
            r2 = move-exception
            io.netty.util.concurrent.Promise r2 = r3.setFailure(r2)
            return r2
    }

    @Override // io.netty.resolver.AddressResolver
    public final io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.net.SocketAddress r2) {
            r1 = this;
            java.lang.String r0 = "address"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.net.SocketAddress r0 = (java.net.SocketAddress) r0
            boolean r0 = r1.isSupported(r0)
            if (r0 != 0) goto L1c
            io.netty.util.concurrent.EventExecutor r2 = r1.executor()
            java.nio.channels.UnsupportedAddressTypeException r0 = new java.nio.channels.UnsupportedAddressTypeException
            r0.<init>()
            io.netty.util.concurrent.Future r2 = r2.newFailedFuture(r0)
            return r2
        L1c:
            boolean r0 = r1.isResolved(r2)
            if (r0 == 0) goto L2d
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            java.util.List r2 = java.util.Collections.singletonList(r2)
            io.netty.util.concurrent.Future r2 = r0.newSucceededFuture(r2)
            return r2
        L2d:
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()     // Catch: java.lang.Exception -> L39
            io.netty.util.concurrent.Promise r0 = r0.newPromise()     // Catch: java.lang.Exception -> L39
            r1.doResolveAll(r2, r0)     // Catch: java.lang.Exception -> L39
            return r0
        L39:
            r2 = move-exception
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()
            io.netty.util.concurrent.Future r2 = r0.newFailedFuture(r2)
            return r2
    }

    @Override // io.netty.resolver.AddressResolver
    public final io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.net.SocketAddress r2, io.netty.util.concurrent.Promise<java.util.List<T>> r3) {
            r1 = this;
            java.lang.String r0 = "address"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            boolean r0 = r1.isSupported(r2)
            if (r0 != 0) goto L1a
            java.nio.channels.UnsupportedAddressTypeException r2 = new java.nio.channels.UnsupportedAddressTypeException
            r2.<init>()
            io.netty.util.concurrent.Promise r2 = r3.setFailure(r2)
            return r2
        L1a:
            boolean r0 = r1.isResolved(r2)
            if (r0 == 0) goto L29
            java.util.List r2 = java.util.Collections.singletonList(r2)
            io.netty.util.concurrent.Promise r2 = r3.setSuccess(r2)
            return r2
        L29:
            r1.doResolveAll(r2, r3)     // Catch: java.lang.Exception -> L2d
            return r3
        L2d:
            r2 = move-exception
            io.netty.util.concurrent.Promise r2 = r3.setFailure(r2)
            return r2
    }
}

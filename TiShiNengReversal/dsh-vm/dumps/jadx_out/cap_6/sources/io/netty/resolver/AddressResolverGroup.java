package io.netty.resolver;

import java.net.SocketAddress;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AddressResolverGroup<T extends java.net.SocketAddress> implements java.io.Closeable {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T>> resolvers;


    static {
            java.lang.Class<io.netty.resolver.AddressResolverGroup> r0 = io.netty.resolver.AddressResolverGroup.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.AddressResolverGroup.logger = r0
            return
    }

    protected AddressResolverGroup() {
            r1 = this;
            r1.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.resolvers = r0
            return
    }

    static /* synthetic */ java.util.Map access$000(io.netty.resolver.AddressResolverGroup r0) {
            java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T extends java.net.SocketAddress>> r0 = r0.resolvers
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r6 = this;
            java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T extends java.net.SocketAddress>> r0 = r6.resolvers
            monitor-enter(r0)
            java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T extends java.net.SocketAddress>> r1 = r6.resolvers     // Catch: java.lang.Throwable -> L2f
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            io.netty.resolver.AddressResolver[] r3 = new io.netty.resolver.AddressResolver[r2]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch: java.lang.Throwable -> L2f
            io.netty.resolver.AddressResolver[] r1 = (io.netty.resolver.AddressResolver[]) r1     // Catch: java.lang.Throwable -> L2f
            io.netty.resolver.AddressResolver[] r1 = (io.netty.resolver.AddressResolver[]) r1     // Catch: java.lang.Throwable -> L2f
            java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T extends java.net.SocketAddress>> r3 = r6.resolvers     // Catch: java.lang.Throwable -> L2f
            r3.clear()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            int r0 = r1.length
        L1b:
            if (r2 >= r0) goto L2e
            r3 = r1[r2]
            r3.close()     // Catch: java.lang.Throwable -> L23
            goto L2b
        L23:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.resolver.AddressResolverGroup.logger
            java.lang.String r5 = "Failed to close a resolver:"
            r4.warn(r5, r3)
        L2b:
            int r2 = r2 + 1
            goto L1b
        L2e:
            return
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    public io.netty.resolver.AddressResolver<T> getResolver(io.netty.util.concurrent.EventExecutor r5) {
            r4 = this;
            if (r5 == 0) goto L42
            boolean r0 = r5.isShuttingDown()
            if (r0 != 0) goto L3a
            java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T extends java.net.SocketAddress>> r0 = r4.resolvers
            monitor-enter(r0)
            java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T extends java.net.SocketAddress>> r1 = r4.resolvers     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L2b
            io.netty.resolver.AddressResolver r1 = (io.netty.resolver.AddressResolver) r1     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L36
            io.netty.resolver.AddressResolver r1 = r4.newResolver(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.util.Map<io.netty.util.concurrent.EventExecutor, io.netty.resolver.AddressResolver<T extends java.net.SocketAddress>> r2 = r4.resolvers     // Catch: java.lang.Throwable -> L2b
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L2b
            io.netty.util.concurrent.Future r2 = r5.terminationFuture()     // Catch: java.lang.Throwable -> L2b
            io.netty.resolver.AddressResolverGroup$1 r3 = new io.netty.resolver.AddressResolverGroup$1     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L2b
            r2.addListener(r3)     // Catch: java.lang.Throwable -> L2b
            goto L36
        L2b:
            r5 = move-exception
            goto L38
        L2d:
            r5 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "failed to create a new resolver"
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2b
            throw r1     // Catch: java.lang.Throwable -> L2b
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "executor not accepting a task"
            r5.<init>(r0)
            throw r5
        L42:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "executor"
            r5.<init>(r0)
            throw r5
    }

    protected abstract io.netty.resolver.AddressResolver<T> newResolver(io.netty.util.concurrent.EventExecutor r1) throws java.lang.Exception;
}

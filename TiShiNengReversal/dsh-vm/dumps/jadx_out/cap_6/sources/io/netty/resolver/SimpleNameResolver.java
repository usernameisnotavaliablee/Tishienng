package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SimpleNameResolver<T> implements io.netty.resolver.NameResolver<T> {
    private final io.netty.util.concurrent.EventExecutor executor;

    protected SimpleNameResolver(io.netty.util.concurrent.EventExecutor r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "executor"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.EventExecutor r2 = (io.netty.util.concurrent.EventExecutor) r2
            r1.executor = r2
            return
    }

    @Override // io.netty.resolver.NameResolver, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    protected abstract void doResolve(java.lang.String r1, io.netty.util.concurrent.Promise<T> r2) throws java.lang.Exception;

    protected abstract void doResolveAll(java.lang.String r1, io.netty.util.concurrent.Promise<java.util.List<T>> r2) throws java.lang.Exception;

    protected io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            return r0
    }

    @Override // io.netty.resolver.NameResolver
    public final io.netty.util.concurrent.Future<T> resolve(java.lang.String r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r2 = r1.resolve(r2, r0)
            return r2
    }

    @Override // io.netty.resolver.NameResolver
    public io.netty.util.concurrent.Future<T> resolve(java.lang.String r2, io.netty.util.concurrent.Promise<T> r3) {
            r1 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r1.doResolve(r2, r3)     // Catch: java.lang.Exception -> L9
            return r3
        L9:
            r2 = move-exception
            io.netty.util.concurrent.Promise r2 = r3.setFailure(r2)
            return r2
    }

    @Override // io.netty.resolver.NameResolver
    public final io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.lang.String r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r2 = r1.resolveAll(r2, r0)
            return r2
    }

    @Override // io.netty.resolver.NameResolver
    public io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.lang.String r2, io.netty.util.concurrent.Promise<java.util.List<T>> r3) {
            r1 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r1.doResolveAll(r2, r3)     // Catch: java.lang.Exception -> L9
            return r3
        L9:
            r2 = move-exception
            io.netty.util.concurrent.Promise r2 = r3.setFailure(r2)
            return r2
    }
}

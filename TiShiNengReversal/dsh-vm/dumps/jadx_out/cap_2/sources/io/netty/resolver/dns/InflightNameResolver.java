package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class InflightNameResolver<T> implements io.netty.resolver.NameResolver<T> {
    private final io.netty.resolver.NameResolver<T> delegate;
    private final io.netty.util.concurrent.EventExecutor executor;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<java.util.List<T>>> resolveAllsInProgress;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<T>> resolvesInProgress;



    InflightNameResolver(io.netty.util.concurrent.EventExecutor r2, io.netty.resolver.NameResolver<T> r3, java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<T>> r4, java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<java.util.List<T>>> r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "executor"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.EventExecutor r2 = (io.netty.util.concurrent.EventExecutor) r2
            r1.executor = r2
            java.lang.String r2 = "delegate"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.resolver.NameResolver r2 = (io.netty.resolver.NameResolver) r2
            r1.delegate = r2
            java.lang.String r2 = "resolvesInProgress"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            java.util.concurrent.ConcurrentMap r2 = (java.util.concurrent.ConcurrentMap) r2
            r1.resolvesInProgress = r2
            java.lang.String r2 = "resolveAllsInProgress"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r2)
            java.util.concurrent.ConcurrentMap r2 = (java.util.concurrent.ConcurrentMap) r2
            r1.resolveAllsInProgress = r2
            return
    }

    static /* synthetic */ void access$000(io.netty.util.concurrent.Future r0, io.netty.util.concurrent.Promise r1) {
            transferResult(r0, r1)
            return
    }

    private <U> io.netty.util.concurrent.Promise<U> resolve(java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<U>> r2, java.lang.String r3, io.netty.util.concurrent.Promise<U> r4, boolean r5) {
            r1 = this;
            java.lang.Object r0 = r2.putIfAbsent(r3, r4)
            io.netty.util.concurrent.Promise r0 = (io.netty.util.concurrent.Promise) r0
            if (r0 == 0) goto L1b
            boolean r2 = r0.isDone()
            if (r2 == 0) goto L12
            transferResult(r0, r4)
            return r4
        L12:
            io.netty.resolver.dns.InflightNameResolver$1 r2 = new io.netty.resolver.dns.InflightNameResolver$1
            r2.<init>(r1, r4)
            r0.addListener(r2)
            return r4
        L1b:
            if (r5 == 0) goto L25
            io.netty.resolver.NameResolver<T> r5 = r1.delegate     // Catch: java.lang.Throwable -> L23
            r5.resolveAll(r3, r4)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r5 = move-exception
            goto L3d
        L25:
            io.netty.resolver.NameResolver<T> r5 = r1.delegate     // Catch: java.lang.Throwable -> L23
            r5.resolve(r3, r4)     // Catch: java.lang.Throwable -> L23
        L2a:
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L34
            r2.remove(r3)
            return r4
        L34:
            io.netty.resolver.dns.InflightNameResolver$2 r5 = new io.netty.resolver.dns.InflightNameResolver$2
            r5.<init>(r1, r2, r3)
            r4.addListener(r5)
            return r4
        L3d:
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L47
            r2.remove(r3)
            goto L4f
        L47:
            io.netty.resolver.dns.InflightNameResolver$2 r0 = new io.netty.resolver.dns.InflightNameResolver$2
            r0.<init>(r1, r2, r3)
            r4.addListener(r0)
        L4f:
            throw r5
    }

    private static <T> void transferResult(io.netty.util.concurrent.Future<T> r1, io.netty.util.concurrent.Promise<T> r2) {
            boolean r0 = r1.isSuccess()
            if (r0 == 0) goto Le
            java.lang.Object r1 = r1.getNow()
            r2.trySuccess(r1)
            return
        Le:
            java.lang.Throwable r1 = r1.cause()
            r2.tryFailure(r1)
            return
    }

    public void close() {
            r1 = this;
            io.netty.resolver.NameResolver<T> r0 = r1.delegate
            r0.close()
            return
    }

    public io.netty.util.concurrent.Future<T> resolve(java.lang.String r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Promise r2 = r1.m8resolve(r2, r0)
            return r2
    }

    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future resolve(java.lang.String r1, io.netty.util.concurrent.Promise r2) {
            r0 = this;
            io.netty.util.concurrent.Promise r1 = r0.m8resolve(r1, r2)
            return r1
    }

    /* renamed from: resolve, reason: collision with other method in class */
    public io.netty.util.concurrent.Promise<T> m8resolve(java.lang.String r3, io.netty.util.concurrent.Promise<T> r4) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<T>> r0 = r2.resolvesInProgress
            r1 = 0
            io.netty.util.concurrent.Promise r3 = r2.resolve(r0, r3, r4, r1)
            return r3
    }

    public io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.lang.String r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Promise r2 = r1.m9resolveAll(r2, r0)
            return r2
    }

    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future resolveAll(java.lang.String r1, io.netty.util.concurrent.Promise r2) {
            r0 = this;
            io.netty.util.concurrent.Promise r1 = r0.m9resolveAll(r1, r2)
            return r1
    }

    /* renamed from: resolveAll, reason: collision with other method in class */
    public io.netty.util.concurrent.Promise<java.util.List<T>> m9resolveAll(java.lang.String r3, io.netty.util.concurrent.Promise<java.util.List<T>> r4) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<java.util.List<T>>> r0 = r2.resolveAllsInProgress
            r1 = 1
            io.netty.util.concurrent.Promise r3 = r2.resolve(r0, r3, r4, r1)
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            io.netty.resolver.NameResolver<T> r1 = r2.delegate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

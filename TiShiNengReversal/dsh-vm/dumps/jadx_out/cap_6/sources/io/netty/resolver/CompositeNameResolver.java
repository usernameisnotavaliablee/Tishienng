package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CompositeNameResolver<T> extends io.netty.resolver.SimpleNameResolver<T> {
    private final io.netty.resolver.NameResolver<T>[] resolvers;



    public CompositeNameResolver(io.netty.util.concurrent.EventExecutor r3, io.netty.resolver.NameResolver<T>... r4) {
            r2 = this;
            r2.<init>(r3)
            java.lang.String r3 = "resolvers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            r3 = 0
        L9:
            int r0 = r4.length
            if (r3 >= r0) goto L2f
            r0 = r4[r3]
            if (r0 == 0) goto L13
            int r3 = r3 + 1
            goto L9
        L13:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "resolvers["
            r0.append(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L2f:
            int r3 = r4.length
            r0 = 2
            if (r3 < r0) goto L3c
            java.lang.Object r3 = r4.clone()
            io.netty.resolver.NameResolver[] r3 = (io.netty.resolver.NameResolver[]) r3
            r2.resolvers = r3
            return
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "resolvers: "
            r0.append(r1)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.append(r4)
            java.lang.String r4 = " (expected: at least 2 resolvers)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ void access$000(io.netty.resolver.CompositeNameResolver r0, java.lang.String r1, io.netty.util.concurrent.Promise r2, int r3, java.lang.Throwable r4) throws java.lang.Exception {
            r0.doResolveRec(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$100(io.netty.resolver.CompositeNameResolver r0, java.lang.String r1, io.netty.util.concurrent.Promise r2, int r3, java.lang.Throwable r4) throws java.lang.Exception {
            r0.doResolveAllRec(r1, r2, r3, r4)
            return
    }

    private void doResolveAllRec(java.lang.String r3, io.netty.util.concurrent.Promise<java.util.List<T>> r4, int r5, java.lang.Throwable r6) throws java.lang.Exception {
            r2 = this;
            io.netty.resolver.NameResolver<T>[] r0 = r2.resolvers
            int r1 = r0.length
            if (r5 < r1) goto L9
            r4.setFailure(r6)
            return
        L9:
            r6 = r0[r5]
            io.netty.util.concurrent.Future r6 = r6.resolveAll(r3)
            io.netty.resolver.CompositeNameResolver$2 r0 = new io.netty.resolver.CompositeNameResolver$2
            r0.<init>(r2, r4, r3, r5)
            r6.addListener(r0)
            return
    }

    private void doResolveRec(java.lang.String r3, io.netty.util.concurrent.Promise<T> r4, int r5, java.lang.Throwable r6) throws java.lang.Exception {
            r2 = this;
            io.netty.resolver.NameResolver<T>[] r0 = r2.resolvers
            int r1 = r0.length
            if (r5 < r1) goto L9
            r4.setFailure(r6)
            return
        L9:
            r6 = r0[r5]
            io.netty.util.concurrent.Future r6 = r6.resolve(r3)
            io.netty.resolver.CompositeNameResolver$1 r0 = new io.netty.resolver.CompositeNameResolver$1
            r0.<init>(r2, r4, r3, r5)
            r6.addListener(r0)
            return
    }

    @Override // io.netty.resolver.SimpleNameResolver
    protected void doResolve(java.lang.String r3, io.netty.util.concurrent.Promise<T> r4) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.doResolveRec(r3, r4, r0, r1)
            return
    }

    @Override // io.netty.resolver.SimpleNameResolver
    protected void doResolveAll(java.lang.String r3, io.netty.util.concurrent.Promise<java.util.List<T>> r4) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.doResolveAllRec(r3, r4, r0, r1)
            return
    }
}

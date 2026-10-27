package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class InetSocketAddressResolver extends io.netty.resolver.AbstractAddressResolver<java.net.InetSocketAddress> {
    final io.netty.resolver.NameResolver<java.net.InetAddress> nameResolver;



    public InetSocketAddressResolver(io.netty.util.concurrent.EventExecutor r2, io.netty.resolver.NameResolver<java.net.InetAddress> r3) {
            r1 = this;
            java.lang.Class<java.net.InetSocketAddress> r0 = java.net.InetSocketAddress.class
            r1.<init>(r2, r0)
            r1.nameResolver = r3
            return
    }

    @Override // io.netty.resolver.AbstractAddressResolver, io.netty.resolver.AddressResolver, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.resolver.NameResolver<java.net.InetAddress> r0 = r1.nameResolver
            r0.close()
            return
    }

    /* renamed from: doIsResolved, reason: avoid collision after fix types in other method */
    protected boolean doIsResolved2(java.net.InetSocketAddress r1) {
            r0 = this;
            boolean r1 = r1.isUnresolved()
            r1 = r1 ^ 1
            return r1
    }

    @Override // io.netty.resolver.AbstractAddressResolver
    protected /* bridge */ /* synthetic */ boolean doIsResolved(java.net.InetSocketAddress r1) {
            r0 = this;
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            boolean r1 = r0.doIsResolved2(r1)
            return r1
    }

    /* renamed from: doResolve, reason: avoid collision after fix types in other method */
    protected void doResolve2(java.net.InetSocketAddress r3, io.netty.util.concurrent.Promise<java.net.InetSocketAddress> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.resolver.NameResolver<java.net.InetAddress> r0 = r2.nameResolver
            java.lang.String r1 = r3.getHostName()
            io.netty.util.concurrent.Future r0 = r0.resolve(r1)
            io.netty.resolver.InetSocketAddressResolver$1 r1 = new io.netty.resolver.InetSocketAddressResolver$1
            r1.<init>(r2, r4, r3)
            r0.addListener(r1)
            return
    }

    @Override // io.netty.resolver.AbstractAddressResolver
    protected /* bridge */ /* synthetic */ void doResolve(java.net.InetSocketAddress r1, io.netty.util.concurrent.Promise<java.net.InetSocketAddress> r2) throws java.lang.Exception {
            r0 = this;
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            r0.doResolve2(r1, r2)
            return
    }

    /* renamed from: doResolveAll, reason: avoid collision after fix types in other method */
    protected void doResolveAll2(java.net.InetSocketAddress r3, io.netty.util.concurrent.Promise<java.util.List<java.net.InetSocketAddress>> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.resolver.NameResolver<java.net.InetAddress> r0 = r2.nameResolver
            java.lang.String r1 = r3.getHostName()
            io.netty.util.concurrent.Future r0 = r0.resolveAll(r1)
            io.netty.resolver.InetSocketAddressResolver$2 r1 = new io.netty.resolver.InetSocketAddressResolver$2
            r1.<init>(r2, r3, r4)
            r0.addListener(r1)
            return
    }

    @Override // io.netty.resolver.AbstractAddressResolver
    protected /* bridge */ /* synthetic */ void doResolveAll(java.net.InetSocketAddress r1, io.netty.util.concurrent.Promise<java.util.List<java.net.InetSocketAddress>> r2) throws java.lang.Exception {
            r0 = this;
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            r0.doResolveAll2(r1, r2)
            return
    }
}

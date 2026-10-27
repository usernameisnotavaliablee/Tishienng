package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultAddressResolverGroup extends io.netty.resolver.AddressResolverGroup<java.net.InetSocketAddress> {
    public static final io.netty.resolver.DefaultAddressResolverGroup INSTANCE = null;

    static {
            io.netty.resolver.DefaultAddressResolverGroup r0 = new io.netty.resolver.DefaultAddressResolverGroup
            r0.<init>()
            io.netty.resolver.DefaultAddressResolverGroup.INSTANCE = r0
            return
    }

    private DefaultAddressResolverGroup() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.resolver.AddressResolverGroup
    protected io.netty.resolver.AddressResolver<java.net.InetSocketAddress> newResolver(io.netty.util.concurrent.EventExecutor r2) throws java.lang.Exception {
            r1 = this;
            io.netty.resolver.DefaultNameResolver r0 = new io.netty.resolver.DefaultNameResolver
            r0.<init>(r2)
            io.netty.resolver.AddressResolver r2 = r0.asAddressResolver()
            return r2
    }
}

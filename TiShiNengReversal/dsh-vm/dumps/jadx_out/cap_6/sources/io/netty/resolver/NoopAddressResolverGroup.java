package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class NoopAddressResolverGroup extends io.netty.resolver.AddressResolverGroup<java.net.SocketAddress> {
    public static final io.netty.resolver.NoopAddressResolverGroup INSTANCE = null;

    static {
            io.netty.resolver.NoopAddressResolverGroup r0 = new io.netty.resolver.NoopAddressResolverGroup
            r0.<init>()
            io.netty.resolver.NoopAddressResolverGroup.INSTANCE = r0
            return
    }

    private NoopAddressResolverGroup() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.resolver.AddressResolverGroup
    protected io.netty.resolver.AddressResolver<java.net.SocketAddress> newResolver(io.netty.util.concurrent.EventExecutor r2) throws java.lang.Exception {
            r1 = this;
            io.netty.resolver.NoopAddressResolver r0 = new io.netty.resolver.NoopAddressResolver
            r0.<init>(r2)
            return r0
    }
}

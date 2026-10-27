package io.netty.bootstrap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class BootstrapConfig extends io.netty.bootstrap.AbstractBootstrapConfig<io.netty.bootstrap.Bootstrap, io.netty.channel.Channel> {
    BootstrapConfig(io.netty.bootstrap.Bootstrap r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.net.SocketAddress remoteAddress() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.bootstrap.Bootstrap r0 = (io.netty.bootstrap.Bootstrap) r0
            java.net.SocketAddress r0 = r0.remoteAddress()
            return r0
    }

    public io.netty.resolver.AddressResolverGroup<?> resolver() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.bootstrap.Bootstrap r0 = (io.netty.bootstrap.Bootstrap) r0
            io.netty.resolver.AddressResolverGroup r0 = r0.resolver()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrapConfig
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = super.toString()
            r0.<init>(r1)
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
            java.lang.String r1 = ", resolver: "
            r0.append(r1)
            io.netty.resolver.AddressResolverGroup r1 = r3.resolver()
            r0.append(r1)
            java.net.SocketAddress r1 = r3.remoteAddress()
            if (r1 == 0) goto L2c
            java.lang.String r2 = ", remoteAddress: "
            r0.append(r2)
            r0.append(r1)
        L2c:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

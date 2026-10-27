package io.netty.bootstrap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ServerBootstrapConfig extends io.netty.bootstrap.AbstractBootstrapConfig<io.netty.bootstrap.ServerBootstrap, io.netty.channel.ServerChannel> {
    ServerBootstrapConfig(io.netty.bootstrap.ServerBootstrap r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> childAttrs() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.bootstrap.ServerBootstrap r0 = (io.netty.bootstrap.ServerBootstrap) r0
            java.util.Map r0 = r0.childAttrs()
            return r0
    }

    public io.netty.channel.EventLoopGroup childGroup() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.bootstrap.ServerBootstrap r0 = (io.netty.bootstrap.ServerBootstrap) r0
            io.netty.channel.EventLoopGroup r0 = r0.childGroup()
            return r0
    }

    public io.netty.channel.ChannelHandler childHandler() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.bootstrap.ServerBootstrap r0 = (io.netty.bootstrap.ServerBootstrap) r0
            io.netty.channel.ChannelHandler r0 = r0.childHandler()
            return r0
    }

    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> childOptions() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.bootstrap.ServerBootstrap r0 = (io.netty.bootstrap.ServerBootstrap) r0
            java.util.Map r0 = r0.childOptions()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrapConfig
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = super.toString()
            r0.<init>(r1)
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            io.netty.channel.EventLoopGroup r2 = r4.childGroup()
            if (r2 == 0) goto L2c
            java.lang.String r3 = "childGroup: "
            r0.append(r3)
            java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r2)
            r0.append(r1)
        L2c:
            java.util.Map r2 = r4.childOptions()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L41
            java.lang.String r3 = "childOptions: "
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
        L41:
            java.util.Map r2 = r4.childAttrs()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L56
            java.lang.String r3 = "childAttrs: "
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
        L56:
            io.netty.channel.ChannelHandler r2 = r4.childHandler()
            if (r2 == 0) goto L67
            java.lang.String r3 = "childHandler: "
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
        L67:
            int r1 = r0.length()
            int r1 = r1 + (-1)
            char r1 = r0.charAt(r1)
            r2 = 40
            r3 = 41
            if (r1 != r2) goto L7b
            r0.append(r3)
            goto L8d
        L7b:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            r0.setCharAt(r1, r3)
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
        L8d:
            java.lang.String r0 = r0.toString()
            return r0
    }
}

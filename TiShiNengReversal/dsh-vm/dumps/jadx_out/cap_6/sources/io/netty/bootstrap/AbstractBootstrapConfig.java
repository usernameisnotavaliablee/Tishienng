package io.netty.bootstrap;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.channel.Channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractBootstrapConfig<B extends io.netty.bootstrap.AbstractBootstrap<B, C>, C extends io.netty.channel.Channel> {
    protected final B bootstrap;

    protected AbstractBootstrapConfig(B r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "bootstrap"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.bootstrap.AbstractBootstrap r2 = (io.netty.bootstrap.AbstractBootstrap) r2
            r1.bootstrap = r2
            return
    }

    public final java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> attrs() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            java.util.Map r0 = r0.attrs()
            return r0
    }

    public final io.netty.bootstrap.ChannelFactory<? extends C> channelFactory() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.bootstrap.ChannelFactory r0 = r0.channelFactory()
            return r0
    }

    public final io.netty.channel.EventLoopGroup group() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.channel.EventLoopGroup r0 = r0.group()
            return r0
    }

    public final io.netty.channel.ChannelHandler handler() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            io.netty.channel.ChannelHandler r0 = r0.handler()
            return r0
    }

    public final java.net.SocketAddress localAddress() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            java.net.SocketAddress r0 = r0.localAddress()
            return r0
    }

    public final java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> options() {
            r1 = this;
            B extends io.netty.bootstrap.AbstractBootstrap<B, C> r0 = r1.bootstrap
            java.util.Map r0 = r0.options()
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r5)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            io.netty.channel.EventLoopGroup r2 = r5.group()
            java.lang.String r3 = ", "
            if (r2 == 0) goto L28
            java.lang.String r4 = "group: "
            r0.append(r4)
            java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r2)
            r0.append(r3)
        L28:
            io.netty.bootstrap.ChannelFactory r2 = r5.channelFactory()
            if (r2 == 0) goto L39
            java.lang.String r4 = "channelFactory: "
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
        L39:
            java.net.SocketAddress r2 = r5.localAddress()
            if (r2 == 0) goto L4a
            java.lang.String r4 = "localAddress: "
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
        L4a:
            java.util.Map r2 = r5.options()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L5f
            java.lang.String r4 = "options: "
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
        L5f:
            java.util.Map r2 = r5.attrs()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L74
            java.lang.String r4 = "attrs: "
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
        L74:
            io.netty.channel.ChannelHandler r2 = r5.handler()
            if (r2 == 0) goto L85
            java.lang.String r4 = "handler: "
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
        L85:
            int r2 = r0.length()
            int r2 = r2 + (-1)
            char r2 = r0.charAt(r2)
            r3 = 41
            if (r2 != r1) goto L97
            r0.append(r3)
            goto La9
        L97:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            r0.setCharAt(r1, r3)
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
        La9:
            java.lang.String r0 = r0.toString()
            return r0
    }
}

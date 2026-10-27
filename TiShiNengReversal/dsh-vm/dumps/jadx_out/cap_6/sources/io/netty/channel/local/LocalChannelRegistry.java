package io.netty.channel.local;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class LocalChannelRegistry {
    private static final java.util.concurrent.ConcurrentMap<io.netty.channel.local.LocalAddress, io.netty.channel.Channel> boundChannels = null;

    static {
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            io.netty.channel.local.LocalChannelRegistry.boundChannels = r0
            return
    }

    private LocalChannelRegistry() {
            r0 = this;
            r0.<init>()
            return
    }

    static io.netty.channel.Channel get(java.net.SocketAddress r1) {
            java.util.concurrent.ConcurrentMap<io.netty.channel.local.LocalAddress, io.netty.channel.Channel> r0 = io.netty.channel.local.LocalChannelRegistry.boundChannels
            java.lang.Object r1 = r0.get(r1)
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            return r1
    }

    static io.netty.channel.local.LocalAddress register(io.netty.channel.Channel r1, io.netty.channel.local.LocalAddress r2, java.net.SocketAddress r3) {
            if (r2 != 0) goto L52
            boolean r2 = r3 instanceof io.netty.channel.local.LocalAddress
            if (r2 == 0) goto L37
            io.netty.channel.local.LocalAddress r3 = (io.netty.channel.local.LocalAddress) r3
            io.netty.channel.local.LocalAddress r2 = io.netty.channel.local.LocalAddress.ANY
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L15
            io.netty.channel.local.LocalAddress r3 = new io.netty.channel.local.LocalAddress
            r3.<init>(r1)
        L15:
            java.util.concurrent.ConcurrentMap<io.netty.channel.local.LocalAddress, io.netty.channel.Channel> r2 = io.netty.channel.local.LocalChannelRegistry.boundChannels
            java.lang.Object r1 = r2.putIfAbsent(r3, r1)
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            if (r1 != 0) goto L20
            return r3
        L20:
            io.netty.channel.ChannelException r2 = new io.netty.channel.ChannelException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "address already in use by: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L37:
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "unsupported address type: "
            r2.append(r0)
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L52:
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "already bound"
            r1.<init>(r2)
            throw r1
    }

    static void unregister(io.netty.channel.local.LocalAddress r1) {
            java.util.concurrent.ConcurrentMap<io.netty.channel.local.LocalAddress, io.netty.channel.Channel> r0 = io.netty.channel.local.LocalChannelRegistry.boundChannels
            r0.remove(r1)
            return
    }
}

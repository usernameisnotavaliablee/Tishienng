package io.netty.channel.socket.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class NioChannelOption<T> extends io.netty.channel.ChannelOption<T> {
    private final java.net.SocketOption<T> option;

    private NioChannelOption(java.net.SocketOption<T> r2) {
            r1 = this;
            java.lang.String r0 = io.netty.channel.socket.nio.f.a(r2)
            r1.<init>(r0)
            r1.option = r2
            return
    }

    static <T> T getOption(java.nio.channels.Channel r3, io.netty.channel.socket.nio.NioChannelOption<T> r4) {
            java.nio.channels.NetworkChannel r3 = io.netty.channel.socket.nio.a.a(r3)
            java.util.Set r0 = io.netty.channel.socket.nio.b.a(r3)
            java.net.SocketOption<T> r1 = r4.option
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            boolean r0 = r3 instanceof java.nio.channels.ServerSocketChannel
            if (r0 == 0) goto L1f
            java.net.SocketOption<T> r0 = r4.option
            java.net.SocketOption r2 = io.netty.channel.socket.nio.d.a()
            if (r0 != r2) goto L1f
            return r1
        L1f:
            java.net.SocketOption<T> r4 = r4.option     // Catch: java.io.IOException -> L26
            java.lang.Object r3 = io.netty.channel.socket.nio.e.a(r3, r4)     // Catch: java.io.IOException -> L26
            return r3
        L26:
            r3 = move-exception
            io.netty.channel.ChannelException r4 = new io.netty.channel.ChannelException
            r4.<init>(r3)
            throw r4
    }

    static io.netty.channel.ChannelOption[] getOptions(java.nio.channels.Channel r5) {
            java.nio.channels.NetworkChannel r5 = io.netty.channel.socket.nio.a.a(r5)
            java.util.Set r0 = io.netty.channel.socket.nio.b.a(r5)
            boolean r5 = r5 instanceof java.nio.channels.ServerSocketChannel
            r1 = 0
            if (r5 == 0) goto L41
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = r0.size()
            r5.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.net.SocketOption r2 = io.netty.channel.socket.nio.c.a(r2)
            java.net.SocketOption r3 = io.netty.channel.socket.nio.d.a()
            if (r2 != r3) goto L2f
            goto L1a
        L2f:
            io.netty.channel.socket.nio.NioChannelOption r3 = new io.netty.channel.socket.nio.NioChannelOption
            r3.<init>(r2)
            r5.add(r3)
            goto L1a
        L38:
            io.netty.channel.ChannelOption[] r0 = new io.netty.channel.ChannelOption[r1]
            java.lang.Object[] r5 = r5.toArray(r0)
            io.netty.channel.ChannelOption[] r5 = (io.netty.channel.ChannelOption[]) r5
            return r5
        L41:
            int r5 = r0.size()
            io.netty.channel.ChannelOption[] r5 = new io.netty.channel.ChannelOption[r5]
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            java.net.SocketOption r2 = io.netty.channel.socket.nio.c.a(r2)
            int r3 = r1 + 1
            io.netty.channel.socket.nio.NioChannelOption r4 = new io.netty.channel.socket.nio.NioChannelOption
            r4.<init>(r2)
            r5[r1] = r4
            r1 = r3
            goto L4b
        L64:
            return r5
    }

    public static <T> io.netty.channel.ChannelOption<T> of(java.net.SocketOption<T> r1) {
            io.netty.channel.socket.nio.NioChannelOption r0 = new io.netty.channel.socket.nio.NioChannelOption
            r0.<init>(r1)
            return r0
    }

    static <T> boolean setOption(java.nio.channels.Channel r3, io.netty.channel.socket.nio.NioChannelOption<T> r4, T r5) {
            java.nio.channels.NetworkChannel r3 = io.netty.channel.socket.nio.a.a(r3)
            java.util.Set r0 = io.netty.channel.socket.nio.b.a(r3)
            java.net.SocketOption<T> r1 = r4.option
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            boolean r0 = r3 instanceof java.nio.channels.ServerSocketChannel
            if (r0 == 0) goto L1f
            java.net.SocketOption<T> r0 = r4.option
            java.net.SocketOption r2 = io.netty.channel.socket.nio.d.a()
            if (r0 != r2) goto L1f
            return r1
        L1f:
            java.net.SocketOption<T> r4 = r4.option     // Catch: java.io.IOException -> L26
            io.netty.channel.socket.nio.g.a(r3, r4, r5)     // Catch: java.io.IOException -> L26
            r3 = 1
            return r3
        L26:
            r3 = move-exception
            io.netty.channel.ChannelException r4 = new io.netty.channel.ChannelException
            r4.<init>(r3)
            throw r4
    }
}

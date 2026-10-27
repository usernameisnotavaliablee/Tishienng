package com.tsn.chat.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends java.lang.Thread {
    private static io.netty.channel.nio.NioEventLoopGroup c;
    private static java.util.concurrent.CountDownLatch d;
    java.lang.String a;
    int b;

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public d(java.lang.String r1, int r2, java.util.concurrent.CountDownLatch r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            com.tsn.chat.utils.d.d = r3
            return
    }

    public static void a(java.lang.String r5, int r6) {
            java.lang.String r0 = com.tsn.chat.utils.b.b
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            java.lang.String r0 = "linking"
            com.tsn.chat.utils.b.b = r0
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            int r0 = r0.size()
            if (r0 <= 0) goto L20
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            r0.close()
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            r0.clear()
        L20:
            io.netty.channel.nio.NioEventLoopGroup r0 = new io.netty.channel.nio.NioEventLoopGroup
            r0.<init>()
            io.netty.bootstrap.Bootstrap r2 = new io.netty.bootstrap.Bootstrap     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r2.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r2.group(r0)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            java.lang.Class<io.netty.channel.socket.nio.NioSocketChannel> r3 = io.netty.channel.socket.nio.NioSocketChannel.class
            r2.channel(r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            io.netty.channel.ChannelOption<java.lang.Integer> r3 = io.netty.channel.ChannelOption.CONNECT_TIMEOUT_MILLIS     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r4 = 5000(0x1388, float:7.006E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r2.option(r3, r4)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            io.netty.channel.ChannelOption<java.lang.Boolean> r3 = io.netty.channel.ChannelOption.TCP_NODELAY     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r2.option(r3, r4)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            com.tsn.chat.handler.d r3 = new com.tsn.chat.handler.d     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r2.handler(r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            io.netty.channel.ChannelFuture r5 = r2.connect(r5, r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            io.netty.channel.ChannelFuture r5 = r5.sync()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            boolean r6 = r5.isSuccess()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            if (r6 == 0) goto L6b
            io.netty.channel.group.ChannelGroup r6 = com.tsn.chat.utils.b.a     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            io.netty.channel.Channel r2 = r5.channel()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r6.add(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            java.util.concurrent.CountDownLatch r6 = com.tsn.chat.utils.d.d     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r6.countDown()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            goto L6b
        L69:
            r5 = move-exception
            goto L91
        L6b:
            io.netty.channel.Channel r5 = r5.channel()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            io.netty.channel.ChannelFuture r5 = r5.closeFuture()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r5.await()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L7a
            r0.shutdownGracefully()
            return
        L7a:
            io.netty.channel.group.ChannelGroup r5 = com.tsn.chat.utils.b.a     // Catch: java.lang.Throwable -> L69
            r5.clear()     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.CountDownLatch r5 = com.tsn.chat.utils.d.d     // Catch: java.lang.Throwable -> L69
            r5.countDown()     // Catch: java.lang.Throwable -> L69
            com.tsn.chat.utils.b.b = r1     // Catch: java.lang.Throwable -> L69
            a3.b r5 = a3.a.a()     // Catch: java.lang.Throwable -> L69
            r5.k()     // Catch: java.lang.Throwable -> L69
            r0.shutdownGracefully()
            return
        L91:
            r0.shutdownGracefully()
            throw r5
        L95:
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r1 = r2.b
            a(r0, r1)
            return
    }
}

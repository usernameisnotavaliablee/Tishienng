package com.bxkj.base.v2.netty4android.client.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d extends io.netty.channel.SimpleChannelInboundHandler<com.bxkj.base.v2.netty4android.client.command.a> {

    @org.jetbrains.annotations.Nullable
    private final r.b<com.bxkj.base.v2.netty4android.client.command.a> a;
    private final int b;
    private final boolean c;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object d;

    public d(@org.jetbrains.annotations.Nullable r.b<com.bxkj.base.v2.netty4android.client.command.a> r1, int r2, boolean r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    protected void a(@org.jetbrains.annotations.NotNull io.netty.channel.ChannelHandlerContext r2, @org.jetbrains.annotations.NotNull com.bxkj.base.v2.netty4android.client.command.a r3) {
            r1 = this;
            java.lang.String r0 = "channelHandlerContext"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "msg"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "服务器响应数据："
            r3.d(r2)
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r2 = r1.a
            if (r2 == 0) goto L18
            int r0 = r1.b
            r2.a(r3, r0)
        L18:
            return
    }

    public void channelActive(@org.jetbrains.annotations.NotNull io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.g0.p(r3, r0)
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "客户端上线"
            com.orhanobut.logger.j.d(r0, r3)
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r3 = r2.a
            if (r3 == 0) goto L17
            r0 = 1
            int r1 = r2.b
            r3.b(r0, r1)
        L17:
            return
    }

    public void channelInactive(@org.jetbrains.annotations.NotNull io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = "客户端下线"
            com.orhanobut.logger.j.d(r0, r2)
            return
    }

    public /* bridge */ /* synthetic */ void channelRead0(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) {
            r0 = this;
            com.bxkj.base.v2.netty4android.client.command.a r2 = (com.bxkj.base.v2.netty4android.client.command.a) r2
            r0.a(r1, r2)
            return
    }

    public void exceptionCaught(@org.jetbrains.annotations.NotNull io.netty.channel.ChannelHandlerContext r4, @org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r3 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "exceptionCaught"
            com.orhanobut.logger.j.e(r1, r0)
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r0 = r3.a
            if (r0 == 0) goto L1c
            r1 = -1
            int r2 = r3.b
            r0.b(r1, r2)
        L1c:
            r5.getClass()
            r4.close()
            return
    }

    public void userEventTriggered(@org.jetbrains.annotations.NotNull io.netty.channel.ChannelHandlerContext r4, @org.jetbrains.annotations.NotNull java.lang.Object r5) {
            r3 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "evt"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof io.netty.handler.timeout.IdleStateEvent
            if (r0 == 0) goto L97
            io.netty.handler.timeout.IdleStateEvent r5 = (io.netty.handler.timeout.IdleStateEvent) r5
            io.netty.handler.timeout.IdleState r5 = r5.state()
            io.netty.handler.timeout.IdleState r0 = io.netty.handler.timeout.IdleState.WRITER_IDLE
            if (r5 != r0) goto L97
            boolean r5 = r3.c
            r0 = 0
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r3.d
            java.lang.String r1 = "line.separator"
            if (r5 != 0) goto L43
            io.netty.channel.Channel r4 = r4.channel()
            java.lang.String r5 = java.lang.System.getProperty(r1)
            kotlin.jvm.internal.g0.m(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Heartbeat"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.writeAndFlush(r5)
            return
        L43:
            boolean r2 = r5 instanceof java.lang.String
            if (r2 == 0) goto L67
            io.netty.channel.Channel r4 = r4.channel()
            java.lang.Object r5 = r3.d
            java.lang.String r0 = java.lang.System.getProperty(r1)
            kotlin.jvm.internal.g0.m(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r4.writeAndFlush(r5)
            return
        L67:
            boolean r1 = r5 instanceof byte[]
            if (r1 == 0) goto L7c
            byte[] r5 = (byte[]) r5
            kotlin.jvm.internal.g0.m(r5)
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.copiedBuffer(r5)
            io.netty.channel.Channel r4 = r4.channel()
            r4.writeAndFlush(r5)
            return
        L7c:
            boolean r1 = r5 instanceof com.bxkj.base.v2.netty4android.client.command.a
            if (r1 == 0) goto L84
            r4.writeAndFlush(r5)
            return
        L84:
            java.lang.String r4 = "userEventTriggered: heartBeatData type error"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r4, r5)
            kotlin.n1 r4 = kotlin.n1.a
            return
        L8e:
            java.lang.String r4 = "不发送心跳"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r4, r5)
            kotlin.n1 r4 = kotlin.n1.a
        L97:
            return
    }
}

package com.tsn.chat.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends io.netty.channel.ChannelInboundHandlerAdapter {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            com.tsn.chat.utils.b.k = r0
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            io.netty.channel.Channel r2 = r2.channel()
            r0.add(r2)
            a3.b r2 = a3.a.a()
            r2.m()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6) {
            r4 = this;
            io.netty.buffer.ByteBuf r6 = (io.netty.buffer.ByteBuf) r6
            int r5 = r6.readableBytes()
            byte[] r0 = new byte[r5]
            r0 = 4
            if (r5 < r0) goto L38
            r6.readByte()
            short r0 = r6.readShort()
            byte r1 = r6.readByte()
            int r0 = r0 + (-6)
            byte[] r0 = new byte[r0]
            r2 = 2
            byte[] r2 = new byte[r2]
            r6.readBytes(r0)
            r6.readBytes(r2)
            com.tsn.chat.model.ResponseMessage r2 = new com.tsn.chat.model.ResponseMessage
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r2.<init>(r1, r3)
            java.io.PrintStream r0 = java.lang.System.out
            r2.toString()
            r0.getClass()
            b3.a.a(r2)
        L38:
            byte[] r0 = new byte[r5]
            r6.resetReaderIndex()
            r1 = 0
        L3e:
            if (r1 < r5) goto L41
            return
        L41:
            byte r2 = r6.readByte()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3e
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r3.getMessage()
            r0.getClass()
            java.lang.String r3 = ""
            com.tsn.chat.utils.b.b = r3
            io.netty.channel.group.ChannelGroup r3 = com.tsn.chat.utils.b.a
            int r3 = r3.size()
            if (r3 <= 0) goto L1e
            io.netty.channel.group.ChannelGroup r3 = com.tsn.chat.utils.b.a
            r3.close()
            io.netty.channel.group.ChannelGroup r3 = com.tsn.chat.utils.b.a
            r3.clear()
        L1e:
            r2.close()
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            java.lang.String r1 = ""
            com.tsn.chat.utils.b.b = r1
            io.netty.channel.group.ChannelGroup r1 = com.tsn.chat.utils.b.a
            int r1 = r1.size()
            if (r1 <= 0) goto L1b
            io.netty.channel.group.ChannelGroup r1 = com.tsn.chat.utils.b.a
            r1.close()
            io.netty.channel.group.ChannelGroup r1 = com.tsn.chat.utils.b.a
            r1.clear()
        L1b:
            a3.b r1 = a3.a.a()
            r1.k()
            return
    }
}

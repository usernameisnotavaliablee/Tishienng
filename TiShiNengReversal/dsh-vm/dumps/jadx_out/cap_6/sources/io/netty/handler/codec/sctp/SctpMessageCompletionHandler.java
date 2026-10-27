package io.netty.handler.codec.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SctpMessageCompletionHandler extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.channel.sctp.SctpMessage> {
    private final java.util.Map<java.lang.Integer, io.netty.buffer.ByteBuf> fragments;

    public SctpMessageCompletionHandler() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.fragments = r0
            return
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r9, io.netty.channel.sctp.SctpMessage r10, java.util.List<java.lang.Object> r11) throws java.lang.Exception {
            r8 = this;
            io.netty.buffer.ByteBuf r9 = r10.content()
            int r0 = r10.protocolIdentifier()
            int r1 = r10.streamIdentifier()
            boolean r2 = r10.isComplete()
            boolean r3 = r10.isUnordered()
            java.util.Map<java.lang.Integer, io.netty.buffer.ByteBuf> r4 = r8.fragments
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.remove(r5)
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            if (r4 != 0) goto L24
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
        L24:
            if (r2 == 0) goto L30
            boolean r5 = r4.isReadable()
            if (r5 != 0) goto L30
            r11.add(r10)
            goto L73
        L30:
            r10 = 1
            r5 = 0
            r6 = 2
            if (r2 != 0) goto L4f
            boolean r7 = r4.isReadable()
            if (r7 == 0) goto L4f
            java.util.Map<java.lang.Integer, io.netty.buffer.ByteBuf> r11 = r8.fragments
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            io.netty.buffer.ByteBuf[] r1 = new io.netty.buffer.ByteBuf[r6]
            r1[r5] = r4
            r1[r10] = r9
            io.netty.buffer.ByteBuf r10 = io.netty.buffer.Unpooled.wrappedBuffer(r1)
            r11.put(r0, r10)
            goto L73
        L4f:
            if (r2 == 0) goto L6a
            boolean r2 = r4.isReadable()
            if (r2 == 0) goto L6a
            io.netty.channel.sctp.SctpMessage r2 = new io.netty.channel.sctp.SctpMessage
            io.netty.buffer.ByteBuf[] r6 = new io.netty.buffer.ByteBuf[r6]
            r6[r5] = r4
            r6[r10] = r9
            io.netty.buffer.ByteBuf r10 = io.netty.buffer.Unpooled.wrappedBuffer(r6)
            r2.<init>(r0, r1, r3, r10)
            r11.add(r2)
            goto L73
        L6a:
            java.util.Map<java.lang.Integer, io.netty.buffer.ByteBuf> r10 = r8.fragments
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r10.put(r11, r9)
        L73:
            r9.retain()
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.sctp.SctpMessage r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.sctp.SctpMessage r2 = (io.netty.channel.sctp.SctpMessage) r2
            r0.decode2(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            java.util.Map<java.lang.Integer, io.netty.buffer.ByteBuf> r0 = r2.fragments
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r1.release()
            goto La
        L1a:
            java.util.Map<java.lang.Integer, io.netty.buffer.ByteBuf> r0 = r2.fragments
            r0.clear()
            super.handlerRemoved(r3)
            return
    }
}

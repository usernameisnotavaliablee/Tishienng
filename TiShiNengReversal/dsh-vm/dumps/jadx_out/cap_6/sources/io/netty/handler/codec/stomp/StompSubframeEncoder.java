package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StompSubframeEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.handler.codec.stomp.StompSubframe> {
    public StompSubframeEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static io.netty.buffer.ByteBuf encodeContent(io.netty.handler.codec.stomp.StompContentSubframe r1, io.netty.channel.ChannelHandlerContext r2) {
            boolean r0 = r1 instanceof io.netty.handler.codec.stomp.LastStompContentSubframe
            if (r0 == 0) goto L22
            io.netty.buffer.ByteBufAllocator r2 = r2.alloc()
            io.netty.buffer.ByteBuf r0 = r1.content()
            int r0 = r0.readableBytes()
            int r0 = r0 + 1
            io.netty.buffer.ByteBuf r2 = r2.buffer(r0)
            io.netty.buffer.ByteBuf r1 = r1.content()
            r2.writeBytes(r1)
            r1 = 0
            r2.writeByte(r1)
            return r2
        L22:
            io.netty.buffer.ByteBuf r1 = r1.content()
            io.netty.buffer.ByteBuf r1 = r1.retain()
            return r1
    }

    private static io.netty.buffer.ByteBuf encodeFrame(io.netty.handler.codec.stomp.StompHeadersSubframe r4, io.netty.channel.ChannelHandlerContext r5) {
            io.netty.buffer.ByteBufAllocator r5 = r5.alloc()
            io.netty.buffer.ByteBuf r5 = r5.buffer()
            io.netty.handler.codec.stomp.StompCommand r0 = r4.command()
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            r5.writeCharSequence(r0, r1)
            r0 = 10
            r5.writeByte(r0)
            io.netty.handler.codec.AsciiHeadersEncoder r1 = new io.netty.handler.codec.AsciiHeadersEncoder
            io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r2 = io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.COLON
            io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r3 = io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.LF
            r1.<init>(r5, r2, r3)
            io.netty.handler.codec.stomp.StompHeaders r4 = r4.headers()
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r1.encode(r2)
            goto L2b
        L3b:
            r5.writeByte(r0)
            return r5
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.stomp.StompSubframe r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.stomp.StompFrame
            if (r0 == 0) goto L15
            io.netty.handler.codec.stomp.StompFrame r3 = (io.netty.handler.codec.stomp.StompFrame) r3
            io.netty.buffer.ByteBuf r0 = encodeFrame(r3, r2)
            r4.add(r0)
            io.netty.buffer.ByteBuf r2 = encodeContent(r3, r2)
            r4.add(r2)
            return
        L15:
            boolean r0 = r3 instanceof io.netty.handler.codec.stomp.StompHeadersSubframe
            if (r0 == 0) goto L23
            io.netty.handler.codec.stomp.StompHeadersSubframe r3 = (io.netty.handler.codec.stomp.StompHeadersSubframe) r3
            io.netty.buffer.ByteBuf r2 = encodeFrame(r3, r2)
            r4.add(r2)
            return
        L23:
            boolean r0 = r3 instanceof io.netty.handler.codec.stomp.StompContentSubframe
            if (r0 == 0) goto L30
            io.netty.handler.codec.stomp.StompContentSubframe r3 = (io.netty.handler.codec.stomp.StompContentSubframe) r3
            io.netty.buffer.ByteBuf r2 = encodeContent(r3, r2)
            r4.add(r2)
        L30:
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.stomp.StompSubframe r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompSubframe r2 = (io.netty.handler.codec.stomp.StompSubframe) r2
            r0.encode2(r1, r2, r3)
            return
    }
}

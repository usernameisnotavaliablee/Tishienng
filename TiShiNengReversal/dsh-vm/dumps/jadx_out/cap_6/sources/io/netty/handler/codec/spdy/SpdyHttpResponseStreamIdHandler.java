package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyHttpResponseStreamIdHandler extends io.netty.handler.codec.MessageToMessageCodec<java.lang.Object, io.netty.handler.codec.http.HttpMessage> {
    private static final java.lang.Integer NO_ID = null;
    private final java.util.Queue<java.lang.Integer> ids;

    static {
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            io.netty.handler.codec.spdy.SpdyHttpResponseStreamIdHandler.NO_ID = r0
            return
    }

    public SpdyHttpResponseStreamIdHandler() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.ids = r0
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    public boolean acceptInboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.HttpMessage
            if (r0 != 0) goto Lb
            boolean r2 = r2 instanceof io.netty.handler.codec.spdy.SpdyRstStreamFrame
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    protected void decode(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            boolean r3 = r4 instanceof io.netty.handler.codec.http.HttpMessage
            if (r3 == 0) goto L29
            r3 = r4
            io.netty.handler.codec.http.HttpMessage r3 = (io.netty.handler.codec.http.HttpMessage) r3
            io.netty.handler.codec.http.HttpHeaders r0 = r3.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1b
            java.util.Queue<java.lang.Integer> r3 = r2.ids
            java.lang.Integer r0 = io.netty.handler.codec.spdy.SpdyHttpResponseStreamIdHandler.NO_ID
            r3.add(r0)
            goto L3d
        L1b:
            java.util.Queue<java.lang.Integer> r0 = r2.ids
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            java.lang.Integer r3 = r3.getInt(r1)
            r0.add(r3)
            goto L3d
        L29:
            boolean r3 = r4 instanceof io.netty.handler.codec.spdy.SpdyRstStreamFrame
            if (r3 == 0) goto L3d
            java.util.Queue<java.lang.Integer> r3 = r2.ids
            r0 = r4
            io.netty.handler.codec.spdy.SpdyRstStreamFrame r0 = (io.netty.handler.codec.spdy.SpdyRstStreamFrame) r0
            int r0 = r0.streamId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.remove(r0)
        L3d:
            java.lang.Object r3 = io.netty.util.ReferenceCountUtil.retain(r4)
            r5.add(r3)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http.HttpMessage r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            java.util.Queue<java.lang.Integer> r3 = r2.ids
            java.lang.Object r3 = r3.poll()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L2d
            int r0 = r3.intValue()
            java.lang.Integer r1 = io.netty.handler.codec.spdy.SpdyHttpResponseStreamIdHandler.NO_ID
            int r1 = r1.intValue()
            if (r0 == r1) goto L2d
            io.netty.handler.codec.http.HttpHeaders r0 = r4.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2d
            io.netty.handler.codec.http.HttpHeaders r0 = r4.headers()
            int r3 = r3.intValue()
            r0.setInt(r1, r3)
        L2d:
            java.lang.Object r3 = io.netty.util.ReferenceCountUtil.retain(r4)
            r5.add(r3)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpMessage r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpMessage r2 = (io.netty.handler.codec.http.HttpMessage) r2
            r0.encode2(r1, r2, r3)
            return
    }
}

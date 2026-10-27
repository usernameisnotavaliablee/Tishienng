package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DecoratingHttp2FrameWriter implements io.netty.handler.codec.http2.Http2FrameWriter {
    private final io.netty.handler.codec.http2.Http2FrameWriter delegate;

    public DecoratingHttp2FrameWriter(io.netty.handler.codec.http2.Http2FrameWriter r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameWriter r2 = (io.netty.handler.codec.http2.Http2FrameWriter) r2
            r1.delegate = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.delegate
            r0.close()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.handler.codec.http2.Http2FrameWriter.Configuration configuration() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.delegate
            io.netty.handler.codec.http2.Http2FrameWriter$Configuration r0 = r0.configuration()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataWriter
    public io.netty.channel.ChannelFuture writeData(io.netty.channel.ChannelHandlerContext r8, int r9, io.netty.buffer.ByteBuf r10, int r11, boolean r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.delegate
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writeData(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeFrame(io.netty.channel.ChannelHandlerContext r8, byte r9, int r10, io.netty.handler.codec.http2.Http2Flags r11, io.netty.buffer.ByteBuf r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.delegate
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writeFrame(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeGoAway(io.netty.channel.ChannelHandlerContext r8, int r9, long r10, io.netty.buffer.ByteBuf r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.delegate
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writeGoAway(r1, r2, r3, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r11, int r12, io.netty.handler.codec.http2.Http2Headers r13, int r14, short r15, boolean r16, int r17, boolean r18, io.netty.channel.ChannelPromise r19) {
            r10 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r10.delegate
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            io.netty.channel.ChannelFuture r11 = r0.writeHeaders(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r8, int r9, io.netty.handler.codec.http2.Http2Headers r10, int r11, boolean r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.delegate
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writeHeaders(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePing(io.netty.channel.ChannelHandlerContext r7, boolean r8, long r9, io.netty.channel.ChannelPromise r11) {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r6.delegate
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            io.netty.channel.ChannelFuture r7 = r0.writePing(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePriority(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, short r11, boolean r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.delegate
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writePriority(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePushPromise(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, io.netty.handler.codec.http2.Http2Headers r11, int r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.delegate
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writePushPromise(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeRstStream(io.netty.channel.ChannelHandlerContext r7, int r8, long r9, io.netty.channel.ChannelPromise r11) {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r6.delegate
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            io.netty.channel.ChannelFuture r7 = r0.writeRstStream(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettings(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2Settings r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.delegate
            io.netty.channel.ChannelFuture r2 = r0.writeSettings(r2, r3, r4)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettingsAck(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.delegate
            io.netty.channel.ChannelFuture r2 = r0.writeSettingsAck(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeWindowUpdate(io.netty.channel.ChannelHandlerContext r2, int r3, int r4, io.netty.channel.ChannelPromise r5) {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.delegate
            io.netty.channel.ChannelFuture r2 = r0.writeWindowUpdate(r2, r3, r4, r5)
            return r2
    }
}

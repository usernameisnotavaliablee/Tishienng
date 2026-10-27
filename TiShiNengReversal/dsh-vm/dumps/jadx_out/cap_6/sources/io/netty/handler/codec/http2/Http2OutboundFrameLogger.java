package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2OutboundFrameLogger implements io.netty.handler.codec.http2.Http2FrameWriter {
    private final io.netty.handler.codec.http2.Http2FrameLogger logger;
    private final io.netty.handler.codec.http2.Http2FrameWriter writer;

    public Http2OutboundFrameLogger(io.netty.handler.codec.http2.Http2FrameWriter r2, io.netty.handler.codec.http2.Http2FrameLogger r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "writer"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameWriter r2 = (io.netty.handler.codec.http2.Http2FrameWriter) r2
            r1.writer = r2
            java.lang.String r2 = "logger"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http2.Http2FrameLogger r2 = (io.netty.handler.codec.http2.Http2FrameLogger) r2
            r1.logger = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.writer
            r0.close()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.handler.codec.http2.Http2FrameWriter.Configuration configuration() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.writer
            io.netty.handler.codec.http2.Http2FrameWriter$Configuration r0 = r0.configuration()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataWriter
    public io.netty.channel.ChannelFuture writeData(io.netty.channel.ChannelHandlerContext r10, int r11, io.netty.buffer.ByteBuf r12, int r13, boolean r14, io.netty.channel.ChannelPromise r15) {
            r9 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r9.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.logData(r1, r2, r3, r4, r5, r6)
            io.netty.handler.codec.http2.Http2FrameWriter r10 = r9.writer
            r8 = r15
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
            io.netty.channel.ChannelFuture r10 = r2.writeData(r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeFrame(io.netty.channel.ChannelHandlerContext r10, byte r11, int r12, io.netty.handler.codec.http2.Http2Flags r13, io.netty.buffer.ByteBuf r14, io.netty.channel.ChannelPromise r15) {
            r9 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r9.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.logUnknownFrame(r1, r2, r3, r4, r5, r6)
            io.netty.handler.codec.http2.Http2FrameWriter r10 = r9.writer
            r8 = r15
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
            io.netty.channel.ChannelFuture r10 = r2.writeFrame(r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeGoAway(io.netty.channel.ChannelHandlerContext r10, int r11, long r12, io.netty.buffer.ByteBuf r14, io.netty.channel.ChannelPromise r15) {
            r9 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r9.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r0.logGoAway(r1, r2, r3, r4, r6)
            io.netty.handler.codec.http2.Http2FrameWriter r10 = r9.writer
            r8 = r15
            r7 = r6
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
            io.netty.channel.ChannelFuture r10 = r2.writeGoAway(r3, r4, r5, r7, r8)
            return r10
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r13, int r14, io.netty.handler.codec.http2.Http2Headers r15, int r16, short r17, boolean r18, int r19, boolean r20, io.netty.channel.ChannelPromise r21) {
            r12 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r12.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.logHeaders(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            io.netty.handler.codec.http2.Http2FrameWriter r2 = r12.writer
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            io.netty.channel.ChannelFuture r13 = r2.writeHeaders(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r10, int r11, io.netty.handler.codec.http2.Http2Headers r12, int r13, boolean r14, io.netty.channel.ChannelPromise r15) {
            r9 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r9.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.logHeaders(r1, r2, r3, r4, r5, r6)
            io.netty.handler.codec.http2.Http2FrameWriter r10 = r9.writer
            r8 = r15
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
            io.netty.channel.ChannelFuture r10 = r2.writeHeaders(r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePing(io.netty.channel.ChannelHandlerContext r9, boolean r10, long r11, io.netty.channel.ChannelPromise r13) {
            r8 = this;
            if (r10 == 0) goto La
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r8.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r0.logPingAck(r1, r9, r11)
            goto L11
        La:
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r8.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r0.logPing(r1, r9, r11)
        L11:
            io.netty.handler.codec.http2.Http2FrameWriter r2 = r8.writer
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            io.netty.channel.ChannelFuture r9 = r2.writePing(r3, r4, r5, r7)
            return r9
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePriority(io.netty.channel.ChannelHandlerContext r10, int r11, int r12, short r13, boolean r14, io.netty.channel.ChannelPromise r15) {
            r9 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r9.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.logPriority(r1, r2, r3, r4, r5, r6)
            io.netty.handler.codec.http2.Http2FrameWriter r10 = r9.writer
            r8 = r15
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
            io.netty.channel.ChannelFuture r10 = r2.writePriority(r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePushPromise(io.netty.channel.ChannelHandlerContext r10, int r11, int r12, io.netty.handler.codec.http2.Http2Headers r13, int r14, io.netty.channel.ChannelPromise r15) {
            r9 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r9.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.logPushPromise(r1, r2, r3, r4, r5, r6)
            io.netty.handler.codec.http2.Http2FrameWriter r10 = r9.writer
            r8 = r15
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
            io.netty.channel.ChannelFuture r10 = r2.writePushPromise(r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeRstStream(io.netty.channel.ChannelHandlerContext r9, int r10, long r11, io.netty.channel.ChannelPromise r13) {
            r8 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r8.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r2 = r9
            r3 = r10
            r4 = r11
            r0.logRstStream(r1, r2, r3, r4)
            io.netty.handler.codec.http2.Http2FrameWriter r9 = r8.writer
            r7 = r13
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r9
            io.netty.channel.ChannelFuture r9 = r2.writeRstStream(r3, r4, r5, r7)
            return r9
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettings(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http2.Http2Settings r4, io.netty.channel.ChannelPromise r5) {
            r2 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r2.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r0.logSettings(r1, r3, r4)
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r2.writer
            io.netty.channel.ChannelFuture r3 = r0.writeSettings(r3, r4, r5)
            return r3
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettingsAck(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r2.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r0.logSettingsAck(r1, r3)
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r2.writer
            io.netty.channel.ChannelFuture r3 = r0.writeSettingsAck(r3, r4)
            return r3
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeWindowUpdate(io.netty.channel.ChannelHandlerContext r3, int r4, int r5, io.netty.channel.ChannelPromise r6) {
            r2 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r2.logger
            io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND
            r0.logWindowsUpdate(r1, r3, r4, r5)
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r2.writer
            io.netty.channel.ChannelFuture r3 = r0.writeWindowUpdate(r3, r4, r5, r6)
            return r3
    }
}

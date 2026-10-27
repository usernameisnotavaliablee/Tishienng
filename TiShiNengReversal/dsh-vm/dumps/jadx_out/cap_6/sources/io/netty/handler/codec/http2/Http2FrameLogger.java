package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2FrameLogger extends io.netty.channel.ChannelHandlerAdapter {
    private static final int BUFFER_LENGTH_THRESHOLD = 64;
    private final io.netty.util.internal.logging.InternalLogLevel level;
    private final io.netty.util.internal.logging.InternalLogger logger;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Direction extends java.lang.Enum<io.netty.handler.codec.http2.Http2FrameLogger.Direction> {
        private static final /* synthetic */ io.netty.handler.codec.http2.Http2FrameLogger.Direction[] $VALUES = null;
        public static final io.netty.handler.codec.http2.Http2FrameLogger.Direction INBOUND = null;
        public static final io.netty.handler.codec.http2.Http2FrameLogger.Direction OUTBOUND = null;

        static {
                io.netty.handler.codec.http2.Http2FrameLogger$Direction r0 = new io.netty.handler.codec.http2.Http2FrameLogger$Direction
                java.lang.String r1 = "INBOUND"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http2.Http2FrameLogger.Direction.INBOUND = r0
                io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = new io.netty.handler.codec.http2.Http2FrameLogger$Direction
                java.lang.String r3 = "OUTBOUND"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http2.Http2FrameLogger.Direction.OUTBOUND = r1
                r3 = 2
                io.netty.handler.codec.http2.Http2FrameLogger$Direction[] r3 = new io.netty.handler.codec.http2.Http2FrameLogger.Direction[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.netty.handler.codec.http2.Http2FrameLogger.Direction.$VALUES = r3
                return
        }

        Direction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http2.Http2FrameLogger.Direction valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.Http2FrameLogger$Direction> r0 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.Http2FrameLogger$Direction r1 = (io.netty.handler.codec.http2.Http2FrameLogger.Direction) r1
                return r1
        }

        public static io.netty.handler.codec.http2.Http2FrameLogger.Direction[] values() {
                io.netty.handler.codec.http2.Http2FrameLogger$Direction[] r0 = io.netty.handler.codec.http2.Http2FrameLogger.Direction.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.Http2FrameLogger$Direction[] r0 = (io.netty.handler.codec.http2.Http2FrameLogger.Direction[]) r0
                return r0
        }
    }

    public Http2FrameLogger(io.netty.handler.logging.LogLevel r2) {
            r1 = this;
            io.netty.util.internal.logging.InternalLogLevel r2 = r2.toInternalLevel()
            java.lang.Class<io.netty.handler.codec.http2.Http2FrameLogger> r0 = io.netty.handler.codec.http2.Http2FrameLogger.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            r1.<init>(r2, r0)
            return
    }

    public Http2FrameLogger(io.netty.handler.logging.LogLevel r1, java.lang.Class<?> r2) {
            r0 = this;
            io.netty.util.internal.logging.InternalLogLevel r1 = r1.toInternalLevel()
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r2)
            r0.<init>(r1, r2)
            return
    }

    public Http2FrameLogger(io.netty.handler.logging.LogLevel r1, java.lang.String r2) {
            r0 = this;
            io.netty.util.internal.logging.InternalLogLevel r1 = r1.toInternalLevel()
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r2)
            r0.<init>(r1, r2)
            return
    }

    private Http2FrameLogger(io.netty.util.internal.logging.InternalLogLevel r2, io.netty.util.internal.logging.InternalLogger r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "level"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.internal.logging.InternalLogLevel r2 = (io.netty.util.internal.logging.InternalLogLevel) r2
            r1.level = r2
            java.lang.String r2 = "logger"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.util.internal.logging.InternalLogger r2 = (io.netty.util.internal.logging.InternalLogger) r2
            r1.logger = r2
            return
    }

    private java.lang.String toString(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.util.internal.logging.InternalLogLevel r0 = r3.level
            io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.TRACE
            if (r0 == r1) goto L31
            int r0 = r4.readableBytes()
            r1 = 64
            if (r0 > r1) goto Lf
            goto L31
        Lf:
            int r0 = r4.readableBytes()
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.readerIndex()
            java.lang.String r4 = io.netty.buffer.ByteBufUtil.hexDump(r4, r2, r0)
            r1.append(r4)
            java.lang.String r4 = "..."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
        L31:
            java.lang.String r4 = io.netty.buffer.ByteBufUtil.hexDump(r4)
            return r4
    }

    public boolean isEnabled() {
            r2 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r2.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r2.level
            boolean r0 = r0.isEnabled(r1)
            return r0
    }

    public void logData(io.netty.handler.codec.http2.Http2FrameLogger.Direction r6, io.netty.channel.ChannelHandlerContext r7, int r8, io.netty.buffer.ByteBuf r9, int r10, boolean r11) {
            r5 = this;
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L47
            io.netty.util.internal.logging.InternalLogger r0 = r5.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r5.level
            io.netty.channel.Channel r7 = r7.channel()
            java.lang.String r6 = r6.name()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            int r2 = r9.readableBytes()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r9 = r5.toString(r9)
            r3 = 7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r7 = 1
            r3[r7] = r6
            r6 = 2
            r3[r6] = r8
            r6 = 3
            r3[r6] = r10
            r6 = 4
            r3[r6] = r11
            r6 = 5
            r3[r6] = r2
            r6 = 6
            r3[r6] = r9
            java.lang.String r6 = "{} {} DATA: streamId={} padding={} endStream={} length={} bytes={}"
            r0.log(r1, r6, r3)
        L47:
            return
    }

    public void logGoAway(io.netty.handler.codec.http2.Http2FrameLogger.Direction r5, io.netty.channel.ChannelHandlerContext r6, int r7, long r8, io.netty.buffer.ByteBuf r10) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L40
            io.netty.util.internal.logging.InternalLogger r0 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r4.level
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r5 = r5.name()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r9 = r10.readableBytes()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = r4.toString(r10)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r8
            r5 = 4
            r2[r5] = r9
            r5 = 5
            r2[r5] = r10
            java.lang.String r5 = "{} {} GO_AWAY: lastStreamId={} errorCode={} length={} bytes={}"
            r0.log(r1, r5, r2)
        L40:
            return
    }

    public void logHeaders(io.netty.handler.codec.http2.Http2FrameLogger.Direction r5, io.netty.channel.ChannelHandlerContext r6, int r7, io.netty.handler.codec.http2.Http2Headers r8, int r9, short r10, boolean r11, int r12, boolean r13) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L4f
            io.netty.util.internal.logging.InternalLogger r0 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r4.level
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r5 = r5.name()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Short r10 = java.lang.Short.valueOf(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r2 = 9
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r8
            r5 = 4
            r2[r5] = r9
            r5 = 5
            r2[r5] = r10
            r5 = 6
            r2[r5] = r11
            r5 = 7
            r2[r5] = r12
            r5 = 8
            r2[r5] = r13
            java.lang.String r5 = "{} {} HEADERS: streamId={} headers={} streamDependency={} weight={} exclusive={} padding={} endStream={}"
            r0.log(r1, r5, r2)
        L4f:
            return
    }

    public void logHeaders(io.netty.handler.codec.http2.Http2FrameLogger.Direction r5, io.netty.channel.ChannelHandlerContext r6, int r7, io.netty.handler.codec.http2.Http2Headers r8, int r9, boolean r10) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L38
            io.netty.util.internal.logging.InternalLogger r0 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r4.level
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r5 = r5.name()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r8
            r5 = 4
            r2[r5] = r9
            r5 = 5
            r2[r5] = r10
            java.lang.String r5 = "{} {} HEADERS: streamId={} headers={} padding={} endStream={}"
            r0.log(r1, r5, r2)
        L38:
            return
    }

    public void logPing(io.netty.handler.codec.http2.Http2FrameLogger.Direction r4, io.netty.channel.ChannelHandlerContext r5, long r6) {
            r3 = this;
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L27
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.level
            io.netty.channel.Channel r5 = r5.channel()
            java.lang.String r4 = r4.name()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2 = 0
            r7[r2] = r5
            r5 = 1
            r7[r5] = r4
            r4 = 2
            r7[r4] = r6
            java.lang.String r4 = "{} {} PING: ack=false bytes={}"
            r0.log(r1, r4, r7)
        L27:
            return
    }

    public void logPingAck(io.netty.handler.codec.http2.Http2FrameLogger.Direction r4, io.netty.channel.ChannelHandlerContext r5, long r6) {
            r3 = this;
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L27
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.level
            io.netty.channel.Channel r5 = r5.channel()
            java.lang.String r4 = r4.name()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2 = 0
            r7[r2] = r5
            r5 = 1
            r7[r5] = r4
            r4 = 2
            r7[r4] = r6
            java.lang.String r4 = "{} {} PING: ack=true bytes={}"
            r0.log(r1, r4, r7)
        L27:
            return
    }

    public void logPriority(io.netty.handler.codec.http2.Http2FrameLogger.Direction r5, io.netty.channel.ChannelHandlerContext r6, int r7, int r8, short r9, boolean r10) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L3c
            io.netty.util.internal.logging.InternalLogger r0 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r4.level
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r5 = r5.name()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r8
            r5 = 4
            r2[r5] = r9
            r5 = 5
            r2[r5] = r10
            java.lang.String r5 = "{} {} PRIORITY: streamId={} streamDependency={} weight={} exclusive={}"
            r0.log(r1, r5, r2)
        L3c:
            return
    }

    public void logPushPromise(io.netty.handler.codec.http2.Http2FrameLogger.Direction r5, io.netty.channel.ChannelHandlerContext r6, int r7, int r8, io.netty.handler.codec.http2.Http2Headers r9, int r10) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L38
            io.netty.util.internal.logging.InternalLogger r0 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r4.level
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r5 = r5.name()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r8
            r5 = 4
            r2[r5] = r9
            r5 = 5
            r2[r5] = r10
            java.lang.String r5 = "{} {} PUSH_PROMISE: streamId={} promisedStreamId={} headers={} padding={}"
            r0.log(r1, r5, r2)
        L38:
            return
    }

    public void logRstStream(io.netty.handler.codec.http2.Http2FrameLogger.Direction r4, io.netty.channel.ChannelHandlerContext r5, int r6, long r7) {
            r3 = this;
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L2e
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.level
            io.netty.channel.Channel r5 = r5.channel()
            java.lang.String r4 = r4.name()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r2 = 0
            r8[r2] = r5
            r5 = 1
            r8[r5] = r4
            r4 = 2
            r8[r4] = r6
            r4 = 3
            r8[r4] = r7
            java.lang.String r4 = "{} {} RST_STREAM: streamId={} errorCode={}"
            r0.log(r1, r4, r8)
        L2e:
            return
    }

    public void logSettings(io.netty.handler.codec.http2.Http2FrameLogger.Direction r5, io.netty.channel.ChannelHandlerContext r6, io.netty.handler.codec.http2.Http2Settings r7) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L23
            io.netty.util.internal.logging.InternalLogger r0 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r4.level
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r5 = r5.name()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r7
            java.lang.String r5 = "{} {} SETTINGS: ack=false settings={}"
            r0.log(r1, r5, r2)
        L23:
            return
    }

    public void logSettingsAck(io.netty.handler.codec.http2.Http2FrameLogger.Direction r4, io.netty.channel.ChannelHandlerContext r5) {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.level
            io.netty.channel.Channel r5 = r5.channel()
            java.lang.String r4 = r4.name()
            java.lang.String r2 = "{} {} SETTINGS: ack=true"
            r0.log(r1, r2, r5, r4)
            return
    }

    public void logUnknownFrame(io.netty.handler.codec.http2.Http2FrameLogger.Direction r6, io.netty.channel.ChannelHandlerContext r7, byte r8, int r9, io.netty.handler.codec.http2.Http2Flags r10, io.netty.buffer.ByteBuf r11) {
            r5 = this;
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L4d
            io.netty.util.internal.logging.InternalLogger r0 = r5.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r5.level
            io.netty.channel.Channel r7 = r7.channel()
            java.lang.String r6 = r6.name()
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            short r10 = r10.value()
            java.lang.Short r10 = java.lang.Short.valueOf(r10)
            int r2 = r11.readableBytes()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = r5.toString(r11)
            r3 = 7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r7 = 1
            r3[r7] = r6
            r6 = 2
            r3[r6] = r8
            r6 = 3
            r3[r6] = r9
            r6 = 4
            r3[r6] = r10
            r6 = 5
            r3[r6] = r2
            r6 = 6
            r3[r6] = r11
            java.lang.String r6 = "{} {} UNKNOWN: frameType={} streamId={} flags={} length={} bytes={}"
            r0.log(r1, r6, r3)
        L4d:
            return
    }

    public void logWindowsUpdate(io.netty.handler.codec.http2.Http2FrameLogger.Direction r5, io.netty.channel.ChannelHandlerContext r6, int r7, int r8) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            io.netty.util.internal.logging.InternalLogger r0 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r4.level
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r5 = r5.name()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r8
            java.lang.String r5 = "{} {} WINDOW_UPDATE: streamId={} windowSizeIncrement={}"
            r0.log(r1, r5, r2)
        L2e:
            return
    }
}

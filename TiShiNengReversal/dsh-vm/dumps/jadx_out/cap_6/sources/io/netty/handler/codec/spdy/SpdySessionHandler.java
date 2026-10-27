package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdySessionHandler extends io.netty.channel.ChannelDuplexHandler {
    private static final int DEFAULT_MAX_CONCURRENT_STREAMS = Integer.MAX_VALUE;
    private static final int DEFAULT_WINDOW_SIZE = 65536;
    private static final io.netty.handler.codec.spdy.SpdyProtocolException PROTOCOL_EXCEPTION = null;
    private static final io.netty.handler.codec.spdy.SpdyProtocolException STREAM_CLOSED = null;
    private io.netty.channel.ChannelFutureListener closeSessionFutureListener;
    private int initialReceiveWindowSize;
    private int initialSendWindowSize;
    private volatile int initialSessionReceiveWindowSize;
    private int lastGoodStreamId;
    private int localConcurrentStreams;
    private final int minorVersion;
    private final java.util.concurrent.atomic.AtomicInteger pings;
    private boolean receivedGoAwayFrame;
    private int remoteConcurrentStreams;
    private boolean sentGoAwayFrame;
    private final boolean server;
    private final io.netty.handler.codec.spdy.SpdySession spdySession;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ClosingChannelFutureListener implements io.netty.channel.ChannelFutureListener {
        private final io.netty.channel.ChannelHandlerContext ctx;
        private final io.netty.channel.ChannelPromise promise;

        ClosingChannelFutureListener(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                r0.<init>()
                r0.ctx = r1
                r0.promise = r2
                return
        }

        public void operationComplete(io.netty.channel.ChannelFuture r2) throws java.lang.Exception {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r2 = r1.ctx
                io.netty.channel.ChannelPromise r0 = r1.promise
                r2.close(r0)
                return
        }

        public /* bridge */ /* synthetic */ void operationComplete(io.netty.util.concurrent.Future r1) throws java.lang.Exception {
                r0 = this;
                io.netty.channel.ChannelFuture r1 = (io.netty.channel.ChannelFuture) r1
                r0.operationComplete(r1)
                return
        }
    }

    static {
            r0 = 0
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = io.netty.handler.codec.spdy.SpdyProtocolException.newStatic(r0)
            java.lang.String r1 = "handleOutboundMessage(...)"
            java.lang.Class<io.netty.handler.codec.spdy.SpdySessionHandler> r2 = io.netty.handler.codec.spdy.SpdySessionHandler.class
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r2, r1)
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = (io.netty.handler.codec.spdy.SpdyProtocolException) r0
            io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION = r0
            java.lang.String r0 = "Stream closed"
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = io.netty.handler.codec.spdy.SpdyProtocolException.newStatic(r0)
            java.lang.String r1 = "removeStream(...)"
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r2, r1)
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = (io.netty.handler.codec.spdy.SpdyProtocolException) r0
            io.netty.handler.codec.spdy.SpdySessionHandler.STREAM_CLOSED = r0
            return
    }

    public SpdySessionHandler(io.netty.handler.codec.spdy.SpdyVersion r4, boolean r5) {
            r3 = this;
            r3.<init>()
            r0 = 65536(0x10000, float:9.1835E-41)
            r3.initialSendWindowSize = r0
            r3.initialReceiveWindowSize = r0
            r3.initialSessionReceiveWindowSize = r0
            io.netty.handler.codec.spdy.SpdySession r0 = new io.netty.handler.codec.spdy.SpdySession
            int r1 = r3.initialSendWindowSize
            int r2 = r3.initialReceiveWindowSize
            r0.<init>(r1, r2)
            r3.spdySession = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.remoteConcurrentStreams = r0
            r3.localConcurrentStreams = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r3.pings = r0
            if (r4 == 0) goto L2f
            r3.server = r5
            int r4 = r4.getMinorVersion()
            r3.minorVersion = r4
            return
        L2f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "version"
            r4.<init>(r5)
            throw r4
    }

    private boolean acceptStream(int r11, byte r12, boolean r13, boolean r14) {
            r10 = this;
            boolean r0 = r10.receivedGoAwayFrame
            r1 = 0
            if (r0 != 0) goto L31
            boolean r0 = r10.sentGoAwayFrame
            if (r0 == 0) goto La
            goto L31
        La:
            boolean r9 = r10.isRemoteInitiatedId(r11)
            if (r9 == 0) goto L13
            int r0 = r10.localConcurrentStreams
            goto L15
        L13:
            int r0 = r10.remoteConcurrentStreams
        L15:
            io.netty.handler.codec.spdy.SpdySession r2 = r10.spdySession
            int r2 = r2.numActiveStreams(r9)
            if (r2 < r0) goto L1e
            return r1
        L1e:
            io.netty.handler.codec.spdy.SpdySession r2 = r10.spdySession
            int r7 = r10.initialSendWindowSize
            int r8 = r10.initialReceiveWindowSize
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.acceptStream(r3, r4, r5, r6, r7, r8, r9)
            if (r9 == 0) goto L2f
            r10.lastGoodStreamId = r3
        L2f:
            r11 = 1
            return r11
        L31:
            return r1
    }

    static /* synthetic */ void access$000(io.netty.handler.codec.spdy.SpdySessionHandler r0, io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.spdy.SpdySessionStatus r2) {
            r0.issueSessionError(r1, r2)
            return
    }

    private void halfCloseStream(int r2, boolean r3, io.netty.channel.ChannelFuture r4) {
            r1 = this;
            if (r3 == 0) goto Lc
            io.netty.handler.codec.spdy.SpdySession r3 = r1.spdySession
            boolean r0 = r1.isRemoteInitiatedId(r2)
            r3.closeRemoteSide(r2, r0)
            goto L15
        Lc:
            io.netty.handler.codec.spdy.SpdySession r3 = r1.spdySession
            boolean r0 = r1.isRemoteInitiatedId(r2)
            r3.closeLocalSide(r2, r0)
        L15:
            io.netty.channel.ChannelFutureListener r2 = r1.closeSessionFutureListener
            if (r2 == 0) goto L26
            io.netty.handler.codec.spdy.SpdySession r2 = r1.spdySession
            boolean r2 = r2.noActiveStreams()
            if (r2 == 0) goto L26
            io.netty.channel.ChannelFutureListener r2 = r1.closeSessionFutureListener
            r4.addListener(r2)
        L26:
            return
    }

    private void handleOutboundMessage(io.netty.channel.ChannelHandlerContext r7, java.lang.Object r8, io.netty.channel.ChannelPromise r9) throws java.lang.Exception {
            r6 = this;
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdyDataFrame
            r1 = 0
            if (r0 == 0) goto L93
            r0 = r8
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = (io.netty.handler.codec.spdy.SpdyDataFrame) r0
            int r2 = r0.streamId()
            io.netty.handler.codec.spdy.SpdySession r3 = r6.spdySession
            boolean r3 = r3.isLocalSideClosed(r2)
            if (r3 == 0) goto L1d
            r0.release()
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        L1d:
            io.netty.buffer.ByteBuf r3 = r0.content()
            int r3 = r3.readableBytes()
            io.netty.handler.codec.spdy.SpdySession r4 = r6.spdySession
            int r4 = r4.getSendWindowSize(r2)
            io.netty.handler.codec.spdy.SpdySession r5 = r6.spdySession
            int r5 = r5.getSendWindowSize(r1)
            int r4 = java.lang.Math.min(r4, r5)
            if (r4 > 0) goto L42
            io.netty.handler.codec.spdy.SpdySession r7 = r6.spdySession
            io.netty.handler.codec.spdy.SpdySession$PendingWrite r8 = new io.netty.handler.codec.spdy.SpdySession$PendingWrite
            r8.<init>(r0, r9)
            r7.putPendingWrite(r2, r8)
            return
        L42:
            if (r4 >= r3) goto L74
            io.netty.handler.codec.spdy.SpdySession r8 = r6.spdySession
            int r3 = r4 * (-1)
            r8.updateSendWindowSize(r2, r3)
            io.netty.handler.codec.spdy.SpdySession r8 = r6.spdySession
            r8.updateSendWindowSize(r1, r3)
            io.netty.handler.codec.spdy.DefaultSpdyDataFrame r8 = new io.netty.handler.codec.spdy.DefaultSpdyDataFrame
            io.netty.buffer.ByteBuf r1 = r0.content()
            io.netty.buffer.ByteBuf r1 = r1.readRetainedSlice(r4)
            r8.<init>(r2, r1)
            io.netty.handler.codec.spdy.SpdySession r1 = r6.spdySession
            io.netty.handler.codec.spdy.SpdySession$PendingWrite r3 = new io.netty.handler.codec.spdy.SpdySession$PendingWrite
            r3.<init>(r0, r9)
            r1.putPendingWrite(r2, r3)
            io.netty.channel.ChannelFuture r8 = r7.write(r8)
            io.netty.handler.codec.spdy.SpdySessionHandler$1 r9 = new io.netty.handler.codec.spdy.SpdySessionHandler$1
            r9.<init>(r6, r7)
            r8.addListener(r9)
            return
        L74:
            io.netty.handler.codec.spdy.SpdySession r4 = r6.spdySession
            int r3 = r3 * (-1)
            r4.updateSendWindowSize(r2, r3)
            io.netty.handler.codec.spdy.SpdySession r4 = r6.spdySession
            r4.updateSendWindowSize(r1, r3)
            io.netty.handler.codec.spdy.SpdySessionHandler$2 r3 = new io.netty.handler.codec.spdy.SpdySessionHandler$2
            r3.<init>(r6, r7)
            r9.addListener(r3)
            boolean r0 = r0.isLast()
            if (r0 == 0) goto L1a0
            r6.halfCloseStream(r2, r1, r9)
            goto L1a0
        L93:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdySynStreamFrame
            if (r0 == 0) goto Lc2
            r0 = r8
            io.netty.handler.codec.spdy.SpdySynStreamFrame r0 = (io.netty.handler.codec.spdy.SpdySynStreamFrame) r0
            int r1 = r0.streamId()
            boolean r2 = r6.isRemoteInitiatedId(r1)
            if (r2 == 0) goto Laa
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        Laa:
            byte r2 = r0.priority()
            boolean r3 = r0.isUnidirectional()
            boolean r0 = r0.isLast()
            boolean r0 = r6.acceptStream(r1, r2, r3, r0)
            if (r0 != 0) goto L1a0
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        Lc2:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdySynReplyFrame
            if (r0 == 0) goto Led
            r0 = r8
            io.netty.handler.codec.spdy.SpdySynReplyFrame r0 = (io.netty.handler.codec.spdy.SpdySynReplyFrame) r0
            int r2 = r0.streamId()
            boolean r3 = r6.isRemoteInitiatedId(r2)
            if (r3 == 0) goto Le7
            io.netty.handler.codec.spdy.SpdySession r3 = r6.spdySession
            boolean r3 = r3.isLocalSideClosed(r2)
            if (r3 == 0) goto Ldc
            goto Le7
        Ldc:
            boolean r0 = r0.isLast()
            if (r0 == 0) goto L1a0
            r6.halfCloseStream(r2, r1, r9)
            goto L1a0
        Le7:
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        Led:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdyRstStreamFrame
            if (r0 == 0) goto Lfd
            r0 = r8
            io.netty.handler.codec.spdy.SpdyRstStreamFrame r0 = (io.netty.handler.codec.spdy.SpdyRstStreamFrame) r0
            int r0 = r0.streamId()
            r6.removeStream(r0, r9)
            goto L1a0
        Lfd:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdySettingsFrame
            if (r0 == 0) goto L134
            r0 = r8
            io.netty.handler.codec.spdy.SpdySettingsFrame r0 = (io.netty.handler.codec.spdy.SpdySettingsFrame) r0
            int r2 = r0.getValue(r1)
            if (r2 < 0) goto L114
            int r3 = r6.minorVersion
            if (r2 == r3) goto L114
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        L114:
            r2 = 4
            int r2 = r0.getValue(r2)
            if (r2 < 0) goto L11d
            r6.localConcurrentStreams = r2
        L11d:
            r2 = 7
            boolean r3 = r0.isPersisted(r2)
            if (r3 == 0) goto L127
            r0.removeValue(r2)
        L127:
            r0.setPersistValue(r2, r1)
            int r0 = r0.getValue(r2)
            if (r0 < 0) goto L1a0
            r6.updateInitialReceiveWindowSize(r0)
            goto L1a0
        L134:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdyPingFrame
            if (r0 == 0) goto L169
            r0 = r8
            io.netty.handler.codec.spdy.SpdyPingFrame r0 = (io.netty.handler.codec.spdy.SpdyPingFrame) r0
            int r1 = r0.id()
            boolean r1 = r6.isRemoteInitiatedId(r1)
            if (r1 == 0) goto L163
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "invalid PING ID: "
            r9.append(r1)
            int r0 = r0.id()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r7.fireExceptionCaught(r8)
            return
        L163:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.pings
            r0.getAndIncrement()
            goto L1a0
        L169:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdyGoAwayFrame
            if (r0 == 0) goto L173
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        L173:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdyHeadersFrame
            if (r0 == 0) goto L196
            r0 = r8
            io.netty.handler.codec.spdy.SpdyHeadersFrame r0 = (io.netty.handler.codec.spdy.SpdyHeadersFrame) r0
            int r2 = r0.streamId()
            io.netty.handler.codec.spdy.SpdySession r3 = r6.spdySession
            boolean r3 = r3.isLocalSideClosed(r2)
            if (r3 == 0) goto L18c
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        L18c:
            boolean r0 = r0.isLast()
            if (r0 == 0) goto L1a0
            r6.halfCloseStream(r2, r1, r9)
            goto L1a0
        L196:
            boolean r0 = r8 instanceof io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
            if (r0 == 0) goto L1a0
            io.netty.handler.codec.spdy.SpdyProtocolException r7 = io.netty.handler.codec.spdy.SpdySessionHandler.PROTOCOL_EXCEPTION
            r9.setFailure(r7)
            return
        L1a0:
            r7.write(r8, r9)
            return
    }

    private boolean isRemoteInitiatedId(int r2) {
            r1 = this;
            boolean r2 = io.netty.handler.codec.spdy.SpdyCodecUtil.isServerId(r2)
            boolean r0 = r1.server
            if (r0 == 0) goto La
            if (r2 == 0) goto Le
        La:
            if (r0 != 0) goto L10
            if (r2 == 0) goto L10
        Le:
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private void issueSessionError(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.spdy.SpdySessionStatus r4) {
            r2 = this;
            io.netty.channel.ChannelFuture r4 = r2.sendGoAwayFrame(r3, r4)
            io.netty.handler.codec.spdy.SpdySessionHandler$ClosingChannelFutureListener r0 = new io.netty.handler.codec.spdy.SpdySessionHandler$ClosingChannelFutureListener
            io.netty.channel.ChannelPromise r1 = r3.newPromise()
            r0.<init>(r3, r1)
            r4.addListener(r0)
            return
    }

    private void issueStreamError(io.netty.channel.ChannelHandlerContext r4, int r5, io.netty.handler.codec.spdy.SpdyStreamStatus r6) {
            r3 = this;
            io.netty.handler.codec.spdy.SpdySession r0 = r3.spdySession
            boolean r0 = r0.isRemoteSideClosed(r5)
            io.netty.channel.ChannelPromise r1 = r4.newPromise()
            r3.removeStream(r5, r1)
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r2 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            r2.<init>(r5, r6)
            r4.writeAndFlush(r2, r1)
            if (r0 != 0) goto L1a
            r4.fireChannelRead(r2)
        L1a:
            return
    }

    private void removeStream(int r4, io.netty.channel.ChannelFuture r5) {
            r3 = this;
            io.netty.handler.codec.spdy.SpdySession r0 = r3.spdySession
            io.netty.handler.codec.spdy.SpdyProtocolException r1 = io.netty.handler.codec.spdy.SpdySessionHandler.STREAM_CLOSED
            boolean r2 = r3.isRemoteInitiatedId(r4)
            r0.removeStream(r4, r1, r2)
            io.netty.channel.ChannelFutureListener r4 = r3.closeSessionFutureListener
            if (r4 == 0) goto L1c
            io.netty.handler.codec.spdy.SpdySession r4 = r3.spdySession
            boolean r4 = r4.noActiveStreams()
            if (r4 == 0) goto L1c
            io.netty.channel.ChannelFutureListener r4 = r3.closeSessionFutureListener
            r5.addListener(r4)
        L1c:
            return
    }

    private io.netty.channel.ChannelFuture sendGoAwayFrame(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.spdy.SpdySessionStatus r4) {
            r2 = this;
            boolean r0 = r2.sentGoAwayFrame
            if (r0 != 0) goto L13
            r0 = 1
            r2.sentGoAwayFrame = r0
            io.netty.handler.codec.spdy.DefaultSpdyGoAwayFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyGoAwayFrame
            int r1 = r2.lastGoodStreamId
            r0.<init>(r1, r4)
            io.netty.channel.ChannelFuture r3 = r3.writeAndFlush(r0)
            return r3
        L13:
            io.netty.channel.ChannelFuture r3 = r3.newSucceededFuture()
            return r3
    }

    private void sendGoAwayFrame(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.Channel r0 = r3.channel()
            boolean r0 = r0.isActive()
            if (r0 != 0) goto Le
            r3.close(r4)
            return
        Le:
            io.netty.handler.codec.spdy.SpdySessionStatus r0 = io.netty.handler.codec.spdy.SpdySessionStatus.OK
            io.netty.channel.ChannelFuture r0 = r2.sendGoAwayFrame(r3, r0)
            io.netty.handler.codec.spdy.SpdySession r1 = r2.spdySession
            boolean r1 = r1.noActiveStreams()
            if (r1 == 0) goto L25
            io.netty.handler.codec.spdy.SpdySessionHandler$ClosingChannelFutureListener r1 = new io.netty.handler.codec.spdy.SpdySessionHandler$ClosingChannelFutureListener
            r1.<init>(r3, r4)
            r0.addListener(r1)
            return
        L25:
            io.netty.handler.codec.spdy.SpdySessionHandler$ClosingChannelFutureListener r0 = new io.netty.handler.codec.spdy.SpdySessionHandler$ClosingChannelFutureListener
            r0.<init>(r3, r4)
            r2.closeSessionFutureListener = r0
            return
    }

    private void updateInitialReceiveWindowSize(int r2) {
            r1 = this;
            int r0 = r1.initialReceiveWindowSize
            int r0 = r2 - r0
            r1.initialReceiveWindowSize = r2
            io.netty.handler.codec.spdy.SpdySession r2 = r1.spdySession
            r2.updateAllReceiveWindowSizes(r0)
            return
    }

    private void updateInitialSendWindowSize(int r2) {
            r1 = this;
            int r0 = r1.initialSendWindowSize
            int r0 = r2 - r0
            r1.initialSendWindowSize = r2
            io.netty.handler.codec.spdy.SpdySession r2 = r1.spdySession
            r2.updateAllSendWindowSizes(r0)
            return
    }

    private void updateSendWindowSize(io.netty.channel.ChannelHandlerContext r7, int r8, int r9) {
            r6 = this;
            io.netty.handler.codec.spdy.SpdySession r0 = r6.spdySession
            r0.updateSendWindowSize(r8, r9)
        L5:
            io.netty.handler.codec.spdy.SpdySession r9 = r6.spdySession
            io.netty.handler.codec.spdy.SpdySession$PendingWrite r9 = r9.getPendingWrite(r8)
            if (r9 != 0) goto Le
            goto L2f
        Le:
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r9.spdyDataFrame
            io.netty.buffer.ByteBuf r1 = r0.content()
            int r1 = r1.readableBytes()
            int r2 = r0.streamId()
            io.netty.handler.codec.spdy.SpdySession r3 = r6.spdySession
            int r3 = r3.getSendWindowSize(r2)
            io.netty.handler.codec.spdy.SpdySession r4 = r6.spdySession
            r5 = 0
            int r4 = r4.getSendWindowSize(r5)
            int r3 = java.lang.Math.min(r3, r4)
            if (r3 > 0) goto L30
        L2f:
            return
        L30:
            if (r3 >= r1) goto L58
            io.netty.handler.codec.spdy.SpdySession r9 = r6.spdySession
            int r1 = r3 * (-1)
            r9.updateSendWindowSize(r2, r1)
            io.netty.handler.codec.spdy.SpdySession r9 = r6.spdySession
            r9.updateSendWindowSize(r5, r1)
            io.netty.handler.codec.spdy.DefaultSpdyDataFrame r9 = new io.netty.handler.codec.spdy.DefaultSpdyDataFrame
            io.netty.buffer.ByteBuf r0 = r0.content()
            io.netty.buffer.ByteBuf r0 = r0.readRetainedSlice(r3)
            r9.<init>(r2, r0)
            io.netty.channel.ChannelFuture r9 = r7.writeAndFlush(r9)
            io.netty.handler.codec.spdy.SpdySessionHandler$3 r0 = new io.netty.handler.codec.spdy.SpdySessionHandler$3
            r0.<init>(r6, r7)
            r9.addListener(r0)
            goto L5
        L58:
            io.netty.handler.codec.spdy.SpdySession r3 = r6.spdySession
            r3.removePendingWrite(r2)
            io.netty.handler.codec.spdy.SpdySession r3 = r6.spdySession
            int r1 = r1 * (-1)
            r3.updateSendWindowSize(r2, r1)
            io.netty.handler.codec.spdy.SpdySession r3 = r6.spdySession
            r3.updateSendWindowSize(r5, r1)
            boolean r1 = r0.isLast()
            if (r1 == 0) goto L74
            io.netty.channel.ChannelPromise r1 = r9.promise
            r6.halfCloseStream(r2, r5, r1)
        L74:
            io.netty.channel.ChannelPromise r9 = r9.promise
            io.netty.channel.ChannelFuture r9 = r7.writeAndFlush(r0, r9)
            io.netty.handler.codec.spdy.SpdySessionHandler$4 r0 = new io.netty.handler.codec.spdy.SpdySessionHandler$4
            r0.<init>(r6, r7)
            r9.addListener(r0)
            goto L5
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.handler.codec.spdy.SpdySession r0 = r3.spdySession
            java.util.Map r0 = r0.activeStreams()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            io.netty.channel.ChannelFuture r2 = r4.newSucceededFuture()
            r3.removeStream(r1, r2)
            goto Le
        L26:
            r4.fireChannelInactive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r8, java.lang.Object r9) throws java.lang.Exception {
            r7 = this;
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdyDataFrame
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le5
            r0 = r9
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = (io.netty.handler.codec.spdy.SpdyDataFrame) r0
            int r3 = r0.streamId()
            io.netty.buffer.ByteBuf r4 = r0.content()
            int r4 = r4.readableBytes()
            int r4 = r4 * (-1)
            io.netty.handler.codec.spdy.SpdySession r5 = r7.spdySession
            int r5 = r5.updateReceiveWindowSize(r2, r4)
            if (r5 >= 0) goto L25
            io.netty.handler.codec.spdy.SpdySessionStatus r9 = io.netty.handler.codec.spdy.SpdySessionStatus.PROTOCOL_ERROR
            r7.issueSessionError(r8, r9)
            return
        L25:
            int r6 = r7.initialSessionReceiveWindowSize
            int r6 = r6 / 2
            if (r5 > r6) goto L3b
            int r6 = r7.initialSessionReceiveWindowSize
            int r6 = r6 - r5
            io.netty.handler.codec.spdy.SpdySession r5 = r7.spdySession
            r5.updateReceiveWindowSize(r2, r6)
            io.netty.handler.codec.spdy.DefaultSpdyWindowUpdateFrame r5 = new io.netty.handler.codec.spdy.DefaultSpdyWindowUpdateFrame
            r5.<init>(r2, r6)
            r8.writeAndFlush(r5)
        L3b:
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            boolean r2 = r2.isActiveStream(r3)
            if (r2 != 0) goto L5a
            r0.release()
            int r9 = r7.lastGoodStreamId
            if (r3 > r9) goto L50
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r7.issueStreamError(r8, r3, r9)
            return
        L50:
            boolean r9 = r7.sentGoAwayFrame
            if (r9 != 0) goto L239
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_STREAM
            r7.issueStreamError(r8, r3, r9)
            return
        L5a:
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            boolean r2 = r2.isRemoteSideClosed(r3)
            if (r2 == 0) goto L6b
            r0.release()
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.STREAM_ALREADY_CLOSED
            r7.issueStreamError(r8, r3, r9)
            return
        L6b:
            boolean r2 = r7.isRemoteInitiatedId(r3)
            if (r2 != 0) goto L82
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            boolean r2 = r2.hasReceivedReply(r3)
            if (r2 != 0) goto L82
            r0.release()
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r7.issueStreamError(r8, r3, r9)
            return
        L82:
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            int r2 = r2.updateReceiveWindowSize(r3, r4)
            io.netty.handler.codec.spdy.SpdySession r4 = r7.spdySession
            int r4 = r4.getReceiveWindowSizeLowerBound(r3)
            if (r2 >= r4) goto L99
            r0.release()
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.FLOW_CONTROL_ERROR
            r7.issueStreamError(r8, r3, r9)
            return
        L99:
            if (r2 >= 0) goto Lba
        L9b:
            io.netty.buffer.ByteBuf r4 = r0.content()
            int r4 = r4.readableBytes()
            int r5 = r7.initialReceiveWindowSize
            if (r4 <= r5) goto Lba
            io.netty.handler.codec.spdy.DefaultSpdyDataFrame r4 = new io.netty.handler.codec.spdy.DefaultSpdyDataFrame
            io.netty.buffer.ByteBuf r5 = r0.content()
            int r6 = r7.initialReceiveWindowSize
            io.netty.buffer.ByteBuf r5 = r5.readRetainedSlice(r6)
            r4.<init>(r3, r5)
            r8.writeAndFlush(r4)
            goto L9b
        Lba:
            int r4 = r7.initialReceiveWindowSize
            int r4 = r4 / 2
            if (r2 > r4) goto Ld6
            boolean r4 = r0.isLast()
            if (r4 != 0) goto Ld6
            int r4 = r7.initialReceiveWindowSize
            int r4 = r4 - r2
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            r2.updateReceiveWindowSize(r3, r4)
            io.netty.handler.codec.spdy.DefaultSpdyWindowUpdateFrame r2 = new io.netty.handler.codec.spdy.DefaultSpdyWindowUpdateFrame
            r2.<init>(r3, r4)
            r8.writeAndFlush(r2)
        Ld6:
            boolean r0 = r0.isLast()
            if (r0 == 0) goto L257
            io.netty.channel.ChannelFuture r0 = r8.newSucceededFuture()
            r7.halfCloseStream(r3, r1, r0)
            goto L257
        Le5:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdySynStreamFrame
            if (r0 == 0) goto L12d
            r0 = r9
            io.netty.handler.codec.spdy.SpdySynStreamFrame r0 = (io.netty.handler.codec.spdy.SpdySynStreamFrame) r0
            int r1 = r0.streamId()
            boolean r2 = r0.isInvalid()
            if (r2 != 0) goto L127
            boolean r2 = r7.isRemoteInitiatedId(r1)
            if (r2 == 0) goto L127
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            boolean r2 = r2.isActiveStream(r1)
            if (r2 == 0) goto L105
            goto L127
        L105:
            int r2 = r7.lastGoodStreamId
            if (r1 > r2) goto L10f
            io.netty.handler.codec.spdy.SpdySessionStatus r9 = io.netty.handler.codec.spdy.SpdySessionStatus.PROTOCOL_ERROR
            r7.issueSessionError(r8, r9)
            return
        L10f:
            byte r2 = r0.priority()
            boolean r3 = r0.isLast()
            boolean r0 = r0.isUnidirectional()
            boolean r0 = r7.acceptStream(r1, r2, r3, r0)
            if (r0 != 0) goto L257
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.REFUSED_STREAM
            r7.issueStreamError(r8, r1, r9)
            return
        L127:
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r7.issueStreamError(r8, r1, r9)
            return
        L12d:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdySynReplyFrame
            if (r0 == 0) goto L175
            r0 = r9
            io.netty.handler.codec.spdy.SpdySynReplyFrame r0 = (io.netty.handler.codec.spdy.SpdySynReplyFrame) r0
            int r2 = r0.streamId()
            boolean r3 = r0.isInvalid()
            if (r3 != 0) goto L16f
            boolean r3 = r7.isRemoteInitiatedId(r2)
            if (r3 != 0) goto L16f
            io.netty.handler.codec.spdy.SpdySession r3 = r7.spdySession
            boolean r3 = r3.isRemoteSideClosed(r2)
            if (r3 == 0) goto L14d
            goto L16f
        L14d:
            io.netty.handler.codec.spdy.SpdySession r3 = r7.spdySession
            boolean r3 = r3.hasReceivedReply(r2)
            if (r3 == 0) goto L15b
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.STREAM_IN_USE
            r7.issueStreamError(r8, r2, r9)
            return
        L15b:
            io.netty.handler.codec.spdy.SpdySession r3 = r7.spdySession
            r3.receivedReply(r2)
            boolean r0 = r0.isLast()
            if (r0 == 0) goto L257
            io.netty.channel.ChannelFuture r0 = r8.newSucceededFuture()
            r7.halfCloseStream(r2, r1, r0)
            goto L257
        L16f:
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_STREAM
            r7.issueStreamError(r8, r2, r9)
            return
        L175:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdyRstStreamFrame
            if (r0 == 0) goto L189
            r0 = r9
            io.netty.handler.codec.spdy.SpdyRstStreamFrame r0 = (io.netty.handler.codec.spdy.SpdyRstStreamFrame) r0
            int r0 = r0.streamId()
            io.netty.channel.ChannelFuture r1 = r8.newSucceededFuture()
            r7.removeStream(r0, r1)
            goto L257
        L189:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdySettingsFrame
            if (r0 == 0) goto L1c1
            r0 = r9
            io.netty.handler.codec.spdy.SpdySettingsFrame r0 = (io.netty.handler.codec.spdy.SpdySettingsFrame) r0
            int r1 = r0.getValue(r2)
            if (r1 < 0) goto L1a0
            int r3 = r7.minorVersion
            if (r1 == r3) goto L1a0
            io.netty.handler.codec.spdy.SpdySessionStatus r9 = io.netty.handler.codec.spdy.SpdySessionStatus.PROTOCOL_ERROR
            r7.issueSessionError(r8, r9)
            return
        L1a0:
            r1 = 4
            int r1 = r0.getValue(r1)
            if (r1 < 0) goto L1a9
            r7.remoteConcurrentStreams = r1
        L1a9:
            r1 = 7
            boolean r3 = r0.isPersisted(r1)
            if (r3 == 0) goto L1b3
            r0.removeValue(r1)
        L1b3:
            r0.setPersistValue(r1, r2)
            int r0 = r0.getValue(r1)
            if (r0 < 0) goto L257
            r7.updateInitialSendWindowSize(r0)
            goto L257
        L1c1:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdyPingFrame
            if (r0 == 0) goto L1e6
            r0 = r9
            io.netty.handler.codec.spdy.SpdyPingFrame r0 = (io.netty.handler.codec.spdy.SpdyPingFrame) r0
            int r1 = r0.id()
            boolean r1 = r7.isRemoteInitiatedId(r1)
            if (r1 == 0) goto L1d6
            r8.writeAndFlush(r0)
            return
        L1d6:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.pings
            int r0 = r0.get()
            if (r0 != 0) goto L1df
            goto L239
        L1df:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.pings
            r0.getAndDecrement()
            goto L257
        L1e6:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdyGoAwayFrame
            if (r0 == 0) goto L1ed
            r7.receivedGoAwayFrame = r1
            goto L257
        L1ed:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdyHeadersFrame
            if (r0 == 0) goto L220
            r0 = r9
            io.netty.handler.codec.spdy.SpdyHeadersFrame r0 = (io.netty.handler.codec.spdy.SpdyHeadersFrame) r0
            int r2 = r0.streamId()
            boolean r3 = r0.isInvalid()
            if (r3 == 0) goto L204
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            r7.issueStreamError(r8, r2, r9)
            return
        L204:
            io.netty.handler.codec.spdy.SpdySession r3 = r7.spdySession
            boolean r3 = r3.isRemoteSideClosed(r2)
            if (r3 == 0) goto L212
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_STREAM
            r7.issueStreamError(r8, r2, r9)
            return
        L212:
            boolean r0 = r0.isLast()
            if (r0 == 0) goto L257
            io.netty.channel.ChannelFuture r0 = r8.newSucceededFuture()
            r7.halfCloseStream(r2, r1, r0)
            goto L257
        L220:
            boolean r0 = r9 instanceof io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
            if (r0 == 0) goto L257
            r0 = r9
            io.netty.handler.codec.spdy.SpdyWindowUpdateFrame r0 = (io.netty.handler.codec.spdy.SpdyWindowUpdateFrame) r0
            int r1 = r0.streamId()
            int r0 = r0.deltaWindowSize()
            if (r1 == 0) goto L23a
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            boolean r2 = r2.isLocalSideClosed(r1)
            if (r2 == 0) goto L23a
        L239:
            return
        L23a:
            io.netty.handler.codec.spdy.SpdySession r2 = r7.spdySession
            int r2 = r2.getSendWindowSize(r1)
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r0
            if (r2 <= r3) goto L254
            if (r1 != 0) goto L24e
            io.netty.handler.codec.spdy.SpdySessionStatus r9 = io.netty.handler.codec.spdy.SpdySessionStatus.PROTOCOL_ERROR
            r7.issueSessionError(r8, r9)
            return
        L24e:
            io.netty.handler.codec.spdy.SpdyStreamStatus r9 = io.netty.handler.codec.spdy.SpdyStreamStatus.FLOW_CONTROL_ERROR
            r7.issueStreamError(r8, r1, r9)
            return
        L254:
            r7.updateSendWindowSize(r8, r1, r0)
        L257:
            r8.fireChannelRead(r9)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r0.sendGoAwayFrame(r1, r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyProtocolException
            if (r0 == 0) goto L9
            io.netty.handler.codec.spdy.SpdySessionStatus r0 = io.netty.handler.codec.spdy.SpdySessionStatus.PROTOCOL_ERROR
            r1.issueSessionError(r2, r0)
        L9:
            r2.fireExceptionCaught(r3)
            return
    }

    public void setSessionReceiveWindowSize(int r2) {
            r1 = this;
            java.lang.String r0 = "sessionReceiveWindowSize"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.initialSessionReceiveWindowSize = r2
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyDataFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdySynStreamFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdySynReplyFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyRstStreamFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdySettingsFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyPingFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyGoAwayFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyHeadersFrame
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
            if (r0 == 0) goto L25
            goto L29
        L25:
            r2.write(r3, r4)
            return
        L29:
            r1.handleOutboundMessage(r2, r3, r4)
            return
    }
}

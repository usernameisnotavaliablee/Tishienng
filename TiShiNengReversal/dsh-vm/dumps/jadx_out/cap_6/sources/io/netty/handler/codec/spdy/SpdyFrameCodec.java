package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyFrameCodec extends io.netty.handler.codec.ByteToMessageDecoder implements io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate, io.netty.channel.ChannelOutboundHandler {
    private static final io.netty.handler.codec.spdy.SpdyProtocolException INVALID_FRAME = null;
    private io.netty.channel.ChannelHandlerContext ctx;
    private boolean read;
    private final io.netty.handler.codec.spdy.SpdyFrameDecoder spdyFrameDecoder;
    private final io.netty.handler.codec.spdy.SpdyFrameEncoder spdyFrameEncoder;
    private final io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder spdyHeaderBlockDecoder;
    private final io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder spdyHeaderBlockEncoder;
    private io.netty.handler.codec.spdy.SpdyHeadersFrame spdyHeadersFrame;
    private io.netty.handler.codec.spdy.SpdySettingsFrame spdySettingsFrame;
    private final boolean validateHeaders;


    static {
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = new io.netty.handler.codec.spdy.SpdyProtocolException
            java.lang.String r1 = "Received invalid frame"
            r0.<init>(r1)
            io.netty.handler.codec.spdy.SpdyFrameCodec.INVALID_FRAME = r0
            return
    }

    public SpdyFrameCodec(io.netty.handler.codec.spdy.SpdyVersion r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public SpdyFrameCodec(io.netty.handler.codec.spdy.SpdyVersion r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r7 = 1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public SpdyFrameCodec(io.netty.handler.codec.spdy.SpdyVersion r1, int r2, int r3, int r4, int r5, int r6, boolean r7) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder r3 = io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder.newInstance(r1, r3)
            io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder r5 = io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder.newInstance(r1, r4, r5, r6)
            r4 = r3
            r6 = r7
            r3 = r2
            r2 = r1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    protected SpdyFrameCodec(io.netty.handler.codec.spdy.SpdyVersion r2, int r3, io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder r4, io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder r5, boolean r6) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.spdy.SpdyFrameDecoder r0 = new io.netty.handler.codec.spdy.SpdyFrameDecoder
            r0.<init>(r2, r1, r3)
            r1.spdyFrameDecoder = r0
            io.netty.handler.codec.spdy.SpdyFrameEncoder r3 = new io.netty.handler.codec.spdy.SpdyFrameEncoder
            r3.<init>(r2)
            r1.spdyFrameEncoder = r3
            r1.spdyHeaderBlockDecoder = r4
            r1.spdyHeaderBlockEncoder = r5
            r1.validateHeaders = r6
            return
    }

    public SpdyFrameCodec(io.netty.handler.codec.spdy.SpdyVersion r9, boolean r10) {
            r8 = this;
            r5 = 15
            r6 = 8
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            r4 = 6
            r0 = r8
            r1 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static /* synthetic */ io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder access$000(io.netty.handler.codec.spdy.SpdyFrameCodec r0) {
            io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder r0 = r0.spdyHeaderBlockDecoder
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder access$100(io.netty.handler.codec.spdy.SpdyFrameCodec r0) {
            io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder r0 = r0.spdyHeaderBlockEncoder
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void bind(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r0 = this;
            r1.bind(r2, r3)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.read
            if (r0 != 0) goto L15
            io.netty.channel.Channel r0 = r2.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L15
            r2.read()
        L15:
            r0 = 0
            r1.read = r0
            super.channelReadComplete(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r1.close(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void connect(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r0 = this;
            r1.connect(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyFrameDecoder r1 = r0.spdyFrameDecoder
            r1.decode(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void deregister(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r1.deregister(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void disconnect(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r1.disconnect(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.flush()
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            super.handlerAdded(r2)
            r1.ctx = r2
            io.netty.channel.Channel r2 = r2.channel()
            io.netty.channel.ChannelFuture r2 = r2.closeFuture()
            io.netty.handler.codec.spdy.SpdyFrameCodec$1 r0 = new io.netty.handler.codec.spdy.SpdyFrameCodec$1
            r0.<init>(r1)
            r2.addListener(r0)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.read()
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readDataFrame(int r2, boolean r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            r0 = 1
            r1.read = r0
            io.netty.handler.codec.spdy.DefaultSpdyDataFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyDataFrame
            r0.<init>(r2, r4)
            r0.setLast(r3)
            io.netty.channel.ChannelHandlerContext r2 = r1.ctx
            r2.fireChannelRead(r0)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readFrameError(java.lang.String r2) {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r2 = r1.ctx
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = io.netty.handler.codec.spdy.SpdyFrameCodec.INVALID_FRAME
            r2.fireExceptionCaught(r0)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readGoAwayFrame(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.read = r0
            io.netty.handler.codec.spdy.DefaultSpdyGoAwayFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyGoAwayFrame
            r0.<init>(r2, r3)
            io.netty.channel.ChannelHandlerContext r2 = r1.ctx
            r2.fireChannelRead(r0)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readHeaderBlock(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder r0 = r3.spdyHeaderBlockDecoder     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            io.netty.channel.ChannelHandlerContext r1 = r3.ctx     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            io.netty.handler.codec.spdy.SpdyHeadersFrame r2 = r3.spdyHeadersFrame     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            r0.decode(r1, r4, r2)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            r4.release()
            return
        L11:
            r0 = move-exception
            goto L1d
        L13:
            r0 = move-exception
            io.netty.channel.ChannelHandlerContext r1 = r3.ctx     // Catch: java.lang.Throwable -> L11
            r1.fireExceptionCaught(r0)     // Catch: java.lang.Throwable -> L11
            r4.release()
            return
        L1d:
            r4.release()
            throw r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readHeaderBlockEnd() {
            r4 = this;
            r0 = 0
            io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder r1 = r4.spdyHeaderBlockDecoder     // Catch: java.lang.Exception -> Lf
            io.netty.handler.codec.spdy.SpdyHeadersFrame r2 = r4.spdyHeadersFrame     // Catch: java.lang.Exception -> Lf
            r1.endHeaderBlock(r2)     // Catch: java.lang.Exception -> Lf
            io.netty.handler.codec.spdy.SpdyHeadersFrame r1 = r4.spdyHeadersFrame     // Catch: java.lang.Exception -> Lf
            r4.spdyHeadersFrame = r0     // Catch: java.lang.Exception -> Ld
            goto L18
        Ld:
            r0 = move-exception
            goto L13
        Lf:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L13:
            io.netty.channel.ChannelHandlerContext r2 = r4.ctx
            r2.fireExceptionCaught(r0)
        L18:
            if (r1 == 0) goto L22
            r0 = 1
            r4.read = r0
            io.netty.channel.ChannelHandlerContext r0 = r4.ctx
            r0.fireChannelRead(r1)
        L22:
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readHeadersFrame(int r3, boolean r4) {
            r2 = this;
            io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame
            boolean r1 = r2.validateHeaders
            r0.<init>(r3, r1)
            r2.spdyHeadersFrame = r0
            r0.setLast(r4)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readPingFrame(int r2) {
            r1 = this;
            r0 = 1
            r1.read = r0
            io.netty.handler.codec.spdy.DefaultSpdyPingFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyPingFrame
            r0.<init>(r2)
            io.netty.channel.ChannelHandlerContext r2 = r1.ctx
            r2.fireChannelRead(r0)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readRstStreamFrame(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.read = r0
            io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyRstStreamFrame
            r0.<init>(r2, r3)
            io.netty.channel.ChannelHandlerContext r2 = r1.ctx
            r2.fireChannelRead(r0)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readSetting(int r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            io.netty.handler.codec.spdy.SpdySettingsFrame r0 = r1.spdySettingsFrame
            r0.setValue(r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readSettingsEnd() {
            r2 = this;
            r0 = 1
            r2.read = r0
            io.netty.handler.codec.spdy.SpdySettingsFrame r0 = r2.spdySettingsFrame
            r1 = 0
            r2.spdySettingsFrame = r1
            io.netty.channel.ChannelHandlerContext r1 = r2.ctx
            r1.fireChannelRead(r0)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readSettingsFrame(boolean r2) {
            r1 = this;
            r0 = 1
            r1.read = r0
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdySettingsFrame
            r0.<init>()
            r1.spdySettingsFrame = r0
            r0.setClearPreviouslyPersistedSettings(r2)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readSynReplyFrame(int r3, boolean r4) {
            r2 = this;
            io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdySynReplyFrame
            boolean r1 = r2.validateHeaders
            r0.<init>(r3, r1)
            r0.setLast(r4)
            r2.spdyHeadersFrame = r0
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readSynStreamFrame(int r3, int r4, byte r5, boolean r6, boolean r7) {
            r2 = this;
            io.netty.handler.codec.spdy.DefaultSpdySynStreamFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdySynStreamFrame
            boolean r1 = r2.validateHeaders
            r0.<init>(r3, r4, r5, r1)
            r0.setLast(r6)
            r0.setUnidirectional(r7)
            r2.spdyHeadersFrame = r0
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate
    public void readWindowUpdateFrame(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.read = r0
            io.netty.handler.codec.spdy.DefaultSpdyWindowUpdateFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyWindowUpdateFrame
            r0.<init>(r2, r3)
            io.netty.channel.ChannelHandlerContext r2 = r1.ctx
            r2.fireChannelRead(r0)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r11, java.lang.Object r12, io.netty.channel.ChannelPromise r13) throws java.lang.Exception {
            r10 = this;
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdyDataFrame
            if (r0 == 0) goto L23
            io.netty.handler.codec.spdy.SpdyDataFrame r12 = (io.netty.handler.codec.spdy.SpdyDataFrame) r12
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            int r2 = r12.streamId()
            boolean r3 = r12.isLast()
            io.netty.buffer.ByteBuf r4 = r12.content()
            io.netty.buffer.ByteBuf r0 = r0.encodeDataFrame(r1, r2, r3, r4)
            r12.release()
            r11.write(r0, r13)
            return
        L23:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdySynStreamFrame
            if (r0 == 0) goto L5e
            io.netty.handler.codec.spdy.SpdySynStreamFrame r12 = (io.netty.handler.codec.spdy.SpdySynStreamFrame) r12
            io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder r0 = r10.spdyHeaderBlockEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            io.netty.buffer.ByteBuf r9 = r0.encode(r1, r12)
            io.netty.handler.codec.spdy.SpdyFrameEncoder r2 = r10.spdyFrameEncoder     // Catch: java.lang.Throwable -> L58
            io.netty.buffer.ByteBufAllocator r3 = r11.alloc()     // Catch: java.lang.Throwable -> L58
            int r4 = r12.streamId()     // Catch: java.lang.Throwable -> L58
            int r5 = r12.associatedStreamId()     // Catch: java.lang.Throwable -> L58
            byte r6 = r12.priority()     // Catch: java.lang.Throwable -> L58
            boolean r7 = r12.isLast()     // Catch: java.lang.Throwable -> L58
            boolean r8 = r12.isUnidirectional()     // Catch: java.lang.Throwable -> L58
            io.netty.buffer.ByteBuf r12 = r2.encodeSynStreamFrame(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
            r9.release()
            r11.write(r12, r13)
            return
        L58:
            r0 = move-exception
            r11 = r0
            r9.release()
            throw r11
        L5e:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdySynReplyFrame
            if (r0 == 0) goto L8d
            io.netty.handler.codec.spdy.SpdySynReplyFrame r12 = (io.netty.handler.codec.spdy.SpdySynReplyFrame) r12
            io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder r0 = r10.spdyHeaderBlockEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            io.netty.buffer.ByteBuf r1 = r0.encode(r1, r12)
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder     // Catch: java.lang.Throwable -> L87
            io.netty.buffer.ByteBufAllocator r2 = r11.alloc()     // Catch: java.lang.Throwable -> L87
            int r3 = r12.streamId()     // Catch: java.lang.Throwable -> L87
            boolean r12 = r12.isLast()     // Catch: java.lang.Throwable -> L87
            io.netty.buffer.ByteBuf r12 = r0.encodeSynReplyFrame(r2, r3, r12, r1)     // Catch: java.lang.Throwable -> L87
            r1.release()
            r11.write(r12, r13)
            return
        L87:
            r0 = move-exception
            r11 = r0
            r1.release()
            throw r11
        L8d:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdyRstStreamFrame
            if (r0 == 0) goto Lad
            io.netty.handler.codec.spdy.SpdyRstStreamFrame r12 = (io.netty.handler.codec.spdy.SpdyRstStreamFrame) r12
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            int r2 = r12.streamId()
            io.netty.handler.codec.spdy.SpdyStreamStatus r12 = r12.status()
            int r12 = r12.code()
            io.netty.buffer.ByteBuf r12 = r0.encodeRstStreamFrame(r1, r2, r12)
            r11.write(r12, r13)
            return
        Lad:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdySettingsFrame
            if (r0 == 0) goto Lc1
            io.netty.handler.codec.spdy.SpdySettingsFrame r12 = (io.netty.handler.codec.spdy.SpdySettingsFrame) r12
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            io.netty.buffer.ByteBuf r12 = r0.encodeSettingsFrame(r1, r12)
            r11.write(r12, r13)
            return
        Lc1:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdyPingFrame
            if (r0 == 0) goto Ld9
            io.netty.handler.codec.spdy.SpdyPingFrame r12 = (io.netty.handler.codec.spdy.SpdyPingFrame) r12
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            int r12 = r12.id()
            io.netty.buffer.ByteBuf r12 = r0.encodePingFrame(r1, r12)
            r11.write(r12, r13)
            return
        Ld9:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdyGoAwayFrame
            if (r0 == 0) goto Lf9
            io.netty.handler.codec.spdy.SpdyGoAwayFrame r12 = (io.netty.handler.codec.spdy.SpdyGoAwayFrame) r12
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            int r2 = r12.lastGoodStreamId()
            io.netty.handler.codec.spdy.SpdySessionStatus r12 = r12.status()
            int r12 = r12.code()
            io.netty.buffer.ByteBuf r12 = r0.encodeGoAwayFrame(r1, r2, r12)
            r11.write(r12, r13)
            return
        Lf9:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdyHeadersFrame
            if (r0 == 0) goto L128
            io.netty.handler.codec.spdy.SpdyHeadersFrame r12 = (io.netty.handler.codec.spdy.SpdyHeadersFrame) r12
            io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder r0 = r10.spdyHeaderBlockEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            io.netty.buffer.ByteBuf r1 = r0.encode(r1, r12)
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder     // Catch: java.lang.Throwable -> L122
            io.netty.buffer.ByteBufAllocator r2 = r11.alloc()     // Catch: java.lang.Throwable -> L122
            int r3 = r12.streamId()     // Catch: java.lang.Throwable -> L122
            boolean r12 = r12.isLast()     // Catch: java.lang.Throwable -> L122
            io.netty.buffer.ByteBuf r12 = r0.encodeHeadersFrame(r2, r3, r12, r1)     // Catch: java.lang.Throwable -> L122
            r1.release()
            r11.write(r12, r13)
            return
        L122:
            r0 = move-exception
            r11 = r0
            r1.release()
            throw r11
        L128:
            boolean r0 = r12 instanceof io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
            if (r0 == 0) goto L144
            io.netty.handler.codec.spdy.SpdyWindowUpdateFrame r12 = (io.netty.handler.codec.spdy.SpdyWindowUpdateFrame) r12
            io.netty.handler.codec.spdy.SpdyFrameEncoder r0 = r10.spdyFrameEncoder
            io.netty.buffer.ByteBufAllocator r1 = r11.alloc()
            int r2 = r12.streamId()
            int r12 = r12.deltaWindowSize()
            io.netty.buffer.ByteBuf r12 = r0.encodeWindowUpdateFrame(r1, r2, r12)
            r11.write(r12, r13)
            return
        L144:
            io.netty.handler.codec.UnsupportedMessageTypeException r11 = new io.netty.handler.codec.UnsupportedMessageTypeException
            r13 = 0
            java.lang.Class[] r13 = new java.lang.Class[r13]
            r11.<init>(r12, r13)
            throw r11
    }
}

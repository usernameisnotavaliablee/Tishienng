package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ByteToMessageDecoder extends io.netty.channel.ChannelInboundHandlerAdapter {
    public static final io.netty.handler.codec.ByteToMessageDecoder.Cumulator COMPOSITE_CUMULATOR = null;
    public static final io.netty.handler.codec.ByteToMessageDecoder.Cumulator MERGE_CUMULATOR = null;
    private static final byte STATE_CALLING_CHILD_DECODE = 1;
    private static final byte STATE_HANDLER_REMOVED_PENDING = 2;
    private static final byte STATE_INIT = 0;
    io.netty.buffer.ByteBuf cumulation;
    private io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator;
    private byte decodeState;
    private int discardAfterReads;
    private boolean firedChannelRead;
    private boolean first;
    private int numReads;
    private boolean singleDecode;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Cumulator {
        io.netty.buffer.ByteBuf cumulate(io.netty.buffer.ByteBufAllocator r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3);
    }

    static {
            io.netty.handler.codec.ByteToMessageDecoder$1 r0 = new io.netty.handler.codec.ByteToMessageDecoder$1
            r0.<init>()
            io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR = r0
            io.netty.handler.codec.ByteToMessageDecoder$2 r0 = new io.netty.handler.codec.ByteToMessageDecoder$2
            r0.<init>()
            io.netty.handler.codec.ByteToMessageDecoder.COMPOSITE_CUMULATOR = r0
            return
    }

    protected ByteToMessageDecoder() {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.ByteToMessageDecoder$Cumulator r0 = io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR
            r1.cumulator = r0
            r0 = 0
            r1.decodeState = r0
            r0 = 16
            r1.discardAfterReads = r0
            r1.ensureNotSharable()
            return
    }

    private void channelInputClosed(io.netty.channel.ChannelHandlerContext r5, boolean r6) throws java.lang.Exception {
            r4 = this;
            io.netty.handler.codec.CodecOutputList r0 = io.netty.handler.codec.CodecOutputList.newInstance()
            r1 = 0
            r4.channelInputClosed(r5, r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f io.netty.handler.codec.DecoderException -> L36
            io.netty.buffer.ByteBuf r2 = r4.cumulation     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L14
            r2.release()     // Catch: java.lang.Throwable -> L12
            r4.cumulation = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r5 = move-exception
            goto L29
        L14:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L12
            fireChannelRead(r5, r0, r1)     // Catch: java.lang.Throwable -> L12
            if (r1 <= 0) goto L20
            r5.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L12
        L20:
            if (r6 == 0) goto L25
            r5.fireChannelInactive()     // Catch: java.lang.Throwable -> L12
        L25:
            r0.recycle()
            return
        L29:
            r0.recycle()
            throw r5
        L2d:
            r2 = move-exception
            goto L38
        L2f:
            r2 = move-exception
            io.netty.handler.codec.DecoderException r3 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L36:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L2d
        L38:
            io.netty.buffer.ByteBuf r3 = r4.cumulation     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L44
            r3.release()     // Catch: java.lang.Throwable -> L42
            r4.cumulation = r1     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r5 = move-exception
            goto L59
        L44:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L42
            fireChannelRead(r5, r0, r1)     // Catch: java.lang.Throwable -> L42
            if (r1 <= 0) goto L50
            r5.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L42
        L50:
            if (r6 == 0) goto L55
            r5.fireChannelInactive()     // Catch: java.lang.Throwable -> L42
        L55:
            r0.recycle()
            throw r2
        L59:
            r0.recycle()
            throw r5
    }

    static io.netty.buffer.ByteBuf expandCumulation(io.netty.buffer.ByteBufAllocator r1, io.netty.buffer.ByteBuf r2, int r3) {
            int r0 = r2.readableBytes()
            int r0 = r0 + r3
            io.netty.buffer.ByteBuf r1 = r1.buffer(r0)
            r1.writeBytes(r2)
            r2.release()
            return r1
    }

    static void fireChannelRead(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.CodecOutputList r3, int r4) {
            r0 = 0
        L1:
            if (r0 >= r4) goto Ld
            java.lang.Object r1 = r3.getUnsafe(r0)
            r2.fireChannelRead(r1)
            int r0 = r0 + 1
            goto L1
        Ld:
            return
    }

    static void fireChannelRead(io.netty.channel.ChannelHandlerContext r2, java.util.List<java.lang.Object> r3, int r4) {
            boolean r0 = r3 instanceof io.netty.handler.codec.CodecOutputList
            if (r0 == 0) goto La
            io.netty.handler.codec.CodecOutputList r3 = (io.netty.handler.codec.CodecOutputList) r3
            fireChannelRead(r2, r3, r4)
            return
        La:
            r0 = 0
        Lb:
            if (r0 >= r4) goto L17
            java.lang.Object r1 = r3.get(r0)
            r2.fireChannelRead(r1)
            int r0 = r0 + 1
            goto Lb
        L17:
            return
    }

    protected int actualReadableBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.internalBuffer()
            int r0 = r0.readableBytes()
            return r0
    }

    protected void callDecode(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) {
            r3 = this;
        L0:
            boolean r0 = r5.isReadable()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r0 == 0) goto L66
            int r0 = r6.size()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r0 <= 0) goto L1f
            fireChannelRead(r4, r6, r0)     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            r6.clear()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            boolean r0 = r4.isRemoved()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r0 == 0) goto L19
            goto L66
        L19:
            r0 = 0
            goto L1f
        L1b:
            r4 = move-exception
            goto L67
        L1d:
            r4 = move-exception
            goto L6d
        L1f:
            int r1 = r5.readableBytes()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            r3.decodeRemovalReentryProtection(r4, r5, r6)     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            boolean r2 = r4.isRemoved()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r2 == 0) goto L2d
            goto L66
        L2d:
            int r2 = r6.size()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r0 != r2) goto L3a
            int r0 = r5.readableBytes()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r1 != r0) goto L0
            goto L66
        L3a:
            int r0 = r5.readableBytes()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r1 == r0) goto L47
            boolean r0 = r3.isSingleDecode()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            if (r0 == 0) goto L0
            goto L66
        L47:
            io.netty.handler.codec.DecoderException r4 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            r5.<init>()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            java.lang.String r6 = io.netty.util.internal.StringUtil.simpleClassName(r6)     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            r5.append(r6)     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            java.lang.String r6 = ".decode() did not read anything but decoded a message."
            r5.append(r6)     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            r4.<init>(r5)     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
            throw r4     // Catch: java.lang.Exception -> L1b io.netty.handler.codec.DecoderException -> L1d
        L66:
            return
        L67:
            io.netty.handler.codec.DecoderException r5 = new io.netty.handler.codec.DecoderException
            r5.<init>(r4)
            throw r5
        L6d:
            throw r4
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            r1.channelInputClosed(r2, r0)
            return
    }

    void channelInputClosed(io.netty.channel.ChannelHandlerContext r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.cumulation
            if (r0 == 0) goto Ld
            r1.callDecode(r2, r0, r3)
            io.netty.buffer.ByteBuf r0 = r1.cumulation
            r1.decodeLast(r2, r0, r3)
            return
        Ld:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r1.decodeLast(r2, r0, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r8, java.lang.Object r9) throws java.lang.Exception {
            r7 = this;
            boolean r0 = r9 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto La8
            io.netty.handler.codec.CodecOutputList r0 = io.netty.handler.codec.CodecOutputList.newInstance()
            r1 = 0
            r2 = 1
            r3 = 0
            io.netty.buffer.ByteBuf r9 = (io.netty.buffer.ByteBuf) r9     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            io.netty.buffer.ByteBuf r4 = r7.cumulation     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            if (r4 != 0) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            r7.first = r4     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            if (r4 == 0) goto L21
            r7.cumulation = r9     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            goto L2f
        L1b:
            r9 = move-exception
            goto L71
        L1d:
            r9 = move-exception
            goto L6a
        L1f:
            r9 = move-exception
            goto L70
        L21:
            io.netty.handler.codec.ByteToMessageDecoder$Cumulator r4 = r7.cumulator     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            io.netty.buffer.ByteBufAllocator r5 = r8.alloc()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            io.netty.buffer.ByteBuf r6 = r7.cumulation     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            io.netty.buffer.ByteBuf r9 = r4.cumulate(r5, r6, r9)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            r7.cumulation = r9     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
        L2f:
            io.netty.buffer.ByteBuf r9 = r7.cumulation     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            r7.callDecode(r8, r9, r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d io.netty.handler.codec.DecoderException -> L1f
            io.netty.buffer.ByteBuf r9 = r7.cumulation
            if (r9 == 0) goto L48
            boolean r9 = r9.isReadable()
            if (r9 != 0) goto L48
            r7.numReads = r3
            io.netty.buffer.ByteBuf r9 = r7.cumulation
            r9.release()
            r7.cumulation = r1
            goto L56
        L48:
            int r9 = r7.numReads
            int r9 = r9 + r2
            r7.numReads = r9
            int r1 = r7.discardAfterReads
            if (r9 < r1) goto L56
            r7.numReads = r3
            r7.discardSomeReadBytes()
        L56:
            int r9 = r0.size()
            boolean r1 = r7.firedChannelRead
            boolean r2 = r0.insertSinceRecycled()
            r1 = r1 | r2
            r7.firedChannelRead = r1
            fireChannelRead(r8, r0, r9)
            r0.recycle()
            return
        L6a:
            io.netty.handler.codec.DecoderException r4 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L1b
            throw r4     // Catch: java.lang.Throwable -> L1b
        L70:
            throw r9     // Catch: java.lang.Throwable -> L1b
        L71:
            io.netty.buffer.ByteBuf r4 = r7.cumulation
            if (r4 == 0) goto L86
            boolean r4 = r4.isReadable()
            if (r4 == 0) goto L7c
            goto L86
        L7c:
            r7.numReads = r3
            io.netty.buffer.ByteBuf r2 = r7.cumulation
            r2.release()
            r7.cumulation = r1
            goto L94
        L86:
            int r1 = r7.numReads
            int r1 = r1 + r2
            r7.numReads = r1
            int r2 = r7.discardAfterReads
            if (r1 < r2) goto L94
            r7.numReads = r3
            r7.discardSomeReadBytes()
        L94:
            int r1 = r0.size()
            boolean r2 = r7.firedChannelRead
            boolean r3 = r0.insertSinceRecycled()
            r2 = r2 | r3
            r7.firedChannelRead = r2
            fireChannelRead(r8, r0, r1)
            r0.recycle()
            throw r9
        La8:
            r8.fireChannelRead(r9)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            r2.numReads = r0
            r2.discardSomeReadBytes()
            boolean r1 = r2.firedChannelRead
            if (r1 != 0) goto L1b
            io.netty.channel.Channel r1 = r3.channel()
            io.netty.channel.ChannelConfig r1 = r1.config()
            boolean r1 = r1.isAutoRead()
            if (r1 != 0) goto L1b
            r3.read()
        L1b:
            r2.firedChannelRead = r0
            r3.fireChannelReadComplete()
            return
    }

    protected abstract void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception;

    protected void decodeLast(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3.isReadable()
            if (r0 == 0) goto L9
            r1.decodeRemovalReentryProtection(r2, r3, r4)
        L9:
            return
    }

    final void decodeRemovalReentryProtection(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            r0 = 1
            r3.decodeState = r0
            r1 = 2
            r2 = 0
            r3.decode(r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            byte r5 = r3.decodeState
            if (r5 != r1) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            r3.decodeState = r2
            if (r0 == 0) goto L15
            r3.handlerRemoved(r4)
        L15:
            return
        L16:
            r5 = move-exception
            byte r6 = r3.decodeState
            if (r6 != r1) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r3.decodeState = r2
            if (r0 == 0) goto L24
            r3.handlerRemoved(r4)
        L24:
            throw r5
    }

    protected final void discardSomeReadBytes() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.cumulation
            if (r0 == 0) goto L14
            boolean r1 = r2.first
            if (r1 != 0) goto L14
            int r0 = r0.refCnt()
            r1 = 1
            if (r0 != r1) goto L14
            io.netty.buffer.ByteBuf r0 = r2.cumulation
            r0.discardSomeReadBytes()
        L14:
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public final void handlerRemoved(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            byte r0 = r2.decodeState
            r1 = 1
            if (r0 != r1) goto L9
            r3 = 2
            r2.decodeState = r3
            return
        L9:
            io.netty.buffer.ByteBuf r0 = r2.cumulation
            if (r0 == 0) goto L2a
            r1 = 0
            r2.cumulation = r1
            r1 = 0
            r2.numReads = r1
            int r1 = r0.readableBytes()
            if (r1 <= 0) goto L27
            io.netty.buffer.ByteBuf r1 = r0.readBytes(r1)
            r0.release()
            r3.fireChannelRead(r1)
            r3.fireChannelReadComplete()
            goto L2a
        L27:
            r0.release()
        L2a:
            r2.handlerRemoved0(r3)
            return
    }

    protected void handlerRemoved0(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    protected io.netty.buffer.ByteBuf internalBuffer() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.cumulation
            if (r0 == 0) goto L5
            return r0
        L5:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r0
    }

    public boolean isSingleDecode() {
            r1 = this;
            boolean r0 = r1.singleDecode
            return r0
    }

    public void setCumulator(io.netty.handler.codec.ByteToMessageDecoder.Cumulator r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.cumulator = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cumulator"
            r2.<init>(r0)
            throw r2
    }

    public void setDiscardAfterReads(int r2) {
            r1 = this;
            java.lang.String r0 = "discardAfterReads"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.discardAfterReads = r2
            return
    }

    public void setSingleDecode(boolean r1) {
            r0 = this;
            r0.singleDecode = r1
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.channel.socket.ChannelInputShutdownEvent
            if (r0 == 0) goto L8
            r0 = 0
            r1.channelInputClosed(r2, r0)
        L8:
            super.userEventTriggered(r2, r3)
            return
    }
}

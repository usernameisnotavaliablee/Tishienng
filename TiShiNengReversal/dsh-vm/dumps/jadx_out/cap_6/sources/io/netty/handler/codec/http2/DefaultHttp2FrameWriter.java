package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2FrameWriter implements io.netty.handler.codec.http2.Http2FrameWriter, io.netty.handler.codec.http2.Http2FrameSizePolicy, io.netty.handler.codec.http2.Http2FrameWriter.Configuration {
    private static final java.lang.String STREAM_DEPENDENCY = "Stream Dependency";
    private static final java.lang.String STREAM_ID = "Stream ID";
    private static final io.netty.buffer.ByteBuf ZERO_BUFFER = null;
    private final io.netty.handler.codec.http2.Http2HeadersEncoder headersEncoder;
    private int maxFrameSize;

    static {
            r0 = 255(0xff, float:3.57E-43)
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.directBuffer(r0)
            io.netty.buffer.ByteBuf r0 = r1.writeZero(r0)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.buffer.ByteBuf r0 = r0.asReadOnly()
            io.netty.handler.codec.http2.DefaultHttp2FrameWriter.ZERO_BUFFER = r0
            return
    }

    public DefaultHttp2FrameWriter() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2HeadersEncoder r0 = new io.netty.handler.codec.http2.DefaultHttp2HeadersEncoder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public DefaultHttp2FrameWriter(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2) {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2HeadersEncoder r0 = new io.netty.handler.codec.http2.DefaultHttp2HeadersEncoder
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public DefaultHttp2FrameWriter(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2, boolean r3) {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2HeadersEncoder r0 = new io.netty.handler.codec.http2.DefaultHttp2HeadersEncoder
            r0.<init>(r2, r3)
            r1.<init>(r0)
            return
    }

    public DefaultHttp2FrameWriter(io.netty.handler.codec.http2.Http2HeadersEncoder r1) {
            r0 = this;
            r0.<init>()
            r0.headersEncoder = r1
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.maxFrameSize = r1
            return
    }

    private static int paddingBytes(int r0) {
            int r0 = r0 + (-1)
            return r0
    }

    private static void verifyErrorCode(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L10
            return
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid errorCode: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static void verifyPingPayload(io.netty.buffer.ByteBuf r1) {
            if (r1 == 0) goto Lb
            int r1 = r1.readableBytes()
            r0 = 8
            if (r1 != r0) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Opaque data must be 8 bytes"
            r1.<init>(r0)
            throw r1
    }

    private static void verifyStreamId(int r0, java.lang.String r1) {
            java.lang.String r1 = "streamId"
            io.netty.util.internal.ObjectUtil.checkPositive(r0, r1)
            return
    }

    private static void verifyStreamOrConnectionId(int r0, java.lang.String r1) {
            java.lang.String r1 = "streamId"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r0, r1)
            return
    }

    private static void verifyWeight(short r3) {
            r0 = 1
            if (r3 < r0) goto L8
            r0 = 256(0x100, float:3.59E-43)
            if (r3 > r0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid weight: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static void verifyWindowSizeIncrement(int r1) {
            java.lang.String r0 = "windowSizeIncrement"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r1, r0)
            return
    }

    private io.netty.channel.ChannelFuture writeContinuationFrames(io.netty.channel.ChannelHandlerContext r11, int r12, io.netty.buffer.ByteBuf r13, int r14, io.netty.handler.codec.http2.Http2CodecUtil.SimpleChannelPromiseAggregator r15) {
            r10 = this;
            io.netty.handler.codec.http2.Http2Flags r0 = new io.netty.handler.codec.http2.Http2Flags
            r0.<init>()
            r1 = 0
            r2 = 1
            if (r14 <= 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            io.netty.handler.codec.http2.Http2Flags r0 = r0.paddingPresent(r3)
            int r3 = r10.maxFrameSize
            int r3 = r3 - r14
            if (r3 > 0) goto L3f
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Padding ["
            r12.append(r13)
            r12.append(r14)
            java.lang.String r13 = "] is too large for max frame size ["
            r12.append(r13)
            int r13 = r10.maxFrameSize
            r12.append(r13)
            java.lang.String r13 = "]"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            io.netty.channel.ChannelPromise r11 = r15.setFailure(r11)
            return r11
        L3f:
            boolean r4 = r13.isReadable()
            if (r4 == 0) goto Lbf
            int r4 = r13.readableBytes()
            int r4 = java.lang.Math.min(r4, r3)
            int r4 = r4 + r14
            io.netty.buffer.ByteBufAllocator r5 = r11.alloc()
            r6 = 10
            io.netty.buffer.ByteBuf r5 = r5.buffer(r6)
            r7 = 9
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r5, r4, r7, r0, r12)
            writePaddingLength(r5, r14)
        L60:
            int r4 = r13.readableBytes()
            int r4 = java.lang.Math.min(r4, r3)
            io.netty.buffer.ByteBuf r8 = r13.readRetainedSlice(r4)
            int r4 = r4 + r14
            boolean r9 = r13.isReadable()
            if (r9 == 0) goto L7f
            io.netty.buffer.ByteBuf r4 = r5.retain()
            io.netty.channel.ChannelPromise r9 = r15.newPromise()
            r11.write(r4, r9)
            goto L9b
        L7f:
            io.netty.handler.codec.http2.Http2Flags r0 = r0.endOfHeaders(r2)
            r5.release()
            io.netty.buffer.ByteBufAllocator r5 = r11.alloc()
            io.netty.buffer.ByteBuf r5 = r5.buffer(r6)
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r5, r4, r7, r0, r12)
            writePaddingLength(r5, r14)
            io.netty.channel.ChannelPromise r4 = r15.newPromise()
            r11.write(r5, r4)
        L9b:
            io.netty.channel.ChannelPromise r4 = r15.newPromise()
            r11.write(r8, r4)
            int r4 = paddingBytes(r14)
            if (r4 <= 0) goto Lb9
            io.netty.buffer.ByteBuf r4 = io.netty.handler.codec.http2.DefaultHttp2FrameWriter.ZERO_BUFFER
            int r8 = paddingBytes(r14)
            io.netty.buffer.ByteBuf r4 = r4.slice(r1, r8)
            io.netty.channel.ChannelPromise r8 = r15.newPromise()
            r11.write(r4, r8)
        Lb9:
            boolean r4 = r13.isReadable()
            if (r4 != 0) goto L60
        Lbf:
            return r15
    }

    private io.netty.channel.ChannelFuture writeHeadersInternal(io.netty.channel.ChannelHandlerContext r15, int r16, io.netty.handler.codec.http2.Http2Headers r17, int r18, boolean r19, boolean r20, int r21, short r22, boolean r23, io.netty.channel.ChannelPromise r24) {
            r14 = this;
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator r5 = new io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator
            io.netty.channel.Channel r6 = r15.channel()
            io.netty.util.concurrent.EventExecutor r7 = r15.executor()
            r8 = r24
            r5.<init>(r8, r6, r7)
            r6 = 0
            java.lang.String r7 = "Stream ID"
            verifyStreamId(r1, r7)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            if (r3 == 0) goto L33
            java.lang.String r7 = "Stream Dependency"
            verifyStreamOrConnectionId(r4, r7)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.handler.codec.http2.Http2CodecUtil.verifyPadding(r2)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            verifyWeight(r22)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            goto L33
        L2b:
            r0 = move-exception
            r1 = r5
            goto Lef
        L2f:
            r0 = move-exception
            r1 = r5
            goto Lfd
        L33:
            io.netty.buffer.ByteBufAllocator r7 = r15.alloc()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.buffer.ByteBuf r6 = r7.buffer()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.handler.codec.http2.Http2HeadersEncoder r7 = r14.headersEncoder     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r8 = r17
            r7.encodeHeaders(r1, r8, r6)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.handler.codec.http2.Http2Flags r7 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r7.<init>()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r8 = r19
            io.netty.handler.codec.http2.Http2Flags r7 = r7.endOfStream(r8)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.handler.codec.http2.Http2Flags r7 = r7.priorityPresent(r3)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r8 = 0
            r9 = 1
            if (r2 <= 0) goto L57
            r10 = 1
            goto L58
        L57:
            r10 = 0
        L58:
            io.netty.handler.codec.http2.Http2Flags r7 = r7.paddingPresent(r10)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r10 = r7.getNumPriorityBytes()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r10 = r10 + r2
            int r11 = r14.maxFrameSize     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r11 = r11 - r10
            int r12 = r6.readableBytes()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r11 = java.lang.Math.min(r12, r11)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.buffer.ByteBuf r11 = r6.readRetainedSlice(r11)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            boolean r12 = r6.isReadable()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r12 = r12 ^ r9
            r7.endOfHeaders(r12)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r12 = r11.readableBytes()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r12 = r12 + r10
            io.netty.buffer.ByteBufAllocator r10 = r15.alloc()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r13 = 15
            io.netty.buffer.ByteBuf r10 = r10.buffer(r13)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r10, r12, r9, r7, r1)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            writePaddingLength(r10, r2)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            if (r3 == 0) goto La1
            if (r23 == 0) goto L99
            r12 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = (long) r4     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            long r3 = r3 | r12
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
        L99:
            r10.writeInt(r4)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r3 = r22 + (-1)
            r10.writeByte(r3)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
        La1:
            io.netty.channel.ChannelPromise r3 = r5.newPromise()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r15.write(r10, r3)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.channel.ChannelPromise r3 = r5.newPromise()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r15.write(r11, r3)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r3 = paddingBytes(r2)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            if (r3 <= 0) goto Lc6
            io.netty.buffer.ByteBuf r3 = io.netty.handler.codec.http2.DefaultHttp2FrameWriter.ZERO_BUFFER     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            int r4 = paddingBytes(r2)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.buffer.ByteBuf r3 = r3.slice(r8, r4)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.channel.ChannelPromise r4 = r5.newPromise()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            r15.write(r3, r4)     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
        Lc6:
            boolean r3 = r7.endOfHeaders()     // Catch: java.lang.Throwable -> L2b io.netty.handler.codec.http2.Http2Exception -> L2f
            if (r3 != 0) goto Lea
            r19 = r14
            r20 = r15
            r21 = r1
            r23 = r2
            r24 = r5
            r22 = r6
            r19.writeContinuationFrames(r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> Lde io.netty.handler.codec.http2.Http2Exception -> Le4
            r1 = r24
            goto Leb
        Lde:
            r0 = move-exception
            r6 = r22
            r1 = r24
            goto Lef
        Le4:
            r0 = move-exception
            r6 = r22
            r1 = r24
            goto Lfd
        Lea:
            r1 = r5
        Leb:
            r6.release()
            goto L103
        Lef:
            r1.setFailure(r0)     // Catch: java.lang.Throwable -> Lfb
            r1.doneAllocatingPromises()     // Catch: java.lang.Throwable -> Lfb
            io.netty.util.internal.PlatformDependent.throwException(r0)     // Catch: java.lang.Throwable -> Lfb
            if (r6 == 0) goto L103
            goto Leb
        Lfb:
            r0 = move-exception
            goto L108
        Lfd:
            r1.setFailure(r0)     // Catch: java.lang.Throwable -> Lfb
            if (r6 == 0) goto L103
            goto Leb
        L103:
            io.netty.channel.ChannelPromise r0 = r1.doneAllocatingPromises()
            return r0
        L108:
            if (r6 == 0) goto L10d
            r6.release()
        L10d:
            throw r0
    }

    private static void writePaddingLength(io.netty.buffer.ByteBuf r0, int r1) {
            if (r1 <= 0) goto L7
            int r1 = r1 + (-1)
            r0.writeByte(r1)
        L7:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.handler.codec.http2.Http2FrameWriter.Configuration configuration() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter.Configuration
    public io.netty.handler.codec.http2.Http2FrameSizePolicy frameSizePolicy() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter.Configuration
    public io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration headersConfiguration() {
            r1 = this;
            io.netty.handler.codec.http2.Http2HeadersEncoder r0 = r1.headersEncoder
            io.netty.handler.codec.http2.Http2HeadersEncoder$Configuration r0 = r0.configuration()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameSizePolicy
    public int maxFrameSize() {
            r1 = this;
            int r0 = r1.maxFrameSize
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameSizePolicy
    public void maxFrameSize(int r4) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            boolean r0 = io.netty.handler.codec.http2.Http2CodecUtil.isMaxFrameSizeValid(r4)
            if (r0 == 0) goto L9
            r3.maxFrameSize = r4
            return
        L9:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Invalid MAX_FRAME_SIZE specified in sent settings: %d"
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r4, r1)
            throw r4
    }

    @Override // io.netty.handler.codec.http2.Http2DataWriter
    public io.netty.channel.ChannelFuture writeData(io.netty.channel.ChannelHandlerContext r17, int r18, io.netty.buffer.ByteBuf r19, int r20, boolean r21, io.netty.channel.ChannelPromise r22) {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator r5 = new io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator
            io.netty.channel.Channel r6 = r0.channel()
            io.netty.util.concurrent.EventExecutor r7 = r0.executor()
            r8 = r22
            r5.<init>(r8, r6, r7)
            java.lang.String r7 = "Stream ID"
            verifyStreamId(r2, r7)     // Catch: java.lang.Throwable -> L67
            io.netty.handler.codec.http2.Http2CodecUtil.verifyPadding(r20)     // Catch: java.lang.Throwable -> L67
            int r7 = r3.readableBytes()     // Catch: java.lang.Throwable -> L67
            io.netty.handler.codec.http2.Http2Flags r8 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L67
            r8.<init>()     // Catch: java.lang.Throwable -> L67
            r9 = 0
            r8.endOfStream(r9)     // Catch: java.lang.Throwable -> L67
            r8.paddingPresent(r9)     // Catch: java.lang.Throwable -> L67
            int r10 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L67
            r11 = 9
            if (r7 <= r10) goto L6c
            io.netty.buffer.ByteBufAllocator r10 = r0.alloc()     // Catch: java.lang.Throwable -> L67
            io.netty.buffer.ByteBuf r10 = r10.buffer(r11)     // Catch: java.lang.Throwable -> L67
            int r12 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L62
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r10, r12, r9, r8, r2)     // Catch: java.lang.Throwable -> L62
        L44:
            io.netty.buffer.ByteBuf r12 = r10.retainedSlice()     // Catch: java.lang.Throwable -> L62
            io.netty.channel.ChannelPromise r13 = r5.newPromise()     // Catch: java.lang.Throwable -> L62
            r0.write(r12, r13)     // Catch: java.lang.Throwable -> L62
            int r12 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L62
            io.netty.buffer.ByteBuf r12 = r3.readRetainedSlice(r12)     // Catch: java.lang.Throwable -> L62
            io.netty.channel.ChannelPromise r13 = r5.newPromise()     // Catch: java.lang.Throwable -> L62
            r0.write(r12, r13)     // Catch: java.lang.Throwable -> L62
            int r12 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L62
            int r7 = r7 - r12
            if (r7 > r12) goto L44
            goto L6d
        L62:
            r0 = move-exception
            r2 = r0
            r6 = r10
            goto L167
        L67:
            r0 = move-exception
            r2 = r0
            r6 = 0
            goto L167
        L6c:
            r10 = 0
        L6d:
            if (r20 != 0) goto L9d
            if (r10 == 0) goto L75
            r10.release()     // Catch: java.lang.Throwable -> L62
            r10 = 0
        L75:
            io.netty.buffer.ByteBufAllocator r12 = r0.alloc()     // Catch: java.lang.Throwable -> L62
            io.netty.buffer.ByteBuf r11 = r12.buffer(r11)     // Catch: java.lang.Throwable -> L62
            r8.endOfStream(r4)     // Catch: java.lang.Throwable -> L62
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r11, r7, r9, r8, r2)     // Catch: java.lang.Throwable -> L62
            io.netty.channel.ChannelPromise r2 = r5.newPromise()     // Catch: java.lang.Throwable -> L62
            r0.write(r11, r2)     // Catch: java.lang.Throwable -> L62
            io.netty.buffer.ByteBuf r2 = r3.readSlice(r7)     // Catch: java.lang.Throwable -> L62
            io.netty.channel.ChannelPromise r3 = r5.newPromise()     // Catch: java.lang.Throwable -> L97
            r0.write(r2, r3)     // Catch: java.lang.Throwable -> L97
            goto L162
        L97:
            r0 = move-exception
            r2 = r0
            r6 = r10
        L9a:
            r3 = 0
            goto L167
        L9d:
            int r12 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L62
            if (r7 == r12) goto Lae
            if (r10 == 0) goto Lab
            r10.release()     // Catch: java.lang.Throwable -> L62
            r10 = r7
            r11 = 0
        La8:
            r7 = r20
            goto Le1
        Lab:
            r11 = r10
        Lac:
            r10 = r7
            goto La8
        Lae:
            int r7 = r7 - r12
            if (r10 != 0) goto Lbf
            io.netty.buffer.ByteBufAllocator r12 = r0.alloc()     // Catch: java.lang.Throwable -> L62
            io.netty.buffer.ByteBuf r11 = r12.buffer(r11)     // Catch: java.lang.Throwable -> L62
            int r12 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L62
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r11, r12, r9, r8, r2)     // Catch: java.lang.Throwable -> L62
            goto Lc4
        Lbf:
            io.netty.buffer.ByteBuf r11 = r10.slice()     // Catch: java.lang.Throwable -> L62
            r10 = 0
        Lc4:
            io.netty.channel.ChannelPromise r12 = r5.newPromise()     // Catch: java.lang.Throwable -> L62
            r0.write(r11, r12)     // Catch: java.lang.Throwable -> L62
            int r11 = r3.readableBytes()     // Catch: java.lang.Throwable -> L62
            int r12 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L62
            if (r11 == r12) goto Ld7
            io.netty.buffer.ByteBuf r3 = r3.readSlice(r12)     // Catch: java.lang.Throwable -> L62
        Ld7:
            io.netty.channel.ChannelPromise r11 = r5.newPromise()     // Catch: java.lang.Throwable -> L97
            r0.write(r3, r11)     // Catch: java.lang.Throwable -> L97
            r11 = r10
            r3 = 0
            goto Lac
        Le1:
            int r12 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L138
            int r12 = java.lang.Math.min(r10, r12)     // Catch: java.lang.Throwable -> L138
            int r13 = r1.maxFrameSize     // Catch: java.lang.Throwable -> L138
            r14 = 1
            int r13 = r13 - r14
            int r13 = r13 - r12
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L138
            int r13 = java.lang.Math.min(r7, r13)     // Catch: java.lang.Throwable -> L138
            int r7 = r7 - r13
            int r10 = r10 - r12
            io.netty.buffer.ByteBufAllocator r15 = r0.alloc()     // Catch: java.lang.Throwable -> L138
            r6 = 10
            io.netty.buffer.ByteBuf r6 = r15.buffer(r6)     // Catch: java.lang.Throwable -> L138
            if (r4 == 0) goto L108
            if (r10 != 0) goto L108
            if (r7 != 0) goto L108
            r15 = 1
            goto L109
        L108:
            r15 = 0
        L109:
            r8.endOfStream(r15)     // Catch: java.lang.Throwable -> L138
            if (r13 <= 0) goto L10f
            goto L110
        L10f:
            r14 = 0
        L110:
            r8.paddingPresent(r14)     // Catch: java.lang.Throwable -> L138
            int r14 = r13 + r12
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r6, r14, r9, r8, r2)     // Catch: java.lang.Throwable -> L138
            writePaddingLength(r6, r13)     // Catch: java.lang.Throwable -> L138
            io.netty.channel.ChannelPromise r14 = r5.newPromise()     // Catch: java.lang.Throwable -> L138
            r0.write(r6, r14)     // Catch: java.lang.Throwable -> L138
            if (r12 == 0) goto L147
            if (r10 != 0) goto L13c
            io.netty.buffer.ByteBuf r3 = r3.readSlice(r12)     // Catch: java.lang.Throwable -> L138
            io.netty.channel.ChannelPromise r6 = r5.newPromise()     // Catch: java.lang.Throwable -> L133
            r0.write(r3, r6)     // Catch: java.lang.Throwable -> L133
            r3 = 0
            goto L147
        L133:
            r0 = move-exception
            r2 = r0
            r6 = r11
            goto L9a
        L138:
            r0 = move-exception
            r2 = r0
            r6 = r11
            goto L167
        L13c:
            io.netty.buffer.ByteBuf r6 = r3.readRetainedSlice(r12)     // Catch: java.lang.Throwable -> L138
            io.netty.channel.ChannelPromise r12 = r5.newPromise()     // Catch: java.lang.Throwable -> L138
            r0.write(r6, r12)     // Catch: java.lang.Throwable -> L138
        L147:
            int r6 = paddingBytes(r13)     // Catch: java.lang.Throwable -> L138
            if (r6 <= 0) goto L15e
            io.netty.buffer.ByteBuf r6 = io.netty.handler.codec.http2.DefaultHttp2FrameWriter.ZERO_BUFFER     // Catch: java.lang.Throwable -> L138
            int r12 = paddingBytes(r13)     // Catch: java.lang.Throwable -> L138
            io.netty.buffer.ByteBuf r6 = r6.slice(r9, r12)     // Catch: java.lang.Throwable -> L138
            io.netty.channel.ChannelPromise r12 = r5.newPromise()     // Catch: java.lang.Throwable -> L138
            r0.write(r6, r12)     // Catch: java.lang.Throwable -> L138
        L15e:
            if (r10 != 0) goto Le1
            if (r7 != 0) goto Le1
        L162:
            io.netty.channel.ChannelPromise r0 = r5.doneAllocatingPromises()
            return r0
        L167:
            if (r6 == 0) goto L16c
            r6.release()
        L16c:
            if (r3 == 0) goto L17a
            r3.release()     // Catch: java.lang.Throwable -> L172
            goto L17a
        L172:
            r0 = move-exception
            r5.setFailure(r2)
            r5.doneAllocatingPromises()
            throw r0
        L17a:
            r5.setFailure(r2)
            r5.doneAllocatingPromises()
            return r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeFrame(io.netty.channel.ChannelHandlerContext r4, byte r5, int r6, io.netty.handler.codec.http2.Http2Flags r7, io.netty.buffer.ByteBuf r8, io.netty.channel.ChannelPromise r9) {
            r3 = this;
            io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator r0 = new io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator
            io.netty.channel.Channel r1 = r4.channel()
            io.netty.util.concurrent.EventExecutor r2 = r4.executor()
            r0.<init>(r9, r1, r2)
            java.lang.String r9 = "Stream ID"
            verifyStreamOrConnectionId(r6, r9)     // Catch: java.lang.Throwable -> L3b
            io.netty.buffer.ByteBufAllocator r9 = r4.alloc()     // Catch: java.lang.Throwable -> L3b
            r1 = 9
            io.netty.buffer.ByteBuf r9 = r9.buffer(r1)     // Catch: java.lang.Throwable -> L3b
            int r1 = r8.readableBytes()     // Catch: java.lang.Throwable -> L3b
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r9, r1, r5, r7, r6)     // Catch: java.lang.Throwable -> L3b
            io.netty.channel.ChannelPromise r5 = r0.newPromise()     // Catch: java.lang.Throwable -> L3b
            r4.write(r9, r5)     // Catch: java.lang.Throwable -> L3b
            io.netty.channel.ChannelPromise r5 = r0.newPromise()     // Catch: java.lang.Throwable -> L32
            r4.write(r8, r5)     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r4 = move-exception
            r0.setFailure(r4)
        L36:
            io.netty.channel.ChannelPromise r4 = r0.doneAllocatingPromises()
            return r4
        L3b:
            r4 = move-exception
            r8.release()     // Catch: java.lang.Throwable -> L46
            r0.setFailure(r4)
            r0.doneAllocatingPromises()
            return r0
        L46:
            r5 = move-exception
            r0.setFailure(r4)
            r0.doneAllocatingPromises()
            throw r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeGoAway(io.netty.channel.ChannelHandlerContext r6, int r7, long r8, io.netty.buffer.ByteBuf r10, io.netty.channel.ChannelPromise r11) {
            r5 = this;
            io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator r0 = new io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator
            io.netty.channel.Channel r1 = r6.channel()
            io.netty.util.concurrent.EventExecutor r2 = r6.executor()
            r0.<init>(r11, r1, r2)
            java.lang.String r11 = "Last Stream ID"
            verifyStreamOrConnectionId(r7, r11)     // Catch: java.lang.Throwable -> L4e
            verifyErrorCode(r8)     // Catch: java.lang.Throwable -> L4e
            int r11 = r10.readableBytes()     // Catch: java.lang.Throwable -> L4e
            int r11 = r11 + 8
            io.netty.buffer.ByteBufAllocator r1 = r6.alloc()     // Catch: java.lang.Throwable -> L4e
            r2 = 17
            io.netty.buffer.ByteBuf r1 = r1.buffer(r2)     // Catch: java.lang.Throwable -> L4e
            io.netty.handler.codec.http2.Http2Flags r2 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            r4 = 7
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r1, r11, r4, r2, r3)     // Catch: java.lang.Throwable -> L4e
            r1.writeInt(r7)     // Catch: java.lang.Throwable -> L4e
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L4e
            r1.writeInt(r7)     // Catch: java.lang.Throwable -> L4e
            io.netty.channel.ChannelPromise r7 = r0.newPromise()     // Catch: java.lang.Throwable -> L4e
            r6.write(r1, r7)     // Catch: java.lang.Throwable -> L4e
            io.netty.channel.ChannelPromise r7 = r0.newPromise()     // Catch: java.lang.Throwable -> L45
            r6.write(r10, r7)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r6 = move-exception
            r0.setFailure(r6)
        L49:
            io.netty.channel.ChannelPromise r6 = r0.doneAllocatingPromises()
            return r6
        L4e:
            r6 = move-exception
            r10.release()     // Catch: java.lang.Throwable -> L59
            r0.setFailure(r6)
            r0.doneAllocatingPromises()
            return r0
        L59:
            r7 = move-exception
            r0.setFailure(r6)
            r0.doneAllocatingPromises()
            throw r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r12, int r13, io.netty.handler.codec.http2.Http2Headers r14, int r15, short r16, boolean r17, int r18, boolean r19, io.netty.channel.ChannelPromise r20) {
            r11 = this;
            r6 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r4 = r18
            r5 = r19
            r10 = r20
            io.netty.channel.ChannelFuture r12 = r0.writeHeadersInternal(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r12, int r13, io.netty.handler.codec.http2.Http2Headers r14, int r15, boolean r16, io.netty.channel.ChannelPromise r17) {
            r11 = this;
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r10 = r17
            io.netty.channel.ChannelFuture r12 = r0.writeHeadersInternal(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePing(io.netty.channel.ChannelHandlerContext r5, boolean r6, long r7, io.netty.channel.ChannelPromise r9) {
            r4 = this;
            if (r6 == 0) goto Ld
            io.netty.handler.codec.http2.Http2Flags r6 = new io.netty.handler.codec.http2.Http2Flags
            r6.<init>()
            r0 = 1
            io.netty.handler.codec.http2.Http2Flags r6 = r6.ack(r0)
            goto L12
        Ld:
            io.netty.handler.codec.http2.Http2Flags r6 = new io.netty.handler.codec.http2.Http2Flags
            r6.<init>()
        L12:
            io.netty.buffer.ByteBufAllocator r0 = r5.alloc()
            r1 = 17
            io.netty.buffer.ByteBuf r0 = r0.buffer(r1)
            r1 = 6
            r2 = 0
            r3 = 8
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r0, r3, r1, r6, r2)
            r0.writeLong(r7)
            io.netty.channel.ChannelFuture r5 = r5.write(r0, r9)
            return r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePriority(io.netty.channel.ChannelHandlerContext r5, int r6, int r7, short r8, boolean r9, io.netty.channel.ChannelPromise r10) {
            r4 = this;
            java.lang.String r0 = "Stream ID"
            verifyStreamId(r6, r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "Stream Dependency"
            verifyStreamId(r7, r0)     // Catch: java.lang.Throwable -> L38
            verifyWeight(r8)     // Catch: java.lang.Throwable -> L38
            io.netty.buffer.ByteBufAllocator r0 = r5.alloc()     // Catch: java.lang.Throwable -> L38
            r1 = 14
            io.netty.buffer.ByteBuf r0 = r0.buffer(r1)     // Catch: java.lang.Throwable -> L38
            io.netty.handler.codec.http2.Http2Flags r1 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L38
            r2 = 5
            r3 = 2
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r0, r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L2b
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r6 = (long) r7     // Catch: java.lang.Throwable -> L38
            long r6 = r6 | r1
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L38
        L2b:
            r0.writeInt(r7)     // Catch: java.lang.Throwable -> L38
            int r8 = r8 + (-1)
            r0.writeByte(r8)     // Catch: java.lang.Throwable -> L38
            io.netty.channel.ChannelFuture r5 = r5.write(r0, r10)     // Catch: java.lang.Throwable -> L38
            return r5
        L38:
            r5 = move-exception
            io.netty.channel.ChannelPromise r5 = r10.setFailure(r5)
            return r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePushPromise(io.netty.channel.ChannelHandlerContext r7, int r8, int r9, io.netty.handler.codec.http2.Http2Headers r10, int r11, io.netty.channel.ChannelPromise r12) {
            r6 = this;
            r0 = r12
            io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator r12 = new io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator
            io.netty.channel.Channel r1 = r7.channel()
            io.netty.util.concurrent.EventExecutor r2 = r7.executor()
            r12.<init>(r0, r1, r2)
            r1 = 0
            java.lang.String r0 = "Stream ID"
            verifyStreamId(r8, r0)     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            java.lang.String r0 = "Promised Stream ID"
            verifyStreamId(r9, r0)     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            io.netty.handler.codec.http2.Http2CodecUtil.verifyPadding(r11)     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            io.netty.buffer.ByteBufAllocator r0 = r7.alloc()     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            io.netty.buffer.ByteBuf r1 = r0.buffer()     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            io.netty.handler.codec.http2.Http2HeadersEncoder r0 = r6.headersEncoder     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r0.encodeHeaders(r8, r10, r1)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            io.netty.handler.codec.http2.Http2Flags r10 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r10.<init>()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r0 = 0
            r2 = 1
            if (r11 <= 0) goto L34
            r3 = 1
            goto L35
        L34:
            r3 = 0
        L35:
            io.netty.handler.codec.http2.Http2Flags r10 = r10.paddingPresent(r3)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            int r3 = r11 + 4
            int r4 = r6.maxFrameSize     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            int r4 = r4 - r3
            int r5 = r1.readableBytes()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            int r4 = java.lang.Math.min(r5, r4)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            io.netty.buffer.ByteBuf r4 = r1.readRetainedSlice(r4)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            boolean r5 = r1.isReadable()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r2 = r2 ^ r5
            r10.endOfHeaders(r2)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            int r2 = r4.readableBytes()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            int r2 = r2 + r3
            io.netty.buffer.ByteBufAllocator r3 = r7.alloc()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r5 = 14
            io.netty.buffer.ByteBuf r3 = r3.buffer(r5)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r5 = 5
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r3, r2, r5, r10, r8)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            writePaddingLength(r3, r11)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r3.writeInt(r9)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            io.netty.channel.ChannelPromise r9 = r12.newPromise()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r7.write(r3, r9)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            io.netty.channel.ChannelPromise r9 = r12.newPromise()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            r7.write(r4, r9)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            int r9 = paddingBytes(r11)     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            if (r9 <= 0) goto L97
            io.netty.buffer.ByteBuf r9 = io.netty.handler.codec.http2.DefaultHttp2FrameWriter.ZERO_BUFFER     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            int r2 = paddingBytes(r11)     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            io.netty.buffer.ByteBuf r9 = r9.slice(r0, r2)     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            io.netty.channel.ChannelPromise r0 = r12.newPromise()     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            r7.write(r9, r0)     // Catch: java.lang.Throwable -> L91 io.netty.handler.codec.http2.Http2Exception -> L94
            goto L97
        L91:
            r0 = move-exception
        L92:
            r7 = r0
            goto Lb8
        L94:
            r0 = move-exception
        L95:
            r7 = r0
            goto Lca
        L97:
            boolean r9 = r10.endOfHeaders()     // Catch: java.lang.Throwable -> Lb2 io.netty.handler.codec.http2.Http2Exception -> Lb5
            if (r9 != 0) goto Lad
            r9 = r8
            r10 = r1
            r8 = r7
            r7 = r6
            r7.writeContinuationFrames(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La5 io.netty.handler.codec.http2.Http2Exception -> La9
            goto Lae
        La5:
            r0 = move-exception
            r7 = r0
            r1 = r10
            goto Lb8
        La9:
            r0 = move-exception
            r7 = r0
            r1 = r10
            goto Lca
        Lad:
            r10 = r1
        Lae:
            r10.release()
            goto Ld0
        Lb2:
            r0 = move-exception
            r10 = r1
            goto L92
        Lb5:
            r0 = move-exception
            r10 = r1
            goto L95
        Lb8:
            r12.setFailure(r7)     // Catch: java.lang.Throwable -> Lc7
            r12.doneAllocatingPromises()     // Catch: java.lang.Throwable -> Lc7
            io.netty.util.internal.PlatformDependent.throwException(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Ld0
        Lc3:
            r1.release()
            goto Ld0
        Lc7:
            r0 = move-exception
            r7 = r0
            goto Ld5
        Lca:
            r12.setFailure(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Ld0
            goto Lc3
        Ld0:
            io.netty.channel.ChannelPromise r7 = r12.doneAllocatingPromises()
            return r7
        Ld5:
            if (r1 == 0) goto Lda
            r1.release()
        Lda:
            throw r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeRstStream(io.netty.channel.ChannelHandlerContext r5, int r6, long r7, io.netty.channel.ChannelPromise r9) {
            r4 = this;
            java.lang.String r0 = "Stream ID"
            verifyStreamId(r6, r0)     // Catch: java.lang.Throwable -> L25
            verifyErrorCode(r7)     // Catch: java.lang.Throwable -> L25
            io.netty.buffer.ByteBufAllocator r0 = r5.alloc()     // Catch: java.lang.Throwable -> L25
            r1 = 13
            io.netty.buffer.ByteBuf r0 = r0.buffer(r1)     // Catch: java.lang.Throwable -> L25
            io.netty.handler.codec.http2.Http2Flags r1 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            r2 = 4
            r3 = 3
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r0, r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L25
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r6)     // Catch: java.lang.Throwable -> L25
            io.netty.channel.ChannelFuture r5 = r5.write(r0, r9)     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r5 = move-exception
            io.netty.channel.ChannelPromise r5 = r9.setFailure(r5)
            return r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettings(io.netty.channel.ChannelHandlerContext r6, io.netty.handler.codec.http2.Http2Settings r7, io.netty.channel.ChannelPromise r8) {
            r5 = this;
            java.lang.String r0 = "settings"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)     // Catch: java.lang.Throwable -> L4e
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L4e
            int r0 = r0 * 6
            io.netty.buffer.ByteBufAllocator r1 = r6.alloc()     // Catch: java.lang.Throwable -> L4e
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L4e
            int r2 = r2 * 6
            int r2 = r2 + 9
            io.netty.buffer.ByteBuf r1 = r1.buffer(r2)     // Catch: java.lang.Throwable -> L4e
            io.netty.handler.codec.http2.Http2Flags r2 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            r4 = 4
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r1, r0, r4, r2, r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Iterable r7 = r7.entries()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L4e
        L2d:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L50
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L4e
            io.netty.util.collection.CharObjectMap$PrimitiveEntry r0 = (io.netty.util.collection.CharObjectMap.PrimitiveEntry) r0     // Catch: java.lang.Throwable -> L4e
            char r2 = r0.key()     // Catch: java.lang.Throwable -> L4e
            r1.writeChar(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r0 = r0.value()     // Catch: java.lang.Throwable -> L4e
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L4e
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4e
            r1.writeInt(r0)     // Catch: java.lang.Throwable -> L4e
            goto L2d
        L4e:
            r6 = move-exception
            goto L55
        L50:
            io.netty.channel.ChannelFuture r6 = r6.write(r1, r8)     // Catch: java.lang.Throwable -> L4e
            return r6
        L55:
            io.netty.channel.ChannelPromise r6 = r8.setFailure(r6)
            return r6
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettingsAck(io.netty.channel.ChannelHandlerContext r5, io.netty.channel.ChannelPromise r6) {
            r4 = this;
            io.netty.buffer.ByteBufAllocator r0 = r5.alloc()     // Catch: java.lang.Throwable -> L1e
            r1 = 9
            io.netty.buffer.ByteBuf r0 = r0.buffer(r1)     // Catch: java.lang.Throwable -> L1e
            io.netty.handler.codec.http2.Http2Flags r1 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            io.netty.handler.codec.http2.Http2Flags r1 = r1.ack(r2)     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r3 = 4
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r0, r2, r3, r1, r2)     // Catch: java.lang.Throwable -> L1e
            io.netty.channel.ChannelFuture r5 = r5.write(r0, r6)     // Catch: java.lang.Throwable -> L1e
            return r5
        L1e:
            r5 = move-exception
            io.netty.channel.ChannelPromise r5 = r6.setFailure(r5)
            return r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeWindowUpdate(io.netty.channel.ChannelHandlerContext r5, int r6, int r7, io.netty.channel.ChannelPromise r8) {
            r4 = this;
            java.lang.String r0 = "Stream ID"
            verifyStreamOrConnectionId(r6, r0)     // Catch: java.lang.Throwable -> L25
            verifyWindowSizeIncrement(r7)     // Catch: java.lang.Throwable -> L25
            io.netty.buffer.ByteBufAllocator r0 = r5.alloc()     // Catch: java.lang.Throwable -> L25
            r1 = 13
            io.netty.buffer.ByteBuf r0 = r0.buffer(r1)     // Catch: java.lang.Throwable -> L25
            io.netty.handler.codec.http2.Http2Flags r1 = new io.netty.handler.codec.http2.Http2Flags     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            r2 = 4
            r3 = 8
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeaderInternal(r0, r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L25
            r0.writeInt(r7)     // Catch: java.lang.Throwable -> L25
            io.netty.channel.ChannelFuture r5 = r5.write(r0, r8)     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r5 = move-exception
            io.netty.channel.ChannelPromise r5 = r8.setFailure(r5)
            return r5
    }
}

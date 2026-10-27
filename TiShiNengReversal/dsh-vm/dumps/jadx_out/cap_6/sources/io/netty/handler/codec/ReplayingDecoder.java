package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ReplayingDecoder<S> extends io.netty.handler.codec.ByteToMessageDecoder {
    static final io.netty.util.Signal REPLAY = null;
    private int checkpoint;
    private final io.netty.handler.codec.ReplayingDecoderByteBuf replayable;
    private S state;

    static {
            java.lang.Class<io.netty.handler.codec.ReplayingDecoder> r0 = io.netty.handler.codec.ReplayingDecoder.class
            java.lang.String r1 = "REPLAY"
            io.netty.util.Signal r0 = io.netty.util.Signal.valueOf(r0, r1)
            io.netty.handler.codec.ReplayingDecoder.REPLAY = r0
            return
    }

    protected ReplayingDecoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected ReplayingDecoder(S r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.ReplayingDecoderByteBuf r0 = new io.netty.handler.codec.ReplayingDecoderByteBuf
            r0.<init>()
            r1.replayable = r0
            r0 = -1
            r1.checkpoint = r0
            r1.state = r2
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void callDecode(io.netty.channel.ChannelHandlerContext r6, io.netty.buffer.ByteBuf r7, java.util.List<java.lang.Object> r8) {
            r5 = this;
            io.netty.handler.codec.ReplayingDecoderByteBuf r0 = r5.replayable
            r0.setCumulation(r7)
        L5:
            boolean r0 = r7.isReadable()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r0 == 0) goto Lb6
            int r0 = r7.readerIndex()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            r5.checkpoint = r0     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            int r1 = r8.size()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r1 <= 0) goto L2d
            io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(r6, r8, r1)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            r8.clear()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            boolean r1 = r6.isRemoved()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r1 == 0) goto L25
            goto Lb6
        L25:
            r1 = 0
            goto L2d
        L27:
            r6 = move-exception
            goto Lb7
        L2a:
            r6 = move-exception
            goto Lbd
        L2d:
            S r2 = r5.state     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            int r3 = r7.readableBytes()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            io.netty.handler.codec.ReplayingDecoderByteBuf r4 = r5.replayable     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            r5.decodeRemovalReentryProtection(r6, r4, r8)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            boolean r4 = r6.isRemoved()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            if (r4 == 0) goto L40
            goto Lb6
        L40:
            int r4 = r8.size()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            if (r1 != r4) goto L72
            int r0 = r7.readableBytes()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            if (r3 != r0) goto L5
            S r0 = r5.state     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            if (r2 == r0) goto L51
            goto L5
        L51:
            io.netty.handler.codec.DecoderException r8 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            r0.<init>()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            r0.append(r1)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            java.lang.String r1 = ".decode() must consume the inbound data or change its state if it did not decode anything."
            r0.append(r1)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            r8.<init>(r0)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
            throw r8     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a io.netty.util.Signal -> L70
        L70:
            r8 = move-exception
            goto La3
        L72:
            int r1 = r7.readerIndex()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r0 != r1) goto L9c
            S r0 = r5.state     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r2 == r0) goto L7d
            goto L9c
        L7d:
            io.netty.handler.codec.DecoderException r6 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            r7.<init>()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            java.lang.Class r8 = r5.getClass()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            java.lang.String r8 = io.netty.util.internal.StringUtil.simpleClassName(r8)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            r7.append(r8)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            java.lang.String r8 = ".decode() method must consume the inbound data or change its state if it decoded something."
            r7.append(r8)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            r6.<init>(r7)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            throw r6     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
        L9c:
            boolean r0 = r5.isSingleDecode()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r0 == 0) goto L5
            goto Lb6
        La3:
            io.netty.util.Signal r0 = io.netty.handler.codec.ReplayingDecoder.REPLAY     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            r8.expect(r0)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            boolean r6 = r6.isRemoved()     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r6 == 0) goto Laf
            goto Lb6
        Laf:
            int r6 = r5.checkpoint     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
            if (r6 < 0) goto Lb6
            r7.readerIndex(r6)     // Catch: java.lang.Exception -> L27 io.netty.handler.codec.DecoderException -> L2a
        Lb6:
            return
        Lb7:
            io.netty.handler.codec.DecoderException r7 = new io.netty.handler.codec.DecoderException
            r7.<init>(r6)
            throw r7
        Lbd:
            throw r6
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    final void channelInputClosed(io.netty.channel.ChannelHandlerContext r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.ReplayingDecoderByteBuf r0 = r2.replayable     // Catch: io.netty.util.Signal -> L11
            r0.terminate()     // Catch: io.netty.util.Signal -> L11
            io.netty.buffer.ByteBuf r0 = r2.cumulation     // Catch: io.netty.util.Signal -> L11
            if (r0 == 0) goto L13
            io.netty.buffer.ByteBuf r0 = r2.internalBuffer()     // Catch: io.netty.util.Signal -> L11
            r2.callDecode(r3, r0, r4)     // Catch: io.netty.util.Signal -> L11
            goto L1a
        L11:
            r3 = move-exception
            goto L20
        L13:
            io.netty.handler.codec.ReplayingDecoderByteBuf r0 = r2.replayable     // Catch: io.netty.util.Signal -> L11
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: io.netty.util.Signal -> L11
            r0.setCumulation(r1)     // Catch: io.netty.util.Signal -> L11
        L1a:
            io.netty.handler.codec.ReplayingDecoderByteBuf r0 = r2.replayable     // Catch: io.netty.util.Signal -> L11
            r2.decodeLast(r3, r0, r4)     // Catch: io.netty.util.Signal -> L11
            return
        L20:
            io.netty.util.Signal r4 = io.netty.handler.codec.ReplayingDecoder.REPLAY
            r3.expect(r4)
            return
    }

    protected void checkpoint() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.internalBuffer()
            int r0 = r0.readerIndex()
            r1.checkpoint = r0
            return
    }

    protected void checkpoint(S r1) {
            r0 = this;
            r0.checkpoint()
            r0.state(r1)
            return
    }

    protected S state() {
            r1 = this;
            S r0 = r1.state
            return r0
    }

    protected S state(S r2) {
            r1 = this;
            S r0 = r1.state
            r1.state = r2
            return r0
    }
}

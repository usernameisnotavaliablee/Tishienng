package io.netty.handler.codec;

import io.netty.buffer.ByteBufHolder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class MessageAggregator<I, S, C extends io.netty.buffer.ByteBufHolder, O extends io.netty.buffer.ByteBufHolder> extends io.netty.handler.codec.MessageToMessageDecoder<I> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DEFAULT_MAX_COMPOSITEBUFFER_COMPONENTS = 1024;
    private boolean aggregating;
    private io.netty.channel.ChannelFutureListener continueResponseWriteListener;
    private io.netty.channel.ChannelHandlerContext ctx;
    private O currentMessage;
    private boolean handlingOversizedMessage;
    private final int maxContentLength;
    private int maxCumulationBufferComponents;


    static {
            return
    }

    protected MessageAggregator(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            r1.maxCumulationBufferComponents = r0
            validateMaxContentLength(r2)
            r1.maxContentLength = r2
            return
    }

    protected MessageAggregator(int r1, java.lang.Class<? extends I> r2) {
            r0 = this;
            r0.<init>(r2)
            r2 = 1024(0x400, float:1.435E-42)
            r0.maxCumulationBufferComponents = r2
            validateMaxContentLength(r1)
            r0.maxContentLength = r1
            return
    }

    private static void appendPartialContent(io.netty.buffer.CompositeByteBuf r1, io.netty.buffer.ByteBuf r2) {
            boolean r0 = r2.isReadable()
            if (r0 == 0) goto Le
            r0 = 1
            io.netty.buffer.ByteBuf r2 = r2.retain()
            r1.addComponent(r0, r2)
        Le:
            return
    }

    private void finishAggregation0(O r2) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            r1.aggregating = r0
            r1.finishAggregation(r2)
            return
    }

    private void invokeHandleOversizedMessage(io.netty.channel.ChannelHandlerContext r2, S r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            r1.handlingOversizedMessage = r0
            r0 = 0
            r1.currentMessage = r0
            r1.handleOversizedMessage(r2, r3)     // Catch: java.lang.Throwable -> Ld
            io.netty.util.ReferenceCountUtil.release(r3)
            return
        Ld:
            r2 = move-exception
            io.netty.util.ReferenceCountUtil.release(r3)
            throw r2
    }

    private void releaseCurrentMessage() {
            r1 = this;
            O extends io.netty.buffer.ByteBufHolder r0 = r1.currentMessage
            if (r0 == 0) goto Lf
            r0.release()
            r0 = 0
            r1.currentMessage = r0
            r0 = 0
            r1.handlingOversizedMessage = r0
            r1.aggregating = r0
        Lf:
            return
    }

    private static void validateMaxContentLength(int r1) {
            java.lang.String r0 = "maxContentLength"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r1, r0)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public boolean acceptInboundMessage(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = super.acceptInboundMessage(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r3.isAggregated(r4)
            if (r0 == 0) goto Lf
            return r1
        Lf:
            boolean r0 = r3.isStartMessage(r4)
            r2 = 1
            if (r0 == 0) goto L19
            r3.aggregating = r2
            return r2
        L19:
            boolean r0 = r3.aggregating
            if (r0 == 0) goto L24
            boolean r4 = r3.isContentMessage(r4)
            if (r4 == 0) goto L24
            return r2
        L24:
            return r1
    }

    protected void aggregate(O r1, C r2) throws java.lang.Exception {
            r0 = this;
            return
    }

    protected abstract O beginAggregation(S r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            super.channelInactive(r1)     // Catch: java.lang.Throwable -> L7
            r0.releaseCurrentMessage()
            return
        L7:
            r1 = move-exception
            r0.releaseCurrentMessage()
            throw r1
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            O extends io.netty.buffer.ByteBufHolder r0 = r1.currentMessage
            if (r0 == 0) goto L15
            io.netty.channel.Channel r0 = r2.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L15
            r2.read()
        L15:
            r2.fireChannelReadComplete()
            return
    }

    protected abstract boolean closeAfterContinueResponse(java.lang.Object r1) throws java.lang.Exception;

    protected final io.netty.channel.ChannelHandlerContext ctx() {
            r2 = this;
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not added to a pipeline yet"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r6, I r7, java.util.List<java.lang.Object> r8) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r5.isStartMessage(r7)
            r1 = 0
            if (r0 == 0) goto Lad
            r0 = 0
            r5.handlingOversizedMessage = r0
            O extends io.netty.buffer.ByteBufHolder r0 = r5.currentMessage
            if (r0 != 0) goto La2
            int r0 = r5.maxContentLength
            io.netty.channel.ChannelPipeline r1 = r6.pipeline()
            java.lang.Object r0 = r5.newContinueResponse(r7, r0, r1)
            if (r0 == 0) goto L45
            io.netty.channel.ChannelFutureListener r1 = r5.continueResponseWriteListener
            if (r1 != 0) goto L25
            io.netty.handler.codec.MessageAggregator$1 r1 = new io.netty.handler.codec.MessageAggregator$1
            r1.<init>(r5, r6)
            r5.continueResponseWriteListener = r1
        L25:
            boolean r2 = r5.closeAfterContinueResponse(r0)
            boolean r3 = r5.ignoreContentAfterContinueResponse(r0)
            r5.handlingOversizedMessage = r3
            io.netty.channel.ChannelFuture r0 = r6.writeAndFlush(r0)
            io.netty.channel.ChannelFuture r0 = r0.addListener(r1)
            if (r2 == 0) goto L3f
            io.netty.channel.ChannelFutureListener r6 = io.netty.channel.ChannelFutureListener.CLOSE
            r0.addListener(r6)
            return
        L3f:
            boolean r0 = r5.handlingOversizedMessage
            if (r0 == 0) goto L51
            goto L120
        L45:
            int r0 = r5.maxContentLength
            boolean r0 = r5.isContentLengthInvalid(r7, r0)
            if (r0 == 0) goto L51
            r5.invokeHandleOversizedMessage(r6, r7)
            return
        L51:
            boolean r0 = r7 instanceof io.netty.handler.codec.DecoderResultProvider
            if (r0 == 0) goto L83
            r0 = r7
            io.netty.handler.codec.DecoderResultProvider r0 = (io.netty.handler.codec.DecoderResultProvider) r0
            io.netty.handler.codec.DecoderResult r0 = r0.decoderResult()
            boolean r0 = r0.isSuccess()
            if (r0 != 0) goto L83
            boolean r6 = r7 instanceof io.netty.buffer.ByteBufHolder
            if (r6 == 0) goto L76
            r6 = r7
            io.netty.buffer.ByteBufHolder r6 = (io.netty.buffer.ByteBufHolder) r6
            io.netty.buffer.ByteBuf r6 = r6.content()
            io.netty.buffer.ByteBuf r6 = r6.retain()
            io.netty.buffer.ByteBufHolder r6 = r5.beginAggregation(r7, r6)
            goto L7c
        L76:
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            io.netty.buffer.ByteBufHolder r6 = r5.beginAggregation(r7, r6)
        L7c:
            r5.finishAggregation0(r6)
            r8.add(r6)
            return
        L83:
            io.netty.buffer.ByteBufAllocator r6 = r6.alloc()
            int r8 = r5.maxCumulationBufferComponents
            io.netty.buffer.CompositeByteBuf r6 = r6.compositeBuffer(r8)
            boolean r8 = r7 instanceof io.netty.buffer.ByteBufHolder
            if (r8 == 0) goto L9b
            r8 = r7
            io.netty.buffer.ByteBufHolder r8 = (io.netty.buffer.ByteBufHolder) r8
            io.netty.buffer.ByteBuf r8 = r8.content()
            appendPartialContent(r6, r8)
        L9b:
            io.netty.buffer.ByteBufHolder r6 = r5.beginAggregation(r7, r6)
            r5.currentMessage = r6
            return
        La2:
            r0.release()
            r5.currentMessage = r1
            io.netty.handler.codec.MessageAggregationException r6 = new io.netty.handler.codec.MessageAggregationException
            r6.<init>()
            throw r6
        Lad:
            boolean r0 = r5.isContentMessage(r7)
            if (r0 == 0) goto L121
            O extends io.netty.buffer.ByteBufHolder r0 = r5.currentMessage
            if (r0 != 0) goto Lb8
            goto L120
        Lb8:
            io.netty.buffer.ByteBuf r0 = r0.content()
            io.netty.buffer.CompositeByteBuf r0 = (io.netty.buffer.CompositeByteBuf) r0
            io.netty.buffer.ByteBufHolder r7 = (io.netty.buffer.ByteBufHolder) r7
            int r2 = r0.readableBytes()
            int r3 = r5.maxContentLength
            io.netty.buffer.ByteBuf r4 = r7.content()
            int r4 = r4.readableBytes()
            int r3 = r3 - r4
            if (r2 <= r3) goto Ld7
            O extends io.netty.buffer.ByteBufHolder r7 = r5.currentMessage
            r5.invokeHandleOversizedMessage(r6, r7)
            return
        Ld7:
            io.netty.buffer.ByteBuf r6 = r7.content()
            appendPartialContent(r0, r6)
            O extends io.netty.buffer.ByteBufHolder r6 = r5.currentMessage
            r5.aggregate(r6, r7)
            boolean r6 = r7 instanceof io.netty.handler.codec.DecoderResultProvider
            if (r6 == 0) goto L10e
            r6 = r7
            io.netty.handler.codec.DecoderResultProvider r6 = (io.netty.handler.codec.DecoderResultProvider) r6
            io.netty.handler.codec.DecoderResult r6 = r6.decoderResult()
            boolean r0 = r6.isSuccess()
            if (r0 != 0) goto L109
            O extends io.netty.buffer.ByteBufHolder r7 = r5.currentMessage
            boolean r0 = r7 instanceof io.netty.handler.codec.DecoderResultProvider
            if (r0 == 0) goto L107
            io.netty.handler.codec.DecoderResultProvider r7 = (io.netty.handler.codec.DecoderResultProvider) r7
            java.lang.Throwable r6 = r6.cause()
            io.netty.handler.codec.DecoderResult r6 = io.netty.handler.codec.DecoderResult.failure(r6)
            r7.setDecoderResult(r6)
        L107:
            r6 = 1
            goto L112
        L109:
            boolean r6 = r5.isLastContentMessage(r7)
            goto L112
        L10e:
            boolean r6 = r5.isLastContentMessage(r7)
        L112:
            if (r6 == 0) goto L120
            O extends io.netty.buffer.ByteBufHolder r6 = r5.currentMessage
            r5.finishAggregation0(r6)
            O extends io.netty.buffer.ByteBufHolder r6 = r5.currentMessage
            r8.add(r6)
            r5.currentMessage = r1
        L120:
            return
        L121:
            io.netty.handler.codec.MessageAggregationException r6 = new io.netty.handler.codec.MessageAggregationException
            r6.<init>()
            throw r6
    }

    protected void finishAggregation(O r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    protected void handleOversizedMessage(io.netty.channel.ChannelHandlerContext r3, S r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.TooLongFrameException r4 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "content length exceeded "
            r0.append(r1)
            int r1 = r2.maxContentLength()
            r0.append(r1)
            java.lang.String r1 = " bytes."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            r3.fireExceptionCaught(r4)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            super.handlerRemoved(r1)     // Catch: java.lang.Throwable -> L7
            r0.releaseCurrentMessage()
            return
        L7:
            r1 = move-exception
            r0.releaseCurrentMessage()
            throw r1
    }

    protected abstract boolean ignoreContentAfterContinueResponse(java.lang.Object r1) throws java.lang.Exception;

    protected abstract boolean isAggregated(I r1) throws java.lang.Exception;

    protected abstract boolean isContentLengthInvalid(S r1, int r2) throws java.lang.Exception;

    protected abstract boolean isContentMessage(I r1) throws java.lang.Exception;

    @java.lang.Deprecated
    public final boolean isHandlingOversizedMessage() {
            r1 = this;
            boolean r0 = r1.handlingOversizedMessage
            return r0
    }

    protected abstract boolean isLastContentMessage(C r1) throws java.lang.Exception;

    protected abstract boolean isStartMessage(I r1) throws java.lang.Exception;

    public final int maxContentLength() {
            r1 = this;
            int r0 = r1.maxContentLength
            return r0
    }

    public final int maxCumulationBufferComponents() {
            r1 = this;
            int r0 = r1.maxCumulationBufferComponents
            return r0
    }

    protected abstract java.lang.Object newContinueResponse(S r1, int r2, io.netty.channel.ChannelPipeline r3) throws java.lang.Exception;

    public final void setMaxCumulationBufferComponents(int r4) {
            r3 = this;
            r0 = 2
            if (r4 < r0) goto L12
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx
            if (r0 != 0) goto La
            r3.maxCumulationBufferComponents = r4
            return
        La:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "decoder properties cannot be changed once the decoder is added to a pipeline."
            r4.<init>(r0)
            throw r4
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "maxCumulationBufferComponents: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: >= 2)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}

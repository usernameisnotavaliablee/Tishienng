package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class MessageToMessageEncoder<I> extends io.netty.channel.ChannelOutboundHandlerAdapter {
    private final io.netty.util.internal.TypeParameterMatcher matcher;

    protected MessageToMessageEncoder() {
            r2 = this;
            r2.<init>()
            java.lang.Class<io.netty.handler.codec.MessageToMessageEncoder> r0 = io.netty.handler.codec.MessageToMessageEncoder.class
            java.lang.String r1 = "I"
            io.netty.util.internal.TypeParameterMatcher r0 = io.netty.util.internal.TypeParameterMatcher.find(r2, r0, r1)
            r2.matcher = r0
            return
    }

    protected MessageToMessageEncoder(java.lang.Class<? extends I> r1) {
            r0 = this;
            r0.<init>()
            io.netty.util.internal.TypeParameterMatcher r1 = io.netty.util.internal.TypeParameterMatcher.get(r1)
            r0.matcher = r1
            return
    }

    private static void writePromiseCombiner(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.CodecOutputList r4, io.netty.channel.ChannelPromise r5) {
            io.netty.util.concurrent.PromiseCombiner r0 = new io.netty.util.concurrent.PromiseCombiner
            io.netty.util.concurrent.EventExecutor r1 = r3.executor()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r4.size()
            if (r1 >= r2) goto L1e
            java.lang.Object r2 = r4.getUnsafe(r1)
            io.netty.channel.ChannelFuture r2 = r3.write(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto La
        L1e:
            r0.finish(r5)
            return
    }

    private static void writeVoidPromise(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.CodecOutputList r4) {
            io.netty.channel.ChannelPromise r0 = r3.voidPromise()
            r1 = 0
        L5:
            int r2 = r4.size()
            if (r1 >= r2) goto L15
            java.lang.Object r2 = r4.getUnsafe(r1)
            r3.write(r2, r0)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.matcher
            boolean r2 = r0.match(r2)
            return r2
    }

    protected abstract void encode(io.netty.channel.ChannelHandlerContext r1, I r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6, io.netty.channel.ChannelPromise r7) throws java.lang.Exception {
            r4 = this;
            r0 = 0
            r1 = 0
            boolean r2 = r4.acceptOutboundMessage(r6)     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            if (r2 == 0) goto L47
            io.netty.handler.codec.CodecOutputList r2 = io.netty.handler.codec.CodecOutputList.newInstance()     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            r4.encode(r5, r6, r2)     // Catch: java.lang.Throwable -> L42
            io.netty.util.ReferenceCountUtil.release(r6)     // Catch: java.lang.Throwable -> L3c io.netty.handler.codec.EncoderException -> L3f
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> L3c io.netty.handler.codec.EncoderException -> L3f
            if (r6 != 0) goto L1a
            r1 = r2
            goto L4a
        L1a:
            r2.recycle()     // Catch: java.lang.Throwable -> L3c io.netty.handler.codec.EncoderException -> L3f
            io.netty.handler.codec.EncoderException r6 = new io.netty.handler.codec.EncoderException     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r4)     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            r2.append(r3)     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            java.lang.String r3 = " must produce at least one message."
            r2.append(r3)     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
            throw r6     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
        L38:
            r6 = move-exception
            goto L6f
        L3a:
            r6 = move-exception
            goto L77
        L3c:
            r6 = move-exception
            r1 = r2
            goto L6f
        L3f:
            r6 = move-exception
            r1 = r2
            goto L77
        L42:
            r1 = move-exception
            io.netty.util.ReferenceCountUtil.release(r6)     // Catch: java.lang.Throwable -> L3c io.netty.handler.codec.EncoderException -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3c io.netty.handler.codec.EncoderException -> L3f
        L47:
            r5.write(r6, r7)     // Catch: java.lang.Throwable -> L38 io.netty.handler.codec.EncoderException -> L3a
        L4a:
            if (r1 == 0) goto L6e
            int r6 = r1.size()
            int r6 = r6 + (-1)
            if (r6 != 0) goto L5c
            java.lang.Object r6 = r1.getUnsafe(r0)
            r5.write(r6, r7)
            goto L6b
        L5c:
            if (r6 <= 0) goto L6b
            io.netty.channel.ChannelPromise r6 = r5.voidPromise()
            if (r7 != r6) goto L68
            writeVoidPromise(r5, r1)
            goto L6b
        L68:
            writePromiseCombiner(r5, r1, r7)
        L6b:
            r1.recycle()
        L6e:
            return
        L6f:
            io.netty.handler.codec.EncoderException r2 = new io.netty.handler.codec.EncoderException     // Catch: java.lang.Throwable -> L75
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L75
            throw r2     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            goto L78
        L77:
            throw r6     // Catch: java.lang.Throwable -> L75
        L78:
            if (r1 == 0) goto L9c
            int r2 = r1.size()
            int r2 = r2 + (-1)
            if (r2 == 0) goto L92
            if (r2 <= 0) goto L99
            io.netty.channel.ChannelPromise r0 = r5.voidPromise()
            if (r7 != r0) goto L8e
            writeVoidPromise(r5, r1)
            goto L99
        L8e:
            writePromiseCombiner(r5, r1, r7)
            goto L99
        L92:
            java.lang.Object r0 = r1.getUnsafe(r0)
            r5.write(r0, r7)
        L99:
            r1.recycle()
        L9c:
            throw r6
    }
}

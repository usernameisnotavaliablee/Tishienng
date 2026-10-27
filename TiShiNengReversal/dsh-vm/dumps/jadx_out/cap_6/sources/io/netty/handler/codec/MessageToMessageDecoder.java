package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class MessageToMessageDecoder<I> extends io.netty.channel.ChannelInboundHandlerAdapter {
    private final io.netty.util.internal.TypeParameterMatcher matcher;

    protected MessageToMessageDecoder() {
            r2 = this;
            r2.<init>()
            java.lang.Class<io.netty.handler.codec.MessageToMessageDecoder> r0 = io.netty.handler.codec.MessageToMessageDecoder.class
            java.lang.String r1 = "I"
            io.netty.util.internal.TypeParameterMatcher r0 = io.netty.util.internal.TypeParameterMatcher.find(r2, r0, r1)
            r2.matcher = r0
            return
    }

    protected MessageToMessageDecoder(java.lang.Class<? extends I> r1) {
            r0 = this;
            r0.<init>()
            io.netty.util.internal.TypeParameterMatcher r1 = io.netty.util.internal.TypeParameterMatcher.get(r1)
            r0.matcher = r1
            return
    }

    public boolean acceptInboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.matcher
            boolean r2 = r0.match(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6) throws java.lang.Exception {
            r4 = this;
            io.netty.handler.codec.CodecOutputList r0 = io.netty.handler.codec.CodecOutputList.newInstance()
            r1 = 0
            boolean r2 = r4.acceptInboundMessage(r6)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14 io.netty.handler.codec.DecoderException -> L16
            if (r2 == 0) goto L1d
            r4.decode(r5, r6, r0)     // Catch: java.lang.Throwable -> L18
            io.netty.util.ReferenceCountUtil.release(r6)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14 io.netty.handler.codec.DecoderException -> L16
            goto L20
        L12:
            r6 = move-exception
            goto L3b
        L14:
            r6 = move-exception
            goto L34
        L16:
            r6 = move-exception
            goto L3a
        L18:
            r2 = move-exception
            io.netty.util.ReferenceCountUtil.release(r6)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14 io.netty.handler.codec.DecoderException -> L16
            throw r2     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14 io.netty.handler.codec.DecoderException -> L16
        L1d:
            r0.add(r6)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14 io.netty.handler.codec.DecoderException -> L16
        L20:
            int r6 = r0.size()
        L24:
            if (r1 >= r6) goto L30
            java.lang.Object r2 = r0.getUnsafe(r1)
            r5.fireChannelRead(r2)
            int r1 = r1 + 1
            goto L24
        L30:
            r0.recycle()
            return
        L34:
            io.netty.handler.codec.DecoderException r2 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Throwable -> L12
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L3a:
            throw r6     // Catch: java.lang.Throwable -> L12
        L3b:
            int r2 = r0.size()
        L3f:
            if (r1 >= r2) goto L4b
            java.lang.Object r3 = r0.getUnsafe(r1)
            r5.fireChannelRead(r3)
            int r1 = r1 + 1
            goto L3f
        L4b:
            r0.recycle()
            throw r6
    }

    protected abstract void decode(io.netty.channel.ChannelHandlerContext r1, I r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception;
}

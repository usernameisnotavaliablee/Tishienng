package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class MessageToByteEncoder<I> extends io.netty.channel.ChannelOutboundHandlerAdapter {
    private final io.netty.util.internal.TypeParameterMatcher matcher;
    private final boolean preferDirect;

    protected MessageToByteEncoder() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    protected MessageToByteEncoder(java.lang.Class<? extends I> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    protected MessageToByteEncoder(java.lang.Class<? extends I> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            io.netty.util.internal.TypeParameterMatcher r1 = io.netty.util.internal.TypeParameterMatcher.get(r1)
            r0.matcher = r1
            r0.preferDirect = r2
            return
    }

    protected MessageToByteEncoder(boolean r3) {
            r2 = this;
            r2.<init>()
            java.lang.Class<io.netty.handler.codec.MessageToByteEncoder> r0 = io.netty.handler.codec.MessageToByteEncoder.class
            java.lang.String r1 = "I"
            io.netty.util.internal.TypeParameterMatcher r0 = io.netty.util.internal.TypeParameterMatcher.find(r2, r0, r1)
            r2.matcher = r0
            r2.preferDirect = r3
            return
    }

    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.matcher
            boolean r2 = r0.match(r2)
            return r2
    }

    protected io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r1, I r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            if (r3 == 0) goto Lb
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer()
            return r1
        Lb:
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = r1.heapBuffer()
            return r1
    }

    protected abstract void encode(io.netty.channel.ChannelHandlerContext r1, I r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception;

    protected boolean isPreferDirect() {
            r1 = this;
            boolean r0 = r1.preferDirect
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            boolean r1 = r2.acceptOutboundMessage(r4)     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            if (r1 == 0) goto L2f
            boolean r1 = r2.preferDirect     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            io.netty.buffer.ByteBuf r0 = r2.allocateBuffer(r3, r4, r1)     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            r2.encode(r3, r4, r0)     // Catch: java.lang.Throwable -> L2a
            io.netty.util.ReferenceCountUtil.release(r4)     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            boolean r4 = r0.isReadable()     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            if (r4 == 0) goto L21
            r3.write(r0, r5)     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            goto L29
        L1d:
            r3 = move-exception
            goto L33
        L1f:
            r3 = move-exception
            goto L3b
        L21:
            r0.release()     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            r3.write(r4, r5)     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
        L29:
            return
        L2a:
            r3 = move-exception
            io.netty.util.ReferenceCountUtil.release(r4)     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
        L2f:
            r3.write(r4, r5)     // Catch: java.lang.Throwable -> L1d io.netty.handler.codec.EncoderException -> L1f
            return
        L33:
            io.netty.handler.codec.EncoderException r4 = new io.netty.handler.codec.EncoderException     // Catch: java.lang.Throwable -> L39
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L39
            throw r4     // Catch: java.lang.Throwable -> L39
        L39:
            r3 = move-exception
            goto L3c
        L3b:
            throw r3     // Catch: java.lang.Throwable -> L39
        L3c:
            if (r0 == 0) goto L41
            r0.release()
        L41:
            throw r3
    }
}

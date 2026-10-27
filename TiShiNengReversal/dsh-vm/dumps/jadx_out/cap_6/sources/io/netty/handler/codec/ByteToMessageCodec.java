package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ByteToMessageCodec<I> extends io.netty.channel.ChannelDuplexHandler {
    private final io.netty.handler.codec.ByteToMessageDecoder decoder;
    private final io.netty.handler.codec.MessageToByteEncoder<I> encoder;
    private final io.netty.util.internal.TypeParameterMatcher outboundMsgMatcher;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Encoder extends io.netty.handler.codec.MessageToByteEncoder<I> {
        final /* synthetic */ io.netty.handler.codec.ByteToMessageCodec this$0;

        Encoder(io.netty.handler.codec.ByteToMessageCodec r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.handler.codec.MessageToByteEncoder
        public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
                r1 = this;
                io.netty.handler.codec.ByteToMessageCodec r0 = r1.this$0
                boolean r2 = r0.acceptOutboundMessage(r2)
                return r2
        }

        @Override // io.netty.handler.codec.MessageToByteEncoder
        protected void encode(io.netty.channel.ChannelHandlerContext r2, I r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
                r1 = this;
                io.netty.handler.codec.ByteToMessageCodec r0 = r1.this$0
                r0.encode(r2, r3, r4)
                return
        }
    }

    protected ByteToMessageCodec() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    protected ByteToMessageCodec(java.lang.Class<? extends I> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    protected ByteToMessageCodec(java.lang.Class<? extends I> r2, boolean r3) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.ByteToMessageCodec$1 r0 = new io.netty.handler.codec.ByteToMessageCodec$1
            r0.<init>(r1)
            r1.decoder = r0
            r1.ensureNotSharable()
            io.netty.util.internal.TypeParameterMatcher r2 = io.netty.util.internal.TypeParameterMatcher.get(r2)
            r1.outboundMsgMatcher = r2
            io.netty.handler.codec.ByteToMessageCodec$Encoder r2 = new io.netty.handler.codec.ByteToMessageCodec$Encoder
            r2.<init>(r1, r3)
            r1.encoder = r2
            return
    }

    protected ByteToMessageCodec(boolean r3) {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.ByteToMessageCodec$1 r0 = new io.netty.handler.codec.ByteToMessageCodec$1
            r0.<init>(r2)
            r2.decoder = r0
            r2.ensureNotSharable()
            java.lang.Class<io.netty.handler.codec.ByteToMessageCodec> r0 = io.netty.handler.codec.ByteToMessageCodec.class
            java.lang.String r1 = "I"
            io.netty.util.internal.TypeParameterMatcher r0 = io.netty.util.internal.TypeParameterMatcher.find(r2, r0, r1)
            r2.outboundMsgMatcher = r0
            io.netty.handler.codec.ByteToMessageCodec$Encoder r0 = new io.netty.handler.codec.ByteToMessageCodec$Encoder
            r0.<init>(r2, r3)
            r2.encoder = r0
            return
    }

    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.outboundMsgMatcher
            boolean r2 = r0.match(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.ByteToMessageDecoder r0 = r1.decoder
            r0.channelInactive(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.ByteToMessageDecoder r0 = r1.decoder
            r0.channelRead(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.ByteToMessageDecoder r0 = r1.decoder
            r0.channelReadComplete(r2)
            return
    }

    protected abstract void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception;

    protected void decodeLast(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3.isReadable()
            if (r0 == 0) goto L9
            r1.decode(r2, r3, r4)
        L9:
            return
    }

    protected abstract void encode(io.netty.channel.ChannelHandlerContext r1, I r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.ByteToMessageDecoder r0 = r2.decoder     // Catch: java.lang.Throwable -> Lb
            r0.handlerAdded(r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.handler.codec.MessageToByteEncoder<I> r0 = r2.encoder
            r0.handlerAdded(r3)
            return
        Lb:
            r0 = move-exception
            io.netty.handler.codec.MessageToByteEncoder<I> r1 = r2.encoder
            r1.handlerAdded(r3)
            throw r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.ByteToMessageDecoder r0 = r2.decoder     // Catch: java.lang.Throwable -> Lb
            r0.handlerRemoved(r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.handler.codec.MessageToByteEncoder<I> r0 = r2.encoder
            r0.handlerRemoved(r3)
            return
        Lb:
            r0 = move-exception
            io.netty.handler.codec.MessageToByteEncoder<I> r1 = r2.encoder
            r1.handlerRemoved(r3)
            throw r0
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToByteEncoder<I> r0 = r1.encoder
            r0.write(r2, r3, r4)
            return
    }
}

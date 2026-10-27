package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OptionalSslHandler extends io.netty.handler.codec.ByteToMessageDecoder {
    private final io.netty.handler.ssl.SslContext sslContext;

    public OptionalSslHandler(io.netty.handler.ssl.SslContext r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "sslContext"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.ssl.SslContext r2 = (io.netty.handler.ssl.SslContext) r2
            r1.sslContext = r2
            return
    }

    private void handleNonSsl(io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            io.netty.channel.ChannelHandler r0 = r2.newNonSslHandler(r3)
            if (r0 == 0) goto L12
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            java.lang.String r1 = r2.newNonSslHandlerName()
            r3.replace(r2, r1, r0)
            return
        L12:
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            r3.remove(r2)
            return
    }

    private void handleSsl(io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = r2.sslContext     // Catch: java.lang.Throwable -> L13
            io.netty.handler.ssl.SslHandler r0 = r2.newSslHandler(r3, r1)     // Catch: java.lang.Throwable -> L13
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r2.newSslHandlerName()     // Catch: java.lang.Throwable -> L13
            r3.replace(r2, r1, r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r3 = move-exception
            if (r0 == 0) goto L1d
            javax.net.ssl.SSLEngine r0 = r0.engine()
            io.netty.util.ReferenceCountUtil.safeRelease(r0)
        L1d:
            throw r3
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            int r4 = r3.readableBytes()
            r0 = 5
            if (r4 >= r0) goto L8
            return
        L8:
            boolean r3 = io.netty.handler.ssl.SslHandler.isEncrypted(r3)
            if (r3 == 0) goto L12
            r1.handleSsl(r2)
            return
        L12:
            r1.handleNonSsl(r2)
            return
    }

    protected io.netty.channel.ChannelHandler newNonSslHandler(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected java.lang.String newNonSslHandlerName() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected io.netty.handler.ssl.SslHandler newSslHandler(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.ssl.SslContext r2) {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.handler.ssl.SslHandler r1 = r2.newHandler(r1)
            return r1
    }

    protected java.lang.String newSslHandlerName() {
            r1 = this;
            r0 = 0
            return r0
    }
}

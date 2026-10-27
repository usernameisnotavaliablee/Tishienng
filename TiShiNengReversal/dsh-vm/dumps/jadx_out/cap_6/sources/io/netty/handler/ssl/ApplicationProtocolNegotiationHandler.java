package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ApplicationProtocolNegotiationHandler extends io.netty.channel.ChannelInboundHandlerAdapter {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.lang.String fallbackProtocol;

    static {
            java.lang.Class<io.netty.handler.ssl.ApplicationProtocolNegotiationHandler> r0 = io.netty.handler.ssl.ApplicationProtocolNegotiationHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.ApplicationProtocolNegotiationHandler.logger = r0
            return
    }

    protected ApplicationProtocolNegotiationHandler(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "fallbackProtocol"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.fallbackProtocol = r2
            return
    }

    protected abstract void configurePipeline(io.netty.channel.ChannelHandlerContext r1, java.lang.String r2) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r4, java.lang.Throwable r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.ApplicationProtocolNegotiationHandler.logger
            java.lang.String r1 = "{} Failed to select the application-level protocol:"
            io.netty.channel.Channel r2 = r4.channel()
            r0.warn(r1, r2, r5)
            r4.fireExceptionCaught(r5)
            r4.close()
            return
    }

    protected void handshakeFailure(io.netty.channel.ChannelHandlerContext r4, java.lang.Throwable r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.ApplicationProtocolNegotiationHandler.logger
            java.lang.String r1 = "{} TLS handshake failed:"
            io.netty.channel.Channel r2 = r4.channel()
            r0.warn(r1, r2, r5)
            r4.close()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.ssl.SslHandshakeCompletionEvent
            if (r0 == 0) goto L64
            r0 = r4
            io.netty.handler.ssl.SslHandshakeCompletionEvent r0 = (io.netty.handler.ssl.SslHandshakeCompletionEvent) r0     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0.isSuccess()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L32
            io.netty.channel.ChannelPipeline r0 = r3.pipeline()     // Catch: java.lang.Throwable -> L28
            java.lang.Class<io.netty.handler.ssl.SslHandler> r1 = io.netty.handler.ssl.SslHandler.class
            io.netty.channel.ChannelHandler r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L28
            io.netty.handler.ssl.SslHandler r0 = (io.netty.handler.ssl.SslHandler) r0     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.applicationProtocol()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L22
            goto L24
        L22:
            java.lang.String r0 = r2.fallbackProtocol     // Catch: java.lang.Throwable -> L28
        L24:
            r2.configurePipeline(r3, r0)     // Catch: java.lang.Throwable -> L28
            goto L39
        L28:
            r0 = move-exception
            goto L47
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "cannot find a SslHandler in the pipeline (required for application-level protocol negotiation)"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28
            throw r0     // Catch: java.lang.Throwable -> L28
        L32:
            java.lang.Throwable r0 = r0.cause()     // Catch: java.lang.Throwable -> L28
            r2.handshakeFailure(r3, r0)     // Catch: java.lang.Throwable -> L28
        L39:
            io.netty.channel.ChannelPipeline r0 = r3.pipeline()
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r2)
            if (r1 == 0) goto L64
        L43:
            r0.remove(r2)
            goto L64
        L47:
            r2.exceptionCaught(r3, r0)     // Catch: java.lang.Throwable -> L55
            io.netty.channel.ChannelPipeline r0 = r3.pipeline()
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r2)
            if (r1 == 0) goto L64
            goto L43
        L55:
            r4 = move-exception
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            io.netty.channel.ChannelHandlerContext r0 = r3.context(r2)
            if (r0 == 0) goto L63
            r3.remove(r2)
        L63:
            throw r4
        L64:
            r3.fireUserEventTriggered(r4)
            return
    }
}

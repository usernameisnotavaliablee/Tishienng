package io.netty.handler.ssl.ocsp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class OcspClientHandler extends io.netty.channel.ChannelInboundHandlerAdapter {
    private final io.netty.handler.ssl.ReferenceCountedOpenSslEngine engine;

    protected OcspClientHandler(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "engine"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = (io.netty.handler.ssl.ReferenceCountedOpenSslEngine) r2
            r1.engine = r2
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.ssl.SslHandshakeCompletionEvent
            if (r0 == 0) goto L25
            io.netty.channel.ChannelPipeline r0 = r2.pipeline()
            r0.remove(r1)
            r0 = r3
            io.netty.handler.ssl.SslHandshakeCompletionEvent r0 = (io.netty.handler.ssl.SslHandshakeCompletionEvent) r0
            boolean r0 = r0.isSuccess()
            if (r0 == 0) goto L25
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r1.engine
            boolean r0 = r1.verify(r2, r0)
            if (r0 == 0) goto L1d
            goto L25
        L1d:
            javax.net.ssl.SSLHandshakeException r2 = new javax.net.ssl.SSLHandshakeException
            java.lang.String r3 = "Bad OCSP response"
            r2.<init>(r3)
            throw r2
        L25:
            r2.fireUserEventTriggered(r3)
            return
    }

    protected abstract boolean verify(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2) throws java.lang.Exception;
}

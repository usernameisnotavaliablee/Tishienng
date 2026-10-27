package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class DelegatingSslContext extends io.netty.handler.ssl.SslContext {
    private final io.netty.handler.ssl.SslContext ctx;

    protected DelegatingSslContext(io.netty.handler.ssl.SslContext r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "ctx"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.ssl.SslContext r2 = (io.netty.handler.ssl.SslContext) r2
            r1.ctx = r2
            return
    }

    @Override // io.netty.handler.ssl.SslContext
    public final io.netty.handler.ssl.ApplicationProtocolNegotiator applicationProtocolNegotiator() {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            io.netty.handler.ssl.ApplicationProtocolNegotiator r0 = r0.applicationProtocolNegotiator()
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final java.util.List<java.lang.String> cipherSuites() {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            java.util.List r0 = r0.cipherSuites()
            return r0
    }

    protected abstract void initEngine(javax.net.ssl.SSLEngine r1);

    protected void initHandler(io.netty.handler.ssl.SslHandler r1) {
            r0 = this;
            javax.net.ssl.SSLEngine r1 = r1.engine()
            r0.initEngine(r1)
            return
    }

    @Override // io.netty.handler.ssl.SslContext
    public final boolean isClient() {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            boolean r0 = r0.isClient()
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            javax.net.ssl.SSLEngine r2 = r0.newEngine(r2)
            r1.initEngine(r2)
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4) {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            javax.net.ssl.SSLEngine r2 = r0.newEngine(r2, r3, r4)
            r1.initEngine(r2)
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    protected final io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4, boolean r5) {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            io.netty.handler.ssl.SslHandler r2 = r0.newHandler(r2, r3, r4, r5)
            r1.initHandler(r2)
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r7, java.lang.String r8, int r9, boolean r10, java.util.concurrent.Executor r11) {
            r6 = this;
            io.netty.handler.ssl.SslContext r0 = r6.ctx
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            io.netty.handler.ssl.SslHandler r7 = r0.newHandler(r1, r2, r3, r4, r5)
            r6.initHandler(r7)
            return r7
    }

    @Override // io.netty.handler.ssl.SslContext
    protected final io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, boolean r3) {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            io.netty.handler.ssl.SslHandler r2 = r0.newHandler(r2, r3)
            r1.initHandler(r2)
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, boolean r3, java.util.concurrent.Executor r4) {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            io.netty.handler.ssl.SslHandler r2 = r0.newHandler(r2, r3, r4)
            r1.initHandler(r2)
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionCacheSize() {
            r2 = this;
            io.netty.handler.ssl.SslContext r0 = r2.ctx
            long r0 = r0.sessionCacheSize()
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLSessionContext sessionContext() {
            r1 = this;
            io.netty.handler.ssl.SslContext r0 = r1.ctx
            javax.net.ssl.SSLSessionContext r0 = r0.sessionContext()
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionTimeout() {
            r2 = this;
            io.netty.handler.ssl.SslContext r0 = r2.ctx
            long r0 = r0.sessionTimeout()
            return r0
    }
}

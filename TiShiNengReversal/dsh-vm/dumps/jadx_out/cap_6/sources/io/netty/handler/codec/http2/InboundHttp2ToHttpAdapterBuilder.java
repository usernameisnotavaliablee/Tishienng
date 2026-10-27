package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class InboundHttp2ToHttpAdapterBuilder extends io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder<io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter, io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder> {
    public InboundHttp2ToHttpAdapterBuilder(io.netty.handler.codec.http2.Http2Connection r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    public io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter build() {
            r1 = this;
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter r0 = super.build()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    protected io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter build(io.netty.handler.codec.http2.Http2Connection r2, int r3, boolean r4, boolean r5) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter r0 = new io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder maxContentLength(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder r1 = r0.maxContentLength2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    /* renamed from: maxContentLength, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder maxContentLength2(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder r1 = super.maxContentLength(r1)
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder r1 = (io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder propagateSettings(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder r1 = r0.propagateSettings2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    /* renamed from: propagateSettings, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder propagateSettings2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder r1 = super.propagateSettings(r1)
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder r1 = (io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder validateHttpHeaders(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder r1 = r0.validateHttpHeaders2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder
    /* renamed from: validateHttpHeaders, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder validateHttpHeaders2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder r1 = super.validateHttpHeaders(r1)
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder r1 = (io.netty.handler.codec.http2.InboundHttp2ToHttpAdapterBuilder) r1
            return r1
    }
}

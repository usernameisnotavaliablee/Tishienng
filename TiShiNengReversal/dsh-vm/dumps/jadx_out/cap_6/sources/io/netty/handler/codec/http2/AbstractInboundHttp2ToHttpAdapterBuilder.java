package io.netty.handler.codec.http2;

import io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder;
import io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractInboundHttp2ToHttpAdapterBuilder<T extends io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter, B extends io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder<T, B>> {
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private int maxContentLength;
    private boolean propagateSettings;
    private boolean validateHttpHeaders;

    protected AbstractInboundHttp2ToHttpAdapterBuilder(io.netty.handler.codec.http2.Http2Connection r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "connection"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2Connection r2 = (io.netty.handler.codec.http2.Http2Connection) r2
            r1.connection = r2
            return
    }

    protected T build() {
            r4 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r4.connection()     // Catch: java.lang.Throwable -> L1a
            int r1 = r4.maxContentLength()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r4.isValidateHttpHeaders()     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r4.isPropagateSettings()     // Catch: java.lang.Throwable -> L1a
            io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter r0 = r4.build(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L1a
            io.netty.handler.codec.http2.Http2Connection r1 = r4.connection
            r1.addListener(r0)
            return r0
        L1a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "failed to create a new InboundHttp2ToHttpAdapter"
            r1.<init>(r2, r0)
            throw r1
    }

    protected abstract T build(io.netty.handler.codec.http2.Http2Connection r1, int r2, boolean r3, boolean r4) throws java.lang.Exception;

    protected io.netty.handler.codec.http2.Http2Connection connection() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            return r0
    }

    protected boolean isPropagateSettings() {
            r1 = this;
            boolean r0 = r1.propagateSettings
            return r0
    }

    protected boolean isValidateHttpHeaders() {
            r1 = this;
            boolean r0 = r1.validateHttpHeaders
            return r0
    }

    protected int maxContentLength() {
            r1 = this;
            int r0 = r1.maxContentLength
            return r0
    }

    protected B maxContentLength(int r1) {
            r0 = this;
            r0.maxContentLength = r1
            io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder r1 = r0.self()
            return r1
    }

    protected B propagateSettings(boolean r1) {
            r0 = this;
            r0.propagateSettings = r1
            io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder r1 = r0.self()
            return r1
    }

    protected final B self() {
            r0 = this;
            return r0
    }

    protected B validateHttpHeaders(boolean r1) {
            r0 = this;
            r0.validateHttpHeaders = r1
            io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder r1 = r0.self()
            return r1
    }
}

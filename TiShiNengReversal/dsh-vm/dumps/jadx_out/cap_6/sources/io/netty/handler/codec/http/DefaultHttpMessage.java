package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class DefaultHttpMessage extends io.netty.handler.codec.http.DefaultHttpObject implements io.netty.handler.codec.http.HttpMessage {
    private static final int HASH_CODE_PRIME = 31;
    private final io.netty.handler.codec.http.HttpHeaders headers;
    private io.netty.handler.codec.http.HttpVersion version;

    protected DefaultHttpMessage(io.netty.handler.codec.http.HttpVersion r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    protected DefaultHttpMessage(io.netty.handler.codec.http.HttpVersion r2, io.netty.handler.codec.http.HttpHeaders r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "version"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http.HttpVersion r2 = (io.netty.handler.codec.http.HttpVersion) r2
            r1.version = r2
            java.lang.String r2 = "headers"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http.HttpHeaders r2 = (io.netty.handler.codec.http.HttpHeaders) r2
            r1.headers = r2
            return
    }

    protected DefaultHttpMessage(io.netty.handler.codec.http.HttpVersion r1, boolean r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L8
            io.netty.handler.codec.http.CombinedHttpHeaders r3 = new io.netty.handler.codec.http.CombinedHttpHeaders
            r3.<init>(r2)
            goto Ld
        L8:
            io.netty.handler.codec.http.DefaultHttpHeaders r3 = new io.netty.handler.codec.http.DefaultHttpHeaders
            r3.<init>(r2)
        Ld:
            r0.<init>(r1, r3)
            return
    }

    @Override // io.netty.handler.codec.http.DefaultHttpObject
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.DefaultHttpMessage
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            io.netty.handler.codec.http.DefaultHttpMessage r0 = (io.netty.handler.codec.http.DefaultHttpMessage) r0
            io.netty.handler.codec.http.HttpHeaders r2 = r4.headers()
            io.netty.handler.codec.http.HttpHeaders r3 = r0.headers()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2d
            io.netty.handler.codec.http.HttpVersion r2 = r4.protocolVersion()
            io.netty.handler.codec.http.HttpVersion r0 = r0.protocolVersion()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2d
            boolean r5 = super.equals(r5)
            if (r5 == 0) goto L2d
            r5 = 1
            return r5
        L2d:
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpMessage
    @java.lang.Deprecated
    public io.netty.handler.codec.http.HttpVersion getProtocolVersion() {
            r1 = this;
            io.netty.handler.codec.http.HttpVersion r0 = r1.protocolVersion()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpObject
    public int hashCode() {
            r3 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r3.headers
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            io.netty.handler.codec.http.HttpVersion r2 = r3.version
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = super.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpMessage
    public io.netty.handler.codec.http.HttpHeaders headers() {
            r1 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r1.headers
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpMessage
    public io.netty.handler.codec.http.HttpVersion protocolVersion() {
            r1 = this;
            io.netty.handler.codec.http.HttpVersion r0 = r1.version
            return r0
    }

    public io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.version = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "version"
            r2.<init>(r0)
            throw r2
    }
}

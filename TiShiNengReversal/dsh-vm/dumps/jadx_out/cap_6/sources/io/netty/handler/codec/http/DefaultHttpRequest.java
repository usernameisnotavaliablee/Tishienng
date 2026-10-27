package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttpRequest extends io.netty.handler.codec.http.DefaultHttpMessage implements io.netty.handler.codec.http.HttpRequest {
    private static final int HASH_CODE_PRIME = 31;
    private io.netty.handler.codec.http.HttpMethod method;
    private java.lang.String uri;

    public DefaultHttpRequest(io.netty.handler.codec.http.HttpVersion r2, io.netty.handler.codec.http.HttpMethod r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultHttpRequest(io.netty.handler.codec.http.HttpVersion r1, io.netty.handler.codec.http.HttpMethod r2, java.lang.String r3, io.netty.handler.codec.http.HttpHeaders r4) {
            r0 = this;
            r0.<init>(r1, r4)
            java.lang.String r1 = "method"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.handler.codec.http.HttpMethod r1 = (io.netty.handler.codec.http.HttpMethod) r1
            r0.method = r1
            java.lang.String r1 = "uri"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.uri = r1
            return
    }

    public DefaultHttpRequest(io.netty.handler.codec.http.HttpVersion r2, io.netty.handler.codec.http.HttpMethod r3, java.lang.String r4, boolean r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r5, r0)
            java.lang.String r2 = "method"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http.HttpMethod r2 = (io.netty.handler.codec.http.HttpMethod) r2
            r1.method = r2
            java.lang.String r2 = "uri"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.uri = r2
            return
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.DefaultHttpObject
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.DefaultHttpRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            io.netty.handler.codec.http.DefaultHttpRequest r0 = (io.netty.handler.codec.http.DefaultHttpRequest) r0
            io.netty.handler.codec.http.HttpMethod r2 = r4.method()
            io.netty.handler.codec.http.HttpMethod r3 = r0.method()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2d
            java.lang.String r2 = r4.uri()
            java.lang.String r0 = r0.uri()
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2d
            boolean r5 = super.equals(r5)
            if (r5 == 0) goto L2d
            r5 = 1
            return r5
        L2d:
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpRequest
    @java.lang.Deprecated
    public io.netty.handler.codec.http.HttpMethod getMethod() {
            r1 = this;
            io.netty.handler.codec.http.HttpMethod r0 = r1.method()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpRequest
    @java.lang.Deprecated
    public java.lang.String getUri() {
            r1 = this;
            java.lang.String r0 = r1.uri()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.DefaultHttpObject
    public int hashCode() {
            r3 = this;
            io.netty.handler.codec.http.HttpMethod r0 = r3.method
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r2 = r3.uri
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = super.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpRequest
    public io.netty.handler.codec.http.HttpMethod method() {
            r1 = this;
            io.netty.handler.codec.http.HttpMethod r0 = r1.method
            return r0
    }

    public io.netty.handler.codec.http.HttpRequest setMethod(io.netty.handler.codec.http.HttpMethod r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.method = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "method"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpRequest r1 = r0.setProtocolVersion(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    public io.netty.handler.codec.http.HttpRequest setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            super.setProtocolVersion(r1)
            return r0
    }

    public io.netty.handler.codec.http.HttpRequest setUri(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.uri = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "uri"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.HttpMessageUtil.appendRequest(r0, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpRequest
    public java.lang.String uri() {
            r1 = this;
            java.lang.String r0 = r1.uri
            return r0
    }
}

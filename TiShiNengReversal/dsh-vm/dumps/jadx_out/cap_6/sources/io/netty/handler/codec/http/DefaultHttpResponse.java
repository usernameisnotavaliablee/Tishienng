package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttpResponse extends io.netty.handler.codec.http.DefaultHttpMessage implements io.netty.handler.codec.http.HttpResponse {
    private io.netty.handler.codec.http.HttpResponseStatus status;

    public DefaultHttpResponse(io.netty.handler.codec.http.HttpVersion r3, io.netty.handler.codec.http.HttpResponseStatus r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public DefaultHttpResponse(io.netty.handler.codec.http.HttpVersion r1, io.netty.handler.codec.http.HttpResponseStatus r2, io.netty.handler.codec.http.HttpHeaders r3) {
            r0 = this;
            r0.<init>(r1, r3)
            java.lang.String r1 = "status"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.handler.codec.http.HttpResponseStatus r1 = (io.netty.handler.codec.http.HttpResponseStatus) r1
            r0.status = r1
            return
    }

    public DefaultHttpResponse(io.netty.handler.codec.http.HttpVersion r2, io.netty.handler.codec.http.HttpResponseStatus r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultHttpResponse(io.netty.handler.codec.http.HttpVersion r1, io.netty.handler.codec.http.HttpResponseStatus r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.lang.String r1 = "status"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.handler.codec.http.HttpResponseStatus r1 = (io.netty.handler.codec.http.HttpResponseStatus) r1
            r0.status = r1
            return
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.DefaultHttpObject
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.DefaultHttpResponse
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r4
            io.netty.handler.codec.http.DefaultHttpResponse r0 = (io.netty.handler.codec.http.DefaultHttpResponse) r0
            io.netty.handler.codec.http.HttpResponseStatus r2 = r3.status
            io.netty.handler.codec.http.HttpResponseStatus r0 = r0.status()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1d
            boolean r4 = super.equals(r4)
            if (r4 == 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpResponse
    @java.lang.Deprecated
    public io.netty.handler.codec.http.HttpResponseStatus getStatus() {
            r1 = this;
            io.netty.handler.codec.http.HttpResponseStatus r0 = r1.status()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.DefaultHttpObject
    public int hashCode() {
            r2 = this;
            io.netty.handler.codec.http.HttpResponseStatus r0 = r2.status
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = super.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpResponse r1 = r0.setProtocolVersion(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    public io.netty.handler.codec.http.HttpResponse setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            super.setProtocolVersion(r1)
            return r0
    }

    public io.netty.handler.codec.http.HttpResponse setStatus(io.netty.handler.codec.http.HttpResponseStatus r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.status = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "status"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http.HttpResponse
    public io.netty.handler.codec.http.HttpResponseStatus status() {
            r1 = this;
            io.netty.handler.codec.http.HttpResponseStatus r0 = r1.status
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.HttpMessageUtil.appendResponse(r0, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

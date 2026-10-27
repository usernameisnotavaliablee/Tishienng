package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultFullHttpResponse extends io.netty.handler.codec.http.DefaultHttpResponse implements io.netty.handler.codec.http.FullHttpResponse {
    private final io.netty.buffer.ByteBuf content;
    private int hash;
    private final io.netty.handler.codec.http.HttpHeaders trailingHeaders;

    public DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion r2, io.netty.handler.codec.http.HttpResponseStatus r3) {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion r2, io.netty.handler.codec.http.HttpResponseStatus r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion r1, io.netty.handler.codec.http.HttpResponseStatus r2, io.netty.buffer.ByteBuf r3, io.netty.handler.codec.http.HttpHeaders r4, io.netty.handler.codec.http.HttpHeaders r5) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            java.lang.String r1 = "content"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r0.content = r1
            java.lang.String r1 = "trailingHeaders"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r1)
            io.netty.handler.codec.http.HttpHeaders r1 = (io.netty.handler.codec.http.HttpHeaders) r1
            r0.trailingHeaders = r1
            return
    }

    public DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion r7, io.netty.handler.codec.http.HttpResponseStatus r8, io.netty.buffer.ByteBuf r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion r1, io.netty.handler.codec.http.HttpResponseStatus r2, io.netty.buffer.ByteBuf r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r4, r5)
            java.lang.String r1 = "content"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r0.content = r1
            if (r5 == 0) goto L15
            io.netty.handler.codec.http.CombinedHttpHeaders r1 = new io.netty.handler.codec.http.CombinedHttpHeaders
            r1.<init>(r4)
            goto L1a
        L15:
            io.netty.handler.codec.http.DefaultHttpHeaders r1 = new io.netty.handler.codec.http.DefaultHttpHeaders
            r1.<init>(r4)
        L1a:
            r0.trailingHeaders = r1
            return
    }

    public DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion r8, io.netty.handler.codec.http.HttpResponseStatus r9, boolean r10) {
            r7 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.buffer(r0)
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion r8, io.netty.handler.codec.http.HttpResponseStatus r9, boolean r10, boolean r11) {
            r7 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.buffer(r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage copy() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.FullHttpResponse copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent copy() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent copy() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage duplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.FullHttpResponse duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent duplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent duplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse, io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.DefaultHttpObject
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.DefaultFullHttpResponse
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http.DefaultFullHttpResponse r4 = (io.netty.handler.codec.http.DefaultFullHttpResponse) r4
            boolean r0 = super.equals(r4)
            if (r0 == 0) goto L2c
            io.netty.buffer.ByteBuf r0 = r3.content()
            io.netty.buffer.ByteBuf r2 = r4.content()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            io.netty.handler.codec.http.HttpHeaders r0 = r3.trailingHeaders()
            io.netty.handler.codec.http.HttpHeaders r4 = r4.trailingHeaders()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L2c
            r4 = 1
            return r4
        L2c:
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse, io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.DefaultHttpObject
    public int hashCode() {
            r3 = this;
            int r0 = r3.hash
            if (r0 != 0) goto L30
            io.netty.buffer.ByteBuf r0 = r3.content()
            int r0 = r0.refCnt()
            r1 = 31
            if (r0 == 0) goto L1a
            io.netty.buffer.ByteBuf r0 = r3.content()     // Catch: io.netty.util.IllegalReferenceCountException -> L1a
            int r0 = r0.hashCode()     // Catch: io.netty.util.IllegalReferenceCountException -> L1a
            int r0 = r0 + r1
            goto L1c
        L1a:
            r0 = 31
        L1c:
            int r0 = r0 * 31
            io.netty.handler.codec.http.HttpHeaders r2 = r3.trailingHeaders()
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = super.hashCode()
            int r0 = r0 + r1
            r3.hash = r0
        L30:
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.FullHttpResponse replace(io.netty.buffer.ByteBuf r7) {
            r6 = this;
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = r6.protocolVersion()
            io.netty.handler.codec.http.HttpResponseStatus r2 = r6.status()
            io.netty.handler.codec.http.HttpHeaders r3 = r6.headers()
            io.netty.handler.codec.http.HttpHeaders r4 = r3.copy()
            io.netty.handler.codec.http.HttpHeaders r3 = r6.trailingHeaders()
            io.netty.handler.codec.http.HttpHeaders r5 = r3.copy()
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            io.netty.handler.codec.DecoderResult r7 = r6.decoderResult()
            r0.setDecoderResult(r7)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.FullHttpResponse mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain()
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.FullHttpResponse mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.FullHttpResponse retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse, io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    public io.netty.handler.codec.http.FullHttpResponse setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            super.setProtocolVersion(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse, io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.setProtocolVersion(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse, io.netty.handler.codec.http.DefaultHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpResponse setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.setProtocolVersion(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse, io.netty.handler.codec.http.HttpResponse, io.netty.handler.codec.http.FullHttpResponse
    public io.netty.handler.codec.http.FullHttpResponse setStatus(io.netty.handler.codec.http.HttpResponseStatus r1) {
            r0 = this;
            super.setStatus(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse, io.netty.handler.codec.http.HttpResponse, io.netty.handler.codec.http.FullHttpResponse
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpResponse setStatus(io.netty.handler.codec.http.HttpResponseStatus r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.setStatus(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpResponse
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.HttpMessageUtil.appendFullResponse(r0, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.FullHttpResponse mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.codec.http.FullHttpResponse, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.FullHttpResponse mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent
    public io.netty.handler.codec.http.HttpHeaders trailingHeaders() {
            r1 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r1.trailingHeaders
            return r0
    }
}

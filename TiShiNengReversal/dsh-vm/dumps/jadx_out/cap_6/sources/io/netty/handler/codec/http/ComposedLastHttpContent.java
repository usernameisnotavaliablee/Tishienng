package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ComposedLastHttpContent implements io.netty.handler.codec.http.LastHttpContent {
    private io.netty.handler.codec.DecoderResult result;
    private final io.netty.handler.codec.http.HttpHeaders trailingHeaders;

    ComposedLastHttpContent(io.netty.handler.codec.http.HttpHeaders r1) {
            r0 = this;
            r0.<init>()
            r0.trailingHeaders = r1
            return
    }

    ComposedLastHttpContent(io.netty.handler.codec.http.HttpHeaders r1, io.netty.handler.codec.DecoderResult r2) {
            r0 = this;
            r0.<init>(r1)
            r0.result = r2
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent copy() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent copy() {
            r3 = this;
            io.netty.handler.codec.http.DefaultLastHttpContent r0 = new io.netty.handler.codec.http.DefaultLastHttpContent
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r0.<init>(r1)
            io.netty.handler.codec.http.HttpHeaders r1 = r0.trailingHeaders()
            io.netty.handler.codec.http.HttpHeaders r2 = r3.trailingHeaders()
            r1.set(r2)
            return r0
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public io.netty.handler.codec.DecoderResult decoderResult() {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = r1.result
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent duplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent duplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpObject
    public io.netty.handler.codec.DecoderResult getDecoderResult() {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = r1.decoderResult()
            return r0
    }

    public int refCnt() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean release() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean release(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent replace(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.http.DefaultLastHttpContent r0 = new io.netty.handler.codec.http.DefaultLastHttpContent
            r0.<init>(r3)
            io.netty.handler.codec.http.HttpHeaders r3 = r0.trailingHeaders()
            io.netty.handler.codec.http.HttpHeaders r1 = r2.trailingHeaders()
            r3.setAll(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.LastHttpContent mo39retain() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.LastHttpContent mo40retain(int r1) {
            r0 = this;
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public void setDecoderResult(io.netty.handler.codec.DecoderResult r1) {
            r0 = this;
            r0.result = r1
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.LastHttpContent mo41touch() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.LastHttpContent mo42touch(java.lang.Object r1) {
            r0 = this;
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent
    public io.netty.handler.codec.http.HttpHeaders trailingHeaders() {
            r1 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r1.trailingHeaders
            return r0
    }
}

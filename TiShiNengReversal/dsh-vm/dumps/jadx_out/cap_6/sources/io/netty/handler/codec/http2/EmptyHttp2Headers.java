package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EmptyHttp2Headers extends io.netty.handler.codec.EmptyHeaders<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.http2.Http2Headers> implements io.netty.handler.codec.http2.Http2Headers {
    public static final io.netty.handler.codec.http2.EmptyHttp2Headers INSTANCE = null;

    static {
            io.netty.handler.codec.http2.EmptyHttp2Headers r0 = new io.netty.handler.codec.http2.EmptyHttp2Headers
            r0.<init>()
            io.netty.handler.codec.http2.EmptyHttp2Headers.INSTANCE = r0
            return
    }

    private EmptyHttp2Headers() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.EmptyHttp2Headers authority(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers authority(java.lang.CharSequence r1) {
            r0 = this;
            io.netty.handler.codec.http2.EmptyHttp2Headers r1 = r0.authority(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence authority() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.AUTHORITY
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.Object r0 = r1.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.EmptyHttp2Headers method(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers method(java.lang.CharSequence r1) {
            r0 = this;
            io.netty.handler.codec.http2.EmptyHttp2Headers r1 = r0.method(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence method() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.METHOD
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.Object r0 = r1.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.EmptyHttp2Headers path(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers path(java.lang.CharSequence r1) {
            r0 = this;
            io.netty.handler.codec.http2.EmptyHttp2Headers r1 = r0.path(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence path() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PATH
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.Object r0 = r1.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.EmptyHttp2Headers scheme(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers scheme(java.lang.CharSequence r1) {
            r0 = this;
            io.netty.handler.codec.http2.EmptyHttp2Headers r1 = r0.scheme(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence scheme() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.SCHEME
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.Object r0 = r1.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.EmptyHttp2Headers status(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers status(java.lang.CharSequence r1) {
            r0 = this;
            io.netty.handler.codec.http2.EmptyHttp2Headers r1 = r0.status(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence status() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.STATUS
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.Object r0 = r1.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public /* bridge */ /* synthetic */ java.util.Iterator valueIterator(java.lang.CharSequence r1) {
            r0 = this;
            java.util.Iterator r1 = super.valueIterator(r1)
            return r1
    }
}

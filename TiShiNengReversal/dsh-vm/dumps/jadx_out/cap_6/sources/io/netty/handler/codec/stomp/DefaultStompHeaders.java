package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultStompHeaders extends io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.stomp.StompHeaders> implements io.netty.handler.codec.stomp.StompHeaders {
    public DefaultStompHeaders() {
            r2 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            io.netty.handler.codec.CharSequenceValueConverter r1 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            r2.<init>(r0, r1)
            return
    }

    /* renamed from: contains, reason: avoid collision after fix types in other method */
    public boolean contains2(java.lang.CharSequence r2, java.lang.CharSequence r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.contains(r2, r3, r0)
            return r2
    }

    @Override // io.netty.handler.codec.stomp.StompHeaders
    public boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L5
            io.netty.util.HashingStrategy r3 = io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER
            goto L7
        L5:
            io.netty.util.HashingStrategy r3 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
        L7:
            boolean r1 = r0.contains(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.DefaultHeaders
    public /* bridge */ /* synthetic */ io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.stomp.StompHeaders> copy() {
            r1 = this;
            io.netty.handler.codec.stomp.DefaultStompHeaders r0 = r1.copy2()
            return r0
    }

    @Override // io.netty.handler.codec.DefaultHeaders
    /* renamed from: copy, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.stomp.StompHeaders> copy2() {
            r1 = this;
            io.netty.handler.codec.stomp.DefaultStompHeaders r0 = new io.netty.handler.codec.stomp.DefaultStompHeaders
            r0.<init>()
            r0.addImpl(r1)
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompHeaders
    public java.util.List<java.lang.String> getAllAsString(java.lang.CharSequence r1) {
            r0 = this;
            java.util.List r1 = io.netty.handler.codec.HeadersUtils.getAllAsString(r0, r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompHeaders
    public java.lang.String getAsString(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = io.netty.handler.codec.HeadersUtils.getAsString(r0, r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompHeaders
    public java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iteratorAsString() {
            r1 = this;
            java.util.Iterator r0 = io.netty.handler.codec.HeadersUtils.iteratorAsString(r1)
            return r0
    }
}

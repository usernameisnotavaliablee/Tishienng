package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2Headers extends io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.http2.Http2Headers> implements io.netty.handler.codec.http2.Http2Headers {
    static final io.netty.handler.codec.DefaultHeaders.NameValidator<java.lang.CharSequence> HTTP2_NAME_VALIDATOR = null;
    private static final io.netty.util.ByteProcessor HTTP2_NAME_VALIDATOR_PROCESSOR = null;
    private io.netty.handler.codec.DefaultHeaders.HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> firstNonPseudo;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Http2HeaderEntry extends io.netty.handler.codec.DefaultHeaders.HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> {
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Headers this$0;

        protected Http2HeaderEntry(io.netty.handler.codec.http2.DefaultHttp2Headers r1, int r2, java.lang.CharSequence r3, java.lang.CharSequence r4, io.netty.handler.codec.DefaultHeaders.HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                r0.value = r4
                r0.next = r5
                boolean r2 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.hasPseudoHeaderFormat(r3)
                if (r2 == 0) goto L20
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r2 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$100(r1)
                r0.after = r2
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r1 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$100(r1)
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r1 = r1.before()
                r0.before = r1
                goto L3d
            L20:
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r2 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$200(r1)
                r0.after = r2
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r2 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$300(r1)
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r2 = r2.before()
                r0.before = r2
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r2 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$100(r1)
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r3 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$400(r1)
                if (r2 != r3) goto L3d
                io.netty.handler.codec.http2.DefaultHttp2Headers.access$102(r1, r0)
            L3d:
                r0.pointNeighborsToThis()
                return
        }

        @Override // io.netty.handler.codec.DefaultHeaders.HeaderEntry
        protected void remove() {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2Headers r0 = r2.this$0
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r0 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$100(r0)
                if (r2 != r0) goto L15
                io.netty.handler.codec.http2.DefaultHttp2Headers r0 = r2.this$0
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r1 = io.netty.handler.codec.http2.DefaultHttp2Headers.access$100(r0)
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r1 = r1.after()
                io.netty.handler.codec.http2.DefaultHttp2Headers.access$102(r0, r1)
            L15:
                super.remove()
                return
        }
    }

    static {
            io.netty.handler.codec.http2.DefaultHttp2Headers$1 r0 = new io.netty.handler.codec.http2.DefaultHttp2Headers$1
            r0.<init>()
            io.netty.handler.codec.http2.DefaultHttp2Headers.HTTP2_NAME_VALIDATOR_PROCESSOR = r0
            io.netty.handler.codec.http2.DefaultHttp2Headers$2 r0 = new io.netty.handler.codec.http2.DefaultHttp2Headers$2
            r0.<init>()
            io.netty.handler.codec.http2.DefaultHttp2Headers.HTTP2_NAME_VALIDATOR = r0
            return
    }

    public DefaultHttp2Headers() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public DefaultHttp2Headers(boolean r3) {
            r2 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            io.netty.handler.codec.CharSequenceValueConverter r1 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            if (r3 == 0) goto L9
            io.netty.handler.codec.DefaultHeaders$NameValidator<java.lang.CharSequence> r3 = io.netty.handler.codec.http2.DefaultHttp2Headers.HTTP2_NAME_VALIDATOR
            goto Lb
        L9:
            io.netty.handler.codec.DefaultHeaders$NameValidator r3 = io.netty.handler.codec.DefaultHeaders.NameValidator.NOT_NULL
        Lb:
            r2.<init>(r0, r1, r3)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r3 = r2.head
            r2.firstNonPseudo = r3
            return
    }

    public DefaultHttp2Headers(boolean r3, int r4) {
            r2 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            io.netty.handler.codec.CharSequenceValueConverter r1 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            if (r3 == 0) goto L9
            io.netty.handler.codec.DefaultHeaders$NameValidator<java.lang.CharSequence> r3 = io.netty.handler.codec.http2.DefaultHttp2Headers.HTTP2_NAME_VALIDATOR
            goto Lb
        L9:
            io.netty.handler.codec.DefaultHeaders$NameValidator r3 = io.netty.handler.codec.DefaultHeaders.NameValidator.NOT_NULL
        Lb:
            r2.<init>(r0, r1, r3, r4)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r3 = r2.head
            r2.firstNonPseudo = r3
            return
    }

    static /* synthetic */ io.netty.util.ByteProcessor access$000() {
            io.netty.util.ByteProcessor r0 = io.netty.handler.codec.http2.DefaultHttp2Headers.HTTP2_NAME_VALIDATOR_PROCESSOR
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry access$100(io.netty.handler.codec.http2.DefaultHttp2Headers r0) {
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> r0 = r0.firstNonPseudo
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry access$102(io.netty.handler.codec.http2.DefaultHttp2Headers r0, io.netty.handler.codec.DefaultHeaders.HeaderEntry r1) {
            r0.firstNonPseudo = r1
            return r1
    }

    static /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry access$200(io.netty.handler.codec.http2.DefaultHttp2Headers r0) {
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.head
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry access$300(io.netty.handler.codec.http2.DefaultHttp2Headers r0) {
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.head
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry access$400(io.netty.handler.codec.http2.DefaultHttp2Headers r0) {
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.head
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers authority(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.AUTHORITY
            io.netty.util.AsciiString r0 = r0.value()
            r1.set(r0, r2)
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

    @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers clear() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers r0 = r1.clear2()
            return r0
    }

    @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
    /* renamed from: clear, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers clear2() {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.head
            r1.firstNonPseudo = r0
            io.netty.handler.codec.Headers r0 = super.clear()
            io.netty.handler.codec.http2.Http2Headers r0 = (io.netty.handler.codec.http2.Http2Headers) r0
            return r0
    }

    /* renamed from: contains, reason: avoid collision after fix types in other method */
    public boolean contains2(java.lang.CharSequence r2, java.lang.CharSequence r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.contains(r2, r3, r0)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
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
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http2.Http2Headers
            if (r0 == 0) goto L10
            io.netty.handler.codec.http2.Http2Headers r2 = (io.netty.handler.codec.http2.Http2Headers) r2
            io.netty.util.HashingStrategy r0 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            boolean r2 = r1.equals(r2, r0)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.DefaultHeaders
    public int hashCode() {
            r1 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            int r0 = r1.hashCode(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers method(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.METHOD
            io.netty.util.AsciiString r0 = r0.value()
            r1.set(r0, r2)
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

    /* renamed from: newHeaderEntry, reason: avoid collision after fix types in other method */
    protected final io.netty.handler.codec.DefaultHeaders.HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> newHeaderEntry2(int r7, java.lang.CharSequence r8, java.lang.CharSequence r9, io.netty.handler.codec.DefaultHeaders.HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> r10) {
            r6 = this;
            io.netty.handler.codec.http2.DefaultHttp2Headers$Http2HeaderEntry r0 = new io.netty.handler.codec.http2.DefaultHttp2Headers$Http2HeaderEntry
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // io.netty.handler.codec.DefaultHeaders
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> newHeaderEntry(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3, io.netty.handler.codec.DefaultHeaders.HeaderEntry<java.lang.CharSequence, java.lang.CharSequence> r4) {
            r0 = this;
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            io.netty.handler.codec.DefaultHeaders$HeaderEntry r1 = r0.newHeaderEntry2(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers path(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PATH
            io.netty.util.AsciiString r0 = r0.value()
            r1.set(r0, r2)
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
    public io.netty.handler.codec.http2.Http2Headers scheme(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.SCHEME
            io.netty.util.AsciiString r0 = r0.value()
            r1.set(r0, r2)
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
    public io.netty.handler.codec.http2.Http2Headers status(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.STATUS
            io.netty.util.AsciiString r0 = r0.value()
            r1.set(r0, r2)
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

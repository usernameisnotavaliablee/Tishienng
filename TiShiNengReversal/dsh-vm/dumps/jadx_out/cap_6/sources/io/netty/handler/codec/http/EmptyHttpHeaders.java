package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class EmptyHttpHeaders extends io.netty.handler.codec.http.HttpHeaders {
    static final java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> EMPTY_CHARS_ITERATOR = null;
    public static final io.netty.handler.codec.http.EmptyHttpHeaders INSTANCE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    private static final class InstanceInitializer {

        @java.lang.Deprecated
        private static final io.netty.handler.codec.http.EmptyHttpHeaders EMPTY_HEADERS = null;

        static {
                io.netty.handler.codec.http.EmptyHttpHeaders r0 = new io.netty.handler.codec.http.EmptyHttpHeaders
                r0.<init>()
                io.netty.handler.codec.http.EmptyHttpHeaders.InstanceInitializer.EMPTY_HEADERS = r0
                return
        }

        private InstanceInitializer() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ io.netty.handler.codec.http.EmptyHttpHeaders access$000() {
                io.netty.handler.codec.http.EmptyHttpHeaders r0 = io.netty.handler.codec.http.EmptyHttpHeaders.InstanceInitializer.EMPTY_HEADERS
                return r0
        }
    }

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Iterator r0 = r0.iterator()
            io.netty.handler.codec.http.EmptyHttpHeaders.EMPTY_CHARS_ITERATOR = r0
            io.netty.handler.codec.http.EmptyHttpHeaders r0 = instance()
            io.netty.handler.codec.http.EmptyHttpHeaders.INSTANCE = r0
            return
    }

    protected EmptyHttpHeaders() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    static io.netty.handler.codec.http.EmptyHttpHeaders instance() {
            io.netty.handler.codec.http.EmptyHttpHeaders r0 = io.netty.handler.codec.http.EmptyHttpHeaders.InstanceInitializer.access$000()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.String r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders addInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders addShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "read only"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean contains(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> entries() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.String get(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.List<java.lang.String> getAll(java.lang.String r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public int getInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Integer getInt(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Short getShort(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public short getShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public long getTimeMillis(java.lang.CharSequence r1, long r2) {
            r0 = this;
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Long getTimeMillis(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iterator() {
            r1 = this;
            java.util.List r0 = r1.entries()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> iteratorCharSequence() {
            r1 = this;
            java.util.Iterator<java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence>> r0 = io.netty.handler.codec.http.EmptyHttpHeaders.EMPTY_CHARS_ITERATOR
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Set<java.lang.String> names() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders remove(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.String r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders setInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders setShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public int size() {
            r1 = this;
            r0 = 0
            return r0
    }
}

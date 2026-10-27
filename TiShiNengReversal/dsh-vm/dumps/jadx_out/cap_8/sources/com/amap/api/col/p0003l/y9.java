package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class y9 {
    private static final java.lang.ThreadLocal<java.nio.charset.CharsetDecoder> a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal<java.nio.charset.Charset> f4273b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.nio.CharBuffer> f4274c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends java.lang.ThreadLocal<java.nio.charset.CharsetDecoder> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static java.nio.charset.CharsetDecoder a() {
                java.lang.String r0 = "UTF-8"
                java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
                java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ java.nio.charset.CharsetDecoder initialValue() {
                r1 = this;
                java.nio.charset.CharsetDecoder r0 = a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends java.lang.ThreadLocal<java.nio.charset.Charset> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        private static java.nio.charset.Charset a() {
                java.lang.String r0 = "UTF-8"
                java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ java.nio.charset.Charset initialValue() {
                r1 = this;
                java.nio.charset.Charset r0 = a()
                return r0
        }
    }

    static {
            com.amap.api.col.3l.y9$a r0 = new com.amap.api.col.3l.y9$a
            r0.<init>()
            com.amap.api.col.p0003l.y9.a = r0
            com.amap.api.col.3l.y9$b r0 = new com.amap.api.col.3l.y9$b
            r0.<init>()
            com.amap.api.col.p0003l.y9.f4273b = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.amap.api.col.p0003l.y9.f4274c = r0
            return
    }

    public y9() {
            r1 = this;
            r1.<init>()
            return
    }
}

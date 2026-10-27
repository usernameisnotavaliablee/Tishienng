package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class y1 extends com.amap.api.col.p0003l.y3<java.lang.String, com.amap.api.col.3l.y1.a> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public byte[] a;

        /* renamed from: b, reason: collision with root package name */
        public int f4258b;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f4258b = r0
                return
        }
    }

    public y1(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "/map/styles"
            r0.u = r1
            return
    }

    private static com.amap.api.col.3l.y1.a o(byte[] r1) throws com.amap.api.col.p0003l.fc {
            com.amap.api.col.3l.y1$a r0 = new com.amap.api.col.3l.y1$a
            r0.<init>()
            r0.a = r1
            return r0
    }

    public final void b(java.lang.String r1) {
            r0 = this;
            r0.u = r1
            return
    }

    @Override // com.amap.api.col.p0003l.y3
    protected final /* bridge */ /* synthetic */ com.amap.api.col.3l.y1.a g(java.lang.String r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getIPV6URL() {
            r1 = this;
            java.lang.String r0 = r1.getURL()
            java.lang.String r0 = com.amap.api.col.p0003l.b3.y(r0)
            return r0
    }

    @Override // com.amap.api.col.p0003l.g2, com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 16
            r0.<init>(r1)
            android.content.Context r1 = r4.t
            java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            java.lang.String r1 = "output"
            java.lang.String r2 = "bin"
            r0.put(r1, r2)
            java.lang.String r1 = com.amap.api.col.p0003l.h4.a()
            android.content.Context r2 = r4.t
            java.lang.String r3 = com.amap.api.col.p0003l.q4.r(r0)
            java.lang.String r2 = com.amap.api.col.p0003l.h4.c(r2, r1, r3)
            java.lang.String r3 = "ts"
            r0.put(r3, r1)
            java.lang.String r1 = "scode"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r1 = this;
            java.lang.String r0 = r1.u
            return r0
    }

    @Override // com.amap.api.col.p0003l.y3
    protected final /* synthetic */ com.amap.api.col.3l.y1.a h(byte[] r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            com.amap.api.col.3l.y1$a r1 = o(r1)
            return r1
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final boolean isSupportIPV6() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.amap.api.col.p0003l.y3
    protected final java.lang.String l() {
            r1 = this;
            r0 = 0
            return r0
    }
}

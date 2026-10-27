package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w1 extends com.amap.api.col.p0003l.y3<java.lang.String, com.amap.api.col.3l.w1.a> {
    private boolean A;
    private java.lang.String B;
    private java.lang.String w;
    private java.lang.String x;
    private java.lang.String y;
    private final java.lang.String z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public byte[] a;

        /* renamed from: b, reason: collision with root package name */
        public int f4081b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f4082c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4083d;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f4081b = r0
                r0 = 0
                r1.f4082c = r0
                r0 = 0
                r1.f4083d = r0
                return
        }
    }

    public w1(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "1.0"
            r0.x = r1
            java.lang.String r1 = "0"
            r0.y = r1
            java.lang.String r1 = "lastModified"
            r0.z = r1
            r1 = 0
            r0.A = r1
            r1 = 0
            r0.B = r1
            java.lang.String r1 = "/map/styles"
            r0.u = r1
            r1 = 1
            r0.v = r1
            return
    }

    public w1(android.content.Context r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "1.0"
            r0.x = r1
            java.lang.String r1 = "0"
            r0.y = r1
            java.lang.String r1 = "lastModified"
            r0.z = r1
            r1 = 0
            r0.B = r1
            r0.A = r3
            if (r3 == 0) goto L1e
            java.lang.String r1 = "/sdk/map/styles"
            r0.u = r1
            r1 = 0
            r0.isPostFlag = r1
            goto L22
        L1e:
            java.lang.String r1 = "/map/styles"
            r0.u = r1
        L22:
            r1 = 1
            r0.v = r1
            return
    }

    private com.amap.api.col.3l.w1.a o(com.amap.api.col.p0003l.a7 r5) throws com.amap.api.col.p0003l.fc {
            r4 = this;
            if (r5 == 0) goto L37
            byte[] r0 = r5.a
            com.amap.api.col.3l.w1$a r0 = r4.p(r0)
            byte[] r1 = r0.a
            r2 = 0
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.f4083d = r1
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r5.f2960b
            if (r1 == 0) goto L36
            java.lang.String r3 = "lastModified"
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L36
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r5.f2960b
            java.lang.Object r5 = r5.get(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L36
            int r1 = r5.size()
            if (r1 <= 0) goto L36
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            r0.f4082c = r5
        L36:
            return r0
        L37:
            r5 = 0
            return r5
    }

    private com.amap.api.col.3l.w1.a p(byte[] r5) throws com.amap.api.col.p0003l.fc {
            r4 = this;
            com.amap.api.col.3l.w1$a r0 = new com.amap.api.col.3l.w1$a
            r0.<init>()
            r0.a = r5
            boolean r1 = r4.A
            if (r1 == 0) goto L33
            if (r5 == 0) goto L33
            int r1 = r5.length
            r2 = 0
            if (r1 != 0) goto L14
            r0.a = r2
            return r0
        L14:
            int r1 = r5.length
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 > r3) goto L33
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = "utf-8"
            r1.<init>(r5, r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r5 = "errcode"
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Exception -> L2b
            if (r5 == 0) goto L33
            r0.a = r2     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            r5 = move-exception
            java.lang.String r1 = "CustomStyleRequest"
            java.lang.String r2 = "loadData"
            com.amap.api.col.p0003l.w5.p(r5, r1, r2)
        L33:
            return r0
    }

    public final void b(java.lang.String r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public final void c(java.lang.String r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public final void d(java.lang.String r1) {
            r0 = this;
            r0.y = r1
            return
    }

    @Override // com.amap.api.col.p0003l.y3
    protected final /* synthetic */ com.amap.api.col.3l.w1.a f(com.amap.api.col.p0003l.a7 r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            com.amap.api.col.3l.w1$a r1 = r0.o(r1)
            return r1
    }

    @Override // com.amap.api.col.p0003l.y3
    protected final /* bridge */ /* synthetic */ com.amap.api.col.3l.w1.a g(java.lang.String r1) throws com.amap.api.col.p0003l.fc {
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
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 16
            r0.<init>(r1)
            android.content.Context r1 = r4.t
            java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            boolean r1 = r4.A
            if (r1 != 0) goto L1e
            java.lang.String r1 = "output"
            java.lang.String r2 = "bin"
            r0.put(r1, r2)
            goto L25
        L1e:
            java.lang.String r1 = "sdkType"
            java.lang.String r2 = r4.B
            r0.put(r1, r2)
        L25:
            java.lang.String r1 = "styleid"
            java.lang.String r2 = r4.w
            r0.put(r1, r2)
            java.lang.String r1 = "protocol"
            java.lang.String r2 = r4.x
            r0.put(r1, r2)
            java.lang.String r1 = "ispublic"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "lastModified"
            java.lang.String r2 = r4.y
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

    @Override // com.amap.api.col.p0003l.y3, com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r5 = this;
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.e()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = 16
            r1.<init>(r2)
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = com.amap.api.col.p0003l.ha.f3470c
            r1.put(r2, r3)
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r3 = "gzip"
            r1.put(r2, r3)
            java.util.Locale r2 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "3dmap"
            r4 = 1
            r3[r4] = r0
            java.lang.String r0 = "platform=Android&sdkversion=%s&product=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            java.lang.String r2 = "platinfo"
            r1.put(r2, r0)
            android.content.Context r0 = r5.t
            java.lang.String r0 = com.amap.api.col.p0003l.h4.b(r0)
            java.lang.String r2 = "x-INFO"
            r1.put(r2, r0)
            android.content.Context r0 = r5.t
            java.lang.String r0 = com.amap.api.col.p0003l.f4.j(r0)
            java.lang.String r2 = "key"
            r1.put(r2, r0)
            java.lang.String r0 = "logversion"
            java.lang.String r2 = "2.1"
            r1.put(r0, r2)
            return r1
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "http://restsdk.amap.com/v4"
            r0.<init>(r1)
            java.lang.String r1 = r2.u
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.p0003l.y3
    protected final /* synthetic */ com.amap.api.col.3l.w1.a h(byte[] r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            com.amap.api.col.3l.w1$a r1 = r0.p(r1)
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

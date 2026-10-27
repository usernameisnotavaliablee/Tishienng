package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class da extends com.amap.api.col.p0003l.y3<java.lang.String, com.amap.api.col.3l.da.a> {
    private boolean w;
    private int[] x;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f3157b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f3158c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3159d;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.a = r0
                r0 = 0
                r1.f3159d = r0
                return
        }
    }

    public da(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            int[] r1 = new int[r1]
            r1 = {x0018: FILL_ARRAY_DATA , data: [10000, 0, 10018, 10019, 10020, 10021, 10022, 10023} // fill-array
            r0.x = r1
            java.lang.String r1 = "/feedback"
            r0.u = r1
            r1 = 0
            r0.isPostFlag = r1
            r1 = 1
            r0.w = r1
            return
    }

    private com.amap.api.col.3l.da.a o(java.lang.String r6) throws com.amap.api.col.p0003l.fc {
            r5 = this;
            java.lang.String r0 = "errcode"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L41
            boolean r6 = r1.has(r0)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L1e
            int r6 = r1.optInt(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "errmsg"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "errdetail"
            java.lang.String r1 = r1.optString(r2)     // Catch: java.lang.Throwable -> L41
            goto L22
        L1e:
            java.lang.String r0 = ""
            r6 = -1
            r1 = r0
        L22:
            com.amap.api.col.3l.da$a r2 = new com.amap.api.col.3l.da$a     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            r2.a = r6     // Catch: java.lang.Throwable -> L41
            r2.f3157b = r0     // Catch: java.lang.Throwable -> L41
            r2.f3158c = r1     // Catch: java.lang.Throwable -> L41
            r0 = 0
            r2.f3159d = r0     // Catch: java.lang.Throwable -> L41
            int[] r1 = r5.x     // Catch: java.lang.Throwable -> L41
            int r3 = r1.length     // Catch: java.lang.Throwable -> L41
        L33:
            if (r0 >= r3) goto L40
            r4 = r1[r0]     // Catch: java.lang.Throwable -> L41
            if (r4 != r6) goto L3d
            r6 = 1
            r2.f3159d = r6     // Catch: java.lang.Throwable -> L41
            return r2
        L3d:
            int r0 = r0 + 1
            goto L33
        L40:
            return r2
        L41:
            r6 = 0
            return r6
    }

    @Override // com.amap.api.col.p0003l.y3
    protected final /* synthetic */ com.amap.api.col.3l.da.a g(java.lang.String r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            com.amap.api.col.3l.da$a r1 = r0.o(r1)
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
            boolean r1 = r4.w
            if (r1 == 0) goto L1d
            java.lang.String r1 = "pname"
            java.lang.String r2 = "3dmap"
            r0.put(r1, r2)
        L1d:
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "http://restsdk.amap.com/v4"
            r0.<init>(r1)
            java.lang.String r1 = r2.u
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
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

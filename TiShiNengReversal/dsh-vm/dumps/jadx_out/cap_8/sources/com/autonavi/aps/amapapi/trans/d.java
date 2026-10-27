package com.autonavi.aps.amapapi.trans;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d extends com.amap.api.col.p0003l.t6 {

    /* renamed from: d, reason: collision with root package name */
    java.util.Map<java.lang.String, java.lang.String> f5818d;

    /* renamed from: e, reason: collision with root package name */
    java.lang.String f5819e;

    /* renamed from: f, reason: collision with root package name */
    java.lang.String f5820f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f5821g;

    /* renamed from: h, reason: collision with root package name */
    byte[] f5822h;

    /* renamed from: i, reason: collision with root package name */
    boolean f5823i;

    /* renamed from: j, reason: collision with root package name */
    java.lang.String f5824j;

    /* renamed from: k, reason: collision with root package name */
    java.util.Map<java.lang.String, java.lang.String> f5825k;
    boolean p;
    private java.lang.String q;

    public d(android.content.Context r1, com.amap.api.col.p0003l.p4 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f5818d = r1
            java.lang.String r2 = ""
            r0.q = r2
            r0.f5819e = r2
            r0.f5820f = r2
            r0.f5821g = r1
            r0.f5822h = r1
            r2 = 0
            r0.f5823i = r2
            r0.f5824j = r1
            r0.f5825k = r1
            r0.p = r2
            return
    }

    public final void a(java.lang.String r1) {
            r0 = this;
            r0.f5824j = r1
            return
    }

    public final void a(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.f5825k = r1
            return
    }

    public final void a(boolean r1) {
            r0 = this;
            r0.f5823i = r1
            return
    }

    public final void b(java.lang.String r1) {
            r0 = this;
            r0.f5819e = r1
            return
    }

    public final void b(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.f5818d = r1
            return
    }

    public final void b(boolean r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public final void b(byte[] r3) {
            r2 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L16
            byte[] r0 = com.amap.api.col.p0003l.t6.a(r3)     // Catch: java.lang.Throwable -> L13
            r1.write(r0)     // Catch: java.lang.Throwable -> L13
            r1.write(r3)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = r1
            goto L21
        L16:
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L13
            r2.f5822h = r3     // Catch: java.lang.Throwable -> L13
            r1.close()     // Catch: java.io.IOException -> L1f
        L1f:
            return
        L20:
        L21:
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.io.IOException -> L27
        L27:
            return
    }

    public final void c(java.lang.String r1) {
            r0 = this;
            r0.f5820f = r1
            return
    }

    public final void c(byte[] r1) {
            r0 = this;
            r0.f5821g = r1
            return
    }

    @Override // com.amap.api.col.p0003l.t6
    public final byte[] c() {
            r1 = this;
            byte[] r0 = r1.f5821g
            return r0
    }

    public final void d(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.q = r2
            return
        L9:
            java.lang.String r2 = ""
            r1.q = r2
            return
    }

    @Override // com.amap.api.col.p0003l.t6
    public final byte[] d() {
            r1 = this;
            byte[] r0 = r1.f5822h
            return r0
    }

    @Override // com.amap.api.col.p0003l.t6
    public final boolean f() {
            r1 = this;
            boolean r0 = r1.f5823i
            return r0
    }

    @Override // com.amap.api.col.p0003l.t6
    public final java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f5824j
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getIPDNSName() {
            r1 = this;
            java.lang.String r0 = r1.q
            return r0
    }

    @Override // com.amap.api.col.p0003l.l4, com.amap.api.col.p0003l.Cif
    public final java.lang.String getIPV6URL() {
            r1 = this;
            java.lang.String r0 = r1.f5820f
            return r0
    }

    @Override // com.amap.api.col.p0003l.t6, com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f5825k
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f5818d
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getSDKName() {
            r1 = this;
            java.lang.String r0 = "loc"
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r1 = this;
            java.lang.String r0 = r1.f5819e
            return r0
    }

    @Override // com.amap.api.col.p0003l.t6
    protected final boolean h() {
            r1 = this;
            boolean r0 = r1.p
            return r0
    }
}

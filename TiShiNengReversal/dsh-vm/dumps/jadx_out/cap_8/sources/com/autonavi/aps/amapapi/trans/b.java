package com.autonavi.aps.amapapi.trans;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b extends com.amap.api.col.p0003l.l4 {
    java.util.Map<java.lang.String, java.lang.String> a;

    /* renamed from: b, reason: collision with root package name */
    java.util.Map<java.lang.String, java.lang.String> f5809b;

    /* renamed from: c, reason: collision with root package name */
    java.lang.String f5810c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f5811d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5812e;

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f5809b = r0
            java.lang.String r1 = ""
            r2.f5810c = r1
            r2.f5811d = r0
            r2.f5812e = r0
            return
    }

    public final void a(java.lang.String r1) {
            r0 = this;
            r0.f5810c = r1
            return
    }

    public final void a(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void a(byte[] r1) {
            r0 = this;
            r0.f5811d = r1
            return
    }

    public final void b(java.lang.String r1) {
            r0 = this;
            r0.f5812e = r1
            return
    }

    public final void b(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.f5809b = r1
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final byte[] getEntityBytes() {
            r1 = this;
            byte[] r0 = r1.f5811d
            return r0
    }

    @Override // com.amap.api.col.p0003l.l4, com.amap.api.col.p0003l.Cif
    public final java.lang.String getIPV6URL() {
            r1 = this;
            java.lang.String r0 = r1.f5812e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.f5812e
            return r0
        Lb:
            java.lang.String r0 = super.getIPV6URL()
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f5809b
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.a
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r1 = this;
            java.lang.String r0 = r1.f5810c
            return r0
    }
}

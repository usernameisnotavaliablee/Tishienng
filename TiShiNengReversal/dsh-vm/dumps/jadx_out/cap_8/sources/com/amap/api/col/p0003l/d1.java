package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d1 extends com.amap.api.col.p0003l.g2 {
    private java.lang.String r;

    public d1(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.r = r1
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getIPV6URL() {
            r1 = this;
            java.lang.String r0 = r1.getURL()
            return r0
    }

    @Override // com.amap.api.col.p0003l.g2, com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r3 = this;
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 32
            r0.<init>(r1)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "MAC=channel:amapapi"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r1 = this;
            java.lang.String r0 = r1.r
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final boolean isSupportIPV6() {
            r1 = this;
            r0 = 0
            return r0
    }
}

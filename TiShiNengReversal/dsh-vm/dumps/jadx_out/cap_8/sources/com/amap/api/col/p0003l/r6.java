package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r6 extends com.amap.api.col.p0003l.Cif {
    private byte[] r;
    private java.util.Map<java.lang.String, java.lang.String> s;

    public r6(byte[] r1, java.util.Map<java.lang.String, java.lang.String> r2) {
            r0 = this;
            r0.<init>()
            r0.r = r1
            r0.s = r2
            com.amap.api.col.3l.if$a r1 = com.amap.api.col.p0003l.Cif.a.f3528e
            r0.setDegradeAbility(r1)
            com.amap.api.col.3l.if$c r1 = com.amap.api.col.p0003l.Cif.c.f3539b
            r0.setHttpProtocol(r1)
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final byte[] getEntityBytes() {
            r1 = this;
            byte[] r0 = r1.r
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.s
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r1 = this;
            java.lang.String r0 = "https://adiu.amap.com/ws/device/adius"
            return r0
    }
}

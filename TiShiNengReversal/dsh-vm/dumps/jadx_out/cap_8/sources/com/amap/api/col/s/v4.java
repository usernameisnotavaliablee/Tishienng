package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v4 extends com.amap.api.col.s.b4<java.lang.String, java.lang.Integer> {
    private android.content.Context t;
    private java.lang.String u;

    public v4(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.t = r1
            r0.u = r2
            return
    }

    private static java.lang.Integer U() throws com.amap.api.services.core.AMapException {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            java.lang.Integer r1 = U()
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "key="
            r0.append(r1)
            android.content.Context r1 = r2.t
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            r0.append(r1)
            java.lang.String r1 = "&userid="
            r0.append(r1)
            java.lang.String r1 = r2.u
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.e()
            r0.append(r1)
            java.lang.String r1 = "/nearby/data/delete"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

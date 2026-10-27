package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c extends com.amap.api.col.s.b4<com.amap.api.services.nearby.UploadInfo, java.lang.Integer> {
    private android.content.Context t;
    private com.amap.api.services.nearby.UploadInfo u;

    public c(android.content.Context r1, com.amap.api.services.nearby.UploadInfo r2) {
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
            r8 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "key="
            r0.append(r1)
            android.content.Context r1 = r8.t
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            r0.append(r1)
            java.lang.String r1 = "&userid="
            r0.append(r1)
            com.amap.api.services.nearby.UploadInfo r1 = r8.u
            java.lang.String r1 = r1.getUserID()
            r0.append(r1)
            com.amap.api.services.nearby.UploadInfo r1 = r8.u
            com.amap.api.services.core.LatLonPoint r1 = r1.getPoint()
            double r2 = r1.getLongitude()
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 * r4
            int r2 = (int) r2
            double r6 = r1.getLatitude()
            double r6 = r6 * r4
            int r1 = (int) r6
            java.lang.String r3 = "&location="
            r0.append(r3)
            float r2 = (float) r2
            r3 = 1232348160(0x49742400, float:1000000.0)
            float r2 = r2 / r3
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            float r1 = (float) r1
            float r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = "&coordtype="
            r0.append(r1)
            com.amap.api.services.nearby.UploadInfo r1 = r8.u
            int r1 = r1.getCoordType()
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
            java.lang.String r1 = "/nearby/data/create"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

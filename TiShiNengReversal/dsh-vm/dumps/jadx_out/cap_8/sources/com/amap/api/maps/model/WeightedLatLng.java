package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WeightedLatLng {
    public static final double DEFAULT_INTENSITY = 1.0d;
    public final double intensity;
    public final com.amap.api.maps.model.LatLng latLng;
    private com.autonavi.amap.mapcore.DPoint mPoint;

    public WeightedLatLng(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.<init>(r3, r0)
            return
    }

    public WeightedLatLng(com.amap.api.maps.model.LatLng r3, double r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L1b
            r2.latLng = r3
            com.autonavi.amap.mapcore.DPoint r3 = com.amap.api.col.p0003l.b3.t(r3)
            r2.mPoint = r3
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 < 0) goto L16
            r2.intensity = r4
            return
        L16:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.intensity = r3
            return
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "latLng can not null"
            r3.<init>(r4)
            throw r3
    }

    protected com.autonavi.amap.mapcore.DPoint getPoint() {
            r1 = this;
            com.autonavi.amap.mapcore.DPoint r0 = r1.mPoint
            return r0
    }
}

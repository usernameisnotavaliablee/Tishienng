package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RegeocodeQuery {
    private com.amap.api.services.core.LatLonPoint a;

    /* renamed from: b, reason: collision with root package name */
    private float f5214b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5215c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5216d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5217e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5218f;

    public RegeocodeQuery(com.amap.api.services.core.LatLonPoint r2, float r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "autonavi"
            r1.f5215c = r0
            java.lang.String r0 = ""
            r1.f5216d = r0
            java.lang.String r0 = "distance"
            r1.f5217e = r0
            java.lang.String r0 = "base"
            r1.f5218f = r0
            r1.a = r2
            r1.f5214b = r3
            r1.setLatLonType(r4)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.amap.api.services.geocoder.RegeocodeQuery r5 = (com.amap.api.services.geocoder.RegeocodeQuery) r5
            java.lang.String r2 = r4.f5215c
            if (r2 != 0) goto L1e
            java.lang.String r2 = r5.f5215c
            if (r2 == 0) goto L27
            return r1
        L1e:
            java.lang.String r3 = r5.f5215c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            com.amap.api.services.core.LatLonPoint r2 = r4.a
            if (r2 != 0) goto L30
            com.amap.api.services.core.LatLonPoint r2 = r5.a
            if (r2 == 0) goto L39
            return r1
        L30:
            com.amap.api.services.core.LatLonPoint r3 = r5.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
            return r1
        L39:
            float r2 = r4.f5214b
            int r2 = java.lang.Float.floatToIntBits(r2)
            float r3 = r5.f5214b
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r2 == r3) goto L48
            return r1
        L48:
            java.lang.String r2 = r4.f5217e
            java.lang.String r3 = r5.f5217e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L53
            return r1
        L53:
            java.lang.String r2 = r4.f5218f
            if (r2 != 0) goto L5c
            java.lang.String r5 = r5.f5218f
            if (r5 == 0) goto L65
            return r1
        L5c:
            java.lang.String r5 = r5.f5218f
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L65
            return r1
        L65:
            return r0
    }

    public java.lang.String getExtensions() {
            r1 = this;
            java.lang.String r0 = r1.f5218f
            return r0
    }

    public java.lang.String getLatLonType() {
            r1 = this;
            java.lang.String r0 = r1.f5215c
            return r0
    }

    public java.lang.String getMode() {
            r1 = this;
            java.lang.String r0 = r1.f5217e
            return r0
    }

    public java.lang.String getPoiType() {
            r1 = this;
            java.lang.String r0 = r1.f5216d
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.a
            return r0
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.f5214b
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5215c
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 + 31
            int r0 = r0 * 31
            com.amap.api.services.core.LatLonPoint r2 = r3.a
            if (r2 != 0) goto L14
            goto L18
        L14:
            int r1 = r2.hashCode()
        L18:
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r3.f5214b
            int r1 = java.lang.Float.floatToIntBits(r1)
            int r0 = r0 + r1
            return r0
    }

    public void setExtensions(java.lang.String r1) {
            r0 = this;
            r0.f5218f = r1
            return
    }

    public void setLatLonType(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L14
            java.lang.String r0 = "autonavi"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L12
            java.lang.String r0 = "gps"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
        L12:
            r1.f5215c = r2
        L14:
            return
    }

    public void setMode(java.lang.String r1) {
            r0 = this;
            r0.f5217e = r1
            return
    }

    public void setPoiType(java.lang.String r1) {
            r0 = this;
            r0.f5216d = r1
            return
    }

    public void setPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setRadius(float r1) {
            r0 = this;
            r0.f5214b = r1
            return
    }
}

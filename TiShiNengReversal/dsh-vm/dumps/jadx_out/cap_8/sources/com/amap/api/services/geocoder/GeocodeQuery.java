package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GeocodeQuery {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5201b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5202c;

    public GeocodeQuery(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5201b = r2
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
            com.amap.api.services.geocoder.GeocodeQuery r5 = (com.amap.api.services.geocoder.GeocodeQuery) r5
            java.lang.String r2 = r4.f5201b
            if (r2 != 0) goto L1e
            java.lang.String r2 = r5.f5201b
            if (r2 == 0) goto L27
            return r1
        L1e:
            java.lang.String r3 = r5.f5201b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L30
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L39
            return r1
        L30:
            java.lang.String r5 = r5.a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L39
            return r1
        L39:
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5201b
            return r0
    }

    public java.lang.String getCountry() {
            r1 = this;
            java.lang.String r0 = r1.f5202c
            return r0
    }

    public java.lang.String getLocationName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5201b
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 + 31
            int r0 = r0 * 31
            java.lang.String r2 = r3.a
            if (r2 != 0) goto L14
            goto L18
        L14:
            int r1 = r2.hashCode()
        L18:
            int r0 = r0 + r1
            return r0
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.f5201b = r1
            return
    }

    public void setCountry(java.lang.String r1) {
            r0 = this;
            r0.f5202c = r1
            return
    }

    public void setLocationName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}

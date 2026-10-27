package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class VisibleRegion implements android.os.Parcelable {
    public static final com.amap.api.maps.model.VisibleRegionCreator CREATOR = null;
    public final com.amap.api.maps.model.LatLng farLeft;
    public final com.amap.api.maps.model.LatLng farRight;
    public final com.amap.api.maps.model.LatLngBounds latLngBounds;
    private final int mVersionCode;
    public final com.amap.api.maps.model.LatLng nearLeft;
    public final com.amap.api.maps.model.LatLng nearRight;

    static {
            com.amap.api.maps.model.VisibleRegionCreator r0 = new com.amap.api.maps.model.VisibleRegionCreator
            r0.<init>()
            com.amap.api.maps.model.VisibleRegion.CREATOR = r0
            return
    }

    VisibleRegion(int r1, com.amap.api.maps.model.LatLng r2, com.amap.api.maps.model.LatLng r3, com.amap.api.maps.model.LatLng r4, com.amap.api.maps.model.LatLng r5, com.amap.api.maps.model.LatLngBounds r6) {
            r0 = this;
            r0.<init>()
            r0.mVersionCode = r1
            r0.nearLeft = r2
            r0.nearRight = r3
            r0.farLeft = r4
            r0.farRight = r5
            r0.latLngBounds = r6
            return
    }

    public VisibleRegion(com.amap.api.maps.model.LatLng r8, com.amap.api.maps.model.LatLng r9, com.amap.api.maps.model.LatLng r10, com.amap.api.maps.model.LatLng r11, com.amap.api.maps.model.LatLngBounds r12) {
            r7 = this;
            r1 = 1
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    final int a() {
            r1 = this;
            int r0 = r1.mVersionCode
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.amap.api.maps.model.VisibleRegion
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.amap.api.maps.model.VisibleRegion r5 = (com.amap.api.maps.model.VisibleRegion) r5
            com.amap.api.maps.model.LatLng r1 = r4.nearLeft
            com.amap.api.maps.model.LatLng r3 = r5.nearLeft
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3f
            com.amap.api.maps.model.LatLng r1 = r4.nearRight
            com.amap.api.maps.model.LatLng r3 = r5.nearRight
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3f
            com.amap.api.maps.model.LatLng r1 = r4.farLeft
            com.amap.api.maps.model.LatLng r3 = r5.farLeft
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3f
            com.amap.api.maps.model.LatLng r1 = r4.farRight
            com.amap.api.maps.model.LatLng r3 = r5.farRight
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3f
            com.amap.api.maps.model.LatLngBounds r1 = r4.latLngBounds
            com.amap.api.maps.model.LatLngBounds r5 = r5.latLngBounds
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3f
            return r0
        L3f:
            return r2
    }

    public final int hashCode() {
            r7 = this;
            com.amap.api.maps.model.LatLng r0 = r7.nearLeft
            com.amap.api.maps.model.LatLng r1 = r7.nearRight
            com.amap.api.maps.model.LatLng r2 = r7.farLeft
            com.amap.api.maps.model.LatLng r3 = r7.farRight
            com.amap.api.maps.model.LatLngBounds r4 = r7.latLngBounds
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            int r0 = com.amap.api.col.p0003l.b3.k(r5)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "nearLeft"
            com.amap.api.maps.model.LatLng r1 = r6.nearLeft
            java.lang.String r0 = com.amap.api.col.p0003l.b3.z(r0, r1)
            java.lang.String r1 = "nearRight"
            com.amap.api.maps.model.LatLng r2 = r6.nearRight
            java.lang.String r1 = com.amap.api.col.p0003l.b3.z(r1, r2)
            java.lang.String r2 = "farLeft"
            com.amap.api.maps.model.LatLng r3 = r6.farLeft
            java.lang.String r2 = com.amap.api.col.p0003l.b3.z(r2, r3)
            java.lang.String r3 = "farRight"
            com.amap.api.maps.model.LatLng r4 = r6.farRight
            java.lang.String r3 = com.amap.api.col.p0003l.b3.z(r3, r4)
            java.lang.String r4 = "latLngBounds"
            com.amap.api.maps.model.LatLngBounds r5 = r6.latLngBounds
            java.lang.String r4 = com.amap.api.col.p0003l.b3.z(r4, r5)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            java.lang.String r0 = com.amap.api.col.p0003l.b3.A(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.amap.api.maps.model.VisibleRegionCreator.a(r0, r1, r2)
            return
    }
}

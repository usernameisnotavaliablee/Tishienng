package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Poi implements android.os.Parcelable {
    public static final com.amap.api.maps.model.PoiCreator CREATOR = null;
    private final com.amap.api.maps.model.LatLng coordinate;
    private final java.lang.String name;
    private final java.lang.String poiid;

    static {
            com.amap.api.maps.model.PoiCreator r0 = new com.amap.api.maps.model.PoiCreator
            r0.<init>()
            com.amap.api.maps.model.Poi.CREATOR = r0
            return
    }

    public Poi(java.lang.String r1, com.amap.api.maps.model.LatLng r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.coordinate = r2
            r0.poiid = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            boolean r2 = r5 instanceof com.amap.api.maps.model.Poi
            if (r2 != 0) goto Lc
            goto L33
        Lc:
            com.amap.api.maps.model.Poi r5 = (com.amap.api.maps.model.Poi) r5
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r4.name
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            com.amap.api.maps.model.LatLng r2 = r5.getCoordinate()
            com.amap.api.maps.model.LatLng r3 = r4.coordinate
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            java.lang.String r5 = r5.getPoiId()
            java.lang.String r2 = r4.poiid
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L33
            return r0
        L33:
            return r1
    }

    public com.amap.api.maps.model.LatLng getCoordinate() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.coordinate
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getPoiId() {
            r1 = this;
            java.lang.String r0 = r1.poiid
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "poiid "
            r0.<init>(r1)
            java.lang.String r1 = r2.poiid
            r0.append(r1)
            java.lang.String r1 = " name:"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "  coordinate:"
            r0.append(r1)
            com.amap.api.maps.model.LatLng r1 = r2.coordinate
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.name
            r2.writeString(r0)
            com.amap.api.maps.model.LatLng r0 = r1.coordinate
            r2.writeParcelable(r0, r3)
            java.lang.String r3 = r1.poiid
            r2.writeString(r3)
            return
    }
}

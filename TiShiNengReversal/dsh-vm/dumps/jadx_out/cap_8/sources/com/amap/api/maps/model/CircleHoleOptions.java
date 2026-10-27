package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CircleHoleOptions extends com.amap.api.maps.model.BaseHoleOptions implements android.os.Parcelable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final android.os.Parcelable.Creator<com.amap.api.maps.model.CircleHoleOptions> CREATOR = null;
    private com.amap.api.maps.model.LatLng point;
    private double radius;


    static {
            com.amap.api.maps.model.CircleHoleOptions$1 r0 = new com.amap.api.maps.model.CircleHoleOptions$1
            r0.<init>()
            com.amap.api.maps.model.CircleHoleOptions.CREATOR = r0
            return
    }

    public CircleHoleOptions() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.point = r0
            r0 = 0
            r2.radius = r0
            r0 = 0
            r2.isPolygonHoleOptions = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected CircleHoleOptions(android.os.Parcel r7) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.point = r0
            r0 = 0
            r6.radius = r0
            android.os.Bundle r0 = r7.readBundle()
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
            java.lang.String r2 = "lat"
            double r2 = r0.getDouble(r2)
            java.lang.String r4 = "lng"
            double r4 = r0.getDouble(r4)
            r1.<init>(r2, r4)
            r6.point = r1
            double r0 = r7.readDouble()
            r6.radius = r0
            return
    }

    public com.amap.api.maps.model.CircleHoleOptions center(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.point = r1
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.maps.model.LatLng getCenter() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.point
            return r0
    }

    public double getRadius() {
            r2 = this;
            double r0 = r2.radius
            return r0
    }

    public com.amap.api.maps.model.CircleHoleOptions radius(double r1) {
            r0 = this;
            r0.radius = r1
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.amap.api.maps.model.LatLng r0 = r4.point
            if (r0 == 0) goto L19
            java.lang.String r1 = "lat"
            double r2 = r0.latitude
            r6.putDouble(r1, r2)
            com.amap.api.maps.model.LatLng r0 = r4.point
            double r0 = r0.longitude
            java.lang.String r2 = "lng"
            r6.putDouble(r2, r0)
        L19:
            r5.writeBundle(r6)
            double r0 = r4.radius
            r5.writeDouble(r0)
            return
    }
}

package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PolygonHoleOptions extends com.amap.api.maps.model.BaseHoleOptions implements android.os.Parcelable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final android.os.Parcelable.Creator<com.amap.api.maps.model.PolygonHoleOptions> CREATOR = null;
    private final java.util.List<com.amap.api.maps.model.LatLng> points;


    static {
            com.amap.api.maps.model.PolygonHoleOptions$1 r0 = new com.amap.api.maps.model.PolygonHoleOptions$1
            r0.<init>()
            com.amap.api.maps.model.PolygonHoleOptions.CREATOR = r0
            return
    }

    public PolygonHoleOptions() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.points = r0
            r0 = 1
            r1.isPolygonHoleOptions = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected PolygonHoleOptions(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            com.amap.api.maps.model.LatLngCreator r0 = com.amap.api.maps.model.LatLng.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.points = r2
            r2 = 1
            r1.isPolygonHoleOptions = r2
            return
    }

    public com.amap.api.maps.model.PolygonHoleOptions addAll(java.lang.Iterable<com.amap.api.maps.model.LatLng> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        L4:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L16
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.LatLng r0 = (com.amap.api.maps.model.LatLng) r0     // Catch: java.lang.Throwable -> L16
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r2.points     // Catch: java.lang.Throwable -> L16
            r1.add(r0)     // Catch: java.lang.Throwable -> L16
            goto L4
        L16:
            return r2
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.maps.model.LatLng> getPoints() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r0.points
            r1.writeTypedList(r2)
            return
    }
}

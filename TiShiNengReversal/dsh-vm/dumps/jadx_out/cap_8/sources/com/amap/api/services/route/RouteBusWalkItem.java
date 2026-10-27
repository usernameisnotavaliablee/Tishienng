package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteBusWalkItem extends com.amap.api.services.route.WalkPath implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteBusWalkItem> CREATOR = null;
    private com.amap.api.services.core.LatLonPoint a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5452b;


    static {
            com.amap.api.services.route.RouteBusWalkItem$1 r0 = new com.amap.api.services.route.RouteBusWalkItem$1
            r0.<init>()
            com.amap.api.services.route.RouteBusWalkItem.CREATOR = r0
            return
    }

    public RouteBusWalkItem() {
            r0 = this;
            r0.<init>()
            return
    }

    public RouteBusWalkItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r1)
            com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
            r2.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.amap.api.services.core.LatLonPoint r3 = (com.amap.api.services.core.LatLonPoint) r3
            r2.f5452b = r3
            return
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getDestination() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5452b
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getOrigin() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.a
            return r0
    }

    public void setDestination(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5452b = r1
            return
    }

    public void setOrigin(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            com.amap.api.services.core.LatLonPoint r0 = r1.a
            r2.writeParcelable(r0, r3)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5452b
            r2.writeParcelable(r0, r3)
            return
    }
}

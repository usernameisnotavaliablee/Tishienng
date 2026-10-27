package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TruckRouteRestult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TruckRouteRestult> CREATOR = null;
    private com.amap.api.services.route.RouteSearch.TruckRouteQuery a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.TruckPath> f5582b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5583c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5584d;


    static {
            com.amap.api.services.route.TruckRouteRestult$1 r0 = new com.amap.api.services.route.TruckRouteRestult$1
            r0.<init>()
            com.amap.api.services.route.TruckRouteRestult.CREATOR = r0
            return
    }

    public TruckRouteRestult() {
            r0 = this;
            r0.<init>()
            return
    }

    protected TruckRouteRestult(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            android.os.Parcelable$Creator<com.amap.api.services.route.TruckPath> r0 = com.amap.api.services.route.TruckPath.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.f5582b = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r1)
            com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
            r2.f5583c = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.amap.api.services.core.LatLonPoint r3 = (com.amap.api.services.core.LatLonPoint) r3
            r2.f5584d = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.services.route.TruckPath> getPaths() {
            r1 = this;
            java.util.List<com.amap.api.services.route.TruckPath> r0 = r1.f5582b
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getStartPos() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5583c
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getTargetPos() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5584d
            return r0
    }

    public com.amap.api.services.route.RouteSearch.TruckRouteQuery getTruckQuery() {
            r1 = this;
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r0 = r1.a
            return r0
    }

    public void setPaths(java.util.List<com.amap.api.services.route.TruckPath> r1) {
            r0 = this;
            r0.f5582b = r1
            return
    }

    public void setStartPos(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5583c = r1
            return
    }

    public void setTargetPos(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5584d = r1
            return
    }

    public void setTruckQuery(com.amap.api.services.route.RouteSearch.TruckRouteQuery r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.List<com.amap.api.services.route.TruckPath> r0 = r1.f5582b
            r2.writeTypedList(r0)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5583c
            r2.writeParcelable(r0, r3)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5584d
            r2.writeParcelable(r0, r3)
            return
    }
}

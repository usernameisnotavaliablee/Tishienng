package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusRouteResultV2 extends com.amap.api.services.route.RouteResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.BusRouteResultV2> CREATOR = null;
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.BusPathV2> f5343b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.route.RouteSearchV2.BusRouteQuery f5344c;

    /* renamed from: d, reason: collision with root package name */
    private float f5345d;


    static {
            com.amap.api.services.route.BusRouteResultV2$1 r0 = new com.amap.api.services.route.BusRouteResultV2$1
            r0.<init>()
            com.amap.api.services.route.BusRouteResultV2.CREATOR = r0
            return
    }

    public BusRouteResultV2() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5343b = r0
            return
    }

    public BusRouteResultV2(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5343b = r0
            float r0 = r2.readFloat()
            r1.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.BusPathV2> r0 = com.amap.api.services.route.BusPathV2.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5343b = r0
            java.lang.Class<com.amap.api.services.route.RouteSearchV2$BusRouteQuery> r0 = com.amap.api.services.route.RouteSearchV2.BusRouteQuery.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r0 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r0
            r1.f5344c = r0
            float r2 = r2.readFloat()
            r1.f5345d = r2
            return
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.route.RouteSearchV2.BusRouteQuery getBusQuery() {
            r1 = this;
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r0 = r1.f5344c
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5345d
            return r0
    }

    public java.util.List<com.amap.api.services.route.BusPathV2> getPaths() {
            r1 = this;
            java.util.List<com.amap.api.services.route.BusPathV2> r0 = r1.f5343b
            return r0
    }

    public float getTaxiCost() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public void setBusQuery(com.amap.api.services.route.RouteSearchV2.BusRouteQuery r1) {
            r0 = this;
            r0.f5344c = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5345d = r1
            return
    }

    public void setPaths(java.util.List<com.amap.api.services.route.BusPathV2> r1) {
            r0 = this;
            r0.f5343b = r1
            return
    }

    public void setTaxiCost(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            float r0 = r1.a
            r2.writeFloat(r0)
            java.util.List<com.amap.api.services.route.BusPathV2> r0 = r1.f5343b
            r2.writeTypedList(r0)
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r0 = r1.f5344c
            r2.writeParcelable(r0, r3)
            float r3 = r1.f5345d
            r2.writeFloat(r3)
            return
    }
}

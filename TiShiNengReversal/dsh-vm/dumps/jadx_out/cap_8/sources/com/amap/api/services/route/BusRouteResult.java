package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusRouteResult extends com.amap.api.services.route.RouteResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.BusRouteResult> CREATOR = null;
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.BusPath> f5341b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.route.RouteSearch.BusRouteQuery f5342c;


    static {
            com.amap.api.services.route.BusRouteResult$1 r0 = new com.amap.api.services.route.BusRouteResult$1
            r0.<init>()
            com.amap.api.services.route.BusRouteResult.CREATOR = r0
            return
    }

    public BusRouteResult() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5341b = r0
            return
    }

    public BusRouteResult(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5341b = r0
            float r0 = r2.readFloat()
            r1.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.BusPath> r0 = com.amap.api.services.route.BusPath.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5341b = r0
            java.lang.Class<com.amap.api.services.route.RouteSearch$BusRouteQuery> r0 = com.amap.api.services.route.RouteSearch.BusRouteQuery.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r2.readParcelable(r0)
            com.amap.api.services.route.RouteSearch$BusRouteQuery r2 = (com.amap.api.services.route.RouteSearch.BusRouteQuery) r2
            r1.f5342c = r2
            return
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.route.RouteSearch.BusRouteQuery getBusQuery() {
            r1 = this;
            com.amap.api.services.route.RouteSearch$BusRouteQuery r0 = r1.f5342c
            return r0
    }

    public java.util.List<com.amap.api.services.route.BusPath> getPaths() {
            r1 = this;
            java.util.List<com.amap.api.services.route.BusPath> r0 = r1.f5341b
            return r0
    }

    public float getTaxiCost() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public void setBusQuery(com.amap.api.services.route.RouteSearch.BusRouteQuery r1) {
            r0 = this;
            r0.f5342c = r1
            return
    }

    public void setPaths(java.util.List<com.amap.api.services.route.BusPath> r1) {
            r0 = this;
            r0.f5341b = r1
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
            java.util.List<com.amap.api.services.route.BusPath> r0 = r1.f5341b
            r2.writeTypedList(r0)
            com.amap.api.services.route.RouteSearch$BusRouteQuery r0 = r1.f5342c
            r2.writeParcelable(r0, r3)
            return
    }
}

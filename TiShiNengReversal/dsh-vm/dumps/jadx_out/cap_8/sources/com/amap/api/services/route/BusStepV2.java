package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusStepV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.BusStepV2> CREATOR = null;
    private com.amap.api.services.route.RouteBusWalkItem a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.RouteBusLineItem> f5351b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.route.Doorway f5352c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.route.Doorway f5353d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.route.RouteRailwayItem f5354e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.services.route.TaxiItemV2 f5355f;


    static {
            com.amap.api.services.route.BusStepV2$1 r0 = new com.amap.api.services.route.BusStepV2$1
            r0.<init>()
            com.amap.api.services.route.BusStepV2.CREATOR = r0
            return
    }

    public BusStepV2() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5351b = r0
            return
    }

    public BusStepV2(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5351b = r0
            java.lang.Class<com.amap.api.services.route.RouteBusWalkItem> r0 = com.amap.api.services.route.RouteBusWalkItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.amap.api.services.route.RouteBusWalkItem r0 = (com.amap.api.services.route.RouteBusWalkItem) r0
            r2.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.RouteBusLineItem> r0 = com.amap.api.services.route.RouteBusLineItem.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.f5351b = r0
            java.lang.Class<com.amap.api.services.route.Doorway> r0 = com.amap.api.services.route.Doorway.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r1)
            com.amap.api.services.route.Doorway r1 = (com.amap.api.services.route.Doorway) r1
            r2.f5352c = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.amap.api.services.route.Doorway r0 = (com.amap.api.services.route.Doorway) r0
            r2.f5353d = r0
            java.lang.Class<com.amap.api.services.route.RouteRailwayItem> r0 = com.amap.api.services.route.RouteRailwayItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.amap.api.services.route.RouteRailwayItem r0 = (com.amap.api.services.route.RouteRailwayItem) r0
            r2.f5354e = r0
            java.lang.Class<com.amap.api.services.route.TaxiItem> r0 = com.amap.api.services.route.TaxiItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.amap.api.services.route.TaxiItemV2 r3 = (com.amap.api.services.route.TaxiItemV2) r3
            r2.f5355f = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public com.amap.api.services.route.RouteBusLineItem getBusLine() {
            r2 = this;
            java.util.List<com.amap.api.services.route.RouteBusLineItem> r0 = r2.f5351b
            if (r0 == 0) goto L15
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L15
        Lb:
            java.util.List<com.amap.api.services.route.RouteBusLineItem> r0 = r2.f5351b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.amap.api.services.route.RouteBusLineItem r0 = (com.amap.api.services.route.RouteBusLineItem) r0
            return r0
        L15:
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.services.route.RouteBusLineItem> getBusLines() {
            r1 = this;
            java.util.List<com.amap.api.services.route.RouteBusLineItem> r0 = r1.f5351b
            return r0
    }

    public com.amap.api.services.route.Doorway getEntrance() {
            r1 = this;
            com.amap.api.services.route.Doorway r0 = r1.f5352c
            return r0
    }

    public com.amap.api.services.route.Doorway getExit() {
            r1 = this;
            com.amap.api.services.route.Doorway r0 = r1.f5353d
            return r0
    }

    public com.amap.api.services.route.RouteRailwayItem getRailway() {
            r1 = this;
            com.amap.api.services.route.RouteRailwayItem r0 = r1.f5354e
            return r0
    }

    public com.amap.api.services.route.TaxiItemV2 getTaxi() {
            r1 = this;
            com.amap.api.services.route.TaxiItemV2 r0 = r1.f5355f
            return r0
    }

    public com.amap.api.services.route.RouteBusWalkItem getWalk() {
            r1 = this;
            com.amap.api.services.route.RouteBusWalkItem r0 = r1.a
            return r0
    }

    @java.lang.Deprecated
    public void setBusLine(com.amap.api.services.route.RouteBusLineItem r3) {
            r2 = this;
            java.util.List<com.amap.api.services.route.RouteBusLineItem> r0 = r2.f5351b
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            if (r0 != 0) goto L10
            java.util.List<com.amap.api.services.route.RouteBusLineItem> r0 = r2.f5351b
            r0.add(r3)
        L10:
            java.util.List<com.amap.api.services.route.RouteBusLineItem> r0 = r2.f5351b
            r1 = 0
            r0.set(r1, r3)
            return
    }

    public void setBusLines(java.util.List<com.amap.api.services.route.RouteBusLineItem> r1) {
            r0 = this;
            r0.f5351b = r1
            return
    }

    public void setEntrance(com.amap.api.services.route.Doorway r1) {
            r0 = this;
            r0.f5352c = r1
            return
    }

    public void setExit(com.amap.api.services.route.Doorway r1) {
            r0 = this;
            r0.f5353d = r1
            return
    }

    public void setRailway(com.amap.api.services.route.RouteRailwayItem r1) {
            r0 = this;
            r0.f5354e = r1
            return
    }

    public void setTaxi(com.amap.api.services.route.TaxiItemV2 r1) {
            r0 = this;
            r0.f5355f = r1
            return
    }

    public void setWalk(com.amap.api.services.route.RouteBusWalkItem r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.amap.api.services.route.RouteBusWalkItem r0 = r1.a
            r2.writeParcelable(r0, r3)
            java.util.List<com.amap.api.services.route.RouteBusLineItem> r0 = r1.f5351b
            r2.writeTypedList(r0)
            com.amap.api.services.route.Doorway r0 = r1.f5352c
            r2.writeParcelable(r0, r3)
            com.amap.api.services.route.Doorway r0 = r1.f5353d
            r2.writeParcelable(r0, r3)
            com.amap.api.services.route.RouteRailwayItem r0 = r1.f5354e
            r2.writeParcelable(r0, r3)
            com.amap.api.services.route.TaxiItemV2 r0 = r1.f5355f
            r2.writeParcelable(r0, r3)
            return
    }
}

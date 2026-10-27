package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteRailwayItem extends com.amap.api.services.route.Railway implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteRailwayItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5454b;

    /* renamed from: c, reason: collision with root package name */
    private float f5455c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5456d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.route.RailwayStationItem f5457e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.services.route.RailwayStationItem f5458f;

    /* renamed from: g, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.RailwayStationItem> f5459g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.Railway> f5460h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.RailwaySpace> f5461i;


    static {
            com.amap.api.services.route.RouteRailwayItem$1 r0 = new com.amap.api.services.route.RouteRailwayItem$1
            r0.<init>()
            com.amap.api.services.route.RouteRailwayItem.CREATOR = r0
            return
    }

    public RouteRailwayItem() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5459g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5460h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5461i = r0
            return
    }

    protected RouteRailwayItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5459g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5460h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5461i = r0
            java.lang.String r0 = r3.readString()
            r2.a = r0
            java.lang.String r0 = r3.readString()
            r2.f5454b = r0
            float r0 = r3.readFloat()
            r2.f5455c = r0
            java.lang.String r0 = r3.readString()
            r2.f5456d = r0
            java.lang.Class<com.amap.api.services.route.RailwayStationItem> r0 = com.amap.api.services.route.RailwayStationItem.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r1)
            com.amap.api.services.route.RailwayStationItem r1 = (com.amap.api.services.route.RailwayStationItem) r1
            r2.f5457e = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.amap.api.services.route.RailwayStationItem r0 = (com.amap.api.services.route.RailwayStationItem) r0
            r2.f5458f = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.RailwayStationItem> r0 = com.amap.api.services.route.RailwayStationItem.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.f5459g = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.Railway> r0 = com.amap.api.services.route.Railway.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.f5460h = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.RailwaySpace> r0 = com.amap.api.services.route.RailwaySpace.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r0)
            r2.f5461i = r3
            return
    }

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.services.route.Railway> getAlters() {
            r1 = this;
            java.util.List<com.amap.api.services.route.Railway> r0 = r1.f5460h
            return r0
    }

    public com.amap.api.services.route.RailwayStationItem getArrivalstop() {
            r1 = this;
            com.amap.api.services.route.RailwayStationItem r0 = r1.f5458f
            return r0
    }

    public com.amap.api.services.route.RailwayStationItem getDeparturestop() {
            r1 = this;
            com.amap.api.services.route.RailwayStationItem r0 = r1.f5457e
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5455c
            return r0
    }

    public java.util.List<com.amap.api.services.route.RailwaySpace> getSpaces() {
            r1 = this;
            java.util.List<com.amap.api.services.route.RailwaySpace> r0 = r1.f5461i
            return r0
    }

    public java.lang.String getTime() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getTrip() {
            r1 = this;
            java.lang.String r0 = r1.f5454b
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f5456d
            return r0
    }

    public java.util.List<com.amap.api.services.route.RailwayStationItem> getViastops() {
            r1 = this;
            java.util.List<com.amap.api.services.route.RailwayStationItem> r0 = r1.f5459g
            return r0
    }

    public void setAlters(java.util.List<com.amap.api.services.route.Railway> r1) {
            r0 = this;
            r0.f5460h = r1
            return
    }

    public void setArrivalstop(com.amap.api.services.route.RailwayStationItem r1) {
            r0 = this;
            r0.f5458f = r1
            return
    }

    public void setDeparturestop(com.amap.api.services.route.RailwayStationItem r1) {
            r0 = this;
            r0.f5457e = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5455c = r1
            return
    }

    public void setSpaces(java.util.List<com.amap.api.services.route.RailwaySpace> r1) {
            r0 = this;
            r0.f5461i = r1
            return
    }

    public void setTime(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setTrip(java.lang.String r1) {
            r0 = this;
            r0.f5454b = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.f5456d = r1
            return
    }

    public void setViastops(java.util.List<com.amap.api.services.route.RailwayStationItem> r1) {
            r0 = this;
            r0.f5459g = r1
            return
    }

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            java.lang.String r0 = r1.a
            r2.writeString(r0)
            java.lang.String r0 = r1.f5454b
            r2.writeString(r0)
            float r0 = r1.f5455c
            r2.writeFloat(r0)
            java.lang.String r0 = r1.f5456d
            r2.writeString(r0)
            com.amap.api.services.route.RailwayStationItem r0 = r1.f5457e
            r2.writeParcelable(r0, r3)
            com.amap.api.services.route.RailwayStationItem r0 = r1.f5458f
            r2.writeParcelable(r0, r3)
            java.util.List<com.amap.api.services.route.RailwayStationItem> r3 = r1.f5459g
            r2.writeTypedList(r3)
            java.util.List<com.amap.api.services.route.Railway> r3 = r1.f5460h
            r2.writeTypedList(r3)
            java.util.List<com.amap.api.services.route.RailwaySpace> r3 = r1.f5461i
            r2.writeTypedList(r3)
            return
    }
}

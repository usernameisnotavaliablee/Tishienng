package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RailwayStationItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RailwayStationItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5430b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5431c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5432d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5433e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5434f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5435g;

    /* renamed from: h, reason: collision with root package name */
    private float f5436h;


    static {
            com.amap.api.services.route.RailwayStationItem$1 r0 = new com.amap.api.services.route.RailwayStationItem$1
            r0.<init>()
            com.amap.api.services.route.RailwayStationItem.CREATOR = r0
            return
    }

    public RailwayStationItem() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5434f = r0
            r1.f5435g = r0
            return
    }

    protected RailwayStationItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f5434f = r0
            r2.f5435g = r0
            java.lang.String r1 = r3.readString()
            r2.a = r1
            java.lang.String r1 = r3.readString()
            r2.f5430b = r1
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r1 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r1)
            com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
            r2.f5431c = r1
            java.lang.String r1 = r3.readString()
            r2.f5432d = r1
            java.lang.String r1 = r3.readString()
            r2.f5433e = r1
            r1 = 2
            boolean[] r1 = new boolean[r1]
            r3.readBooleanArray(r1)
            boolean r0 = r1[r0]
            r2.f5434f = r0
            r0 = 1
            boolean r0 = r1[r0]
            r2.f5435g = r0
            float r3 = r3.readFloat()
            r2.f5436h = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAdcode() {
            r1 = this;
            java.lang.String r0 = r1.f5432d
            return r0
    }

    public java.lang.String getID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLocation() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5431c
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f5430b
            return r0
    }

    public java.lang.String getTime() {
            r1 = this;
            java.lang.String r0 = r1.f5433e
            return r0
    }

    public float getWait() {
            r1 = this;
            float r0 = r1.f5436h
            return r0
    }

    public boolean isEnd() {
            r1 = this;
            boolean r0 = r1.f5435g
            return r0
    }

    public boolean isStart() {
            r1 = this;
            boolean r0 = r1.f5434f
            return r0
    }

    public void setAdcode(java.lang.String r1) {
            r0 = this;
            r0.f5432d = r1
            return
    }

    public void setID(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setLocation(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5431c = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.f5430b = r1
            return
    }

    public void setTime(java.lang.String r1) {
            r0 = this;
            r0.f5433e = r1
            return
    }

    public void setWait(float r1) {
            r0 = this;
            r0.f5436h = r1
            return
    }

    public void setisEnd(boolean r1) {
            r0 = this;
            r0.f5435g = r1
            return
    }

    public void setisStart(boolean r1) {
            r0 = this;
            r0.f5434f = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r0 = r3.a
            r4.writeString(r0)
            java.lang.String r0 = r3.f5430b
            r4.writeString(r0)
            com.amap.api.services.core.LatLonPoint r0 = r3.f5431c
            r4.writeParcelable(r0, r5)
            java.lang.String r5 = r3.f5432d
            r4.writeString(r5)
            java.lang.String r5 = r3.f5433e
            r4.writeString(r5)
            boolean r5 = r3.f5434f
            boolean r0 = r3.f5435g
            r1 = 2
            boolean[] r1 = new boolean[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r0
            r4.writeBooleanArray(r1)
            float r5 = r3.f5436h
            r4.writeFloat(r5)
            return
    }
}

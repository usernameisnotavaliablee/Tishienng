package com.amap.api.services.busline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusLineItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.busline.BusLineItem> CREATOR = null;
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5081b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5082c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5083d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5084e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5085f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5086g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5087h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f5088i;

    /* renamed from: j, reason: collision with root package name */
    private java.util.Date f5089j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.Date f5090k;
    private java.lang.String l;
    private float m;
    private float n;
    private java.util.List<com.amap.api.services.busline.BusStationItem> o;


    static {
            com.amap.api.services.busline.BusLineItem$1 r0 = new com.amap.api.services.busline.BusLineItem$1
            r0.<init>()
            com.amap.api.services.busline.BusLineItem.CREATOR = r0
            return
    }

    public BusLineItem() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5084e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5085f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.o = r0
            return
    }

    public BusLineItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5084e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5085f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.o = r0
            float r0 = r3.readFloat()
            r2.a = r0
            java.lang.String r0 = r3.readString()
            r2.f5081b = r0
            java.lang.String r0 = r3.readString()
            r2.f5082c = r0
            java.lang.String r0 = r3.readString()
            r2.f5083d = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.ArrayList r1 = r3.readArrayList(r1)
            r2.f5084e = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r3.readArrayList(r0)
            r2.f5085f = r0
            java.lang.String r0 = r3.readString()
            r2.f5086g = r0
            java.lang.String r0 = r3.readString()
            r2.f5087h = r0
            java.lang.String r0 = r3.readString()
            r2.f5088i = r0
            java.lang.String r0 = r3.readString()
            java.util.Date r0 = com.amap.api.col.s.j4.o(r0)
            r2.f5089j = r0
            java.lang.String r0 = r3.readString()
            java.util.Date r0 = com.amap.api.col.s.j4.o(r0)
            r2.f5090k = r0
            java.lang.String r0 = r3.readString()
            r2.l = r0
            float r0 = r3.readFloat()
            r2.m = r0
            float r0 = r3.readFloat()
            r2.n = r0
            java.lang.Class<com.amap.api.services.busline.BusStationItem> r0 = com.amap.api.services.busline.BusStationItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r3 = r3.readArrayList(r0)
            r2.o = r3
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
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.amap.api.services.busline.BusLineItem r5 = (com.amap.api.services.busline.BusLineItem) r5
            java.lang.String r2 = r4.f5086g
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.f5086g
            if (r5 == 0) goto L27
            return r1
        L1e:
            java.lang.String r5 = r5.f5086g
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    public float getBasicPrice() {
            r1 = this;
            float r0 = r1.m
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getBounds() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5085f
            return r0
    }

    public java.lang.String getBusCompany() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public java.lang.String getBusLineId() {
            r1 = this;
            java.lang.String r0 = r1.f5086g
            return r0
    }

    public java.lang.String getBusLineName() {
            r1 = this;
            java.lang.String r0 = r1.f5081b
            return r0
    }

    public java.lang.String getBusLineType() {
            r1 = this;
            java.lang.String r0 = r1.f5082c
            return r0
    }

    public java.util.List<com.amap.api.services.busline.BusStationItem> getBusStations() {
            r1 = this;
            java.util.List<com.amap.api.services.busline.BusStationItem> r0 = r1.o
            return r0
    }

    public java.lang.String getCityCode() {
            r1 = this;
            java.lang.String r0 = r1.f5083d
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getDirectionsCoordinates() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5084e
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public java.util.Date getFirstBusTime() {
            r1 = this;
            java.util.Date r0 = r1.f5089j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.clone()
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public java.util.Date getLastBusTime() {
            r1 = this;
            java.util.Date r0 = r1.f5090k
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.clone()
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public java.lang.String getOriginatingStation() {
            r1 = this;
            java.lang.String r0 = r1.f5087h
            return r0
    }

    public java.lang.String getTerminalStation() {
            r1 = this;
            java.lang.String r0 = r1.f5088i
            return r0
    }

    public float getTotalPrice() {
            r1 = this;
            float r0 = r1.n
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5086g
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 + 31
            return r0
    }

    public void setBasicPrice(float r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setBounds(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5085f = r1
            return
    }

    public void setBusCompany(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setBusLineId(java.lang.String r1) {
            r0 = this;
            r0.f5086g = r1
            return
    }

    public void setBusLineName(java.lang.String r1) {
            r0 = this;
            r0.f5081b = r1
            return
    }

    public void setBusLineType(java.lang.String r1) {
            r0 = this;
            r0.f5082c = r1
            return
    }

    public void setBusStations(java.util.List<com.amap.api.services.busline.BusStationItem> r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setCityCode(java.lang.String r1) {
            r0 = this;
            r0.f5083d = r1
            return
    }

    public void setDirectionsCoordinates(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5084e = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setFirstBusTime(java.util.Date r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r1 = 0
            r0.f5089j = r1
            return
        L6:
            java.lang.Object r1 = r1.clone()
            java.util.Date r1 = (java.util.Date) r1
            r0.f5089j = r1
            return
    }

    public void setLastBusTime(java.util.Date r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r1 = 0
            r0.f5090k = r1
            return
        L6:
            java.lang.Object r1 = r1.clone()
            java.util.Date r1 = (java.util.Date) r1
            r0.f5090k = r1
            return
    }

    public void setOriginatingStation(java.lang.String r1) {
            r0 = this;
            r0.f5087h = r1
            return
    }

    public void setTerminalStation(java.lang.String r1) {
            r0 = this;
            r0.f5088i = r1
            return
    }

    public void setTotalPrice(float r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f5081b
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.util.Date r1 = r2.f5089j
            java.lang.String r1 = com.amap.api.col.s.j4.e(r1)
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.util.Date r1 = r2.f5090k
            java.lang.String r1 = com.amap.api.col.s.j4.e(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.a
            r1.writeFloat(r2)
            java.lang.String r2 = r0.f5081b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5082c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5083d
            r1.writeString(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5084e
            r1.writeList(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5085f
            r1.writeList(r2)
            java.lang.String r2 = r0.f5086g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5087h
            r1.writeString(r2)
            java.lang.String r2 = r0.f5088i
            r1.writeString(r2)
            java.util.Date r2 = r0.f5089j
            java.lang.String r2 = com.amap.api.col.s.j4.e(r2)
            r1.writeString(r2)
            java.util.Date r2 = r0.f5090k
            java.lang.String r2 = com.amap.api.col.s.j4.e(r2)
            r1.writeString(r2)
            java.lang.String r2 = r0.l
            r1.writeString(r2)
            float r2 = r0.m
            r1.writeFloat(r2)
            float r2 = r0.n
            r1.writeFloat(r2)
            java.util.List<com.amap.api.services.busline.BusStationItem> r2 = r0.o
            r1.writeList(r2)
            return
    }
}

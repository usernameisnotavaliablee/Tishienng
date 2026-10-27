package com.amap.api.services.busline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusStationItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.busline.BusStationItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5100b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5101c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5102d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5103e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.busline.BusLineItem> f5104f;


    static {
            com.amap.api.services.busline.BusStationItem$1 r0 = new com.amap.api.services.busline.BusStationItem$1
            r0.<init>()
            com.amap.api.services.busline.BusStationItem.CREATOR = r0
            return
    }

    public BusStationItem() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5104f = r0
            return
    }

    private BusStationItem(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5104f = r0
            java.lang.String r0 = r2.readString()
            r1.f5100b = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5101c = r0
            java.lang.String r0 = r2.readString()
            r1.f5102d = r0
            java.lang.String r0 = r2.readString()
            r1.f5103e = r0
            java.lang.Class<com.amap.api.services.busline.BusLineItem> r0 = com.amap.api.services.busline.BusLineItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r2 = r2.readArrayList(r0)
            r1.f5104f = r2
            return
    }

    /* synthetic */ BusStationItem(android.os.Parcel r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static java.lang.String a(java.util.List<com.amap.api.services.busline.BusLineItem> r3) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            if (r3 == 0) goto L2b
            r1 = 0
        L8:
            int r2 = r3.size()
            if (r1 >= r2) goto L2b
            java.lang.Object r2 = r3.get(r1)
            com.amap.api.services.busline.BusLineItem r2 = (com.amap.api.services.busline.BusLineItem) r2
            java.lang.String r2 = r2.getBusLineName()
            r0.append(r2)
            int r2 = r3.size()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L28
            java.lang.String r2 = "|"
            r0.append(r2)
        L28:
            int r1 = r1 + 1
            goto L8
        L2b:
            java.lang.String r3 = r0.toString()
            return r3
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
            com.amap.api.services.busline.BusStationItem r5 = (com.amap.api.services.busline.BusStationItem) r5
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L27
            return r1
        L1e:
            java.lang.String r5 = r5.a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    public java.lang.String getAdCode() {
            r1 = this;
            java.lang.String r0 = r1.f5103e
            return r0
    }

    public java.util.List<com.amap.api.services.busline.BusLineItem> getBusLineItems() {
            r1 = this;
            java.util.List<com.amap.api.services.busline.BusLineItem> r0 = r1.f5104f
            return r0
    }

    public java.lang.String getBusStationId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getBusStationName() {
            r1 = this;
            java.lang.String r0 = r1.f5100b
            return r0
    }

    public java.lang.String getCityCode() {
            r1 = this;
            java.lang.String r0 = r1.f5102d
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5101c
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 + 31
            return r0
    }

    public void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5103e = r1
            return
    }

    public void setBusLineItems(java.util.List<com.amap.api.services.busline.BusLineItem> r1) {
            r0 = this;
            r0.f5104f = r1
            return
    }

    public void setBusStationId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setBusStationName(java.lang.String r1) {
            r0 = this;
            r0.f5100b = r1
            return
    }

    public void setCityCode(java.lang.String r1) {
            r0 = this;
            r0.f5102d = r1
            return
    }

    public void setLatLonPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5101c = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BusStationName: "
            r0.<init>(r1)
            java.lang.String r1 = r2.f5100b
            r0.append(r1)
            java.lang.String r1 = " LatLonPoint: "
            r0.append(r1)
            com.amap.api.services.core.LatLonPoint r1 = r2.f5101c
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " BusLines: "
            r0.append(r1)
            java.util.List<com.amap.api.services.busline.BusLineItem> r1 = r2.f5104f
            java.lang.String r1 = a(r1)
            r0.append(r1)
            java.lang.String r1 = " CityCode: "
            r0.append(r1)
            java.lang.String r1 = r2.f5102d
            r0.append(r1)
            java.lang.String r1 = " AdCode: "
            r0.append(r1)
            java.lang.String r1 = r2.f5103e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f5100b
            r1.writeString(r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5101c
            r1.writeValue(r2)
            java.lang.String r2 = r0.f5102d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5103e
            r1.writeString(r2)
            java.util.List<com.amap.api.services.busline.BusLineItem> r2 = r0.f5104f
            r1.writeList(r2)
            return
    }
}

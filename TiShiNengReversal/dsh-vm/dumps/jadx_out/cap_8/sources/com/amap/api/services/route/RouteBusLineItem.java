package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteBusLineItem extends com.amap.api.services.busline.BusLineItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteBusLineItem> CREATOR = null;
    private com.amap.api.services.busline.BusStationItem a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.busline.BusStationItem f5447b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5448c;

    /* renamed from: d, reason: collision with root package name */
    private int f5449d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.busline.BusStationItem> f5450e;

    /* renamed from: f, reason: collision with root package name */
    private float f5451f;


    static {
            com.amap.api.services.route.RouteBusLineItem$1 r0 = new com.amap.api.services.route.RouteBusLineItem$1
            r0.<init>()
            com.amap.api.services.route.RouteBusLineItem.CREATOR = r0
            return
    }

    public RouteBusLineItem() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5448c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5450e = r0
            return
    }

    public RouteBusLineItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5448c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5450e = r0
            java.lang.Class<com.amap.api.services.busline.BusStationItem> r0 = com.amap.api.services.busline.BusStationItem.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r1)
            com.amap.api.services.busline.BusStationItem r1 = (com.amap.api.services.busline.BusStationItem) r1
            r2.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.amap.api.services.busline.BusStationItem r0 = (com.amap.api.services.busline.BusStationItem) r0
            r2.f5447b = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.f5448c = r0
            int r0 = r3.readInt()
            r2.f5449d = r0
            android.os.Parcelable$Creator<com.amap.api.services.busline.BusStationItem> r0 = com.amap.api.services.busline.BusStationItem.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.f5450e = r0
            float r3 = r3.readFloat()
            r2.f5451f = r3
            return
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = super.equals(r5)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r1 == r3) goto L17
            return r2
        L17:
            com.amap.api.services.route.RouteBusLineItem r5 = (com.amap.api.services.route.RouteBusLineItem) r5
            com.amap.api.services.busline.BusStationItem r1 = r4.f5447b
            if (r1 != 0) goto L22
            com.amap.api.services.busline.BusStationItem r1 = r5.f5447b
            if (r1 == 0) goto L2b
            return r2
        L22:
            com.amap.api.services.busline.BusStationItem r3 = r5.f5447b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            com.amap.api.services.busline.BusStationItem r1 = r4.a
            if (r1 != 0) goto L34
            com.amap.api.services.busline.BusStationItem r5 = r5.a
            if (r5 == 0) goto L3d
            return r2
        L34:
            com.amap.api.services.busline.BusStationItem r5 = r5.a
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L3d
            return r2
        L3d:
            return r0
    }

    public com.amap.api.services.busline.BusStationItem getArrivalBusStation() {
            r1 = this;
            com.amap.api.services.busline.BusStationItem r0 = r1.f5447b
            return r0
    }

    public com.amap.api.services.busline.BusStationItem getDepartureBusStation() {
            r1 = this;
            com.amap.api.services.busline.BusStationItem r0 = r1.a
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5451f
            return r0
    }

    public int getPassStationNum() {
            r1 = this;
            int r0 = r1.f5449d
            return r0
    }

    public java.util.List<com.amap.api.services.busline.BusStationItem> getPassStations() {
            r1 = this;
            java.util.List<com.amap.api.services.busline.BusStationItem> r0 = r1.f5450e
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5448c
            return r0
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public int hashCode() {
            r3 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            com.amap.api.services.busline.BusStationItem r1 = r3.f5447b
            r2 = 0
            if (r1 != 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            int r1 = r1.hashCode()
        L11:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.amap.api.services.busline.BusStationItem r1 = r3.a
            if (r1 != 0) goto L19
            goto L1d
        L19:
            int r2 = r1.hashCode()
        L1d:
            int r0 = r0 + r2
            return r0
    }

    public void setArrivalBusStation(com.amap.api.services.busline.BusStationItem r1) {
            r0 = this;
            r0.f5447b = r1
            return
    }

    public void setDepartureBusStation(com.amap.api.services.busline.BusStationItem r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5451f = r1
            return
    }

    public void setPassStationNum(int r1) {
            r0 = this;
            r0.f5449d = r1
            return
    }

    public void setPassStations(java.util.List<com.amap.api.services.busline.BusStationItem> r1) {
            r0 = this;
            r0.f5450e = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5448c = r1
            return
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            com.amap.api.services.busline.BusStationItem r0 = r1.a
            r2.writeParcelable(r0, r3)
            com.amap.api.services.busline.BusStationItem r0 = r1.f5447b
            r2.writeParcelable(r0, r3)
            java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r1.f5448c
            r2.writeTypedList(r3)
            int r3 = r1.f5449d
            r2.writeInt(r3)
            java.util.List<com.amap.api.services.busline.BusStationItem> r3 = r1.f5450e
            r2.writeTypedList(r3)
            float r3 = r1.f5451f
            r2.writeFloat(r3)
            return
    }
}

package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TaxiItemV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TaxiItemV2> CREATOR = null;
    private com.amap.api.services.core.LatLonPoint a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5563b;

    /* renamed from: c, reason: collision with root package name */
    private float f5564c;

    /* renamed from: d, reason: collision with root package name */
    private float f5565d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5566e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5567f;

    /* renamed from: g, reason: collision with root package name */
    private float f5568g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5569h;


    static {
            com.amap.api.services.route.TaxiItemV2$1 r0 = new com.amap.api.services.route.TaxiItemV2$1
            r0.<init>()
            com.amap.api.services.route.TaxiItemV2.CREATOR = r0
            return
    }

    public TaxiItemV2() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5569h = r0
            return
    }

    protected TaxiItemV2(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5569h = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r1)
            com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
            r2.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r2.f5563b = r0
            float r0 = r3.readFloat()
            r2.f5564c = r0
            float r0 = r3.readFloat()
            r2.f5565d = r0
            java.lang.String r0 = r3.readString()
            r2.f5566e = r0
            java.lang.String r0 = r3.readString()
            r2.f5567f = r0
            float r0 = r3.readFloat()
            r2.f5568g = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r0)
            r2.f5569h = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getDestination() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5563b
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5564c
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5565d
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getOrigin() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.a
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5569h
            return r0
    }

    public float getPrice() {
            r1 = this;
            float r0 = r1.f5568g
            return r0
    }

    public java.lang.String getmSname() {
            r1 = this;
            java.lang.String r0 = r1.f5566e
            return r0
    }

    public java.lang.String getmTname() {
            r1 = this;
            java.lang.String r0 = r1.f5567f
            return r0
    }

    public void setDestination(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5563b = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5564c = r1
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5565d = r1
            return
    }

    public void setOrigin(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5569h = r1
            return
    }

    public void setPrice(float r1) {
            r0 = this;
            r0.f5568g = r1
            return
    }

    public void setSname(java.lang.String r1) {
            r0 = this;
            r0.f5566e = r1
            return
    }

    public void setTname(java.lang.String r1) {
            r0 = this;
            r0.f5567f = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.a
            r2.writeParcelable(r0, r3)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5563b
            r2.writeParcelable(r0, r3)
            float r3 = r1.f5564c
            r2.writeFloat(r3)
            float r3 = r1.f5565d
            r2.writeFloat(r3)
            java.lang.String r3 = r1.f5566e
            r2.writeString(r3)
            java.lang.String r3 = r1.f5567f
            r2.writeString(r3)
            float r3 = r1.f5568g
            r2.writeFloat(r3)
            java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r1.f5569h
            r2.writeTypedList(r3)
            return
    }
}

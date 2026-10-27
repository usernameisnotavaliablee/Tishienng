package com.amap.api.services.road;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Road implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.road.Road> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5328b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5329c;

    /* renamed from: d, reason: collision with root package name */
    private float f5330d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5331e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5332f;


    static {
            com.amap.api.services.road.Road$1 r0 = new com.amap.api.services.road.Road$1
            r0.<init>()
            com.amap.api.services.road.Road.CREATOR = r0
            return
    }

    public Road() {
            r0 = this;
            r0.<init>()
            return
    }

    protected Road(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5328b = r0
            java.lang.String r0 = r2.readString()
            r1.f5329c = r0
            float r0 = r2.readFloat()
            r1.f5330d = r0
            java.lang.String r0 = r2.readString()
            r1.f5331e = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r2 = r2.readValue(r0)
            com.amap.api.services.core.LatLonPoint r2 = (com.amap.api.services.core.LatLonPoint) r2
            r1.f5332f = r2
            return
    }

    public Road(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5328b = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getCenterPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5332f
            return r0
    }

    public java.lang.String getCityCode() {
            r1 = this;
            java.lang.String r0 = r1.f5329c
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f5328b
            return r0
    }

    public float getRoadWidth() {
            r1 = this;
            float r0 = r1.f5330d
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f5331e
            return r0
    }

    public void setCenterPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5332f = r1
            return
    }

    public void setCityCode(java.lang.String r1) {
            r0 = this;
            r0.f5329c = r1
            return
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.f5328b = r1
            return
    }

    public void setRoadWidth(float r1) {
            r0 = this;
            r0.f5330d = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.f5331e = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5328b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5329c
            r1.writeString(r2)
            float r2 = r0.f5330d
            r1.writeFloat(r2)
            java.lang.String r2 = r0.f5331e
            r1.writeString(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5332f
            r1.writeValue(r2)
            return
    }
}

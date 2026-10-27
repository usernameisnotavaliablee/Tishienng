package com.amap.api.services.routepoisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RoutePOIItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.routepoisearch.RoutePOIItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5605b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5606c;

    /* renamed from: d, reason: collision with root package name */
    private float f5607d;

    /* renamed from: e, reason: collision with root package name */
    private float f5608e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5609f;


    static {
            com.amap.api.services.routepoisearch.RoutePOIItem$1 r0 = new com.amap.api.services.routepoisearch.RoutePOIItem$1
            r0.<init>()
            com.amap.api.services.routepoisearch.RoutePOIItem.CREATOR = r0
            return
    }

    public RoutePOIItem() {
            r0 = this;
            r0.<init>()
            return
    }

    protected RoutePOIItem(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5605b = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5606c = r0
            float r0 = r2.readFloat()
            r1.f5607d = r0
            float r0 = r2.readFloat()
            r1.f5608e = r0
            java.lang.String r2 = r2.readString()
            r1.f5609f = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getCPID() {
            r1 = this;
            java.lang.String r0 = r1.f5609f
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5607d
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5608e
            return r0
    }

    public java.lang.String getID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5606c
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.f5605b
            return r0
    }

    public void setCPID(java.lang.String r1) {
            r0 = this;
            r0.f5609f = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5607d = r1
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5608e = r1
            return
    }

    public void setID(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5606c = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.f5605b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.a
            r2.writeString(r0)
            java.lang.String r0 = r1.f5605b
            r2.writeString(r0)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5606c
            r2.writeParcelable(r0, r3)
            float r3 = r1.f5607d
            r2.writeFloat(r3)
            float r3 = r1.f5608e
            r2.writeFloat(r3)
            java.lang.String r3 = r1.f5609f
            r2.writeString(r3)
            return
    }
}

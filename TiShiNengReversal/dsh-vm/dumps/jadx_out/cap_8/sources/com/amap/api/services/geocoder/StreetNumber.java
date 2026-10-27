package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class StreetNumber implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.geocoder.StreetNumber> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5224b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5225c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5226d;

    /* renamed from: e, reason: collision with root package name */
    private float f5227e;


    static {
            com.amap.api.services.geocoder.StreetNumber$1 r0 = new com.amap.api.services.geocoder.StreetNumber$1
            r0.<init>()
            com.amap.api.services.geocoder.StreetNumber.CREATOR = r0
            return
    }

    public StreetNumber() {
            r0 = this;
            r0.<init>()
            return
    }

    private StreetNumber(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5224b = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5225c = r0
            java.lang.String r0 = r2.readString()
            r1.f5226d = r0
            float r2 = r2.readFloat()
            r1.f5227e = r2
            return
    }

    /* synthetic */ StreetNumber(android.os.Parcel r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String getDirection() {
            r1 = this;
            java.lang.String r0 = r1.f5226d
            return r0
    }

    public final float getDistance() {
            r1 = this;
            float r0 = r1.f5227e
            return r0
    }

    public final com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5225c
            return r0
    }

    public final java.lang.String getNumber() {
            r1 = this;
            java.lang.String r0 = r1.f5224b
            return r0
    }

    public final java.lang.String getStreet() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final void setDirection(java.lang.String r1) {
            r0 = this;
            r0.f5226d = r1
            return
    }

    public final void setDistance(float r1) {
            r0 = this;
            r0.f5227e = r1
            return
    }

    public final void setLatLonPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5225c = r1
            return
    }

    public final void setNumber(java.lang.String r1) {
            r0 = this;
            r0.f5224b = r1
            return
    }

    public final void setStreet(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5224b
            r1.writeString(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5225c
            r1.writeValue(r2)
            java.lang.String r2 = r0.f5226d
            r1.writeString(r2)
            float r2 = r0.f5227e
            r1.writeFloat(r2)
            return
    }
}

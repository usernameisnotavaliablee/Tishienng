package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Doorway implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.Doorway> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5381b;


    static {
            com.amap.api.services.route.Doorway$1 r0 = new com.amap.api.services.route.Doorway$1
            r0.<init>()
            com.amap.api.services.route.Doorway.CREATOR = r0
            return
    }

    public Doorway() {
            r0 = this;
            r0.<init>()
            return
    }

    public Doorway(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r2.readParcelable(r0)
            com.amap.api.services.core.LatLonPoint r2 = (com.amap.api.services.core.LatLonPoint) r2
            r1.f5381b = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5381b
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setLatLonPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5381b = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.a
            r2.writeString(r0)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5381b
            r2.writeParcelable(r0, r3)
            return
    }
}

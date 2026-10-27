package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiNavi implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.PoiNavi> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5267b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5268c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5269d;


    static {
            com.amap.api.services.poisearch.PoiNavi$1 r0 = new com.amap.api.services.poisearch.PoiNavi$1
            r0.<init>()
            com.amap.api.services.poisearch.PoiNavi.CREATOR = r0
            return
    }

    public PoiNavi() {
            r0 = this;
            r0.<init>()
            return
    }

    public PoiNavi(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            r2.a = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r3.readValue(r1)
            com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
            r2.f5267b = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r2.f5268c = r0
            java.lang.String r3 = r3.readString()
            r2.f5269d = r3
            return
    }

    public PoiNavi(java.lang.String r1, com.amap.api.services.core.LatLonPoint r2, com.amap.api.services.core.LatLonPoint r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5267b = r2
            r0.f5268c = r3
            r0.f5269d = r4
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getEnter() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5267b
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getExit() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5268c
            return r0
    }

    public java.lang.String getGridCode() {
            r1 = this;
            java.lang.String r0 = r1.f5269d
            return r0
    }

    public java.lang.String getNaviPoiID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setEnter(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5267b = r1
            return
    }

    public void setExit(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5268c = r1
            return
    }

    public void setGridCode(java.lang.String r1) {
            r0 = this;
            r0.f5269d = r1
            return
    }

    public void setNaviPoiID(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5267b
            r1.writeValue(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5268c
            r1.writeValue(r2)
            java.lang.String r2 = r0.f5269d
            r1.writeString(r2)
            return
    }
}

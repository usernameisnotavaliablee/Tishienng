package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AoiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.geocoder.AoiItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5186b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5187c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5188d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.Float f5189e;


    static {
            com.amap.api.services.geocoder.AoiItem$1 r0 = new com.amap.api.services.geocoder.AoiItem$1
            r0.<init>()
            com.amap.api.services.geocoder.AoiItem.CREATOR = r0
            return
    }

    public AoiItem() {
            r0 = this;
            r0.<init>()
            return
    }

    public AoiItem(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5186b = r0
            java.lang.String r0 = r2.readString()
            r1.f5187c = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5188d = r0
            float r2 = r2.readFloat()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.f5189e = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAdCode() {
            r1 = this;
            java.lang.String r0 = r1.f5187c
            return r0
    }

    public java.lang.Float getAoiArea() {
            r1 = this;
            java.lang.Float r0 = r1.f5189e
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getAoiCenterPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5188d
            return r0
    }

    public java.lang.String getAoiId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getAoiName() {
            r1 = this;
            java.lang.String r0 = r1.f5186b
            return r0
    }

    public void setAdcode(java.lang.String r1) {
            r0 = this;
            r0.f5187c = r1
            return
    }

    public void setArea(java.lang.Float r1) {
            r0 = this;
            r0.f5189e = r1
            return
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setLocation(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5188d = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.f5186b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.a
            r2.writeString(r0)
            java.lang.String r0 = r1.f5186b
            r2.writeString(r0)
            java.lang.String r0 = r1.f5187c
            r2.writeString(r0)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5188d
            r2.writeParcelable(r0, r3)
            java.lang.Float r3 = r1.f5189e
            float r3 = r3.floatValue()
            r2.writeFloat(r3)
            return
    }
}

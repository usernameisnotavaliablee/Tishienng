package com.amap.api.services.help;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Tip implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.help.Tip> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5232b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5233c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5234d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5235e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5236f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5237g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5238h;


    static {
            com.amap.api.services.help.Tip$1 r0 = new com.amap.api.services.help.Tip$1
            r0.<init>()
            com.amap.api.services.help.Tip.CREATOR = r0
            return
    }

    public Tip() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f5238h = r0
            return
    }

    private Tip(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f5238h = r0
            java.lang.String r0 = r2.readString()
            r1.f5233c = r0
            java.lang.String r0 = r2.readString()
            r1.f5235e = r0
            java.lang.String r0 = r2.readString()
            r1.f5234d = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5232b = r0
            java.lang.String r0 = r2.readString()
            r1.f5236f = r0
            java.lang.String r0 = r2.readString()
            r1.f5237g = r0
            java.lang.String r2 = r2.readString()
            r1.f5238h = r2
            return
    }

    /* synthetic */ Tip(android.os.Parcel r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAdcode() {
            r1 = this;
            java.lang.String r0 = r1.f5235e
            return r0
    }

    public java.lang.String getAddress() {
            r1 = this;
            java.lang.String r0 = r1.f5236f
            return r0
    }

    public java.lang.String getDistrict() {
            r1 = this;
            java.lang.String r0 = r1.f5234d
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f5233c
            return r0
    }

    public java.lang.String getPoiID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5232b
            return r0
    }

    public java.lang.String getTypeCode() {
            r1 = this;
            java.lang.String r0 = r1.f5237g
            return r0
    }

    public void setAdcode(java.lang.String r1) {
            r0 = this;
            r0.f5235e = r1
            return
    }

    public void setAddress(java.lang.String r1) {
            r0 = this;
            r0.f5236f = r1
            return
    }

    public void setDistrict(java.lang.String r1) {
            r0 = this;
            r0.f5234d = r1
            return
    }

    public void setID(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.f5233c = r1
            return
    }

    public void setPostion(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5232b = r1
            return
    }

    public void setTypeCode(java.lang.String r1) {
            r0 = this;
            r0.f5237g = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name:"
            r0.<init>(r1)
            java.lang.String r1 = r2.f5233c
            r0.append(r1)
            java.lang.String r1 = " district:"
            r0.append(r1)
            java.lang.String r1 = r2.f5234d
            r0.append(r1)
            java.lang.String r1 = " adcode:"
            r0.append(r1)
            java.lang.String r1 = r2.f5235e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f5233c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5235e
            r1.writeString(r2)
            java.lang.String r2 = r0.f5234d
            r1.writeString(r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5232b
            r1.writeValue(r2)
            java.lang.String r2 = r0.f5236f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5237g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5238h
            r1.writeString(r2)
            return
    }
}

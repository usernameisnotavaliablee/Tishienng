package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SubPoiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.SubPoiItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5312b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5313c;

    /* renamed from: d, reason: collision with root package name */
    private int f5314d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5315e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5316f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5317g;


    static {
            com.amap.api.services.poisearch.SubPoiItem$1 r0 = new com.amap.api.services.poisearch.SubPoiItem$1
            r0.<init>()
            com.amap.api.services.poisearch.SubPoiItem.CREATOR = r0
            return
    }

    public SubPoiItem(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5312b = r0
            java.lang.String r0 = r2.readString()
            r1.f5313c = r0
            int r0 = r2.readInt()
            r1.f5314d = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5315e = r0
            java.lang.String r0 = r2.readString()
            r1.f5316f = r0
            java.lang.String r2 = r2.readString()
            r1.f5317g = r2
            return
    }

    public SubPoiItem(java.lang.String r1, com.amap.api.services.core.LatLonPoint r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5315e = r2
            r0.f5312b = r3
            r0.f5316f = r4
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getDistance() {
            r1 = this;
            int r0 = r1.f5314d
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5315e
            return r0
    }

    public java.lang.String getPoiId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getSnippet() {
            r1 = this;
            java.lang.String r0 = r1.f5316f
            return r0
    }

    public java.lang.String getSubName() {
            r1 = this;
            java.lang.String r0 = r1.f5313c
            return r0
    }

    public java.lang.String getSubTypeDes() {
            r1 = this;
            java.lang.String r0 = r1.f5317g
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.f5312b
            return r0
    }

    public void setDistance(int r1) {
            r0 = this;
            r0.f5314d = r1
            return
    }

    public void setLatLonPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5315e = r1
            return
    }

    public void setPoiId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setSnippet(java.lang.String r1) {
            r0 = this;
            r0.f5316f = r1
            return
    }

    public void setSubName(java.lang.String r1) {
            r0 = this;
            r0.f5313c = r1
            return
    }

    public void setSubTypeDes(java.lang.String r1) {
            r0 = this;
            r0.f5317g = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.f5312b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5312b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5313c
            r1.writeString(r2)
            int r2 = r0.f5314d
            r1.writeInt(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5315e
            r1.writeValue(r2)
            java.lang.String r2 = r0.f5316f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5317g
            r1.writeString(r2)
            return
    }
}

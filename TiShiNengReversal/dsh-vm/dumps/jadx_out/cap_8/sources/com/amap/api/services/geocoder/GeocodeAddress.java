package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class GeocodeAddress implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.geocoder.GeocodeAddress> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5191b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5192c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5193d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5194e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5195f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5196g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5197h;

    /* renamed from: i, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5198i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5199j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f5200k;
    private java.lang.String l;


    static {
            com.amap.api.services.geocoder.GeocodeAddress$1 r0 = new com.amap.api.services.geocoder.GeocodeAddress$1
            r0.<init>()
            com.amap.api.services.geocoder.GeocodeAddress.CREATOR = r0
            return
    }

    public GeocodeAddress() {
            r0 = this;
            r0.<init>()
            return
    }

    private GeocodeAddress(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5191b = r0
            java.lang.String r0 = r2.readString()
            r1.f5192c = r0
            java.lang.String r0 = r2.readString()
            r1.f5193d = r0
            java.lang.String r0 = r2.readString()
            r1.f5194e = r0
            java.lang.String r0 = r2.readString()
            r1.f5195f = r0
            java.lang.String r0 = r2.readString()
            r1.f5196g = r0
            java.lang.String r0 = r2.readString()
            r1.f5197h = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5198i = r0
            java.lang.String r0 = r2.readString()
            r1.f5199j = r0
            java.lang.String r0 = r2.readString()
            r1.f5200k = r0
            java.lang.String r2 = r2.readString()
            r1.l = r2
            return
    }

    /* synthetic */ GeocodeAddress(android.os.Parcel r1, byte r2) {
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

    public final java.lang.String getAdcode() {
            r1 = this;
            java.lang.String r0 = r1.f5197h
            return r0
    }

    public final java.lang.String getBuilding() {
            r1 = this;
            java.lang.String r0 = r1.f5196g
            return r0
    }

    public final java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5192c
            return r0
    }

    public final java.lang.String getCountry() {
            r1 = this;
            java.lang.String r0 = r1.f5200k
            return r0
    }

    public final java.lang.String getDistrict() {
            r1 = this;
            java.lang.String r0 = r1.f5193d
            return r0
    }

    public final java.lang.String getFormatAddress() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5198i
            return r0
    }

    public final java.lang.String getLevel() {
            r1 = this;
            java.lang.String r0 = r1.f5199j
            return r0
    }

    public final java.lang.String getNeighborhood() {
            r1 = this;
            java.lang.String r0 = r1.f5195f
            return r0
    }

    public final java.lang.String getPostcode() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public final java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.f5191b
            return r0
    }

    public final java.lang.String getTownship() {
            r1 = this;
            java.lang.String r0 = r1.f5194e
            return r0
    }

    public final void setAdcode(java.lang.String r1) {
            r0 = this;
            r0.f5197h = r1
            return
    }

    public final void setBuilding(java.lang.String r1) {
            r0 = this;
            r0.f5196g = r1
            return
    }

    public final void setCity(java.lang.String r1) {
            r0 = this;
            r0.f5192c = r1
            return
    }

    public final void setCountry(java.lang.String r1) {
            r0 = this;
            r0.f5200k = r1
            return
    }

    public final void setDistrict(java.lang.String r1) {
            r0 = this;
            r0.f5193d = r1
            return
    }

    public final void setFormatAddress(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void setLatLonPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5198i = r1
            return
    }

    public final void setLevel(java.lang.String r1) {
            r0 = this;
            r0.f5199j = r1
            return
    }

    public final void setNeighborhood(java.lang.String r1) {
            r0 = this;
            r0.f5195f = r1
            return
    }

    public final void setPostcode(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public final void setProvince(java.lang.String r1) {
            r0 = this;
            r0.f5191b = r1
            return
    }

    public final void setTownship(java.lang.String r1) {
            r0 = this;
            r0.f5194e = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5191b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5192c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5193d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5194e
            r1.writeString(r2)
            java.lang.String r2 = r0.f5195f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5196g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5197h
            r1.writeString(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5198i
            r1.writeValue(r2)
            java.lang.String r2 = r0.f5199j
            r1.writeString(r2)
            java.lang.String r2 = r0.f5200k
            r1.writeString(r2)
            java.lang.String r2 = r0.l
            r1.writeString(r2)
            return
    }
}

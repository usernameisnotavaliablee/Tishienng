package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class RegeocodeAddress implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.geocoder.RegeocodeAddress> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5204b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5205c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5206d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5207e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5208f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5209g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.services.geocoder.StreetNumber f5210h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f5211i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5212j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f5213k;
    private java.util.List<com.amap.api.services.geocoder.RegeocodeRoad> l;
    private java.util.List<com.amap.api.services.road.Crossroad> m;
    private java.util.List<com.amap.api.services.core.PoiItem> n;
    private java.util.List<com.amap.api.services.geocoder.BusinessArea> o;
    private java.util.List<com.amap.api.services.geocoder.AoiItem> p;
    private java.lang.String q;
    private java.lang.String r;


    static {
            com.amap.api.services.geocoder.RegeocodeAddress$1 r0 = new com.amap.api.services.geocoder.RegeocodeAddress$1
            r0.<init>()
            com.amap.api.services.geocoder.RegeocodeAddress.CREATOR = r0
            return
    }

    public RegeocodeAddress() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.p = r0
            return
    }

    private RegeocodeAddress(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.p = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5204b = r0
            java.lang.String r0 = r2.readString()
            r1.f5205c = r0
            java.lang.String r0 = r2.readString()
            r1.f5206d = r0
            java.lang.String r0 = r2.readString()
            r1.f5207e = r0
            java.lang.String r0 = r2.readString()
            r1.f5208f = r0
            java.lang.String r0 = r2.readString()
            r1.f5209g = r0
            java.lang.Class<com.amap.api.services.geocoder.StreetNumber> r0 = com.amap.api.services.geocoder.StreetNumber.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.geocoder.StreetNumber r0 = (com.amap.api.services.geocoder.StreetNumber) r0
            r1.f5210h = r0
            java.lang.Class<com.amap.api.services.road.Road> r0 = com.amap.api.services.road.Road.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r2.readArrayList(r0)
            r1.l = r0
            java.lang.Class<com.amap.api.services.road.Crossroad> r0 = com.amap.api.services.road.Crossroad.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r2.readArrayList(r0)
            r1.m = r0
            java.lang.Class<com.amap.api.services.core.PoiItem> r0 = com.amap.api.services.core.PoiItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r2.readArrayList(r0)
            r1.n = r0
            java.lang.String r0 = r2.readString()
            r1.f5211i = r0
            java.lang.String r0 = r2.readString()
            r1.f5212j = r0
            java.lang.Class<com.amap.api.services.geocoder.BusinessArea> r0 = com.amap.api.services.geocoder.BusinessArea.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r2.readArrayList(r0)
            r1.o = r0
            java.lang.Class<com.amap.api.services.geocoder.AoiItem> r0 = com.amap.api.services.geocoder.AoiItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r2.readArrayList(r0)
            r1.p = r0
            java.lang.String r0 = r2.readString()
            r1.f5213k = r0
            java.lang.String r0 = r2.readString()
            r1.q = r0
            java.lang.String r2 = r2.readString()
            r1.r = r2
            return
    }

    /* synthetic */ RegeocodeAddress(android.os.Parcel r1, byte r2) {
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

    public final java.lang.String getAdCode() {
            r1 = this;
            java.lang.String r0 = r1.f5212j
            return r0
    }

    public final java.util.List<com.amap.api.services.geocoder.AoiItem> getAois() {
            r1 = this;
            java.util.List<com.amap.api.services.geocoder.AoiItem> r0 = r1.p
            return r0
    }

    public final java.lang.String getBuilding() {
            r1 = this;
            java.lang.String r0 = r1.f5209g
            return r0
    }

    public final java.util.List<com.amap.api.services.geocoder.BusinessArea> getBusinessAreas() {
            r1 = this;
            java.util.List<com.amap.api.services.geocoder.BusinessArea> r0 = r1.o
            return r0
    }

    public final java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5205c
            return r0
    }

    public final java.lang.String getCityCode() {
            r1 = this;
            java.lang.String r0 = r1.f5211i
            return r0
    }

    public final java.lang.String getCountry() {
            r1 = this;
            java.lang.String r0 = r1.q
            return r0
    }

    public final java.lang.String getCountryCode() {
            r1 = this;
            java.lang.String r0 = r1.r
            return r0
    }

    public final java.util.List<com.amap.api.services.road.Crossroad> getCrossroads() {
            r1 = this;
            java.util.List<com.amap.api.services.road.Crossroad> r0 = r1.m
            return r0
    }

    public final java.lang.String getDistrict() {
            r1 = this;
            java.lang.String r0 = r1.f5206d
            return r0
    }

    public final java.lang.String getFormatAddress() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final java.lang.String getNeighborhood() {
            r1 = this;
            java.lang.String r0 = r1.f5208f
            return r0
    }

    public final java.util.List<com.amap.api.services.core.PoiItem> getPois() {
            r1 = this;
            java.util.List<com.amap.api.services.core.PoiItem> r0 = r1.n
            return r0
    }

    public final java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.f5204b
            return r0
    }

    public final java.util.List<com.amap.api.services.geocoder.RegeocodeRoad> getRoads() {
            r1 = this;
            java.util.List<com.amap.api.services.geocoder.RegeocodeRoad> r0 = r1.l
            return r0
    }

    public final com.amap.api.services.geocoder.StreetNumber getStreetNumber() {
            r1 = this;
            com.amap.api.services.geocoder.StreetNumber r0 = r1.f5210h
            return r0
    }

    public final java.lang.String getTowncode() {
            r1 = this;
            java.lang.String r0 = r1.f5213k
            return r0
    }

    public final java.lang.String getTownship() {
            r1 = this;
            java.lang.String r0 = r1.f5207e
            return r0
    }

    public final void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5212j = r1
            return
    }

    public final void setAois(java.util.List<com.amap.api.services.geocoder.AoiItem> r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public final void setBuilding(java.lang.String r1) {
            r0 = this;
            r0.f5209g = r1
            return
    }

    public final void setBusinessAreas(java.util.List<com.amap.api.services.geocoder.BusinessArea> r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public final void setCity(java.lang.String r1) {
            r0 = this;
            r0.f5205c = r1
            return
    }

    public final void setCityCode(java.lang.String r1) {
            r0 = this;
            r0.f5211i = r1
            return
    }

    public final void setCountry(java.lang.String r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public final void setCountryCode(java.lang.String r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public final void setCrossroads(java.util.List<com.amap.api.services.road.Crossroad> r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public final void setDistrict(java.lang.String r1) {
            r0 = this;
            r0.f5206d = r1
            return
    }

    public final void setFormatAddress(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void setNeighborhood(java.lang.String r1) {
            r0 = this;
            r0.f5208f = r1
            return
    }

    public final void setPois(java.util.List<com.amap.api.services.core.PoiItem> r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public final void setProvince(java.lang.String r1) {
            r0 = this;
            r0.f5204b = r1
            return
    }

    public final void setRoads(java.util.List<com.amap.api.services.geocoder.RegeocodeRoad> r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public final void setStreetNumber(com.amap.api.services.geocoder.StreetNumber r1) {
            r0 = this;
            r0.f5210h = r1
            return
    }

    public final void setTowncode(java.lang.String r1) {
            r0 = this;
            r0.f5213k = r1
            return
    }

    public final void setTownship(java.lang.String r1) {
            r0 = this;
            r0.f5207e = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5204b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5205c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5206d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5207e
            r1.writeString(r2)
            java.lang.String r2 = r0.f5208f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5209g
            r1.writeString(r2)
            com.amap.api.services.geocoder.StreetNumber r2 = r0.f5210h
            r1.writeValue(r2)
            java.util.List<com.amap.api.services.geocoder.RegeocodeRoad> r2 = r0.l
            r1.writeList(r2)
            java.util.List<com.amap.api.services.road.Crossroad> r2 = r0.m
            r1.writeList(r2)
            java.util.List<com.amap.api.services.core.PoiItem> r2 = r0.n
            r1.writeList(r2)
            java.lang.String r2 = r0.f5211i
            r1.writeString(r2)
            java.lang.String r2 = r0.f5212j
            r1.writeString(r2)
            java.util.List<com.amap.api.services.geocoder.BusinessArea> r2 = r0.o
            r1.writeList(r2)
            java.util.List<com.amap.api.services.geocoder.AoiItem> r2 = r0.p
            r1.writeList(r2)
            java.lang.String r2 = r0.f5213k
            r1.writeString(r2)
            java.lang.String r2 = r0.q
            r1.writeString(r2)
            java.lang.String r2 = r0.r
            r1.writeString(r2)
            return
    }
}

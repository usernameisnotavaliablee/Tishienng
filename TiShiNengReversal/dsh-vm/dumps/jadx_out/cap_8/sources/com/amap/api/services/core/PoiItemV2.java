package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiItemV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.PoiItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5153b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5154c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5155d;

    /* renamed from: e, reason: collision with root package name */
    private final com.amap.api.services.core.LatLonPoint f5156e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f5157f;

    /* renamed from: g, reason: collision with root package name */
    private final java.lang.String f5158g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5159h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f5160i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5161j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f5162k;
    private java.lang.String l;
    private java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> m;
    private com.amap.api.services.poisearch.Business n;
    private com.amap.api.services.poisearch.IndoorDataV2 o;
    private com.amap.api.services.poisearch.PoiNavi p;
    private java.util.List<com.amap.api.services.poisearch.Photo> q;


    static {
            com.amap.api.services.core.PoiItemV2$1 r0 = new com.amap.api.services.core.PoiItemV2$1
            r0.<init>()
            com.amap.api.services.core.PoiItemV2.CREATOR = r0
            return
    }

    protected PoiItemV2(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f5155d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.q = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5153b = r0
            java.lang.String r0 = r2.readString()
            r1.f5155d = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5156e = r0
            java.lang.String r0 = r2.readString()
            r1.f5157f = r0
            java.lang.String r0 = r2.readString()
            r1.f5158g = r0
            java.lang.String r0 = r2.readString()
            r1.f5154c = r0
            java.lang.String r0 = r2.readString()
            r1.f5160i = r0
            java.lang.String r0 = r2.readString()
            r1.f5161j = r0
            java.lang.String r0 = r2.readString()
            r1.f5162k = r0
            java.lang.String r0 = r2.readString()
            r1.l = r0
            java.lang.String r0 = r2.readString()
            r1.f5159h = r0
            java.lang.Class<com.amap.api.services.poisearch.SubPoiItemV2> r0 = com.amap.api.services.poisearch.SubPoiItemV2.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r2.readArrayList(r0)
            r1.m = r0
            java.lang.Class<com.amap.api.services.poisearch.Business> r0 = com.amap.api.services.poisearch.Business.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.poisearch.Business r0 = (com.amap.api.services.poisearch.Business) r0
            r1.n = r0
            java.lang.Class<com.amap.api.services.poisearch.IndoorDataV2> r0 = com.amap.api.services.poisearch.IndoorDataV2.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.poisearch.IndoorDataV2 r0 = (com.amap.api.services.poisearch.IndoorDataV2) r0
            r1.o = r0
            java.lang.Class<com.amap.api.services.poisearch.PoiNavi> r0 = com.amap.api.services.poisearch.PoiNavi.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r2.readValue(r0)
            com.amap.api.services.poisearch.PoiNavi r0 = (com.amap.api.services.poisearch.PoiNavi) r0
            r1.p = r0
            android.os.Parcelable$Creator<com.amap.api.services.poisearch.Photo> r0 = com.amap.api.services.poisearch.Photo.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.q = r2
            return
    }

    public PoiItemV2(java.lang.String r2, com.amap.api.services.core.LatLonPoint r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f5155d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.q = r0
            r1.a = r2
            r1.f5156e = r3
            r1.f5157f = r4
            r1.f5158g = r5
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.amap.api.services.core.PoiItemV2 r5 = (com.amap.api.services.core.PoiItemV2) r5
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L27
            return r1
        L1e:
            java.lang.String r5 = r5.a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    public java.lang.String getAdCode() {
            r1 = this;
            java.lang.String r0 = r1.f5153b
            return r0
    }

    public java.lang.String getAdName() {
            r1 = this;
            java.lang.String r0 = r1.f5162k
            return r0
    }

    public com.amap.api.services.poisearch.Business getBusiness() {
            r1 = this;
            com.amap.api.services.poisearch.Business r0 = r1.n
            return r0
    }

    public java.lang.String getCityCode() {
            r1 = this;
            java.lang.String r0 = r1.f5154c
            return r0
    }

    public java.lang.String getCityName() {
            r1 = this;
            java.lang.String r0 = r1.f5161j
            return r0
    }

    public com.amap.api.services.poisearch.IndoorDataV2 getIndoorData() {
            r1 = this;
            com.amap.api.services.poisearch.IndoorDataV2 r0 = r1.o
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5156e
            return r0
    }

    public java.util.List<com.amap.api.services.poisearch.Photo> getPhotos() {
            r1 = this;
            java.util.List<com.amap.api.services.poisearch.Photo> r0 = r1.q
            return r0
    }

    public java.lang.String getPoiId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.amap.api.services.poisearch.PoiNavi getPoiNavi() {
            r1 = this;
            com.amap.api.services.poisearch.PoiNavi r0 = r1.p
            return r0
    }

    public java.lang.String getProvinceCode() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public java.lang.String getProvinceName() {
            r1 = this;
            java.lang.String r0 = r1.f5160i
            return r0
    }

    public java.lang.String getSnippet() {
            r1 = this;
            java.lang.String r0 = r1.f5158g
            return r0
    }

    public java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> getSubPois() {
            r1 = this;
            java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> r0 = r1.m
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.f5157f
            return r0
    }

    public java.lang.String getTypeCode() {
            r1 = this;
            java.lang.String r0 = r1.f5159h
            return r0
    }

    public java.lang.String getTypeDes() {
            r1 = this;
            java.lang.String r0 = r1.f5155d
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 + 31
            return r0
    }

    public void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5153b = r1
            return
    }

    public void setAdName(java.lang.String r1) {
            r0 = this;
            r0.f5162k = r1
            return
    }

    public void setBusiness(com.amap.api.services.poisearch.Business r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setCityCode(java.lang.String r1) {
            r0 = this;
            r0.f5154c = r1
            return
    }

    public void setCityName(java.lang.String r1) {
            r0 = this;
            r0.f5161j = r1
            return
    }

    public void setIndoorData(com.amap.api.services.poisearch.IndoorDataV2 r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setPhotos(java.util.List<com.amap.api.services.poisearch.Photo> r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void setPoiNavi(com.amap.api.services.poisearch.PoiNavi r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setProvinceCode(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setProvinceName(java.lang.String r1) {
            r0 = this;
            r0.f5160i = r1
            return
    }

    public void setSubPois(java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setTypeCode(java.lang.String r1) {
            r0 = this;
            r0.f5159h = r1
            return
    }

    public void setTypeDes(java.lang.String r1) {
            r0 = this;
            r0.f5155d = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f5157f
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5153b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5155d
            r1.writeString(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.f5156e
            r1.writeValue(r2)
            java.lang.String r2 = r0.f5157f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5158g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5154c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5160i
            r1.writeString(r2)
            java.lang.String r2 = r0.f5161j
            r1.writeString(r2)
            java.lang.String r2 = r0.f5162k
            r1.writeString(r2)
            java.lang.String r2 = r0.l
            r1.writeString(r2)
            java.lang.String r2 = r0.f5159h
            r1.writeString(r2)
            java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> r2 = r0.m
            r1.writeList(r2)
            com.amap.api.services.poisearch.Business r2 = r0.n
            r1.writeValue(r2)
            com.amap.api.services.poisearch.IndoorDataV2 r2 = r0.o
            r1.writeValue(r2)
            com.amap.api.services.poisearch.PoiNavi r2 = r0.p
            r1.writeValue(r2)
            java.util.List<com.amap.api.services.poisearch.Photo> r2 = r0.q
            r1.writeTypedList(r2)
            return
    }
}

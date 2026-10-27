package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.PoiItem> CREATOR = null;
    private java.lang.String A;
    private java.lang.String B;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5143b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5144c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5145d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5146e;

    /* renamed from: f, reason: collision with root package name */
    private int f5147f;

    /* renamed from: g, reason: collision with root package name */
    private final com.amap.api.services.core.LatLonPoint f5148g;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.String f5149h;

    /* renamed from: i, reason: collision with root package name */
    private final java.lang.String f5150i;

    /* renamed from: j, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5151j;

    /* renamed from: k, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5152k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.String n;
    private java.lang.String o;
    private java.lang.String p;
    private java.lang.String q;
    private java.lang.String r;
    private boolean s;
    private com.amap.api.services.poisearch.IndoorData t;
    private java.lang.String u;
    private java.lang.String v;
    private java.lang.String w;
    private java.util.List<com.amap.api.services.poisearch.SubPoiItem> x;
    private java.util.List<com.amap.api.services.poisearch.Photo> y;
    private com.amap.api.services.poisearch.PoiItemExtension z;


    static {
            com.amap.api.services.core.PoiItem$1 r0 = new com.amap.api.services.core.PoiItem$1
            r0.<init>()
            com.amap.api.services.core.PoiItem.CREATOR = r0
            return
    }

    protected PoiItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.f5146e = r0
            r0 = -1
            r2.f5147f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.x = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.y = r0
            java.lang.String r0 = r3.readString()
            r2.a = r0
            java.lang.String r0 = r3.readString()
            r2.f5144c = r0
            java.lang.String r0 = r3.readString()
            r2.f5143b = r0
            java.lang.String r0 = r3.readString()
            r2.f5146e = r0
            int r0 = r3.readInt()
            r2.f5147f = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r3.readValue(r1)
            com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
            r2.f5148g = r1
            java.lang.String r1 = r3.readString()
            r2.f5149h = r1
            java.lang.String r1 = r3.readString()
            r2.f5150i = r1
            java.lang.String r1 = r3.readString()
            r2.f5145d = r1
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r3.readValue(r1)
            com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
            r2.f5151j = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r2.f5152k = r0
            java.lang.String r0 = r3.readString()
            r2.l = r0
            java.lang.String r0 = r3.readString()
            r2.m = r0
            java.lang.String r0 = r3.readString()
            r2.n = r0
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r3.readBooleanArray(r0)
            r1 = 0
            boolean r0 = r0[r1]
            r2.s = r0
            java.lang.String r0 = r3.readString()
            r2.o = r0
            java.lang.String r0 = r3.readString()
            r2.p = r0
            java.lang.String r0 = r3.readString()
            r2.q = r0
            java.lang.String r0 = r3.readString()
            r2.r = r0
            java.lang.String r0 = r3.readString()
            r2.u = r0
            java.lang.String r0 = r3.readString()
            r2.v = r0
            java.lang.String r0 = r3.readString()
            r2.w = r0
            java.lang.Class<com.amap.api.services.poisearch.SubPoiItem> r0 = com.amap.api.services.poisearch.SubPoiItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r3.readArrayList(r0)
            r2.x = r0
            java.lang.Class<com.amap.api.services.poisearch.IndoorData> r0 = com.amap.api.services.poisearch.IndoorData.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            com.amap.api.services.poisearch.IndoorData r0 = (com.amap.api.services.poisearch.IndoorData) r0
            r2.t = r0
            android.os.Parcelable$Creator<com.amap.api.services.poisearch.Photo> r0 = com.amap.api.services.poisearch.Photo.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.y = r0
            java.lang.Class<com.amap.api.services.poisearch.PoiItemExtension> r0 = com.amap.api.services.poisearch.PoiItemExtension.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.amap.api.services.poisearch.PoiItemExtension r0 = (com.amap.api.services.poisearch.PoiItemExtension) r0
            r2.z = r0
            java.lang.String r0 = r3.readString()
            r2.A = r0
            java.lang.String r3 = r3.readString()
            r2.B = r3
            return
    }

    public PoiItem(java.lang.String r2, com.amap.api.services.core.LatLonPoint r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f5146e = r0
            r0 = -1
            r1.f5147f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.x = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.y = r0
            r1.a = r2
            r1.f5148g = r3
            r1.f5149h = r4
            r1.f5150i = r5
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
            com.amap.api.services.core.PoiItem r5 = (com.amap.api.services.core.PoiItem) r5
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
            java.lang.String r0 = r1.f5144c
            return r0
    }

    public java.lang.String getAdName() {
            r1 = this;
            java.lang.String r0 = r1.r
            return r0
    }

    public java.lang.String getBusinessArea() {
            r1 = this;
            java.lang.String r0 = r1.v
            return r0
    }

    public java.lang.String getCityCode() {
            r1 = this;
            java.lang.String r0 = r1.f5145d
            return r0
    }

    public java.lang.String getCityName() {
            r1 = this;
            java.lang.String r0 = r1.q
            return r0
    }

    public java.lang.String getDirection() {
            r1 = this;
            java.lang.String r0 = r1.o
            return r0
    }

    public int getDistance() {
            r1 = this;
            int r0 = r1.f5147f
            return r0
    }

    public java.lang.String getEmail() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getEnter() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5151j
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getExit() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5152k
            return r0
    }

    public com.amap.api.services.poisearch.IndoorData getIndoorData() {
            r1 = this;
            com.amap.api.services.poisearch.IndoorData r0 = r1.t
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5148g
            return r0
    }

    public java.lang.String getParkingType() {
            r1 = this;
            java.lang.String r0 = r1.w
            return r0
    }

    public java.util.List<com.amap.api.services.poisearch.Photo> getPhotos() {
            r1 = this;
            java.util.List<com.amap.api.services.poisearch.Photo> r0 = r1.y
            return r0
    }

    public com.amap.api.services.poisearch.PoiItemExtension getPoiExtension() {
            r1 = this;
            com.amap.api.services.poisearch.PoiItemExtension r0 = r1.z
            return r0
    }

    public java.lang.String getPoiId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getPostcode() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    public java.lang.String getProvinceCode() {
            r1 = this;
            java.lang.String r0 = r1.u
            return r0
    }

    public java.lang.String getProvinceName() {
            r1 = this;
            java.lang.String r0 = r1.p
            return r0
    }

    public java.lang.String getShopID() {
            r1 = this;
            java.lang.String r0 = r1.B
            return r0
    }

    public java.lang.String getSnippet() {
            r1 = this;
            java.lang.String r0 = r1.f5150i
            return r0
    }

    public java.util.List<com.amap.api.services.poisearch.SubPoiItem> getSubPois() {
            r1 = this;
            java.util.List<com.amap.api.services.poisearch.SubPoiItem> r0 = r1.x
            return r0
    }

    public java.lang.String getTel() {
            r1 = this;
            java.lang.String r0 = r1.f5143b
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.f5149h
            return r0
    }

    public java.lang.String getTypeCode() {
            r1 = this;
            java.lang.String r0 = r1.A
            return r0
    }

    public java.lang.String getTypeDes() {
            r1 = this;
            java.lang.String r0 = r1.f5146e
            return r0
    }

    public java.lang.String getWebsite() {
            r1 = this;
            java.lang.String r0 = r1.l
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

    public boolean isIndoorMap() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    public void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5144c = r1
            return
    }

    public void setAdName(java.lang.String r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void setBusinessArea(java.lang.String r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public void setCityCode(java.lang.String r1) {
            r0 = this;
            r0.f5145d = r1
            return
    }

    public void setCityName(java.lang.String r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void setDirection(java.lang.String r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setDistance(int r1) {
            r0 = this;
            r0.f5147f = r1
            return
    }

    public void setEmail(java.lang.String r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setEnter(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5151j = r1
            return
    }

    public void setExit(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5152k = r1
            return
    }

    public void setIndoorDate(com.amap.api.services.poisearch.IndoorData r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setIndoorMap(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public void setParkingType(java.lang.String r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void setPhotos(java.util.List<com.amap.api.services.poisearch.Photo> r1) {
            r0 = this;
            r0.y = r1
            return
    }

    public void setPoiExtension(com.amap.api.services.poisearch.PoiItemExtension r1) {
            r0 = this;
            r0.z = r1
            return
    }

    public void setPostcode(java.lang.String r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setProvinceCode(java.lang.String r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public void setProvinceName(java.lang.String r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setShopID(java.lang.String r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void setSubPois(java.util.List<com.amap.api.services.poisearch.SubPoiItem> r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public void setTel(java.lang.String r1) {
            r0 = this;
            r0.f5143b = r1
            return
    }

    public void setTypeCode(java.lang.String r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void setTypeDes(java.lang.String r1) {
            r0 = this;
            r0.f5146e = r1
            return
    }

    public void setWebsite(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f5149h
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r0 = r3.a
            r4.writeString(r0)
            java.lang.String r0 = r3.f5144c
            r4.writeString(r0)
            java.lang.String r0 = r3.f5143b
            r4.writeString(r0)
            java.lang.String r0 = r3.f5146e
            r4.writeString(r0)
            int r0 = r3.f5147f
            r4.writeInt(r0)
            com.amap.api.services.core.LatLonPoint r0 = r3.f5148g
            r4.writeValue(r0)
            java.lang.String r0 = r3.f5149h
            r4.writeString(r0)
            java.lang.String r0 = r3.f5150i
            r4.writeString(r0)
            java.lang.String r0 = r3.f5145d
            r4.writeString(r0)
            com.amap.api.services.core.LatLonPoint r0 = r3.f5151j
            r4.writeValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = r3.f5152k
            r4.writeValue(r0)
            java.lang.String r0 = r3.l
            r4.writeString(r0)
            java.lang.String r0 = r3.m
            r4.writeString(r0)
            java.lang.String r0 = r3.n
            r4.writeString(r0)
            boolean r0 = r3.s
            r1 = 1
            boolean[] r1 = new boolean[r1]
            r2 = 0
            r1[r2] = r0
            r4.writeBooleanArray(r1)
            java.lang.String r0 = r3.o
            r4.writeString(r0)
            java.lang.String r0 = r3.p
            r4.writeString(r0)
            java.lang.String r0 = r3.q
            r4.writeString(r0)
            java.lang.String r0 = r3.r
            r4.writeString(r0)
            java.lang.String r0 = r3.u
            r4.writeString(r0)
            java.lang.String r0 = r3.v
            r4.writeString(r0)
            java.lang.String r0 = r3.w
            r4.writeString(r0)
            java.util.List<com.amap.api.services.poisearch.SubPoiItem> r0 = r3.x
            r4.writeList(r0)
            com.amap.api.services.poisearch.IndoorData r0 = r3.t
            r4.writeValue(r0)
            java.util.List<com.amap.api.services.poisearch.Photo> r0 = r3.y
            r4.writeTypedList(r0)
            com.amap.api.services.poisearch.PoiItemExtension r0 = r3.z
            r4.writeParcelable(r0, r5)
            java.lang.String r5 = r3.A
            r4.writeString(r5)
            java.lang.String r5 = r3.B
            r4.writeString(r5)
            return
    }
}

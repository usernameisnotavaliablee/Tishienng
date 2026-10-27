package com.amap.api.fence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.fence.PoiItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f4914b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f4915c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f4916d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f4917e;

    /* renamed from: f, reason: collision with root package name */
    private double f4918f;

    /* renamed from: g, reason: collision with root package name */
    private double f4919g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f4920h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f4921i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f4922j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f4923k;


    static {
            com.amap.api.fence.PoiItem$1 r0 = new com.amap.api.fence.PoiItem$1
            r0.<init>()
            com.amap.api.fence.PoiItem.CREATOR = r0
            return
    }

    public PoiItem() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.a = r0
            r3.f4914b = r0
            r3.f4915c = r0
            r3.f4916d = r0
            r3.f4917e = r0
            r1 = 0
            r3.f4918f = r1
            r3.f4919g = r1
            r3.f4920h = r0
            r3.f4921i = r0
            r3.f4922j = r0
            r3.f4923k = r0
            return
    }

    protected PoiItem(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.a = r0
            r3.f4914b = r0
            r3.f4915c = r0
            r3.f4916d = r0
            r3.f4917e = r0
            r1 = 0
            r3.f4918f = r1
            r3.f4919g = r1
            r3.f4920h = r0
            r3.f4921i = r0
            r3.f4922j = r0
            r3.f4923k = r0
            java.lang.String r0 = r4.readString()
            r3.a = r0
            java.lang.String r0 = r4.readString()
            r3.f4914b = r0
            java.lang.String r0 = r4.readString()
            r3.f4915c = r0
            java.lang.String r0 = r4.readString()
            r3.f4916d = r0
            java.lang.String r0 = r4.readString()
            r3.f4917e = r0
            double r0 = r4.readDouble()
            r3.f4918f = r0
            double r0 = r4.readDouble()
            r3.f4919g = r0
            java.lang.String r0 = r4.readString()
            r3.f4920h = r0
            java.lang.String r0 = r4.readString()
            r3.f4921i = r0
            java.lang.String r0 = r4.readString()
            r3.f4922j = r0
            java.lang.String r4 = r4.readString()
            r3.f4923k = r4
            return
    }

    public static android.os.Parcelable.Creator<com.amap.api.fence.PoiItem> getCreator() {
            android.os.Parcelable$Creator<com.amap.api.fence.PoiItem> r0 = com.amap.api.fence.PoiItem.CREATOR
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAddress() {
            r1 = this;
            java.lang.String r0 = r1.f4917e
            return r0
    }

    public java.lang.String getAdname() {
            r1 = this;
            java.lang.String r0 = r1.f4923k
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f4922j
            return r0
    }

    public double getLatitude() {
            r2 = this;
            double r0 = r2.f4918f
            return r0
    }

    public double getLongitude() {
            r2 = this;
            double r0 = r2.f4919g
            return r0
    }

    public java.lang.String getPoiId() {
            r1 = this;
            java.lang.String r0 = r1.f4914b
            return r0
    }

    public java.lang.String getPoiName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getPoiType() {
            r1 = this;
            java.lang.String r0 = r1.f4915c
            return r0
    }

    public java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.f4921i
            return r0
    }

    public java.lang.String getTel() {
            r1 = this;
            java.lang.String r0 = r1.f4920h
            return r0
    }

    public java.lang.String getTypeCode() {
            r1 = this;
            java.lang.String r0 = r1.f4916d
            return r0
    }

    public void setAddress(java.lang.String r1) {
            r0 = this;
            r0.f4917e = r1
            return
    }

    public void setAdname(java.lang.String r1) {
            r0 = this;
            r0.f4923k = r1
            return
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.f4922j = r1
            return
    }

    public void setLatitude(double r1) {
            r0 = this;
            r0.f4918f = r1
            return
    }

    public void setLongitude(double r1) {
            r0 = this;
            r0.f4919g = r1
            return
    }

    public void setPoiId(java.lang.String r1) {
            r0 = this;
            r0.f4914b = r1
            return
    }

    public void setPoiName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setPoiType(java.lang.String r1) {
            r0 = this;
            r0.f4915c = r1
            return
    }

    public void setProvince(java.lang.String r1) {
            r0 = this;
            r0.f4921i = r1
            return
    }

    public void setTel(java.lang.String r1) {
            r0 = this;
            r0.f4920h = r1
            return
    }

    public void setTypeCode(java.lang.String r1) {
            r0 = this;
            r0.f4916d = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = r2.a
            r3.writeString(r4)
            java.lang.String r4 = r2.f4914b
            r3.writeString(r4)
            java.lang.String r4 = r2.f4915c
            r3.writeString(r4)
            java.lang.String r4 = r2.f4916d
            r3.writeString(r4)
            java.lang.String r4 = r2.f4917e
            r3.writeString(r4)
            double r0 = r2.f4918f
            r3.writeDouble(r0)
            double r0 = r2.f4919g
            r3.writeDouble(r0)
            java.lang.String r4 = r2.f4920h
            r3.writeString(r4)
            java.lang.String r4 = r2.f4921i
            r3.writeString(r4)
            java.lang.String r4 = r2.f4922j
            r3.writeString(r4)
            java.lang.String r4 = r2.f4923k
            r3.writeString(r4)
            return
    }
}

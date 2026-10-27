package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Business implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.Business> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5251b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5252c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5253d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5254e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5255f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5256g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5257h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f5258i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5259j;


    static {
            com.amap.api.services.poisearch.Business$1 r0 = new com.amap.api.services.poisearch.Business$1
            r0.<init>()
            com.amap.api.services.poisearch.Business.CREATOR = r0
            return
    }

    protected Business(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5251b = r0
            java.lang.String r0 = r2.readString()
            r1.f5252c = r0
            java.lang.String r0 = r2.readString()
            r1.f5253d = r0
            java.lang.String r0 = r2.readString()
            r1.f5254e = r0
            java.lang.String r0 = r2.readString()
            r1.f5255f = r0
            java.lang.String r0 = r2.readString()
            r1.f5256g = r0
            java.lang.String r0 = r2.readString()
            r1.f5257h = r0
            java.lang.String r0 = r2.readString()
            r1.f5258i = r0
            java.lang.String r2 = r2.readString()
            r1.f5259j = r2
            return
    }

    public Business(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5251b = r2
            r0.f5252c = r3
            r0.f5253d = r4
            r0.f5254e = r5
            r0.f5255f = r6
            r0.f5256g = r7
            r0.f5257h = r8
            r0.f5258i = r9
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAlias() {
            r1 = this;
            java.lang.String r0 = r1.f5258i
            return r0
    }

    public java.lang.String getBusinessArea() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getCPID() {
            r1 = this;
            java.lang.String r0 = r1.f5259j
            return r0
    }

    public java.lang.String getCost() {
            r1 = this;
            java.lang.String r0 = r1.f5256g
            return r0
    }

    public java.lang.String getOpentimeToday() {
            r1 = this;
            java.lang.String r0 = r1.f5251b
            return r0
    }

    public java.lang.String getOpentimeWeek() {
            r1 = this;
            java.lang.String r0 = r1.f5252c
            return r0
    }

    public java.lang.String getParkingType() {
            r1 = this;
            java.lang.String r0 = r1.f5257h
            return r0
    }

    public java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.f5254e
            return r0
    }

    public java.lang.String getTel() {
            r1 = this;
            java.lang.String r0 = r1.f5253d
            return r0
    }

    public java.lang.String getmRating() {
            r1 = this;
            java.lang.String r0 = r1.f5255f
            return r0
    }

    public void setCPID(java.lang.String r1) {
            r0 = this;
            r0.f5259j = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5251b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5252c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5253d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5254e
            r1.writeString(r2)
            java.lang.String r2 = r0.f5255f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5256g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5257h
            r1.writeString(r2)
            java.lang.String r2 = r0.f5258i
            r1.writeString(r2)
            java.lang.String r2 = r0.f5259j
            r1.writeString(r2)
            return
    }
}

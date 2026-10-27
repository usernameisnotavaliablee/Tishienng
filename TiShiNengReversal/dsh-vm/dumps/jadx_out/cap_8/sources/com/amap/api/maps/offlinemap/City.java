package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class City implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.City> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5017b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5018c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5019d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5020e;


    static {
            com.amap.api.maps.offlinemap.City$1 r0 = new com.amap.api.maps.offlinemap.City$1
            r0.<init>()
            com.amap.api.maps.offlinemap.City.CREATOR = r0
            return
    }

    public City() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.f5017b = r0
            r1.f5020e = r0
            return
    }

    public City(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.f5017b = r0
            r1.f5020e = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5017b = r0
            java.lang.String r0 = r2.readString()
            r1.f5018c = r0
            java.lang.String r0 = r2.readString()
            r1.f5019d = r0
            java.lang.String r2 = r2.readString()
            r1.f5020e = r2
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
            java.lang.String r0 = r1.f5020e
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.f5017b
            return r0
    }

    public java.lang.String getJianpin() {
            r1 = this;
            java.lang.String r0 = r1.f5018c
            return r0
    }

    public java.lang.String getPinyin() {
            r1 = this;
            java.lang.String r0 = r1.f5019d
            return r0
    }

    public void setAdcode(java.lang.String r1) {
            r0 = this;
            r0.f5020e = r1
            return
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setCode(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.lang.String r0 = "[]"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc
            r1.f5017b = r2
        Lc:
            return
    }

    public void setJianpin(java.lang.String r1) {
            r0 = this;
            r0.f5018c = r1
            return
    }

    public void setPinyin(java.lang.String r1) {
            r0 = this;
            r0.f5019d = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5017b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5018c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5019d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5020e
            r1.writeString(r2)
            return
    }
}

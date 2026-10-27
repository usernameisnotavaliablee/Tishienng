package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Province implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.Province> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5054b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5055c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5056d;


    static {
            com.amap.api.maps.offlinemap.Province$1 r0 = new com.amap.api.maps.offlinemap.Province$1
            r0.<init>()
            com.amap.api.maps.offlinemap.Province.CREATOR = r0
            return
    }

    public Province() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.f5056d = r0
            return
    }

    public Province(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.f5056d = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5054b = r0
            java.lang.String r0 = r2.readString()
            r1.f5055c = r0
            java.lang.String r2 = r2.readString()
            r1.f5056d = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getJianpin() {
            r1 = this;
            java.lang.String r0 = r1.f5054b
            return r0
    }

    public java.lang.String getPinyin() {
            r1 = this;
            java.lang.String r0 = r1.f5055c
            return r0
    }

    public java.lang.String getProvinceCode() {
            r1 = this;
            java.lang.String r0 = r1.f5056d
            return r0
    }

    public java.lang.String getProvinceName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setJianpin(java.lang.String r1) {
            r0 = this;
            r0.f5054b = r1
            return
    }

    public void setPinyin(java.lang.String r1) {
            r0 = this;
            r0.f5055c = r1
            return
    }

    public void setProvinceCode(java.lang.String r1) {
            r0 = this;
            r0.f5056d = r1
            return
    }

    public void setProvinceName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5054b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5055c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5056d
            r1.writeString(r2)
            return
    }
}

package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OfflineMapCity extends com.amap.api.maps.offlinemap.City {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.OfflineMapCity> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private long f5034b;

    /* renamed from: c, reason: collision with root package name */
    private int f5035c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5036d;

    /* renamed from: e, reason: collision with root package name */
    private int f5037e;


    static {
            com.amap.api.maps.offlinemap.OfflineMapCity$1 r0 = new com.amap.api.maps.offlinemap.OfflineMapCity$1
            r0.<init>()
            com.amap.api.maps.offlinemap.OfflineMapCity.CREATOR = r0
            return
    }

    public OfflineMapCity() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.a = r0
            r1 = 0
            r3.f5034b = r1
            r1 = 6
            r3.f5035c = r1
            r3.f5036d = r0
            r0 = 0
            r3.f5037e = r0
            return
    }

    public OfflineMapCity(android.os.Parcel r4) {
            r3 = this;
            r3.<init>(r4)
            java.lang.String r0 = ""
            r3.a = r0
            r1 = 0
            r3.f5034b = r1
            r1 = 6
            r3.f5035c = r1
            r3.f5036d = r0
            r0 = 0
            r3.f5037e = r0
            java.lang.String r0 = r4.readString()
            r3.a = r0
            long r0 = r4.readLong()
            r3.f5034b = r0
            int r0 = r4.readInt()
            r3.f5035c = r0
            java.lang.String r0 = r4.readString()
            r3.f5036d = r0
            int r4 = r4.readInt()
            r3.f5037e = r4
            return
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long getSize() {
            r2 = this;
            long r0 = r2.f5034b
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1.f5035c
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.f5036d
            return r0
    }

    public int getcompleteCode() {
            r1 = this;
            int r0 = r1.f5037e
            return r0
    }

    public void setCompleteCode(int r1) {
            r0 = this;
            r0.f5037e = r1
            return
    }

    public void setSize(long r1) {
            r0 = this;
            r0.f5034b = r1
            return
    }

    public void setState(int r1) {
            r0 = this;
            r0.f5035c = r1
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.f5036d = r1
            return
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            super.writeToParcel(r3, r4)
            java.lang.String r4 = r2.a
            r3.writeString(r4)
            long r0 = r2.f5034b
            r3.writeLong(r0)
            int r4 = r2.f5035c
            r3.writeInt(r4)
            java.lang.String r4 = r2.f5036d
            r3.writeString(r4)
            int r4 = r2.f5037e
            r3.writeInt(r4)
            return
    }
}

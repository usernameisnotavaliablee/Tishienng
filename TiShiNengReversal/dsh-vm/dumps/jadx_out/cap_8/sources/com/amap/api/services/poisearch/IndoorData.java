package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IndoorData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.IndoorData> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f5260b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5261c;


    static {
            com.amap.api.services.poisearch.IndoorData$1 r0 = new com.amap.api.services.poisearch.IndoorData$1
            r0.<init>()
            com.amap.api.services.poisearch.IndoorData.CREATOR = r0
            return
    }

    protected IndoorData(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            int r0 = r2.readInt()
            r1.f5260b = r0
            java.lang.String r2 = r2.readString()
            r1.f5261c = r2
            return
    }

    public IndoorData(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5260b = r2
            r0.f5261c = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getFloor() {
            r1 = this;
            int r0 = r1.f5260b
            return r0
    }

    public java.lang.String getFloorName() {
            r1 = this;
            java.lang.String r0 = r1.f5261c
            return r0
    }

    public java.lang.String getPoiId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setFloor(int r1) {
            r0 = this;
            r0.f5260b = r1
            return
    }

    public void setFloorName(java.lang.String r1) {
            r0 = this;
            r0.f5261c = r1
            return
    }

    public void setPoiId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            int r2 = r0.f5260b
            r1.writeInt(r2)
            java.lang.String r2 = r0.f5261c
            r1.writeString(r2)
            return
    }
}

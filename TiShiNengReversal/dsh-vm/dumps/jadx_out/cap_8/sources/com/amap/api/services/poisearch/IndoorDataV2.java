package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IndoorDataV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.IndoorDataV2> CREATOR = null;
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5262b;

    /* renamed from: c, reason: collision with root package name */
    private int f5263c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5264d;


    static {
            com.amap.api.services.poisearch.IndoorDataV2$1 r0 = new com.amap.api.services.poisearch.IndoorDataV2$1
            r0.<init>()
            com.amap.api.services.poisearch.IndoorDataV2.CREATOR = r0
            return
    }

    protected IndoorDataV2(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r3.readBooleanArray(r0)
            r1 = 0
            boolean r0 = r0[r1]
            r2.a = r0
            java.lang.String r0 = r3.readString()
            r2.f5262b = r0
            int r0 = r3.readInt()
            r2.f5263c = r0
            java.lang.String r3 = r3.readString()
            r2.f5264d = r3
            return
    }

    public IndoorDataV2(boolean r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5262b = r2
            r0.f5263c = r3
            r0.f5264d = r4
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
            int r0 = r1.f5263c
            return r0
    }

    public java.lang.String getFloorName() {
            r1 = this;
            java.lang.String r0 = r1.f5264d
            return r0
    }

    public java.lang.String getPoiId() {
            r1 = this;
            java.lang.String r0 = r1.f5262b
            return r0
    }

    public boolean isIndoorMap() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public void setFloor(int r1) {
            r0 = this;
            r0.f5263c = r1
            return
    }

    public void setFloorName(java.lang.String r1) {
            r0 = this;
            r0.f5264d = r1
            return
    }

    public void setIndoorMap(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setPoiId(java.lang.String r1) {
            r0 = this;
            r0.f5262b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            boolean r4 = r2.a
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r4
            r3.writeBooleanArray(r0)
            java.lang.String r4 = r2.f5262b
            r3.writeString(r4)
            int r4 = r2.f5263c
            r3.writeInt(r4)
            java.lang.String r4 = r2.f5264d
            r3.writeString(r4)
            return
    }
}

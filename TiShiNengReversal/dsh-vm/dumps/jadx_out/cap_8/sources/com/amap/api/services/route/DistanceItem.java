package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DistanceItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DistanceItem> CREATOR = null;
    public final int ERROR_CODE_NOT_IN_CHINA;
    public final int ERROR_CODE_NO_DRIVE;
    public final int ERROR_CODE_TOO_FAR;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f5370b;

    /* renamed from: c, reason: collision with root package name */
    private float f5371c;

    /* renamed from: d, reason: collision with root package name */
    private float f5372d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5373e;

    /* renamed from: f, reason: collision with root package name */
    private int f5374f;


    static {
            com.amap.api.services.route.DistanceItem$1 r0 = new com.amap.api.services.route.DistanceItem$1
            r0.<init>()
            com.amap.api.services.route.DistanceItem.CREATOR = r0
            return
    }

    public DistanceItem() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.ERROR_CODE_NO_DRIVE = r0
            r1 = 2
            r2.ERROR_CODE_TOO_FAR = r1
            r1 = 3
            r2.ERROR_CODE_NOT_IN_CHINA = r1
            r2.a = r0
            r2.f5370b = r0
            r0 = 0
            r2.f5371c = r0
            r2.f5372d = r0
            return
    }

    protected DistanceItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.ERROR_CODE_NO_DRIVE = r0
            r1 = 2
            r2.ERROR_CODE_TOO_FAR = r1
            r1 = 3
            r2.ERROR_CODE_NOT_IN_CHINA = r1
            r2.a = r0
            r2.f5370b = r0
            r0 = 0
            r2.f5371c = r0
            r2.f5372d = r0
            int r0 = r3.readInt()
            r2.a = r0
            int r0 = r3.readInt()
            r2.f5370b = r0
            float r0 = r3.readFloat()
            r2.f5371c = r0
            float r0 = r3.readFloat()
            r2.f5372d = r0
            java.lang.String r0 = r3.readString()
            r2.f5373e = r0
            int r3 = r3.readInt()
            r2.f5374f = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getDestId() {
            r1 = this;
            int r0 = r1.f5370b
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5371c
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5372d
            return r0
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.f5374f
            return r0
    }

    public java.lang.String getErrorInfo() {
            r1 = this;
            java.lang.String r0 = r1.f5373e
            return r0
    }

    public int getOriginId() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public void setDestId(int r1) {
            r0 = this;
            r0.f5370b = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5371c = r1
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5372d = r1
            return
    }

    public void setErrorCode(int r1) {
            r0 = this;
            r0.f5374f = r1
            return
    }

    public void setErrorInfo(java.lang.String r1) {
            r0 = this;
            r0.f5373e = r1
            return
    }

    public void setOriginId(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.a
            r1.writeInt(r2)
            int r2 = r0.f5370b
            r1.writeInt(r2)
            float r2 = r0.f5371c
            r1.writeFloat(r2)
            float r2 = r0.f5372d
            r1.writeFloat(r2)
            java.lang.String r2 = r0.f5373e
            r1.writeString(r2)
            int r2 = r0.f5374f
            r1.writeInt(r2)
            return
    }
}

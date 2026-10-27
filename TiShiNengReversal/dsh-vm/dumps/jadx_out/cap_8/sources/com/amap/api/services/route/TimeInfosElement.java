package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TimeInfosElement implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TimeInfosElement> CREATOR = null;
    int a;

    /* renamed from: b, reason: collision with root package name */
    float f5571b;

    /* renamed from: c, reason: collision with root package name */
    float f5572c;

    /* renamed from: d, reason: collision with root package name */
    int f5573d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.TMC> f5574e;


    static {
            com.amap.api.services.route.TimeInfosElement$1 r0 = new com.amap.api.services.route.TimeInfosElement$1
            r0.<init>()
            com.amap.api.services.route.TimeInfosElement.CREATOR = r0
            return
    }

    public TimeInfosElement() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5574e = r0
            return
    }

    public TimeInfosElement(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5574e = r0
            int r0 = r2.readInt()
            r1.a = r0
            float r0 = r2.readFloat()
            r1.f5571b = r0
            float r0 = r2.readFloat()
            r1.f5572c = r0
            int r0 = r2.readInt()
            r1.f5573d = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.TMC> r0 = com.amap.api.services.route.TMC.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f5574e = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5571b
            return r0
    }

    public int getPathindex() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public int getRestriction() {
            r1 = this;
            int r0 = r1.f5573d
            return r0
    }

    public java.util.List<com.amap.api.services.route.TMC> getTMCs() {
            r1 = this;
            java.util.List<com.amap.api.services.route.TMC> r0 = r1.f5574e
            return r0
    }

    public float getTolls() {
            r1 = this;
            float r0 = r1.f5572c
            return r0
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5571b = r1
            return
    }

    public void setPathindex(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setRestriction(int r1) {
            r0 = this;
            r0.f5573d = r1
            return
    }

    public void setTMCs(java.util.List<com.amap.api.services.route.TMC> r1) {
            r0 = this;
            r0.f5574e = r1
            return
    }

    public void setTolls(float r1) {
            r0 = this;
            r0.f5572c = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.a
            r1.writeInt(r2)
            float r2 = r0.f5571b
            r1.writeFloat(r2)
            float r2 = r0.f5572c
            r1.writeFloat(r2)
            int r2 = r0.f5573d
            r1.writeInt(r2)
            java.util.List<com.amap.api.services.route.TMC> r2 = r0.f5574e
            r1.writeTypedList(r2)
            return
    }
}

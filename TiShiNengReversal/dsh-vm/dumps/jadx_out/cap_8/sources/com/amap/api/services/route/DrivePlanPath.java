package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DrivePlanPath implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePlanPath> CREATOR = null;
    float a;

    /* renamed from: b, reason: collision with root package name */
    int f5392b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.DrivePlanStep> f5393c;


    static {
            com.amap.api.services.route.DrivePlanPath$1 r0 = new com.amap.api.services.route.DrivePlanPath$1
            r0.<init>()
            com.amap.api.services.route.DrivePlanPath.CREATOR = r0
            return
    }

    public DrivePlanPath() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5393c = r0
            return
    }

    public DrivePlanPath(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5393c = r0
            float r0 = r2.readFloat()
            r1.a = r0
            int r0 = r2.readInt()
            r1.f5392b = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.DrivePlanStep> r0 = com.amap.api.services.route.DrivePlanStep.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f5393c = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public java.util.List<com.amap.api.services.route.DrivePlanStep> getSteps() {
            r1 = this;
            java.util.List<com.amap.api.services.route.DrivePlanStep> r0 = r1.f5393c
            return r0
    }

    public float getTrafficLights() {
            r1 = this;
            int r0 = r1.f5392b
            float r0 = (float) r0
            return r0
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setSteps(java.util.List<com.amap.api.services.route.DrivePlanStep> r1) {
            r0 = this;
            r0.f5393c = r1
            return
    }

    public void setTrafficLights(int r1) {
            r0 = this;
            r0.f5392b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.a
            r1.writeFloat(r2)
            int r2 = r0.f5392b
            r1.writeInt(r2)
            java.util.List<com.amap.api.services.route.DrivePlanStep> r2 = r0.f5393c
            r1.writeTypedList(r2)
            return
    }
}

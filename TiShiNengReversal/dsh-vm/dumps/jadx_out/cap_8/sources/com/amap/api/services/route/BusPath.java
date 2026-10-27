package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusPath extends com.amap.api.services.route.Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.BusPath> CREATOR = null;
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5333b;

    /* renamed from: c, reason: collision with root package name */
    private float f5334c;

    /* renamed from: d, reason: collision with root package name */
    private float f5335d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.BusStep> f5336e;


    static {
            com.amap.api.services.route.BusPath$1 r0 = new com.amap.api.services.route.BusPath$1
            r0.<init>()
            com.amap.api.services.route.BusPath.CREATOR = r0
            return
    }

    public BusPath() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5336e = r0
            return
    }

    public BusPath(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5336e = r0
            float r0 = r3.readFloat()
            r2.a = r0
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r3.readBooleanArray(r0)
            r1 = 0
            boolean r0 = r0[r1]
            r2.f5333b = r0
            float r0 = r3.readFloat()
            r2.f5334c = r0
            float r0 = r3.readFloat()
            r2.f5335d = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.BusStep> r0 = com.amap.api.services.route.BusStep.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r0)
            r2.f5336e = r3
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getBusDistance() {
            r1 = this;
            float r0 = r1.f5335d
            return r0
    }

    public float getCost() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public java.util.List<com.amap.api.services.route.BusStep> getSteps() {
            r1 = this;
            java.util.List<com.amap.api.services.route.BusStep> r0 = r1.f5336e
            return r0
    }

    public float getWalkDistance() {
            r1 = this;
            float r0 = r1.f5334c
            return r0
    }

    public boolean isNightBus() {
            r1 = this;
            boolean r0 = r1.f5333b
            return r0
    }

    public void setBusDistance(float r1) {
            r0 = this;
            r0.f5335d = r1
            return
    }

    public void setCost(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setNightBus(boolean r1) {
            r0 = this;
            r0.f5333b = r1
            return
    }

    public void setSteps(java.util.List<com.amap.api.services.route.BusStep> r1) {
            r0 = this;
            r0.f5336e = r1
            return
    }

    public void setWalkDistance(float r1) {
            r0 = this;
            r0.f5334c = r1
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            super.writeToParcel(r3, r4)
            float r4 = r2.a
            r3.writeFloat(r4)
            boolean r4 = r2.f5333b
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r4
            r3.writeBooleanArray(r0)
            float r4 = r2.f5334c
            r3.writeFloat(r4)
            float r4 = r2.f5335d
            r3.writeFloat(r4)
            java.util.List<com.amap.api.services.route.BusStep> r4 = r2.f5336e
            r3.writeTypedList(r4)
            return
    }
}

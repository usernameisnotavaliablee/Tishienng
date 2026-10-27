package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TruckPath implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TruckPath> CREATOR = null;
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private long f5575b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5576c;

    /* renamed from: d, reason: collision with root package name */
    private float f5577d;

    /* renamed from: e, reason: collision with root package name */
    private float f5578e;

    /* renamed from: f, reason: collision with root package name */
    private int f5579f;

    /* renamed from: g, reason: collision with root package name */
    private int f5580g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.TruckStep> f5581h;


    static {
            com.amap.api.services.route.TruckPath$1 r0 = new com.amap.api.services.route.TruckPath$1
            r0.<init>()
            com.amap.api.services.route.TruckPath.CREATOR = r0
            return
    }

    public TruckPath() {
            r0 = this;
            r0.<init>()
            return
    }

    protected TruckPath(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            float r0 = r3.readFloat()
            r2.a = r0
            long r0 = r3.readLong()
            r2.f5575b = r0
            java.lang.String r0 = r3.readString()
            r2.f5576c = r0
            float r0 = r3.readFloat()
            r2.f5577d = r0
            float r0 = r3.readFloat()
            r2.f5578e = r0
            int r0 = r3.readInt()
            r2.f5579f = r0
            int r0 = r3.readInt()
            r2.f5580g = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.TruckStep> r0 = com.amap.api.services.route.TruckStep.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r0)
            r2.f5581h = r3
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

    public long getDuration() {
            r2 = this;
            long r0 = r2.f5575b
            return r0
    }

    public int getRestriction() {
            r1 = this;
            int r0 = r1.f5580g
            return r0
    }

    public java.util.List<com.amap.api.services.route.TruckStep> getSteps() {
            r1 = this;
            java.util.List<com.amap.api.services.route.TruckStep> r0 = r1.f5581h
            return r0
    }

    public java.lang.String getStrategy() {
            r1 = this;
            java.lang.String r0 = r1.f5576c
            return r0
    }

    public float getTollDistance() {
            r1 = this;
            float r0 = r1.f5578e
            return r0
    }

    public float getTolls() {
            r1 = this;
            float r0 = r1.f5577d
            return r0
    }

    public int getTotalTrafficlights() {
            r1 = this;
            int r0 = r1.f5579f
            return r0
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setDuration(long r1) {
            r0 = this;
            r0.f5575b = r1
            return
    }

    public void setRestriction(int r1) {
            r0 = this;
            r0.f5580g = r1
            return
    }

    public void setSteps(java.util.List<com.amap.api.services.route.TruckStep> r1) {
            r0 = this;
            r0.f5581h = r1
            return
    }

    public void setStrategy(java.lang.String r1) {
            r0 = this;
            r0.f5576c = r1
            return
    }

    public void setTollDistance(float r1) {
            r0 = this;
            r0.f5578e = r1
            return
    }

    public void setTolls(float r1) {
            r0 = this;
            r0.f5577d = r1
            return
    }

    public void setTotalTrafficlights(int r1) {
            r0 = this;
            r0.f5579f = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            float r4 = r2.a
            r3.writeFloat(r4)
            long r0 = r2.f5575b
            r3.writeLong(r0)
            java.lang.String r4 = r2.f5576c
            r3.writeString(r4)
            float r4 = r2.f5577d
            r3.writeFloat(r4)
            float r4 = r2.f5578e
            r3.writeFloat(r4)
            int r4 = r2.f5579f
            r3.writeInt(r4)
            int r4 = r2.f5580g
            r3.writeInt(r4)
            java.util.List<com.amap.api.services.route.TruckStep> r4 = r2.f5581h
            r3.writeTypedList(r4)
            return
    }
}

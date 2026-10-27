package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DrivePath extends com.amap.api.services.route.Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePath> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private float f5382b;

    /* renamed from: c, reason: collision with root package name */
    private float f5383c;

    /* renamed from: d, reason: collision with root package name */
    private int f5384d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.DriveStep> f5385e;

    /* renamed from: f, reason: collision with root package name */
    private int f5386f;


    static {
            com.amap.api.services.route.DrivePath$1 r0 = new com.amap.api.services.route.DrivePath$1
            r0.<init>()
            com.amap.api.services.route.DrivePath.CREATOR = r0
            return
    }

    public DrivePath() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5385e = r0
            return
    }

    public DrivePath(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5385e = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            float r0 = r2.readFloat()
            r1.f5382b = r0
            float r0 = r2.readFloat()
            r1.f5383c = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.DriveStep> r0 = com.amap.api.services.route.DriveStep.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5385e = r0
            int r2 = r2.readInt()
            r1.f5384d = r2
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getRestriction() {
            r1 = this;
            int r0 = r1.f5386f
            return r0
    }

    public java.util.List<com.amap.api.services.route.DriveStep> getSteps() {
            r1 = this;
            java.util.List<com.amap.api.services.route.DriveStep> r0 = r1.f5385e
            return r0
    }

    public java.lang.String getStrategy() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public float getTollDistance() {
            r1 = this;
            float r0 = r1.f5383c
            return r0
    }

    public float getTolls() {
            r1 = this;
            float r0 = r1.f5382b
            return r0
    }

    public int getTotalTrafficlights() {
            r1 = this;
            int r0 = r1.f5384d
            return r0
    }

    public void setRestriction(int r1) {
            r0 = this;
            r0.f5386f = r1
            return
    }

    public void setSteps(java.util.List<com.amap.api.services.route.DriveStep> r1) {
            r0 = this;
            r0.f5385e = r1
            return
    }

    public void setStrategy(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setTollDistance(float r1) {
            r0 = this;
            r0.f5383c = r1
            return
    }

    public void setTolls(float r1) {
            r0 = this;
            r0.f5382b = r1
            return
    }

    public void setTotalTrafficlights(int r1) {
            r0 = this;
            r0.f5384d = r1
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            float r2 = r0.f5382b
            r1.writeFloat(r2)
            float r2 = r0.f5383c
            r1.writeFloat(r2)
            java.util.List<com.amap.api.services.route.DriveStep> r2 = r0.f5385e
            r1.writeTypedList(r2)
            int r2 = r0.f5384d
            r1.writeInt(r2)
            return
    }
}

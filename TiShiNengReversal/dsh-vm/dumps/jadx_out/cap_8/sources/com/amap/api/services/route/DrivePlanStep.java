package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DrivePlanStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePlanStep> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5394b;

    /* renamed from: c, reason: collision with root package name */
    private float f5395c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5396d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5397e;


    static {
            com.amap.api.services.route.DrivePlanStep$1 r0 = new com.amap.api.services.route.DrivePlanStep$1
            r0.<init>()
            com.amap.api.services.route.DrivePlanStep.CREATOR = r0
            return
    }

    public DrivePlanStep() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5397e = r0
            return
    }

    public DrivePlanStep(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5397e = r0
            java.lang.String r0 = r3.readString()
            r2.a = r0
            java.lang.String r0 = r3.readString()
            r2.f5394b = r0
            float r0 = r3.readFloat()
            r2.f5395c = r0
            int r0 = r3.readInt()
            r1 = 1
            if (r0 != r1) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            r2.f5396d = r1
            float r0 = r3.readFloat()
            r2.f5395c = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r0)
            r2.f5397e = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAdCode() {
            r1 = this;
            java.lang.String r0 = r1.f5394b
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5395c
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5397e
            return r0
    }

    public java.lang.String getRoad() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public boolean getToll() {
            r1 = this;
            boolean r0 = r1.f5396d
            return r0
    }

    public void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5394b = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5395c = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5397e = r1
            return
    }

    public void setRoad(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setToll(boolean r1) {
            r0 = this;
            r0.f5396d = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5394b
            r1.writeString(r2)
            float r2 = r0.f5395c
            r1.writeFloat(r2)
            boolean r2 = r0.f5396d
            r1.writeInt(r2)
            float r2 = r0.f5395c
            r1.writeFloat(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5397e
            r1.writeTypedList(r2)
            return
    }
}

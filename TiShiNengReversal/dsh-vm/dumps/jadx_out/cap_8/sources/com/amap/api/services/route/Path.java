package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.Path> CREATOR = null;
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private long f5426b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5427c;


    static {
            com.amap.api.services.route.Path$1 r0 = new com.amap.api.services.route.Path$1
            r0.<init>()
            com.amap.api.services.route.Path.CREATOR = r0
            return
    }

    public Path() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5427c = r0
            return
    }

    public Path(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5427c = r0
            float r0 = r3.readFloat()
            r2.a = r0
            long r0 = r3.readLong()
            r2.f5426b = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r0)
            r2.f5427c = r3
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
            long r0 = r2.f5426b
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5427c
            return r0
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setDuration(long r1) {
            r0 = this;
            r0.f5426b = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5427c = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            float r4 = r2.a
            r3.writeFloat(r4)
            long r0 = r2.f5426b
            r3.writeLong(r0)
            java.util.List<com.amap.api.services.core.LatLonPoint> r4 = r2.f5427c
            r3.writeTypedList(r4)
            return
    }
}

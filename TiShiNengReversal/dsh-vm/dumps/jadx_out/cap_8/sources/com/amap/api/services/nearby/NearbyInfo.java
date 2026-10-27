package com.amap.api.services.nearby;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NearbyInfo {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5239b;

    /* renamed from: c, reason: collision with root package name */
    private long f5240c;

    /* renamed from: d, reason: collision with root package name */
    private int f5241d;

    /* renamed from: e, reason: collision with root package name */
    private int f5242e;

    public NearbyInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getDistance() {
            r1 = this;
            int r0 = r1.f5241d
            return r0
    }

    public int getDrivingDistance() {
            r1 = this;
            int r0 = r1.f5242e
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5239b
            return r0
    }

    public long getTimeStamp() {
            r2 = this;
            long r0 = r2.f5240c
            return r0
    }

    public java.lang.String getUserID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setDistance(int r1) {
            r0 = this;
            r0.f5241d = r1
            return
    }

    public void setDrivingDistance(int r1) {
            r0 = this;
            r0.f5242e = r1
            return
    }

    public void setPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5239b = r1
            return
    }

    public void setTimeStamp(long r1) {
            r0 = this;
            r0.f5240c = r1
            return
    }

    public void setUserID(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}

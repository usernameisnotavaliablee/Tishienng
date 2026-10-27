package com.amap.api.trace;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TraceLocation {
    private double a;

    /* renamed from: b, reason: collision with root package name */
    private double f5649b;

    /* renamed from: c, reason: collision with root package name */
    private float f5650c;

    /* renamed from: d, reason: collision with root package name */
    private float f5651d;

    /* renamed from: e, reason: collision with root package name */
    private long f5652e;

    public TraceLocation() {
            r0 = this;
            r0.<init>()
            return
    }

    public TraceLocation(double r1, double r3, float r5, float r6, long r7) {
            r0 = this;
            r0.<init>()
            double r1 = a(r1)
            r0.a = r1
            double r1 = a(r3)
            r0.f5649b = r1
            r1 = 1163984896(0x45610000, float:3600.0)
            float r5 = r5 * r1
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r1
            int r1 = (int) r5
            float r1 = (float) r1
            r0.f5650c = r1
            int r1 = (int) r6
            float r1 = (float) r1
            r0.f5651d = r1
            r0.f5652e = r7
            return
    }

    private static double a(double r2) {
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 * r0
            long r2 = java.lang.Math.round(r2)
            double r2 = (double) r2
            double r2 = r2 / r0
            return r2
    }

    public com.amap.api.trace.TraceLocation copy() {
            r3 = this;
            com.amap.api.trace.TraceLocation r0 = new com.amap.api.trace.TraceLocation
            r0.<init>()
            float r1 = r3.f5651d
            r0.f5651d = r1
            double r1 = r3.a
            r0.a = r1
            double r1 = r3.f5649b
            r0.f5649b = r1
            float r1 = r3.f5650c
            r0.f5650c = r1
            long r1 = r3.f5652e
            r0.f5652e = r1
            return r0
    }

    public float getBearing() {
            r1 = this;
            float r0 = r1.f5651d
            return r0
    }

    public double getLatitude() {
            r2 = this;
            double r0 = r2.a
            return r0
    }

    public double getLongitude() {
            r2 = this;
            double r0 = r2.f5649b
            return r0
    }

    public float getSpeed() {
            r1 = this;
            float r0 = r1.f5650c
            return r0
    }

    public long getTime() {
            r2 = this;
            long r0 = r2.f5652e
            return r0
    }

    public void setBearing(float r1) {
            r0 = this;
            int r1 = (int) r1
            float r1 = (float) r1
            r0.f5651d = r1
            return
    }

    public void setLatitude(double r1) {
            r0 = this;
            double r1 = a(r1)
            r0.a = r1
            return
    }

    public void setLongitude(double r1) {
            r0 = this;
            double r1 = a(r1)
            r0.f5649b = r1
            return
    }

    public void setSpeed(float r2) {
            r1 = this;
            r0 = 1163984896(0x45610000, float:3600.0)
            float r2 = r2 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r0
            int r2 = (int) r2
            float r2 = (float) r2
            r1.f5650c = r2
            return
    }

    public void setTime(long r1) {
            r0 = this;
            r0.f5652e = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ",longtitude "
            r0.append(r1)
            double r1 = r3.f5649b
            r0.append(r1)
            java.lang.String r1 = ",speed "
            r0.append(r1)
            float r1 = r3.f5650c
            r0.append(r1)
            java.lang.String r1 = ",bearing "
            r0.append(r1)
            float r1 = r3.f5651d
            r0.append(r1)
            java.lang.String r1 = ",time "
            r0.append(r1)
            long r1 = r3.f5652e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

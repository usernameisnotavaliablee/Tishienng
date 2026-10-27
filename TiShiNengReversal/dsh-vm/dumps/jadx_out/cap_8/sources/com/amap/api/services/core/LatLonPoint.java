package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LatLonPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.LatLonPoint> CREATOR = null;
    private double a;

    /* renamed from: b, reason: collision with root package name */
    private double f5142b;


    static {
            com.amap.api.services.core.LatLonPoint$1 r0 = new com.amap.api.services.core.LatLonPoint$1
            r0.<init>()
            com.amap.api.services.core.LatLonPoint.CREATOR = r0
            return
    }

    public LatLonPoint(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5142b = r3
            return
    }

    protected LatLonPoint(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            double r0 = r3.readDouble()
            r2.a = r0
            double r0 = r3.readDouble()
            r2.f5142b = r0
            return
    }

    public com.amap.api.services.core.LatLonPoint copy() {
            r5 = this;
            com.amap.api.services.core.LatLonPoint r0 = new com.amap.api.services.core.LatLonPoint
            double r1 = r5.a
            double r3 = r5.f5142b
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.amap.api.services.core.LatLonPoint r8 = (com.amap.api.services.core.LatLonPoint) r8
            double r2 = r7.a
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r4 = r8.a
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L26
            return r1
        L26:
            double r2 = r7.f5142b
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r4 = r8.f5142b
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L37
            return r1
        L37:
            return r0
    }

    public double getLatitude() {
            r2 = this;
            double r0 = r2.a
            return r0
    }

    public double getLongitude() {
            r2 = this;
            double r0 = r2.f5142b
            return r0
    }

    public int hashCode() {
            r7 = this;
            double r0 = r7.a
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 + 31
            double r3 = r7.f5142b
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            return r1
    }

    public void setLatitude(double r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setLongitude(double r1) {
            r0 = this;
            r0.f5142b = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            double r1 = r3.f5142b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            double r0 = r2.a
            r3.writeDouble(r0)
            double r0 = r2.f5142b
            r3.writeDouble(r0)
            return
    }
}

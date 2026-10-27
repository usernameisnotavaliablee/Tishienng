package com.amap.api.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.location.DPoint> CREATOR = null;
    private double a;

    /* renamed from: b, reason: collision with root package name */
    private double f4964b;


    static {
            com.amap.api.location.DPoint$1 r0 = new com.amap.api.location.DPoint$1
            r0.<init>()
            com.amap.api.location.DPoint.CREATOR = r0
            return
    }

    public DPoint() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f4964b = r0
            return
    }

    public DPoint(double r4, double r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r3.f4964b = r0
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            r6 = r0
        L13:
            r0 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1d
            r6 = r0
        L1d:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            r4 = r0
        L27:
            r0 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L31
            r4 = r0
        L31:
            r3.a = r6
            r3.f4964b = r4
            return
    }

    protected DPoint(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f4964b = r0
            double r0 = r3.readDouble()
            r2.a = r0
            double r0 = r3.readDouble()
            r2.f4964b = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.amap.api.location.DPoint
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.amap.api.location.DPoint r7 = (com.amap.api.location.DPoint) r7
            double r2 = r6.f4964b
            double r4 = r7.f4964b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L11
            return r1
        L11:
            double r2 = r6.a
            double r4 = r7.a
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L1a
            return r1
        L1a:
            r7 = 1
            return r7
    }

    public double getLatitude() {
            r2 = this;
            double r0 = r2.f4964b
            return r0
    }

    public double getLongitude() {
            r2 = this;
            double r0 = r2.a
            return r0
    }

    public int hashCode() {
            r4 = this;
            double r0 = r4.f4964b
            double r2 = r4.a
            double r0 = r0 + r2
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 * r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r0 = r0.intValue()
            return r0
    }

    public void setLatitude(double r4) {
            r3 = this;
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto La
            r4 = r0
        La:
            r0 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L14
            r4 = r0
        L14:
            r3.f4964b = r4
            return
    }

    public void setLongitude(double r4) {
            r3 = this;
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto La
            r4 = r0
        La:
            r0 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L14
            r4 = r0
        L14:
            r3.a = r4
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            double r0 = r2.a
            r3.writeDouble(r0)
            double r0 = r2.f4964b
            r3.writeDouble(r0)
            return
    }
}

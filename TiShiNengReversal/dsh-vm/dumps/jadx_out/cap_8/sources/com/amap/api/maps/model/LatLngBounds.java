package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class LatLngBounds implements android.os.Parcelable {
    private static final java.lang.String CLASSNAME = "LatLngBounds";
    public static final com.amap.api.maps.model.LatLngBoundsCreator CREATOR = null;
    private final int mVersionCode;
    public final com.amap.api.maps.model.LatLng northeast;
    public final com.amap.api.maps.model.LatLng southwest;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private double mEast;
        private double mNorth;
        private double mSouth;
        private double mWest;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
                r2.mSouth = r0
                r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
                r2.mNorth = r0
                r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
                r2.mWest = r0
                r2.mEast = r0
                return
        }

        private boolean a(double r8) {
                r7 = this;
                double r0 = r7.mWest
                double r2 = r7.mEast
                r4 = 0
                r5 = 1
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 > 0) goto L14
                int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r6 > 0) goto L13
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 > 0) goto L13
                return r5
            L13:
                return r4
            L14:
                int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r6 <= 0) goto L1e
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 > 0) goto L1d
                goto L1e
            L1d:
                return r4
            L1e:
                return r5
        }

        public final com.amap.api.maps.model.LatLngBounds build() {
                r8 = this;
                double r0 = r8.mWest
                boolean r0 = java.lang.Double.isNaN(r0)
                if (r0 == 0) goto La
                r0 = 0
                return r0
            La:
                double r0 = r8.mWest
                double r2 = r8.mEast
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L16
                r8.mWest = r2
                r8.mEast = r0
            L16:
                double r0 = r8.mSouth
                double r2 = r8.mNorth
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L22
                r8.mSouth = r2
                r8.mNorth = r0
            L22:
                com.amap.api.maps.model.LatLngBounds r0 = new com.amap.api.maps.model.LatLngBounds
                com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
                double r2 = r8.mSouth
                double r4 = r8.mWest
                r6 = 0
                r1.<init>(r2, r4, r6)
                com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
                double r3 = r8.mNorth
                double r5 = r8.mEast
                r7 = 0
                r2.<init>(r3, r5, r7)
                r0.<init>(r1, r2)
                return r0
        }

        public final com.amap.api.maps.model.LatLngBounds.Builder include(com.amap.api.maps.model.LatLng r7) {
                r6 = this;
                if (r7 != 0) goto L3
                goto L3f
            L3:
                double r0 = r6.mSouth
                double r2 = r7.latitude
                double r0 = java.lang.Math.min(r0, r2)
                r6.mSouth = r0
                double r0 = r6.mNorth
                double r2 = r7.latitude
                double r0 = java.lang.Math.max(r0, r2)
                r6.mNorth = r0
                double r0 = r7.longitude
                double r2 = r6.mWest
                boolean r7 = java.lang.Double.isNaN(r2)
                if (r7 == 0) goto L24
                r6.mWest = r0
                goto L3d
            L24:
                boolean r7 = r6.a(r0)
                if (r7 != 0) goto L3f
                double r2 = r6.mWest
                double r2 = com.amap.api.maps.model.LatLngBounds.a(r2, r0)
                double r4 = r6.mEast
                double r4 = com.amap.api.maps.model.LatLngBounds.b(r4, r0)
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 >= 0) goto L3d
                r6.mWest = r0
                return r6
            L3d:
                r6.mEast = r0
            L3f:
                return r6
        }
    }

    static {
            com.amap.api.maps.model.LatLngBoundsCreator r0 = new com.amap.api.maps.model.LatLngBoundsCreator
            r0.<init>()
            com.amap.api.maps.model.LatLngBounds.CREATOR = r0
            return
    }

    LatLngBounds(int r7, com.amap.api.maps.model.LatLng r8, com.amap.api.maps.model.LatLng r9) {
            r6 = this;
            r6.<init>()
            r0 = 0
            if (r8 == 0) goto L41
            if (r9 == 0) goto L39
            double r1 = r9.latitude     // Catch: java.lang.Throwable -> L37
            double r3 = r8.latitude     // Catch: java.lang.Throwable -> L37
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L12
            r1 = 1
            goto L4a
        L12:
            com.amap.api.maps.model.RuntimeRemoteException r1 = new com.amap.api.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "southern latitude exceeds northern latitude ("
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L37
            double r3 = r8.latitude     // Catch: java.lang.Throwable -> L37
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = " > "
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            double r3 = r9.latitude     // Catch: java.lang.Throwable -> L37
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L37:
            goto L49
        L39:
            com.amap.api.maps.model.RuntimeRemoteException r1 = new com.amap.api.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "null northeast"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L41:
            com.amap.api.maps.model.RuntimeRemoteException r1 = new com.amap.api.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "null southwest"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r7 = 0
        L4e:
            r6.mVersionCode = r7
            r7 = 0
            if (r1 == 0) goto L54
            goto L55
        L54:
            r8 = r7
        L55:
            r6.southwest = r8
            if (r1 == 0) goto L5a
            goto L5b
        L5a:
            r9 = r7
        L5b:
            r6.northeast = r9
            return
    }

    public LatLngBounds(com.amap.api.maps.model.LatLng r2, com.amap.api.maps.model.LatLng r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3)
            return
    }

    static /* synthetic */ double a(double r0, double r2) {
            double r0 = c(r0, r2)
            return r0
    }

    private boolean a(double r4) {
            r3 = this;
            com.amap.api.maps.model.LatLng r0 = r3.southwest
            double r0 = r0.latitude
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L12
            com.amap.api.maps.model.LatLng r0 = r3.northeast
            double r0 = r0.latitude
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L12
            r4 = 1
            return r4
        L12:
            r4 = 0
            return r4
    }

    private boolean a(com.amap.api.maps.model.LatLngBounds r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            if (r1 == 0) goto Le
            com.amap.api.maps.model.LatLng r3 = r1.northeast
            if (r3 == 0) goto Le
            com.amap.api.maps.model.LatLng r1 = r1.southwest
            if (r1 != 0) goto L11
        Le:
            r21 = 0
            goto L4e
        L11:
            double r4 = r3.longitude
            double r6 = r1.longitude
            double r8 = r4 + r6
            com.amap.api.maps.model.LatLng r10 = r0.northeast
            double r11 = r10.longitude
            double r8 = r8 - r11
            com.amap.api.maps.model.LatLng r13 = r0.southwest
            double r14 = r13.longitude
            double r8 = r8 - r14
            double r11 = r11 - r14
            double r11 = r11 + r4
            double r11 = r11 - r6
            double r3 = r3.latitude
            double r5 = r1.latitude
            double r14 = r3 + r5
            r16 = r3
            r1 = 0
            double r2 = r10.latitude
            double r14 = r14 - r2
            r18 = r2
            r21 = 0
            double r1 = r13.latitude
            double r14 = r14 - r1
            double r2 = r18 - r1
            double r2 = r2 + r16
            double r2 = r2 - r5
            double r4 = java.lang.Math.abs(r8)
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 >= 0) goto L4e
            double r4 = java.lang.Math.abs(r14)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L4e
            r1 = 1
            return r1
        L4e:
            return r21
    }

    static /* synthetic */ double b(double r0, double r2) {
            double r0 = d(r0, r2)
            return r0
    }

    private boolean b(double r8) {
            r7 = this;
            com.amap.api.maps.model.LatLng r0 = r7.southwest
            double r0 = r0.longitude
            com.amap.api.maps.model.LatLng r2 = r7.northeast
            double r2 = r2.longitude
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L18
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L17
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L17
            return r5
        L17:
            return r4
        L18:
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 <= 0) goto L22
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L21
            goto L22
        L21:
            return r4
        L22:
            return r5
    }

    public static com.amap.api.maps.model.LatLngBounds.Builder builder() {
            com.amap.api.maps.model.LatLngBounds$Builder r0 = new com.amap.api.maps.model.LatLngBounds$Builder
            r0.<init>()
            return r0
    }

    private static double c(double r0, double r2) {
            double r0 = r0 - r2
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r0 + r2
            double r0 = r0 % r2
            return r0
    }

    private static double d(double r0, double r2) {
            double r2 = r2 - r0
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r2 = r2 + r0
            double r2 = r2 % r0
            return r2
    }

    final int a() {
            r1 = this;
            int r0 = r1.mVersionCode
            return r0
    }

    public final boolean contains(com.amap.api.maps.model.LatLng r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.amap.api.maps.model.LatLng r1 = r3.northeast
            if (r1 == 0) goto L1f
            com.amap.api.maps.model.LatLng r1 = r3.southwest
            if (r1 != 0) goto Ld
            goto L1f
        Ld:
            double r1 = r4.latitude
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L1f
            double r1 = r4.longitude
            boolean r4 = r3.b(r1)
            if (r4 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            return r0
    }

    public final boolean contains(com.amap.api.maps.model.LatLngBounds r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.amap.api.maps.model.LatLng r1 = r3.southwest
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L16
            com.amap.api.maps.model.LatLng r3 = r3.northeast
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L16
            r3 = 1
            return r3
        L16:
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.amap.api.maps.model.LatLngBounds
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.amap.api.maps.model.LatLngBounds r5 = (com.amap.api.maps.model.LatLngBounds) r5
            com.amap.api.maps.model.LatLng r1 = r4.southwest
            com.amap.api.maps.model.LatLng r3 = r5.southwest
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            com.amap.api.maps.model.LatLng r1 = r4.northeast
            com.amap.api.maps.model.LatLng r5 = r5.northeast
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            com.amap.api.maps.model.LatLng r0 = r4.southwest
            com.amap.api.maps.model.LatLng r1 = r4.northeast
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = com.amap.api.col.p0003l.b3.k(r2)
            return r0
    }

    public final com.amap.api.maps.model.LatLngBounds including(com.amap.api.maps.model.LatLng r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 != 0) goto L7
            goto L55
        L7:
            com.amap.api.maps.model.LatLng r2 = r0.northeast
            if (r2 == 0) goto L55
            com.amap.api.maps.model.LatLng r2 = r0.southwest
            if (r2 != 0) goto L10
            goto L55
        L10:
            double r2 = r2.latitude
            double r4 = r1.latitude
            double r7 = java.lang.Math.min(r2, r4)
            com.amap.api.maps.model.LatLng r2 = r0.northeast
            double r2 = r2.latitude
            double r4 = r1.latitude
            double r2 = java.lang.Math.max(r2, r4)
            com.amap.api.maps.model.LatLng r4 = r0.northeast
            double r4 = r4.longitude
            com.amap.api.maps.model.LatLng r6 = r0.southwest
            double r9 = r6.longitude
            double r11 = r1.longitude
            boolean r1 = r0.b(r11)
            if (r1 != 0) goto L3f
            double r13 = c(r9, r11)
            double r15 = d(r4, r11)
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 >= 0) goto L41
            r9 = r11
        L3f:
            r12 = r4
            goto L42
        L41:
            r12 = r11
        L42:
            com.amap.api.maps.model.LatLngBounds r1 = new com.amap.api.maps.model.LatLngBounds     // Catch: java.lang.Throwable -> L55
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L55
            r11 = 0
            r6.<init>(r7, r9, r11)     // Catch: java.lang.Throwable -> L55
            com.amap.api.maps.model.LatLng r9 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L55
            r14 = 0
            r10 = r2
            r9.<init>(r10, r12, r14)     // Catch: java.lang.Throwable -> L55
            r1.<init>(r6, r9)     // Catch: java.lang.Throwable -> L55
            return r1
        L55:
            return r0
    }

    public final boolean intersects(com.amap.api.maps.model.LatLngBounds r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.amap.api.maps.model.LatLng r1 = r2.northeast
            if (r1 == 0) goto L1d
            com.amap.api.maps.model.LatLng r1 = r2.southwest
            if (r1 != 0) goto Ld
            goto L1d
        Ld:
            boolean r1 = r2.a(r3)
            if (r1 != 0) goto L1b
            boolean r3 = r3.a(r2)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            return r0
        L1b:
            r3 = 1
            return r3
        L1d:
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "southwest"
            com.amap.api.maps.model.LatLng r1 = r3.southwest
            java.lang.String r0 = com.amap.api.col.p0003l.b3.z(r0, r1)
            java.lang.String r1 = "northeast"
            com.amap.api.maps.model.LatLng r2 = r3.northeast
            java.lang.String r1 = com.amap.api.col.p0003l.b3.z(r1, r2)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = com.amap.api.col.p0003l.b3.A(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.amap.api.maps.model.LatLngBoundsCreator.a(r0, r1, r2)
            return
    }
}

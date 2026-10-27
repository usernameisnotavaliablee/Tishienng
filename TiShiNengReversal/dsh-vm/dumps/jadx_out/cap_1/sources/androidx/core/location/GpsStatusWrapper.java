package androidx.core.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class GpsStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;

    @androidx.annotation.GuardedBy("mWrapped")
    private java.util.Iterator<android.location.GpsSatellite> mCachedIterator;

    @androidx.annotation.GuardedBy("mWrapped")
    private int mCachedIteratorPosition;

    @androidx.annotation.GuardedBy("mWrapped")
    private android.location.GpsSatellite mCachedSatellite;

    @androidx.annotation.GuardedBy("mWrapped")
    private int mCachedSatelliteCount;
    private final android.location.GpsStatus mWrapped;

    GpsStatusWrapper(android.location.GpsStatus r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            android.location.GpsStatus r2 = (android.location.GpsStatus) r2
            r1.mWrapped = r2
            r0 = -1
            r1.mCachedSatelliteCount = r0
            java.lang.Iterable r2 = r2.getSatellites()
            java.util.Iterator r2 = r2.iterator()
            r1.mCachedIterator = r2
            r1.mCachedIteratorPosition = r0
            r2 = 0
            r1.mCachedSatellite = r2
            return
    }

    private static int getConstellationFromPrn(int r2) {
            if (r2 <= 0) goto L8
            r0 = 32
            if (r2 > r0) goto L8
            r2 = 1
            return r2
        L8:
            r0 = 33
            r1 = 64
            if (r2 < r0) goto L12
            if (r2 > r1) goto L12
            r2 = 2
            return r2
        L12:
            if (r2 <= r1) goto L1a
            r0 = 88
            if (r2 > r0) goto L1a
            r2 = 3
            return r2
        L1a:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 <= r0) goto L24
            r1 = 235(0xeb, float:3.3E-43)
            if (r2 > r1) goto L24
            r2 = 5
            return r2
        L24:
            r1 = 193(0xc1, float:2.7E-43)
            if (r2 < r1) goto L2c
            if (r2 > r0) goto L2c
            r2 = 4
            return r2
        L2c:
            r2 = 0
            return r2
    }

    private android.location.GpsSatellite getSatellite(int r3) {
            r2 = this;
            android.location.GpsStatus r0 = r2.mWrapped
            monitor-enter(r0)
            int r1 = r2.mCachedIteratorPosition     // Catch: java.lang.Throwable -> L17
            if (r3 >= r1) goto L19
            android.location.GpsStatus r1 = r2.mWrapped     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
            r2.mCachedIterator = r1     // Catch: java.lang.Throwable -> L17
            r1 = -1
            r2.mCachedIteratorPosition = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L42
        L19:
            int r1 = r2.mCachedIteratorPosition     // Catch: java.lang.Throwable -> L17
            if (r1 >= r3) goto L38
            int r1 = r1 + 1
            r2.mCachedIteratorPosition = r1     // Catch: java.lang.Throwable -> L17
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.mCachedIterator     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2d
            r3 = 0
            r2.mCachedSatellite = r3     // Catch: java.lang.Throwable -> L17
            goto L38
        L2d:
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.mCachedIterator     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L17
            android.location.GpsSatellite r1 = (android.location.GpsSatellite) r1     // Catch: java.lang.Throwable -> L17
            r2.mCachedSatellite = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L38:
            android.location.GpsSatellite r3 = r2.mCachedSatellite     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            android.location.GpsSatellite r3 = (android.location.GpsSatellite) r3
            return r3
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    private static int getSvidFromPrn(int r2) {
            int r0 = getConstellationFromPrn(r2)
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r1) goto L11
            r1 = 5
            if (r0 == r1) goto Le
            return r2
        Le:
            int r2 = r2 + (-200)
            return r2
        L11:
            int r2 = r2 + (-64)
            return r2
        L14:
            int r2 = r2 + 87
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.core.location.GpsStatusWrapper
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.core.location.GpsStatusWrapper r2 = (androidx.core.location.GpsStatusWrapper) r2
            android.location.GpsStatus r0 = r1.mWrapped
            android.location.GpsStatus r2 = r2.mWrapped
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            float r1 = r1.getAzimuth()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            float r1 = r1.getSnr()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L8
            r3 = 1
            return r3
        L8:
            android.location.GpsSatellite r3 = r2.getSatellite(r3)
            int r3 = r3.getPrn()
            int r3 = getConstellationFromPrn(r3)
            return r3
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            float r1 = r1.getElevation()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
            r3 = this;
            android.location.GpsStatus r0 = r3.mWrapped
            monitor-enter(r0)
            int r1 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L25
            r2 = -1
            if (r1 != r2) goto L2d
            android.location.GpsStatus r1 = r3.mWrapped     // Catch: java.lang.Throwable -> L25
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            android.location.GpsSatellite r2 = (android.location.GpsSatellite) r2     // Catch: java.lang.Throwable -> L25
            int r2 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L25
            int r2 = r2 + 1
            r3.mCachedSatelliteCount = r2     // Catch: java.lang.Throwable -> L25
            goto L12
        L25:
            r1 = move-exception
            goto L31
        L27:
            int r1 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L25
            int r1 = r1 + 1
            r3.mCachedSatelliteCount = r1     // Catch: java.lang.Throwable -> L25
        L2d:
            int r1 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r1
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto Lf
            android.location.GpsSatellite r3 = r2.getSatellite(r3)
            int r3 = r3.getPrn()
            return r3
        Lf:
            android.location.GpsSatellite r3 = r2.getSatellite(r3)
            int r3 = r3.getPrn()
            int r3 = getSvidFromPrn(r3)
            return r3
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            boolean r1 = r1.hasAlmanac()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            boolean r1 = r1.hasEphemeris()
            return r1
    }

    public int hashCode() {
            r1 = this;
            android.location.GpsStatus r0 = r1.mWrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            boolean r1 = r1.usedInFix()
            return r1
    }
}

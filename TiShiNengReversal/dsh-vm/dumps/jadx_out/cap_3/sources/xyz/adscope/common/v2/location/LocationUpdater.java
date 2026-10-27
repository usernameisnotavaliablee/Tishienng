package xyz.adscope.common.v2.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class LocationUpdater implements xyz.adscope.common.v2.location.ILocationHolder {
    private final android.content.Context mContext;
    private xyz.adscope.common.v2.location.ILocation mLocalLocation;
    private boolean mUpdatePermissionGranted;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.location.LocationUpdater$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LastKnownLocation implements xyz.adscope.common.v2.location.ILocation {
        private final android.location.Location mLastKnownLocation;

        private LastKnownLocation(android.location.Location r1) {
                r0 = this;
                r0.<init>()
                r0.mLastKnownLocation = r1
                return
        }

        /* synthetic */ LastKnownLocation(android.location.Location r1, xyz.adscope.common.v2.location.LocationUpdater.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.common.v2.location.ILocation
        public xyz.adscope.common.v2.location.ILocation.CoordinateType getCoordinateType() {
                r1 = this;
                xyz.adscope.common.v2.location.ILocation$CoordinateType r0 = xyz.adscope.common.v2.location.ILocation.CoordinateType.WGS_84
                return r0
        }

        @Override // xyz.adscope.common.v2.location.ILocation
        public double getLatitude() {
                r2 = this;
                android.location.Location r0 = r2.mLastKnownLocation
                double r0 = r0.getLatitude()
                return r0
        }

        @Override // xyz.adscope.common.v2.location.ILocation
        public long getLocationTimestamp() {
                r2 = this;
                android.location.Location r0 = r2.mLastKnownLocation
                long r0 = r0.getTime()
                return r0
        }

        @Override // xyz.adscope.common.v2.location.ILocation
        public double getLongitude() {
                r2 = this;
                android.location.Location r0 = r2.mLastKnownLocation
                double r0 = r0.getLongitude()
                return r0
        }
    }

    LocationUpdater(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mUpdatePermissionGranted = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.mContext = r2
            return
    }

    public static /* synthetic */ int a(android.location.Location r2, android.location.Location r3) {
            long r0 = r3.getTime()
            long r2 = r2.getTime()
            int r2 = java.lang.Long.compare(r0, r2)
            return r2
    }

    private boolean isPermissionGranted() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = xyz.adscope.common.v2.dev.info.PermissionUtil.isPermissionGranted(r0, r2)
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.mContext
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = xyz.adscope.common.v2.dev.info.PermissionUtil.isPermissionGranted(r0, r2)
            if (r0 == 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            r0 = 1
            return r0
        L1b:
            return r1
    }

    @Override // xyz.adscope.common.v2.location.ILocationHolder
    @android.annotation.SuppressLint({"MissingPermission"})
    public xyz.adscope.common.v2.location.ILocation getLastKnownLocation() {
            r4 = this;
            boolean r0 = r4.mUpdatePermissionGranted
            if (r0 == 0) goto L56
            boolean r0 = r4.isPermissionGranted()
            if (r0 == 0) goto L56
            android.content.Context r0 = r4.mContext
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            if (r0 == 0) goto L56
            r1 = 1
            java.util.List r1 = r0.getProviders(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.location.Location r3 = r0.getLastKnownLocation(r3)
            if (r3 == 0) goto L24
            r2.add(r3)
            goto L24
        L3a:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L56
            xyz.adscope.common.v2.location.a r0 = new xyz.adscope.common.v2.location.a
            r0.<init>()
            java.util.Collections.sort(r2, r0)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            android.location.Location r0 = (android.location.Location) r0
            xyz.adscope.common.v2.location.LocationUpdater$LastKnownLocation r1 = new xyz.adscope.common.v2.location.LocationUpdater$LastKnownLocation
            r2 = 0
            r1.<init>(r0, r2)
            return r1
        L56:
            xyz.adscope.common.v2.location.ILocation r0 = r4.mLocalLocation
            return r0
    }

    @Override // xyz.adscope.common.v2.location.ILocationHolder
    public void setLocalLocation(xyz.adscope.common.v2.location.ILocation r1) {
            r0 = this;
            r0.mLocalLocation = r1
            return
    }

    @Override // xyz.adscope.common.v2.location.ILocationHolder
    public void updatePermissionGranted() {
            r1 = this;
            r0 = 1
            r1.mUpdatePermissionGranted = r0
            return
    }
}

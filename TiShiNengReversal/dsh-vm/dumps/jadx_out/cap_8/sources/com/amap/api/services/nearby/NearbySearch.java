package com.amap.api.services.nearby;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NearbySearch {
    public static final int AMAP = 1;
    public static final int GPS = 0;
    private static com.amap.api.services.nearby.NearbySearch a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.interfaces.INearbySearch f5243b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.services.nearby.NearbySearch$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.amap.api.services.nearby.NearbySearchFunctionType[] r0 = com.amap.api.services.nearby.NearbySearchFunctionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amap.api.services.nearby.NearbySearch.AnonymousClass1.a = r0
                com.amap.api.services.nearby.NearbySearchFunctionType r1 = com.amap.api.services.nearby.NearbySearchFunctionType.DISTANCE_SEARCH     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.amap.api.services.nearby.NearbySearch.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.amap.api.services.nearby.NearbySearchFunctionType r1 = com.amap.api.services.nearby.NearbySearchFunctionType.DRIVING_DISTANCE_SEARCH     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface NearbyListener {
        void onNearbyInfoSearched(com.amap.api.services.nearby.NearbySearchResult r1, int r2);

        void onNearbyInfoUploaded(int r1);

        void onUserInfoCleared(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NearbyQuery {
        private com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.nearby.NearbySearchFunctionType f5244b;

        /* renamed from: c, reason: collision with root package name */
        private int f5245c;

        /* renamed from: d, reason: collision with root package name */
        private int f5246d;

        /* renamed from: e, reason: collision with root package name */
        private int f5247e;

        public NearbyQuery() {
                r1 = this;
                r1.<init>()
                com.amap.api.services.nearby.NearbySearchFunctionType r0 = com.amap.api.services.nearby.NearbySearchFunctionType.DISTANCE_SEARCH
                r1.f5244b = r0
                r0 = 1000(0x3e8, float:1.401E-42)
                r1.f5245c = r0
                r0 = 1800(0x708, float:2.522E-42)
                r1.f5246d = r0
                r0 = 1
                r1.f5247e = r0
                return
        }

        public com.amap.api.services.core.LatLonPoint getCenterPoint() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                return r0
        }

        public int getCoordType() {
                r1 = this;
                int r0 = r1.f5247e
                return r0
        }

        public int getRadius() {
                r1 = this;
                int r0 = r1.f5245c
                return r0
        }

        public int getTimeRange() {
                r1 = this;
                int r0 = r1.f5246d
                return r0
        }

        public int getType() {
                r4 = this;
                int[] r0 = com.amap.api.services.nearby.NearbySearch.AnonymousClass1.a
                com.amap.api.services.nearby.NearbySearchFunctionType r1 = r4.f5244b
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L13
                r3 = 2
                if (r0 == r3) goto L12
                return r1
            L12:
                return r2
            L13:
                return r1
        }

        public void setCenterPoint(com.amap.api.services.core.LatLonPoint r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setCoordType(int r2) {
                r1 = this;
                if (r2 == 0) goto L8
                r0 = 1
                if (r2 == r0) goto L8
                r1.f5247e = r0
                return
            L8:
                r1.f5247e = r2
                return
        }

        public void setRadius(int r2) {
                r1 = this;
                r0 = 10000(0x2710, float:1.4013E-41)
                if (r2 <= r0) goto L6
                r2 = 10000(0x2710, float:1.4013E-41)
            L6:
                r1.f5245c = r2
                return
        }

        public void setTimeRange(int r2) {
                r1 = this;
                r0 = 5
                if (r2 >= r0) goto L5
                r2 = 5
                goto Ld
            L5:
                r0 = 86400(0x15180, float:1.21072E-40)
                if (r2 <= r0) goto Ld
                r2 = 86400(0x15180, float:1.21072E-40)
            Ld:
                r1.f5246d = r2
                return
        }

        public void setType(com.amap.api.services.nearby.NearbySearchFunctionType r1) {
                r0 = this;
                r0.f5244b = r1
                return
        }
    }

    private NearbySearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b
            if (r0 != 0) goto L18
            com.amap.api.col.s.p0 r0 = new com.amap.api.col.s.p0     // Catch: java.lang.Exception -> Lf
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lf
            r1.f5243b = r0     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r2 = move-exception
            boolean r0 = r2 instanceof com.amap.api.services.core.AMapException
            if (r0 != 0) goto L15
            goto L18
        L15:
            com.amap.api.services.core.AMapException r2 = (com.amap.api.services.core.AMapException) r2
            throw r2
        L18:
            return
    }

    private void a() {
            r1 = this;
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b
            if (r0 == 0) goto L7
            r0.destroy()
        L7:
            r0 = 0
            r1.f5243b = r0
            return
    }

    public static synchronized void destroy() {
            java.lang.Class<com.amap.api.services.nearby.NearbySearch> r0 = com.amap.api.services.nearby.NearbySearch.class
            monitor-enter(r0)
            com.amap.api.services.nearby.NearbySearch r1 = com.amap.api.services.nearby.NearbySearch.a     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            r1.a()     // Catch: java.lang.Throwable -> Lb
            goto L16
        Lb:
            r1 = move-exception
            java.lang.String r2 = "NearbySearch"
            java.lang.String r3 = "destryoy"
            com.amap.api.col.s.j4.i(r1, r2, r3)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L1b
        L16:
            r1 = 0
            com.amap.api.services.nearby.NearbySearch.a = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    public static synchronized com.amap.api.services.nearby.NearbySearch getInstance(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            java.lang.Class<com.amap.api.services.nearby.NearbySearch> r0 = com.amap.api.services.nearby.NearbySearch.class
            monitor-enter(r0)
            com.amap.api.services.nearby.NearbySearch r1 = com.amap.api.services.nearby.NearbySearch.a     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L13
            com.amap.api.services.nearby.NearbySearch r1 = new com.amap.api.services.nearby.NearbySearch     // Catch: java.lang.Throwable -> Lf com.amap.api.services.core.AMapException -> L11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf com.amap.api.services.core.AMapException -> L11
            com.amap.api.services.nearby.NearbySearch.a = r1     // Catch: java.lang.Throwable -> Lf com.amap.api.services.core.AMapException -> L11
            goto L13
        Lf:
            r2 = move-exception
            goto L17
        L11:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> Lf
        L13:
            com.amap.api.services.nearby.NearbySearch r2 = com.amap.api.services.nearby.NearbySearch.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public synchronized void addNearbyListener(com.amap.api.services.nearby.NearbySearch.NearbyListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.addNearbyListener(r2)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r2 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public void clearUserInfoAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b
            if (r0 == 0) goto L7
            r0.clearUserInfoAsyn()
        L7:
            return
    }

    public synchronized void removeNearbyListener(com.amap.api.services.nearby.NearbySearch.NearbyListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.removeNearbyListener(r2)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r2 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public com.amap.api.services.nearby.NearbySearchResult searchNearbyInfo(com.amap.api.services.nearby.NearbySearch.NearbyQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b
            if (r0 == 0) goto L9
            com.amap.api.services.nearby.NearbySearchResult r2 = r0.searchNearbyInfo(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void searchNearbyInfoAsyn(com.amap.api.services.nearby.NearbySearch.NearbyQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b
            if (r0 == 0) goto L7
            r0.searchNearbyInfoAsyn(r2)
        L7:
            return
    }

    public void setUserID(java.lang.String r2) {
            r1 = this;
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b
            if (r0 == 0) goto L7
            r0.setUserID(r2)
        L7:
            return
    }

    public synchronized void startUploadNearbyInfoAuto(com.amap.api.services.nearby.UploadInfoCallback r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.startUploadNearbyInfoAuto(r2, r3)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r2 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public synchronized void stopUploadNearbyInfoAuto() {
            r1 = this;
            monitor-enter(r1)
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.stopUploadNearbyInfoAuto()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public void uploadNearbyInfoAsyn(com.amap.api.services.nearby.UploadInfo r2) {
            r1 = this;
            com.amap.api.services.interfaces.INearbySearch r0 = r1.f5243b
            if (r0 == 0) goto L7
            r0.uploadNearbyInfoAsyn(r2)
        L7:
            return
    }
}

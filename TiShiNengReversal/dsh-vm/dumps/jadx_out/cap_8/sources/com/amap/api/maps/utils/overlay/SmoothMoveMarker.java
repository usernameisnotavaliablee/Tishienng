package com.amap.api.maps.utils.overlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SmoothMoveMarker {
    public static final float MIN_OFFSET_DISTANCE = 5.0f;
    private com.amap.api.maps.model.BitmapDescriptor descriptor;
    private long duration;
    private java.util.LinkedList<java.lang.Double> eachDistance;
    java.util.concurrent.atomic.AtomicBoolean exitFlag;
    private int index;
    private com.amap.api.maps.AMap mAMap;
    private long mAnimationBeginTime;
    private java.lang.Object mLock;
    private long mStepDuration;
    private com.amap.api.col.p0003l.b8 mThreadPools;
    private com.amap.api.maps.model.Marker marker;
    private com.amap.api.maps.utils.overlay.SmoothMoveMarker.MoveListener moveListener;
    private com.amap.api.maps.utils.overlay.SmoothMoveMarker.a moveStatus;
    private long pauseMillis;
    private java.util.LinkedList<com.amap.api.maps.model.LatLng> points;
    private double remainDistance;
    private double totalDistance;
    private boolean useDefaultDescriptor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface MoveListener {
        void move(double r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum a extends java.lang.Enum<com.amap.api.maps.utils.overlay.SmoothMoveMarker.a> {
        public static final com.amap.api.maps.utils.overlay.SmoothMoveMarker.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.SmoothMoveMarker.a f5062b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.SmoothMoveMarker.a f5063c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.SmoothMoveMarker.a f5064d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.SmoothMoveMarker.a f5065e = null;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.maps.utils.overlay.SmoothMoveMarker.a[] f5066f = null;

        static {
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = new com.amap.api.maps.utils.overlay.SmoothMoveMarker$a
                java.lang.String r1 = "ACTION_UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.a = r0
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = new com.amap.api.maps.utils.overlay.SmoothMoveMarker$a
                java.lang.String r3 = "ACTION_START"
                r4 = 1
                r1.<init>(r3, r4)
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5062b = r1
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r3 = new com.amap.api.maps.utils.overlay.SmoothMoveMarker$a
                java.lang.String r5 = "ACTION_RUNNING"
                r6 = 2
                r3.<init>(r5, r6)
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5063c = r3
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r5 = new com.amap.api.maps.utils.overlay.SmoothMoveMarker$a
                java.lang.String r7 = "ACTION_PAUSE"
                r8 = 3
                r5.<init>(r7, r8)
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5064d = r5
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r7 = new com.amap.api.maps.utils.overlay.SmoothMoveMarker$a
                java.lang.String r9 = "ACTION_STOP"
                r10 = 4
                r7.<init>(r9, r10)
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5065e = r7
                r9 = 5
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a[] r9 = new com.amap.api.maps.utils.overlay.SmoothMoveMarker.a[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5066f = r9
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.amap.api.maps.utils.overlay.SmoothMoveMarker.a valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.utils.overlay.SmoothMoveMarker$a> r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = (com.amap.api.maps.utils.overlay.SmoothMoveMarker.a) r1
                return r1
        }

        public static com.amap.api.maps.utils.overlay.SmoothMoveMarker.a[] values() {
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a[] r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5066f
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a[] r0 = (com.amap.api.maps.utils.overlay.SmoothMoveMarker.a[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends com.amap.api.col.p0003l.c8 {
        final /* synthetic */ com.amap.api.maps.utils.overlay.SmoothMoveMarker a;

        private b(com.amap.api.maps.utils.overlay.SmoothMoveMarker r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(com.amap.api.maps.utils.overlay.SmoothMoveMarker r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r5 = this;
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$102(r0, r1)     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5062b     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$202(r0, r1)     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.exitFlag     // Catch: java.lang.Throwable -> L92
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L92
            L18:
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.exitFlag     // Catch: java.lang.Throwable -> L92
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L92
                if (r0 != 0) goto L8b
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                int r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$300(r0)     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r1 = r5.a     // Catch: java.lang.Throwable -> L92
                java.util.LinkedList r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$400(r1)     // Catch: java.lang.Throwable -> L92
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L92
                int r1 = r1 + (-1)
                if (r0 > r1) goto L8b
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                java.lang.Object r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$500(r0)     // Catch: java.lang.Throwable -> L92
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r1 = r5.a     // Catch: java.lang.Throwable -> L49
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.exitFlag     // Catch: java.lang.Throwable -> L49
                boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L49
                if (r1 == 0) goto L4b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                return
            L49:
                r1 = move-exception
                goto L89
            L4b:
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r1 = r5.a     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$200(r1)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r2 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5064d     // Catch: java.lang.Throwable -> L49
                if (r1 == r2) goto L7e
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r3 = r5.a     // Catch: java.lang.Throwable -> L49
                long r3 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$100(r3)     // Catch: java.lang.Throwable -> L49
                long r1 = r1 - r3
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r3 = r5.a     // Catch: java.lang.Throwable -> L49
                com.autonavi.amap.mapcore.IPoint r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$600(r3, r1)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r2 = r5.a     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.model.Marker r2 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$700(r2)     // Catch: java.lang.Throwable -> L49
                if (r2 == 0) goto L77
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r2 = r5.a     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.model.Marker r2 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$700(r2)     // Catch: java.lang.Throwable -> L49
                r2.setGeoPoint(r1)     // Catch: java.lang.Throwable -> L49
            L77:
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r1 = r5.a     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r2 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5063c     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$202(r1, r2)     // Catch: java.lang.Throwable -> L49
            L7e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                long r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$800(r0)     // Catch: java.lang.Throwable -> L92
                java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L92
                goto L18
            L89:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                throw r1     // Catch: java.lang.Throwable -> L92
            L8b:
                com.amap.api.maps.utils.overlay.SmoothMoveMarker r0 = r5.a     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5065e     // Catch: java.lang.Throwable -> L92
                com.amap.api.maps.utils.overlay.SmoothMoveMarker.access$202(r0, r1)     // Catch: java.lang.Throwable -> L92
            L92:
                return
        }
    }

    public SmoothMoveMarker(com.amap.api.maps.AMap r3) {
            r2 = this;
            r2.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.duration = r0
            r0 = 20
            r2.mStepDuration = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.points = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.eachDistance = r0
            r0 = 0
            r2.totalDistance = r0
            r2.remainDistance = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            r0 = 0
            r2.marker = r0
            r0 = 0
            r2.index = r0
            r2.useDefaultDescriptor = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r0)
            r2.exitFlag = r1
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.a
            r2.moveStatus = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mAnimationBeginTime = r0
            r2.mAMap = r3
            java.lang.String r3 = "AMapSmoothMoveMarkerThread"
            com.amap.api.col.3l.b8 r3 = com.amap.api.col.p0003l.a3.b(r3)
            r2.mThreadPools = r3
            return
    }

    static /* synthetic */ long access$100(com.amap.api.maps.utils.overlay.SmoothMoveMarker r2) {
            long r0 = r2.mAnimationBeginTime
            return r0
    }

    static /* synthetic */ long access$102(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0, long r1) {
            r0.mAnimationBeginTime = r1
            return r1
    }

    static /* synthetic */ com.amap.api.maps.utils.overlay.SmoothMoveMarker.a access$200(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0) {
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = r0.moveStatus
            return r0
    }

    static /* synthetic */ com.amap.api.maps.utils.overlay.SmoothMoveMarker.a access$202(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0, com.amap.api.maps.utils.overlay.SmoothMoveMarker.a r1) {
            r0.moveStatus = r1
            return r1
    }

    static /* synthetic */ int access$300(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0) {
            int r0 = r0.index
            return r0
    }

    static /* synthetic */ java.util.LinkedList access$400(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0) {
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r0 = r0.points
            return r0
    }

    static /* synthetic */ java.lang.Object access$500(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0) {
            java.lang.Object r0 = r0.mLock
            return r0
    }

    static /* synthetic */ com.autonavi.amap.mapcore.IPoint access$600(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0, long r1) {
            com.autonavi.amap.mapcore.IPoint r0 = r0.getCurPosition(r1)
            return r0
    }

    static /* synthetic */ com.amap.api.maps.model.Marker access$700(com.amap.api.maps.utils.overlay.SmoothMoveMarker r0) {
            com.amap.api.maps.model.Marker r0 = r0.marker
            return r0
    }

    static /* synthetic */ long access$800(com.amap.api.maps.utils.overlay.SmoothMoveMarker r2) {
            long r0 = r2.mStepDuration
            return r0
    }

    private void checkMarkerIcon() {
            r2 = this;
            boolean r0 = r2.useDefaultDescriptor
            if (r0 == 0) goto L14
            com.amap.api.maps.model.BitmapDescriptor r0 = r2.descriptor
            if (r0 != 0) goto Lc
            r0 = 1
            r2.useDefaultDescriptor = r0
            return
        Lc:
            com.amap.api.maps.model.Marker r1 = r2.marker
            r1.setIcon(r0)
            r0 = 0
            r2.useDefaultDescriptor = r0
        L14:
            return
    }

    private com.autonavi.amap.mapcore.IPoint getCurPosition(long r11) {
            r10 = this;
            long r0 = r10.duration
            r2 = 0
            r4 = 0
            r5 = 1
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 <= 0) goto L43
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.exitFlag
            r11.set(r5)
            com.autonavi.amap.mapcore.IPoint r11 = new com.autonavi.amap.mapcore.IPoint
            r11.<init>()
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r12 = r10.points
            int r12 = r12.size()
            int r12 = r12 - r5
            r10.index = r12
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r0 = r10.points
            java.lang.Object r12 = r0.get(r12)
            com.amap.api.maps.model.LatLng r12 = (com.amap.api.maps.model.LatLng) r12
            int r0 = r10.index
            int r0 = r0 - r5
            r10.index = r0
            int r0 = java.lang.Math.max(r0, r4)
            r10.index = r0
            r10.remainDistance = r2
            double r0 = r12.longitude
            double r2 = r12.latitude
            com.autonavi.amap.mapcore.MapProjection.lonlat2Geo(r0, r2, r11)
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$MoveListener r12 = r10.moveListener
            if (r12 == 0) goto L42
            double r0 = r10.remainDistance
            r12.move(r0)
        L42:
            return r11
        L43:
            double r11 = (double) r11
            double r6 = r10.totalDistance
            double r11 = r11 * r6
            double r0 = (double) r0
            double r11 = r11 / r0
            double r6 = r6 - r11
            r10.remainDistance = r6
            r0 = 0
        L4e:
            java.util.LinkedList<java.lang.Double> r1 = r10.eachDistance
            int r1 = r1.size()
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 >= r1) goto L73
            java.util.LinkedList<java.lang.Double> r1 = r10.eachDistance
            java.lang.Object r1 = r1.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r8 = r1.doubleValue()
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 <= 0) goto L6c
            double r11 = r11 - r8
            int r0 = r0 + 1
            goto L4e
        L6c:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 <= 0) goto L72
            double r6 = r11 / r8
        L72:
            r4 = r0
        L73:
            int r11 = r10.index
            if (r4 == r11) goto L80
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$MoveListener r11 = r10.moveListener
            if (r11 == 0) goto L80
            double r0 = r10.remainDistance
            r11.move(r0)
        L80:
            r10.index = r4
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r11 = r10.points
            java.lang.Object r11 = r11.get(r4)
            com.amap.api.maps.model.LatLng r11 = (com.amap.api.maps.model.LatLng) r11
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r12 = r10.points
            int r4 = r4 + r5
            java.lang.Object r12 = r12.get(r4)
            com.amap.api.maps.model.LatLng r12 = (com.amap.api.maps.model.LatLng) r12
            com.autonavi.amap.mapcore.IPoint r0 = new com.autonavi.amap.mapcore.IPoint
            r0.<init>()
            double r1 = r11.longitude
            double r3 = r11.latitude
            com.autonavi.amap.mapcore.MapProjection.lonlat2Geo(r1, r3, r0)
            com.autonavi.amap.mapcore.IPoint r1 = new com.autonavi.amap.mapcore.IPoint
            r1.<init>()
            double r2 = r12.longitude
            double r4 = r12.latitude
            com.autonavi.amap.mapcore.MapProjection.lonlat2Geo(r2, r4, r1)
            int r2 = r1.x
            int r3 = r0.x
            int r2 = r2 - r3
            int r3 = r1.y
            int r4 = r0.y
            int r3 = r3 - r4
            float r11 = com.amap.api.maps.AMapUtils.calculateLineDistance(r11, r12)
            r12 = 1084227584(0x40a00000, float:5.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto Ld8
            float r11 = r10.getRotate(r0, r1)
            com.amap.api.maps.AMap r12 = r10.mAMap
            if (r12 == 0) goto Ld8
            com.amap.api.maps.model.CameraPosition r12 = r12.getCameraPosition()
            if (r12 == 0) goto Ld8
            com.amap.api.maps.model.Marker r1 = r10.marker
            r4 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 - r11
            float r11 = r12.bearing
            float r4 = r4 + r11
            r1.setRotateAngle(r4)
        Ld8:
            com.autonavi.amap.mapcore.IPoint r11 = new com.autonavi.amap.mapcore.IPoint
            int r12 = r0.x
            double r4 = (double) r12
            double r1 = (double) r2
            double r1 = r1 * r6
            double r4 = r4 + r1
            int r12 = (int) r4
            int r0 = r0.y
            double r0 = (double) r0
            double r2 = (double) r3
            double r2 = r2 * r6
            double r0 = r0 + r2
            int r0 = (int) r0
            r11.<init>(r12, r0)
            return r11
    }

    private float getRotate(com.autonavi.amap.mapcore.IPoint r7, com.autonavi.amap.mapcore.IPoint r8) {
            r6 = this;
            if (r7 == 0) goto L26
            if (r8 != 0) goto L5
            goto L26
        L5:
            int r0 = r8.y
            double r0 = (double) r0
            int r2 = r7.y
            double r2 = (double) r2
            int r7 = r7.x
            double r4 = (double) r7
            int r7 = r8.x
            double r7 = (double) r7
            double r7 = r7 - r4
            double r2 = r2 - r0
            double r7 = java.lang.Math.atan2(r7, r2)
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 / r0
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r7 * r0
            float r7 = (float) r7
            return r7
        L26:
            r7 = 0
            return r7
    }

    private void reset() {
            r5 = this;
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = r5.moveStatus     // Catch: java.lang.Exception -> L28
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5063c     // Catch: java.lang.Exception -> L28
            if (r0 == r1) goto La
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5064d     // Catch: java.lang.Exception -> L28
            if (r0 != r1) goto L28
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.exitFlag     // Catch: java.lang.Exception -> L28
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Exception -> L28
            com.amap.api.col.3l.b8 r0 = r5.mThreadPools     // Catch: java.lang.Exception -> L28
            long r1 = r5.mStepDuration     // Catch: java.lang.Exception -> L28
            r3 = 20
            long r1 = r1 + r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L28
            r0.a(r1, r3)     // Catch: java.lang.Exception -> L28
            com.amap.api.maps.model.Marker r0 = r5.marker     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L24
            r1 = 0
            r0.setAnimation(r1)     // Catch: java.lang.Exception -> L28
        L24:
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.a     // Catch: java.lang.Exception -> L28
            r5.moveStatus = r0     // Catch: java.lang.Exception -> L28
        L28:
            return
    }

    public void destroy() {
            r2 = this;
            r2.reset()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.3l.b8 r0 = r2.mThreadPools     // Catch: java.lang.Throwable -> L2b
            r0.g()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.maps.model.BitmapDescriptor r0 = r2.descriptor     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Lf
            r0.recycle()     // Catch: java.lang.Throwable -> L2b
        Lf:
            com.amap.api.maps.model.Marker r0 = r2.marker     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L19
            r0.destroy()     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            r2.marker = r0     // Catch: java.lang.Throwable -> L2b
        L19:
            java.lang.Object r0 = r2.mLock     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2b
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r1 = r2.points     // Catch: java.lang.Throwable -> L28
            r1.clear()     // Catch: java.lang.Throwable -> L28
            java.util.LinkedList<java.lang.Double> r1 = r2.eachDistance     // Catch: java.lang.Throwable -> L28
            r1.clear()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L2b
        L2b:
            return
    }

    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public com.amap.api.maps.model.Marker getMarker() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            return r0
    }

    public com.amap.api.maps.model.LatLng getPosition() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.amap.api.maps.model.LatLng r0 = r0.getPosition()
            return r0
    }

    public void removeMarker() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            if (r0 == 0) goto La
            r0.remove()
            r0 = 0
            r1.marker = r0
        La:
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r0 = r1.points
            r0.clear()
            java.util.LinkedList<java.lang.Double> r0 = r1.eachDistance
            r0.clear()
            return
    }

    public void resetIndex() {
            r1 = this;
            r0 = 0
            r1.index = r0
            return
    }

    public void setDescriptor(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.descriptor
            if (r0 == 0) goto L7
            r0.recycle()
        L7:
            r1.descriptor = r2
            com.amap.api.maps.model.Marker r0 = r1.marker
            if (r0 == 0) goto L10
            r0.setIcon(r2)
        L10:
            return
    }

    public void setMoveListener(com.amap.api.maps.utils.overlay.SmoothMoveMarker.MoveListener r1) {
            r0 = this;
            r0.moveListener = r1
            return
    }

    public void setPoints(java.util.List<com.amap.api.maps.model.LatLng> r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            if (r7 == 0) goto Lb4
            int r1 = r7.size()     // Catch: java.lang.Throwable -> Lb0
            r2 = 2
            if (r1 >= r2) goto Le
            goto Lb4
        Le:
            r6.stopMove()     // Catch: java.lang.Throwable -> Lb0
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r1 = r6.points     // Catch: java.lang.Throwable -> Lb0
            r1.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lb0
        L1a:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L1a
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r2 = r6.points     // Catch: java.lang.Throwable -> Lb0
            r2.add(r1)     // Catch: java.lang.Throwable -> Lb0
            goto L1a
        L2e:
            java.util.LinkedList<java.lang.Double> r7 = r6.eachDistance     // Catch: java.lang.Throwable -> Lb0
            r7.clear()     // Catch: java.lang.Throwable -> Lb0
            r1 = 0
            r6.totalDistance = r1     // Catch: java.lang.Throwable -> Lb0
            r7 = 0
            r1 = 0
        L39:
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r2 = r6.points     // Catch: java.lang.Throwable -> Lb0
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lb0
            r3 = 1
            int r2 = r2 - r3
            if (r1 >= r2) goto L69
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r2 = r6.points     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> Lb0
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r3 = r6.points     // Catch: java.lang.Throwable -> Lb0
            int r1 = r1 + 1
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> Lb0
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r3)     // Catch: java.lang.Throwable -> Lb0
            double r2 = (double) r2     // Catch: java.lang.Throwable -> Lb0
            java.util.LinkedList<java.lang.Double> r4 = r6.eachDistance     // Catch: java.lang.Throwable -> Lb0
            java.lang.Double r5 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Throwable -> Lb0
            r4.add(r5)     // Catch: java.lang.Throwable -> Lb0
            double r4 = r6.totalDistance     // Catch: java.lang.Throwable -> Lb0
            double r4 = r4 + r2
            r6.totalDistance = r4     // Catch: java.lang.Throwable -> Lb0
            goto L39
        L69:
            double r1 = r6.totalDistance     // Catch: java.lang.Throwable -> Lb0
            r6.remainDistance = r1     // Catch: java.lang.Throwable -> Lb0
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r1 = r6.points     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.LatLng r7 = (com.amap.api.maps.model.LatLng) r7     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.Marker r1 = r6.marker     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L80
            r1.setPosition(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.checkMarkerIcon()     // Catch: java.lang.Throwable -> Lb0
            goto Lad
        L80:
            com.amap.api.maps.model.BitmapDescriptor r1 = r6.descriptor     // Catch: java.lang.Throwable -> Lb0
            if (r1 != 0) goto L86
            r6.useDefaultDescriptor = r3     // Catch: java.lang.Throwable -> Lb0
        L86:
            com.amap.api.maps.AMap r1 = r6.mAMap     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions     // Catch: java.lang.Throwable -> Lb0
            r2.<init>()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.MarkerOptions r2 = r2.belowMaskLayer(r3)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.MarkerOptions r7 = r2.position(r7)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.BitmapDescriptor r2 = r6.descriptor     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.MarkerOptions r7 = r7.icon(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = ""
            com.amap.api.maps.model.MarkerOptions r7 = r7.title(r2)     // Catch: java.lang.Throwable -> Lb0
            r2 = 1056964608(0x3f000000, float:0.5)
            com.amap.api.maps.model.MarkerOptions r7 = r7.anchor(r2, r2)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.Marker r7 = r1.addMarker(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.marker = r7     // Catch: java.lang.Throwable -> Lb0
        Lad:
            r6.reset()     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            return
        Lb2:
            r7 = move-exception
            goto Lb6
        Lb4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            return
        Lb6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            throw r7
    }

    public void setPosition(com.amap.api.maps.model.LatLng r4) {
            r3 = this;
            com.amap.api.maps.model.Marker r0 = r3.marker
            if (r0 == 0) goto Lb
            r0.setPosition(r4)
            r3.checkMarkerIcon()
            return
        Lb:
            com.amap.api.maps.model.BitmapDescriptor r0 = r3.descriptor
            r1 = 1
            if (r0 != 0) goto L12
            r3.useDefaultDescriptor = r1
        L12:
            com.amap.api.maps.AMap r0 = r3.mAMap
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions
            r2.<init>()
            com.amap.api.maps.model.MarkerOptions r1 = r2.belowMaskLayer(r1)
            com.amap.api.maps.model.MarkerOptions r4 = r1.position(r4)
            com.amap.api.maps.model.BitmapDescriptor r1 = r3.descriptor
            com.amap.api.maps.model.MarkerOptions r4 = r4.icon(r1)
            java.lang.String r1 = ""
            com.amap.api.maps.model.MarkerOptions r4 = r4.title(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            com.amap.api.maps.model.MarkerOptions r4 = r4.anchor(r1, r1)
            com.amap.api.maps.model.Marker r4 = r0.addMarker(r4)
            r3.marker = r4
            return
    }

    public void setRotate(float r4) {
            r3 = this;
            com.amap.api.maps.model.Marker r0 = r3.marker
            if (r0 == 0) goto L1b
            com.amap.api.maps.AMap r0 = r3.mAMap
            if (r0 == 0) goto L1b
            if (r0 == 0) goto L1b
            com.amap.api.maps.model.CameraPosition r0 = r0.getCameraPosition()
            if (r0 == 0) goto L1b
            com.amap.api.maps.model.Marker r1 = r3.marker
            r2 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 - r4
            float r4 = r0.bearing
            float r2 = r2 + r4
            r1.setRotateAngle(r2)
        L1b:
            return
    }

    public void setTotalDuration(int r3) {
            r2 = this;
            int r3 = r3 * 1000
            long r0 = (long) r3
            r2.duration = r0
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            if (r0 == 0) goto L7
            r0.setVisible(r2)
        L7:
            return
    }

    public void startSmoothMove() {
            r4 = this;
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = r4.moveStatus
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5064d
            if (r0 != r1) goto L17
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5063c
            r4.moveStatus = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.pauseMillis
            long r0 = r0 - r2
            long r2 = r4.mAnimationBeginTime
            long r2 = r2 + r0
            r4.mAnimationBeginTime = r2
            return
        L17:
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.a
            if (r0 == r1) goto L1f
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5065e
            if (r0 != r1) goto L35
        L1f:
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r0 = r4.points
            int r0 = r0.size()
            if (r0 > 0) goto L28
            goto L35
        L28:
            r0 = 0
            r4.index = r0
            com.amap.api.col.3l.b8 r1 = r4.mThreadPools     // Catch: java.lang.Throwable -> L35
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$b r2 = new com.amap.api.maps.utils.overlay.SmoothMoveMarker$b     // Catch: java.lang.Throwable -> L35
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L35
            r1.b(r2)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    public void stopMove() {
            r2 = this;
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = r2.moveStatus
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r1 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5063c
            if (r0 != r1) goto L10
            com.amap.api.maps.utils.overlay.SmoothMoveMarker$a r0 = com.amap.api.maps.utils.overlay.SmoothMoveMarker.a.f5064d
            r2.moveStatus = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.pauseMillis = r0
        L10:
            return
    }
}

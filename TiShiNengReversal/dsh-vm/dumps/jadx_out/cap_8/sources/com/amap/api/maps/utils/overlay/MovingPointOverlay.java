package com.amap.api.maps.utils.overlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MovingPointOverlay {
    private com.amap.api.maps.utils.overlay.MovingPointOverlay.a STATUS;
    private com.amap.api.maps.model.BasePointOverlay baseOverlay;
    private long duration;
    private java.util.LinkedList<java.lang.Double> eachDistance;
    java.util.concurrent.atomic.AtomicBoolean exitFlag;
    private int index;
    private com.amap.api.maps.AMap mAMap;
    private long mAnimationBeginTime;
    private java.lang.Object mLock;
    private long mStepDuration;
    private com.amap.api.col.p0003l.b8 mThreadPools;
    private com.amap.api.maps.utils.overlay.MovingPointOverlay.MoveListener moveListener;
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
    private enum a extends java.lang.Enum<com.amap.api.maps.utils.overlay.MovingPointOverlay.a> {
        public static final com.amap.api.maps.utils.overlay.MovingPointOverlay.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.MovingPointOverlay.a f5057b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.MovingPointOverlay.a f5058c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.MovingPointOverlay.a f5059d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final com.amap.api.maps.utils.overlay.MovingPointOverlay.a f5060e = null;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.maps.utils.overlay.MovingPointOverlay.a[] f5061f = null;

        static {
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r0 = new com.amap.api.maps.utils.overlay.MovingPointOverlay$a
                java.lang.String r1 = "ACTION_UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                com.amap.api.maps.utils.overlay.MovingPointOverlay.a.a = r0
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = new com.amap.api.maps.utils.overlay.MovingPointOverlay$a
                java.lang.String r3 = "ACTION_START"
                r4 = 1
                r1.<init>(r3, r4)
                com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5057b = r1
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r3 = new com.amap.api.maps.utils.overlay.MovingPointOverlay$a
                java.lang.String r5 = "ACTION_RUNNING"
                r6 = 2
                r3.<init>(r5, r6)
                com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5058c = r3
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r5 = new com.amap.api.maps.utils.overlay.MovingPointOverlay$a
                java.lang.String r7 = "ACTION_PAUSE"
                r8 = 3
                r5.<init>(r7, r8)
                com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5059d = r5
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r7 = new com.amap.api.maps.utils.overlay.MovingPointOverlay$a
                java.lang.String r9 = "ACTION_STOP"
                r10 = 4
                r7.<init>(r9, r10)
                com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5060e = r7
                r9 = 5
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a[] r9 = new com.amap.api.maps.utils.overlay.MovingPointOverlay.a[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5061f = r9
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.amap.api.maps.utils.overlay.MovingPointOverlay.a valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.utils.overlay.MovingPointOverlay$a> r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = (com.amap.api.maps.utils.overlay.MovingPointOverlay.a) r1
                return r1
        }

        public static com.amap.api.maps.utils.overlay.MovingPointOverlay.a[] values() {
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a[] r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5061f
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a[] r0 = (com.amap.api.maps.utils.overlay.MovingPointOverlay.a[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends com.amap.api.col.p0003l.c8 {
        final /* synthetic */ com.amap.api.maps.utils.overlay.MovingPointOverlay a;

        private b(com.amap.api.maps.utils.overlay.MovingPointOverlay r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(com.amap.api.maps.utils.overlay.MovingPointOverlay r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r5 = this;
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay.access$102(r0, r1)     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5057b     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay.access$202(r0, r1)     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.exitFlag     // Catch: java.lang.Throwable -> L8a
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L8a
            L18:
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.exitFlag     // Catch: java.lang.Throwable -> L8a
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L8a
                if (r0 != 0) goto L83
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                int r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$300(r0)     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay r1 = r5.a     // Catch: java.lang.Throwable -> L8a
                java.util.LinkedList r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$400(r1)     // Catch: java.lang.Throwable -> L8a
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L8a
                int r1 = r1 + (-1)
                if (r0 > r1) goto L83
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                java.lang.Object r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$500(r0)     // Catch: java.lang.Throwable -> L8a
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay r1 = r5.a     // Catch: java.lang.Throwable -> L49
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.exitFlag     // Catch: java.lang.Throwable -> L49
                boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L49
                if (r1 == 0) goto L4b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                return
            L49:
                r1 = move-exception
                goto L81
            L4b:
                com.amap.api.maps.utils.overlay.MovingPointOverlay r1 = r5.a     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$200(r1)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r2 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5059d     // Catch: java.lang.Throwable -> L49
                if (r1 == r2) goto L76
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay r3 = r5.a     // Catch: java.lang.Throwable -> L49
                long r3 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$100(r3)     // Catch: java.lang.Throwable -> L49
                long r1 = r1 - r3
                com.amap.api.maps.utils.overlay.MovingPointOverlay r3 = r5.a     // Catch: java.lang.Throwable -> L49
                com.autonavi.amap.mapcore.IPoint r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$600(r3, r1)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay r2 = r5.a     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.model.BasePointOverlay r2 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$700(r2)     // Catch: java.lang.Throwable -> L49
                r2.setGeoPoint(r1)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay r1 = r5.a     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r2 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5058c     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay.access$202(r1, r2)     // Catch: java.lang.Throwable -> L49
            L76:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                long r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.access$800(r0)     // Catch: java.lang.Throwable -> L8a
                java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L8a
                goto L18
            L81:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                throw r1     // Catch: java.lang.Throwable -> L8a
            L83:
                com.amap.api.maps.utils.overlay.MovingPointOverlay r0 = r5.a     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5060e     // Catch: java.lang.Throwable -> L8a
                com.amap.api.maps.utils.overlay.MovingPointOverlay.access$202(r0, r1)     // Catch: java.lang.Throwable -> L8a
            L8a:
                return
        }
    }

    public MovingPointOverlay(com.amap.api.maps.AMap r3, com.amap.api.maps.model.BasePointOverlay r4) {
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
            r2.baseOverlay = r0
            r0 = 0
            r2.index = r0
            r2.useDefaultDescriptor = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r0)
            r2.exitFlag = r1
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.a
            r2.STATUS = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mAnimationBeginTime = r0
            if (r3 == 0) goto L50
            if (r4 != 0) goto L44
            goto L50
        L44:
            r2.mAMap = r3
            java.lang.String r3 = "AMapMoveSmoothThread"
            com.amap.api.col.3l.b8 r3 = com.amap.api.col.p0003l.a3.b(r3)
            r2.mThreadPools = r3
            r2.baseOverlay = r4
        L50:
            return
    }

    static /* synthetic */ long access$100(com.amap.api.maps.utils.overlay.MovingPointOverlay r2) {
            long r0 = r2.mAnimationBeginTime
            return r0
    }

    static /* synthetic */ long access$102(com.amap.api.maps.utils.overlay.MovingPointOverlay r0, long r1) {
            r0.mAnimationBeginTime = r1
            return r1
    }

    static /* synthetic */ com.amap.api.maps.utils.overlay.MovingPointOverlay.a access$200(com.amap.api.maps.utils.overlay.MovingPointOverlay r0) {
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r0 = r0.STATUS
            return r0
    }

    static /* synthetic */ com.amap.api.maps.utils.overlay.MovingPointOverlay.a access$202(com.amap.api.maps.utils.overlay.MovingPointOverlay r0, com.amap.api.maps.utils.overlay.MovingPointOverlay.a r1) {
            r0.STATUS = r1
            return r1
    }

    static /* synthetic */ int access$300(com.amap.api.maps.utils.overlay.MovingPointOverlay r0) {
            int r0 = r0.index
            return r0
    }

    static /* synthetic */ java.util.LinkedList access$400(com.amap.api.maps.utils.overlay.MovingPointOverlay r0) {
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r0 = r0.points
            return r0
    }

    static /* synthetic */ java.lang.Object access$500(com.amap.api.maps.utils.overlay.MovingPointOverlay r0) {
            java.lang.Object r0 = r0.mLock
            return r0
    }

    static /* synthetic */ com.autonavi.amap.mapcore.IPoint access$600(com.amap.api.maps.utils.overlay.MovingPointOverlay r0, long r1) {
            com.autonavi.amap.mapcore.IPoint r0 = r0.getCurPosition(r1)
            return r0
    }

    static /* synthetic */ com.amap.api.maps.model.BasePointOverlay access$700(com.amap.api.maps.utils.overlay.MovingPointOverlay r0) {
            com.amap.api.maps.model.BasePointOverlay r0 = r0.baseOverlay
            return r0
    }

    static /* synthetic */ long access$800(com.amap.api.maps.utils.overlay.MovingPointOverlay r2) {
            long r0 = r2.mStepDuration
            return r0
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
            com.amap.api.maps.utils.overlay.MovingPointOverlay$MoveListener r12 = r10.moveListener
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
            com.amap.api.maps.utils.overlay.MovingPointOverlay$MoveListener r11 = r10.moveListener
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
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto Ld8
            float r11 = r10.getRotate(r0, r1)
            com.amap.api.maps.AMap r12 = r10.mAMap
            if (r12 == 0) goto Ld8
            com.amap.api.maps.model.CameraPosition r12 = r12.getCameraPosition()
            if (r12 == 0) goto Ld8
            com.amap.api.maps.model.BasePointOverlay r1 = r10.baseOverlay
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
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r0 = r5.STATUS     // Catch: java.lang.Exception -> L26
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5058c     // Catch: java.lang.Exception -> L26
            if (r0 == r1) goto La
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5059d     // Catch: java.lang.Exception -> L26
            if (r0 != r1) goto L26
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.exitFlag     // Catch: java.lang.Exception -> L26
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Exception -> L26
            com.amap.api.col.3l.b8 r0 = r5.mThreadPools     // Catch: java.lang.Exception -> L26
            long r1 = r5.mStepDuration     // Catch: java.lang.Exception -> L26
            r3 = 20
            long r1 = r1 + r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L26
            r0.a(r1, r3)     // Catch: java.lang.Exception -> L26
            com.amap.api.maps.model.BasePointOverlay r0 = r5.baseOverlay     // Catch: java.lang.Exception -> L26
            r1 = 0
            r0.setAnimation(r1)     // Catch: java.lang.Exception -> L26
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.a     // Catch: java.lang.Exception -> L26
            r5.STATUS = r0     // Catch: java.lang.Exception -> L26
        L26:
            return
    }

    public void destroy() {
            r2 = this;
            r2.removeMarker()     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.3l.b8 r0 = r2.mThreadPools     // Catch: java.lang.Throwable -> L1a
            r0.g()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r2.mLock     // Catch: java.lang.Throwable -> L1a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r1 = r2.points     // Catch: java.lang.Throwable -> L17
            r1.clear()     // Catch: java.lang.Throwable -> L17
            java.util.LinkedList<java.lang.Double> r1 = r2.eachDistance     // Catch: java.lang.Throwable -> L17
            r1.clear()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public com.amap.api.maps.model.BasePointOverlay getObject() {
            r1 = this;
            com.amap.api.maps.model.BasePointOverlay r0 = r1.baseOverlay
            return r0
    }

    public com.amap.api.maps.model.LatLng getPosition() {
            r1 = this;
            com.amap.api.maps.model.BasePointOverlay r0 = r1.baseOverlay
            if (r0 == 0) goto L9
            com.amap.api.maps.model.LatLng r0 = r0.getPosition()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void removeMarker() {
            r1 = this;
            r1.reset()     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.BasePointOverlay r0 = r1.baseOverlay     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Ld
            r0.remove()     // Catch: java.lang.Throwable -> L17
            r0 = 0
            r1.baseOverlay = r0     // Catch: java.lang.Throwable -> L17
        Ld:
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> L17
            r0.clear()     // Catch: java.lang.Throwable -> L17
            java.util.LinkedList<java.lang.Double> r0 = r1.eachDistance     // Catch: java.lang.Throwable -> L17
            r0.clear()     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public void resetIndex() {
            r1 = this;
            r0 = 0
            r1.index = r0
            return
    }

    public void setMoveListener(com.amap.api.maps.utils.overlay.MovingPointOverlay.MoveListener r1) {
            r0 = this;
            r0.moveListener = r1
            return
    }

    public void setPoints(java.util.List<com.amap.api.maps.model.LatLng> r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            if (r7 == 0) goto L80
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L7c
            r2 = 2
            if (r1 >= r2) goto Ld
            goto L80
        Ld:
            r6.stopMove()     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r1 = r6.points     // Catch: java.lang.Throwable -> L7c
            r1.clear()     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L7c
        L19:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L19
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r2 = r6.points     // Catch: java.lang.Throwable -> L7c
            r2.add(r1)     // Catch: java.lang.Throwable -> L7c
            goto L19
        L2d:
            java.util.LinkedList<java.lang.Double> r7 = r6.eachDistance     // Catch: java.lang.Throwable -> L7c
            r7.clear()     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            r6.totalDistance = r1     // Catch: java.lang.Throwable -> L7c
            r7 = 0
            r1 = 0
        L38:
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r2 = r6.points     // Catch: java.lang.Throwable -> L7c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L68
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r2 = r6.points     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r3 = r6.points     // Catch: java.lang.Throwable -> L7c
            int r1 = r1 + 1
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> L7c
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r3)     // Catch: java.lang.Throwable -> L7c
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedList<java.lang.Double> r4 = r6.eachDistance     // Catch: java.lang.Throwable -> L7c
            java.lang.Double r5 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Throwable -> L7c
            r4.add(r5)     // Catch: java.lang.Throwable -> L7c
            double r4 = r6.totalDistance     // Catch: java.lang.Throwable -> L7c
            double r4 = r4 + r2
            r6.totalDistance = r4     // Catch: java.lang.Throwable -> L7c
            goto L38
        L68:
            double r1 = r6.totalDistance     // Catch: java.lang.Throwable -> L7c
            r6.remainDistance = r1     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedList<com.amap.api.maps.model.LatLng> r1 = r6.points     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.LatLng r7 = (com.amap.api.maps.model.LatLng) r7     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.BasePointOverlay r1 = r6.baseOverlay     // Catch: java.lang.Throwable -> L7c
            r1.setPosition(r7)     // Catch: java.lang.Throwable -> L7c
            r6.reset()     // Catch: java.lang.Throwable -> L7c
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            return
        L7e:
            r7 = move-exception
            goto L82
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            return
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r7
    }

    public void setPosition(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.amap.api.maps.model.BasePointOverlay r0 = r1.baseOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setPosition(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setRotate(float r4) {
            r3 = this;
            com.amap.api.maps.model.BasePointOverlay r0 = r3.baseOverlay     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            com.amap.api.maps.AMap r0 = r3.mAMap     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            com.amap.api.maps.model.CameraPosition r0 = r0.getCameraPosition()     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            com.amap.api.maps.model.BasePointOverlay r1 = r3.baseOverlay     // Catch: java.lang.Exception -> L19
            r2 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 - r4
            float r4 = r0.bearing     // Catch: java.lang.Exception -> L19
            float r2 = r2 + r4
            r1.setRotateAngle(r2)     // Catch: java.lang.Exception -> L19
        L19:
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
            com.amap.api.maps.model.BasePointOverlay r0 = r1.baseOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setVisible(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void startSmoothMove() {
            r4 = this;
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r0 = r4.STATUS
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5059d
            if (r0 != r1) goto L17
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r0 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5058c
            r4.STATUS = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.pauseMillis
            long r0 = r0 - r2
            long r2 = r4.mAnimationBeginTime
            long r2 = r2 + r0
            r4.mAnimationBeginTime = r2
            return
        L17:
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.a
            if (r0 == r1) goto L1f
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5060e
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
            com.amap.api.maps.utils.overlay.MovingPointOverlay$b r2 = new com.amap.api.maps.utils.overlay.MovingPointOverlay$b     // Catch: java.lang.Throwable -> L35
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L35
            r1.b(r2)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    public void stopMove() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = r3.STATUS     // Catch: java.lang.Throwable -> L14
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r2 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5058c     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto L16
            com.amap.api.maps.utils.overlay.MovingPointOverlay$a r1 = com.amap.api.maps.utils.overlay.MovingPointOverlay.a.f5059d     // Catch: java.lang.Throwable -> L14
            r3.STATUS = r1     // Catch: java.lang.Throwable -> L14
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14
            r3.pauseMillis = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }
}

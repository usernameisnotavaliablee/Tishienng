package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ja {
    com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    android.content.Context f3578b;

    /* renamed from: c, reason: collision with root package name */
    android.view.GestureDetector f3579c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.p0003l.w f3580d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.u f3581e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.p0003l.t f3582f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.x f3583g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3584h;

    /* renamed from: i, reason: collision with root package name */
    private int f3585i;

    /* renamed from: j, reason: collision with root package name */
    private int f3586j;

    /* renamed from: k, reason: collision with root package name */
    private int f3587k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    public com.amap.api.maps.model.AMapGestureListener s;
    private android.os.Handler t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        float f3588b;

        /* renamed from: c, reason: collision with root package name */
        private com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo f3589c;

        /* renamed from: d, reason: collision with root package name */
        long f3590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ja f3591e;

        private a(com.amap.api.col.p0003l.ja r3) {
                r2 = this;
                r2.f3591e = r3
                r2.<init>()
                r3 = 0
                r2.a = r3
                r3 = 0
                r2.f3588b = r3
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r3 = new com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo
                r3.<init>()
                r2.f3589c = r3
                r0 = 0
                r2.f3590d = r0
                return
        }

        /* synthetic */ a(com.amap.api.col.p0003l.ja r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(android.view.MotionEvent r4) {
                r3 = this;
                com.amap.api.col.3l.ja r0 = r3.f3591e
                android.view.GestureDetector r0 = r0.f3579c
                r1 = 0
                r0.setIsLongpressEnabled(r1)
                int r0 = r4.getPointerCount()
                r3.a = r0
                com.amap.api.col.3l.ja r0 = r3.f3591e
                com.amap.api.maps.model.AMapGestureListener r0 = r0.s
                if (r0 == 0) goto L1f
                float r2 = r4.getX()
                float r4 = r4.getY()
                r0.onDoubleTap(r2, r4)
            L1f:
                return r1
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(android.view.MotionEvent r10) {
                r9 = this;
                int r0 = r9.a
                int r1 = r10.getPointerCount()
                if (r0 >= r1) goto Le
                int r0 = r10.getPointerCount()
                r9.a = r0
            Le:
                int r0 = r10.getAction()
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r1 = r9.a
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L13d
                com.amap.api.col.3l.ja r1 = r9.f3591e     // Catch: java.lang.Throwable -> L30
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a     // Catch: java.lang.Throwable -> L30
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r1 = r1.getUiSettings()     // Catch: java.lang.Throwable -> L30
                boolean r1 = r1.isZoomGesturesEnabled()     // Catch: java.lang.Throwable -> L30
                if (r1 != 0) goto L38
                com.amap.api.col.3l.ja r1 = r9.f3591e     // Catch: java.lang.Throwable -> L30
                android.view.GestureDetector r1 = r1.f3579c     // Catch: java.lang.Throwable -> L30
                r1.setIsLongpressEnabled(r2)     // Catch: java.lang.Throwable -> L30
                return r3
            L30:
                r1 = move-exception
                java.lang.String r4 = "GLMapGestrureDetector"
                java.lang.String r5 = "onDoubleTapEvent"
                com.amap.api.col.p0003l.w5.p(r1, r4, r5)
            L38:
                r1 = 2
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 9
                if (r0 != 0) goto L7a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r9.f3589c
                r0.mGestureState = r2
                r0.mGestureType = r5
                float r5 = r10.getX()
                float r6 = r10.getY()
                float[] r1 = new float[r1]
                r1[r3] = r5
                r1[r2] = r6
                r0.mLocation = r1
                com.amap.api.col.3l.ja r0 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = r9.f3589c
                int r0 = r0.getEngineIDWithGestureInfo(r1)
                float r10 = r10.getY()
                r9.f3588b = r10
                com.amap.api.col.3l.ja r10 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r10 = r10.a
                r1 = 100
                com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r1 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.obtain(r1, r4, r3, r3)
                r10.addGestureMapMessage(r0, r1)
                long r0 = android.os.SystemClock.uptimeMillis()
                r9.f3590d = r0
                goto L13c
            L7a:
                if (r0 != r1) goto Ld4
                com.amap.api.col.3l.ja r0 = r9.f3591e
                com.amap.api.col.p0003l.ja.f(r0, r2)
                float r0 = r9.f3588b
                float r4 = r10.getY()
                float r0 = r0 - r4
                float r4 = java.lang.Math.abs(r0)
                r6 = 1101004800(0x41a00000, float:20.0)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 < 0) goto L13c
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r4 = r9.f3589c
                r4.mGestureState = r1
                r4.mGestureType = r5
                float r5 = r10.getX()
                float r6 = r10.getY()
                float[] r1 = new float[r1]
                r1[r3] = r5
                r1[r2] = r6
                r4.mLocation = r1
                com.amap.api.col.3l.ja r1 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r4 = r9.f3589c
                int r1 = r1.getEngineIDWithGestureInfo(r4)
                r4 = 1082130432(0x40800000, float:4.0)
                float r0 = r0 * r4
                com.amap.api.col.3l.ja r4 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r4.a
                int r4 = r4.getMapHeight()
                float r4 = (float) r4
                float r0 = r0 / r4
                com.amap.api.col.3l.ja r4 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r4.a
                r5 = 101(0x65, float:1.42E-43)
                com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r0 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.obtain(r5, r0, r3, r3)
                r4.addGestureMapMessage(r1, r0)
                float r10 = r10.getY()
                r9.f3588b = r10
                goto L13c
            Ld4:
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r6 = r9.f3589c
                r7 = 3
                r6.mGestureState = r7
                r6.mGestureType = r5
                float r5 = r10.getX()
                float r8 = r10.getY()
                float[] r1 = new float[r1]
                r1[r3] = r5
                r1[r2] = r8
                r6.mLocation = r1
                com.amap.api.col.3l.ja r1 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r5 = r9.f3589c
                int r1 = r1.getEngineIDWithGestureInfo(r5)
                com.amap.api.col.3l.ja r5 = r9.f3591e
                android.view.GestureDetector r5 = r5.f3579c
                r5.setIsLongpressEnabled(r2)
                com.amap.api.col.3l.ja r5 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r5 = r5.a
                r6 = 102(0x66, float:1.43E-43)
                com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r4 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.obtain(r6, r4, r3, r3)
                r5.addGestureMapMessage(r1, r4)
                if (r0 != r2) goto L137
                com.amap.api.col.3l.ja r0 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                r0.setGestureStatus(r1, r7)
                long r4 = android.os.SystemClock.uptimeMillis()
                long r6 = r9.f3590d
                long r4 = r4 - r6
                com.amap.api.col.3l.ja r0 = r9.f3591e
                boolean r0 = com.amap.api.col.p0003l.ja.n(r0)
                if (r0 == 0) goto L12e
                r6 = 200(0xc8, double:9.9E-322)
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L128
                goto L12e
            L128:
                com.amap.api.col.3l.ja r10 = r9.f3591e
                com.amap.api.col.p0003l.ja.f(r10, r3)
                goto L13c
            L12e:
                com.amap.api.col.3l.ja r0 = r9.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                boolean r10 = r0.onDoubleTap(r1, r10)
                return r10
            L137:
                com.amap.api.col.3l.ja r10 = r9.f3591e
                com.amap.api.col.p0003l.ja.f(r10, r3)
            L13c:
                return r2
            L13d:
                return r3
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(android.view.MotionEvent r2) {
                r1 = this;
                com.amap.api.col.3l.ja r2 = r1.f3591e
                r0 = 0
                com.amap.api.col.p0003l.ja.f(r2, r0)
                r2 = 1
                return r2
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
                r5 = this;
                com.amap.api.col.3l.ja r6 = r5.f3591e
                com.amap.api.maps.model.AMapGestureListener r6 = r6.s
                if (r6 == 0) goto L9
                r6.onFling(r8, r9)
            L9:
                r6 = 1
                com.amap.api.col.3l.ja r0 = r5.f3591e     // Catch: java.lang.Throwable -> L7e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L7e
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r0 = r0.getUiSettings()     // Catch: java.lang.Throwable -> L7e
                boolean r0 = r0.isScrollGesturesEnabled()     // Catch: java.lang.Throwable -> L7e
                if (r0 != 0) goto L19
                return r6
            L19:
                com.amap.api.col.3l.ja r0 = r5.f3591e
                int r0 = com.amap.api.col.p0003l.ja.a(r0)
                if (r0 > 0) goto L7d
                com.amap.api.col.3l.ja r0 = r5.f3591e
                int r0 = com.amap.api.col.p0003l.ja.h(r0)
                if (r0 > 0) goto L7d
                com.amap.api.col.3l.ja r0 = r5.f3591e
                int r0 = com.amap.api.col.p0003l.ja.k(r0)
                if (r0 != 0) goto L7d
                com.amap.api.col.3l.ja r0 = r5.f3591e
                boolean r0 = com.amap.api.col.p0003l.ja.l(r0)
                if (r0 != 0) goto L7d
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r5.f3589c
                r1 = 3
                r0.mGestureState = r1
                r0.mGestureType = r1
                float r1 = r7.getX()
                float r2 = r7.getY()
                r3 = 2
                float[] r3 = new float[r3]
                r4 = 0
                r3[r4] = r1
                r3[r6] = r2
                r0.mLocation = r3
                com.amap.api.col.3l.ja r0 = r5.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = r5.f3589c
                int r0 = r0.getEngineIDWithGestureInfo(r1)
                com.amap.api.col.3l.ja r1 = r5.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                r1.onFling()
                com.amap.api.col.3l.ja r1 = r5.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r1.getGLMapEngine()
                android.graphics.Point r2 = new android.graphics.Point
                float r3 = r7.getX()
                int r3 = (int) r3
                float r7 = r7.getY()
                int r7 = (int) r7
                r2.<init>(r3, r7)
                r1.startMapSlidAnim(r0, r2, r8, r9)
            L7d:
                return r6
            L7e:
                r7 = move-exception
                java.lang.String r8 = "GLMapGestrureDetector"
                java.lang.String r9 = "onFling"
                com.amap.api.col.p0003l.w5.p(r7, r8, r9)
                return r6
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(android.view.MotionEvent r7) {
                r6 = this;
                com.amap.api.col.3l.ja r0 = r6.f3591e
                int r0 = com.amap.api.col.p0003l.ja.m(r0)
                r1 = 1
                if (r0 != r1) goto L45
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r6.f3589c
                r2 = 3
                r0.mGestureState = r2
                r2 = 7
                r0.mGestureType = r2
                float r2 = r7.getX()
                float r3 = r7.getY()
                r4 = 2
                float[] r4 = new float[r4]
                r5 = 0
                r4[r5] = r2
                r4[r1] = r3
                r0.mLocation = r4
                com.amap.api.col.3l.ja r0 = r6.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = r6.f3589c
                int r0 = r0.getEngineIDWithGestureInfo(r1)
                com.amap.api.col.3l.ja r1 = r6.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                r1.onLongPress(r0, r7)
                com.amap.api.col.3l.ja r0 = r6.f3591e
                com.amap.api.maps.model.AMapGestureListener r0 = r0.s
                if (r0 == 0) goto L45
                float r1 = r7.getX()
                float r7 = r7.getY()
                r0.onLongPress(r1, r7)
            L45:
                return
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
                r0 = this;
                com.amap.api.col.3l.ja r1 = r0.f3591e
                com.amap.api.maps.model.AMapGestureListener r1 = r1.s
                if (r1 == 0) goto L9
                r1.onScroll(r3, r4)
            L9:
                r1 = 0
                return r1
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(android.view.MotionEvent r5) {
                r4 = this;
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r4.f3589c     // Catch: java.lang.Throwable -> L30
                r1 = 3
                r0.mGestureState = r1     // Catch: java.lang.Throwable -> L30
                r1 = 7
                r0.mGestureType = r1     // Catch: java.lang.Throwable -> L30
                float r1 = r5.getX()     // Catch: java.lang.Throwable -> L30
                float r5 = r5.getY()     // Catch: java.lang.Throwable -> L30
                r2 = 2
                float[] r2 = new float[r2]     // Catch: java.lang.Throwable -> L30
                r3 = 0
                r2[r3] = r1     // Catch: java.lang.Throwable -> L30
                r1 = 1
                r2[r1] = r5     // Catch: java.lang.Throwable -> L30
                r0.mLocation = r2     // Catch: java.lang.Throwable -> L30
                com.amap.api.col.3l.ja r5 = r4.f3591e     // Catch: java.lang.Throwable -> L30
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r5 = r5.a     // Catch: java.lang.Throwable -> L30
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r4.f3589c     // Catch: java.lang.Throwable -> L30
                int r5 = r5.getEngineIDWithGestureInfo(r0)     // Catch: java.lang.Throwable -> L30
                com.amap.api.col.3l.ja r0 = r4.f3591e     // Catch: java.lang.Throwable -> L30
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L30
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()     // Catch: java.lang.Throwable -> L30
                r0.clearAnimations(r5, r3)     // Catch: java.lang.Throwable -> L30
            L30:
                return
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(android.view.MotionEvent r7) {
                r6 = this;
                com.amap.api.col.3l.ja r0 = r6.f3591e
                int r0 = com.amap.api.col.p0003l.ja.m(r0)
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L48
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r6.f3589c
                r3 = 3
                r0.mGestureState = r3
                r3 = 8
                r0.mGestureType = r3
                float r3 = r7.getX()
                float r4 = r7.getY()
                r5 = 2
                float[] r5 = new float[r5]
                r5[r1] = r3
                r5[r2] = r4
                r0.mLocation = r5
                com.amap.api.col.3l.ja r0 = r6.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = r6.f3589c
                int r0 = r0.getEngineIDWithGestureInfo(r1)
                com.amap.api.col.3l.ja r1 = r6.f3591e
                com.amap.api.maps.model.AMapGestureListener r1 = r1.s
                if (r1 == 0) goto L3f
                float r2 = r7.getX()     // Catch: java.lang.Throwable -> L3f
                float r3 = r7.getY()     // Catch: java.lang.Throwable -> L3f
                r1.onSingleTap(r2, r3)     // Catch: java.lang.Throwable -> L3f
            L3f:
                com.amap.api.col.3l.ja r1 = r6.f3591e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                boolean r7 = r1.onSingleTapConfirmed(r0, r7)
                return r7
            L48:
                return r1
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements com.amap.api.col.3l.t.a {
        private com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ja f3592b;

        private b(com.amap.api.col.p0003l.ja r1) {
                r0 = this;
                r0.f3592b = r1
                r0.<init>()
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = new com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo
                r1.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ b(com.amap.api.col.p0003l.ja r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.t.a
        public final void a(com.amap.api.col.p0003l.t r5) {
                r4 = this;
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r4.a
                r1 = 3
                r0.mGestureState = r1
                r1 = 6
                r0.mGestureType = r1
                android.view.MotionEvent r1 = r5.i()
                float r1 = r1.getX()
                android.view.MotionEvent r5 = r5.i()
                float r5 = r5.getY()
                r2 = 2
                float[] r2 = new float[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r5
                r0.mLocation = r2
                com.amap.api.col.3l.ja r5 = r4.f3592b     // Catch: java.lang.Throwable -> L7b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r5 = r5.a     // Catch: java.lang.Throwable -> L7b
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r5 = r5.getUiSettings()     // Catch: java.lang.Throwable -> L7b
                boolean r5 = r5.isTiltGesturesEnabled()     // Catch: java.lang.Throwable -> L7b
                if (r5 != 0) goto L32
                goto L46
            L32:
                com.amap.api.col.3l.ja r5 = r4.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r5 = r5.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r4.a
                int r5 = r5.getEngineIDWithGestureInfo(r0)
                com.amap.api.col.3l.ja r0 = r4.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                boolean r0 = r0.isLockMapCameraDegree(r5)
                if (r0 == 0) goto L47
            L46:
                return
            L47:
                com.amap.api.col.3l.ja r0 = r4.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                float r0 = r0.getCameraDegree(r5)
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L64
                com.amap.api.col.3l.ja r0 = r4.f3592b
                int r0 = com.amap.api.col.p0003l.ja.a(r0)
                if (r0 <= 0) goto L64
                com.amap.api.col.3l.ja r0 = r4.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                r1 = 7
                r0.setGestureStatus(r5, r1)
            L64:
                com.amap.api.col.3l.ja r0 = r4.f3592b
                com.amap.api.col.p0003l.ja.i(r0, r3)
                com.amap.api.col.3l.ja r0 = r4.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                r1 = 102(0x66, float:1.43E-43)
                float r2 = r0.getCameraDegree(r5)
                com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage r1 = com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage.obtain(r1, r2)
                r0.addGestureMapMessage(r5, r1)
                return
            L7b:
                r5 = move-exception
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r1 = "onHoveEnd"
                com.amap.api.col.p0003l.w5.p(r5, r0, r1)
                return
        }

        @Override // com.amap.api.col.3l.t.a
        public final boolean b(com.amap.api.col.p0003l.t r8) {
                r7 = this;
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r7.a
                r1 = 2
                r0.mGestureState = r1
                r2 = 6
                r0.mGestureType = r2
                android.view.MotionEvent r2 = r8.i()
                float r2 = r2.getX()
                android.view.MotionEvent r3 = r8.i()
                float r3 = r3.getY()
                float[] r1 = new float[r1]
                r4 = 0
                r1[r4] = r2
                r2 = 1
                r1[r2] = r3
                r0.mLocation = r1
                com.amap.api.col.3l.ja r0 = r7.f3592b     // Catch: java.lang.Throwable -> Lc8
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> Lc8
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r0 = r0.getUiSettings()     // Catch: java.lang.Throwable -> Lc8
                boolean r0 = r0.isTiltGesturesEnabled()     // Catch: java.lang.Throwable -> Lc8
                if (r0 != 0) goto L31
                return r2
            L31:
                com.amap.api.col.3l.ja r0 = r7.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = r7.a
                int r0 = r0.getEngineIDWithGestureInfo(r1)
                com.amap.api.col.3l.ja r1 = r7.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                boolean r1 = r1.isLockMapCameraDegree(r0)
                if (r1 == 0) goto L46
                return r4
            L46:
                com.amap.api.col.3l.ja r1 = r7.f3592b
                int r1 = com.amap.api.col.p0003l.ja.k(r1)
                r3 = 3
                if (r1 <= r3) goto L50
                return r4
            L50:
                android.graphics.PointF r1 = r8.n()
                float r1 = r1.x
                android.graphics.PointF r3 = r8.n()
                float r3 = r3.y
                com.amap.api.col.3l.ja r5 = r7.f3592b
                boolean r5 = com.amap.api.col.p0003l.ja.q(r5)
                if (r5 != 0) goto L9b
                android.graphics.PointF r4 = r8.k(r4)
                android.graphics.PointF r8 = r8.k(r2)
                float r4 = r4.y
                r5 = 1092616192(0x41200000, float:10.0)
                int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r6 <= 0) goto L7a
                float r6 = r8.y
                int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                if (r6 > 0) goto L86
            L7a:
                r6 = -1054867456(0xffffffffc1200000, float:-10.0)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L9b
                float r8 = r8.y
                int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r8 >= 0) goto L9b
            L86:
                float r8 = java.lang.Math.abs(r3)
                int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r8 <= 0) goto L9b
                float r8 = java.lang.Math.abs(r1)
                int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r8 >= 0) goto L9b
                com.amap.api.col.3l.ja r8 = r7.f3592b
                com.amap.api.col.p0003l.ja.i(r8, r2)
            L9b:
                com.amap.api.col.3l.ja r8 = r7.f3592b
                boolean r8 = com.amap.api.col.p0003l.ja.q(r8)
                if (r8 == 0) goto Lc7
                com.amap.api.col.3l.ja r8 = r7.f3592b
                com.amap.api.col.p0003l.ja.i(r8, r2)
                r8 = 1086324736(0x40c00000, float:6.0)
                float r3 = r3 / r8
                float r8 = java.lang.Math.abs(r3)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 <= 0) goto Lc7
                com.amap.api.col.3l.ja r8 = r7.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r8.a
                r1 = 101(0x65, float:1.42E-43)
                com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage r1 = com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage.obtain(r1, r3)
                r8.addGestureMapMessage(r0, r1)
                com.amap.api.col.3l.ja r8 = r7.f3592b
                com.amap.api.col.p0003l.ja.u(r8)
            Lc7:
                return r2
            Lc8:
                r8 = move-exception
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r1 = "onHove"
                com.amap.api.col.p0003l.w5.p(r8, r0, r1)
                return r2
        }

        @Override // com.amap.api.col.3l.t.a
        public final boolean c(com.amap.api.col.p0003l.t r6) {
                r5 = this;
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r5.a
                r1 = 1
                r0.mGestureState = r1
                r2 = 6
                r0.mGestureType = r2
                android.view.MotionEvent r2 = r6.i()
                float r2 = r2.getX()
                android.view.MotionEvent r6 = r6.i()
                float r6 = r6.getY()
                r3 = 2
                float[] r3 = new float[r3]
                r4 = 0
                r3[r4] = r2
                r3[r1] = r6
                r0.mLocation = r3
                com.amap.api.col.3l.ja r6 = r5.f3592b     // Catch: java.lang.Throwable -> L58
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r6.a     // Catch: java.lang.Throwable -> L58
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r6 = r6.getUiSettings()     // Catch: java.lang.Throwable -> L58
                boolean r6 = r6.isTiltGesturesEnabled()     // Catch: java.lang.Throwable -> L58
                if (r6 != 0) goto L31
                return r1
            L31:
                com.amap.api.col.3l.ja r6 = r5.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r6.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r5.a
                int r6 = r6.getEngineIDWithGestureInfo(r0)
                com.amap.api.col.3l.ja r0 = r5.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                boolean r0 = r0.isLockMapCameraDegree(r6)
                if (r0 == 0) goto L46
                return r4
            L46:
                com.amap.api.col.3l.ja r0 = r5.f3592b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                r2 = 100
                float r3 = r0.getCameraDegree(r6)
                com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage r2 = com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage.obtain(r2, r3)
                r0.addGestureMapMessage(r6, r2)
                return r1
            L58:
                r6 = move-exception
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r2 = "onHoveBegin"
                com.amap.api.col.p0003l.w5.p(r6, r0, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements com.amap.api.col.3l.u.a {
        private com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ja f3593b;

        private c(com.amap.api.col.p0003l.ja r1) {
                r0 = this;
                r0.f3593b = r1
                r0.<init>()
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = new com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo
                r1.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ c(com.amap.api.col.p0003l.ja r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.u.a
        public final boolean a(com.amap.api.col.p0003l.u r7) {
                r6 = this;
                r0 = 1
                com.amap.api.col.3l.ja r1 = r6.f3593b     // Catch: java.lang.Throwable -> L5a
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a     // Catch: java.lang.Throwable -> L5a
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r1 = r1.getUiSettings()     // Catch: java.lang.Throwable -> L5a
                boolean r1 = r1.isScrollGesturesEnabled()     // Catch: java.lang.Throwable -> L5a
                if (r1 != 0) goto L10
                return r0
            L10:
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = r6.a
                r1.mGestureState = r0
                r2 = 3
                r1.mGestureType = r2
                android.view.MotionEvent r2 = r7.i()
                float r2 = r2.getX()
                android.view.MotionEvent r3 = r7.i()
                float r3 = r3.getY()
                r4 = 2
                float[] r4 = new float[r4]
                r5 = 0
                r4[r5] = r2
                r4[r0] = r3
                r1.mLocation = r4
                com.amap.api.col.3l.ja r1 = r6.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r2 = r6.a
                int r1 = r1.getEngineIDWithGestureInfo(r2)
                com.amap.api.col.3l.ja r2 = r6.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r2.a
                android.view.MotionEvent r3 = r7.i()
                float r3 = r3.getX()
                android.view.MotionEvent r7 = r7.i()
                float r7 = r7.getY()
                r4 = 100
                r5 = 0
                com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage r7 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.obtain(r4, r5, r5, r3, r7)
                r2.addGestureMapMessage(r1, r7)
                return r0
            L5a:
                r7 = move-exception
                java.lang.String r1 = "GLMapGestrureDetector"
                java.lang.String r2 = "onMoveBegin"
                com.amap.api.col.p0003l.w5.p(r7, r1, r2)
                return r0
        }

        @Override // com.amap.api.col.3l.u.a
        public final void b(com.amap.api.col.p0003l.u r6) {
                r5 = this;
                com.amap.api.col.3l.ja r0 = r5.f3593b     // Catch: java.lang.Throwable -> L6a
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L6a
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r0 = r0.getUiSettings()     // Catch: java.lang.Throwable -> L6a
                boolean r0 = r0.isScrollGesturesEnabled()     // Catch: java.lang.Throwable -> L6a
                if (r0 != 0) goto Lf
                return
            Lf:
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r5.a
                r1 = 3
                r0.mGestureState = r1
                r0.mGestureType = r1
                android.view.MotionEvent r1 = r6.i()
                float r1 = r1.getX()
                android.view.MotionEvent r2 = r6.i()
                float r2 = r2.getY()
                r3 = 2
                float[] r3 = new float[r3]
                r4 = 0
                r3[r4] = r1
                r1 = 1
                r3[r1] = r2
                r0.mLocation = r3
                com.amap.api.col.3l.ja r0 = r5.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = r5.a
                int r0 = r0.getEngineIDWithGestureInfo(r1)
                com.amap.api.col.3l.ja r1 = r5.f3593b
                int r1 = com.amap.api.col.p0003l.ja.s(r1)
                if (r1 <= 0) goto L4b
                com.amap.api.col.3l.ja r1 = r5.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                r2 = 5
                r1.setGestureStatus(r0, r2)
            L4b:
                com.amap.api.col.3l.ja r1 = r5.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.a
                android.view.MotionEvent r2 = r6.i()
                float r2 = r2.getX()
                android.view.MotionEvent r6 = r6.i()
                float r6 = r6.getY()
                r3 = 102(0x66, float:1.43E-43)
                r4 = 0
                com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage r6 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.obtain(r3, r4, r4, r2, r6)
                r1.addGestureMapMessage(r0, r6)
                return
            L6a:
                r6 = move-exception
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r1 = "onMoveEnd"
                com.amap.api.col.p0003l.w5.p(r6, r0, r1)
                return
        }

        @Override // com.amap.api.col.3l.u.a
        public final boolean c(com.amap.api.col.p0003l.u r8) {
                r7 = this;
                com.amap.api.col.3l.ja r0 = r7.f3593b
                boolean r0 = com.amap.api.col.p0003l.ja.q(r0)
                r1 = 1
                if (r0 == 0) goto La
                return r1
            La:
                com.amap.api.col.3l.ja r0 = r7.f3593b     // Catch: java.lang.Throwable -> Lae
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> Lae
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r0 = r0.getUiSettings()     // Catch: java.lang.Throwable -> Lae
                boolean r0 = r0.isScrollGesturesEnabled()     // Catch: java.lang.Throwable -> Lae
                if (r0 == 0) goto Lb0
                com.amap.api.col.3l.ja r0 = r7.f3593b     // Catch: java.lang.Throwable -> Lae
                boolean r0 = com.amap.api.col.p0003l.ja.r(r0)     // Catch: java.lang.Throwable -> Lae
                if (r0 == 0) goto L22
                goto Lb0
            L22:
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r7.a
                r2 = 2
                r0.mGestureState = r2
                r3 = 3
                r0.mGestureType = r3
                android.view.MotionEvent r3 = r8.i()
                float r3 = r3.getX()
                android.view.MotionEvent r4 = r8.i()
                float r4 = r4.getY()
                float[] r2 = new float[r2]
                r5 = 0
                r2[r5] = r3
                r2[r1] = r4
                r0.mLocation = r2
                com.amap.api.col.3l.ja r0 = r7.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r2 = r7.a
                int r0 = r0.getEngineIDWithGestureInfo(r2)
                android.graphics.PointF r2 = r8.j()
                com.amap.api.col.3l.ja r3 = r7.f3593b
                int r3 = com.amap.api.col.p0003l.ja.s(r3)
                if (r3 != 0) goto L5c
                r3 = 1082130432(0x40800000, float:4.0)
                goto L5e
            L5c:
                r3 = 1065353216(0x3f800000, float:1.0)
            L5e:
                float r4 = r2.x
                float r4 = java.lang.Math.abs(r4)
                int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r4 > 0) goto L74
                float r4 = r2.y
                float r4 = java.lang.Math.abs(r4)
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L73
                goto L74
            L73:
                return r5
            L74:
                com.amap.api.col.3l.ja r3 = r7.f3593b
                int r3 = com.amap.api.col.p0003l.ja.s(r3)
                if (r3 != 0) goto L87
                com.amap.api.col.3l.ja r3 = r7.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r3.a
                com.autonavi.base.ae.gmap.GLMapEngine r3 = r3.getGLMapEngine()
                r3.clearAnimations(r0, r5)
            L87:
                com.amap.api.col.3l.ja r3 = r7.f3593b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r3.a
                float r4 = r2.x
                float r2 = r2.y
                android.view.MotionEvent r5 = r8.i()
                float r5 = r5.getX()
                android.view.MotionEvent r8 = r8.i()
                float r8 = r8.getY()
                r6 = 101(0x65, float:1.42E-43)
                com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage r8 = com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage.obtain(r6, r4, r2, r5, r8)
                r3.addGestureMapMessage(r0, r8)
                com.amap.api.col.3l.ja r8 = r7.f3593b
                com.amap.api.col.p0003l.ja.t(r8)
                return r1
            Lae:
                r8 = move-exception
                goto Lb1
            Lb0:
                return r1
            Lb1:
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r2 = "onMove"
                com.amap.api.col.p0003l.w5.p(r8, r0, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d extends com.amap.api.col.3l.w.a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f3594b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3595c;

        /* renamed from: d, reason: collision with root package name */
        private android.graphics.Point f3596d;

        /* renamed from: e, reason: collision with root package name */
        private float[] f3597e;

        /* renamed from: f, reason: collision with root package name */
        private float f3598f;

        /* renamed from: g, reason: collision with root package name */
        private float[] f3599g;

        /* renamed from: h, reason: collision with root package name */
        private float f3600h;

        /* renamed from: i, reason: collision with root package name */
        private com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo f3601i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ja f3602j;

        private d(com.amap.api.col.p0003l.ja r2) {
                r1 = this;
                r1.f3602j = r2
                r1.<init>()
                r2 = 0
                r1.a = r2
                r1.f3594b = r2
                r1.f3595c = r2
                android.graphics.Point r2 = new android.graphics.Point
                r2.<init>()
                r1.f3596d = r2
                r2 = 10
                float[] r0 = new float[r2]
                r1.f3597e = r0
                r0 = 0
                r1.f3598f = r0
                float[] r2 = new float[r2]
                r1.f3599g = r2
                r1.f3600h = r0
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r2 = new com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo
                r2.<init>()
                r1.f3601i = r2
                return
        }

        /* synthetic */ d(com.amap.api.col.p0003l.ja r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.w.a
        public final boolean d(com.amap.api.col.p0003l.w r19) {
                r18 = this;
                r1 = r18
                java.lang.String r2 = "onScaleRotate"
                java.lang.String r3 = "GLMapGestrureDetector"
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r1.f3601i
                r4 = 2
                r0.mGestureState = r4
                r5 = 4
                r0.mGestureType = r5
                android.view.MotionEvent r5 = r19.c()
                float r5 = r5.getX()
                android.view.MotionEvent r6 = r19.c()
                float r6 = r6.getY()
                float[] r7 = new float[r4]
                r8 = 0
                r7[r8] = r5
                r5 = 1
                r7[r5] = r6
                r0.mLocation = r7
                com.amap.api.col.3l.ja r0 = r1.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r6 = r1.f3601i
                int r6 = r0.getEngineIDWithGestureInfo(r6)
                float r0 = r19.n()
                long r9 = r19.o()
                float r7 = (float) r9
                float r9 = r19.f()
                int r9 = (int) r9
                float r10 = r19.i()
                int r10 = (int) r10
                android.graphics.Point r11 = r1.f3596d
                int r11 = r11.x
                int r11 = r9 - r11
                int r11 = java.lang.Math.abs(r11)
                float r11 = (float) r11
                android.graphics.Point r12 = r1.f3596d
                int r12 = r12.y
                int r12 = r10 - r12
                int r12 = java.lang.Math.abs(r12)
                float r12 = (float) r12
                android.graphics.Point r13 = r1.f3596d
                r13.x = r9
                r13.y = r10
                double r13 = (double) r0
                double r13 = java.lang.Math.log(r13)
                float r0 = (float) r13
                com.amap.api.col.3l.ja r13 = r1.f3602j
                int r13 = com.amap.api.col.p0003l.ja.h(r13)
                if (r13 > 0) goto L7c
                float r13 = java.lang.Math.abs(r0)
                r14 = 1045220557(0x3e4ccccd, float:0.2)
                int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
                if (r13 <= 0) goto L7c
                r1.f3595c = r5
            L7c:
                r13 = 101(0x65, float:1.42E-43)
                r14 = 1073741824(0x40000000, float:2.0)
                com.amap.api.col.3l.ja r15 = r1.f3602j     // Catch: java.lang.Throwable -> La0
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r15 = r15.a     // Catch: java.lang.Throwable -> La0
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r15 = r15.getUiSettings()     // Catch: java.lang.Throwable -> La0
                boolean r15 = r15.isZoomGesturesEnabled()     // Catch: java.lang.Throwable -> La0
                if (r15 == 0) goto L113
                boolean r15 = r1.a     // Catch: java.lang.Throwable -> La0
                if (r15 != 0) goto La5
                float r15 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> La0
                r16 = 1031127695(0x3d75c28f, float:0.06)
                int r15 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
                if (r15 >= 0) goto La5
                r1.a = r5     // Catch: java.lang.Throwable -> La0
                goto La5
            La0:
                r0 = move-exception
                r17 = 1073741824(0x40000000, float:2.0)
                goto L116
            La5:
                boolean r15 = r1.a     // Catch: java.lang.Throwable -> La0
                if (r15 == 0) goto L113
                float r15 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> La0
                r16 = 1008981770(0x3c23d70a, float:0.01)
                int r15 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
                if (r15 >= 0) goto L113
                int r8 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r8 > 0) goto Lbc
                int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r8 <= 0) goto Lca
            Lbc:
                float r8 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L10f
                r15 = 1017370378(0x3ca3d70a, float:0.02)
                int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
                if (r8 >= 0) goto Lca
            Lc7:
                r17 = 1073741824(0x40000000, float:2.0)
                goto L102
            Lca:
                r8 = 0
                int r15 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r15 <= 0) goto Lc7
                float r15 = r0 / r7
                r1.f3598f = r15     // Catch: java.lang.Throwable -> L10f
                float r15 = java.lang.Math.abs(r15)     // Catch: java.lang.Throwable -> L10f
                r16 = 0
                float[] r8 = r1.f3597e     // Catch: java.lang.Throwable -> L10f
                r17 = 1073741824(0x40000000, float:2.0)
                com.amap.api.col.3l.ja r14 = r1.f3602j     // Catch: java.lang.Throwable -> L104
                int r14 = com.amap.api.col.p0003l.ja.h(r14)     // Catch: java.lang.Throwable -> L104
                int r14 = r14 % 10
                r8[r14] = r15     // Catch: java.lang.Throwable -> L104
                com.amap.api.col.3l.ja r8 = r1.f3602j     // Catch: java.lang.Throwable -> L104
                com.amap.api.col.p0003l.ja.o(r8)     // Catch: java.lang.Throwable -> L104
                com.amap.api.col.3l.ja r8 = r1.f3602j     // Catch: java.lang.Throwable -> L104
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r8.a     // Catch: java.lang.Throwable -> L104
                com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r14 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.obtain(r13, r0, r9, r10)     // Catch: java.lang.Throwable -> L104
                r8.addGestureMapMessage(r6, r14)     // Catch: java.lang.Throwable -> L104
                int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
                if (r0 <= 0) goto L107
                com.amap.api.col.3l.ja r0 = r1.f3602j     // Catch: java.lang.Throwable -> L104
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L104
                r0.setGestureStatus(r6, r5)     // Catch: java.lang.Throwable -> L104
            L102:
                r8 = 1
                goto L119
            L104:
                r0 = move-exception
            L105:
                r8 = 1
                goto L116
            L107:
                com.amap.api.col.3l.ja r0 = r1.f3602j     // Catch: java.lang.Throwable -> L104
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L104
                r0.setGestureStatus(r6, r4)     // Catch: java.lang.Throwable -> L104
                goto L102
            L10f:
                r0 = move-exception
                r17 = 1073741824(0x40000000, float:2.0)
                goto L105
            L113:
                r17 = 1073741824(0x40000000, float:2.0)
                goto L119
            L116:
                com.amap.api.col.p0003l.w5.p(r0, r3, r2)
            L119:
                com.amap.api.col.3l.ja r0 = r1.f3602j     // Catch: java.lang.Throwable -> L14a
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L14a
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r0 = r0.getUiSettings()     // Catch: java.lang.Throwable -> L14a
                boolean r0 = r0.isRotateGesturesEnabled()     // Catch: java.lang.Throwable -> L14a
                if (r0 == 0) goto L19b
                com.amap.api.col.3l.ja r0 = r1.f3602j     // Catch: java.lang.Throwable -> L14a
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L14a
                boolean r0 = r0.isLockMapAngle(r6)     // Catch: java.lang.Throwable -> L14a
                if (r0 != 0) goto L19b
                boolean r0 = r1.f3595c     // Catch: java.lang.Throwable -> L14a
                if (r0 != 0) goto L19b
                float r0 = r19.s()     // Catch: java.lang.Throwable -> L14a
                boolean r4 = r1.f3594b     // Catch: java.lang.Throwable -> L14a
                r14 = 1082130432(0x40800000, float:4.0)
                if (r4 != 0) goto L14d
                float r4 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L14a
                int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r4 < 0) goto L14d
                r1.f3594b = r5     // Catch: java.lang.Throwable -> L14a
                goto L14d
            L14a:
                r0 = move-exception
                r5 = r8
                goto L19d
            L14d:
                boolean r4 = r1.f3594b     // Catch: java.lang.Throwable -> L14a
                if (r4 == 0) goto L19b
                float r4 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L14a
                r15 = 1065353216(0x3f800000, float:1.0)
                int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
                if (r4 >= 0) goto L19b
                int r4 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r4 > 0) goto L163
                int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r4 <= 0) goto L16c
            L163:
                float r4 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L14a
                int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r4 >= 0) goto L16c
                goto L19b
            L16c:
                float r4 = r0 / r7
                r1.f3600h = r4     // Catch: java.lang.Throwable -> L14a
                float r4 = java.lang.Math.abs(r4)     // Catch: java.lang.Throwable -> L14a
                float[] r7 = r1.f3599g     // Catch: java.lang.Throwable -> L14a
                com.amap.api.col.3l.ja r11 = r1.f3602j     // Catch: java.lang.Throwable -> L14a
                int r11 = com.amap.api.col.p0003l.ja.k(r11)     // Catch: java.lang.Throwable -> L14a
                int r11 = r11 % 10
                r7[r11] = r4     // Catch: java.lang.Throwable -> L14a
                com.amap.api.col.3l.ja r4 = r1.f3602j     // Catch: java.lang.Throwable -> L14a
                com.amap.api.col.p0003l.ja.p(r4)     // Catch: java.lang.Throwable -> L14a
                com.amap.api.col.3l.ja r4 = r1.f3602j     // Catch: java.lang.Throwable -> L14a
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r4.a     // Catch: java.lang.Throwable -> L14a
                com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage r0 = com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage.obtain(r13, r0, r9, r10)     // Catch: java.lang.Throwable -> L14a
                r4.addGestureMapMessage(r6, r0)     // Catch: java.lang.Throwable -> L14a
                com.amap.api.col.3l.ja r0 = r1.f3602j     // Catch: java.lang.Throwable -> L199
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L199
                r4 = 6
                r0.setGestureStatus(r6, r4)     // Catch: java.lang.Throwable -> L199
                goto L1a0
            L199:
                r0 = move-exception
                goto L19d
            L19b:
                r5 = r8
                goto L1a0
            L19d:
                com.amap.api.col.p0003l.w5.p(r0, r3, r2)
            L1a0:
                return r5
        }

        @Override // com.amap.api.col.3l.w.a
        public final boolean e(com.amap.api.col.p0003l.w r7) {
                r6 = this;
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r6.f3601i
                r1 = 1
                r0.mGestureState = r1
                r2 = 4
                r0.mGestureType = r2
                android.view.MotionEvent r2 = r7.c()
                float r2 = r2.getX()
                android.view.MotionEvent r3 = r7.c()
                float r3 = r3.getY()
                r4 = 2
                float[] r4 = new float[r4]
                r5 = 0
                r4[r5] = r2
                r4[r1] = r3
                r0.mLocation = r4
                com.amap.api.col.3l.ja r0 = r6.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r2 = r6.f3601i
                int r0 = r0.getEngineIDWithGestureInfo(r2)
                float r2 = r7.f()
                int r2 = (int) r2
                float r7 = r7.i()
                int r7 = (int) r7
                r6.f3595c = r5
                android.graphics.Point r3 = r6.f3596d
                r3.x = r2
                r3.y = r7
                r6.a = r5
                r6.f3594b = r5
                com.amap.api.col.3l.ja r3 = r6.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r3.a
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 100
                com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r4 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.obtain(r5, r4, r2, r7)
                r3.addGestureMapMessage(r0, r4)
                com.amap.api.col.3l.ja r3 = r6.f3602j     // Catch: java.lang.Throwable -> L79
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r3.a     // Catch: java.lang.Throwable -> L79
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r3 = r3.getUiSettings()     // Catch: java.lang.Throwable -> L79
                boolean r3 = r3.isRotateGesturesEnabled()     // Catch: java.lang.Throwable -> L79
                if (r3 == 0) goto L81
                com.amap.api.col.3l.ja r3 = r6.f3602j     // Catch: java.lang.Throwable -> L79
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r3.a     // Catch: java.lang.Throwable -> L79
                boolean r3 = r3.isLockMapAngle(r0)     // Catch: java.lang.Throwable -> L79
                if (r3 != 0) goto L81
                com.amap.api.col.3l.ja r3 = r6.f3602j     // Catch: java.lang.Throwable -> L79
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r3.a     // Catch: java.lang.Throwable -> L79
                float r4 = r3.getMapAngle(r0)     // Catch: java.lang.Throwable -> L79
                com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage r7 = com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage.obtain(r5, r4, r2, r7)     // Catch: java.lang.Throwable -> L79
                r3.addGestureMapMessage(r0, r7)     // Catch: java.lang.Throwable -> L79
                goto L81
            L79:
                r7 = move-exception
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r2 = "onScaleRotateBegin"
                com.amap.api.col.p0003l.w5.p(r7, r0, r2)
            L81:
                return r1
        }

        @Override // com.amap.api.col.3l.w.a
        public final void f(com.amap.api.col.p0003l.w r11) {
                r10 = this;
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r10.f3601i
                r1 = 3
                r0.mGestureState = r1
                r1 = 4
                r0.mGestureType = r1
                android.view.MotionEvent r1 = r11.c()
                float r1 = r1.getX()
                android.view.MotionEvent r11 = r11.c()
                float r11 = r11.getY()
                r2 = 2
                float[] r2 = new float[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r11
                r0.mLocation = r2
                com.amap.api.col.3l.ja r11 = r10.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r10.f3601i
                int r5 = r11.getEngineIDWithGestureInfo(r0)
                r10.f3595c = r3
                com.amap.api.col.3l.ja r11 = r10.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a
                r0 = 1065353216(0x3f800000, float:1.0)
                r1 = 102(0x66, float:1.43E-43)
                com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r0 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.obtain(r1, r0, r3, r3)
                r11.addGestureMapMessage(r5, r0)
                com.amap.api.col.3l.ja r11 = r10.f3602j
                int r11 = com.amap.api.col.p0003l.ja.h(r11)
                r2 = 10
                r4 = 0
                r6 = -971228160(0xffffffffc61c3c00, float:-9999.0)
                if (r11 <= 0) goto L98
                com.amap.api.col.3l.ja r11 = r10.f3602j
                int r11 = com.amap.api.col.p0003l.ja.h(r11)
                if (r11 <= r2) goto L57
                r11 = 10
                goto L5d
            L57:
                com.amap.api.col.3l.ja r11 = r10.f3602j
                int r11 = com.amap.api.col.p0003l.ja.h(r11)
            L5d:
                r0 = 0
                r7 = 0
            L5f:
                if (r0 >= r2) goto L6b
                float[] r8 = r10.f3597e
                r9 = r8[r0]
                float r7 = r7 + r9
                r8[r0] = r4
                int r0 = r0 + 1
                goto L5f
            L6b:
                float r11 = (float) r11
                float r7 = r7 / r11
                r11 = 998445679(0x3b83126f, float:0.004)
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 > 0) goto L91
                r11 = 1133903872(0x43960000, float:300.0)
                float r7 = r7 * r11
                r11 = 1069547520(0x3fc00000, float:1.5)
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 < 0) goto L80
                r7 = 1069547520(0x3fc00000, float:1.5)
            L80:
                float r11 = r10.f3598f
                int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r11 >= 0) goto L87
                float r7 = -r7
            L87:
                com.amap.api.col.3l.ja r11 = r10.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a
                float r11 = r11.getPreciseLevel(r5)
                float r11 = r11 + r7
                goto L94
            L91:
                r11 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            L94:
                r10.f3598f = r4
                r7 = r11
                goto L9b
            L98:
                r7 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            L9b:
                com.amap.api.col.3l.ja r11 = r10.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a
                boolean r11 = r11.isLockMapAngle(r5)
                if (r11 != 0) goto L12e
                com.amap.api.col.3l.ja r11 = r10.f3602j     // Catch: java.lang.Throwable -> Lc3
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a     // Catch: java.lang.Throwable -> Lc3
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r11 = r11.getUiSettings()     // Catch: java.lang.Throwable -> Lc3
                boolean r11 = r11.isRotateGesturesEnabled()     // Catch: java.lang.Throwable -> Lc3
                if (r11 == 0) goto Lcc
                com.amap.api.col.3l.ja r11 = r10.f3602j     // Catch: java.lang.Throwable -> Lc3
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a     // Catch: java.lang.Throwable -> Lc3
                float r0 = r11.getMapAngle(r5)     // Catch: java.lang.Throwable -> Lc3
                com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage r0 = com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage.obtain(r1, r0, r3, r3)     // Catch: java.lang.Throwable -> Lc3
                r11.addGestureMapMessage(r5, r0)     // Catch: java.lang.Throwable -> Lc3
                goto Lcc
            Lc3:
                r0 = move-exception
                r11 = r0
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r1 = "onScaleRotateEnd"
                com.amap.api.col.p0003l.w5.p(r11, r0, r1)
            Lcc:
                com.amap.api.col.3l.ja r11 = r10.f3602j
                int r11 = com.amap.api.col.p0003l.ja.k(r11)
                if (r11 <= 0) goto L128
                com.amap.api.col.3l.ja r11 = r10.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a
                r0 = 6
                r11.setGestureStatus(r5, r0)
                com.amap.api.col.3l.ja r11 = r10.f3602j
                int r11 = com.amap.api.col.p0003l.ja.k(r11)
                if (r11 <= r2) goto Le7
                r11 = 10
                goto Led
            Le7:
                com.amap.api.col.3l.ja r11 = r10.f3602j
                int r11 = com.amap.api.col.p0003l.ja.k(r11)
            Led:
                r0 = 0
            Lee:
                if (r3 >= r2) goto Lfa
                float[] r1 = r10.f3599g
                r8 = r1[r3]
                float r0 = r0 + r8
                r1[r3] = r4
                int r3 = r3 + 1
                goto Lee
            Lfa:
                float r11 = (float) r11
                float r0 = r0 / r11
                r11 = 1036831949(0x3dcccccd, float:0.1)
                int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r11 > 0) goto L128
                r11 = 1128792064(0x43480000, float:200.0)
                float r0 = r0 * r11
                com.amap.api.col.3l.ja r11 = r10.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r11 = r11.a
                float r11 = r11.getMapAngle(r5)
                int r11 = (int) r11
                int r11 = r11 % 360
                r1 = 1114636288(0x42700000, float:60.0)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 < 0) goto L11a
                r0 = 1114636288(0x42700000, float:60.0)
            L11a:
                float r1 = r10.f3600h
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L121
                float r0 = -r0
            L121:
                float r11 = (float) r11
                float r11 = r11 + r0
                int r11 = (int) r11
                int r11 = r11 % 360
                float r11 = (float) r11
                goto L12b
            L128:
                r11 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            L12b:
                r10.f3598f = r4
                goto L131
            L12e:
                r11 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            L131:
                int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r0 != 0) goto L139
                int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r0 == 0) goto L149
            L139:
                com.amap.api.col.3l.ja r0 = r10.f3602j
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                com.autonavi.base.ae.gmap.GLMapEngine r4 = r0.getGLMapEngine()
                android.graphics.Point r6 = r10.f3596d
                int r8 = (int) r11
                r9 = 500(0x1f4, float:7.0E-43)
                r4.startPivotZoomRotateAnim(r5, r6, r7, r8, r9)
            L149:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e extends com.amap.api.col.3l.x.b {
        com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ja f3603b;

        private e(com.amap.api.col.p0003l.ja r1) {
                r0 = this;
                r0.f3603b = r1
                r0.<init>()
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1 = new com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo
                r1.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ e(com.amap.api.col.p0003l.ja r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.x.b, com.amap.api.col.3l.x.a
        public final void a(com.amap.api.col.p0003l.x r6) {
                r5 = this;
                com.amap.api.col.3l.ja r0 = r5.f3603b     // Catch: java.lang.Throwable -> L73
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a     // Catch: java.lang.Throwable -> L73
                com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r0 = r0.getUiSettings()     // Catch: java.lang.Throwable -> L73
                boolean r0 = r0.isZoomGesturesEnabled()     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto Lf
                goto L72
            Lf:
                float r0 = r6.n()
                float r0 = java.lang.Math.abs(r0)
                r1 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L72
                float r0 = r6.o()
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L72
                long r0 = r6.f()
                r2 = 200(0xc8, double:9.9E-322)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L72
                com.amap.api.col.3l.ja r0 = r5.f3603b
                com.amap.api.col.p0003l.ja.v(r0)
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r5.a
                r1 = 2
                r0.mGestureState = r1
                r0.mGestureType = r1
                android.view.MotionEvent r2 = r6.i()
                float r2 = r2.getX()
                android.view.MotionEvent r6 = r6.i()
                float r6 = r6.getY()
                float[] r1 = new float[r1]
                r3 = 0
                r1[r3] = r2
                r2 = 1
                r1[r2] = r6
                r0.mLocation = r1
                com.amap.api.col.3l.ja r6 = r5.f3603b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r6.a
                com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r5.a
                int r6 = r6.getEngineIDWithGestureInfo(r0)
                com.amap.api.col.3l.ja r0 = r5.f3603b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                r1 = 4
                r0.setGestureStatus(r6, r1)
                com.amap.api.col.3l.ja r0 = r5.f3603b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
                r0.zoomOut(r6)
            L72:
                return
            L73:
                r6 = move-exception
                java.lang.String r0 = "GLMapGestrureDetector"
                java.lang.String r1 = "onZoomOut"
                com.amap.api.col.p0003l.w5.p(r6, r0, r1)
                return
        }
    }

    public ja(com.autonavi.base.amap.api.mapcore.IAMapDelegate r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f3584h = r0
            r4.f3585i = r0
            r4.f3586j = r0
            r4.f3587k = r0
            r4.l = r0
            r4.m = r0
            r4.n = r0
            r4.o = r0
            r1 = 1
            r4.p = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r4.t = r1
            android.content.Context r1 = r5.getContext()
            r4.f3578b = r1
            r4.a = r5
            com.amap.api.col.3l.ja$a r5 = new com.amap.api.col.3l.ja$a
            r5.<init>(r4, r0)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            android.content.Context r2 = r4.f3578b
            android.os.Handler r3 = r4.t
            r1.<init>(r2, r5, r3)
            r4.f3579c = r1
            r1.setOnDoubleTapListener(r5)
            com.amap.api.col.3l.w r5 = new com.amap.api.col.3l.w
            android.content.Context r1 = r4.f3578b
            com.amap.api.col.3l.ja$d r2 = new com.amap.api.col.3l.ja$d
            r2.<init>(r4, r0)
            r5.<init>(r1, r2)
            r4.f3580d = r5
            com.amap.api.col.3l.u r5 = new com.amap.api.col.3l.u
            android.content.Context r1 = r4.f3578b
            com.amap.api.col.3l.ja$c r2 = new com.amap.api.col.3l.ja$c
            r2.<init>(r4, r0)
            r5.<init>(r1, r2)
            r4.f3581e = r5
            com.amap.api.col.3l.t r5 = new com.amap.api.col.3l.t
            android.content.Context r1 = r4.f3578b
            com.amap.api.col.3l.ja$b r2 = new com.amap.api.col.3l.ja$b
            r2.<init>(r4, r0)
            r5.<init>(r1, r2)
            r4.f3582f = r5
            com.amap.api.col.3l.x r5 = new com.amap.api.col.3l.x
            android.content.Context r1 = r4.f3578b
            com.amap.api.col.3l.ja$e r2 = new com.amap.api.col.3l.ja$e
            r2.<init>(r4, r0)
            r5.<init>(r1, r2)
            r4.f3583g = r5
            return
    }

    static /* synthetic */ int a(com.amap.api.col.p0003l.ja r0) {
            int r0 = r0.l
            return r0
    }

    static /* synthetic */ boolean f(com.amap.api.col.p0003l.ja r0, boolean r1) {
            r0.n = r1
            return r1
    }

    static /* synthetic */ int h(com.amap.api.col.p0003l.ja r0) {
            int r0 = r0.f3586j
            return r0
    }

    static /* synthetic */ boolean i(com.amap.api.col.p0003l.ja r0, boolean r1) {
            r0.f3584h = r1
            return r1
    }

    static /* synthetic */ int k(com.amap.api.col.p0003l.ja r0) {
            int r0 = r0.f3587k
            return r0
    }

    static /* synthetic */ boolean l(com.amap.api.col.p0003l.ja r0) {
            boolean r0 = r0.p
            return r0
    }

    static /* synthetic */ int m(com.amap.api.col.p0003l.ja r0) {
            int r0 = r0.m
            return r0
    }

    static /* synthetic */ boolean n(com.amap.api.col.p0003l.ja r0) {
            boolean r0 = r0.n
            return r0
    }

    static /* synthetic */ int o(com.amap.api.col.p0003l.ja r2) {
            int r0 = r2.f3586j
            int r1 = r0 + 1
            r2.f3586j = r1
            return r0
    }

    static /* synthetic */ int p(com.amap.api.col.p0003l.ja r2) {
            int r0 = r2.f3587k
            int r1 = r0 + 1
            r2.f3587k = r1
            return r0
    }

    static /* synthetic */ boolean q(com.amap.api.col.p0003l.ja r0) {
            boolean r0 = r0.f3584h
            return r0
    }

    static /* synthetic */ boolean r(com.amap.api.col.p0003l.ja r0) {
            boolean r0 = r0.o
            return r0
    }

    static /* synthetic */ int s(com.amap.api.col.p0003l.ja r0) {
            int r0 = r0.f3585i
            return r0
    }

    static /* synthetic */ int t(com.amap.api.col.p0003l.ja r2) {
            int r0 = r2.f3585i
            int r1 = r0 + 1
            r2.f3585i = r1
            return r0
    }

    static /* synthetic */ int u(com.amap.api.col.p0003l.ja r2) {
            int r0 = r2.l
            int r1 = r0 + 1
            r2.l = r1
            return r0
    }

    static /* synthetic */ boolean v(com.amap.api.col.p0003l.ja r1) {
            r0 = 1
            r1.p = r0
            return r0
    }

    public final void b() {
            r1 = this;
            r0 = 0
            r1.f3585i = r0
            r1.f3587k = r0
            r1.f3586j = r0
            r1.l = r0
            r1.m = r0
            return
    }

    public final void c(int r2, int r3) {
            r1 = this;
            r1.q = r2
            r1.r = r3
            com.amap.api.col.3l.w r0 = r1.f3580d
            if (r0 == 0) goto Lb
            r0.d(r2, r3)
        Lb:
            com.amap.api.col.3l.u r0 = r1.f3581e
            if (r0 == 0) goto L12
            r0.b(r2, r3)
        L12:
            com.amap.api.col.3l.t r0 = r1.f3582f
            if (r0 == 0) goto L19
            r0.b(r2, r3)
        L19:
            com.amap.api.col.3l.x r0 = r1.f3583g
            if (r0 == 0) goto L20
            r0.b(r2, r3)
        L20:
            return
    }

    public final void d(com.amap.api.maps.model.AMapGestureListener r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public final boolean e(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r6.m
            int r1 = r7.getPointerCount()
            if (r0 >= r1) goto Le
            int r0 = r7.getPointerCount()
            r6.m = r0
        Le:
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r0 != 0) goto L1b
            r6.o = r1
            r6.p = r1
        L1b:
            int r0 = r7.getAction()
            r2 = 6
            r3 = 1
            if (r0 != r2) goto L2b
            int r0 = r7.getPointerCount()
            if (r0 <= 0) goto L2b
            r6.o = r3
        L2b:
            boolean r0 = r6.n
            if (r0 == 0) goto L36
            int r0 = r6.m
            r2 = 2
            if (r0 < r2) goto L36
            r6.n = r1
        L36:
            int[] r0 = new int[]{r1, r1}     // Catch: java.lang.Throwable -> Laa
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r6.a     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L4d
            android.view.View r2 = r2.getGLMapView()     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L4d
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r6.a     // Catch: java.lang.Throwable -> Laa
            android.view.View r2 = r2.getGLMapView()     // Catch: java.lang.Throwable -> Laa
            r2.getLocationOnScreen(r0)     // Catch: java.lang.Throwable -> Laa
        L4d:
            com.amap.api.maps.model.AMapGestureListener r2 = r6.s     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L78
            int r2 = r7.getAction()     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L65
            com.amap.api.maps.model.AMapGestureListener r2 = r6.s     // Catch: java.lang.Throwable -> Laa
            float r4 = r7.getX()     // Catch: java.lang.Throwable -> Laa
            float r5 = r7.getY()     // Catch: java.lang.Throwable -> Laa
            r2.onDown(r4, r5)     // Catch: java.lang.Throwable -> Laa
            goto L78
        L65:
            int r2 = r7.getAction()     // Catch: java.lang.Throwable -> Laa
            if (r2 != r3) goto L78
            com.amap.api.maps.model.AMapGestureListener r2 = r6.s     // Catch: java.lang.Throwable -> Laa
            float r4 = r7.getX()     // Catch: java.lang.Throwable -> Laa
            float r5 = r7.getY()     // Catch: java.lang.Throwable -> Laa
            r2.onUp(r4, r5)     // Catch: java.lang.Throwable -> Laa
        L78:
            android.view.GestureDetector r2 = r6.f3579c     // Catch: java.lang.Throwable -> Laa
            r2.onTouchEvent(r7)     // Catch: java.lang.Throwable -> Laa
            com.amap.api.col.3l.t r2 = r6.f3582f     // Catch: java.lang.Throwable -> Laa
            r4 = r0[r1]     // Catch: java.lang.Throwable -> Laa
            r5 = r0[r3]     // Catch: java.lang.Throwable -> Laa
            r2.h(r7, r4, r5)     // Catch: java.lang.Throwable -> Laa
            boolean r2 = r6.f3584h     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L8e
            int r2 = r6.l     // Catch: java.lang.Throwable -> Laa
            if (r2 > 0) goto La9
        L8e:
            com.amap.api.col.3l.x r2 = r6.f3583g     // Catch: java.lang.Throwable -> Laa
            r4 = r0[r1]     // Catch: java.lang.Throwable -> Laa
            r5 = r0[r3]     // Catch: java.lang.Throwable -> Laa
            r2.h(r7, r4, r5)     // Catch: java.lang.Throwable -> Laa
            boolean r2 = r6.n     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto La9
            com.amap.api.col.3l.w r2 = r6.f3580d     // Catch: java.lang.Throwable -> Laa
            r2.e(r7)     // Catch: java.lang.Throwable -> Laa
            com.amap.api.col.3l.u r2 = r6.f3581e     // Catch: java.lang.Throwable -> Laa
            r4 = r0[r1]     // Catch: java.lang.Throwable -> Laa
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Laa
            r2.h(r7, r4, r0)     // Catch: java.lang.Throwable -> Laa
        La9:
            return r3
        Laa:
            return r1
    }

    public final int g() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    public final int j() {
            r1 = this;
            int r0 = r1.r
            return r0
    }
}

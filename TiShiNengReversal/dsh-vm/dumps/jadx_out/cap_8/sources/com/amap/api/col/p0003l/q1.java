package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class q1 {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.maps.model.Marker f3808b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.maps.model.Circle f3809c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.maps.model.MyLocationStyle f3810d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.maps.model.LatLng f3811e;

    /* renamed from: f, reason: collision with root package name */
    private double f3812f;

    /* renamed from: g, reason: collision with root package name */
    private android.content.Context f3813g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.p0003l.g f3814h;

    /* renamed from: i, reason: collision with root package name */
    private int f3815i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3816j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3817k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    com.amap.api.col.3l.q1.c p;
    android.animation.ValueAnimator q;
    android.animation.Animator.AnimatorListener r;
    android.animation.ValueAnimator.AnimatorUpdateListener s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.animation.Animator.AnimatorListener {
        final /* synthetic */ com.amap.api.col.p0003l.q1 a;

        a(com.amap.api.col.p0003l.q1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                com.amap.api.col.3l.q1 r1 = r0.a
                com.amap.api.col.p0003l.q1.f(r1)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.amap.api.col.p0003l.q1 a;

        b(com.amap.api.col.p0003l.q1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.amap.api.col.3l.q1 r0 = r1.a     // Catch: java.lang.Throwable -> L20
                com.amap.api.maps.model.Circle r0 = com.amap.api.col.p0003l.q1.j(r0)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L20
                java.lang.Object r2 = r2.getAnimatedValue()     // Catch: java.lang.Throwable -> L20
                com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L20
                com.amap.api.col.3l.q1 r0 = r1.a     // Catch: java.lang.Throwable -> L20
                com.amap.api.maps.model.Circle r0 = com.amap.api.col.p0003l.q1.j(r0)     // Catch: java.lang.Throwable -> L20
                r0.setCenter(r2)     // Catch: java.lang.Throwable -> L20
                com.amap.api.col.3l.q1 r0 = r1.a     // Catch: java.lang.Throwable -> L20
                com.amap.api.maps.model.Marker r0 = com.amap.api.col.p0003l.q1.m(r0)     // Catch: java.lang.Throwable -> L20
                r0.setPosition(r2)     // Catch: java.lang.Throwable -> L20
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c implements android.animation.TypeEvaluator {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.TypeEvaluator
        public final java.lang.Object evaluate(float r7, java.lang.Object r8, java.lang.Object r9) {
                r6 = this;
                com.amap.api.maps.model.LatLng r8 = (com.amap.api.maps.model.LatLng) r8
                com.amap.api.maps.model.LatLng r9 = (com.amap.api.maps.model.LatLng) r9
                double r0 = r8.latitude
                double r2 = (double) r7
                double r4 = r9.latitude
                double r4 = r4 - r0
                double r4 = r4 * r2
                double r0 = r0 + r4
                double r7 = r8.longitude
                double r4 = r9.longitude
                double r4 = r4 - r7
                double r2 = r2 * r4
                double r7 = r7 + r2
                com.amap.api.maps.model.LatLng r9 = new com.amap.api.maps.model.LatLng
                r9.<init>(r0, r7)
                return r9
        }
    }

    public q1(com.autonavi.base.amap.api.mapcore.IAMapDelegate r3, android.content.Context r4) {
            r2 = this;
            r2.<init>()
            com.amap.api.maps.model.MyLocationStyle r0 = new com.amap.api.maps.model.MyLocationStyle
            r0.<init>()
            r2.f3810d = r0
            r0 = 4
            r2.f3815i = r0
            r1 = 0
            r2.f3816j = r1
            r2.f3817k = r1
            r2.l = r1
            r2.m = r1
            r2.n = r1
            r2.o = r1
            r1 = 0
            r2.p = r1
            com.amap.api.col.3l.q1$a r1 = new com.amap.api.col.3l.q1$a
            r1.<init>(r2)
            r2.r = r1
            com.amap.api.col.3l.q1$b r1 = new com.amap.api.col.3l.q1$b
            r1.<init>(r2)
            r2.s = r1
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r2.f3813g = r4
            r2.a = r3
            com.amap.api.col.3l.g r1 = new com.amap.api.col.3l.g
            r1.<init>(r4, r3)
            r2.f3814h = r1
            r3 = 1
            r2.d(r0, r3)
            return
    }

    private void c(int r2) {
            r1 = this;
            r0 = 0
            r1.d(r2, r0)
            return
    }

    private void d(int r4, boolean r5) {
            r3 = this;
            r3.f3815i = r4
            r0 = 0
            r3.f3816j = r0
            r3.l = r0
            r3.f3817k = r0
            r3.n = r0
            r3.o = r0
            r1 = 1
            if (r4 == r1) goto L36
            r2 = 2
            if (r4 == r2) goto L31
            r2 = 3
            if (r4 == r2) goto L2c
            r2 = 4
            if (r4 == r2) goto L25
            r2 = 5
            if (r4 == r2) goto L20
            r2 = 7
            if (r4 == r2) goto L2e
            goto L3c
        L20:
            r3.n = r1
            r3.m = r0
            goto L3c
        L25:
            r3.f3817k = r1
            r3.n = r1
            r3.m = r0
            goto L3c
        L2c:
            r3.f3817k = r1
        L2e:
            r3.o = r1
            goto L3c
        L31:
            r3.f3817k = r1
            r3.m = r1
            goto L3c
        L36:
            r3.f3817k = r1
            r3.l = r1
            r3.m = r1
        L3c:
            boolean r4 = r3.n
            if (r4 != 0) goto L56
            boolean r4 = r3.o
            if (r4 == 0) goto L45
            goto L56
        L45:
            com.amap.api.maps.model.Marker r4 = r3.f3808b
            if (r4 == 0) goto L4c
            r4.setFlat(r0)
        L4c:
            r3.u()
            r3.t()
            r3.s()
            return
        L56:
            boolean r4 = r3.o
            if (r4 == 0) goto L72
            com.amap.api.col.3l.g r4 = r3.f3814h
            r4.f(r1)
            if (r5 != 0) goto L6c
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r3.a     // Catch: java.lang.Throwable -> L6c
            r5 = 1099431936(0x41880000, float:17.0)
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r5 = com.amap.api.col.p0003l.p.b(r5)     // Catch: java.lang.Throwable -> L6c
            r4.moveCamera(r5)     // Catch: java.lang.Throwable -> L6c
        L6c:
            r4 = 1110704128(0x42340000, float:45.0)
            r3.l(r4)
            goto L77
        L72:
            com.amap.api.col.3l.g r4 = r3.f3814h
            r4.f(r0)
        L77:
            com.amap.api.col.3l.g r4 = r3.f3814h
            r4.d()
            com.amap.api.maps.model.Marker r4 = r3.f3808b
            if (r4 == 0) goto L83
            r4.setFlat(r1)
        L83:
            return
    }

    static /* synthetic */ void f(com.amap.api.col.p0003l.q1 r0) {
            r0.w()
            return
    }

    private void g(com.amap.api.maps.model.LatLng r8) {
            r7 = this;
            com.amap.api.maps.model.Marker r0 = r7.f3808b
            com.amap.api.maps.model.LatLng r0 = r0.getPosition()
            r1 = 0
            if (r0 != 0) goto Lf
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            r0.<init>(r1, r1)
        Lf:
            com.amap.api.col.3l.q1$c r3 = r7.p
            if (r3 != 0) goto L1a
            com.amap.api.col.3l.q1$c r3 = new com.amap.api.col.3l.q1$c
            r3.<init>()
            r7.p = r3
        L1a:
            android.animation.ValueAnimator r3 = r7.q
            r4 = 1
            r5 = 0
            r6 = 2
            if (r3 != 0) goto L3f
            com.amap.api.col.3l.q1$c r3 = new com.amap.api.col.3l.q1$c
            r3.<init>()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r0
            r6[r4] = r8
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofObject(r3, r6)
            r7.q = r8
            android.animation.Animator$AnimatorListener r3 = r7.r
            r8.addListener(r3)
            android.animation.ValueAnimator r8 = r7.q
            android.animation.ValueAnimator$AnimatorUpdateListener r3 = r7.s
            r8.addUpdateListener(r3)
            goto L4f
        L3f:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r0
            r6[r4] = r8
            r3.setObjectValues(r6)
            android.animation.ValueAnimator r8 = r7.q
            com.amap.api.col.3l.q1$c r3 = r7.p
            r8.setEvaluator(r3)
        L4f:
            double r3 = r0.latitude
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L63
            double r3 = r0.longitude
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L63
            android.animation.ValueAnimator r8 = r7.q
            r0 = 1
            r8.setDuration(r0)
            goto L6a
        L63:
            android.animation.ValueAnimator r8 = r7.q
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.setDuration(r0)
        L6a:
            android.animation.ValueAnimator r8 = r7.q
            r8.start()
            return
    }

    private void i(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.Circle r0 = r1.f3809c
            if (r0 == 0) goto Lf
            boolean r0 = r0.isVisible()
            if (r0 == r2) goto Lf
            com.amap.api.maps.model.Circle r0 = r1.f3809c
            r0.setVisible(r2)
        Lf:
            com.amap.api.maps.model.Marker r0 = r1.f3808b
            if (r0 == 0) goto L1e
            boolean r0 = r0.isVisible()
            if (r0 == r2) goto L1e
            com.amap.api.maps.model.Marker r0 = r1.f3808b
            r0.setVisible(r2)
        L1e:
            return
    }

    static /* synthetic */ com.amap.api.maps.model.Circle j(com.amap.api.col.p0003l.q1 r0) {
            com.amap.api.maps.model.Circle r0 = r0.f3809c
            return r0
    }

    private void l(float r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            if (r0 != 0) goto L5
            goto Lc
        L5:
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2 = com.amap.api.col.p0003l.p.p(r2)     // Catch: java.lang.Throwable -> Lc
            r0.moveCamera(r2)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    static /* synthetic */ com.amap.api.maps.model.Marker m(com.amap.api.col.p0003l.q1 r0) {
            com.amap.api.maps.model.Marker r0 = r0.f3808b
            return r0
    }

    private void o(float r3) {
            r2 = this;
            boolean r0 = r2.m
            if (r0 != 0) goto L5
            goto L1f
        L5:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L10
            float r3 = r3 - r0
            goto L17
        L10:
            r1 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L17
            float r3 = r3 + r0
        L17:
            com.amap.api.maps.model.Marker r0 = r2.f3808b
            if (r0 == 0) goto L1f
            float r3 = -r3
            r0.setRotateAngle(r3)
        L1f:
            return
    }

    private void s() {
            r1 = this;
            com.amap.api.col.3l.g r0 = r1.f3814h
            r0.h()
            return
    }

    private void t() {
            r1 = this;
            r0 = 0
            r1.l(r0)
            return
    }

    private void u() {
            r0 = this;
            r0.v()
            return
    }

    private void v() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a
            if (r0 != 0) goto L5
            goto Ld
        L5:
            r1 = 0
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.q(r1)     // Catch: java.lang.Throwable -> Ld
            r0.moveCamera(r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    private void w() {
            r6 = this;
            com.amap.api.maps.model.LatLng r0 = r6.f3811e
            if (r0 != 0) goto L5
            goto L12
        L5:
            boolean r0 = r6.f3817k
            if (r0 != 0) goto La
            goto L12
        La:
            boolean r0 = r6.l
            if (r0 == 0) goto L13
            boolean r0 = r6.f3816j
            if (r0 == 0) goto L13
        L12:
            return
        L13:
            r0 = 1
            r6.f3816j = r0
            com.autonavi.amap.mapcore.IPoint r0 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L2d
            com.amap.api.maps.model.LatLng r1 = r6.f3811e     // Catch: java.lang.Throwable -> L2d
            double r2 = r1.longitude     // Catch: java.lang.Throwable -> L2d
            double r4 = r1.latitude     // Catch: java.lang.Throwable -> L2d
            com.autonavi.base.ae.gmap.GLMapState.lonlat2Geo(r2, r4, r0)     // Catch: java.lang.Throwable -> L2d
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r6.a     // Catch: java.lang.Throwable -> L2d
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r0 = com.amap.api.col.p0003l.p.e(r0)     // Catch: java.lang.Throwable -> L2d
            r1.animateCamera(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            java.lang.String r1 = "MyLocationOverlay"
            java.lang.String r2 = "moveMapToLocation"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    private void x() {
            r2 = this;
            com.amap.api.maps.model.MyLocationStyle r0 = r2.f3810d
            java.lang.String r1 = "location_map_gps_locked.png"
            if (r0 != 0) goto L15
            com.amap.api.maps.model.MyLocationStyle r0 = new com.amap.api.maps.model.MyLocationStyle
            r0.<init>()
            r2.f3810d = r0
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r1)
            r0.myLocationIcon(r1)
            goto L30
        L15:
            com.amap.api.maps.model.BitmapDescriptor r0 = r0.getMyLocationIcon()
            if (r0 == 0) goto L27
            com.amap.api.maps.model.MyLocationStyle r0 = r2.f3810d
            com.amap.api.maps.model.BitmapDescriptor r0 = r0.getMyLocationIcon()
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 != 0) goto L30
        L27:
            com.amap.api.maps.model.MyLocationStyle r0 = r2.f3810d
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r1)
            r0.myLocationIcon(r1)
        L30:
            r2.z()
            return
    }

    private void y() {
            r4 = this;
            com.amap.api.maps.model.Circle r0 = r4.f3809c
            r1 = 0
            if (r0 == 0) goto L19
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r4.a     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Throwable -> Lf
            r2.removeGLOverlay(r0)     // Catch: java.lang.Throwable -> Lf
            goto L17
        Lf:
            r0 = move-exception
            java.lang.String r2 = "MyLocationOverlay"
            java.lang.String r3 = "locationIconRemove"
            com.amap.api.col.p0003l.w5.p(r0, r2, r3)
        L17:
            r4.f3809c = r1
        L19:
            com.amap.api.maps.model.Marker r0 = r4.f3808b
            if (r0 == 0) goto L27
            r0.remove()
            r4.f3808b = r1
            com.amap.api.col.3l.g r0 = r4.f3814h
            r0.e(r1)
        L27:
            return
    }

    private void z() {
            r5 = this;
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r5.a     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.CircleOptions r1 = new com.amap.api.maps.model.CircleOptions     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            r2 = 1065353216(0x3f800000, float:1.0)
            com.amap.api.maps.model.CircleOptions r1 = r1.zIndex(r2)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.Circle r0 = r0.addCircle(r1)     // Catch: java.lang.Throwable -> L18
            r5.f3809c = r0     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            goto L12e
        L1b:
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            r1 = 1
            if (r0 == 0) goto L80
            float r0 = r0.getStrokeWidth()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            float r2 = r2.getStrokeWidth()     // Catch: java.lang.Throwable -> L18
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L39
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            float r2 = r2.getStrokeWidth()     // Catch: java.lang.Throwable -> L18
            r0.setStrokeWidth(r2)     // Catch: java.lang.Throwable -> L18
        L39:
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            int r0 = r0.getFillColor()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            int r2 = r2.getRadiusFillColor()     // Catch: java.lang.Throwable -> L18
            if (r0 == r2) goto L52
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            int r2 = r2.getRadiusFillColor()     // Catch: java.lang.Throwable -> L18
            r0.setFillColor(r2)     // Catch: java.lang.Throwable -> L18
        L52:
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            int r0 = r0.getStrokeColor()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            int r2 = r2.getStrokeColor()     // Catch: java.lang.Throwable -> L18
            if (r0 == r2) goto L6b
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            int r2 = r2.getStrokeColor()     // Catch: java.lang.Throwable -> L18
            r0.setStrokeColor(r2)     // Catch: java.lang.Throwable -> L18
        L6b:
            com.amap.api.maps.model.LatLng r0 = r5.f3811e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L74
            com.amap.api.maps.model.Circle r2 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            r2.setCenter(r0)     // Catch: java.lang.Throwable -> L18
        L74:
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            double r2 = r5.f3812f     // Catch: java.lang.Throwable -> L18
            r0.setRadius(r2)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.Circle r0 = r5.f3809c     // Catch: java.lang.Throwable -> L18
            r0.setVisible(r1)     // Catch: java.lang.Throwable -> L18
        L80:
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            r2 = 0
            if (r0 != 0) goto L96
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r5.a     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MarkerOptions r3 = new com.amap.api.maps.model.MarkerOptions     // Catch: java.lang.Throwable -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MarkerOptions r3 = r3.visible(r2)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.Marker r0 = r0.addMarker(r3)     // Catch: java.lang.Throwable -> L18
            r5.f3808b = r0     // Catch: java.lang.Throwable -> L18
        L96:
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L123
            float r0 = r0.getAnchorU()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r3 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            float r3 = r3.getAnchorU()     // Catch: java.lang.Throwable -> L18
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Lb8
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            float r0 = r0.getAnchorV()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r3 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            float r3 = r3.getAnchorV()     // Catch: java.lang.Throwable -> L18
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lc9
        Lb8:
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r3 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            float r3 = r3.getAnchorU()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r4 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            float r4 = r4.getAnchorV()     // Catch: java.lang.Throwable -> L18
            r0.setAnchor(r3, r4)     // Catch: java.lang.Throwable -> L18
        Lc9:
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            java.util.ArrayList r0 = r0.getIcons()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L10a
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            java.util.ArrayList r0 = r0.getIcons()     // Catch: java.lang.Throwable -> L18
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto Lde
            goto L10a
        Lde:
            com.amap.api.maps.model.MyLocationStyle r0 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.BitmapDescriptor r0 = r0.getMyLocationIcon()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L115
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            java.util.ArrayList r0 = r0.getIcons()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.BitmapDescriptor r0 = (com.amap.api.maps.model.BitmapDescriptor) r0     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.BitmapDescriptor r2 = r2.getMyLocationIcon()     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L115
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.BitmapDescriptor r2 = r2.getMyLocationIcon()     // Catch: java.lang.Throwable -> L18
            r0.setIcon(r2)     // Catch: java.lang.Throwable -> L18
            goto L115
        L10a:
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.MyLocationStyle r2 = r5.f3810d     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.BitmapDescriptor r2 = r2.getMyLocationIcon()     // Catch: java.lang.Throwable -> L18
            r0.setIcon(r2)     // Catch: java.lang.Throwable -> L18
        L115:
            com.amap.api.maps.model.LatLng r0 = r5.f3811e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L123
            com.amap.api.maps.model.Marker r2 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            r2.setPosition(r0)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.Marker r0 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            r0.setVisible(r1)     // Catch: java.lang.Throwable -> L18
        L123:
            r5.w()     // Catch: java.lang.Throwable -> L18
            com.amap.api.col.3l.g r0 = r5.f3814h     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.Marker r1 = r5.f3808b     // Catch: java.lang.Throwable -> L18
            r0.e(r1)     // Catch: java.lang.Throwable -> L18
            return
        L12e:
            java.lang.String r1 = "MyLocationOverlay"
            java.lang.String r2 = "myLocStyle"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public final com.amap.api.maps.model.MyLocationStyle a() {
            r1 = this;
            com.amap.api.maps.model.MyLocationStyle r0 = r1.f3810d
            return r0
    }

    public final void b(float r2) {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.f3808b
            if (r0 == 0) goto L7
            r0.setRotateAngle(r2)
        L7:
            return
    }

    public final void e(android.location.Location r7) {
            r6 = this;
            if (r7 != 0) goto L3
            goto L14
        L3:
            com.amap.api.maps.model.MyLocationStyle r0 = r6.f3810d
            boolean r0 = r0.isMyLocationShowing()
            r6.i(r0)
            com.amap.api.maps.model.MyLocationStyle r0 = r6.f3810d
            boolean r0 = r0.isMyLocationShowing()
            if (r0 != 0) goto L15
        L14:
            return
        L15:
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            double r1 = r7.getLatitude()
            double r3 = r7.getLongitude()
            r0.<init>(r1, r3)
            r6.f3811e = r0
            float r0 = r7.getAccuracy()
            double r0 = (double) r0
            r6.f3812f = r0
            com.amap.api.maps.model.Marker r0 = r6.f3808b
            if (r0 != 0) goto L36
            com.amap.api.maps.model.Circle r0 = r6.f3809c
            if (r0 != 0) goto L36
            r6.x()
        L36:
            com.amap.api.maps.model.Circle r0 = r6.f3809c
            if (r0 == 0) goto L4e
            double r1 = r6.f3812f     // Catch: java.lang.Throwable -> L46
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L4e
            r0.setRadius(r1)     // Catch: java.lang.Throwable -> L46
            goto L4e
        L46:
            r0 = move-exception
            java.lang.String r1 = "MyLocationOverlay"
            java.lang.String r2 = "setCentAndRadius"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L4e:
            float r7 = r7.getBearing()
            r6.o(r7)
            com.amap.api.maps.model.LatLng r7 = r6.f3811e
            com.amap.api.maps.model.Marker r0 = r6.f3808b
            com.amap.api.maps.model.LatLng r0 = r0.getPosition()
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L69
            com.amap.api.maps.model.LatLng r7 = r6.f3811e
            r6.g(r7)
            return
        L69:
            r6.w()
            return
    }

    public final void h(com.amap.api.maps.model.MyLocationStyle r3) {
            r2 = this;
            r2.f3810d = r3     // Catch: java.lang.Throwable -> L20
            boolean r3 = r3.isMyLocationShowing()     // Catch: java.lang.Throwable -> L20
            r2.i(r3)     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.MyLocationStyle r3 = r2.f3810d     // Catch: java.lang.Throwable -> L20
            boolean r3 = r3.isMyLocationShowing()     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L22
            com.amap.api.col.3l.g r3 = r2.f3814h     // Catch: java.lang.Throwable -> L20
            r0 = 0
            r3.f(r0)     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.MyLocationStyle r3 = r2.f3810d     // Catch: java.lang.Throwable -> L20
            int r3 = r3.getMyLocationType()     // Catch: java.lang.Throwable -> L20
            r2.f3815i = r3     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r3 = move-exception
            goto L3d
        L22:
            r2.x()     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.Marker r3 = r2.f3808b     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L2e
            com.amap.api.maps.model.Circle r0 = r2.f3809c     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L2e
            return
        L2e:
            com.amap.api.col.3l.g r0 = r2.f3814h     // Catch: java.lang.Throwable -> L20
            r0.e(r3)     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.MyLocationStyle r3 = r2.f3810d     // Catch: java.lang.Throwable -> L20
            int r3 = r3.getMyLocationType()     // Catch: java.lang.Throwable -> L20
            r2.c(r3)     // Catch: java.lang.Throwable -> L20
            return
        L3d:
            java.lang.String r0 = "MyLocationOverlay"
            java.lang.String r1 = "setMyLocationStyle"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    public final void k() {
            r2 = this;
            int r0 = r2.f3815i
            r1 = 3
            if (r0 != r1) goto Lc
            com.amap.api.col.3l.g r0 = r2.f3814h
            if (r0 == 0) goto Lc
            r0.d()
        Lc:
            return
    }

    public final void n() throws android.os.RemoteException {
            r1 = this;
            r1.y()
            com.amap.api.col.3l.g r0 = r1.f3814h
            if (r0 == 0) goto Ld
            r1.s()
            r0 = 0
            r1.f3814h = r0
        Ld:
            return
    }

    public final java.lang.String p() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.f3808b
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getId()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final java.lang.String q() throws android.os.RemoteException {
            r1 = this;
            com.amap.api.maps.model.Circle r0 = r1.f3809c
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getId()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void r() {
            r1 = this;
            r0 = 0
            r1.f3809c = r0
            r1.f3808b = r0
            return
    }
}

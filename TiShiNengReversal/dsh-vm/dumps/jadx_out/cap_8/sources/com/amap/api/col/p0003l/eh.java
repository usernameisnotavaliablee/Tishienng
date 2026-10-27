package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class eh extends android.view.ViewGroup implements com.amap.api.col.p0003l.i3 {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.maps.interfaces.IGlOverlayLayer f3225b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f3226c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.p0003l.el f3227d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.eg f3228e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.p0003l.ee f3229f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.ek f3230g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.p0003l.ed f3231h;

    /* renamed from: i, reason: collision with root package name */
    private com.amap.api.col.p0003l.ef f3232i;

    /* renamed from: j, reason: collision with root package name */
    private com.amap.api.col.p0003l.k3 f3233j;

    /* renamed from: k, reason: collision with root package name */
    private android.view.View f3234k;
    private com.amap.api.maps.model.BasePointOverlay l;
    private android.graphics.drawable.Drawable m;
    private boolean n;
    private android.view.View o;
    private boolean p;
    com.amap.api.col.p0003l.j3 q;
    private boolean r;
    private boolean s;
    com.amap.api.col.p0003l.a0 t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements com.autonavi.base.ae.gmap.listener.AMapWidgetListener {
        final /* synthetic */ com.amap.api.col.p0003l.eh a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.amap.api.col.3l.eh$a$a, reason: collision with other inner class name */
        final class RunnableC0088a implements java.lang.Runnable {
            final /* synthetic */ com.amap.api.col.3l.eh.a a;

            RunnableC0088a(com.amap.api.col.3l.eh.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r1 = this;
                    com.amap.api.col.3l.eh$a r0 = r1.a
                    com.amap.api.col.3l.eh r0 = r0.a
                    com.amap.api.col.3l.ek r0 = com.amap.api.col.p0003l.eh.u(r0)
                    r0.e()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class b implements java.lang.Runnable {
            final /* synthetic */ com.amap.api.col.3l.eh.a a;

            b(com.amap.api.col.3l.eh.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r1 = this;
                    com.amap.api.col.3l.eh$a r0 = r1.a
                    com.amap.api.col.3l.eh r0 = r0.a
                    com.amap.api.col.3l.ee r0 = com.amap.api.col.p0003l.eh.B(r0)
                    r0.c()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class c implements java.lang.Runnable {
            final /* synthetic */ float a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.amap.api.col.3l.eh.a f3235b;

            c(com.amap.api.col.3l.eh.a r1, float r2) {
                    r0 = this;
                    r0.f3235b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    com.amap.api.col.3l.eh$a r0 = r2.f3235b
                    com.amap.api.col.3l.eh r0 = r0.a
                    com.amap.api.col.3l.k3 r0 = com.amap.api.col.p0003l.eh.C(r0)
                    float r1 = r2.a
                    r0.c(r1)
                    return
            }
        }

        a(com.amap.api.col.p0003l.eh r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void invalidateCompassView() {
                r2 = this;
                com.amap.api.col.3l.eh r0 = r2.a
                com.amap.api.col.3l.ee r0 = com.amap.api.col.p0003l.eh.B(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.3l.eh r0 = r2.a
                com.amap.api.col.3l.ee r0 = com.amap.api.col.p0003l.eh.B(r0)
                com.amap.api.col.3l.eh$a$b r1 = new com.amap.api.col.3l.eh$a$b
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void invalidateScaleView() {
                r2 = this;
                com.amap.api.col.3l.eh r0 = r2.a
                com.amap.api.col.3l.ek r0 = com.amap.api.col.p0003l.eh.u(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.3l.eh r0 = r2.a
                com.amap.api.col.3l.ek r0 = com.amap.api.col.p0003l.eh.u(r0)
                com.amap.api.col.3l.eh$a$a r1 = new com.amap.api.col.3l.eh$a$a
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void invalidateZoomController(float r3) {
                r2 = this;
                com.amap.api.col.3l.eh r0 = r2.a
                com.amap.api.col.3l.k3 r0 = com.amap.api.col.p0003l.eh.C(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.3l.eh r0 = r2.a
                com.amap.api.col.3l.k3 r0 = com.amap.api.col.p0003l.eh.C(r0)
                com.amap.api.col.3l.eh$a$c r1 = new com.amap.api.col.3l.eh$a$c
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void setFrontViewVisibility(boolean r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.eh a;

        b(com.amap.api.col.p0003l.eh r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.eh r0 = r2.a
                android.view.View r0 = com.amap.api.col.p0003l.eh.D(r0)
                if (r0 == 0) goto L35
                com.amap.api.col.3l.eh r0 = r2.a
                android.view.View r0 = com.amap.api.col.p0003l.eh.D(r0)
                r0.clearFocus()
                com.amap.api.col.3l.eh r0 = r2.a
                android.view.View r1 = com.amap.api.col.p0003l.eh.D(r0)
                r0.removeView(r1)
                com.amap.api.col.3l.eh r0 = r2.a
                android.view.View r0 = com.amap.api.col.p0003l.eh.D(r0)
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                com.amap.api.col.p0003l.b3.C(r0)
                com.amap.api.col.3l.eh r0 = r2.a
                android.graphics.drawable.Drawable r0 = com.amap.api.col.p0003l.eh.E(r0)
                com.amap.api.col.p0003l.b3.C(r0)
                com.amap.api.col.3l.eh r0 = r2.a
                com.amap.api.col.p0003l.eh.F(r0)
            L35:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends android.view.ViewGroup.LayoutParams {
        public com.autonavi.base.amap.mapcore.FPoint a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3236b;

        /* renamed from: c, reason: collision with root package name */
        public int f3237c;

        /* renamed from: d, reason: collision with root package name */
        public int f3238d;

        /* renamed from: e, reason: collision with root package name */
        public int f3239e;

        public c(int r1, int r2, float r3, float r4, int r5, int r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2)
                com.autonavi.base.amap.mapcore.FPoint r1 = new com.autonavi.base.amap.mapcore.FPoint
                r1.<init>()
                r0.a = r1
                r2 = 0
                r0.f3236b = r2
                r1.x = r3
                r1.y = r4
                r0.f3237c = r5
                r0.f3238d = r6
                r0.f3239e = r7
                return
        }

        public c(com.autonavi.base.amap.mapcore.FPoint r9, int r10) {
                r8 = this;
                float r3 = r9.x
                float r4 = r9.y
                r5 = 0
                r6 = 0
                r1 = -2
                r2 = -2
                r0 = r8
                r7 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    public eh(android.content.Context r3, com.autonavi.base.amap.api.mapcore.IAMapDelegate r4, com.amap.api.maps.interfaces.IGlOverlayLayer r5) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.m = r0
            r0 = 1
            r2.n = r0
            r2.r = r0
            r2.s = r0
            r2.f3225b = r5     // Catch: java.lang.Throwable -> L3a
            r2.a = r4     // Catch: java.lang.Throwable -> L3a
            r2.f3226c = r3     // Catch: java.lang.Throwable -> L3a
            com.amap.api.col.3l.j3 r4 = new com.amap.api.col.3l.j3     // Catch: java.lang.Throwable -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L3a
            r2.q = r4     // Catch: java.lang.Throwable -> L3a
            com.amap.api.col.3l.ed r4 = new com.amap.api.col.3l.ed     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            r2.f3231h = r4     // Catch: java.lang.Throwable -> L3a
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L3a
            r5 = -1
            r4.<init>(r5, r5)     // Catch: java.lang.Throwable -> L3a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r5 = r2.a     // Catch: java.lang.Throwable -> L3a
            android.view.View r5 = r5.getGLMapView()     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            if (r5 == 0) goto L3c
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r5 = r2.a     // Catch: java.lang.Throwable -> L3a
            android.view.View r5 = r5.getGLMapView()     // Catch: java.lang.Throwable -> L3a
            r2.addView(r5, r1, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r3 = move-exception
            goto L4a
        L3c:
            r0 = 0
        L3d:
            com.amap.api.col.3l.ed r5 = r2.f3231h     // Catch: java.lang.Throwable -> L3a
            r2.addView(r5, r0, r4)     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r2.r     // Catch: java.lang.Throwable -> L3a
            if (r4 != 0) goto L49
            r2.v(r3)     // Catch: java.lang.Throwable -> L3a
        L49:
            return
        L4a:
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    private void A(android.view.View r10, com.amap.api.col.3l.eh.c r11) {
            r9 = this;
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r11.width
            int r5 = r11.height
            r9.y(r10, r4, r5, r3)
            boolean r4 = r10 instanceof com.amap.api.col.p0003l.k3
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L2c
            r4 = r3[r6]
            r7 = r3
            r3 = r7[r5]
            int r5 = r9.getWidth()
            r6 = r7[r6]
            int r5 = r5 - r6
            r6 = r4
            r4 = r5
            int r5 = r9.getHeight()
            r7 = r6
            int r6 = r11.f3239e
            r0 = r9
            r1 = r10
            r2 = r7
            r0.x(r1, r2, r3, r4, r5, r6)
            return
        L2c:
            r7 = r3
            boolean r0 = r10 instanceof com.amap.api.col.p0003l.eg
            if (r0 == 0) goto L47
            r0 = r7[r6]
            r3 = r7[r5]
            int r4 = r9.getWidth()
            r6 = r7[r6]
            int r4 = r4 - r6
            r5 = r7[r5]
            int r6 = r11.f3239e
            r1 = r10
            r2 = r0
            r0 = r9
            r0.x(r1, r2, r3, r4, r5, r6)
            return
        L47:
            boolean r0 = r10 instanceof com.amap.api.col.p0003l.ee
            if (r0 == 0) goto L5a
            r0 = r7[r6]
            r3 = r7[r5]
            r5 = 0
            int r6 = r11.f3239e
            r4 = 0
            r1 = r10
            r2 = r0
            r0 = r9
            r0.x(r1, r2, r3, r4, r5, r6)
            return
        L5a:
            com.autonavi.base.amap.mapcore.FPoint r1 = r11.a
            if (r1 == 0) goto L9e
            com.autonavi.amap.mapcore.IPoint r8 = com.autonavi.amap.mapcore.IPoint.obtain()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r9.a
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r9.a
            com.autonavi.base.ae.gmap.GLMapState r3 = r3.getMapProjection()
            if (r1 == 0) goto L7e
            if (r3 == 0) goto L7e
            com.autonavi.base.amap.mapcore.FPoint r1 = r11.a
            float r3 = r1.x
            int r3 = (int) r3
            r8.x = r3
            float r1 = r1.y
            int r1 = (int) r1
            r8.y = r1
        L7e:
            int r1 = r8.x
            int r3 = r11.f3237c
            int r4 = r1 + r3
            r8.x = r4
            int r1 = r8.y
            int r3 = r11.f3238d
            int r1 = r1 + r3
            r8.y = r1
            r3 = r7[r6]
            r5 = r7[r5]
            int r6 = r11.f3239e
            r0 = r9
            r2 = r3
            r3 = r5
            r5 = r1
            r1 = r10
            r0.x(r1, r2, r3, r4, r5, r6)
            r8.recycle()
        L9e:
            return
    }

    static /* synthetic */ com.amap.api.col.p0003l.ee B(com.amap.api.col.p0003l.eh r0) {
            com.amap.api.col.3l.ee r0 = r0.f3229f
            return r0
    }

    static /* synthetic */ com.amap.api.col.p0003l.k3 C(com.amap.api.col.p0003l.eh r0) {
            com.amap.api.col.3l.k3 r0 = r0.f3233j
            return r0
    }

    static /* synthetic */ android.view.View D(com.amap.api.col.p0003l.eh r0) {
            android.view.View r0 = r0.f3234k
            return r0
    }

    static /* synthetic */ android.graphics.drawable.Drawable E(com.amap.api.col.p0003l.eh r0) {
            android.graphics.drawable.Drawable r0 = r0.m
            return r0
    }

    static /* synthetic */ android.view.View F(com.amap.api.col.p0003l.eh r1) {
            r0 = 0
            r1.f3234k = r0
            return r0
    }

    private void G() {
            r2 = this;
            com.amap.api.col.3l.ek r0 = r2.f3230g
            if (r0 != 0) goto Ld
            com.amap.api.col.3l.j3 r0 = r2.q
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.b(r2, r1)
            return
        Ld:
            if (r0 == 0) goto L1a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1a
            com.amap.api.col.3l.ek r0 = r2.f3230g
            r0.postInvalidate()
        L1a:
            return
    }

    private void H() {
            r1 = this;
            com.amap.api.col.3l.k3 r0 = r1.f3233j
            if (r0 == 0) goto L7
            r0.b()
        L7:
            com.amap.api.col.3l.ek r0 = r1.f3230g
            if (r0 == 0) goto Le
            r0.a()
        Le:
            com.amap.api.col.3l.el r0 = r1.f3227d
            if (r0 == 0) goto L15
            r0.b()
        L15:
            com.amap.api.col.3l.eg r0 = r1.f3228e
            if (r0 == 0) goto L1c
            r0.a()
        L1c:
            com.amap.api.col.3l.ee r0 = r1.f3229f
            if (r0 == 0) goto L23
            r0.a()
        L23:
            com.amap.api.col.3l.ef r0 = r1.f3232i
            if (r0 == 0) goto L2a
            r0.e()
        L2a:
            return
    }

    private android.view.View t(com.amap.api.maps.model.BasePointOverlay r8) throws android.os.RemoteException {
            r7 = this;
            boolean r0 = r8 instanceof com.amap.api.maps.model.Marker
            java.lang.String r1 = "getInfoWindow or getInfoContents"
            r2 = 0
            java.lang.String r3 = "showInfoWindow decodeDrawableFromAsset"
            java.lang.String r4 = "infowindow_bg.9.png"
            java.lang.String r5 = "MapOverlayViewGroup"
            r6 = 0
            if (r0 == 0) goto L64
            android.graphics.drawable.Drawable r0 = r7.m     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1f
            android.content.Context r0 = r7.f3226c     // Catch: java.lang.Throwable -> L1b
            android.graphics.drawable.Drawable r0 = com.amap.api.col.p0003l.q2.c(r0, r4)     // Catch: java.lang.Throwable -> L1b
            r7.m = r0     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r0 = move-exception
            com.amap.api.col.p0003l.w5.p(r0, r5, r3)
        L1f:
            boolean r0 = r7.p     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3c
            com.amap.api.col.3l.a0 r0 = r7.t     // Catch: java.lang.Throwable -> L3a
            android.view.View r0 = r0.d(r8)     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L35
            com.amap.api.col.3l.a0 r3 = r7.t     // Catch: java.lang.Throwable -> L32
            android.view.View r0 = r3.p(r8)     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            r8 = move-exception
            r6 = r0
            goto L60
        L35:
            r7.o = r0     // Catch: java.lang.Throwable -> L32
            r7.p = r2     // Catch: java.lang.Throwable -> L32
            goto L3e
        L3a:
            r8 = move-exception
            goto L60
        L3c:
            android.view.View r0 = r7.o     // Catch: java.lang.Throwable -> L3a
        L3e:
            if (r0 != 0) goto L51
            com.amap.api.col.3l.a0 r2 = r7.t     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.n()     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L49
            return r6
        L49:
            com.amap.api.col.3l.a0 r2 = r7.t     // Catch: java.lang.Throwable -> L32
            android.view.View r8 = r2.d(r8)     // Catch: java.lang.Throwable -> L32
            r6 = r8
            goto L52
        L51:
            r6 = r0
        L52:
            if (r6 == 0) goto Lb7
            android.graphics.drawable.Drawable r8 = r6.getBackground()     // Catch: java.lang.Throwable -> L3a
            if (r8 != 0) goto Lb7
            android.graphics.drawable.Drawable r8 = r7.m     // Catch: java.lang.Throwable -> L3a
            r6.setBackground(r8)     // Catch: java.lang.Throwable -> L3a
            goto Lb7
        L60:
            com.amap.api.col.p0003l.w5.p(r8, r5, r1)
            goto Lb7
        L64:
            android.graphics.drawable.Drawable r0 = r7.m     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L75
            android.content.Context r0 = r7.f3226c     // Catch: java.lang.Throwable -> L71
            android.graphics.drawable.Drawable r0 = com.amap.api.col.p0003l.q2.c(r0, r4)     // Catch: java.lang.Throwable -> L71
            r7.m = r0     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r0 = move-exception
            com.amap.api.col.p0003l.w5.p(r0, r5, r3)
        L75:
            boolean r0 = r7.p     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L92
            com.amap.api.col.3l.a0 r0 = r7.t     // Catch: java.lang.Throwable -> L90
            android.view.View r0 = r0.d(r8)     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L8b
            com.amap.api.col.3l.a0 r3 = r7.t     // Catch: java.lang.Throwable -> L88
            android.view.View r0 = r3.p(r8)     // Catch: java.lang.Throwable -> L88
            goto L8b
        L88:
            r8 = move-exception
            r6 = r0
            goto Lb4
        L8b:
            r7.o = r0     // Catch: java.lang.Throwable -> L88
            r7.p = r2     // Catch: java.lang.Throwable -> L88
            goto L94
        L90:
            r8 = move-exception
            goto Lb4
        L92:
            android.view.View r0 = r7.o     // Catch: java.lang.Throwable -> L90
        L94:
            if (r0 != 0) goto La7
            com.amap.api.col.3l.a0 r2 = r7.t     // Catch: java.lang.Throwable -> L88
            boolean r2 = r2.n()     // Catch: java.lang.Throwable -> L88
            if (r2 != 0) goto L9f
            return r6
        L9f:
            com.amap.api.col.3l.a0 r2 = r7.t     // Catch: java.lang.Throwable -> L88
            android.view.View r8 = r2.d(r8)     // Catch: java.lang.Throwable -> L88
            r6 = r8
            goto La8
        La7:
            r6 = r0
        La8:
            android.graphics.drawable.Drawable r8 = r6.getBackground()     // Catch: java.lang.Throwable -> L90
            if (r8 != 0) goto Lb3
            android.graphics.drawable.Drawable r8 = r7.m     // Catch: java.lang.Throwable -> L90
            r6.setBackground(r8)     // Catch: java.lang.Throwable -> L90
        Lb3:
            return r6
        Lb4:
            com.amap.api.col.p0003l.w5.p(r8, r5, r1)
        Lb7:
            return r6
    }

    static /* synthetic */ com.amap.api.col.p0003l.ek u(com.amap.api.col.p0003l.eh r0) {
            com.amap.api.col.3l.ek r0 = r0.f3230g
            return r0
    }

    private void v(android.content.Context r4) {
            r3 = this;
            com.amap.api.col.3l.el r0 = new com.amap.api.col.3l.el
            r0.<init>(r4)
            r3.f3227d = r0
            boolean r1 = r3.s
            r0.n(r1)
            com.amap.api.col.3l.ek r0 = new com.amap.api.col.3l.ek
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
            r0.<init>(r4, r1)
            r3.f3230g = r0
            com.amap.api.col.3l.ef r0 = new com.amap.api.col.3l.ef
            r0.<init>(r4)
            r3.f3232i = r0
            com.amap.api.col.3l.k3 r0 = new com.amap.api.col.3l.k3
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
            r0.<init>(r4, r1)
            r3.f3233j = r0
            com.amap.api.col.3l.eg r0 = new com.amap.api.col.3l.eg
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
            r0.<init>(r4, r1)
            r3.f3228e = r0
            com.amap.api.col.3l.ee r0 = new com.amap.api.col.3l.ee
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
            r0.<init>(r4, r1)
            r3.f3229f = r0
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r4.<init>(r0, r0)
            com.amap.api.col.3l.el r0 = r3.f3227d
            r3.addView(r0, r4)
            com.amap.api.col.3l.ek r0 = r3.f3230g
            r3.addView(r0, r4)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r0 = -2
            r4.<init>(r0, r0)
            com.amap.api.col.3l.ef r0 = r3.f3232i
            r3.addView(r0, r4)
            com.amap.api.col.3l.eh$c r4 = new com.amap.api.col.3l.eh$c
            com.autonavi.base.amap.mapcore.FPoint r0 = new com.autonavi.base.amap.mapcore.FPoint
            r1 = 0
            r0.<init>(r1, r1)
            r2 = 83
            r4.<init>(r0, r2)
            com.amap.api.col.3l.k3 r0 = r3.f3233j
            r3.addView(r0, r4)
            com.amap.api.col.3l.eh$c r4 = new com.amap.api.col.3l.eh$c
            com.autonavi.base.amap.mapcore.FPoint r0 = com.autonavi.base.amap.mapcore.FPoint.obtain(r1, r1)
            r4.<init>(r0, r2)
            com.amap.api.col.3l.eg r0 = r3.f3228e
            r3.addView(r0, r4)
            com.amap.api.col.3l.eh$c r4 = new com.amap.api.col.3l.eh$c
            com.autonavi.base.amap.mapcore.FPoint r0 = com.autonavi.base.amap.mapcore.FPoint.obtain(r1, r1)
            r1 = 51
            r4.<init>(r0, r1)
            com.amap.api.col.3l.ee r0 = r3.f3229f
            r3.addView(r0, r4)
            com.amap.api.col.3l.ee r4 = r3.f3229f
            r0 = 8
            r4.setVisibility(r0)
            com.amap.api.col.3l.eh$a r4 = new com.amap.api.col.3l.eh$a
            r4.<init>(r3)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
            r1.setMapWidgetListener(r4)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r3.a     // Catch: java.lang.Throwable -> La5
            com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r4 = r4.getUiSettings()     // Catch: java.lang.Throwable -> La5
            boolean r4 = r4.isMyLocationButtonEnabled()     // Catch: java.lang.Throwable -> La5
            if (r4 != 0) goto La7
            com.amap.api.col.3l.eg r4 = r3.f3228e     // Catch: java.lang.Throwable -> La5
            r4.setVisibility(r0)     // Catch: java.lang.Throwable -> La5
            return
        La5:
            r4 = move-exception
            goto La8
        La7:
            return
        La8:
            java.lang.String r0 = "AMapDelegateImpGLSurfaceView"
            java.lang.String r1 = "locationView gone"
            com.amap.api.col.p0003l.w5.p(r4, r0, r1)
            return
    }

    private void w(android.view.View r10, int r11, int r12, int r13, int r14) throws android.os.RemoteException {
            r9 = this;
            if (r10 != 0) goto L3
            goto L9
        L3:
            android.view.View r0 = r9.f3234k
            if (r0 == 0) goto L12
            if (r10 != r0) goto La
        L9:
            return
        La:
            r0.clearFocus()
            android.view.View r0 = r9.f3234k
            r9.removeView(r0)
        L12:
            r9.f3234k = r10
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            android.view.View r0 = r9.f3234k
            r1 = 1
            r0.setDrawingCacheEnabled(r1)
            android.view.View r0 = r9.f3234k
            r1 = 0
            r0.setDrawingCacheQuality(r1)
            if (r10 == 0) goto L2d
            int r0 = r10.width
            int r10 = r10.height
            r3 = r10
            r2 = r0
            goto L30
        L2d:
            r0 = -2
            r2 = -2
            r3 = -2
        L30:
            com.amap.api.col.3l.eh$c r1 = new com.amap.api.col.3l.eh$c
            float r4 = (float) r11
            float r5 = (float) r12
            r8 = 81
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r10 = r9.f3234k
            r9.addView(r10, r1)
            return
    }

    private void x(android.view.View r3, int r4, int r5, int r6, int r7, int r8) {
            r2 = this;
            r0 = r8 & 7
            r8 = r8 & 112(0x70, float:1.57E-43)
            r1 = 5
            if (r0 != r1) goto L9
            int r6 = r6 - r4
            goto Lf
        L9:
            r1 = 1
            if (r0 != r1) goto Lf
            int r0 = r4 / 2
            int r6 = r6 - r0
        Lf:
            r0 = 80
            if (r8 != r0) goto L15
            int r7 = r7 - r5
            goto L26
        L15:
            r0 = 17
            if (r8 != r0) goto L1d
            int r8 = r5 / 2
        L1b:
            int r7 = r7 - r8
            goto L26
        L1d:
            r0 = 16
            if (r8 != r0) goto L26
            int r7 = r7 / 2
            int r8 = r5 / 2
            goto L1b
        L26:
            int r8 = r6 + r4
            int r0 = r7 + r5
            r3.layout(r6, r7, r8, r0)
            boolean r3 = r3 instanceof com.autonavi.base.amap.api.mapcore.IGLSurfaceView
            if (r3 == 0) goto L36
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r2.a
            r3.changeSize(r4, r5)
        L36:
            return
    }

    private void y(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            boolean r0 = r5 instanceof android.widget.ListView
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            android.view.ViewParent r0 = r5.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1a
            int r3 = r0.getWidth()
            r8[r2] = r3
            int r0 = r0.getHeight()
            r8[r1] = r0
        L1a:
            if (r6 <= 0) goto L1e
            if (r7 > 0) goto L21
        L1e:
            r5.measure(r2, r2)
        L21:
            r0 = -1
            r3 = -2
            if (r6 != r3) goto L2c
            int r6 = r5.getMeasuredWidth()
            r8[r2] = r6
            goto L37
        L2c:
            if (r6 != r0) goto L35
            int r6 = r4.getMeasuredWidth()
            r8[r2] = r6
            goto L37
        L35:
            r8[r2] = r6
        L37:
            if (r7 != r3) goto L40
            int r5 = r5.getMeasuredHeight()
            r8[r1] = r5
            return
        L40:
            if (r7 != r0) goto L49
            int r5 = r4.getMeasuredHeight()
            r8[r1] = r5
            return
        L49:
            r8[r1] = r7
            return
    }

    private void z(android.view.View r8, android.view.ViewGroup.LayoutParams r9) {
            r7 = this;
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r9.width
            int r2 = r9.height
            r7.y(r8, r4, r2, r3)
            boolean r2 = r8 instanceof com.amap.api.col.p0003l.ef
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2d
            r2 = r3[r4]
            r6 = r3
            r3 = r6[r5]
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r7.a
            android.graphics.Point r4 = r4.getWaterMarkerPositon()
            int r4 = r4.y
            int r4 = r4 + (-80)
            r5 = r6[r5]
            int r5 = r4 - r5
            r6 = 51
            r4 = 20
            r0 = r7
            r1 = r8
            r0.x(r1, r2, r3, r4, r5, r6)
            return
        L2d:
            r6 = r3
            r2 = r6[r4]
            r3 = r6[r5]
            r5 = 0
            r6 = 51
            r4 = 0
            r0 = r7
            r1 = r8
            r0.x(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final float a(int r2) {
            r1 = this;
            com.amap.api.col.3l.el r0 = r1.f3227d
            if (r0 == 0) goto Le
            r1.G()
            com.amap.api.col.3l.el r0 = r1.f3227d
            float r2 = r0.o(r2)
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // com.amap.api.col.p0003l.i3
    public final android.graphics.Point a() {
            r1 = this;
            com.amap.api.col.3l.el r0 = r1.f3227d
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.Point r0 = r0.h()
            return r0
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void a(java.lang.Integer r4, java.lang.Float r5) {
            r3 = this;
            com.amap.api.col.3l.el r0 = r3.f3227d
            if (r0 != 0) goto L13
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.b(r3, r1)
            return
        L13:
            if (r0 == 0) goto L23
            int r4 = r4.intValue()
            float r5 = r5.floatValue()
            r0.d(r4, r5)
            r3.G()
        L23:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void a(boolean r2) {
            r1 = this;
            com.amap.api.col.3l.el r0 = r1.f3227d
            if (r0 == 0) goto L7
            r0.n(r2)
        L7:
            r1.s = r2
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void b(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.k3 r0 = r3.f3233j
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            boolean r4 = r4.booleanValue()
            r0.e(r4)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final boolean b() {
            r1 = this;
            com.amap.api.col.3l.el r0 = r1.f3227d
            if (r0 == 0) goto L9
            boolean r0 = r0.q()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void c() {
            r2 = this;
            com.amap.api.col.3l.el r0 = r2.f3227d
            if (r0 != 0) goto Ld
            com.amap.api.col.3l.j3 r0 = r2.q
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.b(r2, r1)
            return
        Ld:
            if (r0 == 0) goto L12
            r0.l()
        L12:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void c(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.ef r0 = r3.f3232i
            r1 = 1
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            if (r0 == 0) goto L26
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L19
            goto L26
        L19:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r3.a
            boolean r4 = r4.canShowIndoorSwitch()
            if (r4 == 0) goto L26
            com.amap.api.col.3l.ef r4 = r3.f3232i
            r4.j(r1)
        L26:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final com.amap.api.col.p0003l.ed d() {
            r1 = this;
            com.amap.api.col.3l.ed r0 = r1.f3231h
            return r0
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void d(java.lang.Integer r4) {
            r3 = this;
            com.amap.api.col.3l.el r0 = r3.f3227d
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            if (r0 == 0) goto L1c
            int r4 = r4.intValue()
            r0.i(r4)
            r3.G()
        L1c:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final com.amap.api.col.p0003l.ef e() {
            r1 = this;
            com.amap.api.col.3l.ef r0 = r1.f3232i
            return r0
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void e(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.ee r0 = r3.f3229f
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            boolean r4 = r4.booleanValue()
            r0.b(r4)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final com.amap.api.col.p0003l.el f() {
            r1 = this;
            com.amap.api.col.3l.el r0 = r1.f3227d
            return r0
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void f(java.lang.Integer r4) {
            r3 = this;
            com.amap.api.col.3l.el r0 = r3.f3227d
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            if (r0 == 0) goto L1c
            int r4 = r4.intValue()
            r0.m(r4)
            r3.G()
        L1c:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void g() {
            r1 = this;
            r1.hideInfoWindow()
            android.graphics.drawable.Drawable r0 = r1.m
            com.amap.api.col.p0003l.b3.C(r0)
            r1.H()
            r1.removeAllViews()
            r0 = 0
            r1.o = r0
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void g(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.eg r0 = r3.f3228e
            r1 = 0
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            r0.b(r3, r2)
            return
        L10:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1c
            com.amap.api.col.3l.eg r4 = r3.f3228e
            r4.setVisibility(r1)
            return
        L1c:
            com.amap.api.col.3l.eg r4 = r3.f3228e
            r0 = 8
            r4.setVisibility(r0)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void h() {
            r2 = this;
            com.amap.api.col.3l.ee r0 = r2.f3229f
            if (r0 != 0) goto Ld
            com.amap.api.col.3l.j3 r0 = r2.q
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.b(r2, r1)
            return
        Ld:
            r0.c()
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void h(java.lang.Integer r4) {
            r3 = this;
            com.amap.api.col.3l.k3 r0 = r3.f3233j
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            if (r0 == 0) goto L19
            int r4 = r4.intValue()
            r0.d(r4)
        L19:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void hideInfoWindow() {
            r6 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r6.a     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L32
            android.os.Handler r0 = r0.getMainHandler()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L32
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r6.a     // Catch: java.lang.Throwable -> L32
            android.os.Handler r0 = r0.getMainHandler()     // Catch: java.lang.Throwable -> L32
            com.amap.api.col.3l.eh$b r1 = new com.amap.api.col.3l.eh$b     // Catch: java.lang.Throwable -> L32
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r0.post(r1)     // Catch: java.lang.Throwable -> L32
            com.amap.api.maps.model.BasePointOverlay r0 = r6.l     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2f
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r6.f3225b     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "setInfoWindowShown"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L32
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L32
            r1.getNativeProperties(r0, r2, r3)     // Catch: java.lang.Throwable -> L32
        L2f:
            r0 = 0
            r6.l = r0     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void i() {
            r1 = this;
            boolean r0 = r1.r
            if (r0 == 0) goto L12
            android.content.Context r0 = r1.f3226c
            if (r0 == 0) goto L12
            r1.v(r0)
            com.amap.api.col.3l.j3 r0 = r1.q
            if (r0 == 0) goto L12
            r0.a()
        L12:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void i(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.el r0 = r3.f3227d
            r1 = 0
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            r0.b(r3, r2)
            return
        L10:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L17
            goto L19
        L17:
            r1 = 8
        L19:
            r0.setVisibility(r1)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean isInfoWindowShown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.i3
    public final android.view.View j() {
            r0 = this;
            return r0
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void j(com.amap.api.col.3l.ef.d r4) {
            r3 = this;
            com.amap.api.col.3l.ef r0 = r3.f3232i
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            r0.h(r4)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void k(java.lang.Integer r4) {
            r3 = this;
            com.amap.api.col.3l.el r0 = r3.f3227d
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            if (r0 == 0) goto L21
            int r4 = r4.intValue()
            r0.c(r4)
            com.amap.api.col.3l.el r4 = r3.f3227d
            r4.postInvalidate()
            r3.G()
        L21:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void l(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.ek r0 = r3.f3230g
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            boolean r4 = r4.booleanValue()
            r0.d(r4)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void m(android.graphics.Canvas r5) {
            r4 = this;
            android.view.View r0 = r4.f3234k
            if (r0 == 0) goto L25
            com.amap.api.maps.model.BasePointOverlay r1 = r4.l
            if (r1 == 0) goto L25
            r1 = 1
            android.graphics.Bitmap r0 = r0.getDrawingCache(r1)
            if (r0 == 0) goto L25
            android.view.View r1 = r4.f3234k
            int r1 = r1.getLeft()
            android.view.View r2 = r4.f3234k
            int r2 = r2.getTop()
            float r1 = (float) r1
            float r2 = (float) r2
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r5.drawBitmap(r0, r1, r2, r3)
        L25:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void n(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.ef r0 = r3.f3232i
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            boolean r4 = r4.booleanValue()
            r0.j(r4)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void o(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.el r0 = r3.f3227d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            r0.b(r3, r2)
            return
        L10:
            if (r0 == 0) goto L1e
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1e
            com.amap.api.col.3l.el r4 = r3.f3227d
            r4.f(r2)
            return
        L1e:
            com.amap.api.col.3l.el r4 = r3.f3227d
            if (r4 == 0) goto L25
            r4.f(r1)
        L25:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(android.view.MotionEvent r7) {
            r6 = this;
            android.view.View r0 = r6.f3234k
            r1 = 0
            if (r0 == 0) goto L39
            com.amap.api.maps.model.BasePointOverlay r0 = r6.l
            if (r0 != 0) goto La
            goto L39
        La:
            android.graphics.Rect r0 = new android.graphics.Rect
            android.view.View r2 = r6.f3234k
            int r2 = r2.getLeft()
            android.view.View r3 = r6.f3234k
            int r3 = r3.getTop()
            android.view.View r4 = r6.f3234k
            int r4 = r4.getRight()
            android.view.View r5 = r6.f3234k
            int r5 = r5.getBottom()
            r0.<init>(r2, r3, r4, r5)
            float r2 = r7.getX()
            int r2 = (int) r2
            float r7 = r7.getY()
            int r7 = (int) r7
            boolean r7 = com.amap.api.col.p0003l.b3.J(r0, r2, r7)
            if (r7 == 0) goto L39
            r7 = 1
            return r7
        L39:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.getChildCount()     // Catch: java.lang.Throwable -> L30
            r2 = 0
        L5:
            if (r2 >= r1) goto L29
            android.view.View r3 = r0.getChildAt(r2)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L26
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L30
            boolean r4 = r4 instanceof com.amap.api.col.3l.eh.c     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L1f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L30
            com.amap.api.col.3l.eh$c r4 = (com.amap.api.col.3l.eh.c) r4     // Catch: java.lang.Throwable -> L30
            r0.A(r3, r4)     // Catch: java.lang.Throwable -> L30
            goto L26
        L1f:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L30
            r0.z(r3, r4)     // Catch: java.lang.Throwable -> L30
        L26:
            int r2 = r2 + 1
            goto L5
        L29:
            com.amap.api.col.3l.el r1 = r0.f3227d     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L30
            r1.l()     // Catch: java.lang.Throwable -> L30
        L30:
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void p(java.lang.Boolean r4) {
            r3 = this;
            com.amap.api.col.3l.eg r0 = r3.f3228e
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            boolean r4 = r4.booleanValue()
            r0.b(r4)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void q(java.lang.String r5, java.lang.Boolean r6, java.lang.Integer r7) {
            r4 = this;
            com.amap.api.col.3l.el r0 = r4.f3227d
            r1 = 2
            if (r0 != 0) goto L16
            com.amap.api.col.3l.j3 r0 = r4.q
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r2[r1] = r7
            r0.b(r4, r2)
            return
        L16:
            int r0 = r7.intValue()
            if (r0 != r1) goto L26
            com.amap.api.col.3l.el r5 = r4.f3227d
            boolean r6 = r6.booleanValue()
            r5.j(r6)
            return
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L2d
            return
        L2d:
            com.amap.api.col.3l.el r0 = r4.f3227d
            int r7 = r7.intValue()
            r0.e(r5, r7)
            com.amap.api.col.3l.el r5 = r4.f3227d
            boolean r6 = r6.booleanValue()
            r5.p(r6)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void r(java.lang.Float r4) {
            r3 = this;
            com.amap.api.col.3l.k3 r0 = r3.f3233j
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.b(r3, r1)
            return
        L10:
            if (r0 == 0) goto L19
            float r4 = r4.floatValue()
            r0.c(r4)
        L19:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
            r15 = this;
            com.amap.api.maps.model.BasePointOverlay r0 = r15.l     // Catch: java.lang.Throwable -> L4a
            r1 = 8
            if (r0 == 0) goto Lbc
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r15.f3225b     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r2.checkInBounds(r0)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto Lbc
            boolean r0 = r15.n     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L19
        L16:
            r3 = r15
            goto Lcc
        L19:
            com.autonavi.base.amap.mapcore.FPoint r0 = com.autonavi.base.amap.mapcore.FPoint.obtain()     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r15.f3225b     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.model.BasePointOverlay r3 = r15.l     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L4a
            r2.getMarkerInfoWindowOffset(r3, r0)     // Catch: java.lang.Throwable -> L4a
            float r2 = r0.x     // Catch: java.lang.Throwable -> L4a
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L4a
            float r2 = r0.y     // Catch: java.lang.Throwable -> L4a
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 + r3
            int r8 = (int) r2     // Catch: java.lang.Throwable -> L4a
            r0.recycle()     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.model.BasePointOverlay r0 = r15.l     // Catch: java.lang.Throwable -> L4a
            android.view.View r4 = r15.t(r0)     // Catch: java.lang.Throwable -> L4a
            if (r4 != 0) goto L4e
            android.view.View r0 = r15.f3234k     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L16
            int r0 = r0.getVisibility()     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L16
            r15.hideInfoWindow()     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r0 = move-exception
            r3 = r15
            goto Lcd
        L4e:
            com.autonavi.base.amap.mapcore.FPoint r0 = com.autonavi.base.amap.mapcore.FPoint.obtain()     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r15.f3225b     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.model.BasePointOverlay r3 = r15.l     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L4a
            r2.getOverlayScreenPos(r3, r0)     // Catch: java.lang.Throwable -> L4a
            float r2 = r0.x     // Catch: java.lang.Throwable -> L4a
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L4a
            float r2 = r0.y     // Catch: java.lang.Throwable -> L4a
            int r6 = (int) r2
            r3 = r15
            r3.w(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L82
            android.view.View r2 = r3.f3234k     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto Lb8
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Throwable -> L82
            com.amap.api.col.3l.eh$c r2 = (com.amap.api.col.3l.eh.c) r2     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L84
            float r4 = r0.x     // Catch: java.lang.Throwable -> L82
            float r5 = r0.y     // Catch: java.lang.Throwable -> L82
            com.autonavi.base.amap.mapcore.FPoint r4 = com.autonavi.base.amap.mapcore.FPoint.obtain(r4, r5)     // Catch: java.lang.Throwable -> L82
            r2.a = r4     // Catch: java.lang.Throwable -> L82
            r2.f3237c = r7     // Catch: java.lang.Throwable -> L82
            r2.f3238d = r8     // Catch: java.lang.Throwable -> L82
            goto L84
        L82:
            r0 = move-exception
            goto Lcd
        L84:
            r13 = 0
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r3
            r9.onLayout(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lb5
            com.amap.api.col.3l.a0 r2 = r3.t     // Catch: java.lang.Throwable -> L82
            boolean r2 = r2.n()     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto La6
            com.amap.api.col.3l.a0 r2 = r3.t     // Catch: java.lang.Throwable -> L82
            com.amap.api.maps.model.BasePointOverlay r4 = r3.l     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r4.getTitle()     // Catch: java.lang.Throwable -> L82
            com.amap.api.maps.model.BasePointOverlay r5 = r3.l     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r5.getSnippet()     // Catch: java.lang.Throwable -> L82
            r2.m(r4, r5)     // Catch: java.lang.Throwable -> L82
        La6:
            android.view.View r2 = r3.f3234k     // Catch: java.lang.Throwable -> L82
            int r2 = r2.getVisibility()     // Catch: java.lang.Throwable -> L82
            if (r2 != r1) goto Lb8
            android.view.View r1 = r3.f3234k     // Catch: java.lang.Throwable -> L82
            r2 = 0
            r1.setVisibility(r2)     // Catch: java.lang.Throwable -> L82
            goto Lb8
        Lb5:
            r0 = move-exception
            r3 = r9
            goto Lcd
        Lb8:
            r0.recycle()     // Catch: java.lang.Throwable -> L82
            return
        Lbc:
            r3 = r15
            android.view.View r0 = r3.f3234k     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto Lcc
            int r0 = r0.getVisibility()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto Lcc
            android.view.View r0 = r3.f3234k     // Catch: java.lang.Throwable -> L82
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L82
        Lcc:
            return
        Lcd:
            java.lang.String r1 = "MapOverlayViewGroup"
            java.lang.String r2 = "redrawInfoWindow"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    @Override // com.amap.api.col.p0003l.i3
    public final void s(com.amap.api.maps.model.CameraPosition r7) {
            r6 = this;
            com.amap.api.col.3l.el r0 = r6.f3227d
            r1 = 0
            if (r0 != 0) goto L10
            com.amap.api.col.3l.j3 r0 = r6.q
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r0.b(r6, r2)
            return
        L10:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r6.a
            com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r0 = r0.getUiSettings()
            boolean r0 = r0.isLogoEnable()
            if (r0 != 0) goto L1d
            goto L4d
        L1d:
            boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()
            if (r0 == 0) goto L3f
            float r0 = r7.zoom
            r2 = 1086324736(0x40c00000, float:6.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L3f
            com.amap.api.maps.model.LatLng r7 = r7.target
            double r2 = r7.latitude
            double r4 = r7.longitude
            boolean r7 = com.amap.api.col.p0003l.u2.a(r2, r4)
            if (r7 != 0) goto L3f
            com.amap.api.col.3l.el r7 = r6.f3227d
            r0 = 8
            r7.setVisibility(r0)
            return
        L3f:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r7 = r6.a
            int r7 = r7.getMaskLayerType()
            r0 = -1
            if (r7 != r0) goto L4d
            com.amap.api.col.3l.el r7 = r6.f3227d
            r7.setVisibility(r1)
        L4d:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(com.amap.api.col.p0003l.a0 r1) {
            r0 = this;
            r0.t = r1
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(com.amap.api.maps.model.BasePointOverlay r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L51
        L3:
            com.amap.api.col.3l.a0 r0 = r5.t     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L1a
            boolean r0 = r0.n()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L1a
            java.lang.String r0 = r6.getTitle()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L1a
            java.lang.String r0 = r6.getSnippet()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L1a
            goto L51
        L1a:
            boolean r0 = r6.isInfoWindowEnable()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L21
            goto L51
        L21:
            com.amap.api.maps.model.BasePointOverlay r0 = r5.l     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = r6.getId()     // Catch: java.lang.Throwable -> L51
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L36
            r5.hideInfoWindow()     // Catch: java.lang.Throwable -> L51
        L36:
            com.amap.api.col.3l.a0 r0 = r5.t     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L51
            r5.l = r6     // Catch: java.lang.Throwable -> L51
            r0 = 1
            r5.p = r0     // Catch: java.lang.Throwable -> L51
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r5.f3225b     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = r6.getId()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "setInfoWindowShown"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r0[r4] = r3     // Catch: java.lang.Throwable -> L51
            r1.getNativeProperties(r6, r2, r0)     // Catch: java.lang.Throwable -> L51
        L51:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(com.autonavi.base.amap.api.mapcore.BaseOverlayImp r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L40
        L3:
            com.amap.api.col.3l.a0 r0 = r2.t     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L1a
            boolean r0 = r0.n()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L1a
            java.lang.String r0 = r3.getTitle()     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L1a
            java.lang.String r0 = r3.getSnippet()     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L1a
            goto L40
        L1a:
            boolean r0 = r3.isInfoWindowEnable()     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L21
            goto L40
        L21:
            com.amap.api.maps.model.BasePointOverlay r0 = r2.l     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r3.getId()     // Catch: java.lang.Throwable -> L40
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L36
            r2.hideInfoWindow()     // Catch: java.lang.Throwable -> L40
        L36:
            com.amap.api.col.3l.a0 r0 = r2.t     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            r0 = 1
            r3.setInfoWindowShown(r0)     // Catch: java.lang.Throwable -> L40
            r2.p = r0     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }
}

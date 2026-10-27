package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class k3 extends android.widget.LinearLayout {
    private android.graphics.Bitmap a;

    /* renamed from: b, reason: collision with root package name */
    private android.graphics.Bitmap f3605b;

    /* renamed from: c, reason: collision with root package name */
    private android.graphics.Bitmap f3606c;

    /* renamed from: d, reason: collision with root package name */
    private android.graphics.Bitmap f3607d;

    /* renamed from: e, reason: collision with root package name */
    private android.graphics.Bitmap f3608e;

    /* renamed from: f, reason: collision with root package name */
    private android.graphics.Bitmap f3609f;

    /* renamed from: g, reason: collision with root package name */
    private android.graphics.Bitmap f3610g;

    /* renamed from: h, reason: collision with root package name */
    private android.graphics.Bitmap f3611h;

    /* renamed from: i, reason: collision with root package name */
    private android.graphics.Bitmap f3612i;

    /* renamed from: j, reason: collision with root package name */
    private android.graphics.Bitmap f3613j;

    /* renamed from: k, reason: collision with root package name */
    private android.graphics.Bitmap f3614k;
    private android.graphics.Bitmap l;
    private android.widget.ImageView m;
    private android.widget.ImageView n;
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.View.OnTouchListener {
        final /* synthetic */ com.amap.api.col.p0003l.k3 a;

        a(com.amap.api.col.p0003l.k3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                r3 = 0
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L69
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = com.amap.api.col.p0003l.k3.a(r0)     // Catch: java.lang.Throwable -> L69
                float r0 = r0.getZoomLevel()     // Catch: java.lang.Throwable -> L69
                com.amap.api.col.3l.k3 r1 = r2.a     // Catch: java.lang.Throwable -> L69
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = com.amap.api.col.p0003l.k3.a(r1)     // Catch: java.lang.Throwable -> L69
                float r1 = r1.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L69
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L69
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L69
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = com.amap.api.col.p0003l.k3.a(r0)     // Catch: java.lang.Throwable -> L69
                boolean r0 = r0.isMaploaded()     // Catch: java.lang.Throwable -> L69
                if (r0 != 0) goto L26
                goto L69
            L26:
                int r0 = r4.getAction()     // Catch: java.lang.Throwable -> L69
                if (r0 != 0) goto L3c
                com.amap.api.col.3l.k3 r4 = r2.a     // Catch: java.lang.Throwable -> L69
                android.widget.ImageView r4 = com.amap.api.col.p0003l.k3.g(r4)     // Catch: java.lang.Throwable -> L69
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L69
                android.graphics.Bitmap r0 = com.amap.api.col.p0003l.k3.f(r0)     // Catch: java.lang.Throwable -> L69
                r4.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L69
                goto L69
            L3c:
                int r4 = r4.getAction()     // Catch: java.lang.Throwable -> L69
                r0 = 1
                if (r4 != r0) goto L69
                com.amap.api.col.3l.k3 r4 = r2.a     // Catch: java.lang.Throwable -> L69
                android.widget.ImageView r4 = com.amap.api.col.p0003l.k3.g(r4)     // Catch: java.lang.Throwable -> L69
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L69
                android.graphics.Bitmap r0 = com.amap.api.col.p0003l.k3.h(r0)     // Catch: java.lang.Throwable -> L69
                r4.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L69
                com.amap.api.col.3l.k3 r4 = r2.a     // Catch: android.os.RemoteException -> L60 java.lang.Throwable -> L69
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = com.amap.api.col.p0003l.k3.a(r4)     // Catch: android.os.RemoteException -> L60 java.lang.Throwable -> L69
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r0 = com.amap.api.col.p0003l.p.a()     // Catch: android.os.RemoteException -> L60 java.lang.Throwable -> L69
                r4.animateCamera(r0)     // Catch: android.os.RemoteException -> L60 java.lang.Throwable -> L69
                goto L69
            L60:
                r4 = move-exception
                java.lang.String r0 = "ZoomControllerView"
                java.lang.String r1 = "zoomin ontouch"
                com.amap.api.col.p0003l.w5.p(r4, r0, r1)     // Catch: java.lang.Throwable -> L69
            L69:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements android.view.View.OnTouchListener {
        final /* synthetic */ com.amap.api.col.p0003l.k3 a;

        b(com.amap.api.col.p0003l.k3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                r3 = 0
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L3c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = com.amap.api.col.p0003l.k3.a(r0)     // Catch: java.lang.Throwable -> L3c
                float r0 = r0.getZoomLevel()     // Catch: java.lang.Throwable -> L3c
                com.amap.api.col.3l.k3 r1 = r2.a     // Catch: java.lang.Throwable -> L3c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = com.amap.api.col.p0003l.k3.a(r1)     // Catch: java.lang.Throwable -> L3c
                float r1 = r1.getMinZoomLevel()     // Catch: java.lang.Throwable -> L3c
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L62
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L3c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = com.amap.api.col.p0003l.k3.a(r0)     // Catch: java.lang.Throwable -> L3c
                boolean r0 = r0.isMaploaded()     // Catch: java.lang.Throwable -> L3c
                if (r0 != 0) goto L26
                goto L62
            L26:
                int r0 = r4.getAction()     // Catch: java.lang.Throwable -> L3c
                if (r0 != 0) goto L3e
                com.amap.api.col.3l.k3 r4 = r2.a     // Catch: java.lang.Throwable -> L3c
                android.widget.ImageView r4 = com.amap.api.col.p0003l.k3.j(r4)     // Catch: java.lang.Throwable -> L3c
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L3c
                android.graphics.Bitmap r0 = com.amap.api.col.p0003l.k3.i(r0)     // Catch: java.lang.Throwable -> L3c
                r4.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L3c
                goto L6a
            L3c:
                r4 = move-exception
                goto L63
            L3e:
                int r4 = r4.getAction()     // Catch: java.lang.Throwable -> L3c
                r0 = 1
                if (r4 != r0) goto L6a
                com.amap.api.col.3l.k3 r4 = r2.a     // Catch: java.lang.Throwable -> L3c
                android.widget.ImageView r4 = com.amap.api.col.p0003l.k3.j(r4)     // Catch: java.lang.Throwable -> L3c
                com.amap.api.col.3l.k3 r0 = r2.a     // Catch: java.lang.Throwable -> L3c
                android.graphics.Bitmap r0 = com.amap.api.col.p0003l.k3.k(r0)     // Catch: java.lang.Throwable -> L3c
                r4.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L3c
                com.amap.api.col.3l.k3 r4 = r2.a     // Catch: java.lang.Throwable -> L3c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = com.amap.api.col.p0003l.k3.a(r4)     // Catch: java.lang.Throwable -> L3c
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r0 = com.amap.api.col.p0003l.p.l()     // Catch: java.lang.Throwable -> L3c
                r4.animateCamera(r0)     // Catch: java.lang.Throwable -> L3c
                goto L6a
            L62:
                return r3
            L63:
                java.lang.String r0 = "ZoomControllerView"
                java.lang.String r1 = "zoomout ontouch"
                com.amap.api.col.p0003l.w5.p(r4, r0, r1)
            L6a:
                return r3
        }
    }

    public k3(android.content.Context r4, com.autonavi.base.amap.api.mapcore.IAMapDelegate r5) {
            r3 = this;
            r3.<init>(r4)
            r3.o = r5
            java.lang.String r5 = "zoomin_selected.png"
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.l(r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r3.f3610g = r5     // Catch: java.lang.Throwable -> Lb8
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.m(r5, r0)     // Catch: java.lang.Throwable -> Lb8
            r3.a = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "zoomin_unselected.png"
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.l(r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r3.f3611h = r5     // Catch: java.lang.Throwable -> Lb8
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.m(r5, r0)     // Catch: java.lang.Throwable -> Lb8
            r3.f3605b = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "zoomout_selected.png"
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.l(r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r3.f3612i = r5     // Catch: java.lang.Throwable -> Lb8
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.m(r5, r0)     // Catch: java.lang.Throwable -> Lb8
            r3.f3606c = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "zoomout_unselected.png"
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.l(r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r3.f3613j = r5     // Catch: java.lang.Throwable -> Lb8
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.m(r5, r0)     // Catch: java.lang.Throwable -> Lb8
            r3.f3607d = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "zoomin_pressed.png"
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.l(r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r3.f3614k = r5     // Catch: java.lang.Throwable -> Lb8
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.m(r5, r0)     // Catch: java.lang.Throwable -> Lb8
            r3.f3608e = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "zoomout_pressed.png"
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.l(r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r3.l = r5     // Catch: java.lang.Throwable -> Lb8
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r5 = com.amap.api.col.p0003l.b3.m(r5, r0)     // Catch: java.lang.Throwable -> Lb8
            r3.f3609f = r5     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r5 = new android.widget.ImageView     // Catch: java.lang.Throwable -> Lb8
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lb8
            r3.m = r5     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r0 = r3.a     // Catch: java.lang.Throwable -> Lb8
            r5.setImageBitmap(r0)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r5 = r3.m     // Catch: java.lang.Throwable -> Lb8
            r0 = 1
            r5.setClickable(r0)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r5 = new android.widget.ImageView     // Catch: java.lang.Throwable -> Lb8
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lb8
            r3.n = r5     // Catch: java.lang.Throwable -> Lb8
            android.graphics.Bitmap r4 = r3.f3606c     // Catch: java.lang.Throwable -> Lb8
            r5.setImageBitmap(r4)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r4 = r3.n     // Catch: java.lang.Throwable -> Lb8
            r4.setClickable(r0)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r4 = r3.m     // Catch: java.lang.Throwable -> Lb8
            com.amap.api.col.3l.k3$a r5 = new com.amap.api.col.3l.k3$a     // Catch: java.lang.Throwable -> Lb8
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb8
            r4.setOnTouchListener(r5)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r4 = r3.n     // Catch: java.lang.Throwable -> Lb8
            com.amap.api.col.3l.k3$b r5 = new com.amap.api.col.3l.k3$b     // Catch: java.lang.Throwable -> Lb8
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb8
            r4.setOnTouchListener(r5)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r4 = r3.m     // Catch: java.lang.Throwable -> Lb8
            r5 = -2
            r1 = 20
            r2 = 0
            r4.setPadding(r2, r2, r1, r5)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r4 = r3.n     // Catch: java.lang.Throwable -> Lb8
            r4.setPadding(r2, r2, r1, r1)     // Catch: java.lang.Throwable -> Lb8
            r3.setOrientation(r0)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r4 = r3.m     // Catch: java.lang.Throwable -> Lb8
            r3.addView(r4)     // Catch: java.lang.Throwable -> Lb8
            android.widget.ImageView r4 = r3.n     // Catch: java.lang.Throwable -> Lb8
            r3.addView(r4)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb8:
            r4 = move-exception
            java.lang.String r5 = "ZoomControllerView"
            java.lang.String r0 = "create"
            com.amap.api.col.p0003l.w5.p(r4, r5, r0)
            return
    }

    static /* synthetic */ com.autonavi.base.amap.api.mapcore.IAMapDelegate a(com.amap.api.col.p0003l.k3 r0) {
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.o
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap f(com.amap.api.col.p0003l.k3 r0) {
            android.graphics.Bitmap r0 = r0.f3608e
            return r0
    }

    static /* synthetic */ android.widget.ImageView g(com.amap.api.col.p0003l.k3 r0) {
            android.widget.ImageView r0 = r0.m
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap h(com.amap.api.col.p0003l.k3 r0) {
            android.graphics.Bitmap r0 = r0.a
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap i(com.amap.api.col.p0003l.k3 r0) {
            android.graphics.Bitmap r0 = r0.f3609f
            return r0
    }

    static /* synthetic */ android.widget.ImageView j(com.amap.api.col.p0003l.k3 r0) {
            android.widget.ImageView r0 = r0.n
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap k(com.amap.api.col.p0003l.k3 r0) {
            android.graphics.Bitmap r0 = r0.f3606c
            return r0
    }

    public final void b() {
            r3 = this;
            r3.removeAllViews()     // Catch: java.lang.Throwable -> L38
            android.graphics.Bitmap r0 = r3.a     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> L38
            android.graphics.Bitmap r0 = r3.f3605b     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> L38
            android.graphics.Bitmap r0 = r3.f3606c     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> L38
            android.graphics.Bitmap r0 = r3.f3607d     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> L38
            android.graphics.Bitmap r0 = r3.f3608e     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> L38
            android.graphics.Bitmap r0 = r3.f3609f     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> L38
            r0 = 0
            r3.a = r0     // Catch: java.lang.Throwable -> L38
            r3.f3605b = r0     // Catch: java.lang.Throwable -> L38
            r3.f3606c = r0     // Catch: java.lang.Throwable -> L38
            r3.f3607d = r0     // Catch: java.lang.Throwable -> L38
            r3.f3608e = r0     // Catch: java.lang.Throwable -> L38
            r3.f3609f = r0     // Catch: java.lang.Throwable -> L38
            android.graphics.Bitmap r1 = r3.f3610g     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L38
            r3.f3610g = r0     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r0 = move-exception
            goto L6c
        L3a:
            android.graphics.Bitmap r1 = r3.f3611h     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L43
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L38
            r3.f3611h = r0     // Catch: java.lang.Throwable -> L38
        L43:
            android.graphics.Bitmap r1 = r3.f3612i     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L4c
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L38
            r3.f3612i = r0     // Catch: java.lang.Throwable -> L38
        L4c:
            android.graphics.Bitmap r1 = r3.f3613j     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L55
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L38
            r3.f3610g = r0     // Catch: java.lang.Throwable -> L38
        L55:
            android.graphics.Bitmap r1 = r3.f3614k     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L5e
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L38
            r3.f3614k = r0     // Catch: java.lang.Throwable -> L38
        L5e:
            android.graphics.Bitmap r1 = r3.l     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L67
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L38
            r3.l = r0     // Catch: java.lang.Throwable -> L38
        L67:
            r3.m = r0     // Catch: java.lang.Throwable -> L38
            r3.n = r0     // Catch: java.lang.Throwable -> L38
            return
        L6c:
            java.lang.String r1 = "ZoomControllerView"
            java.lang.String r2 = "destory"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public final void c(float r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.o     // Catch: java.lang.Throwable -> L23
            float r0 = r0.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L23
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L25
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.o     // Catch: java.lang.Throwable -> L23
            float r0 = r0.getMinZoomLevel()     // Catch: java.lang.Throwable -> L23
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L25
            android.widget.ImageView r3 = r2.m     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r2.a     // Catch: java.lang.Throwable -> L23
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L23
            android.widget.ImageView r3 = r2.n     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r2.f3606c     // Catch: java.lang.Throwable -> L23
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            goto L57
        L25:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.o     // Catch: java.lang.Throwable -> L23
            float r0 = r0.getMinZoomLevel()     // Catch: java.lang.Throwable -> L23
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L3e
            android.widget.ImageView r3 = r2.n     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r2.f3607d     // Catch: java.lang.Throwable -> L23
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L23
            android.widget.ImageView r3 = r2.m     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r2.a     // Catch: java.lang.Throwable -> L23
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L23
            return
        L3e:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.o     // Catch: java.lang.Throwable -> L23
            float r0 = r0.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L23
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L56
            android.widget.ImageView r3 = r2.m     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r2.f3605b     // Catch: java.lang.Throwable -> L23
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L23
            android.widget.ImageView r3 = r2.n     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r2.f3606c     // Catch: java.lang.Throwable -> L23
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> L23
        L56:
            return
        L57:
            java.lang.String r0 = "ZoomControllerView"
            java.lang.String r1 = "setZoomBitmap"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    public final void d(int r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()     // Catch: java.lang.Throwable -> Le
            com.amap.api.col.3l.eh$c r0 = (com.amap.api.col.3l.eh.c) r0     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r3 != r1) goto L10
            r3 = 16
            r0.f3239e = r3     // Catch: java.lang.Throwable -> Le
            goto L17
        Le:
            r3 = move-exception
            goto L1b
        L10:
            r1 = 2
            if (r3 != r1) goto L17
            r3 = 80
            r0.f3239e = r3     // Catch: java.lang.Throwable -> Le
        L17:
            r2.setLayoutParams(r0)     // Catch: java.lang.Throwable -> Le
            return
        L1b:
            java.lang.String r0 = "ZoomControllerView"
            java.lang.String r1 = "setZoomPosition"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    public final void e(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            r1 = 0
            r0.setVisibility(r1)
            return
        L7:
            r1 = 8
            r0.setVisibility(r1)
            return
    }
}

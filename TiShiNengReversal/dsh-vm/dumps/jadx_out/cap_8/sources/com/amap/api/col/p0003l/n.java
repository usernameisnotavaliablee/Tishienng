package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class n extends android.opengl.GLSurfaceView implements com.autonavi.base.amap.api.mapcore.IGLSurfaceView {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    private com.autonavi.base.ae.gmap.GLMapRender f3692b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f3693c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.n a;

        a(com.amap.api.col.p0003l.n r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                com.amap.api.col.3l.n r0 = r1.a
                com.autonavi.base.ae.gmap.GLMapRender r0 = com.amap.api.col.p0003l.n.a(r0)
                if (r0 == 0) goto L16
                com.amap.api.col.3l.n r0 = r1.a     // Catch: java.lang.Throwable -> L12
                com.autonavi.base.ae.gmap.GLMapRender r0 = com.amap.api.col.p0003l.n.a(r0)     // Catch: java.lang.Throwable -> L12
                r0.onSurfaceDestory()     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r0 = move-exception
                com.amap.api.col.p0003l.b3.D(r0)
            L16:
                return
        }
    }

    public n(android.content.Context r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private n(android.content.Context r2, boolean r3, byte r4) {
            r1 = this;
            r4 = 0
            r1.<init>(r2, r4)
            r1.a = r4
            r1.f3692b = r4
            r4 = 0
            r1.f3693c = r4
            r4 = 5
            r0 = 6
            com.amap.api.col.p0003l.o2.a(r1, r4, r0, r4)
            com.amap.api.col.3l.r9 r4 = new com.amap.api.col.3l.r9
            r4.<init>(r1, r2, r3)
            r1.a = r4
            return
    }

    static /* synthetic */ com.autonavi.base.ae.gmap.GLMapRender a(com.amap.api.col.p0003l.n r0) {
            com.autonavi.base.ae.gmap.GLMapRender r0 = r0.f3692b
            return r0
    }

    public final com.autonavi.base.amap.api.mapcore.IAMapDelegate b() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            return r0
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "AMapGLSurfaceView onAttachedToWindow"
            com.amap.api.col.p0003l.d3.e(r0, r1)
            com.autonavi.base.ae.gmap.GLMapRender r0 = r2.f3692b     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L16
            r0.onAttachedToWindow()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
        L16:
            r2.onResume()
            return
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
            r3 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AMapGLSurfaceView onDetachedFromWindow MapsInitializer.isSupportRecycleView() "
            r1.<init>(r2)
            boolean r2 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.d3.e(r0, r1)
            boolean r0 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            if (r0 != 0) goto L2a
            r3.onPause()
            com.autonavi.base.ae.gmap.GLMapRender r0 = r3.f3692b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            r0.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L27
        L27:
            super.onDetachedFromWindow()
        L2a:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void onDetachedGLThread() {
            r3 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AMapGLSurfaceView onDetachedGLThread MapsInitializer.isSupportRecycleView() "
            r1.<init>(r2)
            boolean r2 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.d3.e(r0, r1)
            boolean r0 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            if (r0 == 0) goto L2f
            r3.onPause()
            com.autonavi.base.ae.gmap.GLMapRender r0 = r3.f3692b     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2c
            r0.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
        L2c:
            super.onDetachedFromWindow()
        L2f:
            return
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
            r4 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AMapGLSurfaceView onPause mMapRender.mSurfacedestoryed "
            r1.<init>(r2)
            com.autonavi.base.ae.gmap.GLMapRender r2 = r4.f3692b
            boolean r2 = r2.mSurfacedestoryed
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.d3.e(r0, r1)
            com.autonavi.base.ae.gmap.GLMapRender r0 = r4.f3692b
            boolean r0 = r0.mSurfacedestoryed
            if (r0 != 0) goto L3b
            com.amap.api.col.3l.n$a r0 = new com.amap.api.col.3l.n$a
            r0.<init>(r4)
            r4.queueEvent(r0)
            r0 = 0
        L26:
            com.autonavi.base.ae.gmap.GLMapRender r1 = r4.f3692b
            boolean r1 = r1.mSurfacedestoryed
            if (r1 != 0) goto L3b
            int r1 = r0 + 1
            r2 = 50
            if (r0 >= r2) goto L3b
            r2 = 20
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L38
            goto L39
        L38:
        L39:
            r0 = r1
            goto L26
        L3b:
            super.onPause()
            return
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
            r2 = this;
            super.onResume()
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "AMapGLSurfaceView onPause"
            com.amap.api.col.p0003l.d3.e(r0, r1)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            super.onTouchEvent(r2)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a     // Catch: java.lang.Throwable -> La
            boolean r2 = r0.onTouchEvent(r2)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onWindowVisibilityChanged(int r4) {
            r3 = this;
            super.onWindowVisibilityChanged(r4)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "AMapGLSurfaceView onWindowVisibilityChanged visibility "
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            com.amap.api.col.p0003l.d3.e(r0, r1)
            r0 = 8
            if (r4 == r0) goto L26
            r0 = 4
            if (r4 != r0) goto L1a
            goto L26
        L1a:
            if (r4 != 0) goto L30
            com.autonavi.base.ae.gmap.GLMapRender r4 = r3.f3692b     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L30
            r4.renderResume()     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            goto L31
        L26:
            com.autonavi.base.ae.gmap.GLMapRender r4 = r3.f3692b     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L30
            r4.renderPause()     // Catch: java.lang.Throwable -> L24
            r4 = 0
            r3.f3693c = r4     // Catch: java.lang.Throwable -> L24
        L30:
            return
        L31:
            com.amap.api.col.p0003l.b3.D(r4)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLConfigChooser(com.amap.api.col.p0003l.m2 r1) {
            r0 = this;
            super.setEGLConfigChooser(r1)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLContextFactory(com.amap.api.col.p0003l.n2 r1) {
            r0 = this;
            super.setEGLContextFactory(r1)
            return
    }

    @Override // android.opengl.GLSurfaceView, com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderer(android.opengl.GLSurfaceView.Renderer r2) {
            r1 = this;
            r0 = r2
            com.autonavi.base.ae.gmap.GLMapRender r0 = (com.autonavi.base.ae.gmap.GLMapRender) r0
            r1.f3692b = r0
            super.setRenderer(r2)
            return
    }
}

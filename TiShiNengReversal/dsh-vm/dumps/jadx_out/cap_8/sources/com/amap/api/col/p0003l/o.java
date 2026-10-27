package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o extends com.amap.api.col.p0003l.y implements com.autonavi.base.amap.api.mapcore.IGLSurfaceView {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate m;
    private com.autonavi.base.ae.gmap.GLMapRender n;
    protected boolean o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.o a;

        a(com.amap.api.col.p0003l.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                com.amap.api.col.3l.o r0 = r1.a     // Catch: java.lang.Throwable -> L12
                com.autonavi.base.ae.gmap.GLMapRender r0 = com.amap.api.col.p0003l.o.q(r0)     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L14
                com.amap.api.col.3l.o r0 = r1.a     // Catch: java.lang.Throwable -> L12
                com.autonavi.base.ae.gmap.GLMapRender r0 = com.amap.api.col.p0003l.o.q(r0)     // Catch: java.lang.Throwable -> L12
                r0.onSurfaceDestory()     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r0 = move-exception
                goto L15
            L14:
                return
            L15:
                com.amap.api.col.p0003l.b3.D(r0)
                return
        }
    }

    public o(android.content.Context r3, boolean r4) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.m = r0
            r2.n = r0
            r0 = 0
            r2.o = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L17
            r0 = 8
            com.amap.api.col.p0003l.o2.a(r2, r0, r0, r0)
            goto L1c
        L17:
            r0 = 6
            r1 = 5
            com.amap.api.col.p0003l.o2.a(r2, r1, r0, r1)
        L1c:
            com.amap.api.col.3l.r9 r0 = new com.amap.api.col.3l.r9
            r0.<init>(r2, r3, r4)
            r2.m = r0
            return
    }

    static /* synthetic */ com.autonavi.base.ae.gmap.GLMapRender q(com.amap.api.col.p0003l.o r0) {
            com.autonavi.base.ae.gmap.GLMapRender r0 = r0.n
            return r0
    }

    @Override // com.amap.api.col.p0003l.y
    public final void f() {
            r4 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AMapGLTextureView onPause mMapRender.mSurfacedestoryed "
            r1.<init>(r2)
            com.autonavi.base.ae.gmap.GLMapRender r2 = r4.n
            boolean r2 = r2.mSurfacedestoryed
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.d3.e(r0, r1)
            com.autonavi.base.ae.gmap.GLMapRender r0 = r4.n
            boolean r0 = r0.mSurfacedestoryed
            if (r0 != 0) goto L3b
            com.amap.api.col.3l.o$a r0 = new com.amap.api.col.3l.o$a
            r0.<init>(r4)
            r4.queueEvent(r0)
            r0 = 0
        L26:
            com.autonavi.base.ae.gmap.GLMapRender r1 = r4.n
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
            super.f()
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final android.view.SurfaceHolder getHolder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.y
    public final void h() {
            r2 = this;
            super.h()
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "AMapGLTextureView onResume"
            com.amap.api.col.p0003l.d3.e(r0, r1)
            return
    }

    @Override // com.amap.api.col.p0003l.y, android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "AMapGLTextureView onAttachedToWindow"
            com.amap.api.col.p0003l.d3.e(r0, r1)
            com.autonavi.base.ae.gmap.GLMapRender r0 = r2.n     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L11
            r0.onAttachedToWindow()     // Catch: java.lang.Throwable -> L11
        L11:
            r2.h()
            return
    }

    @Override // com.amap.api.col.p0003l.y, android.view.View
    protected final void onDetachedFromWindow() {
            r3 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AMapGLTextureView onDetachedFromWindow MapsInitializer.isSupportRecycleView() "
            r1.<init>(r2)
            boolean r2 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.d3.e(r0, r1)
            boolean r0 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            if (r0 != 0) goto L2a
            r3.f()
            com.autonavi.base.ae.gmap.GLMapRender r0 = r3.n     // Catch: java.lang.Throwable -> L27
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
            java.lang.String r2 = "AMapGLTextureView onDetachedGLThread MapsInitializer.isSupportRecycleView() "
            r1.<init>(r2)
            boolean r2 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.d3.e(r0, r1)
            boolean r0 = com.amap.api.maps.MapsInitializer.isSupportRecycleView()
            if (r0 == 0) goto L2a
            r3.f()
            com.autonavi.base.ae.gmap.GLMapRender r0 = r3.n     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            r0.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L27
        L27:
            super.onDetachedFromWindow()
        L2a:
            return
    }

    @Override // com.amap.api.col.p0003l.y, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r3) {
            r2 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "AMapGLTextureView onSurfaceTextureDestroyed"
            com.amap.api.col.p0003l.d3.e(r0, r1)
            r2.requestRender()
            boolean r0 = com.amap.api.maps.MapsInitializer.getTextureDestroyRender()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
        L1a:
            boolean r3 = super.onSurfaceTextureDestroyed(r3)
            return r3
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            super.onTouchEvent(r2)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.m     // Catch: java.lang.Throwable -> La
            boolean r2 = r0.onTouchEvent(r2)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int r4) {
            r3 = this;
            super.onWindowVisibilityChanged(r4)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "AMapGLTextureView onWindowVisibilityChanged visibility "
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            com.amap.api.col.p0003l.d3.e(r0, r1)
            r0 = 8
            if (r4 == r0) goto L27
            r0 = 4
            if (r4 != r0) goto L1a
            goto L27
        L1a:
            if (r4 != 0) goto L26
            com.autonavi.base.ae.gmap.GLMapRender r4 = r3.n     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L26
            r4.renderResume()     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            goto L35
        L26:
            return
        L27:
            com.autonavi.base.ae.gmap.GLMapRender r4 = r3.n     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L31
            r4.renderPause()     // Catch: java.lang.Throwable -> L24
            r4 = 0
            r3.o = r4     // Catch: java.lang.Throwable -> L24
        L31:
            r3.requestRender()     // Catch: java.lang.Throwable -> L24
            return
        L35:
            com.amap.api.col.p0003l.b3.D(r4)
            return
    }

    public final com.autonavi.base.amap.api.mapcore.IAMapDelegate r() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.m
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLConfigChooser(com.amap.api.col.p0003l.m2 r1) {
            r0 = this;
            super.c(r1)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLContextFactory(com.amap.api.col.p0003l.n2 r1) {
            r0 = this;
            super.d(r1)
            return
    }

    @Override // com.amap.api.col.p0003l.y, com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderer(android.opengl.GLSurfaceView.Renderer r2) {
            r1 = this;
            r0 = r2
            com.autonavi.base.ae.gmap.GLMapRender r0 = (com.autonavi.base.ae.gmap.GLMapRender) r0
            r1.n = r0
            super.setRenderer(r2)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setZOrderOnTop(boolean r1) {
            r0 = this;
            return
    }
}

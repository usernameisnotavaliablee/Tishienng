package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z9 implements com.autonavi.base.amap.api.mapcore.IGLSurfaceView {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f4300b;

    public z9(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private z9(android.content.Context r1, byte r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.a = r2
            r2 = 0
            r0.f4300b = r2
            com.amap.api.col.3l.r9 r2 = new com.amap.api.col.3l.r9
            r2.<init>(r0, r1)
            r0.a = r2
            return
    }

    public final com.autonavi.base.amap.api.mapcore.IAMapDelegate a() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final int getHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final android.view.SurfaceHolder getHolder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final android.view.ViewParent getParent() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final int getRenderMode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final int getWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final boolean isEnabled() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void onDetachedGLThread() {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final boolean post(java.lang.Runnable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final boolean postDelayed(java.lang.Runnable r1, long r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void queueEvent(java.lang.Runnable r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.run()
        L5:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void requestRender() {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setBackgroundColor(int r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLConfigChooser(com.amap.api.col.p0003l.m2 r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLContextFactory(com.amap.api.col.p0003l.n2 r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderMode(int r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderer(android.opengl.GLSurfaceView.Renderer r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setVisibility(int r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setZOrderOnTop(boolean r1) {
            r0 = this;
            return
    }
}

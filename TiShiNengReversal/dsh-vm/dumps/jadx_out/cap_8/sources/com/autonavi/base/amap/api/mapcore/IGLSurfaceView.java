package com.autonavi.base.amap.api.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IGLSurfaceView {
    int getHeight();

    android.view.SurfaceHolder getHolder();

    android.view.ViewParent getParent();

    int getRenderMode();

    int getWidth();

    boolean isEnabled();

    void onDetachedGLThread();

    boolean post(java.lang.Runnable r1);

    boolean postDelayed(java.lang.Runnable r1, long r2);

    void queueEvent(java.lang.Runnable r1);

    void requestRender();

    void setBackgroundColor(int r1);

    void setEGLConfigChooser(com.amap.api.col.p0003l.m2 r1);

    void setEGLContextFactory(com.amap.api.col.p0003l.n2 r1);

    void setRenderMode(int r1);

    void setRenderer(android.opengl.GLSurfaceView.Renderer r1);

    void setVisibility(int r1);

    void setZOrderOnTop(boolean r1);
}

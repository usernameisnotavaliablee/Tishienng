package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLMapRender implements android.opengl.GLSurfaceView.Renderer {
    public static final int ANIMATION_TICK_COUNT = 10;
    public static final int LONG_LONG_TICK_COUNT = 30;
    public static final int LONG_TICK_COUNT = 6;
    private static final int MAP_RENDER_MSG_RUNNABLE_ONGLTHREAD = 100;
    private static final int MAP_RENDER_MSG_SURFACE_RENDER = 10;
    public static final int NORMAL_TICK_COUNT = 2;
    public static final int RENDER_FPS_ANIMATION = 30;
    public static final int RENDER_FPS_GESTURE_ACTION = 40;
    static final int RENDER_FPS_MAX = 60;
    public static final int RENDER_FPS_NAVI = 10;
    public static final int RENDER_FPS_NORMAL = 15;
    static final long RENDER_TIMMER_DIFF_MIN = 16;
    static final java.lang.String TAG = "render";
    private volatile java.util.concurrent.atomic.AtomicLong mDrawFrameTickCount;
    public com.autonavi.amap.mapcore.interfaces.IAMap mGLMapView;
    private android.os.Handler mGLRenderHandler;
    private android.os.HandlerThread mGLRenderThread;
    private volatile boolean mIsRendPause;
    private boolean mIsTrafficMode;
    private long mLastFrameTime;
    public volatile boolean mSurfacedestoryed;
    private int mTargetFrameDurationMillis;
    private float mTargetRenderFPS;


    public GLMapRender(com.autonavi.amap.mapcore.interfaces.IAMap r4) {
            r3 = this;
            r3.<init>()
            r0 = 66
            r3.mTargetFrameDurationMillis = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r3.mTargetRenderFPS = r0
            r0 = 0
            r3.mIsRendPause = r0
            r3.mSurfacedestoryed = r0
            r1 = 0
            r3.mGLRenderThread = r1
            r3.mGLRenderHandler = r1
            long r1 = java.lang.System.currentTimeMillis()
            r3.mLastFrameTime = r1
            r3.mIsTrafficMode = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 6
            r0.<init>(r1)
            r3.mDrawFrameTickCount = r0
            r3.mGLMapView = r4
            return
    }

    static /* synthetic */ boolean access$000(com.autonavi.base.ae.gmap.GLMapRender r0) {
            boolean r0 = r0.mIsRendPause
            return r0
    }

    private void drawSingleFrame(javax.microedition.khronos.opengles.GL10 r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mGLMapView     // Catch: java.lang.Throwable -> L5
            r0.drawFrame(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public boolean isRenderPause() {
            r1 = this;
            boolean r0 = r1.mIsRendPause
            return r0
    }

    public void onAttachedToWindow() {
            r2 = this;
            android.os.HandlerThread r0 = r2.mGLRenderThread
            if (r0 != 0) goto L1d
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = " AMapGlRenderThread"
            r0.<init>(r1)
            r2.mGLRenderThread = r0
            r0.start()
            com.autonavi.base.ae.gmap.GLMapRender$1 r0 = new com.autonavi.base.ae.gmap.GLMapRender$1
            android.os.HandlerThread r1 = r2.mGLRenderThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r2, r1)
            r2.mGLRenderHandler = r0
        L1d:
            return
    }

    public void onDetachedFromWindow() {
            r1 = this;
            android.os.HandlerThread r0 = r1.mGLRenderThread
            if (r0 == 0) goto Lc
            r0.quit()
            r0 = 0
            r1.mGLRenderThread = r0
            r1.mGLRenderHandler = r0
        Lc:
            return
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r7) {
            r6 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r6.mGLMapView
            if (r0 != 0) goto L6
            goto L8b
        L6:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            r6.mLastFrameTime = r0     // Catch: java.lang.Throwable -> L6d
            r6.drawSingleFrame(r7)     // Catch: java.lang.Throwable -> L6d
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            long r2 = r6.mLastFrameTime     // Catch: java.lang.Throwable -> L6d
            long r2 = r0 - r2
            r6.mLastFrameTime = r0     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.atomic.AtomicLong r7 = r6.mDrawFrameTickCount     // Catch: java.lang.Throwable -> L6d
            long r0 = r7.get()     // Catch: java.lang.Throwable -> L6d
            com.autonavi.amap.mapcore.interfaces.IAMap r7 = r6.mGLMapView     // Catch: java.lang.Throwable -> L6d
            int r7 = r7.getRenderMode()     // Catch: java.lang.Throwable -> L6d
            if (r7 != 0) goto L8b
            android.os.Handler r7 = r6.mGLRenderHandler     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L8b
            android.os.HandlerThread r7 = r6.mGLRenderThread     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L8b
            boolean r7 = r7.isAlive()     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L8b
            java.util.concurrent.atomic.AtomicLong r7 = r6.mDrawFrameTickCount     // Catch: java.lang.Throwable -> L6d
            r4 = 1
            long r0 = r0 - r4
            r7.set(r0)     // Catch: java.lang.Throwable -> L6d
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 > 0) goto L6f
            r2 = -5
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L4c
            r0 = 60
            goto L79
        L4c:
            r2 = -7
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L55
            r0 = 100
            goto L79
        L55:
            r2 = -9
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L5e
            r0 = 250(0xfa, double:1.235E-321)
            goto L79
        L5e:
            boolean r7 = r6.mIsTrafficMode     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L65
            r0 = 10000(0x2710, double:4.9407E-320)
            goto L67
        L65:
            r0 = 500(0x1f4, double:2.47E-321)
        L67:
            java.util.concurrent.atomic.AtomicLong r7 = r6.mDrawFrameTickCount     // Catch: java.lang.Throwable -> L6d
            r7.set(r2)     // Catch: java.lang.Throwable -> L6d
            goto L79
        L6d:
            r7 = move-exception
            goto L8c
        L6f:
            int r7 = r6.mTargetFrameDurationMillis     // Catch: java.lang.Throwable -> L6d
            long r0 = (long) r7     // Catch: java.lang.Throwable -> L6d
            long r0 = r0 - r2
            r2 = 16
            long r0 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> L6d
        L79:
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L8b
            android.os.Handler r7 = r6.mGLRenderHandler     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L8b
            r2 = 10
            r7.removeMessages(r2)     // Catch: java.lang.Throwable -> L6d
            android.os.Handler r7 = r6.mGLRenderHandler     // Catch: java.lang.Throwable -> L6d
            r7.sendEmptyMessageDelayed(r2, r0)     // Catch: java.lang.Throwable -> L6d
        L8b:
            return
        L8c:
            java.lang.String r0 = "GLMapRender"
            java.lang.String r1 = "onDrawFrame"
            com.amap.api.col.p0003l.w5.p(r7, r0, r1)
            return
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.mSurfacedestoryed
            if (r0 == 0) goto L8
            r0 = 0
            r1.onSurfaceCreated(r2, r0)
        L8:
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mGLMapView
            r0.changeSurface(r2, r3, r4)
            r2 = 30
            r1.resetTickCount(r2)
            return
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r2, javax.microedition.khronos.egl.EGLConfig r3) {
            r1 = this;
            r0 = 0
            r1.mIsRendPause = r0
            r1.mSurfacedestoryed = r0
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mGLMapView
            r0.createSurface(r2, r3)
            return
    }

    public void onSurfaceDestory() {
            r3 = this;
            r0 = 1
            r3.mIsRendPause = r0
            android.os.Handler r1 = r3.mGLRenderHandler
            if (r1 == 0) goto Lf
            android.os.HandlerThread r2 = r3.mGLRenderThread
            if (r2 == 0) goto Lf
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
        Lf:
            com.autonavi.amap.mapcore.interfaces.IAMap r1 = r3.mGLMapView
            int r1 = r1.getNativeEngineID()
            com.autonavi.amap.mapcore.interfaces.IAMap r2 = r3.mGLMapView
            r2.destroySurface(r1)
            r3.mSurfacedestoryed = r0
            return
    }

    public void renderPause() {
            r2 = this;
            android.os.Handler r0 = r2.mGLRenderHandler
            if (r0 == 0) goto L15
            android.os.HandlerThread r0 = r2.mGLRenderThread
            if (r0 == 0) goto L15
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L15
            android.os.Handler r0 = r2.mGLRenderHandler
            r1 = 10
            r0.removeMessages(r1)
        L15:
            r0 = 1
            r2.mIsRendPause = r0
            return
    }

    public void renderResume() {
            r3 = this;
            android.os.Handler r0 = r3.mGLRenderHandler
            if (r0 == 0) goto L15
            android.os.HandlerThread r0 = r3.mGLRenderThread
            if (r0 == 0) goto L15
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L15
            android.os.Handler r0 = r3.mGLRenderHandler
            r1 = 10
            r0.removeMessages(r1)
        L15:
            r0 = 0
            r3.mIsRendPause = r0
            java.util.concurrent.atomic.AtomicLong r0 = r3.mDrawFrameTickCount
            r1 = -1
            r0.set(r1)
            r0 = 30
            r3.resetTickCount(r0)
            return
    }

    public void resetTickCount(int r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r5.mDrawFrameTickCount
            long r0 = r0.get()
            boolean r2 = r5.mIsRendPause
            if (r2 != 0) goto L3c
            android.os.HandlerThread r2 = r5.mGLRenderThread
            if (r2 == 0) goto L3c
            android.os.Handler r3 = r5.mGLRenderHandler
            if (r3 == 0) goto L3c
            boolean r2 = r2.isAlive()
            if (r2 == 0) goto L3c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L31
            java.util.concurrent.atomic.AtomicLong r0 = r5.mDrawFrameTickCount
            long r1 = (long) r6
            r0.set(r1)
            android.os.Handler r6 = r5.mGLRenderHandler
            r0 = 10
            r6.removeMessages(r0)
            android.os.Handler r6 = r5.mGLRenderHandler
            r6.sendEmptyMessage(r0)
            return
        L31:
            long r2 = (long) r6
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L46
            java.util.concurrent.atomic.AtomicLong r6 = r5.mDrawFrameTickCount
            r6.set(r2)
            return
        L3c:
            long r2 = (long) r6
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L46
            java.util.concurrent.atomic.AtomicLong r6 = r5.mDrawFrameTickCount
            r6.set(r2)
        L46:
            return
    }

    public void sendToRenderEvent(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mGLRenderHandler
            if (r0 == 0) goto L13
            android.os.HandlerThread r0 = r1.mGLRenderThread
            if (r0 == 0) goto L13
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L13
            android.os.Handler r0 = r1.mGLRenderHandler
            r0.post(r2)
        L13:
            return
    }

    public void setRenderFps(float r3) {
            r2 = this;
            float r0 = r2.mTargetRenderFPS
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L17
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r3
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.mTargetFrameDurationMillis = r0
            r2.mTargetRenderFPS = r3
        L17:
            return
    }

    public void setTrafficMode(boolean r1) {
            r0 = this;
            r0.mIsTrafficMode = r1
            return
    }
}

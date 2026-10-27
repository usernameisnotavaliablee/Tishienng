package com.autonavi.base.ae.gmap.gloverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLCrossVector extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay {
    private long mDiceNativeInstance;




    public GLCrossVector(int r3, com.autonavi.base.amap.api.mapcore.IAMapDelegate r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r0 = 0
            r2.mDiceNativeInstance = r0
            if (r4 == 0) goto L17
            com.autonavi.base.ae.gmap.GLMapEngine r5 = r4.getGLMapEngine()
            if (r5 == 0) goto L17
            com.autonavi.base.ae.gmap.gloverlay.GLCrossVector$1 r5 = new com.autonavi.base.ae.gmap.gloverlay.GLCrossVector$1
            r5.<init>(r2, r4, r3)
            r4.queueEvent(r5)
        L17:
            return
    }

    static /* synthetic */ int access$000(long r0, int[] r2, byte[] r3) {
            int r0 = nativeAddVectorData(r0, r2, r3)
            return r0
    }

    static /* synthetic */ void access$100(long r0, java.lang.Object r2, boolean r3) {
            nativeInitTextureCallback(r0, r2, r3)
            return
    }

    private static native void nativeAddVectorCar(long r0, int r2, int r3, int r4);

    private static native int nativeAddVectorData(long r0, int[] r2, byte[] r3);

    private static native void nativeInitTextureCallback(long r0, java.lang.Object r2, boolean r3);

    private static native void nativeSetArrowResId(long r0, boolean r2, int r3);

    private static native void nativeSetBackgroundResId(long r0, int r2);

    private static native void nativeSetCarResId(long r0, int r2);

    public int addVectorItem(com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r11, byte[] r12, int r13) {
            r10 = this;
            if (r11 == 0) goto L2f
            if (r12 == 0) goto L2f
            if (r13 != 0) goto L7
            goto L2f
        L7:
            android.graphics.Rect r13 = r11.stAreaRect
            int r0 = r13.left
            int r1 = r13.top
            int r2 = r13.right
            int r3 = r13.bottom
            int r4 = r11.stAreaColor
            int r5 = r11.fArrowBorderWidth
            int r6 = r11.stArrowBorderColor
            int r7 = r11.fArrowLineWidth
            int r8 = r11.stArrowLineColor
            boolean r9 = r11.dayMode
            int[] r11 = new int[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r13 = r10.mGLMapView
            if (r13 == 0) goto L2d
            com.autonavi.base.ae.gmap.gloverlay.GLCrossVector$2 r0 = new com.autonavi.base.ae.gmap.gloverlay.GLCrossVector$2
            r0.<init>(r10, r11, r12)
            r13.queueEvent(r0)
        L2d:
            r11 = 0
            return r11
        L2f:
            r11 = -1
            return r11
    }

    public void initTextureCallback(com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r3, boolean r4) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mGLMapView
            if (r0 == 0) goto Lc
            com.autonavi.base.ae.gmap.gloverlay.GLCrossVector$3 r1 = new com.autonavi.base.ae.gmap.gloverlay.GLCrossVector$3
            r1.<init>(r2, r3, r4)
            r0.queueEvent(r1)
        Lc:
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.GLOverlay
    void releaseInstance() {
            r4 = this;
            long r0 = r4.mNativeInstance
            r2 = 0
            r4.mNativeInstance = r2
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r4.mGLMapView
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r2.getGLMapEngine()
            int r3 = r4.mEngineID
            r2.destroyOverlay(r3, r0)
            super.releaseInstance()
            return
    }

    public void setArrowResId(boolean r3, int r4) {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSetArrowResId(r0, r3, r4)
            return
    }

    public void setBackgroundResId(int r3) {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSetBackgroundResId(r0, r3)
            return
    }

    public void setCarResId(int r3) {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSetCarResId(r0, r3)
            return
    }
}

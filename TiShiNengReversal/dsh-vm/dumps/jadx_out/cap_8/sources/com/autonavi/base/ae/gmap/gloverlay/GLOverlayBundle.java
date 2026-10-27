package com.autonavi.base.ae.gmap.gloverlay;

import com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLOverlayBundle<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> {
    private int mEngineID;
    private long mNativeInstance;
    private final java.util.List<E> mOverlayList;
    private android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> mTextureCaches;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class GLAmapFocusHits {
        public long mHitedIndex;
        public long mHitedTimes;
        public long mOverlayHashCode;

        public GLAmapFocusHits() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mOverlayHashCode = r0
                r2.mHitedIndex = r0
                r0 = 1000(0x3e8, double:4.94E-321)
                r2.mHitedTimes = r0
                return
        }
    }

    public GLOverlayBundle(int r3, com.autonavi.base.amap.api.mapcore.IAMapDelegate r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mOverlayList = r0
            r0 = 0
            r2.mNativeInstance = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTextureCaches = r0
            r2.mEngineID = r3
            if (r4 == 0) goto L25
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r4.getGLMapEngine()     // Catch: java.lang.Throwable -> L25
            int r4 = r2.mEngineID     // Catch: java.lang.Throwable -> L25
            long r3 = r3.getGlOverlayMgrPtr(r4)     // Catch: java.lang.Throwable -> L25
            r2.mNativeInstance = r3     // Catch: java.lang.Throwable -> L25
        L25:
            return
    }

    private int getOverlyExType(E r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public static void intClr2PVRClr(float[] r3, int r4) {
            r0 = r4 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            r2 = 2
            r3[r2] = r0
            int r0 = r4 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            r2 = 1
            r3[r2] = r0
            int r0 = r4 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            r2 = 0
            r3[r2] = r0
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r1
            r0 = 3
            r3[r0] = r4
            return
    }

    private static native void nativeAddGLOverlay(long r0, long r2, long r4);

    private static native void nativeAddGLOverlayEx(long r0, long r2, long r4, int r6);

    private static native void nativeClearAllGLOverlay(long r0, boolean r2);

    private static native boolean nativeOnSingleTapLineOverlay(long r0, int r2, int r3, long[] r4);

    private static native boolean nativeOnSingleTapPointOverlay(long r0, int r2, int r3, long[] r4);

    private static native void nativeRemoveGLOverlay(long r0, long r2);

    private static native void nativeRemoveGLOverlayEx(long r0, long r2, int r4);

    private static native void nativeSortAllGLOverlay(long r0);

    public void addOverlay(E r7) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            long r0 = r6.mNativeInstance
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r2 = r7.getGLOverlay()
            long r2 = r2.getNativeInstatnce()
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r4 = r7.getGLOverlay()
            int r4 = r4.getCode()
            long r4 = (long) r4
            nativeAddGLOverlay(r0, r2, r4)
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r7.getGLOverlay()
            r1 = 1
            r0.mIsInBundle = r1
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r1 = r6.mOverlayList
            monitor-enter(r1)
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r0 = r6.mOverlayList     // Catch: java.lang.Throwable -> L2a
            r0.add(r7)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r0 = move-exception
            r7 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r7
    }

    public boolean addOverlayTextureItem(int r8, int r9, float r10, float r11, int r12, int r13) {
            r7 = this;
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture r0 = new com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r8 = r7.mTextureCaches
            monitor-enter(r8)
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r9 = r7.mTextureCaches     // Catch: java.lang.Throwable -> L16
            r9.put(r1, r0)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            r8 = 1
            return r8
        L16:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r9
    }

    public boolean addOverlayTextureItem(int r2, int r3, int r4, int r5) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture r0 = new com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture
            r0.<init>(r2, r3, r4, r5)
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r3 = r1.mTextureCaches
            monitor-enter(r3)
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r4 = r1.mTextureCaches     // Catch: java.lang.Throwable -> L10
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            r2 = 1
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public long checkSingleTapOnLine(int r4, int r5) {
            r3 = this;
            r0 = 3
            long[] r0 = new long[r0]
            long r1 = r3.mNativeInstance
            boolean r4 = nativeOnSingleTapLineOverlay(r1, r4, r5, r0)
            if (r4 == 0) goto Lf
            r4 = 0
            r4 = r0[r4]
            return r4
        Lf:
            r4 = -1
            return r4
    }

    public long checkSingleTapOnPoint(int r4, int r5) {
            r3 = this;
            r0 = 3
            long[] r0 = new long[r0]
            long r1 = r3.mNativeInstance
            boolean r4 = nativeOnSingleTapPointOverlay(r1, r4, r5, r0)
            if (r4 == 0) goto Lf
            r4 = 0
            r4 = r0[r4]
            return r4
        Lf:
            r4 = -1
            return r4
    }

    public void clearFocus() {
            r3 = this;
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r0 = r3.mOverlayList
            if (r0 == 0) goto L25
            monitor-enter(r0)
            r1 = 0
        L6:
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r2 = r3.mOverlayList     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 >= r2) goto L21
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r2 = r3.mOverlayList     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1c
            com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay r2 = (com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay) r2     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            r2.clearFocus()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r1 = move-exception
            goto L23
        L1e:
            int r1 = r1 + 1
            goto L6
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
        L25:
            return
    }

    public void clearOverlayTexture() {
            r2 = this;
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r0 = r2.mTextureCaches
            monitor-enter(r0)
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r1 = r2.mTextureCaches     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public boolean cotainsOverlay(E r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r0 = r2.mOverlayList
            monitor-enter(r0)
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r1 = r2.mOverlayList     // Catch: java.lang.Throwable -> Lf
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public E getOverlay(int r3) {
            r2 = this;
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r0 = r2.mOverlayList
            monitor-enter(r0)
            if (r3 < 0) goto L1c
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r1 = r2.mOverlayList     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + (-1)
            if (r3 <= r1) goto L10
            goto L1c
        L10:
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r1 = r2.mOverlayList     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1a
            com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay r3 = (com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay) r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r3 = move-exception
            goto L1f
        L1c:
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    public int getOverlayCount() {
            r2 = this;
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r0 = r2.mOverlayList
            monitor-enter(r0)
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r1 = r2.mOverlayList     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture getOverlayTextureItem(int r3) {
            r2 = this;
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r0 = r2.mTextureCaches
            monitor-enter(r0)
            android.util.SparseArray<com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture> r1 = r2.mTextureCaches     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture r3 = (com.autonavi.base.ae.gmap.gloverlay.GLOverlayTexture) r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public boolean onSingleTap(int r5, int r6, int r7, int r8) {
            r4 = this;
            r0 = r8 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            boolean r0 = r4.onSingleTapPoints(r5, r6, r7)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto Lf
            return r2
        Lf:
            r3 = 2
            r8 = r8 & r3
            if (r8 != r3) goto L17
            boolean r0 = r4.onSingleTapLines(r5, r6, r7)
        L17:
            if (r0 == 0) goto L1a
            return r2
        L1a:
            return r1
    }

    boolean onSingleTapLines(int r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    boolean onSingleTapPoints(int r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void reculateRouteBoard(com.autonavi.base.amap.api.mapcore.IAMapDelegate r1) {
            r0 = this;
            return
    }

    public void removeAll(boolean r5) {
            r4 = this;
            long r0 = r4.mNativeInstance
            nativeClearAllGLOverlay(r0, r5)
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r5 = r4.mOverlayList
            monitor-enter(r5)
            r0 = 0
            r1 = 0
        La:
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r2 = r4.mOverlayList     // Catch: java.lang.Throwable -> L2a
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r2) goto L2f
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r2 = r4.mOverlayList     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L2a
            com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay r2 = (com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay) r2     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r3 = r2.getGLOverlay()     // Catch: java.lang.Throwable -> L2a
            r3.mIsInBundle = r0     // Catch: java.lang.Throwable -> L2a
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r2 = r2.getGLOverlay()     // Catch: java.lang.Throwable -> L2a
            r2.releaseInstance()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r0 = move-exception
            goto L36
        L2c:
            int r1 = r1 + 1
            goto La
        L2f:
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r0 = r4.mOverlayList     // Catch: java.lang.Throwable -> L2a
            r0.clear()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
            return
        L36:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    public void removeOverlay(E r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            long r0 = r4.mNativeInstance
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r2 = r5.getGLOverlay()
            long r2 = r2.getNativeInstatnce()
            nativeRemoveGLOverlay(r0, r2)
            com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r5.getGLOverlay()
            r1 = 0
            r0.mIsInBundle = r1
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r0 = r4.mOverlayList
            monitor-enter(r0)
            java.util.List<E extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r1 = r4.mOverlayList     // Catch: java.lang.Throwable -> L21
            r1.remove(r5)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    public void sortOverlay() {
            r2 = this;
            long r0 = r2.mNativeInstance
            nativeSortAllGLOverlay(r0)
            return
    }
}

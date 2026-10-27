package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapNativeGlOverlayLayer extends com.autonavi.base.amap.mapcore.NativeBase {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int mEngineId;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected long mNative;
    private com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener nativeFunCallListener;
    private java.util.concurrent.locks.ReentrantReadWriteLock readWriteLock;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface NativeFunCallListener {
        void getAMapResource(com.autonavi.base.ae.gmap.AMapAppRequestParam r1);

        com.amap.api.maps.model.BitmapDescriptor getBuildInImageData(int r1);

        com.amap.api.maps.model.BitmapDescriptor getCustomImageData(com.amap.api.maps.model.ImageOptions r1);

        com.amap.api.maps.model.BitmapDescriptor getInfoContents(java.lang.String r1);

        com.amap.api.maps.model.BitmapDescriptor getInfoWindow(java.lang.String r1);

        com.amap.api.maps.model.BitmapDescriptor getInfoWindowClick(java.lang.String r1);

        long getInfoWindowUpdateOffsetTime(java.lang.String r1);

        com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindow(java.lang.String r1);

        com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindowClick(java.lang.String r1);

        void onRedrawInfowindow();

        void onSetRunLowFrame(boolean r1);
    }

    public AMapNativeGlOverlayLayer() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mNative = r0
            r0 = 0
            r2.mEngineId = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.readWriteLock = r0
            return
    }

    static /* synthetic */ void access$000(com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0, boolean r1) {
            r0.setRunLowFrame(r1)
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private void getAMapResource(com.autonavi.base.ae.gmap.AMapAppRequestParam r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 != 0) goto L5
            return
        L5:
            r0.getAMapResource(r2)
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor getBuildInImageData(int r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r2 = r0.getBuildInImageData(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor getImagedData(com.amap.api.maps.model.ImageOptions r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r2 = r0.getCustomImageData(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor getInfoContents(java.lang.String r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r2 = r0.getInfoContents(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor getInfoWindow(java.lang.String r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r2 = r0.getInfoWindow(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor getInfoWindowClick(java.lang.String r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r2 = r0.getInfoWindowClick(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private long getInfoWindowUpdateOffsetTime(java.lang.String r3) {
            r2 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r2.nativeFunCallListener
            if (r0 == 0) goto L9
            long r0 = r0.getInfoWindowUpdateOffsetTime(r3)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindow(java.lang.String r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r2 = r0.getOverturnInfoWindow(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindowClick(java.lang.String r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r2 = r0.getOverturnInfoWindowClick(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    private native void nativeClear(java.lang.String[] r1);

    private native java.lang.String nativeContain(java.lang.Object r1, int r2);

    private native void nativeCreate(long r1);

    private native void nativeCreateOverlay(java.lang.String r1, java.lang.Object r2);

    private native void nativeDestroy();

    private native void nativeFinalize();

    private native int nativeGetCurrentParticleNum(java.lang.String r1);

    private native java.lang.Object nativeGetNativeOverlayProperties(java.lang.String r1, java.lang.String r2, java.lang.Object[] r3);

    private native void nativeRemoveOverlay(java.lang.String r1);

    private native void nativeRender(int r1, int r2, boolean r3);

    private native void nativeSetAMapEngine(long r1);

    private native void nativeUpdateOptions(java.lang.String r1, java.lang.Object r2);

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private void redrawInfoWindow() {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L7
            r0.onRedrawInfowindow()
        L7:
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private void setRunLowFrame(boolean r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$NativeFunCallListener r0 = r1.nativeFunCallListener
            if (r0 == 0) goto L7
            r0.onSetRunLowFrame(r2)
        L7:
            return
    }

    @com.autonavi.base.amap.mapcore.annotations.ParameterIsClass
    public void clear(java.lang.String... r8) {
            r7 = this;
            boolean r0 = r7.isReady()
            if (r0 != 0) goto L1b
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$3 r3 = new com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$3
            r3.<init>(r7, r8)
            java.lang.Object r0 = r8.clone()
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String r5 = "clearOverlay"
            r2 = r7
            r1 = r7
            r6 = r8
            r1.storeUncallFunctionArray(r2, r3, r4, r5, r6)
            return
        L1b:
            r1 = r7
            r6 = r8
            r7.callAllFunction()
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()     // Catch: java.lang.Throwable -> L36
            r8.lock()     // Catch: java.lang.Throwable -> L36
            r7.nativeClear(r6)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()
            r8.unlock()
            return
        L36:
            r0 = move-exception
            r8 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r8
    }

    public java.lang.String contain(com.amap.api.maps.model.LatLng r2, int r3) {
            r1 = this;
            boolean r0 = r1.isReady()
            if (r0 == 0) goto L2b
            r1.callAllFunction()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch: java.lang.Throwable -> L20
            r0.lock()     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r1.nativeContain(r2, r3)     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.unlock()
            return r2
        L20:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.unlock()
            throw r2
        L2b:
            java.lang.String r2 = ""
            return r2
    }

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    public void createNative() {
            r0 = this;
            return
    }

    public void createNative(long r6) {
            r5 = this;
            long r0 = r5.mNative     // Catch: java.lang.UnsatisfiedLinkError -> L22
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.readWriteLock     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L13
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch: java.lang.Throwable -> L24
            r0.lock()     // Catch: java.lang.Throwable -> L24
        L13:
            r5.nativeCreate(r6)     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.readWriteLock     // Catch: java.lang.UnsatisfiedLinkError -> L22
            if (r6 == 0) goto L2f
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()     // Catch: java.lang.UnsatisfiedLinkError -> L22
            r6.unlock()     // Catch: java.lang.UnsatisfiedLinkError -> L22
            return
        L22:
            r6 = move-exception
            goto L30
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.readWriteLock     // Catch: java.lang.UnsatisfiedLinkError -> L22
            if (r6 == 0) goto L2f
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()     // Catch: java.lang.UnsatisfiedLinkError -> L22
            r6.unlock()     // Catch: java.lang.UnsatisfiedLinkError -> L22
        L2f:
            return
        L30:
            r6.toString()
            return
    }

    public void createOverlay(java.lang.String r8, com.amap.api.maps.model.BaseOptions r9) {
            r7 = this;
            boolean r0 = r7.isReady()
            if (r0 != 0) goto L1a
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$1 r3 = new com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$1
            r3.<init>(r7, r8, r9)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r9
            java.lang.String r5 = "createOverlay"
            r2 = r7
            r1 = r7
            r4 = r8
            r1.storeUncallFunction(r2, r3, r4, r5, r6)
            return
        L1a:
            r1 = r7
            r4 = r8
            r7.callAllFunction()
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()     // Catch: java.lang.Throwable -> L35
            r8.lock()     // Catch: java.lang.Throwable -> L35
            r7.nativeCreateOverlay(r4, r9)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()
            r8.unlock()
            return
        L35:
            r0 = move-exception
            r8 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r9.readLock()
            r9.unlock()
            throw r8
    }

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    public void destroy() {
            r2 = this;
            super.destroy()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.readWriteLock     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch: java.lang.Throwable -> L19
            r0.lock()     // Catch: java.lang.Throwable -> L19
            r2.nativeDestroy()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            return
        L19:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    protected void finalizeNative() {
            r0 = this;
            r0.nativeFinalize()
            return
    }

    public int getCurrentParticleNum(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isReady()
            if (r0 == 0) goto L2b
            r1.callAllFunction()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch: java.lang.Throwable -> L20
            r0.lock()     // Catch: java.lang.Throwable -> L20
            int r2 = r1.nativeGetCurrentParticleNum(r2)     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            return r2
        L20:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r2
        L2b:
            r2 = 0
            return r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int getEngineId() {
            r1 = this;
            int r0 = r1.mEngineId
            return r0
    }

    @Override // com.autonavi.base.amap.mapcore.NativeBase
    protected long getNative() {
            r2 = this;
            long r0 = r2.mNative
            return r0
    }

    public java.lang.Object getNativeProperties(java.lang.String r9, java.lang.String r10, java.lang.Object[] r11) {
            r8 = this;
            boolean r0 = r8.isReady()
            r1 = 0
            if (r0 == 0) goto L3b
            if (r9 != 0) goto La
            goto L3b
        La:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r8.readWriteLock     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch: java.lang.Throwable -> L2f
            r0.lock()     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r8.destroy     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L21
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = r8.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r9.readLock()
            r9.unlock()
            return r1
        L21:
            java.lang.Object r9 = r8.nativeGetNativeOverlayProperties(r9, r10, r11)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = r8.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r10.readLock()
            r10.unlock()
            return r9
        L2f:
            r0 = move-exception
            r9 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = r8.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r10.readLock()
            r10.unlock()
            throw r9
        L3b:
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$5 r4 = new com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$5
            r4.<init>(r8, r9, r10, r11)
            r3 = r8
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            r2.storeUncallFunction(r3, r4, r5, r6, r7)
            return r1
    }

    @com.autonavi.base.amap.mapcore.annotations.ParameterIsClass
    public void removeOverlay(java.lang.String r8) {
            r7 = this;
            boolean r0 = r7.isReady()
            if (r0 != 0) goto L17
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$2 r3 = new com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$2
            r3.<init>(r7, r8)
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r5 = "removeOverlay"
            r2 = r7
            r1 = r7
            r4 = r8
            r1.storeUncallFunction(r2, r3, r4, r5, r6)
            return
        L17:
            r1 = r7
            r4 = r8
            r7.callAllFunction()
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()     // Catch: java.lang.Throwable -> L32
            r8.lock()     // Catch: java.lang.Throwable -> L32
            r7.nativeRemoveOverlay(r4)     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()
            r8.unlock()
            return
        L32:
            r0 = move-exception
            r8 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r8
    }

    public void render(int r2, int r3, boolean r4) {
            r1 = this;
            r1.callAllFunction()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch: java.lang.Throwable -> L19
            r0.lock()     // Catch: java.lang.Throwable -> L19
            r1.nativeRender(r2, r3, r4)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r2.readLock()
            r2.unlock()
            return
        L19:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.unlock()
            throw r2
    }

    public void setAMapEngine(long r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.readWriteLock     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch: java.lang.Throwable -> L16
            r0.lock()     // Catch: java.lang.Throwable -> L16
            r1.nativeSetAMapEngine(r2)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r2.readLock()
            r2.unlock()
            return
        L16:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.readWriteLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.unlock()
            throw r2
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void setEngineId(int r1) {
            r0 = this;
            r0.mEngineId = r1
            return
    }

    public void setNativeFunCallListener(com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener r1) {
            r0 = this;
            r0.nativeFunCallListener = r1
            return
    }

    @com.autonavi.base.amap.mapcore.annotations.ParameterIsClass
    public void updateOptions(java.lang.String r8, com.amap.api.maps.model.BaseOptions r9) {
            r7 = this;
            boolean r0 = r7.isReady()     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L20
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$4 r3 = new com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer$4     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "updateOptions"
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            r6[r0] = r9     // Catch: java.lang.Throwable -> L1d
            r2 = r7
            r1 = r7
            r4 = r8
            r1.storeUncallFunction(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
        L1b:
            r8 = r0
            goto L4e
        L1d:
            r0 = move-exception
            r1 = r7
            goto L1b
        L20:
            r1 = r7
            r4 = r8
            r7.callAllFunction()     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()     // Catch: java.lang.Throwable -> L37
            r8.lock()     // Catch: java.lang.Throwable -> L37
            r7.nativeUpdateOptions(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L3a
            r9.resetUpdateFlags()     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r0 = move-exception
            r8 = r0
            goto L44
        L3a:
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.readWriteLock     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()     // Catch: java.lang.Throwable -> L1a
            r8.unlock()     // Catch: java.lang.Throwable -> L1a
            return
        L44:
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = r1.readWriteLock     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r9.readLock()     // Catch: java.lang.Throwable -> L1a
            r9.unlock()     // Catch: java.lang.Throwable -> L1a
            throw r8     // Catch: java.lang.Throwable -> L1a
        L4e:
            r8.getMessage()
            return
    }
}

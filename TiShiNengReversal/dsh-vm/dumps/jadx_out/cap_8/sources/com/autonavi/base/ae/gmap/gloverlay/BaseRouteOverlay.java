package com.autonavi.base.ae.gmap.gloverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BaseRouteOverlay extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay implements com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner {


    public BaseRouteOverlay(int r1, com.autonavi.base.amap.api.mapcore.IAMapDelegate r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r0.mGLMapView
            if (r2 == 0) goto L17
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r2.getGLMapEngine()
            if (r2 == 0) goto L17
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r0.mGLMapView
            com.autonavi.base.ae.gmap.gloverlay.BaseRouteOverlay$1 r3 = new com.autonavi.base.ae.gmap.gloverlay.BaseRouteOverlay$1
            r3.<init>(r0, r1)
            r2.queueEvent(r3)
        L17:
            return
    }

    private static native void nativeAddRouteItem(long r0, int r2, com.amap.api.col.p0003l.er[] r3, int r4, com.amap.api.col.p0003l.eq r5, int[] r6);

    private static native void nativeAddRouteName(long r0);

    private static native void nativeRemoveRouteName(long r0, long r2);

    private static native void nativeSetArrow3DTexture(long r0, int r2);

    private static native void nativeSetArrowFlow(long r0, boolean r2);

    private static native void nativeSetCar2DPosition(long r0, int r2, float r3);

    private static native void nativeSetCar3DPosition(long r0, int r2, float r3);

    private static native void nativeSetHighlightParam(long r0, int[] r2);

    private static native void nativeSetHighlightType(long r0, int r2);

    private static native void nativeSetLine2DWidth(long r0, int r2, int r3);

    private static native void nativeSetLineWidthScale(long r0, float r2);

    private static native void nativeSetRouteItemParam(long r0, com.amap.api.col.p0003l.er r2);

    private static native void nativeSetSelectStatus(long r0, boolean r2);

    private static native void nativeSetShowArrow(long r0, boolean r2);

    private static native void nativeSetShowNaviRouteNameCountMap(long r0, int[] r2, int[] r3);

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void addRouteItem(int r9, com.amap.api.col.p0003l.er[] r10, int r11, com.amap.api.col.p0003l.eq r12, int[] r13) {
            r8 = this;
            long r0 = r8.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto L11
        L9:
            r0 = 0
        La:
            int r1 = r10.length
            if (r0 >= r1) goto L51
            r1 = r10[r0]
            if (r1 != 0) goto L12
        L11:
            return
        L12:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.a
            if (r2 == 0) goto L26
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r8.mGLMapView
            int r4 = r8.mEngineID
            android.graphics.Bitmap r2 = r2.getBitmap()
            int r2 = r3.createOverlayTexture(r4, r2)
            if (r2 < 0) goto L26
            r1.f3268b = r2
        L26:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3269c
            if (r2 == 0) goto L3a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r8.mGLMapView
            int r4 = r8.mEngineID
            android.graphics.Bitmap r2 = r2.getBitmap()
            int r2 = r3.createOverlayTexture(r4, r2)
            if (r2 < 0) goto L3a
            r1.f3270d = r2
        L3a:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3271e
            if (r2 == 0) goto L4e
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r8.mGLMapView
            int r4 = r8.mEngineID
            android.graphics.Bitmap r2 = r2.getBitmap()
            int r2 = r3.createOverlayTexture(r4, r2)
            if (r2 < 0) goto L4e
            r1.f3272f = r2
        L4e:
            int r0 = r0 + 1
            goto La
        L51:
            long r1 = r8.mNativeInstance
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            nativeAddRouteItem(r1, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void addRouteName() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeAddRouteName(r0)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public android.util.Pair<java.lang.Float, java.lang.Float> getDisplayRange() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public int getOverlayProperty() {
            r1 = this;
            r0 = 0
            return r0
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

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void remove() {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void removeRouteName() {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r5.mGLMapView
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r2.getGLMapEngine()
            long r2 = r2.getNativeInstance()
            nativeRemoveRouteName(r0, r2)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setArrow3DTexture(com.amap.api.maps.model.BitmapDescriptor r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto L26
        L9:
            if (r6 == 0) goto L26
            android.graphics.Bitmap r0 = r6.getBitmap()
            if (r0 != 0) goto L12
            goto L26
        L12:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r5.mGLMapView
            int r1 = r5.mEngineID
            android.graphics.Bitmap r6 = r6.getBitmap()
            int r6 = r0.createOverlayTexture(r1, r6)
            if (r6 >= 0) goto L21
            goto L26
        L21:
            long r0 = r5.mNativeInstance
            nativeSetArrow3DTexture(r0, r6)
        L26:
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setArrowFlow(boolean r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetArrowFlow(r0, r6)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setCar2DPosition(int r6, float r7) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetCar2DPosition(r0, r6, r7)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setCar3DPosition(int r6, float r7) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetCar3DPosition(r0, r6, r7)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setDisplayRange(float r1, float r2) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setHighlightParam(com.amap.api.maps.model.RouteOverlay.RouteOverlayHighLightParam r7) {
            r6 = this;
            long r0 = r6.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            int r2 = r7.fillColorHightLight
            int r3 = r7.borderColorHightLight
            int r4 = r7.fillColorNormal
            int r5 = r7.borderColorNormal
            int r7 = r7.arrowColorNormal
            int[] r7 = new int[]{r2, r3, r4, r5, r7}
            nativeSetHighlightParam(r0, r7)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setHighlightType(int r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetHighlightType(r0, r6)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setLine2DWidth(int r6, int r7) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetLine2DWidth(r0, r6, r7)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setLineWidthScale(float r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetLineWidthScale(r0, r6)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setOverlayProperty(int r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setRouteItemParam(com.amap.api.col.p0003l.er r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetRouteItemParam(r0, r6)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setSelectStatus(boolean r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetSelectStatus(r0, r6)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setShowArrow(boolean r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            nativeSetShowArrow(r0, r6)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setShowNaviRouteNameCountMap(java.util.Map<java.lang.Integer, java.lang.Integer> r6) {
            r5 = this;
            long r0 = r5.mNativeInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            int r0 = r6.size()
            int[] r0 = new int[r0]
            int r1 = r6.size()
            int[] r1 = new int[r1]
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r2 = 0
        L1e:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r6.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0[r2] = r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L1e
        L45:
            long r2 = r5.mNativeInstance
            nativeSetShowNaviRouteNameCountMap(r2, r0, r1)
            return
    }
}

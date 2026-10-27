package com.autonavi.base.ae.gmap.gloverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteOverlayInner extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<com.autonavi.base.ae.gmap.gloverlay.BaseRouteOverlay, java.lang.Object> implements com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner {
    private float maxDisplayLevel;
    private float minDisplayLevel;
    private int property;





















    public RouteOverlayInner(int r1, android.content.Context r2, com.autonavi.amap.mapcore.interfaces.IAMap r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1077936128(0x40400000, float:3.0)
            r0.minDisplayLevel = r1
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.maxDisplayLevel = r1
            r1 = 1
            r0.property = r1
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay
    public void addItem(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void addRouteItem(int r9, com.amap.api.col.p0003l.er[] r10, int r11, com.amap.api.col.p0003l.eq r12, int[] r13) {
            r8 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r8.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$1 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void addRouteName() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$4 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$4
            r1.<init>(r2)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public android.util.Pair<java.lang.Float, java.lang.Float> getDisplayRange() {
            r3 = this;
            android.util.Pair r0 = new android.util.Pair
            float r1 = r3.minDisplayLevel
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r3.maxDisplayLevel
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public int getOverlayProperty() {
            r1 = this;
            int r0 = r1.property
            return r0
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay
    protected void iniGLOverlay() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 == 0) goto Lc
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$17 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$17
            r1.<init>(r2)
            r0.queueEvent(r1)
        Lc:
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void remove() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$16 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$16
            r1.<init>(r2)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void removeRouteName() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$5 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$5
            r1.<init>(r2)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay
    public void resumeMarker(android.graphics.Bitmap r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setArrow3DTexture(com.amap.api.maps.model.BitmapDescriptor r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$9 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$9
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setArrowFlow(boolean r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$15 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$15
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setCar2DPosition(int r3, float r4) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$2 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$2
            r1.<init>(r2, r3, r4)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setCar3DPosition(int r3, float r4) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$3 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$3
            r1.<init>(r2, r3, r4)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setDisplayRange(float r3, float r4) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            r2.minDisplayLevel = r3
            r2.maxDisplayLevel = r4
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$19 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$19
            r1.<init>(r2, r3, r4)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setHighlightParam(com.amap.api.maps.model.RouteOverlay.RouteOverlayHighLightParam r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$12 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$12
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setHighlightType(int r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$11 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$11
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setLine2DWidth(int r3, int r4) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$7 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$7
            r1.<init>(r2, r3, r4)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setLineWidthScale(float r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$6 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$6
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setOverlayProperty(int r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            r2.property = r3
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$20 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$20
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setRouteItemParam(com.amap.api.col.p0003l.er r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$10 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$10
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setSelectStatus(boolean r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$13 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$13
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setShowArrow(boolean r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$8 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$8
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setShowNaviRouteNameCountMap(java.util.Map<java.lang.Integer, java.lang.Integer> r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$14 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$14
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay, com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public void setVisible(boolean r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 != 0) goto L5
            return
        L5:
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$18 r1 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner$18
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
            return
    }
}

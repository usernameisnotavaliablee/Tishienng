package com.autonavi.base.ae.gmap.gloverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CrossVectorOverlay extends com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<com.autonavi.base.ae.gmap.gloverlay.GLCrossVector, java.lang.Object> implements com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay {
    com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr attr;
    private com.amap.api.maps.model.CrossOverlay.GenerateCrossImageListener imageListener;
    private boolean isImageMode;
    private com.amap.api.maps.model.CrossOverlay.OnCrossVectorUpdateListener updateListener;






    public CrossVectorOverlay(int r1, android.content.Context r2, com.autonavi.amap.mapcore.interfaces.IAMap r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.isImageMode = r1
            r1 = 0
            r0.attr = r1
            return
    }

    static /* synthetic */ boolean access$000(com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r0) {
            boolean r0 = r0.isImageMode
            return r0
    }

    static /* synthetic */ void access$100(com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r0, boolean r1) {
            r0.initImageMode(r1)
            return
    }

    static /* synthetic */ void access$200(com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r0, int r1) {
            r0.drawVectorFailed(r1)
            return
    }

    static /* synthetic */ com.amap.api.maps.model.CrossOverlay.OnCrossVectorUpdateListener access$300(com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r0) {
            com.amap.api.maps.model.CrossOverlay$OnCrossVectorUpdateListener r0 = r0.updateListener
            return r0
    }

    private void drawVectorFailed(int r3) {
            r2 = this;
            boolean r0 = r2.isImageMode
            if (r0 == 0) goto Lc
            com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener r0 = r2.imageListener
            if (r0 == 0) goto Lc
            r1 = 0
            r0.onGenerateComplete(r1, r3)
        Lc:
            com.amap.api.maps.model.CrossOverlay$OnCrossVectorUpdateListener r0 = r2.updateListener
            if (r0 == 0) goto L1d
            com.amap.api.maps.model.CrossOverlay$UpdateItem r0 = new com.amap.api.maps.model.CrossOverlay$UpdateItem
            r0.<init>()
            r0.dataUpdateFlag = r3
            com.amap.api.maps.model.CrossOverlay$OnCrossVectorUpdateListener r3 = r2.updateListener
            r1 = 0
            r3.onUpdate(r1, r0)
        L1d:
            return
    }

    private void initImageMode(boolean r2) {
            r1 = this;
            T extends com.autonavi.base.ae.gmap.gloverlay.GLOverlay r0 = r1.mGLOverlay
            if (r0 == 0) goto L9
            com.autonavi.base.ae.gmap.gloverlay.GLCrossVector r0 = (com.autonavi.base.ae.gmap.gloverlay.GLCrossVector) r0
            r0.initTextureCallback(r1, r2)
        L9:
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay
    public void addItem(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void addOverlayTexture(android.graphics.Bitmap r2, int r3, int r4) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty r0 = new com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty
            r0.<init>()
            r0.mId = r3
            r0.mAnchor = r4
            r0.mBitmap = r2
            r2 = 0
            r0.mXRatio = r2
            r0.mYRatio = r2
            r2 = 1
            r0.isGenMimps = r2
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r1.mMapView
            int r3 = r1.mEngineID
            r2.addOverlayTexture(r3, r0)
            return
    }

    public int createOverlayTexture(android.graphics.Bitmap r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            int r1 = r2.mEngineID
            int r3 = r0.createOverlayTexture(r1, r3)
            return r3
    }

    public int dipToPixel(android.content.Context r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L13
        L3:
            float r0 = (float) r4
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L13
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Exception -> L13
            r1 = 1
            float r3 = android.util.TypedValue.applyDimension(r1, r0, r3)     // Catch: java.lang.Exception -> L13
            int r3 = (int) r3
            return r3
        L13:
            return r4
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void imageContentResult(int[] r3, int r4, int r5) {
            r2 = this;
            r0 = -1
            if (r3 != 0) goto L7
            r2.drawVectorFailed(r0)
            return
        L7:
            com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener r1 = r2.imageListener
            if (r1 == 0) goto L17
            android.graphics.Bitmap r3 = com.amap.api.col.p0003l.b3.o(r3, r4, r5)
            com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener r4 = r2.imageListener
            if (r3 == 0) goto L14
            r0 = 0
        L14:
            r4.onGenerateComplete(r3, r0)
        L17:
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay
    protected void iniGLOverlay() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 == 0) goto Lc
            com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$1 r1 = new com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$1
            r1.<init>(r2)
            r0.queueEvent(r1)
        Lc:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public void remove() {
            r2 = this;
            r0 = 0
            r2.imageListener = r0
            r0 = 0
            r2.setVisible(r0)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 == 0) goto L13
            com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$5 r1 = new com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$5
            r1.<init>(r2)
            r0.queueEvent(r1)
        L13:
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay
    public void resumeMarker(android.graphics.Bitmap r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 == 0) goto Lc
            com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$2 r1 = new com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$2
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
        Lc:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public void setAttribute(com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r1) {
            r0 = this;
            r0.attr = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public int setData(byte[] r6) {
            r5 = this;
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            if (r0 != 0) goto L65
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = new com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr
            r0.<init>()
            r5.attr = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r5.mMapView
            int r2 = r2.getMapWidth()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r5.mMapView
            int r3 = r3.getMapHeight()
            int r3 = r3 * 4
            int r3 = r3 / 11
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.stAreaRect = r1
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            r1 = 217(0xd9, float:3.04E-43)
            r2 = 95
            int r1 = android.graphics.Color.argb(r1, r2, r2, r2)
            r0.stAreaColor = r1
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            android.content.Context r1 = r5.mContext
            r2 = 22
            int r1 = r5.dipToPixel(r1, r2)
            r0.fArrowBorderWidth = r1
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            r1 = 50
            r2 = 20
            int r1 = android.graphics.Color.argb(r4, r4, r1, r2)
            r0.stArrowBorderColor = r1
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            android.content.Context r1 = r5.mContext
            r2 = 18
            int r1 = r5.dipToPixel(r1, r2)
            r0.fArrowLineWidth = r1
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            r1 = 253(0xfd, float:3.55E-43)
            r2 = 65
            r3 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.argb(r3, r3, r1, r2)
            r0.stArrowLineColor = r1
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            r0.dayMode = r4
        L65:
            if (r6 == 0) goto L77
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r5.attr
            if (r0 == 0) goto L77
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r5.mMapView
            if (r0 == 0) goto L77
            com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$4 r1 = new com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$4
            r1.<init>(r5, r6)
            r0.queueEvent(r1)
        L77:
            r6 = -1
            return r6
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public void setGenerateCrossImageListener(com.amap.api.maps.model.CrossOverlay.GenerateCrossImageListener r1) {
            r0 = this;
            r0.imageListener = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public void setImageMode(boolean r1) {
            r0 = this;
            r0.isImageMode = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public void setOnCrossVectorUpdateListener(com.amap.api.maps.model.CrossOverlay.OnCrossVectorUpdateListener r1) {
            r0 = this;
            r0.updateListener = r1
            return
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay, com.autonavi.amap.mapcore.interfaces.ICrossVectorOverlay
    public void setVisible(boolean r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mMapView
            if (r0 == 0) goto Lc
            com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$3 r1 = new com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay$3
            r1.<init>(r2, r3)
            r0.queueEvent(r1)
        Lc:
            return
    }
}

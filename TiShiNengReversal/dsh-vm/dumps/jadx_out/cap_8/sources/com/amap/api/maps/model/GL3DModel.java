package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GL3DModel extends com.amap.api.maps.model.BasePointOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private java.lang.Object object;
    private com.amap.api.maps.model.GL3DModelOptions options;

    public GL3DModel(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.GL3DModelOptions r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r0.glOverlayLayerRef = r3
            r0.options = r2
            return
    }

    private java.lang.Object a(java.lang.String r3, java.lang.Object[] r4) {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r0.getNativeProperties(r1, r3, r4)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = 0
            return r3
    }

    private void a() {
            r3 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r3.glOverlayLayerRef     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.model.GL3DModelOptions r2 = r3.options     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void destroy() {
            r0 = this;
            r0.remove()
            return
    }

    public double getAltitude() {
            r2 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r2.options     // Catch: java.lang.Exception -> L7
            double r0 = r0.getAltitude()     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getAngle() {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L7
            float r0 = r0.getAngle()     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.overlayName     // Catch: java.lang.Exception -> L3
            return r0
        L3:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public java.lang.Object getObject() {
            r1 = this;
            java.lang.Object r0 = r1.object
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public com.amap.api.maps.model.LatLng getPosition() {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L7
            com.amap.api.maps.model.LatLng r0 = r0.getLatLng()     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public float getRotateAngle() {
            r1 = this;
            float r0 = r1.getAngle()     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public java.lang.String getSnippet() {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L9
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getSnippet()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public java.lang.String getTitle() {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L9
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getTitle()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public int getZIndex() {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getZIndex()
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean isInfoWindowEnable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean isVisible() {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L7
            boolean r0 = r0.isVisible()     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void remove() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lf
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> Lf
            r0.removeOverlay(r1)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public void setAltitude(double r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L8
            r0.setAltitude(r2)     // Catch: java.lang.Exception -> L8
            r1.a()     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    public void setAngle(float r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L8
            r0.angle(r2)     // Catch: java.lang.Exception -> L8
            r1.a()     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setAnimation(com.amap.api.maps.model.animation.Animation r4) {
            r3 = this;
            java.lang.String r0 = "setAnimation"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> Lb
            r3.a(r0, r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setGeoPoint(com.autonavi.amap.mapcore.IPoint r1) {
            r0 = this;
            return
    }

    public void setModelFixedLength(int r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L8
            r0.setModelFixedLength(r2)     // Catch: java.lang.Exception -> L8
            r1.a()     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setObject(java.lang.Object r1) {
            r0 = this;
            r0.object = r1     // Catch: java.lang.Exception -> L2
        L2:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setPosition(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L8
            r0.position(r2)     // Catch: java.lang.Exception -> L8
            r1.a()     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setRotateAngle(float r1) {
            r0 = this;
            r0.setAngle(r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setSnippet(java.lang.String r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.snippet(r2)
            r1.a()
        La:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setTitle(java.lang.String r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.title(r2)
            r1.a()
        La:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options     // Catch: java.lang.Exception -> L8
            r0.setVisible(r2)     // Catch: java.lang.Exception -> L8
            r1.a()     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    public void setZIndex(int r2) {
            r1 = this;
            com.amap.api.maps.model.GL3DModelOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.setzIndex(r2)
            r1.a()
        La:
            return
    }

    public void setZoomLimit(float r1) {
            r0 = this;
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void showInfoWindow() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L17
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L17
            if (r0 == 0) goto L17
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L17
            r0.showInfoWindow(r1)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean startAnimation() {
            r2 = this;
            java.lang.String r0 = "startAnimation"
            r1 = 0
            java.lang.Object r0 = r2.a(r0, r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L12
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L12:
            r0 = 0
            return r0
    }
}

package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class GroundOverlay extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private float high;
    private com.amap.api.maps.model.GroundOverlayOptions options;
    private com.amap.api.maps.model.LatLng point;
    private float width;

    public GroundOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.GroundOverlayOptions r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r0.glOverlayLayerRef = r3
            r0.options = r2
            return
    }

    private void a() {
            r3 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r3.glOverlayLayerRef
            java.lang.Object r0 = r0.get()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0
            java.lang.String r1 = r3.overlayName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.overlayName
            com.amap.api.maps.model.GroundOverlayOptions r2 = r3.options
            r0.updateOption(r1, r2)
        L19:
            return
    }

    public final void destroy() {
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

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3 instanceof com.amap.api.maps.model.GroundOverlay
            if (r1 != 0) goto L8
            goto L1e
        L8:
            boolean r1 = super.equals(r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1c
            com.amap.api.maps.model.GroundOverlay r3 = (com.amap.api.maps.model.GroundOverlay) r3     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r2.getId()     // Catch: java.lang.Throwable -> L1e
            if (r3 != r1) goto L1b
            goto L1c
        L1b:
            return r0
        L1c:
            r3 = 1
            return r3
        L1e:
            return r0
    }

    public final float getBearing() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getBearing()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final com.amap.api.maps.model.LatLngBounds getBounds() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            com.amap.api.maps.model.LatLngBounds r0 = r1.getBounds()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final float getHeight() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getHeight()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.overlayName     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.LatLng getPosition() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            com.amap.api.maps.model.LatLng r0 = r1.getLocation()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final float getTransparency() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getTransparency()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final float getWidth() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getWidth()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final float getZIndex() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getZIndex()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public final boolean isVisible() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.GroundOverlayOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            boolean r0 = r1.isVisible()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final void remove() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L22
            r0.removeOverlay(r1)     // Catch: java.lang.Throwable -> L22
        Lf:
            com.amap.api.maps.model.GroundOverlayOptions r0 = r2.options     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            com.amap.api.maps.model.BitmapDescriptor r0 = r0.getImage()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            com.amap.api.maps.model.GroundOverlayOptions r0 = r2.options     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.model.BitmapDescriptor r0 = r0.getImage()     // Catch: java.lang.Throwable -> L22
            r0.recycle()     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public final void setBearing(float r2) {
            r1 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.bearing(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setDimensions(float r3) {
            r2 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r2.options     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            com.amap.api.maps.model.LatLng r1 = r2.point     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L9
            goto Ld
        L9:
            com.amap.api.maps.model.LatLng r1 = r0.getLocation()     // Catch: java.lang.Throwable -> L1a
        Ld:
            if (r1 != 0) goto L12
            r2.width = r3     // Catch: java.lang.Throwable -> L1a
            return
        L12:
            com.amap.api.maps.model.GroundOverlayOptions r0 = r2.options     // Catch: java.lang.Throwable -> L1a
            r0.position(r1, r3)     // Catch: java.lang.Throwable -> L1a
            r2.a()     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public final void setDimensions(float r3, float r4) {
            r2 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r2.options     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
            com.amap.api.maps.model.LatLng r1 = r2.point     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L9
            goto Ld
        L9:
            com.amap.api.maps.model.LatLng r1 = r0.getLocation()     // Catch: java.lang.Throwable -> L20
        Ld:
            if (r1 != 0) goto L14
            r2.width = r3     // Catch: java.lang.Throwable -> L20
            r2.high = r4     // Catch: java.lang.Throwable -> L20
            return
        L14:
            com.amap.api.maps.model.GroundOverlayOptions r0 = r2.options     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.LatLng r1 = r0.getLocation()     // Catch: java.lang.Throwable -> L20
            r0.position(r1, r3, r4)     // Catch: java.lang.Throwable -> L20
            r2.a()     // Catch: java.lang.Throwable -> L20
        L20:
            return
    }

    public final void setImage(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.image(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setPosition(com.amap.api.maps.model.LatLng r5) {
            r4 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r4.options     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3d
            if (r5 == 0) goto L3d
            float r1 = r4.width     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto Le
            goto L12
        Le:
            float r1 = r0.getWidth()     // Catch: java.lang.Throwable -> L3d
        L12:
            float r0 = r4.high     // Catch: java.lang.Throwable -> L3d
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L19
            goto L1f
        L19:
            com.amap.api.maps.model.GroundOverlayOptions r0 = r4.options     // Catch: java.lang.Throwable -> L3d
            float r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L3d
        L1f:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 != 0) goto L26
            r4.point = r5     // Catch: java.lang.Throwable -> L3d
            return
        L26:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L33
            com.amap.api.maps.model.GroundOverlayOptions r0 = r4.options     // Catch: java.lang.Throwable -> L3d
            r0.position(r5, r1)     // Catch: java.lang.Throwable -> L3d
            r4.a()     // Catch: java.lang.Throwable -> L3d
            return
        L33:
            if (r2 <= 0) goto L3d
            com.amap.api.maps.model.GroundOverlayOptions r2 = r4.options     // Catch: java.lang.Throwable -> L3d
            r2.position(r5, r1, r0)     // Catch: java.lang.Throwable -> L3d
            r4.a()     // Catch: java.lang.Throwable -> L3d
        L3d:
            return
    }

    public final void setPositionFromBounds(com.amap.api.maps.model.LatLngBounds r2) {
            r1 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            if (r2 == 0) goto Lc
            r0.positionFromBounds(r2)     // Catch: java.lang.Throwable -> Lc
            r1.a()     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public final void setTransparency(float r2) {
            r1 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.transparency(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.visible(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.zIndex(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }
}

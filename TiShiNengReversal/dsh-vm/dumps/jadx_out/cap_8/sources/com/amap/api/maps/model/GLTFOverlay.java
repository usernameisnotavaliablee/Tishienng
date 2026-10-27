package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLTFOverlay extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.GLTFOverlayOptions mOptions;

    public GLTFOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.GLTFOverlayOptions r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r0.glOverlayLayerRef = r3
            r0.mOptions = r2
            return
    }

    private java.lang.Object a(java.lang.String r4) {
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r1 = r3.glOverlayLayerRef     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1a
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r3.overlayName     // Catch: java.lang.Throwable -> L1a
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1a
            if (r1 == 0) goto L1a
            java.lang.String r2 = r3.overlayName     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r1.getNativeProperties(r2, r4, r0)     // Catch: java.lang.Throwable -> L1a
            return r4
        L1a:
            return r0
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
            com.amap.api.maps.model.GLTFOverlayOptions r2 = r3.mOptions     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public int getCurrentAnimationIndex() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L7
            r0.getCurrentAnimationIndex()
        L7:
            r0 = -1
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.overlayName     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = 0
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getInfoWindowView() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r0 = r0.getInfoWindowView()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.maps.model.LatLng getLatlng() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L9
            com.amap.api.maps.model.LatLng r0 = r0.getLatLng()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.maps.model.GLTFOverlayOptions getOptions() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r0.clone()
            return r0
    }

    public float getZIndex() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L9
            float r0 = r0.getZIndex()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public boolean isAnimated() {
            r2 = this;
            java.lang.String r0 = "isAnimated"
            java.lang.Object r0 = r2.a(r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L11
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public boolean isClickable() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L9
            boolean r0 = r0.isClickable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isDraggable() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L9
            boolean r0 = r0.isDraggable()
            return r0
        L9:
            r0 = 1
            return r0
    }

    public boolean isInfoWindowShow() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L9
            boolean r0 = r0.isInfoWindowShow()
            return r0
        L9:
            r0 = 0
            return r0
    }

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

    public void setClickable(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L7
            r0.setClickable(r2)
        L7:
            return
    }

    public void setCurrentAnimationIndex(int r2) {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto La
            r0.setCurrentAnimationIndex(r2)
            r1.a()
        La:
            return
    }

    public void setDraggable(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L7
            r0.setDraggable(r2)
        L7:
            return
    }

    public void setInfoWindowView(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto La
            r0.infoWindowView(r2)
            r1.a()
        La:
            return
    }

    public void setLatLng(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto La
            r0.latLng(r2)     // Catch: java.lang.Exception -> La
            r1.a()     // Catch: java.lang.Exception -> La
        La:
            return
    }

    public void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto La
            r0.setZIndex(r2)
            r1.a()
        La:
            return
    }

    public void tapClick() {
            r1 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r0 = r1.mOptions
            if (r0 == 0) goto L7
            r0.tapClick()
        L7:
            java.lang.String r0 = "tapClick"
            r1.a(r0)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }
}

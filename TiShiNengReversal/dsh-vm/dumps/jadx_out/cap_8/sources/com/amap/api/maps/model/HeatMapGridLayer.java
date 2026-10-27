package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HeatMapGridLayer extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.HeatMapGridLayerOptions options;

    public HeatMapGridLayer(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.HeatMapGridLayerOptions r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r0.glOverlayLayerRef = r3
            r0.options = r2
            r0.a()
            return
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
            com.amap.api.maps.model.HeatMapGridLayerOptions r2 = r3.options     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public void destroy() {
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

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L22
            boolean r1 = r3 instanceof com.amap.api.maps.model.HeatMapGridLayer
            if (r1 != 0) goto L8
            goto L22
        L8:
            boolean r1 = super.equals(r3)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L20
            com.amap.api.maps.model.HeatMapGridLayer r3 = (com.amap.api.maps.model.HeatMapGridLayer) r3     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r2.getId()     // Catch: java.lang.Throwable -> L22
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            r3 = 1
            return r3
        L22:
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

    public com.amap.api.maps.model.HeatMapGridLayerOptions getOptions() {
            r1 = this;
            com.amap.api.maps.model.HeatMapGridLayerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = 0
            return r0
    }

    public float getZIndex() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.HeatMapGridLayerOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getZIndex()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public boolean isVisible() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.HeatMapGridLayerOptions r1 = r2.options     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lc
            boolean r1 = r1.isVisible()     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
    }

    public void setOptions(com.amap.api.maps.model.HeatMapGridLayerOptions r1) {
            r0 = this;
            r0.options = r1     // Catch: java.lang.Throwable -> L5
            r0.a()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.HeatMapGridLayerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.visible(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.HeatMapGridLayerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.zIndex(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }
}

package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Arc extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.ArcOptions options;

    public Arc(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.ArcOptions r2, java.lang.String r3) {
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
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r3.glOverlayLayerRef     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.model.ArcOptions r2 = r3.options     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3 instanceof com.amap.api.maps.model.Arc
            if (r1 != 0) goto L8
            goto L1e
        L8:
            boolean r1 = super.equals(r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1c
            com.amap.api.maps.model.Arc r3 = (com.amap.api.maps.model.Arc) r3     // Catch: java.lang.Throwable -> L1e
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

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.overlayName     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = 0
            return r0
    }

    public final int getStrokeColor() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.ArcOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            int r0 = r1.getStrokeColor()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final float getStrokeWidth() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.ArcOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getStrokeWidth()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final float getZIndex() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.ArcOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getZIndex()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public final boolean isVisible() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.ArcOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            boolean r0 = r1.isVisible()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public final void remove() {
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

    public final void setStrokeColor(int r2) {
            r1 = this;
            com.amap.api.maps.model.ArcOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.strokeColor(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setStrokeWidth(float r2) {
            r1 = this;
            com.amap.api.maps.model.ArcOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.strokeWidth(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.ArcOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.visible(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.ArcOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.zIndex(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }
}

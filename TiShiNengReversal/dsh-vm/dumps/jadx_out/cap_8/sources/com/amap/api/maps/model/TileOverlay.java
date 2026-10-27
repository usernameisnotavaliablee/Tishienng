package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class TileOverlay extends com.amap.api.maps.model.BaseOverlay {
    protected java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    protected com.amap.api.maps.model.TileOverlayOptions options;

    public TileOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer r2, com.amap.api.maps.model.TileOverlayOptions r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.glOverlayLayerRef = r0
            r1.options = r3
            if (r3 == 0) goto L17
            com.autonavi.base.ae.gmap.bean.TileProviderInner r3 = r3.getTileProviderInner()
            if (r3 == 0) goto L17
            r3.init(r2, r4)
        L17:
            return
    }

    protected final java.lang.Object callNativeFunction(java.lang.String r3, java.lang.Object[] r4) {
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

    public final void clearTileCache() {
            r2 = this;
            java.lang.String r0 = "clearTileCache"
            r1 = 0
            r2.callNativeFunction(r0, r1)
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L25
            boolean r1 = r4 instanceof com.amap.api.maps.model.TileOverlay
            if (r1 != 0) goto L8
            goto L25
        L8:
            com.amap.api.maps.model.TileOverlayOptions r1 = r3.options     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L25
            r2 = r4
            com.amap.api.maps.model.TileOverlay r2 = (com.amap.api.maps.model.TileOverlay) r2     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.TileOverlayOptions r2 = r2.options     // Catch: java.lang.Throwable -> L25
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L25
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.TileOverlay r4 = (com.amap.api.maps.model.TileOverlay) r4     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = r4.overlayName     // Catch: java.lang.Throwable -> L25
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.overlayName
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            com.amap.api.maps.model.TileOverlayOptions r0 = r1.options
            float r0 = r0.getZIndex()
            return r0
    }

    public final int hashCode() {
            r2 = this;
            com.amap.api.maps.model.TileOverlayOptions r0 = r2.options
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.overlayName
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            int r0 = r0 + 31
            int r0 = r0 * 31
            com.amap.api.maps.model.TileOverlayOptions r1 = r2.options
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
        L1a:
            int r0 = super.hashCode()
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            com.amap.api.maps.model.TileOverlayOptions r0 = r1.options
            boolean r0 = r0.isVisible()
            return r0
    }

    public final void remove() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: android.os.RemoteException -> Lf
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> Lf
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.overlayName     // Catch: android.os.RemoteException -> Lf
            r0.removeOverlay(r1)     // Catch: android.os.RemoteException -> Lf
        Lf:
            return
    }

    public final void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.TileOverlayOptions r0 = r1.options
            r0.visible(r2)
            r1.updateOption()
            return
    }

    public final void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.TileOverlayOptions r0 = r1.options
            r0.zIndex(r2)
            r1.updateOption()
            return
    }

    protected final void updateOption() {
            r3 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r3.glOverlayLayerRef     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.model.TileOverlayOptions r2 = r3.options     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }
}

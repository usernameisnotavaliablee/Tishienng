package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MVTTileOverlay extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.MVTTileOverlayOptions mMVTTileOverlayOptions;

    public MVTTileOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer r2, com.amap.api.maps.model.MVTTileOverlayOptions r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.glOverlayLayerRef = r0
            r1.mMVTTileOverlayOptions = r3
            if (r3 == 0) goto L15
            com.autonavi.base.ae.gmap.bean.TileProviderInner r3 = r3.getTileProviderInner()
            r3.init(r2, r4)
        L15:
            return
    }

    public final float getZIndex() {
            r1 = this;
            com.amap.api.maps.model.MVTTileOverlayOptions r0 = r1.mMVTTileOverlayOptions
            float r0 = r0.getZIndex()
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
            com.amap.api.maps.model.MVTTileOverlayOptions r0 = r1.mMVTTileOverlayOptions
            r0.setVisible(r2)
            r1.updateOption()
            return
    }

    public final void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.MVTTileOverlayOptions r0 = r1.mMVTTileOverlayOptions
            r0.setZIndex(r2)
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
            com.amap.api.maps.model.MVTTileOverlayOptions r2 = r3.mMVTTileOverlayOptions     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public final boolean visible() {
            r1 = this;
            com.amap.api.maps.model.MVTTileOverlayOptions r0 = r1.mMVTTileOverlayOptions
            boolean r0 = r0.visible()
            return r0
    }
}

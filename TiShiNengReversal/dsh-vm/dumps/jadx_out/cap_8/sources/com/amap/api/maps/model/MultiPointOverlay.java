package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MultiPointOverlay extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.MultiPointOverlayOptions options;

    public MultiPointOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.MultiPointOverlayOptions r2, java.lang.String r3) {
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
            com.amap.api.maps.model.MultiPointOverlayOptions r2 = r3.options
            r0.updateOption(r1, r2)
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

    public java.util.List<com.amap.api.maps.model.MultiPointItem> getItems() {
            r1 = this;
            com.amap.api.maps.model.MultiPointOverlayOptions r0 = r1.options
            if (r0 == 0) goto L9
            java.util.List r0 = r0.getMultiPointItems()
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

    public void setAnchor(float r2, float r3) {
            r1 = this;
            com.amap.api.maps.model.MultiPointOverlayOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.anchor(r2, r3)
            r1.a()
        La:
            return
    }

    public void setEnable(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.MultiPointOverlayOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.setEnable(r2)
            r1.a()
        La:
            return
    }

    public void setItems(java.util.List<com.amap.api.maps.model.MultiPointItem> r2) {
            r1 = this;
            com.amap.api.maps.model.MultiPointOverlayOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.setMultiPointItems(r2)
            r1.a()
        La:
            return
    }
}

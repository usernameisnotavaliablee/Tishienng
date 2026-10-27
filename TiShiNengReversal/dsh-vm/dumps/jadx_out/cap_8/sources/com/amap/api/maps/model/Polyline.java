package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Polyline extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.PolylineOptions options;

    public Polyline(com.amap.api.maps.interfaces.IGlOverlayLayer r2, com.amap.api.maps.model.PolylineOptions r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.glOverlayLayerRef = r0
            r1.options = r3
            return
    }

    public Polyline(com.amap.api.maps.interfaces.IGlOverlayLayer r1, com.amap.api.maps.model.PolylineOptions r2, java.lang.String r3) {
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
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r3.glOverlayLayerRef     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1b
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            if (r0 == 0) goto L1d
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L1b
            com.amap.api.maps.model.PolylineOptions r2 = r3.options     // Catch: java.lang.Throwable -> L1b
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L1f
        L1d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.amap.api.maps.model.Polyline
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = super.equals(r3)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1a
            com.amap.api.maps.model.Polyline r3 = (com.amap.api.maps.model.Polyline) r3     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = r2.getId()     // Catch: java.lang.Throwable -> L1c
            if (r3 != r0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r3 = 1
            return r3
        L1c:
            return r1
    }

    public int getColor() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            int r0 = r1.getColor()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public int getEraseColor() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            int r0 = r1.getEraseColor()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getEraseTexture() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.getEraseTexture()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public boolean getEraseVisible() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            boolean r0 = r1.getEraseVisible()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public float getFootPrintGap() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getFootPrintGap()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getFootPrintTexture() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.getFootPrintTexture()     // Catch: java.lang.Throwable -> L9
        L9:
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

    public com.amap.api.maps.model.LatLng getNearestLatLng(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef
            java.lang.Object r0 = r0.get()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0
            if (r0 == 0) goto L11
            com.amap.api.maps.model.PolylineOptions r1 = r2.options
            com.amap.api.maps.model.LatLng r3 = r0.getNearestLatLng(r1, r3)
            return r3
        L11:
            r3 = 0
            return r3
    }

    public com.amap.api.maps.model.PolylineOptions getOptions() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options
            return r0
    }

    public java.util.List<com.amap.api.maps.model.LatLng> getPoints() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            java.util.List r0 = r1.getPoints()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public float getPolylineShownRangeBegin() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getPolylineShownRangeBegin()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public float getPolylineShownRangeEnd() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getPolylineShownRangeEnd()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public float getShownRatio() {
            r2 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto La
            float r0 = r1.getShownRatio()     // Catch: java.lang.Throwable -> La
        La:
            return r0
    }

    public float getWidth() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            float r0 = r1.getWidth()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public float getZIndex() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
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

    public boolean isDottedLine() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options
            if (r0 == 0) goto L9
            boolean r0 = r0.isDottedLine()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isGeodesic() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options
            if (r0 == 0) goto Lc
            boolean r0 = r0.isGeodesic()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isShowPolylineRangeEnable() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            boolean r0 = r1.isShowPolylineRangeEnable()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public boolean isVisible() {
            r2 = this;
            r0 = 0
            com.amap.api.maps.model.PolylineOptions r1 = r2.options     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L9
            boolean r0 = r1.isVisible()     // Catch: java.lang.Throwable -> L9
        L9:
            return r0
    }

    public void remove() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L12
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L12
            r0.removeOverlay(r1)     // Catch: java.lang.Throwable -> L12
        Lf:
            r0 = 0
            r2.overlayName = r0     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public void setAboveMaskLayer(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.aboveMaskLayer(r2)
            r1.a()
        La:
            return
    }

    public void setColor(int r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.color(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    @java.lang.Deprecated
    public void setCustemTextureIndex(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.setCustomTextureIndex(r1)
            return
    }

    public void setCustomTexture(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.setCustomTexture(r2)
            r1.a()
        La:
            return
    }

    public void setCustomTextureIndex(java.util.List<java.lang.Integer> r2) {
            r1 = this;
            monitor-enter(r1)
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            r0.setCustomTextureIndex(r2)     // Catch: java.lang.Throwable -> Lc
            r1.a()     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r2 = move-exception
            goto L10
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public void setCustomTextureList(java.util.List<com.amap.api.maps.model.BitmapDescriptor> r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> L8
            r0.setCustomTextureList(r2)     // Catch: java.lang.Throwable -> L8
            r1.a()     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public void setDottedLine(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.setDottedLine(r2)
            r1.a()
        La:
            return
    }

    public void setEraseColor(boolean r2, int r3) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setEraseColor(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setEraseTexture(boolean r2, com.amap.api.maps.model.BitmapDescriptor r3) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setEraseTexture(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setFootPrintGap(float r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setFootPrintGap(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setFootPrintTexture(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setFootPrintTexture(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setGeodesic(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.geodesic(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setOptions(com.amap.api.maps.model.PolylineOptions r1) {
            r0 = this;
            r0.options = r1
            r0.a()
            return
    }

    public void setPoints(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L12
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            r0.setPoints(r2)     // Catch: java.lang.Throwable -> Lc
            r1.a()     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r2 = move-exception
            goto L10
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public void setPolylineShowRange(float r2, float r3) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setPolylineShowRange(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setShownRange(float r2, float r3) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setShownRange(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setShownRatio(float r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setShownRatio(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setTransparency(float r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.transparency(r2)
            r1.a()
        La:
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.visible(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setWidth(float r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.width(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.zIndex(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void showPolylineRangeEnabled(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.showPolylineRangeEnabled(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }
}

package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Marker extends com.amap.api.maps.model.BasePointOverlay {
    private com.autonavi.amap.mapcore.IPoint geoPoint;
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private boolean isClickable;
    private boolean isInfoWindowEnable;
    private boolean isRemoved;
    private boolean isUseAnimation;
    private com.amap.api.maps.model.animation.Animation mCurAnimation;
    private com.amap.api.maps.model.animation.Animation.AnimationListener mCurAnimationListener;
    private com.amap.api.maps.model.Marker.a mCurInnerAnimationListener;
    private java.lang.Object object;
    private com.amap.api.maps.model.MarkerOptions options;
    private com.amap.api.maps.model.LatLng viewModeLatLng;
    private com.autonavi.amap.mapcore.DPoint viewModeLatLngDp;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements com.amap.api.maps.model.animation.Animation.AnimationListener {
        final /* synthetic */ com.amap.api.maps.model.Marker a;

        /* renamed from: b, reason: collision with root package name */
        private final com.amap.api.col.p0003l.c8 f5000b;

        /* renamed from: c, reason: collision with root package name */
        private final com.amap.api.col.p0003l.c8 f5001c;



        private a(com.amap.api.maps.model.Marker r2, com.amap.api.maps.model.animation.Animation.AnimationListener r3) {
                r1 = this;
                r1.a = r2
                r1.<init>()
                com.amap.api.maps.model.Marker$a$1 r0 = new com.amap.api.maps.model.Marker$a$1
                r0.<init>(r1, r2, r3)
                r1.f5000b = r0
                com.amap.api.maps.model.Marker$a$2 r0 = new com.amap.api.maps.model.Marker$a$2
                r0.<init>(r1, r2, r3)
                r1.f5001c = r0
                return
        }

        /* synthetic */ a(com.amap.api.maps.model.Marker r1, com.amap.api.maps.model.animation.Animation.AnimationListener r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationEnd() {
                r2 = this;
                com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
                com.amap.api.col.3l.c8 r1 = r2.f5001c
                r0.b(r1)
                return
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationStart() {
                r2 = this;
                com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
                com.amap.api.col.3l.c8 r1 = r2.f5000b
                r0.b(r1)
                return
        }
    }

    public Marker(com.amap.api.maps.interfaces.IGlOverlayLayer r2, com.amap.api.maps.model.MarkerOptions r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r4)
            r4 = 0
            r1.isRemoved = r4
            com.autonavi.amap.mapcore.DPoint r0 = new com.autonavi.amap.mapcore.DPoint
            r0.<init>()
            r1.viewModeLatLngDp = r0
            r0 = 0
            r1.viewModeLatLng = r0
            r1.isUseAnimation = r4
            r1.mCurAnimation = r0
            r1.mCurAnimationListener = r0
            r1.mCurInnerAnimationListener = r0
            r4 = 1
            r1.isClickable = r4
            r1.isInfoWindowEnable = r4
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r1.glOverlayLayerRef = r4
            r1.options = r3
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
            com.amap.api.maps.model.MarkerOptions r2 = r3.options     // Catch: java.lang.Throwable -> L19
            r0.updateOption(r1, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void destroy() {
            r0 = this;
            r0.remove()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L25
            boolean r1 = r4 instanceof com.amap.api.maps.model.Marker
            if (r1 != 0) goto L8
            goto L25
        L8:
            com.amap.api.maps.model.MarkerOptions r1 = r3.options     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L25
            r2 = r4
            com.amap.api.maps.model.Marker r2 = (com.amap.api.maps.model.Marker) r2     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.MarkerOptions r2 = r2.options     // Catch: java.lang.Throwable -> L25
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L25
            java.lang.String r1 = r3.overlayName     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.Marker r4 = (com.amap.api.maps.model.Marker) r4     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = r4.overlayName     // Catch: java.lang.Throwable -> L25
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r0
    }

    public final float getAlpha() {
            r2 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r2.options
            if (r0 == 0) goto L1f
            boolean r0 = r2.isUseAnimation
            if (r0 == 0) goto L18
            java.lang.String r0 = "getAlpha"
            r1 = 0
            java.lang.Object r0 = r2.a(r0, r1)
            if (r0 == 0) goto L18
            java.lang.Double r0 = (java.lang.Double) r0
            float r0 = r0.floatValue()
            return r0
        L18:
            com.amap.api.maps.model.MarkerOptions r0 = r2.options
            float r0 = r0.getAlpha()
            return r0
        L1f:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public final float getAltitude() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Exception -> L9
            if (r0 == 0) goto L9
            float r0 = r0.getAltitude()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final float getAnchorU() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L9
            float r0 = r0.getAnchorU()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final float getAnchorV() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L9
            float r0 = r0.getAnchorV()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int getDisplayLevel() {
            r1 = this;
            r0 = 5
            return r0
    }

    public final com.autonavi.amap.mapcore.IPoint getGeoPoint() {
            r7 = this;
            com.autonavi.amap.mapcore.IPoint r0 = r7.geoPoint
            if (r0 != 0) goto Lb
            com.autonavi.amap.mapcore.IPoint r0 = new com.autonavi.amap.mapcore.IPoint
            r0.<init>()
            r7.geoPoint = r0
        Lb:
            com.amap.api.maps.model.LatLng r0 = r7.getPosition()
            if (r0 == 0) goto L1c
            double r1 = r0.latitude
            double r3 = r0.longitude
            r5 = 20
            com.autonavi.amap.mapcore.IPoint r6 = r7.geoPoint
            com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r1, r3, r5, r6)
        L1c:
            com.autonavi.amap.mapcore.IPoint r0 = r7.geoPoint
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.model.BitmapDescriptor> getIcons() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L7
            java.util.ArrayList r0 = r0.getIcons()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.overlayName     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.Object getObject() {
            r1 = this;
            java.lang.Object r0 = r1.object
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions getOptions() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public final int getPeriod() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getPeriod()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final com.amap.api.maps.model.LatLng getPosition() {
            r8 = this;
            r0 = 0
            com.amap.api.maps.model.MarkerOptions r1 = r8.options     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L60
            boolean r1 = r8.isViewMode()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L4b
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r1 = r8.glOverlayLayerRef     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L60
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r1     // Catch: java.lang.Throwable -> L60
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.getMap()     // Catch: java.lang.Throwable -> L60
            com.amap.api.maps.model.MarkerOptions r2 = r8.options     // Catch: java.lang.Throwable -> L60
            int r2 = r2.getScreenX()     // Catch: java.lang.Throwable -> L60
            com.amap.api.maps.model.MarkerOptions r3 = r8.options     // Catch: java.lang.Throwable -> L60
            int r3 = r3.getScreenY()     // Catch: java.lang.Throwable -> L60
            com.autonavi.amap.mapcore.DPoint r4 = r8.viewModeLatLngDp     // Catch: java.lang.Throwable -> L60
            r1.getPixel2LatLng(r2, r3, r4)     // Catch: java.lang.Throwable -> L60
            com.amap.api.maps.model.LatLng r1 = r8.viewModeLatLng     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L3f
            double r2 = r1.latitude     // Catch: java.lang.Throwable -> L60
            com.autonavi.amap.mapcore.DPoint r4 = r8.viewModeLatLngDp     // Catch: java.lang.Throwable -> L60
            double r5 = r4.y     // Catch: java.lang.Throwable -> L60
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L3f
            double r2 = r1.longitude     // Catch: java.lang.Throwable -> L60
            double r4 = r4.x     // Catch: java.lang.Throwable -> L60
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r1
        L3f:
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L60
            com.autonavi.amap.mapcore.DPoint r2 = r8.viewModeLatLngDp     // Catch: java.lang.Throwable -> L60
            double r3 = r2.y     // Catch: java.lang.Throwable -> L60
            double r5 = r2.x     // Catch: java.lang.Throwable -> L60
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L60
            return r1
        L4b:
            boolean r1 = r8.isUseAnimation     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L5a
            java.lang.String r1 = "getPosition"
            java.lang.Object r1 = r8.a(r1, r0)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L5a
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1     // Catch: java.lang.Throwable -> L60
            return r1
        L5a:
            com.amap.api.maps.model.MarkerOptions r1 = r8.options     // Catch: java.lang.Throwable -> L60
            com.amap.api.maps.model.LatLng r0 = r1.getPosition()     // Catch: java.lang.Throwable -> L60
        L60:
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final float getRotateAngle() {
            r3 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r3.options
            if (r0 == 0) goto L28
            boolean r0 = r3.isUseAnimation
            if (r0 == 0) goto L21
            java.lang.String r0 = "getRotateAngle"
            r1 = 0
            java.lang.Object r0 = r3.a(r0, r1)
            java.lang.String r1 = "getRotateAngle "
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1.concat(r2)
            if (r0 == 0) goto L21
            java.lang.Double r0 = (java.lang.Double) r0
            float r0 = r0.floatValue()
            return r0
        L21:
            com.amap.api.maps.model.MarkerOptions r0 = r3.options
            float r0 = r0.getRotateAngle()
            return r0
        L28:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.String getSnippet() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getSnippet()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.String getTitle() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getTitle()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L9
            float r0 = r0.getZIndex()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r2 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r2.options
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
            com.amap.api.maps.model.MarkerOptions r1 = r2.options
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
        L1a:
            int r0 = super.hashCode()
            return r0
    }

    public final void hideInfoWindow() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L17
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L17
            if (r0 == 0) goto L17
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L17
            r0.hideInfoWindow(r1)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public final boolean isClickable() {
            r2 = this;
            java.lang.String r0 = "isClickable"
            r1 = 0
            java.lang.Object r0 = r2.a(r0, r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L12
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L12:
            boolean r0 = r2.isClickable
            return r0
    }

    public final boolean isDraggable() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L9
            boolean r0 = r0.isDraggable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isFlat() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L9
            boolean r0 = r0.isFlat()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isInfoWindowAutoOverturn() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean isInfoWindowEnable() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L9
            boolean r0 = r0.isInfoWindowEnable()
            return r0
        L9:
            boolean r0 = r1.isInfoWindowEnable
            return r0
    }

    public final boolean isInfoWindowShown() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef
            java.lang.Object r0 = r0.get()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0
            java.lang.String r1 = r2.overlayName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L24
            if (r0 == 0) goto L24
            java.lang.String r0 = "isInfoWindowShown"
            r1 = 0
            java.lang.Object r0 = r2.a(r0, r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L24
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L24:
            r0 = 0
            return r0
    }

    public final boolean isPerspective() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isRemoved() {
            r1 = this;
            boolean r0 = r1.isRemoved
            return r0
    }

    public final boolean isViewMode() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto L9
            boolean r0 = r0.isViewMode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean isVisible() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            boolean r0 = r0.isVisible()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void remove() {
            r2 = this;
            boolean r0 = r2.isInfoWindowShown()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L9
            r2.hideInfoWindow()     // Catch: java.lang.Throwable -> L1b
        L9:
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1b
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L18
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L1b
            r0.removeOverlay(r1)     // Catch: java.lang.Throwable -> L1b
        L18:
            r0 = 1
            r2.isRemoved = r0     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public final void setAlpha(float r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.alpha(r2)
            r1.a()
        La:
            return
    }

    public final void setAltitude(float r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto La
            r0.altitude(r2)     // Catch: java.lang.Exception -> La
            r1.a()     // Catch: java.lang.Exception -> La
        La:
            return
    }

    public final void setAnchor(float r2, float r3) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.anchor(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setAnimation(com.amap.api.maps.model.animation.Animation r4) {
            r3 = this;
            if (r4 == 0) goto L9
            com.amap.api.maps.model.animation.Animation$AnimationListener r0 = r3.mCurAnimationListener     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L9
            r4.setAnimationListener(r0)     // Catch: java.lang.Throwable -> L22
        L9:
            r3.mCurAnimation = r4     // Catch: java.lang.Throwable -> L22
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            r3.isUseAnimation = r2     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "setAnimation"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            r1[r0] = r4     // Catch: java.lang.Throwable -> L22
            r3.a(r2, r1)     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L22
            r4.resetUpdateFlags()     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public final void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener r3) {
            r2 = this;
            r2.mCurAnimationListener = r3
            com.amap.api.maps.model.Marker$a r0 = new com.amap.api.maps.model.Marker$a
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2.mCurInnerAnimationListener = r0
            com.amap.api.maps.model.animation.Animation r3 = r2.mCurAnimation
            if (r3 == 0) goto L18
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r0
            java.lang.String r0 = "setAnimationListener"
            r2.a(r0, r3)
        L18:
            return
    }

    public final void setAutoOverturnInfoWindow(boolean r1) {
            r0 = this;
            return
    }

    public final void setBelowMaskLayer(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.belowMaskLayer(r2)
            r1.a()
        La:
            return
    }

    public final void setClickable(boolean r3) {
            r2 = this;
            r2.isClickable = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "setClickable"
            r2.a(r3, r0)
            return
    }

    public final void setDisplayLevel(int r1) {
            r0 = this;
            return
    }

    public final void setDraggable(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.draggable(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setFixingPointEnable(boolean r1) {
            r0 = this;
            return
    }

    public final void setFlat(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.setFlat(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setGeoPoint(com.autonavi.amap.mapcore.IPoint r7) {
            r6 = this;
            r6.geoPoint = r7
            if (r7 == 0) goto L25
            int r0 = r7.x
            long r0 = (long) r0
            int r7 = r7.y
            long r2 = (long) r7
            r7 = 20
            com.autonavi.amap.mapcore.DPoint r7 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r0, r2, r7)
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            double r1 = r7.y
            double r3 = r7.x
            r5 = 0
            r0.<init>(r1, r3, r5)
            r7.recycle()
            com.amap.api.maps.model.MarkerOptions r7 = r6.options
            r7.position(r0)
            r6.a()
        L25:
            return
    }

    public final void setIcon(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            r0.icon(r2)     // Catch: java.lang.Throwable -> Lc
            r1.a()     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public final void setIcons(java.util.ArrayList<com.amap.api.maps.model.BitmapDescriptor> r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L8
            r0.icons(r2)     // Catch: java.lang.Throwable -> L8
            r1.a()     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public final void setInfoWindowEnable(boolean r2) {
            r1 = this;
            r1.isInfoWindowEnable = r2
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto Lc
            r0.infoWindowEnable(r2)
            r1.a()
        Lc:
            return
    }

    public final void setMarkerOptions(com.amap.api.maps.model.MarkerOptions r1) {
            r0 = this;
            r0.options = r1
            r0.a()
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setObject(java.lang.Object r1) {
            r0 = this;
            r0.object = r1
            return
    }

    public final void setPeriod(int r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> L8
            r0.period(r2)     // Catch: java.lang.Throwable -> L8
            r1.a()     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public final void setPerspective(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setPosition(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.position(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setPositionByPixels(int r2, int r3) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.setScreenPosition(r2, r3)
            r1.a()
        La:
            return
    }

    public final void setPositionNotUpdate(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.setPosition(r1)
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setRotateAngle(float r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.rotateAngle(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setRotateAngleNotUpdate(float r1) {
            r0 = this;
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setSnippet(java.lang.String r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.snippet(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setTitle(java.lang.String r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.title(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setToTop() {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L17
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L17
            if (r0 == 0) goto L17
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L17
            r0.set2Top(r1)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.visible(r2)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.options
            if (r0 == 0) goto La
            r0.zIndex(r2)
            r1.a()
        La:
            return
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void showInfoWindow() {
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
    public final boolean startAnimation() {
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

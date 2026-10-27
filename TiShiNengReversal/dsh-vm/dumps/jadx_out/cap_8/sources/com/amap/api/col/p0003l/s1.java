package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s1 implements com.autonavi.amap.mapcore.interfaces.IInfoWindowManager, com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction {
    private final android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private final com.amap.api.maps.interfaces.IGlOverlayLayer f3941b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f3942c;

    /* renamed from: d, reason: collision with root package name */
    com.amap.api.col.p0003l.a0 f3943d;

    public s1(com.amap.api.maps.interfaces.IGlOverlayLayer r2, android.content.Context r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "PopupOverlay"
            r1.f3942c = r0
            r1.a = r3
            r1.f3941b = r2
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final synchronized void hideInfoWindow() {
            r4 = this;
            monitor-enter(r4)
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r4.f3941b     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            java.lang.String r1 = "PopupOverlay"
            java.lang.String r2 = "hideInfoWindow"
            r3 = 0
            r0.getNativeProperties(r1, r2, r3)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r0 = move-exception
            goto L12
        L10:
            monitor-exit(r4)
            return
        L12:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean isInfoWindowShown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(android.view.MotionEvent r6) {
            r5 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r5.f3941b
            r1 = 0
            if (r0 == 0) goto L34
            if (r6 == 0) goto L34
            float r2 = r6.getX()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            float r6 = r6.getY()
            double r3 = (double) r6
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r2
            r2 = 1
            r3[r2] = r6
            java.lang.String r6 = "PopupOverlay"
            java.lang.String r2 = "onInfoWindowTap"
            java.lang.Object r6 = r0.getNativeProperties(r6, r2, r3)
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L34
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L34:
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
            r4 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r4.f3941b
            if (r0 == 0) goto Lc
            java.lang.String r1 = "redrawInfoWindow"
            r2 = 0
            java.lang.String r3 = "PopupOverlay"
            r0.getNativeProperties(r3, r1, r2)
        Lc:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(com.amap.api.col.p0003l.a0 r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f3943d = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowAnimation(com.amap.api.maps.model.animation.Animation r1, com.amap.api.maps.model.animation.Animation.AnimationListener r2) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowAppearAnimation(com.amap.api.maps.model.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackColor(int r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackEnable(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackScale(float r1, float r2) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowDisappearAnimation(com.amap.api.maps.model.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowMovingAnimation(com.amap.api.maps.model.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final synchronized void showInfoWindow(com.amap.api.maps.model.BasePointOverlay r6) throws android.os.RemoteException {
            r5 = this;
            monitor-enter(r5)
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r5.f3941b     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            if (r6 == 0) goto L1d
            java.lang.String r1 = r6.getId()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "showInfoWindow"
            java.lang.String r6 = r6.getId()     // Catch: java.lang.Throwable -> L1b
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L1b
            r0.getNativeProperties(r1, r2, r3)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r6 = move-exception
            goto L1f
        L1d:
            monitor-exit(r5)
            return
        L1f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1b
            throw r6
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final synchronized void showInfoWindow(com.autonavi.base.amap.api.mapcore.BaseOverlayImp r1) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void startAnimation() {
            r0 = this;
            return
    }
}

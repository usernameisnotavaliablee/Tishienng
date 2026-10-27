package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class UiSettings {
    private final com.autonavi.amap.mapcore.interfaces.IUiSettings uiSettingsDelegate;

    public UiSettings(com.autonavi.amap.mapcore.interfaces.IUiSettings r1) {
            r0 = this;
            r0.<init>()
            r0.uiSettingsDelegate = r1
            return
    }

    public final float getLogoMarginRate(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            float r2 = r0.getLogoMarginRate(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final int getLogoPosition() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getLogoPosition()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getZoomPosition() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getZoomPosition()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 2
            return r0
    }

    public final boolean isCompassEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isCompassEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isGestureScaleByMapCenter() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isGestureScaleByMapCenter()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isIndoorSwitchEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isIndoorSwitchEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    protected final boolean isLogoEnable() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isLogoEnable()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final boolean isMyLocationButtonEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isMyLocationButtonEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isRotateGesturesEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isRotateGesturesEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final boolean isScaleControlsEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isScaleControlsEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isScrollGesturesEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isScrollGesturesEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final boolean isTiltGesturesEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isTiltGesturesEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final boolean isZoomControlsEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isZoomControlsEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final boolean isZoomGesturesEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isZoomGesturesEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final void setAllGesturesEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setAllGesturesEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setCompassEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setCompassEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setGestureScaleByMapCenter(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setGestureScaleByMapCenter(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setIndoorSwitchEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setIndoorSwitchEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setLogoBottomMargin(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setLogoBottomMargin(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setLogoCenter(int r1, int r2) {
            r0 = this;
            return
    }

    protected final void setLogoEnable(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setLogoEnable(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setLogoLeftMargin(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setLogoLeftMargin(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setLogoMarginRate(int r2, float r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setLogoMarginRate(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setLogoPosition(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setLogoPosition(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMyLocationButtonEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMyLocationButtonEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setRotateGesturesEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setRotateGesturesEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setScaleControlsEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setScaleControlsEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setScrollGesturesEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setScrollGesturesEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setTiltGesturesEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setTiltGesturesEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setZoomControlsEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setZoomControlsEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setZoomGesturesEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setZoomGesturesEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setZoomInByScreenCenter(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setZoomInByScreenCenter(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setZoomPosition(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IUiSettings r0 = r1.uiSettingsDelegate     // Catch: java.lang.Throwable -> L5
            r0.setZoomPosition(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }
}

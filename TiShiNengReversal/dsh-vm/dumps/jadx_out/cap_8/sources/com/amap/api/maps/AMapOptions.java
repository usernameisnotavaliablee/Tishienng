package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapOptions implements android.os.Parcelable {
    public static final com.amap.api.maps.AMapOptionsCreator CREATOR = null;
    public static final int LOGO_MARGIN_BOTTOM = 2;
    public static final int LOGO_MARGIN_LEFT = 0;
    public static final int LOGO_MARGIN_RIGHT = 1;
    public static final int LOGO_POSITION_BOTTOM_CENTER = 1;
    public static final int LOGO_POSITION_BOTTOM_LEFT = 0;
    public static final int LOGO_POSITION_BOTTOM_RIGHT = 2;
    public static final int ZOOM_POSITION_RIGHT_BUTTOM = 2;
    public static final int ZOOM_POSITION_RIGHT_CENTER = 1;
    private com.amap.api.maps.model.CameraPosition cameraPosition;
    private boolean isCompassEnabled;
    private boolean isRotateGesturesEnabled;
    private boolean isScaleControlsEnabled;
    private boolean isScrollGesturesEnabled;
    private boolean isTiltGesturesEnabled;
    private boolean isZOrderOnTop;
    private boolean isZoomEnabled;
    private boolean isZoomGesturesEnabled;
    private int logoPosition;
    private int mapType;

    static {
            com.amap.api.maps.AMapOptionsCreator r0 = new com.amap.api.maps.AMapOptionsCreator
            r0.<init>()
            com.amap.api.maps.AMapOptions.CREATOR = r0
            return
    }

    public AMapOptions() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mapType = r0
            r1.isRotateGesturesEnabled = r0
            r1.isScrollGesturesEnabled = r0
            r1.isTiltGesturesEnabled = r0
            r1.isZoomGesturesEnabled = r0
            r1.isZoomEnabled = r0
            r0 = 0
            r1.isZOrderOnTop = r0
            r1.isCompassEnabled = r0
            r1.isScaleControlsEnabled = r0
            r1.logoPosition = r0
            return
    }

    public com.amap.api.maps.AMapOptions camera(com.amap.api.maps.model.CameraPosition r1) {
            r0 = this;
            r0.cameraPosition = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions compassEnabled(boolean r1) {
            r0 = this;
            r0.isCompassEnabled = r1
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.maps.model.CameraPosition getCamera() {
            r1 = this;
            com.amap.api.maps.model.CameraPosition r0 = r1.cameraPosition
            return r0
    }

    public boolean getCompassEnabled() {
            r1 = this;
            boolean r0 = r1.isCompassEnabled
            return r0
    }

    public int getLogoPosition() {
            r1 = this;
            int r0 = r1.logoPosition
            return r0
    }

    public int getMapType() {
            r1 = this;
            int r0 = r1.mapType
            return r0
    }

    public boolean getRotateGesturesEnabled() {
            r1 = this;
            boolean r0 = r1.isRotateGesturesEnabled
            return r0
    }

    public boolean getScaleControlsEnabled() {
            r1 = this;
            boolean r0 = r1.isScaleControlsEnabled
            return r0
    }

    public boolean getScrollGesturesEnabled() {
            r1 = this;
            boolean r0 = r1.isScrollGesturesEnabled
            return r0
    }

    public boolean getTiltGesturesEnabled() {
            r1 = this;
            boolean r0 = r1.isTiltGesturesEnabled
            return r0
    }

    public boolean getZOrderOnTop() {
            r1 = this;
            boolean r0 = r1.isZOrderOnTop
            return r0
    }

    public boolean getZoomControlsEnabled() {
            r1 = this;
            boolean r0 = r1.isZoomEnabled
            return r0
    }

    public boolean getZoomGesturesEnabled() {
            r1 = this;
            boolean r0 = r1.isZoomGesturesEnabled
            return r0
    }

    public com.amap.api.maps.AMapOptions logoPosition(int r1) {
            r0 = this;
            r0.logoPosition = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions mapType(int r1) {
            r0 = this;
            r0.mapType = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions rotateGesturesEnabled(boolean r1) {
            r0 = this;
            r0.isRotateGesturesEnabled = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions scaleControlsEnabled(boolean r1) {
            r0 = this;
            r0.isScaleControlsEnabled = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions scrollGesturesEnabled(boolean r1) {
            r0 = this;
            r0.isScrollGesturesEnabled = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions tiltGesturesEnabled(boolean r1) {
            r0 = this;
            r0.isTiltGesturesEnabled = r1
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r10, int r11) {
            r9 = this;
            com.amap.api.maps.model.CameraPosition r0 = r9.cameraPosition
            r10.writeParcelable(r0, r11)
            int r11 = r9.mapType
            r10.writeInt(r11)
            int r11 = r9.logoPosition
            r10.writeInt(r11)
            boolean r11 = r9.isRotateGesturesEnabled
            boolean r0 = r9.isScrollGesturesEnabled
            boolean r1 = r9.isTiltGesturesEnabled
            boolean r2 = r9.isZoomGesturesEnabled
            boolean r3 = r9.isZoomEnabled
            boolean r4 = r9.isZOrderOnTop
            boolean r5 = r9.isCompassEnabled
            boolean r6 = r9.isScaleControlsEnabled
            r7 = 8
            boolean[] r7 = new boolean[r7]
            r8 = 0
            r7[r8] = r11
            r11 = 1
            r7[r11] = r0
            r11 = 2
            r7[r11] = r1
            r11 = 3
            r7[r11] = r2
            r11 = 4
            r7[r11] = r3
            r11 = 5
            r7[r11] = r4
            r11 = 6
            r7[r11] = r5
            r11 = 7
            r7[r11] = r6
            r10.writeBooleanArray(r7)
            return
    }

    public com.amap.api.maps.AMapOptions zOrderOnTop(boolean r1) {
            r0 = this;
            r0.isZOrderOnTop = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions zoomControlsEnabled(boolean r1) {
            r0 = this;
            r0.isZoomEnabled = r1
            return r0
    }

    public com.amap.api.maps.AMapOptions zoomGesturesEnabled(boolean r1) {
            r0 = this;
            r0.isZoomGesturesEnabled = r1
            return r0
    }
}

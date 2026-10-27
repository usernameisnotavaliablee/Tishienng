package com.autonavi.base.amap.api.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface InfoWindowCalculate {
    boolean checkInBounds();

    com.autonavi.amap.mapcore.IPoint getAnchor();

    com.amap.api.maps.model.BitmapDescriptor getBitmapDescriptor();

    com.autonavi.base.amap.mapcore.FPoint getGeoPosition();

    int getHeight();

    int getInfoWindowOffsetX();

    int getInfoWindowOffsetY();

    int getRealInfoWindowOffsetX();

    int getRealInfoWindowOffsetY();

    com.amap.api.maps.model.LatLng getRealPosition();

    android.graphics.Rect getRect();

    com.autonavi.amap.mapcore.IPoint getScreenPosition();

    int getWidth();

    boolean isContains();

    boolean isDestory();

    boolean isInfoWindowEnable();

    boolean isViewMode();

    void setInfoWindowOffset(int r1, int r2) throws android.os.RemoteException;

    void setInfoWindowShown(boolean r1);
}

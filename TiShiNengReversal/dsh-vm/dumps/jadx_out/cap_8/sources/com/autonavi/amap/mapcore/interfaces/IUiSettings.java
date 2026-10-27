package com.autonavi.amap.mapcore.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IUiSettings {
    float getLogoMarginRate(int r1) throws android.os.RemoteException;

    int getLogoPosition() throws android.os.RemoteException;

    int getZoomPosition() throws android.os.RemoteException;

    boolean isCompassEnabled() throws android.os.RemoteException;

    boolean isGestureScaleByMapCenter() throws android.os.RemoteException;

    boolean isIndoorSwitchEnabled() throws android.os.RemoteException;

    boolean isLogoEnable();

    boolean isMyLocationButtonEnabled() throws android.os.RemoteException;

    boolean isRotateGesturesEnabled() throws android.os.RemoteException;

    boolean isScaleControlsEnabled() throws android.os.RemoteException;

    boolean isScrollGesturesEnabled() throws android.os.RemoteException;

    boolean isTiltGesturesEnabled() throws android.os.RemoteException;

    boolean isZoomControlsEnabled() throws android.os.RemoteException;

    boolean isZoomGesturesEnabled() throws android.os.RemoteException;

    boolean isZoomInByScreenCenter() throws android.os.RemoteException;

    void requestRefreshLogo();

    void setAllGesturesEnabled(boolean r1) throws android.os.RemoteException;

    void setCompassEnabled(boolean r1) throws android.os.RemoteException;

    void setGestureScaleByMapCenter(boolean r1) throws android.os.RemoteException;

    void setIndoorSwitchEnabled(boolean r1) throws android.os.RemoteException;

    void setLogoBottomMargin(int r1) throws android.os.RemoteException;

    void setLogoEnable(boolean r1);

    void setLogoLeftMargin(int r1) throws android.os.RemoteException;

    void setLogoMarginRate(int r1, float r2) throws android.os.RemoteException;

    void setLogoPosition(int r1) throws android.os.RemoteException;

    void setMyLocationButtonEnabled(boolean r1) throws android.os.RemoteException;

    void setRotateGesturesEnabled(boolean r1) throws android.os.RemoteException;

    void setScaleControlsEnabled(boolean r1) throws android.os.RemoteException;

    void setScrollGesturesEnabled(boolean r1) throws android.os.RemoteException;

    void setTiltGesturesEnabled(boolean r1) throws android.os.RemoteException;

    void setZoomControlsEnabled(boolean r1) throws android.os.RemoteException;

    void setZoomGesturesEnabled(boolean r1) throws android.os.RemoteException;

    void setZoomInByScreenCenter(boolean r1) throws android.os.RemoteException;

    void setZoomPosition(int r1) throws android.os.RemoteException;
}

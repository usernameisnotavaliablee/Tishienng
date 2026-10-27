package com.autonavi.base.amap.api.mapcore.infowindow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IInfoWindowAction {
    void hideInfoWindow();

    boolean isInfoWindowShown();

    boolean onInfoWindowTap(android.view.MotionEvent r1);

    void redrawInfoWindow();

    void setInfoWindowAdapterManager(com.amap.api.col.p0003l.a0 r1);

    void showInfoWindow(com.amap.api.maps.model.BasePointOverlay r1) throws android.os.RemoteException;

    void showInfoWindow(com.autonavi.base.amap.api.mapcore.BaseOverlayImp r1) throws android.os.RemoteException;
}

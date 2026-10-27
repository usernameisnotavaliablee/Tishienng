package com.autonavi.amap.mapcore.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IProjection {
    float calculateMapZoomer(com.amap.api.maps.model.LatLng r1, int r2);

    com.amap.api.maps.model.TileProjection fromBoundsToTile(com.amap.api.maps.model.LatLngBounds r1, int r2, int r3) throws android.os.RemoteException;

    com.amap.api.maps.model.LatLng fromScreenLocation(android.graphics.Point r1) throws android.os.RemoteException;

    com.amap.api.maps.model.AMapCameraInfo getCameraInfo();

    com.amap.api.maps.model.LatLngBounds getMapBounds(com.amap.api.maps.model.LatLng r1, float r2) throws android.os.RemoteException;

    com.amap.api.maps.model.VisibleRegion getVisibleRegion() throws android.os.RemoteException;

    float toMapLenWithWin(int r1) throws android.os.RemoteException;

    android.graphics.PointF toMapLocation(com.amap.api.maps.model.LatLng r1) throws android.os.RemoteException;

    android.graphics.Point toScreenLocation(com.amap.api.maps.model.LatLng r1) throws android.os.RemoteException;
}

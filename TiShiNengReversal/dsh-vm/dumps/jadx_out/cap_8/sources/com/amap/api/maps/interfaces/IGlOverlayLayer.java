package com.amap.api.maps.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IGlOverlayLayer {
    boolean IsCircleContainPoint(com.amap.api.maps.model.CircleOptions r1, com.amap.api.maps.model.LatLng r2);

    boolean IsPolygonContainsPoint(com.amap.api.maps.model.PolygonOptions r1, com.amap.api.maps.model.LatLng r2);

    com.amap.api.maps.model.BaseOverlay addOverlayObject(java.lang.String r1, com.amap.api.maps.model.BaseOverlay r2, com.amap.api.maps.model.BaseOptions r3);

    void changeOverlayIndex();

    boolean checkInBounds(java.lang.String r1);

    void clear(java.lang.String... r1);

    void clearOverlayByType(java.lang.String r1);

    void clearTileCache();

    java.lang.String createId(java.lang.String r1);

    void destroy();

    boolean draw(int r1, int r2, boolean r3);

    int getCurrentParticleNum(java.lang.String r1);

    com.amap.api.maps.model.BaseOverlay getHitBaseOverlay(android.view.MotionEvent r1, int r2);

    com.amap.api.maps.model.BaseOverlay getHitBaseOverlay(com.amap.api.maps.model.LatLng r1, int r2);

    com.amap.api.maps.model.Polyline getHitOverlay(com.amap.api.maps.model.LatLng r1, int r2);

    com.autonavi.base.amap.api.mapcore.IAMapDelegate getMap();

    java.util.List<com.amap.api.maps.model.Marker> getMapScreenMarkers();

    void getMarkerInfoWindowOffset(java.lang.String r1, com.autonavi.base.amap.mapcore.FPoint r2);

    com.amap.api.maps.model.MultiPointItem getMultiPointItem(com.amap.api.maps.model.LatLng r1);

    java.lang.Object getNativeProperties(java.lang.String r1, java.lang.String r2, java.lang.Object[] r3);

    com.amap.api.maps.model.LatLng getNearestLatLng(com.amap.api.maps.model.PolylineOptions r1, com.amap.api.maps.model.LatLng r2);

    void getOverlayScreenPos(java.lang.String r1, com.autonavi.base.amap.mapcore.FPoint r2);

    void hideInfoWindow(java.lang.String r1);

    boolean isGLTFAnimated();

    void onCreateAMapInstance();

    boolean removeOverlay(java.lang.String r1) throws android.os.RemoteException;

    boolean removeOverlay(java.lang.String r1, boolean r2) throws android.os.RemoteException;

    void set2Top(java.lang.String r1);

    void setFlingState(boolean r1);

    void setRunLowFrame(boolean r1);

    void showInfoWindow(java.lang.String r1);

    void updateOption(java.lang.String r1, com.amap.api.maps.model.BaseOptions r2);
}

package com.autonavi.base.amap.api.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IAMapDelegate extends com.autonavi.amap.mapcore.interfaces.IAMap {
    void addGestureMapMessage(int r1, com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage r2);

    void addOverlayTexture(int r1, com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty r2);

    void animateCamera(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1) throws android.os.RemoteException;

    void animateCameraWithDurationAndCallback(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1, long r2, com.amap.api.maps.AMap.CancelableCallback r4);

    boolean canShowIndoorSwitch();

    void changeGLOverlayIndex();

    void changeLogoIconStyle(java.lang.String r1, boolean r2, int r3);

    void changeMapLogo(int r1, boolean r2);

    void changeSize(int r1, int r2);

    void changeSurface(int r1, javax.microedition.khronos.opengles.GL10 r2, int r3, int r4);

    float checkZoomLevel(float r1) throws android.os.RemoteException;

    void clearTileCache();

    java.lang.String createId(java.lang.String r1);

    int createOverlayTexture(int r1, android.graphics.Bitmap r2);

    void createSurface(int r1, javax.microedition.khronos.opengles.GL10 r2, javax.microedition.khronos.egl.EGLConfig r3);

    void geo2Latlng(int r1, int r2, com.autonavi.amap.mapcore.DPoint r3);

    void geo2Map(int r1, int r2, com.autonavi.base.amap.mapcore.FPoint r3);

    com.autonavi.extra.b getAMapExtraInterfaceManager();

    float getCameraDegree(int r1);

    com.amap.api.maps.model.CameraPosition getCameraPositionPrj(boolean r1);

    android.content.Context getContext();

    com.amap.api.col.p0003l.v8 getCustomStyleManager();

    int getEngineIDWithGestureInfo(com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1);

    float[] getFinalMatrix();

    com.autonavi.base.ae.gmap.GLMapEngine getGLMapEngine();

    android.view.View getGLMapView();

    void getGeoCenter(int r1, com.autonavi.amap.mapcore.IPoint r2);

    com.amap.api.maps.interfaces.IGlOverlayLayer getGlOverlayLayer();

    com.amap.api.col.p0003l.a0 getInfoWindowDelegate();

    void getLatLng2Map(double r1, double r3, com.autonavi.base.amap.mapcore.FPoint r5);

    void getLatLng2Pixel(double r1, double r3, com.autonavi.amap.mapcore.IPoint r5);

    float getLogoMarginRate(int r1);

    int getLogoPosition();

    float getMapAngle(int r1);

    com.amap.api.maps.model.LatLngBounds getMapBounds(com.amap.api.maps.model.LatLng r1, float r2, float r3, float r4);

    com.autonavi.base.amap.mapcore.MapConfig getMapConfig();

    com.autonavi.base.ae.gmap.GLMapState getMapProjection();

    float getMapZoomScale();

    int getMaskLayerType();

    com.amap.api.maps.AMap.OnCameraChangeListener getOnCameraChangeListener() throws android.os.RemoteException;

    void getPixel2Geo(int r1, int r2, com.autonavi.amap.mapcore.IPoint r3);

    void getPixel2LatLng(int r1, int r2, com.autonavi.amap.mapcore.DPoint r3);

    float getPreciseLevel(int r1);

    com.autonavi.base.amap.api.mapcore.IProjectionDelegate getProjection() throws android.os.RemoteException;

    android.graphics.Rect getRect();

    com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate getUiSettings();

    float getUnitLengthByZoom(int r1);

    android.graphics.Point getWaterMarkerPositon();

    float getZoomLevel();

    void hideInfoWindow();

    boolean isLockMapAngle(int r1);

    boolean isLockMapCameraDegree(int r1);

    boolean isUseAnchor();

    void latlon2Geo(double r1, double r3, com.autonavi.amap.mapcore.IPoint r5);

    void map2Geo(float r1, float r2, com.autonavi.amap.mapcore.IPoint r3);

    void moveCamera(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1) throws android.os.RemoteException;

    void onAMapAppResourceRequest(com.autonavi.base.ae.gmap.AMapAppRequestParam r1);

    boolean onDoubleTap(int r1, android.view.MotionEvent r2);

    void onLongPress(int r1, android.view.MotionEvent r2);

    void onPause();

    void onResume();

    boolean onSingleTapConfirmed(int r1, android.view.MotionEvent r2);

    void pixel2Map(int r1, int r2, android.graphics.PointF r3);

    void post(java.lang.Runnable r1);

    void redrawInfoWindow();

    void refreshLogo();

    void reloadMapCustomStyle();

    void removeEngineGLOverlay(com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay r1);

    boolean removeGLModel(java.lang.String r1);

    boolean removeGLOverlay(java.lang.String r1) throws android.os.RemoteException;

    void resetRenderTimeLongLong();

    void setCustomMapStyle(boolean r1, byte[] r2);

    void setGestureStatus(int r1, int r2);

    void setHideLogoEnble(boolean r1);

    void setLogoBottomMargin(int r1);

    void setLogoLeftMargin(int r1);

    void setLogoMarginRate(int r1, float r2);

    void setLogoPosition(int r1);

    void setMapCustomEnable(boolean r1, boolean r2);

    void setMapEnable(boolean r1);

    void setMapWidgetListener(com.autonavi.base.ae.gmap.listener.AMapWidgetListener r1);

    void setTerrainAuth(boolean r1);

    void setZoomPosition(int r1);

    void showCompassEnabled(boolean r1);

    void showIndoorSwitchControlsEnabled(boolean r1);

    void showInfoWindow(com.amap.api.maps.model.BaseOverlay r1) throws android.os.RemoteException;

    void showInfoWindow(com.autonavi.base.amap.api.mapcore.BaseOverlayImp r1) throws android.os.RemoteException;

    void showLogoEnabled(boolean r1);

    void showMyLocationButtonEnabled(boolean r1);

    void showMyLocationOverlay(android.location.Location r1) throws android.os.RemoteException;

    void showScaleEnabled(boolean r1);

    void showZoomControlsEnabled(boolean r1);

    float toMapLenWithWin(int r1);

    void zoomOut(int r1);
}

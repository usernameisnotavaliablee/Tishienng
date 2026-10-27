package com.autonavi.amap.mapcore.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IAMap {
    void accelerateNetworkInChinese(boolean r1);

    com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay add3DModelTileOverlay(com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions r1) throws android.os.RemoteException;

    void addAMapAppResourceListener(com.amap.api.maps.AMap.AMapAppResourceRequestListener r1);

    com.amap.api.maps.model.Arc addArc(com.amap.api.maps.model.ArcOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.BuildingOverlay addBuildingOverlay();

    com.amap.api.maps.model.Circle addCircle(com.amap.api.maps.model.CircleOptions r1) throws android.os.RemoteException;

    com.amap.api.col.p0003l.m3 addContourLineOverlay(com.amap.api.col.p0003l.eo r1);

    com.amap.api.maps.model.CrossOverlay addCrossVector(com.amap.api.maps.model.CrossOverlayOptions r1);

    com.amap.api.maps.model.GL3DModel addGLModel(com.amap.api.maps.model.GL3DModelOptions r1);

    com.amap.api.maps.model.GLTFOverlay addGLTFOverlay(com.amap.api.maps.model.GLTFOverlayOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.GroundOverlay addGroundOverlay(com.amap.api.maps.model.GroundOverlayOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.HeatMapGridLayer addHeatMapGridLayer(com.amap.api.maps.model.HeatMapGridLayerOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.HeatMapLayer addHeatMapLayer(com.amap.api.maps.model.HeatMapLayerOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.MVTTileOverlay addMVTTileOverlay(com.amap.api.maps.model.MVTTileOverlayOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.Marker addMarker(com.amap.api.maps.model.MarkerOptions r1) throws android.os.RemoteException;

    java.util.ArrayList<com.amap.api.maps.model.Marker> addMarkers(java.util.ArrayList<com.amap.api.maps.model.MarkerOptions> r1, boolean r2) throws android.os.RemoteException;

    com.amap.api.maps.model.MultiPointOverlay addMultiPointOverlay(com.amap.api.maps.model.MultiPointOverlayOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.RouteOverlay addNaviRouteOverlay();

    com.amap.api.maps.model.NavigateArrow addNavigateArrow(com.amap.api.maps.model.NavigateArrowOptions r1) throws android.os.RemoteException;

    void addOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r1) throws android.os.RemoteException;

    void addOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r1) throws android.os.RemoteException;

    void addOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r1) throws android.os.RemoteException;

    void addOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r1) throws android.os.RemoteException;

    void addOnMapLoadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r1) throws android.os.RemoteException;

    void addOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r1) throws android.os.RemoteException;

    void addOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r1) throws android.os.RemoteException;

    void addOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r1) throws android.os.RemoteException;

    void addOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r1) throws android.os.RemoteException;

    void addOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r1) throws android.os.RemoteException;

    void addOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r1) throws android.os.RemoteException;

    void addOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r1) throws android.os.RemoteException;

    com.amap.api.maps.model.particle.ParticleOverlay addParticleOverlay(com.amap.api.maps.model.particle.ParticleOverlayOptions r1);

    com.amap.api.maps.model.Polygon addPolygon(com.amap.api.maps.model.PolygonOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.Polyline addPolyline(com.amap.api.maps.model.PolylineOptions r1) throws android.os.RemoteException;

    void addSignleClickInterceptorListener(com.amap.api.maps.AMap.SignleClickInterceptorListener r1);

    com.amap.api.maps.model.Text addText(com.amap.api.maps.model.TextOptions r1) throws android.os.RemoteException;

    com.amap.api.maps.model.TileOverlay addTileOverlay(com.amap.api.maps.model.TileOverlayOptions r1) throws android.os.RemoteException;

    void animateCamera(com.amap.api.maps.CameraUpdate r1) throws android.os.RemoteException;

    void animateCameraWithCallback(com.amap.api.maps.CameraUpdate r1, com.amap.api.maps.AMap.CancelableCallback r2) throws android.os.RemoteException;

    void animateCameraWithDurationAndCallback(com.amap.api.maps.CameraUpdate r1, long r2, com.amap.api.maps.AMap.CancelableCallback r4) throws android.os.RemoteException;

    android.util.Pair<java.lang.Float, com.amap.api.maps.model.LatLng> calculateZoomToSpanLevel(int r1, int r2, int r3, int r4, com.amap.api.maps.model.LatLng r5, com.amap.api.maps.model.LatLng r6);

    boolean canStopMapRender();

    void changeSurface(javax.microedition.khronos.opengles.GL10 r1, int r2, int r3);

    void checkMapState(com.autonavi.amap.api.mapcore.IGLMapState r1);

    void clear() throws android.os.RemoteException;

    void clear(boolean r1) throws android.os.RemoteException;

    long createGLOverlay(int r1);

    void createSurface(javax.microedition.khronos.opengles.GL10 r1, javax.microedition.khronos.egl.EGLConfig r2);

    void destroy();

    void destroySurface(int r1);

    void drawFrame(javax.microedition.khronos.opengles.GL10 r1);

    com.amap.api.maps.Projection getAMapProjection() throws android.os.RemoteException;

    com.amap.api.maps.UiSettings getAMapUiSettings() throws android.os.RemoteException;

    com.amap.api.maps.model.AMapCameraInfo getCamerInfo();

    float getCameraAngle();

    com.amap.api.maps.model.CameraPosition getCameraPosition() throws android.os.RemoteException;

    java.lang.String getCurrentWorldVectorMapStyle();

    long getGlOverlayMgrPtr();

    com.amap.api.maps.InfoWindowAnimationManager getInfoWindowAnimationManager();

    void getLatLngRect(com.autonavi.amap.mapcore.DPoint[] r1);

    android.os.Handler getMainHandler();

    java.lang.String getMapContentApprovalNumber();

    int getMapHeight();

    void getMapPrintScreen(com.amap.api.maps.AMap.onMapPrintScreenListener r1);

    java.util.List<com.amap.api.maps.model.Marker> getMapScreenMarkers() throws android.os.RemoteException;

    void getMapScreenShot(com.amap.api.maps.AMap.OnMapScreenShotListener r1, boolean r2);

    int getMapTextZIndex() throws android.os.RemoteException;

    int getMapType() throws android.os.RemoteException;

    int getMapWidth();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    android.location.Location getMyLocation() throws android.os.RemoteException;

    com.amap.api.maps.model.MyLocationStyle getMyLocationStyle() throws android.os.RemoteException;

    int getNativeEngineID();

    long getNativeMapController();

    float[] getProjectionMatrix();

    int getRenderMode();

    int getSX();

    int getSY();

    java.lang.String getSatelliteImageApprovalNumber();

    float getScalePerPixel() throws android.os.RemoteException;

    float getSkyHeight();

    java.lang.String getTerrainApprovalNumber();

    android.view.View getView() throws android.os.RemoteException;

    float[] getViewMatrix();

    java.lang.String getWorldVectorMapLanguage();

    java.lang.String getWorldVectorMapStyle();

    float getZoomToSpanLevel(com.amap.api.maps.model.LatLng r1, com.amap.api.maps.model.LatLng r2);

    int hideBuildings(java.util.List<com.amap.api.maps.model.LatLng> r1);

    boolean isIndoorEnabled() throws android.os.RemoteException;

    boolean isMaploaded();

    boolean isMyLocationEnabled() throws android.os.RemoteException;

    boolean isTouchPoiEnable();

    boolean isTrafficEnabled() throws android.os.RemoteException;

    void loadWorldVectorMap(boolean r1);

    void moveCamera(com.amap.api.maps.CameraUpdate r1) throws android.os.RemoteException;

    void onActivityPause();

    void onActivityResume();

    void onChangeFinish();

    void onFling();

    void onIndoorBuildingActivity(int r1, byte[] r2);

    boolean onTouchEvent(android.view.MotionEvent r1);

    void queueEvent(java.lang.Runnable r1);

    void reloadMap();

    void removeAMapAppResourceListener(com.amap.api.maps.AMap.AMapAppResourceRequestListener r1);

    void removeOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r1) throws android.os.RemoteException;

    void removeOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r1) throws android.os.RemoteException;

    void removeOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r1) throws android.os.RemoteException;

    void removeOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r1) throws android.os.RemoteException;

    void removeOnMapLoadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r1) throws android.os.RemoteException;

    void removeOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r1) throws android.os.RemoteException;

    void removeOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r1) throws android.os.RemoteException;

    void removeOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r1) throws android.os.RemoteException;

    void removeOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r1) throws android.os.RemoteException;

    void removeOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r1) throws android.os.RemoteException;

    void removeOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r1) throws android.os.RemoteException;

    void removeOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r1) throws android.os.RemoteException;

    void removeSignleClickInterceptorListener(com.amap.api.maps.AMap.SignleClickInterceptorListener r1);

    void removecache() throws android.os.RemoteException;

    void removecache(com.amap.api.maps.AMap.OnCacheRemoveListener r1) throws android.os.RemoteException;

    void renderSurface(javax.microedition.khronos.opengles.GL10 r1);

    void requestRender();

    void resetMinMaxZoomPreference();

    void resetRenderTime();

    void set3DBuildingEnabled(boolean r1) throws android.os.RemoteException;

    void setAMapGestureListener(com.amap.api.maps.model.AMapGestureListener r1);

    void setCenterToPixel(int r1, int r2) throws android.os.RemoteException;

    void setConstructingRoadEnable(boolean r1) throws android.os.RemoteException;

    void setCustomMapStyle(com.amap.api.maps.model.CustomMapStyleOptions r1);

    void setCustomMapStyleID(java.lang.String r1);

    void setCustomMapStylePath(java.lang.String r1);

    void setCustomRenderer(com.amap.api.maps.CustomRenderer r1) throws android.os.RemoteException;

    void setCustomTextureResourcePath(java.lang.String r1);

    void setIndoorBuildingInfo(com.amap.api.maps.model.IndoorBuildingInfo r1) throws android.os.RemoteException;

    void setIndoorEnabled(boolean r1) throws android.os.RemoteException;

    void setInfoWindowAdapter(com.amap.api.maps.AMap.CommonInfoWindowAdapter r1) throws android.os.RemoteException;

    void setInfoWindowAdapter(com.amap.api.maps.AMap.InfoWindowAdapter r1) throws android.os.RemoteException;

    void setLoadOfflineData(boolean r1) throws android.os.RemoteException;

    void setLocationSource(com.amap.api.maps.LocationSource r1) throws android.os.RemoteException;

    void setMapCustomEnable(boolean r1);

    void setMapLanguage(java.lang.String r1);

    void setMapStatusLimits(com.amap.api.maps.model.LatLngBounds r1);

    void setMapTextEnable(boolean r1) throws android.os.RemoteException;

    void setMapTextZIndex(int r1) throws android.os.RemoteException;

    void setMapType(int r1) throws android.os.RemoteException;

    void setMaskLayerParams(int r1, int r2, int r3, int r4, int r5, long r6);

    void setMaxZoomLevel(float r1);

    void setMinZoomLevel(float r1);

    void setMyLocationEnabled(boolean r1) throws android.os.RemoteException;

    void setMyLocationRotateAngle(float r1) throws android.os.RemoteException;

    void setMyLocationStyle(com.amap.api.maps.model.MyLocationStyle r1) throws android.os.RemoteException;

    void setMyLocationType(int r1) throws android.os.RemoteException;

    void setNaviLabelEnable(boolean r1, int r2, int r3) throws android.os.RemoteException;

    void setOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r1) throws android.os.RemoteException;

    void setOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r1) throws android.os.RemoteException;

    void setOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r1) throws android.os.RemoteException;

    void setOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r1) throws android.os.RemoteException;

    void setOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r1) throws android.os.RemoteException;

    void setOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r1) throws android.os.RemoteException;

    void setOnMaploadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r1) throws android.os.RemoteException;

    void setOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r1) throws android.os.RemoteException;

    void setOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r1) throws android.os.RemoteException;

    void setOnMultiPointClickListener(com.amap.api.maps.AMap.OnMultiPointClickListener r1);

    void setOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r1) throws android.os.RemoteException;

    void setOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r1) throws android.os.RemoteException;

    void setOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r1) throws android.os.RemoteException;

    void setRenderFps(int r1);

    void setRenderMode(int r1);

    void setRoadArrowEnable(boolean r1) throws android.os.RemoteException;

    void setRunLowFrame(boolean r1);

    void setTouchPoiEnable(boolean r1);

    void setTrafficEnabled(boolean r1) throws android.os.RemoteException;

    void setTrafficStyleWithTexture(byte[] r1, com.amap.api.maps.model.MyTrafficStyle r2);

    void setTrafficStyleWithTextureData(byte[] r1);

    void setVisibilityEx(int r1);

    void setWorldVectorMapStyle(java.lang.String r1);

    void setZOrderOnTop(boolean r1) throws android.os.RemoteException;

    void setZoomScaleParam(float r1);

    void showHideBuildings(int r1);

    void stopAnimation() throws android.os.RemoteException;
}

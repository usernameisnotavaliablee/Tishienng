package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IAMapEngineCallback {
    void OnIndoorBuildingActivity(int r1, byte[] r2);

    void cancelRequireMapData(java.lang.Object r1);

    int generateRequestId();

    com.amap.api.maps.model.BitmapDescriptor getDefaultTerrainImage();

    java.util.List<com.amap.api.maps.model.BitmapDescriptor> getSkyBoxImages();

    com.autonavi.base.ae.gmap.bean.InitStorageParam getStorageInitParam();

    com.autonavi.base.ae.gmap.bean.TileProviderInner getTerrainTileProvider();

    void onAMapAppResourceRequest(com.autonavi.base.ae.gmap.AMapAppRequestParam r1);

    void onMapBlandClick(double r1, double r3);

    void onMapPOIClick(com.autonavi.base.ae.gmap.MapPoi r1);

    void onMapRender(int r1, int r2);

    void reloadMapResource(int r1, java.lang.String r2, int r3);

    byte[] requireCharBitmap(int r1, int r2, int r3);

    byte[] requireCharsWidths(int r1, int[] r2, int r3, int r4);

    void requireMapRender(int r1, int r2, int r3);

    byte[] requireMapResource(int r1, java.lang.String r2);
}

package com.autonavi.amap.api.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IGLMapState {
    float calculateMapZoomer(int r1, int r2, int r3, int r4, int r5);

    float getCameraDegree();

    float getMapAngle();

    com.autonavi.amap.mapcore.DPoint getMapGeoCenter();

    void getMapGeoCenter(com.autonavi.amap.mapcore.IPoint r1);

    float getMapZoomer();

    void recalculate();

    void recycle();

    void screenToP20Point(int r1, int r2, android.graphics.Point r3);

    void setCameraDegree(float r1);

    void setMapAngle(float r1);

    void setMapGeoCenter(double r1, double r3);

    void setMapZoomer(float r1);
}

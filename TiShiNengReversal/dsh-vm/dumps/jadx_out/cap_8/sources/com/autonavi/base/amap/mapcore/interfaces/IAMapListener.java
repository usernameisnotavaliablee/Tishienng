package com.autonavi.base.amap.mapcore.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IAMapListener {
    void afterAnimation();

    void afterDrawFrame(int r1, com.autonavi.base.ae.gmap.GLMapState r2);

    void afterDrawLabel(int r1, com.autonavi.base.ae.gmap.GLMapState r2);

    void afterRendererOver(int r1, com.autonavi.base.ae.gmap.GLMapState r2);

    void beforeDrawLabel(int r1, com.autonavi.base.ae.gmap.GLMapState r2);

    void onMapBlankClick(double r1, double r3);

    void onMapPOIClick(com.autonavi.base.ae.gmap.MapPoi r1);
}

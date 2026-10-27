package com.autonavi.amap.mapcore.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ICrossVectorOverlay {
    void remove();

    void setAttribute(com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r1);

    int setData(byte[] r1);

    void setGenerateCrossImageListener(com.amap.api.maps.model.CrossOverlay.GenerateCrossImageListener r1);

    void setImageMode(boolean r1);

    void setOnCrossVectorUpdateListener(com.amap.api.maps.model.CrossOverlay.OnCrossVectorUpdateListener r1);

    void setVisible(boolean r1);
}

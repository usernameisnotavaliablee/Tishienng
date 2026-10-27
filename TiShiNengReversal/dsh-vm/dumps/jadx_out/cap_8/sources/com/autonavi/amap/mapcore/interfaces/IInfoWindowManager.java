package com.autonavi.amap.mapcore.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IInfoWindowManager {
    void setInfoWindowAnimation(com.amap.api.maps.model.animation.Animation r1, com.amap.api.maps.model.animation.Animation.AnimationListener r2);

    void setInfoWindowAppearAnimation(com.amap.api.maps.model.animation.Animation r1);

    void setInfoWindowBackColor(int r1);

    void setInfoWindowBackEnable(boolean r1);

    void setInfoWindowBackScale(float r1, float r2);

    void setInfoWindowDisappearAnimation(com.amap.api.maps.model.animation.Animation r1);

    void setInfoWindowMovingAnimation(com.amap.api.maps.model.animation.Animation r1);

    void startAnimation();
}

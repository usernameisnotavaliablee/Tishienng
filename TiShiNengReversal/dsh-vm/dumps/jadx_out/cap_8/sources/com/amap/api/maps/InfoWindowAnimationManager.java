package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InfoWindowAnimationManager {
    com.autonavi.amap.mapcore.interfaces.IInfoWindowManager a;

    public InfoWindowAnimationManager(com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void setInfoWindowAnimation(com.amap.api.maps.model.animation.Animation r2, com.amap.api.maps.model.animation.Animation.AnimationListener r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.setInfoWindowAnimation(r2, r3)
            return
    }

    public void setInfoWindowAppearAnimation(com.amap.api.maps.model.animation.Animation r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.setInfoWindowAppearAnimation(r2)
            return
    }

    public void setInfoWindowBackColor(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.setInfoWindowBackColor(r2)
            return
    }

    public void setInfoWindowBackEnable(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.setInfoWindowBackEnable(r2)
            return
    }

    public void setInfoWindowBackScale(float r2, float r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.setInfoWindowBackScale(r2, r3)
            return
    }

    public void setInfoWindowDisappearAnimation(com.amap.api.maps.model.animation.Animation r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.setInfoWindowDisappearAnimation(r2)
            return
    }

    public void setInfoWindowMovingAnimation(com.amap.api.maps.model.animation.Animation r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.setInfoWindowMovingAnimation(r2)
            return
    }

    public void startAnimation() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IInfoWindowManager r0 = r1.a
            r0.startAnimation()
            return
    }
}

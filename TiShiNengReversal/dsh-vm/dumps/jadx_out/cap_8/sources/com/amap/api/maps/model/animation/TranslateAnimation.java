package com.amap.api.maps.model.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TranslateAnimation extends com.amap.api.maps.model.animation.Animation {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private double x;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private double y;

    public TranslateAnimation(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            r2.<init>()
            com.autonavi.amap.mapcore.animation.GLTranslateAnimation r0 = new com.autonavi.amap.mapcore.animation.GLTranslateAnimation
            r0.<init>(r3)
            r2.glAnimation = r0
            double r0 = r3.latitude
            r2.x = r0
            double r0 = r3.longitude
            r2.y = r0
            return
    }

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
            r1 = this;
            java.lang.String r0 = "TranslateAnimation"
            return r0
    }
}

package com.amap.api.maps.model.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AlphaAnimation extends com.amap.api.maps.model.animation.Animation {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mFromAlpha;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mToAlpha;

    public AlphaAnimation(float r2, float r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mFromAlpha = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mToAlpha = r0
            com.autonavi.amap.mapcore.animation.GLAlphaAnimation r0 = new com.autonavi.amap.mapcore.animation.GLAlphaAnimation
            r0.<init>(r2, r3)
            r1.glAnimation = r0
            r1.mFromAlpha = r2
            r1.mToAlpha = r3
            return
    }

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
            r1 = this;
            java.lang.String r0 = "AlphaAnimation"
            return r0
    }
}

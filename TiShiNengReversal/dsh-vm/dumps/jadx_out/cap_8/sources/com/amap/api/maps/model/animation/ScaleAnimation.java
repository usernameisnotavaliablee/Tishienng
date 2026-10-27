package com.amap.api.maps.model.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ScaleAnimation extends com.amap.api.maps.model.animation.Animation {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mFromX;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mFromY;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mPivotX;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mPivotY;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mToX;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mToY;

    public ScaleAnimation(float r2, float r3, float r4, float r5) {
            r1 = this;
            r1.<init>()
            com.autonavi.amap.mapcore.animation.GLScaleAnimation r0 = new com.autonavi.amap.mapcore.animation.GLScaleAnimation
            r0.<init>(r2, r3, r4, r5)
            r1.glAnimation = r0
            r1.mFromX = r2
            r1.mToX = r3
            r1.mFromY = r4
            r1.mToY = r5
            r2 = 0
            r1.mPivotX = r2
            r1.mPivotY = r2
            r2 = 1
            r1.setFillMode(r2)
            return
    }

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
            r1 = this;
            java.lang.String r0 = "ScaleAnimation"
            return r0
    }
}

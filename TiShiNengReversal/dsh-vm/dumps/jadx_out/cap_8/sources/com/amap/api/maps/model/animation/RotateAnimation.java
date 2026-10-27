package com.amap.api.maps.model.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RotateAnimation extends com.amap.api.maps.model.animation.Animation {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mFromDegrees;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mToDegrees;

    public RotateAnimation(float r8, float r9) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.mFromDegrees = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.mToDegrees = r0
            com.autonavi.amap.mapcore.animation.GLRotateAnimation r1 = new com.autonavi.amap.mapcore.animation.GLRotateAnimation
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.glAnimation = r1
            r7.mFromDegrees = r2
            r7.mToDegrees = r3
            return
    }

    public RotateAnimation(float r8, float r9, float r10, float r11, float r12) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.mFromDegrees = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.mToDegrees = r0
            com.autonavi.amap.mapcore.animation.GLRotateAnimation r1 = new com.autonavi.amap.mapcore.animation.GLRotateAnimation
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.glAnimation = r1
            r7.mFromDegrees = r2
            r7.mToDegrees = r3
            return
    }

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
            r1 = this;
            java.lang.String r0 = "RotateAnimation"
            return r0
    }
}

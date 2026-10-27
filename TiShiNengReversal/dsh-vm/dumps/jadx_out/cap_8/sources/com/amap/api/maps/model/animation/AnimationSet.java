package com.amap.api.maps.model.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AnimationSet extends com.amap.api.maps.model.animation.Animation {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.util.List<com.amap.api.maps.model.animation.Animation> mAnimations;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean shareInterpolator;

    public AnimationSet(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAnimations = r0
            r0 = 0
            r1.shareInterpolator = r0
            com.autonavi.amap.mapcore.animation.GLAnimationSet r0 = new com.autonavi.amap.mapcore.animation.GLAnimationSet
            r0.<init>(r2)
            r1.glAnimation = r0
            r1.shareInterpolator = r2
            return
    }

    public void addAnimation(com.amap.api.maps.model.animation.Animation r2) {
            r1 = this;
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            com.autonavi.amap.mapcore.animation.GLAnimationSet r0 = (com.autonavi.amap.mapcore.animation.GLAnimationSet) r0
            r0.addAnimation(r2)
            java.util.List<com.amap.api.maps.model.animation.Animation> r0 = r1.mAnimations
            r0.add(r2)
            return
    }

    public void cleanAnimation() {
            r1 = this;
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            com.autonavi.amap.mapcore.animation.GLAnimationSet r0 = (com.autonavi.amap.mapcore.animation.GLAnimationSet) r0
            r0.cleanAnimation()
            java.util.List<com.amap.api.maps.model.animation.Animation> r0 = r1.mAnimations
            r0.clear()
            return
    }

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
            r1 = this;
            java.lang.String r0 = "AnimationSet"
            return r0
    }
}

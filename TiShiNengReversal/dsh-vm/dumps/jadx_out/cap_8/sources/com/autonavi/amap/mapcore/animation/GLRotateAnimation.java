package com.autonavi.amap.mapcore.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLRotateAnimation extends com.autonavi.amap.mapcore.animation.GLAnimation {
    private float mFromDegrees;
    private float mToDegrees;

    public GLRotateAnimation(float r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            r0.<init>()
            r0.mFromDegrees = r1
            r0.mToDegrees = r2
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    protected void applyTransformation(float r3, com.autonavi.amap.mapcore.animation.GLTransformation r4) {
            r2 = this;
            float r0 = r2.mFromDegrees
            float r1 = r2.mToDegrees
            float r1 = r1 - r0
            float r1 = r1 * r3
            float r0 = r0 + r1
            double r0 = (double) r0
            r4.rotate = r0
            return
    }
}

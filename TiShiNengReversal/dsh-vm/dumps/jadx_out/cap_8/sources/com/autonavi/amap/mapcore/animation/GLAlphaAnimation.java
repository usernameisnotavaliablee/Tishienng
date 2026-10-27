package com.autonavi.amap.mapcore.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLAlphaAnimation extends com.autonavi.amap.mapcore.animation.GLAnimation {
    public float mCurAlpha;
    public float mFromAlpha;
    public float mToAlpha;

    public GLAlphaAnimation(float r2, float r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCurAlpha = r0
            r1.mFromAlpha = r2
            r1.mToAlpha = r3
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    protected void applyTransformation(float r3, com.autonavi.amap.mapcore.animation.GLTransformation r4) {
            r2 = this;
            float r0 = r2.mFromAlpha
            float r1 = r2.mToAlpha
            float r1 = r1 - r0
            float r1 = r1 * r3
            float r0 = r0 + r1
            r2.mCurAlpha = r0
            double r0 = (double) r0
            r4.alpha = r0
            return
    }
}

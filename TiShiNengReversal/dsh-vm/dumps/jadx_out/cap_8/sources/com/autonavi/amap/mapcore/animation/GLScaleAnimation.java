package com.autonavi.amap.mapcore.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLScaleAnimation extends com.autonavi.amap.mapcore.animation.GLAnimation {
    private float mFromX;
    private float mFromY;
    private float mPivotX;
    private float mPivotY;
    private float mToX;
    private float mToY;

    public GLScaleAnimation(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.mFromX = r1
            r0.mToX = r2
            r0.mFromY = r3
            r0.mToY = r4
            r1 = 0
            r0.mPivotX = r1
            r0.mPivotY = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    protected void applyTransformation(float r5, com.autonavi.amap.mapcore.animation.GLTransformation r6) {
            r4 = this;
            float r0 = r4.mFromX
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L12
            float r2 = r4.mToX
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto Lf
            goto L12
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L18
        L12:
            float r2 = r4.mToX
            float r2 = r2 - r0
            float r2 = r2 * r5
            float r0 = r0 + r2
        L18:
            float r2 = r4.mFromY
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 != 0) goto L24
            float r3 = r4.mToY
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L2a
        L24:
            float r1 = r4.mToY
            float r1 = r1 - r2
            float r1 = r1 * r5
            float r1 = r1 + r2
        L2a:
            double r2 = (double) r0
            r6.scaleX = r2
            double r0 = (double) r1
            r6.scaleY = r0
            return
    }
}

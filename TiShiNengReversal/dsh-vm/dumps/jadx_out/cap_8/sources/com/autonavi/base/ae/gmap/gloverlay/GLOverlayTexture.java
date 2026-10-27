package com.autonavi.base.ae.gmap.gloverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLOverlayTexture {
    public int mAnchor;
    public float mAnchorXRatio;
    public float mAnchorYRatio;
    public int mHeight;
    public int mResHeight;
    public int mResId;
    public int mResWidth;
    public int mWidth;

    public GLOverlayTexture(int r1, int r2, float r3, float r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.mResId = r1
            r0.mWidth = r5
            r0.mHeight = r6
            r0.mResWidth = r5
            r0.mResHeight = r6
            r0.mAnchor = r2
            r0.mAnchorXRatio = r3
            r0.mAnchorYRatio = r4
            return
    }

    public GLOverlayTexture(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.mResId = r1
            r0.mWidth = r3
            r0.mHeight = r4
            r0.mResWidth = r3
            r0.mResHeight = r4
            r0.mAnchor = r2
            return
    }
}

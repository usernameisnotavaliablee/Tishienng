package com.autonavi.amap.mapcore.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLTranslateAnimation extends com.autonavi.amap.mapcore.animation.GLAnimation {
    public double mCurXDelta;
    public double mCurYDelta;
    public double mFromXDelta;
    public double mFromYDelta;
    public double mToXDelta;
    public double mToYDelta;

    public GLTranslateAnimation(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mFromXDelta = r0
            r2.mFromYDelta = r0
            r2.mToXDelta = r0
            r2.mToYDelta = r0
            r2.mCurXDelta = r0
            r2.mCurYDelta = r0
            double r0 = r3.longitude
            r2.mToXDelta = r0
            double r0 = r3.latitude
            r2.mToYDelta = r0
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    protected void applyTransformation(float r9, com.autonavi.amap.mapcore.animation.GLTransformation r10) {
            r8 = this;
            double r0 = r8.mFromXDelta
            r8.mCurXDelta = r0
            double r2 = r8.mFromYDelta
            r8.mCurYDelta = r2
            double r4 = r8.mToXDelta
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L15
            double r4 = r4 - r0
            double r6 = (double) r9
            double r4 = r4 * r6
            double r0 = r0 + r4
            r8.mCurXDelta = r0
        L15:
            double r0 = r8.mToYDelta
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L22
            double r0 = r0 - r2
            double r4 = (double) r9
            double r0 = r0 * r4
            double r2 = r2 + r0
            r8.mCurYDelta = r2
        L22:
            double r0 = r8.mCurXDelta
            r10.x = r0
            double r0 = r8.mCurYDelta
            r10.y = r0
            return
    }

    public void setFromPoint(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            double r0 = r3.longitude
            r2.mFromXDelta = r0
            double r0 = r3.latitude
            r2.mFromYDelta = r0
            return
    }
}

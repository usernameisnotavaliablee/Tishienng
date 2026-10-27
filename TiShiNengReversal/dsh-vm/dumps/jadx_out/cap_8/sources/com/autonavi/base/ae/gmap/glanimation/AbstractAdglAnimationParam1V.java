package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AbstractAdglAnimationParam1V extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam {
    private float fromValue;
    private float toValue;

    public AbstractAdglAnimationParam1V() {
            r0 = this;
            r0.<init>()
            r0.reset()
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam
    public void checkParam() {
            r6 = this;
            r0 = 0
            r6.needToCaculate = r0
            boolean r0 = r6.hasFromValue
            r1 = 1
            if (r0 == 0) goto L21
            boolean r0 = r6.hasToValue
            if (r0 == 0) goto L21
            float r0 = r6.toValue
            float r2 = r6.fromValue
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            double r2 = (double) r0
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L21
            r6.needToCaculate = r1
        L21:
            r6.hasCheckedParam = r1
            return
    }

    public float getCurValue() {
            r3 = this;
            float r0 = r3.fromValue
            float r1 = r3.toValue
            float r1 = r1 - r0
            float r2 = r3.mult
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    public float getFromValue() {
            r1 = this;
            float r0 = r1.fromValue
            return r0
    }

    public float getToValue() {
            r1 = this;
            float r0 = r1.toValue
            return r0
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.fromValue = r0
            r1.toValue = r0
            return
    }

    public void setFromValue(float r1) {
            r0 = this;
            r0.fromValue = r1
            r1 = 1
            r0.hasFromValue = r1
            r1 = 0
            r0.hasCheckedParam = r1
            return
    }

    public void setToValue(float r1) {
            r0 = this;
            r0.toValue = r1
            r1 = 1
            r0.hasToValue = r1
            r1 = 0
            r0.hasCheckedParam = r1
            return
    }
}

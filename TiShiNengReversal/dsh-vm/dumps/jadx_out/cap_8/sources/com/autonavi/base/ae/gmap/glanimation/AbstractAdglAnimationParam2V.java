package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AbstractAdglAnimationParam2V extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam {
    public double fromXValue;
    public double fromYValue;
    public double toXValue;
    public double toYValue;

    public AbstractAdglAnimationParam2V() {
            r0 = this;
            r0.<init>()
            r0.reset()
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam
    public void checkParam() {
            r8 = this;
            r0 = 0
            r8.needToCaculate = r0
            boolean r0 = r8.hasFromValue
            r1 = 1
            if (r0 == 0) goto L2d
            boolean r0 = r8.hasToValue
            if (r0 == 0) goto L2d
            double r2 = r8.toXValue
            double r4 = r8.fromXValue
            double r2 = r2 - r4
            double r4 = r8.toYValue
            double r6 = r8.fromYValue
            double r4 = r4 - r6
            double r2 = java.lang.Math.abs(r2)
            r6 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L2b
            double r2 = java.lang.Math.abs(r4)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2d
        L2b:
            r8.needToCaculate = r1
        L2d:
            r8.hasCheckedParam = r1
            return
    }

    public double getCurXValue() {
            r6 = this;
            double r0 = r6.fromXValue
            double r2 = r6.toXValue
            double r2 = r2 - r0
            float r4 = r6.mult
            double r4 = (double) r4
            double r2 = r2 * r4
            double r0 = r0 + r2
            return r0
    }

    public double getCurYValue() {
            r6 = this;
            double r0 = r6.fromYValue
            double r2 = r6.toYValue
            double r2 = r2 - r0
            float r4 = r6.mult
            double r4 = (double) r4
            double r2 = r2 * r4
            double r0 = r0 + r2
            return r0
    }

    public double getFromXValue() {
            r2 = this;
            double r0 = r2.fromXValue
            return r0
    }

    public double getFromYValue() {
            r2 = this;
            double r0 = r2.fromYValue
            return r0
    }

    public double getToXValue() {
            r2 = this;
            double r0 = r2.toXValue
            return r0
    }

    public double getToYValue() {
            r2 = this;
            double r0 = r2.toYValue
            return r0
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam
    public void reset() {
            r2 = this;
            super.reset()
            r0 = 0
            r2.fromXValue = r0
            r2.toXValue = r0
            r2.fromYValue = r0
            r2.toYValue = r0
            return
    }

    public void setFromValue(double r1, double r3) {
            r0 = this;
            r0.fromXValue = r1
            r0.fromYValue = r3
            r1 = 1
            r0.hasFromValue = r1
            r1 = 0
            r0.hasCheckedParam = r1
            return
    }

    public void setToValue(double r1, double r3) {
            r0 = this;
            r0.toXValue = r1
            r0.toYValue = r3
            r1 = 1
            r0.hasToValue = r1
            r1 = 0
            r0.hasCheckedParam = r1
            return
    }
}

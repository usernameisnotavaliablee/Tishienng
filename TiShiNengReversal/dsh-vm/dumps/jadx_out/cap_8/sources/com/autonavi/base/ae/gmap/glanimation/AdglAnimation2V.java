package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdglAnimation2V extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation {
    private double curValue1;
    private double curValue2;
    private com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V v2Param;

    public AdglAnimation2V(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.v2Param = r0
            r2.reset()
            r2.duration = r3
            r0 = 0
            r2.curValue1 = r0
            r2.curValue2 = r0
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public void doAnimation(java.lang.Object r5) {
            r4 = this;
            boolean r5 = r4.isOver
            if (r5 == 0) goto L5
            goto L3e
        L5:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.startTime
            long r0 = r0 - r2
            r4.offsetTime = r0
            float r5 = (float) r0
            int r0 = r4.duration
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1f
            r4.isOver = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L27
        L1f:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L27
            r4.isOver = r0
            return
        L27:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r4.v2Param
            if (r0 == 0) goto L3e
            r0.setNormalizedTime(r5)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r5 = r4.v2Param
            double r0 = r5.getCurXValue()
            r4.curValue1 = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r5 = r4.v2Param
            double r0 = r5.getCurYValue()
            r4.curValue2 = r0
        L3e:
            return
    }

    public double getCurValue(int r3) {
            r2 = this;
            if (r3 != 0) goto L5
            double r0 = r2.curValue1
            return r0
        L5:
            double r0 = r2.curValue2
            return r0
    }

    public double getEndValue(int r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto Ld
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r3 = r2.v2Param
            if (r3 == 0) goto Lc
            double r0 = r3.getToXValue()
        Lc:
            return r0
        Ld:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r3 = r2.v2Param
            if (r3 == 0) goto L15
            double r0 = r3.getToYValue()
        L15:
            return r0
    }

    public double getStartValue(int r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto Ld
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r3 = r2.v2Param
            if (r3 == 0) goto Lc
            double r0 = r3.getFromXValue()
        Lc:
            return r0
        Ld:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r3 = r2.v2Param
            if (r3 == 0) goto L15
            double r0 = r3.getFromYValue()
        L15:
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.isOver = r0
            r2.duration = r0
            r0 = 0
            r2.curValue1 = r0
            r2.curValue2 = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r2.v2Param
            if (r0 == 0) goto L12
            r0.reset()
        L12:
            return
    }
}

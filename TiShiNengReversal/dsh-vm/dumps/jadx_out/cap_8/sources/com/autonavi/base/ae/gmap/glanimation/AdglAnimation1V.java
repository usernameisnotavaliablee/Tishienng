package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdglAnimation1V extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation {
    private float curValue;
    private com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V v1Param;

    public AdglAnimation1V(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.v1Param = r0
            r1.reset()
            r1.duration = r2
            r2 = 0
            r1.curValue = r2
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public void doAnimation(java.lang.Object r5) {
            r4 = this;
            boolean r5 = r4.isOver
            if (r5 == 0) goto L5
            goto L36
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
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r4.v1Param
            if (r0 == 0) goto L36
            r0.setNormalizedTime(r5)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r5 = r4.v1Param
            float r5 = r5.getCurValue()
            r4.curValue = r5
        L36:
            return
    }

    public float getCurValue() {
            r1 = this;
            float r0 = r1.curValue
            return r0
    }

    public float getEndValue() {
            r1 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r1.v1Param
            if (r0 == 0) goto L9
            float r0 = r0.getToValue()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getStartValue() {
            r1 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r1.v1Param
            if (r0 == 0) goto L9
            float r0 = r0.getFromValue()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.isOver = r0
            r1.duration = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r1.v1Param
            if (r0 == 0) goto Lc
            r0.reset()
        Lc:
            return
    }

    public void setAnimationValue(float r3, float r4, int r5) {
            r2 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.v1Param
            if (r0 != 0) goto Lb
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V
            r0.<init>()
            r2.v1Param = r0
        Lb:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.v1Param
            r0.reset()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.v1Param
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setInterpolatorType(r5, r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r5 = r2.v1Param
            r5.setFromValue(r3)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r2.v1Param
            r3.setToValue(r4)
            long r3 = android.os.SystemClock.uptimeMillis()
            r2.startTime = r3
            r3 = 0
            r2.isOver = r3
            return
    }
}

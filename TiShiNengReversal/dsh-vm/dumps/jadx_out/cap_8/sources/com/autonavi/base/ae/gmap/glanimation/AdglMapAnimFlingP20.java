package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdglMapAnimFlingP20 extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation {
    private boolean hasCheckParams;
    private com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V moveParam;
    private boolean needMove;
    private float velocityScreenX;
    private float velocityScreenY;

    public AdglMapAnimFlingP20(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.moveParam = r0
            r1.reset()
            r1.duration = r2
            return
    }

    public void commitAnimation(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            com.autonavi.base.ae.gmap.GLMapState r1 = (com.autonavi.base.ae.gmap.GLMapState) r1
            if (r1 != 0) goto L9
            return
        L9:
            r2 = 0
            r0.hasCheckParams = r2
            r3 = 1
            r0.isOver = r3
            float r4 = r0.velocityScreenX
            int r5 = r0.duration
            float r6 = (float) r5
            float r4 = r4 * r6
            r6 = 1157234688(0x44fa0000, float:2000.0)
            float r4 = r4 / r6
            float r7 = r0.velocityScreenY
            float r5 = (float) r5
            float r7 = r7 * r5
            float r7 = r7 / r6
            float r5 = java.lang.Math.abs(r4)
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L94
            float r5 = java.lang.Math.abs(r7)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L94
            r0.isOver = r2
            com.autonavi.amap.mapcore.IPoint r2 = com.autonavi.amap.mapcore.IPoint.obtain()
            r1.getMapGeoCenter(r2)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r5 = r0.moveParam
            int r6 = r2.x
            double r8 = (double) r6
            int r6 = r2.y
            double r10 = (double) r6
            r5.setFromValue(r8, r10)
            float r5 = r1.getMapLenWithWin(r3)
            float r1 = r1.getMapAngle()
            double r8 = (double) r1
            r10 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r8 = r8 * r10
            r10 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r8 = r8 / r10
            int r1 = r2.x
            double r10 = (double) r1
            double r5 = (double) r5
            double r12 = (double) r4
            double r14 = java.lang.Math.cos(r8)
            double r14 = r14 * r12
            double r3 = (double) r7
            double r16 = java.lang.Math.sin(r8)
            double r16 = r16 * r3
            double r14 = r14 - r16
            double r14 = r14 * r5
            double r10 = r10 - r14
            int r1 = r2.y
            double r14 = (double) r1
            double r16 = java.lang.Math.sin(r8)
            double r12 = r12 * r16
            double r7 = java.lang.Math.cos(r8)
            double r3 = r3 * r7
            double r12 = r12 + r3
            double r5 = r5 * r12
            double r14 = r14 - r5
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r1 = r0.moveParam
            r1.setToValue(r10, r14)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r1 = r0.moveParam
            boolean r1 = r1.needToCaculate()
            r0.needMove = r1
            r2.recycle()
        L94:
            r1 = 1
            r0.hasCheckParams = r1
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.startTime = r1
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public void doAnimation(java.lang.Object r6) {
            r5 = this;
            r0 = r6
            com.autonavi.base.ae.gmap.GLMapState r0 = (com.autonavi.base.ae.gmap.GLMapState) r0
            if (r0 != 0) goto L6
            goto L4c
        L6:
            boolean r1 = r5.hasCheckParams
            if (r1 != 0) goto Ld
            r5.commitAnimation(r6)
        Ld:
            boolean r6 = r5.isOver
            if (r6 == 0) goto L12
            goto L4c
        L12:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r5.startTime
            long r1 = r1 - r3
            r5.offsetTime = r1
            float r6 = (float) r1
            int r1 = r5.duration
            float r1 = (float) r1
            float r6 = r6 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 <= 0) goto L2b
            r6 = 1
            r5.isOver = r6
            r6 = 1065353216(0x3f800000, float:1.0)
        L2b:
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L4c
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L4c
            boolean r1 = r5.needMove
            if (r1 == 0) goto L4c
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r1 = r5.moveParam
            r1.setNormalizedTime(r6)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r6 = r5.moveParam
            double r1 = r6.getCurXValue()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r6 = r5.moveParam
            double r3 = r6.getCurYValue()
            r0.setMapGeoCenter(r1, r3)
        L4c:
            return
    }

    public void reset() {
            r1 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r1.moveParam
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            r0 = 0
            r1.velocityScreenX = r0
            r1.velocityScreenY = r0
            r0 = 0
            r1.needMove = r0
            r1.hasCheckParams = r0
            return
    }

    public void setPositionAndVelocity(float r2, float r3) {
            r1 = this;
            r0 = 0
            r1.moveParam = r0
            r1.velocityScreenX = r2
            r1.velocityScreenY = r3
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r2 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V
            r2.<init>()
            r1.moveParam = r2
            r3 = 2
            r0 = 1067030938(0x3f99999a, float:1.2)
            r2.setInterpolatorType(r3, r0)
            r2 = 0
            r1.needMove = r2
            r1.hasCheckParams = r2
            return
    }
}

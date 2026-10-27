package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdglMapAnimFling extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation {
    private com.autonavi.amap.mapcore.IPoint fromCenter;
    private boolean hasCheckParams;
    private int lastMoveX;
    private int lastMoveY;
    private com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V moveParam;
    private boolean needMove;
    private int screenCenterX;
    private int screenCenterY;
    private float velocityX;
    private float velocityY;

    public AdglMapAnimFling(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.screenCenterX = r2
            r0.screenCenterY = r3
            r0.lastMoveX = r2
            r0.lastMoveY = r3
            r2 = 0
            r0.moveParam = r2
            r0.reset()
            r0.duration = r1
            return
    }

    public void commitAnimation(java.lang.Object r9) {
            r8 = this;
            com.autonavi.base.ae.gmap.GLMapState r9 = (com.autonavi.base.ae.gmap.GLMapState) r9
            if (r9 != 0) goto L5
            return
        L5:
            r0 = 0
            r8.hasCheckParams = r0
            r1 = 1
            r8.isOver = r1
            float r2 = r8.velocityX
            int r3 = r8.duration
            float r4 = (float) r3
            float r2 = r2 * r4
            r4 = 1157234688(0x44fa0000, float:2000.0)
            float r2 = r2 / r4
            int r2 = (int) r2
            float r5 = r8.velocityY
            float r3 = (float) r3
            float r5 = r5 * r3
            float r5 = r5 / r4
            int r3 = (int) r5
            int r4 = java.lang.Math.abs(r2)
            if (r4 == 0) goto L5a
            int r4 = java.lang.Math.abs(r3)
            if (r4 == 0) goto L5a
            com.autonavi.amap.mapcore.IPoint r4 = r8.fromCenter
            if (r4 != 0) goto L33
            com.autonavi.amap.mapcore.IPoint r4 = com.autonavi.amap.mapcore.IPoint.obtain()
            r8.fromCenter = r4
        L33:
            com.autonavi.amap.mapcore.IPoint r4 = r8.fromCenter
            r9.getMapGeoCenter(r4)
            r8.isOver = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r9 = r8.moveParam
            int r0 = r8.screenCenterX
            double r4 = (double) r0
            int r0 = r8.screenCenterY
            double r6 = (double) r0
            r9.setFromValue(r4, r6)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r9 = r8.moveParam
            int r0 = r8.screenCenterX
            int r0 = r0 - r2
            double r4 = (double) r0
            int r0 = r8.screenCenterY
            int r0 = r0 - r3
            double r2 = (double) r0
            r9.setToValue(r4, r2)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r9 = r8.moveParam
            boolean r9 = r9.needToCaculate()
            r8.needMove = r9
        L5a:
            r8.hasCheckParams = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.startTime = r0
            return
    }

    public void commitAnimationold(java.lang.Object r8) {
            r7 = this;
            com.autonavi.base.ae.gmap.GLMapState r8 = (com.autonavi.base.ae.gmap.GLMapState) r8
            if (r8 != 0) goto L5
            return
        L5:
            r0 = 0
            r7.hasCheckParams = r0
            r1 = 1
            r7.isOver = r1
            float r2 = r7.velocityX
            float r2 = r2 * r2
            float r3 = r7.velocityY
            float r3 = r3 * r3
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L64
            r3 = 1017370378(0x3ca3d70a, float:0.02)
            float r2 = r2 * r3
            com.autonavi.amap.mapcore.IPoint r3 = r7.fromCenter
            if (r3 != 0) goto L33
            com.autonavi.amap.mapcore.IPoint r3 = com.autonavi.amap.mapcore.IPoint.obtain()
            r7.fromCenter = r3
        L33:
            com.autonavi.amap.mapcore.IPoint r3 = r7.fromCenter
            r8.getMapGeoCenter(r3)
            r7.isOver = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r8 = r7.moveParam
            int r0 = r7.screenCenterX
            double r3 = (double) r0
            int r0 = r7.screenCenterY
            double r5 = (double) r0
            r8.setFromValue(r3, r5)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r8 = r7.moveParam
            int r0 = r7.screenCenterX
            float r0 = (float) r0
            float r3 = r7.velocityX
            float r3 = r3 * r2
            float r0 = r0 - r3
            double r3 = (double) r0
            int r0 = r7.screenCenterY
            float r0 = (float) r0
            float r5 = r7.velocityY
            float r5 = r5 * r2
            float r0 = r0 - r5
            double r5 = (double) r0
            r8.setToValue(r3, r5)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r8 = r7.moveParam
            boolean r8 = r8.needToCaculate()
            r7.needMove = r8
        L64:
            r7.hasCheckParams = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.startTime = r0
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public void doAnimation(java.lang.Object r8) {
            r7 = this;
            r0 = r8
            com.autonavi.base.ae.gmap.GLMapState r0 = (com.autonavi.base.ae.gmap.GLMapState) r0
            if (r0 != 0) goto L6
            goto L6e
        L6:
            boolean r1 = r7.hasCheckParams
            if (r1 != 0) goto Ld
            r7.commitAnimation(r8)
        Ld:
            boolean r8 = r7.isOver
            if (r8 == 0) goto L12
            goto L6e
        L12:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r7.startTime
            long r1 = r1 - r3
            r7.offsetTime = r1
            float r8 = (float) r1
            int r1 = r7.duration
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L2b
            r8 = 1
            r7.isOver = r8
            r8 = 1065353216(0x3f800000, float:1.0)
        L2b:
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L6e
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L6e
            boolean r1 = r7.needMove
            if (r1 == 0) goto L6e
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r1 = r7.moveParam
            r1.setNormalizedTime(r8)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r8 = r7.moveParam
            double r1 = r8.getCurXValue()
            int r8 = (int) r1
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r1 = r7.moveParam
            double r1 = r1.getCurYValue()
            int r1 = (int) r1
            com.autonavi.amap.mapcore.IPoint r2 = com.autonavi.amap.mapcore.IPoint.obtain()
            int r3 = r7.screenCenterX
            int r3 = r3 + r8
            int r4 = r7.lastMoveX
            int r3 = r3 - r4
            int r4 = r7.screenCenterY
            int r4 = r4 + r1
            int r5 = r7.lastMoveY
            int r4 = r4 - r5
            r0.screenToP20Point(r3, r4, r2)
            int r3 = r2.x
            double r3 = (double) r3
            int r5 = r2.y
            double r5 = (double) r5
            r0.setMapGeoCenter(r3, r5)
            r7.lastMoveX = r8
            r7.lastMoveY = r1
            r2.recycle()
        L6e:
            return
    }

    public void reset() {
            r1 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r1.moveParam
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            r0 = 0
            r1.velocityX = r0
            r1.velocityY = r0
            r0 = 0
            r1.needMove = r0
            r1.hasCheckParams = r0
            return
    }

    public void setPositionAndVelocity(float r2, float r3) {
            r1 = this;
            r0 = 0
            r1.moveParam = r0
            r1.velocityX = r2
            r1.velocityY = r3
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

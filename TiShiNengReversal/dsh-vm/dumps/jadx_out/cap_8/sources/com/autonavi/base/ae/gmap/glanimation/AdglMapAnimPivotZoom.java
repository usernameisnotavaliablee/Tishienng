package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdglMapAnimPivotZoom extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation {
    private int beginCenterGeoX;
    private int beginCenterGeoY;
    private boolean hasCheckParams;
    private float mapLevelTo;
    private int pivotGeoX;
    private int pivotGeoY;
    private float winPivotX;
    private float winPivotY;
    private boolean zoomCenter;
    com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V zoomParam;

    public AdglMapAnimPivotZoom(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zoomParam = r0
            r1.reset()
            r1.duration = r2
            return
    }

    public void commitAnimation(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            r8.isOver = r0
            r1 = 0
            r8.hasCheckParams = r1
            com.autonavi.base.ae.gmap.GLMapState r9 = (com.autonavi.base.ae.gmap.GLMapState) r9
            if (r9 != 0) goto Lb
            return
        Lb:
            float r2 = r9.getMapZoomer()
            float r3 = r8.mapLevelTo
            float r3 = r3 - r2
            float r3 = java.lang.Math.abs(r3)
            double r3 = (double) r3
            r5 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L25
            r8.isOver = r0
            r8.hasCheckParams = r0
            return
        L25:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r8.zoomParam
            r3.setFromValue(r2)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomParam
            float r3 = r8.mapLevelTo
            r2.setToValue(r3)
            boolean r2 = r8.zoomCenter
            if (r2 != 0) goto L5f
            com.autonavi.amap.mapcore.IPoint r2 = com.autonavi.amap.mapcore.IPoint.obtain()
            r9.getMapGeoCenter(r2)
            int r3 = r2.x
            r8.beginCenterGeoX = r3
            int r3 = r2.y
            r8.beginCenterGeoY = r3
            com.autonavi.amap.mapcore.IPoint r3 = com.autonavi.amap.mapcore.IPoint.obtain()
            float r4 = r8.winPivotX
            int r4 = (int) r4
            float r5 = r8.winPivotY
            int r5 = (int) r5
            r9.screenToP20Point(r4, r5, r3)
            int r9 = r3.x
            r8.pivotGeoX = r9
            int r9 = r3.y
            r8.pivotGeoY = r9
            r2.recycle()
            r3.recycle()
        L5f:
            r8.hasCheckParams = r0
            r8.isOver = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.startTime = r0
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public void doAnimation(java.lang.Object r8) {
            r7 = this;
            r0 = r8
            com.autonavi.base.ae.gmap.GLMapState r0 = (com.autonavi.base.ae.gmap.GLMapState) r0
            if (r0 != 0) goto L7
            goto L87
        L7:
            boolean r1 = r7.hasCheckParams
            if (r1 != 0) goto Le
            r7.commitAnimation(r8)
        Le:
            boolean r8 = r7.isOver
            if (r8 == 0) goto L13
            goto L87
        L13:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r7.startTime
            long r1 = r1 - r3
            r7.offsetTime = r1
            float r8 = (float) r1
            int r1 = r7.duration
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L2c
            r7.isOver = r1
            r8 = 1065353216(0x3f800000, float:1.0)
        L2c:
            r3 = 0
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L87
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 > 0) goto L87
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r7.zoomParam
            r3.setNormalizedTime(r8)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r8 = r7.zoomParam
            float r8 = r8.getCurValue()
            r3 = 1101004800(0x41a00000, float:20.0)
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 <= 0) goto L4a
            r7.isOver = r1
            r8 = 1101004800(0x41a00000, float:20.0)
        L4a:
            r3 = 1077936128(0x40400000, float:3.0)
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 >= 0) goto L54
            r7.isOver = r1
            r8 = 1077936128(0x40400000, float:3.0)
        L54:
            boolean r1 = r7.zoomCenter
            if (r1 != 0) goto L84
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r1 = r7.zoomParam
            float r1 = r1.getFromValue()
            float r1 = r8 - r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = (double) r1
            double r3 = java.lang.Math.pow(r3, r5)
            float r1 = (float) r3
            int r3 = r7.pivotGeoX
            int r4 = r7.beginCenterGeoX
            int r3 = r3 - r4
            float r3 = (float) r3
            float r1 = r2 / r1
            float r2 = r2 - r1
            float r3 = r3 * r2
            int r1 = (int) r3
            int r3 = r7.pivotGeoY
            int r5 = r7.beginCenterGeoY
            int r3 = r3 - r5
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = (int) r3
            int r4 = r4 + r1
            double r3 = (double) r4
            int r5 = r5 + r2
            double r1 = (double) r5
            r0.setMapGeoCenter(r3, r1)
        L84:
            r0.setMapZoomer(r8)
        L87:
            return
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.isOver = r0
            r2.hasCheckParams = r0
            r1 = 1
            r2.zoomCenter = r1
            r1 = 0
            r2.mapLevelTo = r1
            r2.beginCenterGeoX = r0
            r2.beginCenterGeoY = r0
            r2.pivotGeoX = r0
            r2.pivotGeoY = r0
            r2.winPivotX = r1
            r2.winPivotY = r1
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomParam
            if (r0 == 0) goto L1e
            r0.reset()
        L1e:
            return
    }

    public void setToMapZoomAndPivot(float r3, int r4, android.graphics.Point r5) {
            r2 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V
            r0.<init>()
            r2.zoomParam = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setInterpolatorType(r4, r1)
            r4 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L14
            r3 = 1101004800(0x41a00000, float:20.0)
        L14:
            r4 = 1077936128(0x40400000, float:3.0)
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1c
            r3 = 1077936128(0x40400000, float:3.0)
        L1c:
            r2.mapLevelTo = r3
            if (r5 == 0) goto L2d
            int r3 = r5.x
            float r3 = (float) r3
            r2.winPivotX = r3
            int r3 = r5.y
            float r3 = (float) r3
            r2.winPivotY = r3
            r3 = 0
            r2.zoomCenter = r3
        L2d:
            return
    }
}

package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdglMapAnimGroup extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation {
    public static final int CAMERA_MAX_DEGREE = 80;
    public static final int CAMERA_MIN_DEGREE = 0;
    public static final int MAXMAPLEVEL = 20;
    public static final int MINMAPLEVEL = 3;
    int endZoomDuration;
    boolean hasCheckParams;
    boolean hasMidZoom;
    int midZoomDuration;
    com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V moveParam;
    public boolean needMove;
    boolean needRotateCamera;
    boolean needRotateMap;
    boolean needZoom;
    com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V rotateCameraParam;
    com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V rotateMapParam;
    int startZoomDuration;
    com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V zoomEndParam;
    com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V zoomStartParam;

    public AdglMapAnimGroup(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zoomStartParam = r0
            r1.zoomEndParam = r0
            r1.moveParam = r0
            r1.rotateMapParam = r0
            r1.rotateCameraParam = r0
            r1.reset()
            r1.duration = r2
            return
    }

    public static boolean checkLevel(float r1) {
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            r0 = 1101004800(0x41a00000, float:20.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 > 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private void initZoomEndParam(float r3, float r4, int r5) {
            r2 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomEndParam
            if (r0 != 0) goto Lb
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V
            r0.<init>()
            r2.zoomEndParam = r0
        Lb:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomEndParam
            r0.reset()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomEndParam
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setInterpolatorType(r5, r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r5 = r2.zoomEndParam
            r5.setToValue(r4)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r4 = r2.zoomEndParam
            r4.setFromValue(r3)
            return
    }

    private void initZoomStartParam(float r3, int r4) {
            r2 = this;
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomStartParam
            if (r0 != 0) goto Lb
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V
            r0.<init>()
            r2.zoomStartParam = r0
        Lb:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomStartParam
            r0.reset()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomStartParam
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setInterpolatorType(r4, r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r4 = r2.zoomStartParam
            r4.setToValue(r3)
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
            boolean r2 = r8.needZoom
            if (r2 == 0) goto La2
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomStartParam
            if (r2 != 0) goto L16
            r8.hasCheckParams = r0
            return
        L16:
            float r2 = r9.getMapZoomer()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r8.zoomStartParam
            r3.setFromValue(r2)
            boolean r3 = r8.hasMidZoom
            r4 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            if (r3 == 0) goto L6f
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r8.zoomStartParam
            float r3 = r3.getToValue()
            float r3 = r3 - r2
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomEndParam
            float r2 = r2.getFromValue()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r6 = r8.zoomEndParam
            float r6 = r6.getToValue()
            float r2 = r2 - r6
            float r3 = java.lang.Math.abs(r3)
            double r6 = (double) r3
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 < 0) goto L5a
            float r2 = java.lang.Math.abs(r2)
            double r2 = (double) r2
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L4f
            goto L5a
        L4f:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomStartParam
            r2.needToCaculate()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomEndParam
            r2.needToCaculate()
            goto L6f
        L5a:
            r8.hasMidZoom = r1
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomStartParam
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r8.zoomEndParam
            float r3 = r3.getToValue()
            r2.setToValue(r3)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomStartParam
            r2.needToCaculate()
            r2 = 0
            r8.zoomEndParam = r2
        L6f:
            boolean r2 = r8.hasMidZoom
            if (r2 != 0) goto L8b
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomStartParam
            float r2 = r2.getFromValue()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r8.zoomStartParam
            float r3 = r3.getToValue()
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            double r2 = (double) r2
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L8b
            r8.needZoom = r1
        L8b:
            boolean r2 = r8.needZoom
            if (r2 == 0) goto La2
            boolean r2 = r8.hasMidZoom
            if (r2 == 0) goto L9e
            int r2 = r8.duration
            int r3 = r8.midZoomDuration
            int r2 = r2 - r3
            int r2 = r2 >> r0
            r8.startZoomDuration = r2
            r8.endZoomDuration = r2
            goto La2
        L9e:
            int r2 = r8.duration
            r8.startZoomDuration = r2
        La2:
            boolean r2 = r8.needMove
            if (r2 == 0) goto Lc7
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r2 = r8.moveParam
            if (r2 == 0) goto Lc7
            com.autonavi.amap.mapcore.IPoint r2 = com.autonavi.amap.mapcore.IPoint.obtain()
            r9.getMapGeoCenter(r2)
            int r3 = r2.x
            int r4 = r2.y
            r2.recycle()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r2 = r8.moveParam
            double r5 = (double) r3
            double r3 = (double) r4
            r2.setFromValue(r5, r3)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r2 = r8.moveParam
            boolean r2 = r2.needToCaculate()
            r8.needMove = r2
        Lc7:
            boolean r2 = r8.needRotateMap
            if (r2 == 0) goto L10b
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.rotateMapParam
            if (r2 == 0) goto L10b
            float r2 = r9.getMapAngle()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r3 = r8.rotateMapParam
            float r3 = r3.getToValue()
            r4 = 1127481344(0x43340000, float:180.0)
            r5 = 1135869952(0x43b40000, float:360.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto Le8
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto Le8
            r3 = 1135869952(0x43b40000, float:360.0)
        Le8:
            int r6 = (int) r3
            int r7 = (int) r2
            int r6 = r6 - r7
            float r6 = (float) r6
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lf2
            float r3 = r3 - r5
            goto Lf9
        Lf2:
            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lf9
            float r3 = r3 + r5
        Lf9:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r4 = r8.rotateMapParam
            r4.setFromValue(r2)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.rotateMapParam
            r2.setToValue(r3)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.rotateMapParam
            boolean r2 = r2.needToCaculate()
            r8.needRotateMap = r2
        L10b:
            boolean r2 = r8.needRotateCamera
            if (r2 == 0) goto L124
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.rotateCameraParam
            if (r2 == 0) goto L124
            float r9 = r9.getCameraDegree()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.rotateCameraParam
            r2.setFromValue(r9)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.rotateCameraParam
            boolean r9 = r9.needToCaculate()
            r8.needRotateCamera = r9
        L124:
            boolean r9 = r8.needMove
            if (r9 != 0) goto L137
            boolean r9 = r8.needZoom
            if (r9 != 0) goto L137
            boolean r9 = r8.needRotateMap
            if (r9 != 0) goto L137
            boolean r9 = r8.needRotateCamera
            if (r9 != 0) goto L137
            r8.isOver = r0
            goto L139
        L137:
            r8.isOver = r1
        L139:
            r8.hasCheckParams = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.startTime = r0
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public void doAnimation(java.lang.Object r9) {
            r8 = this;
            r0 = r9
            com.autonavi.base.ae.gmap.GLMapState r0 = (com.autonavi.base.ae.gmap.GLMapState) r0
            if (r0 != 0) goto L7
            goto L108
        L7:
            boolean r1 = r8.hasCheckParams
            if (r1 != 0) goto Le
            r8.commitAnimation(r9)
        Le:
            boolean r9 = r8.isOver
            if (r9 == 0) goto L14
            goto L108
        L14:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r8.startTime
            long r1 = r1 - r3
            r8.offsetTime = r1
            int r9 = r8.duration
            float r3 = (float) r9
            r4 = 0
            r5 = 1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L29
            r8.isOver = r5
            return
        L29:
            float r1 = (float) r1
            float r9 = (float) r9
            float r1 = r1 / r9
            r9 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 <= 0) goto L37
            r8.isOver = r5
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L3e
        L37:
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r9 >= 0) goto L3e
            r8.isOver = r5
            return
        L3e:
            boolean r9 = r8.needZoom
            if (r9 == 0) goto L9e
            r0.getMapZoomer()
            boolean r9 = r8.hasMidZoom
            if (r9 == 0) goto L90
            long r2 = r8.offsetTime
            int r9 = r8.startZoomDuration
            long r4 = (long) r9
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L61
            float r2 = (float) r2
            float r9 = (float) r9
            float r2 = r2 / r9
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.zoomStartParam
            r9.setNormalizedTime(r2)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.zoomStartParam
            float r9 = r9.getCurValue()
            goto L85
        L61:
            int r4 = r8.midZoomDuration
            int r5 = r9 + r4
            long r5 = (long) r5
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 > 0) goto L71
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.zoomStartParam
            float r9 = r9.getToValue()
            goto L85
        L71:
            long r5 = (long) r9
            long r2 = r2 - r5
            long r4 = (long) r4
            long r2 = r2 - r4
            float r9 = (float) r2
            int r2 = r8.endZoomDuration
            float r2 = (float) r2
            float r9 = r9 / r2
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r2 = r8.zoomEndParam
            r2.setNormalizedTime(r9)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.zoomEndParam
            float r9 = r9.getCurValue()
        L85:
            boolean r2 = r8.isOver
            if (r2 == 0) goto L9b
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.zoomEndParam
            float r9 = r9.getToValue()
            goto L9b
        L90:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.zoomStartParam
            r9.setNormalizedTime(r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.zoomStartParam
            float r9 = r9.getCurValue()
        L9b:
            r0.setMapZoomer(r9)
        L9e:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r9 = r8.moveParam
            if (r9 == 0) goto Ldc
            boolean r2 = r8.needMove
            if (r2 == 0) goto Ldc
            r9.setNormalizedTime(r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r9 = r8.moveParam
            double r2 = r9.getFromXValue()
            int r9 = (int) r2
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r2 = r8.moveParam
            double r2 = r2.getFromYValue()
            int r2 = (int) r2
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r3 = r8.moveParam
            double r3 = r3.getToXValue()
            int r3 = (int) r3
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r4 = r8.moveParam
            double r4 = r4.getToYValue()
            int r4 = (int) r4
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r5 = r8.moveParam
            float r5 = r5.getCurMult()
            int r3 = r3 - r9
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r2
            float r4 = (float) r4
            float r4 = r4 * r5
            int r4 = (int) r4
            int r9 = r9 + r3
            double r5 = (double) r9
            int r2 = r2 + r4
            double r2 = (double) r2
            r0.setMapGeoCenter(r5, r2)
        Ldc:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.rotateMapParam
            if (r9 == 0) goto Lf2
            boolean r2 = r8.needRotateMap
            if (r2 == 0) goto Lf2
            r9.setNormalizedTime(r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.rotateMapParam
            float r9 = r9.getCurValue()
            int r9 = (int) r9
            float r9 = (float) r9
            r0.setMapAngle(r9)
        Lf2:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.rotateCameraParam
            if (r9 == 0) goto L108
            boolean r2 = r8.needRotateCamera
            if (r2 == 0) goto L108
            r9.setNormalizedTime(r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r9 = r8.rotateCameraParam
            float r9 = r9.getCurValue()
            int r9 = (int) r9
            float r9 = (float) r9
            r0.setCameraDegree(r9)
        L108:
            return
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public boolean isValid() {
            r1 = this;
            boolean r0 = r1.needRotateCamera
            if (r0 != 0) goto L13
            boolean r0 = r1.needRotateMap
            if (r0 != 0) goto L13
            boolean r0 = r1.needMove
            if (r0 != 0) goto L13
            boolean r0 = r1.needZoom
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.isOver = r0
            r2.hasCheckParams = r0
            r2.needZoom = r0
            r2.needMove = r0
            r1 = 0
            r2.moveParam = r1
            r2.needRotateMap = r0
            r2.rotateMapParam = r1
            r2.hasMidZoom = r0
            r2.duration = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r2.moveParam
            if (r0 == 0) goto L1b
            r0.reset()
        L1b:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomStartParam
            if (r0 == 0) goto L22
            r0.reset()
        L22:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.zoomEndParam
            if (r0 == 0) goto L29
            r0.reset()
        L29:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.rotateCameraParam
            if (r0 == 0) goto L30
            r0.reset()
        L30:
            return
    }

    public void setDuration(int r1) {
            r0 = this;
            r0.duration = r1
            return
    }

    public void setToCameraDegree(float r3, int r4) {
            r2 = this;
            r0 = 0
            r2.needRotateCamera = r0
            r0 = 1117782016(0x42a00000, float:80.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L2d
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L2d
            r0 = 1
            r2.needRotateCamera = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.rotateCameraParam
            if (r0 != 0) goto L1c
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V
            r0.<init>()
            r2.rotateCameraParam = r0
        L1c:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.rotateCameraParam
            r0.reset()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.rotateCameraParam
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setInterpolatorType(r4, r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r4 = r2.rotateCameraParam
            r4.setToValue(r3)
        L2d:
            return
    }

    public void setToMapAngle(float r3, int r4) {
            r2 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r0 = 1
            r2.needRotateMap = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.rotateMapParam
            if (r0 != 0) goto L11
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V
            r0.<init>()
            r2.rotateMapParam = r0
        L11:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.rotateMapParam
            r0.reset()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r0 = r2.rotateMapParam
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setInterpolatorType(r4, r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V r4 = r2.rotateMapParam
            r4.setToValue(r3)
            return
    }

    public void setToMapCenterGeo(int r3, int r4, int r5) {
            r2 = this;
            if (r3 <= 0) goto L25
            if (r4 <= 0) goto L25
            r0 = 1
            r2.needMove = r0
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r2.moveParam
            if (r0 != 0) goto L12
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V
            r0.<init>()
            r2.moveParam = r0
        L12:
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r2.moveParam
            r0.reset()
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r0 = r2.moveParam
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setInterpolatorType(r5, r1)
            com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam2V r5 = r2.moveParam
            double r0 = (double) r3
            double r3 = (double) r4
            r5.setToValue(r0, r3)
        L25:
            return
    }

    public void setToMapLevel(float r4, float r5, int r6) {
            r3 = this;
            r0 = 1
            r3.needZoom = r0
            r1 = 0
            r3.midZoomDuration = r1
            r3.hasMidZoom = r1
            if (r6 <= 0) goto L10
            int r2 = r3.duration
            if (r6 >= r2) goto L10
            r3.midZoomDuration = r6
        L10:
            boolean r6 = checkLevel(r4)
            if (r6 == 0) goto L25
            boolean r6 = checkLevel(r5)
            if (r6 == 0) goto L25
            r3.hasMidZoom = r0
            r3.initZoomStartParam(r5, r1)
            r3.initZoomEndParam(r5, r4, r1)
            return
        L25:
            boolean r6 = checkLevel(r4)
            if (r6 == 0) goto L31
            r3.hasMidZoom = r1
            r3.initZoomStartParam(r4, r1)
            return
        L31:
            boolean r4 = checkLevel(r5)
            if (r4 == 0) goto L3d
            r3.hasMidZoom = r1
            r3.initZoomStartParam(r5, r1)
            return
        L3d:
            r3.needZoom = r1
            return
    }

    public void setToMapLevel(float r3, int r4) {
            r2 = this;
            r0 = 1
            r2.needZoom = r0
            r0 = 0
            r2.midZoomDuration = r0
            r2.hasMidZoom = r0
            boolean r1 = checkLevel(r3)
            if (r1 == 0) goto L12
            r2.initZoomStartParam(r3, r4)
            return
        L12:
            r2.needZoom = r0
            return
    }

    public boolean typeEqueal(com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup r3) {
            r2 = this;
            boolean r0 = r2.needRotateCamera
            boolean r1 = r3.needRotateCamera
            if (r0 != r1) goto L1a
            boolean r0 = r2.needRotateMap
            boolean r1 = r3.needRotateMap
            if (r0 != r1) goto L1a
            boolean r0 = r2.needZoom
            boolean r1 = r3.needZoom
            if (r0 != r1) goto L1a
            boolean r0 = r2.needMove
            boolean r3 = r3.needMove
            if (r0 != r3) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }
}

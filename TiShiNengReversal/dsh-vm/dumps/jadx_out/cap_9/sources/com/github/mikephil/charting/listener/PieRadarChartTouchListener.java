package com.github.mikephil.charting.listener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PieRadarChartTouchListener extends com.github.mikephil.charting.listener.ChartTouchListener<com.github.mikephil.charting.charts.PieRadarChartBase<?>> {
    private java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample> _velocitySamples;
    private float mDecelerationAngularVelocity;
    private long mDecelerationLastTime;
    private float mStartAngle;
    private com.github.mikephil.charting.utils.MPPointF mTouchStartPoint;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class AngularVelocitySample {
        public float angle;
        final /* synthetic */ com.github.mikephil.charting.listener.PieRadarChartTouchListener this$0;
        public long time;

        public AngularVelocitySample(com.github.mikephil.charting.listener.PieRadarChartTouchListener r1, long r2, float r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.time = r2
                r0.angle = r4
                return
        }
    }

    public PieRadarChartTouchListener(com.github.mikephil.charting.charts.PieRadarChartBase<?> r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3, r3)
            r2.mTouchStartPoint = r0
            r2.mStartAngle = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2._velocitySamples = r0
            r0 = 0
            r2.mDecelerationLastTime = r0
            r2.mDecelerationAngularVelocity = r3
            return
    }

    private float calculateVelocity() {
            r13 = this;
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r0 = r13._velocitySamples
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r0 = r13._velocitySamples
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample r0 = (com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample) r0
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r3 = r13._velocitySamples
            int r4 = r3.size()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r3 = r3.get(r4)
            com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample r3 = (com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample) r3
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r4 = r13._velocitySamples
            int r4 = r4.size()
            int r4 = r4 - r5
            r6 = r0
        L29:
            if (r4 < 0) goto L3f
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r6 = r13._velocitySamples
            java.lang.Object r6 = r6.get(r4)
            com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample r6 = (com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample) r6
            float r7 = r6.angle
            float r8 = r3.angle
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L3c
            goto L3f
        L3c:
            int r4 = r4 + (-1)
            goto L29
        L3f:
            long r7 = r3.time
            long r9 = r0.time
            long r7 = r7 - r9
            float r4 = (float) r7
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r7
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L4f
            r4 = 1036831949(0x3dcccccd, float:0.1)
        L4f:
            float r1 = r3.angle
            float r6 = r6.angle
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 < 0) goto L58
            r2 = 1
        L58:
            float r1 = r1 - r6
            float r1 = java.lang.Math.abs(r1)
            double r5 = (double) r1
            r7 = 4643457506423603200(0x4070e00000000000, double:270.0)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L69
            r2 = r2 ^ 1
        L69:
            float r1 = r3.angle
            float r5 = r0.angle
            float r6 = r1 - r5
            double r6 = (double) r6
            r8 = 4645040803167600640(0x4076800000000000, double:360.0)
            r10 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 <= 0) goto L84
            double r5 = (double) r5
            double r5 = r5 + r8
            float r1 = (float) r5
            r0.angle = r1
            goto L8f
        L84:
            float r5 = r5 - r1
            double r5 = (double) r5
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L8f
            double r5 = (double) r1
            double r5 = r5 + r8
            float r1 = (float) r5
            r3.angle = r1
        L8f:
            float r1 = r3.angle
            float r0 = r0.angle
            float r1 = r1 - r0
            float r1 = r1 / r4
            float r0 = java.lang.Math.abs(r1)
            if (r2 != 0) goto L9c
            float r0 = -r0
        L9c:
            return r0
    }

    private void resetVelocity() {
            r1 = this;
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r0 = r1._velocitySamples
            r0.clear()
            return
    }

    private void sampleVelocity(float r8, float r9) {
            r7 = this;
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r2 = r7._velocitySamples
            com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample r3 = new com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample
            T extends com.github.mikephil.charting.charts.Chart<?> r4 = r7.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r4 = (com.github.mikephil.charting.charts.PieRadarChartBase) r4
            float r8 = r4.getAngleForPoint(r8, r9)
            r3.<init>(r7, r0, r8)
            r2.add(r3)
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r8 = r7._velocitySamples
            int r8 = r8.size()
        L1c:
            int r9 = r8 + (-2)
            if (r9 <= 0) goto L3b
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r9 = r7._velocitySamples
            r2 = 0
            java.lang.Object r9 = r9.get(r2)
            com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample r9 = (com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample) r9
            long r3 = r9.time
            long r3 = r0 - r3
            r5 = 1000(0x3e8, double:4.94E-321)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L3b
            java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener$AngularVelocitySample> r9 = r7._velocitySamples
            r9.remove(r2)
            int r8 = r8 + (-1)
            goto L1c
        L3b:
            return
    }

    public void computeScroll() {
            r6 = this;
            float r0 = r6.mDecelerationAngularVelocity
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8
            return
        L8:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r2 = r6.mDecelerationAngularVelocity
            T extends com.github.mikephil.charting.charts.Chart<?> r3 = r6.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r3 = (com.github.mikephil.charting.charts.PieRadarChartBase) r3
            float r3 = r3.getDragDecelerationFrictionCoef()
            float r2 = r2 * r3
            r6.mDecelerationAngularVelocity = r2
            long r2 = r6.mDecelerationLastTime
            long r2 = r0 - r2
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            T extends com.github.mikephil.charting.charts.Chart<?> r3 = r6.mChart
            r4 = r3
            com.github.mikephil.charting.charts.PieRadarChartBase r4 = (com.github.mikephil.charting.charts.PieRadarChartBase) r4
            com.github.mikephil.charting.charts.PieRadarChartBase r3 = (com.github.mikephil.charting.charts.PieRadarChartBase) r3
            float r3 = r3.getRotationAngle()
            float r5 = r6.mDecelerationAngularVelocity
            float r5 = r5 * r2
            float r3 = r3 + r5
            r4.setRotationAngle(r3)
            r6.mDecelerationLastTime = r0
            float r0 = r6.mDecelerationAngularVelocity
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L4d
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r6.mChart
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(r0)
            return
        L4d:
            r6.stopDeceleration()
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent r2) {
            r1 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.LONG_PRESS
            r1.mLastGesture = r0
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r1.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r0 = (com.github.mikephil.charting.charts.PieRadarChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto L11
            r0.onChartLongPressed(r2)
        L11:
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent r4) {
            r3 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.SINGLE_TAP
            r3.mLastGesture = r0
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r3.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r0 = (com.github.mikephil.charting.charts.PieRadarChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto L11
            r0.onChartSingleTapped(r4)
        L11:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r3.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r0 = (com.github.mikephil.charting.charts.PieRadarChartBase) r0
            boolean r0 = r0.isHighlightPerTapEnabled()
            if (r0 != 0) goto L1d
            r4 = 0
            return r4
        L1d:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r3.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r0 = (com.github.mikephil.charting.charts.PieRadarChartBase) r0
            float r1 = r4.getX()
            float r2 = r4.getY()
            com.github.mikephil.charting.highlight.Highlight r0 = r0.getHighlightByTouchPoint(r1, r2)
            r3.performHighlight(r0, r4)
            r4 = 1
            return r4
    }

    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            android.view.GestureDetector r6 = r5.mGestureDetector
            boolean r6 = r6.onTouchEvent(r7)
            r0 = 1
            if (r6 == 0) goto La
            return r0
        La:
            T extends com.github.mikephil.charting.charts.Chart<?> r6 = r5.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r6 = (com.github.mikephil.charting.charts.PieRadarChartBase) r6
            boolean r6 = r6.isRotationEnabled()
            if (r6 == 0) goto Lc2
            float r6 = r7.getX()
            float r1 = r7.getY()
            int r2 = r7.getAction()
            if (r2 == 0) goto La3
            if (r2 == r0) goto L6f
            r3 = 2
            if (r2 == r3) goto L29
            goto Lc2
        L29:
            T extends com.github.mikephil.charting.charts.Chart<?> r2 = r5.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r2 = (com.github.mikephil.charting.charts.PieRadarChartBase) r2
            boolean r2 = r2.isDragDecelerationEnabled()
            if (r2 == 0) goto L36
            r5.sampleVelocity(r6, r1)
        L36:
            int r2 = r5.mTouchMode
            r3 = 6
            if (r2 != 0) goto L5d
            com.github.mikephil.charting.utils.MPPointF r2 = r5.mTouchStartPoint
            float r4 = r2.x
            float r2 = r2.y
            float r2 = com.github.mikephil.charting.listener.ChartTouchListener.distance(r6, r4, r1, r2)
            r4 = 1090519040(0x41000000, float:8.0)
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L5d
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r6 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.ROTATE
            r5.mLastGesture = r6
            r5.mTouchMode = r3
            T extends com.github.mikephil.charting.charts.Chart<?> r6 = r5.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r6 = (com.github.mikephil.charting.charts.PieRadarChartBase) r6
            r6.disableScroll()
            goto L6b
        L5d:
            int r2 = r5.mTouchMode
            if (r2 != r3) goto L6b
            r5.updateGestureRotation(r6, r1)
            T extends com.github.mikephil.charting.charts.Chart<?> r6 = r5.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r6 = (com.github.mikephil.charting.charts.PieRadarChartBase) r6
            r6.invalidate()
        L6b:
            r5.endAction(r7)
            goto Lc2
        L6f:
            T extends com.github.mikephil.charting.charts.Chart<?> r2 = r5.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r2 = (com.github.mikephil.charting.charts.PieRadarChartBase) r2
            boolean r2 = r2.isDragDecelerationEnabled()
            if (r2 == 0) goto L95
            r5.stopDeceleration()
            r5.sampleVelocity(r6, r1)
            float r6 = r5.calculateVelocity()
            r5.mDecelerationAngularVelocity = r6
            r1 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 == 0) goto L95
            long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r5.mDecelerationLastTime = r1
            T extends com.github.mikephil.charting.charts.Chart<?> r6 = r5.mChart
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(r6)
        L95:
            T extends com.github.mikephil.charting.charts.Chart<?> r6 = r5.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r6 = (com.github.mikephil.charting.charts.PieRadarChartBase) r6
            r6.enableScroll()
            r6 = 0
            r5.mTouchMode = r6
            r5.endAction(r7)
            goto Lc2
        La3:
            r5.startAction(r7)
            r5.stopDeceleration()
            r5.resetVelocity()
            T extends com.github.mikephil.charting.charts.Chart<?> r7 = r5.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r7 = (com.github.mikephil.charting.charts.PieRadarChartBase) r7
            boolean r7 = r7.isDragDecelerationEnabled()
            if (r7 == 0) goto Lb9
            r5.sampleVelocity(r6, r1)
        Lb9:
            r5.setGestureStartAngle(r6, r1)
            com.github.mikephil.charting.utils.MPPointF r7 = r5.mTouchStartPoint
            r7.x = r6
            r7.y = r1
        Lc2:
            return r0
    }

    public void setGestureStartAngle(float r2, float r3) {
            r1 = this;
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r1.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r0 = (com.github.mikephil.charting.charts.PieRadarChartBase) r0
            float r2 = r0.getAngleForPoint(r2, r3)
            T extends com.github.mikephil.charting.charts.Chart<?> r3 = r1.mChart
            com.github.mikephil.charting.charts.PieRadarChartBase r3 = (com.github.mikephil.charting.charts.PieRadarChartBase) r3
            float r3 = r3.getRawRotationAngle()
            float r2 = r2 - r3
            r1.mStartAngle = r2
            return
    }

    public void stopDeceleration() {
            r1 = this;
            r0 = 0
            r1.mDecelerationAngularVelocity = r0
            return
    }

    public void updateGestureRotation(float r3, float r4) {
            r2 = this;
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            r1 = r0
            com.github.mikephil.charting.charts.PieRadarChartBase r1 = (com.github.mikephil.charting.charts.PieRadarChartBase) r1
            com.github.mikephil.charting.charts.PieRadarChartBase r0 = (com.github.mikephil.charting.charts.PieRadarChartBase) r0
            float r3 = r0.getAngleForPoint(r3, r4)
            float r4 = r2.mStartAngle
            float r3 = r3 - r4
            r1.setRotationAngle(r3)
            return
    }
}

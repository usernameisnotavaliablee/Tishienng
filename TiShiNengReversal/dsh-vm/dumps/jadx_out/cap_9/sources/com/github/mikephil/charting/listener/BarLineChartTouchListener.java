package com.github.mikephil.charting.listener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BarLineChartTouchListener extends com.github.mikephil.charting.listener.ChartTouchListener<com.github.mikephil.charting.charts.BarLineChartBase<? extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>>> {
    private com.github.mikephil.charting.interfaces.datasets.IDataSet mClosestDataSetToTouch;
    private com.github.mikephil.charting.utils.MPPointF mDecelerationCurrentPoint;
    private long mDecelerationLastTime;
    private com.github.mikephil.charting.utils.MPPointF mDecelerationVelocity;
    private float mDragTriggerDist;
    private android.graphics.Matrix mMatrix;
    private float mMinScalePointerDistance;
    private float mSavedDist;
    private android.graphics.Matrix mSavedMatrix;
    private float mSavedXDist;
    private float mSavedYDist;
    private com.github.mikephil.charting.utils.MPPointF mTouchPointCenter;
    private com.github.mikephil.charting.utils.MPPointF mTouchStartPoint;
    private android.view.VelocityTracker mVelocityTracker;

    public BarLineChartTouchListener(com.github.mikephil.charting.charts.BarLineChartBase<? extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>> r3, android.graphics.Matrix r4, float r5) {
            r2 = this;
            r2.<init>(r3)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2.mMatrix = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2.mSavedMatrix = r3
            r3 = 0
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3, r3)
            r2.mTouchStartPoint = r0
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3, r3)
            r2.mTouchPointCenter = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.mSavedXDist = r0
            r2.mSavedYDist = r0
            r2.mSavedDist = r0
            r0 = 0
            r2.mDecelerationLastTime = r0
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3, r3)
            r2.mDecelerationCurrentPoint = r0
            com.github.mikephil.charting.utils.MPPointF r3 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3, r3)
            r2.mDecelerationVelocity = r3
            r2.mMatrix = r4
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r5)
            r2.mDragTriggerDist = r3
            r3 = 1080033280(0x40600000, float:3.5)
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.mMinScalePointerDistance = r3
            return
    }

    private static float getXDist(android.view.MotionEvent r2) {
            r0 = 0
            float r0 = r2.getX(r0)
            r1 = 1
            float r2 = r2.getX(r1)
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            return r2
    }

    private static float getYDist(android.view.MotionEvent r2) {
            r0 = 0
            float r0 = r2.getY(r0)
            r1 = 1
            float r2 = r2.getY(r1)
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            return r2
    }

    private boolean inverted() {
            r2 = this;
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r2.mClosestDataSetToTouch
            if (r0 != 0) goto Le
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.isAnyAxisInverted()
            if (r0 != 0) goto L20
        Le:
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r2.mClosestDataSetToTouch
            if (r0 == 0) goto L22
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r0.getAxisDependency()
            boolean r0 = r1.isInverted(r0)
            if (r0 == 0) goto L22
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    private static void midPoint(com.github.mikephil.charting.utils.MPPointF r4, android.view.MotionEvent r5) {
            r0 = 0
            float r1 = r5.getX(r0)
            r2 = 1
            float r3 = r5.getX(r2)
            float r1 = r1 + r3
            float r0 = r5.getY(r0)
            float r5 = r5.getY(r2)
            float r0 = r0 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r5
            r4.x = r1
            float r0 = r0 / r5
            r4.y = r0
            return
    }

    private void performDrag(android.view.MotionEvent r3, float r4, float r5) {
            r2 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG
            r2.mLastGesture = r0
            android.graphics.Matrix r0 = r2.mMatrix
            android.graphics.Matrix r1 = r2.mSavedMatrix
            r0.set(r1)
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            boolean r1 = r2.inverted()
            if (r1 == 0) goto L22
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r2.mChart
            boolean r1 = r1 instanceof com.github.mikephil.charting.charts.HorizontalBarChart
            if (r1 == 0) goto L21
            float r4 = -r4
            goto L22
        L21:
            float r5 = -r5
        L22:
            android.graphics.Matrix r1 = r2.mMatrix
            r1.postTranslate(r4, r5)
            if (r0 == 0) goto L2c
            r0.onChartTranslate(r3, r4, r5)
        L2c:
            return
    }

    private void performHighlightDrag(android.view.MotionEvent r3) {
            r2 = this;
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            float r1 = r3.getX()
            float r3 = r3.getY()
            com.github.mikephil.charting.highlight.Highlight r3 = r0.getHighlightByTouchPoint(r1, r3)
            if (r3 == 0) goto L24
            com.github.mikephil.charting.highlight.Highlight r0 = r2.mLastHighlighted
            boolean r0 = r3.equalTo(r0)
            if (r0 != 0) goto L24
            r2.mLastHighlighted = r3
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            r1 = 1
            r0.highlightValue(r3, r1)
        L24:
            return
    }

    private void performZoom(android.view.MotionEvent r11) {
            r10 = this;
            int r0 = r11.getPointerCount()
            r1 = 2
            if (r0 < r1) goto L10a
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r10.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            float r2 = spacing(r11)
            float r3 = r10.mMinScalePointerDistance
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L10a
            com.github.mikephil.charting.utils.MPPointF r3 = r10.mTouchPointCenter
            float r4 = r3.x
            float r3 = r3.y
            com.github.mikephil.charting.utils.MPPointF r3 = r10.getTrans(r4, r3)
            T extends com.github.mikephil.charting.charts.Chart<?> r4 = r10.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r4 = (com.github.mikephil.charting.charts.BarLineChartBase) r4
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r4.getViewPortHandler()
            int r5 = r10.mTouchMode
            r6 = 4
            r7 = 0
            r8 = 1
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r6) goto L8a
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r1 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.PINCH_ZOOM
            r10.mLastGesture = r1
            float r1 = r10.mSavedDist
            float r2 = r2 / r1
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 >= 0) goto L40
            r7 = 1
        L40:
            if (r7 == 0) goto L47
            boolean r1 = r4.canZoomOutMoreX()
            goto L4b
        L47:
            boolean r1 = r4.canZoomInMoreX()
        L4b:
            if (r7 == 0) goto L52
            boolean r4 = r4.canZoomOutMoreY()
            goto L56
        L52:
            boolean r4 = r4.canZoomInMoreY()
        L56:
            T extends com.github.mikephil.charting.charts.Chart<?> r5 = r10.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r5 = (com.github.mikephil.charting.charts.BarLineChartBase) r5
            boolean r5 = r5.isScaleXEnabled()
            if (r5 == 0) goto L62
            r5 = r2
            goto L64
        L62:
            r5 = 1065353216(0x3f800000, float:1.0)
        L64:
            T extends com.github.mikephil.charting.charts.Chart<?> r6 = r10.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r6 = (com.github.mikephil.charting.charts.BarLineChartBase) r6
            boolean r6 = r6.isScaleYEnabled()
            if (r6 == 0) goto L6f
            r9 = r2
        L6f:
            if (r4 != 0) goto L73
            if (r1 == 0) goto L107
        L73:
            android.graphics.Matrix r1 = r10.mMatrix
            android.graphics.Matrix r2 = r10.mSavedMatrix
            r1.set(r2)
            android.graphics.Matrix r1 = r10.mMatrix
            float r2 = r3.x
            float r4 = r3.y
            r1.postScale(r5, r9, r2, r4)
            if (r0 == 0) goto L107
            r0.onChartScale(r11, r5, r9)
            goto L107
        L8a:
            if (r5 != r1) goto Lc6
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r10.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            boolean r1 = r1.isScaleXEnabled()
            if (r1 == 0) goto Lc6
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r1 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.X_ZOOM
            r10.mLastGesture = r1
            float r1 = getXDist(r11)
            float r2 = r10.mSavedXDist
            float r1 = r1 / r2
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 >= 0) goto Laa
            boolean r2 = r4.canZoomOutMoreX()
            goto Lae
        Laa:
            boolean r2 = r4.canZoomInMoreX()
        Lae:
            if (r2 == 0) goto L107
            android.graphics.Matrix r2 = r10.mMatrix
            android.graphics.Matrix r4 = r10.mSavedMatrix
            r2.set(r4)
            android.graphics.Matrix r2 = r10.mMatrix
            float r4 = r3.x
            float r5 = r3.y
            r2.postScale(r1, r9, r4, r5)
            if (r0 == 0) goto L107
            r0.onChartScale(r11, r1, r9)
            goto L107
        Lc6:
            int r1 = r10.mTouchMode
            r2 = 3
            if (r1 != r2) goto L107
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r10.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            boolean r1 = r1.isScaleYEnabled()
            if (r1 == 0) goto L107
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r1 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.Y_ZOOM
            r10.mLastGesture = r1
            float r1 = getYDist(r11)
            float r2 = r10.mSavedYDist
            float r1 = r1 / r2
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 >= 0) goto Le5
            r7 = 1
        Le5:
            if (r7 == 0) goto Lec
            boolean r2 = r4.canZoomOutMoreY()
            goto Lf0
        Lec:
            boolean r2 = r4.canZoomInMoreY()
        Lf0:
            if (r2 == 0) goto L107
            android.graphics.Matrix r2 = r10.mMatrix
            android.graphics.Matrix r4 = r10.mSavedMatrix
            r2.set(r4)
            android.graphics.Matrix r2 = r10.mMatrix
            float r4 = r3.x
            float r5 = r3.y
            r2.postScale(r9, r1, r4, r5)
            if (r0 == 0) goto L107
            r0.onChartScale(r11, r9, r1)
        L107:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r3)
        L10a:
            return
    }

    private void saveTouchStart(android.view.MotionEvent r3) {
            r2 = this;
            android.graphics.Matrix r0 = r2.mSavedMatrix
            android.graphics.Matrix r1 = r2.mMatrix
            r0.set(r1)
            com.github.mikephil.charting.utils.MPPointF r0 = r2.mTouchStartPoint
            float r1 = r3.getX()
            r0.x = r1
            com.github.mikephil.charting.utils.MPPointF r0 = r2.mTouchStartPoint
            float r1 = r3.getY()
            r0.y = r1
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            float r1 = r3.getX()
            float r3 = r3.getY()
            com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet r3 = r0.getDataSetByTouchPoint(r1, r3)
            r2.mClosestDataSetToTouch = r3
            return
    }

    private static float spacing(android.view.MotionEvent r4) {
            r0 = 0
            float r1 = r4.getX(r0)
            r2 = 1
            float r3 = r4.getX(r2)
            float r1 = r1 - r3
            float r0 = r4.getY(r0)
            float r4 = r4.getY(r2)
            float r0 = r0 - r4
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r4 = (float) r0
            return r4
    }

    public void computeScroll() {
            r11 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mDecelerationVelocity
            float r1 = r0.x
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L10
            float r0 = r0.y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
            return
        L10:
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mDecelerationVelocity
            float r1 = r0.x
            T extends com.github.mikephil.charting.charts.Chart<?> r5 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r5 = (com.github.mikephil.charting.charts.BarLineChartBase) r5
            float r5 = r5.getDragDecelerationFrictionCoef()
            float r1 = r1 * r5
            r0.x = r1
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mDecelerationVelocity
            float r1 = r0.y
            T extends com.github.mikephil.charting.charts.Chart<?> r5 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r5 = (com.github.mikephil.charting.charts.BarLineChartBase) r5
            float r5 = r5.getDragDecelerationFrictionCoef()
            float r1 = r1 * r5
            r0.y = r1
            long r0 = r11.mDecelerationLastTime
            long r0 = r3 - r0
            float r0 = (float) r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            com.github.mikephil.charting.utils.MPPointF r1 = r11.mDecelerationVelocity
            float r5 = r1.x
            float r5 = r5 * r0
            float r1 = r1.y
            float r1 = r1 * r0
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mDecelerationCurrentPoint
            float r6 = r0.x
            float r8 = r6 + r5
            r0.x = r8
            float r5 = r0.y
            float r9 = r5 + r1
            r0.y = r9
            r7 = 2
            r10 = 0
            r5 = r3
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            boolean r1 = r1.isDragXEnabled()
            if (r1 == 0) goto L6f
            com.github.mikephil.charting.utils.MPPointF r1 = r11.mDecelerationCurrentPoint
            float r1 = r1.x
            com.github.mikephil.charting.utils.MPPointF r5 = r11.mTouchStartPoint
            float r5 = r5.x
            float r1 = r1 - r5
            goto L70
        L6f:
            r1 = 0
        L70:
            T extends com.github.mikephil.charting.charts.Chart<?> r5 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r5 = (com.github.mikephil.charting.charts.BarLineChartBase) r5
            boolean r5 = r5.isDragYEnabled()
            if (r5 == 0) goto L83
            com.github.mikephil.charting.utils.MPPointF r2 = r11.mDecelerationCurrentPoint
            float r2 = r2.y
            com.github.mikephil.charting.utils.MPPointF r5 = r11.mTouchStartPoint
            float r5 = r5.y
            float r2 = r2 - r5
        L83:
            r11.performDrag(r0, r1, r2)
            r0.recycle()
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r0.getViewPortHandler()
            android.graphics.Matrix r1 = r11.mMatrix
            T extends com.github.mikephil.charting.charts.Chart<?> r2 = r11.mChart
            r5 = 0
            android.graphics.Matrix r0 = r0.refresh(r1, r2, r5)
            r11.mMatrix = r0
            r11.mDecelerationLastTime = r3
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mDecelerationVelocity
            float r0 = r0.x
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld0
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mDecelerationVelocity
            float r0 = r0.y
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lbe
            goto Ld0
        Lbe:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            r0.calculateOffsets()
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            r0.postInvalidate()
            r11.stopDeceleration()
            return
        Ld0:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(r0)
            return
    }

    public android.graphics.Matrix getMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrix
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getTrans(float r3, float r4) {
            r2 = this;
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r0.getViewPortHandler()
            float r1 = r0.offsetLeft()
            float r3 = r3 - r1
            boolean r1 = r2.inverted()
            if (r1 == 0) goto L1a
            float r0 = r0.offsetTop()
            float r4 = r4 - r0
            float r4 = -r4
            goto L2a
        L1a:
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            int r1 = r1.getMeasuredHeight()
            float r1 = (float) r1
            float r1 = r1 - r4
            float r4 = r0.offsetBottom()
            float r1 = r1 - r4
            float r4 = -r1
        L2a:
            com.github.mikephil.charting.utils.MPPointF r3 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3, r4)
            return r3
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent r7) {
            r6 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DOUBLE_TAP
            r6.mLastGesture = r0
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r6.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto L11
            r0.onChartDoubleTapped(r7)
        L11:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r6.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.isDoubleTapToZoomEnabled()
            if (r0 == 0) goto L6d
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r6.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.data.ChartData r0 = r0.getData()
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r0 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r0
            int r0 = r0.getEntryCount()
            if (r0 <= 0) goto L6d
            float r0 = r7.getX()
            float r1 = r7.getY()
            com.github.mikephil.charting.utils.MPPointF r0 = r6.getTrans(r0, r1)
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r6.mChart
            r2 = r1
            com.github.mikephil.charting.charts.BarLineChartBase r2 = (com.github.mikephil.charting.charts.BarLineChartBase) r2
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            boolean r1 = r1.isScaleXEnabled()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1068708659(0x3fb33333, float:1.4)
            if (r1 == 0) goto L4d
            r1 = 1068708659(0x3fb33333, float:1.4)
            goto L4f
        L4d:
            r1 = 1065353216(0x3f800000, float:1.0)
        L4f:
            T extends com.github.mikephil.charting.charts.Chart<?> r5 = r6.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r5 = (com.github.mikephil.charting.charts.BarLineChartBase) r5
            boolean r5 = r5.isScaleYEnabled()
            if (r5 == 0) goto L5c
            r3 = 1068708659(0x3fb33333, float:1.4)
        L5c:
            float r4 = r0.x
            float r5 = r0.y
            r2.zoom(r1, r3, r4, r5)
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r6.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            r1.isLogEnabled()
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r0)
        L6d:
            boolean r7 = super.onDoubleTap(r7)
            return r7
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent r2, android.view.MotionEvent r3, float r4, float r5) {
            r1 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.FLING
            r1.mLastGesture = r0
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r1.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto L11
            r0.onChartFling(r2, r3, r4, r5)
        L11:
            boolean r2 = super.onFling(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent r2) {
            r1 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.LONG_PRESS
            r1.mLastGesture = r0
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r1.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto L11
            r0.onChartLongPressed(r2)
        L11:
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent r4) {
            r3 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.SINGLE_TAP
            r3.mLastGesture = r0
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r3.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto L11
            r0.onChartSingleTapped(r4)
        L11:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r3.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.isHighlightPerTapEnabled()
            if (r0 != 0) goto L1d
            r4 = 0
            return r4
        L1d:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r3.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            float r1 = r4.getX()
            float r2 = r4.getY()
            com.github.mikephil.charting.highlight.Highlight r0 = r0.getHighlightByTouchPoint(r1, r2)
            r3.performHighlight(r0, r4)
            boolean r4 = super.onSingleTapUp(r4)
            return r4
    }

    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            r11 = this;
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            if (r12 != 0) goto La
            android.view.VelocityTracker r12 = android.view.VelocityTracker.obtain()
            r11.mVelocityTracker = r12
        La:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            r12.addMovement(r13)
            int r12 = r13.getActionMasked()
            r0 = 0
            r1 = 3
            if (r12 != r1) goto L20
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            if (r12 == 0) goto L20
            r12.recycle()
            r11.mVelocityTracker = r0
        L20:
            int r12 = r11.mTouchMode
            if (r12 != 0) goto L29
            android.view.GestureDetector r12 = r11.mGestureDetector
            r12.onTouchEvent(r13)
        L29:
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isDragEnabled()
            r2 = 1
            if (r12 != 0) goto L49
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isScaleXEnabled()
            if (r12 != 0) goto L49
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isScaleYEnabled()
            if (r12 != 0) goto L49
            return r2
        L49:
            int r12 = r13.getAction()
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r12 == 0) goto L266
            r3 = 0
            r4 = 4
            r5 = 5
            r6 = 2
            if (r12 == r2) goto L1d4
            if (r12 == r6) goto Ld9
            if (r12 == r1) goto Ld2
            if (r12 == r5) goto L6b
            r0 = 6
            if (r12 == r0) goto L62
            goto L26f
        L62:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            com.github.mikephil.charting.utils.Utils.velocityTrackerPointerUpCleanUpIfNecessary(r13, r12)
            r11.mTouchMode = r5
            goto L26f
        L6b:
            int r12 = r13.getPointerCount()
            if (r12 < r6) goto L26f
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            r12.disableScroll()
            r11.saveTouchStart(r13)
            float r12 = getXDist(r13)
            r11.mSavedXDist = r12
            float r12 = getYDist(r13)
            r11.mSavedYDist = r12
            float r12 = spacing(r13)
            r11.mSavedDist = r12
            r0 = 1092616192(0x41200000, float:10.0)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto Lcb
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isPinchZoomEnabled()
            if (r12 == 0) goto La0
            r11.mTouchMode = r4
            goto Lcb
        La0:
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isScaleXEnabled()
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.isScaleYEnabled()
            if (r12 == r0) goto Lc0
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isScaleXEnabled()
            if (r12 == 0) goto Lbd
            r1 = 2
        Lbd:
            r11.mTouchMode = r1
            goto Lcb
        Lc0:
            float r12 = r11.mSavedXDist
            float r0 = r11.mSavedYDist
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto Lc9
            r1 = 2
        Lc9:
            r11.mTouchMode = r1
        Lcb:
            com.github.mikephil.charting.utils.MPPointF r12 = r11.mTouchPointCenter
            midPoint(r12, r13)
            goto L26f
        Ld2:
            r11.mTouchMode = r3
            r11.endAction(r13)
            goto L26f
        Ld9:
            int r12 = r11.mTouchMode
            if (r12 != r2) goto L112
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            r12.disableScroll()
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isDragXEnabled()
            r0 = 0
            if (r12 == 0) goto Lf9
            float r12 = r13.getX()
            com.github.mikephil.charting.utils.MPPointF r1 = r11.mTouchStartPoint
            float r1 = r1.x
            float r12 = r12 - r1
            goto Lfa
        Lf9:
            r12 = 0
        Lfa:
            T extends com.github.mikephil.charting.charts.Chart<?> r1 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            boolean r1 = r1.isDragYEnabled()
            if (r1 == 0) goto L10d
            float r0 = r13.getY()
            com.github.mikephil.charting.utils.MPPointF r1 = r11.mTouchStartPoint
            float r1 = r1.y
            float r0 = r0 - r1
        L10d:
            r11.performDrag(r13, r12, r0)
            goto L26f
        L112:
            if (r12 == r6) goto L1b4
            if (r12 == r1) goto L1b4
            if (r12 != r4) goto L11a
            goto L1b4
        L11a:
            if (r12 != 0) goto L26f
            float r12 = r13.getX()
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mTouchStartPoint
            float r0 = r0.x
            float r1 = r13.getY()
            com.github.mikephil.charting.utils.MPPointF r3 = r11.mTouchStartPoint
            float r3 = r3.y
            float r12 = com.github.mikephil.charting.listener.ChartTouchListener.distance(r12, r0, r1, r3)
            float r12 = java.lang.Math.abs(r12)
            float r0 = r11.mDragTriggerDist
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L26f
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isDragEnabled()
            if (r12 == 0) goto L26f
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isFullyZoomedOut()
            if (r12 == 0) goto L176
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.hasNoDragOffset()
            if (r12 != 0) goto L159
            goto L176
        L159:
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isHighlightPerDragEnabled()
            if (r12 == 0) goto L26f
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r12 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG
            r11.mLastGesture = r12
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isHighlightPerDragEnabled()
            if (r12 == 0) goto L26f
            r11.performHighlightDrag(r13)
            goto L26f
        L176:
            float r12 = r13.getX()
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mTouchStartPoint
            float r0 = r0.x
            float r12 = r12 - r0
            float r12 = java.lang.Math.abs(r12)
            float r13 = r13.getY()
            com.github.mikephil.charting.utils.MPPointF r0 = r11.mTouchStartPoint
            float r0 = r0.y
            float r13 = r13 - r0
            float r13 = java.lang.Math.abs(r13)
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.isDragXEnabled()
            if (r0 != 0) goto L19e
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 < 0) goto L26f
        L19e:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.isDragYEnabled()
            if (r0 != 0) goto L1ac
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 > 0) goto L26f
        L1ac:
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r12 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG
            r11.mLastGesture = r12
            r11.mTouchMode = r2
            goto L26f
        L1b4:
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            r12.disableScroll()
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isScaleXEnabled()
            if (r12 != 0) goto L1cf
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            boolean r12 = r12.isScaleYEnabled()
            if (r12 == 0) goto L26f
        L1cf:
            r11.performZoom(r13)
            goto L26f
        L1d4:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            int r7 = r13.getPointerId(r3)
            int r8 = com.github.mikephil.charting.utils.Utils.getMaximumFlingVelocity()
            float r8 = (float) r8
            r9 = 1000(0x3e8, float:1.401E-42)
            r12.computeCurrentVelocity(r9, r8)
            float r8 = r12.getYVelocity(r7)
            float r12 = r12.getXVelocity(r7)
            float r7 = java.lang.Math.abs(r12)
            int r9 = com.github.mikephil.charting.utils.Utils.getMinimumFlingVelocity()
            float r9 = (float) r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L206
            float r7 = java.lang.Math.abs(r8)
            int r9 = com.github.mikephil.charting.utils.Utils.getMinimumFlingVelocity()
            float r9 = (float) r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L238
        L206:
            int r7 = r11.mTouchMode
            if (r7 != r2) goto L238
            T extends com.github.mikephil.charting.charts.Chart<?> r7 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r7 = (com.github.mikephil.charting.charts.BarLineChartBase) r7
            boolean r7 = r7.isDragDecelerationEnabled()
            if (r7 == 0) goto L238
            r11.stopDeceleration()
            long r9 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r11.mDecelerationLastTime = r9
            com.github.mikephil.charting.utils.MPPointF r7 = r11.mDecelerationCurrentPoint
            float r9 = r13.getX()
            r7.x = r9
            com.github.mikephil.charting.utils.MPPointF r7 = r11.mDecelerationCurrentPoint
            float r9 = r13.getY()
            r7.y = r9
            com.github.mikephil.charting.utils.MPPointF r7 = r11.mDecelerationVelocity
            r7.x = r12
            r7.y = r8
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(r12)
        L238:
            int r12 = r11.mTouchMode
            if (r12 == r6) goto L242
            if (r12 == r1) goto L242
            if (r12 == r4) goto L242
            if (r12 != r5) goto L250
        L242:
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            r12.calculateOffsets()
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            r12.postInvalidate()
        L250:
            r11.mTouchMode = r3
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            r12.enableScroll()
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            if (r12 == 0) goto L262
            r12.recycle()
            r11.mVelocityTracker = r0
        L262:
            r11.endAction(r13)
            goto L26f
        L266:
            r11.startAction(r13)
            r11.stopDeceleration()
            r11.saveTouchStart(r13)
        L26f:
            T extends com.github.mikephil.charting.charts.Chart<?> r12 = r11.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r12 = (com.github.mikephil.charting.charts.BarLineChartBase) r12
            com.github.mikephil.charting.utils.ViewPortHandler r12 = r12.getViewPortHandler()
            android.graphics.Matrix r13 = r11.mMatrix
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r11.mChart
            android.graphics.Matrix r12 = r12.refresh(r13, r0, r2)
            r11.mMatrix = r12
            return r2
    }

    public void setDragTriggerDist(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mDragTriggerDist = r1
            return
    }

    public void stopDeceleration() {
            r2 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r2.mDecelerationVelocity
            r1 = 0
            r0.x = r1
            r0.y = r1
            return
    }
}

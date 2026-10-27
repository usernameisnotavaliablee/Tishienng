package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Transformer {
    private android.graphics.Matrix mMBuffer1;
    private android.graphics.Matrix mMBuffer2;
    protected android.graphics.Matrix mMatrixOffset;
    protected android.graphics.Matrix mMatrixValueToPx;
    protected android.graphics.Matrix mPixelToValueMatrixBuffer;
    protected com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler;
    float[] ptsBuffer;
    protected float[] valuePointsForGenerateTransformedValuesBubble;
    protected float[] valuePointsForGenerateTransformedValuesCandle;
    protected float[] valuePointsForGenerateTransformedValuesLine;
    protected float[] valuePointsForGenerateTransformedValuesScatter;

    public Transformer(com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mMatrixValueToPx = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mMatrixOffset = r0
            r0 = 1
            float[] r1 = new float[r0]
            r2.valuePointsForGenerateTransformedValuesScatter = r1
            float[] r1 = new float[r0]
            r2.valuePointsForGenerateTransformedValuesBubble = r1
            float[] r1 = new float[r0]
            r2.valuePointsForGenerateTransformedValuesLine = r1
            float[] r0 = new float[r0]
            r2.valuePointsForGenerateTransformedValuesCandle = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mPixelToValueMatrixBuffer = r0
            r0 = 2
            float[] r0 = new float[r0]
            r2.ptsBuffer = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mMBuffer1 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mMBuffer2 = r0
            r2.mViewPortHandler = r3
            return
    }

    public float[] generateTransformedValuesBubble(com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet r5, float r6, int r7, int r8) {
            r4 = this;
            int r8 = r8 - r7
            int r8 = r8 + 1
            int r8 = r8 * 2
            float[] r0 = r4.valuePointsForGenerateTransformedValuesBubble
            int r0 = r0.length
            if (r0 == r8) goto Le
            float[] r0 = new float[r8]
            r4.valuePointsForGenerateTransformedValuesBubble = r0
        Le:
            float[] r0 = r4.valuePointsForGenerateTransformedValuesBubble
            r1 = 0
        L11:
            if (r1 >= r8) goto L37
            int r2 = r1 / 2
            int r2 = r2 + r7
            com.github.mikephil.charting.data.Entry r2 = r5.getEntryForIndex(r2)
            if (r2 == 0) goto L2d
            float r3 = r2.getX()
            r0[r1] = r3
            int r3 = r1 + 1
            float r2 = r2.getY()
            float r2 = r2 * r6
            r0[r3] = r2
            goto L34
        L2d:
            r2 = 0
            r0[r1] = r2
            int r3 = r1 + 1
            r0[r3] = r2
        L34:
            int r1 = r1 + 2
            goto L11
        L37:
            android.graphics.Matrix r5 = r4.getValueToPixelMatrix()
            r5.mapPoints(r0)
            return r0
    }

    public float[] generateTransformedValuesCandle(com.github.mikephil.charting.interfaces.datasets.ICandleDataSet r4, float r5, float r6, int r7, int r8) {
            r3 = this;
            int r8 = r8 - r7
            float r8 = (float) r8
            float r8 = r8 * r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r5
            int r5 = (int) r8
            int r5 = r5 * 2
            float[] r8 = r3.valuePointsForGenerateTransformedValuesCandle
            int r8 = r8.length
            if (r8 == r5) goto L13
            float[] r8 = new float[r5]
            r3.valuePointsForGenerateTransformedValuesCandle = r8
        L13:
            float[] r8 = r3.valuePointsForGenerateTransformedValuesCandle
            r0 = 0
        L16:
            if (r0 >= r5) goto L3e
            int r1 = r0 / 2
            int r1 = r1 + r7
            com.github.mikephil.charting.data.Entry r1 = r4.getEntryForIndex(r1)
            com.github.mikephil.charting.data.CandleEntry r1 = (com.github.mikephil.charting.data.CandleEntry) r1
            if (r1 == 0) goto L34
            float r2 = r1.getX()
            r8[r0] = r2
            int r2 = r0 + 1
            float r1 = r1.getHigh()
            float r1 = r1 * r6
            r8[r2] = r1
            goto L3b
        L34:
            r1 = 0
            r8[r0] = r1
            int r2 = r0 + 1
            r8[r2] = r1
        L3b:
            int r0 = r0 + 2
            goto L16
        L3e:
            android.graphics.Matrix r4 = r3.getValueToPixelMatrix()
            r4.mapPoints(r8)
            return r8
    }

    public float[] generateTransformedValuesLine(com.github.mikephil.charting.interfaces.datasets.ILineDataSet r4, float r5, float r6, int r7, int r8) {
            r3 = this;
            int r8 = r8 - r7
            float r8 = (float) r8
            float r8 = r8 * r5
            int r5 = (int) r8
            int r5 = r5 + 1
            int r5 = r5 * 2
            float[] r8 = r3.valuePointsForGenerateTransformedValuesLine
            int r8 = r8.length
            if (r8 == r5) goto L12
            float[] r8 = new float[r5]
            r3.valuePointsForGenerateTransformedValuesLine = r8
        L12:
            float[] r8 = r3.valuePointsForGenerateTransformedValuesLine
            r0 = 0
        L15:
            if (r0 >= r5) goto L3b
            int r1 = r0 / 2
            int r1 = r1 + r7
            com.github.mikephil.charting.data.Entry r1 = r4.getEntryForIndex(r1)
            if (r1 == 0) goto L31
            float r2 = r1.getX()
            r8[r0] = r2
            int r2 = r0 + 1
            float r1 = r1.getY()
            float r1 = r1 * r6
            r8[r2] = r1
            goto L38
        L31:
            r1 = 0
            r8[r0] = r1
            int r2 = r0 + 1
            r8[r2] = r1
        L38:
            int r0 = r0 + 2
            goto L15
        L3b:
            android.graphics.Matrix r4 = r3.getValueToPixelMatrix()
            r4.mapPoints(r8)
            return r8
    }

    public float[] generateTransformedValuesScatter(com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r4, float r5, float r6, int r7, int r8) {
            r3 = this;
            int r8 = r8 - r7
            float r8 = (float) r8
            float r8 = r8 * r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r5
            int r5 = (int) r8
            int r5 = r5 * 2
            float[] r8 = r3.valuePointsForGenerateTransformedValuesScatter
            int r8 = r8.length
            if (r8 == r5) goto L13
            float[] r8 = new float[r5]
            r3.valuePointsForGenerateTransformedValuesScatter = r8
        L13:
            float[] r8 = r3.valuePointsForGenerateTransformedValuesScatter
            r0 = 0
        L16:
            if (r0 >= r5) goto L3c
            int r1 = r0 / 2
            int r1 = r1 + r7
            com.github.mikephil.charting.data.Entry r1 = r4.getEntryForIndex(r1)
            if (r1 == 0) goto L32
            float r2 = r1.getX()
            r8[r0] = r2
            int r2 = r0 + 1
            float r1 = r1.getY()
            float r1 = r1 * r6
            r8[r2] = r1
            goto L39
        L32:
            r1 = 0
            r8[r0] = r1
            int r2 = r0 + 1
            r8[r2] = r1
        L39:
            int r0 = r0 + 2
            goto L16
        L3c:
            android.graphics.Matrix r4 = r3.getValueToPixelMatrix()
            r4.mapPoints(r8)
            return r8
    }

    public android.graphics.Matrix getOffsetMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrixOffset
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointD getPixelForValues(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.ptsBuffer
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r2.pointValuesToPixel(r0)
            float[] r4 = r2.ptsBuffer
            r0 = r4[r1]
            double r0 = (double) r0
            r3 = r4[r3]
            double r3 = (double) r3
            com.github.mikephil.charting.utils.MPPointD r3 = com.github.mikephil.charting.utils.MPPointD.getInstance(r0, r3)
            return r3
    }

    public android.graphics.Matrix getPixelToValueMatrix() {
            r2 = this;
            android.graphics.Matrix r0 = r2.getValueToPixelMatrix()
            android.graphics.Matrix r1 = r2.mMBuffer2
            r0.invert(r1)
            android.graphics.Matrix r0 = r2.mMBuffer2
            return r0
    }

    public android.graphics.Matrix getValueMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrixValueToPx
            return r0
    }

    public android.graphics.Matrix getValueToPixelMatrix() {
            r2 = this;
            android.graphics.Matrix r0 = r2.mMBuffer1
            android.graphics.Matrix r1 = r2.mMatrixValueToPx
            r0.set(r1)
            android.graphics.Matrix r0 = r2.mMBuffer1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            android.graphics.Matrix r1 = r1.mMatrixTouch
            r0.postConcat(r1)
            android.graphics.Matrix r0 = r2.mMBuffer1
            android.graphics.Matrix r1 = r2.mMatrixOffset
            r0.postConcat(r1)
            android.graphics.Matrix r0 = r2.mMBuffer1
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointD getValuesByTouchPoint(float r3, float r4) {
            r2 = this;
            r0 = 0
            com.github.mikephil.charting.utils.MPPointD r0 = com.github.mikephil.charting.utils.MPPointD.getInstance(r0, r0)
            r2.getValuesByTouchPoint(r3, r4, r0)
            return r0
    }

    public void getValuesByTouchPoint(float r3, float r4, com.github.mikephil.charting.utils.MPPointD r5) {
            r2 = this;
            float[] r0 = r2.ptsBuffer
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r2.pixelsToValue(r0)
            float[] r4 = r2.ptsBuffer
            r0 = r4[r1]
            double r0 = (double) r0
            r5.x = r0
            r3 = r4[r3]
            double r3 = (double) r3
            r5.y = r3
            return
    }

    public void pathValueToPixel(android.graphics.Path r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrixValueToPx
            r2.transform(r0)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            android.graphics.Matrix r0 = r0.getMatrixTouch()
            r2.transform(r0)
            android.graphics.Matrix r0 = r1.mMatrixOffset
            r2.transform(r0)
            return
    }

    public void pathValuesToPixel(java.util.List<android.graphics.Path> r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L13
            java.lang.Object r1 = r3.get(r0)
            android.graphics.Path r1 = (android.graphics.Path) r1
            r2.pathValueToPixel(r1)
            int r0 = r0 + 1
            goto L1
        L13:
            return
    }

    public void pixelsToValue(float[] r3) {
            r2 = this;
            android.graphics.Matrix r0 = r2.mPixelToValueMatrixBuffer
            r0.reset()
            android.graphics.Matrix r1 = r2.mMatrixOffset
            r1.invert(r0)
            r0.mapPoints(r3)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            android.graphics.Matrix r1 = r1.getMatrixTouch()
            r1.invert(r0)
            r0.mapPoints(r3)
            android.graphics.Matrix r1 = r2.mMatrixValueToPx
            r1.invert(r0)
            r0.mapPoints(r3)
            return
    }

    public void pointValuesToPixel(float[] r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrixValueToPx
            r0.mapPoints(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            android.graphics.Matrix r0 = r0.getMatrixTouch()
            r0.mapPoints(r2)
            android.graphics.Matrix r0 = r1.mMatrixOffset
            r0.mapPoints(r2)
            return
    }

    public void prepareMatrixOffset(boolean r4) {
            r3 = this;
            android.graphics.Matrix r0 = r3.mMatrixOffset
            r0.reset()
            if (r4 != 0) goto L20
            android.graphics.Matrix r4 = r3.mMatrixOffset
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            float r0 = r0.offsetLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.getChartHeight()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            float r2 = r2.offsetBottom()
            float r1 = r1 - r2
            r4.postTranslate(r0, r1)
            return
        L20:
            android.graphics.Matrix r4 = r3.mMatrixOffset
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            float r0 = r0.offsetLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.offsetTop()
            float r1 = -r1
            r4.setTranslate(r0, r1)
            android.graphics.Matrix r4 = r3.mMatrixOffset
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.postScale(r0, r1)
            return
    }

    public void prepareMatrixValuePx(float r3, float r4, float r5, float r6) {
            r2 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentWidth()
            float r0 = r0 / r4
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r2.mViewPortHandler
            float r4 = r4.contentHeight()
            float r4 = r4 / r5
            boolean r5 = java.lang.Float.isInfinite(r0)
            r1 = 0
            if (r5 == 0) goto L16
            r0 = 0
        L16:
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 == 0) goto L1d
            r4 = 0
        L1d:
            android.graphics.Matrix r5 = r2.mMatrixValueToPx
            r5.reset()
            android.graphics.Matrix r5 = r2.mMatrixValueToPx
            float r3 = -r3
            float r6 = -r6
            r5.postTranslate(r3, r6)
            android.graphics.Matrix r3 = r2.mMatrixValueToPx
            float r4 = -r4
            r3.postScale(r0, r4)
            return
    }

    public void rectToPixelPhase(android.graphics.RectF r2, float r3) {
            r1 = this;
            float r0 = r2.top
            float r0 = r0 * r3
            r2.top = r0
            float r0 = r2.bottom
            float r0 = r0 * r3
            r2.bottom = r0
            android.graphics.Matrix r3 = r1.mMatrixValueToPx
            r3.mapRect(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            android.graphics.Matrix r3 = r3.getMatrixTouch()
            r3.mapRect(r2)
            android.graphics.Matrix r3 = r1.mMatrixOffset
            r3.mapRect(r2)
            return
    }

    public void rectToPixelPhaseHorizontal(android.graphics.RectF r2, float r3) {
            r1 = this;
            float r0 = r2.left
            float r0 = r0 * r3
            r2.left = r0
            float r0 = r2.right
            float r0 = r0 * r3
            r2.right = r0
            android.graphics.Matrix r3 = r1.mMatrixValueToPx
            r3.mapRect(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            android.graphics.Matrix r3 = r3.getMatrixTouch()
            r3.mapRect(r2)
            android.graphics.Matrix r3 = r1.mMatrixOffset
            r3.mapRect(r2)
            return
    }

    public void rectValueToPixel(android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrixValueToPx
            r0.mapRect(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            android.graphics.Matrix r0 = r0.getMatrixTouch()
            r0.mapRect(r2)
            android.graphics.Matrix r0 = r1.mMatrixOffset
            r0.mapRect(r2)
            return
    }

    public void rectValueToPixelHorizontal(android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrixValueToPx
            r0.mapRect(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            android.graphics.Matrix r0 = r0.getMatrixTouch()
            r0.mapRect(r2)
            android.graphics.Matrix r0 = r1.mMatrixOffset
            r0.mapRect(r2)
            return
    }

    public void rectValueToPixelHorizontal(android.graphics.RectF r2, float r3) {
            r1 = this;
            float r0 = r2.left
            float r0 = r0 * r3
            r2.left = r0
            float r0 = r2.right
            float r0 = r0 * r3
            r2.right = r0
            android.graphics.Matrix r3 = r1.mMatrixValueToPx
            r3.mapRect(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            android.graphics.Matrix r3 = r3.getMatrixTouch()
            r3.mapRect(r2)
            android.graphics.Matrix r3 = r1.mMatrixOffset
            r3.mapRect(r2)
            return
    }

    public void rectValuesToPixel(java.util.List<android.graphics.RectF> r4) {
            r3 = this;
            android.graphics.Matrix r0 = r3.getValueToPixelMatrix()
            r1 = 0
        L5:
            int r2 = r4.size()
            if (r1 >= r2) goto L17
            java.lang.Object r2 = r4.get(r1)
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            r0.mapRect(r2)
            int r1 = r1 + 1
            goto L5
        L17:
            return
    }
}

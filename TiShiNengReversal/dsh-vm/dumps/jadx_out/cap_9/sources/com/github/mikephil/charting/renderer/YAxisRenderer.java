package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class YAxisRenderer extends com.github.mikephil.charting.renderer.AxisRenderer {
    protected android.graphics.Path mDrawZeroLinePath;
    protected float[] mGetTransformedPositionsBuffer;
    protected android.graphics.RectF mGridClippingRect;
    protected android.graphics.RectF mLimitLineClippingRect;
    protected android.graphics.Path mRenderGridLinesPath;
    protected android.graphics.Path mRenderLimitLines;
    protected float[] mRenderLimitLinesBuffer;
    protected com.github.mikephil.charting.components.YAxis mYAxis;
    protected android.graphics.RectF mZeroLineClippingRect;
    protected android.graphics.Paint mZeroLinePaint;

    public YAxisRenderer(com.github.mikephil.charting.utils.ViewPortHandler r1, com.github.mikephil.charting.components.YAxis r2, com.github.mikephil.charting.utils.Transformer r3) {
            r0 = this;
            r0.<init>(r1, r3, r2)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.mRenderGridLinesPath = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mGridClippingRect = r1
            r1 = 2
            float[] r3 = new float[r1]
            r0.mGetTransformedPositionsBuffer = r3
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0.mDrawZeroLinePath = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.mZeroLineClippingRect = r3
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0.mRenderLimitLines = r3
            float[] r1 = new float[r1]
            r0.mRenderLimitLinesBuffer = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mLimitLineClippingRect = r1
            r0.mYAxis = r2
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            if (r1 == 0) goto L6a
            android.graphics.Paint r1 = r0.mAxisLabelPaint
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.mAxisLabelPaint
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r1.setTextSize(r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r0.mZeroLinePaint = r1
            r2 = -7829368(0xffffffffff888888, float:NaN)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.mZeroLinePaint
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r0.mZeroLinePaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
        L6a:
            return
    }

    protected void drawYLabels(android.graphics.Canvas r6, float r7, float[] r8, float r9) {
            r5 = this;
            com.github.mikephil.charting.components.YAxis r0 = r5.mYAxis
            boolean r0 = r0.isDrawBottomYLabelEntryEnabled()
            r0 = r0 ^ 1
            com.github.mikephil.charting.components.YAxis r1 = r5.mYAxis
            boolean r1 = r1.isDrawTopYLabelEntryEnabled()
            if (r1 == 0) goto L15
            com.github.mikephil.charting.components.YAxis r1 = r5.mYAxis
            int r1 = r1.mEntryCount
            goto L1b
        L15:
            com.github.mikephil.charting.components.YAxis r1 = r5.mYAxis
            int r1 = r1.mEntryCount
            int r1 = r1 + (-1)
        L1b:
            if (r0 >= r1) goto L32
            com.github.mikephil.charting.components.YAxis r2 = r5.mYAxis
            java.lang.String r2 = r2.getFormattedLabel(r0)
            int r3 = r0 * 2
            int r3 = r3 + 1
            r3 = r8[r3]
            float r3 = r3 + r9
            android.graphics.Paint r4 = r5.mAxisLabelPaint
            r6.drawText(r2, r7, r3, r4)
            int r0 = r0 + 1
            goto L1b
        L32:
            return
    }

    protected void drawZeroLine(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r7.save()
            android.graphics.RectF r1 = r6.mZeroLineClippingRect
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r6.mViewPortHandler
            android.graphics.RectF r2 = r2.getContentRect()
            r1.set(r2)
            android.graphics.RectF r1 = r6.mZeroLineClippingRect
            com.github.mikephil.charting.components.YAxis r2 = r6.mYAxis
            float r2 = r2.getZeroLineWidth()
            float r2 = -r2
            r3 = 0
            r1.inset(r3, r2)
            android.graphics.RectF r1 = r6.mZeroLineClippingRect
            r7.clipRect(r1)
            com.github.mikephil.charting.utils.Transformer r1 = r6.mTrans
            com.github.mikephil.charting.utils.MPPointD r1 = r1.getPixelForValues(r3, r3)
            android.graphics.Paint r2 = r6.mZeroLinePaint
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            int r3 = r3.getZeroLineColor()
            r2.setColor(r3)
            android.graphics.Paint r2 = r6.mZeroLinePaint
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            float r3 = r3.getZeroLineWidth()
            r2.setStrokeWidth(r3)
            android.graphics.Path r2 = r6.mDrawZeroLinePath
            r2.reset()
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.contentLeft()
            double r4 = r1.y
            float r4 = (float) r4
            r2.moveTo(r3, r4)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.contentRight()
            double r4 = r1.y
            float r1 = (float) r4
            r2.lineTo(r3, r1)
            android.graphics.Paint r1 = r6.mZeroLinePaint
            r7.drawPath(r2, r1)
            r7.restoreToCount(r0)
            return
    }

    public android.graphics.RectF getGridClippingRect() {
            r3 = this;
            android.graphics.RectF r0 = r3.mGridClippingRect
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            android.graphics.RectF r1 = r1.getContentRect()
            r0.set(r1)
            android.graphics.RectF r0 = r3.mGridClippingRect
            com.github.mikephil.charting.components.AxisBase r1 = r3.mAxis
            float r1 = r1.getGridLineWidth()
            float r1 = -r1
            r2 = 0
            r0.inset(r2, r1)
            android.graphics.RectF r0 = r3.mGridClippingRect
            return r0
    }

    protected float[] getTransformedPositions() {
            r5 = this;
            float[] r0 = r5.mGetTransformedPositionsBuffer
            int r0 = r0.length
            com.github.mikephil.charting.components.YAxis r1 = r5.mYAxis
            int r1 = r1.mEntryCount
            int r2 = r1 * 2
            if (r0 == r2) goto L11
            int r1 = r1 * 2
            float[] r0 = new float[r1]
            r5.mGetTransformedPositionsBuffer = r0
        L11:
            float[] r0 = r5.mGetTransformedPositionsBuffer
            r1 = 0
        L14:
            int r2 = r0.length
            if (r1 >= r2) goto L26
            int r2 = r1 + 1
            com.github.mikephil.charting.components.YAxis r3 = r5.mYAxis
            float[] r3 = r3.mEntries
            int r4 = r1 / 2
            r3 = r3[r4]
            r0[r2] = r3
            int r1 = r1 + 2
            goto L14
        L26:
            com.github.mikephil.charting.utils.Transformer r1 = r5.mTrans
            r1.pointValuesToPixel(r0)
            return r0
    }

    protected android.graphics.Path linePath(android.graphics.Path r3, int r4, float[] r5) {
            r2 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.offsetLeft()
            int r4 = r4 + 1
            r1 = r5[r4]
            r3.moveTo(r0, r1)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentRight()
            r4 = r5[r4]
            r3.lineTo(r0, r4)
            return r3
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas r7) {
            r6 = this;
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto La5
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isDrawLabelsEnabled()
            if (r0 != 0) goto L12
            goto La5
        L12:
            float[] r0 = r6.getTransformedPositions()
            android.graphics.Paint r1 = r6.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r2 = r6.mYAxis
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r6.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r2 = r6.mYAxis
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r6.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r2 = r6.mYAxis
            int r2 = r2.getTextColor()
            r1.setColor(r2)
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            float r1 = r1.getXOffset()
            android.graphics.Paint r2 = r6.mAxisLabelPaint
            java.lang.String r3 = "A"
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r2, r3)
            float r2 = (float) r2
            r3 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 / r3
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            float r3 = r3.getYOffset()
            float r2 = r2 + r3
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = r3.getAxisDependency()
            com.github.mikephil.charting.components.YAxis r4 = r6.mYAxis
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r4 = r4.getLabelPosition()
            com.github.mikephil.charting.components.YAxis$AxisDependency r5 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r3 != r5) goto L82
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r3 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            if (r4 != r3) goto L73
            android.graphics.Paint r3 = r6.mAxisLabelPaint
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r3.setTextAlign(r4)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.offsetLeft()
        L71:
            float r3 = r3 - r1
            goto La2
        L73:
            android.graphics.Paint r3 = r6.mAxisLabelPaint
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.LEFT
            r3.setTextAlign(r4)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.offsetLeft()
        L80:
            float r3 = r3 + r1
            goto La2
        L82:
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r3 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            if (r4 != r3) goto L94
            android.graphics.Paint r3 = r6.mAxisLabelPaint
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.LEFT
            r3.setTextAlign(r4)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.contentRight()
            goto L80
        L94:
            android.graphics.Paint r3 = r6.mAxisLabelPaint
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r3.setTextAlign(r4)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.contentRight()
            goto L71
        La2:
            r6.drawYLabels(r7, r3, r0, r2)
        La5:
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(android.graphics.Canvas r14) {
            r13 = this;
            com.github.mikephil.charting.components.YAxis r0 = r13.mYAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L6f
            com.github.mikephil.charting.components.YAxis r0 = r13.mYAxis
            boolean r0 = r0.isDrawAxisLineEnabled()
            if (r0 != 0) goto L11
            goto L6f
        L11:
            android.graphics.Paint r0 = r13.mAxisLinePaint
            com.github.mikephil.charting.components.YAxis r1 = r13.mYAxis
            int r1 = r1.getAxisLineColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = r13.mAxisLinePaint
            com.github.mikephil.charting.components.YAxis r1 = r13.mYAxis
            float r1 = r1.getAxisLineWidth()
            r0.setStrokeWidth(r1)
            com.github.mikephil.charting.components.YAxis r0 = r13.mYAxis
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r0.getAxisDependency()
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r0 != r1) goto L50
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r2 = r0.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r3 = r0.contentTop()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r4 = r0.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r5 = r0.contentBottom()
            android.graphics.Paint r6 = r13.mAxisLinePaint
            r1 = r14
            r1.drawLine(r2, r3, r4, r5, r6)
            return
        L50:
            r1 = r14
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r8 = r14.contentRight()
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r9 = r14.contentTop()
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r10 = r14.contentRight()
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r11 = r14.contentBottom()
            android.graphics.Paint r12 = r13.mAxisLinePaint
            r7 = r1
            r7.drawLine(r8, r9, r10, r11, r12)
        L6f:
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(android.graphics.Canvas r7) {
            r6 = this;
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L9
            goto L67
        L9:
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isDrawGridLinesEnabled()
            if (r0 == 0) goto L5c
            int r0 = r7.save()
            android.graphics.RectF r1 = r6.getGridClippingRect()
            r7.clipRect(r1)
            float[] r1 = r6.getTransformedPositions()
            android.graphics.Paint r2 = r6.mGridPaint
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            int r3 = r3.getGridColor()
            r2.setColor(r3)
            android.graphics.Paint r2 = r6.mGridPaint
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            float r3 = r3.getGridLineWidth()
            r2.setStrokeWidth(r3)
            android.graphics.Paint r2 = r6.mGridPaint
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            android.graphics.DashPathEffect r3 = r3.getGridDashPathEffect()
            r2.setPathEffect(r3)
            android.graphics.Path r2 = r6.mRenderGridLinesPath
            r2.reset()
            r3 = 0
        L47:
            int r4 = r1.length
            if (r3 >= r4) goto L59
            android.graphics.Path r4 = r6.linePath(r2, r3, r1)
            android.graphics.Paint r5 = r6.mGridPaint
            r7.drawPath(r4, r5)
            r2.reset()
            int r3 = r3 + 2
            goto L47
        L59:
            r7.restoreToCount(r0)
        L5c:
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isDrawZeroLineEnabled()
            if (r0 == 0) goto L67
            r6.drawZeroLine(r7)
        L67:
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas r14) {
            r13 = this;
            com.github.mikephil.charting.components.YAxis r0 = r13.mYAxis
            java.util.List r0 = r0.getLimitLines()
            if (r0 == 0) goto L16a
            int r1 = r0.size()
            if (r1 > 0) goto L10
            goto L16a
        L10:
            float[] r1 = r13.mRenderLimitLinesBuffer
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            android.graphics.Path r5 = r13.mRenderLimitLines
            r5.reset()
        L1e:
            int r6 = r0.size()
            if (r2 >= r6) goto L16a
            java.lang.Object r6 = r0.get(r2)
            com.github.mikephil.charting.components.LimitLine r6 = (com.github.mikephil.charting.components.LimitLine) r6
            boolean r7 = r6.isEnabled()
            if (r7 != 0) goto L32
            goto L166
        L32:
            int r7 = r14.save()
            android.graphics.RectF r8 = r13.mLimitLineClippingRect
            com.github.mikephil.charting.utils.ViewPortHandler r9 = r13.mViewPortHandler
            android.graphics.RectF r9 = r9.getContentRect()
            r8.set(r9)
            android.graphics.RectF r8 = r13.mLimitLineClippingRect
            float r9 = r6.getLineWidth()
            float r9 = -r9
            r8.inset(r3, r9)
            android.graphics.RectF r8 = r13.mLimitLineClippingRect
            r14.clipRect(r8)
            android.graphics.Paint r8 = r13.mLimitLinePaint
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r9)
            android.graphics.Paint r8 = r13.mLimitLinePaint
            int r9 = r6.getLineColor()
            r8.setColor(r9)
            android.graphics.Paint r8 = r13.mLimitLinePaint
            float r9 = r6.getLineWidth()
            r8.setStrokeWidth(r9)
            android.graphics.Paint r8 = r13.mLimitLinePaint
            android.graphics.DashPathEffect r9 = r6.getDashPathEffect()
            r8.setPathEffect(r9)
            float r8 = r6.getLimit()
            r1[r4] = r8
            com.github.mikephil.charting.utils.Transformer r8 = r13.mTrans
            r8.pointValuesToPixel(r1)
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r13.mViewPortHandler
            float r8 = r8.contentLeft()
            r9 = r1[r4]
            r5.moveTo(r8, r9)
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r13.mViewPortHandler
            float r8 = r8.contentRight()
            r9 = r1[r4]
            r5.lineTo(r8, r9)
            android.graphics.Paint r8 = r13.mLimitLinePaint
            r14.drawPath(r5, r8)
            r5.reset()
            java.lang.String r8 = r6.getLabel()
            if (r8 == 0) goto L163
            java.lang.String r9 = ""
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L163
            android.graphics.Paint r9 = r13.mLimitLinePaint
            android.graphics.Paint$Style r10 = r6.getTextStyle()
            r9.setStyle(r10)
            android.graphics.Paint r9 = r13.mLimitLinePaint
            r10 = 0
            r9.setPathEffect(r10)
            android.graphics.Paint r9 = r13.mLimitLinePaint
            int r10 = r6.getTextColor()
            r9.setColor(r10)
            android.graphics.Paint r9 = r13.mLimitLinePaint
            android.graphics.Typeface r10 = r6.getTypeface()
            r9.setTypeface(r10)
            android.graphics.Paint r9 = r13.mLimitLinePaint
            r10 = 1056964608(0x3f000000, float:0.5)
            r9.setStrokeWidth(r10)
            android.graphics.Paint r9 = r13.mLimitLinePaint
            float r10 = r6.getTextSize()
            r9.setTextSize(r10)
            android.graphics.Paint r9 = r13.mLimitLinePaint
            int r9 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r9, r8)
            float r9 = (float) r9
            r10 = 1082130432(0x40800000, float:4.0)
            float r10 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r10)
            float r11 = r6.getXOffset()
            float r10 = r10 + r11
            float r11 = r6.getLineWidth()
            float r11 = r11 + r9
            float r12 = r6.getYOffset()
            float r11 = r11 + r12
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r6 = r6.getLabelPosition()
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r12 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP
            if (r6 != r12) goto L116
            android.graphics.Paint r6 = r13.mLimitLinePaint
            android.graphics.Paint$Align r12 = android.graphics.Paint.Align.RIGHT
            r6.setTextAlign(r12)
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r13.mViewPortHandler
            float r6 = r6.contentRight()
            float r6 = r6 - r10
            r10 = r1[r4]
            float r10 = r10 - r11
            float r10 = r10 + r9
            android.graphics.Paint r9 = r13.mLimitLinePaint
            r14.drawText(r8, r6, r10, r9)
            goto L163
        L116:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r12 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM
            if (r6 != r12) goto L131
            android.graphics.Paint r6 = r13.mLimitLinePaint
            android.graphics.Paint$Align r9 = android.graphics.Paint.Align.RIGHT
            r6.setTextAlign(r9)
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r13.mViewPortHandler
            float r6 = r6.contentRight()
            float r6 = r6 - r10
            r9 = r1[r4]
            float r9 = r9 + r11
            android.graphics.Paint r10 = r13.mLimitLinePaint
            r14.drawText(r8, r6, r9, r10)
            goto L163
        L131:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r12 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP
            if (r6 != r12) goto L14d
            android.graphics.Paint r6 = r13.mLimitLinePaint
            android.graphics.Paint$Align r12 = android.graphics.Paint.Align.LEFT
            r6.setTextAlign(r12)
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r13.mViewPortHandler
            float r6 = r6.contentLeft()
            float r6 = r6 + r10
            r10 = r1[r4]
            float r10 = r10 - r11
            float r10 = r10 + r9
            android.graphics.Paint r9 = r13.mLimitLinePaint
            r14.drawText(r8, r6, r10, r9)
            goto L163
        L14d:
            android.graphics.Paint r6 = r13.mLimitLinePaint
            android.graphics.Paint$Align r9 = android.graphics.Paint.Align.LEFT
            r6.setTextAlign(r9)
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r13.mViewPortHandler
            float r6 = r6.offsetLeft()
            float r6 = r6 + r10
            r9 = r1[r4]
            float r9 = r9 + r11
            android.graphics.Paint r10 = r13.mLimitLinePaint
            r14.drawText(r8, r6, r9, r10)
        L163:
            r14.restoreToCount(r7)
        L166:
            int r2 = r2 + 1
            goto L1e
        L16a:
            return
    }
}

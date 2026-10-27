package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class YAxisRendererHorizontalBarChart extends com.github.mikephil.charting.renderer.YAxisRenderer {
    protected android.graphics.Path mDrawZeroLinePathBuffer;
    protected float[] mRenderLimitLinesBuffer;
    protected android.graphics.Path mRenderLimitLinesPathBuffer;

    public YAxisRendererHorizontalBarChart(com.github.mikephil.charting.utils.ViewPortHandler r1, com.github.mikephil.charting.components.YAxis r2, com.github.mikephil.charting.utils.Transformer r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.mDrawZeroLinePathBuffer = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.mRenderLimitLinesPathBuffer = r1
            r1 = 4
            float[] r1 = new float[r1]
            r0.mRenderLimitLinesBuffer = r1
            android.graphics.Paint r1 = r0.mLimitLinePaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            r1.setTextAlign(r2)
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float r3, float r4, boolean r5) {
            r2 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentHeight()
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4f
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            boolean r0 = r0.isFullyZoomedOutX()
            if (r0 != 0) goto L4f
            com.github.mikephil.charting.utils.Transformer r3 = r2.mTrans
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r2.mViewPortHandler
            float r4 = r4.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentTop()
            com.github.mikephil.charting.utils.MPPointD r3 = r3.getValuesByTouchPoint(r4, r0)
            com.github.mikephil.charting.utils.Transformer r4 = r2.mTrans
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentRight()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.contentTop()
            com.github.mikephil.charting.utils.MPPointD r4 = r4.getValuesByTouchPoint(r0, r1)
            if (r5 != 0) goto L41
            double r0 = r3.x
            float r5 = (float) r0
            double r0 = r4.x
        L3f:
            float r0 = (float) r0
            goto L47
        L41:
            double r0 = r4.x
            float r5 = (float) r0
            double r0 = r3.x
            goto L3f
        L47:
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r3)
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r4)
            r3 = r5
            r4 = r0
        L4f:
            r2.computeAxisValues(r3, r4)
            return
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected void drawYLabels(android.graphics.Canvas r7, float r8, float[] r9, float r10) {
            r6 = this;
            android.graphics.Paint r0 = r6.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r6.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            int r1 = r1.getTextColor()
            r0.setColor(r1)
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isDrawBottomYLabelEntryEnabled()
            r0 = r0 ^ 1
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            boolean r1 = r1.isDrawTopYLabelEntryEnabled()
            if (r1 == 0) goto L36
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            int r1 = r1.mEntryCount
            goto L3c
        L36:
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            int r1 = r1.mEntryCount
            int r1 = r1 + (-1)
        L3c:
            if (r0 >= r1) goto L52
            com.github.mikephil.charting.components.YAxis r2 = r6.mYAxis
            java.lang.String r2 = r2.getFormattedLabel(r0)
            int r3 = r0 * 2
            r3 = r9[r3]
            float r4 = r8 - r10
            android.graphics.Paint r5 = r6.mAxisLabelPaint
            r7.drawText(r2, r3, r4, r5)
            int r0 = r0 + 1
            goto L3c
        L52:
            return
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected void drawZeroLine(android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r8.save()
            android.graphics.RectF r1 = r7.mZeroLineClippingRect
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r7.mViewPortHandler
            android.graphics.RectF r2 = r2.getContentRect()
            r1.set(r2)
            android.graphics.RectF r1 = r7.mZeroLineClippingRect
            com.github.mikephil.charting.components.YAxis r2 = r7.mYAxis
            float r2 = r2.getZeroLineWidth()
            float r2 = -r2
            r3 = 0
            r1.inset(r2, r3)
            android.graphics.RectF r1 = r7.mLimitLineClippingRect
            r8.clipRect(r1)
            com.github.mikephil.charting.utils.Transformer r1 = r7.mTrans
            com.github.mikephil.charting.utils.MPPointD r1 = r1.getPixelForValues(r3, r3)
            android.graphics.Paint r2 = r7.mZeroLinePaint
            com.github.mikephil.charting.components.YAxis r3 = r7.mYAxis
            int r3 = r3.getZeroLineColor()
            r2.setColor(r3)
            android.graphics.Paint r2 = r7.mZeroLinePaint
            com.github.mikephil.charting.components.YAxis r3 = r7.mYAxis
            float r3 = r3.getZeroLineWidth()
            r2.setStrokeWidth(r3)
            android.graphics.Path r2 = r7.mDrawZeroLinePathBuffer
            r2.reset()
            double r3 = r1.x
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r4
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r7.mViewPortHandler
            float r5 = r5.contentTop()
            r2.moveTo(r3, r5)
            double r5 = r1.x
            float r1 = (float) r5
            float r1 = r1 - r4
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r7.mViewPortHandler
            float r3 = r3.contentBottom()
            r2.lineTo(r1, r3)
            android.graphics.Paint r1 = r7.mZeroLinePaint
            r8.drawPath(r2, r1)
            r8.restoreToCount(r0)
            return
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
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
            r0.inset(r1, r2)
            android.graphics.RectF r0 = r3.mGridClippingRect
            return r0
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected float[] getTransformedPositions() {
            r4 = this;
            float[] r0 = r4.mGetTransformedPositionsBuffer
            int r0 = r0.length
            com.github.mikephil.charting.components.YAxis r1 = r4.mYAxis
            int r1 = r1.mEntryCount
            int r2 = r1 * 2
            if (r0 == r2) goto L11
            int r1 = r1 * 2
            float[] r0 = new float[r1]
            r4.mGetTransformedPositionsBuffer = r0
        L11:
            float[] r0 = r4.mGetTransformedPositionsBuffer
            r1 = 0
        L14:
            int r2 = r0.length
            if (r1 >= r2) goto L24
            com.github.mikephil.charting.components.YAxis r2 = r4.mYAxis
            float[] r2 = r2.mEntries
            int r3 = r1 / 2
            r2 = r2[r3]
            r0[r1] = r2
            int r1 = r1 + 2
            goto L14
        L24:
            com.github.mikephil.charting.utils.Transformer r1 = r4.mTrans
            r1.pointValuesToPixel(r0)
            return r0
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected android.graphics.Path linePath(android.graphics.Path r3, int r4, float[] r5) {
            r2 = this;
            r0 = r5[r4]
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.contentTop()
            r3.moveTo(r0, r1)
            r4 = r5[r4]
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r2.mViewPortHandler
            float r5 = r5.contentBottom()
            r3.lineTo(r4, r5)
            return r3
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas r7) {
            r6 = this;
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L8e
            com.github.mikephil.charting.components.YAxis r0 = r6.mYAxis
            boolean r0 = r0.isDrawLabelsEnabled()
            if (r0 != 0) goto L12
            goto L8e
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
            android.graphics.Paint r1 = r6.mAxisLabelPaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r1.setTextAlign(r2)
            r1 = 1075838976(0x40200000, float:2.5)
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            android.graphics.Paint r2 = r6.mAxisLabelPaint
            java.lang.String r3 = "Q"
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r2, r3)
            float r2 = (float) r2
            com.github.mikephil.charting.components.YAxis r3 = r6.mYAxis
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = r3.getAxisDependency()
            com.github.mikephil.charting.components.YAxis r4 = r6.mYAxis
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r4 = r4.getLabelPosition()
            com.github.mikephil.charting.components.YAxis$AxisDependency r5 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r3 != r5) goto L70
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r2 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            if (r4 != r2) goto L69
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r6.mViewPortHandler
            float r2 = r2.contentTop()
        L67:
            float r2 = r2 - r1
            goto L85
        L69:
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r6.mViewPortHandler
            float r2 = r2.contentTop()
            goto L67
        L70:
            com.github.mikephil.charting.components.YAxis$YAxisLabelPosition r3 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART
            if (r4 != r3) goto L7e
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.contentBottom()
        L7a:
            float r3 = r3 + r2
            float r2 = r3 + r1
            goto L85
        L7e:
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            float r3 = r3.contentBottom()
            goto L7a
        L85:
            com.github.mikephil.charting.components.YAxis r1 = r6.mYAxis
            float r1 = r1.getYOffset()
            r6.drawYLabels(r7, r2, r0, r1)
        L8e:
            return
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
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
            float r4 = r0.contentRight()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r5 = r0.contentTop()
            android.graphics.Paint r6 = r13.mAxisLinePaint
            r1 = r14
            r1.drawLine(r2, r3, r4, r5, r6)
            return
        L50:
            r1 = r14
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r8 = r14.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r9 = r14.contentBottom()
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

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.github.mikephil.charting.components.YAxis r2 = r0.mYAxis
            java.util.List r2 = r2.getLimitLines()
            if (r2 == 0) goto L193
            int r3 = r2.size()
            if (r3 > 0) goto L14
            goto L193
        L14:
            float[] r3 = r0.mRenderLimitLinesBuffer
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r6 = 1
            r3[r6] = r5
            r7 = 2
            r3[r7] = r5
            r8 = 3
            r3[r8] = r5
            android.graphics.Path r9 = r0.mRenderLimitLinesPathBuffer
            r9.reset()
            r10 = 0
        L29:
            int r11 = r2.size()
            if (r10 >= r11) goto L193
            java.lang.Object r11 = r2.get(r10)
            com.github.mikephil.charting.components.LimitLine r11 = (com.github.mikephil.charting.components.LimitLine) r11
            boolean r12 = r11.isEnabled()
            if (r12 != 0) goto L3f
            r16 = 0
            goto L18d
        L3f:
            int r12 = r1.save()
            android.graphics.RectF r13 = r0.mLimitLineClippingRect
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r0.mViewPortHandler
            android.graphics.RectF r14 = r14.getContentRect()
            r13.set(r14)
            android.graphics.RectF r13 = r0.mLimitLineClippingRect
            float r14 = r11.getLineWidth()
            float r14 = -r14
            r13.inset(r14, r5)
            android.graphics.RectF r13 = r0.mLimitLineClippingRect
            r1.clipRect(r13)
            float r13 = r11.getLimit()
            r3[r4] = r13
            float r13 = r11.getLimit()
            r3[r7] = r13
            com.github.mikephil.charting.utils.Transformer r13 = r0.mTrans
            r13.pointValuesToPixel(r3)
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentTop()
            r3[r6] = r13
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentBottom()
            r3[r8] = r13
            r13 = r3[r4]
            r14 = r3[r6]
            r9.moveTo(r13, r14)
            r13 = r3[r7]
            r14 = r3[r8]
            r9.lineTo(r13, r14)
            android.graphics.Paint r13 = r0.mLimitLinePaint
            android.graphics.Paint$Style r14 = android.graphics.Paint.Style.STROKE
            r13.setStyle(r14)
            android.graphics.Paint r13 = r0.mLimitLinePaint
            int r14 = r11.getLineColor()
            r13.setColor(r14)
            android.graphics.Paint r13 = r0.mLimitLinePaint
            android.graphics.DashPathEffect r14 = r11.getDashPathEffect()
            r13.setPathEffect(r14)
            android.graphics.Paint r13 = r0.mLimitLinePaint
            float r14 = r11.getLineWidth()
            r13.setStrokeWidth(r14)
            android.graphics.Paint r13 = r0.mLimitLinePaint
            r1.drawPath(r9, r13)
            r9.reset()
            java.lang.String r13 = r11.getLabel()
            if (r13 == 0) goto L188
            java.lang.String r14 = ""
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto L188
            android.graphics.Paint r14 = r0.mLimitLinePaint
            android.graphics.Paint$Style r15 = r11.getTextStyle()
            r14.setStyle(r15)
            android.graphics.Paint r14 = r0.mLimitLinePaint
            r15 = 0
            r14.setPathEffect(r15)
            android.graphics.Paint r14 = r0.mLimitLinePaint
            int r15 = r11.getTextColor()
            r14.setColor(r15)
            android.graphics.Paint r14 = r0.mLimitLinePaint
            android.graphics.Typeface r15 = r11.getTypeface()
            r14.setTypeface(r15)
            android.graphics.Paint r14 = r0.mLimitLinePaint
            r15 = 1056964608(0x3f000000, float:0.5)
            r14.setStrokeWidth(r15)
            android.graphics.Paint r14 = r0.mLimitLinePaint
            float r15 = r11.getTextSize()
            r14.setTextSize(r15)
            float r14 = r11.getLineWidth()
            float r15 = r11.getXOffset()
            float r14 = r14 + r15
            r15 = 1073741824(0x40000000, float:2.0)
            float r15 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r15)
            float r16 = r11.getYOffset()
            float r15 = r15 + r16
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r11 = r11.getLabelPosition()
            r16 = 0
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r4 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP
            if (r11 != r4) goto L133
            android.graphics.Paint r4 = r0.mLimitLinePaint
            int r4 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r4, r13)
            float r4 = (float) r4
            android.graphics.Paint r11 = r0.mLimitLinePaint
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r11.setTextAlign(r5)
            r5 = r3[r16]
            float r5 = r5 + r14
            com.github.mikephil.charting.utils.ViewPortHandler r11 = r0.mViewPortHandler
            float r11 = r11.contentTop()
            float r11 = r11 + r15
            float r11 = r11 + r4
            android.graphics.Paint r4 = r0.mLimitLinePaint
            r1.drawText(r13, r5, r11, r4)
            goto L18a
        L133:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r4 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM
            if (r11 != r4) goto L14e
            android.graphics.Paint r4 = r0.mLimitLinePaint
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r4.setTextAlign(r5)
            r4 = r3[r16]
            float r4 = r4 + r14
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r0.mViewPortHandler
            float r5 = r5.contentBottom()
            float r5 = r5 - r15
            android.graphics.Paint r11 = r0.mLimitLinePaint
            r1.drawText(r13, r4, r5, r11)
            goto L18a
        L14e:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r4 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP
            if (r11 != r4) goto L171
            android.graphics.Paint r4 = r0.mLimitLinePaint
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.RIGHT
            r4.setTextAlign(r5)
            android.graphics.Paint r4 = r0.mLimitLinePaint
            int r4 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r4, r13)
            float r4 = (float) r4
            r5 = r3[r16]
            float r5 = r5 - r14
            com.github.mikephil.charting.utils.ViewPortHandler r11 = r0.mViewPortHandler
            float r11 = r11.contentTop()
            float r11 = r11 + r15
            float r11 = r11 + r4
            android.graphics.Paint r4 = r0.mLimitLinePaint
            r1.drawText(r13, r5, r11, r4)
            goto L18a
        L171:
            android.graphics.Paint r4 = r0.mLimitLinePaint
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.RIGHT
            r4.setTextAlign(r5)
            r4 = r3[r16]
            float r4 = r4 - r14
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r0.mViewPortHandler
            float r5 = r5.contentBottom()
            float r5 = r5 - r15
            android.graphics.Paint r11 = r0.mLimitLinePaint
            r1.drawText(r13, r4, r5, r11)
            goto L18a
        L188:
            r16 = 0
        L18a:
            r1.restoreToCount(r12)
        L18d:
            int r10 = r10 + 1
            r4 = 0
            r5 = 0
            goto L29
        L193:
            return
    }
}

package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class XAxisRendererHorizontalBarChart extends com.github.mikephil.charting.renderer.XAxisRenderer {
    protected com.github.mikephil.charting.charts.BarChart mChart;
    protected android.graphics.Path mRenderLimitLinesPathBuffer;

    public XAxisRendererHorizontalBarChart(com.github.mikephil.charting.utils.ViewPortHandler r1, com.github.mikephil.charting.components.XAxis r2, com.github.mikephil.charting.utils.Transformer r3, com.github.mikephil.charting.charts.BarChart r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.mRenderLimitLinesPathBuffer = r1
            r0.mChart = r4
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float r3, float r4, boolean r5) {
            r2 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentWidth()
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4f
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            boolean r0 = r0.isFullyZoomedOutY()
            if (r0 != 0) goto L4f
            com.github.mikephil.charting.utils.Transformer r3 = r2.mTrans
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r2.mViewPortHandler
            float r4 = r4.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentBottom()
            com.github.mikephil.charting.utils.MPPointD r3 = r3.getValuesByTouchPoint(r4, r0)
            com.github.mikephil.charting.utils.Transformer r4 = r2.mTrans
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.contentTop()
            com.github.mikephil.charting.utils.MPPointD r4 = r4.getValuesByTouchPoint(r0, r1)
            if (r5 == 0) goto L41
            double r0 = r4.y
            float r5 = (float) r0
            double r0 = r3.y
        L3f:
            float r0 = (float) r0
            goto L47
        L41:
            double r0 = r3.y
            float r5 = (float) r0
            double r0 = r4.y
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

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    protected void computeSize() {
            r5 = this;
            android.graphics.Paint r0 = r5.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r5.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            com.github.mikephil.charting.components.XAxis r0 = r5.mXAxis
            java.lang.String r0 = r0.getLongestLabel()
            android.graphics.Paint r1 = r5.mAxisLabelPaint
            com.github.mikephil.charting.utils.FSize r0 = com.github.mikephil.charting.utils.Utils.calcTextSize(r1, r0)
            float r1 = r0.width
            com.github.mikephil.charting.components.XAxis r2 = r5.mXAxis
            float r2 = r2.getXOffset()
            r3 = 1080033280(0x40600000, float:3.5)
            float r2 = r2 * r3
            float r1 = r1 + r2
            int r1 = (int) r1
            float r1 = (float) r1
            float r2 = r0.height
            float r0 = r0.width
            com.github.mikephil.charting.components.XAxis r4 = r5.mXAxis
            float r4 = r4.getLabelRotationAngle()
            com.github.mikephil.charting.utils.FSize r0 = com.github.mikephil.charting.utils.Utils.getSizeOfRotatedRectangleByDegrees(r0, r2, r4)
            com.github.mikephil.charting.components.XAxis r4 = r5.mXAxis
            int r1 = java.lang.Math.round(r1)
            r4.mLabelWidth = r1
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            int r2 = java.lang.Math.round(r2)
            r1.mLabelHeight = r2
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            float r2 = r0.width
            float r4 = r1.getXOffset()
            float r4 = r4 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            r1.mLabelRotatedWidth = r2
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            float r2 = r0.height
            int r2 = java.lang.Math.round(r2)
            r1.mLabelRotatedHeight = r2
            com.github.mikephil.charting.utils.FSize.recycleInstance(r0)
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    protected void drawGridLine(android.graphics.Canvas r1, float r2, float r3, android.graphics.Path r4) {
            r0 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float r2 = r2.contentRight()
            r4.moveTo(r2, r3)
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float r2 = r2.contentLeft()
            r4.lineTo(r2, r3)
            android.graphics.Paint r2 = r0.mGridPaint
            r1.drawPath(r4, r2)
            r4.reset()
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    protected void drawLabels(android.graphics.Canvas r11, float r12, com.github.mikephil.charting.utils.MPPointF r13) {
            r10 = this;
            com.github.mikephil.charting.components.XAxis r0 = r10.mXAxis
            float r7 = r0.getLabelRotationAngle()
            com.github.mikephil.charting.components.XAxis r0 = r10.mXAxis
            boolean r0 = r0.isCenterAxisLabelsEnabled()
            com.github.mikephil.charting.components.XAxis r1 = r10.mXAxis
            int r1 = r1.mEntryCount
            int r8 = r1 * 2
            float[] r9 = new float[r8]
            r1 = 0
            r2 = 0
        L16:
            if (r2 >= r8) goto L36
            if (r0 == 0) goto L27
            int r3 = r2 + 1
            com.github.mikephil.charting.components.XAxis r4 = r10.mXAxis
            float[] r4 = r4.mCenteredEntries
            int r5 = r2 / 2
            r4 = r4[r5]
            r9[r3] = r4
            goto L33
        L27:
            int r3 = r2 + 1
            com.github.mikephil.charting.components.XAxis r4 = r10.mXAxis
            float[] r4 = r4.mEntries
            int r5 = r2 / 2
            r4 = r4[r5]
            r9[r3] = r4
        L33:
            int r2 = r2 + 2
            goto L16
        L36:
            com.github.mikephil.charting.utils.Transformer r0 = r10.mTrans
            r0.pointValuesToPixel(r9)
            r0 = 0
        L3c:
            if (r0 >= r8) goto L6d
            int r1 = r0 + 1
            r5 = r9[r1]
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            boolean r1 = r1.isInBoundsY(r5)
            if (r1 == 0) goto L64
            com.github.mikephil.charting.components.XAxis r1 = r10.mXAxis
            com.github.mikephil.charting.formatter.ValueFormatter r1 = r1.getValueFormatter()
            com.github.mikephil.charting.components.XAxis r2 = r10.mXAxis
            float[] r3 = r2.mEntries
            int r4 = r0 / 2
            r3 = r3[r4]
            java.lang.String r3 = r1.getAxisLabel(r3, r2)
            r1 = r10
            r2 = r11
            r4 = r12
            r6 = r13
            r1.drawLabel(r2, r3, r4, r5, r6, r7)
            goto L67
        L64:
            r2 = r11
            r4 = r12
            r6 = r13
        L67:
            int r0 = r0 + 2
            r11 = r2
            r12 = r4
            r13 = r6
            goto L3c
        L6d:
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
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

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas r8) {
            r7 = this;
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Lc5
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            boolean r0 = r0.isDrawLabelsEnabled()
            if (r0 != 0) goto L12
            goto Lc5
        L12:
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            float r0 = r0.getXOffset()
            android.graphics.Paint r1 = r7.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            int r2 = r2.getTextColor()
            r1.setColor(r2)
            r1 = 0
            com.github.mikephil.charting.utils.MPPointF r2 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1, r1)
            com.github.mikephil.charting.components.XAxis r3 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = r3.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r4 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 != r4) goto L59
            r2.x = r1
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentRight()
            float r1 = r1 + r0
            r7.drawLabels(r8, r1, r2)
            goto Lc2
        L59:
            com.github.mikephil.charting.components.XAxis r3 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = r3.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r4 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r4) goto L74
            r2.x = r6
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentRight()
            float r1 = r1 - r0
            r7.drawLabels(r8, r1, r2)
            goto Lc2
        L74:
            com.github.mikephil.charting.components.XAxis r3 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = r3.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r4 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            if (r3 != r4) goto L8d
            r2.x = r6
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentLeft()
            float r1 = r1 - r0
            r7.drawLabels(r8, r1, r2)
            goto Lc2
        L8d:
            com.github.mikephil.charting.components.XAxis r3 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = r3.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r4 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE
            if (r3 != r4) goto La6
            r2.x = r6
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentLeft()
            float r1 = r1 + r0
            r7.drawLabels(r8, r1, r2)
            goto Lc2
        La6:
            r2.x = r1
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentRight()
            float r1 = r1 + r0
            r7.drawLabels(r8, r1, r2)
            r2.x = r6
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentLeft()
            float r1 = r1 - r0
            r7.drawLabels(r8, r1, r2)
        Lc2:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r2)
        Lc5:
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(android.graphics.Canvas r14) {
            r13 = this;
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            boolean r0 = r0.isDrawAxisLineEnabled()
            if (r0 == 0) goto La3
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L12
            goto La3
        L12:
            android.graphics.Paint r0 = r13.mAxisLinePaint
            com.github.mikephil.charting.components.XAxis r1 = r13.mXAxis
            int r1 = r1.getAxisLineColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = r13.mAxisLinePaint
            com.github.mikephil.charting.components.XAxis r1 = r13.mXAxis
            float r1 = r1.getAxisLineWidth()
            r0.setStrokeWidth(r1)
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = r0.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP
            if (r0 == r1) goto L49
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = r0.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE
            if (r0 == r1) goto L49
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = r0.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED
            if (r0 != r1) goto L47
            goto L49
        L47:
            r1 = r14
            goto L67
        L49:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r2 = r0.contentRight()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r3 = r0.contentTop()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r4 = r0.contentRight()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r13.mViewPortHandler
            float r5 = r0.contentBottom()
            android.graphics.Paint r6 = r13.mAxisLinePaint
            r1 = r14
            r1.drawLine(r2, r3, r4, r5, r6)
        L67:
            com.github.mikephil.charting.components.XAxis r14 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r14 = r14.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            if (r14 == r0) goto L85
            com.github.mikephil.charting.components.XAxis r14 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r14 = r14.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE
            if (r14 == r0) goto L85
            com.github.mikephil.charting.components.XAxis r14 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r14 = r14.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED
            if (r14 != r0) goto La3
        L85:
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r8 = r14.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r9 = r14.contentTop()
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r10 = r14.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r13.mViewPortHandler
            float r11 = r14.contentBottom()
            android.graphics.Paint r12 = r13.mAxisLinePaint
            r7 = r1
            r7.drawLine(r8, r9, r10, r11, r12)
        La3:
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas r14) {
            r13 = this;
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            java.util.List r0 = r0.getLimitLines()
            if (r0 == 0) goto L161
            int r1 = r0.size()
            if (r1 > 0) goto L10
            goto L161
        L10:
            float[] r1 = r13.mRenderLimitLinesBuffer
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            android.graphics.Path r5 = r13.mRenderLimitLinesPathBuffer
            r5.reset()
        L1e:
            int r6 = r0.size()
            if (r2 >= r6) goto L161
            java.lang.Object r6 = r0.get(r2)
            com.github.mikephil.charting.components.LimitLine r6 = (com.github.mikephil.charting.components.LimitLine) r6
            boolean r7 = r6.isEnabled()
            if (r7 != 0) goto L32
            goto L15d
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
            if (r8 == 0) goto L15a
            java.lang.String r9 = ""
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L15a
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
            if (r6 != r12) goto L10d
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
            goto L15a
        L10d:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r12 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM
            if (r6 != r12) goto L128
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
            goto L15a
        L128:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r12 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP
            if (r6 != r12) goto L144
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
            goto L15a
        L144:
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
        L15a:
            r14.restoreToCount(r7)
        L15d:
            int r2 = r2 + 1
            goto L1e
        L161:
            return
    }
}

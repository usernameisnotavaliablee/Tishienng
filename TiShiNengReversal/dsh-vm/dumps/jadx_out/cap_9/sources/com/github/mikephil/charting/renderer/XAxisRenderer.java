package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class XAxisRenderer extends com.github.mikephil.charting.renderer.AxisRenderer {
    protected android.graphics.RectF mGridClippingRect;
    protected android.graphics.RectF mLimitLineClippingRect;
    private android.graphics.Path mLimitLinePath;
    float[] mLimitLineSegmentsBuffer;
    protected float[] mRenderGridLinesBuffer;
    protected android.graphics.Path mRenderGridLinesPath;
    protected float[] mRenderLimitLinesBuffer;
    protected com.github.mikephil.charting.components.XAxis mXAxis;

    public XAxisRenderer(com.github.mikephil.charting.utils.ViewPortHandler r1, com.github.mikephil.charting.components.XAxis r2, com.github.mikephil.charting.utils.Transformer r3) {
            r0 = this;
            r0.<init>(r1, r3, r2)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.mRenderGridLinesPath = r1
            r1 = 2
            float[] r3 = new float[r1]
            r0.mRenderGridLinesBuffer = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.mGridClippingRect = r3
            float[] r1 = new float[r1]
            r0.mRenderLimitLinesBuffer = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mLimitLineClippingRect = r1
            r1 = 4
            float[] r1 = new float[r1]
            r0.mLimitLineSegmentsBuffer = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.mLimitLinePath = r1
            r0.mXAxis = r2
            android.graphics.Paint r1 = r0.mAxisLabelPaint
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.mAxisLabelPaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r1.setTextAlign(r2)
            android.graphics.Paint r1 = r0.mAxisLabelPaint
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r1.setTextSize(r2)
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float r3, float r4, boolean r5) {
            r2 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentWidth()
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
            if (r5 == 0) goto L41
            double r0 = r4.x
            float r5 = (float) r0
            double r0 = r3.x
        L3f:
            float r0 = (float) r0
            goto L47
        L41:
            double r0 = r3.x
            float r5 = (float) r0
            double r0 = r4.x
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

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    protected void computeAxisValues(float r1, float r2) {
            r0 = this;
            super.computeAxisValues(r1, r2)
            r0.computeSize()
            return
    }

    protected void computeSize() {
            r5 = this;
            com.github.mikephil.charting.components.XAxis r0 = r5.mXAxis
            java.lang.String r0 = r0.getLongestLabel()
            android.graphics.Paint r1 = r5.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r2 = r5.mXAxis
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r5.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r2 = r5.mXAxis
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r5.mAxisLabelPaint
            com.github.mikephil.charting.utils.FSize r0 = com.github.mikephil.charting.utils.Utils.calcTextSize(r1, r0)
            float r1 = r0.width
            android.graphics.Paint r2 = r5.mAxisLabelPaint
            java.lang.String r3 = "Q"
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r2, r3)
            float r2 = (float) r2
            com.github.mikephil.charting.components.XAxis r3 = r5.mXAxis
            float r3 = r3.getLabelRotationAngle()
            com.github.mikephil.charting.utils.FSize r3 = com.github.mikephil.charting.utils.Utils.getSizeOfRotatedRectangleByDegrees(r1, r2, r3)
            com.github.mikephil.charting.components.XAxis r4 = r5.mXAxis
            int r1 = java.lang.Math.round(r1)
            r4.mLabelWidth = r1
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            int r2 = java.lang.Math.round(r2)
            r1.mLabelHeight = r2
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            float r2 = r3.width
            int r2 = java.lang.Math.round(r2)
            r1.mLabelRotatedWidth = r2
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            float r2 = r3.height
            int r2 = java.lang.Math.round(r2)
            r1.mLabelRotatedHeight = r2
            com.github.mikephil.charting.utils.FSize.recycleInstance(r3)
            com.github.mikephil.charting.utils.FSize.recycleInstance(r0)
            return
    }

    protected void drawGridLine(android.graphics.Canvas r1, float r2, float r3, android.graphics.Path r4) {
            r0 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            float r3 = r3.contentBottom()
            r4.moveTo(r2, r3)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            float r3 = r3.contentTop()
            r4.lineTo(r2, r3)
            android.graphics.Paint r2 = r0.mGridPaint
            r1.drawPath(r4, r2)
            r4.reset()
            return
    }

    protected void drawLabel(android.graphics.Canvas r8, java.lang.String r9, float r10, float r11, com.github.mikephil.charting.utils.MPPointF r12, float r13) {
            r7 = this;
            android.graphics.Paint r4 = r7.mAxisLabelPaint
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            com.github.mikephil.charting.utils.Utils.drawXAxisValue(r0, r1, r2, r3, r4, r5, r6)
            return
    }

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
            if (r2 >= r8) goto L32
            if (r0 == 0) goto L25
            com.github.mikephil.charting.components.XAxis r3 = r10.mXAxis
            float[] r3 = r3.mCenteredEntries
            int r4 = r2 / 2
            r3 = r3[r4]
            r9[r2] = r3
            goto L2f
        L25:
            com.github.mikephil.charting.components.XAxis r3 = r10.mXAxis
            float[] r3 = r3.mEntries
            int r4 = r2 / 2
            r3 = r3[r4]
            r9[r2] = r3
        L2f:
            int r2 = r2 + 2
            goto L16
        L32:
            com.github.mikephil.charting.utils.Transformer r0 = r10.mTrans
            r0.pointValuesToPixel(r9)
            r0 = 0
        L38:
            if (r0 >= r8) goto Lab
            r1 = r9[r0]
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r10.mViewPortHandler
            boolean r2 = r2.isInBoundsX(r1)
            if (r2 == 0) goto La2
            com.github.mikephil.charting.components.XAxis r2 = r10.mXAxis
            com.github.mikephil.charting.formatter.ValueFormatter r2 = r2.getValueFormatter()
            com.github.mikephil.charting.components.XAxis r3 = r10.mXAxis
            float[] r4 = r3.mEntries
            int r5 = r0 / 2
            r4 = r4[r5]
            java.lang.String r3 = r2.getAxisLabel(r4, r3)
            com.github.mikephil.charting.components.XAxis r2 = r10.mXAxis
            boolean r2 = r2.isAvoidFirstLastClippingEnabled()
            if (r2 == 0) goto L8c
            com.github.mikephil.charting.components.XAxis r2 = r10.mXAxis
            int r2 = r2.mEntryCount
            int r4 = r2 + (-1)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r5 != r4) goto L92
            r4 = 1
            if (r2 <= r4) goto L92
            android.graphics.Paint r2 = r10.mAxisLabelPaint
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r2, r3)
            float r2 = (float) r2
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r10.mViewPortHandler
            float r4 = r4.offsetRight()
            float r4 = r4 * r6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8c
            float r4 = r1 + r2
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r10.mViewPortHandler
            float r5 = r5.getChartWidth()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L8c
            float r2 = r2 / r6
            float r1 = r1 - r2
        L8c:
            r2 = r11
            r5 = r12
            r6 = r13
            r4 = r1
            r1 = r10
            goto L9e
        L92:
            if (r0 != 0) goto L8c
            android.graphics.Paint r2 = r10.mAxisLabelPaint
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r2, r3)
            float r2 = (float) r2
            float r2 = r2 / r6
            float r1 = r1 + r2
            goto L8c
        L9e:
            r1.drawLabel(r2, r3, r4, r5, r6, r7)
            goto La5
        La2:
            r2 = r11
            r5 = r12
            r6 = r13
        La5:
            int r0 = r0 + 2
            r11 = r2
            r12 = r5
            r13 = r6
            goto L38
        Lab:
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
            r0.inset(r1, r2)
            android.graphics.RectF r0 = r3.mGridClippingRect
            return r0
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas r8) {
            r7 = this;
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Ld1
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            boolean r0 = r0.isDrawLabelsEnabled()
            if (r0 != 0) goto L12
            goto Ld1
        L12:
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            float r0 = r0.getYOffset()
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
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r3 != r4) goto L5b
            r2.x = r6
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentTop()
            float r1 = r1 - r0
            r7.drawLabels(r8, r1, r2)
            goto Lce
        L5b:
            com.github.mikephil.charting.components.XAxis r3 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = r3.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r4 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE
            if (r3 != r4) goto L7a
            r2.x = r6
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentTop()
            float r1 = r1 + r0
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            int r0 = r0.mLabelRotatedHeight
            float r0 = (float) r0
            float r1 = r1 + r0
            r7.drawLabels(r8, r1, r2)
            goto Lce
        L7a:
            com.github.mikephil.charting.components.XAxis r3 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = r3.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r4 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            if (r3 != r4) goto L93
            r2.x = r6
            r2.y = r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentBottom()
            float r1 = r1 + r0
            r7.drawLabels(r8, r1, r2)
            goto Lce
        L93:
            com.github.mikephil.charting.components.XAxis r3 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = r3.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r4 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE
            if (r3 != r4) goto Lb2
            r2.x = r6
            r2.y = r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentBottom()
            float r1 = r1 - r0
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            int r0 = r0.mLabelRotatedHeight
            float r0 = (float) r0
            float r1 = r1 - r0
            r7.drawLabels(r8, r1, r2)
            goto Lce
        Lb2:
            r2.x = r6
            r2.y = r5
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r7.mViewPortHandler
            float r3 = r3.contentTop()
            float r3 = r3 - r0
            r7.drawLabels(r8, r3, r2)
            r2.x = r6
            r2.y = r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r1 = r1.contentBottom()
            float r1 = r1 + r0
            r7.drawLabels(r8, r1, r2)
        Lce:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r2)
        Ld1:
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(android.graphics.Canvas r14) {
            r13 = this;
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            boolean r0 = r0.isDrawAxisLineEnabled()
            if (r0 == 0) goto Lae
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L12
            goto Lae
        L12:
            android.graphics.Paint r0 = r13.mAxisLinePaint
            com.github.mikephil.charting.components.XAxis r1 = r13.mXAxis
            int r1 = r1.getAxisLineColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = r13.mAxisLinePaint
            com.github.mikephil.charting.components.XAxis r1 = r13.mXAxis
            float r1 = r1.getAxisLineWidth()
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r13.mAxisLinePaint
            com.github.mikephil.charting.components.XAxis r1 = r13.mXAxis
            android.graphics.DashPathEffect r1 = r1.getAxisLineDashPathEffect()
            r0.setPathEffect(r1)
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = r0.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP
            if (r0 == r1) goto L54
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = r0.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE
            if (r0 == r1) goto L54
            com.github.mikephil.charting.components.XAxis r0 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = r0.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED
            if (r0 != r1) goto L52
            goto L54
        L52:
            r1 = r14
            goto L72
        L54:
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
        L72:
            com.github.mikephil.charting.components.XAxis r14 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r14 = r14.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            if (r14 == r0) goto L90
            com.github.mikephil.charting.components.XAxis r14 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r14 = r14.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE
            if (r14 == r0) goto L90
            com.github.mikephil.charting.components.XAxis r14 = r13.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r14 = r14.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED
            if (r14 != r0) goto Lae
        L90:
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
        Lae:
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(android.graphics.Canvas r8) {
            r7 = this;
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            boolean r0 = r0.isDrawGridLinesEnabled()
            if (r0 == 0) goto L6a
            com.github.mikephil.charting.components.XAxis r0 = r7.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L11
            goto L6a
        L11:
            int r0 = r8.save()
            android.graphics.RectF r1 = r7.getGridClippingRect()
            r8.clipRect(r1)
            float[] r1 = r7.mRenderGridLinesBuffer
            int r1 = r1.length
            com.github.mikephil.charting.components.AxisBase r2 = r7.mAxis
            int r2 = r2.mEntryCount
            int r2 = r2 * 2
            if (r1 == r2) goto L31
            com.github.mikephil.charting.components.XAxis r1 = r7.mXAxis
            int r1 = r1.mEntryCount
            int r1 = r1 * 2
            float[] r1 = new float[r1]
            r7.mRenderGridLinesBuffer = r1
        L31:
            float[] r1 = r7.mRenderGridLinesBuffer
            r2 = 0
            r3 = 0
        L35:
            int r4 = r1.length
            if (r3 >= r4) goto L4b
            com.github.mikephil.charting.components.XAxis r4 = r7.mXAxis
            float[] r4 = r4.mEntries
            int r5 = r3 / 2
            r6 = r4[r5]
            r1[r3] = r6
            int r6 = r3 + 1
            r4 = r4[r5]
            r1[r6] = r4
            int r3 = r3 + 2
            goto L35
        L4b:
            com.github.mikephil.charting.utils.Transformer r3 = r7.mTrans
            r3.pointValuesToPixel(r1)
            r7.setupGridPaint()
            android.graphics.Path r3 = r7.mRenderGridLinesPath
            r3.reset()
        L58:
            int r4 = r1.length
            if (r2 >= r4) goto L67
            r4 = r1[r2]
            int r5 = r2 + 1
            r5 = r1[r5]
            r7.drawGridLine(r8, r4, r5, r3)
            int r2 = r2 + 2
            goto L58
        L67:
            r8.restoreToCount(r0)
        L6a:
            return
    }

    public void renderLimitLineLabel(android.graphics.Canvas r6, com.github.mikephil.charting.components.LimitLine r7, float[] r8, float r9) {
            r5 = this;
            java.lang.String r0 = r7.getLabel()
            if (r0 == 0) goto Lbb
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lbb
            android.graphics.Paint r1 = r5.mLimitLinePaint
            android.graphics.Paint$Style r2 = r7.getTextStyle()
            r1.setStyle(r2)
            android.graphics.Paint r1 = r5.mLimitLinePaint
            r2 = 0
            r1.setPathEffect(r2)
            android.graphics.Paint r1 = r5.mLimitLinePaint
            int r2 = r7.getTextColor()
            r1.setColor(r2)
            android.graphics.Paint r1 = r5.mLimitLinePaint
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r5.mLimitLinePaint
            float r2 = r7.getTextSize()
            r1.setTextSize(r2)
            float r1 = r7.getLineWidth()
            float r2 = r7.getXOffset()
            float r1 = r1 + r2
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r7 = r7.getLabelPosition()
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r2 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP
            r3 = 0
            if (r7 != r2) goto L67
            android.graphics.Paint r7 = r5.mLimitLinePaint
            int r7 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r7, r0)
            float r7 = (float) r7
            android.graphics.Paint r2 = r5.mLimitLinePaint
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.LEFT
            r2.setTextAlign(r4)
            r8 = r8[r3]
            float r8 = r8 + r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r5.mViewPortHandler
            float r1 = r1.contentTop()
            float r1 = r1 + r9
            float r1 = r1 + r7
            android.graphics.Paint r7 = r5.mLimitLinePaint
            r6.drawText(r0, r8, r1, r7)
            return
        L67:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r2 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM
            if (r7 != r2) goto L82
            android.graphics.Paint r7 = r5.mLimitLinePaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            r7.setTextAlign(r2)
            r7 = r8[r3]
            float r7 = r7 + r1
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r5.mViewPortHandler
            float r8 = r8.contentBottom()
            float r8 = r8 - r9
            android.graphics.Paint r9 = r5.mLimitLinePaint
            r6.drawText(r0, r7, r8, r9)
            return
        L82:
            com.github.mikephil.charting.components.LimitLine$LimitLabelPosition r2 = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP
            if (r7 != r2) goto La5
            android.graphics.Paint r7 = r5.mLimitLinePaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.RIGHT
            r7.setTextAlign(r2)
            android.graphics.Paint r7 = r5.mLimitLinePaint
            int r7 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r7, r0)
            float r7 = (float) r7
            r8 = r8[r3]
            float r8 = r8 - r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r5.mViewPortHandler
            float r1 = r1.contentTop()
            float r1 = r1 + r9
            float r1 = r1 + r7
            android.graphics.Paint r7 = r5.mLimitLinePaint
            r6.drawText(r0, r8, r1, r7)
            return
        La5:
            android.graphics.Paint r7 = r5.mLimitLinePaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.RIGHT
            r7.setTextAlign(r2)
            r7 = r8[r3]
            float r7 = r7 - r1
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r5.mViewPortHandler
            float r8 = r8.contentBottom()
            float r8 = r8 - r9
            android.graphics.Paint r9 = r5.mLimitLinePaint
            r6.drawText(r0, r7, r8, r9)
        Lbb:
            return
    }

    public void renderLimitLineLine(android.graphics.Canvas r6, com.github.mikephil.charting.components.LimitLine r7, float[] r8) {
            r5 = this;
            float[] r0 = r5.mLimitLineSegmentsBuffer
            r1 = 0
            r2 = r8[r1]
            r0[r1] = r2
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r5.mViewPortHandler
            float r2 = r2.contentTop()
            r3 = 1
            r0[r3] = r2
            float[] r0 = r5.mLimitLineSegmentsBuffer
            r8 = r8[r1]
            r2 = 2
            r0[r2] = r8
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r5.mViewPortHandler
            float r8 = r8.contentBottom()
            r4 = 3
            r0[r4] = r8
            android.graphics.Path r8 = r5.mLimitLinePath
            r8.reset()
            android.graphics.Path r8 = r5.mLimitLinePath
            float[] r0 = r5.mLimitLineSegmentsBuffer
            r1 = r0[r1]
            r0 = r0[r3]
            r8.moveTo(r1, r0)
            android.graphics.Path r8 = r5.mLimitLinePath
            float[] r0 = r5.mLimitLineSegmentsBuffer
            r1 = r0[r2]
            r0 = r0[r4]
            r8.lineTo(r1, r0)
            android.graphics.Paint r8 = r5.mLimitLinePaint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r0)
            android.graphics.Paint r8 = r5.mLimitLinePaint
            int r0 = r7.getLineColor()
            r8.setColor(r0)
            android.graphics.Paint r8 = r5.mLimitLinePaint
            float r0 = r7.getLineWidth()
            r8.setStrokeWidth(r0)
            android.graphics.Paint r8 = r5.mLimitLinePaint
            android.graphics.DashPathEffect r7 = r7.getDashPathEffect()
            r8.setPathEffect(r7)
            android.graphics.Path r7 = r5.mLimitLinePath
            android.graphics.Paint r8 = r5.mLimitLinePaint
            r6.drawPath(r7, r8)
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas r11) {
            r10 = this;
            com.github.mikephil.charting.components.XAxis r0 = r10.mXAxis
            java.util.List r0 = r0.getLimitLines()
            if (r0 == 0) goto L6a
            int r1 = r0.size()
            if (r1 > 0) goto Lf
            goto L6a
        Lf:
            float[] r1 = r10.mRenderLimitLinesBuffer
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r5 = 0
        L19:
            int r6 = r0.size()
            if (r5 >= r6) goto L6a
            java.lang.Object r6 = r0.get(r5)
            com.github.mikephil.charting.components.LimitLine r6 = (com.github.mikephil.charting.components.LimitLine) r6
            boolean r7 = r6.isEnabled()
            if (r7 != 0) goto L2c
            goto L67
        L2c:
            int r7 = r11.save()
            android.graphics.RectF r8 = r10.mLimitLineClippingRect
            com.github.mikephil.charting.utils.ViewPortHandler r9 = r10.mViewPortHandler
            android.graphics.RectF r9 = r9.getContentRect()
            r8.set(r9)
            android.graphics.RectF r8 = r10.mLimitLineClippingRect
            float r9 = r6.getLineWidth()
            float r9 = -r9
            r8.inset(r9, r3)
            android.graphics.RectF r8 = r10.mLimitLineClippingRect
            r11.clipRect(r8)
            float r8 = r6.getLimit()
            r1[r2] = r8
            r1[r4] = r3
            com.github.mikephil.charting.utils.Transformer r8 = r10.mTrans
            r8.pointValuesToPixel(r1)
            r10.renderLimitLineLine(r11, r6, r1)
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r6.getYOffset()
            float r9 = r9 + r8
            r10.renderLimitLineLabel(r11, r6, r1, r9)
            r11.restoreToCount(r7)
        L67:
            int r5 = r5 + 1
            goto L19
        L6a:
            return
    }

    protected void setupGridPaint() {
            r2 = this;
            android.graphics.Paint r0 = r2.mGridPaint
            com.github.mikephil.charting.components.XAxis r1 = r2.mXAxis
            int r1 = r1.getGridColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.mGridPaint
            com.github.mikephil.charting.components.XAxis r1 = r2.mXAxis
            float r1 = r1.getGridLineWidth()
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.mGridPaint
            com.github.mikephil.charting.components.XAxis r1 = r2.mXAxis
            android.graphics.DashPathEffect r1 = r1.getGridDashPathEffect()
            r0.setPathEffect(r1)
            return
    }
}

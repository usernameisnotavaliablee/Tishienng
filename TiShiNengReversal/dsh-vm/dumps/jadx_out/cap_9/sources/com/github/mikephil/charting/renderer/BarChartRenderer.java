package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BarChartRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    protected android.graphics.Paint mBarBorderPaint;
    protected com.github.mikephil.charting.buffer.BarBuffer[] mBarBuffers;
    protected android.graphics.RectF mBarRect;
    private android.graphics.RectF mBarShadowRectBuffer;
    protected com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider mChart;
    protected android.graphics.Paint mShadowPaint;

    public BarChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r2, com.github.mikephil.charting.animation.ChartAnimator r3, com.github.mikephil.charting.utils.ViewPortHandler r4) {
            r1 = this;
            r1.<init>(r3, r4)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r1.mBarRect = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r1.mBarShadowRectBuffer = r3
            r1.mChart = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.mHighlightPaint = r2
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r2.setStyle(r4)
            android.graphics.Paint r2 = r1.mHighlightPaint
            r0 = 0
            int r0 = android.graphics.Color.rgb(r0, r0, r0)
            r2.setColor(r0)
            android.graphics.Paint r2 = r1.mHighlightPaint
            r0 = 120(0x78, float:1.68E-43)
            r2.setAlpha(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r3)
            r1.mShadowPaint = r2
            r2.setStyle(r4)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r3)
            r1.mBarBorderPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas r5) {
            r4 = this;
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r4.mChart
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            r1 = 0
        L7:
            int r2 = r0.getDataSetCount()
            if (r1 >= r2) goto L1f
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = r0.getDataSetByIndex(r1)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r2
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto L1c
            r4.drawDataSet(r5, r2, r1)
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            return
    }

    protected void drawDataSet(android.graphics.Canvas r24, com.github.mikephil.charting.interfaces.datasets.IBarDataSet r25, int r26) {
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r3 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r4 = r1.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r3 = r3.getTransformer(r4)
            android.graphics.Paint r4 = r0.mBarBorderPaint
            int r5 = r1.getBarBorderColor()
            r4.setColor(r5)
            android.graphics.Paint r4 = r0.mBarBorderPaint
            float r5 = r1.getBarBorderWidth()
            float r5 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r5)
            r4.setStrokeWidth(r5)
            float r4 = r1.getBarBorderWidth()
            r5 = 0
            r6 = 0
            r7 = 1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            com.github.mikephil.charting.animation.ChartAnimator r5 = r0.mAnimator
            float r5 = r5.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r8 = r0.mAnimator
            float r8 = r8.getPhaseY()
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r9 = r0.mChart
            boolean r9 = r9.isDrawBarShadowEnabled()
            if (r9 == 0) goto La7
            android.graphics.Paint r9 = r0.mShadowPaint
            int r10 = r1.getBarShadowColor()
            r9.setColor(r10)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r9 = r0.mChart
            com.github.mikephil.charting.data.BarData r9 = r9.getBarData()
            float r9 = r9.getBarWidth()
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            int r10 = r1.getEntryCount()
            float r10 = (float) r10
            float r10 = r10 * r5
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            int r11 = r1.getEntryCount()
            int r10 = java.lang.Math.min(r10, r11)
            r11 = 0
        L74:
            if (r11 >= r10) goto La7
            com.github.mikephil.charting.data.Entry r12 = r1.getEntryForIndex(r11)
            com.github.mikephil.charting.data.BarEntry r12 = (com.github.mikephil.charting.data.BarEntry) r12
            float r12 = r12.getX()
            android.graphics.RectF r13 = r0.mBarShadowRectBuffer
            float r14 = r12 - r9
            r13.left = r14
            float r12 = r12 + r9
            r13.right = r12
            r3.rectValueToPixel(r13)
            com.github.mikephil.charting.utils.ViewPortHandler r12 = r0.mViewPortHandler
            android.graphics.RectF r13 = r0.mBarShadowRectBuffer
            float r13 = r13.right
            boolean r12 = r12.isInBoundsLeft(r13)
            if (r12 != 0) goto L9b
            r14 = r24
            goto Lc7
        L9b:
            com.github.mikephil.charting.utils.ViewPortHandler r12 = r0.mViewPortHandler
            android.graphics.RectF r13 = r0.mBarShadowRectBuffer
            float r13 = r13.left
            boolean r12 = r12.isInBoundsRight(r13)
            if (r12 != 0) goto Laa
        La7:
            r14 = r24
            goto Lca
        Laa:
            android.graphics.RectF r12 = r0.mBarShadowRectBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentTop()
            r12.top = r13
            android.graphics.RectF r12 = r0.mBarShadowRectBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentBottom()
            r12.bottom = r13
            android.graphics.RectF r12 = r0.mBarShadowRectBuffer
            android.graphics.Paint r13 = r0.mShadowPaint
            r14 = r24
            r14.drawRect(r12, r13)
        Lc7:
            int r11 = r11 + 1
            goto L74
        Lca:
            com.github.mikephil.charting.buffer.BarBuffer[] r9 = r0.mBarBuffers
            r9 = r9[r2]
            r9.setPhases(r5, r8)
            r9.setDataSet(r2)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r2 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r5 = r1.getAxisDependency()
            boolean r2 = r2.isInverted(r5)
            r9.setInverted(r2)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r2 = r0.mChart
            com.github.mikephil.charting.data.BarData r2 = r2.getBarData()
            float r2 = r2.getBarWidth()
            r9.setBarWidth(r2)
            r9.feed(r1)
            float[] r2 = r9.buffer
            r3.pointValuesToPixel(r2)
            java.util.List r2 = r1.getColors()
            int r2 = r2.size()
            if (r2 != r7) goto L101
            goto L102
        L101:
            r7 = 0
        L102:
            if (r7 == 0) goto L10d
            android.graphics.Paint r2 = r0.mRenderPaint
            int r3 = r1.getColor()
            r2.setColor(r3)
        L10d:
            int r2 = r9.size()
            if (r6 >= r2) goto L1cc
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float[] r3 = r9.buffer
            int r5 = r6 + 2
            r3 = r3[r5]
            boolean r2 = r2.isInBoundsLeft(r3)
            if (r2 != 0) goto L123
            goto L1c6
        L123:
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float[] r3 = r9.buffer
            r3 = r3[r6]
            boolean r2 = r2.isInBoundsRight(r3)
            if (r2 != 0) goto L131
            goto L1cc
        L131:
            if (r7 != 0) goto L13e
            android.graphics.Paint r2 = r0.mRenderPaint
            int r3 = r6 / 4
            int r3 = r1.getColor(r3)
            r2.setColor(r3)
        L13e:
            com.github.mikephil.charting.model.GradientColor r2 = r1.getGradientColor()
            if (r2 == 0) goto L16a
            com.github.mikephil.charting.model.GradientColor r2 = r1.getGradientColor()
            android.graphics.Paint r3 = r0.mRenderPaint
            android.graphics.LinearGradient r15 = new android.graphics.LinearGradient
            float[] r8 = r9.buffer
            r16 = r8[r6]
            int r10 = r6 + 3
            r17 = r8[r10]
            int r10 = r6 + 1
            r19 = r8[r10]
            int r20 = r2.getStartColor()
            int r21 = r2.getEndColor()
            android.graphics.Shader$TileMode r22 = android.graphics.Shader.TileMode.MIRROR
            r18 = r16
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r3.setShader(r15)
        L16a:
            java.util.List r2 = r1.getGradientColors()
            if (r2 == 0) goto L19c
            android.graphics.Paint r2 = r0.mRenderPaint
            android.graphics.LinearGradient r15 = new android.graphics.LinearGradient
            float[] r3 = r9.buffer
            r16 = r3[r6]
            int r8 = r6 + 3
            r17 = r3[r8]
            int r8 = r6 + 1
            r19 = r3[r8]
            int r3 = r6 / 4
            com.github.mikephil.charting.model.GradientColor r8 = r1.getGradientColor(r3)
            int r20 = r8.getStartColor()
            com.github.mikephil.charting.model.GradientColor r3 = r1.getGradientColor(r3)
            int r21 = r3.getEndColor()
            android.graphics.Shader$TileMode r22 = android.graphics.Shader.TileMode.MIRROR
            r18 = r16
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r2.setShader(r15)
        L19c:
            float[] r2 = r9.buffer
            r15 = r2[r6]
            int r3 = r6 + 1
            r16 = r2[r3]
            r17 = r2[r5]
            int r8 = r6 + 3
            r18 = r2[r8]
            android.graphics.Paint r2 = r0.mRenderPaint
            r19 = r2
            r14.drawRect(r15, r16, r17, r18, r19)
            if (r4 == 0) goto L1c6
            float[] r2 = r9.buffer
            r15 = r2[r6]
            r16 = r2[r3]
            r17 = r2[r5]
            r18 = r2[r8]
            android.graphics.Paint r2 = r0.mBarBorderPaint
            r14 = r24
            r19 = r2
            r14.drawRect(r15, r16, r17, r18, r19)
        L1c6:
            int r6 = r6 + 4
            r14 = r24
            goto L10d
        L1cc:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas r13, com.github.mikephil.charting.highlight.Highlight[] r14) {
            r12 = this;
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r12.mChart
            com.github.mikephil.charting.data.BarData r6 = r1.getBarData()
            int r7 = r14.length
            r1 = 0
            r8 = 0
        L9:
            if (r8 >= r7) goto Laa
            r9 = r14[r8]
            int r1 = r9.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r6.getDataSetByIndex(r1)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r1
            if (r1 == 0) goto La6
            boolean r2 = r1.isHighlightEnabled()
            if (r2 != 0) goto L21
            goto La6
        L21:
            float r2 = r9.getX()
            float r3 = r9.getY()
            com.github.mikephil.charting.data.Entry r2 = r1.getEntryForXValue(r2, r3)
            com.github.mikephil.charting.data.BarEntry r2 = (com.github.mikephil.charting.data.BarEntry) r2
            boolean r3 = r12.isInBoundsX(r2, r1)
            if (r3 != 0) goto L37
            goto La6
        L37:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r3 = r12.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r4 = r1.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r5 = r3.getTransformer(r4)
            android.graphics.Paint r3 = r12.mHighlightPaint
            int r4 = r1.getHighLightColor()
            r3.setColor(r4)
            android.graphics.Paint r3 = r12.mHighlightPaint
            int r1 = r1.getHighLightAlpha()
            r3.setAlpha(r1)
            int r1 = r9.getStackIndex()
            if (r1 < 0) goto L83
            boolean r1 = r2.isStacked()
            if (r1 == 0) goto L83
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r12.mChart
            boolean r1 = r1.isHighlightFullBarEnabled()
            if (r1 == 0) goto L71
            float r1 = r2.getPositiveSum()
            float r3 = r2.getNegativeSum()
            float r3 = -r3
            goto L88
        L71:
            com.github.mikephil.charting.highlight.Range[] r1 = r2.getRanges()
            int r3 = r9.getStackIndex()
            r1 = r1[r3]
            float r3 = r1.from
            float r1 = r1.to
            r11 = r3
            r3 = r1
            r1 = r11
            goto L88
        L83:
            float r1 = r2.getY()
            r3 = 0
        L88:
            float r2 = r2.getX()
            float r4 = r6.getBarWidth()
            r10 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r10
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            r0.prepareBarHighlight(r1, r2, r3, r4, r5)
            android.graphics.RectF r1 = r12.mBarRect
            r12.setHighlightDrawPos(r9, r1)
            android.graphics.RectF r1 = r12.mBarRect
            android.graphics.Paint r2 = r12.mHighlightPaint
            r13.drawRect(r1, r2)
        La6:
            int r8 = r8 + 1
            goto L9
        Laa:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas r2, java.lang.String r3, float r4, float r5, int r6) {
            r1 = this;
            android.graphics.Paint r0 = r1.mValuePaint
            r0.setColor(r6)
            android.graphics.Paint r6 = r1.mValuePaint
            r2.drawText(r3, r4, r5, r6)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas r34) {
            r33 = this;
            r0 = r33
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            boolean r1 = r0.isDrawingValuesAllowed(r1)
            if (r1 == 0) goto L381
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.BarData r1 = r1.getBarData()
            java.util.List r6 = r1.getDataSets()
            r1 = 1083179008(0x40900000, float:4.5)
            float r7 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            boolean r8 = r1.isDrawValueAboveBarEnabled()
            r10 = 0
        L21:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.BarData r1 = r1.getBarData()
            int r1 = r1.getDataSetCount()
            if (r10 >= r1) goto L381
            java.lang.Object r1 = r6.get(r10)
            r11 = r1
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r11 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r11
            boolean r1 = r0.shouldDrawValues(r11)
            if (r1 != 0) goto L44
            r20 = r6
            r19 = r7
            r25 = r8
            r24 = r10
            goto L375
        L44:
            r0.applyValueTextStyle(r11)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r11.getAxisDependency()
            boolean r1 = r1.isInverted(r2)
            android.graphics.Paint r2 = r0.mValuePaint
            java.lang.String r3 = "8"
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r2, r3)
            float r2 = (float) r2
            if (r8 == 0) goto L5e
            float r3 = -r7
            goto L60
        L5e:
            float r3 = r2 + r7
        L60:
            if (r8 == 0) goto L65
            float r4 = r2 + r7
            goto L66
        L65:
            float r4 = -r7
        L66:
            if (r1 == 0) goto L6e
            float r1 = -r3
            float r3 = r1 - r2
            float r1 = -r4
            float r4 = r1 - r2
        L6e:
            r12 = r3
            r13 = r4
            com.github.mikephil.charting.buffer.BarBuffer[] r1 = r0.mBarBuffers
            r14 = r1[r10]
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r15 = r1.getPhaseY()
            com.github.mikephil.charting.formatter.ValueFormatter r1 = r11.getValueFormatter()
            com.github.mikephil.charting.utils.MPPointF r2 = r11.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r2 = com.github.mikephil.charting.utils.MPPointF.getInstance(r2)
            float r3 = r2.x
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.x = r3
            float r3 = r2.y
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.y = r3
            boolean r3 = r11.isStacked()
            r16 = 1073741824(0x40000000, float:2.0)
            r17 = 0
            if (r3 != 0) goto L172
            r15 = 0
        La1:
            float r3 = (float) r15
            float[] r4 = r14.buffer
            int r4 = r4.length
            float r4 = (float) r4
            com.github.mikephil.charting.animation.ChartAnimator r5 = r0.mAnimator
            float r5 = r5.getPhaseX()
            float r4 = r4 * r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto Lc5
            float[] r3 = r14.buffer
            r4 = r3[r15]
            int r5 = r15 + 2
            r3 = r3[r5]
            float r4 = r4 + r3
            float r3 = r4 / r16
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            boolean r4 = r4.isInBoundsRight(r3)
            if (r4 != 0) goto Lca
        Lc5:
            r20 = r6
            r6 = r2
            goto L16a
        Lca:
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            float[] r5 = r14.buffer
            int r18 = r15 + 1
            r5 = r5[r18]
            boolean r4 = r4.isInBoundsY(r5)
            if (r4 == 0) goto Le0
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            boolean r4 = r4.isInBoundsLeft(r3)
            if (r4 != 0) goto Le6
        Le0:
            r9 = r1
            r20 = r6
            r6 = r2
            goto L162
        Le6:
            int r4 = r15 / 4
            com.github.mikephil.charting.data.Entry r5 = r11.getEntryForIndex(r4)
            com.github.mikephil.charting.data.BarEntry r5 = (com.github.mikephil.charting.data.BarEntry) r5
            float r19 = r5.getY()
            boolean r20 = r11.isDrawValuesEnabled()
            if (r20 == 0) goto L122
            r20 = r2
            java.lang.String r2 = r1.getBarLabel(r5)
            int r21 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            float[] r9 = r14.buffer
            if (r21 < 0) goto L108
            r9 = r9[r18]
            float r9 = r9 + r12
            goto L10d
        L108:
            int r22 = r15 + 3
            r9 = r9[r22]
            float r9 = r9 + r13
        L10d:
            int r4 = r11.getValueTextColor(r4)
            r22 = r20
            r20 = r6
            r6 = r22
            r22 = r5
            r5 = r4
            r4 = r9
            r9 = r1
            r1 = r34
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L128
        L122:
            r9 = r1
            r22 = r5
            r20 = r6
            r6 = r2
        L128:
            android.graphics.drawable.Drawable r1 = r22.getIcon()
            if (r1 == 0) goto L162
            boolean r1 = r11.isDrawIconsEnabled()
            if (r1 == 0) goto L162
            android.graphics.drawable.Drawable r24 = r22.getIcon()
            int r1 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r1 < 0) goto L142
            float[] r1 = r14.buffer
            r1 = r1[r18]
            float r1 = r1 + r12
            goto L149
        L142:
            float[] r1 = r14.buffer
            int r2 = r15 + 3
            r1 = r1[r2]
            float r1 = r1 + r13
        L149:
            float r2 = r6.x
            float r3 = r3 + r2
            float r2 = r6.y
            float r1 = r1 + r2
            int r2 = (int) r3
            int r1 = (int) r1
            int r27 = r24.getIntrinsicWidth()
            int r28 = r24.getIntrinsicHeight()
            r23 = r34
            r26 = r1
            r25 = r2
            com.github.mikephil.charting.utils.Utils.drawImage(r23, r24, r25, r26, r27, r28)
        L162:
            int r15 = r15 + 4
            r2 = r6
            r1 = r9
            r6 = r20
            goto La1
        L16a:
            r19 = r7
            r25 = r8
            r24 = r10
            goto L372
        L172:
            r9 = r1
            r20 = r6
            r6 = r2
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r11.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r1 = r1.getTransformer(r2)
            r2 = 0
            r18 = 0
        L183:
            float r3 = (float) r2
            int r4 = r11.getEntryCount()
            float r4 = (float) r4
            com.github.mikephil.charting.animation.ChartAnimator r5 = r0.mAnimator
            float r5 = r5.getPhaseX()
            float r4 = r4 * r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L16a
            com.github.mikephil.charting.data.Entry r3 = r11.getEntryForIndex(r2)
            com.github.mikephil.charting.data.BarEntry r3 = (com.github.mikephil.charting.data.BarEntry) r3
            float[] r4 = r3.getYVals()
            float[] r5 = r14.buffer
            r19 = r5[r18]
            int r22 = r18 + 2
            r5 = r5[r22]
            float r19 = r19 + r5
            float r5 = r19 / r16
            int r19 = r11.getValueTextColor(r2)
            if (r4 != 0) goto L269
            r22 = r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsRight(r5)
            if (r1 != 0) goto L1bc
            goto L16a
        L1bc:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            r23 = r2
            float[] r2 = r14.buffer
            int r24 = r18 + 1
            r2 = r2[r24]
            boolean r1 = r1.isInBoundsY(r2)
            if (r1 == 0) goto L1d4
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsLeft(r5)
            if (r1 != 0) goto L1df
        L1d4:
            r19 = r7
            r25 = r8
            r24 = r10
            r7 = r22
            r10 = r0
            goto L25d
        L1df:
            boolean r1 = r11.isDrawValuesEnabled()
            if (r1 == 0) goto L211
            java.lang.String r2 = r9.getBarLabel(r3)
            float[] r1 = r14.buffer
            r1 = r1[r24]
            float r25 = r3.getY()
            int r25 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r25 < 0) goto L1f8
            r25 = r12
            goto L1fa
        L1f8:
            r25 = r13
        L1fa:
            float r1 = r1 + r25
            r25 = r22
            r22 = r3
            r3 = r5
            r5 = r19
            r19 = r7
            r7 = r25
            r25 = r8
            r8 = r4
            r4 = r1
            r1 = r34
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L21b
        L211:
            r19 = r7
            r25 = r8
            r7 = r22
            r22 = r3
            r8 = r4
            r3 = r5
        L21b:
            android.graphics.drawable.Drawable r0 = r22.getIcon()
            if (r0 == 0) goto L257
            boolean r0 = r11.isDrawIconsEnabled()
            if (r0 == 0) goto L257
            android.graphics.drawable.Drawable r1 = r22.getIcon()
            float[] r0 = r14.buffer
            r0 = r0[r24]
            float r2 = r22.getY()
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 < 0) goto L239
            r2 = r12
            goto L23a
        L239:
            r2 = r13
        L23a:
            float r0 = r0 + r2
            float r2 = r6.x
            float r5 = r3 + r2
            float r2 = r6.y
            float r0 = r0 + r2
            int r2 = (int) r5
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r34
            r24 = r10
            r10 = r33
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
            goto L35f
        L257:
            r24 = r10
            r10 = r33
            goto L35f
        L25d:
            r1 = r7
            r0 = r10
            r7 = r19
            r2 = r23
        L263:
            r10 = r24
            r8 = r25
            goto L183
        L269:
            r23 = r2
            r22 = r3
            r3 = r5
            r25 = r8
            r24 = r10
            r5 = r19
            r10 = r0
            r8 = r4
            r19 = r7
            r7 = r1
            int r0 = r8.length
            int r0 = r0 * 2
            float[] r1 = new float[r0]
            float r2 = r22.getNegativeSum()
            float r2 = -r2
            r26 = r2
            r2 = 0
            r4 = 0
            r27 = 0
        L289:
            if (r2 >= r0) goto L2b8
            r28 = r8[r4]
            int r29 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r29 != 0) goto L2a0
            int r30 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r30 == 0) goto L299
            int r30 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r30 != 0) goto L2a0
        L299:
            r32 = r28
            r28 = r26
            r26 = r32
            goto L2ab
        L2a0:
            if (r29 < 0) goto L2a9
            float r27 = r27 + r28
            r28 = r26
            r26 = r27
            goto L2ab
        L2a9:
            float r28 = r26 - r28
        L2ab:
            int r29 = r2 + 1
            float r26 = r26 * r15
            r1[r29] = r26
            int r2 = r2 + 2
            int r4 = r4 + 1
            r26 = r28
            goto L289
        L2b8:
            r7.pointValuesToPixel(r1)
            r2 = 0
        L2bc:
            if (r2 >= r0) goto L35f
            int r4 = r2 / 2
            r4 = r8[r4]
            int r28 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r28 != 0) goto L2ce
            int r28 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r28 != 0) goto L2ce
            int r28 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r28 > 0) goto L2d2
        L2ce:
            int r28 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r28 >= 0) goto L2d5
        L2d2:
            r28 = 1
            goto L2d7
        L2d5:
            r28 = 0
        L2d7:
            int r29 = r2 + 1
            r29 = r1[r29]
            if (r28 == 0) goto L2e2
            r28 = r13
        L2df:
            r30 = r0
            goto L2e5
        L2e2:
            r28 = r12
            goto L2df
        L2e5:
            float r0 = r29 + r28
            r28 = r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            boolean r1 = r1.isInBoundsRight(r3)
            if (r1 != 0) goto L2f3
            goto L35f
        L2f3:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            boolean r1 = r1.isInBoundsY(r0)
            if (r1 == 0) goto L303
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            boolean r1 = r1.isInBoundsLeft(r3)
            if (r1 != 0) goto L309
        L303:
            r10 = r2
            r29 = r3
            r31 = r5
            goto L351
        L309:
            boolean r1 = r11.isDrawValuesEnabled()
            if (r1 == 0) goto L328
            r1 = r22
            java.lang.String r4 = r9.getBarStackedLabel(r4, r1)
            r22 = r4
            r4 = r0
            r0 = r10
            r10 = r2
            r2 = r22
            r22 = r1
            r1 = r34
            r0.drawValue(r1, r2, r3, r4, r5)
        L323:
            r29 = r3
            r31 = r5
            goto L32b
        L328:
            r4 = r0
            r10 = r2
            goto L323
        L32b:
            android.graphics.drawable.Drawable r0 = r22.getIcon()
            if (r0 == 0) goto L351
            boolean r0 = r11.isDrawIconsEnabled()
            if (r0 == 0) goto L351
            android.graphics.drawable.Drawable r1 = r22.getIcon()
            float r0 = r6.x
            float r5 = r29 + r0
            int r2 = (int) r5
            float r0 = r6.y
            float r0 = r0 + r4
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r34
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
        L351:
            int r2 = r10 + 2
            r10 = r33
            r1 = r28
            r3 = r29
            r0 = r30
            r5 = r31
            goto L2bc
        L35f:
            if (r8 != 0) goto L364
            int r18 = r18 + 4
            goto L369
        L364:
            int r0 = r8.length
            int r0 = r0 * 4
            int r18 = r18 + r0
        L369:
            int r2 = r23 + 1
            r0 = r33
            r1 = r7
            r7 = r19
            goto L263
        L372:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r6)
        L375:
            int r10 = r24 + 1
            r0 = r33
            r7 = r19
            r6 = r20
            r8 = r25
            goto L21
        L381:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r7 = this;
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r7.mChart
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            int r1 = r0.getDataSetCount()
            com.github.mikephil.charting.buffer.BarBuffer[] r1 = new com.github.mikephil.charting.buffer.BarBuffer[r1]
            r7.mBarBuffers = r1
            r1 = 0
        Lf:
            com.github.mikephil.charting.buffer.BarBuffer[] r2 = r7.mBarBuffers
            int r2 = r2.length
            if (r1 >= r2) goto L42
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = r0.getDataSetByIndex(r1)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r2
            com.github.mikephil.charting.buffer.BarBuffer[] r3 = r7.mBarBuffers
            com.github.mikephil.charting.buffer.BarBuffer r4 = new com.github.mikephil.charting.buffer.BarBuffer
            int r5 = r2.getEntryCount()
            int r5 = r5 * 4
            boolean r6 = r2.isStacked()
            if (r6 == 0) goto L2f
            int r6 = r2.getStackSize()
            goto L30
        L2f:
            r6 = 1
        L30:
            int r5 = r5 * r6
            int r6 = r0.getDataSetCount()
            boolean r2 = r2.isStacked()
            r4.<init>(r5, r6, r2)
            r3[r1] = r4
            int r1 = r1 + 1
            goto Lf
        L42:
            return
    }

    protected void prepareBarHighlight(float r2, float r3, float r4, float r5, com.github.mikephil.charting.utils.Transformer r6) {
            r1 = this;
            float r0 = r2 - r5
            float r2 = r2 + r5
            android.graphics.RectF r5 = r1.mBarRect
            r5.set(r0, r3, r2, r4)
            android.graphics.RectF r2 = r1.mBarRect
            com.github.mikephil.charting.animation.ChartAnimator r3 = r1.mAnimator
            float r3 = r3.getPhaseY()
            r6.rectToPixelPhase(r2, r3)
            return
    }

    protected void setHighlightDrawPos(com.github.mikephil.charting.highlight.Highlight r2, android.graphics.RectF r3) {
            r1 = this;
            float r0 = r3.centerX()
            float r3 = r3.top
            r2.setDraw(r0, r3)
            return
    }
}

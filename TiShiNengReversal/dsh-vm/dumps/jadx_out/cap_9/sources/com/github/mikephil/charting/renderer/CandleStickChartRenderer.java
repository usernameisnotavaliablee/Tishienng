package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CandleStickChartRenderer extends com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer {
    private float[] mBodyBuffers;
    protected com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider mChart;
    private float[] mCloseBuffers;
    private float[] mOpenBuffers;
    private float[] mRangeBuffers;
    private float[] mShadowBuffers;

    public CandleStickChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r1, com.github.mikephil.charting.animation.ChartAnimator r2, com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r2 = 8
            float[] r2 = new float[r2]
            r0.mShadowBuffers = r2
            r2 = 4
            float[] r3 = new float[r2]
            r0.mBodyBuffers = r3
            float[] r3 = new float[r2]
            r0.mRangeBuffers = r3
            float[] r3 = new float[r2]
            r0.mOpenBuffers = r3
            float[] r2 = new float[r2]
            r0.mCloseBuffers = r2
            r0.mChart = r1
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas r4) {
            r3 = this;
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r0 = r3.mChart
            com.github.mikephil.charting.data.CandleData r0 = r0.getCandleData()
            java.util.List r0 = r0.getDataSets()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.ICandleDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) r1
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto Le
            r3.drawDataSet(r4, r1)
            goto Le
        L24:
            return
    }

    protected void drawDataSet(android.graphics.Canvas r29, com.github.mikephil.charting.interfaces.datasets.ICandleDataSet r30) {
            r28 = this;
            r0 = r28
            r1 = r30
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r2 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = r1.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r2 = r2.getTransformer(r3)
            com.github.mikephil.charting.animation.ChartAnimator r3 = r0.mAnimator
            float r3 = r3.getPhaseY()
            float r4 = r1.getBarSpace()
            boolean r5 = r1.getShowCandleBar()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r6 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r7 = r0.mChart
            r6.set(r7, r1)
            android.graphics.Paint r6 = r0.mRenderPaint
            float r7 = r1.getShadowWidth()
            r6.setStrokeWidth(r7)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r6 = r0.mXBounds
            int r6 = r6.min
        L30:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r7 = r0.mXBounds
            int r8 = r7.range
            int r7 = r7.min
            int r8 = r8 + r7
            if (r6 > r8) goto L289
            com.github.mikephil.charting.data.Entry r7 = r1.getEntryForIndex(r6)
            com.github.mikephil.charting.data.CandleEntry r7 = (com.github.mikephil.charting.data.CandleEntry) r7
            if (r7 != 0) goto L43
            goto L285
        L43:
            float r8 = r7.getX()
            float r9 = r7.getOpen()
            float r10 = r7.getClose()
            float r11 = r7.getHigh()
            float r7 = r7.getLow()
            r13 = 1122867(0x112233, float:1.573472E-39)
            r14 = 2
            r15 = 0
            r16 = 3
            r17 = 1
            if (r5 == 0) goto L1d9
            r18 = 1056964608(0x3f000000, float:0.5)
            float[] r12 = r0.mShadowBuffers
            r12[r15] = r8
            r12[r14] = r8
            r19 = 4
            r12[r19] = r8
            r19 = 6
            r12[r19] = r8
            r19 = 7
            r20 = 5
            int r21 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r21 <= 0) goto L8b
            float r11 = r11 * r3
            r12[r17] = r11
            float r11 = r9 * r3
            r12[r16] = r11
            float r7 = r7 * r3
            r12[r20] = r7
            float r7 = r10 * r3
            r12[r19] = r7
            goto Lae
        L8b:
            int r22 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r22 >= 0) goto La0
            float r11 = r11 * r3
            r12[r17] = r11
            float r11 = r10 * r3
            r12[r16] = r11
            float r7 = r7 * r3
            r12[r20] = r7
            float r7 = r9 * r3
            r12[r19] = r7
            goto Lae
        La0:
            float r11 = r11 * r3
            r12[r17] = r11
            float r11 = r9 * r3
            r12[r16] = r11
            float r7 = r7 * r3
            r12[r20] = r7
            r12[r19] = r11
        Lae:
            r2.pointValuesToPixel(r12)
            boolean r7 = r1.getShadowColorSameAsCandle()
            if (r7 == 0) goto Lfc
            if (r21 <= 0) goto Lce
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r1.getDecreasingColor()
            if (r11 != r13) goto Lc6
            int r11 = r1.getColor(r6)
            goto Lca
        Lc6:
            int r11 = r1.getDecreasingColor()
        Lca:
            r7.setColor(r11)
            goto L110
        Lce:
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 >= 0) goto Le7
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r1.getIncreasingColor()
            if (r11 != r13) goto Ldf
            int r11 = r1.getColor(r6)
            goto Le3
        Ldf:
            int r11 = r1.getIncreasingColor()
        Le3:
            r7.setColor(r11)
            goto L110
        Le7:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r1.getNeutralColor()
            if (r11 != r13) goto Lf4
            int r11 = r1.getColor(r6)
            goto Lf8
        Lf4:
            int r11 = r1.getNeutralColor()
        Lf8:
            r7.setColor(r11)
            goto L110
        Lfc:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r1.getShadowColor()
            if (r11 != r13) goto L109
            int r11 = r1.getColor(r6)
            goto L10d
        L109:
            int r11 = r1.getShadowColor()
        L10d:
            r7.setColor(r11)
        L110:
            android.graphics.Paint r7 = r0.mRenderPaint
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r11)
            float[] r7 = r0.mShadowBuffers
            android.graphics.Paint r11 = r0.mRenderPaint
            r12 = r29
            r12.drawLines(r7, r11)
            float[] r7 = r0.mBodyBuffers
            float r11 = r8 - r18
            float r11 = r11 + r4
            r7[r15] = r11
            float r11 = r10 * r3
            r7[r17] = r11
            float r8 = r8 + r18
            float r8 = r8 - r4
            r7[r14] = r8
            float r8 = r9 * r3
            r7[r16] = r8
            r2.pointValuesToPixel(r7)
            if (r21 <= 0) goto L170
            int r7 = r1.getDecreasingColor()
            if (r7 != r13) goto L149
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getColor(r6)
            r7.setColor(r8)
            goto L152
        L149:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getDecreasingColor()
            r7.setColor(r8)
        L152:
            android.graphics.Paint r7 = r0.mRenderPaint
            android.graphics.Paint$Style r8 = r1.getDecreasingPaintStyle()
            r7.setStyle(r8)
            float[] r7 = r0.mBodyBuffers
            r23 = r7[r15]
            r24 = r7[r16]
            r25 = r7[r14]
            r26 = r7[r17]
            android.graphics.Paint r7 = r0.mRenderPaint
            r27 = r7
            r22 = r12
            r22.drawRect(r23, r24, r25, r26, r27)
            goto L285
        L170:
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 >= 0) goto L1ab
            int r7 = r1.getIncreasingColor()
            if (r7 != r13) goto L184
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getColor(r6)
            r7.setColor(r8)
            goto L18d
        L184:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getIncreasingColor()
            r7.setColor(r8)
        L18d:
            android.graphics.Paint r7 = r0.mRenderPaint
            android.graphics.Paint$Style r8 = r1.getIncreasingPaintStyle()
            r7.setStyle(r8)
            float[] r7 = r0.mBodyBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r22 = r29
            r27 = r7
            r22.drawRect(r23, r24, r25, r26, r27)
            goto L285
        L1ab:
            int r7 = r1.getNeutralColor()
            if (r7 != r13) goto L1bb
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getColor(r6)
            r7.setColor(r8)
            goto L1c4
        L1bb:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getNeutralColor()
            r7.setColor(r8)
        L1c4:
            float[] r7 = r0.mBodyBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r22 = r29
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
            goto L285
        L1d9:
            r18 = 1056964608(0x3f000000, float:0.5)
            float[] r12 = r0.mRangeBuffers
            r12[r15] = r8
            float r11 = r11 * r3
            r12[r17] = r11
            r12[r14] = r8
            float r7 = r7 * r3
            r12[r16] = r7
            float[] r7 = r0.mOpenBuffers
            float r11 = r8 - r18
            float r11 = r11 + r4
            r7[r15] = r11
            float r11 = r9 * r3
            r7[r17] = r11
            r7[r14] = r8
            r7[r16] = r11
            float[] r7 = r0.mCloseBuffers
            float r11 = r8 + r18
            float r11 = r11 - r4
            r7[r15] = r11
            float r11 = r10 * r3
            r7[r17] = r11
            r7[r14] = r8
            r7[r16] = r11
            r2.pointValuesToPixel(r12)
            float[] r7 = r0.mOpenBuffers
            r2.pointValuesToPixel(r7)
            float[] r7 = r0.mCloseBuffers
            r2.pointValuesToPixel(r7)
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 <= 0) goto L228
            int r7 = r1.getDecreasingColor()
            if (r7 != r13) goto L223
            int r7 = r1.getColor(r6)
            goto L24b
        L223:
            int r7 = r1.getDecreasingColor()
            goto L24b
        L228:
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 >= 0) goto L23c
            int r7 = r1.getIncreasingColor()
            if (r7 != r13) goto L237
            int r7 = r1.getColor(r6)
            goto L24b
        L237:
            int r7 = r1.getIncreasingColor()
            goto L24b
        L23c:
            int r7 = r1.getNeutralColor()
            if (r7 != r13) goto L247
            int r7 = r1.getColor(r6)
            goto L24b
        L247:
            int r7 = r1.getNeutralColor()
        L24b:
            android.graphics.Paint r8 = r0.mRenderPaint
            r8.setColor(r7)
            float[] r7 = r0.mRangeBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r22 = r29
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
            float[] r7 = r0.mOpenBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
            float[] r7 = r0.mCloseBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
        L285:
            int r6 = r6 + 1
            goto L30
        L289:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas r10, com.github.mikephil.charting.highlight.Highlight[] r11) {
            r9 = this;
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r0 = r9.mChart
            com.github.mikephil.charting.data.CandleData r0 = r0.getCandleData()
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L77
            r3 = r11[r2]
            int r4 = r3.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r4 = r0.getDataSetByIndex(r4)
            com.github.mikephil.charting.interfaces.datasets.ICandleDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) r4
            if (r4 == 0) goto L74
            boolean r5 = r4.isHighlightEnabled()
            if (r5 != 0) goto L1f
            goto L74
        L1f:
            float r5 = r3.getX()
            float r6 = r3.getY()
            com.github.mikephil.charting.data.Entry r5 = r4.getEntryForXValue(r5, r6)
            com.github.mikephil.charting.data.CandleEntry r5 = (com.github.mikephil.charting.data.CandleEntry) r5
            boolean r6 = r9.isInBoundsX(r5, r4)
            if (r6 != 0) goto L34
            goto L74
        L34:
            float r6 = r5.getLow()
            com.github.mikephil.charting.animation.ChartAnimator r7 = r9.mAnimator
            float r7 = r7.getPhaseY()
            float r6 = r6 * r7
            float r7 = r5.getHigh()
            com.github.mikephil.charting.animation.ChartAnimator r8 = r9.mAnimator
            float r8 = r8.getPhaseY()
            float r7 = r7 * r8
            float r6 = r6 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r7 = r9.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r8 = r4.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r7 = r7.getTransformer(r8)
            float r5 = r5.getX()
            com.github.mikephil.charting.utils.MPPointD r5 = r7.getPixelForValues(r5, r6)
            double r6 = r5.x
            float r6 = (float) r6
            double r7 = r5.y
            float r7 = (float) r7
            r3.setDraw(r6, r7)
            double r6 = r5.x
            float r3 = (float) r6
            double r5 = r5.y
            float r5 = (float) r5
            r9.drawHighlightLines(r10, r3, r5, r4)
        L74:
            int r2 = r2 + 1
            goto L8
        L77:
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
    public void drawValues(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r1 = r0.mChart
            boolean r1 = r0.isDrawingValuesAllowed(r1)
            if (r1 == 0) goto Lff
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.CandleData r1 = r1.getCandleData()
            java.util.List r6 = r1.getDataSets()
            r7 = 0
            r8 = 0
        L16:
            int r1 = r6.size()
            if (r8 >= r1) goto Lff
            java.lang.Object r1 = r6.get(r8)
            r10 = r1
            com.github.mikephil.charting.interfaces.datasets.ICandleDataSet r10 = (com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) r10
            boolean r1 = r0.shouldDrawValues(r10)
            if (r1 == 0) goto Lf9
            int r1 = r10.getEntryCount()
            r2 = 1
            if (r1 >= r2) goto L32
            goto Lf9
        L32:
            r0.applyValueTextStyle(r10)
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r1 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r10.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r9 = r1.getTransformer(r2)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r1 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r2 = r0.mChart
            r1.set(r2, r10)
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r11 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r12 = r1.getPhaseY()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r1 = r0.mXBounds
            int r13 = r1.min
            int r14 = r1.max
            float[] r9 = r9.generateTransformedValuesCandle(r10, r11, r12, r13, r14)
            r1 = 1084227584(0x40a00000, float:5.0)
            float r11 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            com.github.mikephil.charting.formatter.ValueFormatter r12 = r10.getValueFormatter()
            com.github.mikephil.charting.utils.MPPointF r1 = r10.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r13 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1)
            float r1 = r13.x
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r13.x = r1
            float r1 = r13.y
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r13.y = r1
            r14 = 0
        L7f:
            int r1 = r9.length
            if (r14 >= r1) goto Lf6
            r3 = r9[r14]
            int r1 = r14 + 1
            r15 = r9[r1]
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsRight(r3)
            if (r1 != 0) goto L91
            goto Lf6
        L91:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsLeft(r3)
            if (r1 == 0) goto Lf1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsY(r15)
            if (r1 != 0) goto La2
            goto Lf1
        La2:
            int r1 = r14 / 2
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.min
            int r2 = r2 + r1
            com.github.mikephil.charting.data.Entry r2 = r10.getEntryForIndex(r2)
            com.github.mikephil.charting.data.CandleEntry r2 = (com.github.mikephil.charting.data.CandleEntry) r2
            boolean r4 = r10.isDrawValuesEnabled()
            if (r4 == 0) goto Lca
            r4 = r2
            java.lang.String r2 = r12.getCandleLabel(r4)
            r5 = r4
            float r4 = r15 - r11
            int r1 = r10.getValueTextColor(r1)
            r16 = r5
            r5 = r1
            r1 = r18
            r0.drawValue(r1, r2, r3, r4, r5)
            goto Lcc
        Lca:
            r16 = r2
        Lcc:
            android.graphics.drawable.Drawable r0 = r16.getIcon()
            if (r0 == 0) goto Lf1
            boolean r0 = r10.isDrawIconsEnabled()
            if (r0 == 0) goto Lf1
            android.graphics.drawable.Drawable r1 = r16.getIcon()
            float r0 = r13.x
            float r3 = r3 + r0
            int r2 = (int) r3
            float r0 = r13.y
            float r15 = r15 + r0
            int r3 = (int) r15
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r18
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
        Lf1:
            int r14 = r14 + 2
            r0 = r17
            goto L7f
        Lf6:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r13)
        Lf9:
            int r8 = r8 + 1
            r0 = r17
            goto L16
        Lff:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r0 = this;
            return
    }
}

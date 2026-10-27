package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RadarChartRenderer extends com.github.mikephil.charting.renderer.LineRadarRenderer {
    protected com.github.mikephil.charting.charts.RadarChart mChart;
    protected android.graphics.Path mDrawDataSetSurfacePathBuffer;
    protected android.graphics.Path mDrawHighlightCirclePathBuffer;
    protected android.graphics.Paint mHighlightCirclePaint;
    protected android.graphics.Paint mWebPaint;

    public RadarChartRenderer(com.github.mikephil.charting.charts.RadarChart r4, com.github.mikephil.charting.animation.ChartAnimator r5, com.github.mikephil.charting.utils.ViewPortHandler r6) {
            r3 = this;
            r3.<init>(r5, r6)
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r3.mDrawDataSetSurfacePathBuffer = r5
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r3.mDrawHighlightCirclePathBuffer = r5
            r3.mChart = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r5 = 1
            r4.<init>(r5)
            r3.mHighlightPaint = r4
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r6)
            android.graphics.Paint r4 = r3.mHighlightPaint
            r0 = 1073741824(0x40000000, float:2.0)
            r4.setStrokeWidth(r0)
            android.graphics.Paint r4 = r3.mHighlightPaint
            r0 = 187(0xbb, float:2.62E-43)
            r1 = 115(0x73, float:1.61E-43)
            r2 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            r4.setColor(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r3.mWebPaint = r4
            r4.setStyle(r6)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r3.mHighlightCirclePaint = r4
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas r5) {
            r4 = this;
            com.github.mikephil.charting.charts.RadarChart r0 = r4.mChart
            com.github.mikephil.charting.data.ChartData r0 = r0.getData()
            com.github.mikephil.charting.data.RadarData r0 = (com.github.mikephil.charting.data.RadarData) r0
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r0.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r1
            int r1 = r1.getEntryCount()
            java.util.List r0 = r0.getDataSets()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r2
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto L1a
            r4.drawDataSet(r5, r2, r1)
            goto L1a
        L30:
            return
    }

    protected void drawDataSet(android.graphics.Canvas r13, com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r14, int r15) {
            r12 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r12.mAnimator
            float r0 = r0.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r12.mAnimator
            float r1 = r1.getPhaseY()
            com.github.mikephil.charting.charts.RadarChart r2 = r12.mChart
            float r2 = r2.getSliceAngle()
            com.github.mikephil.charting.charts.RadarChart r3 = r12.mChart
            float r3 = r3.getFactor()
            com.github.mikephil.charting.charts.RadarChart r4 = r12.mChart
            com.github.mikephil.charting.utils.MPPointF r4 = r4.getCenterOffsets()
            r5 = 0
            com.github.mikephil.charting.utils.MPPointF r5 = com.github.mikephil.charting.utils.MPPointF.getInstance(r5, r5)
            android.graphics.Path r6 = r12.mDrawDataSetSurfacePathBuffer
            r6.reset()
            r7 = 0
            r8 = 0
        L2a:
            int r9 = r14.getEntryCount()
            if (r7 >= r9) goto L7b
            android.graphics.Paint r9 = r12.mRenderPaint
            int r10 = r14.getColor(r7)
            r9.setColor(r10)
            com.github.mikephil.charting.data.Entry r9 = r14.getEntryForIndex(r7)
            com.github.mikephil.charting.data.RadarEntry r9 = (com.github.mikephil.charting.data.RadarEntry) r9
            float r9 = r9.getY()
            com.github.mikephil.charting.charts.RadarChart r10 = r12.mChart
            float r10 = r10.getYChartMin()
            float r9 = r9 - r10
            float r9 = r9 * r3
            float r9 = r9 * r1
            float r10 = (float) r7
            float r10 = r10 * r2
            float r10 = r10 * r0
            com.github.mikephil.charting.charts.RadarChart r11 = r12.mChart
            float r11 = r11.getRotationAngle()
            float r10 = r10 + r11
            com.github.mikephil.charting.utils.Utils.getPosition(r4, r9, r10, r5)
            float r9 = r5.x
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto L66
            goto L78
        L66:
            if (r8 != 0) goto L71
            float r8 = r5.x
            float r9 = r5.y
            r6.moveTo(r8, r9)
            r8 = 1
            goto L78
        L71:
            float r9 = r5.x
            float r10 = r5.y
            r6.lineTo(r9, r10)
        L78:
            int r7 = r7 + 1
            goto L2a
        L7b:
            int r0 = r14.getEntryCount()
            if (r0 <= r15) goto L88
            float r15 = r4.x
            float r0 = r4.y
            r6.lineTo(r15, r0)
        L88:
            r6.close()
            boolean r15 = r14.isDrawFilledEnabled()
            if (r15 == 0) goto La6
            android.graphics.drawable.Drawable r15 = r14.getFillDrawable()
            if (r15 == 0) goto L9b
            r12.drawFilledPath(r13, r6, r15)
            goto La6
        L9b:
            int r15 = r14.getFillColor()
            int r0 = r14.getFillAlpha()
            r12.drawFilledPath(r13, r6, r15, r0)
        La6:
            android.graphics.Paint r15 = r12.mRenderPaint
            float r0 = r14.getLineWidth()
            r15.setStrokeWidth(r0)
            android.graphics.Paint r15 = r12.mRenderPaint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r15.setStyle(r0)
            boolean r15 = r14.isDrawFilledEnabled()
            if (r15 == 0) goto Lc4
            int r14 = r14.getFillAlpha()
            r15 = 255(0xff, float:3.57E-43)
            if (r14 >= r15) goto Lc9
        Lc4:
            android.graphics.Paint r14 = r12.mRenderPaint
            r13.drawPath(r6, r14)
        Lc9:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r4)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r5)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas r1) {
            r0 = this;
            r0.drawWeb(r1)
            return
    }

    public void drawHighlightCircle(android.graphics.Canvas r6, com.github.mikephil.charting.utils.MPPointF r7, float r8, float r9, int r10, int r11, float r12) {
            r5 = this;
            r6.save()
            float r9 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r9)
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r8)
            r0 = 1122867(0x112233, float:1.573472E-39)
            if (r10 == r0) goto L3d
            android.graphics.Path r1 = r5.mDrawHighlightCirclePathBuffer
            r1.reset()
            float r2 = r7.x
            float r3 = r7.y
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r1.addCircle(r2, r3, r9, r4)
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2c
            float r2 = r7.x
            float r3 = r7.y
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CCW
            r1.addCircle(r2, r3, r8, r4)
        L2c:
            android.graphics.Paint r8 = r5.mHighlightCirclePaint
            r8.setColor(r10)
            android.graphics.Paint r8 = r5.mHighlightCirclePaint
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r8.setStyle(r10)
            android.graphics.Paint r8 = r5.mHighlightCirclePaint
            r6.drawPath(r1, r8)
        L3d:
            if (r11 == r0) goto L5d
            android.graphics.Paint r8 = r5.mHighlightCirclePaint
            r8.setColor(r11)
            android.graphics.Paint r8 = r5.mHighlightCirclePaint
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r10)
            android.graphics.Paint r8 = r5.mHighlightCirclePaint
            float r10 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r12)
            r8.setStrokeWidth(r10)
            float r8 = r7.x
            float r7 = r7.y
            android.graphics.Paint r10 = r5.mHighlightCirclePaint
            r6.drawCircle(r8, r7, r9, r10)
        L5d:
            r6.restore()
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas r17, com.github.mikephil.charting.highlight.Highlight[] r18) {
            r16 = this;
            r0 = r16
            r8 = r18
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            float r9 = r1.getSliceAngle()
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            float r10 = r1.getFactor()
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r11 = r1.getCenterOffsets()
            r1 = 0
            com.github.mikephil.charting.utils.MPPointF r2 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1, r1)
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            r12 = r1
            com.github.mikephil.charting.data.RadarData r12 = (com.github.mikephil.charting.data.RadarData) r12
            int r13 = r8.length
            r14 = 0
            r15 = 0
        L27:
            if (r15 >= r13) goto Ldf
            r1 = r8[r15]
            int r3 = r1.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r3 = r12.getDataSetByIndex(r3)
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r3
            if (r3 == 0) goto Ld9
            boolean r4 = r3.isHighlightEnabled()
            if (r4 != 0) goto L3f
            goto Ld9
        L3f:
            float r4 = r1.getX()
            int r4 = (int) r4
            com.github.mikephil.charting.data.Entry r4 = r3.getEntryForIndex(r4)
            com.github.mikephil.charting.data.RadarEntry r4 = (com.github.mikephil.charting.data.RadarEntry) r4
            boolean r5 = r0.isInBoundsX(r4, r3)
            if (r5 != 0) goto L52
            goto Ld9
        L52:
            float r4 = r4.getY()
            com.github.mikephil.charting.charts.RadarChart r5 = r0.mChart
            float r5 = r5.getYChartMin()
            float r4 = r4 - r5
            float r4 = r4 * r10
            com.github.mikephil.charting.animation.ChartAnimator r5 = r0.mAnimator
            float r5 = r5.getPhaseY()
            float r4 = r4 * r5
            float r5 = r1.getX()
            float r5 = r5 * r9
            com.github.mikephil.charting.animation.ChartAnimator r6 = r0.mAnimator
            float r6 = r6.getPhaseX()
            float r5 = r5 * r6
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            float r6 = r6.getRotationAngle()
            float r5 = r5 + r6
            com.github.mikephil.charting.utils.Utils.getPosition(r11, r4, r5, r2)
            float r4 = r2.x
            float r5 = r2.y
            r1.setDraw(r4, r5)
            float r1 = r2.x
            float r4 = r2.y
            r5 = r17
            r0.drawHighlightLines(r5, r1, r4, r3)
            boolean r1 = r3.isDrawHighlightCircleEnabled()
            if (r1 == 0) goto Ld9
            float r1 = r2.x
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto Ld9
            float r1 = r2.y
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto Ld9
            int r1 = r3.getHighlightCircleStrokeColor()
            r4 = 1122867(0x112233, float:1.573472E-39)
            if (r1 != r4) goto Lb2
            int r1 = r3.getColor(r14)
        Lb2:
            int r4 = r3.getHighlightCircleStrokeAlpha()
            r6 = 255(0xff, float:3.57E-43)
            if (r4 >= r6) goto Lc2
            int r4 = r3.getHighlightCircleStrokeAlpha()
            int r1 = com.github.mikephil.charting.utils.ColorTemplate.colorWithAlpha(r1, r4)
        Lc2:
            r6 = r1
            r1 = r3
            float r3 = r1.getHighlightCircleInnerRadius()
            float r4 = r1.getHighlightCircleOuterRadius()
            int r5 = r1.getHighlightCircleFillColor()
            float r7 = r1.getHighlightCircleStrokeWidth()
            r1 = r17
            r0.drawHighlightCircle(r1, r2, r3, r4, r5, r6, r7)
        Ld9:
            int r15 = r15 + 1
            r0 = r16
            goto L27
        Ldf:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r11)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r2)
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
    public void drawValues(android.graphics.Canvas r28) {
            r27 = this;
            r0 = r27
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r6 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r7 = r1.getPhaseY()
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            float r8 = r1.getSliceAngle()
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            float r9 = r1.getFactor()
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r10 = r1.getCenterOffsets()
            r1 = 0
            com.github.mikephil.charting.utils.MPPointF r11 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1, r1)
            com.github.mikephil.charting.utils.MPPointF r12 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1, r1)
            r1 = 1084227584(0x40a00000, float:5.0)
            float r13 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r15 = 0
        L30:
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            com.github.mikephil.charting.data.RadarData r1 = (com.github.mikephil.charting.data.RadarData) r1
            int r1 = r1.getDataSetCount()
            if (r15 >= r1) goto L132
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            com.github.mikephil.charting.data.RadarData r1 = (com.github.mikephil.charting.data.RadarData) r1
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r1.getDataSetByIndex(r15)
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r1
            boolean r2 = r0.shouldDrawValues(r1)
            if (r2 != 0) goto L56
            r18 = r6
            goto L12c
        L56:
            r0.applyValueTextStyle(r1)
            com.github.mikephil.charting.formatter.ValueFormatter r2 = r1.getValueFormatter()
            com.github.mikephil.charting.utils.MPPointF r3 = r1.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r3 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3)
            float r4 = r3.x
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            r3.x = r4
            float r4 = r3.y
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            r3.y = r4
            r4 = 0
        L76:
            int r5 = r1.getEntryCount()
            if (r4 >= r5) goto L126
            com.github.mikephil.charting.data.Entry r5 = r1.getEntryForIndex(r4)
            com.github.mikephil.charting.data.RadarEntry r5 = (com.github.mikephil.charting.data.RadarEntry) r5
            float r16 = r5.getY()
            com.github.mikephil.charting.charts.RadarChart r14 = r0.mChart
            float r14 = r14.getYChartMin()
            float r16 = r16 - r14
            float r16 = r16 * r9
            float r14 = r16 * r7
            r16 = r3
            float r3 = (float) r4
            float r3 = r3 * r8
            float r17 = r3 * r6
            com.github.mikephil.charting.charts.RadarChart r3 = r0.mChart
            float r3 = r3.getRotationAngle()
            float r3 = r17 + r3
            com.github.mikephil.charting.utils.Utils.getPosition(r10, r14, r3, r11)
            boolean r3 = r1.isDrawValuesEnabled()
            if (r3 == 0) goto Lcf
            r3 = r2
            java.lang.String r2 = r3.getRadarLabel(r5)
            r14 = r3
            float r3 = r11.x
            float r0 = r11.y
            float r0 = r0 - r13
            r18 = r5
            int r5 = r1.getValueTextColor(r4)
            r19 = r4
            r20 = r18
            r4 = r0
            r18 = r6
            r6 = r16
            r0 = r27
            r16 = r14
            r14 = r1
            r1 = r28
            r0.drawValue(r1, r2, r3, r4, r5)
            goto Lda
        Lcf:
            r14 = r1
            r19 = r4
            r20 = r5
            r18 = r6
            r6 = r16
            r16 = r2
        Lda:
            android.graphics.drawable.Drawable r1 = r20.getIcon()
            if (r1 == 0) goto L11c
            boolean r1 = r14.isDrawIconsEnabled()
            if (r1 == 0) goto L11c
            android.graphics.drawable.Drawable r22 = r20.getIcon()
            float r1 = r20.getY()
            float r1 = r1 * r9
            float r1 = r1 * r7
            float r2 = r6.y
            float r1 = r1 + r2
            com.github.mikephil.charting.charts.RadarChart r2 = r0.mChart
            float r2 = r2.getRotationAngle()
            float r2 = r17 + r2
            com.github.mikephil.charting.utils.Utils.getPosition(r10, r1, r2, r12)
            float r1 = r12.y
            float r2 = r6.x
            float r1 = r1 + r2
            r12.y = r1
            float r2 = r12.x
            int r2 = (int) r2
            int r1 = (int) r1
            int r25 = r22.getIntrinsicWidth()
            int r26 = r22.getIntrinsicHeight()
            r21 = r28
            r24 = r1
            r23 = r2
            com.github.mikephil.charting.utils.Utils.drawImage(r21, r22, r23, r24, r25, r26)
        L11c:
            int r4 = r19 + 1
            r3 = r6
            r1 = r14
            r2 = r16
            r6 = r18
            goto L76
        L126:
            r18 = r6
            r6 = r3
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r6)
        L12c:
            int r15 = r15 + 1
            r6 = r18
            goto L30
        L132:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r10)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r11)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r12)
            return
    }

    protected void drawWeb(android.graphics.Canvas r23) {
            r22 = this;
            r0 = r22
            com.github.mikephil.charting.charts.RadarChart r1 = r0.mChart
            float r1 = r1.getSliceAngle()
            com.github.mikephil.charting.charts.RadarChart r2 = r0.mChart
            float r2 = r2.getFactor()
            com.github.mikephil.charting.charts.RadarChart r3 = r0.mChart
            float r3 = r3.getRotationAngle()
            com.github.mikephil.charting.charts.RadarChart r4 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r4 = r4.getCenterOffsets()
            android.graphics.Paint r5 = r0.mWebPaint
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            float r6 = r6.getWebLineWidth()
            r5.setStrokeWidth(r6)
            android.graphics.Paint r5 = r0.mWebPaint
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            int r6 = r6.getWebColor()
            r5.setColor(r6)
            android.graphics.Paint r5 = r0.mWebPaint
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            int r6 = r6.getWebAlpha()
            r5.setAlpha(r6)
            com.github.mikephil.charting.charts.RadarChart r5 = r0.mChart
            int r5 = r5.getSkipWebLineCount()
            int r5 = r5 + 1
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            com.github.mikephil.charting.data.ChartData r6 = r6.getData()
            com.github.mikephil.charting.data.RadarData r6 = (com.github.mikephil.charting.data.RadarData) r6
            com.github.mikephil.charting.interfaces.datasets.IDataSet r6 = r6.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r6 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r6
            int r6 = r6.getEntryCount()
            r7 = 0
            com.github.mikephil.charting.utils.MPPointF r8 = com.github.mikephil.charting.utils.MPPointF.getInstance(r7, r7)
            r9 = 0
            r10 = 0
        L5c:
            if (r10 >= r6) goto L84
            com.github.mikephil.charting.charts.RadarChart r11 = r0.mChart
            float r11 = r11.getYRange()
            float r11 = r11 * r2
            float r12 = (float) r10
            float r12 = r12 * r1
            float r12 = r12 + r3
            com.github.mikephil.charting.utils.Utils.getPosition(r4, r11, r12, r8)
            float r14 = r4.x
            float r15 = r4.y
            float r11 = r8.x
            float r12 = r8.y
            android.graphics.Paint r13 = r0.mWebPaint
            r16 = r11
            r17 = r12
            r18 = r13
            r13 = r23
            r13.drawLine(r14, r15, r16, r17, r18)
            int r10 = r10 + r5
            goto L5c
        L84:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r8)
            android.graphics.Paint r5 = r0.mWebPaint
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            float r6 = r6.getWebLineWidthInner()
            r5.setStrokeWidth(r6)
            android.graphics.Paint r5 = r0.mWebPaint
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            int r6 = r6.getWebColorInner()
            r5.setColor(r6)
            android.graphics.Paint r5 = r0.mWebPaint
            com.github.mikephil.charting.charts.RadarChart r6 = r0.mChart
            int r6 = r6.getWebAlpha()
            r5.setAlpha(r6)
            com.github.mikephil.charting.charts.RadarChart r5 = r0.mChart
            com.github.mikephil.charting.components.YAxis r5 = r5.getYAxis()
            int r5 = r5.mEntryCount
            com.github.mikephil.charting.utils.MPPointF r6 = com.github.mikephil.charting.utils.MPPointF.getInstance(r7, r7)
            com.github.mikephil.charting.utils.MPPointF r7 = com.github.mikephil.charting.utils.MPPointF.getInstance(r7, r7)
            r8 = 0
        Lb9:
            if (r8 >= r5) goto L10a
            r10 = 0
        Lbc:
            com.github.mikephil.charting.charts.RadarChart r11 = r0.mChart
            com.github.mikephil.charting.data.ChartData r11 = r11.getData()
            com.github.mikephil.charting.data.RadarData r11 = (com.github.mikephil.charting.data.RadarData) r11
            int r11 = r11.getEntryCount()
            if (r10 >= r11) goto L107
            com.github.mikephil.charting.charts.RadarChart r11 = r0.mChart
            com.github.mikephil.charting.components.YAxis r11 = r11.getYAxis()
            float[] r11 = r11.mEntries
            r11 = r11[r8]
            com.github.mikephil.charting.charts.RadarChart r12 = r0.mChart
            float r12 = r12.getYChartMin()
            float r11 = r11 - r12
            float r11 = r11 * r2
            float r12 = (float) r10
            float r12 = r12 * r1
            float r12 = r12 + r3
            com.github.mikephil.charting.utils.Utils.getPosition(r4, r11, r12, r6)
            int r10 = r10 + 1
            float r12 = (float) r10
            float r12 = r12 * r1
            float r12 = r12 + r3
            com.github.mikephil.charting.utils.Utils.getPosition(r4, r11, r12, r7)
            float r11 = r6.x
            float r12 = r6.y
            float r13 = r7.x
            float r14 = r7.y
            android.graphics.Paint r15 = r0.mWebPaint
            r16 = r23
            r17 = r11
            r18 = r12
            r19 = r13
            r20 = r14
            r21 = r15
            r16.drawLine(r17, r18, r19, r20, r21)
            goto Lbc
        L107:
            int r8 = r8 + 1
            goto Lb9
        L10a:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r6)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r7)
            return
    }

    public android.graphics.Paint getWebPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mWebPaint
            return r0
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r0 = this;
            return
    }
}

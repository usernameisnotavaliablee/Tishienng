package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ScatterChartRenderer extends com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer {
    protected com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider mChart;
    float[] mPixelBuffer;

    public ScatterChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r1, com.github.mikephil.charting.animation.ChartAnimator r2, com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r2 = 2
            float[] r2 = new float[r2]
            r0.mPixelBuffer = r2
            r0.mChart = r1
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas r4) {
            r3 = this;
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r0 = r3.mChart
            com.github.mikephil.charting.data.ScatterData r0 = r0.getScatterData()
            java.util.List r0 = r0.getDataSets()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) r1
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto Le
            r3.drawDataSet(r4, r1)
            goto Le
        L24:
            return
    }

    protected void drawDataSet(android.graphics.Canvas r15, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r16) {
            r14 = this;
            r2 = r16
            int r0 = r2.getEntryCount()
            r7 = 1
            if (r0 >= r7) goto Lb
            goto L9e
        Lb:
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r14.mViewPortHandler
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r0 = r14.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r2.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r9 = r0.getTransformer(r1)
            com.github.mikephil.charting.animation.ChartAnimator r0 = r14.mAnimator
            float r10 = r0.getPhaseY()
            com.github.mikephil.charting.renderer.scatter.IShapeRenderer r0 = r2.getShapeRenderer()
            if (r0 != 0) goto L24
            return
        L24:
            int r1 = r2.getEntryCount()
            float r1 = (float) r1
            com.github.mikephil.charting.animation.ChartAnimator r3 = r14.mAnimator
            float r3 = r3.getPhaseX()
            float r1 = r1 * r3
            double r3 = (double) r1
            double r3 = java.lang.Math.ceil(r3)
            int r1 = r2.getEntryCount()
            float r1 = (float) r1
            double r5 = (double) r1
            double r3 = java.lang.Math.min(r3, r5)
            int r11 = (int) r3
            r12 = 0
            r13 = 0
        L43:
            if (r13 >= r11) goto L9e
            com.github.mikephil.charting.data.Entry r1 = r2.getEntryForIndex(r13)
            float[] r3 = r14.mPixelBuffer
            float r4 = r1.getX()
            r3[r12] = r4
            float[] r3 = r14.mPixelBuffer
            float r1 = r1.getY()
            float r1 = r1 * r10
            r3[r7] = r1
            float[] r1 = r14.mPixelBuffer
            r9.pointValuesToPixel(r1)
            float[] r1 = r14.mPixelBuffer
            r1 = r1[r12]
            boolean r1 = r8.isInBoundsRight(r1)
            if (r1 != 0) goto L6b
            goto L9e
        L6b:
            float[] r1 = r14.mPixelBuffer
            r1 = r1[r12]
            boolean r1 = r8.isInBoundsLeft(r1)
            if (r1 == 0) goto L99
            float[] r1 = r14.mPixelBuffer
            r1 = r1[r7]
            boolean r1 = r8.isInBoundsY(r1)
            if (r1 != 0) goto L80
            goto L99
        L80:
            android.graphics.Paint r1 = r14.mRenderPaint
            int r3 = r13 / 2
            int r3 = r2.getColor(r3)
            r1.setColor(r3)
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r14.mViewPortHandler
            float[] r1 = r14.mPixelBuffer
            r4 = r1[r12]
            r5 = r1[r7]
            android.graphics.Paint r6 = r14.mRenderPaint
            r1 = r15
            r0.renderShape(r1, r2, r3, r4, r5, r6)
        L99:
            int r13 = r13 + 1
            r2 = r16
            goto L43
        L9e:
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
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r0 = r9.mChart
            com.github.mikephil.charting.data.ScatterData r0 = r0.getScatterData()
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L65
            r3 = r11[r2]
            int r4 = r3.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r4 = r0.getDataSetByIndex(r4)
            com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) r4
            if (r4 == 0) goto L62
            boolean r5 = r4.isHighlightEnabled()
            if (r5 != 0) goto L1f
            goto L62
        L1f:
            float r5 = r3.getX()
            float r6 = r3.getY()
            com.github.mikephil.charting.data.Entry r5 = r4.getEntryForXValue(r5, r6)
            boolean r6 = r9.isInBoundsX(r5, r4)
            if (r6 != 0) goto L32
            goto L62
        L32:
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r6 = r9.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r7 = r4.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r6 = r6.getTransformer(r7)
            float r7 = r5.getX()
            float r5 = r5.getY()
            com.github.mikephil.charting.animation.ChartAnimator r8 = r9.mAnimator
            float r8 = r8.getPhaseY()
            float r5 = r5 * r8
            com.github.mikephil.charting.utils.MPPointD r5 = r6.getPixelForValues(r7, r5)
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
        L62:
            int r2 = r2 + 1
            goto L8
        L65:
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
    public void drawValues(android.graphics.Canvas r17) {
            r16 = this;
            r0 = r16
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r1 = r0.mChart
            boolean r1 = r0.isDrawingValuesAllowed(r1)
            if (r1 == 0) goto L113
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.ScatterData r1 = r1.getScatterData()
            java.util.List r6 = r1.getDataSets()
            r8 = 0
        L15:
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.ScatterData r1 = r1.getScatterData()
            int r1 = r1.getDataSetCount()
            if (r8 >= r1) goto L113
            java.lang.Object r1 = r6.get(r8)
            r10 = r1
            com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r10 = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) r10
            boolean r1 = r0.shouldDrawValues(r10)
            if (r1 == 0) goto L10d
            int r1 = r10.getEntryCount()
            r2 = 1
            if (r1 >= r2) goto L37
            goto L10d
        L37:
            r0.applyValueTextStyle(r10)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r1 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r2 = r0.mChart
            r1.set(r2, r10)
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r1 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r10.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r9 = r1.getTransformer(r2)
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r11 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r12 = r1.getPhaseY()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r1 = r0.mXBounds
            int r13 = r1.min
            int r14 = r1.max
            float[] r9 = r9.generateTransformedValuesScatter(r10, r11, r12, r13, r14)
            float r1 = r10.getScatterShapeSize()
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
        L86:
            int r1 = r9.length
            if (r14 >= r1) goto L10a
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            r2 = r9[r14]
            boolean r1 = r1.isInBoundsRight(r2)
            if (r1 != 0) goto L95
            goto L10a
        L95:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            r2 = r9[r14]
            boolean r1 = r1.isInBoundsLeft(r2)
            if (r1 == 0) goto L104
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            int r15 = r14 + 1
            r2 = r9[r15]
            boolean r1 = r1.isInBoundsY(r2)
            if (r1 != 0) goto Lac
            goto L104
        Lac:
            int r1 = r14 / 2
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.min
            int r2 = r2 + r1
            com.github.mikephil.charting.data.Entry r2 = r10.getEntryForIndex(r2)
            boolean r3 = r10.isDrawValuesEnabled()
            if (r3 == 0) goto Lda
            r3 = r2
            java.lang.String r2 = r12.getPointLabel(r3)
            r4 = r3
            r3 = r9[r14]
            r5 = r9[r15]
            float r5 = r5 - r11
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r7 = r0.mXBounds
            int r7 = r7.min
            int r1 = r1 + r7
            int r1 = r10.getValueTextColor(r1)
            r7 = r4
            r4 = r5
            r5 = r1
            r1 = r17
            r0.drawValue(r1, r2, r3, r4, r5)
            goto Ldb
        Lda:
            r7 = r2
        Ldb:
            android.graphics.drawable.Drawable r0 = r7.getIcon()
            if (r0 == 0) goto L104
            boolean r0 = r10.isDrawIconsEnabled()
            if (r0 == 0) goto L104
            android.graphics.drawable.Drawable r1 = r7.getIcon()
            r0 = r9[r14]
            float r2 = r13.x
            float r0 = r0 + r2
            int r2 = (int) r0
            r0 = r9[r15]
            float r3 = r13.y
            float r0 = r0 + r3
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r17
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
        L104:
            int r14 = r14 + 2
            r0 = r16
            goto L86
        L10a:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r13)
        L10d:
            int r8 = r8 + 1
            r0 = r16
            goto L15
        L113:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r0 = this;
            return
    }
}

package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BubbleChartRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    private float[] _hsvBuffer;
    protected com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider mChart;
    private float[] pointBuffer;
    private float[] sizeBuffer;

    public BubbleChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r1, com.github.mikephil.charting.animation.ChartAnimator r2, com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r2 = 4
            float[] r2 = new float[r2]
            r0.sizeBuffer = r2
            r2 = 2
            float[] r2 = new float[r2]
            r0.pointBuffer = r2
            r2 = 3
            float[] r2 = new float[r2]
            r0._hsvBuffer = r2
            r0.mChart = r1
            android.graphics.Paint r1 = r0.mRenderPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.mHighlightPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.mHighlightPaint
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r1.setStrokeWidth(r2)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas r4) {
            r3 = this;
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r0 = r3.mChart
            com.github.mikephil.charting.data.BubbleData r0 = r0.getBubbleData()
            java.util.List r0 = r0.getDataSets()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) r1
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto Le
            r3.drawDataSet(r4, r1)
            goto Le
        L24:
            return
    }

    protected void drawDataSet(android.graphics.Canvas r12, com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet r13) {
            r11 = this;
            int r0 = r13.getEntryCount()
            r1 = 1
            if (r0 >= r1) goto L9
            goto Ldf
        L9:
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r0 = r11.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r13.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r0 = r0.getTransformer(r2)
            com.github.mikephil.charting.animation.ChartAnimator r2 = r11.mAnimator
            float r2 = r2.getPhaseY()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r3 = r11.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r4 = r11.mChart
            r3.set(r4, r13)
            float[] r3 = r11.sizeBuffer
            r4 = 0
            r5 = 0
            r3[r5] = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 2
            r3[r6] = r4
            r0.pointValuesToPixel(r3)
            boolean r3 = r13.isNormalizeSizeEnabled()
            float[] r4 = r11.sizeBuffer
            r6 = r4[r6]
            r4 = r4[r5]
            float r6 = r6 - r4
            float r4 = java.lang.Math.abs(r6)
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r11.mViewPortHandler
            float r6 = r6.contentBottom()
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r11.mViewPortHandler
            float r7 = r7.contentTop()
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            float r4 = java.lang.Math.min(r6, r4)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r6 = r11.mXBounds
            int r6 = r6.min
        L56:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r7 = r11.mXBounds
            int r8 = r7.range
            int r7 = r7.min
            int r8 = r8 + r7
            if (r6 > r8) goto Ldf
            com.github.mikephil.charting.data.Entry r7 = r13.getEntryForIndex(r6)
            com.github.mikephil.charting.data.BubbleEntry r7 = (com.github.mikephil.charting.data.BubbleEntry) r7
            float[] r8 = r11.pointBuffer
            float r9 = r7.getX()
            r8[r5] = r9
            float[] r8 = r11.pointBuffer
            float r9 = r7.getY()
            float r9 = r9 * r2
            r8[r1] = r9
            float[] r8 = r11.pointBuffer
            r0.pointValuesToPixel(r8)
            float r8 = r7.getSize()
            float r9 = r13.getMaxSize()
            float r8 = r11.getShapeSize(r8, r9, r4, r3)
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            com.github.mikephil.charting.utils.ViewPortHandler r9 = r11.mViewPortHandler
            float[] r10 = r11.pointBuffer
            r10 = r10[r1]
            float r10 = r10 + r8
            boolean r9 = r9.isInBoundsTop(r10)
            if (r9 == 0) goto Ldb
            com.github.mikephil.charting.utils.ViewPortHandler r9 = r11.mViewPortHandler
            float[] r10 = r11.pointBuffer
            r10 = r10[r1]
            float r10 = r10 - r8
            boolean r9 = r9.isInBoundsBottom(r10)
            if (r9 != 0) goto La6
            goto Ldb
        La6:
            com.github.mikephil.charting.utils.ViewPortHandler r9 = r11.mViewPortHandler
            float[] r10 = r11.pointBuffer
            r10 = r10[r5]
            float r10 = r10 + r8
            boolean r9 = r9.isInBoundsLeft(r10)
            if (r9 != 0) goto Lb4
            goto Ldb
        Lb4:
            com.github.mikephil.charting.utils.ViewPortHandler r9 = r11.mViewPortHandler
            float[] r10 = r11.pointBuffer
            r10 = r10[r5]
            float r10 = r10 - r8
            boolean r9 = r9.isInBoundsRight(r10)
            if (r9 != 0) goto Lc2
            goto Ldf
        Lc2:
            float r7 = r7.getX()
            int r7 = (int) r7
            int r7 = r13.getColor(r7)
            android.graphics.Paint r9 = r11.mRenderPaint
            r9.setColor(r7)
            float[] r7 = r11.pointBuffer
            r9 = r7[r5]
            r7 = r7[r1]
            android.graphics.Paint r10 = r11.mRenderPaint
            r12.drawCircle(r9, r7, r8, r10)
        Ldb:
            int r6 = r6 + 1
            goto L56
        Ldf:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas r18, com.github.mikephil.charting.highlight.Highlight[] r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r2 = r0.mChart
            com.github.mikephil.charting.data.BubbleData r2 = r2.getBubbleData()
            com.github.mikephil.charting.animation.ChartAnimator r3 = r0.mAnimator
            float r3 = r3.getPhaseY()
            int r4 = r1.length
            r5 = 0
            r6 = 0
        L13:
            if (r6 >= r4) goto L141
            r7 = r1[r6]
            int r8 = r7.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r8 = r2.getDataSetByIndex(r8)
            com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet r8 = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) r8
            if (r8 == 0) goto L29
            boolean r9 = r8.isHighlightEnabled()
            if (r9 != 0) goto L2d
        L29:
            r11 = r18
            goto L13d
        L2d:
            float r9 = r7.getX()
            float r10 = r7.getY()
            com.github.mikephil.charting.data.Entry r9 = r8.getEntryForXValue(r9, r10)
            com.github.mikephil.charting.data.BubbleEntry r9 = (com.github.mikephil.charting.data.BubbleEntry) r9
            float r10 = r9.getY()
            float r11 = r7.getY()
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L48
            goto L29
        L48:
            boolean r10 = r0.isInBoundsX(r9, r8)
            if (r10 != 0) goto L4f
            goto L29
        L4f:
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r10 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r11 = r8.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r10 = r10.getTransformer(r11)
            float[] r11 = r0.sizeBuffer
            r12 = 0
            r11[r5] = r12
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 2
            r11[r13] = r12
            r10.pointValuesToPixel(r11)
            boolean r11 = r8.isNormalizeSizeEnabled()
            float[] r12 = r0.sizeBuffer
            r14 = r12[r13]
            r12 = r12[r5]
            float r14 = r14 - r12
            float r12 = java.lang.Math.abs(r14)
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r0.mViewPortHandler
            float r14 = r14.contentBottom()
            com.github.mikephil.charting.utils.ViewPortHandler r15 = r0.mViewPortHandler
            float r15 = r15.contentTop()
            float r14 = r14 - r15
            float r14 = java.lang.Math.abs(r14)
            float r12 = java.lang.Math.min(r14, r12)
            float[] r14 = r0.pointBuffer
            float r15 = r9.getX()
            r14[r5] = r15
            float[] r14 = r0.pointBuffer
            float r15 = r9.getY()
            float r15 = r15 * r3
            r16 = 1
            r14[r16] = r15
            float[] r14 = r0.pointBuffer
            r10.pointValuesToPixel(r14)
            float[] r10 = r0.pointBuffer
            r14 = r10[r5]
            r10 = r10[r16]
            r7.setDraw(r14, r10)
            float r7 = r9.getSize()
            float r10 = r8.getMaxSize()
            float r7 = r0.getShapeSize(r7, r10, r12, r11)
            r10 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r10
            com.github.mikephil.charting.utils.ViewPortHandler r10 = r0.mViewPortHandler
            float[] r11 = r0.pointBuffer
            r11 = r11[r16]
            float r11 = r11 + r7
            boolean r10 = r10.isInBoundsTop(r11)
            if (r10 == 0) goto L29
            com.github.mikephil.charting.utils.ViewPortHandler r10 = r0.mViewPortHandler
            float[] r11 = r0.pointBuffer
            r11 = r11[r16]
            float r11 = r11 - r7
            boolean r10 = r10.isInBoundsBottom(r11)
            if (r10 != 0) goto Ld7
            goto L29
        Ld7:
            com.github.mikephil.charting.utils.ViewPortHandler r10 = r0.mViewPortHandler
            float[] r11 = r0.pointBuffer
            r11 = r11[r5]
            float r11 = r11 + r7
            boolean r10 = r10.isInBoundsLeft(r11)
            if (r10 != 0) goto Le6
            goto L29
        Le6:
            com.github.mikephil.charting.utils.ViewPortHandler r10 = r0.mViewPortHandler
            float[] r11 = r0.pointBuffer
            r11 = r11[r5]
            float r11 = r11 - r7
            boolean r10 = r10.isInBoundsRight(r11)
            if (r10 != 0) goto Lf4
            goto L141
        Lf4:
            float r9 = r9.getX()
            int r9 = (int) r9
            int r9 = r8.getColor(r9)
            int r10 = android.graphics.Color.red(r9)
            int r11 = android.graphics.Color.green(r9)
            int r12 = android.graphics.Color.blue(r9)
            float[] r14 = r0._hsvBuffer
            android.graphics.Color.RGBToHSV(r10, r11, r12, r14)
            float[] r10 = r0._hsvBuffer
            r11 = r10[r13]
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r12
            r10[r13] = r11
            int r9 = android.graphics.Color.alpha(r9)
            float[] r10 = r0._hsvBuffer
            int r9 = android.graphics.Color.HSVToColor(r9, r10)
            android.graphics.Paint r10 = r0.mHighlightPaint
            r10.setColor(r9)
            android.graphics.Paint r9 = r0.mHighlightPaint
            float r8 = r8.getHighlightCircleWidth()
            r9.setStrokeWidth(r8)
            float[] r8 = r0.pointBuffer
            r9 = r8[r5]
            r8 = r8[r16]
            android.graphics.Paint r10 = r0.mHighlightPaint
            r11 = r18
            r11.drawCircle(r9, r8, r7, r10)
        L13d:
            int r6 = r6 + 1
            goto L13
        L141:
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
    public void drawValues(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.BubbleData r1 = r1.getBubbleData()
            if (r1 != 0) goto Lc
            goto L142
        Lc:
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r2 = r0.mChart
            boolean r2 = r0.isDrawingValuesAllowed(r2)
            if (r2 == 0) goto L142
            java.util.List r6 = r1.getDataSets()
            android.graphics.Paint r1 = r0.mValuePaint
            java.lang.String r2 = "1"
            int r1 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r1, r2)
            float r7 = (float) r1
            r8 = 0
            r9 = 0
        L23:
            int r1 = r6.size()
            if (r9 >= r1) goto L142
            java.lang.Object r1 = r6.get(r9)
            r10 = r1
            com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet r10 = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) r10
            boolean r1 = r0.shouldDrawValues(r10)
            if (r1 == 0) goto L13c
            int r1 = r10.getEntryCount()
            r2 = 1
            if (r1 >= r2) goto L3f
            goto L13c
        L3f:
            r0.applyValueTextStyle(r10)
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r1 = r1.getPhaseX()
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r2, r1)
            r3 = 0
            float r1 = java.lang.Math.max(r3, r1)
            com.github.mikephil.charting.animation.ChartAnimator r3 = r0.mAnimator
            float r3 = r3.getPhaseY()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r4 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r5 = r0.mChart
            r4.set(r5, r10)
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r4 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r5 = r10.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r4 = r4.getTransformer(r5)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r5 = r0.mXBounds
            int r11 = r5.min
            int r5 = r5.max
            float[] r11 = r4.generateTransformedValuesBubble(r10, r3, r11, r5)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L7a
            r12 = r3
            goto L7b
        L7a:
            r12 = r1
        L7b:
            com.github.mikephil.charting.formatter.ValueFormatter r13 = r10.getValueFormatter()
            com.github.mikephil.charting.utils.MPPointF r1 = r10.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r14 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1)
            float r1 = r14.x
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r14.x = r1
            float r1 = r14.y
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r14.y = r1
            r15 = 0
        L98:
            int r1 = r11.length
            if (r15 >= r1) goto L139
            int r1 = r15 / 2
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.min
            int r2 = r2 + r1
            int r2 = r10.getValueTextColor(r2)
            r3 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r12
            int r3 = java.lang.Math.round(r3)
            int r4 = android.graphics.Color.red(r2)
            int r5 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            int r5 = android.graphics.Color.argb(r3, r4, r5, r2)
            r3 = r11[r15]
            int r2 = r15 + 1
            r2 = r11[r2]
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            boolean r4 = r4.isInBoundsRight(r3)
            if (r4 != 0) goto Lce
            goto L139
        Lce:
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            boolean r4 = r4.isInBoundsLeft(r3)
            if (r4 == 0) goto L133
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            boolean r4 = r4.isInBoundsY(r2)
            if (r4 != 0) goto Ldf
            goto L133
        Ldf:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r4 = r0.mXBounds
            int r4 = r4.min
            int r1 = r1 + r4
            com.github.mikephil.charting.data.Entry r1 = r10.getEntryForIndex(r1)
            com.github.mikephil.charting.data.BubbleEntry r1 = (com.github.mikephil.charting.data.BubbleEntry) r1
            boolean r4 = r10.isDrawValuesEnabled()
            if (r4 == 0) goto L109
            r4 = r2
            java.lang.String r2 = r13.getBubbleLabel(r1)
            r16 = 1056964608(0x3f000000, float:0.5)
            float r16 = r16 * r7
            float r16 = r4 + r16
            r17 = r16
            r16 = r4
            r4 = r17
            r17 = r1
            r1 = r19
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L10d
        L109:
            r17 = r1
            r16 = r2
        L10d:
            android.graphics.drawable.Drawable r0 = r17.getIcon()
            if (r0 == 0) goto L133
            boolean r0 = r10.isDrawIconsEnabled()
            if (r0 == 0) goto L133
            android.graphics.drawable.Drawable r1 = r17.getIcon()
            float r0 = r14.x
            float r3 = r3 + r0
            int r2 = (int) r3
            float r0 = r14.y
            float r0 = r16 + r0
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r19
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
        L133:
            int r15 = r15 + 2
            r0 = r18
            goto L98
        L139:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r14)
        L13c:
            int r9 = r9 + 1
            r0 = r18
            goto L23
        L142:
            return
    }

    protected float getShapeSize(float r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 == 0) goto L11
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto La
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L11
        La:
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
        L11:
            float r3 = r3 * r1
            return r3
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r0 = this;
            return
    }
}

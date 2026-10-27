package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class HorizontalBarChartRenderer extends com.github.mikephil.charting.renderer.BarChartRenderer {
    private android.graphics.RectF mBarShadowRectBuffer;

    public HorizontalBarChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1, com.github.mikephil.charting.animation.ChartAnimator r2, com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mBarShadowRectBuffer = r1
            android.graphics.Paint r1 = r0.mValuePaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            r1.setTextAlign(r2)
            return
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void drawDataSet(android.graphics.Canvas r21, com.github.mikephil.charting.interfaces.datasets.IBarDataSet r22, int r23) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
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
            r13.top = r14
            float r12 = r12 + r9
            r13.bottom = r12
            r3.rectValueToPixel(r13)
            com.github.mikephil.charting.utils.ViewPortHandler r12 = r0.mViewPortHandler
            android.graphics.RectF r13 = r0.mBarShadowRectBuffer
            float r13 = r13.bottom
            boolean r12 = r12.isInBoundsTop(r13)
            if (r12 != 0) goto L9b
            r14 = r21
            goto Lc7
        L9b:
            com.github.mikephil.charting.utils.ViewPortHandler r12 = r0.mViewPortHandler
            android.graphics.RectF r13 = r0.mBarShadowRectBuffer
            float r13 = r13.top
            boolean r12 = r12.isInBoundsBottom(r13)
            if (r12 != 0) goto Laa
        La7:
            r14 = r21
            goto Lca
        Laa:
            android.graphics.RectF r12 = r0.mBarShadowRectBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentLeft()
            r12.left = r13
            android.graphics.RectF r12 = r0.mBarShadowRectBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentRight()
            r12.right = r13
            android.graphics.RectF r12 = r0.mBarShadowRectBuffer
            android.graphics.Paint r13 = r0.mShadowPaint
            r14 = r21
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
            if (r6 >= r2) goto L16b
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float[] r3 = r9.buffer
            int r5 = r6 + 3
            r3 = r3[r5]
            boolean r2 = r2.isInBoundsTop(r3)
            if (r2 != 0) goto L122
            goto L16b
        L122:
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r0.mViewPortHandler
            float[] r3 = r9.buffer
            int r8 = r6 + 1
            r3 = r3[r8]
            boolean r2 = r2.isInBoundsBottom(r3)
            if (r2 != 0) goto L131
            goto L166
        L131:
            if (r7 != 0) goto L13e
            android.graphics.Paint r2 = r0.mRenderPaint
            int r3 = r6 / 4
            int r3 = r1.getColor(r3)
            r2.setColor(r3)
        L13e:
            float[] r2 = r9.buffer
            r15 = r2[r6]
            r16 = r2[r8]
            int r3 = r6 + 2
            r17 = r2[r3]
            r18 = r2[r5]
            android.graphics.Paint r2 = r0.mRenderPaint
            r19 = r2
            r14.drawRect(r15, r16, r17, r18, r19)
            if (r4 == 0) goto L166
            float[] r2 = r9.buffer
            r15 = r2[r6]
            r16 = r2[r8]
            r17 = r2[r3]
            r18 = r2[r5]
            android.graphics.Paint r2 = r0.mBarBorderPaint
            r14 = r21
            r19 = r2
            r14.drawRect(r15, r16, r17, r18, r19)
        L166:
            int r6 = r6 + 4
            r14 = r21
            goto L10d
        L16b:
            return
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas r2, java.lang.String r3, float r4, float r5, int r6) {
            r1 = this;
            android.graphics.Paint r0 = r1.mValuePaint
            r0.setColor(r6)
            android.graphics.Paint r6 = r1.mValuePaint
            r2.drawText(r3, r4, r5, r6)
            return
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas r33) {
            r32 = this;
            r0 = r32
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            boolean r1 = r0.isDrawingValuesAllowed(r1)
            if (r1 == 0) goto L3d6
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.BarData r1 = r1.getBarData()
            java.util.List r6 = r1.getDataSets()
            r1 = 1084227584(0x40a00000, float:5.0)
            float r7 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            boolean r8 = r1.isDrawValueAboveBarEnabled()
            r10 = 0
        L21:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.BarData r1 = r1.getBarData()
            int r1 = r1.getDataSetCount()
            if (r10 >= r1) goto L3d6
            java.lang.Object r1 = r6.get(r10)
            r11 = r1
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r11 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r11
            boolean r1 = r0.shouldDrawValues(r11)
            if (r1 != 0) goto L44
            r22 = r6
            r21 = r7
            r23 = r8
            r20 = r10
            goto L3ca
        L44:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r11.getAxisDependency()
            boolean r12 = r1.isInverted(r2)
            r0.applyValueTextStyle(r11)
            android.graphics.Paint r1 = r0.mValuePaint
            java.lang.String r2 = "10"
            int r1 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r1, r2)
            float r1 = (float) r1
            r13 = 1073741824(0x40000000, float:2.0)
            float r14 = r1 / r13
            com.github.mikephil.charting.formatter.ValueFormatter r15 = r11.getValueFormatter()
            com.github.mikephil.charting.buffer.BarBuffer[] r1 = r0.mBarBuffers
            r1 = r1[r10]
            com.github.mikephil.charting.animation.ChartAnimator r2 = r0.mAnimator
            float r16 = r2.getPhaseY()
            com.github.mikephil.charting.utils.MPPointF r2 = r11.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r2 = com.github.mikephil.charting.utils.MPPointF.getInstance(r2)
            float r3 = r2.x
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.x = r3
            float r3 = r2.y
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.y = r3
            boolean r3 = r11.isStacked()
            r17 = 0
            if (r3 != 0) goto L199
            r3 = 0
        L8d:
            float r4 = (float) r3
            float[] r5 = r1.buffer
            int r5 = r5.length
            float r5 = (float) r5
            com.github.mikephil.charting.animation.ChartAnimator r9 = r0.mAnimator
            float r9 = r9.getPhaseX()
            float r5 = r5 * r9
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lb3
            float[] r4 = r1.buffer
            int r5 = r3 + 1
            r9 = r4[r5]
            int r16 = r3 + 3
            r4 = r4[r16]
            float r4 = r4 + r9
            float r16 = r4 / r13
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            boolean r4 = r4.isInBoundsTop(r9)
            if (r4 != 0) goto Lba
        Lb3:
            r22 = r6
            r21 = r7
            r7 = r2
            goto L193
        Lba:
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            float[] r9 = r1.buffer
            r9 = r9[r3]
            boolean r4 = r4.isInBoundsX(r9)
            if (r4 != 0) goto Ld2
        Lc6:
            r23 = r3
            r22 = r6
            r21 = r7
            r19 = 1073741824(0x40000000, float:2.0)
            r6 = r1
            r7 = r2
            goto L187
        Ld2:
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r0.mViewPortHandler
            float[] r9 = r1.buffer
            r5 = r9[r5]
            boolean r4 = r4.isInBoundsBottom(r5)
            if (r4 != 0) goto Ldf
            goto Lc6
        Ldf:
            int r4 = r3 / 4
            com.github.mikephil.charting.data.Entry r4 = r11.getEntryForIndex(r4)
            r9 = r4
            com.github.mikephil.charting.data.BarEntry r9 = (com.github.mikephil.charting.data.BarEntry) r9
            float r18 = r9.getY()
            r4 = r2
            java.lang.String r2 = r15.getBarLabel(r9)
            android.graphics.Paint r5 = r0.mValuePaint
            int r5 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r5, r2)
            float r5 = (float) r5
            if (r8 == 0) goto Lfe
            r13 = r7
            r19 = 1073741824(0x40000000, float:2.0)
            goto L103
        Lfe:
            r19 = 1073741824(0x40000000, float:2.0)
            float r13 = r5 + r7
            float r13 = -r13
        L103:
            if (r8 == 0) goto L109
            float r0 = r5 + r7
            float r0 = -r0
            goto L10a
        L109:
            r0 = r7
        L10a:
            if (r12 == 0) goto L110
            float r13 = -r13
            float r13 = r13 - r5
            float r0 = -r0
            float r0 = r0 - r5
        L110:
            r20 = r13
            r13 = r0
            boolean r0 = r11.isDrawValuesEnabled()
            if (r0 == 0) goto L146
            float[] r0 = r1.buffer
            int r5 = r3 + 2
            r0 = r0[r5]
            int r5 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r5 < 0) goto L126
            r5 = r20
            goto L127
        L126:
            r5 = r13
        L127:
            float r0 = r0 + r5
            r5 = r4
            float r4 = r16 + r14
            r21 = r0
            int r0 = r3 / 2
            int r0 = r11.getValueTextColor(r0)
            r23 = r3
            r22 = r6
            r3 = r21
            r6 = r1
            r21 = r7
            r1 = r33
            r7 = r5
            r5 = r0
            r0 = r32
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L150
        L146:
            r0 = r32
            r23 = r3
            r22 = r6
            r21 = r7
            r6 = r1
            r7 = r4
        L150:
            android.graphics.drawable.Drawable r1 = r9.getIcon()
            if (r1 == 0) goto L187
            boolean r1 = r11.isDrawIconsEnabled()
            if (r1 == 0) goto L187
            android.graphics.drawable.Drawable r25 = r9.getIcon()
            float[] r1 = r6.buffer
            int r3 = r23 + 2
            r1 = r1[r3]
            int r2 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r2 < 0) goto L16c
            r13 = r20
        L16c:
            float r1 = r1 + r13
            float r2 = r7.x
            float r1 = r1 + r2
            float r2 = r7.y
            float r2 = r16 + r2
            int r1 = (int) r1
            int r2 = (int) r2
            int r28 = r25.getIntrinsicWidth()
            int r29 = r25.getIntrinsicHeight()
            r24 = r33
            r26 = r1
            r27 = r2
            com.github.mikephil.charting.utils.Utils.drawImage(r24, r25, r26, r27, r28, r29)
        L187:
            int r3 = r23 + 4
            r1 = r6
            r2 = r7
            r7 = r21
            r6 = r22
            r13 = 1073741824(0x40000000, float:2.0)
            goto L8d
        L193:
            r23 = r8
            r20 = r10
            goto L3c7
        L199:
            r22 = r6
            r21 = r7
            r19 = 1073741824(0x40000000, float:2.0)
            r6 = r1
            r7 = r2
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r11.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r9 = r1.getTransformer(r2)
            r13 = 0
            r18 = 0
        L1ae:
            float r1 = (float) r13
            int r2 = r11.getEntryCount()
            float r2 = (float) r2
            com.github.mikephil.charting.animation.ChartAnimator r3 = r0.mAnimator
            float r3 = r3.getPhaseX()
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L193
            com.github.mikephil.charting.data.Entry r1 = r11.getEntryForIndex(r13)
            com.github.mikephil.charting.data.BarEntry r1 = (com.github.mikephil.charting.data.BarEntry) r1
            int r5 = r11.getValueTextColor(r13)
            float[] r2 = r1.getYVals()
            if (r2 != 0) goto L29d
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            float[] r4 = r6.buffer
            int r20 = r18 + 1
            r4 = r4[r20]
            boolean r3 = r3.isInBoundsTop(r4)
            if (r3 != 0) goto L1df
            goto L193
        L1df:
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            float[] r4 = r6.buffer
            r4 = r4[r18]
            boolean r3 = r3.isInBoundsX(r4)
            if (r3 != 0) goto L1ec
            goto L1ae
        L1ec:
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            float[] r4 = r6.buffer
            r4 = r4[r20]
            boolean r3 = r3.isInBoundsBottom(r4)
            if (r3 != 0) goto L1f9
            goto L1ae
        L1f9:
            r3 = r2
            java.lang.String r2 = r15.getBarLabel(r1)
            android.graphics.Paint r4 = r0.mValuePaint
            int r4 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r4, r2)
            float r4 = (float) r4
            if (r8 == 0) goto L20a
            r0 = r21
            goto L20d
        L20a:
            float r0 = r4 + r21
            float r0 = -r0
        L20d:
            r23 = r1
            if (r8 == 0) goto L215
            float r1 = r4 + r21
            float r1 = -r1
            goto L217
        L215:
            r1 = r21
        L217:
            if (r12 == 0) goto L21d
            float r0 = -r0
            float r0 = r0 - r4
            float r1 = -r1
            float r1 = r1 - r4
        L21d:
            r24 = r0
            r25 = r1
            boolean r0 = r11.isDrawValuesEnabled()
            if (r0 == 0) goto L24f
            float[] r0 = r6.buffer
            int r1 = r18 + 2
            r0 = r0[r1]
            float r1 = r23.getY()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 < 0) goto L238
            r1 = r24
            goto L23a
        L238:
            r1 = r25
        L23a:
            float r0 = r0 + r1
            float[] r1 = r6.buffer
            r1 = r1[r20]
            float r4 = r1 + r14
            r1 = r33
            r26 = r23
            r23 = r8
            r8 = r3
            r3 = r0
            r0 = r32
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L254
        L24f:
            r26 = r23
            r23 = r8
            r8 = r3
        L254:
            android.graphics.drawable.Drawable r0 = r26.getIcon()
            if (r0 == 0) goto L297
            boolean r0 = r11.isDrawIconsEnabled()
            if (r0 == 0) goto L297
            android.graphics.drawable.Drawable r1 = r26.getIcon()
            float[] r0 = r6.buffer
            int r2 = r18 + 2
            r0 = r0[r2]
            float r2 = r26.getY()
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 < 0) goto L273
            goto L275
        L273:
            r24 = r25
        L275:
            float r0 = r0 + r24
            float[] r2 = r6.buffer
            r2 = r2[r20]
            float r3 = r7.x
            float r0 = r0 + r3
            float r3 = r7.y
            float r2 = r2 + r3
            int r0 = (int) r0
            int r3 = (int) r2
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r2 = r0
            r20 = r10
            r10 = r32
            r0 = r33
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
            goto L3b3
        L297:
            r20 = r10
            r10 = r32
            goto L3b3
        L29d:
            r26 = r1
            r23 = r8
            r20 = r10
            r10 = r0
            r8 = r2
            int r0 = r8.length
            int r0 = r0 * 2
            float[] r1 = new float[r0]
            float r2 = r26.getNegativeSum()
            float r2 = -r2
            r24 = r2
            r2 = 0
            r3 = 0
            r25 = 0
        L2b5:
            if (r2 >= r0) goto L2e2
            r4 = r8[r3]
            int r27 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r27 != 0) goto L2cc
            int r28 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r28 == 0) goto L2c5
            int r28 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r28 != 0) goto L2cc
        L2c5:
            r31 = r24
            r24 = r4
            r4 = r31
            goto L2d7
        L2cc:
            if (r27 < 0) goto L2d5
            float r25 = r25 + r4
            r4 = r24
            r24 = r25
            goto L2d7
        L2d5:
            float r4 = r24 - r4
        L2d7:
            float r24 = r24 * r16
            r1[r2] = r24
            int r2 = r2 + 2
            int r3 = r3 + 1
            r24 = r4
            goto L2b5
        L2e2:
            r9.pointValuesToPixel(r1)
            r2 = 0
        L2e6:
            if (r2 >= r0) goto L3b3
            int r3 = r2 / 2
            r3 = r8[r3]
            r4 = r26
            r26 = r2
            java.lang.String r2 = r15.getBarStackedLabel(r3, r4)
            r27 = r0
            android.graphics.Paint r0 = r10.mValuePaint
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r0, r2)
            float r0 = (float) r0
            r28 = r0
            if (r23 == 0) goto L304
            r0 = r21
            goto L307
        L304:
            float r0 = r28 + r21
            float r0 = -r0
        L307:
            r29 = r1
            if (r23 == 0) goto L30f
            float r1 = r28 + r21
            float r1 = -r1
            goto L311
        L30f:
            r1 = r21
        L311:
            if (r12 == 0) goto L319
            float r0 = -r0
            float r0 = r0 - r28
            float r1 = -r1
            float r1 = r1 - r28
        L319:
            int r28 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r28 != 0) goto L325
            int r28 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r28 != 0) goto L325
            int r28 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r28 > 0) goto L329
        L325:
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 >= 0) goto L32b
        L329:
            r3 = 1
            goto L32c
        L32b:
            r3 = 0
        L32c:
            r28 = r29[r26]
            if (r3 == 0) goto L331
            r0 = r1
        L331:
            float r3 = r28 + r0
            float[] r0 = r6.buffer
            int r1 = r18 + 1
            r1 = r0[r1]
            int r28 = r18 + 3
            r0 = r0[r28]
            float r1 = r1 + r0
            float r0 = r1 / r19
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            boolean r1 = r1.isInBoundsTop(r0)
            if (r1 != 0) goto L34a
            goto L3b3
        L34a:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            boolean r1 = r1.isInBoundsX(r3)
            if (r1 != 0) goto L359
        L352:
            r30 = r5
            r10 = r26
            r26 = r4
            goto L3a7
        L359:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            boolean r1 = r1.isInBoundsBottom(r0)
            if (r1 != 0) goto L362
            goto L352
        L362:
            boolean r1 = r11.isDrawValuesEnabled()
            if (r1 == 0) goto L37a
            r1 = r4
            float r4 = r0 + r14
            r28 = r0
            r0 = r10
            r10 = r26
            r26 = r1
            r1 = r33
            r0.drawValue(r1, r2, r3, r4, r5)
        L377:
            r30 = r5
            goto L381
        L37a:
            r28 = r0
            r10 = r26
            r26 = r4
            goto L377
        L381:
            android.graphics.drawable.Drawable r0 = r26.getIcon()
            if (r0 == 0) goto L3a7
            boolean r0 = r11.isDrawIconsEnabled()
            if (r0 == 0) goto L3a7
            android.graphics.drawable.Drawable r1 = r26.getIcon()
            float r0 = r7.x
            float r3 = r3 + r0
            int r2 = (int) r3
            float r0 = r7.y
            float r0 = r28 + r0
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r33
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
        L3a7:
            int r2 = r10 + 2
            r10 = r32
            r0 = r27
            r1 = r29
            r5 = r30
            goto L2e6
        L3b3:
            if (r8 != 0) goto L3b8
            int r18 = r18 + 4
            goto L3bd
        L3b8:
            int r0 = r8.length
            int r0 = r0 * 4
            int r18 = r18 + r0
        L3bd:
            int r13 = r13 + 1
            r0 = r32
            r10 = r20
            r8 = r23
            goto L1ae
        L3c7:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r7)
        L3ca:
            int r10 = r20 + 1
            r0 = r32
            r7 = r21
            r6 = r22
            r8 = r23
            goto L21
        L3d6:
            return
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r7 = this;
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r7.mChart
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            int r1 = r0.getDataSetCount()
            com.github.mikephil.charting.buffer.HorizontalBarBuffer[] r1 = new com.github.mikephil.charting.buffer.HorizontalBarBuffer[r1]
            r7.mBarBuffers = r1
            r1 = 0
        Lf:
            com.github.mikephil.charting.buffer.BarBuffer[] r2 = r7.mBarBuffers
            int r2 = r2.length
            if (r1 >= r2) goto L42
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = r0.getDataSetByIndex(r1)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r2
            com.github.mikephil.charting.buffer.BarBuffer[] r3 = r7.mBarBuffers
            com.github.mikephil.charting.buffer.HorizontalBarBuffer r4 = new com.github.mikephil.charting.buffer.HorizontalBarBuffer
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

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    protected boolean isDrawingValuesAllowed(com.github.mikephil.charting.interfaces.dataprovider.ChartInterface r3) {
            r2 = this;
            com.github.mikephil.charting.data.ChartData r0 = r3.getData()
            int r0 = r0.getEntryCount()
            float r0 = (float) r0
            int r3 = r3.getMaxVisibleCount()
            float r3 = (float) r3
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.getScaleY()
            float r3 = r3 * r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void prepareBarHighlight(float r2, float r3, float r4, float r5, com.github.mikephil.charting.utils.Transformer r6) {
            r1 = this;
            float r0 = r2 - r5
            float r2 = r2 + r5
            android.graphics.RectF r5 = r1.mBarRect
            r5.set(r3, r0, r4, r2)
            android.graphics.RectF r2 = r1.mBarRect
            com.github.mikephil.charting.animation.ChartAnimator r3 = r1.mAnimator
            float r3 = r3.getPhaseY()
            r6.rectToPixelPhaseHorizontal(r2, r3)
            return
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void setHighlightDrawPos(com.github.mikephil.charting.highlight.Highlight r2, android.graphics.RectF r3) {
            r1 = this;
            float r0 = r3.centerY()
            float r3 = r3.right
            r2.setDraw(r0, r3)
            return
    }
}

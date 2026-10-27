package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c extends com.github.mikephil.charting.renderer.HorizontalBarChartRenderer {
    private android.graphics.RectF a;

    public c(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1, com.github.mikephil.charting.animation.ChartAnimator r2, com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.a = r1
            return
    }

    protected void drawDataSet(android.graphics.Canvas r27, com.github.mikephil.charting.interfaces.datasets.IBarDataSet r28, int r29) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r4 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r5 = r2.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r4 = r4.getTransformer(r5)
            android.graphics.Paint r5 = r0.mBarBorderPaint
            int r6 = r2.getBarBorderColor()
            r5.setColor(r6)
            android.graphics.Paint r5 = r0.mBarBorderPaint
            float r6 = r2.getBarBorderWidth()
            float r6 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r6)
            r5.setStrokeWidth(r6)
            float r5 = r2.getBarBorderWidth()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            com.github.mikephil.charting.animation.ChartAnimator r6 = r0.mAnimator
            float r6 = r6.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r9 = r0.mAnimator
            float r9 = r9.getPhaseY()
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r10 = r0.mChart
            boolean r10 = r10.isDrawBarShadowEnabled()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == 0) goto L157
            android.graphics.Paint r10 = r0.mShadowPaint
            int r14 = r2.getBarShadowColor()
            r10.setColor(r14)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r10 = r0.mChart
            com.github.mikephil.charting.data.BarData r10 = r10.getBarData()
            float r10 = r10.getBarWidth()
            float r10 = r10 / r13
            int r14 = r2.getEntryCount()
            float r14 = (float) r14
            float r14 = r14 * r6
            double r14 = (double) r14
            double r14 = java.lang.Math.ceil(r14)
            int r14 = (int) r14
            int r15 = r2.getEntryCount()
            int r14 = java.lang.Math.min(r14, r15)
            r15 = 0
        L74:
            if (r15 >= r14) goto L157
            com.github.mikephil.charting.data.Entry r16 = r2.getEntryForIndex(r15)
            com.github.mikephil.charting.data.BarEntry r16 = (com.github.mikephil.charting.data.BarEntry) r16
            float r16 = r16.getX()
            android.graphics.RectF r7 = r0.a
            r17 = 1073741824(0x40000000, float:2.0)
            float r13 = r16 - r10
            r7.top = r13
            float r13 = r16 + r10
            r7.bottom = r13
            r4.rectValueToPixel(r7)
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r0.mViewPortHandler
            android.graphics.RectF r13 = r0.a
            float r13 = r13.bottom
            boolean r7 = r7.isInBoundsTop(r13)
            if (r7 != 0) goto L9f
            r18 = r5
            goto L14f
        L9f:
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r0.mViewPortHandler
            android.graphics.RectF r13 = r0.a
            float r13 = r13.top
            boolean r7 = r7.isInBoundsBottom(r13)
            if (r7 != 0) goto Laf
            r18 = r5
            goto L15b
        Laf:
            android.graphics.RectF r7 = r0.a
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentLeft()
            r7.left = r13
            android.graphics.RectF r7 = r0.a
            com.github.mikephil.charting.utils.ViewPortHandler r13 = r0.mViewPortHandler
            float r13 = r13.contentRight()
            r7.right = r13
            android.graphics.RectF r7 = r0.a
            float r13 = r7.bottom
            float r7 = r7.top
            float r13 = r13 - r7
            float r13 = r13 / r17
            android.graphics.RectF r7 = new android.graphics.RectF
            android.graphics.RectF r8 = r0.a
            float r11 = r8.right
            float r18 = r13 * r17
            float r12 = r11 - r18
            r18 = r5
            float r5 = r8.top
            float r8 = r8.bottom
            r7.<init>(r12, r5, r11, r8)
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r8 = 1127481344(0x43340000, float:180.0)
            r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r12 = 1
            r5.arcTo(r7, r11, r8, r12)
            android.graphics.RectF r8 = r0.a
            float r11 = r8.right
            float r8 = r8.left
            float r11 = r11 - r8
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 >= 0) goto L124
            float r8 = r7.centerX()
            float r7 = r7.bottom
            r5.lineTo(r8, r7)
            android.graphics.Path r20 = new android.graphics.Path
            r20.<init>()
            android.graphics.RectF r7 = r0.a
            float r8 = r7.left
            float r11 = r7.top
            float r12 = r7.right
            float r7 = r7.bottom
            android.graphics.Path$Direction r25 = android.graphics.Path.Direction.CW
            r24 = r7
            r21 = r8
            r22 = r11
            r23 = r12
            r20.addRect(r21, r22, r23, r24, r25)
            r7 = r20
            android.graphics.Path$Op r8 = android.graphics.Path.Op.INTERSECT
            r5.op(r7, r8)
            goto L14a
        L124:
            float r8 = r7.centerX()
            float r11 = r7.bottom
            r5.moveTo(r8, r11)
            android.graphics.RectF r8 = r0.a
            float r11 = r8.left
            float r8 = r8.bottom
            r5.lineTo(r11, r8)
            android.graphics.RectF r8 = r0.a
            float r11 = r8.left
            float r8 = r8.top
            r5.lineTo(r11, r8)
            float r7 = r7.centerX()
            android.graphics.RectF r8 = r0.a
            float r8 = r8.top
            r5.lineTo(r7, r8)
        L14a:
            android.graphics.Paint r7 = r0.mShadowPaint
            r1.drawPath(r5, r7)
        L14f:
            int r15 = r15 + 1
            r5 = r18
            r13 = 1073741824(0x40000000, float:2.0)
            goto L74
        L157:
            r18 = r5
            r17 = 1073741824(0x40000000, float:2.0)
        L15b:
            com.github.mikephil.charting.buffer.BarBuffer[] r5 = r0.mBarBuffers
            r5 = r5[r3]
            r5.setPhases(r6, r9)
            r5.setDataSet(r3)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r3 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r6 = r2.getAxisDependency()
            boolean r3 = r3.isInverted(r6)
            r5.setInverted(r3)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r3 = r0.mChart
            com.github.mikephil.charting.data.BarData r3 = r3.getBarData()
            float r3 = r3.getBarWidth()
            r5.setBarWidth(r3)
            r5.feed(r2)
            float[] r3 = r5.buffer
            r4.pointValuesToPixel(r3)
            java.util.List r3 = r2.getColors()
            int r3 = r3.size()
            r12 = 1
            if (r3 != r12) goto L194
            r12 = 1
            goto L195
        L194:
            r12 = 0
        L195:
            if (r12 == 0) goto L1a0
            android.graphics.Paint r3 = r0.mRenderPaint
            int r4 = r2.getColor()
            r3.setColor(r4)
        L1a0:
            r7 = 0
        L1a1:
            int r3 = r5.size()
            if (r7 >= r3) goto L269
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            float[] r4 = r5.buffer
            int r6 = r7 + 3
            r4 = r4[r6]
            boolean r3 = r3.isInBoundsTop(r4)
            if (r3 != 0) goto L1b7
            goto L269
        L1b7:
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r0.mViewPortHandler
            float[] r4 = r5.buffer
            int r8 = r7 + 1
            r4 = r4[r8]
            boolean r3 = r3.isInBoundsBottom(r4)
            if (r3 != 0) goto L1cc
            r11 = 1127481344(0x43340000, float:180.0)
            r13 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r14 = 1
            goto L265
        L1cc:
            if (r12 != 0) goto L1d9
            android.graphics.Paint r3 = r0.mRenderPaint
            int r4 = r7 / 4
            int r4 = r2.getColor(r4)
            r3.setColor(r4)
        L1d9:
            float[] r3 = r5.buffer
            r4 = r3[r6]
            r3 = r3[r8]
            float r4 = r4 - r3
            float r4 = r4 / r17
            android.graphics.RectF r3 = new android.graphics.RectF
            float[] r9 = r5.buffer
            int r10 = r7 + 2
            r11 = r9[r10]
            float r13 = r4 * r17
            float r13 = r11 - r13
            r14 = r9[r8]
            r9 = r9[r6]
            r3.<init>(r13, r14, r11, r9)
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            r11 = 1127481344(0x43340000, float:180.0)
            r13 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r14 = 1
            r9.arcTo(r3, r13, r11, r14)
            float[] r15 = r5.buffer
            r16 = r15[r10]
            r15 = r15[r7]
            float r16 = r16 - r15
            int r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r4 >= 0) goto L233
            float r4 = r3.centerX()
            float r3 = r3.bottom
            r9.lineTo(r4, r3)
            android.graphics.Path r19 = new android.graphics.Path
            r19.<init>()
            float[] r3 = r5.buffer
            r20 = r3[r7]
            r21 = r3[r8]
            r22 = r3[r10]
            r23 = r3[r6]
            android.graphics.Path$Direction r24 = android.graphics.Path.Direction.CW
            r19.addRect(r20, r21, r22, r23, r24)
            r3 = r19
            android.graphics.Path$Op r4 = android.graphics.Path.Op.INTERSECT
            r9.op(r3, r4)
            goto L259
        L233:
            float r4 = r3.centerX()
            float r10 = r3.bottom
            r9.moveTo(r4, r10)
            float[] r4 = r5.buffer
            r10 = r4[r7]
            r4 = r4[r6]
            r9.lineTo(r10, r4)
            float[] r4 = r5.buffer
            r6 = r4[r7]
            r4 = r4[r8]
            r9.lineTo(r6, r4)
            float r3 = r3.centerX()
            float[] r4 = r5.buffer
            r4 = r4[r8]
            r9.lineTo(r3, r4)
        L259:
            android.graphics.Paint r3 = r0.mRenderPaint
            r1.drawPath(r9, r3)
            if (r18 == 0) goto L265
            android.graphics.Paint r3 = r0.mBarBorderPaint
            r1.drawPath(r9, r3)
        L265:
            int r7 = r7 + 4
            goto L1a1
        L269:
            return
    }

    public void drawHighlighted(android.graphics.Canvas r24, com.github.mikephil.charting.highlight.Highlight[] r25) {
            r23 = this;
            r0 = r23
            r1 = r25
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r2 = r0.mChart
            com.github.mikephil.charting.data.BarData r2 = r2.getBarData()
            float r3 = r2.getBarWidth()
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            int r6 = r1.length
            r7 = 0
        L14:
            if (r7 >= r6) goto L12e
            r8 = r1[r7]
            int r9 = r8.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r9 = r2.getDataSetByIndex(r9)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r9 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r9
            if (r9 == 0) goto L2a
            boolean r10 = r9.isHighlightEnabled()
            if (r10 != 0) goto L2e
        L2a:
            r4 = r24
            goto L126
        L2e:
            float r10 = r8.getX()
            float r11 = r8.getY()
            com.github.mikephil.charting.data.Entry r10 = r9.getEntryForXValue(r10, r11)
            com.github.mikephil.charting.data.BarEntry r10 = (com.github.mikephil.charting.data.BarEntry) r10
            boolean r11 = r0.isInBoundsX(r10, r9)
            if (r11 != 0) goto L43
            goto L2a
        L43:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r11 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r12 = r9.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r11 = r11.getTransformer(r12)
            android.graphics.Paint r12 = r0.mHighlightPaint
            int r13 = r9.getHighLightColor()
            r12.setColor(r13)
            android.graphics.Paint r12 = r0.mHighlightPaint
            int r9 = r9.getHighLightAlpha()
            r12.setAlpha(r9)
            int r9 = r8.getStackIndex()
            if (r9 < 0) goto L91
            boolean r9 = r10.isStacked()
            if (r9 == 0) goto L91
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r9 = r0.mChart
            boolean r9 = r9.isHighlightFullBarEnabled()
            if (r9 == 0) goto L7d
            float r8 = r10.getPositiveSum()
            float r9 = r10.getNegativeSum()
            float r9 = -r9
            goto L96
        L7d:
            com.github.mikephil.charting.highlight.Range[] r9 = r10.getRanges()
            int r8 = r8.getStackIndex()
            r8 = r9[r8]
            float r9 = r8.from
            float r8 = r8.to
            r22 = r9
            r9 = r8
            r8 = r22
            goto L96
        L91:
            float r8 = r10.getY()
            r9 = 0
        L96:
            float r13 = r3 * r4
            float r13 = r8 - r13
            float r14 = r10.getX()
            float r14 = r14 - r5
            float r10 = r10.getX()
            float r10 = r10 + r5
            android.graphics.RectF r15 = new android.graphics.RectF
            r15.<init>(r13, r14, r8, r10)
            com.github.mikephil.charting.animation.ChartAnimator r13 = r0.mAnimator
            float r13 = r13.getPhaseY()
            r11.rectToPixelPhase(r15, r13)
            android.graphics.Path r13 = new android.graphics.Path
            r13.<init>()
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r16 = 0
            r12 = 1127481344(0x43340000, float:180.0)
            r1 = 1
            r13.arcTo(r15, r4, r12, r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r9, r14, r8, r10)
            com.github.mikephil.charting.animation.ChartAnimator r4 = r0.mAnimator
            float r4 = r4.getPhaseY()
            r11.rectToPixelPhase(r1, r4)
            float r8 = r8 - r3
            int r4 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r4 >= 0) goto Lff
            float r4 = r15.centerX()
            float r8 = r15.bottom
            r13.lineTo(r4, r8)
            android.graphics.Path r16 = new android.graphics.Path
            r16.<init>()
            float r4 = r1.left
            float r8 = r1.top
            float r9 = r1.right
            float r1 = r1.bottom
            android.graphics.Path$Direction r21 = android.graphics.Path.Direction.CW
            r20 = r1
            r17 = r4
            r18 = r8
            r19 = r9
            r16.addRect(r17, r18, r19, r20, r21)
            r1 = r16
            android.graphics.Path$Op r4 = android.graphics.Path.Op.INTERSECT
            r13.op(r1, r4)
            goto L11f
        Lff:
            float r4 = r15.centerX()
            float r8 = r15.bottom
            r13.moveTo(r4, r8)
            float r4 = r1.left
            float r8 = r15.bottom
            r13.lineTo(r4, r8)
            float r1 = r1.left
            float r4 = r15.top
            r13.lineTo(r1, r4)
            float r1 = r15.centerX()
            float r4 = r15.top
            r13.lineTo(r1, r4)
        L11f:
            android.graphics.Paint r1 = r0.mHighlightPaint
            r4 = r24
            r4.drawPath(r13, r1)
        L126:
            int r7 = r7 + 1
            r1 = r25
            r4 = 1073741824(0x40000000, float:2.0)
            goto L14
        L12e:
            return
    }
}

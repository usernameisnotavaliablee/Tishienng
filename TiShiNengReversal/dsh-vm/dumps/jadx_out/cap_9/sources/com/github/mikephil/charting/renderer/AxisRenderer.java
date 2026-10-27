package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AxisRenderer extends com.github.mikephil.charting.renderer.Renderer {
    protected com.github.mikephil.charting.components.AxisBase mAxis;
    protected android.graphics.Paint mAxisLabelPaint;
    protected android.graphics.Paint mAxisLinePaint;
    protected android.graphics.Paint mGridPaint;
    protected android.graphics.Paint mLimitLinePaint;
    protected com.github.mikephil.charting.utils.Transformer mTrans;

    public AxisRenderer(com.github.mikephil.charting.utils.ViewPortHandler r3, com.github.mikephil.charting.utils.Transformer r4, com.github.mikephil.charting.components.AxisBase r5) {
            r2 = this;
            r2.<init>(r3)
            r2.mTrans = r4
            r2.mAxis = r5
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r2.mViewPortHandler
            if (r3 == 0) goto L55
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 1
            r3.<init>(r4)
            r2.mAxisLabelPaint = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r2.mGridPaint = r3
            r5 = -7829368(0xffffffffff888888, float:NaN)
            r3.setColor(r5)
            android.graphics.Paint r3 = r2.mGridPaint
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.setStrokeWidth(r5)
            android.graphics.Paint r3 = r2.mGridPaint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            android.graphics.Paint r3 = r2.mGridPaint
            r1 = 90
            r3.setAlpha(r1)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r2.mAxisLinePaint = r3
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r1)
            android.graphics.Paint r3 = r2.mAxisLinePaint
            r3.setStrokeWidth(r5)
            android.graphics.Paint r3 = r2.mAxisLinePaint
            r3.setStyle(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r2.mLimitLinePaint = r3
            r3.setStyle(r0)
        L55:
            return
    }

    public void computeAxis(float r3, float r4, boolean r5) {
            r2 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            if (r0 == 0) goto L51
            float r0 = r0.contentWidth()
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L51
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            boolean r0 = r0.isFullyZoomedOutY()
            if (r0 != 0) goto L51
            com.github.mikephil.charting.utils.Transformer r3 = r2.mTrans
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r2.mViewPortHandler
            float r4 = r4.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentTop()
            com.github.mikephil.charting.utils.MPPointD r3 = r3.getValuesByTouchPoint(r4, r0)
            com.github.mikephil.charting.utils.Transformer r4 = r2.mTrans
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            float r0 = r0.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.contentBottom()
            com.github.mikephil.charting.utils.MPPointD r4 = r4.getValuesByTouchPoint(r0, r1)
            if (r5 != 0) goto L43
            double r0 = r4.y
            float r5 = (float) r0
            double r0 = r3.y
        L41:
            float r0 = (float) r0
            goto L49
        L43:
            double r0 = r3.y
            float r5 = (float) r0
            double r0 = r4.y
            goto L41
        L49:
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r3)
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r4)
            r3 = r5
            r4 = r0
        L51:
            r2.computeAxisValues(r3, r4)
            return
    }

    protected void computeAxisValues(float r18, float r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            com.github.mikephil.charting.components.AxisBase r3 = r0.mAxis
            int r3 = r3.getLabelCount()
            float r4 = r2 - r1
            float r4 = java.lang.Math.abs(r4)
            double r4 = (double) r4
            r6 = 0
            if (r3 == 0) goto L128
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L128
            boolean r9 = java.lang.Double.isInfinite(r4)
            if (r9 == 0) goto L24
            goto L128
        L24:
            double r9 = (double) r3
            double r9 = r4 / r9
            float r9 = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(r9)
            double r9 = (double) r9
            com.github.mikephil.charting.components.AxisBase r11 = r0.mAxis
            boolean r11 = r11.isGranularityEnabled()
            if (r11 == 0) goto L46
            com.github.mikephil.charting.components.AxisBase r11 = r0.mAxis
            float r11 = r11.getGranularity()
            double r11 = (double) r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L46
            com.github.mikephil.charting.components.AxisBase r9 = r0.mAxis
            float r9 = r9.getGranularity()
            double r9 = (double) r9
        L46:
            double r11 = java.lang.Math.log10(r9)
            int r11 = (int) r11
            double r11 = (double) r11
            r13 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r11 = java.lang.Math.pow(r13, r11)
            float r11 = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(r11)
            double r11 = (double) r11
            r15 = r7
            double r7 = r9 / r11
            int r7 = (int) r7
            r8 = 5
            if (r7 <= r8) goto L64
            double r11 = r11 * r13
            double r9 = java.lang.Math.floor(r11)
        L64:
            com.github.mikephil.charting.components.AxisBase r7 = r0.mAxis
            boolean r7 = r7.isCenterAxisLabelsEnabled()
            com.github.mikephil.charting.components.AxisBase r8 = r0.mAxis
            boolean r8 = r8.isForceLabelsEnabled()
            if (r8 == 0) goto L94
            float r2 = (float) r4
            int r4 = r3 + (-1)
            float r4 = (float) r4
            float r2 = r2 / r4
            double r9 = (double) r2
            com.github.mikephil.charting.components.AxisBase r2 = r0.mAxis
            r2.mEntryCount = r3
            float[] r4 = r2.mEntries
            int r4 = r4.length
            if (r4 >= r3) goto L85
            float[] r4 = new float[r3]
            r2.mEntries = r4
        L85:
            r2 = 0
        L86:
            if (r2 >= r3) goto Le7
            com.github.mikephil.charting.components.AxisBase r4 = r0.mAxis
            float[] r4 = r4.mEntries
            r4[r2] = r1
            double r4 = (double) r1
            double r4 = r4 + r9
            float r1 = (float) r4
            int r2 = r2 + 1
            goto L86
        L94:
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 != 0) goto L9a
            r4 = r15
            goto La2
        L9a:
            double r4 = (double) r1
            double r4 = r4 / r9
            double r4 = java.lang.Math.ceil(r4)
            double r4 = r4 * r9
        La2:
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            boolean r1 = r1.isCenterAxisLabelsEnabled()
            if (r1 == 0) goto Lab
            double r4 = r4 - r9
        Lab:
            if (r3 != 0) goto Laf
            r1 = r15
            goto Lbb
        Laf:
            double r1 = (double) r2
            double r1 = r1 / r9
            double r1 = java.lang.Math.floor(r1)
            double r1 = r1 * r9
            double r1 = com.github.mikephil.charting.utils.Utils.nextUp(r1)
        Lbb:
            if (r3 == 0) goto Lc6
            r11 = r4
        Lbe:
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 > 0) goto Lc6
            int r7 = r7 + 1
            double r11 = r11 + r9
            goto Lbe
        Lc6:
            r3 = r7
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            r1.mEntryCount = r3
            float[] r2 = r1.mEntries
            int r2 = r2.length
            if (r2 >= r3) goto Ld4
            float[] r2 = new float[r3]
            r1.mEntries = r2
        Ld4:
            r1 = 0
        Ld5:
            if (r1 >= r3) goto Le7
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 != 0) goto Ldc
            r4 = r15
        Ldc:
            com.github.mikephil.charting.components.AxisBase r2 = r0.mAxis
            float[] r2 = r2.mEntries
            float r7 = (float) r4
            r2[r1] = r7
            double r4 = r4 + r9
            int r1 = r1 + 1
            goto Ld5
        Le7:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lfc
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            double r4 = java.lang.Math.log10(r9)
            double r4 = -r4
            double r4 = java.lang.Math.ceil(r4)
            int r2 = (int) r4
            r1.mDecimals = r2
            goto L100
        Lfc:
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            r1.mDecimals = r6
        L100:
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            boolean r1 = r1.isCenterAxisLabelsEnabled()
            if (r1 == 0) goto L127
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            float[] r2 = r1.mCenteredEntries
            int r2 = r2.length
            if (r2 >= r3) goto L113
            float[] r2 = new float[r3]
            r1.mCenteredEntries = r2
        L113:
            float r1 = (float) r9
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
        L117:
            if (r6 >= r3) goto L127
            com.github.mikephil.charting.components.AxisBase r2 = r0.mAxis
            float[] r4 = r2.mCenteredEntries
            float[] r2 = r2.mEntries
            r2 = r2[r6]
            float r2 = r2 + r1
            r4[r6] = r2
            int r6 = r6 + 1
            goto L117
        L127:
            return
        L128:
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            float[] r2 = new float[r6]
            r1.mEntries = r2
            float[] r2 = new float[r6]
            r1.mCenteredEntries = r2
            r1.mEntryCount = r6
            return
    }

    public android.graphics.Paint getPaintAxisLabels() {
            r1 = this;
            android.graphics.Paint r0 = r1.mAxisLabelPaint
            return r0
    }

    public android.graphics.Paint getPaintAxisLine() {
            r1 = this;
            android.graphics.Paint r0 = r1.mAxisLinePaint
            return r0
    }

    public android.graphics.Paint getPaintGrid() {
            r1 = this;
            android.graphics.Paint r0 = r1.mGridPaint
            return r0
    }

    public com.github.mikephil.charting.utils.Transformer getTransformer() {
            r1 = this;
            com.github.mikephil.charting.utils.Transformer r0 = r1.mTrans
            return r0
    }

    public abstract void renderAxisLabels(android.graphics.Canvas r1);

    public abstract void renderAxisLine(android.graphics.Canvas r1);

    public abstract void renderGridLines(android.graphics.Canvas r1);

    public abstract void renderLimitLines(android.graphics.Canvas r1);
}

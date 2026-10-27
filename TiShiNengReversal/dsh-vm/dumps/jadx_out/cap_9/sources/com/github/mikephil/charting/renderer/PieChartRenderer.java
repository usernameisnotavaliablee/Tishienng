package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PieChartRenderer extends com.github.mikephil.charting.renderer.DataRenderer {
    protected android.graphics.Canvas mBitmapCanvas;
    private android.graphics.RectF mCenterTextLastBounds;
    private java.lang.CharSequence mCenterTextLastValue;
    private android.text.StaticLayout mCenterTextLayout;
    private android.text.TextPaint mCenterTextPaint;
    protected com.github.mikephil.charting.charts.PieChart mChart;
    protected java.lang.ref.WeakReference<android.graphics.Bitmap> mDrawBitmap;
    protected android.graphics.Path mDrawCenterTextPathBuffer;
    protected android.graphics.RectF mDrawHighlightedRectF;
    private android.graphics.Paint mEntryLabelsPaint;
    private android.graphics.Path mHoleCirclePath;
    protected android.graphics.Paint mHolePaint;
    private android.graphics.RectF mInnerRectBuffer;
    private android.graphics.Path mPathBuffer;
    private android.graphics.RectF[] mRectBuffer;
    protected android.graphics.Paint mTransparentCirclePaint;
    protected android.graphics.Paint mValueLinePaint;

    public PieChartRenderer(com.github.mikephil.charting.charts.PieChart r4, com.github.mikephil.charting.animation.ChartAnimator r5, com.github.mikephil.charting.utils.ViewPortHandler r6) {
            r3 = this;
            r3.<init>(r5, r6)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r3.mCenterTextLastBounds = r5
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1 = 3
            android.graphics.RectF[] r1 = new android.graphics.RectF[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r6 = 2
            r1[r6] = r0
            r3.mRectBuffer = r1
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r3.mPathBuffer = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r3.mInnerRectBuffer = r6
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r3.mHoleCirclePath = r6
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r3.mDrawCenterTextPathBuffer = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r3.mDrawHighlightedRectF = r6
            r3.mChart = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r3.mHolePaint = r4
            r6 = -1
            r4.setColor(r6)
            android.graphics.Paint r4 = r3.mHolePaint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r4.setStyle(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r3.mTransparentCirclePaint = r4
            r4.setColor(r6)
            android.graphics.Paint r4 = r3.mTransparentCirclePaint
            r4.setStyle(r0)
            android.graphics.Paint r4 = r3.mTransparentCirclePaint
            r0 = 105(0x69, float:1.47E-43)
            r4.setAlpha(r0)
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r5)
            r3.mCenterTextPaint = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setColor(r0)
            android.text.TextPaint r4 = r3.mCenterTextPaint
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r4.setTextSize(r0)
            android.graphics.Paint r4 = r3.mValuePaint
            r0 = 1095761920(0x41500000, float:13.0)
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r4.setTextSize(r1)
            android.graphics.Paint r4 = r3.mValuePaint
            r4.setColor(r6)
            android.graphics.Paint r4 = r3.mValuePaint
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r1)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r3.mEntryLabelsPaint = r4
            r4.setColor(r6)
            android.graphics.Paint r4 = r3.mEntryLabelsPaint
            r4.setTextAlign(r1)
            android.graphics.Paint r4 = r3.mEntryLabelsPaint
            float r6 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r4.setTextSize(r6)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r3.mValueLinePaint = r4
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r5)
            return
    }

    protected float calculateMinimumRadiusForSpacedSlice(com.github.mikephil.charting.utils.MPPointF r16, float r17, float r18, float r19, float r20, float r21, float r22) {
            r15 = this;
            r0 = r16
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r22 / r1
            float r2 = r21 + r2
            float r3 = r0.x
            float r4 = r21 + r22
            r5 = 1016003125(0x3c8efa35, float:0.017453292)
            float r4 = r4 * r5
            double r6 = (double) r4
            double r8 = java.lang.Math.cos(r6)
            float r4 = (float) r8
            float r4 = r4 * r17
            float r3 = r3 + r4
            float r4 = r0.y
            double r6 = java.lang.Math.sin(r6)
            float r6 = (float) r6
            float r6 = r6 * r17
            float r4 = r4 + r6
            float r6 = r0.x
            float r2 = r2 * r5
            double r7 = (double) r2
            double r9 = java.lang.Math.cos(r7)
            float r2 = (float) r9
            float r2 = r2 * r17
            float r6 = r6 + r2
            float r0 = r0.y
            double r7 = java.lang.Math.sin(r7)
            float r2 = (float) r7
            float r2 = r2 * r17
            float r0 = r0 + r2
            float r2 = r3 - r19
            double r7 = (double) r2
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r7, r9)
            float r2 = r4 - r20
            double r11 = (double) r2
            double r11 = java.lang.Math.pow(r11, r9)
            double r7 = r7 + r11
            double r7 = java.lang.Math.sqrt(r7)
            double r7 = r7 / r9
            r11 = 4640537203540230144(0x4066800000000000, double:180.0)
            r2 = r18
            double r13 = (double) r2
            double r11 = r11 - r13
            double r11 = r11 / r9
            r13 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r11 = r11 * r13
            double r11 = java.lang.Math.tan(r11)
            double r7 = r7 * r11
            float r2 = (float) r7
            float r2 = r17 - r2
            double r7 = (double) r2
            float r3 = r3 + r19
            float r3 = r3 / r1
            float r6 = r6 - r3
            double r2 = (double) r6
            double r2 = java.lang.Math.pow(r2, r9)
            float r4 = r4 + r20
            float r4 = r4 / r1
            float r0 = r0 - r4
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r9)
            double r2 = r2 + r0
            double r0 = java.lang.Math.sqrt(r2)
            double r7 = r7 - r0
            float r0 = (float) r7
            return r0
    }

    protected void drawCenterText(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            java.lang.CharSequence r4 = r2.getCenterText()
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            boolean r2 = r2.isDrawCenterTextEnabled()
            if (r2 == 0) goto L10a
            if (r4 == 0) goto L10a
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r2 = r2.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r3 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r13 = r3.getCenterTextOffset()
            float r3 = r2.x
            float r5 = r13.x
            float r3 = r3 + r5
            float r5 = r2.y
            float r6 = r13.y
            float r5 = r5 + r6
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            boolean r6 = r6.isDrawHoleEnabled()
            r7 = 1120403456(0x42c80000, float:100.0)
            if (r6 == 0) goto L4c
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            boolean r6 = r6.isDrawSlicesUnderHoleEnabled()
            if (r6 != 0) goto L4c
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            float r6 = r6.getRadius()
            com.github.mikephil.charting.charts.PieChart r8 = r0.mChart
            float r8 = r8.getHoleRadius()
            float r8 = r8 / r7
            float r6 = r6 * r8
            goto L52
        L4c:
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            float r6 = r6.getRadius()
        L52:
            android.graphics.RectF[] r8 = r0.mRectBuffer
            r9 = 0
            r14 = r8[r9]
            float r9 = r3 - r6
            r14.left = r9
            float r9 = r5 - r6
            r14.top = r9
            float r3 = r3 + r6
            r14.right = r3
            float r5 = r5 + r6
            r14.bottom = r5
            r3 = 1
            r15 = r8[r3]
            r15.set(r14)
            com.github.mikephil.charting.charts.PieChart r3 = r0.mChart
            float r3 = r3.getCenterTextRadiusPercent()
            float r3 = r3 / r7
            double r5 = (double) r3
            r7 = 0
            r16 = 1073741824(0x40000000, float:2.0)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L98
            float r5 = r15.width()
            float r6 = r15.width()
            float r6 = r6 * r3
            float r5 = r5 - r6
            float r5 = r5 / r16
            float r6 = r15.height()
            float r7 = r15.height()
            float r7 = r7 * r3
            float r6 = r6 - r7
            float r6 = r6 / r16
            r15.inset(r5, r6)
        L98:
            java.lang.CharSequence r3 = r0.mCenterTextLastValue
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto La8
            android.graphics.RectF r3 = r0.mCenterTextLastBounds
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto Ld6
        La8:
            android.graphics.RectF r3 = r0.mCenterTextLastBounds
            r3.set(r15)
            r0.mCenterTextLastValue = r4
            android.graphics.RectF r3 = r0.mCenterTextLastBounds
            float r3 = r3.width()
            android.text.StaticLayout r5 = new android.text.StaticLayout
            int r6 = r4.length()
            android.text.TextPaint r7 = r0.mCenterTextPaint
            double r8 = (double) r3
            double r8 = java.lang.Math.ceil(r8)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = java.lang.Math.max(r8, r10)
            int r8 = (int) r8
            android.text.Layout$Alignment r9 = android.text.Layout.Alignment.ALIGN_CENTER
            r11 = 0
            r12 = 0
            r3 = r5
            r5 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.mCenterTextLayout = r3
        Ld6:
            android.text.StaticLayout r3 = r0.mCenterTextLayout
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r1.save()
            android.graphics.Path r4 = r0.mDrawCenterTextPathBuffer
            r4.reset()
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CW
            r4.addOval(r14, r5)
            r1.clipPath(r4)
            float r4 = r15.left
            float r5 = r15.top
            float r6 = r15.height()
            float r6 = r6 - r3
            float r6 = r6 / r16
            float r5 = r5 + r6
            r1.translate(r4, r5)
            android.text.StaticLayout r3 = r0.mCenterTextLayout
            r3.draw(r1)
            r1.restore()
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r2)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r13)
        L10a:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas r5) {
            r4 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r4.mViewPortHandler
            float r0 = r0.getChartWidth()
            int r0 = (int) r0
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            float r1 = r1.getChartHeight()
            int r1 = (int) r1
            java.lang.ref.WeakReference<android.graphics.Bitmap> r2 = r4.mDrawBitmap
            if (r2 != 0) goto L14
            r2 = 0
            goto L1a
        L14:
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L1a:
            if (r2 == 0) goto L28
            int r3 = r2.getWidth()
            if (r3 != r0) goto L28
            int r3 = r2.getHeight()
            if (r3 == r1) goto L40
        L28:
            if (r0 <= 0) goto L70
            if (r1 <= 0) goto L70
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r4.mDrawBitmap = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r4.mBitmapCanvas = r0
        L40:
            r0 = 0
            r2.eraseColor(r0)
            com.github.mikephil.charting.charts.PieChart r0 = r4.mChart
            com.github.mikephil.charting.data.ChartData r0 = r0.getData()
            com.github.mikephil.charting.data.PieData r0 = (com.github.mikephil.charting.data.PieData) r0
            java.util.List r0 = r0.getDataSets()
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r1
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L54
            int r2 = r1.getEntryCount()
            if (r2 <= 0) goto L54
            r4.drawDataSet(r5, r1)
            goto L54
        L70:
            return
    }

    protected void drawDataSet(android.graphics.Canvas r37, com.github.mikephil.charting.interfaces.datasets.IPieDataSet r38) {
            r36 = this;
            r0 = r36
            r8 = r38
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            float r9 = r1.getRotationAngle()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r10 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r11 = r1.getPhaseY()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            android.graphics.RectF r12 = r1.getCircleBox()
            int r13 = r8.getEntryCount()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            float[] r14 = r1.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r1 = r1.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            float r2 = r2.getRadius()
            com.github.mikephil.charting.charts.PieChart r3 = r0.mChart
            boolean r3 = r3.isDrawHoleEnabled()
            r4 = 1
            if (r3 == 0) goto L46
            com.github.mikephil.charting.charts.PieChart r3 = r0.mChart
            boolean r3 = r3.isDrawSlicesUnderHoleEnabled()
            if (r3 != 0) goto L46
            r16 = 1
            goto L48
        L46:
            r16 = 0
        L48:
            r3 = 1120403456(0x42c80000, float:100.0)
            r17 = 0
            if (r16 == 0) goto L58
            com.github.mikephil.charting.charts.PieChart r5 = r0.mChart
            float r5 = r5.getHoleRadius()
            float r5 = r5 / r3
            float r5 = r5 * r2
            goto L59
        L58:
            r5 = 0
        L59:
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            float r6 = r6.getHoleRadius()
            float r6 = r6 * r2
            float r6 = r6 / r3
            float r3 = r2 - r6
            r18 = 1073741824(0x40000000, float:2.0)
            float r19 = r3 / r18
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            if (r16 == 0) goto L7a
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            boolean r6 = r6.isDrawRoundedSlicesEnabled()
            if (r6 == 0) goto L7a
            r20 = 1
            goto L7c
        L7a:
            r20 = 0
        L7c:
            r6 = 0
            r7 = 0
        L7e:
            if (r6 >= r13) goto L99
            com.github.mikephil.charting.data.Entry r21 = r8.getEntryForIndex(r6)
            com.github.mikephil.charting.data.PieEntry r21 = (com.github.mikephil.charting.data.PieEntry) r21
            float r21 = r21.getY()
            float r21 = java.lang.Math.abs(r21)
            float r22 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 <= 0) goto L96
            int r7 = r7 + 1
        L96:
            int r6 = r6 + 1
            goto L7e
        L99:
            if (r7 > r4) goto L9e
            r21 = 0
            goto La4
        L9e:
            float r6 = r0.getSliceSpace(r8)
            r21 = r6
        La4:
            r6 = 0
            r22 = 0
        La7:
            if (r6 >= r13) goto L305
            r23 = r14[r6]
            com.github.mikephil.charting.data.Entry r24 = r8.getEntryForIndex(r6)
            float r24 = r24.getY()
            float r24 = java.lang.Math.abs(r24)
            float r25 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r24 = (r24 > r25 ? 1 : (r24 == r25 ? 0 : -1))
            if (r24 > 0) goto Lcf
        Lbd:
            float r23 = r23 * r10
            float r22 = r22 + r23
            r15 = r3
            r26 = r5
            r32 = r6
            r27 = r9
            r29 = r10
            r30 = r11
            r9 = r7
            goto L2f4
        Lcf:
            com.github.mikephil.charting.charts.PieChart r15 = r0.mChart
            boolean r15 = r15.needsHighlight(r6)
            if (r15 == 0) goto Lda
            if (r20 != 0) goto Lda
            goto Lbd
        Lda:
            r15 = 1127481344(0x43340000, float:180.0)
            int r24 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r24 <= 0) goto Le9
            int r24 = (r23 > r15 ? 1 : (r23 == r15 ? 0 : -1))
            if (r24 > 0) goto Le9
            r24 = 1
        Le6:
            r26 = 1127481344(0x43340000, float:180.0)
            goto Lec
        Le9:
            r24 = 0
            goto Le6
        Lec:
            android.graphics.Paint r15 = r0.mRenderPaint
            int r4 = r8.getColor(r6)
            r15.setColor(r4)
            r15 = 1016003125(0x3c8efa35, float:0.017453292)
            r4 = 1
            if (r7 != r4) goto Lfe
            r27 = 0
            goto L102
        Lfe:
            float r27 = r2 * r15
            float r27 = r21 / r27
        L102:
            float r28 = r27 / r18
            float r28 = r22 + r28
            float r28 = r28 * r11
            float r4 = r9 + r28
            float r27 = r23 - r27
            float r27 = r27 * r11
            int r28 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r28 >= 0) goto L119
            r15 = 0
            r27 = r5
            r28 = 1016003125(0x3c8efa35, float:0.017453292)
            goto L120
        L119:
            r15 = r27
            r28 = 1016003125(0x3c8efa35, float:0.017453292)
            r27 = r5
        L120:
            android.graphics.Path r5 = r0.mPathBuffer
            r5.reset()
            if (r20 == 0) goto L15c
            float r5 = r1.x
            float r30 = r2 - r19
            r31 = r5
            float r5 = r4 * r28
            r32 = r6
            double r5 = (double) r5
            r33 = r5
            double r5 = java.lang.Math.cos(r33)
            float r5 = (float) r5
            float r5 = r5 * r30
            float r5 = r31 + r5
            float r6 = r1.y
            r31 = r5
            r35 = r6
            double r5 = java.lang.Math.sin(r33)
            float r5 = (float) r5
            float r30 = r30 * r5
            float r6 = r35 + r30
            float r5 = r31 - r19
            r30 = r6
            float r6 = r30 - r19
            r33 = r7
            float r7 = r31 + r19
            float r8 = r30 + r19
            r3.set(r5, r6, r7, r8)
            goto L160
        L15c:
            r32 = r6
            r33 = r7
        L160:
            float r5 = r1.x
            float r6 = r4 * r28
            double r6 = (double) r6
            r8 = r5
            r30 = r6
            double r5 = java.lang.Math.cos(r30)
            float r5 = (float) r5
            float r5 = r5 * r2
            float r5 = r5 + r8
            float r6 = r1.y
            double r7 = java.lang.Math.sin(r30)
            float r7 = (float) r7
            float r7 = r7 * r2
            float r6 = r6 + r7
            r8 = 1135869952(0x43b40000, float:360.0)
            int r30 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r30 < 0) goto L198
            float r7 = r15 % r8
            int r7 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r7 > 0) goto L198
            android.graphics.Path r7 = r0.mPathBuffer
            r31 = 1135869952(0x43b40000, float:360.0)
            float r8 = r1.x
            r34 = r5
            float r5 = r1.y
            r35 = r6
            android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CW
            r7.addCircle(r8, r5, r2, r6)
            goto L1ae
        L198:
            r34 = r5
            r35 = r6
            r31 = 1135869952(0x43b40000, float:360.0)
            if (r20 == 0) goto L1a9
            android.graphics.Path r5 = r0.mPathBuffer
            float r6 = r4 + r26
            r7 = -1020002304(0xffffffffc3340000, float:-180.0)
            r5.arcTo(r3, r6, r7)
        L1a9:
            android.graphics.Path r5 = r0.mPathBuffer
            r5.arcTo(r12, r4, r15)
        L1ae:
            android.graphics.RectF r5 = r0.mInnerRectBuffer
            float r6 = r1.x
            float r7 = r6 - r27
            float r8 = r1.y
            float r0 = r8 - r27
            float r6 = r6 + r27
            float r8 = r8 + r27
            r5.set(r7, r0, r6, r8)
            if (r16 == 0) goto L1c8
            int r0 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r0 > 0) goto L1dd
            if (r24 == 0) goto L1c8
            goto L1dd
        L1c8:
            r0 = r36
            r6 = r4
            r29 = r10
            r30 = r11
            r7 = r15
            r26 = r27
            r4 = r34
            r5 = r35
            r15 = r3
            r27 = r9
            r9 = r33
            goto L2aa
        L1dd:
            if (r24 == 0) goto L202
            r0 = r3
            float r3 = r23 * r11
            r6 = r4
            r29 = r10
            r7 = r15
            r8 = r27
            r4 = r34
            r5 = r35
            r10 = 1
            r15 = r0
            r27 = r9
            r9 = r33
            r0 = r36
            float r3 = r0.calculateMinimumRadiusForSpacedSlice(r1, r2, r3, r4, r5, r6, r7)
            int r4 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r4 >= 0) goto L1fd
            float r3 = -r3
        L1fd:
            float r5 = java.lang.Math.max(r8, r3)
            goto L210
        L202:
            r0 = r36
            r29 = r10
            r7 = r15
            r8 = r27
            r10 = 1
            r15 = r3
            r27 = r9
            r9 = r33
            r5 = r8
        L210:
            if (r9 == r10) goto L21c
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 != 0) goto L217
            goto L21c
        L217:
            float r3 = r5 * r28
            float r3 = r21 / r3
            goto L21d
        L21c:
            r3 = 0
        L21d:
            float r4 = r3 / r18
            float r4 = r22 + r4
            float r4 = r4 * r11
            float r4 = r27 + r4
            float r3 = r23 - r3
            float r3 = r3 * r11
            int r6 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r6 >= 0) goto L22e
            r3 = 0
        L22e:
            float r4 = r4 + r3
            if (r30 < 0) goto L248
            float r6 = r7 % r31
            int r6 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r6 > 0) goto L248
            android.graphics.Path r3 = r0.mPathBuffer
            float r4 = r1.x
            float r6 = r1.y
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CCW
            r3.addCircle(r4, r6, r5, r7)
            r26 = r8
            r30 = r11
            goto L2e2
        L248:
            if (r20 == 0) goto L27e
            float r5 = r1.x
            float r6 = r2 - r19
            float r7 = r4 * r28
            r30 = r11
            double r10 = (double) r7
            r7 = r5
            r24 = r6
            double r5 = java.lang.Math.cos(r10)
            float r5 = (float) r5
            float r6 = r24 * r5
            float r5 = r7 + r6
            float r6 = r1.y
            double r10 = java.lang.Math.sin(r10)
            float r7 = (float) r10
            float r7 = r7 * r24
            float r6 = r6 + r7
            float r7 = r5 - r19
            float r10 = r6 - r19
            float r5 = r5 + r19
            float r6 = r6 + r19
            r15.set(r7, r10, r5, r6)
            android.graphics.Path r5 = r0.mPathBuffer
            r6 = 1127481344(0x43340000, float:180.0)
            r5.arcTo(r15, r4, r6)
            r26 = r8
            goto L2a1
        L27e:
            r30 = r11
            android.graphics.Path r6 = r0.mPathBuffer
            float r7 = r1.x
            float r10 = r4 * r28
            double r10 = (double) r10
            r24 = r7
            r26 = r8
            double r7 = java.lang.Math.cos(r10)
            float r7 = (float) r7
            float r7 = r7 * r5
            float r7 = r24 + r7
            float r8 = r1.y
            double r10 = java.lang.Math.sin(r10)
            float r10 = (float) r10
            float r5 = r5 * r10
            float r8 = r8 + r5
            r6.lineTo(r7, r8)
        L2a1:
            android.graphics.Path r5 = r0.mPathBuffer
            android.graphics.RectF r6 = r0.mInnerRectBuffer
            float r3 = -r3
            r5.arcTo(r6, r4, r3)
            goto L2e2
        L2aa:
            float r3 = r7 % r31
            int r3 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r3 <= 0) goto L2e2
            if (r24 == 0) goto L2d9
            float r3 = r7 / r18
            float r8 = r6 + r3
            float r3 = r23 * r30
            float r3 = r0.calculateMinimumRadiusForSpacedSlice(r1, r2, r3, r4, r5, r6, r7)
            float r4 = r1.x
            float r8 = r8 * r28
            double r5 = (double) r8
            double r7 = java.lang.Math.cos(r5)
            float r7 = (float) r7
            float r7 = r7 * r3
            float r4 = r4 + r7
            float r7 = r1.y
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r3 = r3 * r5
            float r7 = r7 + r3
            android.graphics.Path r3 = r0.mPathBuffer
            r3.lineTo(r4, r7)
            goto L2e2
        L2d9:
            android.graphics.Path r3 = r0.mPathBuffer
            float r4 = r1.x
            float r5 = r1.y
            r3.lineTo(r4, r5)
        L2e2:
            android.graphics.Path r3 = r0.mPathBuffer
            r3.close()
            android.graphics.Canvas r3 = r0.mBitmapCanvas
            android.graphics.Path r4 = r0.mPathBuffer
            android.graphics.Paint r5 = r0.mRenderPaint
            r3.drawPath(r4, r5)
            float r23 = r23 * r29
            float r22 = r22 + r23
        L2f4:
            int r6 = r32 + 1
            r8 = r38
            r7 = r9
            r3 = r15
            r5 = r26
            r9 = r27
            r10 = r29
            r11 = r30
            r4 = 1
            goto La7
        L305:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r1)
            return
    }

    protected void drawEntryLabel(android.graphics.Canvas r2, java.lang.String r3, float r4, float r5) {
            r1 = this;
            android.graphics.Paint r0 = r1.mEntryLabelsPaint
            r2.drawText(r3, r4, r5, r0)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas r4) {
            r3 = this;
            r3.drawHole(r4)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r3.mDrawBitmap
            java.lang.Object r0 = r0.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = 0
            r2 = 0
            r4.drawBitmap(r0, r1, r1, r2)
            r3.drawCenterText(r4)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas r35, com.github.mikephil.charting.highlight.Highlight[] r36) {
            r34 = this;
            r0 = r34
            r8 = r36
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            boolean r1 = r1.isDrawHoleEnabled()
            if (r1 == 0) goto L16
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            boolean r1 = r1.isDrawSlicesUnderHoleEnabled()
            if (r1 != 0) goto L16
            r11 = 1
            goto L17
        L16:
            r11 = 0
        L17:
            if (r11 == 0) goto L22
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            boolean r1 = r1.isDrawRoundedSlicesEnabled()
            if (r1 == 0) goto L22
            return
        L22:
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r12 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r13 = r1.getPhaseY()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            float r14 = r1.getRotationAngle()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            float[] r15 = r1.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            float[] r16 = r1.getAbsoluteAngles()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r1 = r1.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            float r2 = r2.getRadius()
            r3 = 0
            if (r11 == 0) goto L5b
            com.github.mikephil.charting.charts.PieChart r4 = r0.mChart
            float r4 = r4.getHoleRadius()
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            float r4 = r4 * r2
            goto L5c
        L5b:
            r4 = 0
        L5c:
            android.graphics.RectF r5 = r0.mDrawHighlightedRectF
            r5.set(r3, r3, r3, r3)
            r6 = 0
        L62:
            int r7 = r8.length
            if (r6 >= r7) goto L290
            r7 = r8[r6]
            float r7 = r7.getX()
            int r7 = (int) r7
            r35 = 0
            int r3 = r15.length
            if (r7 < r3) goto L7a
        L71:
            r20 = r2
            r10 = r4
            r19 = r5
            r21 = r6
            goto L284
        L7a:
            com.github.mikephil.charting.charts.PieChart r3 = r0.mChart
            com.github.mikephil.charting.data.ChartData r3 = r3.getData()
            com.github.mikephil.charting.data.PieData r3 = (com.github.mikephil.charting.data.PieData) r3
            r17 = r8[r6]
            int r9 = r17.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r3 = r3.getDataSetByIndex(r9)
            if (r3 == 0) goto L71
            boolean r9 = r3.isHighlightEnabled()
            if (r9 != 0) goto L95
            goto L71
        L95:
            int r9 = r3.getEntryCount()
            r8 = 0
            r10 = 0
        L9b:
            if (r10 >= r9) goto Lb6
            com.github.mikephil.charting.data.Entry r18 = r3.getEntryForIndex(r10)
            com.github.mikephil.charting.data.PieEntry r18 = (com.github.mikephil.charting.data.PieEntry) r18
            float r18 = r18.getY()
            float r18 = java.lang.Math.abs(r18)
            float r19 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 <= 0) goto Lb3
            int r8 = r8 + 1
        Lb3:
            int r10 = r10 + 1
            goto L9b
        Lb6:
            if (r7 != 0) goto Lbb
            r9 = 0
        Lb9:
            r10 = 1
            goto Lc2
        Lbb:
            int r9 = r7 + (-1)
            r9 = r16[r9]
            float r9 = r9 * r12
            goto Lb9
        Lc2:
            if (r8 > r10) goto Lc6
            r10 = 0
            goto Lca
        Lc6:
            float r10 = r3.getSliceSpace()
        Lca:
            r18 = r15[r7]
            r19 = r2
            float r2 = r3.getSelectionShift()
            r20 = r4
            float r4 = r19 + r2
            r21 = r6
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            android.graphics.RectF r6 = r6.getCircleBox()
            r5.set(r6)
            float r2 = -r2
            r5.inset(r2, r2)
            int r2 = (r10 > r35 ? 1 : (r10 == r35 ? 0 : -1))
            if (r2 <= 0) goto Lf2
            r2 = 1127481344(0x43340000, float:180.0)
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 > 0) goto Lf2
            r22 = 1
            goto Lf4
        Lf2:
            r22 = 0
        Lf4:
            android.graphics.Paint r2 = r0.mRenderPaint
            int r3 = r3.getColor(r7)
            r2.setColor(r3)
            r23 = 1016003125(0x3c8efa35, float:0.017453292)
            r2 = 1
            if (r8 != r2) goto L105
            r3 = 0
            goto L109
        L105:
            float r3 = r19 * r23
            float r3 = r10 / r3
        L109:
            if (r8 != r2) goto L10d
            r2 = 0
            goto L111
        L10d:
            float r2 = r4 * r23
            float r2 = r10 / r2
        L111:
            r24 = 1073741824(0x40000000, float:2.0)
            float r6 = r3 / r24
            float r6 = r6 + r9
            float r6 = r6 * r13
            float r6 = r6 + r14
            float r3 = r18 - r3
            float r3 = r3 * r13
            int r7 = (r3 > r35 ? 1 : (r3 == r35 ? 0 : -1))
            if (r7 >= 0) goto L123
            r7 = 0
            goto L124
        L123:
            r7 = r3
        L124:
            float r3 = r2 / r24
            float r3 = r3 + r9
            float r3 = r3 * r13
            float r3 = r3 + r14
            float r2 = r18 - r2
            float r2 = r2 * r13
            int r25 = (r2 > r35 ? 1 : (r2 == r35 ? 0 : -1))
            if (r25 >= 0) goto L133
            r2 = 0
        L133:
            r25 = r6
            android.graphics.Path r6 = r0.mPathBuffer
            r6.reset()
            r26 = 1135869952(0x43b40000, float:360.0)
            int r27 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r27 < 0) goto L15a
            float r6 = r7 % r26
            float r28 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r6 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r6 > 0) goto L15a
            android.graphics.Path r2 = r0.mPathBuffer
            float r3 = r1.x
            float r6 = r1.y
            r28 = r7
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r2.addCircle(r3, r6, r4, r7)
            r30 = r9
            r31 = r10
            goto L185
        L15a:
            r28 = r7
            android.graphics.Path r6 = r0.mPathBuffer
            float r7 = r1.x
            r29 = r4
            float r4 = r3 * r23
            r30 = r9
            r31 = r10
            double r9 = (double) r4
            r32 = r9
            double r9 = java.lang.Math.cos(r32)
            float r4 = (float) r9
            float r4 = r4 * r29
            float r7 = r7 + r4
            float r4 = r1.y
            double r9 = java.lang.Math.sin(r32)
            float r9 = (float) r9
            float r9 = r9 * r29
            float r4 = r4 + r9
            r6.moveTo(r7, r4)
            android.graphics.Path r4 = r0.mPathBuffer
            r4.arcTo(r5, r3, r2)
        L185:
            if (r22 == 0) goto L1b2
            float r3 = r18 * r13
            float r2 = r1.x
            float r6 = r25 * r23
            double r6 = (double) r6
            double r9 = java.lang.Math.cos(r6)
            float r4 = (float) r9
            float r4 = r4 * r19
            float r4 = r4 + r2
            float r2 = r1.y
            double r6 = java.lang.Math.sin(r6)
            float r6 = (float) r6
            float r6 = r6 * r19
            float r2 = r2 + r6
            r6 = r5
            r5 = r2
            r2 = r19
            r19 = r6
            r10 = r20
            r6 = r25
            r7 = r28
            r9 = 0
            float r3 = r0.calculateMinimumRadiusForSpacedSlice(r1, r2, r3, r4, r5, r6, r7)
            goto L1bc
        L1b2:
            r2 = r19
            r10 = r20
            r6 = r25
            r9 = 0
            r19 = r5
            r3 = 0
        L1bc:
            android.graphics.RectF r4 = r0.mInnerRectBuffer
            float r5 = r1.x
            float r7 = r5 - r10
            r35 = 0
            float r9 = r1.y
            r20 = r2
            float r2 = r9 - r10
            float r5 = r5 + r10
            float r9 = r9 + r10
            r4.set(r7, r2, r5, r9)
            if (r11 == 0) goto L243
            int r2 = (r10 > r35 ? 1 : (r10 == r35 ? 0 : -1))
            if (r2 > 0) goto L1d7
            if (r22 == 0) goto L243
        L1d7:
            if (r22 == 0) goto L1e4
            int r2 = (r3 > r35 ? 1 : (r3 == r35 ? 0 : -1))
            if (r2 >= 0) goto L1de
            float r3 = -r3
        L1de:
            float r4 = java.lang.Math.max(r10, r3)
        L1e2:
            r2 = 1
            goto L1e6
        L1e4:
            r4 = r10
            goto L1e2
        L1e6:
            if (r8 == r2) goto L1f2
            int r3 = (r4 > r35 ? 1 : (r4 == r35 ? 0 : -1))
            if (r3 != 0) goto L1ed
            goto L1f2
        L1ed:
            float r3 = r4 * r23
            float r3 = r31 / r3
            goto L1f3
        L1f2:
            r3 = 0
        L1f3:
            float r5 = r3 / r24
            float r9 = r30 + r5
            float r9 = r9 * r13
            float r9 = r9 + r14
            float r18 = r18 - r3
            float r3 = r18 * r13
            int r5 = (r3 > r35 ? 1 : (r3 == r35 ? 0 : -1))
            if (r5 >= 0) goto L203
            r3 = 0
        L203:
            float r9 = r9 + r3
            if (r27 < 0) goto L21a
            float r7 = r28 % r26
            float r5 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L21a
            android.graphics.Path r3 = r0.mPathBuffer
            float r5 = r1.x
            float r6 = r1.y
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CCW
            r3.addCircle(r5, r6, r4, r7)
            goto L276
        L21a:
            android.graphics.Path r5 = r0.mPathBuffer
            float r6 = r1.x
            float r7 = r9 * r23
            double r7 = (double) r7
            r18 = r3
            double r2 = java.lang.Math.cos(r7)
            float r2 = (float) r2
            float r2 = r2 * r4
            float r6 = r6 + r2
            float r2 = r1.y
            double r7 = java.lang.Math.sin(r7)
            float r3 = (float) r7
            float r4 = r4 * r3
            float r2 = r2 + r4
            r5.lineTo(r6, r2)
            android.graphics.Path r2 = r0.mPathBuffer
            android.graphics.RectF r3 = r0.mInnerRectBuffer
            r4 = r18
            float r4 = -r4
            r2.arcTo(r3, r9, r4)
            goto L276
        L243:
            float r7 = r28 % r26
            float r2 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L276
            if (r22 == 0) goto L26d
            float r7 = r28 / r24
            float r6 = r6 + r7
            float r2 = r1.x
            float r6 = r6 * r23
            double r4 = (double) r6
            double r6 = java.lang.Math.cos(r4)
            float r6 = (float) r6
            float r6 = r6 * r3
            float r2 = r2 + r6
            float r6 = r1.y
            double r4 = java.lang.Math.sin(r4)
            float r4 = (float) r4
            float r3 = r3 * r4
            float r6 = r6 + r3
            android.graphics.Path r3 = r0.mPathBuffer
            r3.lineTo(r2, r6)
            goto L276
        L26d:
            android.graphics.Path r2 = r0.mPathBuffer
            float r3 = r1.x
            float r4 = r1.y
            r2.lineTo(r3, r4)
        L276:
            android.graphics.Path r2 = r0.mPathBuffer
            r2.close()
            android.graphics.Canvas r2 = r0.mBitmapCanvas
            android.graphics.Path r3 = r0.mPathBuffer
            android.graphics.Paint r4 = r0.mRenderPaint
            r2.drawPath(r3, r4)
        L284:
            int r6 = r21 + 1
            r8 = r36
            r4 = r10
            r5 = r19
            r2 = r20
            r3 = 0
            goto L62
        L290:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r1)
            return
    }

    protected void drawHole(android.graphics.Canvas r8) {
            r7 = this;
            com.github.mikephil.charting.charts.PieChart r8 = r7.mChart
            boolean r8 = r8.isDrawHoleEnabled()
            if (r8 == 0) goto La8
            android.graphics.Canvas r8 = r7.mBitmapCanvas
            if (r8 == 0) goto La8
            com.github.mikephil.charting.charts.PieChart r8 = r7.mChart
            float r8 = r8.getRadius()
            com.github.mikephil.charting.charts.PieChart r0 = r7.mChart
            float r0 = r0.getHoleRadius()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            float r0 = r0 * r8
            com.github.mikephil.charting.charts.PieChart r2 = r7.mChart
            com.github.mikephil.charting.utils.MPPointF r2 = r2.getCenterCircleBox()
            android.graphics.Paint r3 = r7.mHolePaint
            int r3 = r3.getColor()
            int r3 = android.graphics.Color.alpha(r3)
            if (r3 <= 0) goto L3a
            android.graphics.Canvas r3 = r7.mBitmapCanvas
            float r4 = r2.x
            float r5 = r2.y
            android.graphics.Paint r6 = r7.mHolePaint
            r3.drawCircle(r4, r5, r0, r6)
        L3a:
            android.graphics.Paint r3 = r7.mTransparentCirclePaint
            int r3 = r3.getColor()
            int r3 = android.graphics.Color.alpha(r3)
            if (r3 <= 0) goto La5
            com.github.mikephil.charting.charts.PieChart r3 = r7.mChart
            float r3 = r3.getTransparentCircleRadius()
            com.github.mikephil.charting.charts.PieChart r4 = r7.mChart
            float r4 = r4.getHoleRadius()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto La5
            android.graphics.Paint r3 = r7.mTransparentCirclePaint
            int r3 = r3.getAlpha()
            com.github.mikephil.charting.charts.PieChart r4 = r7.mChart
            float r4 = r4.getTransparentCircleRadius()
            float r4 = r4 / r1
            float r8 = r8 * r4
            android.graphics.Paint r1 = r7.mTransparentCirclePaint
            float r4 = (float) r3
            com.github.mikephil.charting.animation.ChartAnimator r5 = r7.mAnimator
            float r5 = r5.getPhaseX()
            float r4 = r4 * r5
            com.github.mikephil.charting.animation.ChartAnimator r5 = r7.mAnimator
            float r5 = r5.getPhaseY()
            float r4 = r4 * r5
            int r4 = (int) r4
            r1.setAlpha(r4)
            android.graphics.Path r1 = r7.mHoleCirclePath
            r1.reset()
            android.graphics.Path r1 = r7.mHoleCirclePath
            float r4 = r2.x
            float r5 = r2.y
            android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CW
            r1.addCircle(r4, r5, r8, r6)
            android.graphics.Path r8 = r7.mHoleCirclePath
            float r1 = r2.x
            float r4 = r2.y
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CCW
            r8.addCircle(r1, r4, r0, r5)
            android.graphics.Canvas r8 = r7.mBitmapCanvas
            android.graphics.Path r0 = r7.mHoleCirclePath
            android.graphics.Paint r1 = r7.mTransparentCirclePaint
            r8.drawPath(r0, r1)
            android.graphics.Paint r8 = r7.mTransparentCirclePaint
            r8.setAlpha(r3)
        La5:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r2)
        La8:
            return
    }

    protected void drawRoundedSlices(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            boolean r1 = r1.isDrawRoundedSlicesEnabled()
            if (r1 != 0) goto Lb
            goto L1d
        Lb:
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            com.github.mikephil.charting.data.PieData r1 = (com.github.mikephil.charting.data.PieData) r1
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r1 = r1.getDataSet()
            boolean r2 = r1.isVisible()
            if (r2 != 0) goto L1e
        L1d:
            return
        L1e:
            com.github.mikephil.charting.animation.ChartAnimator r2 = r0.mAnimator
            float r2 = r2.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r3 = r0.mAnimator
            float r3 = r3.getPhaseY()
            com.github.mikephil.charting.charts.PieChart r4 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r4 = r4.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r5 = r0.mChart
            float r5 = r5.getRadius()
            com.github.mikephil.charting.charts.PieChart r6 = r0.mChart
            float r6 = r6.getHoleRadius()
            float r6 = r6 * r5
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r7
            float r6 = r5 - r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            com.github.mikephil.charting.charts.PieChart r7 = r0.mChart
            float[] r7 = r7.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r8 = r0.mChart
            float r8 = r8.getRotationAngle()
            r9 = 0
        L53:
            int r10 = r1.getEntryCount()
            if (r9 >= r10) goto Lb6
            r10 = r7[r9]
            com.github.mikephil.charting.data.Entry r11 = r1.getEntryForIndex(r9)
            float r11 = r11.getY()
            float r11 = java.lang.Math.abs(r11)
            float r12 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto La8
            float r11 = r5 - r6
            double r11 = (double) r11
            float r13 = r8 + r10
            float r13 = r13 * r3
            double r13 = (double) r13
            double r15 = java.lang.Math.toRadians(r13)
            double r15 = java.lang.Math.cos(r15)
            double r15 = r15 * r11
            r19 = r2
            float r2 = r4.x
            r17 = r3
            double r2 = (double) r2
            double r2 = r2 + r15
            float r2 = (float) r2
            double r13 = java.lang.Math.toRadians(r13)
            double r13 = java.lang.Math.sin(r13)
            double r11 = r11 * r13
            float r3 = r4.y
            double r13 = (double) r3
            double r11 = r11 + r13
            float r3 = (float) r11
            android.graphics.Paint r11 = r0.mRenderPaint
            int r12 = r1.getColor(r9)
            r11.setColor(r12)
            android.graphics.Canvas r11 = r0.mBitmapCanvas
            android.graphics.Paint r12 = r0.mRenderPaint
            r11.drawCircle(r2, r3, r6, r12)
            goto Lac
        La8:
            r19 = r2
            r17 = r3
        Lac:
            float r10 = r10 * r19
            float r8 = r8 + r10
            int r9 = r9 + 1
            r2 = r19
            r3 = r17
            goto L53
        Lb6:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r4)
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
    public void drawValues(android.graphics.Canvas r51) {
            r50 = this;
            r0 = r50
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            com.github.mikephil.charting.utils.MPPointF r7 = r1.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            float r8 = r1.getRadius()
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            float r1 = r1.getRotationAngle()
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            float[] r9 = r2.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            float[] r10 = r2.getAbsoluteAngles()
            com.github.mikephil.charting.animation.ChartAnimator r2 = r0.mAnimator
            float r11 = r2.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r2 = r0.mAnimator
            float r12 = r2.getPhaseY()
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            float r2 = r2.getHoleRadius()
            float r2 = r2 * r8
            r13 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r13
            float r2 = r8 - r2
            r14 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r14
            com.github.mikephil.charting.charts.PieChart r3 = r0.mChart
            float r3 = r3.getHoleRadius()
            float r15 = r3 / r13
            r3 = 1092616192(0x41200000, float:10.0)
            float r3 = r8 / r3
            r4 = 1080452710(0x40666666, float:3.6)
            float r3 = r3 * r4
            com.github.mikephil.charting.charts.PieChart r4 = r0.mChart
            boolean r4 = r4.isDrawHoleEnabled()
            if (r4 == 0) goto L81
            float r3 = r8 * r15
            float r3 = r8 - r3
            float r3 = r3 / r14
            com.github.mikephil.charting.charts.PieChart r4 = r0.mChart
            boolean r4 = r4.isDrawSlicesUnderHoleEnabled()
            if (r4 != 0) goto L81
            com.github.mikephil.charting.charts.PieChart r4 = r0.mChart
            boolean r4 = r4.isDrawRoundedSlicesEnabled()
            if (r4 == 0) goto L81
            double r4 = (double) r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 * r1
            double r1 = (double) r2
            r16 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r18 = 1120403456(0x42c80000, float:100.0)
            r19 = 1073741824(0x40000000, float:2.0)
            double r13 = (double) r8
            double r13 = r13 * r16
            double r1 = r1 / r13
            double r4 = r4 + r1
            float r1 = (float) r4
        L7f:
            r13 = r1
            goto L86
        L81:
            r18 = 1120403456(0x42c80000, float:100.0)
            r19 = 1073741824(0x40000000, float:2.0)
            goto L7f
        L86:
            float r14 = r8 - r3
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            r16 = r1
            com.github.mikephil.charting.data.PieData r16 = (com.github.mikephil.charting.data.PieData) r16
            java.util.List r1 = r16.getDataSets()
            float r17 = r16.getYValueSum()
            com.github.mikephil.charting.charts.PieChart r2 = r0.mChart
            boolean r20 = r2.isDrawEntryLabelsEnabled()
            r51.save()
            r2 = 1084227584(0x40a00000, float:5.0)
            float r21 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r22 = 0
            r2 = 0
            r3 = 0
        Lad:
            int r4 = r1.size()
            if (r2 >= r4) goto L3b7
            java.lang.Object r4 = r1.get(r2)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r4
            boolean r23 = r4.isDrawValuesEnabled()
            if (r23 != 0) goto Lcf
            if (r20 != 0) goto Lcf
            r24 = r1
            r25 = r2
            r28 = r8
            r31 = r9
            r33 = r10
            r45 = r11
            goto L3a7
        Lcf:
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r5 = r4.getXValuePosition()
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r6 = r4.getYValuePosition()
            r0.applyValueTextStyle(r4)
            r24 = r1
            android.graphics.Paint r1 = r0.mValuePaint
            r25 = r2
            java.lang.String r2 = "Q"
            int r1 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r1, r2)
            float r1 = (float) r1
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r26 = r1 + r2
            com.github.mikephil.charting.formatter.ValueFormatter r1 = r4.getValueFormatter()
            int r2 = r4.getEntryCount()
            r27 = r3
            android.graphics.Paint r3 = r0.mValueLinePaint
            r28 = r8
            int r8 = r4.getValueLineColor()
            r3.setColor(r8)
            android.graphics.Paint r3 = r0.mValueLinePaint
            float r8 = r4.getValueLineWidth()
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r8)
            r3.setStrokeWidth(r8)
            float r8 = r0.getSliceSpace(r4)
            com.github.mikephil.charting.utils.MPPointF r3 = r4.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r3 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3)
            r29 = r8
            float r8 = r3.x
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r8)
            r3.x = r8
            float r8 = r3.y
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r8)
            r3.y = r8
            r8 = 0
        L130:
            if (r8 >= r2) goto L39b
            com.github.mikephil.charting.data.Entry r30 = r4.getEntryForIndex(r8)
            r31 = r9
            r9 = r30
            com.github.mikephil.charting.data.PieEntry r9 = (com.github.mikephil.charting.data.PieEntry) r9
            if (r27 != 0) goto L141
            r30 = 0
            goto L147
        L141:
            int r30 = r27 + (-1)
            r30 = r10[r30]
            float r30 = r30 * r11
        L147:
            r32 = r31[r27]
            r33 = 1016003125(0x3c8efa35, float:0.017453292)
            float r34 = r14 * r33
            float r34 = r29 / r34
            float r34 = r34 / r19
            float r32 = r32 - r34
            float r32 = r32 / r19
            float r30 = r30 + r32
            float r30 = r30 * r12
            r32 = r2
            float r2 = r13 + r30
            r30 = r3
            com.github.mikephil.charting.charts.PieChart r3 = r0.mChart
            boolean r3 = r3.isUsePercentValuesEnabled()
            if (r3 == 0) goto L171
            float r3 = r9.getY()
            float r3 = r3 / r17
            float r3 = r3 * r18
            goto L175
        L171:
            float r3 = r9.getY()
        L175:
            java.lang.String r34 = r1.getPieLabel(r3, r9)
            java.lang.String r3 = r9.getLabel()
            r35 = r1
            float r1 = r2 * r33
            r36 = r9
            r33 = r10
            double r9 = (double) r1
            r37 = r9
            double r9 = java.lang.Math.cos(r37)
            float r9 = (float) r9
            r39 = r9
            double r9 = java.lang.Math.sin(r37)
            float r9 = (float) r9
            if (r20 == 0) goto L19c
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r10 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r5 != r10) goto L19c
            r10 = 1
            goto L19d
        L19c:
            r10 = 0
        L19d:
            if (r23 == 0) goto L1a6
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r6 != r1) goto L1a6
            r41 = 1
            goto L1a8
        L1a6:
            r41 = 0
        L1a8:
            if (r20 == 0) goto L1b1
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r5 != r1) goto L1b1
            r42 = 1
            goto L1b3
        L1b1:
            r42 = 0
        L1b3:
            if (r23 == 0) goto L1bc
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r6 != r1) goto L1bc
            r40 = 1
            goto L1be
        L1bc:
            r40 = 0
        L1be:
            if (r10 != 0) goto L1d3
            if (r41 == 0) goto L1c3
            goto L1d3
        L1c3:
            r37 = r5
            r44 = r6
            r45 = r11
            r10 = r30
            r2 = r34
            r11 = r3
            r30 = r9
            r9 = r4
            goto L303
        L1d3:
            float r1 = r4.getValueLinePart1Length()
            float r43 = r4.getValueLinePart2Length()
            float r44 = r4.getValueLinePart1OffsetPercentage()
            float r44 = r44 / r18
            r45 = r1
            com.github.mikephil.charting.charts.PieChart r1 = r0.mChart
            boolean r1 = r1.isDrawHoleEnabled()
            if (r1 == 0) goto L1f4
            float r1 = r28 * r15
            float r46 = r28 - r1
            float r46 = r46 * r44
            float r46 = r46 + r1
            goto L1f6
        L1f4:
            float r46 = r28 * r44
        L1f6:
            boolean r1 = r4.isValueLineVariableLength()
            if (r1 == 0) goto L20d
            float r43 = r43 * r14
            double r37 = java.lang.Math.sin(r37)
            r1 = r5
            r44 = r6
            double r5 = java.lang.Math.abs(r37)
            float r5 = (float) r5
            float r43 = r43 * r5
            goto L212
        L20d:
            r1 = r5
            r44 = r6
            float r43 = r43 * r14
        L212:
            float r5 = r46 * r39
            float r6 = r7.x
            float r5 = r5 + r6
            float r46 = r46 * r9
            r37 = r1
            float r1 = r7.y
            float r46 = r46 + r1
            r38 = 1065353216(0x3f800000, float:1.0)
            float r38 = r45 + r38
            float r38 = r38 * r14
            float r45 = r38 * r39
            float r45 = r45 + r6
            float r38 = r38 * r9
            float r38 = r38 + r1
            double r1 = (double) r2
            r47 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r1 = r1 % r47
            r47 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r6 = (r1 > r47 ? 1 : (r1 == r47 ? 0 : -1))
            if (r6 < 0) goto L25e
            r47 = 4643457506423603200(0x4070e00000000000, double:270.0)
            int r6 = (r1 > r47 ? 1 : (r1 == r47 ? 0 : -1))
            if (r6 > 0) goto L25e
            float r1 = r45 - r43
            android.graphics.Paint r2 = r0.mValuePaint
            android.graphics.Paint$Align r6 = android.graphics.Paint.Align.RIGHT
            r2.setTextAlign(r6)
            if (r10 == 0) goto L257
            android.graphics.Paint r2 = r0.mEntryLabelsPaint
            r2.setTextAlign(r6)
        L257:
            float r2 = r1 - r21
        L259:
            r43 = r1
            r47 = r2
            goto L271
        L25e:
            float r1 = r45 + r43
            android.graphics.Paint r2 = r0.mValuePaint
            android.graphics.Paint$Align r6 = android.graphics.Paint.Align.LEFT
            r2.setTextAlign(r6)
            if (r10 == 0) goto L26e
            android.graphics.Paint r2 = r0.mEntryLabelsPaint
            r2.setTextAlign(r6)
        L26e:
            float r2 = r1 + r21
            goto L259
        L271:
            int r1 = r4.getValueLineColor()
            r2 = 1122867(0x112233, float:1.573472E-39)
            if (r1 == r2) goto L2ab
            boolean r1 = r4.isUsingSliceColorAsValueLineColor()
            if (r1 == 0) goto L289
            android.graphics.Paint r1 = r0.mValueLinePaint
            int r2 = r4.getColor(r8)
            r1.setColor(r2)
        L289:
            android.graphics.Paint r6 = r0.mValueLinePaint
            r1 = r51
            r2 = r5
            r5 = r38
            r38 = r10
            r10 = r30
            r30 = r9
            r9 = r4
            r4 = r45
            r45 = r11
            r11 = r3
            r3 = r46
            r1.drawLine(r2, r3, r4, r5, r6)
            r2 = r4
            r3 = r5
            android.graphics.Paint r6 = r0.mValueLinePaint
            r4 = r43
            r1.drawLine(r2, r3, r4, r5, r6)
            goto L2b7
        L2ab:
            r45 = r11
            r11 = r3
            r3 = r38
            r38 = r10
            r10 = r30
            r30 = r9
            r9 = r4
        L2b7:
            if (r38 == 0) goto L2dc
            if (r41 == 0) goto L2dc
            int r5 = r9.getValueTextColor(r8)
            r1 = r51
            r4 = r3
            r2 = r34
            r3 = r47
            r0.drawValue(r1, r2, r3, r4, r5)
            r49 = r4
            r4 = r3
            r3 = r49
            int r5 = r16.getEntryCount()
            if (r8 >= r5) goto L303
            if (r11 == 0) goto L303
            float r3 = r3 + r26
            r0.drawEntryLabel(r1, r11, r4, r3)
            goto L303
        L2dc:
            r1 = r51
            r2 = r34
            r4 = r47
            if (r38 == 0) goto L2f3
            int r5 = r16.getEntryCount()
            if (r8 >= r5) goto L303
            if (r11 == 0) goto L303
            float r5 = r26 / r19
            float r3 = r3 + r5
            r0.drawEntryLabel(r1, r11, r4, r3)
            goto L303
        L2f3:
            if (r41 == 0) goto L303
            float r5 = r26 / r19
            float r38 = r3 + r5
            int r5 = r9.getValueTextColor(r8)
            r3 = r4
            r4 = r38
            r0.drawValue(r1, r2, r3, r4, r5)
        L303:
            if (r42 != 0) goto L307
            if (r40 == 0) goto L352
        L307:
            float r1 = r14 * r39
            float r3 = r7.x
            float r3 = r3 + r1
            float r1 = r14 * r30
            float r4 = r7.y
            float r4 = r4 + r1
            android.graphics.Paint r1 = r0.mValuePaint
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.CENTER
            r1.setTextAlign(r5)
            if (r42 == 0) goto L333
            if (r40 == 0) goto L333
            int r5 = r9.getValueTextColor(r8)
            r1 = r51
            r0.drawValue(r1, r2, r3, r4, r5)
            int r2 = r16.getEntryCount()
            if (r8 >= r2) goto L352
            if (r11 == 0) goto L352
            float r4 = r4 + r26
            r0.drawEntryLabel(r1, r11, r3, r4)
            goto L352
        L333:
            r1 = r51
            if (r42 == 0) goto L346
            int r2 = r16.getEntryCount()
            if (r8 >= r2) goto L352
            if (r11 == 0) goto L352
            float r2 = r26 / r19
            float r4 = r4 + r2
            r0.drawEntryLabel(r1, r11, r3, r4)
            goto L352
        L346:
            if (r40 == 0) goto L352
            float r5 = r26 / r19
            float r4 = r4 + r5
            int r5 = r9.getValueTextColor(r8)
            r0.drawValue(r1, r2, r3, r4, r5)
        L352:
            android.graphics.drawable.Drawable r0 = r36.getIcon()
            if (r0 == 0) goto L383
            boolean r0 = r9.isDrawIconsEnabled()
            if (r0 == 0) goto L383
            android.graphics.drawable.Drawable r1 = r36.getIcon()
            float r0 = r10.y
            float r2 = r14 + r0
            float r2 = r2 * r39
            float r3 = r7.x
            float r2 = r2 + r3
            float r0 = r0 + r14
            float r0 = r0 * r30
            float r3 = r7.y
            float r0 = r0 + r3
            float r3 = r10.x
            float r0 = r0 + r3
            int r2 = (int) r2
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r51
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
        L383:
            int r27 = r27 + 1
            int r8 = r8 + 1
            r0 = r50
            r4 = r9
            r3 = r10
            r9 = r31
            r2 = r32
            r10 = r33
            r1 = r35
            r5 = r37
            r6 = r44
            r11 = r45
            goto L130
        L39b:
            r31 = r9
            r33 = r10
            r45 = r11
            r10 = r3
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r10)
            r3 = r27
        L3a7:
            int r2 = r25 + 1
            r0 = r50
            r1 = r24
            r8 = r28
            r9 = r31
            r10 = r33
            r11 = r45
            goto Lad
        L3b7:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r7)
            r51.restore()
            return
    }

    public android.text.TextPaint getPaintCenterText() {
            r1 = this;
            android.text.TextPaint r0 = r1.mCenterTextPaint
            return r0
    }

    public android.graphics.Paint getPaintEntryLabels() {
            r1 = this;
            android.graphics.Paint r0 = r1.mEntryLabelsPaint
            return r0
    }

    public android.graphics.Paint getPaintHole() {
            r1 = this;
            android.graphics.Paint r0 = r1.mHolePaint
            return r0
    }

    public android.graphics.Paint getPaintTransparentCircle() {
            r1 = this;
            android.graphics.Paint r0 = r1.mTransparentCirclePaint
            return r0
    }

    protected float getSliceSpace(com.github.mikephil.charting.interfaces.datasets.IPieDataSet r4) {
            r3 = this;
            boolean r0 = r4.isAutomaticallyDisableSliceSpacingEnabled()
            if (r0 != 0) goto Lb
            float r4 = r4.getSliceSpace()
            return r4
        Lb:
            float r0 = r4.getSliceSpace()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.getSmallestContentExtension()
            float r0 = r0 / r1
            float r1 = r4.getYMin()
            com.github.mikephil.charting.charts.PieChart r2 = r3.mChart
            com.github.mikephil.charting.data.ChartData r2 = r2.getData()
            com.github.mikephil.charting.data.PieData r2 = (com.github.mikephil.charting.data.PieData) r2
            float r2 = r2.getYValueSum()
            float r1 = r1 / r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L31
            r4 = 0
            return r4
        L31:
            float r4 = r4.getSliceSpace()
            return r4
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r0 = this;
            return
    }

    public void releaseBitmap() {
            r2 = this;
            android.graphics.Canvas r0 = r2.mBitmapCanvas
            r1 = 0
            if (r0 == 0) goto La
            r0.setBitmap(r1)
            r2.mBitmapCanvas = r1
        La:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r2.mDrawBitmap
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L19
            r0.recycle()
        L19:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r2.mDrawBitmap
            r0.clear()
            r2.mDrawBitmap = r1
        L20:
            return
    }
}

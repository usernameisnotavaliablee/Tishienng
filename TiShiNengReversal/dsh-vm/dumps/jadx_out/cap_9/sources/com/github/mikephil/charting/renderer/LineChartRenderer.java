package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class LineChartRenderer extends com.github.mikephil.charting.renderer.LineRadarRenderer {
    protected android.graphics.Path cubicFillPath;
    protected android.graphics.Path cubicPath;
    protected android.graphics.Canvas mBitmapCanvas;
    protected android.graphics.Bitmap.Config mBitmapConfig;
    protected com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider mChart;
    protected android.graphics.Paint mCirclePaintInner;
    private float[] mCirclesBuffer;
    protected java.lang.ref.WeakReference<android.graphics.Bitmap> mDrawBitmap;
    protected android.graphics.Path mGenerateFilledPathBuffer;
    private java.util.HashMap<com.github.mikephil.charting.interfaces.datasets.IDataSet, com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache> mImageCaches;
    private float[] mLineBuffer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.renderer.LineChartRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode = null;

        static {
                com.github.mikephil.charting.data.LineDataSet$Mode[] r0 = com.github.mikephil.charting.data.LineDataSet.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode = r0
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode     // Catch: java.lang.NoSuchFieldError -> L28
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode     // Catch: java.lang.NoSuchFieldError -> L33
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class DataSetImageCache {
        private android.graphics.Bitmap[] circleBitmaps;
        private android.graphics.Path mCirclePathBuffer;
        final /* synthetic */ com.github.mikephil.charting.renderer.LineChartRenderer this$0;

        private DataSetImageCache(com.github.mikephil.charting.renderer.LineChartRenderer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                android.graphics.Path r1 = new android.graphics.Path
                r1.<init>()
                r0.mCirclePathBuffer = r1
                return
        }

        /* synthetic */ DataSetImageCache(com.github.mikephil.charting.renderer.LineChartRenderer r1, com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        protected void fill(com.github.mikephil.charting.interfaces.datasets.ILineDataSet r10, boolean r11, boolean r12) {
                r9 = this;
                int r0 = r10.getCircleColorCount()
                float r1 = r10.getCircleRadius()
                float r2 = r10.getCircleHoleRadius()
                r3 = 0
            Ld:
                if (r3 >= r0) goto L64
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_4444
                double r5 = (double) r1
                r7 = 4611911198408756429(0x4000cccccccccccd, double:2.1)
                double r5 = r5 * r7
                int r5 = (int) r5
                android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r5, r4)
                android.graphics.Canvas r5 = new android.graphics.Canvas
                r5.<init>(r4)
                android.graphics.Bitmap[] r6 = r9.circleBitmaps
                r6[r3] = r4
                com.github.mikephil.charting.renderer.LineChartRenderer r4 = r9.this$0
                android.graphics.Paint r4 = r4.mRenderPaint
                int r6 = r10.getCircleColor(r3)
                r4.setColor(r6)
                if (r12 == 0) goto L51
                android.graphics.Path r4 = r9.mCirclePathBuffer
                r4.reset()
                android.graphics.Path r4 = r9.mCirclePathBuffer
                android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CW
                r4.addCircle(r1, r1, r1, r6)
                android.graphics.Path r4 = r9.mCirclePathBuffer
                android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CCW
                r4.addCircle(r1, r1, r2, r6)
                android.graphics.Path r4 = r9.mCirclePathBuffer
                com.github.mikephil.charting.renderer.LineChartRenderer r6 = r9.this$0
                android.graphics.Paint r6 = r6.mRenderPaint
                r5.drawPath(r4, r6)
                goto L61
            L51:
                com.github.mikephil.charting.renderer.LineChartRenderer r4 = r9.this$0
                android.graphics.Paint r4 = r4.mRenderPaint
                r5.drawCircle(r1, r1, r1, r4)
                if (r11 == 0) goto L61
                com.github.mikephil.charting.renderer.LineChartRenderer r4 = r9.this$0
                android.graphics.Paint r4 = r4.mCirclePaintInner
                r5.drawCircle(r1, r1, r2, r4)
            L61:
                int r3 = r3 + 1
                goto Ld
            L64:
                return
        }

        protected android.graphics.Bitmap getBitmap(int r3) {
                r2 = this;
                android.graphics.Bitmap[] r0 = r2.circleBitmaps
                int r1 = r0.length
                int r3 = r3 % r1
                r3 = r0[r3]
                return r3
        }

        protected boolean init(com.github.mikephil.charting.interfaces.datasets.ILineDataSet r3) {
                r2 = this;
                int r3 = r3.getCircleColorCount()
                android.graphics.Bitmap[] r0 = r2.circleBitmaps
                r1 = 1
                if (r0 != 0) goto Le
                android.graphics.Bitmap[] r3 = new android.graphics.Bitmap[r3]
                r2.circleBitmaps = r3
                return r1
            Le:
                int r0 = r0.length
                if (r0 == r3) goto L16
                android.graphics.Bitmap[] r3 = new android.graphics.Bitmap[r3]
                r2.circleBitmaps = r3
                return r1
            L16:
                r3 = 0
                return r3
        }
    }

    public LineChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r1, com.github.mikephil.charting.animation.ChartAnimator r2, com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r0 = this;
            r0.<init>(r2, r3)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r0.mBitmapConfig = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0.cubicPath = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0.cubicFillPath = r2
            r2 = 4
            float[] r2 = new float[r2]
            r0.mLineBuffer = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0.mGenerateFilledPathBuffer = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.mImageCaches = r2
            r2 = 2
            float[] r2 = new float[r2]
            r0.mCirclesBuffer = r2
            r0.mChart = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r0.mCirclePaintInner = r1
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.mCirclePaintInner
            r2 = -1
            r1.setColor(r2)
            return
    }

    private void generateFilledPath(com.github.mikephil.charting.interfaces.datasets.ILineDataSet r8, int r9, int r10, android.graphics.Path r11) {
            r7 = this;
            com.github.mikephil.charting.formatter.IFillFormatter r0 = r8.getFillFormatter()
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r1 = r7.mChart
            float r0 = r0.getFillLinePosition(r8, r1)
            com.github.mikephil.charting.animation.ChartAnimator r1 = r7.mAnimator
            float r1 = r1.getPhaseY()
            com.github.mikephil.charting.data.LineDataSet$Mode r2 = r8.getMode()
            com.github.mikephil.charting.data.LineDataSet$Mode r3 = com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED
            r4 = 1
            if (r2 != r3) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r11.reset()
            com.github.mikephil.charting.data.Entry r3 = r8.getEntryForIndex(r9)
            float r5 = r3.getX()
            r11.moveTo(r5, r0)
            float r5 = r3.getX()
            float r6 = r3.getY()
            float r6 = r6 * r1
            r11.lineTo(r5, r6)
            int r9 = r9 + r4
            r4 = 0
        L39:
            if (r9 > r10) goto L5f
            com.github.mikephil.charting.data.Entry r4 = r8.getEntryForIndex(r9)
            if (r2 == 0) goto L4e
            float r5 = r4.getX()
            float r3 = r3.getY()
            float r3 = r3 * r1
            r11.lineTo(r5, r3)
        L4e:
            float r3 = r4.getX()
            float r5 = r4.getY()
            float r5 = r5 * r1
            r11.lineTo(r3, r5)
            int r9 = r9 + 1
            r3 = r4
            goto L39
        L5f:
            if (r4 == 0) goto L68
            float r8 = r4.getX()
            r11.lineTo(r8, r0)
        L68:
            r11.close()
            return
    }

    protected void drawCircles(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            android.graphics.Paint r1 = r0.mRenderPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r1 = r1.getPhaseY()
            float[] r2 = r0.mCirclesBuffer
            r3 = 0
            r4 = 0
            r2[r3] = r4
            r5 = 1
            r2[r5] = r4
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r2 = r0.mChart
            com.github.mikephil.charting.data.LineData r2 = r2.getLineData()
            java.util.List r2 = r2.getDataSets()
            r6 = 0
        L23:
            int r7 = r2.size()
            if (r6 >= r7) goto L11a
            java.lang.Object r7 = r2.get(r6)
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet r7 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) r7
            boolean r8 = r7.isVisible()
            if (r8 == 0) goto L41
            boolean r8 = r7.isDrawCirclesEnabled()
            if (r8 == 0) goto L41
            int r8 = r7.getEntryCount()
            if (r8 != 0) goto L45
        L41:
            r4 = r18
            goto L114
        L45:
            android.graphics.Paint r8 = r0.mCirclePaintInner
            int r9 = r7.getCircleHoleColor()
            r8.setColor(r9)
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r8 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r9 = r7.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r8 = r8.getTransformer(r9)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r9 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r10 = r0.mChart
            r9.set(r10, r7)
            float r9 = r7.getCircleRadius()
            float r10 = r7.getCircleHoleRadius()
            boolean r11 = r7.isDrawCircleHoleEnabled()
            if (r11 == 0) goto L77
            int r11 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r11 >= 0) goto L77
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 <= 0) goto L77
            r10 = 1
            goto L78
        L77:
            r10 = 0
        L78:
            if (r10 == 0) goto L85
            int r11 = r7.getCircleHoleColor()
            r12 = 1122867(0x112233, float:1.573472E-39)
            if (r11 != r12) goto L85
            r11 = 1
            goto L86
        L85:
            r11 = 0
        L86:
            java.util.HashMap<com.github.mikephil.charting.interfaces.datasets.IDataSet, com.github.mikephil.charting.renderer.LineChartRenderer$DataSetImageCache> r12 = r0.mImageCaches
            boolean r12 = r12.containsKey(r7)
            r13 = 0
            if (r12 == 0) goto L98
            java.util.HashMap<com.github.mikephil.charting.interfaces.datasets.IDataSet, com.github.mikephil.charting.renderer.LineChartRenderer$DataSetImageCache> r12 = r0.mImageCaches
            java.lang.Object r12 = r12.get(r7)
            com.github.mikephil.charting.renderer.LineChartRenderer$DataSetImageCache r12 = (com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache) r12
            goto La2
        L98:
            com.github.mikephil.charting.renderer.LineChartRenderer$DataSetImageCache r12 = new com.github.mikephil.charting.renderer.LineChartRenderer$DataSetImageCache
            r12.<init>(r0, r13)
            java.util.HashMap<com.github.mikephil.charting.interfaces.datasets.IDataSet, com.github.mikephil.charting.renderer.LineChartRenderer$DataSetImageCache> r14 = r0.mImageCaches
            r14.put(r7, r12)
        La2:
            boolean r14 = r12.init(r7)
            if (r14 == 0) goto Lab
            r12.fill(r7, r10, r11)
        Lab:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r10 = r0.mXBounds
            int r11 = r10.range
            int r10 = r10.min
            int r11 = r11 + r10
        Lb2:
            if (r10 > r11) goto L41
            com.github.mikephil.charting.data.Entry r14 = r7.getEntryForIndex(r10)
            if (r14 != 0) goto Lbb
            goto L41
        Lbb:
            float[] r15 = r0.mCirclesBuffer
            float r16 = r14.getX()
            r15[r3] = r16
            float[] r15 = r0.mCirclesBuffer
            float r14 = r14.getY()
            float r14 = r14 * r1
            r15[r5] = r14
            float[] r14 = r0.mCirclesBuffer
            r8.pointValuesToPixel(r14)
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r0.mViewPortHandler
            float[] r15 = r0.mCirclesBuffer
            r15 = r15[r3]
            boolean r14 = r14.isInBoundsRight(r15)
            if (r14 != 0) goto Le0
            goto L41
        Le0:
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r0.mViewPortHandler
            float[] r15 = r0.mCirclesBuffer
            r15 = r15[r3]
            boolean r14 = r14.isInBoundsLeft(r15)
            if (r14 == 0) goto Lf8
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r0.mViewPortHandler
            float[] r15 = r0.mCirclesBuffer
            r15 = r15[r5]
            boolean r14 = r14.isInBoundsY(r15)
            if (r14 != 0) goto Lfb
        Lf8:
            r4 = r18
            goto L10f
        Lfb:
            android.graphics.Bitmap r14 = r12.getBitmap(r10)
            if (r14 == 0) goto Lf8
            float[] r15 = r0.mCirclesBuffer
            r16 = r15[r3]
            float r3 = r16 - r9
            r15 = r15[r5]
            float r15 = r15 - r9
            r4 = r18
            r4.drawBitmap(r14, r3, r15, r13)
        L10f:
            int r10 = r10 + 1
            r3 = 0
            r4 = 0
            goto Lb2
        L114:
            int r6 = r6 + 1
            r3 = 0
            r4 = 0
            goto L23
        L11a:
            return
    }

    protected void drawCubicBezier(com.github.mikephil.charting.interfaces.datasets.ILineDataSet r22) {
            r21 = this;
            r0 = r21
            r2 = r22
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r1 = r1.getPhaseY()
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r3 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r4 = r2.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r4 = r3.getTransformer(r4)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r3 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r5 = r0.mChart
            r3.set(r5, r2)
            float r3 = r2.getCubicIntensity()
            android.graphics.Path r5 = r0.cubicPath
            r5.reset()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r5 = r0.mXBounds
            int r6 = r5.range
            r7 = 1
            if (r6 < r7) goto Ld3
            int r5 = r5.min
            int r6 = r5 + (-1)
            r8 = 0
            int r6 = java.lang.Math.max(r6, r8)
            com.github.mikephil.charting.data.Entry r6 = r2.getEntryForIndex(r6)
            int r5 = java.lang.Math.max(r5, r8)
            com.github.mikephil.charting.data.Entry r5 = r2.getEntryForIndex(r5)
            if (r5 != 0) goto L43
            return
        L43:
            android.graphics.Path r8 = r0.cubicPath
            float r9 = r5.getX()
            float r10 = r5.getY()
            float r10 = r10 * r1
            r8.moveTo(r9, r10)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r8 = r0.mXBounds
            int r8 = r8.min
            int r8 = r8 + r7
            r7 = -1
            r7 = r5
            r9 = r8
            r8 = -1
        L5b:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r10 = r0.mXBounds
            int r11 = r10.range
            int r10 = r10.min
            int r11 = r11 + r10
            if (r9 > r11) goto Ld3
            if (r8 != r9) goto L67
            goto L6b
        L67:
            com.github.mikephil.charting.data.Entry r5 = r2.getEntryForIndex(r9)
        L6b:
            int r8 = r9 + 1
            int r10 = r2.getEntryCount()
            if (r8 >= r10) goto L74
            r9 = r8
        L74:
            com.github.mikephil.charting.data.Entry r10 = r2.getEntryForIndex(r9)
            float r11 = r5.getX()
            float r12 = r6.getX()
            float r11 = r11 - r12
            float r11 = r11 * r3
            float r12 = r5.getY()
            float r6 = r6.getY()
            float r12 = r12 - r6
            float r12 = r12 * r3
            float r6 = r10.getX()
            float r13 = r7.getX()
            float r6 = r6 - r13
            float r6 = r6 * r3
            float r13 = r10.getY()
            float r14 = r7.getY()
            float r13 = r13 - r14
            float r13 = r13 * r3
            android.graphics.Path r14 = r0.cubicPath
            float r15 = r7.getX()
            float r15 = r15 + r11
            float r11 = r7.getY()
            float r11 = r11 + r12
            float r16 = r11 * r1
            float r11 = r5.getX()
            float r17 = r11 - r6
            float r6 = r5.getY()
            float r6 = r6 - r13
            float r18 = r6 * r1
            float r19 = r5.getX()
            float r6 = r5.getY()
            float r20 = r6 * r1
            r14.cubicTo(r15, r16, r17, r18, r19, r20)
            r6 = r9
            r9 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            r5 = r10
            goto L5b
        Ld3:
            boolean r1 = r2.isDrawFilledEnabled()
            if (r1 == 0) goto Lee
            android.graphics.Path r1 = r0.cubicFillPath
            r1.reset()
            android.graphics.Path r1 = r0.cubicFillPath
            android.graphics.Path r3 = r0.cubicPath
            r1.addPath(r3)
            android.graphics.Canvas r1 = r0.mBitmapCanvas
            android.graphics.Path r3 = r0.cubicFillPath
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r5 = r0.mXBounds
            r0.drawCubicFill(r1, r2, r3, r4, r5)
        Lee:
            android.graphics.Paint r1 = r0.mRenderPaint
            int r2 = r22.getColor()
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.mRenderPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Path r1 = r0.cubicPath
            r4.pathValueToPixel(r1)
            android.graphics.Canvas r1 = r0.mBitmapCanvas
            android.graphics.Path r2 = r0.cubicPath
            android.graphics.Paint r3 = r0.mRenderPaint
            r1.drawPath(r2, r3)
            android.graphics.Paint r1 = r0.mRenderPaint
            r2 = 0
            r1.setPathEffect(r2)
            return
    }

    protected void drawCubicFill(android.graphics.Canvas r4, com.github.mikephil.charting.interfaces.datasets.ILineDataSet r5, android.graphics.Path r6, com.github.mikephil.charting.utils.Transformer r7, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds r8) {
            r3 = this;
            com.github.mikephil.charting.formatter.IFillFormatter r0 = r5.getFillFormatter()
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r1 = r3.mChart
            float r0 = r0.getFillLinePosition(r5, r1)
            int r1 = r8.min
            int r2 = r8.range
            int r1 = r1 + r2
            com.github.mikephil.charting.data.Entry r1 = r5.getEntryForIndex(r1)
            float r1 = r1.getX()
            r6.lineTo(r1, r0)
            int r8 = r8.min
            com.github.mikephil.charting.data.Entry r8 = r5.getEntryForIndex(r8)
            float r8 = r8.getX()
            r6.lineTo(r8, r0)
            r6.close()
            r7.pathValueToPixel(r6)
            android.graphics.drawable.Drawable r7 = r5.getFillDrawable()
            if (r7 == 0) goto L37
            r3.drawFilledPath(r4, r6, r7)
            return
        L37:
            int r7 = r5.getFillColor()
            int r5 = r5.getFillAlpha()
            r3.drawFilledPath(r4, r6, r7, r5)
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
            if (r0 <= 0) goto L6e
            if (r1 <= 0) goto L6e
            android.graphics.Bitmap$Config r2 = r4.mBitmapConfig
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
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r0 = r4.mChart
            com.github.mikephil.charting.data.LineData r0 = r0.getLineData()
            java.util.List r0 = r0.getDataSets()
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) r1
            boolean r3 = r1.isVisible()
            if (r3 == 0) goto L52
            r4.drawDataSet(r5, r1)
            goto L52
        L68:
            android.graphics.Paint r0 = r4.mRenderPaint
            r1 = 0
            r5.drawBitmap(r2, r1, r1, r0)
        L6e:
            return
    }

    protected void drawDataSet(android.graphics.Canvas r3, com.github.mikephil.charting.interfaces.datasets.ILineDataSet r4) {
            r2 = this;
            int r0 = r4.getEntryCount()
            r1 = 1
            if (r0 >= r1) goto L8
            return
        L8:
            android.graphics.Paint r0 = r2.mRenderPaint
            float r1 = r4.getLineWidth()
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.mRenderPaint
            android.graphics.DashPathEffect r1 = r4.getDashPathEffect()
            r0.setPathEffect(r1)
            int[] r0 = com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode
            com.github.mikephil.charting.data.LineDataSet$Mode r1 = r4.getMode()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L34
            r1 = 4
            if (r0 == r1) goto L30
            r2.drawLinear(r3, r4)
            goto L37
        L30:
            r2.drawHorizontalBezier(r4)
            goto L37
        L34:
            r2.drawCubicBezier(r4)
        L37:
            android.graphics.Paint r3 = r2.mRenderPaint
            r4 = 0
            r3.setPathEffect(r4)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas r1) {
            r0 = this;
            r0.drawCircles(r1)
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas r10, com.github.mikephil.charting.highlight.Highlight[] r11) {
            r9 = this;
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r0 = r9.mChart
            com.github.mikephil.charting.data.LineData r0 = r0.getLineData()
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L65
            r3 = r11[r2]
            int r4 = r3.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r4 = r0.getDataSetByIndex(r4)
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) r4
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
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r6 = r9.mChart
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

    protected void drawHorizontalBezier(com.github.mikephil.charting.interfaces.datasets.ILineDataSet r17) {
            r16 = this;
            r0 = r16
            r2 = r17
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r1 = r1.getPhaseY()
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r3 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r4 = r2.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r4 = r3.getTransformer(r4)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r3 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r5 = r0.mChart
            r3.set(r5, r2)
            android.graphics.Path r3 = r0.cubicPath
            r3.reset()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r3 = r0.mXBounds
            int r5 = r3.range
            r6 = 1
            if (r5 < r6) goto L80
            int r3 = r3.min
            com.github.mikephil.charting.data.Entry r3 = r2.getEntryForIndex(r3)
            android.graphics.Path r5 = r0.cubicPath
            float r7 = r3.getX()
            float r8 = r3.getY()
            float r8 = r8 * r1
            r5.moveTo(r7, r8)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r5 = r0.mXBounds
            int r5 = r5.min
            int r5 = r5 + r6
        L41:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r6 = r0.mXBounds
            int r7 = r6.range
            int r6 = r6.min
            int r7 = r7 + r6
            if (r5 > r7) goto L80
            com.github.mikephil.charting.data.Entry r6 = r2.getEntryForIndex(r5)
            float r7 = r3.getX()
            float r8 = r6.getX()
            float r9 = r3.getX()
            float r8 = r8 - r9
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            float r10 = r7 + r8
            android.graphics.Path r9 = r0.cubicPath
            float r3 = r3.getY()
            float r11 = r3 * r1
            float r3 = r6.getY()
            float r13 = r3 * r1
            float r14 = r6.getX()
            float r3 = r6.getY()
            float r15 = r3 * r1
            r12 = r10
            r9.cubicTo(r10, r11, r12, r13, r14, r15)
            int r5 = r5 + 1
            r3 = r6
            goto L41
        L80:
            boolean r1 = r2.isDrawFilledEnabled()
            if (r1 == 0) goto L9b
            android.graphics.Path r1 = r0.cubicFillPath
            r1.reset()
            android.graphics.Path r1 = r0.cubicFillPath
            android.graphics.Path r3 = r0.cubicPath
            r1.addPath(r3)
            android.graphics.Canvas r1 = r0.mBitmapCanvas
            android.graphics.Path r3 = r0.cubicFillPath
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r5 = r0.mXBounds
            r0.drawCubicFill(r1, r2, r3, r4, r5)
        L9b:
            android.graphics.Paint r1 = r0.mRenderPaint
            int r2 = r17.getColor()
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.mRenderPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Path r1 = r0.cubicPath
            r4.pathValueToPixel(r1)
            android.graphics.Canvas r1 = r0.mBitmapCanvas
            android.graphics.Path r2 = r0.cubicPath
            android.graphics.Paint r3 = r0.mRenderPaint
            r1.drawPath(r2, r3)
            android.graphics.Paint r1 = r0.mRenderPaint
            r2 = 0
            r1.setPathEffect(r2)
            return
    }

    protected void drawLinear(android.graphics.Canvas r19, com.github.mikephil.charting.interfaces.datasets.ILineDataSet r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            int r2 = r1.getEntryCount()
            com.github.mikephil.charting.data.LineDataSet$Mode r3 = r1.getMode()
            com.github.mikephil.charting.data.LineDataSet$Mode r4 = com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            r4 = 4
            r7 = 2
            if (r3 == 0) goto L1b
            r8 = 4
            goto L1c
        L1b:
            r8 = 2
        L1c:
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r9 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r10 = r1.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r9 = r9.getTransformer(r10)
            com.github.mikephil.charting.animation.ChartAnimator r10 = r0.mAnimator
            float r10 = r10.getPhaseY()
            android.graphics.Paint r11 = r0.mRenderPaint
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.STROKE
            r11.setStyle(r12)
            boolean r11 = r1.isDashedLineEnabled()
            if (r11 == 0) goto L3c
            android.graphics.Canvas r11 = r0.mBitmapCanvas
            goto L3e
        L3c:
            r11 = r19
        L3e:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r12 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r13 = r0.mChart
            r12.set(r13, r1)
            boolean r12 = r1.isDrawFilledEnabled()
            if (r12 == 0) goto L54
            if (r2 <= 0) goto L54
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r12 = r0.mXBounds
            r13 = r19
            r0.drawLinearFill(r13, r1, r9, r12)
        L54:
            java.util.List r12 = r1.getColors()
            int r12 = r12.size()
            if (r12 <= r6) goto L138
            float[] r2 = r0.mLineBuffer
            int r2 = r2.length
            int r12 = r8 * 2
            if (r2 > r12) goto L6b
            int r8 = r8 * 4
            float[] r2 = new float[r8]
            r0.mLineBuffer = r2
        L6b:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.min
        L6f:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r8 = r0.mXBounds
            int r13 = r8.range
            int r8 = r8.min
            int r13 = r13 + r8
            if (r2 > r13) goto L1fc
            com.github.mikephil.charting.data.Entry r8 = r1.getEntryForIndex(r2)
            if (r8 != 0) goto L80
            goto L134
        L80:
            float[] r13 = r0.mLineBuffer
            float r14 = r8.getX()
            r13[r5] = r14
            float[] r13 = r0.mLineBuffer
            float r8 = r8.getY()
            float r8 = r8 * r10
            r13[r6] = r8
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r8 = r0.mXBounds
            int r8 = r8.max
            r13 = 3
            if (r2 >= r8) goto Le2
            int r8 = r2 + 1
            com.github.mikephil.charting.data.Entry r8 = r1.getEntryForIndex(r8)
            if (r8 != 0) goto La3
            goto L1fc
        La3:
            if (r3 == 0) goto Lcf
            float[] r14 = r0.mLineBuffer
            float r15 = r8.getX()
            r14[r7] = r15
            float[] r14 = r0.mLineBuffer
            r15 = r14[r6]
            r14[r13] = r15
            r16 = r14[r7]
            r14[r4] = r16
            r16 = 5
            r14[r16] = r15
            float r15 = r8.getX()
            r16 = 6
            r14[r16] = r15
            float[] r14 = r0.mLineBuffer
            float r8 = r8.getY()
            float r8 = r8 * r10
            r15 = 7
            r14[r15] = r8
            goto Lec
        Lcf:
            float[] r14 = r0.mLineBuffer
            float r15 = r8.getX()
            r14[r7] = r15
            float[] r14 = r0.mLineBuffer
            float r8 = r8.getY()
            float r8 = r8 * r10
            r14[r13] = r8
            goto Lec
        Le2:
            float[] r8 = r0.mLineBuffer
            r14 = r8[r5]
            r8[r7] = r14
            r14 = r8[r6]
            r8[r13] = r14
        Lec:
            float[] r8 = r0.mLineBuffer
            r9.pointValuesToPixel(r8)
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r0.mViewPortHandler
            float[] r14 = r0.mLineBuffer
            r14 = r14[r5]
            boolean r8 = r8.isInBoundsRight(r14)
            if (r8 != 0) goto Lff
            goto L1fc
        Lff:
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r0.mViewPortHandler
            float[] r14 = r0.mLineBuffer
            r14 = r14[r7]
            boolean r8 = r8.isInBoundsLeft(r14)
            if (r8 == 0) goto L134
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r0.mViewPortHandler
            float[] r14 = r0.mLineBuffer
            r14 = r14[r6]
            boolean r8 = r8.isInBoundsTop(r14)
            if (r8 != 0) goto L124
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r0.mViewPortHandler
            float[] r14 = r0.mLineBuffer
            r13 = r14[r13]
            boolean r8 = r8.isInBoundsBottom(r13)
            if (r8 != 0) goto L124
            goto L134
        L124:
            android.graphics.Paint r8 = r0.mRenderPaint
            int r13 = r1.getColor(r2)
            r8.setColor(r13)
            float[] r8 = r0.mLineBuffer
            android.graphics.Paint r13 = r0.mRenderPaint
            r11.drawLines(r8, r5, r12, r13)
        L134:
            int r2 = r2 + 1
            goto L6f
        L138:
            float[] r12 = r0.mLineBuffer
            int r12 = r12.length
            int r2 = r2 * r8
            int r13 = java.lang.Math.max(r2, r8)
            int r13 = r13 * 2
            if (r12 >= r13) goto L14f
            int r2 = java.lang.Math.max(r2, r8)
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            r0.mLineBuffer = r2
        L14f:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.min
            com.github.mikephil.charting.data.Entry r2 = r1.getEntryForIndex(r2)
            if (r2 == 0) goto L1fc
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.min
            r4 = 0
        L15e:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r12 = r0.mXBounds
            int r13 = r12.range
            int r12 = r12.min
            int r13 = r13 + r12
            if (r2 > r13) goto L1d8
            if (r2 != 0) goto L16b
            r12 = 0
            goto L16d
        L16b:
            int r12 = r2 + (-1)
        L16d:
            com.github.mikephil.charting.data.Entry r12 = r1.getEntryForIndex(r12)
            com.github.mikephil.charting.data.Entry r13 = r1.getEntryForIndex(r2)
            if (r12 == 0) goto L1d5
            if (r13 != 0) goto L17a
            goto L1d5
        L17a:
            float[] r14 = r0.mLineBuffer
            int r15 = r4 + 1
            float r16 = r12.getX()
            r14[r4] = r16
            float[] r14 = r0.mLineBuffer
            int r16 = r4 + 2
            float r17 = r12.getY()
            float r17 = r17 * r10
            r14[r15] = r17
            if (r3 == 0) goto L1be
            float[] r14 = r0.mLineBuffer
            int r15 = r4 + 3
            float r17 = r13.getX()
            r14[r16] = r17
            float[] r14 = r0.mLineBuffer
            int r16 = r4 + 4
            float r17 = r12.getY()
            float r17 = r17 * r10
            r14[r15] = r17
            float[] r14 = r0.mLineBuffer
            int r15 = r4 + 5
            float r17 = r13.getX()
            r14[r16] = r17
            float[] r14 = r0.mLineBuffer
            int r16 = r4 + 6
            float r4 = r12.getY()
            float r4 = r4 * r10
            r14[r15] = r4
        L1be:
            float[] r4 = r0.mLineBuffer
            int r12 = r16 + 1
            float r14 = r13.getX()
            r4[r16] = r14
            float[] r4 = r0.mLineBuffer
            int r14 = r16 + 2
            float r13 = r13.getY()
            float r13 = r13 * r10
            r4[r12] = r13
            r4 = r14
        L1d5:
            int r2 = r2 + 1
            goto L15e
        L1d8:
            if (r4 <= 0) goto L1fc
            float[] r2 = r0.mLineBuffer
            r9.pointValuesToPixel(r2)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.range
            int r2 = r2 + r6
            int r2 = r2 * r8
            int r2 = java.lang.Math.max(r2, r8)
            int r2 = r2 * 2
            android.graphics.Paint r3 = r0.mRenderPaint
            int r1 = r1.getColor()
            r3.setColor(r1)
            float[] r1 = r0.mLineBuffer
            android.graphics.Paint r3 = r0.mRenderPaint
            r11.drawLines(r1, r5, r2, r3)
        L1fc:
            android.graphics.Paint r1 = r0.mRenderPaint
            r2 = 0
            r1.setPathEffect(r2)
            return
    }

    protected void drawLinearFill(android.graphics.Canvas r8, com.github.mikephil.charting.interfaces.datasets.ILineDataSet r9, com.github.mikephil.charting.utils.Transformer r10, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds r11) {
            r7 = this;
            android.graphics.Path r0 = r7.mGenerateFilledPathBuffer
            int r1 = r11.min
            int r11 = r11.range
            int r11 = r11 + r1
            r2 = 0
        L8:
            int r3 = r2 * 128
            int r3 = r3 + r1
            int r4 = r3 + 128
            if (r4 <= r11) goto L10
            r4 = r11
        L10:
            if (r3 > r4) goto L2d
            r7.generateFilledPath(r9, r3, r4, r0)
            r10.pathValueToPixel(r0)
            android.graphics.drawable.Drawable r5 = r9.getFillDrawable()
            if (r5 == 0) goto L22
            r7.drawFilledPath(r8, r0, r5)
            goto L2d
        L22:
            int r5 = r9.getFillColor()
            int r6 = r9.getFillAlpha()
            r7.drawFilledPath(r8, r0, r5, r6)
        L2d:
            int r2 = r2 + 1
            if (r3 <= r4) goto L8
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
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r1 = r0.mChart
            boolean r1 = r0.isDrawingValuesAllowed(r1)
            if (r1 == 0) goto L10a
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r1 = r0.mChart
            com.github.mikephil.charting.data.LineData r1 = r1.getLineData()
            java.util.List r6 = r1.getDataSets()
            r7 = 0
            r8 = 0
        L16:
            int r1 = r6.size()
            if (r8 >= r1) goto L10a
            java.lang.Object r1 = r6.get(r8)
            r10 = r1
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet r10 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) r10
            boolean r1 = r0.shouldDrawValues(r10)
            if (r1 == 0) goto L104
            int r1 = r10.getEntryCount()
            r2 = 1
            if (r1 >= r2) goto L32
            goto L104
        L32:
            r0.applyValueTextStyle(r10)
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r1 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r10.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r9 = r1.getTransformer(r2)
            float r1 = r10.getCircleRadius()
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r2
            int r1 = (int) r1
            boolean r2 = r10.isDrawCirclesEnabled()
            if (r2 != 0) goto L50
            int r1 = r1 / 2
        L50:
            r15 = r1
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r1 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r2 = r0.mChart
            r1.set(r2, r10)
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r11 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r0.mAnimator
            float r12 = r1.getPhaseY()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r1 = r0.mXBounds
            int r13 = r1.min
            int r14 = r1.max
            float[] r9 = r9.generateTransformedValuesLine(r10, r11, r12, r13, r14)
            com.github.mikephil.charting.formatter.ValueFormatter r11 = r10.getValueFormatter()
            com.github.mikephil.charting.utils.MPPointF r1 = r10.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r12 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1)
            float r1 = r12.x
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r12.x = r1
            float r1 = r12.y
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r12.y = r1
            r13 = 0
        L8b:
            int r1 = r9.length
            if (r13 >= r1) goto L101
            r3 = r9[r13]
            int r1 = r13 + 1
            r14 = r9[r1]
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsRight(r3)
            if (r1 != 0) goto L9d
            goto L101
        L9d:
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsLeft(r3)
            if (r1 == 0) goto Lfc
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            boolean r1 = r1.isInBoundsY(r14)
            if (r1 != 0) goto Lae
            goto Lfc
        Lae:
            int r1 = r13 / 2
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r2 = r0.mXBounds
            int r2 = r2.min
            int r2 = r2 + r1
            com.github.mikephil.charting.data.Entry r2 = r10.getEntryForIndex(r2)
            boolean r4 = r10.isDrawValuesEnabled()
            if (r4 == 0) goto Ld5
            r4 = r2
            java.lang.String r2 = r11.getPointLabel(r4)
            float r5 = (float) r15
            float r5 = r14 - r5
            int r1 = r10.getValueTextColor(r1)
            r16 = r4
            r4 = r5
            r5 = r1
            r1 = r18
            r0.drawValue(r1, r2, r3, r4, r5)
            goto Ld7
        Ld5:
            r16 = r2
        Ld7:
            android.graphics.drawable.Drawable r0 = r16.getIcon()
            if (r0 == 0) goto Lfc
            boolean r0 = r10.isDrawIconsEnabled()
            if (r0 == 0) goto Lfc
            android.graphics.drawable.Drawable r1 = r16.getIcon()
            float r0 = r12.x
            float r3 = r3 + r0
            int r2 = (int) r3
            float r0 = r12.y
            float r14 = r14 + r0
            int r3 = (int) r14
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r18
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
        Lfc:
            int r13 = r13 + 2
            r0 = r17
            goto L8b
        L101:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r12)
        L104:
            int r8 = r8 + 1
            r0 = r17
            goto L16
        L10a:
            return
    }

    public android.graphics.Bitmap.Config getBitmapConfig() {
            r1 = this;
            android.graphics.Bitmap$Config r0 = r1.mBitmapConfig
            return r0
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

    public void setBitmapConfig(android.graphics.Bitmap.Config r1) {
            r0 = this;
            r0.mBitmapConfig = r1
            r0.releaseBitmap()
            return
    }
}

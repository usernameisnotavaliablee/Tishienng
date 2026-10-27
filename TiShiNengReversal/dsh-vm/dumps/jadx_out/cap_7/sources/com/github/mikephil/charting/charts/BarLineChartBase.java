package com.github.mikephil.charting.charts;

import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"RtlHardcoded"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class BarLineChartBase<T extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>> extends com.github.mikephil.charting.charts.Chart<T> implements com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider {
    private long drawCycles;
    protected boolean mAutoScaleMinMaxEnabled;
    protected com.github.mikephil.charting.components.YAxis mAxisLeft;
    protected com.github.mikephil.charting.renderer.YAxisRenderer mAxisRendererLeft;
    protected com.github.mikephil.charting.renderer.YAxisRenderer mAxisRendererRight;
    protected com.github.mikephil.charting.components.YAxis mAxisRight;
    protected android.graphics.Paint mBorderPaint;
    protected boolean mClipValuesToContent;
    private boolean mCustomViewPortEnabled;
    protected boolean mDoubleTapToZoomEnabled;
    private boolean mDragXEnabled;
    private boolean mDragYEnabled;
    protected boolean mDrawBorders;
    protected boolean mDrawGridBackground;
    protected com.github.mikephil.charting.listener.OnDrawListener mDrawListener;
    protected android.graphics.Matrix mFitScreenMatrixBuffer;
    protected float[] mGetPositionBuffer;
    protected android.graphics.Paint mGridBackgroundPaint;
    protected boolean mHighlightPerDragEnabled;
    protected boolean mKeepPositionOnRotation;
    protected com.github.mikephil.charting.utils.Transformer mLeftAxisTransformer;
    protected int mMaxVisibleCount;
    protected float mMinOffset;
    private android.graphics.RectF mOffsetsBuffer;
    protected float[] mOnSizeChangedBuffer;
    protected boolean mPinchZoomEnabled;
    protected com.github.mikephil.charting.utils.Transformer mRightAxisTransformer;
    private boolean mScaleXEnabled;
    private boolean mScaleYEnabled;
    protected com.github.mikephil.charting.renderer.XAxisRenderer mXAxisRenderer;
    protected android.graphics.Matrix mZoomMatrixBuffer;
    protected com.github.mikephil.charting.utils.MPPointD posForGetHighestVisibleX;
    protected com.github.mikephil.charting.utils.MPPointD posForGetLowestVisibleX;
    private long totalTime;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.charts.BarLineChartBase$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r2 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment     // Catch: java.lang.NoSuchFieldError -> L38
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch: java.lang.NoSuchFieldError -> L38
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                int[] r2 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment     // Catch: java.lang.NoSuchFieldError -> L43
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r4 = 3
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch: java.lang.NoSuchFieldError -> L54
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r1 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment     // Catch: java.lang.NoSuchFieldError -> L5e
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L5e
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L5e
            L5e:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public BarLineChartBase(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            r4 = 100
            r3.mMaxVisibleCount = r4
            r4 = 0
            r3.mAutoScaleMinMaxEnabled = r4
            r3.mPinchZoomEnabled = r4
            r0 = 1
            r3.mDoubleTapToZoomEnabled = r0
            r3.mHighlightPerDragEnabled = r0
            r3.mDragXEnabled = r0
            r3.mDragYEnabled = r0
            r3.mScaleXEnabled = r0
            r3.mScaleYEnabled = r0
            r3.mDrawGridBackground = r4
            r3.mDrawBorders = r4
            r3.mClipValuesToContent = r4
            r0 = 1097859072(0x41700000, float:15.0)
            r3.mMinOffset = r0
            r3.mKeepPositionOnRotation = r4
            r0 = 0
            r3.totalTime = r0
            r3.drawCycles = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.mOffsetsBuffer = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.mZoomMatrixBuffer = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.mFitScreenMatrixBuffer = r0
            r3.mCustomViewPortEnabled = r4
            r4 = 2
            float[] r0 = new float[r4]
            r3.mGetPositionBuffer = r0
            r0 = 0
            com.github.mikephil.charting.utils.MPPointD r2 = com.github.mikephil.charting.utils.MPPointD.getInstance(r0, r0)
            r3.posForGetLowestVisibleX = r2
            com.github.mikephil.charting.utils.MPPointD r0 = com.github.mikephil.charting.utils.MPPointD.getInstance(r0, r0)
            r3.posForGetHighestVisibleX = r0
            float[] r4 = new float[r4]
            r3.mOnSizeChangedBuffer = r4
            return
    }

    public BarLineChartBase(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r3 = 100
            r2.mMaxVisibleCount = r3
            r3 = 0
            r2.mAutoScaleMinMaxEnabled = r3
            r2.mPinchZoomEnabled = r3
            r4 = 1
            r2.mDoubleTapToZoomEnabled = r4
            r2.mHighlightPerDragEnabled = r4
            r2.mDragXEnabled = r4
            r2.mDragYEnabled = r4
            r2.mScaleXEnabled = r4
            r2.mScaleYEnabled = r4
            r2.mDrawGridBackground = r3
            r2.mDrawBorders = r3
            r2.mClipValuesToContent = r3
            r4 = 1097859072(0x41700000, float:15.0)
            r2.mMinOffset = r4
            r2.mKeepPositionOnRotation = r3
            r0 = 0
            r2.totalTime = r0
            r2.drawCycles = r0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r2.mOffsetsBuffer = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r2.mZoomMatrixBuffer = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r2.mFitScreenMatrixBuffer = r4
            r2.mCustomViewPortEnabled = r3
            r3 = 2
            float[] r4 = new float[r3]
            r2.mGetPositionBuffer = r4
            r0 = 0
            com.github.mikephil.charting.utils.MPPointD r4 = com.github.mikephil.charting.utils.MPPointD.getInstance(r0, r0)
            r2.posForGetLowestVisibleX = r4
            com.github.mikephil.charting.utils.MPPointD r4 = com.github.mikephil.charting.utils.MPPointD.getInstance(r0, r0)
            r2.posForGetHighestVisibleX = r4
            float[] r3 = new float[r3]
            r2.mOnSizeChangedBuffer = r3
            return
    }

    public BarLineChartBase(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r2 = 100
            r1.mMaxVisibleCount = r2
            r2 = 0
            r1.mAutoScaleMinMaxEnabled = r2
            r1.mPinchZoomEnabled = r2
            r3 = 1
            r1.mDoubleTapToZoomEnabled = r3
            r1.mHighlightPerDragEnabled = r3
            r1.mDragXEnabled = r3
            r1.mDragYEnabled = r3
            r1.mScaleXEnabled = r3
            r1.mScaleYEnabled = r3
            r1.mDrawGridBackground = r2
            r1.mDrawBorders = r2
            r1.mClipValuesToContent = r2
            r3 = 1097859072(0x41700000, float:15.0)
            r1.mMinOffset = r3
            r1.mKeepPositionOnRotation = r2
            r3 = 0
            r1.totalTime = r3
            r1.drawCycles = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r1.mOffsetsBuffer = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r1.mZoomMatrixBuffer = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r1.mFitScreenMatrixBuffer = r3
            r1.mCustomViewPortEnabled = r2
            r2 = 2
            float[] r3 = new float[r2]
            r1.mGetPositionBuffer = r3
            r3 = 0
            com.github.mikephil.charting.utils.MPPointD r0 = com.github.mikephil.charting.utils.MPPointD.getInstance(r3, r3)
            r1.posForGetLowestVisibleX = r0
            com.github.mikephil.charting.utils.MPPointD r3 = com.github.mikephil.charting.utils.MPPointD.getInstance(r3, r3)
            r1.posForGetHighestVisibleX = r3
            float[] r2 = new float[r2]
            r1.mOnSizeChangedBuffer = r2
            return
    }

    protected void autoScale() {
            r4 = this;
            float r0 = r4.getLowestVisibleX()
            float r1 = r4.getHighestVisibleX()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r2 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r2
            r2.calcMinMaxY(r0, r1)
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r1 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r1
            float r1 = r1.getXMin()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r2 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r2
            float r2 = r2.getXMax()
            r0.calculate(r1, r2)
            com.github.mikephil.charting.components.YAxis r0 = r4.mAxisLeft
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L43
            com.github.mikephil.charting.components.YAxis r0 = r4.mAxisLeft
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r1 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            float r1 = r1.getYMin(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r3 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r3
            float r2 = r3.getYMax(r2)
            r0.calculate(r1, r2)
        L43:
            com.github.mikephil.charting.components.YAxis r0 = r4.mAxisRight
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L62
            com.github.mikephil.charting.components.YAxis r0 = r4.mAxisRight
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r1 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT
            float r1 = r1.getYMin(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r3 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r3
            float r2 = r3.getYMax(r2)
            r0.calculate(r1, r2)
        L62:
            r4.calculateOffsets()
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
            r4 = this;
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r1 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r1
            float r1 = r1.getXMin()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r2 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r2
            float r2 = r2.getXMax()
            r0.calculate(r1, r2)
            com.github.mikephil.charting.components.YAxis r0 = r4.mAxisLeft
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r1 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            float r1 = r1.getYMin(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r3 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r3
            float r2 = r3.getYMax(r2)
            r0.calculate(r1, r2)
            com.github.mikephil.charting.components.YAxis r0 = r4.mAxisRight
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r1 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT
            float r1 = r1.getYMin(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r4.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r3 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r3
            float r2 = r3.getYMax(r2)
            r0.calculate(r1, r2)
            return
    }

    protected void calculateLegendOffsets(android.graphics.RectF r5) {
            r4 = this;
            r0 = 0
            r5.left = r0
            r5.right = r0
            r5.top = r0
            r5.bottom = r0
            com.github.mikephil.charting.components.Legend r0 = r4.mLegend
            if (r0 == 0) goto L141
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L141
            com.github.mikephil.charting.components.Legend r0 = r4.mLegend
            boolean r0 = r0.isDrawInsideEnabled()
            if (r0 != 0) goto L141
            int[] r0 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation
            com.github.mikephil.charting.components.Legend r1 = r4.mLegend
            com.github.mikephil.charting.components.Legend$LegendOrientation r1 = r1.getOrientation()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L8b
            if (r0 == r1) goto L31
            goto L141
        L31:
            int[] r0 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = r3.getVerticalAlignment()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto L68
            if (r0 == r1) goto L45
            goto L141
        L45:
            float r0 = r5.bottom
            com.github.mikephil.charting.components.Legend r1 = r4.mLegend
            float r1 = r1.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r1 = java.lang.Math.min(r1, r2)
            com.github.mikephil.charting.components.Legend r2 = r4.mLegend
            float r2 = r2.getYOffset()
            float r1 = r1 + r2
            float r0 = r0 + r1
            r5.bottom = r0
            return
        L68:
            float r0 = r5.top
            com.github.mikephil.charting.components.Legend r1 = r4.mLegend
            float r1 = r1.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r1 = java.lang.Math.min(r1, r2)
            com.github.mikephil.charting.components.Legend r2 = r4.mLegend
            float r2 = r2.getYOffset()
            float r1 = r1 + r2
            float r0 = r0 + r1
            r5.top = r0
            return
        L8b:
            int[] r0 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = r3.getHorizontalAlignment()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto L11f
            if (r0 == r1) goto Lfc
            r3 = 3
            if (r0 == r3) goto La2
            goto L141
        La2:
            int[] r0 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = r3.getVerticalAlignment()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto Ld9
            if (r0 == r1) goto Lb6
            goto L141
        Lb6:
            float r0 = r5.bottom
            com.github.mikephil.charting.components.Legend r1 = r4.mLegend
            float r1 = r1.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r1 = java.lang.Math.min(r1, r2)
            com.github.mikephil.charting.components.Legend r2 = r4.mLegend
            float r2 = r2.getYOffset()
            float r1 = r1 + r2
            float r0 = r0 + r1
            r5.bottom = r0
            return
        Ld9:
            float r0 = r5.top
            com.github.mikephil.charting.components.Legend r1 = r4.mLegend
            float r1 = r1.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r1 = java.lang.Math.min(r1, r2)
            com.github.mikephil.charting.components.Legend r2 = r4.mLegend
            float r2 = r2.getYOffset()
            float r1 = r1 + r2
            float r0 = r0 + r1
            r5.top = r0
            return
        Lfc:
            float r0 = r5.right
            com.github.mikephil.charting.components.Legend r1 = r4.mLegend
            float r1 = r1.mNeededWidth
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.getChartWidth()
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r1 = java.lang.Math.min(r1, r2)
            com.github.mikephil.charting.components.Legend r2 = r4.mLegend
            float r2 = r2.getXOffset()
            float r1 = r1 + r2
            float r0 = r0 + r1
            r5.right = r0
            return
        L11f:
            float r0 = r5.left
            com.github.mikephil.charting.components.Legend r1 = r4.mLegend
            float r1 = r1.mNeededWidth
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.getChartWidth()
            com.github.mikephil.charting.components.Legend r3 = r4.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r1 = java.lang.Math.min(r1, r2)
            com.github.mikephil.charting.components.Legend r2 = r4.mLegend
            float r2 = r2.getXOffset()
            float r1 = r1 + r2
            float r0 = r0 + r1
            r5.left = r0
        L141:
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
            r7 = this;
            boolean r0 = r7.mCustomViewPortEnabled
            if (r0 != 0) goto Lbc
            android.graphics.RectF r0 = r7.mOffsetsBuffer
            r7.calculateLegendOffsets(r0)
            android.graphics.RectF r0 = r7.mOffsetsBuffer
            float r1 = r0.left
            r2 = 0
            float r1 = r1 + r2
            float r3 = r0.top
            float r3 = r3 + r2
            float r4 = r0.right
            float r4 = r4 + r2
            float r0 = r0.bottom
            float r0 = r0 + r2
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisLeft
            boolean r2 = r2.needsOffset()
            if (r2 == 0) goto L2d
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisLeft
            com.github.mikephil.charting.renderer.YAxisRenderer r5 = r7.mAxisRendererLeft
            android.graphics.Paint r5 = r5.getPaintAxisLabels()
            float r2 = r2.getRequiredWidthSpace(r5)
            float r1 = r1 + r2
        L2d:
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisRight
            boolean r2 = r2.needsOffset()
            if (r2 == 0) goto L42
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisRight
            com.github.mikephil.charting.renderer.YAxisRenderer r5 = r7.mAxisRendererRight
            android.graphics.Paint r5 = r5.getPaintAxisLabels()
            float r2 = r2.getRequiredWidthSpace(r5)
            float r4 = r4 + r2
        L42:
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L80
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            boolean r2 = r2.isDrawLabelsEnabled()
            if (r2 == 0) goto L80
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            int r5 = r2.mLabelRotatedHeight
            float r5 = (float) r5
            float r2 = r2.getYOffset()
            float r5 = r5 + r2
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r2 = r2.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r6 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            if (r2 != r6) goto L68
            float r0 = r0 + r5
            goto L80
        L68:
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r2 = r2.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r6 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP
            if (r2 != r6) goto L74
        L72:
            float r3 = r3 + r5
            goto L80
        L74:
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r2 = r2.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r6 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED
            if (r2 != r6) goto L80
            float r0 = r0 + r5
            goto L72
        L80:
            float r2 = r7.getExtraTopOffset()
            float r3 = r3 + r2
            float r2 = r7.getExtraRightOffset()
            float r4 = r4 + r2
            float r2 = r7.getExtraBottomOffset()
            float r0 = r0 + r2
            float r2 = r7.getExtraLeftOffset()
            float r1 = r1 + r2
            float r2 = r7.mMinOffset
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r7.mViewPortHandler
            float r1 = java.lang.Math.max(r2, r1)
            float r3 = java.lang.Math.max(r2, r3)
            float r4 = java.lang.Math.max(r2, r4)
            float r0 = java.lang.Math.max(r2, r0)
            r5.restrainViewPort(r1, r3, r4, r0)
            boolean r0 = r7.mLogEnabled
            if (r0 == 0) goto Lbc
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r7.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            r0.toString()
        Lbc:
            r7.prepareOffsetMatrix()
            r7.prepareValuePxMatrix()
            return
    }

    public void centerViewTo(float r5, float r6, com.github.mikephil.charting.components.YAxis.AxisDependency r7) {
            r4 = this;
            float r0 = r4.getAxisRange(r7)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            float r1 = r1.getScaleY()
            float r0 = r0 / r1
            com.github.mikephil.charting.components.XAxis r1 = r4.getXAxis()
            float r1 = r1.mAxisRange
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.getScaleX()
            float r1 = r1 / r2
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r5 = r5 - r1
            float r0 = r0 / r3
            float r6 = r6 + r0
            com.github.mikephil.charting.utils.Transformer r7 = r4.getTransformer(r7)
            com.github.mikephil.charting.jobs.MoveViewJob r5 = com.github.mikephil.charting.jobs.MoveViewJob.getInstance(r2, r5, r6, r7, r4)
            r4.addViewportJob(r5)
            return
    }

    @android.annotation.TargetApi(11)
    public void centerViewToAnimated(float r11, float r12, com.github.mikephil.charting.components.YAxis.AxisDependency r13, long r14) {
            r10 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            float r1 = r1.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r10.mViewPortHandler
            float r2 = r2.contentTop()
            com.github.mikephil.charting.utils.MPPointD r9 = r10.getValuesByTouchPoint(r1, r2, r13)
            float r1 = r10.getAxisRange(r13)
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r10.mViewPortHandler
            float r2 = r2.getScaleY()
            float r1 = r1 / r2
            com.github.mikephil.charting.components.XAxis r2 = r10.getXAxis()
            float r2 = r2.mAxisRange
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r10.mViewPortHandler
            float r3 = r3.getScaleX()
            float r2 = r2 / r3
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r10.mViewPortHandler
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            float r2 = r11 - r2
            float r1 = r1 / r5
            float r1 = r1 + r12
            com.github.mikephil.charting.utils.Transformer r0 = r10.getTransformer(r13)
            double r5 = r9.x
            float r5 = (float) r5
            double r6 = r9.y
            float r6 = (float) r6
            r4 = r3
            r3 = r0
            r0 = r4
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r10
            r7 = r14
            com.github.mikephil.charting.jobs.AnimatedMoveViewJob r0 = com.github.mikephil.charting.jobs.AnimatedMoveViewJob.getInstance(r0, r1, r2, r3, r4, r5, r6, r7)
            r10.addViewportJob(r0)
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r9)
            return
    }

    public void centerViewToY(float r4, com.github.mikephil.charting.components.YAxis.AxisDependency r5) {
            r3 = this;
            float r0 = r3.getAxisRange(r5)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.getScaleY()
            float r0 = r0 / r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r4 = r4 + r0
            com.github.mikephil.charting.utils.Transformer r5 = r3.getTransformer(r5)
            r0 = 0
            com.github.mikephil.charting.jobs.MoveViewJob r4 = com.github.mikephil.charting.jobs.MoveViewJob.getInstance(r1, r0, r4, r5, r3)
            r3.addViewportJob(r4)
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r2 = this;
            com.github.mikephil.charting.listener.ChartTouchListener r0 = r2.mChartTouchListener
            boolean r1 = r0 instanceof com.github.mikephil.charting.listener.BarLineChartTouchListener
            if (r1 == 0) goto Lb
            com.github.mikephil.charting.listener.BarLineChartTouchListener r0 = (com.github.mikephil.charting.listener.BarLineChartTouchListener) r0
            r0.computeScroll()
        Lb:
            return
    }

    protected void drawGridBackground(android.graphics.Canvas r3) {
            r2 = this;
            boolean r0 = r2.mDrawGridBackground
            if (r0 == 0) goto Lf
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            android.graphics.Paint r1 = r2.mGridBackgroundPaint
            r3.drawRect(r0, r1)
        Lf:
            boolean r0 = r2.mDrawBorders
            if (r0 == 0) goto L1e
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r2.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            android.graphics.Paint r1 = r2.mBorderPaint
            r3.drawRect(r0, r1)
        L1e:
            return
    }

    public void fitScreen() {
            r3 = this;
            android.graphics.Matrix r0 = r3.mFitScreenMatrixBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            r1.fitScreen(r0)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            r2 = 0
            r1.refresh(r0, r3, r2)
            r3.calculateOffsets()
            r3.postInvalidate()
            return
    }

    public com.github.mikephil.charting.components.YAxis getAxis(com.github.mikephil.charting.components.YAxis.AxisDependency r2) {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r2 != r0) goto L7
            com.github.mikephil.charting.components.YAxis r2 = r1.mAxisLeft
            return r2
        L7:
            com.github.mikephil.charting.components.YAxis r2 = r1.mAxisRight
            return r2
    }

    public com.github.mikephil.charting.components.YAxis getAxisLeft() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis r0 = r1.mAxisLeft
            return r0
    }

    protected float getAxisRange(com.github.mikephil.charting.components.YAxis.AxisDependency r2) {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r2 != r0) goto L9
            com.github.mikephil.charting.components.YAxis r2 = r1.mAxisLeft
            float r2 = r2.mAxisRange
            return r2
        L9:
            com.github.mikephil.charting.components.YAxis r2 = r1.mAxisRight
            float r2 = r2.mAxisRange
            return r2
    }

    public com.github.mikephil.charting.components.YAxis getAxisRight() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis r0 = r1.mAxisRight
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public /* bridge */ /* synthetic */ com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getData() {
            r1 = this;
            com.github.mikephil.charting.data.ChartData r0 = super.getData()
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r0 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r0
            return r0
    }

    public com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet getDataSetByTouchPoint(float r1, float r2) {
            r0 = this;
            com.github.mikephil.charting.highlight.Highlight r1 = r0.getHighlightByTouchPoint(r1, r2)
            if (r1 == 0) goto L15
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r0.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r2 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r2
            int r1 = r1.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r2.getDataSetByIndex(r1)
            com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) r1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public com.github.mikephil.charting.listener.OnDrawListener getDrawListener() {
            r1 = this;
            com.github.mikephil.charting.listener.OnDrawListener r0 = r1.mDrawListener
            return r0
    }

    public com.github.mikephil.charting.data.Entry getEntryByTouchPoint(float r1, float r2) {
            r0 = this;
            com.github.mikephil.charting.highlight.Highlight r1 = r0.getHighlightByTouchPoint(r1, r2)
            if (r1 == 0) goto Lf
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r0.mData
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r2 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r2
            com.github.mikephil.charting.data.Entry r1 = r2.getEntryForHighlight(r1)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public float getHighestVisibleX() {
            r4 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r0 = r4.getTransformer(r0)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            float r1 = r1.contentRight()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.contentBottom()
            com.github.mikephil.charting.utils.MPPointD r3 = r4.posForGetHighestVisibleX
            r0.getValuesByTouchPoint(r1, r2, r3)
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            float r0 = r0.mAxisMaximum
            double r0 = (double) r0
            com.github.mikephil.charting.utils.MPPointD r2 = r4.posForGetHighestVisibleX
            double r2 = r2.x
            double r0 = java.lang.Math.min(r0, r2)
            float r0 = (float) r0
            return r0
    }

    public float getLowestVisibleX() {
            r4 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r0 = r4.getTransformer(r0)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            float r1 = r1.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.contentBottom()
            com.github.mikephil.charting.utils.MPPointD r3 = r4.posForGetLowestVisibleX
            r0.getValuesByTouchPoint(r1, r2, r3)
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            float r0 = r0.mAxisMinimum
            double r0 = (double) r0
            com.github.mikephil.charting.utils.MPPointD r2 = r4.posForGetLowestVisibleX
            double r2 = r2.x
            double r0 = java.lang.Math.max(r0, r2)
            float r0 = (float) r0
            return r0
    }

    public int getMaxVisibleCount() {
            r1 = this;
            int r0 = r1.mMaxVisibleCount
            return r0
    }

    public float getMinOffset() {
            r1 = this;
            float r0 = r1.mMinOffset
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public android.graphics.Paint getPaint(int r2) {
            r1 = this;
            android.graphics.Paint r0 = super.getPaint(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 4
            if (r2 == r0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.graphics.Paint r2 = r1.mGridBackgroundPaint
            return r2
    }

    public com.github.mikephil.charting.utils.MPPointD getPixelForValues(float r1, float r2, com.github.mikephil.charting.components.YAxis.AxisDependency r3) {
            r0 = this;
            com.github.mikephil.charting.utils.Transformer r3 = r0.getTransformer(r3)
            com.github.mikephil.charting.utils.MPPointD r1 = r3.getPixelForValues(r1, r2)
            return r1
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.data.Entry r4, com.github.mikephil.charting.components.YAxis.AxisDependency r5) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            float[] r0 = r3.mGetPositionBuffer
            float r1 = r4.getX()
            r2 = 0
            r0[r2] = r1
            float[] r0 = r3.mGetPositionBuffer
            float r4 = r4.getY()
            r1 = 1
            r0[r1] = r4
            com.github.mikephil.charting.utils.Transformer r4 = r3.getTransformer(r5)
            float[] r5 = r3.mGetPositionBuffer
            r4.pointValuesToPixel(r5)
            float[] r4 = r3.mGetPositionBuffer
            r5 = r4[r2]
            r4 = r4[r1]
            com.github.mikephil.charting.utils.MPPointF r4 = com.github.mikephil.charting.utils.MPPointF.getInstance(r5, r4)
            return r4
    }

    public com.github.mikephil.charting.renderer.YAxisRenderer getRendererLeftYAxis() {
            r1 = this;
            com.github.mikephil.charting.renderer.YAxisRenderer r0 = r1.mAxisRendererLeft
            return r0
    }

    public com.github.mikephil.charting.renderer.YAxisRenderer getRendererRightYAxis() {
            r1 = this;
            com.github.mikephil.charting.renderer.YAxisRenderer r0 = r1.mAxisRendererRight
            return r0
    }

    public com.github.mikephil.charting.renderer.XAxisRenderer getRendererXAxis() {
            r1 = this;
            com.github.mikephil.charting.renderer.XAxisRenderer r0 = r1.mXAxisRenderer
            return r0
    }

    @Override // android.view.View
    public float getScaleX() {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            if (r0 != 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            float r0 = r0.getScaleX()
            return r0
    }

    @Override // android.view.View
    public float getScaleY() {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            if (r0 != 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            float r0 = r0.getScaleY()
            return r0
    }

    public com.github.mikephil.charting.utils.Transformer getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency r2) {
            r1 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r2 != r0) goto L7
            com.github.mikephil.charting.utils.Transformer r2 = r1.mLeftAxisTransformer
            return r2
        L7:
            com.github.mikephil.charting.utils.Transformer r2 = r1.mRightAxisTransformer
            return r2
    }

    public com.github.mikephil.charting.utils.MPPointD getValuesByTouchPoint(float r3, float r4, com.github.mikephil.charting.components.YAxis.AxisDependency r5) {
            r2 = this;
            r0 = 0
            com.github.mikephil.charting.utils.MPPointD r0 = com.github.mikephil.charting.utils.MPPointD.getInstance(r0, r0)
            r2.getValuesByTouchPoint(r3, r4, r5, r0)
            return r0
    }

    public void getValuesByTouchPoint(float r1, float r2, com.github.mikephil.charting.components.YAxis.AxisDependency r3, com.github.mikephil.charting.utils.MPPointD r4) {
            r0 = this;
            com.github.mikephil.charting.utils.Transformer r3 = r0.getTransformer(r3)
            r3.getValuesByTouchPoint(r1, r2, r4)
            return
    }

    public float getVisibleXRange() {
            r2 = this;
            float r0 = r2.getHighestVisibleX()
            float r1 = r2.getLowestVisibleX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    public float getYChartMax() {
            r2 = this;
            com.github.mikephil.charting.components.YAxis r0 = r2.mAxisLeft
            float r0 = r0.mAxisMaximum
            com.github.mikephil.charting.components.YAxis r1 = r2.mAxisRight
            float r1 = r1.mAxisMaximum
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public float getYChartMin() {
            r2 = this;
            com.github.mikephil.charting.components.YAxis r0 = r2.mAxisLeft
            float r0 = r0.mAxisMinimum
            com.github.mikephil.charting.components.YAxis r1 = r2.mAxisRight
            float r1 = r1.mAxisMinimum
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    public boolean hasNoDragOffset() {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            boolean r0 = r0.hasNoDragOffset()
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
            r4 = this;
            super.init()
            com.github.mikephil.charting.components.YAxis r0 = new com.github.mikephil.charting.components.YAxis
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            r0.<init>(r1)
            r4.mAxisLeft = r0
            com.github.mikephil.charting.components.YAxis r0 = new com.github.mikephil.charting.components.YAxis
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT
            r0.<init>(r1)
            r4.mAxisRight = r0
            com.github.mikephil.charting.utils.Transformer r0 = new com.github.mikephil.charting.utils.Transformer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            r0.<init>(r1)
            r4.mLeftAxisTransformer = r0
            com.github.mikephil.charting.utils.Transformer r0 = new com.github.mikephil.charting.utils.Transformer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            r0.<init>(r1)
            r4.mRightAxisTransformer = r0
            com.github.mikephil.charting.renderer.YAxisRenderer r0 = new com.github.mikephil.charting.renderer.YAxisRenderer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            com.github.mikephil.charting.components.YAxis r2 = r4.mAxisLeft
            com.github.mikephil.charting.utils.Transformer r3 = r4.mLeftAxisTransformer
            r0.<init>(r1, r2, r3)
            r4.mAxisRendererLeft = r0
            com.github.mikephil.charting.renderer.YAxisRenderer r0 = new com.github.mikephil.charting.renderer.YAxisRenderer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            com.github.mikephil.charting.components.YAxis r2 = r4.mAxisRight
            com.github.mikephil.charting.utils.Transformer r3 = r4.mRightAxisTransformer
            r0.<init>(r1, r2, r3)
            r4.mAxisRendererRight = r0
            com.github.mikephil.charting.renderer.XAxisRenderer r0 = new com.github.mikephil.charting.renderer.XAxisRenderer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            com.github.mikephil.charting.components.XAxis r2 = r4.mXAxis
            com.github.mikephil.charting.utils.Transformer r3 = r4.mLeftAxisTransformer
            r0.<init>(r1, r2, r3)
            r4.mXAxisRenderer = r0
            com.github.mikephil.charting.highlight.ChartHighlighter r0 = new com.github.mikephil.charting.highlight.ChartHighlighter
            r0.<init>(r4)
            r4.setHighlighter(r0)
            com.github.mikephil.charting.listener.BarLineChartTouchListener r0 = new com.github.mikephil.charting.listener.BarLineChartTouchListener
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            android.graphics.Matrix r1 = r1.getMatrixTouch()
            r2 = 1077936128(0x40400000, float:3.0)
            r0.<init>(r4, r1, r2)
            r4.mChartTouchListener = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.mGridBackgroundPaint = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r4.mGridBackgroundPaint
            r1 = 240(0xf0, float:3.36E-43)
            int r1 = android.graphics.Color.rgb(r1, r1, r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.mBorderPaint = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r4.mBorderPaint
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.mBorderPaint
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.setStrokeWidth(r1)
            return
    }

    public boolean isAnyAxisInverted() {
            r2 = this;
            com.github.mikephil.charting.components.YAxis r0 = r2.mAxisLeft
            boolean r0 = r0.isInverted()
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            com.github.mikephil.charting.components.YAxis r0 = r2.mAxisRight
            boolean r0 = r0.isInverted()
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 0
            return r0
    }

    public boolean isAutoScaleMinMaxEnabled() {
            r1 = this;
            boolean r0 = r1.mAutoScaleMinMaxEnabled
            return r0
    }

    public boolean isClipValuesToContentEnabled() {
            r1 = this;
            boolean r0 = r1.mClipValuesToContent
            return r0
    }

    public boolean isDoubleTapToZoomEnabled() {
            r1 = this;
            boolean r0 = r1.mDoubleTapToZoomEnabled
            return r0
    }

    public boolean isDragEnabled() {
            r1 = this;
            boolean r0 = r1.mDragXEnabled
            if (r0 != 0) goto Lb
            boolean r0 = r1.mDragYEnabled
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public boolean isDragXEnabled() {
            r1 = this;
            boolean r0 = r1.mDragXEnabled
            return r0
    }

    public boolean isDragYEnabled() {
            r1 = this;
            boolean r0 = r1.mDragYEnabled
            return r0
    }

    public boolean isDrawBordersEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawBorders
            return r0
    }

    public boolean isFullyZoomedOut() {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            boolean r0 = r0.isFullyZoomedOut()
            return r0
    }

    public boolean isHighlightPerDragEnabled() {
            r1 = this;
            boolean r0 = r1.mHighlightPerDragEnabled
            return r0
    }

    public boolean isInverted(com.github.mikephil.charting.components.YAxis.AxisDependency r1) {
            r0 = this;
            com.github.mikephil.charting.components.YAxis r1 = r0.getAxis(r1)
            boolean r1 = r1.isInverted()
            return r1
    }

    public boolean isKeepPositionOnRotation() {
            r1 = this;
            boolean r0 = r1.mKeepPositionOnRotation
            return r0
    }

    public boolean isPinchZoomEnabled() {
            r1 = this;
            boolean r0 = r1.mPinchZoomEnabled
            return r0
    }

    public boolean isScaleXEnabled() {
            r1 = this;
            boolean r0 = r1.mScaleXEnabled
            return r0
    }

    public boolean isScaleYEnabled() {
            r1 = this;
            boolean r0 = r1.mScaleYEnabled
            return r0
    }

    public void moveViewTo(float r4, float r5, com.github.mikephil.charting.components.YAxis.AxisDependency r6) {
            r3 = this;
            float r0 = r3.getAxisRange(r6)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.getScaleY()
            float r0 = r0 / r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r5 = r5 + r0
            com.github.mikephil.charting.utils.Transformer r6 = r3.getTransformer(r6)
            com.github.mikephil.charting.jobs.MoveViewJob r4 = com.github.mikephil.charting.jobs.MoveViewJob.getInstance(r1, r4, r5, r6, r3)
            r3.addViewportJob(r4)
            return
    }

    @android.annotation.TargetApi(11)
    public void moveViewToAnimated(float r11, float r12, com.github.mikephil.charting.components.YAxis.AxisDependency r13, long r14) {
            r10 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r10.mViewPortHandler
            float r1 = r1.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r10.mViewPortHandler
            float r2 = r2.contentTop()
            com.github.mikephil.charting.utils.MPPointD r9 = r10.getValuesByTouchPoint(r1, r2, r13)
            float r1 = r10.getAxisRange(r13)
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r10.mViewPortHandler
            float r2 = r2.getScaleY()
            float r1 = r1 / r2
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r10.mViewPortHandler
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r1 = r1 + r12
            com.github.mikephil.charting.utils.Transformer r3 = r10.getTransformer(r13)
            double r5 = r9.x
            float r5 = (float) r5
            double r6 = r9.y
            float r6 = (float) r6
            r4 = r10
            r7 = r14
            r0 = r2
            r2 = r1
            r1 = r11
            com.github.mikephil.charting.jobs.AnimatedMoveViewJob r0 = com.github.mikephil.charting.jobs.AnimatedMoveViewJob.getInstance(r0, r1, r2, r3, r4, r5, r6, r7)
            r10.addViewportJob(r0)
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r9)
            return
    }

    public void moveViewToX(float r4) {
            r3 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r1 = r3.getTransformer(r1)
            r2 = 0
            com.github.mikephil.charting.jobs.MoveViewJob r4 = com.github.mikephil.charting.jobs.MoveViewJob.getInstance(r0, r4, r2, r1, r3)
            r3.addViewportJob(r4)
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
            r4 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mData
            if (r0 != 0) goto L5
            return
        L5:
            com.github.mikephil.charting.renderer.DataRenderer r0 = r4.mRenderer
            if (r0 == 0) goto Lc
            r0.initBuffers()
        Lc:
            r4.calcMinMax()
            com.github.mikephil.charting.renderer.YAxisRenderer r0 = r4.mAxisRendererLeft
            com.github.mikephil.charting.components.YAxis r1 = r4.mAxisLeft
            float r2 = r1.mAxisMinimum
            float r3 = r1.mAxisMaximum
            boolean r1 = r1.isInverted()
            r0.computeAxis(r2, r3, r1)
            com.github.mikephil.charting.renderer.YAxisRenderer r0 = r4.mAxisRendererRight
            com.github.mikephil.charting.components.YAxis r1 = r4.mAxisRight
            float r2 = r1.mAxisMinimum
            float r3 = r1.mAxisMaximum
            boolean r1 = r1.isInverted()
            r0.computeAxis(r2, r3, r1)
            com.github.mikephil.charting.renderer.XAxisRenderer r0 = r4.mXAxisRenderer
            com.github.mikephil.charting.components.XAxis r1 = r4.mXAxis
            float r2 = r1.mAxisMinimum
            float r1 = r1.mAxisMaximum
            r3 = 0
            r0.computeAxis(r2, r1, r3)
            com.github.mikephil.charting.components.Legend r0 = r4.mLegend
            if (r0 == 0) goto L44
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r4.mLegendRenderer
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            r0.computeLegend(r1)
        L44:
            r4.calculateOffsets()
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            super.onDraw(r7)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r6.mData
            if (r0 != 0) goto L9
            goto L1ac
        L9:
            long r0 = java.lang.System.currentTimeMillis()
            r6.drawGridBackground(r7)
            boolean r2 = r6.mAutoScaleMinMaxEnabled
            if (r2 == 0) goto L17
            r6.autoScale()
        L17:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisLeft
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L2e
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererLeft
            com.github.mikephil.charting.components.YAxis r3 = r6.mAxisLeft
            float r4 = r3.mAxisMinimum
            float r5 = r3.mAxisMaximum
            boolean r3 = r3.isInverted()
            r2.computeAxis(r4, r5, r3)
        L2e:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisRight
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L45
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererRight
            com.github.mikephil.charting.components.YAxis r3 = r6.mAxisRight
            float r4 = r3.mAxisMinimum
            float r5 = r3.mAxisMaximum
            boolean r3 = r3.isInverted()
            r2.computeAxis(r4, r5, r3)
        L45:
            com.github.mikephil.charting.components.XAxis r2 = r6.mXAxis
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L59
            com.github.mikephil.charting.renderer.XAxisRenderer r2 = r6.mXAxisRenderer
            com.github.mikephil.charting.components.XAxis r3 = r6.mXAxis
            float r4 = r3.mAxisMinimum
            float r3 = r3.mAxisMaximum
            r5 = 0
            r2.computeAxis(r4, r3, r5)
        L59:
            com.github.mikephil.charting.renderer.XAxisRenderer r2 = r6.mXAxisRenderer
            r2.renderAxisLine(r7)
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererLeft
            r2.renderAxisLine(r7)
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererRight
            r2.renderAxisLine(r7)
            com.github.mikephil.charting.components.XAxis r2 = r6.mXAxis
            boolean r2 = r2.isDrawGridLinesBehindDataEnabled()
            if (r2 == 0) goto L75
            com.github.mikephil.charting.renderer.XAxisRenderer r2 = r6.mXAxisRenderer
            r2.renderGridLines(r7)
        L75:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisLeft
            boolean r2 = r2.isDrawGridLinesBehindDataEnabled()
            if (r2 == 0) goto L82
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererLeft
            r2.renderGridLines(r7)
        L82:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisRight
            boolean r2 = r2.isDrawGridLinesBehindDataEnabled()
            if (r2 == 0) goto L8f
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererRight
            r2.renderGridLines(r7)
        L8f:
            com.github.mikephil.charting.components.XAxis r2 = r6.mXAxis
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto La4
            com.github.mikephil.charting.components.XAxis r2 = r6.mXAxis
            boolean r2 = r2.isDrawLimitLinesBehindDataEnabled()
            if (r2 == 0) goto La4
            com.github.mikephil.charting.renderer.XAxisRenderer r2 = r6.mXAxisRenderer
            r2.renderLimitLines(r7)
        La4:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisLeft
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto Lb9
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisLeft
            boolean r2 = r2.isDrawLimitLinesBehindDataEnabled()
            if (r2 == 0) goto Lb9
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererLeft
            r2.renderLimitLines(r7)
        Lb9:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisRight
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto Lce
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisRight
            boolean r2 = r2.isDrawLimitLinesBehindDataEnabled()
            if (r2 == 0) goto Lce
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererRight
            r2.renderLimitLines(r7)
        Lce:
            int r2 = r7.save()
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            android.graphics.RectF r3 = r3.getContentRect()
            r7.clipRect(r3)
            com.github.mikephil.charting.renderer.DataRenderer r3 = r6.mRenderer
            r3.drawData(r7)
            com.github.mikephil.charting.components.XAxis r3 = r6.mXAxis
            boolean r3 = r3.isDrawGridLinesBehindDataEnabled()
            if (r3 != 0) goto Led
            com.github.mikephil.charting.renderer.XAxisRenderer r3 = r6.mXAxisRenderer
            r3.renderGridLines(r7)
        Led:
            com.github.mikephil.charting.components.YAxis r3 = r6.mAxisLeft
            boolean r3 = r3.isDrawGridLinesBehindDataEnabled()
            if (r3 != 0) goto Lfa
            com.github.mikephil.charting.renderer.YAxisRenderer r3 = r6.mAxisRendererLeft
            r3.renderGridLines(r7)
        Lfa:
            com.github.mikephil.charting.components.YAxis r3 = r6.mAxisRight
            boolean r3 = r3.isDrawGridLinesBehindDataEnabled()
            if (r3 != 0) goto L107
            com.github.mikephil.charting.renderer.YAxisRenderer r3 = r6.mAxisRendererRight
            r3.renderGridLines(r7)
        L107:
            boolean r3 = r6.valuesToHighlight()
            if (r3 == 0) goto L114
            com.github.mikephil.charting.renderer.DataRenderer r3 = r6.mRenderer
            com.github.mikephil.charting.highlight.Highlight[] r4 = r6.mIndicesToHighlight
            r3.drawHighlighted(r7, r4)
        L114:
            r7.restoreToCount(r2)
            com.github.mikephil.charting.renderer.DataRenderer r2 = r6.mRenderer
            r2.drawExtras(r7)
            com.github.mikephil.charting.components.XAxis r2 = r6.mXAxis
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L131
            com.github.mikephil.charting.components.XAxis r2 = r6.mXAxis
            boolean r2 = r2.isDrawLimitLinesBehindDataEnabled()
            if (r2 != 0) goto L131
            com.github.mikephil.charting.renderer.XAxisRenderer r2 = r6.mXAxisRenderer
            r2.renderLimitLines(r7)
        L131:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisLeft
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L146
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisLeft
            boolean r2 = r2.isDrawLimitLinesBehindDataEnabled()
            if (r2 != 0) goto L146
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererLeft
            r2.renderLimitLines(r7)
        L146:
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisRight
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L15b
            com.github.mikephil.charting.components.YAxis r2 = r6.mAxisRight
            boolean r2 = r2.isDrawLimitLinesBehindDataEnabled()
            if (r2 != 0) goto L15b
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererRight
            r2.renderLimitLines(r7)
        L15b:
            com.github.mikephil.charting.renderer.XAxisRenderer r2 = r6.mXAxisRenderer
            r2.renderAxisLabels(r7)
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererLeft
            r2.renderAxisLabels(r7)
            com.github.mikephil.charting.renderer.YAxisRenderer r2 = r6.mAxisRendererRight
            r2.renderAxisLabels(r7)
            boolean r2 = r6.isClipValuesToContentEnabled()
            if (r2 == 0) goto L186
            int r2 = r7.save()
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r6.mViewPortHandler
            android.graphics.RectF r3 = r3.getContentRect()
            r7.clipRect(r3)
            com.github.mikephil.charting.renderer.DataRenderer r3 = r6.mRenderer
            r3.drawValues(r7)
            r7.restoreToCount(r2)
            goto L18b
        L186:
            com.github.mikephil.charting.renderer.DataRenderer r2 = r6.mRenderer
            r2.drawValues(r7)
        L18b:
            com.github.mikephil.charting.renderer.LegendRenderer r2 = r6.mLegendRenderer
            r2.renderLegend(r7)
            r6.drawDescription(r7)
            r6.drawMarkers(r7)
            boolean r7 = r6.mLogEnabled
            if (r7 == 0) goto L1ac
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r0 = r6.totalTime
            long r0 = r0 + r2
            r6.totalTime = r0
            long r2 = r6.drawCycles
            r4 = 1
            long r2 = r2 + r4
            r6.drawCycles = r2
            long r0 = r0 / r2
        L1ac:
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onSizeChanged(int r5, int r6, int r7, int r8) {
            r4 = this;
            float[] r0 = r4.mOnSizeChangedBuffer
            r1 = 1
            r2 = 0
            r0[r1] = r2
            r3 = 0
            r0[r3] = r2
            boolean r2 = r4.mKeepPositionOnRotation
            if (r2 == 0) goto L2a
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.contentLeft()
            r0[r3] = r2
            float[] r0 = r4.mOnSizeChangedBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.contentTop()
            r0[r1] = r2
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r0 = r4.getTransformer(r0)
            float[] r2 = r4.mOnSizeChangedBuffer
            r0.pixelsToValue(r2)
        L2a:
            super.onSizeChanged(r5, r6, r7, r8)
            boolean r5 = r4.mKeepPositionOnRotation
            if (r5 == 0) goto L44
            com.github.mikephil.charting.components.YAxis$AxisDependency r5 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r5 = r4.getTransformer(r5)
            float[] r6 = r4.mOnSizeChangedBuffer
            r5.pointValuesToPixel(r6)
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r4.mViewPortHandler
            float[] r6 = r4.mOnSizeChangedBuffer
            r5.centerViewPort(r6, r4)
            return
        L44:
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r4.mViewPortHandler
            android.graphics.Matrix r6 = r5.getMatrixTouch()
            r5.refresh(r6, r4, r1)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            super.onTouchEvent(r4)
            com.github.mikephil.charting.listener.ChartTouchListener r0 = r3.mChartTouchListener
            r1 = 0
            if (r0 == 0) goto L17
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r3.mData
            if (r2 != 0) goto Ld
            goto L17
        Ld:
            boolean r2 = r3.mTouchEnabled
            if (r2 != 0) goto L12
            return r1
        L12:
            boolean r4 = r0.onTouch(r3, r4)
            return r4
        L17:
            return r1
    }

    protected void prepareOffsetMatrix() {
            r2 = this;
            com.github.mikephil.charting.utils.Transformer r0 = r2.mRightAxisTransformer
            com.github.mikephil.charting.components.YAxis r1 = r2.mAxisRight
            boolean r1 = r1.isInverted()
            r0.prepareMatrixOffset(r1)
            com.github.mikephil.charting.utils.Transformer r0 = r2.mLeftAxisTransformer
            com.github.mikephil.charting.components.YAxis r1 = r2.mAxisLeft
            boolean r1 = r1.isInverted()
            r0.prepareMatrixOffset(r1)
            return
    }

    protected void prepareValuePxMatrix() {
            r5 = this;
            boolean r0 = r5.mLogEnabled
            if (r0 == 0) goto Lc
            com.github.mikephil.charting.components.XAxis r0 = r5.mXAxis
            float r1 = r0.mAxisMinimum
            float r1 = r0.mAxisMaximum
            float r0 = r0.mAxisRange
        Lc:
            com.github.mikephil.charting.utils.Transformer r0 = r5.mRightAxisTransformer
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            float r2 = r1.mAxisMinimum
            float r1 = r1.mAxisRange
            com.github.mikephil.charting.components.YAxis r3 = r5.mAxisRight
            float r4 = r3.mAxisRange
            float r3 = r3.mAxisMinimum
            r0.prepareMatrixValuePx(r2, r1, r4, r3)
            com.github.mikephil.charting.utils.Transformer r0 = r5.mLeftAxisTransformer
            com.github.mikephil.charting.components.XAxis r1 = r5.mXAxis
            float r2 = r1.mAxisMinimum
            float r1 = r1.mAxisRange
            com.github.mikephil.charting.components.YAxis r3 = r5.mAxisLeft
            float r4 = r3.mAxisRange
            float r3 = r3.mAxisMinimum
            r0.prepareMatrixValuePx(r2, r1, r4, r3)
            return
    }

    public void resetTracking() {
            r2 = this;
            r0 = 0
            r2.totalTime = r0
            r2.drawCycles = r0
            return
    }

    public void resetViewPortOffsets() {
            r1 = this;
            r0 = 0
            r1.mCustomViewPortEnabled = r0
            r1.calculateOffsets()
            return
    }

    public void resetZoom() {
            r3 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            android.graphics.Matrix r1 = r3.mZoomMatrixBuffer
            r0.resetZoom(r1)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            android.graphics.Matrix r1 = r3.mZoomMatrixBuffer
            r2 = 0
            r0.refresh(r1, r3, r2)
            r3.calculateOffsets()
            r3.postInvalidate()
            return
    }

    public void setAutoScaleMinMaxEnabled(boolean r1) {
            r0 = this;
            r0.mAutoScaleMinMaxEnabled = r1
            return
    }

    public void setBorderColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mBorderPaint
            r0.setColor(r2)
            return
    }

    public void setBorderWidth(float r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mBorderPaint
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r0.setStrokeWidth(r2)
            return
    }

    public void setClipValuesToContent(boolean r1) {
            r0 = this;
            r0.mClipValuesToContent = r1
            return
    }

    public void setDoubleTapToZoomEnabled(boolean r1) {
            r0 = this;
            r0.mDoubleTapToZoomEnabled = r1
            return
    }

    public void setDragEnabled(boolean r1) {
            r0 = this;
            r0.mDragXEnabled = r1
            r0.mDragYEnabled = r1
            return
    }

    public void setDragOffsetX(float r2) {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            r0.setDragOffsetX(r2)
            return
    }

    public void setDragOffsetY(float r2) {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            r0.setDragOffsetY(r2)
            return
    }

    public void setDragXEnabled(boolean r1) {
            r0 = this;
            r0.mDragXEnabled = r1
            return
    }

    public void setDragYEnabled(boolean r1) {
            r0 = this;
            r0.mDragYEnabled = r1
            return
    }

    public void setDrawBorders(boolean r1) {
            r0 = this;
            r0.mDrawBorders = r1
            return
    }

    public void setDrawGridBackground(boolean r1) {
            r0 = this;
            r0.mDrawGridBackground = r1
            return
    }

    public void setGridBackgroundColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mGridBackgroundPaint
            r0.setColor(r2)
            return
    }

    public void setHighlightPerDragEnabled(boolean r1) {
            r0 = this;
            r0.mHighlightPerDragEnabled = r1
            return
    }

    public void setKeepPositionOnRotation(boolean r1) {
            r0 = this;
            r0.mKeepPositionOnRotation = r1
            return
    }

    public void setMaxVisibleValueCount(int r1) {
            r0 = this;
            r0.mMaxVisibleCount = r1
            return
    }

    public void setMinOffset(float r1) {
            r0 = this;
            r0.mMinOffset = r1
            return
    }

    public void setOnDrawListener(com.github.mikephil.charting.listener.OnDrawListener r1) {
            r0 = this;
            r0.mDrawListener = r1
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setPaint(android.graphics.Paint r2, int r3) {
            r1 = this;
            super.setPaint(r2, r3)
            r0 = 4
            if (r3 == r0) goto L7
            return
        L7:
            r1.mGridBackgroundPaint = r2
            return
    }

    public void setPinchZoom(boolean r1) {
            r0 = this;
            r0.mPinchZoomEnabled = r1
            return
    }

    public void setRendererLeftYAxis(com.github.mikephil.charting.renderer.YAxisRenderer r1) {
            r0 = this;
            r0.mAxisRendererLeft = r1
            return
    }

    public void setRendererRightYAxis(com.github.mikephil.charting.renderer.YAxisRenderer r1) {
            r0 = this;
            r0.mAxisRendererRight = r1
            return
    }

    public void setScaleEnabled(boolean r1) {
            r0 = this;
            r0.mScaleXEnabled = r1
            r0.mScaleYEnabled = r1
            return
    }

    public void setScaleMinima(float r2, float r3) {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            r0.setMinimumScaleX(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r1.mViewPortHandler
            r2.setMinimumScaleY(r3)
            return
    }

    public void setScaleXEnabled(boolean r1) {
            r0 = this;
            r0.mScaleXEnabled = r1
            return
    }

    public void setScaleYEnabled(boolean r1) {
            r0 = this;
            r0.mScaleYEnabled = r1
            return
    }

    public void setViewPortOffsets(float r8, float r9, float r10, float r11) {
            r7 = this;
            r0 = 1
            r7.mCustomViewPortEnabled = r0
            com.github.mikephil.charting.charts.BarLineChartBase$1 r1 = new com.github.mikephil.charting.charts.BarLineChartBase$1
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.post(r1)
            return
    }

    public void setVisibleXRange(float r2, float r3) {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisRange
            float r2 = r0 / r2
            float r0 = r0 / r3
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            r3.setMinMaxScaleX(r2, r0)
            return
    }

    public void setVisibleXRangeMaximum(float r2) {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisRange
            float r0 = r0 / r2
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r1.mViewPortHandler
            r2.setMinimumScaleX(r0)
            return
    }

    public void setVisibleXRangeMinimum(float r2) {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisRange
            float r0 = r0 / r2
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r1.mViewPortHandler
            r2.setMaximumScaleX(r0)
            return
    }

    public void setVisibleYRange(float r2, float r3, com.github.mikephil.charting.components.YAxis.AxisDependency r4) {
            r1 = this;
            float r0 = r1.getAxisRange(r4)
            float r0 = r0 / r2
            float r2 = r1.getAxisRange(r4)
            float r2 = r2 / r3
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            r3.setMinMaxScaleY(r0, r2)
            return
    }

    public void setVisibleYRangeMaximum(float r1, com.github.mikephil.charting.components.YAxis.AxisDependency r2) {
            r0 = this;
            float r2 = r0.getAxisRange(r2)
            float r2 = r2 / r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            r1.setMinimumScaleY(r2)
            return
    }

    public void setVisibleYRangeMinimum(float r1, com.github.mikephil.charting.components.YAxis.AxisDependency r2) {
            r0 = this;
            float r2 = r0.getAxisRange(r2)
            float r2 = r2 / r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            r1.setMaximumScaleY(r2)
            return
    }

    public void setXAxisRenderer(com.github.mikephil.charting.renderer.XAxisRenderer r1) {
            r0 = this;
            r0.mXAxisRenderer = r1
            return
    }

    public void zoom(float r7, float r8, float r9, float r10) {
            r6 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float r4 = -r10
            android.graphics.Matrix r5 = r6.mZoomMatrixBuffer
            r1 = r7
            r2 = r8
            r3 = r9
            r0.zoom(r1, r2, r3, r4, r5)
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r6.mViewPortHandler
            android.graphics.Matrix r8 = r6.mZoomMatrixBuffer
            r9 = 0
            r7.refresh(r8, r6, r9)
            r6.calculateOffsets()
            r6.postInvalidate()
            return
    }

    public void zoom(float r9, float r10, float r11, float r12, com.github.mikephil.charting.components.YAxis.AxisDependency r13) {
            r8 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r8.mViewPortHandler
            com.github.mikephil.charting.utils.Transformer r5 = r8.getTransformer(r13)
            r7 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            com.github.mikephil.charting.jobs.ZoomJob r9 = com.github.mikephil.charting.jobs.ZoomJob.getInstance(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.addViewportJob(r9)
            return
    }

    @android.annotation.TargetApi(11)
    public void zoomAndCenterAnimated(float r17, float r18, float r19, float r20, com.github.mikephil.charting.components.YAxis.AxisDependency r21, long r22) {
            r16 = this;
            r1 = r16
            r0 = r21
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r1.mViewPortHandler
            float r2 = r2.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            float r3 = r3.contentTop()
            com.github.mikephil.charting.utils.MPPointD r15 = r1.getValuesByTouchPoint(r2, r3, r0)
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r1.mViewPortHandler
            r3 = r2
            com.github.mikephil.charting.utils.Transformer r2 = r1.getTransformer(r0)
            com.github.mikephil.charting.components.YAxis r0 = r1.getAxis(r0)
            com.github.mikephil.charting.components.XAxis r4 = r1.mXAxis
            float r4 = r4.mAxisRange
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r1.mViewPortHandler
            float r7 = r5.getScaleX()
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r1.mViewPortHandler
            float r8 = r5.getScaleY()
            double r5 = r15.x
            float r11 = (float) r5
            double r5 = r15.y
            float r12 = (float) r5
            r5 = r3
            r3 = r0
            r0 = r5
            r5 = r17
            r6 = r18
            r9 = r19
            r10 = r20
            r13 = r22
            com.github.mikephil.charting.jobs.AnimatedZoomJob r0 = com.github.mikephil.charting.jobs.AnimatedZoomJob.getInstance(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.addViewportJob(r0)
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r15)
            return
    }

    public void zoomIn() {
            r5 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r5.mViewPortHandler
            com.github.mikephil.charting.utils.MPPointF r0 = r0.getContentCenter()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r5.mViewPortHandler
            float r2 = r0.x
            float r3 = r0.y
            float r3 = -r3
            android.graphics.Matrix r4 = r5.mZoomMatrixBuffer
            r1.zoomIn(r2, r3, r4)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r5.mViewPortHandler
            android.graphics.Matrix r2 = r5.mZoomMatrixBuffer
            r3 = 0
            r1.refresh(r2, r5, r3)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r0)
            r5.calculateOffsets()
            r5.postInvalidate()
            return
    }

    public void zoomOut() {
            r5 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r5.mViewPortHandler
            com.github.mikephil.charting.utils.MPPointF r0 = r0.getContentCenter()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r5.mViewPortHandler
            float r2 = r0.x
            float r3 = r0.y
            float r3 = -r3
            android.graphics.Matrix r4 = r5.mZoomMatrixBuffer
            r1.zoomOut(r2, r3, r4)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r5.mViewPortHandler
            android.graphics.Matrix r2 = r5.mZoomMatrixBuffer
            r3 = 0
            r1.refresh(r2, r5, r3)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r0)
            r5.calculateOffsets()
            r5.postInvalidate()
            return
    }

    public void zoomToCenter(float r8, float r9) {
            r7 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r7.getCenterOffsets()
            android.graphics.Matrix r6 = r7.mZoomMatrixBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r4 = r0.x
            float r0 = r0.y
            float r5 = -r0
            r2 = r8
            r3 = r9
            r1.zoom(r2, r3, r4, r5, r6)
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r7.mViewPortHandler
            r9 = 0
            r8.refresh(r6, r7, r9)
            return
    }
}

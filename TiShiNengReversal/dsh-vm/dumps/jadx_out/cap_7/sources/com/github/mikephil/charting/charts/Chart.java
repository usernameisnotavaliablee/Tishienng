package com.github.mikephil.charting.charts;

import com.github.mikephil.charting.data.ChartData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class Chart<T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>>> extends android.view.ViewGroup implements com.github.mikephil.charting.interfaces.dataprovider.ChartInterface {
    public static final java.lang.String LOG_TAG = "MPAndroidChart";
    public static final int PAINT_CENTER_TEXT = 14;
    public static final int PAINT_DESCRIPTION = 11;
    public static final int PAINT_GRID_BACKGROUND = 4;
    public static final int PAINT_HOLE = 13;
    public static final int PAINT_INFO = 7;
    public static final int PAINT_LEGEND_LABEL = 18;
    protected com.github.mikephil.charting.animation.ChartAnimator mAnimator;
    protected com.github.mikephil.charting.listener.ChartTouchListener mChartTouchListener;
    protected T mData;
    protected com.github.mikephil.charting.formatter.DefaultValueFormatter mDefaultValueFormatter;
    protected android.graphics.Paint mDescPaint;
    protected com.github.mikephil.charting.components.Description mDescription;
    private boolean mDragDecelerationEnabled;
    private float mDragDecelerationFrictionCoef;
    protected boolean mDrawMarkers;
    private float mExtraBottomOffset;
    private float mExtraLeftOffset;
    private float mExtraRightOffset;
    private float mExtraTopOffset;
    private com.github.mikephil.charting.listener.OnChartGestureListener mGestureListener;
    protected boolean mHighLightPerTapEnabled;
    protected com.github.mikephil.charting.highlight.IHighlighter mHighlighter;
    protected com.github.mikephil.charting.highlight.Highlight[] mIndicesToHighlight;
    protected android.graphics.Paint mInfoPaint;
    protected java.util.ArrayList<java.lang.Runnable> mJobs;
    protected com.github.mikephil.charting.components.Legend mLegend;
    protected com.github.mikephil.charting.renderer.LegendRenderer mLegendRenderer;
    protected boolean mLogEnabled;
    protected com.github.mikephil.charting.components.IMarker mMarker;
    protected float mMaxHighlightDistance;
    private java.lang.String mNoDataText;
    private boolean mOffsetsCalculated;
    protected com.github.mikephil.charting.renderer.DataRenderer mRenderer;
    protected com.github.mikephil.charting.listener.OnChartValueSelectedListener mSelectionListener;
    protected boolean mTouchEnabled;
    private boolean mUnbind;
    protected com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler;
    protected com.github.mikephil.charting.components.XAxis mXAxis;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.charts.Chart$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat = null;

        static {
                android.graphics.Bitmap$CompressFormat[] r0 = android.graphics.Bitmap.CompressFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.charts.Chart.AnonymousClass2.$SwitchMap$android$graphics$Bitmap$CompressFormat = r0
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.github.mikephil.charting.charts.Chart.AnonymousClass2.$SwitchMap$android$graphics$Bitmap$CompressFormat     // Catch: java.lang.NoSuchFieldError -> L1d
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.github.mikephil.charting.charts.Chart.AnonymousClass2.$SwitchMap$android$graphics$Bitmap$CompressFormat     // Catch: java.lang.NoSuchFieldError -> L28
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public Chart(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.mLogEnabled = r3
            r0 = 0
            r2.mData = r0
            r0 = 1
            r2.mHighLightPerTapEnabled = r0
            r2.mDragDecelerationEnabled = r0
            r1 = 1063675494(0x3f666666, float:0.9)
            r2.mDragDecelerationFrictionCoef = r1
            com.github.mikephil.charting.formatter.DefaultValueFormatter r1 = new com.github.mikephil.charting.formatter.DefaultValueFormatter
            r1.<init>(r3)
            r2.mDefaultValueFormatter = r1
            r2.mTouchEnabled = r0
            java.lang.String r1 = "No chart data available."
            r2.mNoDataText = r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = new com.github.mikephil.charting.utils.ViewPortHandler
            r1.<init>()
            r2.mViewPortHandler = r1
            r1 = 0
            r2.mExtraTopOffset = r1
            r2.mExtraRightOffset = r1
            r2.mExtraBottomOffset = r1
            r2.mExtraLeftOffset = r1
            r2.mOffsetsCalculated = r3
            r2.mMaxHighlightDistance = r1
            r2.mDrawMarkers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mJobs = r0
            r2.mUnbind = r3
            r2.init()
            return
    }

    public Chart(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1.mLogEnabled = r2
            r3 = 0
            r1.mData = r3
            r3 = 1
            r1.mHighLightPerTapEnabled = r3
            r1.mDragDecelerationEnabled = r3
            r0 = 1063675494(0x3f666666, float:0.9)
            r1.mDragDecelerationFrictionCoef = r0
            com.github.mikephil.charting.formatter.DefaultValueFormatter r0 = new com.github.mikephil.charting.formatter.DefaultValueFormatter
            r0.<init>(r2)
            r1.mDefaultValueFormatter = r0
            r1.mTouchEnabled = r3
            java.lang.String r0 = "No chart data available."
            r1.mNoDataText = r0
            com.github.mikephil.charting.utils.ViewPortHandler r0 = new com.github.mikephil.charting.utils.ViewPortHandler
            r0.<init>()
            r1.mViewPortHandler = r0
            r0 = 0
            r1.mExtraTopOffset = r0
            r1.mExtraRightOffset = r0
            r1.mExtraBottomOffset = r0
            r1.mExtraLeftOffset = r0
            r1.mOffsetsCalculated = r2
            r1.mMaxHighlightDistance = r0
            r1.mDrawMarkers = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.mJobs = r3
            r1.mUnbind = r2
            r1.init()
            return
    }

    public Chart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mLogEnabled = r1
            r2 = 0
            r0.mData = r2
            r2 = 1
            r0.mHighLightPerTapEnabled = r2
            r0.mDragDecelerationEnabled = r2
            r3 = 1063675494(0x3f666666, float:0.9)
            r0.mDragDecelerationFrictionCoef = r3
            com.github.mikephil.charting.formatter.DefaultValueFormatter r3 = new com.github.mikephil.charting.formatter.DefaultValueFormatter
            r3.<init>(r1)
            r0.mDefaultValueFormatter = r3
            r0.mTouchEnabled = r2
            java.lang.String r3 = "No chart data available."
            r0.mNoDataText = r3
            com.github.mikephil.charting.utils.ViewPortHandler r3 = new com.github.mikephil.charting.utils.ViewPortHandler
            r3.<init>()
            r0.mViewPortHandler = r3
            r3 = 0
            r0.mExtraTopOffset = r3
            r0.mExtraRightOffset = r3
            r0.mExtraBottomOffset = r3
            r0.mExtraLeftOffset = r3
            r0.mOffsetsCalculated = r1
            r0.mMaxHighlightDistance = r3
            r0.mDrawMarkers = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mJobs = r2
            r0.mUnbind = r1
            r0.init()
            return
    }

    private void unbindDrawables(android.view.View r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r1 = 0
            r0.setCallback(r1)
        Le:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L29
            r0 = 0
        L13:
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L26
            android.view.View r1 = r1.getChildAt(r0)
            r3.unbindDrawables(r1)
            int r0 = r0 + 1
            goto L13
        L26:
            r1.removeAllViews()
        L29:
            return
    }

    public void addViewportJob(java.lang.Runnable r2) {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            boolean r0 = r0.hasChartDimens()
            if (r0 == 0) goto Lc
            r1.post(r2)
            return
        Lc:
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mJobs
            r0.add(r2)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateX(int r2) {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            r0.animateX(r2)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateX(int r2, com.github.mikephil.charting.animation.Easing.EasingFunction r3) {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            r0.animateX(r2, r3)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateXY(int r2, int r3) {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            r0.animateXY(r2, r3)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateXY(int r2, int r3, com.github.mikephil.charting.animation.Easing.EasingFunction r4) {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            r0.animateXY(r2, r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateXY(int r2, int r3, com.github.mikephil.charting.animation.Easing.EasingFunction r4, com.github.mikephil.charting.animation.Easing.EasingFunction r5) {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            r0.animateXY(r2, r3, r4, r5)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateY(int r2) {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            r0.animateY(r2)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateY(int r2, com.github.mikephil.charting.animation.Easing.EasingFunction r3) {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            r0.animateY(r2, r3)
            return
    }

    protected abstract void calcMinMax();

    protected abstract void calculateOffsets();

    public void clear() {
            r2 = this;
            r0 = 0
            r2.mData = r0
            r1 = 0
            r2.mOffsetsCalculated = r1
            r2.mIndicesToHighlight = r0
            com.github.mikephil.charting.listener.ChartTouchListener r1 = r2.mChartTouchListener
            r1.setLastHighlighted(r0)
            r2.invalidate()
            return
    }

    public void clearAllViewportJobs() {
            r1 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mJobs
            r0.clear()
            return
    }

    public void clearValues() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            r0.clearValues()
            r1.invalidate()
            return
    }

    public void disableScroll() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto La
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
        La:
            return
    }

    protected void drawDescription(android.graphics.Canvas r6) {
            r5 = this;
            com.github.mikephil.charting.components.Description r0 = r5.mDescription
            if (r0 == 0) goto L77
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L77
            com.github.mikephil.charting.components.Description r0 = r5.mDescription
            com.github.mikephil.charting.utils.MPPointF r0 = r0.getPosition()
            android.graphics.Paint r1 = r5.mDescPaint
            com.github.mikephil.charting.components.Description r2 = r5.mDescription
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r5.mDescPaint
            com.github.mikephil.charting.components.Description r2 = r5.mDescription
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r5.mDescPaint
            com.github.mikephil.charting.components.Description r2 = r5.mDescription
            int r2 = r2.getTextColor()
            r1.setColor(r2)
            android.graphics.Paint r1 = r5.mDescPaint
            com.github.mikephil.charting.components.Description r2 = r5.mDescription
            android.graphics.Paint$Align r2 = r2.getTextAlign()
            r1.setTextAlign(r2)
            if (r0 != 0) goto L65
            int r0 = r5.getWidth()
            float r0 = (float) r0
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r5.mViewPortHandler
            float r1 = r1.offsetRight()
            float r0 = r0 - r1
            com.github.mikephil.charting.components.Description r1 = r5.mDescription
            float r1 = r1.getXOffset()
            float r0 = r0 - r1
            int r1 = r5.getHeight()
            float r1 = (float) r1
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r5.mViewPortHandler
            float r2 = r2.offsetBottom()
            float r1 = r1 - r2
            com.github.mikephil.charting.components.Description r2 = r5.mDescription
            float r2 = r2.getYOffset()
            float r1 = r1 - r2
            goto L6c
        L65:
            float r1 = r0.x
            float r0 = r0.y
            r4 = r1
            r1 = r0
            r0 = r4
        L6c:
            com.github.mikephil.charting.components.Description r2 = r5.mDescription
            java.lang.String r2 = r2.getText()
            android.graphics.Paint r3 = r5.mDescPaint
            r6.drawText(r2, r0, r1, r3)
        L77:
            return
    }

    protected void drawMarkers(android.graphics.Canvas r10) {
            r9 = this;
            com.github.mikephil.charting.components.IMarker r0 = r9.mMarker
            if (r0 == 0) goto L6a
            boolean r0 = r9.isDrawMarkersEnabled()
            if (r0 == 0) goto L6a
            boolean r0 = r9.valuesToHighlight()
            if (r0 != 0) goto L11
            goto L6a
        L11:
            r0 = 0
            r1 = 0
        L13:
            com.github.mikephil.charting.highlight.Highlight[] r2 = r9.mIndicesToHighlight
            int r3 = r2.length
            if (r1 >= r3) goto L6a
            r2 = r2[r1]
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r9.mData
            int r4 = r2.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r3 = r3.getDataSetByIndex(r4)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r4 = r9.mData
            com.github.mikephil.charting.highlight.Highlight[] r5 = r9.mIndicesToHighlight
            r5 = r5[r1]
            com.github.mikephil.charting.data.Entry r4 = r4.getEntryForHighlight(r5)
            int r5 = r3.getEntryIndex(r4)
            if (r4 == 0) goto L67
            float r5 = (float) r5
            int r3 = r3.getEntryCount()
            float r3 = (float) r3
            com.github.mikephil.charting.animation.ChartAnimator r6 = r9.mAnimator
            float r6 = r6.getPhaseX()
            float r3 = r3 * r6
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L47
            goto L67
        L47:
            float[] r3 = r9.getMarkerPosition(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r9.mViewPortHandler
            r6 = r3[r0]
            r7 = 1
            r8 = r3[r7]
            boolean r5 = r5.isInBounds(r6, r8)
            if (r5 != 0) goto L59
            goto L67
        L59:
            com.github.mikephil.charting.components.IMarker r5 = r9.mMarker
            r5.refreshContent(r4, r2)
            com.github.mikephil.charting.components.IMarker r2 = r9.mMarker
            r4 = r3[r0]
            r3 = r3[r7]
            r2.draw(r10, r4, r3)
        L67:
            int r1 = r1 + 1
            goto L13
        L6a:
            return
    }

    public void enableScroll() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto La
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        La:
            return
    }

    public com.github.mikephil.charting.animation.ChartAnimator getAnimator() {
            r1 = this;
            com.github.mikephil.charting.animation.ChartAnimator r0 = r1.mAnimator
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getCenter() {
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r2 = r3.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r1
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0, r2)
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterOfView() {
            r1 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r1.getCenter()
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterOffsets() {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            com.github.mikephil.charting.utils.MPPointF r0 = r0.getContentCenter()
            return r0
    }

    public android.graphics.Bitmap getChartBitmap() {
            r3 = this;
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 == 0) goto L1d
            r2.draw(r1)
            goto L21
        L1d:
            r2 = -1
            r1.drawColor(r2)
        L21:
            r3.draw(r1)
            return r0
    }

    public android.graphics.RectF getContentRect() {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            return r0
    }

    public T getData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            return r0
    }

    public com.github.mikephil.charting.formatter.ValueFormatter getDefaultValueFormatter() {
            r1 = this;
            com.github.mikephil.charting.formatter.DefaultValueFormatter r0 = r1.mDefaultValueFormatter
            return r0
    }

    public com.github.mikephil.charting.components.Description getDescription() {
            r1 = this;
            com.github.mikephil.charting.components.Description r0 = r1.mDescription
            return r0
    }

    public float getDragDecelerationFrictionCoef() {
            r1 = this;
            float r0 = r1.mDragDecelerationFrictionCoef
            return r0
    }

    public float getExtraBottomOffset() {
            r1 = this;
            float r0 = r1.mExtraBottomOffset
            return r0
    }

    public float getExtraLeftOffset() {
            r1 = this;
            float r0 = r1.mExtraLeftOffset
            return r0
    }

    public float getExtraRightOffset() {
            r1 = this;
            float r0 = r1.mExtraRightOffset
            return r0
    }

    public float getExtraTopOffset() {
            r1 = this;
            float r0 = r1.mExtraTopOffset
            return r0
    }

    public com.github.mikephil.charting.highlight.Highlight getHighlightByTouchPoint(float r2, float r3) {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.github.mikephil.charting.highlight.IHighlighter r0 = r1.getHighlighter()
            com.github.mikephil.charting.highlight.Highlight r2 = r0.getHighlight(r2, r3)
            return r2
    }

    public com.github.mikephil.charting.highlight.Highlight[] getHighlighted() {
            r1 = this;
            com.github.mikephil.charting.highlight.Highlight[] r0 = r1.mIndicesToHighlight
            return r0
    }

    public com.github.mikephil.charting.highlight.IHighlighter getHighlighter() {
            r1 = this;
            com.github.mikephil.charting.highlight.IHighlighter r0 = r1.mHighlighter
            return r0
    }

    public java.util.ArrayList<java.lang.Runnable> getJobs() {
            r1 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mJobs
            return r0
    }

    public com.github.mikephil.charting.components.Legend getLegend() {
            r1 = this;
            com.github.mikephil.charting.components.Legend r0 = r1.mLegend
            return r0
    }

    public com.github.mikephil.charting.renderer.LegendRenderer getLegendRenderer() {
            r1 = this;
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r1.mLegendRenderer
            return r0
    }

    public com.github.mikephil.charting.components.IMarker getMarker() {
            r1 = this;
            com.github.mikephil.charting.components.IMarker r0 = r1.mMarker
            return r0
    }

    protected float[] getMarkerPosition(com.github.mikephil.charting.highlight.Highlight r4) {
            r3 = this;
            float r0 = r4.getDrawX()
            float r4 = r4.getDrawY()
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            return r1
    }

    @java.lang.Deprecated
    public com.github.mikephil.charting.components.IMarker getMarkerView() {
            r1 = this;
            com.github.mikephil.charting.components.IMarker r0 = r1.getMarker()
            return r0
    }

    public float getMaxHighlightDistance() {
            r1 = this;
            float r0 = r1.mMaxHighlightDistance
            return r0
    }

    public com.github.mikephil.charting.listener.OnChartGestureListener getOnChartGestureListener() {
            r1 = this;
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r1.mGestureListener
            return r0
    }

    public com.github.mikephil.charting.listener.ChartTouchListener getOnTouchListener() {
            r1 = this;
            com.github.mikephil.charting.listener.ChartTouchListener r0 = r1.mChartTouchListener
            return r0
    }

    public android.graphics.Paint getPaint(int r2) {
            r1 = this;
            r0 = 7
            if (r2 == r0) goto Lc
            r0 = 11
            if (r2 == r0) goto L9
            r2 = 0
            return r2
        L9:
            android.graphics.Paint r2 = r1.mDescPaint
            return r2
        Lc:
            android.graphics.Paint r2 = r1.mInfoPaint
            return r2
    }

    public com.github.mikephil.charting.renderer.DataRenderer getRenderer() {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            return r0
    }

    public com.github.mikephil.charting.utils.ViewPortHandler getViewPortHandler() {
            r1 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r1.mViewPortHandler
            return r0
    }

    public com.github.mikephil.charting.components.XAxis getXAxis() {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            return r0
    }

    public float getXChartMax() {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisMaximum
            return r0
    }

    public float getXChartMin() {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisMinimum
            return r0
    }

    public float getXRange() {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisRange
            return r0
    }

    public float getYMax() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            float r0 = r0.getYMax()
            return r0
    }

    public float getYMin() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            float r0 = r0.getYMin()
            return r0
    }

    public void highlightValue(float r2, float r3, int r4) {
            r1 = this;
            r0 = 1
            r1.highlightValue(r2, r3, r4, r0)
            return
    }

    public void highlightValue(float r2, float r3, int r4, boolean r5) {
            r1 = this;
            if (r4 < 0) goto L14
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            int r0 = r0.getDataSetCount()
            if (r4 < r0) goto Lb
            goto L14
        Lb:
            com.github.mikephil.charting.highlight.Highlight r0 = new com.github.mikephil.charting.highlight.Highlight
            r0.<init>(r2, r3, r4)
            r1.highlightValue(r0, r5)
            return
        L14:
            r2 = 0
            r1.highlightValue(r2, r5)
            return
    }

    public void highlightValue(float r2, int r3) {
            r1 = this;
            r0 = 1
            r1.highlightValue(r2, r3, r0)
            return
    }

    public void highlightValue(float r2, int r3, boolean r4) {
            r1 = this;
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.highlightValue(r2, r0, r3, r4)
            return
    }

    public void highlightValue(com.github.mikephil.charting.highlight.Highlight r2) {
            r1 = this;
            r0 = 0
            r1.highlightValue(r2, r0)
            return
    }

    public void highlightValue(com.github.mikephil.charting.highlight.Highlight r4, boolean r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L6
            r3.mIndicesToHighlight = r0
            goto L23
        L6:
            boolean r1 = r3.mLogEnabled
            if (r1 == 0) goto Ld
            r4.toString()
        Ld:
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r3.mData
            com.github.mikephil.charting.data.Entry r1 = r1.getEntryForHighlight(r4)
            if (r1 != 0) goto L1a
            r3.mIndicesToHighlight = r0
            r4 = r0
        L18:
            r0 = r1
            goto L23
        L1a:
            r0 = 1
            com.github.mikephil.charting.highlight.Highlight[] r0 = new com.github.mikephil.charting.highlight.Highlight[r0]
            r2 = 0
            r0[r2] = r4
            r3.mIndicesToHighlight = r0
            goto L18
        L23:
            com.github.mikephil.charting.highlight.Highlight[] r1 = r3.mIndicesToHighlight
            r3.setLastHighlighted(r1)
            if (r5 == 0) goto L3f
            com.github.mikephil.charting.listener.OnChartValueSelectedListener r5 = r3.mSelectionListener
            if (r5 == 0) goto L3f
            boolean r5 = r3.valuesToHighlight()
            if (r5 != 0) goto L3a
            com.github.mikephil.charting.listener.OnChartValueSelectedListener r4 = r3.mSelectionListener
            r4.onNothingSelected()
            goto L3f
        L3a:
            com.github.mikephil.charting.listener.OnChartValueSelectedListener r5 = r3.mSelectionListener
            r5.onValueSelected(r0, r4)
        L3f:
            r3.invalidate()
            return
    }

    public void highlightValues(com.github.mikephil.charting.highlight.Highlight[] r1) {
            r0 = this;
            r0.mIndicesToHighlight = r1
            r0.setLastHighlighted(r1)
            r0.invalidate()
            return
    }

    protected void init() {
            r4 = this;
            r0 = 0
            r4.setWillNotDraw(r0)
            com.github.mikephil.charting.animation.ChartAnimator r0 = new com.github.mikephil.charting.animation.ChartAnimator
            com.github.mikephil.charting.charts.Chart$1 r1 = new com.github.mikephil.charting.charts.Chart$1
            r1.<init>(r4)
            r0.<init>(r1)
            r4.mAnimator = r0
            android.content.Context r0 = r4.getContext()
            com.github.mikephil.charting.utils.Utils.init(r0)
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r4.mMaxHighlightDistance = r0
            com.github.mikephil.charting.components.Description r0 = new com.github.mikephil.charting.components.Description
            r0.<init>()
            r4.mDescription = r0
            com.github.mikephil.charting.components.Legend r0 = new com.github.mikephil.charting.components.Legend
            r0.<init>()
            r4.mLegend = r0
            com.github.mikephil.charting.renderer.LegendRenderer r1 = new com.github.mikephil.charting.renderer.LegendRenderer
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            r1.<init>(r2, r0)
            r4.mLegendRenderer = r1
            com.github.mikephil.charting.components.XAxis r0 = new com.github.mikephil.charting.components.XAxis
            r0.<init>()
            r4.mXAxis = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r4.mDescPaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r4.mInfoPaint = r0
            r1 = 189(0xbd, float:2.65E-43)
            r2 = 51
            r3 = 247(0xf7, float:3.46E-43)
            int r1 = android.graphics.Color.rgb(r3, r1, r2)
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.mInfoPaint
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            android.graphics.Paint r0 = r4.mInfoPaint
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.setTextSize(r1)
            return
    }

    public boolean isDragDecelerationEnabled() {
            r1 = this;
            boolean r0 = r1.mDragDecelerationEnabled
            return r0
    }

    @java.lang.Deprecated
    public boolean isDrawMarkerViewsEnabled() {
            r1 = this;
            boolean r0 = r1.isDrawMarkersEnabled()
            return r0
    }

    public boolean isDrawMarkersEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawMarkers
            return r0
    }

    public boolean isEmpty() {
            r2 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mData
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.getEntryCount()
            if (r0 > 0) goto Ld
            return r1
        Ld:
            r0 = 0
            return r0
    }

    public boolean isHighlightPerTapEnabled() {
            r1 = this;
            boolean r0 = r1.mHighLightPerTapEnabled
            return r0
    }

    public boolean isLogEnabled() {
            r1 = this;
            boolean r0 = r1.mLogEnabled
            return r0
    }

    public abstract void notifyDataSetChanged();

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            boolean r0 = r1.mUnbind
            if (r0 == 0) goto La
            r1.unbindDrawables(r1)
        La:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mData
            if (r0 != 0) goto L1c
            java.lang.String r0 = r4.mNoDataText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            com.github.mikephil.charting.utils.MPPointF r0 = r4.getCenter()
            java.lang.String r1 = r4.mNoDataText
            float r2 = r0.x
            float r0 = r0.y
            android.graphics.Paint r3 = r4.mInfoPaint
            r5.drawText(r1, r2, r0, r3)
            return
        L1c:
            boolean r5 = r4.mOffsetsCalculated
            if (r5 != 0) goto L26
            r4.calculateOffsets()
            r5 = 1
            r4.mOffsetsCalculated = r5
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r2 = 0
        L1:
            int r0 = r1.getChildCount()
            if (r2 >= r0) goto L11
            android.view.View r0 = r1.getChildAt(r2)
            r0.layout(r3, r4, r5, r6)
            int r2 = r2 + 1
            goto L1
        L11:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            r0 = 1112014848(0x42480000, float:50.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            int r0 = (int) r0
            int r1 = r2.getSuggestedMinimumWidth()
            int r3 = android.view.View.resolveSize(r0, r3)
            int r3 = java.lang.Math.max(r1, r3)
            int r1 = r2.getSuggestedMinimumHeight()
            int r4 = android.view.View.resolveSize(r0, r4)
            int r4 = java.lang.Math.max(r1, r4)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r4, int r5, int r6, int r7) {
            r3 = this;
            if (r4 <= 0) goto L11
            if (r5 <= 0) goto L11
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r4 >= r0) goto L11
            if (r5 >= r0) goto L11
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            float r1 = (float) r4
            float r2 = (float) r5
            r0.setChartDimens(r1, r2)
        L11:
            r3.notifyDataSetChanged()
            java.util.ArrayList<java.lang.Runnable> r0 = r3.mJobs
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r3.post(r1)
            goto L1a
        L2a:
            java.util.ArrayList<java.lang.Runnable> r0 = r3.mJobs
            r0.clear()
            super.onSizeChanged(r4, r5, r6, r7)
            return
    }

    public void removeViewportJob(java.lang.Runnable r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mJobs
            r0.remove(r2)
            return
    }

    public boolean saveToGallery(java.lang.String r7) {
            r6 = this;
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            r5 = 40
            java.lang.String r2 = ""
            java.lang.String r3 = "MPAndroidChart-Library Save"
            r0 = r6
            r1 = r7
            boolean r7 = r0.saveToGallery(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean saveToGallery(java.lang.String r7, int r8) {
            r6 = this;
            java.lang.String r3 = "MPAndroidChart-Library Save"
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            java.lang.String r2 = ""
            r0 = r6
            r1 = r7
            r5 = r8
            boolean r7 = r0.saveToGallery(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean saveToGallery(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.graphics.Bitmap.CompressFormat r11, int r12) {
            r7 = this;
            if (r12 < 0) goto L6
            r0 = 100
            if (r12 <= r0) goto L8
        L6:
            r12 = 50
        L8:
            long r0 = java.lang.System.currentTimeMillis()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.getAbsolutePath()
            r4.append(r2)
            java.lang.String r2 = "/DCIM/"
            r4.append(r2)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            r3.<init>(r9)
            boolean r9 = r3.exists()
            r2 = 0
            if (r9 != 0) goto L3b
            boolean r9 = r3.mkdirs()
            if (r9 != 0) goto L3b
            return r2
        L3b:
            int[] r9 = com.github.mikephil.charting.charts.Chart.AnonymousClass2.$SwitchMap$android$graphics$Bitmap$CompressFormat
            int r4 = r11.ordinal()
            r9 = r9[r4]
            r4 = 1
            if (r9 == r4) goto L85
            r5 = 2
            if (r9 == r5) goto L6b
            java.lang.String r9 = ".jpg"
            boolean r5 = r8.endsWith(r9)
            java.lang.String r6 = "image/jpeg"
            if (r5 != 0) goto L9e
            java.lang.String r5 = ".jpeg"
            boolean r5 = r8.endsWith(r5)
            if (r5 != 0) goto L9e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r9)
            java.lang.String r8 = r5.toString()
            goto L9e
        L6b:
            java.lang.String r9 = ".webp"
            boolean r5 = r8.endsWith(r9)
            java.lang.String r6 = "image/webp"
            if (r5 != 0) goto L9e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r9)
            java.lang.String r8 = r5.toString()
            goto L9e
        L85:
            java.lang.String r9 = ".png"
            boolean r5 = r8.endsWith(r9)
            java.lang.String r6 = "image/png"
            if (r5 != 0) goto L9e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r9)
            java.lang.String r8 = r5.toString()
        L9e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = r3.getAbsolutePath()
            r9.append(r3)
            java.lang.String r3 = "/"
            r9.append(r3)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L11d
            r3.<init>(r9)     // Catch: java.io.IOException -> L11d
            android.graphics.Bitmap r5 = r7.getChartBitmap()     // Catch: java.io.IOException -> L11d
            r5.compress(r11, r12, r3)     // Catch: java.io.IOException -> L11d
            r3.flush()     // Catch: java.io.IOException -> L11d
            r3.close()     // Catch: java.io.IOException -> L11d
            java.io.File r11 = new java.io.File
            r11.<init>(r9)
            long r11 = r11.length()
            android.content.ContentValues r3 = new android.content.ContentValues
            r5 = 8
            r3.<init>(r5)
            java.lang.String r5 = "title"
            r3.put(r5, r8)
            java.lang.String r5 = "_display_name"
            r3.put(r5, r8)
            java.lang.String r8 = "date_added"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r8, r0)
            java.lang.String r8 = "mime_type"
            r3.put(r8, r6)
            java.lang.String r8 = "description"
            r3.put(r8, r10)
            java.lang.String r8 = "orientation"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r3.put(r8, r10)
            java.lang.String r8 = "_data"
            r3.put(r8, r9)
            java.lang.String r8 = "_size"
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r3.put(r8, r9)
            android.content.Context r8 = r7.getContext()
            android.content.ContentResolver r8 = r8.getContentResolver()
            android.net.Uri r9 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r8 = r8.insert(r9, r3)
            if (r8 == 0) goto L11d
            return r4
        L11d:
            return r2
    }

    public boolean saveToPath(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            android.graphics.Bitmap r0 = r4.getChartBitmap()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r2.<init>()     // Catch: java.lang.Exception -> L39
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Exception -> L39
            r2.append(r3)     // Catch: java.lang.Exception -> L39
            r2.append(r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r6 = "/"
            r2.append(r6)     // Catch: java.lang.Exception -> L39
            r2.append(r5)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = ".png"
            r2.append(r5)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L39
            r1.<init>(r5)     // Catch: java.lang.Exception -> L39
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L39
            r6 = 40
            r0.compress(r5, r6, r1)     // Catch: java.lang.Exception -> L39
            r1.close()     // Catch: java.lang.Exception -> L39
            r5 = 1
            return r5
        L39:
            r5 = 0
            return r5
    }

    public void setData(T r4) {
            r3 = this;
            r3.mData = r4
            r0 = 0
            r3.mOffsetsCalculated = r0
            if (r4 != 0) goto L8
            return
        L8:
            float r0 = r4.getYMin()
            float r4 = r4.getYMax()
            r3.setupDefaultFormatter(r0, r4)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r4 = r3.mData
            java.util.List r4 = r4.getDataSets()
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r4.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r0
            boolean r1 = r0.needsFormatter()
            if (r1 != 0) goto L37
            com.github.mikephil.charting.formatter.ValueFormatter r1 = r0.getValueFormatter()
            com.github.mikephil.charting.formatter.DefaultValueFormatter r2 = r3.mDefaultValueFormatter
            if (r1 != r2) goto L1d
        L37:
            com.github.mikephil.charting.formatter.DefaultValueFormatter r1 = r3.mDefaultValueFormatter
            r0.setValueFormatter(r1)
            goto L1d
        L3d:
            r3.notifyDataSetChanged()
            return
    }

    public void setDescription(com.github.mikephil.charting.components.Description r1) {
            r0 = this;
            r0.mDescription = r1
            return
    }

    public void setDragDecelerationEnabled(boolean r1) {
            r0 = this;
            r0.mDragDecelerationEnabled = r1
            return
    }

    public void setDragDecelerationFrictionCoef(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r3 = 0
        L6:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lf
            r3 = 1065336439(0x3f7fbe77, float:0.999)
        Lf:
            r2.mDragDecelerationFrictionCoef = r3
            return
    }

    @java.lang.Deprecated
    public void setDrawMarkerViews(boolean r1) {
            r0 = this;
            r0.setDrawMarkers(r1)
            return
    }

    public void setDrawMarkers(boolean r1) {
            r0 = this;
            r0.mDrawMarkers = r1
            return
    }

    public void setExtraBottomOffset(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mExtraBottomOffset = r1
            return
    }

    public void setExtraLeftOffset(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mExtraLeftOffset = r1
            return
    }

    public void setExtraOffsets(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.setExtraLeftOffset(r1)
            r0.setExtraTopOffset(r2)
            r0.setExtraRightOffset(r3)
            r0.setExtraBottomOffset(r4)
            return
    }

    public void setExtraRightOffset(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mExtraRightOffset = r1
            return
    }

    public void setExtraTopOffset(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mExtraTopOffset = r1
            return
    }

    public void setHardwareAccelerationEnabled(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            r2 = 2
            r1.setLayerType(r2, r0)
            return
        L8:
            r2 = 1
            r1.setLayerType(r2, r0)
            return
    }

    public void setHighlightPerTapEnabled(boolean r1) {
            r0 = this;
            r0.mHighLightPerTapEnabled = r1
            return
    }

    public void setHighlighter(com.github.mikephil.charting.highlight.ChartHighlighter r1) {
            r0 = this;
            r0.mHighlighter = r1
            return
    }

    protected void setLastHighlighted(com.github.mikephil.charting.highlight.Highlight[] r2) {
            r1 = this;
            if (r2 == 0) goto L11
            int r0 = r2.length
            if (r0 <= 0) goto L11
            r0 = 0
            r2 = r2[r0]
            if (r2 != 0) goto Lb
            goto L11
        Lb:
            com.github.mikephil.charting.listener.ChartTouchListener r0 = r1.mChartTouchListener
            r0.setLastHighlighted(r2)
            return
        L11:
            com.github.mikephil.charting.listener.ChartTouchListener r2 = r1.mChartTouchListener
            r0 = 0
            r2.setLastHighlighted(r0)
            return
    }

    public void setLogEnabled(boolean r1) {
            r0 = this;
            r0.mLogEnabled = r1
            return
    }

    public void setMarker(com.github.mikephil.charting.components.IMarker r1) {
            r0 = this;
            r0.mMarker = r1
            return
    }

    @java.lang.Deprecated
    public void setMarkerView(com.github.mikephil.charting.components.IMarker r1) {
            r0 = this;
            r0.setMarker(r1)
            return
    }

    public void setMaxHighlightDistance(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mMaxHighlightDistance = r1
            return
    }

    public void setNoDataText(java.lang.String r1) {
            r0 = this;
            r0.mNoDataText = r1
            return
    }

    public void setNoDataTextColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mInfoPaint
            r0.setColor(r2)
            return
    }

    public void setNoDataTextTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mInfoPaint
            r0.setTypeface(r2)
            return
    }

    public void setOnChartGestureListener(com.github.mikephil.charting.listener.OnChartGestureListener r1) {
            r0 = this;
            r0.mGestureListener = r1
            return
    }

    public void setOnChartValueSelectedListener(com.github.mikephil.charting.listener.OnChartValueSelectedListener r1) {
            r0 = this;
            r0.mSelectionListener = r1
            return
    }

    public void setOnTouchListener(com.github.mikephil.charting.listener.ChartTouchListener r1) {
            r0 = this;
            r0.mChartTouchListener = r1
            return
    }

    public void setPaint(android.graphics.Paint r2, int r3) {
            r1 = this;
            r0 = 7
            if (r3 == r0) goto Lb
            r0 = 11
            if (r3 == r0) goto L8
            return
        L8:
            r1.mDescPaint = r2
            return
        Lb:
            r1.mInfoPaint = r2
            return
    }

    public void setRenderer(com.github.mikephil.charting.renderer.DataRenderer r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.mRenderer = r1
        L4:
            return
    }

    public void setTouchEnabled(boolean r1) {
            r0 = this;
            r0.mTouchEnabled = r1
            return
    }

    public void setUnbindEnabled(boolean r1) {
            r0 = this;
            r0.mUnbind = r1
            return
    }

    protected void setupDefaultFormatter(float r3, float r4) {
            r2 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mData
            if (r0 == 0) goto L12
            int r0 = r0.getEntryCount()
            r1 = 2
            if (r0 >= r1) goto Lc
            goto L12
        Lc:
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            goto L1e
        L12:
            float r3 = java.lang.Math.abs(r3)
            float r4 = java.lang.Math.abs(r4)
            float r3 = java.lang.Math.max(r3, r4)
        L1e:
            int r3 = com.github.mikephil.charting.utils.Utils.getDecimals(r3)
            com.github.mikephil.charting.formatter.DefaultValueFormatter r4 = r2.mDefaultValueFormatter
            r4.setup(r3)
            return
    }

    public boolean valuesToHighlight() {
            r3 = this;
            com.github.mikephil.charting.highlight.Highlight[] r0 = r3.mIndicesToHighlight
            r1 = 0
            if (r0 == 0) goto Lf
            int r2 = r0.length
            if (r2 <= 0) goto Lf
            r0 = r0[r1]
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 1
            return r0
        Lf:
            return r1
    }
}

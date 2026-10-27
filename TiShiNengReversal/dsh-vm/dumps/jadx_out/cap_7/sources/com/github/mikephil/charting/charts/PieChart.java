package com.github.mikephil.charting.charts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PieChart extends com.github.mikephil.charting.charts.PieRadarChartBase<com.github.mikephil.charting.data.PieData> {
    private float[] mAbsoluteAngles;
    private java.lang.CharSequence mCenterText;
    private com.github.mikephil.charting.utils.MPPointF mCenterTextOffset;
    private float mCenterTextRadiusPercent;
    private android.graphics.RectF mCircleBox;
    private float[] mDrawAngles;
    private boolean mDrawCenterText;
    private boolean mDrawEntryLabels;
    private boolean mDrawHole;
    private boolean mDrawRoundedSlices;
    private boolean mDrawSlicesUnderHole;
    private float mHoleRadiusPercent;
    protected float mMaxAngle;
    private float mMinAngleForSlices;
    protected float mTransparentCircleRadiusPercent;
    private boolean mUsePercentValues;

    public PieChart(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.mCircleBox = r3
            r3 = 1
            r2.mDrawEntryLabels = r3
            float[] r0 = new float[r3]
            r2.mDrawAngles = r0
            float[] r0 = new float[r3]
            r2.mAbsoluteAngles = r0
            r2.mDrawHole = r3
            r0 = 0
            r2.mDrawSlicesUnderHole = r0
            r2.mUsePercentValues = r0
            r2.mDrawRoundedSlices = r0
            java.lang.String r0 = ""
            r2.mCenterText = r0
            r0 = 0
            com.github.mikephil.charting.utils.MPPointF r1 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0, r0)
            r2.mCenterTextOffset = r1
            r1 = 1112014848(0x42480000, float:50.0)
            r2.mHoleRadiusPercent = r1
            r1 = 1113325568(0x425c0000, float:55.0)
            r2.mTransparentCircleRadiusPercent = r1
            r2.mDrawCenterText = r3
            r3 = 1120403456(0x42c80000, float:100.0)
            r2.mCenterTextRadiusPercent = r3
            r3 = 1135869952(0x43b40000, float:360.0)
            r2.mMaxAngle = r3
            r2.mMinAngleForSlices = r0
            return
    }

    public PieChart(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.mCircleBox = r2
            r2 = 1
            r1.mDrawEntryLabels = r2
            float[] r3 = new float[r2]
            r1.mDrawAngles = r3
            float[] r3 = new float[r2]
            r1.mAbsoluteAngles = r3
            r1.mDrawHole = r2
            r3 = 0
            r1.mDrawSlicesUnderHole = r3
            r1.mUsePercentValues = r3
            r1.mDrawRoundedSlices = r3
            java.lang.String r3 = ""
            r1.mCenterText = r3
            r3 = 0
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r3, r3)
            r1.mCenterTextOffset = r0
            r0 = 1112014848(0x42480000, float:50.0)
            r1.mHoleRadiusPercent = r0
            r0 = 1113325568(0x425c0000, float:55.0)
            r1.mTransparentCircleRadiusPercent = r0
            r1.mDrawCenterText = r2
            r2 = 1120403456(0x42c80000, float:100.0)
            r1.mCenterTextRadiusPercent = r2
            r2 = 1135869952(0x43b40000, float:360.0)
            r1.mMaxAngle = r2
            r1.mMinAngleForSlices = r3
            return
    }

    public PieChart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mCircleBox = r1
            r1 = 1
            r0.mDrawEntryLabels = r1
            float[] r2 = new float[r1]
            r0.mDrawAngles = r2
            float[] r2 = new float[r1]
            r0.mAbsoluteAngles = r2
            r0.mDrawHole = r1
            r2 = 0
            r0.mDrawSlicesUnderHole = r2
            r0.mUsePercentValues = r2
            r0.mDrawRoundedSlices = r2
            java.lang.String r2 = ""
            r0.mCenterText = r2
            r2 = 0
            com.github.mikephil.charting.utils.MPPointF r3 = com.github.mikephil.charting.utils.MPPointF.getInstance(r2, r2)
            r0.mCenterTextOffset = r3
            r3 = 1112014848(0x42480000, float:50.0)
            r0.mHoleRadiusPercent = r3
            r3 = 1113325568(0x425c0000, float:55.0)
            r0.mTransparentCircleRadiusPercent = r3
            r0.mDrawCenterText = r1
            r1 = 1120403456(0x42c80000, float:100.0)
            r0.mCenterTextRadiusPercent = r1
            r1 = 1135869952(0x43b40000, float:360.0)
            r0.mMaxAngle = r1
            r0.mMinAngleForSlices = r2
            return
    }

    private float calcAngle(float r2) {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            com.github.mikephil.charting.data.PieData r0 = (com.github.mikephil.charting.data.PieData) r0
            float r0 = r0.getYValueSum()
            float r2 = r1.calcAngle(r2, r0)
            return r2
    }

    private float calcAngle(float r1, float r2) {
            r0 = this;
            float r1 = r1 / r2
            float r2 = r0.mMaxAngle
            float r1 = r1 * r2
            return r1
    }

    private void calcAngles() {
            r18 = this;
            r0 = r18
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r0.mData
            com.github.mikephil.charting.data.PieData r1 = (com.github.mikephil.charting.data.PieData) r1
            int r1 = r1.getEntryCount()
            float[] r2 = r0.mDrawAngles
            int r2 = r2.length
            r3 = 0
            r4 = 0
            if (r2 == r1) goto L16
            float[] r2 = new float[r1]
            r0.mDrawAngles = r2
            goto L20
        L16:
            r2 = 0
        L17:
            if (r2 >= r1) goto L20
            float[] r5 = r0.mDrawAngles
            r5[r2] = r3
            int r2 = r2 + 1
            goto L17
        L20:
            float[] r2 = r0.mAbsoluteAngles
            int r2 = r2.length
            if (r2 == r1) goto L2a
            float[] r2 = new float[r1]
            r0.mAbsoluteAngles = r2
            goto L34
        L2a:
            r2 = 0
        L2b:
            if (r2 >= r1) goto L34
            float[] r5 = r0.mAbsoluteAngles
            r5[r2] = r3
            int r2 = r2 + 1
            goto L2b
        L34:
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r0.mData
            com.github.mikephil.charting.data.PieData r2 = (com.github.mikephil.charting.data.PieData) r2
            float r2 = r2.getYValueSum()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r5 = r0.mData
            com.github.mikephil.charting.data.PieData r5 = (com.github.mikephil.charting.data.PieData) r5
            java.util.List r5 = r5.getDataSets()
            float r6 = r0.mMinAngleForSlices
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            float r7 = (float) r1
            float r7 = r7 * r6
            float r6 = r0.mMaxAngle
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L55
            r6 = 1
            goto L56
        L55:
            r6 = 0
        L56:
            float[] r7 = new float[r1]
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L5c:
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r12 = r0.mData
            com.github.mikephil.charting.data.PieData r12 = (com.github.mikephil.charting.data.PieData) r12
            int r12 = r12.getDataSetCount()
            if (r8 >= r12) goto Lbc
            java.lang.Object r12 = r5.get(r8)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r12 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r12
            r13 = 0
        L6d:
            int r14 = r12.getEntryCount()
            if (r13 >= r14) goto Lb6
            com.github.mikephil.charting.data.Entry r14 = r12.getEntryForIndex(r13)
            com.github.mikephil.charting.data.PieEntry r14 = (com.github.mikephil.charting.data.PieEntry) r14
            float r14 = r14.getY()
            float r14 = java.lang.Math.abs(r14)
            float r14 = r0.calcAngle(r14, r2)
            if (r6 == 0) goto L9a
            float r15 = r0.mMinAngleForSlices
            r16 = 0
            float r3 = r14 - r15
            int r17 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r17 > 0) goto L96
            r7[r11] = r15
            float r3 = -r3
            float r9 = r9 + r3
            goto L9c
        L96:
            r7[r11] = r14
            float r10 = r10 + r3
            goto L9c
        L9a:
            r16 = 0
        L9c:
            float[] r3 = r0.mDrawAngles
            r3[r11] = r14
            if (r11 != 0) goto La7
            float[] r3 = r0.mAbsoluteAngles
            r3[r11] = r14
            goto Lb0
        La7:
            float[] r3 = r0.mAbsoluteAngles
            int r15 = r11 + (-1)
            r15 = r3[r15]
            float r15 = r15 + r14
            r3[r11] = r15
        Lb0:
            int r11 = r11 + 1
            int r13 = r13 + 1
            r3 = 0
            goto L6d
        Lb6:
            r16 = 0
            int r8 = r8 + 1
            r3 = 0
            goto L5c
        Lbc:
            if (r6 == 0) goto Le4
            r2 = 0
        Lbf:
            if (r2 >= r1) goto Le2
            r3 = r7[r2]
            float r5 = r0.mMinAngleForSlices
            float r5 = r3 - r5
            float r5 = r5 / r10
            float r5 = r5 * r9
            float r3 = r3 - r5
            r7[r2] = r3
            if (r2 != 0) goto Ld6
            float[] r3 = r0.mAbsoluteAngles
            r5 = r7[r4]
            r3[r4] = r5
            goto Ldf
        Ld6:
            float[] r5 = r0.mAbsoluteAngles
            int r6 = r2 + (-1)
            r6 = r5[r6]
            float r6 = r6 + r3
            r5[r2] = r6
        Ldf:
            int r2 = r2 + 1
            goto Lbf
        Le2:
            r0.mDrawAngles = r7
        Le4:
            return
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
            r0 = this;
            r0.calcAngles()
            return
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
            r8 = this;
            super.calculateOffsets()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r8.mData
            if (r0 != 0) goto L8
            return
        L8:
            float r0 = r8.getDiameter()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            com.github.mikephil.charting.utils.MPPointF r1 = r8.getCenterOffsets()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r8.mData
            com.github.mikephil.charting.data.PieData r2 = (com.github.mikephil.charting.data.PieData) r2
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r2 = r2.getDataSet()
            float r2 = r2.getSelectionShift()
            android.graphics.RectF r3 = r8.mCircleBox
            float r4 = r1.x
            float r5 = r4 - r0
            float r5 = r5 + r2
            float r6 = r1.y
            float r7 = r6 - r0
            float r7 = r7 + r2
            float r4 = r4 + r0
            float r4 = r4 - r2
            float r6 = r6 + r0
            float r6 = r6 - r2
            r3.set(r5, r7, r4, r6)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r1)
            return
    }

    public float[] getAbsoluteAngles() {
            r1 = this;
            float[] r0 = r1.mAbsoluteAngles
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterCircleBox() {
            r2 = this;
            android.graphics.RectF r0 = r2.mCircleBox
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r2.mCircleBox
            float r1 = r1.centerY()
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0, r1)
            return r0
    }

    public java.lang.CharSequence getCenterText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mCenterText
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterTextOffset() {
            r2 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r2.mCenterTextOffset
            float r1 = r0.x
            float r0 = r0.y
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1, r0)
            return r0
    }

    public float getCenterTextRadiusPercent() {
            r1 = this;
            float r0 = r1.mCenterTextRadiusPercent
            return r0
    }

    public android.graphics.RectF getCircleBox() {
            r1 = this;
            android.graphics.RectF r0 = r1.mCircleBox
            return r0
    }

    public int getDataSetIndexForIndex(int r6) {
            r5 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r5.mData
            com.github.mikephil.charting.data.PieData r0 = (com.github.mikephil.charting.data.PieData) r0
            java.util.List r0 = r0.getDataSets()
            r1 = 0
        L9:
            int r2 = r0.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r0.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r2
            float r3 = (float) r6
            r4 = 2143289344(0x7fc00000, float:NaN)
            com.github.mikephil.charting.data.Entry r2 = r2.getEntryForXValue(r3, r4)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            int r1 = r1 + 1
            goto L9
        L22:
            r6 = -1
            return r6
    }

    public float[] getDrawAngles() {
            r1 = this;
            float[] r0 = r1.mDrawAngles
            return r0
    }

    public float getHoleRadius() {
            r1 = this;
            float r0 = r1.mHoleRadiusPercent
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float r4) {
            r3 = this;
            float r0 = r3.getRotationAngle()
            float r4 = r4 - r0
            float r4 = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(r4)
            r0 = 0
        La:
            float[] r1 = r3.mAbsoluteAngles
            int r2 = r1.length
            if (r0 >= r2) goto L19
            r1 = r1[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto La
        L19:
            r4 = -1
            return r4
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(com.github.mikephil.charting.highlight.Highlight r11) {
            r10 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r10.getCenterCircleBox()
            float r1 = r10.getRadius()
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = r1 / r2
            r3 = 1080452710(0x40666666, float:3.6)
            float r2 = r2 * r3
            boolean r3 = r10.isDrawHoleEnabled()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L26
            r2 = 1120403456(0x42c80000, float:100.0)
            float r2 = r1 / r2
            float r3 = r10.getHoleRadius()
            float r2 = r2 * r3
            float r2 = r1 - r2
            float r2 = r2 / r4
        L26:
            float r1 = r1 - r2
            float r2 = r10.getRotationAngle()
            float r11 = r11.getX()
            int r11 = (int) r11
            float[] r3 = r10.mDrawAngles
            r3 = r3[r11]
            float r3 = r3 / r4
            double r4 = (double) r1
            float[] r1 = r10.mAbsoluteAngles
            r1 = r1[r11]
            float r1 = r1 + r2
            float r1 = r1 - r3
            com.github.mikephil.charting.animation.ChartAnimator r6 = r10.mAnimator
            float r6 = r6.getPhaseY()
            float r1 = r1 * r6
            double r6 = (double) r1
            double r6 = java.lang.Math.toRadians(r6)
            double r6 = java.lang.Math.cos(r6)
            double r6 = r6 * r4
            float r1 = r0.x
            double r8 = (double) r1
            double r6 = r6 + r8
            float r1 = (float) r6
            float[] r6 = r10.mAbsoluteAngles
            r11 = r6[r11]
            float r2 = r2 + r11
            float r2 = r2 - r3
            com.github.mikephil.charting.animation.ChartAnimator r11 = r10.mAnimator
            float r11 = r11.getPhaseY()
            float r2 = r2 * r11
            double r2 = (double) r2
            double r2 = java.lang.Math.toRadians(r2)
            double r2 = java.lang.Math.sin(r2)
            double r4 = r4 * r2
            float r11 = r0.y
            double r2 = (double) r11
            double r4 = r4 + r2
            float r11 = (float) r4
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r0)
            r0 = 2
            float[] r0 = new float[r0]
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r11
            return r0
    }

    public float getMaxAngle() {
            r1 = this;
            float r0 = r1.mMaxAngle
            return r0
    }

    public float getMinAngleForSlices() {
            r1 = this;
            float r0 = r1.mMinAngleForSlices
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
            r3 = this;
            android.graphics.RectF r0 = r3.mCircleBox
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            float r0 = r0.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.RectF r2 = r3.mCircleBox
            float r2 = r2.height()
            float r2 = r2 / r1
            float r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
            r2 = this;
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r2.mLegendRenderer
            android.graphics.Paint r0 = r0.getLabelPaint()
            float r0 = r0.getTextSize()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            return r0
    }

    public float getTransparentCircleRadius() {
            r1 = this;
            float r0 = r1.mTransparentCircleRadiusPercent
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @java.lang.Deprecated
    public com.github.mikephil.charting.components.XAxis getXAxis() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "PieChart has no XAxis"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
            r3 = this;
            super.init()
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = new com.github.mikephil.charting.renderer.PieChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r1 = r3.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            r0.<init>(r3, r1, r2)
            r3.mRenderer = r0
            r0 = 0
            r3.mXAxis = r0
            com.github.mikephil.charting.highlight.PieHighlighter r0 = new com.github.mikephil.charting.highlight.PieHighlighter
            r0.<init>(r3)
            r3.mHighlighter = r0
            return
    }

    public boolean isDrawCenterTextEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawCenterText
            return r0
    }

    public boolean isDrawEntryLabelsEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawEntryLabels
            return r0
    }

    public boolean isDrawHoleEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawHole
            return r0
    }

    public boolean isDrawRoundedSlicesEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawRoundedSlices
            return r0
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawSlicesUnderHole
            return r0
    }

    public boolean isUsePercentValuesEnabled() {
            r1 = this;
            boolean r0 = r1.mUsePercentValues
            return r0
    }

    public boolean needsHighlight(int r5) {
            r4 = this;
            boolean r0 = r4.valuesToHighlight()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
        L9:
            com.github.mikephil.charting.highlight.Highlight[] r2 = r4.mIndicesToHighlight
            int r3 = r2.length
            if (r0 >= r3) goto L1c
            r2 = r2[r0]
            float r2 = r2.getX()
            int r2 = (int) r2
            if (r2 != r5) goto L19
            r5 = 1
            return r5
        L19:
            int r0 = r0 + 1
            goto L9
        L1c:
            return r1
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r2.mRenderer
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof com.github.mikephil.charting.renderer.PieChartRenderer
            if (r1 == 0) goto Ld
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            r0.releaseBitmap()
        Ld:
            super.onDetachedFromWindow()
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            super.onDraw(r3)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mData
            if (r0 != 0) goto L8
            return
        L8:
            com.github.mikephil.charting.renderer.DataRenderer r0 = r2.mRenderer
            r0.drawData(r3)
            boolean r0 = r2.valuesToHighlight()
            if (r0 == 0) goto L1a
            com.github.mikephil.charting.renderer.DataRenderer r0 = r2.mRenderer
            com.github.mikephil.charting.highlight.Highlight[] r1 = r2.mIndicesToHighlight
            r0.drawHighlighted(r3, r1)
        L1a:
            com.github.mikephil.charting.renderer.DataRenderer r0 = r2.mRenderer
            r0.drawExtras(r3)
            com.github.mikephil.charting.renderer.DataRenderer r0 = r2.mRenderer
            r0.drawValues(r3)
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r2.mLegendRenderer
            r0.renderLegend(r3)
            r2.drawDescription(r3)
            r2.drawMarkers(r3)
            return
    }

    public void setCenterText(java.lang.CharSequence r1) {
            r0 = this;
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
            r0.mCenterText = r1
            return
        L7:
            r0.mCenterText = r1
            return
    }

    public void setCenterTextColor(int r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.text.TextPaint r0 = r0.getPaintCenterText()
            r0.setColor(r2)
            return
    }

    public void setCenterTextOffset(float r2, float r3) {
            r1 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r1.mCenterTextOffset
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r0.x = r2
            com.github.mikephil.charting.utils.MPPointF r2 = r1.mCenterTextOffset
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.y = r3
            return
    }

    public void setCenterTextRadiusPercent(float r1) {
            r0 = this;
            r0.mCenterTextRadiusPercent = r1
            return
    }

    public void setCenterTextSize(float r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.text.TextPaint r0 = r0.getPaintCenterText()
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r0.setTextSize(r2)
            return
    }

    public void setCenterTextSizePixels(float r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.text.TextPaint r0 = r0.getPaintCenterText()
            r0.setTextSize(r2)
            return
    }

    public void setCenterTextTypeface(android.graphics.Typeface r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.text.TextPaint r0 = r0.getPaintCenterText()
            r0.setTypeface(r2)
            return
    }

    public void setDrawCenterText(boolean r1) {
            r0 = this;
            r0.mDrawCenterText = r1
            return
    }

    public void setDrawEntryLabels(boolean r1) {
            r0 = this;
            r0.mDrawEntryLabels = r1
            return
    }

    public void setDrawHoleEnabled(boolean r1) {
            r0 = this;
            r0.mDrawHole = r1
            return
    }

    public void setDrawRoundedSlices(boolean r1) {
            r0 = this;
            r0.mDrawRoundedSlices = r1
            return
    }

    @java.lang.Deprecated
    public void setDrawSliceText(boolean r1) {
            r0 = this;
            r0.mDrawEntryLabels = r1
            return
    }

    public void setDrawSlicesUnderHole(boolean r1) {
            r0 = this;
            r0.mDrawSlicesUnderHole = r1
            return
    }

    public void setEntryLabelColor(int r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.graphics.Paint r0 = r0.getPaintEntryLabels()
            r0.setColor(r2)
            return
    }

    public void setEntryLabelTextSize(float r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.graphics.Paint r0 = r0.getPaintEntryLabels()
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            r0.setTextSize(r2)
            return
    }

    public void setEntryLabelTypeface(android.graphics.Typeface r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.graphics.Paint r0 = r0.getPaintEntryLabels()
            r0.setTypeface(r2)
            return
    }

    public void setHoleColor(int r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.graphics.Paint r0 = r0.getPaintHole()
            r0.setColor(r2)
            return
    }

    public void setHoleRadius(float r1) {
            r0 = this;
            r0.mHoleRadiusPercent = r1
            return
    }

    public void setMaxAngle(float r3) {
            r2 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
            r3 = 1135869952(0x43b40000, float:360.0)
        L8:
            r0 = 1119092736(0x42b40000, float:90.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L10
            r3 = 1119092736(0x42b40000, float:90.0)
        L10:
            r2.mMaxAngle = r3
            return
    }

    public void setMinAngleForSlices(float r4) {
            r3 = this;
            float r0 = r3.mMaxAngle
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r0 / r1
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Ld
            float r4 = r0 / r1
            goto L13
        Ld:
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L13
            r4 = 0
        L13:
            r3.mMinAngleForSlices = r4
            return
    }

    public void setTransparentCircleAlpha(int r2) {
            r1 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r1.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.graphics.Paint r0 = r0.getPaintTransparentCircle()
            r0.setAlpha(r2)
            return
    }

    public void setTransparentCircleColor(int r3) {
            r2 = this;
            com.github.mikephil.charting.renderer.DataRenderer r0 = r2.mRenderer
            com.github.mikephil.charting.renderer.PieChartRenderer r0 = (com.github.mikephil.charting.renderer.PieChartRenderer) r0
            android.graphics.Paint r0 = r0.getPaintTransparentCircle()
            int r1 = r0.getAlpha()
            r0.setColor(r3)
            r0.setAlpha(r1)
            return
    }

    public void setTransparentCircleRadius(float r1) {
            r0 = this;
            r0.mTransparentCircleRadiusPercent = r1
            return
    }

    public void setUsePercentValues(boolean r1) {
            r0 = this;
            r0.mUsePercentValues = r1
            return
    }
}

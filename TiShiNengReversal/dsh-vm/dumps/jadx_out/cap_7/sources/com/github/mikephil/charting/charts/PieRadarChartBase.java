package com.github.mikephil.charting.charts;

import com.github.mikephil.charting.data.ChartData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class PieRadarChartBase<T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>>> extends com.github.mikephil.charting.charts.Chart<T> {
    protected float mMinOffset;
    private float mRawRotationAngle;
    protected boolean mRotateEnabled;
    private float mRotationAngle;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment     // Catch: java.lang.NoSuchFieldError -> L38
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch: java.lang.NoSuchFieldError -> L38
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment     // Catch: java.lang.NoSuchFieldError -> L43
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r4 = 3
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch: java.lang.NoSuchFieldError -> L54
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r1 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment     // Catch: java.lang.NoSuchFieldError -> L5e
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

    public PieRadarChartBase(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1132920832(0x43870000, float:270.0)
            r0.mRotationAngle = r1
            r0.mRawRotationAngle = r1
            r1 = 1
            r0.mRotateEnabled = r1
            r1 = 0
            r0.mMinOffset = r1
            return
    }

    public PieRadarChartBase(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1132920832(0x43870000, float:270.0)
            r0.mRotationAngle = r1
            r0.mRawRotationAngle = r1
            r1 = 1
            r0.mRotateEnabled = r1
            r1 = 0
            r0.mMinOffset = r1
            return
    }

    public PieRadarChartBase(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1132920832(0x43870000, float:270.0)
            r0.mRotationAngle = r1
            r0.mRawRotationAngle = r1
            r1 = 1
            r0.mRotateEnabled = r1
            r1 = 0
            r0.mMinOffset = r1
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
            r11 = this;
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            r1 = 0
            if (r0 == 0) goto L194
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L194
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            boolean r0 = r0.isDrawInsideEnabled()
            if (r0 != 0) goto L194
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.mNeededWidth
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r11.mViewPortHandler
            float r2 = r2.getChartWidth()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendOrientation r3 = r3.getOrientation()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L3e
            goto L7f
        L3e:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.getVerticalAlignment()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            if (r0 == r2) goto L52
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.getVerticalAlignment()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM
            if (r0 != r2) goto L7f
        L52:
            float r0 = r11.getRequiredLegendOffset()
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            float r2 = r2.mNeededHeight
            float r2 = r2 + r0
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r11.mViewPortHandler
            float r0 = r0.getChartHeight()
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            float r5 = r5.getMaxSizePercent()
            float r0 = r0 * r5
            float r0 = java.lang.Math.min(r2, r0)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = r5.getVerticalAlignment()
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L87
            if (r2 == r3) goto L84
        L7f:
            r0 = 0
        L80:
            r2 = 0
        L81:
            r3 = 0
            goto L17f
        L84:
            r2 = r0
            r0 = 0
            goto L81
        L87:
            r3 = r0
            r0 = 0
            r2 = 0
            goto L17f
        L8c:
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.getHorizontalAlignment()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            if (r2 == r5) goto La4
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.getHorizontalAlignment()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            if (r2 != r5) goto La1
            goto La4
        La1:
            r0 = 0
            goto L122
        La4:
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.getVerticalAlignment()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER
            if (r2 != r5) goto Lb6
            r2 = 1095761920(0x41500000, float:13.0)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r0 = r0 + r2
            goto L122
        Lb6:
            r2 = 1090519040(0x41000000, float:8.0)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r0 = r0 + r2
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            float r5 = r2.mNeededHeight
            float r2 = r2.mTextHeightMax
            float r5 = r5 + r2
            com.github.mikephil.charting.utils.MPPointF r2 = r11.getCenter()
            com.github.mikephil.charting.components.Legend r6 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r6 = r6.getHorizontalAlignment()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r7 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r8 = 1097859072(0x41700000, float:15.0)
            if (r6 != r7) goto Ldc
            int r6 = r11.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = r6 + r8
            goto Lde
        Ldc:
            float r6 = r0 - r8
        Lde:
            float r5 = r5 + r8
            float r7 = r11.distanceToCenter(r6, r5)
            float r8 = r11.getRadius()
            float r6 = r11.getAngleForPoint(r6, r5)
            com.github.mikephil.charting.utils.MPPointF r6 = r11.getPosition(r2, r8, r6)
            float r8 = r6.x
            float r9 = r6.y
            float r8 = r11.distanceToCenter(r8, r9)
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r9)
            float r10 = r2.y
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 < 0) goto L113
            int r5 = r11.getHeight()
            float r5 = (float) r5
            float r5 = r5 - r0
            int r10 = r11.getWidth()
            float r10 = (float) r10
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L113
            goto L11c
        L113:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L11b
            float r8 = r8 - r7
            float r9 = r9 + r8
            r0 = r9
            goto L11c
        L11b:
            r0 = 0
        L11c:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r2)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r6)
        L122:
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = r5.getHorizontalAlignment()
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L17c
            if (r2 == r3) goto L80
            r0 = 3
            if (r2 == r0) goto L138
            goto L14a
        L138:
            int[] r0 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.getVerticalAlignment()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r4) goto L164
            if (r0 == r3) goto L14c
        L14a:
            goto L7f
        L14c:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r11.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L84
        L164:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r11.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L87
        L17c:
            r1 = r0
            goto L7f
        L17f:
            float r4 = r11.getRequiredBaseOffset()
            float r1 = r1 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r0 = r0 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r3 = r3 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r2 = r2 + r4
            goto L197
        L194:
            r0 = 0
            r2 = 0
            r3 = 0
        L197:
            float r4 = r11.mMinOffset
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            boolean r5 = r11 instanceof com.github.mikephil.charting.charts.RadarChart
            if (r5 == 0) goto L1b8
            com.github.mikephil.charting.components.XAxis r5 = r11.getXAxis()
            boolean r6 = r5.isEnabled()
            if (r6 == 0) goto L1b8
            boolean r6 = r5.isDrawLabelsEnabled()
            if (r6 == 0) goto L1b8
            int r5 = r5.mLabelRotatedWidth
            float r5 = (float) r5
            float r4 = java.lang.Math.max(r4, r5)
        L1b8:
            float r5 = r11.getExtraTopOffset()
            float r3 = r3 + r5
            float r5 = r11.getExtraRightOffset()
            float r0 = r0 + r5
            float r5 = r11.getExtraBottomOffset()
            float r2 = r2 + r5
            float r5 = r11.getExtraLeftOffset()
            float r1 = r1 + r5
            float r1 = java.lang.Math.max(r4, r1)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = java.lang.Math.max(r4, r0)
            float r5 = r11.getRequiredBaseOffset()
            float r2 = java.lang.Math.max(r5, r2)
            float r2 = java.lang.Math.max(r4, r2)
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r11.mViewPortHandler
            r4.restrainViewPort(r1, r3, r0, r2)
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r2 = this;
            com.github.mikephil.charting.listener.ChartTouchListener r0 = r2.mChartTouchListener
            boolean r1 = r0 instanceof com.github.mikephil.charting.listener.PieRadarChartTouchListener
            if (r1 == 0) goto Lb
            com.github.mikephil.charting.listener.PieRadarChartTouchListener r0 = (com.github.mikephil.charting.listener.PieRadarChartTouchListener) r0
            r0.computeScroll()
        Lb:
            return
    }

    public float distanceToCenter(float r6, float r7) {
            r5 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r5.getCenterOffsets()
            float r1 = r0.x
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 <= 0) goto Lc
            float r6 = r6 - r1
            goto Le
        Lc:
            float r6 = r1 - r6
        Le:
            float r1 = r0.y
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 <= 0) goto L16
            float r7 = r7 - r1
            goto L18
        L16:
            float r7 = r1 - r7
        L18:
            double r1 = (double) r6
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = java.lang.Math.pow(r1, r3)
            double r6 = (double) r7
            double r6 = java.lang.Math.pow(r6, r3)
            double r1 = r1 + r6
            double r6 = java.lang.Math.sqrt(r1)
            float r6 = (float) r6
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r0)
            return r6
    }

    public float getAngleForPoint(float r8, float r9) {
            r7 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r7.getCenterOffsets()
            float r1 = r0.x
            float r1 = r8 - r1
            double r1 = (double) r1
            float r3 = r0.y
            float r9 = r9 - r3
            double r3 = (double) r9
            double r1 = r1 * r1
            double r5 = r3 * r3
            double r1 = r1 + r5
            double r1 = java.lang.Math.sqrt(r1)
            double r3 = r3 / r1
            double r1 = java.lang.Math.acos(r3)
            double r1 = java.lang.Math.toDegrees(r1)
            float r9 = (float) r1
            float r1 = r0.x
            r2 = 1135869952(0x43b40000, float:360.0)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L2a
            float r9 = r2 - r9
        L2a:
            r8 = 1119092736(0x42b40000, float:90.0)
            float r9 = r9 + r8
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 <= 0) goto L32
            float r9 = r9 - r2
        L32:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r0)
            return r9
    }

    public float getDiameter() {
            r3 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            float r1 = r0.left
            float r2 = r3.getExtraLeftOffset()
            float r1 = r1 + r2
            r0.left = r1
            float r1 = r0.top
            float r2 = r3.getExtraTopOffset()
            float r1 = r1 + r2
            r0.top = r1
            float r1 = r0.right
            float r2 = r3.getExtraRightOffset()
            float r1 = r1 - r2
            r0.right = r1
            float r1 = r0.bottom
            float r2 = r3.getExtraBottomOffset()
            float r1 = r1 - r2
            r0.bottom = r1
            float r1 = r0.width()
            float r0 = r0.height()
            float r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    public abstract int getIndexForAngle(float r1);

    public int getMaxVisibleCount() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            int r0 = r0.getEntryCount()
            return r0
    }

    public float getMinOffset() {
            r1 = this;
            float r0 = r1.mMinOffset
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.utils.MPPointF r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0, r0)
            r1.getPosition(r2, r3, r4, r0)
            return r0
    }

    public void getPosition(com.github.mikephil.charting.utils.MPPointF r7, float r8, float r9, com.github.mikephil.charting.utils.MPPointF r10) {
            r6 = this;
            float r0 = r7.x
            double r0 = (double) r0
            double r2 = (double) r8
            double r8 = (double) r9
            double r4 = java.lang.Math.toRadians(r8)
            double r4 = java.lang.Math.cos(r4)
            double r4 = r4 * r2
            double r0 = r0 + r4
            float r0 = (float) r0
            r10.x = r0
            float r7 = r7.y
            double r0 = (double) r7
            double r7 = java.lang.Math.toRadians(r8)
            double r7 = java.lang.Math.sin(r7)
            double r2 = r2 * r7
            double r0 = r0 + r2
            float r7 = (float) r0
            r10.y = r7
            return
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
            r1 = this;
            float r0 = r1.mRawRotationAngle
            return r0
    }

    protected abstract float getRequiredBaseOffset();

    protected abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
            r1 = this;
            float r0 = r1.mRotationAngle
            return r0
    }

    public float getYChartMax() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getYChartMin() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
            r1 = this;
            super.init()
            com.github.mikephil.charting.listener.PieRadarChartTouchListener r0 = new com.github.mikephil.charting.listener.PieRadarChartTouchListener
            r0.<init>(r1)
            r1.mChartTouchListener = r0
            return
    }

    public boolean isRotationEnabled() {
            r1 = this;
            boolean r0 = r1.mRotateEnabled
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
            r2 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mData
            if (r0 != 0) goto L5
            return
        L5:
            r2.calcMinMax()
            com.github.mikephil.charting.components.Legend r0 = r2.mLegend
            if (r0 == 0) goto L13
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r2.mLegendRenderer
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r2.mData
            r0.computeLegend(r1)
        L13:
            r2.calculateOffsets()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.mTouchEnabled
            if (r0 == 0) goto Ld
            com.github.mikephil.charting.listener.ChartTouchListener r0 = r1.mChartTouchListener
            if (r0 == 0) goto Ld
            boolean r2 = r0.onTouch(r1, r2)
            return r2
        Ld:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    public void setMinOffset(float r1) {
            r0 = this;
            r0.mMinOffset = r1
            return
    }

    public void setRotationAngle(float r1) {
            r0 = this;
            r0.mRawRotationAngle = r1
            float r1 = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(r1)
            r0.mRotationAngle = r1
            return
    }

    public void setRotationEnabled(boolean r1) {
            r0 = this;
            r0.mRotateEnabled = r1
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void spin(int r3, float r4, float r5, com.github.mikephil.charting.animation.Easing.EasingFunction r6) {
            r2 = this;
            r2.setRotationAngle(r4)
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r4 = "rotationAngle"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r2, r4, r0)
            long r0 = (long) r3
            r4.setDuration(r0)
            r4.setInterpolator(r6)
            com.github.mikephil.charting.charts.PieRadarChartBase$1 r3 = new com.github.mikephil.charting.charts.PieRadarChartBase$1
            r3.<init>(r2)
            r4.addUpdateListener(r3)
            r4.start()
            return
    }
}

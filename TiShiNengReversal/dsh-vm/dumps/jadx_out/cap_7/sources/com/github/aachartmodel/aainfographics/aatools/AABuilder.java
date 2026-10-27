package com.github.aachartmodel.aainfographics.aatools;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AABuilder {
    private java.lang.Integer animationDuration;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType animationType;
    private final android.content.Context applicationContext;
    private java.lang.String axesTextColor;
    private java.lang.Object backgroundColor;
    private java.lang.Number borderRadius;
    private java.lang.String[] categories;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartType chartType;
    private java.lang.Object[] colorsTheme;
    private java.lang.Boolean dataLabelsEnabled;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle dataLabelsStyle;
    private java.lang.Boolean gradientColorEnable;
    private java.lang.Boolean inverted;
    private java.lang.Boolean legendEnabled;
    private java.lang.Number[] margin;
    private java.lang.Number markerRadius;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType markerSymbol;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType markerSymbolStyle;
    private java.lang.Boolean polar;
    private final android.content.res.Resources resources;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea scrollablePlotArea;
    private java.lang.Object[] series;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType stacking;
    private java.lang.String subtitle;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType subtitleAlign;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle subtitleStyle;
    private java.lang.String title;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle titleStyle;
    private java.lang.Boolean tooltipEnabled;
    private java.lang.String tooltipValueSuffix;
    private java.lang.Boolean touchEventEnabled;
    private java.lang.Number xAxisGridLineWidth;
    private java.lang.Boolean xAxisLabelsEnabled;
    private java.lang.Boolean xAxisReversed;
    private java.lang.Integer xAxisTickInterval;
    private java.lang.Boolean xAxisVisible;
    private java.lang.Boolean yAxisAllowDecimals;
    private java.lang.Number yAxisGridLineWidth;
    private java.lang.Boolean yAxisLabelsEnabled;
    private java.lang.Number yAxisLineWidth;
    private java.lang.Number yAxisMax;
    private java.lang.Number yAxisMin;
    private java.lang.Boolean yAxisReversed;
    private java.lang.String yAxisTitle;
    private java.lang.Boolean yAxisVisible;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType zoomType;

    public AABuilder(@org.jetbrains.annotations.NotNull android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r5, r0)
            r4.<init>()
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            r4.applicationContext = r5
            java.lang.String r0 = "applicationContext"
            kotlin.jvm.internal.g0.o(r5, r0)
            android.content.res.Resources r5 = r5.getResources()
            r4.resources = r5
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r5 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType.Linear
            r4.animationType = r5
            r5 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.animationDuration = r5
            java.lang.String r5 = ""
            r4.title = r5
            r4.subtitle = r5
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r5 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartType.Line
            r4.chartType = r5
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r5 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.False
            r4.stacking = r5
            r5 = 1086324736(0x40c00000, float:6.0)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.markerRadius = r5
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r5 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType.Normal
            r4.markerSymbolStyle = r5
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r5 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.None
            r4.zoomType = r5
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.inverted = r5
            r4.xAxisReversed = r5
            r4.yAxisReversed = r5
            r4.gradientColorEnable = r5
            r4.polar = r5
            r4.dataLabelsEnabled = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.xAxisLabelsEnabled = r5
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.xAxisGridLineWidth = r0
            r4.yAxisLabelsEnabled = r5
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4.yAxisGridLineWidth = r1
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "#fe117c"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "#ffc069"
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "#06caf4"
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "#7dffc0"
            r3 = 3
            r1[r3] = r2
            r4.colorsTheme = r1
            r4.legendEnabled = r5
            java.lang.String r5 = "#ffffff"
            r4.backgroundColor = r5
            r4.borderRadius = r0
            return
    }

    public AABuilder(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.set(r3)
            return
    }

    private final int getColor(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.content.Context r0 = r2.applicationContext
            int r3 = androidx.databinding.b.a(r0, r3)
            return r3
        Ld:
            android.content.res.Resources r0 = r2.resources
            int r3 = r0.getColor(r3)
            return r3
    }

    private final float getDimen(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.resources
            float r2 = r0.getDimension(r2)
            return r2
    }

    private final java.lang.String getString(int r4, java.lang.Object... r5) {
            r3 = this;
            android.content.res.Resources r0 = r3.resources
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r4 = r0.getString(r4, r1)
            java.lang.String r5 = "resources.getString(id, formatArgs)"
            kotlin.jvm.internal.g0.o(r4, r5)
            return r4
    }

    private final java.lang.String toColorString(int r4) {
            r3 = this;
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.a
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r4
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "#%06X"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel build() {
            r47 = this;
            r0 = r47
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r2 = r0.animationType
            java.lang.Integer r3 = r0.animationDuration
            java.lang.String r4 = r0.title
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r5 = r0.titleStyle
            java.lang.String r6 = r0.subtitle
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r7 = r0.subtitleAlign
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r8 = r0.subtitleStyle
            java.lang.String r9 = r0.axesTextColor
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r10 = r0.chartType
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r11 = r0.stacking
            java.lang.Number r12 = r0.markerRadius
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r13 = r0.markerSymbol
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r14 = r0.markerSymbolStyle
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r15 = r0.zoomType
            r16 = r1
            java.lang.Boolean r1 = r0.inverted
            r17 = r1
            java.lang.Boolean r1 = r0.xAxisReversed
            r18 = r1
            java.lang.Boolean r1 = r0.yAxisReversed
            r19 = r1
            java.lang.Boolean r1 = r0.tooltipEnabled
            r20 = r1
            java.lang.String r1 = r0.tooltipValueSuffix
            r21 = r1
            java.lang.Boolean r1 = r0.gradientColorEnable
            r22 = r1
            java.lang.Boolean r1 = r0.polar
            r23 = r1
            java.lang.Number[] r1 = r0.margin
            r24 = r1
            java.lang.Boolean r1 = r0.dataLabelsEnabled
            r25 = r1
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r1 = r0.dataLabelsStyle
            r26 = r1
            java.lang.Boolean r1 = r0.xAxisLabelsEnabled
            r27 = r1
            java.lang.Integer r1 = r0.xAxisTickInterval
            r28 = r1
            java.lang.String[] r1 = r0.categories
            r29 = r1
            java.lang.Number r1 = r0.xAxisGridLineWidth
            r30 = r1
            java.lang.Boolean r1 = r0.xAxisVisible
            r31 = r1
            java.lang.Boolean r1 = r0.yAxisVisible
            r32 = r1
            java.lang.Boolean r1 = r0.yAxisLabelsEnabled
            r33 = r1
            java.lang.String r1 = r0.yAxisTitle
            r34 = r1
            java.lang.Number r1 = r0.yAxisLineWidth
            r35 = r1
            java.lang.Number r1 = r0.yAxisMin
            r36 = r1
            java.lang.Number r1 = r0.yAxisMax
            r37 = r1
            java.lang.Boolean r1 = r0.yAxisAllowDecimals
            r38 = r1
            java.lang.Number r1 = r0.yAxisGridLineWidth
            r39 = r1
            java.lang.Object[] r1 = r0.colorsTheme
            r40 = r1
            java.lang.Boolean r1 = r0.legendEnabled
            r41 = r1
            java.lang.Object r1 = r0.backgroundColor
            r42 = r1
            java.lang.Number r1 = r0.borderRadius
            r43 = r1
            java.lang.Object[] r1 = r0.series
            r44 = r1
            java.lang.Boolean r1 = r0.touchEventEnabled
            r45 = r1
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r1 = r0.scrollablePlotArea
            r46 = r45
            r45 = r1
            r1 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r35
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r39
            r39 = r40
            r40 = r41
            r41 = r42
            r42 = r43
            r43 = r44
            r44 = r46
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r16 = r1
            return r16
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder set(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r0 = r2.getAnimationType()
            r1.animationType = r0
            java.lang.Integer r0 = r2.getAnimationDuration()
            r1.animationDuration = r0
            java.lang.String r0 = r2.getTitle()
            r1.title = r0
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = r2.getTitleStyle()
            r1.titleStyle = r0
            java.lang.String r0 = r2.getSubtitle()
            r1.subtitle = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r0 = r2.getSubtitleAlign()
            r1.subtitleAlign = r0
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = r2.getSubtitleStyle()
            r1.subtitleStyle = r0
            java.lang.String r0 = r2.getAxesTextColor()
            r1.axesTextColor = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r0 = r2.getChartType()
            r1.chartType = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r0 = r2.getStacking()
            r1.stacking = r0
            java.lang.Number r0 = r2.getMarkerRadius()
            r1.markerRadius = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r0 = r2.getMarkerSymbol()
            r1.markerSymbol = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r0 = r2.getMarkerSymbolStyle()
            r1.markerSymbolStyle = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r0 = r2.getZoomType()
            r1.zoomType = r0
            java.lang.Boolean r0 = r2.getInverted()
            r1.inverted = r0
            java.lang.Boolean r0 = r2.getXAxisReversed()
            r1.xAxisReversed = r0
            java.lang.Boolean r0 = r2.getYAxisReversed()
            r1.yAxisReversed = r0
            java.lang.Boolean r0 = r2.getTooltipEnabled()
            r1.tooltipEnabled = r0
            java.lang.String r0 = r2.getTooltipValueSuffix()
            r1.tooltipValueSuffix = r0
            java.lang.Boolean r0 = r2.getGradientColorEnable()
            r1.gradientColorEnable = r0
            java.lang.Boolean r0 = r2.getPolar()
            r1.polar = r0
            java.lang.Number[] r0 = r2.getMargin()
            r1.margin = r0
            java.lang.Boolean r0 = r2.getDataLabelsEnabled()
            r1.dataLabelsEnabled = r0
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = r2.getDataLabelsStyle()
            r1.dataLabelsStyle = r0
            java.lang.Boolean r0 = r2.getXAxisLabelsEnabled()
            r1.xAxisLabelsEnabled = r0
            java.lang.Integer r0 = r2.getXAxisTickInterval()
            r1.xAxisTickInterval = r0
            java.lang.String[] r0 = r2.getCategories()
            r1.categories = r0
            java.lang.Number r0 = r2.getXAxisGridLineWidth()
            r1.xAxisGridLineWidth = r0
            java.lang.Boolean r0 = r2.getXAxisVisible()
            r1.xAxisVisible = r0
            java.lang.Boolean r0 = r2.getYAxisVisible()
            r1.yAxisVisible = r0
            java.lang.Boolean r0 = r2.getYAxisLabelsEnabled()
            r1.yAxisLabelsEnabled = r0
            java.lang.String r0 = r2.getYAxisTitle()
            r1.yAxisTitle = r0
            java.lang.Number r0 = r2.getYAxisLineWidth()
            r1.yAxisLineWidth = r0
            java.lang.Number r0 = r2.getYAxisMin()
            r1.yAxisMin = r0
            java.lang.Number r0 = r2.getYAxisMax()
            r1.yAxisMax = r0
            java.lang.Boolean r0 = r2.getYAxisAllowDecimals()
            r1.yAxisAllowDecimals = r0
            java.lang.Number r0 = r2.getYAxisGridLineWidth()
            r1.yAxisGridLineWidth = r0
            java.lang.Object[] r0 = r2.getColorsTheme()
            r1.colorsTheme = r0
            java.lang.Boolean r0 = r2.getLegendEnabled()
            r1.legendEnabled = r0
            java.lang.Object r0 = r2.getBackgroundColor()
            r1.backgroundColor = r0
            java.lang.Number r0 = r2.getBorderRadius()
            r1.borderRadius = r0
            java.lang.Object[] r0 = r2.getSeries()
            r1.series = r0
            java.lang.Boolean r0 = r2.getTouchEventEnabled()
            r1.touchEventEnabled = r0
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r2 = r2.getScrollablePlotArea()
            r1.scrollablePlotArea = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setAnimationDuration(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.animationDuration = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setAnimationType(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.animationType = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setAxesTextColor(int r1) {
            r0 = this;
            java.lang.String r1 = r0.toColorString(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setAxesTextColor(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setAxesTextColor(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.axesTextColor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setAxesTextColorRes(int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.String r1 = r0.toColorString(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setAxesTextColor(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setBackgroundColor(int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.String r1 = r0.toColorString(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setBackgroundColor(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setBackgroundColor(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.backgroundColor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setBorderRadius(int r1) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setBorderRadius(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setBorderRadius(@org.jetbrains.annotations.NotNull java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.borderRadius = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setCategories(@org.jetbrains.annotations.NotNull int... r7) {
            r6 = this;
            java.lang.String r0 = "stringResIds"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L1e
            r4 = r7[r3]
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = r6.getString(r4, r5)
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L1e:
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.Object[] r7 = r0.toArray(r7)
            if (r7 == 0) goto L34
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            com.github.aachartmodel.aainfographics.aatools.AABuilder r7 = r6.setCategories(r7)
            return r7
        L34:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r7.<init>(r0)
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setCategories(@org.jetbrains.annotations.NotNull java.lang.String... r6) {
            r5 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L18
            r4 = r6[r3]
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L18:
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            if (r6 == 0) goto L25
            java.lang.String[] r6 = (java.lang.String[]) r6
            r5.categories = r6
            return r5
        L25:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setChartType(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.chartType = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setColorsTheme(@org.jetbrains.annotations.NotNull int... r6) {
            r5 = this;
            java.lang.String r0 = "colorResIds"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L20
            r4 = r6[r3]
            int r4 = r5.getColor(r4)
            java.lang.String r4 = r5.toColorString(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L20:
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            if (r6 == 0) goto L36
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            com.github.aachartmodel.aainfographics.aatools.AABuilder r6 = r5.setColorsTheme(r6)
            return r6
        L36:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setColorsTheme(@org.jetbrains.annotations.NotNull java.lang.Object[] r6) {
            r5 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L18
            r4 = r6[r3]
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L18:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            if (r6 == 0) goto L23
            r5.colorsTheme = r6
            return r5
        L23:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setColorsTheme(@org.jetbrains.annotations.NotNull java.lang.String... r6) {
            r5 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L18
            r4 = r6[r3]
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L18:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            if (r6 == 0) goto L23
            r5.colorsTheme = r6
            return r5
        L23:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setDataLabelsEnabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.dataLabelsEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setDataLabelsStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.dataLabelsStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setGradientColorEnable(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.gradientColorEnable = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setInverted(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.inverted = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setLegendEnabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.legendEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setMargin(int r1, int r2, int r3, int r4) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r0.getDimen(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r0.getDimen(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            float r4 = r0.getDimen(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setMargin(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setMargin(@org.jetbrains.annotations.NotNull java.lang.Number r2, @org.jetbrains.annotations.NotNull java.lang.Number r3, @org.jetbrains.annotations.NotNull java.lang.Number r4, @org.jetbrains.annotations.NotNull java.lang.Number r5) {
            r1 = this;
            java.lang.String r0 = "top"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "left"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "bottom"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "right"
            kotlin.jvm.internal.g0.p(r5, r0)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r2 = r1.setMargin(r2, r3, r4, r5)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setMargin(@org.jetbrains.annotations.NotNull java.lang.Number... r6) {
            r5 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L18
            r4 = r6[r3]
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L18:
            java.lang.Number[] r6 = new java.lang.Number[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            if (r6 == 0) goto L25
            java.lang.Number[] r6 = (java.lang.Number[]) r6
            r5.margin = r6
            return r5
        L25:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setMarkerRadius(@org.jetbrains.annotations.NotNull java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.markerRadius = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setMarkerRadiusRes(int r1) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setMarkerRadius(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setMarkerSymbol(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.markerSymbol = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setMarkerSymbolStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.markerSymbolStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setPolar(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.polar = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setScrollablePlotArea(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.scrollablePlotArea = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setSeries(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement... r6) {
            r5 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L18
            r4 = r6[r3]
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L18:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            if (r6 == 0) goto L23
            r5.series = r6
            return r5
        L23:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setStacking(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.stacking = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setSubtitle(int r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "formatArgs"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = r2.getString(r3, r0)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r3 = r2.setSubtitle(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setSubtitle(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.subtitle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setSubtitleAlign(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.subtitleAlign = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setSubtitleStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.subtitleStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setTitle(int r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "formatArgs"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = r2.getString(r3, r0)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r3 = r2.setTitle(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setTitle(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.title = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setTitleStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.titleStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setTooltipEnabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.tooltipEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setTooltipValueSuffix(int r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "formatArgs"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = r2.getString(r3, r0)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r3 = r2.setTooltipValueSuffix(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setTooltipValueSuffix(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.tooltipValueSuffix = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setTouchEventEnabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.touchEventEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setXAxisGridLineWidth(int r1) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setXAxisGridLineWidth(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setXAxisGridLineWidth(@org.jetbrains.annotations.NotNull java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.xAxisGridLineWidth = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setXAxisLabelsEnabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.xAxisLabelsEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setXAxisReversed(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.xAxisReversed = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setXAxisTickInterval(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.xAxisTickInterval = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setXAxisVisible(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.xAxisVisible = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisAllowDecimals(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.yAxisAllowDecimals = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisGridLineWidth(int r1) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setYAxisGridLineWidth(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisGridLineWidth(@org.jetbrains.annotations.NotNull java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.yAxisGridLineWidth = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisLabelsEnabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.yAxisLabelsEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisLineWidth(int r1) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setYAxisLineWidth(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisLineWidth(@org.jetbrains.annotations.NotNull java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.yAxisLineWidth = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisMax(int r1) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setYAxisMax(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisMax(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisMax = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisMin(int r1) {
            r0 = this;
            float r1 = r0.getDimen(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r1 = r0.setYAxisMin(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisMin(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisMin = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisReversed(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.yAxisReversed = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisTitle(int r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "formatArgs"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = r2.getString(r3, r0)
            com.github.aachartmodel.aainfographics.aatools.AABuilder r3 = r2.setYAxisTitle(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisTitle(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.yAxisTitle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setYAxisVisible(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.yAxisVisible = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aatools.AABuilder setZoomType(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.zoomType = r2
            return r1
    }
}

package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAChartModel {
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer animationDuration;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType animationType;

    @org.jetbrains.annotations.Nullable
    private java.lang.String axesTextColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object backgroundColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number borderRadius;

    @org.jetbrains.annotations.Nullable
    private java.lang.String[] categories;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartType chartType;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object[] colorsTheme;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean dataLabelsEnabled;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle dataLabelsStyle;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean gradientColorEnable;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean inverted;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean legendEnabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number[] margin;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number markerRadius;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType markerSymbol;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType markerSymbolStyle;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean polar;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea scrollablePlotArea;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object[] series;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType stacking;

    @org.jetbrains.annotations.Nullable
    private java.lang.String subtitle;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType subtitleAlign;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle subtitleStyle;

    @org.jetbrains.annotations.Nullable
    private java.lang.String title;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle titleStyle;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean tooltipEnabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.String tooltipValueSuffix;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean touchEventEnabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number xAxisGridLineWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean xAxisLabelsEnabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean xAxisReversed;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer xAxisTickInterval;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean xAxisVisible;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean yAxisAllowDecimals;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number yAxisGridLineWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean yAxisLabelsEnabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number yAxisLineWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number yAxisMax;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number yAxisMin;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean yAxisReversed;

    @org.jetbrains.annotations.Nullable
    private java.lang.String yAxisTitle;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean yAxisVisible;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType zoomType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final com.github.aachartmodel.aainfographics.aatools.AABuilder Builder(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.github.aachartmodel.aainfographics.aatools.AABuilder r0 = new com.github.aachartmodel.aainfographics.aatools.AABuilder
                r0.<init>(r2)
                return r0
        }
    }

    static {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel$Companion r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel$Companion
            r1 = 0
            r0.<init>(r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel.Companion = r0
            return
    }

    public AAChartModel() {
            r48 = this;
            r46 = 4095(0xfff, float:5.738E-42)
            r47 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = -1
            r0 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            return
    }

    public AAChartModel(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r1, @org.jetbrains.annotations.Nullable java.lang.Integer r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r6, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r9, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r10, @org.jetbrains.annotations.Nullable java.lang.Number r11, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r12, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r13, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r14, @org.jetbrains.annotations.Nullable java.lang.Boolean r15, @org.jetbrains.annotations.Nullable java.lang.Boolean r16, @org.jetbrains.annotations.Nullable java.lang.Boolean r17, @org.jetbrains.annotations.Nullable java.lang.Boolean r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.Nullable java.lang.Boolean r20, @org.jetbrains.annotations.Nullable java.lang.Boolean r21, @org.jetbrains.annotations.Nullable java.lang.Number[] r22, @org.jetbrains.annotations.Nullable java.lang.Boolean r23, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r24, @org.jetbrains.annotations.Nullable java.lang.Boolean r25, @org.jetbrains.annotations.Nullable java.lang.Integer r26, @org.jetbrains.annotations.Nullable java.lang.String[] r27, @org.jetbrains.annotations.Nullable java.lang.Number r28, @org.jetbrains.annotations.Nullable java.lang.Boolean r29, @org.jetbrains.annotations.Nullable java.lang.Boolean r30, @org.jetbrains.annotations.Nullable java.lang.Boolean r31, @org.jetbrains.annotations.Nullable java.lang.String r32, @org.jetbrains.annotations.Nullable java.lang.Number r33, @org.jetbrains.annotations.Nullable java.lang.Number r34, @org.jetbrains.annotations.Nullable java.lang.Number r35, @org.jetbrains.annotations.Nullable java.lang.Boolean r36, @org.jetbrains.annotations.Nullable java.lang.Number r37, @org.jetbrains.annotations.Nullable java.lang.Object[] r38, @org.jetbrains.annotations.Nullable java.lang.Boolean r39, @org.jetbrains.annotations.Nullable java.lang.Object r40, @org.jetbrains.annotations.Nullable java.lang.Number r41, @org.jetbrains.annotations.Nullable java.lang.Object[] r42, @org.jetbrains.annotations.Nullable java.lang.Boolean r43, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r44) {
            r0 = this;
            r0.<init>()
            r0.animationType = r1
            r0.animationDuration = r2
            r0.title = r3
            r0.titleStyle = r4
            r0.subtitle = r5
            r0.subtitleAlign = r6
            r0.subtitleStyle = r7
            r0.axesTextColor = r8
            r0.chartType = r9
            r0.stacking = r10
            r0.markerRadius = r11
            r0.markerSymbol = r12
            r0.markerSymbolStyle = r13
            r0.zoomType = r14
            r0.inverted = r15
            r1 = r16
            r0.xAxisReversed = r1
            r1 = r17
            r0.yAxisReversed = r1
            r1 = r18
            r0.tooltipEnabled = r1
            r1 = r19
            r0.tooltipValueSuffix = r1
            r1 = r20
            r0.gradientColorEnable = r1
            r1 = r21
            r0.polar = r1
            r1 = r22
            r0.margin = r1
            r1 = r23
            r0.dataLabelsEnabled = r1
            r1 = r24
            r0.dataLabelsStyle = r1
            r1 = r25
            r0.xAxisLabelsEnabled = r1
            r1 = r26
            r0.xAxisTickInterval = r1
            r1 = r27
            r0.categories = r1
            r1 = r28
            r0.xAxisGridLineWidth = r1
            r1 = r29
            r0.xAxisVisible = r1
            r1 = r30
            r0.yAxisVisible = r1
            r1 = r31
            r0.yAxisLabelsEnabled = r1
            r1 = r32
            r0.yAxisTitle = r1
            r1 = r33
            r0.yAxisLineWidth = r1
            r1 = r34
            r0.yAxisMin = r1
            r1 = r35
            r0.yAxisMax = r1
            r1 = r36
            r0.yAxisAllowDecimals = r1
            r1 = r37
            r0.yAxisGridLineWidth = r1
            r1 = r38
            r0.colorsTheme = r1
            r1 = r39
            r0.legendEnabled = r1
            r1 = r40
            r0.backgroundColor = r1
            r1 = r41
            r0.borderRadius = r1
            r1 = r42
            r0.series = r1
            r1 = r43
            r0.touchEventEnabled = r1
            r1 = r44
            r0.scrollablePlotArea = r1
            return
    }

    public /* synthetic */ AAChartModel(com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r40, java.lang.Integer r41, java.lang.String r42, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r43, java.lang.String r44, com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r45, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r46, java.lang.String r47, com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r48, com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r49, java.lang.Number r50, com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r51, com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r52, com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r53, java.lang.Boolean r54, java.lang.Boolean r55, java.lang.Boolean r56, java.lang.Boolean r57, java.lang.String r58, java.lang.Boolean r59, java.lang.Boolean r60, java.lang.Number[] r61, java.lang.Boolean r62, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r63, java.lang.Boolean r64, java.lang.Integer r65, java.lang.String[] r66, java.lang.Number r67, java.lang.Boolean r68, java.lang.Boolean r69, java.lang.Boolean r70, java.lang.String r71, java.lang.Number r72, java.lang.Number r73, java.lang.Number r74, java.lang.Boolean r75, java.lang.Number r76, java.lang.Object[] r77, java.lang.Boolean r78, java.lang.Object r79, java.lang.Number r80, java.lang.Object[] r81, java.lang.Boolean r82, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r83, int r84, int r85, kotlin.jvm.internal.v r86) {
            r39 = this;
            r0 = r84
            r1 = r85
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = r0 & 1
            if (r3 == 0) goto L10
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r3 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType.Linear
            goto L12
        L10:
            r3 = r40
        L12:
            r4 = r0 & 2
            if (r4 == 0) goto L1d
            r4 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L1f
        L1d:
            r4 = r41
        L1f:
            r5 = r0 & 4
            java.lang.String r6 = ""
            if (r5 == 0) goto L27
            r5 = r6
            goto L29
        L27:
            r5 = r42
        L29:
            r7 = r0 & 8
            if (r7 == 0) goto L2f
            r7 = 0
            goto L31
        L2f:
            r7 = r43
        L31:
            r9 = r0 & 16
            if (r9 == 0) goto L36
            goto L38
        L36:
            r6 = r44
        L38:
            r9 = r0 & 32
            if (r9 == 0) goto L3e
            r9 = 0
            goto L40
        L3e:
            r9 = r45
        L40:
            r10 = r0 & 64
            if (r10 == 0) goto L46
            r10 = 0
            goto L48
        L46:
            r10 = r46
        L48:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L4e
            r11 = 0
            goto L50
        L4e:
            r11 = r47
        L50:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L57
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r12 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartType.Line
            goto L59
        L57:
            r12 = r48
        L59:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L60
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r13 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.False
            goto L62
        L60:
            r13 = r49
        L62:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L6d
            r14 = 1086324736(0x40c00000, float:6.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            goto L6f
        L6d:
            r14 = r50
        L6f:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L75
            r15 = 0
            goto L77
        L75:
            r15 = r51
        L77:
            r8 = r0 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L7e
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r8 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType.Normal
            goto L80
        L7e:
            r8 = r52
        L80:
            r86 = r2
            r2 = r0 & 8192(0x2000, float:1.148E-41)
            if (r2 == 0) goto L89
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r2 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.None
            goto L8b
        L89:
            r2 = r53
        L8b:
            r41 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L94
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L96
        L94:
            r2 = r54
        L96:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto La0
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            goto La2
        La0:
            r16 = r55
        La2:
            r17 = 65536(0x10000, float:9.1835E-41)
            r17 = r0 & r17
            if (r17 == 0) goto Lab
            java.lang.Boolean r17 = java.lang.Boolean.FALSE
            goto Lad
        Lab:
            r17 = r56
        Lad:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto Lb6
            r18 = 0
            goto Lb8
        Lb6:
            r18 = r57
        Lb8:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto Lc1
            r19 = 0
            goto Lc3
        Lc1:
            r19 = r58
        Lc3:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto Lcc
            java.lang.Boolean r20 = java.lang.Boolean.FALSE
            goto Lce
        Lcc:
            r20 = r59
        Lce:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto Ld7
            java.lang.Boolean r21 = java.lang.Boolean.FALSE
            goto Ld9
        Ld7:
            r21 = r60
        Ld9:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto Le2
            r22 = 0
            goto Le4
        Le2:
            r22 = r61
        Le4:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto Led
            java.lang.Boolean r23 = java.lang.Boolean.FALSE
            goto Lef
        Led:
            r23 = r62
        Lef:
            r24 = 8388608(0x800000, float:1.1754944E-38)
            r24 = r0 & r24
            if (r24 == 0) goto Lf8
            r24 = 0
            goto Lfa
        Lf8:
            r24 = r63
        Lfa:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L103
            java.lang.Boolean r25 = java.lang.Boolean.TRUE
            goto L105
        L103:
            r25 = r64
        L105:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L10e
            r26 = 0
            goto L110
        L10e:
            r26 = r65
        L110:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L119
            r27 = 0
            goto L11b
        L119:
            r27 = r66
        L11b:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L124
            r28 = r86
            goto L126
        L124:
            r28 = r67
        L126:
            r29 = 268435456(0x10000000, float:2.524355E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L12f
            r29 = 0
            goto L131
        L12f:
            r29 = r68
        L131:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r0 & r30
            if (r30 == 0) goto L13a
            r30 = 0
            goto L13c
        L13a:
            r30 = r69
        L13c:
            r31 = 1073741824(0x40000000, float:2.0)
            r31 = r0 & r31
            if (r31 == 0) goto L145
            java.lang.Boolean r31 = java.lang.Boolean.TRUE
            goto L147
        L145:
            r31 = r70
        L147:
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r32
            if (r0 == 0) goto L14f
            r0 = 0
            goto L151
        L14f:
            r0 = r71
        L151:
            r32 = r1 & 1
            if (r32 == 0) goto L158
            r32 = 0
            goto L15a
        L158:
            r32 = r72
        L15a:
            r33 = r1 & 2
            if (r33 == 0) goto L161
            r33 = 0
            goto L163
        L161:
            r33 = r73
        L163:
            r34 = r1 & 4
            if (r34 == 0) goto L16a
            r34 = 0
            goto L16c
        L16a:
            r34 = r74
        L16c:
            r35 = r1 & 8
            if (r35 == 0) goto L173
            r35 = 0
            goto L175
        L173:
            r35 = r75
        L175:
            r36 = r1 & 16
            if (r36 == 0) goto L180
            r36 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r36 = java.lang.Float.valueOf(r36)
            goto L182
        L180:
            r36 = r76
        L182:
            r37 = r1 & 32
            r42 = r0
            if (r37 == 0) goto L1a4
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r37 = 0
            java.lang.String r38 = "#fe117c"
            r0[r37] = r38
            java.lang.String r37 = "#ffc069"
            r38 = 1
            r0[r38] = r37
            java.lang.String r37 = "#06caf4"
            r38 = 2
            r0[r38] = r37
            r37 = 3
            java.lang.String r38 = "#7dffc0"
            r0[r37] = r38
            goto L1a6
        L1a4:
            r0 = r77
        L1a6:
            r37 = r1 & 64
            if (r37 == 0) goto L1ad
            java.lang.Boolean r37 = java.lang.Boolean.TRUE
            goto L1af
        L1ad:
            r37 = r78
        L1af:
            r43 = r0
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1b8
            java.lang.String r0 = "#ffffff"
            goto L1ba
        L1b8:
            r0 = r79
        L1ba:
            r44 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L1c3
            r0 = r86
            goto L1c5
        L1c3:
            r0 = r80
        L1c5:
            r45 = r0
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L1cd
            r0 = 0
            goto L1cf
        L1cd:
            r0 = r81
        L1cf:
            r46 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L1d7
            r0 = 0
            goto L1d9
        L1d7:
            r0 = r82
        L1d9:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L238
            r84 = 0
        L1df:
            r40 = r39
            r54 = r41
            r72 = r42
            r78 = r43
            r80 = r44
            r81 = r45
            r82 = r46
            r83 = r0
            r55 = r2
            r41 = r3
            r42 = r4
            r43 = r5
            r45 = r6
            r44 = r7
            r53 = r8
            r46 = r9
            r47 = r10
            r48 = r11
            r49 = r12
            r50 = r13
            r51 = r14
            r52 = r15
            r56 = r16
            r57 = r17
            r58 = r18
            r59 = r19
            r60 = r20
            r61 = r21
            r62 = r22
            r63 = r23
            r64 = r24
            r65 = r25
            r66 = r26
            r67 = r27
            r68 = r28
            r69 = r29
            r70 = r30
            r71 = r31
            r73 = r32
            r74 = r33
            r75 = r34
            r76 = r35
            r77 = r36
            r79 = r37
            goto L23b
        L238:
            r84 = r83
            goto L1df
        L23b:
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel animationDuration(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.animationDuration = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel animationType(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.animationType = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel axesTextColor(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.axesTextColor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel backgroundColor(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.backgroundColor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel borderRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderRadius = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel categories(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.categories = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel chartType(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.chartType = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel colorsTheme(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.colorsTheme = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel dataLabelsEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.dataLabelsEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel dataLabelsStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.dataLabelsStyle = r2
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAnimationDuration() {
            r1 = this;
            java.lang.Integer r0 = r1.animationDuration
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType getAnimationType() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r0 = r1.animationType
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAxesTextColor() {
            r1 = this;
            java.lang.String r0 = r1.axesTextColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBackgroundColor() {
            r1 = this;
            java.lang.Object r0 = r1.backgroundColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getBorderRadius() {
            r1 = this;
            java.lang.Number r0 = r1.borderRadius
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String[] getCategories() {
            r1 = this;
            java.lang.String[] r0 = r1.categories
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartType getChartType() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r0 = r1.chartType
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object[] getColorsTheme() {
            r1 = this;
            java.lang.Object[] r0 = r1.colorsTheme
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getDataLabelsEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.dataLabelsEnabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle getDataLabelsStyle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = r1.dataLabelsStyle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getGradientColorEnable() {
            r1 = this;
            java.lang.Boolean r0 = r1.gradientColorEnable
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getInverted() {
            r1 = this;
            java.lang.Boolean r0 = r1.inverted
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getLegendEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.legendEnabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number[] getMargin() {
            r1 = this;
            java.lang.Number[] r0 = r1.margin
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getMarkerRadius() {
            r1 = this;
            java.lang.Number r0 = r1.markerRadius
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType getMarkerSymbol() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r0 = r1.markerSymbol
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType getMarkerSymbolStyle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r0 = r1.markerSymbolStyle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getPolar() {
            r1 = this;
            java.lang.Boolean r0 = r1.polar
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea getScrollablePlotArea() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r0 = r1.scrollablePlotArea
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object[] getSeries() {
            r1 = this;
            java.lang.Object[] r0 = r1.series
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType getStacking() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r0 = r1.stacking
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSubtitle() {
            r1 = this;
            java.lang.String r0 = r1.subtitle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType getSubtitleAlign() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r0 = r1.subtitleAlign
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle getSubtitleStyle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = r1.subtitleStyle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle getTitleStyle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = r1.titleStyle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getTooltipEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.tooltipEnabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTooltipValueSuffix() {
            r1 = this;
            java.lang.String r0 = r1.tooltipValueSuffix
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getTouchEventEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.touchEventEnabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getXAxisGridLineWidth() {
            r1 = this;
            java.lang.Number r0 = r1.xAxisGridLineWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getXAxisLabelsEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.xAxisLabelsEnabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getXAxisReversed() {
            r1 = this;
            java.lang.Boolean r0 = r1.xAxisReversed
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getXAxisTickInterval() {
            r1 = this;
            java.lang.Integer r0 = r1.xAxisTickInterval
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getXAxisVisible() {
            r1 = this;
            java.lang.Boolean r0 = r1.xAxisVisible
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getYAxisAllowDecimals() {
            r1 = this;
            java.lang.Boolean r0 = r1.yAxisAllowDecimals
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getYAxisGridLineWidth() {
            r1 = this;
            java.lang.Number r0 = r1.yAxisGridLineWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getYAxisLabelsEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.yAxisLabelsEnabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getYAxisLineWidth() {
            r1 = this;
            java.lang.Number r0 = r1.yAxisLineWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getYAxisMax() {
            r1 = this;
            java.lang.Number r0 = r1.yAxisMax
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getYAxisMin() {
            r1 = this;
            java.lang.Number r0 = r1.yAxisMin
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getYAxisReversed() {
            r1 = this;
            java.lang.Boolean r0 = r1.yAxisReversed
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getYAxisTitle() {
            r1 = this;
            java.lang.String r0 = r1.yAxisTitle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getYAxisVisible() {
            r1 = this;
            java.lang.Boolean r0 = r1.yAxisVisible
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType getZoomType() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r0 = r1.zoomType
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel gradientColorEnable(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.gradientColorEnable = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel inverted(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.inverted = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel legendEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.legendEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel margin(@org.jetbrains.annotations.Nullable java.lang.Number[] r1) {
            r0 = this;
            r0.margin = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel markerRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.markerRadius = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel markerSymbol(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.markerSymbol = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel markerSymbolStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.markerSymbolStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel polar(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.polar = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel scrollablePlotArea(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.scrollablePlotArea = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel series(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.series = r2
            return r1
    }

    public final void setAnimationDuration(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.animationDuration = r1
            return
    }

    public final void setAnimationType(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r1) {
            r0 = this;
            r0.animationType = r1
            return
    }

    public final void setAxesTextColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.axesTextColor = r1
            return
    }

    public final void setBackgroundColor(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.backgroundColor = r1
            return
    }

    public final void setBorderRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderRadius = r1
            return
    }

    public final void setCategories(@org.jetbrains.annotations.Nullable java.lang.String[] r1) {
            r0 = this;
            r0.categories = r1
            return
    }

    public final void setChartType(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r1) {
            r0 = this;
            r0.chartType = r1
            return
    }

    public final void setColorsTheme(@org.jetbrains.annotations.Nullable java.lang.Object[] r1) {
            r0 = this;
            r0.colorsTheme = r1
            return
    }

    public final void setDataLabelsEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.dataLabelsEnabled = r1
            return
    }

    public final void setDataLabelsStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r1) {
            r0 = this;
            r0.dataLabelsStyle = r1
            return
    }

    public final void setGradientColorEnable(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.gradientColorEnable = r1
            return
    }

    public final void setInverted(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.inverted = r1
            return
    }

    public final void setLegendEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.legendEnabled = r1
            return
    }

    public final void setMargin(@org.jetbrains.annotations.Nullable java.lang.Number[] r1) {
            r0 = this;
            r0.margin = r1
            return
    }

    public final void setMarkerRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.markerRadius = r1
            return
    }

    public final void setMarkerSymbol(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r1) {
            r0 = this;
            r0.markerSymbol = r1
            return
    }

    public final void setMarkerSymbolStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r1) {
            r0 = this;
            r0.markerSymbolStyle = r1
            return
    }

    public final void setPolar(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.polar = r1
            return
    }

    public final void setScrollablePlotArea(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r1) {
            r0 = this;
            r0.scrollablePlotArea = r1
            return
    }

    public final void setSeries(@org.jetbrains.annotations.Nullable java.lang.Object[] r1) {
            r0 = this;
            r0.series = r1
            return
    }

    public final void setStacking(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r1) {
            r0 = this;
            r0.stacking = r1
            return
    }

    public final void setSubtitle(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.subtitle = r1
            return
    }

    public final void setSubtitleAlign(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r1) {
            r0 = this;
            r0.subtitleAlign = r1
            return
    }

    public final void setSubtitleStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r1) {
            r0 = this;
            r0.subtitleStyle = r1
            return
    }

    public final void setTitle(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }

    public final void setTitleStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r1) {
            r0 = this;
            r0.titleStyle = r1
            return
    }

    public final void setTooltipEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.tooltipEnabled = r1
            return
    }

    public final void setTooltipValueSuffix(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.tooltipValueSuffix = r1
            return
    }

    public final void setTouchEventEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.touchEventEnabled = r1
            return
    }

    public final void setXAxisGridLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.xAxisGridLineWidth = r1
            return
    }

    public final void setXAxisLabelsEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.xAxisLabelsEnabled = r1
            return
    }

    public final void setXAxisReversed(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.xAxisReversed = r1
            return
    }

    public final void setXAxisTickInterval(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.xAxisTickInterval = r1
            return
    }

    public final void setXAxisVisible(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.xAxisVisible = r1
            return
    }

    public final void setYAxisAllowDecimals(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisAllowDecimals = r1
            return
    }

    public final void setYAxisGridLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisGridLineWidth = r1
            return
    }

    public final void setYAxisLabelsEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisLabelsEnabled = r1
            return
    }

    public final void setYAxisLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisLineWidth = r1
            return
    }

    public final void setYAxisMax(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisMax = r1
            return
    }

    public final void setYAxisMin(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisMin = r1
            return
    }

    public final void setYAxisReversed(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisReversed = r1
            return
    }

    public final void setYAxisTitle(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.yAxisTitle = r1
            return
    }

    public final void setYAxisVisible(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisVisible = r1
            return
    }

    public final void setZoomType(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r1) {
            r0 = this;
            r0.zoomType = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel stacking(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.stacking = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel subtitle(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.subtitle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel subtitleAlign(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.subtitleAlign = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel subtitleStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.subtitleStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel title(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.title = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel titleStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.titleStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel tooltipEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.tooltipEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel tooltipValueSuffix(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.tooltipValueSuffix = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel touchEventEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.touchEventEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel xAxisGridLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.xAxisGridLineWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel xAxisLabelsEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.xAxisLabelsEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel xAxisReversed(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.xAxisReversed = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel xAxisTickInterval(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.xAxisTickInterval = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel xAxisVisible(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.xAxisVisible = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisAllowDecimals(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisAllowDecimals = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisGridLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisGridLineWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisLabelsEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisLabelsEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisLineWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisMax(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisMax = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisMin(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.yAxisMin = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisReversed(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisReversed = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisTitle(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.yAxisTitle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel yAxisVisible(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.yAxisVisible = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel zoomType(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.zoomType = r2
            return r1
    }
}

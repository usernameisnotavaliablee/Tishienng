package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAPlotLinesElement {
    private java.lang.Object color;
    private java.lang.String dashStyle;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabel label;
    private java.lang.Number value;
    private java.lang.Number width;
    private java.lang.Integer zIndex;

    public AAPlotLinesElement() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotLinesElement color(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.color = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotLinesElement dashStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.getValue()
            r1.dashStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotLinesElement label(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabel r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.label = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotLinesElement value(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.value = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotLinesElement width(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.width = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotLinesElement zIndex(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}

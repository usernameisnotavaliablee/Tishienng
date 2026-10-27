package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AACrosshair {

    @org.jetbrains.annotations.Nullable
    private java.lang.String color;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType dashStyle;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number width;

    public AACrosshair() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AACrosshair color(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.color = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AACrosshair dashStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.dashStyle = r2
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getColor() {
            r1 = this;
            java.lang.String r0 = r1.color
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType getDashStyle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType r0 = r1.dashStyle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getWidth() {
            r1 = this;
            java.lang.Number r0 = r1.width
            return r0
    }

    public final void setColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.color = r1
            return
    }

    public final void setDashStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType r1) {
            r0 = this;
            r0.dashStyle = r1
            return
    }

    public final void setWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.width = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AACrosshair width(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.width = r1
            return r0
    }
}

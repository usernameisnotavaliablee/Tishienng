package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AALegend {

    @org.jetbrains.annotations.Nullable
    private java.lang.String align;

    @org.jetbrains.annotations.Nullable
    private java.lang.String borderColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number borderWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean enabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean floating;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number itemMarginTop;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle itemStyle;

    @org.jetbrains.annotations.Nullable
    private java.lang.String labelFormat;

    @org.jetbrains.annotations.Nullable
    private java.lang.String layout;

    @org.jetbrains.annotations.Nullable
    private java.lang.String verticalAlign;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number x;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number y;

    public AALegend() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend align(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.getValue()
            r1.align = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend borderColor(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.borderColor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend borderWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend enabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend floating(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.floating = r1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAlign() {
            r1 = this;
            java.lang.String r0 = r1.align
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBorderColor() {
            r1 = this;
            java.lang.String r0 = r1.borderColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getBorderWidth() {
            r1 = this;
            java.lang.Number r0 = r1.borderWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.enabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFloating() {
            r1 = this;
            java.lang.Boolean r0 = r1.floating
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getItemMarginTop() {
            r1 = this;
            java.lang.Number r0 = r1.itemMarginTop
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle getItemStyle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle r0 = r1.itemStyle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLabelFormat() {
            r1 = this;
            java.lang.String r0 = r1.labelFormat
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLayout() {
            r1 = this;
            java.lang.String r0 = r1.layout
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVerticalAlign() {
            r1 = this;
            java.lang.String r0 = r1.verticalAlign
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getX() {
            r1 = this;
            java.lang.Number r0 = r1.x
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getY() {
            r1 = this;
            java.lang.Number r0 = r1.y
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend itemMarginTop(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.itemMarginTop = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend itemStyle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.itemStyle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend labelFormat(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.labelFormat = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend layout(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.getValue()
            r1.layout = r2
            return r1
    }

    public final void setAlign(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.align = r1
            return
    }

    public final void setBorderColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.borderColor = r1
            return
    }

    public final void setBorderWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderWidth = r1
            return
    }

    public final void setEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enabled = r1
            return
    }

    public final void setFloating(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.floating = r1
            return
    }

    public final void setItemMarginTop(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.itemMarginTop = r1
            return
    }

    public final void setItemStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle r1) {
            r0 = this;
            r0.itemStyle = r1
            return
    }

    public final void setLabelFormat(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.labelFormat = r1
            return
    }

    public final void setLayout(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.layout = r1
            return
    }

    public final void setVerticalAlign(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.verticalAlign = r1
            return
    }

    public final void setX(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public final void setY(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.y = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend verticalAlign(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.getValue()
            r1.verticalAlign = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend x(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.x = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend y(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.y = r1
            return r0
    }
}

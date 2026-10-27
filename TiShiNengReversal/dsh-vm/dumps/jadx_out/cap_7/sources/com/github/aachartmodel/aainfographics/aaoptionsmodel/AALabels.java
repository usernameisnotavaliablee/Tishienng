package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AALabels {

    @org.jetbrains.annotations.Nullable
    private java.lang.String align;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object autoRotation;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number autoRotationLimit;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number distance;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean enabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.String format;

    @org.jetbrains.annotations.Nullable
    private java.lang.String formatter;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number padding;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number rotation;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer staggerLines;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer step;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean useHTML;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number x;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number y;

    public AALabels() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels align(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.getValue()
            r1.align = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels autoRotation(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.autoRotation = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels autoRotationLimit(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.autoRotationLimit = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels distance(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.distance = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels enabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels format(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.format = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels formatter(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer r0 = com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer.INSTANCE
            java.lang.String r2 = r0.pureAnonymousJSFunctionString(r2)
            r1.formatter = r2
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAlign() {
            r1 = this;
            java.lang.String r0 = r1.align
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAutoRotation() {
            r1 = this;
            java.lang.Object r0 = r1.autoRotation
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getAutoRotationLimit() {
            r1 = this;
            java.lang.Number r0 = r1.autoRotationLimit
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getDistance() {
            r1 = this;
            java.lang.Number r0 = r1.distance
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.enabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFormat() {
            r1 = this;
            java.lang.String r0 = r1.format
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFormatter() {
            r1 = this;
            java.lang.String r0 = r1.formatter
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getPadding() {
            r1 = this;
            java.lang.Number r0 = r1.padding
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getRotation() {
            r1 = this;
            java.lang.Number r0 = r1.rotation
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStaggerLines() {
            r1 = this;
            java.lang.Integer r0 = r1.staggerLines
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStep() {
            r1 = this;
            java.lang.Integer r0 = r1.step
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle getStyle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = r1.style
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getUseHTML() {
            r1 = this;
            java.lang.Boolean r0 = r1.useHTML
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
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels padding(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.padding = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels rotation(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.rotation = r1
            return r0
    }

    public final void setAlign(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.align = r1
            return
    }

    public final void setAutoRotation(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.autoRotation = r1
            return
    }

    public final void setAutoRotationLimit(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.autoRotationLimit = r1
            return
    }

    public final void setDistance(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.distance = r1
            return
    }

    public final void setEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enabled = r1
            return
    }

    public final void setFormat(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.format = r1
            return
    }

    public final void setFormatter(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.formatter = r1
            return
    }

    public final void setPadding(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.padding = r1
            return
    }

    public final void setRotation(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.rotation = r1
            return
    }

    public final void setStaggerLines(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.staggerLines = r1
            return
    }

    public final void setStep(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.step = r1
            return
    }

    public final void setStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r1) {
            r0 = this;
            r0.style = r1
            return
    }

    public final void setUseHTML(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.useHTML = r1
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
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels staggerLines(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.staggerLines = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels step(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.step = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels style(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.style = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels useHTML(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.useHTML = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels x(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.x = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels y(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.y = r1
            return r0
    }
}

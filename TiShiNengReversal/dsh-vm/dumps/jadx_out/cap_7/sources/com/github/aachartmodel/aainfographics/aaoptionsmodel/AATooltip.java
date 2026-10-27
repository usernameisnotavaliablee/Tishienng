package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AATooltip {

    @org.jetbrains.annotations.Nullable
    private java.lang.Object backgroundColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.String borderColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number borderRadius;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number borderWidth;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AADateTimeLabelFormats dateTimeLabelFormats;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean enabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean followTouchMove;

    @org.jetbrains.annotations.Nullable
    private java.lang.String footerFormat;

    @org.jetbrains.annotations.Nullable
    private java.lang.String formatter;

    @org.jetbrains.annotations.Nullable
    private java.lang.String headerFormat;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number padding;

    @org.jetbrains.annotations.Nullable
    private java.lang.String pointFormat;

    @org.jetbrains.annotations.Nullable
    private java.lang.String pointFormatter;

    @org.jetbrains.annotations.Nullable
    private java.lang.String positioner;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean shadow;

    @org.jetbrains.annotations.Nullable
    private java.lang.String shape;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean shared;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean useHTML;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer valueDecimals;

    @org.jetbrains.annotations.Nullable
    private java.lang.String valueSuffix;

    public AATooltip() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.shared = r0
            r1.enabled = r0
            r1.shadow = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip backgroundColor(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.backgroundColor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip borderColor(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.borderColor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip borderRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderRadius = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip borderWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip dateTimeLabelFormats(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AADateTimeLabelFormats r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.dateTimeLabelFormats = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip enabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip followTouchMove(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.followTouchMove = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip footerFormat(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.footerFormat = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip formatter(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer r0 = com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer.INSTANCE
            java.lang.String r2 = r0.pureAnonymousJSFunctionString(r2)
            r1.formatter = r2
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBackgroundColor() {
            r1 = this;
            java.lang.Object r0 = r1.backgroundColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBorderColor() {
            r1 = this;
            java.lang.String r0 = r1.borderColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getBorderRadius() {
            r1 = this;
            java.lang.Number r0 = r1.borderRadius
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getBorderWidth() {
            r1 = this;
            java.lang.Number r0 = r1.borderWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AADateTimeLabelFormats getDateTimeLabelFormats() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AADateTimeLabelFormats r0 = r1.dateTimeLabelFormats
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.enabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFollowTouchMove() {
            r1 = this;
            java.lang.Boolean r0 = r1.followTouchMove
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFooterFormat() {
            r1 = this;
            java.lang.String r0 = r1.footerFormat
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFormatter() {
            r1 = this;
            java.lang.String r0 = r1.formatter
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeaderFormat() {
            r1 = this;
            java.lang.String r0 = r1.headerFormat
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getPadding() {
            r1 = this;
            java.lang.Number r0 = r1.padding
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPointFormat() {
            r1 = this;
            java.lang.String r0 = r1.pointFormat
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPointFormatter() {
            r1 = this;
            java.lang.String r0 = r1.pointFormatter
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPositioner() {
            r1 = this;
            java.lang.String r0 = r1.positioner
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getShadow() {
            r1 = this;
            java.lang.Boolean r0 = r1.shadow
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShape() {
            r1 = this;
            java.lang.String r0 = r1.shape
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getShared() {
            r1 = this;
            java.lang.Boolean r0 = r1.shared
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
    public final java.lang.Integer getValueDecimals() {
            r1 = this;
            java.lang.Integer r0 = r1.valueDecimals
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValueSuffix() {
            r1 = this;
            java.lang.String r0 = r1.valueSuffix
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip headerFormat(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.headerFormat = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip padding(@org.jetbrains.annotations.NotNull java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.padding = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip pointFormat(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.pointFormat = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip pointFormatter(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer r0 = com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer.INSTANCE
            java.lang.String r2 = r0.pureAnonymousJSFunctionString(r2)
            r1.pointFormatter = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip positioner(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer r0 = com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer.INSTANCE
            java.lang.String r2 = r0.pureAnonymousJSFunctionString(r2)
            r1.positioner = r2
            return r1
    }

    public final void setBackgroundColor(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.backgroundColor = r1
            return
    }

    public final void setBorderColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.borderColor = r1
            return
    }

    public final void setBorderRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderRadius = r1
            return
    }

    public final void setBorderWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderWidth = r1
            return
    }

    public final void setDateTimeLabelFormats(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AADateTimeLabelFormats r1) {
            r0 = this;
            r0.dateTimeLabelFormats = r1
            return
    }

    public final void setEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enabled = r1
            return
    }

    public final void setFollowTouchMove(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.followTouchMove = r1
            return
    }

    public final void setFooterFormat(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.footerFormat = r1
            return
    }

    public final void setFormatter(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.formatter = r1
            return
    }

    public final void setHeaderFormat(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.headerFormat = r1
            return
    }

    public final void setPadding(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.padding = r1
            return
    }

    public final void setPointFormat(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.pointFormat = r1
            return
    }

    public final void setPointFormatter(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.pointFormatter = r1
            return
    }

    public final void setPositioner(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.positioner = r1
            return
    }

    public final void setShadow(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.shadow = r1
            return
    }

    public final void setShape(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.shape = r1
            return
    }

    public final void setShared(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.shared = r1
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

    public final void setValueDecimals(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.valueDecimals = r1
            return
    }

    public final void setValueSuffix(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.valueSuffix = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip shadow(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.shadow = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip shape(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.shape = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip shared(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.shared = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip style(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.style = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip useHTML(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.useHTML = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip valueDecimals(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.valueDecimals = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip valueSuffix(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.valueSuffix = r1
            return r0
    }
}

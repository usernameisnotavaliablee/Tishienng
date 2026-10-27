package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAOptions {

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart chart;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object[] colors;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits credits;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang defaultOptions;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend legend;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane pane;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions plotOptions;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object[] series;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle subtitle;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle title;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip tooltip;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean touchEventEnabled;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis xAxis;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis[] xAxisArray;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis yAxis;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis[] yAxisArray;

    public AAOptions() {
            r2 = this;
            r2.<init>()
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits r0 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setEnabled(r1)
            r2.credits = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions chart(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.chart = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions colors(@org.jetbrains.annotations.Nullable java.lang.Object[] r1) {
            r0 = this;
            r0.colors = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions credits(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.credits = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions defaultOptions(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.defaultOptions = r2
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart getChart() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart r0 = r1.chart
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object[] getColors() {
            r1 = this;
            java.lang.Object[] r0 = r1.colors
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits getCredits() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits r0 = r1.credits
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang getDefaultOptions() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang r0 = r1.defaultOptions
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend getLegend() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend r0 = r1.legend
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane getPane() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane r0 = r1.pane
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions getPlotOptions() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions r0 = r1.plotOptions
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object[] getSeries() {
            r1 = this;
            java.lang.Object[] r0 = r1.series
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle getSubtitle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle r0 = r1.subtitle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle getTitle() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle r0 = r1.title
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip getTooltip() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip r0 = r1.tooltip
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getTouchEventEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.touchEventEnabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis getXAxis() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis r0 = r1.xAxis
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis[] getXAxisArray() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis[] r0 = r1.xAxisArray
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis getYAxis() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis r0 = r1.yAxis
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis[] getYAxisArray() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis[] r0 = r1.yAxisArray
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions legend(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.legend = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions pane(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane r1) {
            r0 = this;
            r0.pane = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions plotOptions(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.plotOptions = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions series(@org.jetbrains.annotations.Nullable java.lang.Object[] r1) {
            r0 = this;
            r0.series = r1
            return r0
    }

    public final void setChart(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart r1) {
            r0 = this;
            r0.chart = r1
            return
    }

    public final void setColors(@org.jetbrains.annotations.Nullable java.lang.Object[] r1) {
            r0 = this;
            r0.colors = r1
            return
    }

    public final void setCredits(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits r1) {
            r0 = this;
            r0.credits = r1
            return
    }

    public final void setDefaultOptions(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang r1) {
            r0 = this;
            r0.defaultOptions = r1
            return
    }

    public final void setLegend(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend r1) {
            r0 = this;
            r0.legend = r1
            return
    }

    public final void setPane(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane r1) {
            r0 = this;
            r0.pane = r1
            return
    }

    public final void setPlotOptions(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions r1) {
            r0 = this;
            r0.plotOptions = r1
            return
    }

    public final void setSeries(@org.jetbrains.annotations.Nullable java.lang.Object[] r1) {
            r0 = this;
            r0.series = r1
            return
    }

    public final void setSubtitle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle r1) {
            r0 = this;
            r0.subtitle = r1
            return
    }

    public final void setTitle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle r1) {
            r0 = this;
            r0.title = r1
            return
    }

    public final void setTooltip(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip r1) {
            r0 = this;
            r0.tooltip = r1
            return
    }

    public final void setTouchEventEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.touchEventEnabled = r1
            return
    }

    public final void setXAxis(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis r1) {
            r0 = this;
            r0.xAxis = r1
            return
    }

    public final void setXAxisArray(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis[] r1) {
            r0 = this;
            r0.xAxisArray = r1
            return
    }

    public final void setYAxis(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis r1) {
            r0 = this;
            r0.yAxis = r1
            return
    }

    public final void setYAxisArray(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis[] r1) {
            r0 = this;
            r0.yAxisArray = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions subtitle(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.subtitle = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions title(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.title = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions tooltip(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.tooltip = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions touchEventEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.touchEventEnabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions xAxis(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.xAxis = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions xAxisArray(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis[] r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.xAxisArray = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions yAxis(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.yAxis = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AAOptions yAxisArray(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis[] r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.yAxisArray = r2
            return r1
    }
}

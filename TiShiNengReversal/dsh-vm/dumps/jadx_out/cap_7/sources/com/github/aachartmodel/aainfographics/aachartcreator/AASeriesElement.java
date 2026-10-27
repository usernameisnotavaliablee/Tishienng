package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AASeriesElement {
    private java.lang.Boolean allowPointSelect;
    private java.lang.String borderColor;
    private java.lang.Number borderRadius;
    private java.lang.Object borderRadiusBottomLeft;
    private java.lang.Object borderRadiusBottomRight;
    private java.lang.Object borderRadiusTopLeft;
    private java.lang.Object borderRadiusTopRight;
    private java.lang.Number borderWidth;
    private java.lang.Object color;
    private java.lang.Boolean colorByPoint;
    private java.lang.Boolean connectNulls;
    private java.lang.String dashStyle;
    private java.lang.Object[] data;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels dataLabels;
    private java.lang.Boolean enableMouseTracking;
    private java.lang.Object fillColor;
    private java.lang.Float fillOpacity;
    private java.lang.String id;
    private java.lang.Object innerSize;
    private java.lang.Number lineWidth;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker marker;
    private java.lang.String name;
    private java.lang.String negativeColor;
    private java.lang.Object negativeFillColor;
    private java.lang.Boolean reversed;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAShadow shadow;
    private java.lang.Boolean showInLegend;
    private java.lang.Object size;
    private java.lang.String stack;
    private java.lang.Object states;
    private java.lang.Object step;
    private java.lang.Number threshold;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip tooltip;
    private java.lang.String type;
    private java.lang.Integer yAxis;
    private java.lang.Integer zIndex;
    private java.lang.String zoneAxis;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAZonesElement[] zones;

    public AASeriesElement() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement allowPointSelect(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.allowPointSelect = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement borderColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.borderColor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement borderRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderRadius = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement borderRadiusBottomLeft(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.borderRadiusBottomLeft = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement borderRadiusBottomRight(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.borderRadiusBottomRight = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement borderRadiusTopLeft(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.borderRadiusTopLeft = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement borderRadiusTopRight(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.borderRadiusTopRight = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement borderWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement color(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.color = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement colorByPoint(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.colorByPoint = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement connectNulls(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.connectNulls = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement dashStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getValue()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.dashStyle = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement data(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.data = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement dataLabels(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels r1) {
            r0 = this;
            r0.dataLabels = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement enableMouseTracking(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enableMouseTracking = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement fillColor(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.fillColor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement fillOpacity(@org.jetbrains.annotations.Nullable java.lang.Float r1) {
            r0 = this;
            r0.fillOpacity = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement id(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement innerSize(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.innerSize = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement lineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.lineWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement marker(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker r1) {
            r0 = this;
            r0.marker = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement name(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement negativeColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.negativeColor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement negativeFillColor(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.negativeFillColor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement reversed(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.reversed = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement shadow(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAShadow r1) {
            r0 = this;
            r0.shadow = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement showInLegend(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.showInLegend = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement size(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.size = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement stack(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.stack = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement states(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.states = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement step(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.step = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement threshold(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.threshold = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement tooltip(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip r1) {
            r0 = this;
            r0.tooltip = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement type(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getValue()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.type = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement yAxis(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.yAxis = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement zIndex(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement zoneAxis(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.zoneAxis = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement zones(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAZonesElement[] r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.zones = r2
            return r1
    }
}

package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAScatter {

    @org.jetbrains.annotations.Nullable
    private java.lang.String dashStyle;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object enableMouseTracking;

    @org.jetbrains.annotations.Nullable
    private java.lang.String lineColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number lineWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.String linkedTo;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker marker;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStates states;

    public AAScatter() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScatter dashStyle(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType r1) {
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
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScatter enableMouseTracking(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.enableMouseTracking = r1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDashStyle() {
            r1 = this;
            java.lang.String r0 = r1.dashStyle
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getEnableMouseTracking() {
            r1 = this;
            java.lang.Object r0 = r1.enableMouseTracking
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLineColor() {
            r1 = this;
            java.lang.String r0 = r1.lineColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getLineWidth() {
            r1 = this;
            java.lang.Number r0 = r1.lineWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLinkedTo() {
            r1 = this;
            java.lang.String r0 = r1.linkedTo
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker getMarker() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker r0 = r1.marker
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStates getStates() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStates r0 = r1.states
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScatter lineColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.lineColor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScatter lineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.lineWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScatter linkedTo(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.linkedTo = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScatter marker(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker r1) {
            r0 = this;
            r0.marker = r1
            return r0
    }

    public final void setDashStyle(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.dashStyle = r1
            return
    }

    public final void setEnableMouseTracking(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.enableMouseTracking = r1
            return
    }

    public final void setLineColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.lineColor = r1
            return
    }

    public final void setLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.lineWidth = r1
            return
    }

    public final void setLinkedTo(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.linkedTo = r1
            return
    }

    public final void setMarker(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker r1) {
            r0 = this;
            r0.marker = r1
            return
    }

    public final void setStates(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStates r1) {
            r0 = this;
            r0.states = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScatter states(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStates r1) {
            r0 = this;
            r0.states = r1
            return r0
    }
}

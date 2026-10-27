package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAMarker {

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean enabled;

    @org.jetbrains.annotations.Nullable
    private java.lang.String fillColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object lineColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number lineWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number radius;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarkerStates states;

    @org.jetbrains.annotations.Nullable
    private java.lang.String symbol;

    public AAMarker() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker enabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.enabled = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker fillColor(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.fillColor = r2
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.enabled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFillColor() {
            r1 = this;
            java.lang.String r0 = r1.fillColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLineColor() {
            r1 = this;
            java.lang.Object r0 = r1.lineColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getLineWidth() {
            r1 = this;
            java.lang.Number r0 = r1.lineWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getRadius() {
            r1 = this;
            java.lang.Number r0 = r1.radius
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarkerStates getStates() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarkerStates r0 = r1.states
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker lineColor(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.lineColor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker lineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.lineWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker radius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.radius = r1
            return r0
    }

    public final void setEnabled(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.enabled = r1
            return
    }

    public final void setFillColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.fillColor = r1
            return
    }

    public final void setLineColor(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.lineColor = r1
            return
    }

    public final void setLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.lineWidth = r1
            return
    }

    public final void setRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.radius = r1
            return
    }

    public final void setStates(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarkerStates r1) {
            r0 = this;
            r0.states = r1
            return
    }

    public final void setSymbol(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.symbol = r1
            return
    }

    @org.jetbrains.annotations.Nullable
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker states(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarkerStates r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.states = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker symbol(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.symbol = r1
            return r0
    }
}

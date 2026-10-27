package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAColumnrange {

    @org.jetbrains.annotations.Nullable
    private java.lang.Number borderRadius;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number borderWidth;

    @org.jetbrains.annotations.Nullable
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels dataLabels;

    public AAColumnrange() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumnrange borderRadius(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderRadius = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumnrange borderWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.borderWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumnrange dataLabels(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.dataLabels = r2
            return r1
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
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels getDataLabels() {
            r1 = this;
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels r0 = r1.dataLabels
            return r0
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

    public final void setDataLabels(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels r1) {
            r0 = this;
            r0.dataLabels = r1
            return
    }
}

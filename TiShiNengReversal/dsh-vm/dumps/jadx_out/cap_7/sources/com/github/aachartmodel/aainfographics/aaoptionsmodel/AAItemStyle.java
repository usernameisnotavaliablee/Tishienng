package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAItemStyle {

    @org.jetbrains.annotations.Nullable
    private java.lang.String color;

    @org.jetbrains.annotations.Nullable
    private java.lang.String cursor;

    @org.jetbrains.annotations.Nullable
    private java.lang.String fontSize;

    @org.jetbrains.annotations.Nullable
    private java.lang.String fontWeight;

    @org.jetbrains.annotations.Nullable
    private java.lang.String pointer;

    public AAItemStyle() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle color(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.color = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle cursor(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.cursor = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle fontSize(@org.jetbrains.annotations.Nullable java.lang.Number r2) {
            r1 = this;
            if (r2 == 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "px"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.fontSize = r2
        L15:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle fontWeight(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getValue()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.fontWeight = r1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getColor() {
            r1 = this;
            java.lang.String r0 = r1.color
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCursor() {
            r1 = this;
            java.lang.String r0 = r1.cursor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFontSize() {
            r1 = this;
            java.lang.String r0 = r1.fontSize
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFontWeight() {
            r1 = this;
            java.lang.String r0 = r1.fontWeight
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPointer() {
            r1 = this;
            java.lang.String r0 = r1.pointer
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle pointer(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.pointer = r2
            return r1
    }

    public final void setColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.color = r1
            return
    }

    public final void setCursor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.cursor = r1
            return
    }

    public final void setFontSize(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.fontSize = r1
            return
    }

    public final void setFontWeight(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.fontWeight = r1
            return
    }

    public final void setPointer(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.pointer = r1
            return
    }
}

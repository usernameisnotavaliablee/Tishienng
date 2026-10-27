package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAPosition {

    @org.jetbrains.annotations.Nullable
    private java.lang.String align;

    @org.jetbrains.annotations.Nullable
    private java.lang.String verticalAlign;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number x;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number y;

    public AAPosition() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPosition align(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.x = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPosition align(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.align = r1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAlign() {
            r1 = this;
            java.lang.String r0 = r1.align
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

    public final void setAlign(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.align = r1
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
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPosition verticalAlign(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.verticalAlign = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPosition y(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.y = r1
            return r0
    }
}

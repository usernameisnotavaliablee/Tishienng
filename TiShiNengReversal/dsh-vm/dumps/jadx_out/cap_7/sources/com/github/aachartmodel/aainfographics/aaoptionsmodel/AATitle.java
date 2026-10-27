package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AATitle {
    private java.lang.String align;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style;
    private java.lang.String text;
    private java.lang.Boolean userHTML;
    private java.lang.String verticalAlign;
    private java.lang.Number x;
    private java.lang.Number y;

    public AATitle() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle align(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.align = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle style(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle text(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.text = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle userHTML(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.userHTML = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle verticalAlign(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.verticalAlign = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle x(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.x = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle y(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.y = r1
            return r0
    }
}

package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AASubtitle {
    private java.lang.String align;
    private com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style;
    private java.lang.String text;
    private java.lang.Boolean userHTML;
    private java.lang.String verticalAlign;
    private java.lang.Number x;
    private java.lang.Number y;

    public AASubtitle() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle align(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getValue()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.align = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle style(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle text(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.text = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle userHTML(@org.jetbrains.annotations.Nullable java.lang.Boolean r1) {
            r0 = this;
            r0.userHTML = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle verticalAlign(@org.jetbrains.annotations.NotNull com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.verticalAlign = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle x(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.x = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle y(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.y = r1
            return r0
    }
}

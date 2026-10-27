package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AASeriesEvents {

    @org.jetbrains.annotations.Nullable
    private java.lang.String legendItemClick;

    public AASeriesEvents() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLegendItemClick() {
            r1 = this;
            java.lang.String r0 = r1.legendItemClick
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASeriesEvents legendItemClick(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "prop"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer r0 = com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer.INSTANCE
            java.lang.String r2 = r0.pureAnonymousJSFunctionString(r2)
            r1.legendItemClick = r2
            return r1
    }

    public final void setLegendItemClick(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.legendItemClick = r1
            return
    }
}

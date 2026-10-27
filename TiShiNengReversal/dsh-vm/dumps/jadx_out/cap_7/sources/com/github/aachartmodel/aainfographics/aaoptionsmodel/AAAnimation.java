package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAAnimation {

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer duration;

    @org.jetbrains.annotations.Nullable
    private java.lang.String easing;

    public AAAnimation() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAnimation duration(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAnimation easing(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getValue()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.easing = r1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDuration() {
            r1 = this;
            java.lang.Integer r0 = r1.duration
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEasing() {
            r1 = this;
            java.lang.String r0 = r1.easing
            return r0
    }

    public final void setDuration(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.duration = r1
            return
    }

    public final void setEasing(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.easing = r1
            return
    }
}

package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAHalo {

    @org.jetbrains.annotations.Nullable
    private java.util.Map<java.lang.String, ?> attributes;

    @org.jetbrains.annotations.Nullable
    private java.lang.Float opacity;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number size;

    public AAHalo() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAHalo attributes(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aaoptionsmodel.AASVGAttributes r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.util.Map r1 = r1.toDic()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.attributes = r1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Map<java.lang.String, ?> getAttributes() {
            r1 = this;
            java.util.Map<java.lang.String, ?> r0 = r1.attributes
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getOpacity() {
            r1 = this;
            java.lang.Float r0 = r1.opacity
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getSize() {
            r1 = this;
            java.lang.Number r0 = r1.size
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAHalo opacity(@org.jetbrains.annotations.Nullable java.lang.Float r1) {
            r0 = this;
            r0.opacity = r1
            return r0
    }

    public final void setAttributes(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ?> r1) {
            r0 = this;
            r0.attributes = r1
            return
    }

    public final void setOpacity(@org.jetbrains.annotations.Nullable java.lang.Float r1) {
            r0 = this;
            r0.opacity = r1
            return
    }

    public final void setSize(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.size = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAHalo size(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.size = r1
            return r0
    }
}

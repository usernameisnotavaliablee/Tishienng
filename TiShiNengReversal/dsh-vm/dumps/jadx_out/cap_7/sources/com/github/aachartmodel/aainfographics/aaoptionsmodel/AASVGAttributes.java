package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AASVGAttributes {

    @org.jetbrains.annotations.Nullable
    private java.lang.String fill;

    @org.jetbrains.annotations.Nullable
    private java.lang.String stroke;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number strokeWidth;

    public AASVGAttributes() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASVGAttributes fill(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.fill = r1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFill() {
            r1 = this;
            java.lang.String r0 = r1.fill
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStroke() {
            r1 = this;
            java.lang.String r0 = r1.stroke
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getStrokeWidth() {
            r1 = this;
            java.lang.Number r0 = r1.strokeWidth
            return r0
    }

    public final void setFill(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.fill = r1
            return
    }

    public final void setStroke(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.stroke = r1
            return
    }

    public final void setStrokeWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.strokeWidth = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASVGAttributes stroke(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.stroke = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AASVGAttributes strokeWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.strokeWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> toDic() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Number r1 = r3.strokeWidth
            if (r1 == 0) goto Le
            java.lang.String r2 = "stroke-width"
            r0.put(r2, r1)
        Le:
            java.lang.String r1 = r3.fill
            if (r1 == 0) goto L17
            java.lang.String r2 = "fill"
            r0.put(r2, r1)
        L17:
            java.lang.String r1 = r3.stroke
            if (r1 == 0) goto L20
            java.lang.String r2 = "stroke"
            r0.put(r2, r1)
        L20:
            return r0
    }
}

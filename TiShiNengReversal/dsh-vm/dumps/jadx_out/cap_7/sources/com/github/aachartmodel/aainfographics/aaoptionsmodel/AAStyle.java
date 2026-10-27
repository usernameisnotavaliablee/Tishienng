package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAStyle {
    public static final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private java.lang.String background;

    @org.jetbrains.annotations.Nullable
    private java.lang.String backgroundColor;

    @org.jetbrains.annotations.Nullable
    private java.lang.String border;

    @org.jetbrains.annotations.Nullable
    private java.lang.String borderRadius;

    @org.jetbrains.annotations.Nullable
    private java.lang.String color;

    @org.jetbrains.annotations.Nullable
    private java.lang.String cursor;

    @org.jetbrains.annotations.Nullable
    private java.lang.String fontFamily;

    @org.jetbrains.annotations.Nullable
    private java.lang.String fontSize;

    @org.jetbrains.annotations.Nullable
    private java.lang.String fontWeight;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number height;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number lineWidth;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number opacity;

    @org.jetbrains.annotations.Nullable
    private java.lang.String padding;

    @org.jetbrains.annotations.Nullable
    private java.lang.String pointerEvents;

    @org.jetbrains.annotations.Nullable
    private java.lang.String position;

    @org.jetbrains.annotations.Nullable
    private java.lang.String textAlign;

    @org.jetbrains.annotations.Nullable
    private java.lang.String textDecoration;

    @org.jetbrains.annotations.Nullable
    private java.lang.String textOutline;

    @org.jetbrains.annotations.Nullable
    private java.lang.String textOverflow;

    @org.jetbrains.annotations.Nullable
    private java.lang.String top;

    @org.jetbrains.annotations.Nullable
    private java.lang.String transition;

    @org.jetbrains.annotations.Nullable
    private java.lang.String whiteSpace;

    @org.jetbrains.annotations.Nullable
    private java.lang.Number width;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style(@org.jetbrains.annotations.Nullable java.lang.String r2) {
                r1 = this;
                r0 = 0
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2 = r1.style(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Number r3) {
                r1 = this;
                r0 = 0
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2 = r1.style(r2, r3, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Number r3, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType r4) {
                r1 = this;
                r0 = 0
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2 = r1.style(r2, r3, r4, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle style(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Number r3, @org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
                r1 = this;
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r0 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
                r0.<init>()
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2 = r0.color(r2)
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2 = r2.fontSize(r3)
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2 = r2.fontWeight(r4)
                com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r2 = r2.textOutline(r5)
                return r2
        }
    }

    static {
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle$Companion r0 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle$Companion
            r1 = 0
            r0.<init>(r1)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle.Companion = r0
            return
    }

    public AAStyle() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle background(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.background = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle backgroundColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.backgroundColor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle border(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.border = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle borderRadius(@org.jetbrains.annotations.Nullable java.lang.Number r2) {
            r1 = this;
            if (r2 == 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "px"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.borderRadius = r2
        L15:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle color(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.color = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle cursor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.cursor = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle fontFamily(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.fontFamily = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle fontSize(@org.jetbrains.annotations.Nullable java.lang.Number r2) {
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
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle fontWeight(@org.jetbrains.annotations.Nullable com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType r1) {
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
    public final java.lang.String getBackground() {
            r1 = this;
            java.lang.String r0 = r1.background
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackgroundColor() {
            r1 = this;
            java.lang.String r0 = r1.backgroundColor
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBorder() {
            r1 = this;
            java.lang.String r0 = r1.border
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBorderRadius() {
            r1 = this;
            java.lang.String r0 = r1.borderRadius
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
    public final java.lang.String getFontFamily() {
            r1 = this;
            java.lang.String r0 = r1.fontFamily
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
    public final java.lang.Number getHeight() {
            r1 = this;
            java.lang.Number r0 = r1.height
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getLineWidth() {
            r1 = this;
            java.lang.Number r0 = r1.lineWidth
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getOpacity() {
            r1 = this;
            java.lang.Number r0 = r1.opacity
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPadding() {
            r1 = this;
            java.lang.String r0 = r1.padding
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPointerEvents() {
            r1 = this;
            java.lang.String r0 = r1.pointerEvents
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosition() {
            r1 = this;
            java.lang.String r0 = r1.position
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTextAlign() {
            r1 = this;
            java.lang.String r0 = r1.textAlign
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTextDecoration() {
            r1 = this;
            java.lang.String r0 = r1.textDecoration
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTextOutline() {
            r1 = this;
            java.lang.String r0 = r1.textOutline
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTextOverflow() {
            r1 = this;
            java.lang.String r0 = r1.textOverflow
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTop() {
            r1 = this;
            java.lang.String r0 = r1.top
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTransition() {
            r1 = this;
            java.lang.String r0 = r1.transition
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWhiteSpace() {
            r1 = this;
            java.lang.String r0 = r1.whiteSpace
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Number getWidth() {
            r1 = this;
            java.lang.Number r0 = r1.width
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle height(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.height = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle lineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.lineWidth = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle opacity(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.opacity = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle padding(@org.jetbrains.annotations.Nullable java.lang.Number r2) {
            r1 = this;
            if (r2 == 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "px"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.padding = r2
        L15:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle pointerEvents(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.pointerEvents = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle position(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.position = r1
            return r0
    }

    public final void setBackground(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.background = r1
            return
    }

    public final void setBackgroundColor(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.backgroundColor = r1
            return
    }

    public final void setBorder(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.border = r1
            return
    }

    public final void setBorderRadius(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.borderRadius = r1
            return
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

    public final void setFontFamily(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.fontFamily = r1
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

    public final void setHeight(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.height = r1
            return
    }

    public final void setLineWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.lineWidth = r1
            return
    }

    public final void setOpacity(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.opacity = r1
            return
    }

    public final void setPadding(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.padding = r1
            return
    }

    public final void setPointerEvents(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.pointerEvents = r1
            return
    }

    public final void setPosition(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.position = r1
            return
    }

    public final void setTextAlign(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textAlign = r1
            return
    }

    public final void setTextDecoration(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textDecoration = r1
            return
    }

    public final void setTextOutline(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textOutline = r1
            return
    }

    public final void setTextOverflow(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textOverflow = r1
            return
    }

    public final void setTop(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.top = r1
            return
    }

    public final void setTransition(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.transition = r1
            return
    }

    public final void setWhiteSpace(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.whiteSpace = r1
            return
    }

    public final void setWidth(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.width = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle textAlign(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textAlign = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle textDecoration(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textDecoration = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle textOutline(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textOutline = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle textOverflow(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.textOverflow = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle top(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.top = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle transition(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.transition = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle whiteSpace(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.whiteSpace = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle width(@org.jetbrains.annotations.Nullable java.lang.Number r1) {
            r0 = this;
            r0.width = r1
            return r0
    }
}

package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum AAChartVerticalAlignType extends java.lang.Enum<com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType> {
    private static final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType[] $VALUES = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType Bottom = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType Middle = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType Top = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    static {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType
            java.lang.String r1 = "top"
            java.lang.String r2 = "Top"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType.Top = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType r1 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType
            java.lang.String r2 = "middle"
            java.lang.String r4 = "Middle"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType.Middle = r1
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType r2 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType
            java.lang.String r4 = "bottom"
            java.lang.String r6 = "Bottom"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType.Bottom = r2
            r4 = 3
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType[] r4 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType[r4]
            r4[r3] = r0
            r4[r5] = r1
            r4[r7] = r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType.$VALUES = r4
            return
    }

    AAChartVerticalAlignType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType> r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType r1 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType) r1
            return r1
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType[] values() {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType[] r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType[] r0 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}

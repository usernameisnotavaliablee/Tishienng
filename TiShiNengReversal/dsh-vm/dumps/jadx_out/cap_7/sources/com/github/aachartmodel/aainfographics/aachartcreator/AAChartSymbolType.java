package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum AAChartSymbolType extends java.lang.Enum<com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType> {
    private static final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType[] $VALUES = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType Circle = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType Diamond = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType Square = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType Triangle = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType TriangleDown = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    static {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
            java.lang.String r1 = "circle"
            java.lang.String r2 = "Circle"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.Circle = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r1 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
            java.lang.String r2 = "square"
            java.lang.String r4 = "Square"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.Square = r1
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r2 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
            java.lang.String r4 = "diamond"
            java.lang.String r6 = "Diamond"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.Diamond = r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r4 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
            java.lang.String r6 = "triangle"
            java.lang.String r8 = "Triangle"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.Triangle = r4
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r6 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
            java.lang.String r8 = "triangle-down"
            java.lang.String r10 = "TriangleDown"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.TriangleDown = r6
            r8 = 5
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType[] r8 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType[r8]
            r8[r3] = r0
            r8[r5] = r1
            r8[r7] = r2
            r8[r9] = r4
            r8[r11] = r6
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.$VALUES = r8
            return
    }

    AAChartSymbolType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType> r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r1 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType) r1
            return r1
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType[] values() {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType[] r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType[] r0 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}

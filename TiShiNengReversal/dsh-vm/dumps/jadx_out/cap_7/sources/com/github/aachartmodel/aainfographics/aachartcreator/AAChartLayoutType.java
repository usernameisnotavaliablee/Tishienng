package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum AAChartLayoutType extends java.lang.Enum<com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType> {
    private static final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType[] $VALUES = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType Horizontal = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType Vertical = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    static {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType
            java.lang.String r1 = "horizontal"
            java.lang.String r2 = "Horizontal"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType.Horizontal = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType r1 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType
            java.lang.String r2 = "vertical"
            java.lang.String r4 = "Vertical"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType.Vertical = r1
            r2 = 2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType[] r2 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType[r2]
            r2[r3] = r0
            r2[r5] = r1
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType.$VALUES = r2
            return
    }

    AAChartLayoutType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType> r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType r1 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType) r1
            return r1
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType[] values() {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType[] r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType[] r0 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}

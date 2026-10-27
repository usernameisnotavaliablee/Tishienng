package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum AAChartStackingType extends java.lang.Enum<com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType> {
    private static final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType[] $VALUES = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType False = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType Normal = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType Percent = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    static {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType
            java.lang.String r1 = ""
            java.lang.String r2 = "False"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.False = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r1 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType
            java.lang.String r2 = "normal"
            java.lang.String r4 = "Normal"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.Normal = r1
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r2 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType
            java.lang.String r4 = "percent"
            java.lang.String r6 = "Percent"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.Percent = r2
            r4 = 3
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType[] r4 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType[r4]
            r4[r3] = r0
            r4[r5] = r1
            r4[r7] = r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.$VALUES = r4
            return
    }

    AAChartStackingType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType> r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r1 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType) r1
            return r1
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType[] values() {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType[] r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType[] r0 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}

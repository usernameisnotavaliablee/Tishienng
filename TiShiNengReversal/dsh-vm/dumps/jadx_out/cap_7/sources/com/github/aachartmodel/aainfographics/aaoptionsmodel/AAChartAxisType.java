package com.github.aachartmodel.aainfographics.aaoptionsmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum AAChartAxisType extends java.lang.Enum<com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType> {
    private static final /* synthetic */ com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType[] $VALUES = null;
    public static final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType Category = null;
    public static final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType Datetime = null;
    public static final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType Linear = null;
    public static final com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType Logarithmic = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    static {
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType r0 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType
            java.lang.String r1 = "linear"
            java.lang.String r2 = "Linear"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType.Linear = r0
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType r1 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType
            java.lang.String r2 = "logarithmic"
            java.lang.String r4 = "Logarithmic"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType.Logarithmic = r1
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType r2 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType
            java.lang.String r4 = "datetime"
            java.lang.String r6 = "Datetime"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType.Datetime = r2
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType r4 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType
            java.lang.String r6 = "category"
            java.lang.String r8 = "Category"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType.Category = r4
            r6 = 4
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType[] r6 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType[r6]
            r6[r3] = r0
            r6[r5] = r1
            r6[r7] = r2
            r6[r9] = r4
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType.$VALUES = r6
            return
    }

    AAChartAxisType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType> r0 = com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType r1 = (com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType) r1
            return r1
    }

    public static com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType[] values() {
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType[] r0 = com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType[] r0 = (com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartAxisType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}

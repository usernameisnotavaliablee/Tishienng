package com.github.aachartmodel.aainfographics.aachartcreator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum AAChartZoomType extends java.lang.Enum<com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType> {
    private static final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType[] $VALUES = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType None = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType X = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType XY = null;
    public static final com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType Y = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    static {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r0 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType
            java.lang.String r1 = "none"
            java.lang.String r2 = "None"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.None = r0
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r1 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType
            java.lang.String r2 = "x"
            java.lang.String r4 = "X"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.X = r1
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r2 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType
            java.lang.String r4 = "y"
            java.lang.String r6 = "Y"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.Y = r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r4 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType
            java.lang.String r6 = "xy"
            java.lang.String r8 = "XY"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.XY = r4
            r6 = 4
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType[] r6 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType[r6]
            r6[r3] = r0
            r6[r5] = r1
            r6[r7] = r2
            r6[r9] = r4
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.$VALUES = r6
            return
    }

    AAChartZoomType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType> r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r1 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType) r1
            return r1
    }

    public static com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType[] values() {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType[] r0 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType[] r0 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}

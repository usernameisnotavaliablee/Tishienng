package xyz.adscope.amps.ad.unified.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum AMPSUnifiedPattern extends java.lang.Enum<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern> {
    private static final /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern[] $VALUES = null;
    public static final xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern AD_PATTERN_3_IMAGES = null;
    public static final xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern AD_PATTERN_TEXT_IMAGE = null;
    public static final xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern AD_PATTERN_UNKNOWN = null;
    public static final xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern AD_PATTERN_VIDEO = null;

    static {
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = new xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern
            java.lang.String r1 = "AD_PATTERN_TEXT_IMAGE"
            r2 = 0
            r0.<init>(r1, r2)
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_TEXT_IMAGE = r0
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r1 = new xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern
            java.lang.String r3 = "AD_PATTERN_3_IMAGES"
            r4 = 1
            r1.<init>(r3, r4)
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_3_IMAGES = r1
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r3 = new xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern
            java.lang.String r5 = "AD_PATTERN_VIDEO"
            r6 = 2
            r3.<init>(r5, r6)
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_VIDEO = r3
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r5 = new xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern
            java.lang.String r7 = "AD_PATTERN_UNKNOWN"
            r8 = 3
            r5.<init>(r7, r8)
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN = r5
            r7 = 4
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern[] r7 = new xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.$VALUES = r7
            return
    }

    AMPSUnifiedPattern(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern> r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r1 = (xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern) r1
            return r1
    }

    public static xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern[] values() {
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern[] r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.$VALUES
            java.lang.Object r0 = r0.clone()
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern[] r0 = (xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern[]) r0
            return r0
    }
}

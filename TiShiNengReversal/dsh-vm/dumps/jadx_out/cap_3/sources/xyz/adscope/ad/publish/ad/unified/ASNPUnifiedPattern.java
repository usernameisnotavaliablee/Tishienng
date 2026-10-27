package xyz.adscope.ad.publish.ad.unified;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum ASNPUnifiedPattern extends java.lang.Enum<xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern> {
    public static final xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern PATTERN_3_IMAGES = null;
    public static final xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern PATTERN_TEXT_IMAGE = null;
    public static final xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern PATTERN_UNKNOWN = null;
    public static final xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern PATTERN_VIDEO = null;
    private static final /* synthetic */ xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[] a = null;

    static {
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = new xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern
            java.lang.String r1 = "PATTERN_TEXT_IMAGE"
            r2 = 0
            r0.<init>(r1, r2)
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_TEXT_IMAGE = r0
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = new xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern
            java.lang.String r1 = "PATTERN_3_IMAGES"
            r2 = 1
            r0.<init>(r1, r2)
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_3_IMAGES = r0
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = new xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern
            java.lang.String r1 = "PATTERN_VIDEO"
            r2 = 2
            r0.<init>(r1, r2)
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_VIDEO = r0
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = new xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern
            java.lang.String r1 = "PATTERN_UNKNOWN"
            r2 = 3
            r0.<init>(r1, r2)
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_UNKNOWN = r0
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[] r0 = a()
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.a = r0
            return
    }

    ASNPUnifiedPattern(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static /* synthetic */ xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[] a() {
            r0 = 4
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[] r0 = new xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[r0]
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_TEXT_IMAGE
            r2 = 0
            r0[r2] = r1
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_3_IMAGES
            r2 = 1
            r0[r2] = r1
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_VIDEO
            r2 = 2
            r0[r2] = r1
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_UNKNOWN
            r2 = 3
            r0[r2] = r1
            return r0
    }

    public static xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern> r0 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = (xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern) r1
            return r1
    }

    public static xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[] values() {
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[] r0 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.a
            java.lang.Object r0 = r0.clone()
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[] r0 = (xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern[]) r0
            return r0
    }
}

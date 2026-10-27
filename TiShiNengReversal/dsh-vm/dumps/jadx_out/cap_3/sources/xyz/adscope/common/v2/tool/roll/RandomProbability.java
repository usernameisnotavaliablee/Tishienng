package xyz.adscope.common.v2.tool.roll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RandomProbability {
    public RandomProbability() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean roll(int r4) {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            r1 = 1
            int r0 = r0 + r1
            if (r4 < r0) goto Le
            return r1
        Le:
            r4 = 0
            return r4
    }

    public static boolean rollByCRCString(int r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto Lf
            int r3 = xyz.adscope.common.v2.tool.str.SerialUtil.generateCRCHex(r3)
            if (r2 < r3) goto Lf
            r2 = 1
            return r2
        Lf:
            return r1
    }
}

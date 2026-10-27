package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSRandomUtil {
    public AMPSRandomUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getNegativeToPositiveRandomNum(int r2) {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r2 * 2
            int r1 = r1 + 1
            int r0 = r0.nextInt(r1)
            int r0 = r0 - r2
            return r0
    }

    public static int getRandomNum(int r1) {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt(r1)
            int r1 = r1 + 1
            return r1
    }

    public static int getRandomNum(int r1, int r2) {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r2 = r2 - r1
            int r2 = r2 + 1
            int r2 = r0.nextInt(r2)
            int r2 = r2 + r1
            return r2
    }

    public static boolean isHitRandomNum(int r4) {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            r1 = 1
            int r0 = r0 + r1
            if (r4 >= r0) goto L13
            r0 = 100
            if (r4 == r0) goto L13
            r4 = 0
            return r4
        L13:
            return r1
    }

    public static boolean isHitRandomNum(int r0, int r1, int r2) {
            if (r2 < r0) goto L6
            if (r2 > r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}

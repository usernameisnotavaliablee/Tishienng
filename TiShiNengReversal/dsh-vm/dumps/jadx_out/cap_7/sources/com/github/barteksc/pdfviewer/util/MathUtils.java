package com.github.barteksc.pdfviewer.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class MathUtils {
    private static final double BIG_ENOUGH_CEIL = 16384.999999999996d;
    private static final double BIG_ENOUGH_FLOOR = 16384.0d;
    private static final int BIG_ENOUGH_INT = 16384;

    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int ceil(float r4) {
            double r0 = (double) r4
            r2 = 4670233088461111295(0x40d0003fffffffff, double:16384.999999999996)
            double r0 = r0 + r2
            int r4 = (int) r0
            int r4 = r4 + (-16384)
            return r4
    }

    public static int floor(float r4) {
            double r0 = (double) r4
            r2 = 4670232813583204352(0x40d0000000000000, double:16384.0)
            double r0 = r0 + r2
            int r4 = (int) r0
            int r4 = r4 + (-16384)
            return r4
    }

    public static float limit(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L5
            return r2
        L5:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 < 0) goto La
            return r3
        La:
            return r1
    }

    public static int limit(int r0, int r1, int r2) {
            if (r0 > r1) goto L3
            return r1
        L3:
            if (r0 < r2) goto L6
            return r2
        L6:
            return r0
    }

    public static float max(float r1, float r2) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r2
        L5:
            return r1
    }

    public static int max(int r0, int r1) {
            if (r0 <= r1) goto L3
            return r1
        L3:
            return r0
    }

    public static float min(float r1, float r2) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            return r1
    }

    public static int min(int r0, int r1) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            return r0
    }
}

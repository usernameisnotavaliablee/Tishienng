package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class af {
    public af() {
            r1 = this;
            r1.<init>()
            return
    }

    private static double a(double r0, double r2, double r4, double r6, double r8, double r10) {
            double r4 = r4 - r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r4, r0)
            double r8 = java.lang.Math.pow(r8, r0)
            double r4 = r4 / r8
            double r6 = r6 - r2
            double r2 = java.lang.Math.pow(r6, r0)
            double r0 = java.lang.Math.pow(r10, r0)
            double r2 = r2 / r0
            double r4 = r4 + r2
            return r4
    }

    public static boolean a(int r4) {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r0 = (int) r0
            if (r0 > r4) goto L10
            r4 = 1
            return r4
        L10:
            r4 = 0
            return r4
    }

    public static int[] a(int r21, int r22) {
            r0 = r21
            r1 = r22
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 0
            r4 = 0
        L9:
            if (r4 != 0) goto L4e
            int r5 = r0 * 2
            double r5 = (double) r5
            r7 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r5 = r5 * r7
            int r5 = (int) r5
            int r5 = b(r3, r5)
            double r5 = (double) r5
            double r13 = java.lang.Math.rint(r5)
            int r5 = r1 * 2
            double r5 = (double) r5
            double r5 = r5 * r7
            int r5 = (int) r5
            int r5 = b(r3, r5)
            double r5 = (double) r5
            double r15 = java.lang.Math.rint(r5)
            double r9 = (double) r0
            double r11 = (double) r1
            r5 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r17 = r9 * r5
            double r19 = r11 * r5
            double r5 = a(r9, r11, r13, r15, r17, r19)
            r7 = r15
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L45
            goto L9
        L45:
            int r4 = (int) r13
            r2[r3] = r4
            int r4 = (int) r7
            r5 = 1
            r2[r5] = r4
            r4 = 1
            goto L9
        L4e:
            return r2
    }

    public static int b(int r4) {
            double r0 = java.lang.Math.random()
            double r2 = (double) r4
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r4 = (int) r0
            return r4
    }

    private static int b(int r4, int r5) {
            double r0 = java.lang.Math.random()
            int r5 = r5 - r4
            double r2 = (double) r5
            double r0 = r0 * r2
            double r4 = (double) r4
            double r0 = r0 + r4
            int r4 = (int) r0
            return r4
    }
}

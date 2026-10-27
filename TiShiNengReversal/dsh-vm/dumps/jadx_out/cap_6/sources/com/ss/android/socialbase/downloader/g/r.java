package com.ss.android.socialbase.downloader.g;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class r {
    private double cw;
    private final double j;
    private int r;
    private final int xt;

    public r(double r4) {
            r3 = this;
            r3.<init>()
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r3.cw = r0
            r3.j = r4
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L1b
        L13:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 / r4
            double r4 = java.lang.Math.ceil(r0)
            int r4 = (int) r4
        L1b:
            r3.xt = r4
            return
    }

    public double j() {
            r2 = this;
            double r0 = r2.cw
            return r0
    }

    public void j(double r8) {
            r7 = this;
            double r0 = r7.j
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r2 - r0
            int r4 = r7.r
            int r5 = r7.xt
            if (r4 <= r5) goto L24
            double r2 = r7.cw
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 * r2
            double r2 = r7.j
            double r8 = java.lang.Math.log(r8)
            double r2 = r2 * r8
            double r0 = r0 + r2
            double r8 = java.lang.Math.exp(r0)
            r7.cw = r8
            goto L45
        L24:
            if (r4 <= 0) goto L43
            double r5 = (double) r4
            double r0 = r0 * r5
            double r4 = (double) r4
            double r4 = r4 + r2
            double r0 = r0 / r4
            double r2 = r2 - r0
            double r4 = r7.cw
            double r4 = java.lang.Math.log(r4)
            double r0 = r0 * r4
            double r8 = java.lang.Math.log(r8)
            double r2 = r2 * r8
            double r0 = r0 + r2
            double r8 = java.lang.Math.exp(r0)
            r7.cw = r8
            goto L45
        L43:
            r7.cw = r8
        L45:
            int r8 = r7.r
            int r8 = r8 + 1
            r7.r = r8
            return
    }
}

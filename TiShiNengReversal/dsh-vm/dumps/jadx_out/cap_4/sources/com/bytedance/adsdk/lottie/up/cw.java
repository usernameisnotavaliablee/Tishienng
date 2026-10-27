package com.bytedance.adsdk.lottie.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    private static float j(float r4) {
            r0 = 994913820(0x3b4d2e1c, float:0.0031308)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto Ld
            r0 = 1095678034(0x414eb852, float:12.92)
            float r4 = r4 * r0
            return r4
        Ld:
            double r0 = (double) r4
            r2 = 4601177619117899776(0x3fdaaaaaa0000000, double:0.4166666567325592)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4607430116543299584(0x3ff0e147a0000000, double:1.0549999475479126)
            double r0 = r0 * r2
            r2 = 4588087156337016832(0x3fac28f5c0000000, double:0.054999999701976776)
            double r0 = r0 - r2
            float r4 = (float) r0
            return r4
    }

    public static int j(float r7, int r8, int r9) {
            if (r8 != r9) goto L3
            return r8
        L3:
            int r0 = r8 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            int r2 = r8 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r3 = r8 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r1
            r8 = r8 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r1
            int r4 = r9 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r1
            int r5 = r9 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            int r6 = r9 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r1
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r1
            float r2 = xt(r2)
            float r3 = xt(r3)
            float r8 = xt(r8)
            float r5 = xt(r5)
            float r6 = xt(r6)
            float r9 = xt(r9)
            float r4 = r4 - r0
            float r4 = r4 * r7
            float r0 = r0 + r4
            float r5 = r5 - r2
            float r5 = r5 * r7
            float r2 = r2 + r5
            float r6 = r6 - r3
            float r6 = r6 * r7
            float r3 = r3 + r6
            float r9 = r9 - r8
            float r7 = r7 * r9
            float r8 = r8 + r7
            float r0 = r0 * r1
            float r7 = j(r2)
            float r7 = r7 * r1
            float r9 = j(r3)
            float r9 = r9 * r1
            float r8 = j(r8)
            float r8 = r8 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = r0 << 24
            int r7 = java.lang.Math.round(r7)
            int r7 = r7 << 16
            r7 = r7 | r0
            int r9 = java.lang.Math.round(r9)
            int r9 = r9 << 8
            r7 = r7 | r9
            int r8 = java.lang.Math.round(r8)
            r7 = r7 | r8
            return r7
    }

    private static float xt(float r4) {
            r0 = 1025879782(0x3d25aee6, float:0.04045)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto Lc
            r0 = 1095678034(0x414eb852, float:12.92)
            float r4 = r4 / r0
            return r4
        Lc:
            r0 = 1029785518(0x3d6147ae, float:0.055)
            float r4 = r4 + r0
            r0 = 1065814589(0x3f870a3d, float:1.055)
            float r4 = r4 / r0
            double r0 = (double) r4
            r2 = 4612586738567610368(0x4003333340000000, double:2.4000000953674316)
            double r0 = java.lang.Math.pow(r0, r2)
            float r4 = (float) r0
            return r4
    }
}

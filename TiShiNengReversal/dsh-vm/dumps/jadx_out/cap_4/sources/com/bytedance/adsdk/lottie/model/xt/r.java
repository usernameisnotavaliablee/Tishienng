package com.bytedance.adsdk.lottie.model.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private final float[] j;
    private final int[] xt;

    public r(float[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            return
    }

    private int j(float r6) {
            r5 = this;
            float[] r0 = r5.j
            int r0 = java.util.Arrays.binarySearch(r0, r6)
            if (r0 < 0) goto Ld
            int[] r6 = r5.xt
            r6 = r6[r0]
            return r6
        Ld:
            int r0 = r0 + 1
            int r0 = -r0
            if (r0 != 0) goto L18
            int[] r6 = r5.xt
            r0 = 0
            r6 = r6[r0]
            return r6
        L18:
            int[] r1 = r5.xt
            int r2 = r1.length
            int r2 = r2 + (-1)
            if (r0 != r2) goto L25
            int r6 = r1.length
            int r6 = r6 + (-1)
            r6 = r1[r6]
            return r6
        L25:
            float[] r2 = r5.j
            int r3 = r0 + (-1)
            r4 = r2[r3]
            r2 = r2[r0]
            r3 = r1[r3]
            r0 = r1[r0]
            float r6 = r6 - r4
            float r2 = r2 - r4
            float r6 = r6 / r2
            int r6 = com.bytedance.adsdk.lottie.up.cw.j(r6, r3, r0)
            return r6
    }

    public int cw() {
            r1 = this;
            int[] r0 = r1.xt
            int r0 = r0.length
            return r0
    }

    public com.bytedance.adsdk.lottie.model.xt.r j(float[] r4) {
            r3 = this;
            int r0 = r4.length
            int[] r0 = new int[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            int r2 = r3.j(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            com.bytedance.adsdk.lottie.model.xt.r r1 = new com.bytedance.adsdk.lottie.model.xt.r
            r1.<init>(r4, r0)
            return r1
    }

    public void j(com.bytedance.adsdk.lottie.model.xt.r r5, com.bytedance.adsdk.lottie.model.xt.r r6, float r7) {
            r4 = this;
            int[] r0 = r5.xt
            int r0 = r0.length
            int[] r1 = r6.xt
            int r1 = r1.length
            if (r0 != r1) goto L32
            r0 = 0
        L9:
            int[] r1 = r5.xt
            int r1 = r1.length
            if (r0 >= r1) goto L31
            float[] r1 = r4.j
            float[] r2 = r5.j
            r2 = r2[r0]
            float[] r3 = r6.j
            r3 = r3[r0]
            float r2 = com.bytedance.adsdk.lottie.up.tl.j(r2, r3, r7)
            r1[r0] = r2
            int[] r1 = r4.xt
            int[] r2 = r5.xt
            r2 = r2[r0]
            int[] r3 = r6.xt
            r3 = r3[r0]
            int r2 = com.bytedance.adsdk.lottie.up.cw.j(r7, r2, r3)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L9
        L31:
            return
        L32:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot interpolate between gradients. Lengths vary ("
            r0.<init>(r1)
            int[] r5 = r5.xt
            int r5 = r5.length
            r0.append(r5)
            java.lang.String r5 = " vs "
            r0.append(r5)
            int[] r5 = r6.xt
            int r5 = r5.length
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
    }

    public float[] j() {
            r1 = this;
            float[] r0 = r1.j
            return r0
    }

    public int[] xt() {
            r1 = this;
            int[] r0 = r1.xt
            return r0
    }
}

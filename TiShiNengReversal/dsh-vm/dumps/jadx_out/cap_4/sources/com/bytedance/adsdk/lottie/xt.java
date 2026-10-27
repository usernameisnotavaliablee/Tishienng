package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class xt {
    static final java.lang.Object[] cw = null;
    static final int[] j = null;
    static final long[] xt = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            com.bytedance.adsdk.lottie.xt.j = r1
            long[] r1 = new long[r0]
            com.bytedance.adsdk.lottie.xt.xt = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.bytedance.adsdk.lottie.xt.cw = r0
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    static int j(int[] r3, int r4, int r5) {
            int r4 = r4 + (-1)
            r0 = 0
        L3:
            if (r0 > r4) goto L16
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L10
            int r0 = r1 + 1
            goto L3
        L10:
            if (r2 <= r5) goto L15
            int r4 = r1 + (-1)
            goto L3
        L15:
            return r1
        L16:
            int r3 = ~r0
            return r3
    }
}

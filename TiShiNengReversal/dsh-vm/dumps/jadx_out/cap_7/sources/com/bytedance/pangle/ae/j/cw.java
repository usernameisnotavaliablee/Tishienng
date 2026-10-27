package com.bytedance.pangle.ae.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class cw {
    private int cw;
    private int[] j;
    private int xt;

    public cw() {
            r1 = this;
            r1.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r1.j = r0
            return
    }

    private void ae() {
            r5 = this;
            int[] r0 = r5.j
            int r1 = r0.length
            int r2 = r5.xt
            int r1 = r1 - r2
            r3 = 2
            if (r1 > r3) goto L15
            int r4 = r0.length
            int r4 = r4 + r1
            int r4 = r4 * 2
            int[] r1 = new int[r4]
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r5.j = r1
        L15:
            return
    }

    public final void cw() {
            r5 = this;
            int r0 = r5.xt
            if (r0 == 0) goto L1d
            int r1 = r0 + (-1)
            int[] r2 = r5.j
            r1 = r2[r1]
            if (r1 == 0) goto L1d
            int r1 = r1 + (-1)
            int r3 = r0 + (-3)
            r2[r3] = r1
            int r4 = r1 * 2
            int r4 = r4 + 1
            int r3 = r3 - r4
            r2[r3] = r1
            int r0 = r0 + (-2)
            r5.xt = r0
        L1d:
            return
    }

    public final void j() {
            r1 = this;
            r0 = 0
            r1.xt = r0
            r1.cw = r0
            return
    }

    public final void j(int r7, int r8) {
            r6 = this;
            int r0 = r6.cw
            if (r0 != 0) goto L7
            r6.up()
        L7:
            r6.ae()
            int r0 = r6.xt
            int r1 = r0 + (-1)
            int[] r2 = r6.j
            r3 = r2[r1]
            int r4 = r0 + (-2)
            int r5 = r3 * 2
            int r4 = r4 - r5
            int r3 = r3 + 1
            r2[r4] = r3
            r2[r1] = r7
            r2[r0] = r8
            int r7 = r0 + 1
            r2[r7] = r3
            int r0 = r0 + 2
            r6.xt = r0
            return
    }

    public final void m() {
            r3 = this;
            int r0 = r3.xt
            if (r0 == 0) goto L1c
            int r1 = r0 + (-1)
            int[] r2 = r3.j
            r1 = r2[r1]
            int r2 = r0 + (-2)
            int r1 = r1 * 2
            int r2 = r2 - r1
            if (r2 == 0) goto L1c
            int r1 = r1 + 2
            int r0 = r0 - r1
            r3.xt = r0
            int r0 = r3.cw
            int r0 = r0 + (-1)
            r3.cw = r0
        L1c:
            return
    }

    public final int r() {
            r1 = this;
            int r0 = r1.cw
            return r0
    }

    public final void up() {
            r4 = this;
            r4.ae()
            int r0 = r4.xt
            int[] r1 = r4.j
            r2 = 0
            r1[r0] = r2
            int r3 = r0 + 1
            r1[r3] = r2
            int r0 = r0 + 2
            r4.xt = r0
            int r0 = r4.cw
            int r0 = r0 + 1
            r4.cw = r0
            return
    }

    public final int xt() {
            r2 = this;
            int r0 = r2.xt
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0 + (-1)
            int[] r1 = r2.j
            r0 = r1[r0]
            return r0
    }
}

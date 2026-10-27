package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class m5 {
    private static final float[][] a = null;

    static {
            int[] r0 = com.huawei.hms.scankit.p.n5.b
            int r0 = r0.length
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 1
            r3 = 8
            r1[r2] = r3
            r2 = 0
            r1[r2] = r0
            java.lang.Class r0 = java.lang.Float.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            float[][] r0 = (float[][]) r0
            com.huawei.hms.scankit.p.m5.a = r0
            r0 = 0
        L19:
            int[] r1 = com.huawei.hms.scankit.p.n5.b
            int r4 = r1.length
            if (r0 >= r4) goto L42
            r1 = r1[r0]
            r4 = r1 & 1
            r5 = 0
        L23:
            if (r5 >= r3) goto L3f
            r6 = 0
        L26:
            r7 = r1 & 1
            if (r7 != r4) goto L30
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r7
            int r1 = r1 >> 1
            goto L26
        L30:
            float[][] r4 = com.huawei.hms.scankit.p.m5.a
            r4 = r4[r0]
            int r8 = 7 - r5
            r9 = 1099431936(0x41880000, float:17.0)
            float r6 = r6 / r9
            r4[r8] = r6
            int r5 = r5 + 1
            r4 = r7
            goto L23
        L3f:
            int r0 = r0 + 1
            goto L19
        L42:
            return
    }

    public m5() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int[] r7) {
            r0 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r7.length
            if (r3 >= r4) goto L1c
            r4 = 0
        L8:
            r5 = r7[r3]
            if (r4 >= r5) goto L19
            r5 = 1
            long r0 = r0 << r5
            int r6 = r3 % 2
            if (r6 != 0) goto L13
            goto L14
        L13:
            r5 = 0
        L14:
            long r5 = (long) r5
            long r0 = r0 | r5
            int r4 = r4 + 1
            goto L8
        L19:
            int r3 = r3 + 1
            goto L4
        L1c:
            int r7 = (int) r0
            return r7
    }

    private static int b(int[] r10) {
            int r0 = com.huawei.hms.scankit.p.s4.a(r10)
            r1 = 8
            float[] r2 = new float[r1]
            r3 = 1
            r4 = 0
            if (r0 <= r3) goto L19
            r3 = 0
        Ld:
            if (r3 >= r1) goto L19
            r5 = r10[r3]
            float r5 = (float) r5
            float r6 = (float) r0
            float r5 = r5 / r6
            r2[r3] = r5
            int r3 = r3 + 1
            goto Ld
        L19:
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0 = -1
            r3 = 0
        L1e:
            float[][] r5 = com.huawei.hms.scankit.p.m5.a
            int r6 = r5.length
            if (r3 >= r6) goto L46
            r5 = r5[r3]
            r6 = 0
            r7 = 0
        L27:
            if (r7 >= r1) goto L39
            r8 = r5[r7]
            r9 = r2[r7]
            float r8 = r8 - r9
            float r8 = r8 * r8
            float r6 = r6 + r8
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 < 0) goto L36
            goto L39
        L36:
            int r7 = r7 + 1
            goto L27
        L39:
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 >= 0) goto L43
            int[] r10 = com.huawei.hms.scankit.p.n5.b
            r10 = r10[r3]
            r0 = r10
            r10 = r6
        L43:
            int r3 = r3 + 1
            goto L1e
        L46:
            return r0
    }

    private static int c(int[] r2) {
            int r2 = a(r2)
            int r0 = com.huawei.hms.scankit.p.n5.a(r2)
            r1 = -1
            if (r0 != r1) goto Lc
            return r1
        Lc:
            return r2
    }

    static int d(int[] r2) {
            int[] r0 = e(r2)
            int r0 = c(r0)
            r1 = -1
            if (r0 == r1) goto Lc
            return r0
        Lc:
            int r2 = b(r2)
            return r2
    }

    private static int[] e(int[] r8) {
            int r0 = com.huawei.hms.scankit.p.s4.a(r8)
            float r0 = (float) r0
            r1 = 8
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            r5 = 17
            if (r2 >= r5) goto L30
            r5 = 1107820544(0x42080000, float:34.0)
            float r5 = r0 / r5
            float r6 = (float) r2
            float r6 = r6 * r0
            r7 = 1099431936(0x41880000, float:17.0)
            float r6 = r6 / r7
            float r5 = r5 + r6
            r6 = r8[r4]
            int r7 = r3 + r6
            float r7 = (float) r7
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L27
            int r3 = r3 + r6
            int r4 = r4 + 1
        L27:
            r5 = r1[r4]
            int r5 = r5 + 1
            r1[r4] = r5
            int r2 = r2 + 1
            goto Lc
        L30:
            return r1
    }
}

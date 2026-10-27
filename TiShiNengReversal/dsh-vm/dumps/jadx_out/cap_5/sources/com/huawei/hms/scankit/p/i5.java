package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i5 {
    private static final int[][] a = null;
    private static final int[][] b = null;

    static {
            r0 = 8
            int[] r1 = new int[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1, 1, 0} // fill-array
            int[] r2 = new int[r0]
            r2 = {x007e: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 1, 0} // fill-array
            int[] r3 = new int[r0]
            r3 = {x0092: FILL_ARRAY_DATA , data: [1, 0, 1, 1, 1, 0, 1, 0} // fill-array
            int[] r4 = new int[r0]
            r4 = {x00a6: FILL_ARRAY_DATA , data: [1, 0, 1, 1, 1, 0, 1, 0} // fill-array
            int[] r5 = new int[r0]
            r5 = {x00ba: FILL_ARRAY_DATA , data: [1, 0, 1, 1, 1, 0, 1, 0} // fill-array
            int[] r6 = new int[r0]
            r6 = {x00ce: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 1, 0} // fill-array
            int[] r7 = new int[r0]
            r7 = {x00e2: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1, 1, 0} // fill-array
            int[] r8 = new int[r0]
            r8 = {x00f6: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            int[][] r0 = new int[r0][]
            r9 = 0
            r0[r9] = r1
            r1 = 1
            r0[r1] = r2
            r2 = 2
            r0[r2] = r3
            r3 = 3
            r0[r3] = r4
            r4 = 4
            r0[r4] = r5
            r5 = 5
            r0[r5] = r6
            r6 = 6
            r0[r6] = r7
            r6 = 7
            r0[r6] = r8
            com.huawei.hms.scankit.p.i5.a = r0
            int[][] r0 = new int[r5][]
            int[] r5 = new int[]{r1, r1, r1, r1, r1}
            r0[r9] = r5
            int[] r5 = new int[]{r1, r9, r9, r9, r1}
            r0[r1] = r5
            int[] r5 = new int[]{r1, r9, r1, r9, r1}
            r0[r2] = r5
            int[] r2 = new int[]{r1, r9, r9, r9, r1}
            r0[r3] = r2
            int[] r1 = new int[]{r1, r1, r1, r1, r1}
            r0[r4] = r1
            com.huawei.hms.scankit.p.i5.b = r0
            return
    }

    public i5() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(java.lang.String r4) {
            java.lang.String r0 = ";"
            java.lang.String[] r4 = r4.split(r0)
            r0 = 0
            r1 = 0
        L8:
            int r2 = r4.length
            if (r0 >= r2) goto L18
            r2 = r4[r0]
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L8
        L18:
            return r1
    }

    public static com.huawei.hms.scankit.p.s a(com.huawei.hms.scankit.p.s r10, com.huawei.hms.scankit.p.s r11, int r12, double[][] r13) {
            r0 = 21
            r1 = 8
            r2 = 1
            r3 = 0
            if (r12 != r0) goto L74
            r0 = 0
            r4 = 0
        La:
            if (r0 >= r12) goto Lff
            r5 = 0
        Ld:
            if (r5 >= r12) goto L71
            if (r5 >= r1) goto L1f
            if (r0 >= r1) goto L1f
            int[][] r6 = com.huawei.hms.scankit.p.i5.a
            r6 = r6[r0]
            r6 = r6[r5]
            if (r6 != r2) goto L6e
            r10.c(r5, r0)
            goto L6e
        L1f:
            int r6 = r12 + (-8)
            if (r5 < r6) goto L34
            if (r0 >= r1) goto L34
            int[][] r6 = com.huawei.hms.scankit.p.i5.a
            r6 = r6[r0]
            int r7 = r12 + (-1)
            int r7 = r7 - r5
            r6 = r6[r7]
            if (r6 != r2) goto L6e
            r10.c(r5, r0)
            goto L6e
        L34:
            if (r5 >= r1) goto L47
            if (r0 < r6) goto L47
            int[][] r6 = com.huawei.hms.scankit.p.i5.a
            r6 = r6[r5]
            int r7 = r12 + (-1)
            int r7 = r7 - r0
            r6 = r6[r7]
            if (r6 != r2) goto L6e
            r10.c(r5, r0)
            goto L6e
        L47:
            r6 = r13[r3]
            r7 = r6[r4]
            float r6 = (float) r7
            r7 = r13[r2]
            r8 = r7[r4]
            float r7 = (float) r8
            double[] r6 = a(r6, r7)
            r7 = r6[r3]
            float r7 = (float) r7
            int r7 = java.lang.Math.round(r7)
            r8 = r6[r2]
            float r6 = (float) r8
            int r6 = java.lang.Math.round(r6)
            boolean r6 = r11.b(r7, r6)
            if (r6 == 0) goto L6c
            r10.c(r5, r0)
        L6c:
            int r4 = r4 + 1
        L6e:
            int r5 = r5 + 1
            goto Ld
        L71:
            int r0 = r0 + 1
            goto La
        L74:
            r0 = 0
            r4 = 0
        L76:
            if (r0 >= r12) goto Lff
            r5 = 0
        L79:
            if (r5 >= r12) goto Lfb
            if (r5 >= r1) goto L8c
            if (r0 >= r1) goto L8c
            int[][] r6 = com.huawei.hms.scankit.p.i5.a
            r6 = r6[r0]
            r6 = r6[r5]
            if (r6 != r2) goto Lf7
            r10.c(r5, r0)
            goto Lf7
        L8c:
            int r6 = r12 + (-8)
            if (r5 < r6) goto La1
            if (r0 >= r1) goto La1
            int[][] r6 = com.huawei.hms.scankit.p.i5.a
            r6 = r6[r0]
            int r7 = r12 + (-1)
            int r7 = r7 - r5
            r6 = r6[r7]
            if (r6 != r2) goto Lf7
            r10.c(r5, r0)
            goto Lf7
        La1:
            if (r5 >= r1) goto Lb4
            if (r0 < r6) goto Lb4
            int[][] r6 = com.huawei.hms.scankit.p.i5.a
            r6 = r6[r5]
            int r7 = r12 + (-1)
            int r7 = r7 - r0
            r6 = r6[r7]
            if (r6 != r2) goto Lf7
            r10.c(r5, r0)
            goto Lf7
        Lb4:
            int r6 = r12 + (-9)
            if (r5 < r6) goto Ld0
            int r7 = r12 + (-4)
            if (r5 >= r7) goto Ld0
            if (r0 < r6) goto Ld0
            if (r0 >= r7) goto Ld0
            int[][] r7 = com.huawei.hms.scankit.p.i5.b
            int r6 = -r6
            int r8 = r6 + r0
            r7 = r7[r8]
            int r6 = r6 + r5
            r6 = r7[r6]
            if (r6 != r2) goto Lf7
            r10.c(r5, r0)
            goto Lf7
        Ld0:
            r6 = r13[r3]
            r7 = r6[r4]
            float r6 = (float) r7
            r7 = r13[r2]
            r8 = r7[r4]
            float r7 = (float) r8
            double[] r6 = a(r6, r7)
            r7 = r6[r3]
            float r7 = (float) r7
            int r7 = java.lang.Math.round(r7)
            r8 = r6[r2]
            float r6 = (float) r8
            int r6 = java.lang.Math.round(r6)
            boolean r6 = r11.b(r7, r6)
            if (r6 == 0) goto Lf5
            r10.c(r5, r0)
        Lf5:
            int r4 = r4 + 1
        Lf7:
            int r5 = r5 + 1
            goto L79
        Lfb:
            int r0 = r0 + 1
            goto L76
        Lff:
            return r10
    }

    public static java.lang.StringBuffer a(double[] r4) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L16
            r2 = r4[r1]
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L16:
            java.lang.String r4 = ";"
            r0.append(r4)
            return r0
    }

    private static double[] a(float r5, float r6) {
            r0 = 2
            double[] r0 = new double[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r4 = 1
            r0[r4] = r2
            double r2 = (double) r5
            r0[r1] = r2
            double r5 = (double) r6
            r0[r4] = r5
            return r0
    }

    private static double[] a(java.lang.String[] r5) {
            int r0 = r5.length
            double[] r1 = new double[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L15
            r3 = r5[r2]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L15:
            return r1
    }

    public static double[][] a(double r14, double[] r16, java.lang.String r17) {
            int r0 = a(r17)
            java.lang.String r1 = ";"
            r2 = r17
            java.lang.String[] r1 = r2.split(r1)
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            r3[r4] = r0
            r0 = 0
            r3[r0] = r2
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            double[][] r2 = (double[][]) r2
            r3 = 0
            r5 = 0
        L1f:
            int r6 = r1.length
            if (r3 >= r6) goto L5c
            r6 = r1[r3]
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            double[] r6 = a(r6)
            r7 = 0
        L2f:
            int r8 = r6.length
            if (r7 >= r8) goto L59
            r8 = r2[r0]
            int r9 = r3 / 2
            r10 = r16[r9]
            r12 = r6[r7]
            double r12 = java.lang.Math.cos(r12)
            double r10 = r10 * r12
            double r10 = r14 - r10
            r8[r5] = r10
            r8 = r2[r4]
            r9 = r16[r9]
            r11 = r6[r7]
            double r11 = java.lang.Math.sin(r11)
            double r9 = r9 * r11
            double r9 = r14 - r9
            r8[r5] = r9
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L2f
        L59:
            int r3 = r3 + 1
            goto L1f
        L5c:
            return r2
    }
}

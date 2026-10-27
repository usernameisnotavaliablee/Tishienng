package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s7 extends com.huawei.hms.scankit.p.q7 {
    private static final int[] i = null;
    public static final int[][] j = null;
    private final int[] h;

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1} // fill-array
            com.huawei.hms.scankit.p.s7.i = r0
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0030: FILL_ARRAY_DATA , data: [56, 52, 50, 49, 44, 38, 35, 42, 41, 37} // fill-array
            int[] r0 = new int[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [7, 11, 13, 14, 19, 25, 28, 21, 22, 26} // fill-array
            r2 = 2
            int[][] r2 = new int[r2][]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            com.huawei.hms.scankit.p.s7.j = r2
            return
    }

    public s7() {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.h = r0
            return
    }

    private static void a(java.lang.StringBuilder r4, int r5) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            r1 = 0
        L2:
            r2 = 1
            if (r1 > r2) goto L25
            r2 = 0
        L6:
            r3 = 10
            if (r2 >= r3) goto L22
            int[][] r3 = com.huawei.hms.scankit.p.s7.j
            r3 = r3[r1]
            r3 = r3[r2]
            if (r5 != r3) goto L1f
            int r1 = r1 + 48
            char r5 = (char) r1
            r4.insert(r0, r5)
            int r2 = r2 + 48
            char r5 = (char) r2
            r4.append(r5)
            return
        L1f:
            int r2 = r2 + 1
            goto L6
        L22:
            int r1 = r1 + 1
            goto L2
        L25:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
    }

    private int b(com.huawei.hms.scankit.p.r r5, int[] r6, int r7, int[][] r8) throws com.huawei.hms.scankit.p.a {
            r4 = this;
            com.huawei.hms.scankit.p.g5.a(r5, r7, r6)
            int r5 = r8.length
            r7 = 1055286886(0x3ee66666, float:0.45)
            r0 = -1
            r1 = 0
        L9:
            if (r1 >= r5) goto L1d
            r2 = r8[r1]
            r3 = 1060320051(0x3f333333, float:0.7)
            float r2 = com.huawei.hms.scankit.p.g5.a(r6, r2, r3)
            int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r3 >= 0) goto L1a
            r0 = r1
            r7 = r2
        L1a:
            int r1 = r1 + 1
            goto L9
        L1d:
            if (r0 < 0) goto L20
            return r0
        L20:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()
            throw r5
    }

    public static java.lang.String b(java.lang.String r10) {
            r0 = 6
            char[] r0 = new char[r0]
            r1 = 1
            r2 = 7
            r3 = 0
            r10.getChars(r1, r2, r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = 12
            r1.<init>(r4)
            char r4 = r10.charAt(r3)
            r1.append(r4)
            r4 = 5
            char r5 = r0[r4]
            java.lang.String r6 = "00000"
            java.lang.String r7 = "0000"
            r8 = 2
            r9 = 3
            switch(r5) {
                case 48: goto L44;
                case 49: goto L44;
                case 50: goto L44;
                case 51: goto L3a;
                case 52: goto L2d;
                default: goto L23;
            }
        L23:
            r1.append(r0, r3, r4)
            r1.append(r7)
            r1.append(r5)
            goto L50
        L2d:
            r4 = 4
            r1.append(r0, r3, r4)
            r1.append(r6)
            char r0 = r0[r4]
            r1.append(r0)
            goto L50
        L3a:
            r1.append(r0, r3, r9)
            r1.append(r6)
            r1.append(r0, r9, r8)
            goto L50
        L44:
            r1.append(r0, r3, r8)
            r1.append(r5)
            r1.append(r7)
            r1.append(r0, r8, r9)
        L50:
            int r0 = r10.length()
            r3 = 8
            if (r0 < r3) goto L5f
            char r10 = r10.charAt(r2)
            r1.append(r10)
        L5f:
            java.lang.String r10 = r1.toString()
            return r10
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(com.huawei.hms.scankit.p.r r21, int[] r22, java.lang.StringBuilder r23) throws com.huawei.hms.scankit.p.a {
            r20 = this;
            r0 = r20
            r1 = r23
            int[] r2 = r0.h
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r5 = 2
            r2[r5] = r3
            r6 = 3
            r2[r6] = r3
            int r7 = r21.e()
            r8 = r22[r4]
            r9 = 0
            r10 = 1176256512(0x461c4000, float:10000.0)
            r11 = 0
            r12 = 0
            r13 = 0
        L1f:
            r14 = 6
            if (r11 >= r14) goto L7f
            if (r8 >= r7) goto L7f
            int[][] r14 = com.huawei.hms.scankit.p.q7.g
            r15 = r21
            int r14 = r0.b(r15, r2, r8, r14)
            int r16 = r14 % 10
            r17 = 0
            int r3 = r16 + 48
            char r3 = (char) r3
            r1.append(r3)
            r3 = 0
            r16 = 0
        L39:
            int[][] r18 = com.huawei.hms.scankit.p.q7.g
            r19 = 1
            r4 = r18[r14]
            r18 = 2
            int r5 = r4.length
            if (r3 >= r5) goto L4e
            r4 = r4[r3]
            float r4 = (float) r4
            float r16 = r16 + r4
            int r3 = r3 + 1
            r4 = 1
            r5 = 2
            goto L39
        L4e:
            r3 = r2[r17]
            r4 = r2[r19]
            int r3 = r3 + r4
            r4 = r2[r18]
            int r3 = r3 + r4
            r4 = r2[r6]
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r16
            int r4 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r4 <= 0) goto L61
            r13 = r3
        L61:
            int r4 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r4 >= 0) goto L66
            r10 = r3
        L66:
            int r3 = r2.length
            r4 = 0
        L68:
            if (r4 >= r3) goto L70
            r5 = r2[r4]
            int r8 = r8 + r5
            int r4 = r4 + 1
            goto L68
        L70:
            r3 = 10
            if (r14 < r3) goto L79
            int r3 = 5 - r11
            int r3 = r19 << r3
            r12 = r12 | r3
        L79:
            int r11 = r11 + 1
            r3 = 0
            r4 = 1
            r5 = 2
            goto L1f
        L7f:
            float r13 = r13 / r10
            double r2 = (double) r13
            r4 = 4613690120261567775(0x40071eb851eb851f, double:2.89)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L8e
            a(r1, r12)
            return r8
        L8e:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
    }

    @Override // com.huawei.hms.scankit.p.q7
    com.huawei.hms.scankit.aiscan.common.BarcodeFormat a() {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.m
            return r0
    }

    @Override // com.huawei.hms.scankit.p.q7
    public boolean a(int r3, int r4, com.huawei.hms.scankit.p.r r5) {
            r2 = this;
            int r3 = r4 - r3
            int r3 = r3 + r4
            r0 = 0
            r1 = 1
            boolean r3 = r5.a(r4, r3, r0, r1)
            return r3
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected boolean a(java.lang.String r1) throws com.huawei.hms.scankit.p.a {
            r0 = this;
            java.lang.String r1 = b(r1)
            boolean r1 = super.a(r1)
            return r1
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int[] r13, int[] r14) throws com.huawei.hms.scankit.p.a {
            r12 = this;
            r0 = 1
            r1 = r13[r0]
            r2 = 0
            r13 = r13[r2]
            int r3 = r1 - r13
            double r3 = (double) r3
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r3 = r3 / r5
            r5 = r14[r0]
            r14 = r14[r2]
            int r6 = r5 - r14
            double r6 = (double) r6
            r8 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r6 = r6 / r8
            int r14 = r5 - r14
            int r1 = r1 - r13
            int r14 = r14 + r1
            double r8 = (double) r14
            r10 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r8 = r8 / r10
            int r5 = r5 - r13
            double r13 = (double) r5
            double r13 = r13 / r8
            long r13 = java.lang.Math.round(r13)
            int r14 = (int) r13
            int r14 = r14 + (-51)
            int r13 = java.lang.Math.abs(r14)
            double r13 = (double) r13
            r8 = 4621931707579655783(0x4024666666666667, double:10.200000000000001)
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 > 0) goto L48
            double r3 = r3 / r6
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 - r3
            double r13 = java.lang.Math.abs(r13)
            r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r1 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r1 >= 0) goto L48
            return r0
        L48:
            return r2
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int[] a(com.huawei.hms.scankit.p.r r3, int r4) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            int[] r0 = com.huawei.hms.scankit.p.s7.i
            r1 = 1
            int[] r3 = com.huawei.hms.scankit.p.q7.a(r3, r4, r1, r0)
            return r3
    }
}

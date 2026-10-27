package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o2 extends com.huawei.hms.scankit.p.q7 {
    public static final int[] j = null;
    private final int[] h;
    private java.lang.String i;

    static {
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 11, 13, 14, 19, 25, 28, 21, 22, 26} // fill-array
            com.huawei.hms.scankit.p.o2.j = r0
            return
    }

    public o2() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.i = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1.h = r0
            return
    }

    private static void a(java.lang.StringBuilder r3, int r4) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            r1 = 0
        L2:
            r2 = 10
            if (r1 >= r2) goto L16
            int[] r2 = com.huawei.hms.scankit.p.o2.j
            r2 = r2[r1]
            if (r4 != r2) goto L13
            int r1 = r1 + 48
            char r4 = (char) r1
            r3.insert(r0, r4)
            return
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            com.huawei.hms.scankit.p.a r3 = com.huawei.hms.scankit.p.a.a()
            throw r3
    }

    private static boolean a(java.lang.StringBuilder r6) {
            int r0 = r6.length()
            r1 = 1
            int r0 = r0 - r1
            char r0 = r6.charAt(r0)
            int r0 = r0 + (-48)
            r2 = 0
            r3 = 0
            r4 = 0
        Lf:
            int r5 = r6.length()
            int r5 = r5 - r1
            if (r3 >= r5) goto L2e
            int r5 = r3 % 2
            if (r5 != 0) goto L22
            char r5 = r6.charAt(r3)
            int r5 = r5 + (-48)
        L20:
            int r4 = r4 + r5
            goto L2b
        L22:
            char r5 = r6.charAt(r3)
            int r5 = r5 + (-48)
            int r5 = r5 * 3
            goto L20
        L2b:
            int r3 = r3 + 1
            goto Lf
        L2e:
            int r4 = r4 + r0
            int r4 = r4 % 10
            if (r4 != 0) goto L34
            return r1
        L34:
            return r2
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(com.huawei.hms.scankit.p.r r11, int[] r12, java.lang.StringBuilder r13) throws com.huawei.hms.scankit.p.a {
            r10 = this;
            int[] r0 = r10.h
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r3 = 2
            r0[r3] = r1
            r3 = 3
            r0[r3] = r1
            int r3 = r11.e()
            r12 = r12[r2]
            r4 = 0
            r5 = 0
        L16:
            r6 = 6
            if (r4 >= r6) goto L3f
            if (r12 >= r3) goto L3f
            int[][] r6 = com.huawei.hms.scankit.p.q7.g
            int r6 = com.huawei.hms.scankit.p.q7.a(r11, r0, r12, r6)
            int r7 = r6 % 10
            int r7 = r7 + 48
            char r7 = (char) r7
            r13.append(r7)
            int r7 = r0.length
            r8 = 0
        L2b:
            if (r8 >= r7) goto L33
            r9 = r0[r8]
            int r12 = r12 + r9
            int r8 = r8 + 1
            goto L2b
        L33:
            r7 = 10
            if (r6 < r7) goto L3c
            int r6 = 5 - r4
            int r6 = r2 << r6
            r5 = r5 | r6
        L3c:
            int r4 = r4 + 1
            goto L16
        L3f:
            a(r13, r5)
            java.lang.String r4 = r13.substring(r1, r2)
            r10.i = r4
            int[] r4 = com.huawei.hms.scankit.p.q7.d
            int[] r12 = com.huawei.hms.scankit.p.q7.a(r11, r12, r2, r4)
            r12 = r12[r2]
            r2 = 0
        L51:
            if (r2 >= r6) goto L6e
            if (r12 >= r3) goto L6e
            int[][] r4 = com.huawei.hms.scankit.p.q7.f
            int r4 = com.huawei.hms.scankit.p.q7.a(r11, r0, r12, r4)
            int r4 = r4 + 48
            char r4 = (char) r4
            r13.append(r4)
            int r4 = r0.length
            r5 = 0
        L63:
            if (r5 >= r4) goto L6b
            r7 = r0[r5]
            int r12 = r12 + r7
            int r5 = r5 + 1
            goto L63
        L6b:
            int r2 = r2 + 1
            goto L51
        L6e:
            boolean r11 = a(r13)
            if (r11 == 0) goto L75
            return r12
        L75:
            com.huawei.hms.scankit.p.a r11 = com.huawei.hms.scankit.p.a.a()
            throw r11
    }

    @Override // com.huawei.hms.scankit.p.q7
    com.huawei.hms.scankit.aiscan.common.BarcodeFormat a() {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            return r0
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int r2, int r3, com.huawei.hms.scankit.p.r r4) {
            r1 = this;
            int r2 = r3 - r2
            int r2 = r2 + r3
            r0 = 0
            boolean r2 = r4.a(r3, r2, r0, r0)
            return r2
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int[] r8, int[] r9) throws com.huawei.hms.scankit.p.a {
            r7 = this;
            r0 = 1
            r1 = r9[r0]
            r2 = 0
            r9 = r9[r2]
            int r9 = r1 - r9
            r3 = r8[r0]
            r8 = r8[r2]
            int r3 = r3 - r8
            int r9 = r9 + r3
            double r3 = (double) r9
            r5 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r3 = r3 / r5
            int r1 = r1 - r8
            double r8 = (double) r1
            double r8 = r8 / r3
            long r8 = java.lang.Math.round(r8)
            int r9 = (int) r8
            java.lang.String r8 = r7.i
            java.lang.String r1 = "0"
            boolean r8 = r8.equals(r1)
            r3 = 4625773841011756237(0x40320ccccccccccd, double:18.05)
            if (r8 == 0) goto L47
            int r8 = r9 + (-95)
            int r8 = java.lang.Math.abs(r8)
            double r5 = (double) r8
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L46
            int r9 = r9 + (-113)
            int r8 = java.lang.Math.abs(r9)
            double r8 = (double) r8
            r3 = 4626736485432106680(0x40357851eb851eb8, double:21.47)
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L45
            goto L46
        L45:
            return r2
        L46:
            return r0
        L47:
            int r9 = r9 + (-95)
            int r8 = java.lang.Math.abs(r9)
            double r8 = (double) r8
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L53
            return r0
        L53:
            return r2
    }
}

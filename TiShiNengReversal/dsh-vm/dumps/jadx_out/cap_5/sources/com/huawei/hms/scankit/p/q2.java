package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q2 extends com.huawei.hms.scankit.p.q7 {
    private final int[] h;

    public q2() {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.h = r0
            return
    }

    private int b(com.huawei.hms.scankit.p.r r5, int[] r6, int r7, int[][] r8) throws com.huawei.hms.scankit.p.a {
            r4 = this;
            com.huawei.hms.scankit.p.g5.a(r5, r7, r6)
            int r5 = r8.length
            r7 = 1054615798(0x3edc28f6, float:0.43)
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

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(com.huawei.hms.scankit.p.r r9, int[] r10, java.lang.StringBuilder r11) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int[] r0 = r8.h
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r3 = 2
            r0[r3] = r1
            r3 = 3
            r0[r3] = r1
            int r3 = r9.e()
            r10 = r10[r2]
            r4 = 0
        L15:
            r5 = 4
            if (r4 >= r5) goto L33
            if (r10 >= r3) goto L33
            int[][] r5 = com.huawei.hms.scankit.p.q7.f
            int r5 = r8.b(r9, r0, r10, r5)
            int r5 = r5 + 48
            char r5 = (char) r5
            r11.append(r5)
            int r5 = r0.length
            r6 = 0
        L28:
            if (r6 >= r5) goto L30
            r7 = r0[r6]
            int r10 = r10 + r7
            int r6 = r6 + 1
            goto L28
        L30:
            int r4 = r4 + 1
            goto L15
        L33:
            int[] r4 = com.huawei.hms.scankit.p.q7.d
            int[] r10 = com.huawei.hms.scankit.p.q7.a(r9, r10, r2, r4)
            r10 = r10[r2]
            r2 = 0
        L3c:
            if (r2 >= r5) goto L59
            if (r10 >= r3) goto L59
            int[][] r4 = com.huawei.hms.scankit.p.q7.f
            int r4 = r8.b(r9, r0, r10, r4)
            int r4 = r4 + 48
            char r4 = (char) r4
            r11.append(r4)
            int r4 = r0.length
            r6 = 0
        L4e:
            if (r6 >= r4) goto L56
            r7 = r0[r6]
            int r10 = r10 + r7
            int r6 = r6 + 1
            goto L4e
        L56:
            int r2 = r2 + 1
            goto L3c
        L59:
            return r10
    }

    @Override // com.huawei.hms.scankit.p.q7
    com.huawei.hms.scankit.aiscan.common.BarcodeFormat a() {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.g
            return r0
    }

    @Override // com.huawei.hms.scankit.p.q7
    public boolean a(int r5, int r6, com.huawei.hms.scankit.p.r r7) {
            r4 = this;
            int r5 = r6 - r5
            double r0 = (double) r5
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r2
            int r5 = (int) r0
            int r5 = r5 + r6
            r0 = 0
            r1 = 1
            boolean r5 = r7.a(r6, r5, r0, r1)
            return r5
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
            r7 = r14[r0]
            r14 = r14[r2]
            int r8 = r7 - r14
            double r8 = (double) r8
            double r8 = r8 / r5
            int r14 = r7 - r14
            int r1 = r1 - r13
            int r14 = r14 + r1
            double r5 = (double) r14
            r10 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r5 = r5 / r10
            int r7 = r7 - r13
            double r13 = (double) r7
            double r13 = r13 / r5
            long r13 = java.lang.Math.round(r13)
            int r14 = (int) r13
            int r14 = r14 + (-67)
            int r13 = java.lang.Math.abs(r14)
            double r13 = (double) r13
            r5 = 4619229547803233485(0x401acccccccccccd, double:6.7)
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 > 0) goto L46
            double r3 = r3 / r8
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 - r3
            double r13 = java.lang.Math.abs(r13)
            r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r1 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r1 >= 0) goto L46
            return r0
        L46:
            return r2
    }
}

package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class u0 extends com.huawei.hms.scankit.p.h5 {
    public u0() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(int r3, int[] r4) {
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto L14
            int r1 = 8 - r0
            r2 = 1
            int r1 = r2 << r1
            r1 = r1 & r3
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r2 = 2
        Lf:
            r4[r0] = r2
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r2, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3, int r4, int r5, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.c
            if (r3 != r0) goto L9
            com.huawei.hms.scankit.p.s r2 = super.a(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can only encode CODE_39, but got "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(java.lang.String r13) {
            r12 = this;
            int r0 = r13.length()
            r1 = 80
            if (r0 > r1) goto L74
            r1 = 9
            int[] r2 = new int[r1]
            int r3 = r0 + 25
            r4 = 0
            r5 = 0
        L10:
            java.lang.String r6 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%"
            if (r5 >= r0) goto L39
            char r7 = r13.charAt(r5)
            int r6 = r6.indexOf(r7)
            if (r6 < 0) goto L31
            int[] r7 = com.huawei.hms.scankit.p.t0.e
            r6 = r7[r6]
            a(r6, r2)
            r6 = 0
        L26:
            if (r6 >= r1) goto L2e
            r7 = r2[r6]
            int r3 = r3 + r7
            int r6 = r6 + 1
            goto L26
        L2e:
            int r5 = r5 + 1
            goto L10
        L31:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad contents: error contents"
            r13.<init>(r0)
            throw r13
        L39:
            boolean[] r1 = new boolean[r3]
            r3 = 148(0x94, float:2.07E-43)
            a(r3, r2)
            r5 = 1
            int r7 = com.huawei.hms.scankit.p.h5.a(r1, r4, r2, r5)
            int[] r8 = new int[]{r5}
            int r9 = com.huawei.hms.scankit.p.h5.a(r1, r7, r8, r4)
            int r7 = r7 + r9
            r9 = 0
        L4f:
            if (r9 >= r0) goto L6d
            char r10 = r13.charAt(r9)
            int r10 = r6.indexOf(r10)
            int[] r11 = com.huawei.hms.scankit.p.t0.e
            r10 = r11[r10]
            a(r10, r2)
            int r10 = com.huawei.hms.scankit.p.h5.a(r1, r7, r2, r5)
            int r7 = r7 + r10
            int r10 = com.huawei.hms.scankit.p.h5.a(r1, r7, r8, r4)
            int r7 = r7 + r10
            int r9 = r9 + 1
            goto L4f
        L6d:
            a(r3, r2)
            com.huawei.hms.scankit.p.h5.a(r1, r7, r2, r5)
            return r1
        L74:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested contents should be less than 80 digits long, but got "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
    }
}

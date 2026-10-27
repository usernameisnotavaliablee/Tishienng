package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k4 extends com.huawei.hms.scankit.p.h5 {
    private static final int[] a = null;
    private static final int[] b = null;

    static {
            r0 = 1
            int[] r1 = new int[]{r0, r0, r0, r0}
            com.huawei.hms.scankit.p.k4.a = r1
            r1 = 3
            int[] r0 = new int[]{r1, r0, r0}
            com.huawei.hms.scankit.p.k4.b = r0
            return
    }

    public k4() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r2, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3, int r4, int r5, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.i
            if (r3 != r0) goto L9
            com.huawei.hms.scankit.p.s r2 = super.a(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can only encode ITF, but got "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(java.lang.String r14) {
            r13 = this;
            int r0 = r14.length()
            int r1 = r0 % 2
            if (r1 != 0) goto L70
            r1 = 80
            if (r0 > r1) goto L59
            int r1 = r0 * 9
            int r1 = r1 + 9
            boolean[] r1 = new boolean[r1]
            int[] r2 = com.huawei.hms.scankit.p.k4.a
            r3 = 0
            r4 = 1
            int r2 = com.huawei.hms.scankit.p.h5.a(r1, r3, r2, r4)
            r5 = 0
        L1b:
            if (r5 >= r0) goto L53
            char r6 = r14.charAt(r5)
            r7 = 10
            int r6 = java.lang.Character.digit(r6, r7)
            int r8 = r5 + 1
            char r8 = r14.charAt(r8)
            int r8 = java.lang.Character.digit(r8, r7)
            int[] r7 = new int[r7]
            r9 = 0
        L34:
            r10 = 5
            if (r9 >= r10) goto L4b
            int r10 = r9 * 2
            int[][] r11 = com.huawei.hms.scankit.p.j4.f
            r12 = r11[r6]
            r12 = r12[r9]
            r7[r10] = r12
            int r10 = r10 + r4
            r11 = r11[r8]
            r11 = r11[r9]
            r7[r10] = r11
            int r9 = r9 + 1
            goto L34
        L4b:
            int r6 = com.huawei.hms.scankit.p.h5.a(r1, r2, r7, r4)
            int r2 = r2 + r6
            int r5 = r5 + 2
            goto L1b
        L53:
            int[] r14 = com.huawei.hms.scankit.p.k4.b
            com.huawei.hms.scankit.p.h5.a(r1, r2, r14, r4)
            return r1
        L59:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested contents should be less than 80 digits long, but got "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L70:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The length of the input should be even"
            r14.<init>(r0)
            throw r14
    }
}

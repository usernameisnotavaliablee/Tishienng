package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class w0 extends com.huawei.hms.scankit.p.h5 {
    public w0() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(java.lang.String r6, int r7) {
            int r0 = r6.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 1
        L8:
            if (r0 < 0) goto L1e
            char r4 = r6.charAt(r0)
            java.lang.String r5 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            int r4 = r5.indexOf(r4)
            int r4 = r4 * r3
            int r2 = r2 + r4
            int r3 = r3 + r1
            if (r3 <= r7) goto L1b
            r3 = 1
        L1b:
            int r0 = r0 + (-1)
            goto L8
        L1e:
            int r2 = r2 % 47
            return r2
    }

    private static int a(boolean[] r5, int r6, int[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L14
            r3 = r7[r2]
            int r4 = r6 + 1
            if (r3 == 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            r5[r6] = r3
            int r2 = r2 + 1
            r6 = r4
            goto L3
        L14:
            r5 = 9
            return r5
    }

    private static void a(int r4, int[] r5) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 9
            if (r1 >= r2) goto L14
            int r2 = 8 - r1
            r3 = 1
            int r2 = r3 << r2
            r2 = r2 & r4
            if (r2 != 0) goto Lf
            r3 = 0
        Lf:
            r5[r1] = r3
            int r1 = r1 + 1
            goto L2
        L14:
            return
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r2, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3, int r4, int r5, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.d
            if (r3 != r0) goto L9
            com.huawei.hms.scankit.p.s r2 = super.a(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can only encode CODE_93, but got "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(java.lang.String r10) {
            r9 = this;
            int r0 = r10.length()
            r1 = 80
            if (r0 > r1) goto L8d
            r1 = 9
            int[] r2 = new int[r1]
            int r3 = r10.length()
            int r3 = r3 + 4
            int r3 = r3 * 9
            r1 = 1
            int r3 = r3 + r1
            int[] r4 = com.huawei.hms.scankit.p.v0.d
            r5 = 47
            r4 = r4[r5]
            a(r4, r2)
            boolean[] r3 = new boolean[r3]
            r4 = 0
            int r6 = a(r3, r4, r2)
        L26:
            java.lang.String r7 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            if (r4 >= r0) goto L4b
            char r8 = r10.charAt(r4)
            int r7 = r7.indexOf(r8)
            if (r7 < 0) goto L43
            int[] r8 = com.huawei.hms.scankit.p.v0.d
            r7 = r8[r7]
            a(r7, r2)
            int r7 = a(r3, r6, r2)
            int r6 = r6 + r7
            int r4 = r4 + 1
            goto L26
        L43:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad contents: please check contents"
            r10.<init>(r0)
            throw r10
        L4b:
            r0 = 20
            int r0 = a(r10, r0)
            int[] r4 = com.huawei.hms.scankit.p.v0.d
            r8 = r4[r0]
            a(r8, r2)
            int r8 = a(r3, r6, r2)
            int r6 = r6 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            char r10 = r7.charAt(r0)
            r8.append(r10)
            java.lang.String r10 = r8.toString()
            r0 = 15
            int r10 = a(r10, r0)
            r10 = r4[r10]
            a(r10, r2)
            int r10 = a(r3, r6, r2)
            int r6 = r6 + r10
            r10 = r4[r5]
            a(r10, r2)
            int r10 = a(r3, r6, r2)
            int r6 = r6 + r10
            r3[r6] = r1
            return r3
        L8d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested contents should be less than 80 digits long, but got "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.<init>(r0)
            throw r10
    }
}

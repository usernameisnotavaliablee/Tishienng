package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t7 extends com.huawei.hms.scankit.p.r7 {
    public t7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r2, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3, int r4, int r5, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.m
            if (r3 != r0) goto L9
            com.huawei.hms.scankit.p.s r2 = super.a(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can only encode UPC_E, but got "
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
            r1 = 7
            if (r0 == r1) goto L39
            r2 = 8
            if (r0 != r2) goto L22
            boolean r0 = com.huawei.hms.scankit.p.q7.a(r10)     // Catch: com.huawei.hms.scankit.p.a -> L1a
            if (r0 == 0) goto L12
            goto L50
        L12:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: com.huawei.hms.scankit.p.a -> L1a
            java.lang.String r0 = "Contents do not pass checksum"
            r10.<init>(r0)     // Catch: com.huawei.hms.scankit.p.a -> L1a
            throw r10     // Catch: com.huawei.hms.scankit.p.a -> L1a
        L1a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal contents"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested contents should be 8 digits long, but got "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.<init>(r0)
            throw r10
        L39:
            java.lang.String r0 = com.huawei.hms.scankit.p.s7.b(r10)     // Catch: com.huawei.hms.scankit.p.a -> La8
            int r0 = com.huawei.hms.scankit.p.q7.b(r0)     // Catch: com.huawei.hms.scankit.p.a -> La8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
        L50:
            r0 = 0
            char r2 = r10.charAt(r0)
            r3 = 10
            int r2 = java.lang.Character.digit(r2, r3)
            r4 = 1
            if (r2 == 0) goto L69
            if (r2 != r4) goto L61
            goto L69
        L61:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Number system must be 0 or 1"
            r10.<init>(r0)
            throw r10
        L69:
            char r1 = r10.charAt(r1)
            int r1 = java.lang.Character.digit(r1, r3)
            int[][] r5 = com.huawei.hms.scankit.p.s7.j
            r2 = r5[r2]
            r1 = r2[r1]
            r2 = 51
            boolean[] r2 = new boolean[r2]
            int[] r5 = com.huawei.hms.scankit.p.q7.c
            int r5 = com.huawei.hms.scankit.p.h5.a(r2, r0, r5, r4)
            r6 = 1
        L82:
            r7 = 6
            if (r6 > r7) goto La2
            char r7 = r10.charAt(r6)
            int r7 = java.lang.Character.digit(r7, r3)
            int r8 = 6 - r6
            int r8 = r1 >> r8
            r8 = r8 & r4
            if (r8 != r4) goto L96
            int r7 = r7 + 10
        L96:
            int[][] r8 = com.huawei.hms.scankit.p.q7.g
            r7 = r8[r7]
            int r7 = com.huawei.hms.scankit.p.h5.a(r2, r5, r7, r0)
            int r5 = r5 + r7
            int r6 = r6 + 1
            goto L82
        La2:
            int[] r10 = com.huawei.hms.scankit.p.q7.e
            com.huawei.hms.scankit.p.h5.a(r2, r5, r10, r0)
            return r2
        La8:
            r10 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
    }
}

package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r2 extends com.huawei.hms.scankit.p.r7 {
    public r2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r2, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3, int r4, int r5, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.g
            if (r3 != r0) goto L9
            com.huawei.hms.scankit.p.s r2 = super.a(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can only encode EAN_8, but got "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(java.lang.String r9) {
            r8 = this;
            int r0 = r9.length()
            r1 = 7
            if (r0 == r1) goto L39
            r2 = 8
            if (r0 != r2) goto L22
            boolean r0 = com.huawei.hms.scankit.p.q7.a(r9)     // Catch: com.huawei.hms.scankit.p.a -> L1a
            if (r0 == 0) goto L12
            goto L4c
        L12:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: com.huawei.hms.scankit.p.a -> L1a
            java.lang.String r0 = "Contents do not pass checksum"
            r9.<init>(r0)     // Catch: com.huawei.hms.scankit.p.a -> L1a
            throw r9     // Catch: com.huawei.hms.scankit.p.a -> L1a
        L1a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal contents"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested contents should be 8 digits long, but got "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L39:
            int r0 = com.huawei.hms.scankit.p.q7.b(r9)     // Catch: com.huawei.hms.scankit.p.a -> L96
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r0)
            java.lang.String r9 = r2.toString()
        L4c:
            r0 = 67
            boolean[] r0 = new boolean[r0]
            int[] r2 = com.huawei.hms.scankit.p.q7.c
            r3 = 0
            r4 = 1
            int r2 = com.huawei.hms.scankit.p.h5.a(r0, r3, r2, r4)
            r5 = 0
        L59:
            r6 = 3
            r7 = 10
            if (r5 > r6) goto L72
            char r6 = r9.charAt(r5)
            int r6 = java.lang.Character.digit(r6, r7)
            int[][] r7 = com.huawei.hms.scankit.p.q7.f
            r6 = r7[r6]
            int r6 = com.huawei.hms.scankit.p.h5.a(r0, r2, r6, r3)
            int r2 = r2 + r6
            int r5 = r5 + 1
            goto L59
        L72:
            int[] r5 = com.huawei.hms.scankit.p.q7.d
            int r3 = com.huawei.hms.scankit.p.h5.a(r0, r2, r5, r3)
            int r2 = r2 + r3
            r3 = 4
        L7a:
            if (r3 > r1) goto L90
            char r5 = r9.charAt(r3)
            int r5 = java.lang.Character.digit(r5, r7)
            int[][] r6 = com.huawei.hms.scankit.p.q7.f
            r5 = r6[r5]
            int r5 = com.huawei.hms.scankit.p.h5.a(r0, r2, r5, r4)
            int r2 = r2 + r5
            int r3 = r3 + 1
            goto L7a
        L90:
            int[] r9 = com.huawei.hms.scankit.p.q7.c
            com.huawei.hms.scankit.p.h5.a(r0, r2, r9, r4)
            return r0
        L96:
            r9 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
    }
}

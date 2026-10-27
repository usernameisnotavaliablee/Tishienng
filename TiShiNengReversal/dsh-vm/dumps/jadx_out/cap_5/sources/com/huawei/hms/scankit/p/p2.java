package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p2 extends com.huawei.hms.scankit.p.r7 {
    public p2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r2, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3, int r4, int r5, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            if (r3 != r0) goto L9
            com.huawei.hms.scankit.p.s r2 = super.a(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can only encode EAN_13, but got "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(java.lang.String r11) {
            r10 = this;
            int r0 = r11.length()
            r1 = 12
            if (r0 == r1) goto L3a
            r2 = 13
            if (r0 != r2) goto L23
            boolean r0 = com.huawei.hms.scankit.p.q7.a(r11)     // Catch: com.huawei.hms.scankit.p.a -> L1b
            if (r0 == 0) goto L13
            goto L4d
        L13:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: com.huawei.hms.scankit.p.a -> L1b
            java.lang.String r0 = "Contents do not pass checksum"
            r11.<init>(r0)     // Catch: com.huawei.hms.scankit.p.a -> L1b
            throw r11     // Catch: com.huawei.hms.scankit.p.a -> L1b
        L1b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal contents"
            r11.<init>(r0)
            throw r11
        L23:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested contents should be 12 or 13 digits long, but got "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L3a:
            int r0 = com.huawei.hms.scankit.p.q7.b(r11)     // Catch: com.huawei.hms.scankit.p.a -> Lac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r0)
            java.lang.String r11 = r2.toString()
        L4d:
            r0 = 0
            char r2 = r11.charAt(r0)
            r3 = 10
            int r2 = java.lang.Character.digit(r2, r3)
            int[] r4 = com.huawei.hms.scankit.p.o2.j
            r2 = r4[r2]
            r4 = 95
            boolean[] r4 = new boolean[r4]
            int[] r5 = com.huawei.hms.scankit.p.q7.c
            r6 = 1
            int r5 = com.huawei.hms.scankit.p.h5.a(r4, r0, r5, r6)
            r7 = 1
        L68:
            r8 = 6
            if (r7 > r8) goto L88
            char r8 = r11.charAt(r7)
            int r8 = java.lang.Character.digit(r8, r3)
            int r9 = 6 - r7
            int r9 = r2 >> r9
            r9 = r9 & r6
            if (r9 != r6) goto L7c
            int r8 = r8 + 10
        L7c:
            int[][] r9 = com.huawei.hms.scankit.p.q7.g
            r8 = r9[r8]
            int r8 = com.huawei.hms.scankit.p.h5.a(r4, r5, r8, r0)
            int r5 = r5 + r8
            int r7 = r7 + 1
            goto L68
        L88:
            int[] r2 = com.huawei.hms.scankit.p.q7.d
            int r0 = com.huawei.hms.scankit.p.h5.a(r4, r5, r2, r0)
            int r5 = r5 + r0
            r0 = 7
        L90:
            if (r0 > r1) goto La6
            char r2 = r11.charAt(r0)
            int r2 = java.lang.Character.digit(r2, r3)
            int[][] r7 = com.huawei.hms.scankit.p.q7.f
            r2 = r7[r2]
            int r2 = com.huawei.hms.scankit.p.h5.a(r4, r5, r2, r6)
            int r5 = r5 + r2
            int r0 = r0 + 1
            goto L90
        La6:
            int[] r11 = com.huawei.hms.scankit.p.q7.c
            com.huawei.hms.scankit.p.h5.a(r4, r5, r11, r6)
            return r4
        Lac:
            r11 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r11)
            throw r0
    }
}

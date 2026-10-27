package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k5 extends com.huawei.hms.scankit.p.q3 {
    private com.huawei.hms.scankit.p.s e;
    private com.huawei.hms.scankit.p.p4 f;

    public k5(com.huawei.hms.scankit.p.p4 r1) {
            r0 = this;
            r0.<init>(r1)
            r0.f = r1
            return
    }

    @Override // com.huawei.hms.scankit.p.q3, com.huawei.hms.scankit.p.o
    public com.huawei.hms.scankit.p.s a() {
            r27 = this;
            r0 = r27
            com.huawei.hms.scankit.p.s r1 = r0.e
            if (r1 == 0) goto L7
            return r1
        L7:
            com.huawei.hms.scankit.p.p4 r1 = r0.c()
            int r2 = r1.c()
            int r3 = r1.a()
            byte[] r1 = r1.b()
            com.huawei.hms.scankit.p.s r4 = new com.huawei.hms.scankit.p.s
            r4.<init>(r2, r3)
            com.huawei.hms.scankit.p.p4 r5 = r0.f
            byte[] r5 = r5.b()
            com.huawei.hms.scankit.p.p4 r6 = r0.f
            int r6 = r6.c()
            com.huawei.hms.scankit.p.p4 r7 = r0.f
            int r7 = r7.a()
            r8 = 256(0x100, float:3.59E-43)
            int[] r9 = new int[r8]
            r11 = 0
        L33:
            if (r11 >= r7) goto L4c
            int r12 = r11 * r6
            r13 = 0
        L38:
            if (r13 >= r6) goto L49
            int r14 = r12 + r13
            r14 = r5[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = r9[r14]
            int r15 = r15 + 1
            r9[r14] = r15
            int r13 = r13 + 1
            goto L38
        L49:
            int r11 = r11 + 1
            goto L33
        L4c:
            r5 = 0
            r13 = 0
            r14 = 0
        L50:
            if (r5 >= r8) goto Lc4
            r10 = 0
            r11 = 0
            r16 = 0
        L56:
            if (r10 >= r5) goto L69
            r12 = r9[r10]
            int r11 = r11 + r12
            int r12 = r12 * r10
            r19 = r9
            double r8 = (double) r12
            double r16 = r16 + r8
            int r10 = r10 + 1
            r9 = r19
            r8 = 256(0x100, float:3.59E-43)
            goto L56
        L69:
            r19 = r9
            r8 = r5
            r9 = 0
            r20 = 0
        L6f:
            r10 = 256(0x100, float:3.59E-43)
            if (r8 >= r10) goto L82
            r12 = r19[r8]
            int r9 = r9 + r12
            int r12 = r12 * r8
            r18 = r11
            double r10 = (double) r12
            double r20 = r20 + r10
            int r8 = r8 + 1
            r11 = r18
            goto L6f
        L82:
            r10 = r11
            double r11 = (double) r10
            int r8 = r6 * r7
            r22 = r5
            r18 = r6
            double r5 = (double) r8
            double r23 = r11 / r5
            r25 = r5
            double r5 = (double) r9
            double r25 = r5 / r25
            if (r10 <= 0) goto L97
            double r16 = r16 / r11
            goto L99
        L97:
            r16 = 0
        L99:
            if (r9 <= 0) goto L9e
            double r20 = r20 / r5
            goto La0
        L9e:
            r20 = 0
        La0:
            double r5 = r23 * r16
            double r8 = r25 * r20
            double r5 = r5 + r8
            double r16 = r16 - r5
            double r23 = r23 * r16
            double r23 = r23 * r16
            double r20 = r20 - r5
            double r25 = r25 * r20
            double r25 = r25 * r20
            double r23 = r23 + r25
            int r5 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r5 <= 0) goto Lbb
            r13 = r22
            r14 = r23
        Lbb:
            int r5 = r22 + 1
            r6 = r18
            r9 = r19
            r8 = 256(0x100, float:3.59E-43)
            goto L50
        Lc4:
            r5 = 0
        Lc5:
            if (r5 >= r3) goto Ldd
            int r6 = r5 * r2
            r7 = 0
        Lca:
            if (r7 >= r2) goto Lda
            int r8 = r6 + r7
            r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 > r13) goto Ld7
            r4.c(r7, r5)
        Ld7:
            int r7 = r7 + 1
            goto Lca
        Lda:
            int r5 = r5 + 1
            goto Lc5
        Ldd:
            r0.e = r4
            return r4
    }
}

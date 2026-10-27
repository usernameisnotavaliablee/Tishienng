package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class c1 {
    private final int a;
    private final byte[] b;

    private c1(int r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    static com.huawei.hms.scankit.p.c1[] a(byte[] r12, com.huawei.hms.scankit.p.a8 r13, com.huawei.hms.scankit.p.c3 r14) {
            int r0 = r12.length
            int r1 = r13.l()
            if (r0 != r1) goto Lb0
            com.huawei.hms.scankit.p.a8$b r13 = r13.a(r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = r13.a()
            int r0 = r14.length
            r1 = 0
            r2 = 0
            r3 = 0
        L13:
            if (r2 >= r0) goto L1f
            r4 = r14[r2]
            int r4 = r4.a()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L13
        L1f:
            com.huawei.hms.scankit.p.c1[] r0 = new com.huawei.hms.scankit.p.c1[r3]
            int r2 = r14.length
            r4 = 0
            r5 = 0
        L24:
            if (r4 >= r2) goto L4a
            r6 = r14[r4]
            r7 = 0
        L29:
            int r8 = r6.a()
            if (r7 >= r8) goto L47
            int r8 = r6.b()
            int r9 = r13.b()
            int r9 = r9 + r8
            int r10 = r5 + 1
            com.huawei.hms.scankit.p.c1 r11 = new com.huawei.hms.scankit.p.c1
            byte[] r9 = new byte[r9]
            r11.<init>(r8, r9)
            r0[r5] = r11
            int r7 = r7 + 1
            r5 = r10
            goto L29
        L47:
            int r4 = r4 + 1
            goto L24
        L4a:
            r14 = r0[r1]
            byte[] r14 = r14.b
            int r14 = r14.length
            int r3 = r3 + (-1)
        L51:
            if (r3 < 0) goto L5e
            r2 = r0[r3]
            byte[] r2 = r2.b
            int r2 = r2.length
            if (r2 != r14) goto L5b
            goto L5e
        L5b:
            int r3 = r3 + (-1)
            goto L51
        L5e:
            int r3 = r3 + 1
            int r13 = r13.b()
            int r14 = r14 - r13
            r13 = 0
            r2 = 0
        L67:
            if (r13 >= r14) goto L7d
            r4 = 0
        L6a:
            if (r4 >= r5) goto L7a
            r6 = r0[r4]
            byte[] r6 = r6.b
            int r7 = r2 + 1
            r2 = r12[r2]
            r6[r13] = r2
            int r4 = r4 + 1
            r2 = r7
            goto L6a
        L7a:
            int r13 = r13 + 1
            goto L67
        L7d:
            r13 = r3
        L7e:
            if (r13 >= r5) goto L8e
            r4 = r0[r13]
            byte[] r4 = r4.b
            int r6 = r2 + 1
            r2 = r12[r2]
            r4[r14] = r2
            int r13 = r13 + 1
            r2 = r6
            goto L7e
        L8e:
            r13 = r0[r1]
            byte[] r13 = r13.b
            int r13 = r13.length
        L93:
            if (r14 >= r13) goto Laf
            r4 = 0
        L96:
            if (r4 >= r5) goto Lac
            if (r4 >= r3) goto L9c
            r6 = r14
            goto L9e
        L9c:
            int r6 = r14 + 1
        L9e:
            r7 = r0[r4]
            byte[] r7 = r7.b
            int r8 = r2 + 1
            r2 = r12[r2]
            r7[r6] = r2
            int r4 = r4 + 1
            r2 = r8
            goto L96
        Lac:
            int r14 = r14 + 1
            goto L93
        Laf:
            return r0
        Lb0:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
    }

    byte[] a() {
            r1 = this;
            byte[] r0 = r1.b
            return r0
    }

    int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}

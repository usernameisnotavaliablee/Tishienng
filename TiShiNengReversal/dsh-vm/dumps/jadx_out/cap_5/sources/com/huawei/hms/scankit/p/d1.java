package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class d1 {
    private final int a;
    private final byte[] b;

    private d1(int r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    static com.huawei.hms.scankit.p.d1[] a(byte[] r12, com.huawei.hms.scankit.p.b8 r13, com.huawei.hms.scankit.p.b3 r14) {
            int r0 = r12.length
            int r1 = r13.e()
            if (r0 != r1) goto L67
            com.huawei.hms.scankit.p.b8$b r5 = r13.a(r14)
            com.huawei.hms.scankit.p.b8$a[] r13 = r5.a()
            int r14 = r13.length
            r0 = 0
            r1 = 0
            r2 = 0
        L13:
            if (r1 >= r14) goto L1f
            r3 = r13[r1]
            int r3 = r3.a()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L13
        L1f:
            com.huawei.hms.scankit.p.d1[] r14 = new com.huawei.hms.scankit.p.d1[r2]
            int r1 = r13.length
            r3 = 0
            r6 = 0
        L24:
            if (r3 >= r1) goto L4a
            r4 = r13[r3]
            r7 = 0
        L29:
            int r8 = r4.a()
            if (r7 >= r8) goto L47
            int r8 = r4.b()
            int r9 = r5.b()
            int r9 = r9 + r8
            int r10 = r6 + 1
            com.huawei.hms.scankit.p.d1 r11 = new com.huawei.hms.scankit.p.d1
            byte[] r9 = new byte[r9]
            r11.<init>(r8, r9)
            r14[r6] = r11
            int r7 = r7 + 1
            r6 = r10
            goto L29
        L47:
            int r3 = r3 + 1
            goto L24
        L4a:
            r13 = r14[r0]
            byte[] r13 = r13.b
            int r4 = r13.length
            int r2 = r2 + (-1)
        L51:
            if (r2 < 0) goto L5e
            r13 = r14[r2]
            byte[] r13 = r13.b
            int r13 = r13.length
            if (r13 != r4) goto L5b
            goto L5e
        L5b:
            int r2 = r2 + (-1)
            goto L51
        L5e:
            int r7 = r2 + 1
            r3 = r12
            r2 = r14
            com.huawei.hms.scankit.p.d1[] r12 = a(r2, r3, r4, r5, r6, r7)
            return r12
        L67:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
    }

    private static com.huawei.hms.scankit.p.d1[] a(com.huawei.hms.scankit.p.d1[] r6, byte[] r7, int r8, com.huawei.hms.scankit.p.b8.b r9, int r10, int r11) {
            int r9 = r9.b()
            int r8 = r8 - r9
            r9 = 0
            r0 = 0
            r1 = 0
        L8:
            if (r0 >= r8) goto L1e
            r2 = 0
        Lb:
            if (r2 >= r10) goto L1b
            r3 = r6[r2]
            byte[] r3 = r3.b
            int r4 = r1 + 1
            r1 = r7[r1]
            r3[r0] = r1
            int r2 = r2 + 1
            r1 = r4
            goto Lb
        L1b:
            int r0 = r0 + 1
            goto L8
        L1e:
            r0 = r11
        L1f:
            if (r0 >= r10) goto L2f
            r2 = r6[r0]
            byte[] r2 = r2.b
            int r3 = r1 + 1
            r1 = r7[r1]
            r2[r8] = r1
            int r0 = r0 + 1
            r1 = r3
            goto L1f
        L2f:
            r0 = r6[r9]
            byte[] r0 = r0.b
            int r0 = r0.length
        L34:
            if (r8 >= r0) goto L6b
            r2 = 0
        L37:
            if (r2 >= r10) goto L68
            if (r2 >= r11) goto L3d
            r3 = r8
            goto L3f
        L3d:
            int r3 = r8 + 1
        L3f:
            if (r2 < 0) goto L62
            int r4 = r6.length
            if (r2 >= r4) goto L62
            r4 = r6[r2]
            byte[] r4 = r4.b
            boolean r4 = com.huawei.hms.scankit.p.w7.a(r4, r3)
            if (r4 == 0) goto L62
            boolean r4 = com.huawei.hms.scankit.p.w7.a(r7, r1)
            if (r4 == 0) goto L62
            r4 = r6[r2]
            byte[] r4 = r4.b
            int r5 = r1 + 1
            r1 = r7[r1]
            r4[r3] = r1
            int r2 = r2 + 1
            r1 = r5
            goto L37
        L62:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        L68:
            int r8 = r8 + 1
            goto L34
        L6b:
            return r6
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

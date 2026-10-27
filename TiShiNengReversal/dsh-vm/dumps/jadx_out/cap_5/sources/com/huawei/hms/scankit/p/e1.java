package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class e1 {
    private final int a;
    private final byte[] b;

    private e1(int r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    static com.huawei.hms.scankit.p.e1[] a(byte[] r13, com.huawei.hms.scankit.p.z7 r14) {
            com.huawei.hms.scankit.p.z7$c r0 = r14.d()
            com.huawei.hms.scankit.p.z7$b[] r1 = r0.a()
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        Lc:
            if (r4 >= r2) goto L18
            r6 = r1[r4]
            int r6 = r6.a()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto Lc
        L18:
            com.huawei.hms.scankit.p.e1[] r2 = new com.huawei.hms.scankit.p.e1[r5]
            int r4 = r1.length
            r5 = 0
            r6 = 0
        L1d:
            if (r5 >= r4) goto L43
            r7 = r1[r5]
            r8 = 0
        L22:
            int r9 = r7.a()
            if (r8 >= r9) goto L40
            int r9 = r7.b()
            int r10 = r0.b()
            int r10 = r10 + r9
            int r11 = r6 + 1
            com.huawei.hms.scankit.p.e1 r12 = new com.huawei.hms.scankit.p.e1
            byte[] r10 = new byte[r10]
            r12.<init>(r9, r10)
            r2[r6] = r12
            int r8 = r8 + 1
            r6 = r11
            goto L22
        L40:
            int r5 = r5 + 1
            goto L1d
        L43:
            r1 = r2[r3]
            byte[] r1 = r1.b
            int r1 = r1.length
            int r0 = r0.b()
            int r1 = r1 - r0
            int r0 = r1 + (-1)
            r4 = 0
            r5 = 0
        L51:
            if (r4 >= r0) goto L67
            r7 = 0
        L54:
            if (r7 >= r6) goto L64
            r8 = r2[r7]
            byte[] r8 = r8.b
            int r9 = r5 + 1
            r5 = r13[r5]
            r8[r4] = r5
            int r7 = r7 + 1
            r5 = r9
            goto L54
        L64:
            int r4 = r4 + 1
            goto L51
        L67:
            int r14 = r14.h()
            r4 = 24
            if (r14 != r4) goto L71
            r14 = 1
            goto L72
        L71:
            r14 = 0
        L72:
            if (r14 == 0) goto L77
            r4 = 8
            goto L78
        L77:
            r4 = r6
        L78:
            r7 = 0
        L79:
            if (r7 >= r4) goto L89
            r8 = r2[r7]
            byte[] r8 = r8.b
            int r9 = r5 + 1
            r5 = r13[r5]
            r8[r0] = r5
            int r7 = r7 + 1
            r5 = r9
            goto L79
        L89:
            r0 = r2[r3]
            byte[] r0 = r0.b
            int r0 = r0.length
        L8e:
            if (r1 >= r0) goto Lb4
            r4 = 0
        L91:
            if (r4 >= r6) goto Lb1
            if (r14 == 0) goto L99
            int r7 = r4 + 8
            int r7 = r7 % r6
            goto L9a
        L99:
            r7 = r4
        L9a:
            if (r14 == 0) goto La2
            r8 = 7
            if (r7 <= r8) goto La2
            int r8 = r1 + (-1)
            goto La3
        La2:
            r8 = r1
        La3:
            r7 = r2[r7]
            byte[] r7 = r7.b
            int r9 = r5 + 1
            r5 = r13[r5]
            r7[r8] = r5
            int r4 = r4 + 1
            r5 = r9
            goto L91
        Lb1:
            int r1 = r1 + 1
            goto L8e
        Lb4:
            int r13 = r13.length
            if (r5 != r13) goto Lb8
            return r2
        Lb8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
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

package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a8 {
    private static final int[] e = null;
    private static final com.huawei.hms.scankit.p.a8[] f = null;
    private final int a;
    private final int[] b;
    private final com.huawei.hms.scankit.p.a8.b[] c;
    private final int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private final int a;
        private final int b;

        a(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public int a() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public int b() {
                r1 = this;
                int r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private final int a;
        private final com.huawei.hms.scankit.p.a8.a[] b;

        b(int r1, com.huawei.hms.scankit.p.a8.a... r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public com.huawei.hms.scankit.p.a8.a[] a() {
                r1 = this;
                com.huawei.hms.scankit.p.a8$a[] r0 = r1.b
                return r0
        }

        public int b() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    static {
            r0 = 34
            int[] r0 = new int[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017} // fill-array
            com.huawei.hms.scankit.p.a8.e = r0
            com.huawei.hms.scankit.p.a8[] r0 = b()
            com.huawei.hms.scankit.p.a8.f = r0
            return
    }

    private a8(int r5, int[] r6, com.huawei.hms.scankit.p.a8.b... r7) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            r4.b = r6
            r4.c = r7
            r5 = 0
            r6 = r7[r5]
            int r6 = r6.b()
            r7 = r7[r5]
            com.huawei.hms.scankit.p.a8$a[] r7 = r7.a()
            int r0 = r7.length
            r1 = 0
        L18:
            if (r5 >= r0) goto L2b
            r2 = r7[r5]
            int r3 = r2.a()
            int r2 = r2.b()
            int r2 = r2 + r6
            int r3 = r3 * r2
            int r1 = r1 + r3
            int r5 = r5 + 1
            goto L18
        L2b:
            r4.d = r1
            return
    }

    static com.huawei.hms.scankit.p.a8 a(int r5) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
        L5:
            int[] r3 = com.huawei.hms.scankit.p.a8.e
            int r4 = r3.length
            if (r1 >= r4) goto L22
            r3 = r3[r1]
            if (r3 != r5) goto L15
            int r1 = r1 + 7
            com.huawei.hms.scankit.p.a8 r5 = b(r1)
            return r5
        L15:
            int r3 = com.huawei.hms.scankit.p.m3.c(r5, r3)
            if (r3 >= r0) goto L1f
            int r0 = r1 + 7
            r2 = r0
            r0 = r3
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            r5 = 3
            if (r0 > r5) goto L2a
            com.huawei.hms.scankit.p.a8 r5 = b(r2)
            return r5
        L2a:
            r5 = 0
            return r5
    }

    private static <T> T[] a(T[] r6, T[]... r7) {
            int r0 = r6.length
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L4:
            if (r3 >= r1) goto Ld
            r4 = r7[r3]
            int r4 = r4.length
            int r0 = r0 + r4
            int r3 = r3 + 1
            goto L4
        Ld:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r0)
            int r6 = r6.length
            int r1 = r7.length
            r3 = 0
        L14:
            if (r3 >= r1) goto L21
            r4 = r7[r3]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r6, r5)
            int r4 = r4.length
            int r6 = r6 + r4
            int r3 = r3 + 1
            goto L14
        L21:
            return r0
    }

    public static com.huawei.hms.scankit.p.a8 b(int r2) {
            r0 = 1
            if (r2 < r0) goto Ld
            r1 = 40
            if (r2 > r1) goto Ld
            com.huawei.hms.scankit.p.a8[] r1 = com.huawei.hms.scankit.p.a8.f
            int r2 = r2 - r0
            r2 = r1[r2]
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    private static com.huawei.hms.scankit.p.a8[] b() {
            com.huawei.hms.scankit.p.a8[] r0 = c()
            com.huawei.hms.scankit.p.a8[] r1 = d()
            com.huawei.hms.scankit.p.a8[] r2 = e()
            com.huawei.hms.scankit.p.a8[] r3 = f()
            com.huawei.hms.scankit.p.a8[] r4 = g()
            com.huawei.hms.scankit.p.a8[] r5 = h()
            com.huawei.hms.scankit.p.a8[] r6 = i()
            com.huawei.hms.scankit.p.a8[] r7 = j()
            r8 = 7
            com.huawei.hms.scankit.p.a8[][] r8 = new com.huawei.hms.scankit.p.a8[r8][]
            r9 = 0
            r8[r9] = r1
            r1 = 1
            r8[r1] = r2
            r1 = 2
            r8[r1] = r3
            r1 = 3
            r8[r1] = r4
            r1 = 4
            r8[r1] = r5
            r1 = 5
            r8[r1] = r6
            r1 = 6
            r8[r1] = r7
            java.lang.Object[] r0 = a(r0, r8)
            com.huawei.hms.scankit.p.a8[] r0 = (com.huawei.hms.scankit.p.a8[]) r0
            return r0
    }

    private static com.huawei.hms.scankit.p.a8[] c() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 0
            int[] r2 = new int[r1]
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r5 = 1
            r6 = 19
            r4.<init>(r5, r6)
            com.huawei.hms.scankit.p.a8$a[] r7 = new com.huawei.hms.scankit.p.a8.a[r5]
            r7[r1] = r4
            r4 = 7
            r3.<init>(r4, r7)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r9 = 16
            r8.<init>(r5, r9)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r5]
            r10[r1] = r8
            r8 = 10
            r7.<init>(r8, r10)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 13
            r11.<init>(r5, r12)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r5]
            r13[r1] = r11
            r10.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 9
            r13.<init>(r5, r14)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r5]
            r15[r1] = r13
            r13 = 17
            r11.<init>(r13, r15)
            r15 = 4
            r16 = 0
            com.huawei.hms.scankit.p.a8$b[] r1 = new com.huawei.hms.scankit.p.a8.b[r15]
            r1[r16] = r3
            r1[r5] = r7
            r3 = 2
            r1[r3] = r10
            r7 = 3
            r1[r7] = r11
            r0.<init>(r5, r2, r1)
            com.huawei.hms.scankit.p.a8 r1 = new com.huawei.hms.scankit.p.a8
            r2 = 6
            r10 = 18
            int[] r11 = new int[]{r2, r10}
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r14 = 34
            r6.<init>(r5, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r5]
            r14[r16] = r6
            r4.<init>(r8, r14)
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r14 = 28
            r8.<init>(r5, r14)
            r19 = 3
            com.huawei.hms.scankit.p.a8$a[] r7 = new com.huawei.hms.scankit.p.a8.a[r5]
            r7[r16] = r8
            r6.<init>(r9, r7)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r12 = 22
            r8.<init>(r5, r12)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r5]
            r10[r16] = r8
            r7.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r10.<init>(r5, r9)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r5]
            r9[r16] = r10
            r8.<init>(r14, r9)
            com.huawei.hms.scankit.p.a8$b[] r9 = new com.huawei.hms.scankit.p.a8.b[r15]
            r9[r16] = r4
            r9[r5] = r6
            r9[r3] = r7
            r9[r19] = r8
            r1.<init>(r3, r11, r9)
            com.huawei.hms.scankit.p.a8 r4 = new com.huawei.hms.scankit.p.a8
            int[] r6 = new int[]{r2, r12}
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r9 = 55
            r8.<init>(r5, r9)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r5]
            r9[r16] = r8
            r8 = 15
            r7.<init>(r8, r9)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 44
            r10.<init>(r5, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r5]
            r11[r16] = r10
            r10 = 26
            r9.<init>(r10, r11)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r14.<init>(r3, r13)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r5]
            r13[r16] = r14
            r14 = 18
            r11.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$b r13 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r8 = 13
            r14.<init>(r3, r8)
            com.huawei.hms.scankit.p.a8$a[] r8 = new com.huawei.hms.scankit.p.a8.a[r5]
            r8[r16] = r14
            r13.<init>(r12, r8)
            com.huawei.hms.scankit.p.a8$b[] r8 = new com.huawei.hms.scankit.p.a8.b[r15]
            r8[r16] = r7
            r8[r5] = r9
            r8[r3] = r11
            r8[r19] = r13
            r7 = 3
            r4.<init>(r7, r6, r8)
            com.huawei.hms.scankit.p.a8 r6 = new com.huawei.hms.scankit.p.a8
            int[] r7 = new int[]{r2, r10}
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r11 = 80
            r9.<init>(r5, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r5]
            r11[r16] = r9
            r9 = 20
            r8.<init>(r9, r11)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 32
            r13.<init>(r3, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r5]
            r14[r16] = r13
            r13 = 18
            r11.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$b r13 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r9 = 24
            r14.<init>(r3, r9)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r5]
            r12[r16] = r14
            r13.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$b r12 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r9 = 9
            r14.<init>(r15, r9)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r5]
            r9[r16] = r14
            r14 = 16
            r12.<init>(r14, r9)
            com.huawei.hms.scankit.p.a8$b[] r9 = new com.huawei.hms.scankit.p.a8.b[r15]
            r9[r16] = r8
            r9[r5] = r11
            r9[r3] = r13
            r19 = 3
            r9[r19] = r12
            r6.<init>(r15, r7, r9)
            com.huawei.hms.scankit.p.a8 r7 = new com.huawei.hms.scankit.p.a8
            r8 = 30
            int[] r8 = new int[]{r2, r8}
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 108(0x6c, float:1.51E-43)
            r11.<init>(r5, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r5]
            r12[r16] = r11
            r9.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 43
            r12.<init>(r3, r13)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r5]
            r13[r16] = r12
            r12 = 24
            r11.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$b r12 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 15
            r13.<init>(r3, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r10 = 16
            r14.<init>(r3, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r3]
            r10[r16] = r13
            r10[r5] = r14
            r13 = 18
            r12.<init>(r13, r10)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 11
            r13.<init>(r3, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r21 = 1
            r5 = 12
            r14.<init>(r3, r5)
            com.huawei.hms.scankit.p.a8$a[] r5 = new com.huawei.hms.scankit.p.a8.a[r3]
            r5[r16] = r13
            r5[r21] = r14
            r13 = 22
            r10.<init>(r13, r5)
            com.huawei.hms.scankit.p.a8$b[] r5 = new com.huawei.hms.scankit.p.a8.b[r15]
            r5[r16] = r9
            r5[r21] = r11
            r5[r3] = r12
            r19 = 3
            r5[r19] = r10
            r9 = 5
            r7.<init>(r9, r8, r5)
            com.huawei.hms.scankit.p.a8 r5 = new com.huawei.hms.scankit.p.a8
            r8 = 34
            int[] r8 = new int[]{r2, r8}
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 68
            r11.<init>(r3, r12)
            r12 = 1
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r12]
            r13[r16] = r11
            r14 = 18
            r10.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 27
            r13.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r12]
            r14[r16] = r13
            r13 = 16
            r11.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$b r13 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r9 = 19
            r18 = 5
            r14.<init>(r15, r9)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r12]
            r9[r16] = r14
            r14 = 24
            r13.<init>(r14, r9)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r3 = 15
            r17 = 2
            r14.<init>(r15, r3)
            com.huawei.hms.scankit.p.a8$a[] r3 = new com.huawei.hms.scankit.p.a8.a[r12]
            r3[r16] = r14
            r14 = 28
            r9.<init>(r14, r3)
            com.huawei.hms.scankit.p.a8$b[] r3 = new com.huawei.hms.scankit.p.a8.b[r15]
            r3[r16] = r10
            r3[r12] = r11
            r3[r17] = r13
            r19 = 3
            r3[r19] = r9
            r5.<init>(r2, r8, r3)
            com.huawei.hms.scankit.p.a8 r3 = new com.huawei.hms.scankit.p.a8
            r8 = 38
            r13 = 22
            int[] r8 = new int[]{r2, r13, r8}
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 78
            r13 = 2
            r10.<init>(r13, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r12]
            r11[r16] = r10
            r10 = 20
            r9.<init>(r10, r11)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r13 = 31
            r11.<init>(r15, r13)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r12]
            r13[r16] = r11
            r14 = 18
            r10.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r20 = 6
            r2 = 14
            r12 = 2
            r21 = 1
            r13.<init>(r12, r2)
            com.huawei.hms.scankit.p.a8$a r2 = new com.huawei.hms.scankit.p.a8$a
            r14 = 15
            r2.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r12]
            r14[r16] = r13
            r14[r21] = r2
            r13 = 18
            r11.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 13
            r13.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r17 = r0
            r15 = 1
            r0 = 14
            r14.<init>(r15, r0)
            com.huawei.hms.scankit.p.a8$a[] r0 = new com.huawei.hms.scankit.p.a8.a[r12]
            r0[r16] = r13
            r0[r15] = r14
            r13 = 26
            r2.<init>(r13, r0)
            r0 = 4
            com.huawei.hms.scankit.p.a8$b[] r13 = new com.huawei.hms.scankit.p.a8.b[r0]
            r13[r16] = r9
            r13[r15] = r10
            r13[r12] = r11
            r19 = 3
            r13[r19] = r2
            r2 = 7
            r3.<init>(r2, r8, r13)
            com.huawei.hms.scankit.p.a8[] r2 = new com.huawei.hms.scankit.p.a8[r2]
            r2[r16] = r17
            r2[r15] = r1
            r2[r12] = r4
            r2[r19] = r6
            r2[r0] = r7
            r2[r18] = r5
            r2[r20] = r3
            return r2
    }

    private static com.huawei.hms.scankit.p.a8[] d() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 42
            r2 = 6
            r3 = 24
            int[] r1 = new int[]{r2, r3, r1}
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r5 = new com.huawei.hms.scankit.p.a8$a
            r6 = 97
            r7 = 2
            r5.<init>(r7, r6)
            r6 = 1
            com.huawei.hms.scankit.p.a8$a[] r8 = new com.huawei.hms.scankit.p.a8.a[r6]
            r9 = 0
            r8[r9] = r5
            r4.<init>(r3, r8)
            com.huawei.hms.scankit.p.a8$b r5 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r10 = 38
            r8.<init>(r7, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 39
            r10.<init>(r7, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r7]
            r11[r9] = r8
            r11[r6] = r10
            r8 = 22
            r5.<init>(r8, r11)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 4
            r13 = 18
            r11.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 19
            r14.<init>(r7, r15)
            r16 = 0
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r7]
            r9[r16] = r11
            r9[r6] = r14
            r10.<init>(r8, r9)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r14 = 14
            r11.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 15
            r14.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r7]
            r15[r16] = r11
            r15[r6] = r14
            r11 = 26
            r9.<init>(r11, r15)
            com.huawei.hms.scankit.p.a8$b[] r14 = new com.huawei.hms.scankit.p.a8.b[r12]
            r14[r16] = r4
            r14[r6] = r5
            r14[r7] = r10
            r4 = 3
            r14[r4] = r9
            r5 = 8
            r0.<init>(r5, r1, r14)
            com.huawei.hms.scankit.p.a8 r1 = new com.huawei.hms.scankit.p.a8
            r9 = 46
            int[] r9 = new int[]{r2, r11, r9}
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 116(0x74, float:1.63E-43)
            r14.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r6]
            r15[r16] = r14
            r14 = 30
            r10.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$b r15 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r5 = new com.huawei.hms.scankit.p.a8$a
            r14 = 36
            r5.<init>(r4, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r18 = 3
            r4 = 37
            r14.<init>(r7, r4)
            com.huawei.hms.scankit.p.a8$a[] r4 = new com.huawei.hms.scankit.p.a8.a[r7]
            r4[r16] = r5
            r4[r6] = r14
            r15.<init>(r8, r4)
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r5 = new com.huawei.hms.scankit.p.a8$a
            r14 = 16
            r5.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r14 = 17
            r8.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r7]
            r14[r16] = r5
            r14[r6] = r8
            r5 = 20
            r4.<init>(r5, r14)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r5 = 12
            r14.<init>(r12, r5)
            com.huawei.hms.scankit.p.a8$a r5 = new com.huawei.hms.scankit.p.a8$a
            r11 = 13
            r5.<init>(r12, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r7]
            r11[r16] = r14
            r11[r6] = r5
            r8.<init>(r3, r11)
            com.huawei.hms.scankit.p.a8$b[] r5 = new com.huawei.hms.scankit.p.a8.b[r12]
            r5[r16] = r10
            r5[r6] = r15
            r5[r7] = r4
            r5[r18] = r8
            r4 = 9
            r1.<init>(r4, r9, r5)
            com.huawei.hms.scankit.p.a8 r4 = new com.huawei.hms.scankit.p.a8
            r5 = 28
            r8 = 50
            int[] r9 = new int[]{r2, r5, r8}
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r14 = 68
            r11.<init>(r7, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 69
            r14.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r7]
            r15[r16] = r11
            r15[r6] = r14
            r10.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 43
            r13.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 44
            r14.<init>(r6, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r7]
            r15[r16] = r13
            r15[r6] = r14
            r13 = 26
            r11.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$b r13 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 19
            r14.<init>(r2, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r8 = 20
            r15.<init>(r7, r8)
            com.huawei.hms.scankit.p.a8$a[] r8 = new com.huawei.hms.scankit.p.a8.a[r7]
            r8[r16] = r14
            r8[r6] = r15
            r13.<init>(r3, r8)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 15
            r14.<init>(r2, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r3 = 16
            r15.<init>(r7, r3)
            com.huawei.hms.scankit.p.a8$a[] r3 = new com.huawei.hms.scankit.p.a8.a[r7]
            r3[r16] = r14
            r3[r6] = r15
            r8.<init>(r5, r3)
            com.huawei.hms.scankit.p.a8$b[] r3 = new com.huawei.hms.scankit.p.a8.b[r12]
            r3[r16] = r10
            r3[r6] = r11
            r3[r7] = r13
            r3[r18] = r8
            r8 = 10
            r4.<init>(r8, r9, r3)
            com.huawei.hms.scankit.p.a8 r3 = new com.huawei.hms.scankit.p.a8
            r8 = 54
            r9 = 30
            int[] r8 = new int[]{r2, r9, r8}
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 81
            r10.<init>(r12, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r6]
            r11[r16] = r10
            r10 = 20
            r9.<init>(r10, r11)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r13 = 50
            r11.<init>(r6, r13)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 51
            r13.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r7]
            r14[r16] = r11
            r14[r6] = r13
            r11 = 30
            r10.<init>(r11, r14)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 22
            r13.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 23
            r14.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r7]
            r15[r16] = r13
            r15[r6] = r14
            r11.<init>(r5, r15)
            com.huawei.hms.scankit.p.a8$b r13 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r6 = 12
            r15 = 3
            r17 = 1
            r14.<init>(r15, r6)
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r5 = 13
            r15 = 8
            r18 = 3
            r6.<init>(r15, r5)
            com.huawei.hms.scankit.p.a8$a[] r5 = new com.huawei.hms.scankit.p.a8.a[r7]
            r5[r16] = r14
            r5[r17] = r6
            r6 = 24
            r13.<init>(r6, r5)
            com.huawei.hms.scankit.p.a8$b[] r5 = new com.huawei.hms.scankit.p.a8.b[r12]
            r5[r16] = r9
            r5[r17] = r10
            r5[r7] = r11
            r5[r18] = r13
            r6 = 11
            r3.<init>(r6, r8, r5)
            com.huawei.hms.scankit.p.a8 r5 = new com.huawei.hms.scankit.p.a8
            r6 = 32
            r8 = 58
            int[] r6 = new int[]{r2, r6, r8}
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 92
            r9.<init>(r7, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 93
            r10.<init>(r7, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r7]
            r11[r16] = r9
            r11[r17] = r10
            r9 = 24
            r8.<init>(r9, r11)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 36
            r10.<init>(r2, r11)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r13 = 37
            r11.<init>(r7, r13)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r7]
            r13[r16] = r10
            r13[r17] = r11
            r14 = 22
            r9.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r13 = 20
            r11.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 21
            r13.<init>(r2, r14)
            com.huawei.hms.scankit.p.a8$a[] r2 = new com.huawei.hms.scankit.p.a8.a[r7]
            r2[r16] = r11
            r2[r17] = r13
            r13 = 26
            r10.<init>(r13, r2)
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r13 = 7
            r14 = 14
            r11.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r15 = 15
            r13.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r7]
            r14[r16] = r11
            r14[r17] = r13
            r11 = 28
            r2.<init>(r11, r14)
            com.huawei.hms.scankit.p.a8$b[] r11 = new com.huawei.hms.scankit.p.a8.b[r12]
            r11[r16] = r8
            r11[r17] = r9
            r11[r7] = r10
            r18 = 3
            r11[r18] = r2
            r2 = 12
            r5.<init>(r2, r6, r11)
            r2 = 5
            com.huawei.hms.scankit.p.a8[] r2 = new com.huawei.hms.scankit.p.a8[r2]
            r2[r16] = r0
            r2[r17] = r1
            r2[r7] = r4
            r2[r18] = r3
            r2[r12] = r5
            return r2
    }

    private static com.huawei.hms.scankit.p.a8[] e() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 34
            r2 = 62
            r3 = 6
            int[] r1 = new int[]{r3, r1, r2}
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r5 = 4
            r6 = 107(0x6b, float:1.5E-43)
            r4.<init>(r5, r6)
            r7 = 1
            com.huawei.hms.scankit.p.a8$a[] r8 = new com.huawei.hms.scankit.p.a8.a[r7]
            r9 = 0
            r8[r9] = r4
            r4 = 26
            r2.<init>(r4, r8)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 37
            r12 = 8
            r10.<init>(r12, r11)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r13 = 38
            r11.<init>(r7, r13)
            r13 = 2
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r13]
            r14[r9] = r10
            r14[r7] = r11
            r10 = 22
            r8.<init>(r10, r14)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 20
            r14.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r16 = 0
            r9 = 21
            r12.<init>(r5, r9)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r13]
            r9[r16] = r14
            r9[r7] = r12
            r12 = 24
            r11.<init>(r12, r9)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r6 = 12
            r15 = 11
            r14.<init>(r6, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r15.<init>(r5, r6)
            com.huawei.hms.scankit.p.a8$a[] r6 = new com.huawei.hms.scankit.p.a8.a[r13]
            r6[r16] = r14
            r6[r7] = r15
            r9.<init>(r10, r6)
            com.huawei.hms.scankit.p.a8$b[] r6 = new com.huawei.hms.scankit.p.a8.b[r5]
            r6[r16] = r2
            r6[r7] = r8
            r6[r13] = r11
            r2 = 3
            r6[r2] = r9
            r8 = 13
            r0.<init>(r8, r1, r6)
            com.huawei.hms.scankit.p.a8 r1 = new com.huawei.hms.scankit.p.a8
            r6 = 66
            r9 = 46
            int[] r6 = new int[]{r3, r4, r9, r6}
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 115(0x73, float:1.61E-43)
            r14.<init>(r2, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r17 = 3
            r2 = 116(0x74, float:1.63E-43)
            r15.<init>(r7, r2)
            com.huawei.hms.scankit.p.a8$a[] r2 = new com.huawei.hms.scankit.p.a8.a[r13]
            r2[r16] = r14
            r2[r7] = r15
            r14 = 30
            r11.<init>(r14, r2)
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r9 = 40
            r15.<init>(r5, r9)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r14 = 5
            r10 = 41
            r9.<init>(r14, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r13]
            r10[r16] = r15
            r10[r7] = r9
            r2.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r15 = 16
            r7 = 11
            r18 = 1
            r10.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r3 = 17
            r15.<init>(r14, r3)
            com.huawei.hms.scankit.p.a8$a[] r3 = new com.huawei.hms.scankit.p.a8.a[r13]
            r3[r16] = r10
            r3[r18] = r15
            r10 = 20
            r9.<init>(r10, r3)
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r15 = 12
            r10.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r7.<init>(r14, r8)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r13]
            r15[r16] = r10
            r15[r18] = r7
            r3.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$b[] r7 = new com.huawei.hms.scankit.p.a8.b[r5]
            r7[r16] = r11
            r7[r18] = r2
            r7[r13] = r9
            r7[r17] = r3
            r2 = 14
            r1.<init>(r2, r6, r7)
            com.huawei.hms.scankit.p.a8 r3 = new com.huawei.hms.scankit.p.a8
            r6 = 48
            r7 = 70
            r9 = 6
            int[] r6 = new int[]{r9, r4, r6, r7}
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 87
            r9.<init>(r14, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 88
            r15 = 1
            r10.<init>(r15, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r13]
            r11[r16] = r9
            r11[r15] = r10
            r9 = 22
            r7.<init>(r9, r11)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 41
            r10.<init>(r14, r11)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r18 = 1
            r15 = 42
            r11.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r13]
            r15[r16] = r10
            r15[r18] = r11
            r9.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r11.<init>(r14, r12)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r2 = 25
            r14 = 7
            r15.<init>(r14, r2)
            com.huawei.hms.scankit.p.a8$a[] r2 = new com.huawei.hms.scankit.p.a8.a[r13]
            r2[r16] = r11
            r2[r18] = r15
            r11 = 30
            r10.<init>(r11, r2)
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r4 = 11
            r15 = 12
            r11.<init>(r4, r15)
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r4.<init>(r14, r8)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r13]
            r15[r16] = r11
            r15[r18] = r4
            r2.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$b[] r4 = new com.huawei.hms.scankit.p.a8.b[r5]
            r4[r16] = r7
            r4[r18] = r9
            r4[r13] = r10
            r4[r17] = r2
            r2 = 15
            r3.<init>(r2, r6, r4)
            com.huawei.hms.scankit.p.a8 r4 = new com.huawei.hms.scankit.p.a8
            r6 = 50
            r7 = 74
            r9 = 6
            r10 = 26
            int[] r6 = new int[]{r9, r10, r6, r7}
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 98
            r11 = 5
            r9.<init>(r11, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 99
            r15 = 1
            r10.<init>(r15, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r13]
            r11[r16] = r9
            r11[r15] = r10
            r7.<init>(r12, r11)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 45
            r10.<init>(r14, r11)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r14 = 3
            r15 = 46
            r18 = 1
            r11.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r13]
            r14[r16] = r10
            r14[r18] = r11
            r10 = 28
            r9.<init>(r10, r14)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 19
            r14.<init>(r2, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r10 = 20
            r15.<init>(r13, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r13]
            r10[r16] = r14
            r10[r18] = r15
            r11.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 3
            r12.<init>(r14, r2)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r14 = 16
            r17 = 3
            r15.<init>(r8, r14)
            com.huawei.hms.scankit.p.a8$a[] r8 = new com.huawei.hms.scankit.p.a8.a[r13]
            r8[r16] = r12
            r8[r18] = r15
            r12 = 30
            r10.<init>(r12, r8)
            com.huawei.hms.scankit.p.a8$b[] r8 = new com.huawei.hms.scankit.p.a8.b[r5]
            r8[r16] = r7
            r8[r18] = r9
            r8[r13] = r11
            r8[r17] = r10
            r4.<init>(r14, r6, r8)
            com.huawei.hms.scankit.p.a8 r6 = new com.huawei.hms.scankit.p.a8
            r7 = 54
            r8 = 78
            r9 = 6
            int[] r7 = new int[]{r9, r12, r7, r8}
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 107(0x6b, float:1.5E-43)
            r15 = 1
            r9.<init>(r15, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 108(0x6c, float:1.51E-43)
            r12 = 5
            r10.<init>(r12, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r13]
            r11[r16] = r9
            r11[r15] = r10
            r9 = 28
            r8.<init>(r9, r11)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 10
            r14 = 46
            r11.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 47
            r12.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r13]
            r14[r16] = r11
            r14[r15] = r12
            r10.<init>(r9, r14)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 22
            r12.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r18 = 1
            r15 = 23
            r14.<init>(r2, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r13]
            r15[r16] = r12
            r15[r18] = r14
            r11.<init>(r9, r15)
            com.huawei.hms.scankit.p.a8$b r12 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 14
            r14.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r5 = 17
            r15.<init>(r5, r2)
            com.huawei.hms.scankit.p.a8$a[] r2 = new com.huawei.hms.scankit.p.a8.a[r13]
            r2[r16] = r14
            r2[r18] = r15
            r12.<init>(r9, r2)
            r2 = 4
            com.huawei.hms.scankit.p.a8$b[] r9 = new com.huawei.hms.scankit.p.a8.b[r2]
            r9[r16] = r8
            r9[r18] = r10
            r9[r13] = r11
            r17 = 3
            r9[r17] = r12
            r6.<init>(r5, r7, r9)
            r11 = 5
            com.huawei.hms.scankit.p.a8[] r5 = new com.huawei.hms.scankit.p.a8[r11]
            r5[r16] = r0
            r5[r18] = r1
            r5[r13] = r3
            r5[r17] = r4
            r5[r2] = r6
            return r5
    }

    private static com.huawei.hms.scankit.p.a8[] f() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 56
            r2 = 82
            r3 = 6
            r4 = 30
            int[] r1 = new int[]{r3, r4, r1, r2}
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r5 = new com.huawei.hms.scankit.p.a8$a
            r6 = 120(0x78, float:1.68E-43)
            r7 = 5
            r5.<init>(r7, r6)
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r8 = 121(0x79, float:1.7E-43)
            r9 = 1
            r6.<init>(r9, r8)
            r8 = 2
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r8]
            r11 = 0
            r10[r11] = r5
            r10[r9] = r6
            r2.<init>(r4, r10)
            com.huawei.hms.scankit.p.a8$b r5 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r10 = 43
            r12 = 9
            r6.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r13 = 4
            r14 = 44
            r10.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r8]
            r15[r11] = r6
            r15[r9] = r10
            r6 = 26
            r5.<init>(r6, r15)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r16 = 0
            r11 = 17
            r7 = 22
            r15.<init>(r11, r7)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r7 = 23
            r12.<init>(r9, r7)
            com.huawei.hms.scankit.p.a8$a[] r7 = new com.huawei.hms.scankit.p.a8.a[r8]
            r7[r16] = r15
            r7[r9] = r12
            r12 = 28
            r10.<init>(r12, r7)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r17 = 1
            r9 = 14
            r15.<init>(r8, r9)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r11 = 19
            r6 = 15
            r9.<init>(r11, r6)
            com.huawei.hms.scankit.p.a8$a[] r6 = new com.huawei.hms.scankit.p.a8.a[r8]
            r6[r16] = r15
            r6[r17] = r9
            r7.<init>(r12, r6)
            com.huawei.hms.scankit.p.a8$b[] r6 = new com.huawei.hms.scankit.p.a8.b[r13]
            r6[r16] = r2
            r6[r17] = r5
            r6[r8] = r10
            r2 = 3
            r6[r2] = r7
            r5 = 18
            r0.<init>(r5, r1, r6)
            com.huawei.hms.scankit.p.a8 r1 = new com.huawei.hms.scankit.p.a8
            r5 = 58
            r6 = 86
            int[] r5 = new int[]{r3, r4, r5, r6}
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r9 = 113(0x71, float:1.58E-43)
            r7.<init>(r2, r9)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 114(0x72, float:1.6E-43)
            r9.<init>(r13, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r8]
            r10[r16] = r7
            r10[r17] = r9
            r6.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r9.<init>(r2, r14)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r14 = 11
            r15 = 45
            r10.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r8]
            r14[r16] = r9
            r14[r17] = r10
            r9 = 26
            r7.<init>(r9, r14)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 21
            r4 = 17
            r14.<init>(r4, r15)
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r15 = 22
            r4.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r8]
            r15[r16] = r14
            r15[r17] = r4
            r10.<init>(r9, r15)
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 13
            r12 = 9
            r14.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r15 = 16
            r2 = 14
            r18 = 3
            r12.<init>(r15, r2)
            com.huawei.hms.scankit.p.a8$a[] r2 = new com.huawei.hms.scankit.p.a8.a[r8]
            r2[r16] = r14
            r2[r17] = r12
            r4.<init>(r9, r2)
            com.huawei.hms.scankit.p.a8$b[] r2 = new com.huawei.hms.scankit.p.a8.b[r13]
            r2[r16] = r6
            r2[r17] = r7
            r2[r8] = r10
            r2[r18] = r4
            r1.<init>(r11, r5, r2)
            com.huawei.hms.scankit.p.a8 r2 = new com.huawei.hms.scankit.p.a8
            r4 = 62
            r5 = 90
            r6 = 34
            int[] r4 = new int[]{r3, r6, r4, r5}
            com.huawei.hms.scankit.p.a8$b r5 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r9 = 107(0x6b, float:1.5E-43)
            r10 = 3
            r7.<init>(r10, r9)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r12 = 108(0x6c, float:1.51E-43)
            r14 = 5
            r9.<init>(r14, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r8]
            r12[r16] = r7
            r12[r17] = r9
            r7 = 28
            r5.<init>(r7, r12)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r12 = 41
            r9.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 42
            r14 = 13
            r10.<init>(r14, r12)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r8]
            r14[r16] = r9
            r14[r17] = r10
            r9 = 26
            r7.<init>(r9, r14)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r14 = 24
            r6 = 15
            r10.<init>(r6, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r11 = 25
            r12 = 5
            r14.<init>(r12, r11)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r8]
            r12[r16] = r10
            r12[r17] = r14
            r10 = 30
            r9.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r12.<init>(r6, r6)
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r14 = 10
            r6.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r8]
            r14[r16] = r12
            r14[r17] = r6
            r6 = 28
            r10.<init>(r6, r14)
            com.huawei.hms.scankit.p.a8$b[] r6 = new com.huawei.hms.scankit.p.a8.b[r13]
            r6[r16] = r5
            r6[r17] = r7
            r6[r8] = r9
            r18 = 3
            r6[r18] = r10
            r5 = 20
            r2.<init>(r5, r4, r6)
            com.huawei.hms.scankit.p.a8 r4 = new com.huawei.hms.scankit.p.a8
            r5 = 72
            r6 = 94
            r7 = 50
            r9 = 28
            int[] r5 = new int[]{r3, r9, r7, r5, r6}
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 116(0x74, float:1.63E-43)
            r10.<init>(r13, r12)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 117(0x75, float:1.64E-43)
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r8]
            r14[r16] = r10
            r14[r17] = r12
            r6.<init>(r9, r14)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 17
            r14 = 42
            r10.<init>(r12, r14)
            r14 = 1
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r14]
            r11[r16] = r10
            r10 = 26
            r9.<init>(r10, r11)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r14 = 22
            r17 = 1
            r11.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r7 = 23
            r14.<init>(r3, r7)
            com.huawei.hms.scankit.p.a8$a[] r7 = new com.huawei.hms.scankit.p.a8.a[r8]
            r7[r16] = r11
            r7[r17] = r14
            r11 = 28
            r10.<init>(r11, r7)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r14 = 19
            r11.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r14.<init>(r3, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r8]
            r12[r16] = r11
            r12[r17] = r14
            r11 = 30
            r7.<init>(r11, r12)
            com.huawei.hms.scankit.p.a8$b[] r11 = new com.huawei.hms.scankit.p.a8.b[r13]
            r11[r16] = r6
            r11[r17] = r9
            r11[r8] = r10
            r18 = 3
            r11[r18] = r7
            r6 = 21
            r4.<init>(r6, r5, r11)
            com.huawei.hms.scankit.p.a8 r5 = new com.huawei.hms.scankit.p.a8
            r6 = 74
            r7 = 98
            r9 = 26
            r10 = 50
            int[] r3 = new int[]{r3, r9, r10, r6, r7}
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r9 = 111(0x6f, float:1.56E-43)
            r7.<init>(r8, r9)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 112(0x70, float:1.57E-43)
            r11 = 7
            r9.<init>(r11, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r8]
            r10[r16] = r7
            r14 = 1
            r10[r14] = r9
            r7 = 28
            r6.<init>(r7, r10)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 46
            r13 = 17
            r10.<init>(r13, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r14]
            r12[r16] = r10
            r9.<init>(r7, r12)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 24
            r10.<init>(r11, r12)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 25
            r11.<init>(r15, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r8]
            r12[r16] = r10
            r12[r14] = r11
            r10 = 30
            r7.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 13
            r13 = 34
            r11.<init>(r13, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r14]
            r12[r16] = r11
            r11 = 24
            r10.<init>(r11, r12)
            r11 = 4
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r11]
            r12[r16] = r6
            r12[r14] = r9
            r12[r8] = r7
            r18 = 3
            r12[r18] = r10
            r15 = 22
            r5.<init>(r15, r3, r12)
            r12 = 5
            com.huawei.hms.scankit.p.a8[] r3 = new com.huawei.hms.scankit.p.a8[r12]
            r3[r16] = r0
            r3[r14] = r1
            r3[r8] = r2
            r3[r18] = r4
            r3[r11] = r5
            return r3
    }

    private static com.huawei.hms.scankit.p.a8[] g() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 78
            r2 = 102(0x66, float:1.43E-43)
            r3 = 6
            r4 = 30
            r5 = 54
            int[] r1 = new int[]{r3, r4, r5, r1, r2}
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r7 = 121(0x79, float:1.7E-43)
            r8 = 4
            r6.<init>(r8, r7)
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r9 = 5
            r10 = 122(0x7a, float:1.71E-43)
            r7.<init>(r9, r10)
            r11 = 2
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r11]
            r13 = 0
            r12[r13] = r6
            r6 = 1
            r12[r6] = r7
            r2.<init>(r4, r12)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 47
            r12.<init>(r8, r14)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r16 = 1
            r6 = 14
            r17 = 0
            r13 = 48
            r15.<init>(r6, r13)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r11]
            r9[r17] = r12
            r9[r16] = r15
            r12 = 28
            r7.<init>(r12, r9)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r10 = 11
            r13 = 24
            r15.<init>(r10, r13)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r10 = 25
            r14.<init>(r6, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r11]
            r10[r17] = r15
            r10[r16] = r14
            r9.<init>(r4, r10)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 16
            r13 = 15
            r14.<init>(r15, r13)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r13.<init>(r6, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r11]
            r15[r17] = r14
            r15[r16] = r13
            r10.<init>(r4, r15)
            com.huawei.hms.scankit.p.a8$b[] r13 = new com.huawei.hms.scankit.p.a8.b[r8]
            r13[r17] = r2
            r13[r16] = r7
            r13[r11] = r9
            r2 = 3
            r13[r2] = r10
            r7 = 23
            r0.<init>(r7, r1, r13)
            com.huawei.hms.scankit.p.a8 r1 = new com.huawei.hms.scankit.p.a8
            r9 = 80
            r10 = 106(0x6a, float:1.49E-43)
            int[] r5 = new int[]{r3, r12, r5, r9, r10}
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 117(0x75, float:1.64E-43)
            r13.<init>(r3, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 118(0x76, float:1.65E-43)
            r14.<init>(r8, r15)
            r19 = 3
            com.huawei.hms.scankit.p.a8$a[] r2 = new com.huawei.hms.scankit.p.a8.a[r11]
            r2[r17] = r13
            r2[r16] = r14
            r9.<init>(r4, r2)
            com.huawei.hms.scankit.p.a8$b r2 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 45
            r13.<init>(r3, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 46
            r14.<init>(r6, r15)
            com.huawei.hms.scankit.p.a8$a[] r6 = new com.huawei.hms.scankit.p.a8.a[r11]
            r6[r17] = r13
            r6[r16] = r14
            r2.<init>(r12, r6)
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r7 = 24
            r14 = 11
            r13.<init>(r14, r7)
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r14 = 25
            r15 = 16
            r7.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r11]
            r14[r17] = r13
            r14[r16] = r7
            r6.<init>(r4, r14)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r13.<init>(r4, r15)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 17
            r14.<init>(r11, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r11]
            r15[r17] = r13
            r15[r16] = r14
            r7.<init>(r4, r15)
            com.huawei.hms.scankit.p.a8$b[] r13 = new com.huawei.hms.scankit.p.a8.b[r8]
            r13[r17] = r9
            r13[r16] = r2
            r13[r11] = r6
            r13[r19] = r7
            r7 = 24
            r1.<init>(r7, r5, r13)
            com.huawei.hms.scankit.p.a8 r2 = new com.huawei.hms.scankit.p.a8
            r5 = 84
            r6 = 110(0x6e, float:1.54E-43)
            r7 = 32
            r9 = 58
            int[] r5 = new int[]{r3, r7, r9, r5, r6}
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r13 = 8
            r7.<init>(r13, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r14 = 107(0x6b, float:1.5E-43)
            r10.<init>(r8, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r11]
            r14[r17] = r7
            r14[r16] = r10
            r7 = 26
            r6.<init>(r7, r14)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 47
            r14.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r13 = 13
            r7 = 48
            r15.<init>(r13, r7)
            com.huawei.hms.scankit.p.a8$a[] r7 = new com.huawei.hms.scankit.p.a8.a[r11]
            r7[r17] = r14
            r7[r16] = r15
            r10.<init>(r12, r7)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 7
            r12 = 24
            r14.<init>(r15, r12)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r15 = 22
            r3 = 25
            r12.<init>(r15, r3)
            com.huawei.hms.scankit.p.a8$a[] r3 = new com.huawei.hms.scankit.p.a8.a[r11]
            r3[r17] = r14
            r3[r16] = r12
            r7.<init>(r4, r3)
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 15
            r12.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 16
            r14.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r11]
            r13[r17] = r12
            r13[r16] = r14
            r3.<init>(r4, r13)
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r8]
            r12[r17] = r6
            r12[r16] = r10
            r12[r11] = r7
            r12[r19] = r3
            r3 = 25
            r2.<init>(r3, r5, r12)
            com.huawei.hms.scankit.p.a8 r3 = new com.huawei.hms.scankit.p.a8
            r5 = 86
            r6 = 114(0x72, float:1.6E-43)
            r7 = 6
            int[] r5 = new int[]{r7, r4, r9, r5, r6}
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 10
            r9.<init>(r10, r6)
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r10 = 115(0x73, float:1.61E-43)
            r6.<init>(r11, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r11]
            r10[r17] = r9
            r10[r16] = r6
            r6 = 28
            r7.<init>(r6, r10)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 19
            r13 = 46
            r10.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r15 = 47
            r12.<init>(r8, r15)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r11]
            r13[r17] = r10
            r13[r16] = r12
            r9.<init>(r6, r13)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 22
            r12.<init>(r6, r13)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 6
            r15 = 23
            r13.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r11]
            r14[r17] = r12
            r14[r16] = r13
            r10.<init>(r6, r14)
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 33
            r15 = 16
            r12.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 17
            r13.<init>(r8, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r11]
            r14[r17] = r12
            r14[r16] = r13
            r6.<init>(r4, r14)
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r8]
            r12[r17] = r7
            r12[r16] = r9
            r12[r11] = r10
            r12[r19] = r6
            r6 = 26
            r3.<init>(r6, r5, r12)
            com.huawei.hms.scankit.p.a8 r5 = new com.huawei.hms.scankit.p.a8
            r6 = 62
            r7 = 90
            r9 = 34
            r10 = 118(0x76, float:1.65E-43)
            r14 = 6
            int[] r6 = new int[]{r14, r9, r6, r7, r10}
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 122(0x7a, float:1.71E-43)
            r12 = 8
            r9.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 123(0x7b, float:1.72E-43)
            r10.<init>(r8, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r11]
            r12[r17] = r9
            r12[r16] = r10
            r7.<init>(r4, r12)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 45
            r13 = 22
            r10.<init>(r13, r12)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 3
            r14 = 46
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r11]
            r13[r17] = r10
            r13[r16] = r12
            r10 = 28
            r9.<init>(r10, r13)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 8
            r15 = 23
            r12.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 24
            r15 = 26
            r13.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r11]
            r14[r17] = r12
            r14[r16] = r13
            r10.<init>(r4, r14)
            com.huawei.hms.scankit.p.a8$b r12 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 12
            r15 = 15
            r13.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r8 = 16
            r15 = 28
            r14.<init>(r15, r8)
            com.huawei.hms.scankit.p.a8$a[] r8 = new com.huawei.hms.scankit.p.a8.a[r11]
            r8[r17] = r13
            r8[r16] = r14
            r12.<init>(r4, r8)
            r4 = 4
            com.huawei.hms.scankit.p.a8$b[] r8 = new com.huawei.hms.scankit.p.a8.b[r4]
            r8[r17] = r7
            r8[r16] = r9
            r8[r11] = r10
            r19 = 3
            r8[r19] = r12
            r4 = 27
            r5.<init>(r4, r6, r8)
            r4 = 5
            com.huawei.hms.scankit.p.a8[] r4 = new com.huawei.hms.scankit.p.a8[r4]
            r4[r17] = r0
            r4[r16] = r1
            r4[r11] = r2
            r4[r19] = r3
            r18 = 4
            r4[r18] = r5
            return r4
    }

    private static com.huawei.hms.scankit.p.a8[] h() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 6
            int[] r2 = new int[r1]
            r2 = {x02b0: FILL_ARRAY_DATA , data: [6, 26, 50, 74, 98, 122} // fill-array
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r5 = 3
            r6 = 117(0x75, float:1.64E-43)
            r4.<init>(r5, r6)
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r8 = 118(0x76, float:1.65E-43)
            r9 = 10
            r7.<init>(r9, r8)
            r8 = 2
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r8]
            r11 = 0
            r10[r11] = r4
            r4 = 1
            r10[r4] = r7
            r7 = 30
            r3.<init>(r7, r10)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 45
            r12.<init>(r5, r13)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 23
            r16 = 0
            r11 = 46
            r14.<init>(r15, r11)
            r17 = 3
            com.huawei.hms.scankit.p.a8$a[] r5 = new com.huawei.hms.scankit.p.a8.a[r8]
            r5[r16] = r12
            r5[r4] = r14
            r12 = 28
            r10.<init>(r12, r5)
            com.huawei.hms.scankit.p.a8$b r5 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r9 = 4
            r19 = 1
            r4 = 24
            r14.<init>(r9, r4)
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r15 = 31
            r11 = 25
            r4.<init>(r15, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r8]
            r11[r16] = r14
            r11[r19] = r4
            r5.<init>(r7, r11)
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r14 = 11
            r13 = 15
            r11.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r13 = 16
            r14.<init>(r15, r13)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r8]
            r15[r16] = r11
            r15[r19] = r14
            r4.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$b[] r11 = new com.huawei.hms.scankit.p.a8.b[r9]
            r11[r16] = r3
            r11[r19] = r10
            r11[r8] = r5
            r11[r17] = r4
            r0.<init>(r12, r2, r11)
            com.huawei.hms.scankit.p.a8 r2 = new com.huawei.hms.scankit.p.a8
            int[] r3 = new int[r1]
            r3 = {x02c0: FILL_ARRAY_DATA , data: [6, 30, 54, 78, 102, 126} // fill-array
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r5 = new com.huawei.hms.scankit.p.a8$a
            r10 = 7
            r11 = 116(0x74, float:1.63E-43)
            r5.<init>(r10, r11)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r14.<init>(r10, r6)
            com.huawei.hms.scankit.p.a8$a[] r6 = new com.huawei.hms.scankit.p.a8.a[r8]
            r6[r16] = r5
            r6[r19] = r14
            r4.<init>(r7, r6)
            com.huawei.hms.scankit.p.a8$b r5 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r14 = 21
            r15 = 45
            r6.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 46
            r14.<init>(r10, r15)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r8]
            r10[r16] = r6
            r10[r19] = r14
            r5.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r14 = 1
            r15 = 23
            r10.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r19 = 1
            r14 = 37
            r12 = 24
            r15.<init>(r14, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r8]
            r12[r16] = r10
            r12[r19] = r15
            r6.<init>(r7, r12)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 19
            r15 = 15
            r12.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r14 = 26
            r15.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r8]
            r14[r16] = r12
            r14[r19] = r15
            r10.<init>(r7, r14)
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r9]
            r12[r16] = r4
            r12[r19] = r5
            r12[r8] = r6
            r12[r17] = r10
            r4 = 29
            r2.<init>(r4, r3, r12)
            com.huawei.hms.scankit.p.a8 r3 = new com.huawei.hms.scankit.p.a8
            int[] r5 = new int[r1]
            r5 = {x02d0: FILL_ARRAY_DATA , data: [6, 26, 52, 78, 104, 130} // fill-array
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 5
            r14 = 115(0x73, float:1.61E-43)
            r10.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r12 = 10
            r15.<init>(r12, r11)
            com.huawei.hms.scankit.p.a8$a[] r4 = new com.huawei.hms.scankit.p.a8.a[r8]
            r4[r16] = r10
            r19 = 1
            r4[r19] = r15
            r6.<init>(r7, r4)
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r15 = 47
            r11 = 19
            r10.<init>(r11, r15)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r15 = 48
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r8]
            r12[r16] = r10
            r12[r19] = r11
            r10 = 28
            r4.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 24
            r15 = 15
            r11.<init>(r15, r12)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 25
            r12.<init>(r14, r14)
            com.huawei.hms.scankit.p.a8$a[] r1 = new com.huawei.hms.scankit.p.a8.a[r8]
            r1[r16] = r11
            r1[r19] = r12
            r10.<init>(r7, r1)
            com.huawei.hms.scankit.p.a8$b r1 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 23
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r12.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r8]
            r14[r16] = r11
            r14[r19] = r12
            r1.<init>(r7, r14)
            com.huawei.hms.scankit.p.a8$b[] r11 = new com.huawei.hms.scankit.p.a8.b[r9]
            r11[r16] = r6
            r11[r19] = r4
            r11[r8] = r10
            r11[r17] = r1
            r3.<init>(r7, r5, r11)
            com.huawei.hms.scankit.p.a8 r1 = new com.huawei.hms.scankit.p.a8
            r4 = 6
            int[] r5 = new int[r4]
            r5 = {x02e0: FILL_ARRAY_DATA , data: [6, 30, 56, 82, 108, 134} // fill-array
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r10 = 13
            r11 = 115(0x73, float:1.61E-43)
            r6.<init>(r10, r11)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 3
            r12 = 116(0x74, float:1.63E-43)
            r10.<init>(r11, r12)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r8]
            r11[r16] = r6
            r14 = 1
            r11[r14] = r10
            r4.<init>(r7, r11)
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r15 = 46
            r10.<init>(r8, r15)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 29
            r15 = 47
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r8]
            r12[r16] = r10
            r12[r14] = r11
            r10 = 28
            r6.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 42
            r15 = 24
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r15 = 25
            r12.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r8]
            r15[r16] = r11
            r15[r14] = r12
            r10.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 15
            r15 = 23
            r19 = 1
            r12.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r15 = 28
            r14.<init>(r15, r13)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r8]
            r15[r16] = r12
            r15[r19] = r14
            r11.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r9]
            r12[r16] = r4
            r12[r19] = r6
            r12[r8] = r10
            r17 = 3
            r12[r17] = r11
            r4 = 31
            r1.<init>(r4, r5, r12)
            com.huawei.hms.scankit.p.a8 r4 = new com.huawei.hms.scankit.p.a8
            r5 = 6
            int[] r5 = new int[r5]
            r5 = {x02f0: FILL_ARRAY_DATA , data: [6, 34, 60, 86, 112, 138} // fill-array
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r11 = 17
            r12 = 115(0x73, float:1.61E-43)
            r10.<init>(r11, r12)
            r14 = 1
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r14]
            r11[r16] = r10
            r6.<init>(r7, r11)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 10
            r15 = 46
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r9 = 47
            r14 = 23
            r19 = 1
            r15.<init>(r14, r9)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r8]
            r9[r16] = r11
            r9[r19] = r15
            r15 = 28
            r10.<init>(r15, r9)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r15 = 24
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 35
            r15 = 25
            r12.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r8]
            r15[r16] = r11
            r15[r19] = r12
            r9.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r7 = 19
            r15 = 15
            r12.<init>(r7, r15)
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r7.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r8]
            r13[r16] = r12
            r13[r19] = r7
            r7 = 30
            r11.<init>(r7, r13)
            r7 = 4
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r7]
            r12[r16] = r6
            r12[r19] = r10
            r12[r8] = r9
            r17 = 3
            r12[r17] = r11
            r6 = 32
            r4.<init>(r6, r5, r12)
            r5 = 5
            com.huawei.hms.scankit.p.a8[] r5 = new com.huawei.hms.scankit.p.a8[r5]
            r5[r16] = r0
            r5[r19] = r2
            r5[r8] = r3
            r5[r17] = r1
            r18 = 4
            r5[r18] = r4
            return r5
    }

    private static com.huawei.hms.scankit.p.a8[] i() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 6
            int[] r2 = new int[r1]
            r2 = {x02c4: FILL_ARRAY_DATA , data: [6, 30, 58, 86, 114, 142} // fill-array
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r5 = 17
            r6 = 115(0x73, float:1.61E-43)
            r4.<init>(r5, r6)
            com.huawei.hms.scankit.p.a8$a r7 = new com.huawei.hms.scankit.p.a8$a
            r8 = 1
            r9 = 116(0x74, float:1.63E-43)
            r7.<init>(r8, r9)
            r10 = 2
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r10]
            r12 = 0
            r11[r12] = r4
            r11[r8] = r7
            r4 = 30
            r3.<init>(r4, r11)
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r13 = 14
            r14 = 46
            r11.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r16 = 0
            r12 = 21
            r5 = 47
            r15.<init>(r12, r5)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r10]
            r12[r16] = r11
            r12[r8] = r15
            r11 = 28
            r7.<init>(r11, r12)
            com.huawei.hms.scankit.p.a8$b r12 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r18 = 1
            r8 = 29
            r11 = 24
            r15.<init>(r8, r11)
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r11 = 19
            r5 = 25
            r8.<init>(r11, r5)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r10]
            r11[r16] = r15
            r11[r18] = r8
            r12.<init>(r4, r11)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r15 = 11
            r5 = 15
            r11.<init>(r15, r5)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r5 = 16
            r15.<init>(r14, r5)
            com.huawei.hms.scankit.p.a8$a[] r5 = new com.huawei.hms.scankit.p.a8.a[r10]
            r5[r16] = r11
            r5[r18] = r15
            r8.<init>(r4, r5)
            r5 = 4
            com.huawei.hms.scankit.p.a8$b[] r11 = new com.huawei.hms.scankit.p.a8.b[r5]
            r11[r16] = r3
            r11[r18] = r7
            r11[r10] = r12
            r3 = 3
            r11[r3] = r8
            r7 = 33
            r0.<init>(r7, r2, r11)
            com.huawei.hms.scankit.p.a8 r2 = new com.huawei.hms.scankit.p.a8
            int[] r7 = new int[r1]
            r7 = {x02d4: FILL_ARRAY_DATA , data: [6, 34, 62, 90, 118, 146} // fill-array
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 13
            r11.<init>(r12, r6)
            com.huawei.hms.scankit.p.a8$a r6 = new com.huawei.hms.scankit.p.a8$a
            r6.<init>(r1, r9)
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r10]
            r9[r16] = r11
            r9[r18] = r6
            r8.<init>(r4, r9)
            com.huawei.hms.scankit.p.a8$b r6 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r9.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 23
            r15 = 47
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r10]
            r12[r16] = r9
            r12[r18] = r11
            r9 = 28
            r6.<init>(r9, r12)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 44
            r15 = 24
            r11.<init>(r12, r15)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r15 = 7
            r3 = 25
            r19 = 3
            r12.<init>(r15, r3)
            com.huawei.hms.scankit.p.a8$a[] r3 = new com.huawei.hms.scankit.p.a8.a[r10]
            r3[r16] = r11
            r3[r18] = r12
            r9.<init>(r4, r3)
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 59
            r14 = 16
            r11.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r1 = 1
            r14 = 17
            r12.<init>(r1, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r10]
            r14[r16] = r11
            r14[r1] = r12
            r3.<init>(r4, r14)
            com.huawei.hms.scankit.p.a8$b[] r11 = new com.huawei.hms.scankit.p.a8.b[r5]
            r11[r16] = r8
            r11[r1] = r6
            r11[r10] = r9
            r11[r19] = r3
            r1 = 34
            r2.<init>(r1, r7, r11)
            com.huawei.hms.scankit.p.a8 r3 = new com.huawei.hms.scankit.p.a8
            int[] r6 = new int[r15]
            r6 = {x02e4: FILL_ARRAY_DATA , data: [6, 30, 54, 78, 102, 126, 150} // fill-array
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r9 = 12
            r11 = 121(0x79, float:1.7E-43)
            r8.<init>(r9, r11)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 122(0x7a, float:1.71E-43)
            r12.<init>(r15, r14)
            com.huawei.hms.scankit.p.a8$a[] r1 = new com.huawei.hms.scankit.p.a8.a[r10]
            r1[r16] = r8
            r18 = 1
            r1[r18] = r12
            r7.<init>(r4, r1)
            com.huawei.hms.scankit.p.a8$b r1 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r12 = 47
            r8.<init>(r9, r12)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r12 = 26
            r14 = 48
            r9.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r10]
            r12[r16] = r8
            r12[r18] = r9
            r9 = 28
            r1.<init>(r9, r12)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r12 = 39
            r14 = 24
            r9.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 25
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r10]
            r14[r16] = r9
            r14[r18] = r12
            r8.<init>(r4, r14)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 22
            r13 = 15
            r12.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 41
            r11 = 16
            r13.<init>(r14, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r10]
            r11[r16] = r12
            r11[r18] = r13
            r9.<init>(r4, r11)
            com.huawei.hms.scankit.p.a8$b[] r11 = new com.huawei.hms.scankit.p.a8.b[r5]
            r11[r16] = r7
            r11[r18] = r1
            r11[r10] = r8
            r11[r19] = r9
            r1 = 35
            r3.<init>(r1, r6, r11)
            com.huawei.hms.scankit.p.a8 r1 = new com.huawei.hms.scankit.p.a8
            int[] r6 = new int[r15]
            r6 = {x02f6: FILL_ARRAY_DATA , data: [6, 24, 50, 76, 102, 128, 154} // fill-array
            com.huawei.hms.scankit.p.a8$b r7 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r9 = 6
            r11 = 121(0x79, float:1.7E-43)
            r8.<init>(r9, r11)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 14
            r13 = 122(0x7a, float:1.71E-43)
            r11.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r10]
            r12[r16] = r8
            r18 = 1
            r12[r18] = r11
            r7.<init>(r4, r12)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 47
            r11.<init>(r9, r12)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r12 = 34
            r13 = 48
            r9.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r10]
            r12[r16] = r11
            r12[r18] = r9
            r9 = 28
            r8.<init>(r9, r12)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 46
            r14 = 24
            r11.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 10
            r14 = 25
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r10]
            r14[r16] = r11
            r14[r18] = r12
            r9.<init>(r4, r14)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r14 = 15
            r12.<init>(r10, r14)
            com.huawei.hms.scankit.p.a8$a r14 = new com.huawei.hms.scankit.p.a8$a
            r13 = 64
            r15 = 16
            r14.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r10]
            r13[r16] = r12
            r13[r18] = r14
            r11.<init>(r4, r13)
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r5]
            r12[r16] = r7
            r12[r18] = r8
            r12[r10] = r9
            r12[r19] = r11
            r7 = 36
            r1.<init>(r7, r6, r12)
            com.huawei.hms.scankit.p.a8 r6 = new com.huawei.hms.scankit.p.a8
            r7 = 7
            int[] r7 = new int[r7]
            r7 = {x0308: FILL_ARRAY_DATA , data: [6, 28, 54, 80, 106, 132, 158} // fill-array
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r13 = 122(0x7a, float:1.71E-43)
            r14 = 17
            r9.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 123(0x7b, float:1.72E-43)
            r11.<init>(r5, r12)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r10]
            r12[r16] = r9
            r18 = 1
            r12[r18] = r11
            r8.<init>(r4, r12)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 46
            r13 = 29
            r11.<init>(r13, r12)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 14
            r15 = 47
            r12.<init>(r13, r15)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r10]
            r13[r16] = r11
            r13[r18] = r12
            r11 = 28
            r9.<init>(r11, r13)
            com.huawei.hms.scankit.p.a8$b r11 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 49
            r14 = 24
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r5 = 10
            r15 = 25
            r13.<init>(r5, r15)
            com.huawei.hms.scankit.p.a8$a[] r5 = new com.huawei.hms.scankit.p.a8.a[r10]
            r5[r16] = r12
            r5[r18] = r13
            r11.<init>(r4, r5)
            com.huawei.hms.scankit.p.a8$b r5 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 15
            r12.<init>(r14, r13)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 46
            r15 = 16
            r13.<init>(r14, r15)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r10]
            r14[r16] = r12
            r14[r18] = r13
            r5.<init>(r4, r14)
            r4 = 4
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r4]
            r12[r16] = r8
            r12[r18] = r9
            r12[r10] = r11
            r12[r19] = r5
            r4 = 37
            r6.<init>(r4, r7, r12)
            r4 = 5
            com.huawei.hms.scankit.p.a8[] r4 = new com.huawei.hms.scankit.p.a8[r4]
            r4[r16] = r0
            r4[r18] = r2
            r4[r10] = r3
            r4[r19] = r1
            r17 = 4
            r4[r17] = r6
            return r4
    }

    private static com.huawei.hms.scankit.p.a8[] j() {
            com.huawei.hms.scankit.p.a8 r0 = new com.huawei.hms.scankit.p.a8
            r1 = 7
            int[] r2 = new int[r1]
            r2 = {x01a8: FILL_ARRAY_DATA , data: [6, 32, 58, 84, 110, 136, 162} // fill-array
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r5 = 122(0x7a, float:1.71E-43)
            r6 = 4
            r4.<init>(r6, r5)
            com.huawei.hms.scankit.p.a8$a r5 = new com.huawei.hms.scankit.p.a8$a
            r7 = 123(0x7b, float:1.72E-43)
            r8 = 18
            r5.<init>(r8, r7)
            r7 = 2
            com.huawei.hms.scankit.p.a8$a[] r9 = new com.huawei.hms.scankit.p.a8.a[r7]
            r10 = 0
            r9[r10] = r4
            r4 = 1
            r9[r4] = r5
            r5 = 30
            r3.<init>(r5, r9)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r11 = new com.huawei.hms.scankit.p.a8$a
            r12 = 13
            r13 = 46
            r11.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 32
            r14 = 47
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a[] r15 = new com.huawei.hms.scankit.p.a8.a[r7]
            r15[r10] = r11
            r15[r4] = r12
            r11 = 28
            r9.<init>(r11, r15)
            com.huawei.hms.scankit.p.a8$b r12 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r16 = 1
            r4 = 48
            r17 = 0
            r10 = 24
            r15.<init>(r4, r10)
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r10 = 14
            r11 = 25
            r8.<init>(r10, r11)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r7]
            r10[r17] = r15
            r10[r16] = r8
            r12.<init>(r5, r10)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r15 = 42
            r11 = 15
            r10.<init>(r15, r11)
            com.huawei.hms.scankit.p.a8$a r15 = new com.huawei.hms.scankit.p.a8$a
            r11 = 16
            r15.<init>(r13, r11)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r7]
            r13[r17] = r10
            r13[r16] = r15
            r8.<init>(r5, r13)
            com.huawei.hms.scankit.p.a8$b[] r10 = new com.huawei.hms.scankit.p.a8.b[r6]
            r10[r17] = r3
            r10[r16] = r9
            r10[r7] = r12
            r3 = 3
            r10[r3] = r8
            r8 = 38
            r0.<init>(r8, r2, r10)
            com.huawei.hms.scankit.p.a8 r2 = new com.huawei.hms.scankit.p.a8
            int[] r8 = new int[r1]
            r8 = {x01ba: FILL_ARRAY_DATA , data: [6, 26, 54, 82, 110, 138, 166} // fill-array
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 117(0x75, float:1.64E-43)
            r13 = 20
            r10.<init>(r13, r12)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r15 = 118(0x76, float:1.65E-43)
            r12.<init>(r6, r15)
            r18 = 3
            com.huawei.hms.scankit.p.a8$a[] r3 = new com.huawei.hms.scankit.p.a8.a[r7]
            r3[r17] = r10
            r3[r16] = r12
            r9.<init>(r5, r3)
            com.huawei.hms.scankit.p.a8$b r3 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 40
            r10.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r12.<init>(r1, r4)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r7]
            r13[r17] = r10
            r13[r16] = r12
            r10 = 28
            r3.<init>(r10, r13)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 43
            r4 = 24
            r12.<init>(r13, r4)
            com.huawei.hms.scankit.p.a8$a r4 = new com.huawei.hms.scankit.p.a8$a
            r13 = 22
            r14 = 25
            r4.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a[] r13 = new com.huawei.hms.scankit.p.a8.a[r7]
            r13[r17] = r12
            r13[r16] = r4
            r10.<init>(r5, r13)
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 10
            r14 = 15
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 67
            r13.<init>(r14, r11)
            com.huawei.hms.scankit.p.a8$a[] r14 = new com.huawei.hms.scankit.p.a8.a[r7]
            r14[r17] = r12
            r14[r16] = r13
            r4.<init>(r5, r14)
            com.huawei.hms.scankit.p.a8$b[] r12 = new com.huawei.hms.scankit.p.a8.b[r6]
            r12[r17] = r9
            r12[r16] = r3
            r12[r7] = r10
            r12[r18] = r4
            r3 = 39
            r2.<init>(r3, r8, r12)
            com.huawei.hms.scankit.p.a8 r3 = new com.huawei.hms.scankit.p.a8
            int[] r1 = new int[r1]
            r1 = {x01cc: FILL_ARRAY_DATA , data: [6, 30, 58, 86, 114, 142, 170} // fill-array
            com.huawei.hms.scankit.p.a8$b r4 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r8 = new com.huawei.hms.scankit.p.a8$a
            r9 = 19
            r8.<init>(r9, r15)
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 119(0x77, float:1.67E-43)
            r12 = 6
            r9.<init>(r12, r10)
            com.huawei.hms.scankit.p.a8$a[] r10 = new com.huawei.hms.scankit.p.a8.a[r7]
            r10[r17] = r8
            r10[r16] = r9
            r4.<init>(r5, r10)
            com.huawei.hms.scankit.p.a8$b r8 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r9 = new com.huawei.hms.scankit.p.a8$a
            r10 = 18
            r12 = 47
            r9.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 31
            r13 = 48
            r10.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r7]
            r12[r17] = r9
            r12[r16] = r10
            r10 = 28
            r8.<init>(r10, r12)
            com.huawei.hms.scankit.p.a8$b r9 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r10 = new com.huawei.hms.scankit.p.a8$a
            r12 = 34
            r13 = 24
            r10.<init>(r12, r13)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 25
            r13.<init>(r12, r14)
            com.huawei.hms.scankit.p.a8$a[] r12 = new com.huawei.hms.scankit.p.a8.a[r7]
            r12[r17] = r10
            r12[r16] = r13
            r9.<init>(r5, r12)
            com.huawei.hms.scankit.p.a8$b r10 = new com.huawei.hms.scankit.p.a8$b
            com.huawei.hms.scankit.p.a8$a r12 = new com.huawei.hms.scankit.p.a8$a
            r13 = 20
            r14 = 15
            r12.<init>(r13, r14)
            com.huawei.hms.scankit.p.a8$a r13 = new com.huawei.hms.scankit.p.a8$a
            r14 = 61
            r13.<init>(r14, r11)
            com.huawei.hms.scankit.p.a8$a[] r11 = new com.huawei.hms.scankit.p.a8.a[r7]
            r11[r17] = r12
            r11[r16] = r13
            r10.<init>(r5, r11)
            com.huawei.hms.scankit.p.a8$b[] r5 = new com.huawei.hms.scankit.p.a8.b[r6]
            r5[r17] = r4
            r5[r16] = r8
            r5[r7] = r9
            r5[r18] = r10
            r4 = 40
            r3.<init>(r4, r1, r5)
            r1 = 3
            com.huawei.hms.scankit.p.a8[] r1 = new com.huawei.hms.scankit.p.a8[r1]
            r1[r17] = r0
            r1[r16] = r2
            r1[r7] = r3
            return r1
    }

    public com.huawei.hms.scankit.p.a8.b a(com.huawei.hms.scankit.p.c3 r2) {
            r1 = this;
            com.huawei.hms.scankit.p.a8$b[] r0 = r1.c
            int r2 = r2.ordinal()
            r2 = r0[r2]
            return r2
    }

    com.huawei.hms.scankit.p.s a() {
            r10 = this;
            int r0 = r10.k()
            com.huawei.hms.scankit.p.s r1 = new com.huawei.hms.scankit.p.s
            r1.<init>(r0)
            r2 = 0
            r3 = 9
            r1.a(r2, r2, r3, r3)
            int r4 = r0 + (-8)
            r5 = 8
            r1.a(r4, r2, r5, r3)
            r1.a(r2, r4, r3, r5)
            int[] r4 = r10.b
            int r4 = r4.length
            r5 = 0
        L1d:
            if (r5 >= r4) goto L46
            int[] r6 = r10.b
            r6 = r6[r5]
            int r6 = r6 + (-2)
            r7 = 0
        L26:
            if (r7 >= r4) goto L43
            if (r5 != 0) goto L30
            if (r7 == 0) goto L40
            int r8 = r4 + (-1)
            if (r7 == r8) goto L40
        L30:
            int r8 = r4 + (-1)
            if (r5 != r8) goto L36
            if (r7 == 0) goto L40
        L36:
            int[] r8 = r10.b
            r8 = r8[r7]
            int r8 = r8 + (-2)
            r9 = 5
            r1.a(r8, r6, r9, r9)
        L40:
            int r7 = r7 + 1
            goto L26
        L43:
            int r5 = r5 + 1
            goto L1d
        L46:
            int r4 = r0 + (-17)
            r5 = 6
            r6 = 1
            r1.a(r5, r3, r6, r4)
            r1.a(r3, r5, r4, r6)
            int r3 = r10.a
            if (r3 <= r5) goto L5d
            int r0 = r0 + (-11)
            r3 = 3
            r1.a(r0, r2, r3, r5)
            r1.a(r2, r0, r5, r3)
        L5d:
            return r1
    }

    public int k() {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 * 4
            int r0 = r0 + 17
            return r0
    }

    public int l() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public int m() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}

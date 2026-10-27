package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class q7 extends com.huawei.hms.scankit.p.g5 {
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[][] f = null;
    public static final int[][] g = null;
    private final java.lang.StringBuilder a;
    private final com.huawei.hms.scankit.p.p7 b;

    static {
            r0 = 1
            int[] r1 = new int[]{r0, r0, r0}
            com.huawei.hms.scankit.p.q7.c = r1
            int[] r1 = new int[]{r0, r0, r0, r0, r0}
            com.huawei.hms.scankit.p.q7.d = r1
            r1 = 6
            int[] r2 = new int[r1]
            r2 = {x008c: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1} // fill-array
            com.huawei.hms.scankit.p.q7.e = r2
            r2 = 10
            int[][] r3 = new int[r2][]
            r4 = 3
            r5 = 2
            int[] r6 = new int[]{r4, r5, r0, r0}
            r7 = 0
            r3[r7] = r6
            int[] r6 = new int[]{r5, r5, r5, r0}
            r3[r0] = r6
            int[] r6 = new int[]{r5, r0, r5, r5}
            r3[r5] = r6
            r6 = 4
            int[] r8 = new int[]{r0, r6, r0, r0}
            r3[r4] = r8
            int[] r8 = new int[]{r0, r0, r4, r5}
            r3[r6] = r8
            int[] r8 = new int[]{r0, r5, r4, r0}
            r9 = 5
            r3[r9] = r8
            int[] r6 = new int[]{r0, r0, r0, r6}
            r3[r1] = r6
            int[] r1 = new int[]{r0, r4, r0, r5}
            r6 = 7
            r3[r6] = r1
            int[] r1 = new int[]{r0, r5, r0, r4}
            r6 = 8
            r3[r6] = r1
            int[] r1 = new int[]{r4, r0, r0, r5}
            r4 = 9
            r3[r4] = r1
            com.huawei.hms.scankit.p.q7.f = r3
            r1 = 20
            int[][] r4 = new int[r1][]
            com.huawei.hms.scankit.p.q7.g = r4
            java.lang.System.arraycopy(r3, r7, r4, r7, r2)
        L6a:
            if (r2 >= r1) goto L8a
            int[][] r3 = com.huawei.hms.scankit.p.q7.f
            int r4 = r2 + (-10)
            r3 = r3[r4]
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
        L76:
            int r6 = r3.length
            if (r5 >= r6) goto L83
            int r6 = r3.length
            int r6 = r6 - r5
            int r6 = r6 - r0
            r6 = r3[r6]
            r4[r5] = r6
            int r5 = r5 + 1
            goto L76
        L83:
            int[][] r3 = com.huawei.hms.scankit.p.q7.g
            r3[r2] = r4
            int r2 = r2 + 1
            goto L6a
        L8a:
            return
    }

    protected q7() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            r2.a = r0
            com.huawei.hms.scankit.p.p7 r0 = new com.huawei.hms.scankit.p.p7
            r0.<init>()
            r2.b = r0
            return
    }

    static int a(com.huawei.hms.scankit.p.r r4, int[] r5, int r6, int[][] r7) throws com.huawei.hms.scankit.p.a {
            com.huawei.hms.scankit.p.g5.a(r4, r6, r5)
            int r4 = r7.length
            r6 = 1055622431(0x3eeb851f, float:0.46)
            r0 = -1
            r1 = 0
        L9:
            if (r1 >= r4) goto L1d
            r2 = r7[r1]
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = com.huawei.hms.scankit.p.g5.a(r5, r2, r3)
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 >= 0) goto L1a
            r0 = r1
            r6 = r2
        L1a:
            int r1 = r1 + 1
            goto L9
        L1d:
            if (r0 < 0) goto L20
            return r0
        L20:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
    }

    private void a(com.huawei.hms.scankit.p.s6 r4, int[] r5, int r6, com.huawei.hms.scankit.p.r r7, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r8) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            r0 = 0
            com.huawei.hms.scankit.p.p7 r1 = r3.b     // Catch: com.huawei.hms.scankit.p.a -> L1a
            r2 = 1
            r5 = r5[r2]     // Catch: com.huawei.hms.scankit.p.a -> L1a
            com.huawei.hms.scankit.p.s6 r5 = r1.a(r6, r7, r5)     // Catch: com.huawei.hms.scankit.p.a -> L1a
            com.huawei.hms.scankit.p.u6[] r6 = r5.j()     // Catch: com.huawei.hms.scankit.p.a -> L1a
            r4.a(r6)     // Catch: com.huawei.hms.scankit.p.a -> L1a
            java.lang.String r4 = r5.k()     // Catch: com.huawei.hms.scankit.p.a -> L1a
            int r4 = r4.length()     // Catch: com.huawei.hms.scankit.p.a -> L1a
            goto L1c
        L1a:
            r4 = 0
        L1c:
            if (r8 != 0) goto L20
            r5 = 0
            goto L28
        L20:
            com.huawei.hms.scankit.p.l1 r5 = com.huawei.hms.scankit.p.l1.k
            java.lang.Object r5 = r8.get(r5)
            int[] r5 = (int[]) r5
        L28:
            if (r5 == 0) goto L3a
            int r6 = r5.length
        L2b:
            if (r0 >= r6) goto L35
            r7 = r5[r0]
            if (r4 != r7) goto L32
            goto L3a
        L32:
            int r0 = r0 + 1
            goto L2b
        L35:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
        L3a:
            return
    }

    public static boolean a(java.lang.CharSequence r5) throws com.huawei.hms.scankit.p.a {
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 1
            int r0 = r0 - r2
            char r3 = r5.charAt(r0)
            r4 = 10
            int r3 = java.lang.Character.digit(r3, r4)
            java.lang.CharSequence r5 = r5.subSequence(r1, r0)
            int r5 = b(r5)
            if (r5 != r3) goto L1f
            return r2
        L1f:
            return r1
    }

    static int[] a(com.huawei.hms.scankit.p.r r1) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            int[] r1 = b(r1, r0)
            return r1
    }

    static int[] a(com.huawei.hms.scankit.p.r r1, int r2, boolean r3, int[] r4) throws com.huawei.hms.scankit.p.a {
            int r0 = r4.length
            int[] r0 = new int[r0]
            int[] r1 = a(r1, r2, r3, r4, r0)
            return r1
    }

    private static int[] a(com.huawei.hms.scankit.p.r r8, int r9, boolean r10, int[] r11, int[] r12) throws com.huawei.hms.scankit.p.a {
            int r0 = r8.e()
            if (r10 == 0) goto Lb
            int r9 = r8.d(r9)
            goto Lf
        Lb:
            int r9 = r8.c(r9)
        Lf:
            int r1 = r11.length
            r2 = 0
            r3 = r10
            r4 = 0
            r10 = r9
        L14:
            if (r9 >= r0) goto L60
            boolean r5 = r8.b(r9)
            r6 = 1
            if (r5 == r3) goto L2d
            if (r4 < 0) goto L28
            int r5 = r12.length
            if (r4 >= r5) goto L28
            r5 = r12[r4]
            int r5 = r5 + r6
            r12[r4] = r5
            goto L5d
        L28:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()
            throw r8
        L2d:
            int r5 = r1 + (-1)
            if (r4 != r5) goto L57
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            float r5 = com.huawei.hms.scankit.p.g5.a(r12, r11, r5)
            r7 = 1055622431(0x3eeb851f, float:0.46)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L44
            int[] r8 = new int[]{r10, r9}
            return r8
        L44:
            r5 = r12[r2]
            r7 = r12[r6]
            int r5 = r5 + r7
            int r10 = r10 + r5
            int r5 = r4 + (-1)
            r7 = 2
            java.lang.System.arraycopy(r12, r7, r12, r2, r5)
            r12[r5] = r2
            r12[r4] = r2
            int r4 = r4 + (-1)
            goto L59
        L57:
            int r4 = r4 + 1
        L59:
            r12[r4] = r6
            r3 = r3 ^ 1
        L5d:
            int r9 = r9 + 1
            goto L14
        L60:
            com.huawei.hms.scankit.p.a r8 = com.huawei.hms.scankit.p.a.a()
            throw r8
    }

    public static int b(java.lang.CharSequence r5) throws com.huawei.hms.scankit.p.a {
            int r0 = r5.length()
            int r1 = r0 + (-1)
            r2 = 0
        L7:
            r3 = 9
            if (r1 < 0) goto L1e
            char r4 = r5.charAt(r1)
            int r4 = r4 + (-48)
            if (r4 < 0) goto L19
            if (r4 > r3) goto L19
            int r2 = r2 + r4
            int r1 = r1 + (-2)
            goto L7
        L19:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()
            throw r5
        L1e:
            int r2 = r2 * 3
            int r0 = r0 + (-2)
        L22:
            if (r0 < 0) goto L37
            char r1 = r5.charAt(r0)
            int r1 = r1 + (-48)
            if (r1 < 0) goto L32
            if (r1 > r3) goto L32
            int r2 = r2 + r1
            int r0 = r0 + (-2)
            goto L22
        L32:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()
            throw r5
        L37:
            int r5 = 1000 - r2
            int r5 = r5 % 10
            return r5
    }

    static java.util.ArrayList<int[]> b(com.huawei.hms.scankit.p.r r4) throws com.huawei.hms.scankit.p.a {
            int r0 = r4.e()
            int r0 = r0 / 2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r0) goto L1c
            int[] r3 = b(r4, r3)     // Catch: com.huawei.hms.scankit.p.a -> L1b
            r1.add(r3)     // Catch: com.huawei.hms.scankit.p.a -> L1b
            r3 = r3[r2]     // Catch: com.huawei.hms.scankit.p.a -> L1b
            int r3 = r3 + 1
            goto Ld
        L1b:
        L1c:
            int r4 = r1.size()
            if (r4 == 0) goto L23
            return r1
        L23:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
    }

    static int[] b(com.huawei.hms.scankit.p.r r8, int r9) throws com.huawei.hms.scankit.p.a {
            int[] r0 = com.huawei.hms.scankit.p.q7.c
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L8:
            if (r3 != 0) goto L2f
            int[] r2 = com.huawei.hms.scankit.p.q7.c
            int r4 = r2.length
            java.util.Arrays.fill(r0, r1, r4, r1)
            int[] r2 = a(r8, r9, r1, r2, r0)
            r9 = r2[r1]
            r4 = 1
            r5 = r2[r4]
            int r6 = r5 - r9
            int r6 = r9 - r6
            int r7 = r6 + 3
        L1f:
            if (r6 > r7) goto L2d
            if (r6 < 0) goto L2a
            boolean r3 = r8.a(r6, r9, r1, r4)
            if (r3 == 0) goto L2a
            goto L2d
        L2a:
            int r6 = r6 + 1
            goto L1f
        L2d:
            r9 = r5
            goto L8
        L2f:
            return r2
    }

    protected abstract int a(com.huawei.hms.scankit.p.r r1, int[] r2, java.lang.StringBuilder r3) throws com.huawei.hms.scankit.p.a;

    abstract com.huawei.hms.scankit.aiscan.common.BarcodeFormat a();

    @Override // com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r2, com.huawei.hms.scankit.p.r r3, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            int[] r0 = a(r3)
            com.huawei.hms.scankit.p.s6 r2 = r1.a(r2, r3, r0, r4)
            return r2
    }

    public com.huawei.hms.scankit.p.s6 a(int r15, com.huawei.hms.scankit.p.r r16, int[] r17, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r18) throws com.huawei.hms.scankit.p.a {
            r14 = this;
            r4 = r16
            r0 = r17
            r5 = r18
            r1 = 0
            if (r5 != 0) goto Lb
            r2 = r1
            goto L13
        Lb:
            com.huawei.hms.scankit.p.l1 r2 = com.huawei.hms.scankit.p.l1.j
            java.lang.Object r2 = r5.get(r2)
            com.huawei.hms.scankit.p.v6 r2 = (com.huawei.hms.scankit.p.v6) r2
        L13:
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L29
            com.huawei.hms.scankit.p.u6 r9 = new com.huawei.hms.scankit.p.u6
            r10 = r0[r8]
            r11 = r0[r7]
            int r10 = r10 + r11
            float r10 = (float) r10
            float r10 = r10 / r6
            float r11 = (float) r15
            r9.<init>(r10, r11)
            r2.a(r9)
        L29:
            java.lang.StringBuilder r9 = r14.a
            r9.setLength(r8)
            int r10 = r14.a(r4, r0, r9)
            if (r2 == 0) goto L3e
            com.huawei.hms.scankit.p.u6 r11 = new com.huawei.hms.scankit.p.u6
            float r12 = (float) r10
            float r13 = (float) r15
            r11.<init>(r12, r13)
            r2.a(r11)
        L3e:
            int[] r11 = r14.a(r4, r10)
            r12 = r11[r8]
            int r12 = r12 - r10
            if (r12 > r7) goto Lc3
            if (r2 == 0) goto L59
            com.huawei.hms.scankit.p.u6 r10 = new com.huawei.hms.scankit.p.u6
            r12 = r11[r8]
            r13 = r11[r7]
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r6
            float r6 = (float) r15
            r10.<init>(r12, r6)
            r2.a(r10)
        L59:
            boolean r2 = r14.a(r0, r11)
            if (r2 == 0) goto Lbe
            r2 = r11[r7]
            r6 = r11[r8]
            int r6 = r2 - r6
            int r6 = r6 + r2
            int r10 = r4.e()
            if (r6 >= r10) goto Lb9
            r6 = r11[r8]
            boolean r2 = r14.a(r6, r2, r4)
            if (r2 == 0) goto Lb9
            java.lang.String r2 = r9.toString()
            int r6 = r2.length()
            r9 = 8
            if (r6 < r9) goto Lb4
            boolean r6 = r14.a(r2)
            if (r6 == 0) goto Laf
            r0 = r0[r8]
            float r0 = (float) r0
            r6 = r11[r7]
            float r6 = (float) r6
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r9 = r14.a()
            com.huawei.hms.scankit.p.s6 r10 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6 r12 = new com.huawei.hms.scankit.p.u6
            float r13 = (float) r15
            r12.<init>(r0, r13)
            com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
            r0.<init>(r6, r13)
            r6 = 2
            com.huawei.hms.scankit.p.u6[] r6 = new com.huawei.hms.scankit.p.u6[r6]
            r6[r8] = r12
            r6[r7] = r0
            r10.<init>(r2, r1, r6, r9)
            r0 = r14
            r3 = r15
            r1 = r10
            r2 = r11
            r0.a(r1, r2, r3, r4, r5)
            return r1
        Laf:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        Lb4:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        Lb9:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        Lbe:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        Lc3:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    abstract boolean a(int r1, int r2, com.huawei.hms.scankit.p.r r3);

    boolean a(java.lang.String r1) throws com.huawei.hms.scankit.p.a {
            r0 = this;
            boolean r1 = a(r1)
            return r1
    }

    abstract boolean a(int[] r1, int[] r2) throws com.huawei.hms.scankit.p.a;

    int[] a(com.huawei.hms.scankit.p.r r3, int r4) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            int[] r0 = com.huawei.hms.scankit.p.q7.c
            r1 = 0
            int[] r3 = a(r3, r4, r1, r0)
            return r3
    }
}

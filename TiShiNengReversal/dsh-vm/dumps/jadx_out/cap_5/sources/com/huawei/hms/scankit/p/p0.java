package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p0 extends com.huawei.hms.scankit.p.g5 {
    public static final char[] e = null;
    public static final int[] f = null;
    private static final char[] g = null;
    private final java.lang.StringBuilder a;
    private int[] b;
    private int c;
    private int d;

    static {
            java.lang.String r0 = "0123456789-$:/.+ABCD"
            char[] r0 = r0.toCharArray()
            com.huawei.hms.scankit.p.p0.e = r0
            r0 = 20
            int[] r0 = new int[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14} // fill-array
            com.huawei.hms.scankit.p.p0.f = r0
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [65, 66, 67, 68} // fill-array
            com.huawei.hms.scankit.p.p0.g = r0
            return
    }

    public p0() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            r2.a = r0
            r0 = 80
            int[] r0 = new int[r0]
            r2.b = r0
            r0 = 0
            r2.c = r0
            return
    }

    private void a(int r4) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            int[] r0 = r3.b     // Catch: java.lang.NumberFormatException -> L18
            int r1 = r3.c     // Catch: java.lang.NumberFormatException -> L18
            r0[r1] = r4     // Catch: java.lang.NumberFormatException -> L18
            int r1 = r1 + 1
            r3.c = r1     // Catch: java.lang.NumberFormatException -> L18
            int r4 = r0.length     // Catch: java.lang.NumberFormatException -> L18
            if (r1 < r4) goto L17
            int r4 = r1 * 2
            int[] r4 = new int[r4]     // Catch: java.lang.NumberFormatException -> L18
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)     // Catch: java.lang.NumberFormatException -> L18
            r3.b = r4     // Catch: java.lang.NumberFormatException -> L18
        L17:
            return
        L18:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
    }

    private void a(com.huawei.hms.scankit.p.r r7) throws com.huawei.hms.scankit.p.a {
            r6 = this;
            r0 = 0
            r6.c = r0
            int r1 = r7.d(r0)
            r6.d = r1
            int r2 = r7.e()
            if (r1 >= r2) goto L29
            r3 = 1
            r4 = 1
        L11:
            if (r1 >= r2) goto L25
            boolean r5 = r7.b(r1)
            if (r5 == r4) goto L1c
            int r0 = r0 + 1
            goto L22
        L1c:
            r6.a(r0)
            r4 = r4 ^ 1
            r0 = 1
        L22:
            int r1 = r1 + 1
            goto L11
        L25:
            r6.a(r0)
            return
        L29:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
    }

    public static boolean a(char[] r4, char r5) {
            r0 = 0
            if (r4 == 0) goto L10
            int r1 = r4.length
            r2 = 0
        L5:
            if (r2 >= r1) goto L10
            char r3 = r4[r2]
            if (r3 != r5) goto Ld
            r4 = 1
            return r4
        Ld:
            int r2 = r2 + 1
            goto L5
        L10:
            return r0
    }

    private int[] a() throws com.huawei.hms.scankit.p.a {
            r8 = this;
            int r0 = r8.b()
            java.lang.StringBuilder r1 = r8.a
            r2 = 0
            r1.setLength(r2)
            r1 = r0
        Lb:
            int r3 = r8.b(r1)
            r4 = -1
            if (r3 == r4) goto L5f
            java.lang.StringBuilder r5 = r8.a
            char r6 = (char) r3
            r5.append(r6)
            int r5 = r1 + 8
            java.lang.StringBuilder r6 = r8.a
            int r6 = r6.length()
            r7 = 1
            if (r6 <= r7) goto L30
            char[] r6 = com.huawei.hms.scankit.p.p0.g
            char[] r7 = com.huawei.hms.scankit.p.p0.e
            char r3 = r7[r3]
            boolean r3 = a(r6, r3)
            if (r3 == 0) goto L30
            goto L34
        L30:
            int r3 = r8.c
            if (r5 < r3) goto L5d
        L34:
            int[] r3 = r8.b
            int r1 = r1 + 7
            r1 = r3[r1]
            r3 = -8
        L3b:
            if (r3 >= r4) goto L47
            int[] r6 = r8.b
            int r7 = r5 + r3
            r6 = r6[r7]
            int r2 = r2 + r6
            int r3 = r3 + 1
            goto L3b
        L47:
            int r3 = r8.c
            if (r5 >= r3) goto L55
            int r2 = r2 / 2
            if (r1 < r2) goto L50
            goto L55
        L50:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
        L55:
            r8.c(r0)
            int[] r0 = new int[]{r0, r5}
            return r0
        L5d:
            r1 = r5
            goto Lb
        L5f:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    private int b() throws com.huawei.hms.scankit.p.a {
            r5 = this;
            r0 = 1
            r1 = 1
        L2:
            int r2 = r5.c
            if (r1 >= r2) goto L37
            int r2 = r5.b(r1)
            r3 = -1
            if (r2 == r3) goto L34
            char[] r3 = com.huawei.hms.scankit.p.p0.g
            char[] r4 = com.huawei.hms.scankit.p.p0.e
            char r2 = r4[r2]
            boolean r2 = a(r3, r2)
            if (r2 == 0) goto L34
            r2 = 0
            r3 = r1
        L1b:
            int r4 = r1 + 7
            if (r3 >= r4) goto L27
            int[] r4 = r5.b
            r4 = r4[r3]
            int r2 = r2 + r4
            int r3 = r3 + 1
            goto L1b
        L27:
            if (r1 == r0) goto L33
            int[] r3 = r5.b
            int r4 = r1 + (-1)
            r3 = r3[r4]
            int r2 = r2 / 2
            if (r3 < r2) goto L34
        L33:
            return r1
        L34:
            int r1 = r1 + 2
            goto L2
        L37:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    private int b(int r9) {
            r8 = this;
            int r0 = r9 + 7
            int r1 = r8.c
            r2 = -1
            if (r0 < r1) goto L8
            return r2
        L8:
            int[] r1 = r8.b
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = r9
        L10:
            if (r4 >= r0) goto L1e
            r5 = r1[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.add(r5)
            int r4 = r4 + 1
            goto L10
        L1e:
            java.util.Iterator r0 = r3.iterator()
            r4 = 0
            r5 = 0
        L24:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L36
            java.lang.Object r6 = r0.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r5 = r5 + r6
            goto L24
        L36:
            int r0 = r3.size()
            if (r0 <= 0) goto L61
            int r0 = r3.size()
            int r5 = r5 / r0
            r0 = 128(0x80, float:1.8E-43)
            r3 = 0
            r6 = 0
        L45:
            r7 = 7
            if (r3 >= r7) goto L54
            int r0 = r0 >> 1
            int r7 = r9 + r3
            r7 = r1[r7]
            if (r7 <= r5) goto L51
            r6 = r6 | r0
        L51:
            int r3 = r3 + 1
            goto L45
        L54:
            int[] r9 = com.huawei.hms.scankit.p.p0.f
            int r0 = r9.length
            if (r4 >= r0) goto L61
            r9 = r9[r4]
            if (r9 != r6) goto L5e
            return r4
        L5e:
            int r4 = r4 + 1
            goto L54
        L61:
            return r2
    }

    private void c(int r18) throws com.huawei.hms.scankit.p.a {
            r17 = this;
            r0 = r17
            r1 = 4
            int[] r2 = new int[r1]
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r5 = 2
            r2[r5] = r3
            r6 = 3
            r2[r6] = r3
            int[] r7 = new int[r1]
            r7[r3] = r3
            r7[r4] = r3
            r7[r5] = r3
            r7[r6] = r3
            java.lang.StringBuilder r6 = r0.a
            int r6 = r6.length()
            int r6 = r6 - r4
            r9 = r18
            r8 = 0
        L25:
            int[] r10 = com.huawei.hms.scankit.p.p0.f
            java.lang.StringBuilder r11 = r0.a
            char r11 = r11.charAt(r8)
            r10 = r10[r11]
            r11 = 6
            r12 = 6
        L31:
            if (r12 < 0) goto L4e
            r13 = r12 & 1
            r14 = r10 & 1
            int r14 = r14 * 2
            int r13 = r13 + r14
            r14 = r2[r13]
            int[] r15 = r0.b
            int r16 = r9 + r12
            r15 = r15[r16]
            int r14 = r14 + r15
            r2[r13] = r14
            r14 = r7[r13]
            int r14 = r14 + r4
            r7[r13] = r14
            int r10 = r10 >> r4
            int r12 = r12 + (-1)
            goto L31
        L4e:
            if (r8 < r6) goto Lba
            float[] r10 = new float[r1]
            float[] r12 = new float[r1]
            r1 = 0
        L55:
            if (r1 >= r5) goto L7f
            r4 = 0
            r12[r1] = r4
            int r4 = r1 + 2
            r8 = r2[r1]
            float r8 = (float) r8
            r9 = r7[r1]
            float r9 = (float) r9
            float r8 = r8 / r9
            r9 = r2[r4]
            float r13 = (float) r9
            r14 = r7[r4]
            float r15 = (float) r14
            float r13 = r13 / r15
            float r8 = r8 + r13
            r13 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r13
            r12[r4] = r8
            r10[r1] = r8
            float r8 = (float) r9
            float r8 = r8 * r13
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 + r9
            float r9 = (float) r14
            float r8 = r8 / r9
            r10[r4] = r8
            int r1 = r1 + 1
            goto L55
        L7f:
            r1 = r18
        L81:
            int[] r2 = com.huawei.hms.scankit.p.p0.f
            java.lang.StringBuilder r4 = r0.a
            char r4 = r4.charAt(r3)
            r2 = r2[r4]
            r4 = 6
        L8c:
            if (r4 < 0) goto Lb2
            r7 = r4 & 1
            r8 = r2 & 1
            int r8 = r8 * 2
            int r7 = r7 + r8
            int[] r8 = r0.b
            int r9 = r1 + r4
            r8 = r8[r9]
            float r8 = (float) r8
            r9 = r12[r7]
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 < 0) goto Lad
            r7 = r10[r7]
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto Lad
            int r2 = r2 >> 1
            int r4 = r4 + (-1)
            goto L8c
        Lad:
            com.huawei.hms.scankit.p.a r1 = com.huawei.hms.scankit.p.a.a()
            throw r1
        Lb2:
            if (r3 < r6) goto Lb5
            return
        Lb5:
            int r1 = r1 + 8
            int r3 = r3 + 1
            goto L81
        Lba:
            int r9 = r9 + 8
            int r8 = r8 + 1
            goto L25
    }

    @Override // com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r7, com.huawei.hms.scankit.p.r r8, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r9) throws com.huawei.hms.scankit.p.a {
            r6 = this;
            int[] r9 = r6.b
            r0 = 0
            java.util.Arrays.fill(r9, r0)
            r6.a(r8)
            int[] r8 = r6.a()
            r9 = r8[r0]
            r1 = 1
            r8 = r8[r1]
            r2 = 0
        L13:
            java.lang.StringBuilder r3 = r6.a
            int r3 = r3.length()
            if (r2 >= r3) goto L2b
            java.lang.StringBuilder r3 = r6.a
            char[] r4 = com.huawei.hms.scankit.p.p0.e
            char r5 = r3.charAt(r2)
            char r4 = r4[r5]
            r3.setCharAt(r2, r4)
            int r2 = r2 + 1
            goto L13
        L2b:
            java.lang.StringBuilder r2 = r6.a
            char r2 = r2.charAt(r0)
            char[] r3 = com.huawei.hms.scankit.p.p0.g
            boolean r2 = a(r3, r2)
            if (r2 == 0) goto L99
            java.lang.StringBuilder r2 = r6.a
            int r4 = r2.length()
            int r4 = r4 - r1
            char r2 = r2.charAt(r4)
            boolean r2 = a(r3, r2)
            if (r2 == 0) goto L94
            java.lang.StringBuilder r2 = r6.a
            int r2 = r2.length()
            r3 = 3
            if (r2 <= r3) goto L8f
            int r2 = r6.d
            r3 = 0
        L56:
            if (r3 >= r9) goto L60
            int[] r4 = r6.b
            r4 = r4[r3]
            int r2 = r2 + r4
            int r3 = r3 + 1
            goto L56
        L60:
            float r3 = (float) r2
        L61:
            int r4 = r8 + (-1)
            if (r9 >= r4) goto L6d
            int[] r4 = r6.b
            r4 = r4[r9]
            int r2 = r2 + r4
            int r9 = r9 + 1
            goto L61
        L6d:
            float r8 = (float) r2
            com.huawei.hms.scankit.p.s6 r9 = new com.huawei.hms.scankit.p.s6
            java.lang.StringBuilder r2 = r6.a
            java.lang.String r2 = r2.toString()
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            float r7 = (float) r7
            r4.<init>(r3, r7)
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            r3.<init>(r8, r7)
            r7 = 2
            com.huawei.hms.scankit.p.u6[] r7 = new com.huawei.hms.scankit.p.u6[r7]
            r7[r0] = r4
            r7[r1] = r3
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r8 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.b
            r0 = 0
            r9.<init>(r2, r0, r7, r8)
            return r9
        L8f:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
        L94:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
        L99:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
    }
}

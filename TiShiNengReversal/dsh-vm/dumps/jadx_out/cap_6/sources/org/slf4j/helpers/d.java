package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d {
    static final char a = '{';
    static final char b = '}';
    static final java.lang.String c = "{}";
    private static final char d = '\\';

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final org.slf4j.helpers.c a(java.lang.String r1, java.lang.Object[] r2) {
            java.lang.Throwable r0 = k(r2)
            if (r0 == 0) goto La
            java.lang.Object[] r2 = s(r2)
        La:
            org.slf4j.helpers.c r1 = b(r1, r2, r0)
            return r1
    }

    public static final org.slf4j.helpers.c b(java.lang.String r5, java.lang.Object[] r6, java.lang.Throwable r7) {
            if (r5 != 0) goto L9
            org.slf4j.helpers.c r5 = new org.slf4j.helpers.c
            r0 = 0
            r5.<init>(r0, r6, r7)
            return r5
        L9:
            if (r6 != 0) goto L11
            org.slf4j.helpers.c r6 = new org.slf4j.helpers.c
            r6.<init>(r5)
            return r6
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length()
            int r1 = r1 + 50
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L1e:
            int r3 = r6.length
            if (r1 >= r3) goto L82
            java.lang.String r3 = "{}"
            int r3 = r5.indexOf(r3, r2)
            r4 = -1
            if (r3 != r4) goto L43
            if (r2 != 0) goto L32
            org.slf4j.helpers.c r0 = new org.slf4j.helpers.c
            r0.<init>(r5, r6, r7)
            return r0
        L32:
            int r1 = r5.length()
            r0.append(r5, r2, r1)
            org.slf4j.helpers.c r5 = new org.slf4j.helpers.c
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r6, r7)
            return r5
        L43:
            boolean r4 = n(r5, r3)
            if (r4 == 0) goto L71
            boolean r4 = m(r5, r3)
            if (r4 != 0) goto L5f
            int r1 = r1 + (-1)
            int r4 = r3 + (-1)
            r0.append(r5, r2, r4)
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            int r3 = r3 + 1
        L5d:
            r2 = r3
            goto L7f
        L5f:
            int r4 = r3 + (-1)
            r0.append(r5, r2, r4)
            r2 = r6[r1]
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            f(r0, r2, r4)
        L6e:
            int r3 = r3 + 2
            goto L5d
        L71:
            r0.append(r5, r2, r3)
            r2 = r6[r1]
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            f(r0, r2, r4)
            goto L6e
        L7f:
            int r1 = r1 + 1
            goto L1e
        L82:
            int r1 = r5.length()
            r0.append(r5, r2, r1)
            org.slf4j.helpers.c r5 = new org.slf4j.helpers.c
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r6, r7)
            return r5
    }

    private static void c(java.lang.StringBuilder r3, boolean[] r4) {
            r0 = 91
            r3.append(r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            boolean r2 = r4[r1]
            r3.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r3.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r4 = 93
            r3.append(r4)
            return
    }

    private static void d(java.lang.StringBuilder r3, byte[] r4) {
            r0 = 91
            r3.append(r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            r2 = r4[r1]
            r3.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r3.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r4 = 93
            r3.append(r4)
            return
    }

    private static void e(java.lang.StringBuilder r3, char[] r4) {
            r0 = 91
            r3.append(r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            char r2 = r4[r1]
            r3.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r3.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r4 = 93
            r3.append(r4)
            return
    }

    private static void f(java.lang.StringBuilder r1, java.lang.Object r2, java.util.Map<java.lang.Object[], java.lang.Object> r3) {
            if (r2 != 0) goto L8
            java.lang.String r2 = "null"
            r1.append(r2)
            return
        L8:
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L16
            q(r1, r2)
            return
        L16:
            boolean r0 = r2 instanceof boolean[]
            if (r0 == 0) goto L20
            boolean[] r2 = (boolean[]) r2
            c(r1, r2)
            return
        L20:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L2a
            byte[] r2 = (byte[]) r2
            d(r1, r2)
            return
        L2a:
            boolean r0 = r2 instanceof char[]
            if (r0 == 0) goto L34
            char[] r2 = (char[]) r2
            e(r1, r2)
            return
        L34:
            boolean r0 = r2 instanceof short[]
            if (r0 == 0) goto L3e
            short[] r2 = (short[]) r2
            r(r1, r2)
            return
        L3e:
            boolean r0 = r2 instanceof int[]
            if (r0 == 0) goto L48
            int[] r2 = (int[]) r2
            l(r1, r2)
            return
        L48:
            boolean r0 = r2 instanceof long[]
            if (r0 == 0) goto L52
            long[] r2 = (long[]) r2
            o(r1, r2)
            return
        L52:
            boolean r0 = r2 instanceof float[]
            if (r0 == 0) goto L5c
            float[] r2 = (float[]) r2
            h(r1, r2)
            return
        L5c:
            boolean r0 = r2 instanceof double[]
            if (r0 == 0) goto L66
            double[] r2 = (double[]) r2
            g(r1, r2)
            return
        L66:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            p(r1, r2, r3)
            return
    }

    private static void g(java.lang.StringBuilder r4, double[] r5) {
            r0 = 91
            r4.append(r0)
            int r0 = r5.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            r4.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r4.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r5 = 93
            r4.append(r5)
            return
    }

    private static void h(java.lang.StringBuilder r3, float[] r4) {
            r0 = 91
            r3.append(r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            r2 = r4[r1]
            r3.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r3.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r4 = 93
            r3.append(r4)
            return
    }

    public static final org.slf4j.helpers.c i(java.lang.String r2, java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            org.slf4j.helpers.c r2 = a(r2, r0)
            return r2
    }

    public static final org.slf4j.helpers.c j(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            org.slf4j.helpers.c r2 = a(r2, r0)
            return r2
    }

    static final java.lang.Throwable k(java.lang.Object[] r2) {
            r0 = 0
            if (r2 == 0) goto L13
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L13
        L7:
            int r1 = r2.length
            int r1 = r1 + (-1)
            r2 = r2[r1]
            boolean r1 = r2 instanceof java.lang.Throwable
            if (r1 == 0) goto L13
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L13:
            return r0
    }

    private static void l(java.lang.StringBuilder r3, int[] r4) {
            r0 = 91
            r3.append(r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            r2 = r4[r1]
            r3.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r3.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r4 = 93
            r3.append(r4)
            return
    }

    static final boolean m(java.lang.String r1, int r2) {
            r0 = 2
            if (r2 < r0) goto Le
            int r2 = r2 - r0
            char r1 = r1.charAt(r2)
            r2 = 92
            if (r1 != r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    static final boolean n(java.lang.String r2, int r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 1
            int r3 = r3 - r1
            char r2 = r2.charAt(r3)
            r3 = 92
            if (r2 != r3) goto Lf
            return r1
        Lf:
            return r0
    }

    private static void o(java.lang.StringBuilder r4, long[] r5) {
            r0 = 91
            r4.append(r0)
            int r0 = r5.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            r4.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r4.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r5 = 93
            r4.append(r5)
            return
    }

    private static void p(java.lang.StringBuilder r3, java.lang.Object[] r4, java.util.Map<java.lang.Object[], java.lang.Object> r5) {
            r0 = 91
            r3.append(r0)
            boolean r0 = r5.containsKey(r4)
            if (r0 != 0) goto L28
            r0 = 0
            r5.put(r4, r0)
            int r0 = r4.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L24
            r2 = r4[r1]
            f(r3, r2, r5)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L21
            java.lang.String r2 = ", "
            r3.append(r2)
        L21:
            int r1 = r1 + 1
            goto L11
        L24:
            r5.remove(r4)
            goto L2d
        L28:
            java.lang.String r4 = "..."
            r3.append(r4)
        L2d:
            r4 = 93
            r3.append(r4)
            return
    }

    private static void q(java.lang.StringBuilder r3, java.lang.Object r4) {
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L8
            r3.append(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SLF4J: Failed toString() invocation on an object of type ["
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            org.slf4j.helpers.j.d(r4, r0)
            java.lang.String r4 = "[FAILED toString()]"
            r3.append(r4)
            return
    }

    private static void r(java.lang.StringBuilder r3, short[] r4) {
            r0 = 91
            r3.append(r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1a
            short r2 = r4[r1]
            r3.append(r2)
            int r2 = r0 + (-1)
            if (r1 == r2) goto L17
            java.lang.String r2 = ", "
            r3.append(r2)
        L17:
            int r1 = r1 + 1
            goto L7
        L1a:
            r4 = 93
            r3.append(r4)
            return
    }

    private static java.lang.Object[] s(java.lang.Object[] r3) {
            if (r3 == 0) goto Lf
            int r0 = r3.length
            if (r0 == 0) goto Lf
            int r0 = r3.length
            int r0 = r0 + (-1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        Lf:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "non-sensical empty or null argument array"
            r3.<init>(r0)
            throw r3
    }
}

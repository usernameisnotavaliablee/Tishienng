package com.clj.fastble.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class b {
    private static final char[] a = null;
    private static final char[] b = null;

    static {
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.clj.fastble.utils.b.a = r1
            char[] r0 = new char[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.clj.fastble.utils.b.b = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte a(char r1) {
            java.lang.String r0 = "0123456789ABCDEF"
            int r1 = r0.indexOf(r1)
            byte r1 = (byte) r1
            return r1
    }

    public static byte[] b(char[] r7) {
            int r0 = r7.length
            r1 = r0 & 1
            if (r1 != 0) goto L29
            int r1 = r0 >> 1
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
        Lb:
            if (r2 >= r0) goto L28
            char r4 = r7[r2]
            int r4 = m(r4, r2)
            int r4 = r4 << 4
            int r5 = r2 + 1
            char r6 = r7[r5]
            int r5 = m(r6, r5)
            r4 = r4 | r5
            int r2 = r2 + 2
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L28:
            return r1
        L29:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Odd number of characters."
            r7.<init>(r0)
            throw r7
    }

    public static char[] c(byte[] r1) {
            r0 = 1
            char[] r1 = d(r1, r0)
            return r1
    }

    public static char[] d(byte[] r0, boolean r1) {
            if (r1 == 0) goto L5
            char[] r1 = com.clj.fastble.utils.b.a
            goto L7
        L5:
            char[] r1 = com.clj.fastble.utils.b.b
        L7:
            char[] r0 = e(r0, r1)
            return r0
    }

    protected static char[] e(byte[] r7, char[] r8) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r7.length
            int r1 = r0 << 1
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 0
        Lb:
            if (r2 >= r0) goto L24
            int r4 = r3 + 1
            r5 = r7[r2]
            r6 = r5 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >>> 4
            char r6 = r8[r6]
            r1[r3] = r6
            int r3 = r3 + 2
            r5 = r5 & 15
            char r5 = r8[r5]
            r1[r4] = r5
            int r2 = r2 + 1
            goto Lb
        L24:
            return r1
    }

    public static java.lang.String f(byte[] r1) {
            r0 = 1
            java.lang.String r1 = g(r1, r0)
            return r1
    }

    public static java.lang.String g(byte[] r0, boolean r1) {
            if (r1 == 0) goto L5
            char[] r1 = com.clj.fastble.utils.b.a
            goto L7
        L5:
            char[] r1 = com.clj.fastble.utils.b.b
        L7:
            java.lang.String r0 = h(r0, r1)
            return r0
    }

    protected static java.lang.String h(byte[] r1, char[] r2) {
            java.lang.String r0 = new java.lang.String
            char[] r1 = e(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String i(byte[] r1, int r2) {
            r1 = r1[r2]
            r2 = 1
            byte[] r2 = new byte[r2]
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = j(r2)
            return r1
    }

    public static java.lang.String j(byte[] r1) {
            r0 = 0
            java.lang.String r1 = k(r1, r0)
            return r1
    }

    public static java.lang.String k(byte[] r6, boolean r7) {
            if (r6 == 0) goto L45
            int r0 = r6.length
            r1 = 1
            if (r0 >= r1) goto L7
            goto L45
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
        Ld:
            int r3 = r6.length
            if (r2 >= r3) goto L3c
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            if (r4 != r1) goto L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 48
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L2f:
            r0.append(r3)
            if (r7 == 0) goto L39
            java.lang.String r3 = " "
            r0.append(r3)
        L39:
            int r2 = r2 + 1
            goto Ld
        L3c:
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.trim()
            return r6
        L45:
            r6 = 0
            return r6
    }

    public static byte[] l(java.lang.String r5) {
            if (r5 == 0) goto L3c
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            goto L3c
        Lb:
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = r5.toUpperCase()
            int r0 = r5.length()
            int r0 = r0 / 2
            char[] r5 = r5.toCharArray()
            byte[] r1 = new byte[r0]
            r2 = 0
        L20:
            if (r2 >= r0) goto L3b
            int r3 = r2 * 2
            char r4 = r5[r3]
            byte r4 = a(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5[r3]
            byte r3 = a(r3)
            r3 = r3 | r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L20
        L3b:
            return r1
        L3c:
            r5 = 0
            return r5
    }

    protected static int m(char r3, int r4) {
            r0 = 16
            int r0 = java.lang.Character.digit(r3, r0)
            r1 = -1
            if (r0 == r1) goto La
            return r0
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal hexadecimal character "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " at index "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}

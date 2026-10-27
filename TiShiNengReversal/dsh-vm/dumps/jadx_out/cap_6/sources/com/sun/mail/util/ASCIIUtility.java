package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ASCIIUtility {
    private ASCIIUtility() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] getBytes(java.io.InputStream r6) throws java.io.IOException {
            boolean r0 = r6 instanceof java.io.ByteArrayInputStream
            r1 = 0
            if (r0 == 0) goto Lf
            int r0 = r6.available()
            byte[] r2 = new byte[r0]
            r6.read(r2, r1, r0)
            return r2
        Lf:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]
        L18:
            int r4 = r6.read(r3, r1, r2)
            r5 = -1
            if (r4 != r5) goto L24
            byte[] r6 = r0.toByteArray()
            return r6
        L24:
            r0.write(r3, r1, r4)
            goto L18
    }

    public static byte[] getBytes(java.lang.String r5) {
            char[] r5 = r5.toCharArray()
            int r0 = r5.length
            byte[] r1 = new byte[r0]
            r2 = 0
        L8:
            if (r2 < r0) goto Lb
            return r1
        Lb:
            int r3 = r2 + 1
            char r4 = r5[r2]
            byte r4 = (byte) r4
            r1[r2] = r4
            r2 = r3
            goto L8
    }

    public static int parseInt(byte[] r1, int r2, int r3) throws java.lang.NumberFormatException {
            r0 = 10
            int r1 = parseInt(r1, r2, r3, r0)
            return r1
    }

    public static int parseInt(byte[] r10, int r11, int r12, int r13) throws java.lang.NumberFormatException {
            if (r10 == 0) goto L83
            java.lang.String r0 = "illegal number"
            if (r12 <= r11) goto L7d
            r1 = r10[r11]
            r2 = 45
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L14
            int r1 = r11 + 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            goto L19
        L14:
            r2 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r1 = r11
            r5 = 0
        L19:
            int r6 = r2 / r13
            if (r1 >= r12) goto L45
            int r3 = r1 + 1
            r1 = r10[r1]
            char r1 = (char) r1
            int r1 = java.lang.Character.digit(r1, r13)
            if (r1 < 0) goto L2d
            int r1 = -r1
            r9 = r3
            r3 = r1
            r1 = r9
            goto L45
        L2d:
            java.lang.NumberFormatException r13 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "illegal number: "
            r0.<init>(r1)
            java.lang.String r10 = toString(r10, r11, r12)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r13.<init>(r10)
            throw r13
        L45:
            if (r1 < r12) goto L55
            if (r5 == 0) goto L53
            int r11 = r11 + r4
            if (r1 <= r11) goto L4d
            return r3
        L4d:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r10.<init>(r0)
            throw r10
        L53:
            int r10 = -r3
            return r10
        L55:
            int r7 = r1 + 1
            r1 = r10[r1]
            char r1 = (char) r1
            int r1 = java.lang.Character.digit(r1, r13)
            if (r1 < 0) goto L77
            if (r3 < r6) goto L71
            int r3 = r3 * r13
            int r8 = r2 + r1
            if (r3 < r8) goto L6b
            int r3 = r3 - r1
            r1 = r7
            goto L45
        L6b:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r10.<init>(r0)
            throw r10
        L71:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r10.<init>(r0)
            throw r10
        L77:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r10.<init>(r0)
            throw r10
        L7d:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r10.<init>(r0)
            throw r10
        L83:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.String r11 = "null"
            r10.<init>(r11)
            throw r10
    }

    public static long parseLong(byte[] r1, int r2, int r3) throws java.lang.NumberFormatException {
            r0 = 10
            long r1 = parseLong(r1, r2, r3, r0)
            return r1
    }

    public static long parseLong(byte[] r21, int r22, int r23, int r24) throws java.lang.NumberFormatException {
            r0 = r22
            r1 = r23
            r2 = r24
            if (r21 == 0) goto L97
            java.lang.String r3 = "illegal number"
            if (r1 <= r0) goto L91
            r4 = r21[r0]
            r5 = 45
            r6 = 1
            if (r4 != r5) goto L19
            int r4 = r0 + 1
            r7 = -9223372036854775808
            r5 = 1
            goto L21
        L19:
            r4 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = r0
            r5 = 0
        L21:
            long r9 = (long) r2
            long r11 = r7 / r9
            if (r4 >= r1) goto L4d
            int r13 = r4 + 1
            r4 = r21[r4]
            char r4 = (char) r4
            int r4 = java.lang.Character.digit(r4, r2)
            if (r4 < 0) goto L35
            int r4 = -r4
            long r14 = (long) r4
            r4 = r13
            goto L4f
        L35:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "illegal number: "
            r3.<init>(r4)
            java.lang.String r0 = toString(r21, r22, r23)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L4d:
            r14 = 0
        L4f:
            if (r4 < r1) goto L5f
            if (r5 == 0) goto L5d
            int r0 = r0 + r6
            if (r4 <= r0) goto L57
            return r14
        L57:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L5d:
            long r0 = -r14
            return r0
        L5f:
            int r13 = r4 + 1
            r4 = r21[r4]
            char r4 = (char) r4
            int r4 = java.lang.Character.digit(r4, r2)
            if (r4 < 0) goto L8b
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L85
            long r14 = r14 * r9
            r17 = r7
            long r6 = (long) r4
            long r19 = r17 + r6
            int r4 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r4 < 0) goto L7f
            long r14 = r14 - r6
            r4 = r13
            r7 = r17
            r6 = 1
            goto L4f
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L85:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L8b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L91:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r3)
            throw r0
        L97:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "null"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String toString(java.io.ByteArrayInputStream r5) {
            int r0 = r5.available()
            char[] r1 = new char[r0]
            byte[] r2 = new byte[r0]
            r3 = 0
            r5.read(r2, r3, r0)
        Lc:
            if (r3 < r0) goto L14
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            return r5
        L14:
            int r5 = r3 + 1
            r4 = r2[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r1[r3] = r4
            r3 = r5
            goto Lc
    }

    public static java.lang.String toString(byte[] r4, int r5, int r6) {
            int r6 = r6 - r5
            char[] r0 = new char[r6]
            r1 = 0
        L4:
            if (r1 < r6) goto Lc
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
            return r4
        Lc:
            int r2 = r1 + 1
            int r3 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = (char) r5
            r0[r1] = r5
            r1 = r2
            r5 = r3
            goto L4
    }
}

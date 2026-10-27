package com.tsn.chat.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(byte[] r3) {
            r0 = 0
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r1 = r3[r1]
            int r1 = r1 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = 2
            r1 = r3[r1]
            int r1 = r1 << 24
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 3
            r3 = r3[r1]
            int r3 = r3 << 24
            r3 = r3 | r0
            return r3
    }

    public static short b(byte[] r2) {
            r0 = 0
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            r1 = 1
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
            int r2 = r2 << 8
            short r2 = (short) r2
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    public static java.lang.String c(byte[] r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            if (r3 < r1) goto L13
            java.lang.String r8 = r0.toString()
            return r8
        L13:
            r5 = r8[r3]
            int r4 = r4 + 1
            int r6 = r5 >> 4
            r6 = r6 & 15
            java.lang.String r7 = "0123456789abcdef"
            char r6 = r7.charAt(r6)
            r0.append(r6)
            r5 = r5 & 15
            char r5 = r7.charAt(r5)
            r0.append(r5)
            java.lang.String r5 = " "
            r0.append(r5)
            r5 = 8
            if (r4 != r5) goto L3c
            java.lang.String r5 = "  "
            r0.append(r5)
            goto L46
        L3c:
            r5 = 16
            if (r4 != r5) goto L46
            java.lang.String r4 = "\n"
            r0.append(r4)
            r4 = 0
        L46:
            int r3 = r3 + 1
            goto Lc
    }

    public static java.lang.String d(byte[] r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 < r1) goto L20
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            int r0 = r0 + (-1)
            java.lang.String r7 = r7.substring(r2, r0)
            return r7
        L20:
            r4 = r7[r3]
            int r5 = r4 >> 4
            r5 = r5 & 15
            java.lang.String r6 = "0123456789abcdef"
            char r5 = r6.charAt(r5)
            r0.append(r5)
            r4 = r4 & 15
            char r4 = r6.charAt(r4)
            r0.append(r4)
            java.lang.String r4 = "-"
            r0.append(r4)
            int r3 = r3 + 1
            goto Lb
    }

    public static java.lang.String e(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 < r1) goto L11
            java.lang.String r6 = r0.toString()
            return r6
        L11:
            r3 = r6[r2]
            int r4 = r3 >> 4
            r4 = r4 & 15
            java.lang.String r5 = "0123456789abcdef"
            char r4 = r5.charAt(r4)
            r0.append(r4)
            r3 = r3 & 15
            char r3 = r5.charAt(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
    }

    public static byte[] f(byte r3) {
            r0 = 8
            byte[] r0 = new byte[r0]
            r1 = 7
        L5:
            if (r1 >= 0) goto L8
            return r0
        L8:
            r2 = r3 & 1
            byte r2 = (byte) r2
            r0[r1] = r2
            int r3 = r3 >> 1
            byte r3 = (byte) r3
            int r1 = r1 + (-1)
            goto L5
    }

    public static byte[] g(java.lang.String r6) {
            int r0 = r6.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L9:
            if (r2 < r0) goto Lc
            return r1
        Lc:
            int r3 = r2 * 2
            int r4 = r3 + 1
            int r5 = r3 + 2
            java.lang.String r3 = r6.substring(r3, r4)
            java.lang.String r4 = r6.substring(r4, r5)
            byte r3 = k(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
    }

    public static java.lang.String h(java.lang.String r6) {
            char[] r0 = r6.toCharArray()
            int r6 = r6.length()
            int r6 = r6 / 2
            byte[] r1 = new byte[r6]
            r2 = 0
        Ld:
            if (r2 < r6) goto L15
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
        L15:
            int r3 = r2 * 2
            char r4 = r0[r3]
            java.lang.String r5 = "0123456789ABCDEF"
            int r4 = r5.indexOf(r4)
            int r4 = r4 * 16
            int r3 = r3 + 1
            char r3 = r0[r3]
            int r3 = r5.indexOf(r3)
            int r4 = r4 + r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto Ld
    }

    public static byte[] i(int r5) {
            r0 = r5 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r5
            int r1 = r1 >> 8
            byte r1 = (byte) r1
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r2 = r2 & r5
            int r2 = r2 >> 16
            byte r2 = (byte) r2
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 & r3
            int r5 = r5 >> 24
            byte r5 = (byte) r5
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            return r3
    }

    public static java.lang.String j(java.lang.String r4) {
            java.lang.String r0 = ""
            r1 = 0
        L3:
            int r2 = r4.length()
            if (r1 < r2) goto La
            return r0
        La:
            char r2 = r4.charAt(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L3
    }

    private static byte k(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "0x"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.Byte r2 = java.lang.Byte.decode(r2)
            byte r2 = r2.byteValue()
            int r2 = r2 << 4
            byte r2 = (byte) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.Byte r3 = java.lang.Byte.decode(r3)
            byte r3 = r3.byteValue()
            r2 = r2 | r3
            byte r2 = (byte) r2
            return r2
    }
}

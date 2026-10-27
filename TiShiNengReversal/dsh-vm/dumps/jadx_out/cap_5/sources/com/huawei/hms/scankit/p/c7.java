package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c7 {
    private static final java.lang.String a = null;
    private static final boolean b = false;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r0 = r0.name()
            com.huawei.hms.scankit.p.c7.a = r0
            java.lang.String r1 = "SJIS"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "EUC_JP"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            com.huawei.hms.scankit.p.c7.b = r0
            return
    }

    public c7() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Boolean a(byte[] r11) {
            int r0 = r11.length
            r1 = 0
            r2 = 0
        L3:
            r3 = 1
            if (r2 >= r0) goto L74
            r4 = r11[r2]
            r5 = r4 & 128(0x80, float:1.8E-43)
            if (r5 != 0) goto Le
            goto L72
        Le:
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 160(0xa0, float:2.24E-43)
            r6 = 170(0xaa, float:2.38E-43)
            r7 = 127(0x7f, float:1.78E-43)
            r8 = 255(0xff, float:3.57E-43)
            if (r4 >= r6) goto L1c
            if (r4 > r5) goto L24
        L1c:
            r9 = 248(0xf8, float:3.48E-43)
            if (r4 >= r9) goto L37
            r9 = 175(0xaf, float:2.45E-43)
            if (r4 <= r9) goto L37
        L24:
            int r2 = r2 + 1
            if (r2 >= r0) goto L75
            r4 = r11[r2]
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 >= r8) goto L75
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 <= r5) goto L75
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L75
            goto L72
        L37:
            r5 = 63
            r9 = 161(0xa1, float:2.26E-43)
            if (r4 >= r9) goto L54
            r10 = 128(0x80, float:1.8E-43)
            if (r4 <= r10) goto L54
            int r2 = r2 + 1
            if (r2 >= r0) goto L75
            r4 = r11[r2]
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 >= r8) goto L75
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 <= r5) goto L75
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L75
            goto L72
        L54:
            if (r4 >= r8) goto L5a
            r8 = 169(0xa9, float:2.37E-43)
            if (r4 > r8) goto L60
        L5a:
            if (r4 >= r6) goto L75
            r6 = 167(0xa7, float:2.34E-43)
            if (r4 <= r6) goto L75
        L60:
            int r2 = r2 + 1
            if (r2 >= r0) goto L75
            r4 = r11[r2]
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 >= r9) goto L75
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 <= r5) goto L75
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L75
        L72:
            int r2 = r2 + r3
            goto L3
        L74:
            r1 = 1
        L75:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            return r11
    }

    public static java.lang.String a(byte[] r17, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r18) {
            r0 = r17
            r1 = r18
            if (r1 == 0) goto L17
            com.huawei.hms.scankit.p.l1 r2 = com.huawei.hms.scankit.p.l1.h
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L17
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L17:
            r1 = 15
            int[] r1 = new int[r1]
            int r2 = r0.length
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r2
            r4 = 2
            r1[r4] = r2
            r5 = 3
            r1[r5] = r2
            int r6 = r0.length
            if (r6 <= r5) goto L3f
            r6 = r0[r3]
            r7 = -17
            if (r6 != r7) goto L3f
            r6 = r0[r2]
            r7 = -69
            if (r6 != r7) goto L3f
            r6 = r0[r4]
            r7 = -65
            if (r6 != r7) goto L3f
            r6 = 1
            goto L40
        L3f:
            r6 = 0
        L40:
            r7 = 0
        L41:
            r14 = r1[r3]
            if (r7 >= r14) goto L61
            r8 = r1[r2]
            if (r8 == r2) goto L51
            r8 = r1[r4]
            if (r8 == r2) goto L51
            r8 = r1[r5]
            if (r8 != r2) goto L61
        L51:
            r8 = r0[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            c(r8, r1)
            b(r8, r1)
            a(r8, r1)
            int r7 = r7 + 1
            goto L41
        L61:
            r5 = r1[r5]
            if (r5 != r2) goto L68
            r5 = r1
            r1 = 1
            goto L6a
        L68:
            r5 = r1
            r1 = 0
        L6a:
            r4 = r5[r4]
            if (r4 != r2) goto L70
            r4 = 1
            goto L71
        L70:
            r4 = 0
        L71:
            r7 = r5[r2]
            if (r7 != r2) goto L76
            r3 = 1
        L76:
            r2 = 4
            r2 = r5[r2]
            r7 = 8
            r7 = r5[r7]
            r8 = 5
            r8 = r5[r8]
            r9 = 6
            r9 = r5[r9]
            r10 = 7
            r10 = r5[r10]
            r11 = 12
            r11 = r5[r11]
            r12 = 13
            r12 = r5[r12]
            r13 = 9
            r13 = r5[r13]
            r15 = 14
            r5 = r5[r15]
            r16 = r4
            r4 = r2
            r2 = r16
            r16 = r13
            r13 = r5
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r16
            java.lang.String r0 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public static java.lang.String a(byte[] r1, boolean r2, boolean r3, boolean r4, int r5, int r6, boolean r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            r0 = 0
            if (r2 == 0) goto L6
            if (r5 <= 0) goto L6
            r2 = 0
        L6:
            if (r3 == 0) goto Lb
            if (r6 <= 0) goto Lb
            r3 = 0
        Lb:
            java.lang.String r5 = "UTF8"
            if (r2 == 0) goto L16
            if (r7 != 0) goto L15
            int r8 = r8 + r9
            int r8 = r8 + r10
            if (r8 <= 0) goto L16
        L15:
            return r5
        L16:
            java.lang.Boolean r1 = a(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L23
            java.lang.String r1 = "GBK"
            return r1
        L23:
            java.lang.String r1 = "SJIS"
            if (r3 == 0) goto L31
            boolean r6 = com.huawei.hms.scankit.p.c7.b
            if (r6 != 0) goto L30
            r6 = 3
            if (r11 >= r6) goto L30
            if (r12 < r6) goto L31
        L30:
            return r1
        L31:
            java.lang.String r6 = "ISO8859_1"
            if (r4 == 0) goto L42
            if (r3 == 0) goto L42
            r2 = 2
            if (r11 != r2) goto L3c
            if (r13 == r2) goto L40
        L3c:
            int r14 = r14 * 10
            if (r14 < r15) goto L41
        L40:
            return r1
        L41:
            return r6
        L42:
            if (r4 == 0) goto L49
            int r14 = r14 * 10
            if (r14 >= r15) goto L49
            return r6
        L49:
            if (r3 == 0) goto L4c
            return r1
        L4c:
            if (r2 == 0) goto L4f
            return r5
        L4f:
            if (r2 != 0) goto L5e
            java.lang.String r1 = com.huawei.hms.scankit.p.c7.a
            java.lang.String r2 = "UTF-8"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L5e
            java.lang.String r1 = "GB2312"
            return r1
        L5e:
            java.lang.String r1 = com.huawei.hms.scankit.p.c7.a
            return r1
    }

    private static void a(int r2, int[] r3) {
            r0 = 1
            r1 = r3[r0]
            if (r1 != r0) goto L28
            r1 = 127(0x7f, float:1.78E-43)
            if (r2 <= r1) goto L11
            r1 = 160(0xa0, float:2.24E-43)
            if (r2 >= r1) goto L11
            r2 = 0
            r3[r0] = r2
            return
        L11:
            r1 = 159(0x9f, float:2.23E-43)
            if (r2 <= r1) goto L28
            r1 = 192(0xc0, float:2.69E-43)
            if (r2 < r1) goto L21
            r1 = 215(0xd7, float:3.01E-43)
            if (r2 == r1) goto L21
            r1 = 247(0xf7, float:3.46E-43)
            if (r2 != r1) goto L28
        L21:
            r2 = 14
            r1 = r3[r2]
            int r1 = r1 + r0
            r3[r2] = r1
        L28:
            return
    }

    private static void b(int r8, int[] r9) {
            r0 = 2
            r1 = r9[r0]
            r2 = 1
            if (r1 != r2) goto L6b
            r1 = 8
            r3 = r9[r1]
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 0
            if (r3 <= 0) goto L21
            r6 = 64
            if (r8 < r6) goto L1e
            if (r8 == r4) goto L1e
            r4 = 252(0xfc, float:3.53E-43)
            if (r8 <= r4) goto L1a
            goto L1e
        L1a:
            int r3 = r3 - r2
            r9[r1] = r3
            return
        L1e:
            r9[r0] = r5
            return
        L21:
            r6 = 128(0x80, float:1.8E-43)
            if (r8 == r6) goto L69
            r6 = 160(0xa0, float:2.24E-43)
            if (r8 == r6) goto L69
            r7 = 239(0xef, float:3.35E-43)
            if (r8 <= r7) goto L2e
            goto L69
        L2e:
            r0 = 10
            r7 = 11
            if (r8 <= r6) goto L4f
            r6 = 224(0xe0, float:3.14E-43)
            if (r8 >= r6) goto L4f
            r8 = 9
            r1 = r9[r8]
            int r1 = r1 + r2
            r9[r8] = r1
            r9[r7] = r5
            r8 = r9[r0]
            int r8 = r8 + r2
            r9[r0] = r8
            r0 = 12
            r1 = r9[r0]
            if (r8 <= r1) goto L6b
            r9[r0] = r8
            return
        L4f:
            if (r8 <= r4) goto L64
            int r3 = r3 + r2
            r9[r1] = r3
            r9[r0] = r5
            r8 = r9[r7]
            int r8 = r8 + r2
            r9[r7] = r8
            r0 = 13
            r1 = r9[r0]
            if (r8 <= r1) goto L6b
            r9[r0] = r8
            return
        L64:
            r9[r0] = r5
            r9[r7] = r5
            return
        L69:
            r9[r0] = r5
        L6b:
            return
    }

    private static void c(int r6, int[] r7) {
            r0 = 3
            r1 = r7[r0]
            r2 = 1
            if (r1 != r2) goto L50
            r1 = 4
            r3 = r7[r1]
            r4 = 0
            if (r3 <= 0) goto L17
            r6 = r6 & 128(0x80, float:1.8E-43)
            if (r6 != 0) goto L13
            r7[r0] = r4
            return
        L13:
            int r3 = r3 - r2
            r7[r1] = r3
            return
        L17:
            r5 = r6 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L50
            r5 = r6 & 64
            if (r5 != 0) goto L22
            r7[r0] = r4
            return
        L22:
            int r5 = r3 + 1
            r7[r1] = r5
            r5 = r6 & 32
            if (r5 != 0) goto L31
            r6 = 5
            r0 = r7[r6]
            int r0 = r0 + r2
            r7[r6] = r0
            return
        L31:
            int r5 = r3 + 2
            r7[r1] = r5
            r5 = r6 & 16
            if (r5 != 0) goto L40
            r6 = 6
            r0 = r7[r6]
            int r0 = r0 + r2
            r7[r6] = r0
            return
        L40:
            int r3 = r3 + r0
            r7[r1] = r3
            r6 = r6 & 8
            if (r6 != 0) goto L4e
            r6 = 7
            r0 = r7[r6]
            int r0 = r0 + r2
            r7[r6] = r0
            return
        L4e:
            r7[r0] = r4
        L50:
            return
    }
}

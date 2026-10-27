package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Base64 {
    public static final char[] CA = null;
    public static final int[] IA = null;

    static {
            java.lang.String r0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            char[] r0 = r0.toCharArray()
            com.alibaba.fastjson.util.Base64.CA = r0
            r1 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r1]
            com.alibaba.fastjson.util.Base64.IA = r1
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L15:
            if (r2 >= r0) goto L22
            int[] r3 = com.alibaba.fastjson.util.Base64.IA
            char[] r4 = com.alibaba.fastjson.util.Base64.CA
            char r4 = r4[r2]
            r3[r4] = r2
            int r2 = r2 + 1
            goto L15
        L22:
            int[] r0 = com.alibaba.fastjson.util.Base64.IA
            r2 = 61
            r0[r2] = r1
            return
    }

    public Base64() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decodeFast(java.lang.String r17) {
            r0 = r17
            int r1 = r0.length()
            r2 = 0
            if (r1 != 0) goto Lc
            byte[] r0 = new byte[r2]
            return r0
        Lc:
            int r3 = r1 + (-1)
            r4 = 0
        Lf:
            if (r4 >= r3) goto L20
            int[] r5 = com.alibaba.fastjson.util.Base64.IA
            char r6 = r0.charAt(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5[r6]
            if (r5 >= 0) goto L20
            int r4 = r4 + 1
            goto Lf
        L20:
            if (r3 <= 0) goto L31
            int[] r5 = com.alibaba.fastjson.util.Base64.IA
            char r6 = r0.charAt(r3)
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5[r6]
            if (r5 >= 0) goto L31
            int r3 = r3 + (-1)
            goto L20
        L31:
            char r5 = r0.charAt(r3)
            r6 = 61
            r7 = 1
            if (r5 != r6) goto L46
            int r5 = r3 + (-1)
            char r5 = r0.charAt(r5)
            if (r5 != r6) goto L44
            r5 = 2
            goto L47
        L44:
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            int r6 = r3 - r4
            int r6 = r6 + r7
            r8 = 76
            if (r1 <= r8) goto L5c
            char r1 = r0.charAt(r8)
            r8 = 13
            if (r1 != r8) goto L59
            int r1 = r6 / 78
            goto L5a
        L59:
            r1 = 0
        L5a:
            int r1 = r1 << r7
            goto L5d
        L5c:
            r1 = 0
        L5d:
            int r6 = r6 - r1
            int r6 = r6 * 6
            int r6 = r6 >> 3
            int r6 = r6 - r5
            byte[] r8 = new byte[r6]
            int r9 = r6 / 3
            int r9 = r9 * 3
            r10 = 0
            r11 = 0
        L6b:
            if (r10 >= r9) goto Lba
            int[] r12 = com.alibaba.fastjson.util.Base64.IA
            int r13 = r4 + 1
            char r14 = r0.charAt(r4)
            r14 = r12[r14]
            int r14 = r14 << 18
            int r15 = r4 + 2
            char r13 = r0.charAt(r13)
            r13 = r12[r13]
            int r13 = r13 << 12
            r13 = r13 | r14
            int r14 = r4 + 3
            char r15 = r0.charAt(r15)
            r15 = r12[r15]
            int r15 = r15 << 6
            r13 = r13 | r15
            int r15 = r4 + 4
            char r14 = r0.charAt(r14)
            r12 = r12[r14]
            r12 = r12 | r13
            int r13 = r10 + 1
            int r14 = r12 >> 16
            byte r14 = (byte) r14
            r8[r10] = r14
            int r14 = r10 + 2
            int r2 = r12 >> 8
            byte r2 = (byte) r2
            r8[r13] = r2
            int r10 = r10 + 3
            byte r2 = (byte) r12
            r8[r14] = r2
            if (r1 <= 0) goto Lb7
            int r11 = r11 + 1
            r2 = 19
            if (r11 != r2) goto Lb7
            int r4 = r4 + 6
            r11 = 0
            goto Lb8
        Lb7:
            r4 = r15
        Lb8:
            r2 = 0
            goto L6b
        Lba:
            if (r10 >= r6) goto Le6
            r2 = 0
            r16 = 0
        Lbf:
            int r1 = r3 - r5
            if (r4 > r1) goto Ld7
            int[] r1 = com.alibaba.fastjson.util.Base64.IA
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            r1 = r1[r4]
            int r4 = r16 * 6
            int r4 = 18 - r4
            int r1 = r1 << r4
            r2 = r2 | r1
            int r16 = r16 + 1
            r4 = r9
            goto Lbf
        Ld7:
            r0 = 16
        Ld9:
            if (r10 >= r6) goto Le6
            int r1 = r10 + 1
            int r3 = r2 >> r0
            byte r3 = (byte) r3
            r8[r10] = r3
            int r0 = r0 + (-8)
            r10 = r1
            goto Ld9
        Le6:
            return r8
    }

    public static byte[] decodeFast(java.lang.String r17, int r18, int r19) {
            r0 = r17
            r1 = r19
            r2 = 0
            if (r1 != 0) goto La
            byte[] r0 = new byte[r2]
            return r0
        La:
            int r3 = r18 + r1
            r4 = 1
            int r3 = r3 - r4
            r5 = r18
        L10:
            if (r5 >= r3) goto L1f
            int[] r6 = com.alibaba.fastjson.util.Base64.IA
            char r7 = r0.charAt(r5)
            r6 = r6[r7]
            if (r6 >= 0) goto L1f
            int r5 = r5 + 1
            goto L10
        L1f:
            if (r3 <= 0) goto L2e
            int[] r6 = com.alibaba.fastjson.util.Base64.IA
            char r7 = r0.charAt(r3)
            r6 = r6[r7]
            if (r6 >= 0) goto L2e
            int r3 = r3 + (-1)
            goto L1f
        L2e:
            char r6 = r0.charAt(r3)
            r7 = 61
            if (r6 != r7) goto L42
            int r6 = r3 + (-1)
            char r6 = r0.charAt(r6)
            if (r6 != r7) goto L40
            r6 = 2
            goto L43
        L40:
            r6 = 1
            goto L43
        L42:
            r6 = 0
        L43:
            int r7 = r3 - r5
            int r7 = r7 + r4
            r8 = 76
            if (r1 <= r8) goto L58
            char r1 = r0.charAt(r8)
            r8 = 13
            if (r1 != r8) goto L55
            int r1 = r7 / 78
            goto L56
        L55:
            r1 = 0
        L56:
            int r1 = r1 << r4
            goto L59
        L58:
            r1 = 0
        L59:
            int r7 = r7 - r1
            int r7 = r7 * 6
            int r7 = r7 >> 3
            int r7 = r7 - r6
            byte[] r8 = new byte[r7]
            int r9 = r7 / 3
            int r9 = r9 * 3
            r10 = 0
            r11 = 0
        L67:
            if (r10 >= r9) goto Lb6
            int[] r12 = com.alibaba.fastjson.util.Base64.IA
            int r13 = r5 + 1
            char r14 = r0.charAt(r5)
            r14 = r12[r14]
            int r14 = r14 << 18
            int r15 = r5 + 2
            char r13 = r0.charAt(r13)
            r13 = r12[r13]
            int r13 = r13 << 12
            r13 = r13 | r14
            int r14 = r5 + 3
            char r15 = r0.charAt(r15)
            r15 = r12[r15]
            int r15 = r15 << 6
            r13 = r13 | r15
            int r15 = r5 + 4
            char r14 = r0.charAt(r14)
            r12 = r12[r14]
            r12 = r12 | r13
            int r13 = r10 + 1
            int r14 = r12 >> 16
            byte r14 = (byte) r14
            r8[r10] = r14
            int r14 = r10 + 2
            int r2 = r12 >> 8
            byte r2 = (byte) r2
            r8[r13] = r2
            int r10 = r10 + 3
            byte r2 = (byte) r12
            r8[r14] = r2
            if (r1 <= 0) goto Lb3
            int r11 = r11 + 1
            r2 = 19
            if (r11 != r2) goto Lb3
            int r5 = r5 + 6
            r11 = 0
            goto Lb4
        Lb3:
            r5 = r15
        Lb4:
            r2 = 0
            goto L67
        Lb6:
            if (r10 >= r7) goto Le2
            r2 = 0
            r16 = 0
        Lbb:
            int r1 = r3 - r6
            if (r5 > r1) goto Ld3
            int[] r1 = com.alibaba.fastjson.util.Base64.IA
            int r9 = r5 + 1
            char r5 = r0.charAt(r5)
            r1 = r1[r5]
            int r5 = r16 * 6
            int r5 = 18 - r5
            int r1 = r1 << r5
            r2 = r2 | r1
            int r16 = r16 + 1
            r5 = r9
            goto Lbb
        Ld3:
            r0 = 16
        Ld5:
            if (r10 >= r7) goto Le2
            int r1 = r10 + 1
            int r3 = r2 >> r0
            byte r3 = (byte) r3
            r8[r10] = r3
            int r0 = r0 + (-8)
            r10 = r1
            goto Ld5
        Le2:
            return r8
    }

    public static byte[] decodeFast(char[] r16, int r17, int r18) {
            r0 = r18
            r1 = 0
            if (r0 != 0) goto L8
            byte[] r0 = new byte[r1]
            return r0
        L8:
            int r2 = r17 + r0
            r3 = 1
            int r2 = r2 - r3
            r4 = r17
        Le:
            if (r4 >= r2) goto L1b
            int[] r5 = com.alibaba.fastjson.util.Base64.IA
            char r6 = r16[r4]
            r5 = r5[r6]
            if (r5 >= 0) goto L1b
            int r4 = r4 + 1
            goto Le
        L1b:
            if (r2 <= 0) goto L28
            int[] r5 = com.alibaba.fastjson.util.Base64.IA
            char r6 = r16[r2]
            r5 = r5[r6]
            if (r5 >= 0) goto L28
            int r2 = r2 + (-1)
            goto L1b
        L28:
            char r5 = r16[r2]
            r6 = 61
            if (r5 != r6) goto L38
            int r5 = r2 + (-1)
            char r5 = r16[r5]
            if (r5 != r6) goto L36
            r5 = 2
            goto L39
        L36:
            r5 = 1
            goto L39
        L38:
            r5 = 0
        L39:
            int r6 = r2 - r4
            int r6 = r6 + r3
            r7 = 76
            if (r0 <= r7) goto L4c
            char r0 = r16[r7]
            r7 = 13
            if (r0 != r7) goto L49
            int r0 = r6 / 78
            goto L4a
        L49:
            r0 = 0
        L4a:
            int r0 = r0 << r3
            goto L4d
        L4c:
            r0 = 0
        L4d:
            int r6 = r6 - r0
            int r6 = r6 * 6
            int r6 = r6 >> 3
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]
            int r8 = r6 / 3
            int r8 = r8 * 3
            r9 = 0
        L5a:
            r10 = 0
        L5b:
            if (r9 >= r8) goto La0
            int[] r11 = com.alibaba.fastjson.util.Base64.IA
            int r12 = r4 + 1
            char r13 = r16[r4]
            r13 = r11[r13]
            int r13 = r13 << 18
            int r14 = r4 + 2
            char r12 = r16[r12]
            r12 = r11[r12]
            int r12 = r12 << 12
            r12 = r12 | r13
            int r13 = r4 + 3
            char r14 = r16[r14]
            r14 = r11[r14]
            int r14 = r14 << 6
            r12 = r12 | r14
            int r14 = r4 + 4
            char r13 = r16[r13]
            r11 = r11[r13]
            r11 = r11 | r12
            int r12 = r9 + 1
            int r13 = r11 >> 16
            byte r13 = (byte) r13
            r7[r9] = r13
            int r13 = r9 + 2
            int r15 = r11 >> 8
            byte r15 = (byte) r15
            r7[r12] = r15
            int r9 = r9 + 3
            byte r11 = (byte) r11
            r7[r13] = r11
            if (r0 <= 0) goto L9e
            int r10 = r10 + 1
            r11 = 19
            if (r10 != r11) goto L9e
            int r4 = r4 + 6
            goto L5a
        L9e:
            r4 = r14
            goto L5b
        La0:
            if (r9 >= r6) goto Lc7
            r0 = 0
        La3:
            int r8 = r2 - r5
            if (r4 > r8) goto Lb8
            int[] r8 = com.alibaba.fastjson.util.Base64.IA
            int r10 = r4 + 1
            char r4 = r16[r4]
            r4 = r8[r4]
            int r8 = r0 * 6
            int r8 = 18 - r8
            int r4 = r4 << r8
            r1 = r1 | r4
            int r0 = r0 + r3
            r4 = r10
            goto La3
        Lb8:
            r0 = 16
        Lba:
            if (r9 >= r6) goto Lc7
            int r2 = r9 + 1
            int r3 = r1 >> r0
            byte r3 = (byte) r3
            r7[r9] = r3
            int r0 = r0 + (-8)
            r9 = r2
            goto Lba
        Lc7:
            return r7
    }
}

package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c {
    private static final byte[] a = null;

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            com.baidu.liantian.b.c.a = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] a(byte[] r17) {
            r0 = r17
            int r1 = r0.length
            int r2 = r1 / 4
            r3 = 3
            int r2 = r2 * 3
            r4 = 0
            if (r2 != 0) goto Le
            byte[] r0 = new byte[r4]
            return r0
        Le:
            byte[] r2 = new byte[r2]
            r5 = 0
        L11:
            int r6 = r1 + (-1)
            r6 = r0[r6]
            r7 = 10
            if (r6 == r7) goto Lc1
            r8 = 13
            if (r6 == r8) goto Lc1
            r9 = 32
            if (r6 == r9) goto Lc1
            r10 = 9
            if (r6 == r10) goto Lc1
            r11 = 61
            if (r6 != r11) goto L2d
            int r5 = r5 + 1
            goto Lc1
        L2d:
            r6 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L31:
            r15 = 16711680(0xff0000, float:2.3418052E-38)
            if (r6 >= r1) goto L9b
            r16 = 65280(0xff00, float:9.1477E-41)
            r14 = r0[r6]
            if (r14 == r7) goto L96
            if (r14 == r8) goto L96
            if (r14 == r9) goto L96
            if (r14 == r10) goto L96
            r7 = 65
            if (r14 < r7) goto L4d
            r7 = 90
            if (r14 > r7) goto L4d
            int r14 = r14 + (-65)
            goto L70
        L4d:
            r7 = 97
            if (r14 < r7) goto L58
            r7 = 122(0x7a, float:1.71E-43)
            if (r14 > r7) goto L58
            int r14 = r14 + (-71)
            goto L70
        L58:
            r7 = 48
            if (r14 < r7) goto L63
            r7 = 57
            if (r14 > r7) goto L63
            int r14 = r14 + 4
            goto L70
        L63:
            r7 = 43
            if (r14 != r7) goto L6a
            r14 = 62
            goto L70
        L6a:
            r7 = 47
            if (r14 != r7) goto L94
            r14 = 63
        L70:
            int r7 = r11 << 6
            byte r11 = (byte) r14
            r11 = r11 | r7
            int r7 = r13 % 4
            if (r7 != r3) goto L91
            int r7 = r12 + 1
            r14 = r11 & r15
            int r14 = r14 >> 16
            byte r14 = (byte) r14
            r2[r12] = r14
            int r14 = r12 + 2
            r15 = r11 & r16
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r2[r7] = r15
            int r12 = r12 + 3
            r7 = r11 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r14] = r7
        L91:
            int r13 = r13 + 1
            goto L96
        L94:
            r0 = 0
            return r0
        L96:
            int r6 = r6 + 1
            r7 = 10
            goto L31
        L9b:
            r16 = 65280(0xff00, float:9.1477E-41)
            if (r5 <= 0) goto Lbb
            int r0 = r5 * 6
            int r0 = r11 << r0
            int r1 = r12 + 1
            r3 = r0 & r15
            int r3 = r3 >> 16
            byte r3 = (byte) r3
            r2[r12] = r3
            r3 = 1
            if (r5 != r3) goto Lba
            int r12 = r12 + 2
            r0 = r0 & r16
            int r0 = r0 >> 8
            byte r0 = (byte) r0
            r2[r1] = r0
            goto Lbb
        Lba:
            r12 = r1
        Lbb:
            byte[] r0 = new byte[r12]
            java.lang.System.arraycopy(r2, r4, r0, r4, r12)
            return r0
        Lc1:
            int r1 = r1 + (-1)
            goto L11
    }
}

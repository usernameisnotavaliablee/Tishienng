package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g0 {
    private static int a = 4;

    static {
            return
    }

    public g0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] a(byte[] r6, byte[] r7) {
            int r0 = r6.length
            if (r0 != 0) goto L4
            return r6
        L4:
            int r0 = r6.length
            int r1 = com.amap.api.col.s.g0.a
            int r2 = r0 % r1
            int r2 = r1 - r2
            int r3 = r0 / r1
            int r3 = r3 + 1
            int r3 = r3 * r1
            byte[] r1 = new byte[r3]
            int r4 = r6.length
            r5 = 0
            java.lang.System.arraycopy(r6, r5, r1, r5, r4)
        L18:
            if (r0 >= r3) goto L20
            byte r6 = (byte) r2
            r1[r0] = r6
            int r0 = r0 + 1
            goto L18
        L20:
            int[] r6 = c(r1)
            int[] r7 = c(r7)
            int[] r6 = d(r6, r7)
            byte[] r6 = b(r6)
            return r6
    }

    private static byte[] b(int[] r5) {
            int r0 = r5.length
            int r0 = r0 << 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L6:
            if (r2 >= r0) goto L19
            int r3 = r2 >>> 2
            r3 = r5[r3]
            r4 = r2 & 3
            int r4 = r4 << 3
            int r3 = r3 >>> r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L6
        L19:
            return r1
    }

    private static int[] c(byte[] r7) {
            int r0 = r7.length
            int r0 = r0 >>> 2
            int[] r0 = new int[r0]
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1c
            int r3 = r2 >>> 2
            r4 = r0[r3]
            r5 = r7[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r2 & 3
            int r6 = r6 << 3
            int r5 = r5 << r6
            r4 = r4 | r5
            r0[r3] = r4
            int r2 = r2 + 1
            goto L7
        L1c:
            return r0
    }

    private static int[] d(int[] r13, int[] r14) {
            int r0 = r13.length
            int r1 = r0 + (-1)
            if (r1 > 0) goto L6
            goto L67
        L6:
            int r2 = r14.length
            r3 = 4
            r4 = 0
            if (r2 >= r3) goto L12
            int[] r2 = new int[r3]
            int r3 = r14.length
            java.lang.System.arraycopy(r14, r4, r2, r4, r3)
            r14 = r2
        L12:
            r2 = r13[r1]
            r3 = 52
            int r3 = r3 / r0
            int r3 = r3 + 6
            r0 = 0
        L1a:
            int r5 = r3 + (-1)
            if (r3 <= 0) goto L67
            r3 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r0 = r0 + r3
            int r3 = r0 >>> 2
            r3 = r3 & 3
            r6 = 0
        L27:
            if (r6 >= r1) goto L49
            int r7 = r6 + 1
            r8 = r13[r7]
            r9 = r13[r6]
            int r10 = r2 >>> 5
            int r11 = r8 << 2
            r10 = r10 ^ r11
            int r11 = r8 >>> 3
            int r12 = r2 << 4
            r11 = r11 ^ r12
            int r10 = r10 + r11
            r8 = r8 ^ r0
            r11 = r6 & 3
            r11 = r11 ^ r3
            r11 = r14[r11]
            r2 = r2 ^ r11
            int r8 = r8 + r2
            r2 = r10 ^ r8
            int r2 = r2 + r9
            r13[r6] = r2
            r6 = r7
            goto L27
        L49:
            r7 = r13[r4]
            r8 = r13[r1]
            int r9 = r2 >>> 5
            int r10 = r7 << 2
            r9 = r9 ^ r10
            int r10 = r7 >>> 3
            int r11 = r2 << 4
            r10 = r10 ^ r11
            int r9 = r9 + r10
            r7 = r7 ^ r0
            r6 = r6 & 3
            r3 = r3 ^ r6
            r3 = r14[r3]
            r2 = r2 ^ r3
            int r7 = r7 + r2
            r2 = r9 ^ r7
            int r2 = r2 + r8
            r13[r1] = r2
            r3 = r5
            goto L1a
        L67:
            return r13
    }
}

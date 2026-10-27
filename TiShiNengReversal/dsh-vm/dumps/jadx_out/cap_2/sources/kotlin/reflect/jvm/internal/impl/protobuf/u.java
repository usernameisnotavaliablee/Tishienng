package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class u {
    private static int a(int r1) {
            r0 = -12
            if (r1 <= r0) goto L5
            r1 = -1
        L5:
            return r1
    }

    private static int b(int r1, int r2) {
            r0 = -12
            if (r1 > r0) goto Ld
            r0 = -65
            if (r2 <= r0) goto L9
            goto Ld
        L9:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            return r1
        Ld:
            r1 = -1
            return r1
    }

    private static int c(int r1, int r2, int r3) {
            r0 = -12
            if (r1 > r0) goto L12
            r0 = -65
            if (r2 > r0) goto L12
            if (r3 <= r0) goto Lb
            goto L12
        Lb:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            int r2 = r3 << 16
            r1 = r1 ^ r2
            return r1
        L12:
            r1 = -1
            return r1
    }

    private static int d(byte[] r3, int r4, int r5) {
            int r0 = r4 + (-1)
            r0 = r3[r0]
            int r5 = r5 - r4
            if (r5 == 0) goto L24
            r1 = 1
            if (r5 == r1) goto L1d
            r2 = 2
            if (r5 != r2) goto L17
            r5 = r3[r4]
            int r4 = r4 + r1
            r3 = r3[r4]
            int r3 = c(r0, r5, r3)
            return r3
        L17:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1d:
            r3 = r3[r4]
            int r3 = b(r0, r3)
            return r3
        L24:
            int r3 = a(r0)
            return r3
    }

    public static boolean e(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            boolean r2 = f(r2, r0, r1)
            return r2
    }

    public static boolean f(byte[] r0, int r1, int r2) {
            int r0 = h(r0, r1, r2)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static int g(int r6, byte[] r7, int r8, int r9) {
            if (r6 == 0) goto L86
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L86
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = b(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L5a
            int r6 = b(r0, r1)
            return r6
        L5a:
            r8 = 0
            goto L62
        L5c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L62:
            if (r8 != 0) goto L72
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r8 < r9) goto L6f
            int r6 = c(r0, r1, r6)
            return r6
        L6f:
            r5 = r8
            r8 = r6
            r6 = r5
        L72:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L85
            if (r8 > r3) goto L85
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r6 <= r3) goto L86
        L85:
            return r2
        L86:
            int r6 = h(r7, r8, r9)
            return r6
    }

    public static int h(byte[] r1, int r2, int r3) {
        L0:
            if (r2 >= r3) goto L9
            r0 = r1[r2]
            if (r0 < 0) goto L9
            int r2 = r2 + 1
            goto L0
        L9:
            if (r2 < r3) goto Ld
            r1 = 0
            return r1
        Ld:
            int r1 = i(r1, r2, r3)
            return r1
    }

    private static int i(byte[] r7, int r8, int r9) {
        L0:
            if (r8 < r9) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r8 + 1
            r1 = r7[r8]
            if (r1 >= 0) goto L6a
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L1f
            if (r0 < r9) goto L14
            return r1
        L14:
            r2 = -62
            if (r1 < r2) goto L1e
            int r8 = r8 + 2
            r0 = r7[r0]
            if (r0 <= r4) goto L0
        L1e:
            return r3
        L1f:
            r5 = -16
            if (r1 >= r5) goto L45
            int r5 = r9 + (-1)
            if (r0 < r5) goto L2c
            int r7 = d(r7, r0, r9)
            return r7
        L2c:
            int r5 = r8 + 2
            r0 = r7[r0]
            if (r0 > r4) goto L44
            r6 = -96
            if (r1 != r2) goto L38
            if (r0 < r6) goto L44
        L38:
            r2 = -19
            if (r1 != r2) goto L3e
            if (r0 >= r6) goto L44
        L3e:
            int r8 = r8 + 3
            r0 = r7[r5]
            if (r0 <= r4) goto L0
        L44:
            return r3
        L45:
            int r2 = r9 + (-2)
            if (r0 < r2) goto L4e
            int r7 = d(r7, r0, r9)
            return r7
        L4e:
            int r2 = r8 + 2
            r0 = r7[r0]
            if (r0 > r4) goto L69
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L69
            int r0 = r8 + 3
            r1 = r7[r2]
            if (r1 > r4) goto L69
            int r8 = r8 + 4
            r0 = r7[r0]
            if (r0 <= r4) goto L0
        L69:
            return r3
        L6a:
            r8 = r0
            goto L0
    }
}

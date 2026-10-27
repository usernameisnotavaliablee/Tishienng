package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class y1 {
    private final java.lang.CharSequence a;
    private final int b;
    private final int c;
    private final byte[] d;

    public y1(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.b = r3
            int r2 = r2 * r3
            byte[] r1 = new byte[r2]
            r0.d = r1
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            return
    }

    private void a(int r7) {
            r6 = this;
            int r0 = r6.b
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r6.a(r0, r2, r7, r1)
            int r0 = r6.b
            int r0 = r0 - r1
            r3 = 2
            r6.a(r0, r1, r7, r3)
            int r0 = r6.b
            int r0 = r0 - r1
            r4 = 3
            r6.a(r0, r3, r7, r4)
            int r0 = r6.c
            int r0 = r0 - r3
            r5 = 4
            r6.a(r2, r0, r7, r5)
            int r0 = r6.c
            int r0 = r0 - r1
            r5 = 5
            r6.a(r2, r0, r7, r5)
            int r0 = r6.c
            int r0 = r0 - r1
            r2 = 6
            r6.a(r1, r0, r7, r2)
            int r0 = r6.c
            int r0 = r0 - r1
            r2 = 7
            r6.a(r3, r0, r7, r2)
            int r0 = r6.c
            int r0 = r0 - r1
            r1 = 8
            r6.a(r4, r0, r7, r1)
            return
    }

    private void a(int r5, int r6, int r7) {
            r4 = this;
            int r0 = r5 + (-2)
            int r1 = r6 + (-2)
            r2 = 1
            r4.a(r0, r1, r7, r2)
            int r2 = r6 + (-1)
            r3 = 2
            r4.a(r0, r2, r7, r3)
            int r0 = r5 + (-1)
            r3 = 3
            r4.a(r0, r1, r7, r3)
            r3 = 4
            r4.a(r0, r2, r7, r3)
            r3 = 5
            r4.a(r0, r6, r7, r3)
            r0 = 6
            r4.a(r5, r1, r7, r0)
            r0 = 7
            r4.a(r5, r2, r7, r0)
            r0 = 8
            r4.a(r5, r6, r7, r0)
            return
    }

    private void a(int r2, int r3, int r4, int r5) {
            r1 = this;
            if (r2 >= 0) goto Lc
            int r0 = r1.b
            int r2 = r2 + r0
            int r0 = r0 + 4
            int r0 = r0 % 8
            int r0 = 4 - r0
            int r3 = r3 + r0
        Lc:
            if (r3 >= 0) goto L18
            int r0 = r1.c
            int r3 = r3 + r0
            int r0 = r0 + 4
            int r0 = r0 % 8
            int r0 = 4 - r0
            int r2 = r2 + r0
        L18:
            java.lang.CharSequence r0 = r1.a
            char r4 = r0.charAt(r4)
            int r5 = 8 - r5
            r0 = 1
            int r5 = r0 << r5
            r4 = r4 & r5
            if (r4 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            r1.a(r3, r2, r0)
            return
    }

    private void a(int r3, int r4, boolean r5) {
            r2 = this;
            byte[] r0 = r2.d
            int r1 = r2.c
            int r4 = r4 * r1
            int r4 = r4 + r3
            byte r3 = (byte) r5
            r0[r4] = r3
            return
    }

    private void b(int r7) {
            r6 = this;
            int r0 = r6.b
            r1 = 3
            int r0 = r0 - r1
            r2 = 0
            r3 = 1
            r6.a(r0, r2, r7, r3)
            int r0 = r6.b
            r4 = 2
            int r0 = r0 - r4
            r6.a(r0, r2, r7, r4)
            int r0 = r6.b
            int r0 = r0 - r3
            r6.a(r0, r2, r7, r1)
            int r0 = r6.c
            r5 = 4
            int r0 = r0 - r5
            r6.a(r2, r0, r7, r5)
            int r0 = r6.c
            int r0 = r0 - r1
            r1 = 5
            r6.a(r2, r0, r7, r1)
            int r0 = r6.c
            int r0 = r0 - r4
            r1 = 6
            r6.a(r2, r0, r7, r1)
            int r0 = r6.c
            int r0 = r0 - r3
            r1 = 7
            r6.a(r2, r0, r7, r1)
            int r0 = r6.c
            int r0 = r0 - r3
            r1 = 8
            r6.a(r3, r0, r7, r1)
            return
    }

    private boolean b(int r3, int r4) {
            r2 = this;
            byte[] r0 = r2.d
            int r1 = r2.c
            int r4 = r4 * r1
            int r4 = r4 + r3
            r3 = r0[r4]
            if (r3 < 0) goto Ld
            r3 = 1
            return r3
        Ld:
            r3 = 0
            return r3
    }

    private void c(int r7) {
            r6 = this;
            int r0 = r6.b
            r1 = 3
            int r0 = r0 - r1
            r2 = 0
            r3 = 1
            r6.a(r0, r2, r7, r3)
            int r0 = r6.b
            r4 = 2
            int r0 = r0 - r4
            r6.a(r0, r2, r7, r4)
            int r0 = r6.b
            int r0 = r0 - r3
            r6.a(r0, r2, r7, r1)
            int r0 = r6.c
            int r0 = r0 - r4
            r5 = 4
            r6.a(r2, r0, r7, r5)
            int r0 = r6.c
            int r0 = r0 - r3
            r5 = 5
            r6.a(r2, r0, r7, r5)
            int r0 = r6.c
            int r0 = r0 - r3
            r2 = 6
            r6.a(r3, r0, r7, r2)
            int r0 = r6.c
            int r0 = r0 - r3
            r2 = 7
            r6.a(r4, r0, r7, r2)
            int r0 = r6.c
            int r0 = r0 - r3
            r2 = 8
            r6.a(r1, r0, r7, r2)
            return
    }

    private void d(int r7) {
            r6 = this;
            int r0 = r6.b
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r6.a(r0, r2, r7, r1)
            int r0 = r6.b
            int r0 = r0 - r1
            int r3 = r6.c
            int r3 = r3 - r1
            r4 = 2
            r6.a(r0, r3, r7, r4)
            int r0 = r6.c
            r3 = 3
            int r0 = r0 - r3
            r6.a(r2, r0, r7, r3)
            int r0 = r6.c
            int r0 = r0 - r4
            r5 = 4
            r6.a(r2, r0, r7, r5)
            int r0 = r6.c
            int r0 = r0 - r1
            r5 = 5
            r6.a(r2, r0, r7, r5)
            int r0 = r6.c
            int r0 = r0 - r3
            r2 = 6
            r6.a(r1, r0, r7, r2)
            int r0 = r6.c
            int r0 = r0 - r4
            r2 = 7
            r6.a(r1, r0, r7, r2)
            int r0 = r6.c
            int r0 = r0 - r1
            r2 = 8
            r6.a(r1, r0, r7, r2)
            return
    }

    public final void a() {
            r8 = this;
            r0 = 0
            r1 = 4
            r2 = 0
            r3 = 4
        L4:
            int r4 = r8.b
            if (r3 != r4) goto L10
            if (r0 != 0) goto L10
            int r4 = r2 + 1
            r8.a(r2)
            r2 = r4
        L10:
            int r4 = r8.b
            r5 = 2
            int r4 = r4 - r5
            if (r3 != r4) goto L23
            if (r0 != 0) goto L23
            int r4 = r8.c
            int r4 = r4 % r1
            if (r4 == 0) goto L23
            int r4 = r2 + 1
            r8.b(r2)
            r2 = r4
        L23:
            int r4 = r8.b
            int r4 = r4 - r5
            if (r3 != r4) goto L36
            if (r0 != 0) goto L36
            int r4 = r8.c
            int r4 = r4 % 8
            if (r4 != r1) goto L36
            int r4 = r2 + 1
            r8.c(r2)
            r2 = r4
        L36:
            int r4 = r8.b
            int r4 = r4 + r1
            if (r3 != r4) goto L49
            if (r0 != r5) goto L49
            int r4 = r8.c
            int r4 = r4 % 8
            if (r4 != 0) goto L49
            int r4 = r2 + 1
            r8.d(r2)
            r2 = r4
        L49:
            int r4 = r8.b
            if (r3 >= r4) goto L5b
            if (r0 < 0) goto L5b
            boolean r4 = r8.b(r0, r3)
            if (r4 != 0) goto L5b
            int r4 = r2 + 1
            r8.a(r3, r0, r2)
            r2 = r4
        L5b:
            int r4 = r3 + (-2)
            int r6 = r0 + 2
            if (r4 < 0) goto L69
            int r7 = r8.c
            if (r6 < r7) goto L66
            goto L69
        L66:
            r3 = r4
            r0 = r6
            goto L49
        L69:
            int r3 = r3 + (-1)
            int r0 = r0 + 5
        L6d:
            if (r3 < 0) goto L7f
            int r4 = r8.c
            if (r0 >= r4) goto L7f
            boolean r4 = r8.b(r0, r3)
            if (r4 != 0) goto L7f
            int r4 = r2 + 1
            r8.a(r3, r0, r2)
            r2 = r4
        L7f:
            int r4 = r3 + 2
            int r6 = r0 + (-2)
            int r7 = r8.b
            if (r4 >= r7) goto L8d
            if (r6 >= 0) goto L8a
            goto L8d
        L8a:
            r3 = r4
            r0 = r6
            goto L6d
        L8d:
            int r3 = r3 + 5
            int r0 = r0 + (-1)
            if (r3 < r7) goto L4
            int r4 = r8.c
            if (r0 < r4) goto L4
            r0 = 1
            int r4 = r4 - r0
            int r7 = r7 - r0
            boolean r1 = r8.b(r4, r7)
            if (r1 != 0) goto Lb2
            int r1 = r8.c
            int r1 = r1 - r0
            int r2 = r8.b
            int r2 = r2 - r0
            r8.a(r1, r2, r0)
            int r1 = r8.c
            int r1 = r1 - r5
            int r2 = r8.b
            int r2 = r2 - r5
            r8.a(r1, r2, r0)
        Lb2:
            return
    }

    public final boolean a(int r3, int r4) {
            r2 = this;
            byte[] r0 = r2.d
            int r1 = r2.c
            int r4 = r4 * r1
            int r4 = r4 + r3
            r3 = r0[r4]
            r4 = 1
            if (r3 != r4) goto Ld
            return r4
        Ld:
            r3 = 0
            return r3
    }
}

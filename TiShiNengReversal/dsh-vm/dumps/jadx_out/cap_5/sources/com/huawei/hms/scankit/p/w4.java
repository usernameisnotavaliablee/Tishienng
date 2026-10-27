package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class w4 {
    public static final com.huawei.hms.scankit.p.w4 f = null;
    private final int[] a;
    private final int[] b;
    private final com.huawei.hms.scankit.p.x4 c;
    private final com.huawei.hms.scankit.p.x4 d;
    private final int e;

    static {
            com.huawei.hms.scankit.p.w4 r0 = new com.huawei.hms.scankit.p.w4
            r1 = 929(0x3a1, float:1.302E-42)
            r2 = 3
            r0.<init>(r1, r2)
            com.huawei.hms.scankit.p.w4.f = r0
            return
    }

    private w4(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.e = r6
            int[] r0 = new int[r6]
            r5.a = r0
            int[] r0 = new int[r6]
            r5.b = r0
            r0 = 1
            r1 = 0
            r2 = 0
            r3 = 1
        L11:
            if (r2 >= r6) goto L1d
            int[] r4 = r5.a
            r4[r2] = r3
            int r3 = r3 * r7
            int r3 = r3 % r6
            int r2 = r2 + 1
            goto L11
        L1d:
            r7 = 0
        L1e:
            int r2 = r6 + (-1)
            if (r7 >= r2) goto L2d
            int[] r2 = r5.b
            int[] r3 = r5.a
            r3 = r3[r7]
            r2[r3] = r7
            int r7 = r7 + 1
            goto L1e
        L2d:
            com.huawei.hms.scankit.p.x4 r6 = new com.huawei.hms.scankit.p.x4
            int[] r7 = new int[]{r1}
            r6.<init>(r5, r7)
            r5.c = r6
            com.huawei.hms.scankit.p.x4 r6 = new com.huawei.hms.scankit.p.x4
            int[] r7 = new int[]{r0}
            r6.<init>(r5, r7)
            r5.d = r6
            return
    }

    int a(int r2) {
            r1 = this;
            int[] r0 = r1.a
            r2 = r0[r2]
            return r2
    }

    int a(int r1, int r2) {
            r0 = this;
            int r1 = r1 + r2
            int r2 = r0.e
            int r1 = r1 % r2
            return r1
    }

    com.huawei.hms.scankit.p.x4 a() {
            r1 = this;
            com.huawei.hms.scankit.p.x4 r0 = r1.d
            return r0
    }

    int b() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    int b(int r4) {
            r3 = this;
            if (r4 == 0) goto L10
            int[] r0 = r3.a
            int r1 = r3.e
            int[] r2 = r3.b
            r4 = r2[r4]
            int r1 = r1 - r4
            int r1 = r1 + (-1)
            r4 = r0[r1]
            return r4
        L10:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            r4.<init>()
            throw r4
    }

    com.huawei.hms.scankit.p.x4 b(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L14
            if (r3 != 0) goto L7
            com.huawei.hms.scankit.p.x4 r2 = r1.c
            return r2
        L7:
            int r2 = r2 + 1
            int[] r2 = new int[r2]
            r0 = 0
            r2[r0] = r3
            com.huawei.hms.scankit.p.x4 r3 = new com.huawei.hms.scankit.p.x4
            r3.<init>(r1, r2)
            return r3
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    int c(int r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int[] r0 = r1.b
            r2 = r0[r2]
            return r2
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    int c(int r3, int r4) {
            r2 = this;
            if (r3 <= 0) goto L16
            if (r4 > 0) goto L5
            goto L16
        L5:
            int[] r0 = r2.a
            int[] r1 = r2.b
            r3 = r1[r3]
            r4 = r1[r4]
            int r3 = r3 + r4
            int r4 = r2.e
            int r4 = r4 + (-1)
            int r3 = r3 % r4
            r3 = r0[r3]
            return r3
        L16:
            r3 = 0
            return r3
    }

    com.huawei.hms.scankit.p.x4 c() {
            r1 = this;
            com.huawei.hms.scankit.p.x4 r0 = r1.c
            return r0
    }

    int d(int r2, int r3) {
            r1 = this;
            int r0 = r1.e
            int r2 = r2 + r0
            int r2 = r2 - r3
            int r2 = r2 % r0
            return r2
    }
}

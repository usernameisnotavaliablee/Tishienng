package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j {
    private final com.huawei.hms.scankit.p.l[] a;
    private int b;
    private final int c;
    private final int d;

    j(int r5, int r6) {
            r4 = this;
            r4.<init>()
            com.huawei.hms.scankit.p.l[] r0 = new com.huawei.hms.scankit.p.l[r5]
            r4.a = r0
            r0 = 0
        L8:
            if (r0 >= r5) goto L1c
            com.huawei.hms.scankit.p.l[] r1 = r4.a
            com.huawei.hms.scankit.p.l r2 = new com.huawei.hms.scankit.p.l
            int r3 = r6 + 4
            int r3 = r3 * 17
            int r3 = r3 + 1
            r2.<init>(r3)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L8
        L1c:
            int r6 = r6 * 17
            r4.d = r6
            r4.c = r5
            r5 = -1
            r4.b = r5
            return
    }

    com.huawei.hms.scankit.p.l a() {
            r3 = this;
            int r0 = r3.b
            if (r0 < 0) goto Lc
            com.huawei.hms.scankit.p.l[] r1 = r3.a
            int r2 = r1.length
            if (r0 >= r2) goto Lc
            r0 = r1[r0]
            return r0
        Lc:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public byte[][] a(int r8, int r9) {
            r7 = this;
            int r0 = r7.c
            int r0 = r0 * r9
            int r1 = r7.d
            int r1 = r1 * r8
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class r4 = java.lang.Byte.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r4, r2)
            byte[][] r2 = (byte[][]) r2
        L19:
            if (r1 >= r0) goto L2d
            int r4 = r0 - r1
            int r4 = r4 - r3
            com.huawei.hms.scankit.p.l[] r5 = r7.a
            int r6 = r1 / r9
            r5 = r5[r6]
            byte[] r5 = r5.a(r8)
            r2[r4] = r5
            int r1 = r1 + 1
            goto L19
        L2d:
            return r2
    }

    void b() {
            r1 = this;
            int r0 = r1.b
            int r0 = r0 + 1
            r1.b = r0
            return
    }
}

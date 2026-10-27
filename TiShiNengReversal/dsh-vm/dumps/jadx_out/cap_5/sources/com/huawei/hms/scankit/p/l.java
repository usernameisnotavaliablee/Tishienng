package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class l {
    private final byte[] a;
    private int b;

    l(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.a = r1
            r1 = 0
            r0.b = r1
            return
    }

    private void a(int r2, boolean r3) {
            r1 = this;
            byte[] r0 = r1.a
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r2)
            if (r0 == 0) goto Le
            byte[] r0 = r1.a
            byte r3 = (byte) r3
            r0[r2] = r3
            return
        Le:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    void a(boolean r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r5) goto Lf
            int r1 = r3.b
            int r2 = r1 + 1
            r3.b = r2
            r3.a(r1, r4)
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    byte[] a(int r6) {
            r5 = this;
            byte[] r0 = r5.a
            int r0 = r0.length
            int r0 = r0 * r6
            byte[] r1 = new byte[r0]
            r2 = 0
        L8:
            if (r2 >= r0) goto L15
            byte[] r3 = r5.a
            int r4 = r2 / r6
            r3 = r3[r4]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L15:
            return r1
    }
}

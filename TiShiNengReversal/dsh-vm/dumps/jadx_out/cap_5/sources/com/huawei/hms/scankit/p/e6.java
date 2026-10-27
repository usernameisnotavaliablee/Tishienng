package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e6 extends com.huawei.hms.scankit.p.p4 {
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public e6(byte[] r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9) {
            r1 = this;
            r1.<init>(r7, r8)
            int r0 = r5 + r7
            if (r0 > r3) goto L1b
            int r0 = r6 + r8
            if (r0 > r4) goto L1b
            r1.c = r2
            r1.d = r3
            r1.e = r4
            r1.f = r5
            r1.g = r6
            if (r9 == 0) goto L1a
            r1.a(r7, r8)
        L1a:
            return
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Crop rectangle does not fit within image data."
            r2.<init>(r3)
            throw r2
    }

    private void a(int r9, int r10) {
            r8 = this;
            byte[] r0 = r8.c
            int r1 = r8.g
            int r2 = r8.d
            int r1 = r1 * r2
            int r2 = r8.f
            int r1 = r1 + r2
            r2 = 0
        Lc:
            if (r2 >= r10) goto L37
            int r3 = r9 / 2
            int r3 = r3 + r1
            int r4 = r1 + r9
            int r4 = r4 + (-1)
            r5 = r1
        L16:
            if (r5 >= r3) goto L31
            boolean r6 = com.huawei.hms.scankit.p.w7.a(r0, r5)
            if (r6 == 0) goto L2c
            boolean r6 = com.huawei.hms.scankit.p.w7.a(r0, r4)
            if (r6 == 0) goto L2c
            r6 = r0[r5]
            r7 = r0[r4]
            r0[r5] = r7
            r0[r4] = r6
        L2c:
            int r5 = r5 + 1
            int r4 = r4 + (-1)
            goto L16
        L31:
            int r2 = r2 + 1
            int r3 = r8.d
            int r1 = r1 + r3
            goto Lc
        L37:
            return
    }

    @Override // com.huawei.hms.scankit.p.p4
    public com.huawei.hms.scankit.p.p4 a(int r10, int r11, int r12, int r13) {
            r9 = this;
            com.huawei.hms.scankit.p.e6 r0 = new com.huawei.hms.scankit.p.e6
            byte[] r1 = r9.c
            int r2 = r9.d
            int r3 = r9.e
            int r4 = r9.f
            int r4 = r4 + r10
            int r10 = r9.g
            int r5 = r10 + r11
            r8 = 0
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] a(int r4, byte[] r5) {
            r3 = this;
            if (r4 < 0) goto L24
            int r0 = r3.a()
            if (r4 >= r0) goto L24
            int r0 = r3.c()
            if (r5 == 0) goto L11
            int r1 = r5.length
            if (r1 >= r0) goto L13
        L11:
            byte[] r5 = new byte[r0]
        L13:
            int r1 = r3.g
            int r4 = r4 + r1
            int r1 = r3.d
            int r4 = r4 * r1
            int r1 = r3.f
            int r4 = r4 + r1
            byte[] r1 = r3.c
            r2 = 0
            java.lang.System.arraycopy(r1, r4, r5, r2, r0)
            return r5
        L24:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Requested row is outside the image: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] b() {
            r8 = this;
            int r0 = r8.c()
            int r1 = r8.a()
            int r2 = r8.d
            if (r0 != r2) goto L13
            int r3 = r8.e
            if (r1 != r3) goto L13
            byte[] r0 = r8.c
            return r0
        L13:
            int r3 = r0 * r1
            byte[] r4 = new byte[r3]
            int r5 = r8.g
            int r5 = r5 * r2
            int r6 = r8.f
            int r5 = r5 + r6
            r6 = 0
            r7 = 0
            if (r0 != r2) goto L29
            byte[] r0 = r8.c     // Catch: java.lang.Throwable -> L28
            java.lang.System.arraycopy(r0, r5, r4, r6, r3)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            return r7
        L29:
            if (r6 >= r1) goto L39
            int r2 = r6 * r0
            byte[] r3 = r8.c     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r3, r5, r4, r2, r0)     // Catch: java.lang.Throwable -> L38
            int r2 = r8.d     // Catch: java.lang.Throwable -> L38
            int r5 = r5 + r2
            int r6 = r6 + 1
            goto L29
        L38:
            return r7
        L39:
            return r4
    }
}

package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class w {
    private final byte[] a;
    private int b;
    private int c;

    public w(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public int a() {
            r2 = this;
            byte[] r0 = r2.a
            int r0 = r0.length
            int r1 = r2.b
            int r0 = r0 - r1
            int r0 = r0 * 8
            int r1 = r2.c
            int r0 = r0 - r1
            return r0
    }

    public int a(int r10) {
            r9 = this;
            r0 = 1
            if (r10 < r0) goto L8b
            r1 = 32
            if (r10 > r1) goto L8b
            int r1 = r9.a()
            if (r10 > r1) goto L8b
            int r1 = r9.c
            r2 = 0
            r3 = 255(0xff, float:3.57E-43)
            r4 = 8
            if (r1 <= 0) goto L48
            int r1 = 8 - r1
            if (r10 >= r1) goto L1c
            r5 = r10
            goto L1d
        L1c:
            r5 = r1
        L1d:
            int r1 = r1 - r5
            int r6 = 8 - r5
            int r6 = r3 >> r6
            int r6 = r6 << r1
            byte[] r7 = r9.a
            int r8 = r9.b
            boolean r7 = com.huawei.hms.scankit.p.w7.a(r7, r8)
            if (r7 == 0) goto L37
            byte[] r7 = r9.a
            int r8 = r9.b
            r7 = r7[r8]
            r6 = r6 & r7
            int r1 = r6 >> r1
            goto L38
        L37:
            r1 = 0
        L38:
            int r10 = r10 - r5
            int r6 = r9.c
            int r6 = r6 + r5
            r9.c = r6
            if (r6 != r4) goto L47
            r9.c = r2
            int r2 = r9.b
            int r2 = r2 + r0
            r9.b = r2
        L47:
            r2 = r1
        L48:
            if (r10 <= 0) goto L8a
        L4a:
            if (r10 < r4) goto L69
            byte[] r1 = r9.a
            int r5 = r9.b
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r5)
            if (r1 == 0) goto L61
            int r1 = r2 << 8
            byte[] r2 = r9.a
            int r5 = r9.b
            r2 = r2[r5]
            r2 = r2 & r3
            r1 = r1 | r2
            r2 = r1
        L61:
            int r1 = r9.b
            int r1 = r1 + r0
            r9.b = r1
            int r10 = r10 + (-8)
            goto L4a
        L69:
            if (r10 <= 0) goto L8a
            int r0 = 8 - r10
            int r1 = r3 >> r0
            int r1 = r1 << r0
            byte[] r3 = r9.a
            int r4 = r9.b
            boolean r3 = com.huawei.hms.scankit.p.w7.a(r3, r4)
            if (r3 == 0) goto L85
            int r2 = r2 << r10
            byte[] r3 = r9.a
            int r4 = r9.b
            r3 = r3[r4]
            r1 = r1 & r3
            int r0 = r1 >> r0
            r2 = r2 | r0
        L85:
            int r0 = r9.c
            int r0 = r0 + r10
            r9.c = r0
        L8a:
            return r2
        L8b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            throw r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }
}

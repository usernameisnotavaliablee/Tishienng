package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t1 {
    private final com.huawei.hms.scankit.p.p6 a;
    private com.huawei.hms.scankit.p.z7 b;

    public t1() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            com.huawei.hms.scankit.p.p6 r0 = new com.huawei.hms.scankit.p.p6
            com.huawei.hms.scankit.p.o3 r1 = com.huawei.hms.scankit.p.o3.m
            r0.<init>(r1)
            r2.a = r0
            return
    }

    private void a(byte[] r6, int r7) throws com.huawei.hms.scankit.p.a {
            r5 = this;
            int r0 = r6.length
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r0) goto L10
            r4 = r6[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L5
        L10:
            com.huawei.hms.scankit.p.p6 r0 = r5.a     // Catch: com.huawei.hms.scankit.p.a -> L22
            int r3 = r6.length     // Catch: com.huawei.hms.scankit.p.a -> L22
            int r3 = r3 - r7
            r0.a(r1, r3)     // Catch: com.huawei.hms.scankit.p.a -> L22
        L17:
            if (r2 >= r7) goto L21
            r0 = r1[r2]
            byte r0 = (byte) r0
            r6[r2] = r0
            int r2 = r2 + 1
            goto L17
        L21:
            return
        L22:
            com.huawei.hms.scankit.p.a r6 = com.huawei.hms.scankit.p.a.a()
            throw r6
    }

    public com.huawei.hms.scankit.p.w1 a(com.huawei.hms.scankit.p.s r10, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r11) throws com.huawei.hms.scankit.p.a {
            r9 = this;
            com.huawei.hms.scankit.p.v r0 = new com.huawei.hms.scankit.p.v
            r0.<init>(r10)
            com.huawei.hms.scankit.p.z7 r10 = r0.a()
            r9.b = r10
            byte[] r0 = r0.b()
            com.huawei.hms.scankit.p.e1[] r10 = com.huawei.hms.scankit.p.e1.a(r0, r10)
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = 0
        L17:
            if (r2 >= r0) goto L23
            r4 = r10[r2]
            int r4 = r4.b()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L17
        L23:
            byte[] r0 = new byte[r3]
            int r2 = r10.length
            r3 = 0
        L27:
            if (r3 >= r2) goto L46
            r4 = r10[r3]
            byte[] r5 = r4.a()
            int r4 = r4.b()
            r9.a(r5, r4)
            r6 = 0
        L37:
            if (r6 >= r4) goto L43
            int r7 = r6 * r2
            int r7 = r7 + r3
            r8 = r5[r6]
            r0[r7] = r8
            int r6 = r6 + 1
            goto L37
        L43:
            int r3 = r3 + 1
            goto L27
        L46:
            com.huawei.hms.scankit.p.w1 r10 = com.huawei.hms.scankit.p.o1.a(r0, r11)
            return r10
    }

    public com.huawei.hms.scankit.p.z7 a() {
            r1 = this;
            com.huawei.hms.scankit.p.z7 r0 = r1.b
            return r0
    }
}

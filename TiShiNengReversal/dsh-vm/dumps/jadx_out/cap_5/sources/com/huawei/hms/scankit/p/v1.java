package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class v1 {
    private final com.huawei.hms.scankit.p.p6 a;

    public v1() {
            r2 = this;
            r2.<init>()
            com.huawei.hms.scankit.p.p6 r0 = new com.huawei.hms.scankit.p.p6
            com.huawei.hms.scankit.p.o3 r1 = com.huawei.hms.scankit.p.o3.l
            r0.<init>(r1)
            r2.a = r0
            return
    }

    private com.huawei.hms.scankit.p.w1 a(com.huawei.hms.scankit.p.u r13, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r14) throws com.huawei.hms.scankit.p.a {
            r12 = this;
            com.huawei.hms.scankit.p.b8 r0 = r13.d()
            com.huawei.hms.scankit.p.l3 r1 = r13.c()
            com.huawei.hms.scankit.p.b3 r1 = r1.b()
            byte[] r13 = r13.b()
            com.huawei.hms.scankit.p.d1[] r13 = com.huawei.hms.scankit.p.d1.a(r13, r0, r1)
            int r2 = r13.length
            r3 = 0
            r4 = 0
            r5 = 0
        L18:
            if (r4 >= r2) goto L24
            r6 = r13[r4]
            int r6 = r6.b()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L18
        L24:
            byte[] r2 = new byte[r5]
            int r4 = r13.length
            r5 = 0
            r6 = 0
        L29:
            if (r5 >= r4) goto L48
            r7 = r13[r5]
            byte[] r8 = r7.a()
            int r7 = r7.b()
            r12.a(r8, r7)
            r9 = 0
        L39:
            if (r9 >= r7) goto L45
            int r10 = r6 + 1
            r11 = r8[r9]
            r2[r6] = r11
            int r9 = r9 + 1
            r6 = r10
            goto L39
        L45:
            int r5 = r5 + 1
            goto L29
        L48:
            com.huawei.hms.scankit.p.w1 r13 = com.huawei.hms.scankit.p.r1.a(r2, r0, r1, r14)
            return r13
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

    public com.huawei.hms.scankit.p.w1 a(com.huawei.hms.scankit.p.s r3, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            com.huawei.hms.scankit.p.u r0 = new com.huawei.hms.scankit.p.u
            r0.<init>(r3)
            com.huawei.hms.scankit.p.w1 r3 = r2.a(r0, r4)     // Catch: com.huawei.hms.scankit.p.a -> La
            return r3
        La:
            r3 = move-exception
            r0.e()     // Catch: com.huawei.hms.scankit.p.a -> L28
            r1 = 1
            r0.a(r1)     // Catch: com.huawei.hms.scankit.p.a -> L28
            r0.d()     // Catch: com.huawei.hms.scankit.p.a -> L28
            r0.c()     // Catch: com.huawei.hms.scankit.p.a -> L28
            r0.a()     // Catch: com.huawei.hms.scankit.p.a -> L28
            com.huawei.hms.scankit.p.w1 r4 = r2.a(r0, r4)     // Catch: com.huawei.hms.scankit.p.a -> L28
            com.huawei.hms.scankit.p.i6 r0 = new com.huawei.hms.scankit.p.i6     // Catch: com.huawei.hms.scankit.p.a -> L28
            r0.<init>(r1)     // Catch: com.huawei.hms.scankit.p.a -> L28
            r4.a(r0)     // Catch: com.huawei.hms.scankit.p.a -> L28
            return r4
        L28:
            throw r3
    }
}

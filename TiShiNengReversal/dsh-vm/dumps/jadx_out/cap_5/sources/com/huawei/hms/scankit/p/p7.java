package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class p7 {
    private static final int[] c = null;
    private final com.huawei.hms.scankit.p.n7 a;
    private final com.huawei.hms.scankit.p.o7 b;

    static {
            r0 = 1
            r1 = 2
            int[] r0 = new int[]{r0, r0, r1}
            com.huawei.hms.scankit.p.p7.c = r0
            return
    }

    p7() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.n7 r0 = new com.huawei.hms.scankit.p.n7
            r0.<init>()
            r1.a = r0
            com.huawei.hms.scankit.p.o7 r0 = new com.huawei.hms.scankit.p.o7
            r0.<init>()
            r1.b = r0
            return
    }

    com.huawei.hms.scankit.p.s6 a(int r3, com.huawei.hms.scankit.p.r r4, int r5) throws com.huawei.hms.scankit.p.a {
            r2 = this;
            int[] r0 = com.huawei.hms.scankit.p.p7.c
            r1 = 0
            int[] r5 = com.huawei.hms.scankit.p.q7.a(r4, r5, r1, r0)
            com.huawei.hms.scankit.p.o7 r0 = r2.b     // Catch: com.huawei.hms.scankit.p.a -> Le
            com.huawei.hms.scankit.p.s6 r3 = r0.a(r3, r4, r5)     // Catch: com.huawei.hms.scankit.p.a -> Le
            return r3
        Le:
            com.huawei.hms.scankit.p.n7 r0 = r2.a
            com.huawei.hms.scankit.p.s6 r3 = r0.a(r3, r4, r5)
            return r3
    }
}

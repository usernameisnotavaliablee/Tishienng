package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class v5 {
    private static final com.huawei.hms.scankit.p.t6[] a = null;

    static {
            com.huawei.hms.scankit.p.t2 r0 = new com.huawei.hms.scankit.p.t2
            r0.<init>()
            com.huawei.hms.scankit.p.n4 r1 = new com.huawei.hms.scankit.p.n4
            r1.<init>()
            com.huawei.hms.scankit.p.f7 r2 = new com.huawei.hms.scankit.p.f7
            r2.<init>()
            com.huawei.hms.scankit.p.w6 r3 = new com.huawei.hms.scankit.p.w6
            r3.<init>()
            com.huawei.hms.scankit.p.k8 r4 = new com.huawei.hms.scankit.p.k8
            r4.<init>()
            com.huawei.hms.scankit.p.z r5 = new com.huawei.hms.scankit.p.z
            r5.<init>()
            com.huawei.hms.scankit.p.x7 r6 = new com.huawei.hms.scankit.p.x7
            r6.<init>()
            com.huawei.hms.scankit.p.y7 r7 = new com.huawei.hms.scankit.p.y7
            r7.<init>()
            com.huawei.hms.scankit.p.t3 r8 = new com.huawei.hms.scankit.p.t3
            r8.<init>()
            com.huawei.hms.scankit.p.u7 r9 = new com.huawei.hms.scankit.p.u7
            r9.<init>()
            com.huawei.hms.scankit.p.q4 r10 = new com.huawei.hms.scankit.p.q4
            r10.<init>()
            com.huawei.hms.scankit.p.x r11 = new com.huawei.hms.scankit.p.x
            r11.<init>()
            com.huawei.hms.scankit.p.c r12 = new com.huawei.hms.scankit.p.c
            r12.<init>()
            com.huawei.hms.scankit.p.i4 r13 = new com.huawei.hms.scankit.p.i4
            r13.<init>()
            com.huawei.hms.scankit.p.g6 r14 = new com.huawei.hms.scankit.p.g6
            r14.<init>()
            com.huawei.hms.scankit.p.n2 r15 = new com.huawei.hms.scankit.p.n2
            r15.<init>()
            r16 = r0
            r0 = 16
            com.huawei.hms.scankit.p.t6[] r0 = new com.huawei.hms.scankit.p.t6[r0]
            r17 = 0
            r0[r17] = r16
            r16 = 1
            r0[r16] = r1
            r1 = 2
            r0[r1] = r2
            r1 = 3
            r0[r1] = r3
            r1 = 4
            r0[r1] = r4
            r1 = 5
            r0[r1] = r5
            r1 = 6
            r0[r1] = r6
            r1 = 7
            r0[r1] = r7
            r1 = 8
            r0[r1] = r8
            r1 = 9
            r0[r1] = r9
            r1 = 10
            r0[r1] = r10
            r1 = 11
            r0[r1] = r11
            r1 = 12
            r0[r1] = r12
            r1 = 13
            r0[r1] = r13
            r1 = 14
            r0[r1] = r14
            r1 = 15
            r0[r1] = r15
            com.huawei.hms.scankit.p.v5.a = r0
            return
    }

    public v5() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.huawei.hms.ml.scan.HmsScan a(com.huawei.hms.scankit.p.s6 r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.huawei.hms.scankit.p.t6[] r1 = com.huawei.hms.scankit.p.v5.a
            int r2 = r1.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L16
            r4 = r1[r3]
            com.huawei.hms.ml.scan.HmsScan r4 = r4.b(r5)
            if (r4 == 0) goto L13
            return r4
        L13:
            int r3 = r3 + 1
            goto L8
        L16:
            return r0
    }
}

package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q6 {
    private final com.huawei.hms.scankit.p.o3 a;
    private final java.util.List<com.huawei.hms.scankit.p.p3> b;

    public q6(com.huawei.hms.scankit.p.o3 r4) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.b = r0
            com.huawei.hms.scankit.p.p3 r1 = new com.huawei.hms.scankit.p.p3
            r2 = 1
            int[] r2 = new int[]{r2}
            r1.<init>(r4, r2)
            r0.add(r1)
            return
    }

    private com.huawei.hms.scankit.p.p3 a(int r8) {
            r7 = this;
            java.util.List<com.huawei.hms.scankit.p.p3> r0 = r7.b
            int r0 = r0.size()
            if (r8 < r0) goto L40
            java.util.List<com.huawei.hms.scankit.p.p3> r0 = r7.b
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            com.huawei.hms.scankit.p.p3 r0 = (com.huawei.hms.scankit.p.p3) r0
            java.util.List<com.huawei.hms.scankit.p.p3> r1 = r7.b
            int r1 = r1.size()
        L1c:
            if (r1 > r8) goto L40
            com.huawei.hms.scankit.p.p3 r3 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r4 = r7.a
            int r5 = r1 + (-1)
            int r6 = r4.a()
            int r5 = r5 + r6
            int r5 = r4.a(r5)
            int[] r5 = new int[]{r2, r5}
            r3.<init>(r4, r5)
            com.huawei.hms.scankit.p.p3 r0 = r0.c(r3)
            java.util.List<com.huawei.hms.scankit.p.p3> r3 = r7.b
            r3.add(r0)
            int r1 = r1 + 1
            goto L1c
        L40:
            java.util.List<com.huawei.hms.scankit.p.p3> r0 = r7.b
            java.lang.Object r8 = r0.get(r8)
            com.huawei.hms.scankit.p.p3 r8 = (com.huawei.hms.scankit.p.p3) r8
            return r8
    }

    public void a(int[] r7, int r8) {
            r6 = this;
            if (r8 == 0) goto L40
            int r0 = r7.length
            int r0 = r0 - r8
            if (r0 <= 0) goto L38
            com.huawei.hms.scankit.p.p3 r1 = r6.a(r8)
            int[] r2 = new int[r0]
            r3 = 0
            java.lang.System.arraycopy(r7, r3, r2, r3, r0)
            com.huawei.hms.scankit.p.p3 r4 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r5 = r6.a
            r4.<init>(r5, r2)
            r2 = 1
            com.huawei.hms.scankit.p.p3 r4 = r4.a(r8, r2)
            com.huawei.hms.scankit.p.p3[] r1 = r4.b(r1)
            r1 = r1[r2]
            int[] r1 = r1.a()
            int r2 = r1.length
            int r8 = r8 - r2
            r2 = 0
        L29:
            if (r2 >= r8) goto L32
            int r4 = r0 + r2
            r7[r4] = r3
            int r2 = r2 + 1
            goto L29
        L32:
            int r0 = r0 + r8
            int r8 = r1.length
            java.lang.System.arraycopy(r1, r3, r7, r0, r8)
            return
        L38:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No data bytes provided"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No error correction bytes"
            r7.<init>(r8)
            throw r7
    }
}

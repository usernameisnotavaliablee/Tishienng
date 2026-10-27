package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b5 extends com.huawei.hms.scankit.p.g5 {
    private final com.huawei.hms.scankit.p.q7[] a;

    public b5(java.util.Map<com.huawei.hms.scankit.p.l1, ?> r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.c
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L57
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            com.huawei.hms.scankit.p.o2 r1 = new com.huawei.hms.scankit.p.o2
            r1.<init>()
            r0.add(r1)
            goto L37
        L27:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L37
            com.huawei.hms.scankit.p.l7 r1 = new com.huawei.hms.scankit.p.l7
            r1.<init>()
            r0.add(r1)
        L37:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.g
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L47
            com.huawei.hms.scankit.p.q2 r1 = new com.huawei.hms.scankit.p.q2
            r1.<init>()
            r0.add(r1)
        L47:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.m
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L57
            com.huawei.hms.scankit.p.s7 r3 = new com.huawei.hms.scankit.p.s7
            r3.<init>()
            r0.add(r3)
        L57:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L75
            com.huawei.hms.scankit.p.o2 r3 = new com.huawei.hms.scankit.p.o2
            r3.<init>()
            r0.add(r3)
            com.huawei.hms.scankit.p.q2 r3 = new com.huawei.hms.scankit.p.q2
            r3.<init>()
            r0.add(r3)
            com.huawei.hms.scankit.p.s7 r3 = new com.huawei.hms.scankit.p.s7
            r3.<init>()
            r0.add(r3)
        L75:
            int r3 = r0.size()
            com.huawei.hms.scankit.p.q7[] r3 = new com.huawei.hms.scankit.p.q7[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            com.huawei.hms.scankit.p.q7[] r3 = (com.huawei.hms.scankit.p.q7[]) r3
            r2.a = r3
            return
    }

    @Override // com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r12, com.huawei.hms.scankit.p.r r13, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r14) throws com.huawei.hms.scankit.p.a {
            r11 = this;
            java.util.ArrayList r0 = com.huawei.hms.scankit.p.q7.b(r13)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r0.next()
            int[] r1 = (int[]) r1
            com.huawei.hms.scankit.p.q7[] r2 = r11.a
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L19:
            if (r5 >= r3) goto L8
            r6 = r2[r5]
            com.huawei.hms.scankit.p.s6 r6 = r6.a(r12, r13, r1, r14)     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r7 = r6.c()     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r8 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h     // Catch: com.huawei.hms.scankit.p.a -> L70
            r9 = 1
            if (r7 != r8) goto L38
            java.lang.String r7 = r6.k()     // Catch: com.huawei.hms.scankit.p.a -> L70
            char r7 = r7.charAt(r4)     // Catch: com.huawei.hms.scankit.p.a -> L70
            r8 = 48
            if (r7 != r8) goto L38
            r7 = 1
            goto L39
        L38:
            r7 = 0
        L39:
            if (r14 != 0) goto L3d
            r8 = 0
            goto L45
        L3d:
            com.huawei.hms.scankit.p.l1 r8 = com.huawei.hms.scankit.p.l1.c     // Catch: com.huawei.hms.scankit.p.a -> L70
            java.lang.Object r8 = r14.get(r8)     // Catch: com.huawei.hms.scankit.p.a -> L70
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: com.huawei.hms.scankit.p.a -> L70
        L45:
            if (r8 == 0) goto L52
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l     // Catch: com.huawei.hms.scankit.p.a -> L70
            boolean r8 = r8.contains(r10)     // Catch: com.huawei.hms.scankit.p.a -> L70
            if (r8 == 0) goto L50
            goto L52
        L50:
            r8 = 0
            goto L53
        L52:
            r8 = 1
        L53:
            if (r7 == 0) goto L6f
            if (r8 == 0) goto L6f
            com.huawei.hms.scankit.p.s6 r7 = new com.huawei.hms.scankit.p.s6     // Catch: com.huawei.hms.scankit.p.a -> L70
            java.lang.String r8 = r6.k()     // Catch: com.huawei.hms.scankit.p.a -> L70
            java.lang.String r8 = r8.substring(r9)     // Catch: com.huawei.hms.scankit.p.a -> L70
            byte[] r9 = r6.i()     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.p.u6[] r6 = r6.j()     // Catch: com.huawei.hms.scankit.p.a -> L70
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r10 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l     // Catch: com.huawei.hms.scankit.p.a -> L70
            r7.<init>(r8, r9, r6, r10)     // Catch: com.huawei.hms.scankit.p.a -> L70
            return r7
        L6f:
            return r6
        L70:
            int r5 = r5 + 1
            goto L19
        L73:
            com.huawei.hms.scankit.p.a r12 = com.huawei.hms.scankit.p.a.a()
            throw r12
    }
}

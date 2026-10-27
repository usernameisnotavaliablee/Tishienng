package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d5 {
    public java.util.List<com.huawei.hms.scankit.p.i2> a;
    private int b;

    public d5() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.b = r0
            return
    }

    public void a(boolean r27, byte[] r28, int r29, int r30, int r31, boolean r32) {
            r26 = this;
            r0 = r26
            float[] r1 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.multiBarcodeDetect(r28, r29, r30, r31, r32)
            r2 = 0
            if (r1 == 0) goto Lf
            int r3 = r1.length
            int r3 = r3 / 10
            r0.b = r3
            goto L11
        Lf:
            r0.b = r2
        L11:
            int r3 = r0.b
            if (r2 >= r3) goto L88
            int r3 = r2 * 10
            boolean r4 = com.huawei.hms.scankit.p.w7.a(r1, r3)
            if (r4 == 0) goto L85
            int r4 = r3 + 1
            boolean r5 = com.huawei.hms.scankit.p.w7.a(r1, r4)
            if (r5 == 0) goto L85
            int r5 = r3 + 2
            boolean r6 = com.huawei.hms.scankit.p.w7.a(r1, r5)
            if (r6 == 0) goto L85
            int r6 = r3 + 3
            boolean r7 = com.huawei.hms.scankit.p.w7.a(r1, r6)
            if (r7 == 0) goto L85
            int r7 = r3 + 4
            boolean r8 = com.huawei.hms.scankit.p.w7.a(r1, r7)
            if (r8 == 0) goto L85
            int r8 = r3 + 5
            boolean r9 = com.huawei.hms.scankit.p.w7.a(r1, r8)
            if (r9 == 0) goto L85
            int r9 = r3 + 6
            boolean r10 = com.huawei.hms.scankit.p.w7.a(r1, r9)
            if (r10 == 0) goto L85
            int r10 = r3 + 7
            boolean r11 = com.huawei.hms.scankit.p.w7.a(r1, r10)
            if (r11 == 0) goto L85
            int r11 = r3 + 8
            boolean r12 = com.huawei.hms.scankit.p.w7.a(r1, r11)
            if (r12 == 0) goto L85
            int r12 = r3 + 9
            boolean r13 = com.huawei.hms.scankit.p.w7.a(r1, r12)
            if (r13 == 0) goto L85
            com.huawei.hms.scankit.p.i2 r14 = new com.huawei.hms.scankit.p.i2
            r16 = r1[r3]
            r17 = r1[r4]
            r18 = r1[r5]
            r19 = r1[r6]
            r20 = r1[r7]
            r21 = r1[r8]
            r22 = r1[r9]
            r23 = r1[r10]
            r24 = r1[r11]
            r25 = r1[r12]
            r15 = r27
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.List<com.huawei.hms.scankit.p.i2> r3 = r0.a
            r3.add(r14)
        L85:
            int r2 = r2 + 1
            goto L11
        L88:
            return
    }
}

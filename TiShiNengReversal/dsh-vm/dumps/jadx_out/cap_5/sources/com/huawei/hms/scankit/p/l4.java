package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l4 {
    public l4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(int r0, int r1, int r2) {
            if (r0 < r1) goto L3
            return r1
        L3:
            if (r0 > r2) goto L6
            return r2
        L6:
            return r0
    }

    public static com.huawei.hms.scankit.p.p a(com.huawei.hms.scankit.p.p r9) {
            int r3 = r9.e()
            int r2 = r9.c()
            byte[] r9 = r9.d()
            int r0 = r3 * r2
            byte[] r1 = new byte[r0]
            r0 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L2a
            r5 = 0
        L15:
            if (r5 >= r3) goto L27
            int r6 = r5 * r2
            int r6 = r6 + r2
            int r6 = r6 - r4
            int r6 = r6 + (-1)
            int r7 = r4 * r3
            int r7 = r7 + r5
            r7 = r9[r7]
            r1[r6] = r7
            int r5 = r5 + 1
            goto L15
        L27:
            int r4 = r4 + 1
            goto L12
        L2a:
            com.huawei.hms.scankit.p.e6 r0 = new com.huawei.hms.scankit.p.e6
            r5 = 0
            r8 = 0
            r4 = 0
            r6 = r2
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.huawei.hms.scankit.p.e4 r9 = new com.huawei.hms.scankit.p.e4
            r9.<init>(r0)
            com.huawei.hms.scankit.p.p r0 = new com.huawei.hms.scankit.p.p
            r0.<init>(r9)
            return r0
    }

    public static com.huawei.hms.scankit.p.p a(com.huawei.hms.scankit.p.p r26, float r27) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r26
        L7:
            int r0 = r26.c()
            int r1 = r26.e()
            float r2 = (float) r1
            float r2 = r2 / r27
            int r5 = (int) r2
            float r2 = (float) r0
            float r2 = r2 / r27
            int r6 = (int) r2
            byte[] r2 = r26.d()
            int r3 = r5 * r6
            byte[] r4 = new byte[r3]
            r7 = 0
            r8 = 0
        L21:
            if (r8 >= r3) goto Lc4
            int r9 = r8 % r5
            int r10 = r5 + (-1)
            int r9 = a(r9, r10, r7)
            int r10 = r8 / r5
            int r11 = r6 + (-1)
            int r10 = a(r10, r11, r7)
            float r9 = (float) r9
            float r9 = r9 * r27
            double r11 = (double) r9
            float r9 = (float) r10
            float r9 = r9 * r27
            double r9 = (double) r9
            double r13 = java.lang.Math.floor(r11)
            r15 = r8
            double r7 = java.lang.Math.floor(r9)
            double r11 = r11 - r13
            double r9 = r9 - r7
            int r13 = (int) r13
            int r14 = r1 + (-1)
            r16 = r0
            r0 = 0
            int r13 = a(r13, r14, r0)
            int r7 = (int) r7
            int r8 = r16 + (-1)
            int r7 = a(r7, r8, r0)
            int r0 = r7 * r1
            int r17 = r0 + r13
            r18 = r0
            r0 = r2[r17]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r17 = r1
            double r0 = (double) r0
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r21 = r19 - r11
            double r0 = r0 * r21
            double r19 = r19 - r9
            double r0 = r0 * r19
            r23 = r0
            int r0 = r13 + 1
            r1 = 0
            int r25 = a(r0, r14, r1)
            int r18 = r18 + r25
            r1 = r2[r18]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r18 = r2
            double r1 = (double) r1
            double r1 = r1 * r11
            double r1 = r1 * r19
            double r1 = r23 + r1
            int r7 = r7 + 1
            r19 = r1
            r1 = 0
            int r2 = a(r7, r8, r1)
            int r2 = r2 * r17
            int r2 = r2 + r13
            r2 = r18[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            double r1 = (double) r2
            double r1 = r1 * r21
            double r1 = r1 * r9
            double r1 = r19 + r1
            r13 = 0
            int r7 = a(r7, r8, r13)
            int r7 = r7 * r17
            int r0 = a(r0, r14, r13)
            int r7 = r7 + r0
            r0 = r18[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            double r7 = (double) r0
            double r7 = r7 * r11
            double r7 = r7 * r9
            double r1 = r1 + r7
            int r0 = (int) r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r4[r15] = r0
            int r8 = r15 + 1
            r0 = r16
            r1 = r17
            r2 = r18
            r7 = 0
            goto L21
        Lc4:
            com.huawei.hms.scankit.p.e6 r3 = new com.huawei.hms.scankit.p.e6
            r8 = 0
            r11 = 0
            r7 = 0
            r9 = r5
            r10 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.huawei.hms.scankit.p.e4 r0 = new com.huawei.hms.scankit.p.e4
            r0.<init>(r3)
            com.huawei.hms.scankit.p.p r1 = new com.huawei.hms.scankit.p.p
            r1.<init>(r0)
            return r1
    }

    public static com.huawei.hms.scankit.p.p a(boolean r11, com.huawei.hms.scankit.p.p r12, float r13) {
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L7
            return r12
        L7:
            int r11 = r12.c()
            int r0 = r12.e()
            float r1 = (float) r0
            float r1 = r1 / r13
            int r4 = (int) r1
            float r1 = (float) r11
            float r1 = r1 / r13
            int r5 = (int) r1
            byte[] r12 = r12.d()
            byte[] r3 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.imageResize(r12, r11, r0, r5, r4)
            com.huawei.hms.scankit.p.e6 r2 = new com.huawei.hms.scankit.p.e6
            r7 = 0
            r10 = 0
            r6 = 0
            r8 = r4
            r9 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            com.huawei.hms.scankit.p.e4 r11 = new com.huawei.hms.scankit.p.e4
            r11.<init>(r2)
            com.huawei.hms.scankit.p.p r12 = new com.huawei.hms.scankit.p.p
            r12.<init>(r11)
            return r12
    }
}

package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o8 {
    public o8() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float a(int r12, int r13, com.huawei.hms.scankit.p.u6[] r14) {
            int r0 = r14.length
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= r1) goto L7
            return r2
        L7:
            int r0 = r14.length
            r1 = 0
            r3 = 0
            r4 = 0
        Lb:
            if (r3 >= r0) goto L1a
            r5 = r14[r3]
            boolean r5 = r5.d()
            if (r5 == 0) goto L17
            int r4 = r4 + 1
        L17:
            int r3 = r3 + 1
            goto Lb
        L1a:
            boolean r0 = com.huawei.hms.scankit.p.r3.a
            r3 = 2
            if (r0 == 0) goto L26
            boolean r0 = com.huawei.hms.scankit.p.r3.b
            if (r0 != 0) goto L26
            if (r4 >= r3) goto L26
            return r2
        L26:
            r0 = r14[r1]
            float r4 = r0.b()
            r0 = 1
            r5 = r14[r0]
            float r6 = r5.b()
            r5 = r14[r3]
            float r8 = r5.b()
            r1 = r14[r1]
            float r5 = r1.c()
            r0 = r14[r0]
            float r7 = r0.c()
            r14 = r14[r3]
            float r9 = r14.c()
            com.huawei.hms.scankit.p.u6 r14 = a(r4, r5, r6, r7, r8, r9)
            float r0 = r14.b()
            float r14 = r14.c()
            float r1 = java.lang.Math.max(r4, r6)
            float r1 = java.lang.Math.max(r1, r8)
            float r1 = java.lang.Math.max(r1, r0)
            float r4 = java.lang.Math.min(r4, r6)
            float r4 = java.lang.Math.min(r4, r8)
            float r0 = java.lang.Math.min(r4, r0)
            float r4 = java.lang.Math.max(r5, r7)
            float r4 = java.lang.Math.max(r4, r9)
            float r4 = java.lang.Math.max(r4, r14)
            float r5 = java.lang.Math.min(r5, r7)
            float r5 = java.lang.Math.min(r5, r9)
            float r14 = java.lang.Math.min(r5, r14)
            int r5 = java.lang.Math.min(r13, r12)
            float r5 = (float) r5
            r6 = 1062836634(0x3f59999a, float:0.85)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r12 = r12 - r5
            int r12 = r12 / r3
            int r13 = r13 - r5
            int r13 = r13 / r3
            android.graphics.Rect r3 = new android.graphics.Rect
            int r6 = r5 + r12
            int r5 = r5 + r13
            r3.<init>(r12, r13, r6, r5)
            int r12 = r3.left
            float r12 = (float) r12
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 >= 0) goto Lbb
            int r12 = r3.top
            float r12 = (float) r12
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto Lbb
            int r12 = r3.right
            float r12 = (float) r12
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 <= 0) goto Lbb
            int r12 = r3.bottom
            float r12 = (float) r12
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 <= 0) goto Lbb
            return r2
        Lbb:
            int r12 = r3.top
            float r12 = (float) r12
            float r12 = r14 - r12
            float r12 = java.lang.Math.abs(r12)
            int r13 = r3.left
            float r13 = (float) r13
            float r13 = r0 - r13
            float r13 = java.lang.Math.abs(r13)
            int r5 = r3.right
            float r5 = (float) r5
            float r5 = r1 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r3.bottom
            float r6 = (float) r6
            float r6 = r4 - r6
            float r6 = java.lang.Math.abs(r6)
            int r7 = r3.left
            int r8 = r3.right
            int r7 = r7 + r8
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            int r9 = r3.top
            int r10 = r3.bottom
            int r9 = r9 + r10
            float r9 = (float) r9
            float r9 = r9 / r8
            float r10 = java.lang.Math.min(r13, r5)
            float r10 = java.lang.Math.min(r10, r12)
            float r10 = java.lang.Math.min(r10, r6)
            float r13 = r13 - r10
            float r13 = java.lang.Math.abs(r13)
            r11 = 1008981770(0x3c23d70a, float:0.01)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L11a
            int r12 = r3.left
            float r12 = (float) r12
            float r12 = r7 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 * r2
            float r7 = r7 - r0
            float r13 = java.lang.Math.abs(r7)
        L117:
            float r2 = r12 / r13
            goto L168
        L11a:
            float r5 = r5 - r10
            float r13 = java.lang.Math.abs(r5)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L134
            int r12 = r3.right
            float r12 = (float) r12
            float r12 = r7 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 * r2
            float r7 = r7 - r1
            float r13 = java.lang.Math.abs(r7)
            goto L117
        L134:
            float r12 = r12 - r10
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 <= 0) goto L14e
            int r12 = r3.top
            float r12 = (float) r12
            float r12 = r9 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 * r2
            float r9 = r9 - r14
            float r13 = java.lang.Math.abs(r9)
            goto L117
        L14e:
            float r6 = r6 - r10
            float r12 = java.lang.Math.abs(r6)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 <= 0) goto L168
            int r12 = r3.bottom
            float r12 = (float) r12
            float r12 = r9 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 * r2
            float r9 = r9 - r4
            float r13 = java.lang.Math.abs(r9)
            goto L117
        L168:
            float r12 = java.lang.Math.min(r2, r8)
            r13 = 1063675494(0x3f666666, float:0.9)
            float r12 = r12 * r13
            return r12
    }

    private static com.huawei.hms.scankit.p.u6 a(float r0, float r1, float r2, float r3, float r4, float r5) {
            float r0 = r0 + r4
            float r0 = r0 - r2
            float r1 = r1 + r5
            float r1 = r1 - r3
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6
            r2.<init>(r0, r1)
            return r2
    }

    public static float b(int r12, int r13, com.huawei.hms.scankit.p.u6[] r14) {
            int r0 = r14.length
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = 0
            r1 = r14[r0]
            float r1 = r1.b()
            r3 = 1
            r4 = r14[r3]
            float r4 = r4.b()
            r5 = 2
            r6 = r14[r5]
            float r6 = r6.b()
            r0 = r14[r0]
            float r0 = r0.c()
            r3 = r14[r3]
            float r3 = r3.c()
            r14 = r14[r5]
            float r14 = r14.c()
            float r5 = java.lang.Math.max(r1, r4)
            float r5 = java.lang.Math.max(r5, r6)
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.min(r1, r6)
            float r4 = java.lang.Math.max(r0, r3)
            float r4 = java.lang.Math.max(r4, r14)
            float r0 = java.lang.Math.min(r0, r3)
            float r14 = java.lang.Math.min(r0, r14)
            int r0 = java.lang.Math.min(r13, r12)
            float r0 = (float) r0
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 * r3
            int r0 = (int) r0
            android.graphics.Rect r3 = new android.graphics.Rect
            int r12 = r12 - r0
            int r13 = r13 - r0
            r3.<init>(r0, r0, r12, r13)
            int r12 = r3.left
            float r12 = (float) r12
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 >= 0) goto L7d
            int r12 = r3.top
            float r12 = (float) r12
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto L7d
            int r12 = r3.right
            float r12 = (float) r12
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 <= 0) goto L7d
            int r12 = r3.bottom
            float r12 = (float) r12
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 <= 0) goto L7d
            return r2
        L7d:
            int r12 = r3.right
            float r12 = (float) r12
            float r12 = r5 - r12
            float r12 = java.lang.Math.abs(r12)
            int r13 = r3.bottom
            float r13 = (float) r13
            float r13 = r4 - r13
            float r13 = java.lang.Math.abs(r13)
            int r0 = r3.top
            float r0 = (float) r0
            float r0 = r14 - r0
            float r0 = java.lang.Math.abs(r0)
            int r6 = r3.left
            float r6 = (float) r6
            float r6 = r1 - r6
            float r6 = java.lang.Math.abs(r6)
            int r7 = r3.left
            int r8 = r3.right
            int r7 = r7 + r8
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            int r9 = r3.top
            int r10 = r3.bottom
            int r9 = r9 + r10
            float r9 = (float) r9
            float r9 = r9 / r8
            float r10 = java.lang.Math.min(r6, r12)
            float r10 = java.lang.Math.min(r10, r0)
            float r10 = java.lang.Math.min(r10, r13)
            float r6 = r6 - r10
            float r6 = java.lang.Math.abs(r6)
            r11 = 1008981770(0x3c23d70a, float:0.01)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 <= 0) goto Lda
            int r12 = r3.left
            float r12 = (float) r12
            float r12 = r7 - r12
            float r12 = java.lang.Math.abs(r12)
            float r7 = r7 - r1
            float r13 = java.lang.Math.abs(r7)
        Ld7:
            float r2 = r12 / r13
            goto L122
        Lda:
            float r12 = r12 - r10
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 <= 0) goto Lf2
            int r12 = r3.right
            float r12 = (float) r12
            float r12 = r7 - r12
            float r12 = java.lang.Math.abs(r12)
            float r7 = r7 - r5
            float r13 = java.lang.Math.abs(r7)
            goto Ld7
        Lf2:
            float r0 = r0 - r10
            float r12 = java.lang.Math.abs(r0)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 <= 0) goto L10a
            int r12 = r3.top
            float r12 = (float) r12
            float r12 = r9 - r12
            float r12 = java.lang.Math.abs(r12)
            float r9 = r9 - r14
            float r13 = java.lang.Math.abs(r9)
            goto Ld7
        L10a:
            float r13 = r13 - r10
            float r12 = java.lang.Math.abs(r13)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 <= 0) goto L122
            int r12 = r3.bottom
            float r12 = (float) r12
            float r12 = r9 - r12
            float r12 = java.lang.Math.abs(r12)
            float r9 = r9 - r4
            float r13 = java.lang.Math.abs(r9)
            goto Ld7
        L122:
            float r12 = java.lang.Math.min(r2, r8)
            r13 = 1063675494(0x3f666666, float:0.9)
            float r12 = r12 * r13
            return r12
    }
}

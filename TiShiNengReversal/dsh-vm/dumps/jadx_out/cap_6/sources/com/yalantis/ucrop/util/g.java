package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float[] a(android.graphics.RectF r3) {
            float r0 = r3.centerX()
            float r3 = r3.centerY()
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            return r1
    }

    public static float[] b(android.graphics.RectF r5) {
            float r0 = r5.left
            float r1 = r5.top
            float r2 = r5.right
            float r5 = r5.bottom
            r3 = 8
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            r4 = 2
            r3[r4] = r2
            r4 = 3
            r3[r4] = r1
            r1 = 4
            r3[r1] = r2
            r1 = 5
            r3[r1] = r5
            r1 = 6
            r3[r1] = r0
            r0 = 7
            r3[r0] = r5
            return r3
    }

    public static float[] c(float[] r11) {
            r0 = 0
            r1 = r11[r0]
            r2 = 2
            r3 = r11[r2]
            float r1 = r1 - r3
            double r3 = (double) r1
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            r1 = 1
            r7 = r11[r1]
            r8 = 3
            r9 = r11[r8]
            float r7 = r7 - r9
            double r9 = (double) r7
            double r9 = java.lang.Math.pow(r9, r5)
            double r3 = r3 + r9
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            r4 = r11[r2]
            r7 = 4
            r7 = r11[r7]
            float r4 = r4 - r7
            double r9 = (double) r4
            double r9 = java.lang.Math.pow(r9, r5)
            r4 = r11[r8]
            r7 = 5
            r11 = r11[r7]
            float r4 = r4 - r11
            double r7 = (double) r4
            double r4 = java.lang.Math.pow(r7, r5)
            double r9 = r9 + r4
            double r4 = java.lang.Math.sqrt(r9)
            float r11 = (float) r4
            float[] r2 = new float[r2]
            r2[r0] = r3
            r2[r1] = r11
            return r2
    }

    public static android.graphics.RectF d(float[] r6) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r1 = 2139095040(0x7f800000, float:Infinity)
            r2 = -8388608(0xffffffffff800000, float:-Infinity)
            r0.<init>(r1, r1, r2, r2)
            r1 = 1
        La:
            int r2 = r6.length
            if (r1 >= r2) goto L4e
            int r2 = r1 + (-1)
            r2 = r6[r2]
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r2 = r2 / r3
            r4 = r6[r1]
            float r4 = r4 * r3
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            float r4 = r4 / r3
            float r3 = r0.left
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2c
            r3 = r2
        L2c:
            r0.left = r3
            float r3 = r0.top
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 >= 0) goto L35
            r3 = r4
        L35:
            r0.top = r3
            float r3 = r0.right
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3e
            goto L3f
        L3e:
            r2 = r3
        L3f:
            r0.right = r2
            float r2 = r0.bottom
            int r3 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r3 <= 0) goto L48
            goto L49
        L48:
            r4 = r2
        L49:
            r0.bottom = r4
            int r1 = r1 + 2
            goto La
        L4e:
            r0.sort()
            return r0
    }
}

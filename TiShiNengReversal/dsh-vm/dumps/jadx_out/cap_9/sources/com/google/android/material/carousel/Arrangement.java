package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    final int mediumCount;
    float mediumSize;
    final int priority;
    final int smallCount;
    float smallSize;

    Arrangement(int r1, float r2, float r3, float r4, int r5, float r6, int r7, float r8, int r9, float r10) {
            r0 = this;
            r0.<init>()
            r0.priority = r1
            float r1 = androidx.core.math.MathUtils.clamp(r2, r3, r4)
            r0.smallSize = r1
            r0.smallCount = r5
            r0.mediumSize = r6
            r0.mediumCount = r7
            r0.largeSize = r8
            r0.largeCount = r9
            r0.fit(r10, r3, r4, r8)
            float r1 = r0.cost(r8)
            r0.cost = r1
            return
    }

    private float calculateLargeSize(float r2, int r3, float r4, int r5, int r6) {
            r1 = this;
            if (r3 <= 0) goto L3
            goto L4
        L3:
            r4 = 0
        L4:
            float r3 = (float) r3
            float r5 = (float) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r3 = r3 + r5
            float r3 = r3 * r4
            float r2 = r2 - r3
            float r3 = (float) r6
            float r3 = r3 + r5
            float r2 = r2 / r3
            return r2
    }

    private float cost(float r2) {
            r1 = this;
            boolean r0 = r1.isValid()
            if (r0 != 0) goto La
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            return r2
        La:
            float r0 = r1.largeSize
            float r2 = r2 - r0
            float r2 = java.lang.Math.abs(r2)
            int r0 = r1.priority
            float r0 = (float) r0
            float r2 = r2 * r0
            return r2
    }

    static com.google.android.material.carousel.Arrangement findLowestCostArrangement(float r22, float r23, float r24, float r25, int[] r26, float r27, int[] r28, float r29, int[] r30) {
            r0 = r26
            r1 = r28
            r2 = r30
            int r3 = r2.length
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
        Lb:
            if (r7 >= r3) goto L66
            r17 = r2[r7]
            int r8 = r1.length
            r9 = 0
        L11:
            if (r9 >= r8) goto L63
            r15 = r1[r9]
            int r10 = r0.length
            r11 = 0
        L17:
            if (r11 >= r10) goto L54
            r13 = r0[r11]
            r12 = r8
            com.google.android.material.carousel.Arrangement r8 = new com.google.android.material.carousel.Arrangement
            r14 = r9
            r9 = r5
            r5 = r14
            r18 = r22
            r14 = r27
            r16 = r29
            r20 = r10
            r21 = r11
            r19 = r12
            r10 = r23
            r11 = r24
            r12 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L40
            float r10 = r8.cost
            float r11 = r4.cost
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L49
        L40:
            float r4 = r8.cost
            r10 = 0
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 != 0) goto L48
            return r8
        L48:
            r4 = r8
        L49:
            int r8 = r9 + 1
            int r11 = r21 + 1
            r9 = r5
            r5 = r8
            r8 = r19
            r10 = r20
            goto L17
        L54:
            r19 = r9
            r9 = r5
            r5 = r19
            r19 = r8
            int r5 = r5 + 1
            r8 = r9
            r9 = r5
            r5 = r8
            r8 = r19
            goto L11
        L63:
            int r7 = r7 + 1
            goto Lb
        L66:
            return r4
    }

    private void fit(float r10, float r11, float r12, float r13) {
            r9 = this;
            float r0 = r9.getSpace()
            float r0 = r10 - r0
            int r1 = r9.smallCount
            r2 = 0
            if (r1 <= 0) goto L1c
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L1c
            float r11 = r9.smallSize
            float r1 = (float) r1
            float r0 = r0 / r1
            float r12 = r12 - r11
            float r12 = java.lang.Math.min(r0, r12)
            float r11 = r11 + r12
            r9.smallSize = r11
            goto L2e
        L1c:
            if (r1 <= 0) goto L2e
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 >= 0) goto L2e
            float r12 = r9.smallSize
            float r1 = (float) r1
            float r0 = r0 / r1
            float r11 = r11 - r12
            float r11 = java.lang.Math.max(r0, r11)
            float r12 = r12 + r11
            r9.smallSize = r12
        L2e:
            int r5 = r9.smallCount
            float r6 = r9.smallSize
            int r7 = r9.mediumCount
            int r8 = r9.largeCount
            r3 = r9
            r4 = r10
            float r10 = r3.calculateLargeSize(r4, r5, r6, r7, r8)
            r3.largeSize = r10
            float r11 = r3.smallSize
            float r11 = r11 + r10
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            r3.mediumSize = r11
            int r12 = r3.mediumCount
            if (r12 <= 0) goto L8f
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L8f
            float r13 = r13 - r10
            int r10 = r3.largeCount
            float r10 = (float) r10
            float r13 = r13 * r10
            r10 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = r11 * r10
            float r10 = (float) r12
            float r11 = r11 * r10
            float r10 = java.lang.Math.abs(r13)
            float r10 = java.lang.Math.min(r10, r11)
            int r11 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r11 <= 0) goto L7c
            float r11 = r3.mediumSize
            int r12 = r3.mediumCount
            float r12 = (float) r12
            float r12 = r10 / r12
            float r11 = r11 - r12
            r3.mediumSize = r11
            float r11 = r3.largeSize
            int r12 = r3.largeCount
            float r12 = (float) r12
            float r10 = r10 / r12
            float r11 = r11 + r10
            r3.largeSize = r11
            return
        L7c:
            float r11 = r3.mediumSize
            int r12 = r3.mediumCount
            float r12 = (float) r12
            float r12 = r10 / r12
            float r11 = r11 + r12
            r3.mediumSize = r11
            float r11 = r3.largeSize
            int r12 = r3.largeCount
            float r12 = (float) r12
            float r10 = r10 / r12
            float r11 = r11 - r10
            r3.largeSize = r11
        L8f:
            return
    }

    private float getSpace() {
            r3 = this;
            float r0 = r3.largeSize
            int r1 = r3.largeCount
            float r1 = (float) r1
            float r0 = r0 * r1
            float r1 = r3.mediumSize
            int r2 = r3.mediumCount
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r3.smallSize
            int r2 = r3.smallCount
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    private boolean isValid() {
            r4 = this;
            int r0 = r4.largeCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L1e
            int r3 = r4.smallCount
            if (r3 <= 0) goto L1e
            int r3 = r4.mediumCount
            if (r3 <= 0) goto L1e
            float r0 = r4.largeSize
            float r3 = r4.mediumSize
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1d
            float r0 = r4.smallSize
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            if (r0 <= 0) goto L2e
            int r0 = r4.smallCount
            if (r0 <= 0) goto L2e
            float r0 = r4.largeSize
            float r3 = r4.smallSize
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2d
            return r2
        L2d:
            return r1
        L2e:
            return r2
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Arrangement [priority="
            r0.append(r1)
            int r1 = r2.priority
            r0.append(r1)
            java.lang.String r1 = ", smallCount="
            r0.append(r1)
            int r1 = r2.smallCount
            r0.append(r1)
            java.lang.String r1 = ", smallSize="
            r0.append(r1)
            float r1 = r2.smallSize
            r0.append(r1)
            java.lang.String r1 = ", mediumCount="
            r0.append(r1)
            int r1 = r2.mediumCount
            r0.append(r1)
            java.lang.String r1 = ", mediumSize="
            r0.append(r1)
            float r1 = r2.mediumSize
            r0.append(r1)
            java.lang.String r1 = ", largeCount="
            r0.append(r1)
            int r1 = r2.largeCount
            r0.append(r1)
            java.lang.String r1 = ", largeSize="
            r0.append(r1)
            float r1 = r2.largeSize
            r0.append(r1)
            java.lang.String r1 = ", cost="
            r0.append(r1)
            float r1 = r2.cost
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Distance implements java.lang.Comparable<com.google.android.material.color.utilities.QuantizerWsmeans.Distance> {
        double distance;
        int index;

        Distance() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.index = r0
                r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                r2.distance = r0
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r4) {
                r3 = this;
                double r0 = r3.distance
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r1 = r4.distance
                java.lang.Double r4 = java.lang.Double.valueOf(r1)
                int r4 = r0.compareTo(r4)
                return r4
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r1) {
                r0 = this;
                com.google.android.material.color.utilities.QuantizerWsmeans$Distance r1 = (com.google.android.material.color.utilities.QuantizerWsmeans.Distance) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    private QuantizerWsmeans() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.Integer, java.lang.Integer> quantize(int[] r26, int[] r27, int r28) {
            r0 = r26
            r1 = r27
            java.util.Random r2 = new java.util.Random
            r3 = 272008(0x42688, double:1.3439E-318)
            r2.<init>(r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            int r4 = r0.length
            double[][] r4 = new double[r4][]
            int r5 = r0.length
            int[] r5 = new int[r5]
            com.google.android.material.color.utilities.PointProviderLab r6 = new com.google.android.material.color.utilities.PointProviderLab
            r6.<init>()
            r8 = 0
            r9 = 0
        L1e:
            int r10 = r0.length
            r11 = 1
            if (r8 >= r10) goto L59
            r10 = r0[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r12 = r3.get(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 != 0) goto L46
            double[] r12 = r6.fromInt(r10)
            r4[r9] = r12
            r5[r9] = r10
            int r9 = r9 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.put(r10, r11)
            goto L56
        L46:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r12 = r12.intValue()
            int r12 = r12 + r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r3.put(r10, r11)
        L56:
            int r8 = r8 + 1
            goto L1e
        L59:
            int[] r0 = new int[r9]
            r8 = 0
        L5c:
            if (r8 >= r9) goto L73
            r10 = r5[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r3.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0[r8] = r10
            int r8 = r8 + 1
            goto L5c
        L73:
            r8 = r28
            int r3 = java.lang.Math.min(r8, r9)
            int r5 = r1.length
            if (r5 == 0) goto L81
            int r5 = r1.length
            int r3 = java.lang.Math.min(r3, r5)
        L81:
            double[][] r5 = new double[r3][]
            r8 = 0
            r10 = 0
        L85:
            int r12 = r1.length
            if (r8 >= r12) goto L95
            r12 = r1[r8]
            double[] r12 = r6.fromInt(r12)
            r5[r8] = r12
            int r10 = r10 + 1
            int r8 = r8 + 1
            goto L85
        L95:
            int r1 = r3 - r10
            if (r1 <= 0) goto L9f
            r8 = 0
        L9a:
            if (r8 >= r1) goto L9f
            int r8 = r8 + 1
            goto L9a
        L9f:
            int[] r1 = new int[r9]
            r8 = 0
        La2:
            if (r8 >= r9) goto Lad
            int r10 = r2.nextInt(r3)
            r1[r8] = r10
            int r8 = r8 + 1
            goto La2
        Lad:
            int[][] r2 = new int[r3][]
            r8 = 0
        Lb0:
            if (r8 >= r3) goto Lb9
            int[] r10 = new int[r3]
            r2[r8] = r10
            int r8 = r8 + 1
            goto Lb0
        Lb9:
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[][] r8 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r3][]
            r10 = 0
        Lbc:
            if (r10 >= r3) goto Ld4
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[] r12 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r3]
            r8[r10] = r12
            r12 = 0
        Lc3:
            if (r12 >= r3) goto Ld1
            r13 = r8[r10]
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance r14 = new com.google.android.material.color.utilities.QuantizerWsmeans$Distance
            r14.<init>()
            r13[r12] = r14
            int r12 = r12 + 1
            goto Lc3
        Ld1:
            int r10 = r10 + 1
            goto Lbc
        Ld4:
            int[] r10 = new int[r3]
            r12 = 0
        Ld7:
            r13 = 10
            if (r12 >= r13) goto L19c
            r13 = 0
        Ldc:
            if (r13 >= r3) goto L12b
            int r14 = r13 + 1
            r15 = r14
        Le1:
            if (r15 >= r3) goto L109
            r16 = 1
            r11 = r5[r13]
            r7 = r5[r15]
            r26 = r0
            r27 = r1
            double r0 = r6.distance(r11, r7)
            r7 = r8[r15]
            r7 = r7[r13]
            r7.distance = r0
            r7.index = r13
            r7 = r8[r13]
            r7 = r7[r15]
            r7.distance = r0
            r7.index = r15
            int r15 = r15 + 1
            r0 = r26
            r1 = r27
            r11 = 1
            goto Le1
        L109:
            r26 = r0
            r27 = r1
            r16 = 1
            r0 = r8[r13]
            java.util.Arrays.sort(r0)
            r0 = 0
        L115:
            if (r0 >= r3) goto L124
            r1 = r2[r13]
            r7 = r8[r13]
            r7 = r7[r0]
            int r7 = r7.index
            r1[r0] = r7
            int r0 = r0 + 1
            goto L115
        L124:
            r0 = r26
            r1 = r27
            r13 = r14
            r11 = 1
            goto Ldc
        L12b:
            r26 = r0
            r27 = r1
            r16 = 1
            r0 = 0
            r1 = 0
        L133:
            if (r0 >= r9) goto L194
            r7 = r4[r0]
            r11 = r27[r0]
            r13 = r5[r11]
            double r13 = r6.distance(r7, r13)
            r18 = r0
            r19 = r13
            r0 = -1
            r15 = 0
        L145:
            if (r15 >= r3) goto L16e
            r21 = r8[r11]
            r22 = r1
            r1 = r21[r15]
            r21 = r2
            double r1 = r1.distance
            r23 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r23 = r23 * r13
            int r25 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r25 < 0) goto L15a
            goto L167
        L15a:
            r1 = r5[r15]
            double r1 = r6.distance(r7, r1)
            int r23 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r23 >= 0) goto L167
            r19 = r1
            r0 = r15
        L167:
            int r15 = r15 + 1
            r2 = r21
            r1 = r22
            goto L145
        L16e:
            r22 = r1
            r21 = r2
            r1 = -1
            if (r0 == r1) goto L18d
            double r1 = java.lang.Math.sqrt(r19)
            double r13 = java.lang.Math.sqrt(r13)
            double r1 = r1 - r13
            double r1 = java.lang.Math.abs(r1)
            r13 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r7 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r7 <= 0) goto L18d
            int r1 = r22 + 1
            r27[r18] = r0
            goto L18f
        L18d:
            r1 = r22
        L18f:
            int r0 = r18 + 1
            r2 = r21
            goto L133
        L194:
            r22 = r1
            r21 = r2
            if (r22 != 0) goto L1a0
            if (r12 == 0) goto L1a0
        L19c:
            r17 = 0
            goto L225
        L1a0:
            double[] r0 = new double[r3]
            double[] r1 = new double[r3]
            double[] r2 = new double[r3]
            r7 = 0
            java.util.Arrays.fill(r10, r7)
            r11 = 0
        L1ab:
            if (r11 >= r9) goto L1e2
            r14 = r27[r11]
            r15 = r4[r11]
            r17 = 0
            r7 = r26[r11]
            r18 = r10[r14]
            int r18 = r18 + r7
            r10[r14] = r18
            r18 = r0[r14]
            r22 = r15[r17]
            r20 = r14
            r28 = 2
            double r13 = (double) r7
            double r22 = r22 * r13
            double r18 = r18 + r22
            r0[r20] = r18
            r18 = r1[r20]
            r22 = r15[r16]
            double r22 = r22 * r13
            double r18 = r18 + r22
            r1[r20] = r18
            r18 = r2[r20]
            r22 = r15[r28]
            double r22 = r22 * r13
            double r18 = r18 + r22
            r2[r20] = r18
            int r11 = r11 + 1
            r7 = 0
            goto L1ab
        L1e2:
            r28 = 2
            r7 = 0
        L1e5:
            if (r7 >= r3) goto L218
            r11 = r10[r7]
            if (r11 != 0) goto L1f9
            r11 = 3
            double[] r11 = new double[r11]
            r11 = {x0252: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            r5[r7] = r11
            r15 = r0
            r18 = r1
            r17 = 0
            goto L212
        L1f9:
            r13 = r0[r7]
            r15 = r0
            r18 = r1
            double r0 = (double) r11
            double r13 = r13 / r0
            r19 = r18[r7]
            double r19 = r19 / r0
            r22 = r2[r7]
            double r22 = r22 / r0
            r0 = r5[r7]
            r17 = 0
            r0[r17] = r13
            r0[r16] = r19
            r0[r28] = r22
        L212:
            int r7 = r7 + 1
            r0 = r15
            r1 = r18
            goto L1e5
        L218:
            r17 = 0
            int r12 = r12 + 1
            r0 = r26
            r1 = r27
            r2 = r21
            r11 = 1
            goto Ld7
        L225:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r7 = 0
        L22b:
            if (r7 >= r3) goto L251
            r1 = r10[r7]
            if (r1 != 0) goto L232
            goto L24e
        L232:
            r2 = r5[r7]
            int r2 = r6.toInt(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r4 = r0.containsKey(r4)
            if (r4 == 0) goto L243
            goto L24e
        L243:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L24e:
            int r7 = r7 + 1
            goto L22b
        L251:
            return r0
    }
}

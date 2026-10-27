package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class az implements com.bytedance.adsdk.lottie.r.nd<com.bytedance.adsdk.lottie.model.xt.r> {
    private int j;

    public az(int r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    private int j(float r7, int r8, float[] r9, float[] r10) {
            r6 = this;
            int r0 = r10.length
            r1 = 2
            r2 = 0
            r3 = 1132396544(0x437f0000, float:255.0)
            if (r0 < r1) goto L52
            r0 = r9[r2]
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto Le
            goto L52
        Le:
            r0 = 1
            r1 = 1
        L10:
            int r2 = r9.length
            if (r1 >= r2) goto L4a
            r2 = r9[r1]
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L21
            int r5 = r9.length
            int r5 = r5 - r0
            if (r1 != r5) goto L1e
            goto L21
        L1e:
            int r1 = r1 + 1
            goto L10
        L21:
            if (r4 > 0) goto L29
            r7 = r10[r1]
        L25:
            float r7 = r7 * r3
            int r7 = (int) r7
            goto L39
        L29:
            int r0 = r1 + (-1)
            r9 = r9[r0]
            float r2 = r2 - r9
            float r7 = r7 - r9
            float r7 = r7 / r2
            r9 = r10[r0]
            r10 = r10[r1]
            float r7 = com.bytedance.adsdk.lottie.up.tl.j(r9, r10, r7)
            goto L25
        L39:
            int r9 = android.graphics.Color.red(r8)
            int r10 = android.graphics.Color.green(r8)
            int r8 = android.graphics.Color.blue(r8)
            int r7 = android.graphics.Color.argb(r7, r9, r10, r8)
            return r7
        L4a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unreachable code."
            r7.<init>(r8)
            throw r7
        L52:
            r7 = r10[r2]
            float r7 = r7 * r3
            int r7 = (int) r7
            int r9 = android.graphics.Color.red(r8)
            int r10 = android.graphics.Color.green(r8)
            int r8 = android.graphics.Color.blue(r8)
            int r7 = android.graphics.Color.argb(r7, r9, r10, r8)
            return r7
    }

    private com.bytedance.adsdk.lottie.model.xt.r j(com.bytedance.adsdk.lottie.model.xt.r r10, java.util.List<java.lang.Float> r11) {
            r9 = this;
            int r0 = r9.j
            int r0 = r0 * 4
            int r1 = r11.size()
            if (r1 > r0) goto Lb
            return r10
        Lb:
            float[] r1 = r10.j()
            int[] r2 = r10.xt()
            int r3 = r11.size()
            int r3 = r3 - r0
            int r3 = r3 / 2
            float[] r4 = new float[r3]
            float[] r3 = new float[r3]
            r5 = 0
            r6 = 0
        L20:
            int r7 = r11.size()
            if (r0 >= r7) goto L48
            int r7 = r0 % 2
            if (r7 != 0) goto L37
            java.lang.Object r7 = r11.get(r0)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r4[r6] = r7
            goto L45
        L37:
            java.lang.Object r7 = r11.get(r0)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r3[r6] = r7
            int r6 = r6 + 1
        L45:
            int r0 = r0 + 1
            goto L20
        L48:
            float[] r10 = r10.j()
            float[] r10 = j(r10, r4)
            int r11 = r10.length
            int[] r0 = new int[r11]
        L53:
            if (r5 >= r11) goto L7d
            r6 = r10[r5]
            int r7 = java.util.Arrays.binarySearch(r1, r6)
            int r8 = java.util.Arrays.binarySearch(r4, r6)
            if (r7 < 0) goto L6d
            if (r8 <= 0) goto L64
            goto L6d
        L64:
            r7 = r2[r7]
            int r6 = r9.j(r6, r7, r4, r3)
            r0[r5] = r6
            goto L7a
        L6d:
            if (r8 >= 0) goto L72
            int r8 = r8 + 1
            int r8 = -r8
        L72:
            r7 = r3[r8]
            int r6 = r9.j(r6, r7, r1, r2)
            r0[r5] = r6
        L7a:
            int r5 = r5 + 1
            goto L53
        L7d:
            com.bytedance.adsdk.lottie.model.xt.r r11 = new com.bytedance.adsdk.lottie.model.xt.r
            r11.<init>(r10, r0)
            return r11
    }

    protected static float[] j(float[] r9, float[] r10) {
            int r0 = r9.length
            if (r0 != 0) goto L4
            return r10
        L4:
            int r0 = r10.length
            if (r0 != 0) goto L8
            return r9
        L8:
            int r0 = r9.length
            int r1 = r10.length
            int r0 = r0 + r1
            float[] r1 = new float[r0]
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L11:
            if (r2 >= r0) goto L4d
            int r6 = r9.length
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r4 >= r6) goto L1b
            r6 = r9[r4]
            goto L1d
        L1b:
            r6 = 2143289344(0x7fc00000, float:NaN)
        L1d:
            int r8 = r10.length
            if (r5 >= r8) goto L22
            r7 = r10[r5]
        L22:
            boolean r8 = java.lang.Float.isNaN(r7)
            if (r8 != 0) goto L46
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L2d
            goto L46
        L2d:
            boolean r8 = java.lang.Float.isNaN(r6)
            if (r8 != 0) goto L41
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 >= 0) goto L38
            goto L41
        L38:
            r1[r2] = r6
            int r4 = r4 + 1
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L4a
        L41:
            r1[r2] = r7
            int r5 = r5 + 1
            goto L4a
        L46:
            r1[r2] = r6
            int r4 = r4 + 1
        L4a:
            int r2 = r2 + 1
            goto L11
        L4d:
            if (r3 != 0) goto L50
            return r1
        L50:
            int r0 = r0 - r3
            float[] r9 = java.util.Arrays.copyOf(r1, r0)
            return r9
    }

    int j(float r5, float r6, float[] r7, int[] r8) {
            r4 = this;
            int r0 = r8.length
            r1 = 2
            r2 = 0
            if (r0 < r1) goto L60
            r0 = r7[r2]
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L60
        Lc:
            r0 = 1
            r1 = 1
        Le:
            int r2 = r7.length
            if (r1 >= r2) goto L58
            r2 = r7[r1]
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 >= 0) goto L1f
            int r3 = r7.length
            int r3 = r3 - r0
            if (r1 != r3) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto Le
        L1f:
            int r0 = r1 + (-1)
            r7 = r7[r0]
            float r2 = r2 - r7
            float r5 = r5 - r7
            float r5 = r5 / r2
            r7 = r8[r1]
            r8 = r8[r0]
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r0
            int r6 = (int) r6
            int r0 = android.graphics.Color.red(r8)
            int r1 = android.graphics.Color.red(r7)
            int r0 = com.bytedance.adsdk.lottie.up.cw.j(r5, r0, r1)
            int r1 = android.graphics.Color.green(r8)
            int r2 = android.graphics.Color.green(r7)
            int r1 = com.bytedance.adsdk.lottie.up.cw.j(r5, r1, r2)
            int r8 = android.graphics.Color.blue(r8)
            int r7 = android.graphics.Color.blue(r7)
            int r5 = com.bytedance.adsdk.lottie.up.cw.j(r5, r8, r7)
            int r5 = android.graphics.Color.argb(r6, r0, r1, r5)
            return r5
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unreachable code."
            r5.<init>(r6)
            throw r5
        L60:
            r5 = r8[r2]
            return r5
    }

    public com.bytedance.adsdk.lottie.model.xt.r j(android.util.JsonReader r18, float r19) throws java.io.IOException {
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.util.JsonToken r2 = r18.peek()
            android.util.JsonToken r3 = android.util.JsonToken.BEGIN_ARRAY
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L19
            r18.beginArray()
        L19:
            boolean r3 = r18.hasNext()
            if (r3 == 0) goto L2c
            double r6 = r18.nextDouble()
            float r3 = (float) r6
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.add(r3)
            goto L19
        L2c:
            int r3 = r1.size()
            r6 = 3
            r7 = 2
            r8 = 4
            if (r3 != r8) goto L6b
            java.lang.Object r3 = r1.get(r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r9 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L6b
            r3 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.set(r5, r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r9)
            r1.add(r3)
            java.lang.Object r3 = r1.get(r4)
            r1.add(r3)
            java.lang.Object r3 = r1.get(r7)
            r1.add(r3)
            java.lang.Object r3 = r1.get(r6)
            r1.add(r3)
            r0.j = r7
        L6b:
            if (r2 == 0) goto L70
            r18.endArray()
        L70:
            int r2 = r0.j
            r3 = -1
            if (r2 != r3) goto L7c
            int r2 = r1.size()
            int r2 = r2 / r8
            r0.j = r2
        L7c:
            int r2 = r0.j
            float[] r3 = new float[r2]
            int[] r2 = new int[r2]
            r9 = 0
            r10 = 0
        L84:
            int r11 = r0.j
            int r11 = r11 * 4
            if (r5 >= r11) goto Ld3
            int r11 = r5 / 4
            java.lang.Object r12 = r1.get(r5)
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            double r12 = (double) r12
            int r14 = r5 % 4
            if (r14 == 0) goto Lbb
            r15 = 4643176031446892544(0x406fe00000000000, double:255.0)
            if (r14 == r4) goto Lb7
            if (r14 == r7) goto Lb3
            if (r14 == r6) goto La7
            goto Ld0
        La7:
            double r12 = r12 * r15
            int r12 = (int) r12
            r13 = 255(0xff, float:3.57E-43)
            int r12 = android.graphics.Color.argb(r13, r9, r10, r12)
            r2[r11] = r12
            goto Ld0
        Lb3:
            double r12 = r12 * r15
            int r10 = (int) r12
            goto Ld0
        Lb7:
            double r12 = r12 * r15
            int r9 = (int) r12
            goto Ld0
        Lbb:
            if (r11 <= 0) goto Lcd
            int r14 = r11 + (-1)
            r14 = r3[r14]
            float r15 = (float) r12
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 < 0) goto Lcd
            r12 = 1008981770(0x3c23d70a, float:0.01)
            float r15 = r15 + r12
            r3[r11] = r15
            goto Ld0
        Lcd:
            float r12 = (float) r12
            r3[r11] = r12
        Ld0:
            int r5 = r5 + 1
            goto L84
        Ld3:
            com.bytedance.adsdk.lottie.model.xt.r r4 = new com.bytedance.adsdk.lottie.model.xt.r
            r4.<init>(r3, r2)
            com.bytedance.adsdk.lottie.model.xt.r r1 = r0.j(r4, r1)
            return r1
    }

    @Override // com.bytedance.adsdk.lottie.r.nd
    public /* synthetic */ com.bytedance.adsdk.lottie.model.xt.r xt(android.util.JsonReader r1, float r2) throws java.io.IOException {
            r0 = this;
            com.bytedance.adsdk.lottie.model.xt.r r1 = r0.j(r1, r2)
            return r1
    }
}

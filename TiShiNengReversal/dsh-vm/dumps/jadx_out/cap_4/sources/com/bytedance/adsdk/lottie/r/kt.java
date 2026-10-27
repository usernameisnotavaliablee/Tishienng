package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class kt {
    private static final android.view.animation.Interpolator j = null;
    private static android.util.SparseArray<java.lang.ref.WeakReference<android.view.animation.Interpolator>> xt;

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            com.bytedance.adsdk.lottie.r.kt.j = r0
            return
    }

    kt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.util.SparseArray<java.lang.ref.WeakReference<android.view.animation.Interpolator>> j() {
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = com.bytedance.adsdk.lottie.r.kt.xt
            if (r0 != 0) goto Lb
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            com.bytedance.adsdk.lottie.r.kt.xt = r0
        Lb:
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = com.bytedance.adsdk.lottie.r.kt.xt
            return r0
    }

    private static android.view.animation.Interpolator j(android.graphics.PointF r6, android.graphics.PointF r7) {
            float r0 = r6.x
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.bytedance.adsdk.lottie.up.tl.xt(r0, r1, r2)
            r6.x = r0
            float r0 = r6.y
            r3 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r4 = 1120403456(0x42c80000, float:100.0)
            float r0 = com.bytedance.adsdk.lottie.up.tl.xt(r0, r3, r4)
            r6.y = r0
            float r0 = r7.x
            float r0 = com.bytedance.adsdk.lottie.up.tl.xt(r0, r1, r2)
            r7.x = r0
            float r0 = r7.y
            float r0 = com.bytedance.adsdk.lottie.up.tl.xt(r0, r3, r4)
            r7.y = r0
            float r1 = r6.x
            float r3 = r6.y
            float r4 = r7.x
            int r0 = com.bytedance.adsdk.lottie.up.g.j(r1, r3, r4, r0)
            boolean r1 = com.bytedance.adsdk.lottie.up.j()
            r3 = 0
            if (r1 == 0) goto L3b
            r1 = r3
            goto L3f
        L3b:
            java.lang.ref.WeakReference r1 = j(r0)
        L3f:
            if (r1 == 0) goto L47
            java.lang.Object r3 = r1.get()
            android.view.animation.Interpolator r3 = (android.view.animation.Interpolator) r3
        L47:
            if (r1 == 0) goto L4d
            if (r3 != 0) goto L4c
            goto L4d
        L4c:
            return r3
        L4d:
            float r1 = r6.x     // Catch: java.lang.IllegalArgumentException -> L5a
            float r3 = r6.y     // Catch: java.lang.IllegalArgumentException -> L5a
            float r4 = r7.x     // Catch: java.lang.IllegalArgumentException -> L5a
            float r5 = r7.y     // Catch: java.lang.IllegalArgumentException -> L5a
            android.view.animation.Interpolator r6 = com.bytedance.adsdk.lottie.i.j(r1, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            goto L82
        L5a:
            r1 = move-exception
            java.lang.String r3 = "The Path cannot loop back on itself."
            java.lang.String r1 = r1.getMessage()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L7d
            float r1 = r6.x
            float r1 = java.lang.Math.min(r1, r2)
            float r6 = r6.y
            float r2 = r7.x
            r3 = 0
            float r2 = java.lang.Math.max(r2, r3)
            float r7 = r7.y
            android.view.animation.Interpolator r6 = com.bytedance.adsdk.lottie.i.j(r1, r6, r2, r7)
            goto L82
        L7d:
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
        L82:
            boolean r7 = com.bytedance.adsdk.lottie.up.j()
            if (r7 != 0) goto L90
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L90
            r7.<init>(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L90
            j(r0, r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L90
        L90:
            return r6
    }

    private static <T> com.bytedance.adsdk.lottie.m.j<T> j(android.util.JsonReader r0, float r1, com.bytedance.adsdk.lottie.r.nd<T> r2) throws java.io.IOException {
            java.lang.Object r0 = r2.xt(r0, r1)
            com.bytedance.adsdk.lottie.m.j r1 = new com.bytedance.adsdk.lottie.m.j
            r1.<init>(r0)
            return r1
    }

    static <T> com.bytedance.adsdk.lottie.m.j<T> j(android.util.JsonReader r0, com.bytedance.adsdk.lottie.m r1, float r2, com.bytedance.adsdk.lottie.r.nd<T> r3, boolean r4, boolean r5) throws java.io.IOException {
            if (r4 == 0) goto L9
            if (r5 == 0) goto L9
            com.bytedance.adsdk.lottie.m.j r0 = xt(r1, r0, r2, r3)
            return r0
        L9:
            if (r4 == 0) goto L10
            com.bytedance.adsdk.lottie.m.j r0 = j(r1, r0, r2, r3)
            return r0
        L10:
            com.bytedance.adsdk.lottie.m.j r0 = j(r0, r2, r3)
            return r0
    }

    private static <T> com.bytedance.adsdk.lottie.m.j<T> j(com.bytedance.adsdk.lottie.m r16, android.util.JsonReader r17, float r18, com.bytedance.adsdk.lottie.r.nd<T> r19) throws java.io.IOException {
            r0 = r17
            r1 = r18
            r2 = r19
            r0.beginObject()
            r3 = 0
            r4 = 0
            r5 = 0
            r4 = r3
            r6 = r4
            r8 = r6
            r13 = r8
            r14 = r13
            r7 = 0
            r11 = 0
        L13:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto Lc1
            java.lang.String r9 = r0.nextName()
            r9.getClass()
            int r10 = r9.hashCode()
            r12 = 1
            r15 = -1
            switch(r10) {
                case 101: goto L78;
                case 104: goto L6d;
                case 105: goto L62;
                case 111: goto L57;
                case 115: goto L4c;
                case 116: goto L41;
                case 3701: goto L36;
                case 3707: goto L2b;
                default: goto L29;
            }
        L29:
            goto L82
        L2b:
            java.lang.String r10 = "to"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L34
            goto L82
        L34:
            r15 = 7
            goto L82
        L36:
            java.lang.String r10 = "ti"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L3f
            goto L82
        L3f:
            r15 = 6
            goto L82
        L41:
            java.lang.String r10 = "t"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L4a
            goto L82
        L4a:
            r15 = 5
            goto L82
        L4c:
            java.lang.String r10 = "s"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L55
            goto L82
        L55:
            r15 = 4
            goto L82
        L57:
            java.lang.String r10 = "o"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L60
            goto L82
        L60:
            r15 = 3
            goto L82
        L62:
            java.lang.String r10 = "i"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L6b
            goto L82
        L6b:
            r15 = 2
            goto L82
        L6d:
            java.lang.String r10 = "h"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L76
            goto L82
        L76:
            r15 = 1
            goto L82
        L78:
            java.lang.String r10 = "e"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L81
            goto L82
        L81:
            r15 = 0
        L82:
            r9 = 1065353216(0x3f800000, float:1.0)
            switch(r15) {
                case 0: goto Lbb;
                case 1: goto Laf;
                case 2: goto La9;
                case 3: goto La3;
                case 4: goto L9d;
                case 5: goto L96;
                case 6: goto L90;
                case 7: goto L8b;
                default: goto L87;
            }
        L87:
            r0.skipValue()
            goto L13
        L8b:
            android.graphics.PointF r13 = com.bytedance.adsdk.lottie.r.mi.xt(r17, r18)
            goto L13
        L90:
            android.graphics.PointF r14 = com.bytedance.adsdk.lottie.r.mi.xt(r17, r18)
            goto L13
        L96:
            double r9 = r0.nextDouble()
            float r11 = (float) r9
            goto L13
        L9d:
            java.lang.Object r8 = r2.xt(r0, r1)
            goto L13
        La3:
            android.graphics.PointF r3 = com.bytedance.adsdk.lottie.r.mi.xt(r0, r9)
            goto L13
        La9:
            android.graphics.PointF r4 = com.bytedance.adsdk.lottie.r.mi.xt(r0, r9)
            goto L13
        Laf:
            int r7 = r0.nextInt()
            if (r7 != r12) goto Lb8
            r7 = 1
            goto L13
        Lb8:
            r7 = 0
            goto L13
        Lbb:
            java.lang.Object r6 = r2.xt(r0, r1)
            goto L13
        Lc1:
            r0.endObject()
            if (r7 == 0) goto Lc8
            r6 = r8
            goto Ld3
        Lc8:
            if (r3 == 0) goto Ld3
            if (r4 == 0) goto Ld3
            android.view.animation.Interpolator r0 = j(r3, r4)
        Ld0:
            r10 = r0
            r9 = r6
            goto Ld6
        Ld3:
            android.view.animation.Interpolator r0 = com.bytedance.adsdk.lottie.r.kt.j
            goto Ld0
        Ld6:
            com.bytedance.adsdk.lottie.m.j r6 = new com.bytedance.adsdk.lottie.m.j
            r12 = 0
            r7 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6.tl = r13
            r6.g = r14
            return r6
    }

    private static java.lang.ref.WeakReference<android.view.animation.Interpolator> j(int r2) {
            java.lang.Class<com.bytedance.adsdk.lottie.r.kt> r0 = com.bytedance.adsdk.lottie.r.kt.class
            monitor-enter(r0)
            android.util.SparseArray r1 = j()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private static void j(int r2, java.lang.ref.WeakReference<android.view.animation.Interpolator> r3) {
            java.lang.Class<com.bytedance.adsdk.lottie.r.kt> r0 = com.bytedance.adsdk.lottie.r.kt.class
            monitor-enter(r0)
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r1 = com.bytedance.adsdk.lottie.r.kt.xt     // Catch: java.lang.Throwable -> La
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    private static <T> com.bytedance.adsdk.lottie.m.j<T> xt(com.bytedance.adsdk.lottie.m r24, android.util.JsonReader r25, float r26, com.bytedance.adsdk.lottie.r.nd<T> r27) throws java.io.IOException {
            r0 = r25
            r1 = r26
            r2 = r27
            r0.beginObject()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L17:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L22a
            java.lang.String r3 = r0.nextName()
            r3.getClass()
            int r19 = r3.hashCode()
            r4 = 1
            r20 = -1
            switch(r19) {
                case 101: goto L84;
                case 104: goto L78;
                case 105: goto L6c;
                case 111: goto L60;
                case 115: goto L54;
                case 116: goto L48;
                case 3701: goto L3c;
                case 3707: goto L30;
                default: goto L2e;
            }
        L2e:
            goto L8f
        L30:
            java.lang.String r5 = "to"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L39
            goto L8f
        L39:
            r20 = 7
            goto L8f
        L3c:
            java.lang.String r5 = "ti"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L45
            goto L8f
        L45:
            r20 = 6
            goto L8f
        L48:
            java.lang.String r5 = "t"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L51
            goto L8f
        L51:
            r20 = 5
            goto L8f
        L54:
            java.lang.String r5 = "s"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L5d
            goto L8f
        L5d:
            r20 = 4
            goto L8f
        L60:
            java.lang.String r5 = "o"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L69
            goto L8f
        L69:
            r20 = 3
            goto L8f
        L6c:
            java.lang.String r5 = "i"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L75
            goto L8f
        L75:
            r20 = 2
            goto L8f
        L78:
            java.lang.String r5 = "h"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L81
            goto L8f
        L81:
            r20 = 1
            goto L8f
        L84:
            java.lang.String r5 = "e"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L8d
            goto L8f
        L8d:
            r20 = 0
        L8f:
            java.lang.String r3 = "y"
            java.lang.String r5 = "x"
            switch(r20) {
                case 0: goto L21c;
                case 1: goto L20c;
                case 2: goto L16b;
                case 3: goto Lb6;
                case 4: goto Lb0;
                case 5: goto La7;
                case 6: goto La1;
                case 7: goto L9b;
                default: goto L96;
            }
        L96:
            r0.skipValue()
            goto L17
        L9b:
            android.graphics.PointF r14 = com.bytedance.adsdk.lottie.r.mi.xt(r25, r26)
            goto L17
        La1:
            android.graphics.PointF r15 = com.bytedance.adsdk.lottie.r.mi.xt(r25, r26)
            goto L17
        La7:
            double r3 = r0.nextDouble()
            float r3 = (float) r3
            r16 = r3
            goto L17
        Lb0:
            java.lang.Object r10 = r2.xt(r0, r1)
            goto L17
        Lb6:
            android.util.JsonToken r4 = r0.peek()
            r20 = r6
            android.util.JsonToken r6 = android.util.JsonToken.BEGIN_OBJECT
            if (r4 != r6) goto L160
            r0.beginObject()
            r4 = 0
            r6 = 0
            r9 = 0
            r11 = 0
        Lc7:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L147
            r21 = r10
            java.lang.String r10 = r0.nextName()
            r10.getClass()
            boolean r22 = r10.equals(r5)
            if (r22 != 0) goto L11b
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto Le8
            r0.skipValue()
        Le5:
            r10 = r21
            goto Lc7
        Le8:
            android.util.JsonToken r6 = r0.peek()
            android.util.JsonToken r10 = android.util.JsonToken.NUMBER
            if (r6 != r10) goto Lf7
            double r10 = r0.nextDouble()
            float r11 = (float) r10
            r6 = r11
            goto Le5
        Lf7:
            r0.beginArray()
            r22 = r14
            r23 = r15
            double r14 = r0.nextDouble()
            float r6 = (float) r14
            android.util.JsonToken r11 = r0.peek()
            if (r11 != r10) goto L110
            double r10 = r0.nextDouble()
            float r10 = (float) r10
            r11 = r10
            goto L111
        L110:
            r11 = r6
        L111:
            r0.endArray()
        L114:
            r10 = r21
            r14 = r22
            r15 = r23
            goto Lc7
        L11b:
            r22 = r14
            r23 = r15
            android.util.JsonToken r4 = r0.peek()
            android.util.JsonToken r9 = android.util.JsonToken.NUMBER
            if (r4 != r9) goto L12e
            double r9 = r0.nextDouble()
            float r9 = (float) r9
            r4 = r9
            goto L114
        L12e:
            r0.beginArray()
            double r14 = r0.nextDouble()
            float r4 = (float) r14
            android.util.JsonToken r10 = r0.peek()
            if (r10 != r9) goto L142
            double r9 = r0.nextDouble()
            float r9 = (float) r9
            goto L143
        L142:
            r9 = r4
        L143:
            r0.endArray()
            goto L114
        L147:
            r21 = r10
            r22 = r14
            r23 = r15
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r4, r6)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r0.endObject()
            r9 = r3
            r11 = r4
        L15c:
            r6 = r20
            goto L17
        L160:
            r21 = r10
            r22 = r14
            r23 = r15
            android.graphics.PointF r7 = com.bytedance.adsdk.lottie.r.mi.xt(r25, r26)
            goto L15c
        L16b:
            r20 = r6
            r21 = r10
            r22 = r14
            r23 = r15
            android.util.JsonToken r4 = r0.peek()
            android.util.JsonToken r6 = android.util.JsonToken.BEGIN_OBJECT
            if (r4 != r6) goto L207
            r0.beginObject()
            r4 = 0
            r6 = 0
            r10 = 0
            r12 = 0
        L182:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L1ef
            java.lang.String r13 = r0.nextName()
            r13.getClass()
            boolean r14 = r13.equals(r5)
            if (r14 != 0) goto L1c7
            boolean r13 = r13.equals(r3)
            if (r13 != 0) goto L19f
            r0.skipValue()
            goto L182
        L19f:
            android.util.JsonToken r6 = r0.peek()
            android.util.JsonToken r12 = android.util.JsonToken.NUMBER
            if (r6 != r12) goto L1ae
            double r12 = r0.nextDouble()
            float r12 = (float) r12
            r6 = r12
            goto L182
        L1ae:
            r0.beginArray()
            double r13 = r0.nextDouble()
            float r6 = (float) r13
            android.util.JsonToken r13 = r0.peek()
            if (r13 != r12) goto L1c2
            double r12 = r0.nextDouble()
            float r12 = (float) r12
            goto L1c3
        L1c2:
            r12 = r6
        L1c3:
            r0.endArray()
            goto L182
        L1c7:
            android.util.JsonToken r4 = r0.peek()
            android.util.JsonToken r10 = android.util.JsonToken.NUMBER
            if (r4 != r10) goto L1d6
            double r13 = r0.nextDouble()
            float r10 = (float) r13
            r4 = r10
            goto L182
        L1d6:
            r0.beginArray()
            double r13 = r0.nextDouble()
            float r4 = (float) r13
            android.util.JsonToken r13 = r0.peek()
            if (r13 != r10) goto L1ea
            double r13 = r0.nextDouble()
            float r10 = (float) r13
            goto L1eb
        L1ea:
            r10 = r4
        L1eb:
            r0.endArray()
            goto L182
        L1ef:
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r4, r6)
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>(r10, r12)
            r0.endObject()
            r12 = r3
        L1fd:
            r6 = r20
        L1ff:
            r10 = r21
            r14 = r22
            r15 = r23
            goto L17
        L207:
            android.graphics.PointF r8 = com.bytedance.adsdk.lottie.r.mi.xt(r25, r26)
            goto L1fd
        L20c:
            r21 = r10
            r22 = r14
            r23 = r15
            int r3 = r0.nextInt()
            if (r3 != r4) goto L21a
            r6 = 1
            goto L1ff
        L21a:
            r6 = 0
            goto L1ff
        L21c:
            r20 = r6
            r21 = r10
            r22 = r14
            r23 = r15
            java.lang.Object r17 = r2.xt(r0, r1)
            goto L17
        L22a:
            r20 = r6
            r21 = r10
            r22 = r14
            r23 = r15
            r0.endObject()
            if (r20 == 0) goto L23a
            r17 = r21
            goto L25e
        L23a:
            if (r7 == 0) goto L248
            if (r8 == 0) goto L248
            android.view.animation.Interpolator r0 = j(r7, r8)
        L242:
            r3 = r0
            r11 = r17
            r12 = 0
            r13 = 0
            goto L261
        L248:
            if (r9 == 0) goto L25e
            if (r11 == 0) goto L25e
            if (r12 == 0) goto L25e
            if (r13 == 0) goto L25e
            android.view.animation.Interpolator r0 = j(r9, r12)
            android.view.animation.Interpolator r1 = j(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r17
            r3 = 0
            goto L261
        L25e:
            android.view.animation.Interpolator r0 = com.bytedance.adsdk.lottie.r.kt.j
            goto L242
        L261:
            if (r12 == 0) goto L276
            if (r13 == 0) goto L276
            com.bytedance.adsdk.lottie.m.j r8 = new com.bytedance.adsdk.lottie.m.j
            r15 = 0
            r9 = r24
            r14 = r16
            r10 = r21
            r0 = r22
            r1 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L287
        L276:
            r13 = r16
            r10 = r21
            r0 = r22
            r1 = r23
            com.bytedance.adsdk.lottie.m.j r8 = new com.bytedance.adsdk.lottie.m.j
            r14 = 0
            r9 = r24
            r12 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L287:
            r8.tl = r0
            r8.g = r1
            return r8
    }
}

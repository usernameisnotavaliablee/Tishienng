package com.scwang.smartrefresh.layout.internal.pathview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class a {
    private static final java.lang.String a = "PathParser";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.scwang.smartrefresh.layout.internal.pathview.a$a, reason: collision with other inner class name */
    private static class C0185a {
        int a;
        boolean b;

        C0185a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        char a;
        float[] b;

        b(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        b(com.scwang.smartrefresh.layout.internal.pathview.a.b r3) {
                r2 = this;
                r2.<init>()
                char r0 = r3.a
                r2.a = r0
                float[] r3 = r3.b
                r0 = 0
                int r1 = r3.length
                float[] r3 = com.scwang.smartrefresh.layout.internal.pathview.a.c(r3, r0, r1)
                r2.b = r3
                return
        }

        private static void a(android.graphics.Path r26, float[] r27, char r28, char r29, float[] r30) {
                r0 = r26
                r10 = r29
                r11 = r30
                r12 = 0
                r1 = r27[r12]
                r13 = 1
                r2 = r27[r13]
                r14 = 2
                r3 = r27[r14]
                r15 = 3
                r4 = r27[r15]
                r16 = 4
                r5 = r27[r16]
                r17 = 5
                r6 = r27[r17]
                switch(r10) {
                    case 65: goto L35;
                    case 67: goto L31;
                    case 72: goto L2e;
                    case 76: goto L1d;
                    case 77: goto L1d;
                    case 81: goto L2b;
                    case 83: goto L2b;
                    case 84: goto L1d;
                    case 86: goto L2e;
                    case 90: goto L20;
                    case 97: goto L35;
                    case 99: goto L31;
                    case 104: goto L2e;
                    case 108: goto L1d;
                    case 109: goto L1d;
                    case 113: goto L2b;
                    case 115: goto L2b;
                    case 116: goto L1d;
                    case 118: goto L2e;
                    case 122: goto L20;
                    default: goto L1d;
                }
            L1d:
                r18 = 2
                goto L38
            L20:
                r0.close()
                r0.moveTo(r5, r6)
                r1 = r5
                r3 = r1
                r2 = r6
                r4 = r2
                goto L1d
            L2b:
                r18 = 4
                goto L38
            L2e:
                r18 = 1
                goto L38
            L31:
                r7 = 6
                r18 = 6
                goto L38
            L35:
                r7 = 7
                r18 = 7
            L38:
                r7 = r1
                r8 = r2
                r19 = r5
                r20 = r6
                r9 = 0
                r1 = r28
            L41:
                int r2 = r11.length
                if (r9 >= r2) goto L31d
                r2 = 65
                if (r10 == r2) goto L2ce
                r2 = 67
                if (r10 == r2) goto L29f
                r6 = 72
                if (r10 == r6) goto L28b
                r6 = 81
                if (r10 == r6) goto L265
                r21 = 0
                r12 = 86
                if (r10 == r12) goto L254
                r12 = 97
                if (r10 == r12) goto L209
                r12 = 99
                if (r10 == r12) goto L1da
                r22 = 1
                r13 = 104(0x68, float:1.46E-43)
                if (r10 == r13) goto L1cb
                r13 = 113(0x71, float:1.58E-43)
                if (r10 == r13) goto L1a9
                r23 = 2
                r14 = 118(0x76, float:1.65E-43)
                if (r10 == r14) goto L19d
                r14 = 76
                if (r10 == r14) goto L18d
                r14 = 77
                if (r10 == r14) goto L173
                r14 = 115(0x73, float:1.61E-43)
                r24 = 3
                r15 = 83
                r25 = 1073741824(0x40000000, float:2.0)
                if (r10 == r15) goto L13c
                r5 = 116(0x74, float:1.63E-43)
                r15 = 84
                if (r10 == r15) goto L11a
                r2 = 108(0x6c, float:1.51E-43)
                if (r10 == r2) goto L109
                r2 = 109(0x6d, float:1.53E-43)
                if (r10 == r2) goto Lf3
                if (r10 == r14) goto Lbd
                if (r10 == r5) goto L99
            L96:
                r14 = r9
                goto L312
            L99:
                if (r1 == r13) goto La5
                if (r1 == r5) goto La5
                if (r1 == r6) goto La5
                if (r1 != r15) goto La2
                goto La5
            La2:
                r1 = 0
                r5 = 0
                goto La9
            La5:
                float r5 = r7 - r3
                float r1 = r8 - r4
            La9:
                r2 = r11[r9]
                int r3 = r9 + 1
                r4 = r11[r3]
                r0.rQuadTo(r5, r1, r2, r4)
                float r5 = r5 + r7
                float r1 = r1 + r8
                r2 = r11[r9]
                float r7 = r7 + r2
                r2 = r11[r3]
                float r8 = r8 + r2
                r4 = r1
                r3 = r5
                goto L96
            Lbd:
                if (r1 == r12) goto Lcd
                if (r1 == r14) goto Lcd
                r2 = 67
                if (r1 == r2) goto Lcd
                r2 = 83
                if (r1 != r2) goto Lca
                goto Lcd
            Lca:
                r1 = 0
                r2 = 0
                goto Ld3
            Lcd:
                float r5 = r7 - r3
                float r1 = r8 - r4
                r2 = r1
                r1 = r5
            Ld3:
                r3 = r11[r9]
                int r12 = r9 + 1
                r4 = r11[r12]
                int r13 = r9 + 2
                r5 = r11[r13]
                int r14 = r9 + 3
                r6 = r11[r14]
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r1 = r11[r9]
                float r1 = r1 + r7
                r2 = r11[r12]
                float r2 = r2 + r8
                r3 = r11[r13]
                float r7 = r7 + r3
                r3 = r11[r14]
            Lef:
                float r8 = r8 + r3
                r3 = r1
                r4 = r2
                goto L96
            Lf3:
                r1 = r11[r9]
                float r7 = r7 + r1
                int r2 = r9 + 1
                r2 = r11[r2]
                float r8 = r8 + r2
                if (r9 <= 0) goto L101
                r0.rLineTo(r1, r2)
                goto L96
            L101:
                r0.rMoveTo(r1, r2)
                r19 = r7
            L106:
                r20 = r8
                goto L96
            L109:
                r1 = r11[r9]
                int r2 = r9 + 1
                r5 = r11[r2]
                r0.rLineTo(r1, r5)
                r1 = r11[r9]
                float r7 = r7 + r1
                r1 = r11[r2]
            L117:
                float r8 = r8 + r1
                goto L96
            L11a:
                if (r1 == r13) goto L122
                if (r1 == r5) goto L122
                if (r1 == r6) goto L122
                if (r1 != r15) goto L128
            L122:
                float r7 = r7 * r25
                float r7 = r7 - r3
                float r8 = r8 * r25
                float r8 = r8 - r4
            L128:
                r1 = r11[r9]
                int r2 = r9 + 1
                r3 = r11[r2]
                r0.quadTo(r7, r8, r1, r3)
                r1 = r11[r9]
                r2 = r11[r2]
                r3 = r7
                r4 = r8
                r14 = r9
                r7 = r1
            L139:
                r8 = r2
                goto L312
            L13c:
                if (r1 == r12) goto L14c
                if (r1 == r14) goto L14c
                r2 = 67
                if (r1 == r2) goto L14c
                r2 = 83
                if (r1 != r2) goto L149
                goto L14c
            L149:
                r1 = r7
                r2 = r8
                goto L153
            L14c:
                float r7 = r7 * r25
                float r7 = r7 - r3
                float r8 = r8 * r25
                float r8 = r8 - r4
                goto L149
            L153:
                r3 = r11[r9]
                int r7 = r9 + 1
                r4 = r11[r7]
                int r8 = r9 + 2
                r5 = r11[r8]
                int r12 = r9 + 3
                r6 = r11[r12]
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r1 = r11[r9]
                r2 = r11[r7]
                r3 = r11[r8]
                r4 = r11[r12]
                r7 = r3
                r8 = r4
                r14 = r9
            L16f:
                r3 = r1
                r4 = r2
                goto L312
            L173:
                r24 = 3
                r1 = r11[r9]
                int r2 = r9 + 1
                r2 = r11[r2]
                if (r9 <= 0) goto L184
                r0.lineTo(r1, r2)
            L180:
                r7 = r1
                r8 = r2
                goto L96
            L184:
                r0.moveTo(r1, r2)
                r7 = r1
                r19 = r7
                r8 = r2
                goto L106
            L18d:
                r24 = 3
                r1 = r11[r9]
                int r2 = r9 + 1
                r5 = r11[r2]
                r0.lineTo(r1, r5)
                r1 = r11[r9]
                r2 = r11[r2]
                goto L180
            L19d:
                r24 = 3
                r1 = r11[r9]
                r2 = 0
                r0.rLineTo(r2, r1)
                r1 = r11[r9]
                goto L117
            L1a9:
                r23 = 2
                r24 = 3
                r1 = r11[r9]
                int r2 = r9 + 1
                r3 = r11[r2]
                int r4 = r9 + 2
                r5 = r11[r4]
                int r6 = r9 + 3
                r12 = r11[r6]
                r0.rQuadTo(r1, r3, r5, r12)
                r1 = r11[r9]
                float r1 = r1 + r7
                r2 = r11[r2]
                float r2 = r2 + r8
                r3 = r11[r4]
                float r7 = r7 + r3
                r3 = r11[r6]
                goto Lef
            L1cb:
                r23 = 2
                r24 = 3
                r1 = r11[r9]
                r2 = 0
                r0.rLineTo(r1, r2)
                r1 = r11[r9]
                float r7 = r7 + r1
                goto L96
            L1da:
                r22 = 1
                r23 = 2
                r24 = 3
                r1 = r11[r9]
                int r2 = r9 + 1
                r2 = r11[r2]
                int r12 = r9 + 2
                r3 = r11[r12]
                int r13 = r9 + 3
                r4 = r11[r13]
                int r14 = r9 + 4
                r5 = r11[r14]
                int r15 = r9 + 5
                r6 = r11[r15]
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r11[r12]
                float r0 = r0 + r7
                r1 = r11[r13]
                float r1 = r1 + r8
                r2 = r11[r14]
                float r7 = r7 + r2
                r2 = r11[r15]
                float r8 = r8 + r2
                r3 = r0
                r4 = r1
                goto L96
            L209:
                r22 = 1
                r23 = 2
                r24 = 3
                int r12 = r9 + 5
                r0 = r11[r12]
                float r3 = r0 + r7
                int r13 = r9 + 6
                r0 = r11[r13]
                float r4 = r0 + r8
                r5 = r11[r9]
                int r0 = r9 + 1
                r6 = r11[r0]
                int r0 = r9 + 2
                r0 = r11[r0]
                int r1 = r9 + 3
                r1 = r11[r1]
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                r2 = r8
                if (r1 == 0) goto L232
                r8 = 1
            L230:
                r1 = 0
                goto L234
            L232:
                r8 = 0
                goto L230
            L234:
                int r14 = r9 + 4
                r14 = r11[r14]
                int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                r14 = r9
                if (r1 == 0) goto L243
                r9 = 1
            L23e:
                r1 = r7
                r7 = r0
                r0 = r26
                goto L245
            L243:
                r9 = 0
                goto L23e
            L245:
                c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r3 = r11[r12]
                float r7 = r1 + r3
                r1 = r11[r13]
                float r8 = r2 + r1
                r3 = r7
                r4 = r8
                goto L312
            L254:
                r1 = r7
                r14 = r9
                r22 = 1
                r23 = 2
                r24 = 3
                r2 = r11[r14]
                r0.lineTo(r1, r2)
                r2 = r11[r14]
                goto L139
            L265:
                r14 = r9
                r21 = 0
                r22 = 1
                r23 = 2
                r24 = 3
                r1 = r11[r14]
                int r9 = r14 + 1
                r2 = r11[r9]
                int r3 = r14 + 2
                r4 = r11[r3]
                int r5 = r14 + 3
                r6 = r11[r5]
                r0.quadTo(r1, r2, r4, r6)
                r1 = r11[r14]
                r2 = r11[r9]
                r3 = r11[r3]
                r4 = r11[r5]
                r7 = r3
                r8 = r4
                goto L16f
            L28b:
                r2 = r8
                r14 = r9
                r21 = 0
                r22 = 1
                r23 = 2
                r24 = 3
                r1 = r11[r14]
                r0.lineTo(r1, r2)
                r1 = r11[r14]
                r7 = r1
                goto L312
            L29f:
                r14 = r9
                r21 = 0
                r22 = 1
                r23 = 2
                r24 = 3
                r1 = r11[r14]
                int r9 = r14 + 1
                r2 = r11[r9]
                int r9 = r14 + 2
                r3 = r11[r9]
                int r7 = r14 + 3
                r4 = r11[r7]
                int r8 = r14 + 4
                r5 = r11[r8]
                int r12 = r14 + 5
                r6 = r11[r12]
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r11[r8]
                r1 = r11[r12]
                r2 = r11[r9]
                r3 = r11[r7]
                r7 = r0
                r8 = r1
                r4 = r3
                r3 = r2
                goto L312
            L2ce:
                r1 = r7
                r2 = r8
                r14 = r9
                r21 = 0
                r22 = 1
                r23 = 2
                r24 = 3
                int r12 = r14 + 5
                r3 = r11[r12]
                int r13 = r14 + 6
                r4 = r11[r13]
                r5 = r11[r14]
                int r9 = r14 + 1
                r6 = r11[r9]
                int r9 = r14 + 2
                r7 = r11[r9]
                int r9 = r14 + 3
                r0 = r11[r9]
                r8 = 0
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 == 0) goto L2f7
                r8 = 1
            L2f5:
                r0 = 0
                goto L2f9
            L2f7:
                r8 = 0
                goto L2f5
            L2f9:
                int r9 = r14 + 4
                r9 = r11[r9]
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L305
                r9 = 1
            L302:
                r0 = r26
                goto L307
            L305:
                r9 = 0
                goto L302
            L307:
                c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = r11[r12]
                r1 = r11[r13]
                r3 = r0
                r7 = r3
                r4 = r1
                r8 = r4
            L312:
                int r9 = r14 + r18
                r0 = r26
                r1 = r10
                r12 = 0
                r13 = 1
                r14 = 2
                r15 = 3
                goto L41
            L31d:
                r1 = r7
                r2 = r8
                r21 = 0
                r22 = 1
                r23 = 2
                r24 = 3
                r27[r21] = r1
                r27[r22] = r2
                r27[r23] = r3
                r27[r24] = r4
                r27[r16] = r19
                r27[r17] = r20
                return
        }

        private static void b(android.graphics.Path r46, double r47, double r49, double r51, double r53, double r55, double r57, double r59, double r61, double r63) {
                r0 = r51
                r2 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r4 = r63 * r2
                r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r4 = r4 / r6
                double r4 = java.lang.Math.abs(r4)
                double r4 = java.lang.Math.ceil(r4)
                int r4 = (int) r4
                double r5 = java.lang.Math.cos(r59)
                double r7 = java.lang.Math.sin(r59)
                double r9 = java.lang.Math.cos(r61)
                double r11 = java.lang.Math.sin(r61)
                double r13 = -r0
                double r15 = r13 * r5
                double r17 = r15 * r11
                double r19 = r53 * r7
                double r21 = r19 * r9
                double r17 = r17 - r21
                double r13 = r13 * r7
                double r11 = r11 * r13
                double r21 = r53 * r5
                double r9 = r9 * r21
                double r11 = r11 + r9
                double r9 = (double) r4
                double r9 = r63 / r9
                r23 = 0
                r23 = r61
                r29 = r2
                r25 = r11
                r27 = r17
                r2 = 0
                r11 = r55
                r17 = r57
            L4b:
                if (r2 >= r4) goto Lec
                double r31 = r23 + r9
                double r33 = java.lang.Math.sin(r31)
                double r35 = java.lang.Math.cos(r31)
                double r37 = r0 * r5
                double r37 = r37 * r35
                double r37 = r47 + r37
                double r39 = r19 * r33
                double r0 = r37 - r39
                double r37 = r51 * r7
                double r37 = r37 * r35
                double r37 = r49 + r37
                double r39 = r21 * r33
                r53 = r2
                double r2 = r37 + r39
                double r37 = r15 * r33
                double r39 = r19 * r35
                double r37 = r37 - r39
                double r33 = r33 * r13
                double r35 = r35 * r21
                double r33 = r33 + r35
                double r23 = r31 - r23
                r35 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r35 = r23 / r35
                double r35 = java.lang.Math.tan(r35)
                double r23 = java.lang.Math.sin(r23)
                r39 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r41 = r35 * r39
                double r41 = r41 * r35
                double r41 = r41 + r29
                double r35 = java.lang.Math.sqrt(r41)
                r41 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r35 = r35 - r41
                double r23 = r23 * r35
                double r23 = r23 / r39
                double r27 = r27 * r23
                double r11 = r11 + r27
                double r25 = r25 * r23
                r27 = r4
                r35 = r5
                double r4 = r17 + r25
                double r17 = r23 * r37
                r59 = r7
                double r6 = r0 - r17
                double r23 = r23 * r33
                r63 = r9
                double r8 = r2 - r23
                r10 = 0
                r17 = r13
                r13 = r46
                r13.rLineTo(r10, r10)
                float r10 = (float) r11
                float r4 = (float) r4
                float r5 = (float) r6
                float r6 = (float) r8
                float r7 = (float) r0
                float r8 = (float) r2
                r41 = r4
                r42 = r5
                r43 = r6
                r44 = r7
                r45 = r8
                r40 = r10
                r39 = r13
                r39.cubicTo(r40, r41, r42, r43, r44, r45)
                int r4 = r53 + 1
                r7 = r59
                r9 = r63
                r11 = r0
                r13 = r17
                r23 = r31
                r25 = r33
                r5 = r35
                r0 = r51
                r17 = r2
                r2 = r4
                r4 = r27
                r27 = r37
                goto L4b
            Lec:
                return
        }

        private static void c(android.graphics.Path r43, float r44, float r45, float r46, float r47, float r48, float r49, float r50, boolean r51, boolean r52) {
                r1 = r44
                r3 = r46
                r0 = r48
                r2 = r49
                r7 = r50
                double r4 = (double) r7
                double r19 = java.lang.Math.toRadians(r4)
                double r4 = java.lang.Math.cos(r19)
                double r8 = java.lang.Math.sin(r19)
                double r10 = (double) r1
                double r12 = r10 * r4
                r6 = r45
                double r14 = (double) r6
                double r16 = r14 * r8
                double r12 = r12 + r16
                r17 = r14
                r15 = r10
                r13 = r12
                double r11 = (double) r0
                double r13 = r13 / r11
                float r10 = -r1
                double r0 = (double) r10
                double r0 = r0 * r8
                double r21 = r17 * r4
                double r0 = r0 + r21
                r21 = r13
                double r13 = (double) r2
                double r0 = r0 / r13
                r23 = r0
                double r0 = (double) r3
                double r0 = r0 * r4
                r10 = r47
                r25 = r0
                double r0 = (double) r10
                double r27 = r0 * r8
                double r25 = r25 + r27
                double r25 = r25 / r11
                r27 = r0
                float r0 = -r3
                double r0 = (double) r0
                double r0 = r0 * r8
                double r27 = r27 * r4
                double r0 = r0 + r27
                double r0 = r0 / r13
                double r27 = r21 - r25
                double r29 = r23 - r0
                double r31 = r21 + r25
                r33 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r31 = r31 / r33
                double r35 = r23 + r0
                double r35 = r35 / r33
                double r33 = r27 * r27
                double r37 = r29 * r29
                double r33 = r33 + r37
                r37 = 0
                int r39 = (r33 > r37 ? 1 : (r33 == r37 ? 0 : -1))
                if (r39 != 0) goto L69
                return
            L69:
                r39 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r39 = r39 / r33
                r41 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r39 = r39 - r41
                int r41 = (r39 > r37 ? 1 : (r39 == r37 ? 0 : -1))
                if (r41 >= 0) goto L93
                double r0 = java.lang.Math.sqrt(r33)
                r4 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r0 = r0 / r4
                float r0 = (float) r0
                float r5 = r48 * r0
                float r0 = r0 * r2
                r1 = r44
                r8 = r51
                r9 = r52
                r2 = r6
                r4 = r10
                r6 = r0
                r0 = r43
                c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L93:
                r2 = r52
                double r6 = java.lang.Math.sqrt(r39)
                double r27 = r27 * r6
                double r6 = r6 * r29
                r3 = r51
                if (r3 != r2) goto La6
                double r31 = r31 - r6
                double r35 = r35 + r27
                goto Laa
            La6:
                double r31 = r31 + r6
                double r35 = r35 - r27
            Laa:
                double r6 = r23 - r35
                r23 = r0
                double r0 = r21 - r31
                double r21 = java.lang.Math.atan2(r6, r0)
                double r0 = r23 - r35
                double r6 = r25 - r31
                double r0 = java.lang.Math.atan2(r0, r6)
                double r0 = r0 - r21
                int r3 = (r0 > r37 ? 1 : (r0 == r37 ? 0 : -1))
                if (r3 < 0) goto Lc4
                r6 = 1
                goto Lc5
            Lc4:
                r6 = 0
            Lc5:
                if (r2 == r6) goto Lcf
                r6 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                if (r3 <= 0) goto Ld2
                double r0 = r0 - r6
            Lcf:
                r23 = r0
                goto Ld4
            Ld2:
                double r0 = r0 + r6
                goto Lcf
            Ld4:
                double r31 = r31 * r11
                double r35 = r35 * r13
                double r0 = r31 * r4
                double r2 = r35 * r8
                double r0 = r0 - r2
                double r31 = r31 * r8
                double r35 = r35 * r4
                double r9 = r31 + r35
                r6 = r43
                r7 = r0
                b(r6, r7, r9, r11, r13, r15, r17, r19, r21, r23)
                return
        }

        public static void e(com.scwang.smartrefresh.layout.internal.pathview.a.b[] r5, android.graphics.Path r6) {
                r0 = 6
                float[] r0 = new float[r0]
                r1 = 109(0x6d, float:1.53E-43)
                r2 = 0
            L6:
                int r3 = r5.length
                if (r2 >= r3) goto L19
                r3 = r5[r2]
                char r4 = r3.a
                float[] r3 = r3.b
                a(r6, r0, r1, r4, r3)
                r1 = r5[r2]
                char r1 = r1.a
                int r2 = r2 + 1
                goto L6
            L19:
                return
        }

        public void d(com.scwang.smartrefresh.layout.internal.pathview.a.b r5, com.scwang.smartrefresh.layout.internal.pathview.a.b r6, float r7) {
                r4 = this;
                r0 = 0
            L1:
                float[] r1 = r5.b
                int r2 = r1.length
                if (r0 >= r2) goto L1b
                float[] r2 = r4.b
                r1 = r1[r0]
                r3 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r7
                float r1 = r1 * r3
                float[] r3 = r6.b
                r3 = r3[r0]
                float r3 = r3 * r7
                float r1 = r1 + r3
                r2[r0] = r1
                int r0 = r0 + 1
                goto L1
            L1b:
                return
        }
    }

    a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(java.util.ArrayList<com.scwang.smartrefresh.layout.internal.pathview.a.b> r1, char r2, float[] r3) {
            com.scwang.smartrefresh.layout.internal.pathview.a$b r0 = new com.scwang.smartrefresh.layout.internal.pathview.a$b
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    public static boolean b(com.scwang.smartrefresh.layout.internal.pathview.a.b[] r6, com.scwang.smartrefresh.layout.internal.pathview.a.b[] r7) {
            r0 = 0
            if (r6 == 0) goto L28
            if (r7 != 0) goto L6
            goto L28
        L6:
            int r1 = r6.length
            int r2 = r7.length
            if (r1 == r2) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r6.length
            if (r1 >= r2) goto L26
            r2 = r6[r1]
            char r3 = r2.a
            r4 = r7[r1]
            char r5 = r4.a
            if (r3 != r5) goto L25
            float[] r2 = r2.b
            int r2 = r2.length
            float[] r3 = r4.b
            int r3 = r3.length
            if (r2 == r3) goto L22
            goto L25
        L22:
            int r1 = r1 + 1
            goto Lc
        L25:
            return r0
        L26:
            r6 = 1
            return r6
        L28:
            return r0
    }

    static float[] c(float[] r2, int r3, int r4) {
            if (r3 > r4) goto L1a
            int r0 = r2.length
            if (r3 < 0) goto L14
            if (r3 > r0) goto L14
            int r4 = r4 - r3
            int r0 = r0 - r3
            int r0 = java.lang.Math.min(r4, r0)
            float[] r4 = new float[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r4, r1, r0)
            return r4
        L14:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public static com.scwang.smartrefresh.layout.internal.pathview.a.b[] d(java.lang.String r7) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 1
            r4 = 0
        Ld:
            int r5 = r7.length()
            if (r3 >= r5) goto L36
            int r3 = i(r7, r3)
            java.lang.String r4 = r7.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            if (r5 <= 0) goto L30
            float[] r5 = h(r4)
            char r4 = r4.charAt(r2)
            a(r0, r4, r5)
        L30:
            int r4 = r3 + 1
            r6 = r4
            r4 = r3
            r3 = r6
            goto Ld
        L36:
            int r3 = r3 - r4
            if (r3 != r1) goto L48
            int r1 = r7.length()
            if (r4 >= r1) goto L48
            char r7 = r7.charAt(r4)
            float[] r1 = new float[r2]
            a(r0, r7, r1)
        L48:
            int r7 = r0.size()
            com.scwang.smartrefresh.layout.internal.pathview.a$b[] r7 = new com.scwang.smartrefresh.layout.internal.pathview.a.b[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            com.scwang.smartrefresh.layout.internal.pathview.a$b[] r7 = (com.scwang.smartrefresh.layout.internal.pathview.a.b[]) r7
            return r7
    }

    public static android.graphics.Path e(java.lang.String r4) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            com.scwang.smartrefresh.layout.internal.pathview.a$b[] r1 = d(r4)
            if (r1 == 0) goto L27
            com.scwang.smartrefresh.layout.internal.pathview.a.b.e(r1, r0)     // Catch: java.lang.RuntimeException -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error in parsing "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        L27:
            r4 = 0
            return r4
    }

    public static com.scwang.smartrefresh.layout.internal.pathview.a.b[] f(com.scwang.smartrefresh.layout.internal.pathview.a.b[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            com.scwang.smartrefresh.layout.internal.pathview.a$b[] r0 = new com.scwang.smartrefresh.layout.internal.pathview.a.b[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L17
            com.scwang.smartrefresh.layout.internal.pathview.a$b r2 = new com.scwang.smartrefresh.layout.internal.pathview.a$b
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
    }

    private static void g(java.lang.String r8, int r9, com.scwang.smartrefresh.layout.internal.pathview.a.C0185a r10) {
            r0 = 0
            r10.b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L36
        L27:
            r10.b = r7
        L29:
            r2 = 0
            r4 = 1
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.b = r7
            goto L29
        L33:
            r2 = 0
            goto L36
        L35:
            r2 = 1
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.a = r1
            return
    }

    private static float[] h(java.lang.String r8) {
            r0 = 0
            char r1 = r8.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            r3 = 1
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            char r2 = r8.charAt(r0)
            r4 = 90
            if (r2 != r4) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            r1 = r1 | r2
            if (r1 == 0) goto L1e
            float[] r8 = new float[r0]
            return r8
        L1e:
            int r1 = r8.length()     // Catch: java.lang.NumberFormatException -> L45
            float[] r1 = new float[r1]     // Catch: java.lang.NumberFormatException -> L45
            com.scwang.smartrefresh.layout.internal.pathview.a$a r2 = new com.scwang.smartrefresh.layout.internal.pathview.a$a     // Catch: java.lang.NumberFormatException -> L45
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L45
            int r4 = r8.length()     // Catch: java.lang.NumberFormatException -> L45
            r5 = 0
        L2e:
            if (r3 >= r4) goto L50
            g(r8, r3, r2)     // Catch: java.lang.NumberFormatException -> L45
            int r6 = r2.a     // Catch: java.lang.NumberFormatException -> L45
            if (r3 >= r6) goto L47
            int r7 = r5 + 1
            java.lang.String r3 = r8.substring(r3, r6)     // Catch: java.lang.NumberFormatException -> L45
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L45
            r1[r5] = r3     // Catch: java.lang.NumberFormatException -> L45
            r5 = r7
            goto L47
        L45:
            r0 = move-exception
            goto L55
        L47:
            boolean r3 = r2.b     // Catch: java.lang.NumberFormatException -> L45
            if (r3 == 0) goto L4d
            r3 = r6
            goto L2e
        L4d:
            int r3 = r6 + 1
            goto L2e
        L50:
            float[] r8 = c(r1, r0, r5)     // Catch: java.lang.NumberFormatException -> L45
            return r8
        L55:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = "\""
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
    }

    private static int i(java.lang.String r3, int r4) {
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L26
            char r0 = r3.charAt(r4)
            int r1 = r0 + (-65)
            int r2 = r0 + (-90)
            int r1 = r1 * r2
            if (r1 <= 0) goto L1a
            int r1 = r0 + (-97)
            int r2 = r0 + (-122)
            int r1 = r1 * r2
            if (r1 > 0) goto L23
        L1a:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L23
            r1 = 69
            if (r0 == r1) goto L23
            goto L26
        L23:
            int r4 = r4 + 1
            goto L0
        L26:
            return r4
    }

    public static java.util.List<android.graphics.Path> j(float r1, float r2, java.util.List<android.graphics.Path> r3, java.util.List<java.lang.String> r4) {
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r4.setScale(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            android.graphics.Path r3 = (android.graphics.Path) r3
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.transform(r4, r0)
            r1.add(r0)
            goto L11
        L29:
            return r1
    }

    private static void k(float r19, float r20, char r21, float[] r22) {
            r0 = r21
            r1 = r22
            r6 = 84
            r7 = 83
            r8 = 77
            r9 = 76
            r10 = 118(0x76, float:1.65E-43)
            r11 = 113(0x71, float:1.58E-43)
            r12 = 104(0x68, float:1.46E-43)
            r13 = 99
            r14 = 97
            r15 = 86
            r2 = 81
            r3 = 72
            r4 = 67
            r5 = 65
            if (r0 == r5) goto L56
            if (r0 == r4) goto L53
            if (r0 == r3) goto L50
            if (r0 == r2) goto L4d
            if (r0 == r15) goto L50
            if (r0 == r14) goto L56
            if (r0 == r13) goto L53
            if (r0 == r12) goto L50
            if (r0 == r11) goto L4d
            if (r0 == r10) goto L50
            r17 = 2
            if (r0 == r9) goto L58
            if (r0 == r8) goto L58
            if (r0 == r7) goto L4d
            if (r0 == r6) goto L58
            r6 = 108(0x6c, float:1.51E-43)
            if (r0 == r6) goto L58
            r6 = 109(0x6d, float:1.53E-43)
            if (r0 == r6) goto L58
            r6 = 115(0x73, float:1.61E-43)
            if (r0 == r6) goto L4d
            r6 = 116(0x74, float:1.63E-43)
            goto L58
        L4d:
            r17 = 4
            goto L58
        L50:
            r17 = 1
            goto L58
        L53:
            r17 = 6
            goto L58
        L56:
            r17 = 7
        L58:
            r6 = 0
        L59:
            int r7 = r1.length
            if (r6 >= r7) goto L141
            if (r0 == r5) goto Lbc
            if (r0 == r4) goto Lb7
            if (r0 == r3) goto Lb2
            if (r0 == r2) goto Lad
            if (r0 == r15) goto La8
            if (r0 == r14) goto Lbc
            if (r0 == r13) goto Lb7
            if (r0 == r12) goto Lb2
            if (r0 == r11) goto Lad
            if (r0 == r10) goto La8
            if (r0 == r9) goto L94
            if (r0 == r8) goto L94
            r7 = 83
            if (r0 == r7) goto L8e
            r2 = 84
            if (r0 == r2) goto L91
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == r2) goto L91
            r2 = 109(0x6d, float:1.53E-43)
            if (r0 == r2) goto L91
            r2 = 115(0x73, float:1.61E-43)
            if (r0 == r2) goto L8e
            r2 = 116(0x74, float:1.63E-43)
            if (r0 == r2) goto L98
            goto L13b
        L8e:
            r2 = 116(0x74, float:1.63E-43)
            goto Lc8
        L91:
            r2 = 116(0x74, float:1.63E-43)
            goto L98
        L94:
            r2 = 116(0x74, float:1.63E-43)
            r7 = 83
        L98:
            r16 = r1[r6]
            float r16 = r16 * r19
            r1[r6] = r16
            int r16 = r6 + 1
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
            goto L13b
        La8:
            r2 = 116(0x74, float:1.63E-43)
            r7 = 83
            goto Lc1
        Lad:
            r2 = 116(0x74, float:1.63E-43)
            r7 = 83
            goto Lc8
        Lb2:
            r2 = 116(0x74, float:1.63E-43)
            r7 = 83
            goto Le7
        Lb7:
            r2 = 116(0x74, float:1.63E-43)
            r7 = 83
            goto Lee
        Lbc:
            r2 = 116(0x74, float:1.63E-43)
            r7 = 83
            goto L11d
        Lc1:
            r16 = r1[r6]
            float r16 = r16 * r20
            r1[r6] = r16
            goto L13b
        Lc8:
            r16 = r1[r6]
            float r16 = r16 * r19
            r1[r6] = r16
            int r16 = r6 + 1
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
            int r16 = r6 + 2
            r18 = r1[r16]
            float r18 = r18 * r19
            r1[r16] = r18
            int r16 = r6 + 3
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
            goto L11d
        Le7:
            r16 = r1[r6]
            float r16 = r16 * r19
            r1[r6] = r16
            goto L13b
        Lee:
            r16 = r1[r6]
            float r16 = r16 * r19
            r1[r6] = r16
            int r16 = r6 + 1
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
            int r16 = r6 + 2
            r18 = r1[r16]
            float r18 = r18 * r19
            r1[r16] = r18
            int r16 = r6 + 3
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
            int r16 = r6 + 4
            r18 = r1[r16]
            float r18 = r18 * r19
            r1[r16] = r18
            int r16 = r6 + 5
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
            goto L13b
        L11d:
            r16 = r1[r6]
            float r16 = r16 * r19
            r1[r6] = r16
            int r16 = r6 + 1
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
            int r16 = r6 + 5
            r18 = r1[r16]
            float r18 = r18 * r19
            r1[r16] = r18
            int r16 = r6 + 6
            r18 = r1[r16]
            float r18 = r18 * r20
            r1[r16] = r18
        L13b:
            int r6 = r6 + r17
            r2 = 81
            goto L59
        L141:
            return
    }

    private static void l(float r3, float r4, com.scwang.smartrefresh.layout.internal.pathview.a.b[] r5) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L10
            r1 = r5[r0]
            char r2 = r1.a
            float[] r1 = r1.b
            k(r3, r4, r2, r1)
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    public static void m(com.scwang.smartrefresh.layout.internal.pathview.a.b[] r5, com.scwang.smartrefresh.layout.internal.pathview.a.b[] r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.length
            if (r1 >= r2) goto L23
            r2 = r5[r1]
            r3 = r6[r1]
            char r3 = r3.a
            r2.a = r3
            r2 = 0
        Le:
            r3 = r6[r1]
            float[] r3 = r3.b
            int r4 = r3.length
            if (r2 >= r4) goto L20
            r4 = r5[r1]
            float[] r4 = r4.b
            r3 = r3[r2]
            r4[r2] = r3
            int r2 = r2 + 1
            goto Le
        L20:
            int r1 = r1 + 1
            goto L2
        L23:
            return
    }
}

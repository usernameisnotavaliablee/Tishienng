package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {

    /* renamed from: com.bytedance.adsdk.lottie.r.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                com.bytedance.adsdk.lottie.model.layer.tl$xt[] r0 = com.bytedance.adsdk.lottie.model.layer.tl.xt.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.lottie.r.f.AnonymousClass1.j = r0
                com.bytedance.adsdk.lottie.model.layer.tl$xt r1 = com.bytedance.adsdk.lottie.model.layer.tl.xt.f1851r     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.lottie.r.f.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.adsdk.lottie.model.layer.tl$xt r1 = com.bytedance.adsdk.lottie.model.layer.tl.xt.up     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.adsdk.lottie.model.layer.tl j(android.util.JsonReader r39, com.bytedance.adsdk.lottie.m r40) throws java.io.IOException {
            r0 = r39
            r1 = r40
            r7 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            com.bytedance.adsdk.lottie.model.layer.tl$xt r4 = com.bytedance.adsdk.lottie.model.layer.tl.xt.j
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0.beginObject()
            java.lang.String r5 = "UNSET"
            r6 = 0
            r11 = 0
            r14 = -1
            r22 = r4
            r16 = r6
            r17 = r16
            r19 = r17
            r20 = r19
            r23 = r20
            r25 = r23
            r26 = r25
            r18 = r8
            r27 = r11
            r7 = r14
            r15 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r24 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r11 = r5
            r12 = r26
            r14 = r12
        L54:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38b
            java.lang.String r3 = r0.nextName()
            r3.getClass()
            int r4 = r3.hashCode()
            java.lang.String r5 = "ty"
            java.lang.String r6 = "nm"
            r13 = 1
            r38 = -1
            switch(r4) {
                case -995424086: goto L193;
                case -903568142: goto L187;
                case 104: goto L17b;
                case 116: goto L16f;
                case 119: goto L163;
                case 3177: goto L157;
                case 3233: goto L14b;
                case 3324: goto L13f;
                case 3367: goto L131;
                case 3432: goto L123;
                case 3519: goto L117;
                case 3553: goto L109;
                case 3664: goto Lfb;
                case 3669: goto Led;
                case 3679: goto Ldf;
                case 3681: goto Ld1;
                case 3684: goto Lc3;
                case 3705: goto Lb5;
                case 3712: goto La7;
                case 3717: goto L9b;
                case 104415: goto L8d;
                case 108390670: goto L7f;
                case 1441620890: goto L71;
                default: goto L6f;
            }
        L6f:
            goto L19e
        L71:
            java.lang.String r4 = "masksProperties"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L7b
            goto L19e
        L7b:
            r38 = 22
            goto L19e
        L7f:
            java.lang.String r4 = "refId"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L89
            goto L19e
        L89:
            r38 = 21
            goto L19e
        L8d:
            java.lang.String r4 = "ind"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L97
            goto L19e
        L97:
            r38 = 20
            goto L19e
        L9b:
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto La3
            goto L19e
        La3:
            r38 = 19
            goto L19e
        La7:
            java.lang.String r4 = "tt"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lb1
            goto L19e
        Lb1:
            r38 = 18
            goto L19e
        Lb5:
            java.lang.String r4 = "tm"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lbf
            goto L19e
        Lbf:
            r38 = 17
            goto L19e
        Lc3:
            java.lang.String r4 = "sw"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lcd
            goto L19e
        Lcd:
            r38 = 16
            goto L19e
        Ld1:
            java.lang.String r4 = "st"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Ldb
            goto L19e
        Ldb:
            r38 = 15
            goto L19e
        Ldf:
            java.lang.String r4 = "sr"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Le9
            goto L19e
        Le9:
            r38 = 14
            goto L19e
        Led:
            java.lang.String r4 = "sh"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lf7
            goto L19e
        Lf7:
            r38 = 13
            goto L19e
        Lfb:
            java.lang.String r4 = "sc"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L105
            goto L19e
        L105:
            r38 = 12
            goto L19e
        L109:
            java.lang.String r4 = "op"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L113
            goto L19e
        L113:
            r38 = 11
            goto L19e
        L117:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L11f
            goto L19e
        L11f:
            r38 = 10
            goto L19e
        L123:
            java.lang.String r4 = "ks"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L12d
            goto L19e
        L12d:
            r38 = 9
            goto L19e
        L131:
            java.lang.String r4 = "ip"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L13b
            goto L19e
        L13b:
            r38 = 8
            goto L19e
        L13f:
            java.lang.String r4 = "hd"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L148
            goto L19e
        L148:
            r38 = 7
            goto L19e
        L14b:
            java.lang.String r4 = "ef"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L154
            goto L19e
        L154:
            r38 = 6
            goto L19e
        L157:
            java.lang.String r4 = "cl"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L160
            goto L19e
        L160:
            r38 = 5
            goto L19e
        L163:
            java.lang.String r4 = "w"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L16c
            goto L19e
        L16c:
            r38 = 4
            goto L19e
        L16f:
            java.lang.String r4 = "t"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L178
            goto L19e
        L178:
            r38 = 3
            goto L19e
        L17b:
            java.lang.String r4 = "h"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L184
            goto L19e
        L184:
            r38 = 2
            goto L19e
        L187:
            java.lang.String r4 = "shapes"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L190
            goto L19e
        L190:
            r38 = 1
            goto L19e
        L193:
            java.lang.String r4 = "parent"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L19c
            goto L19e
        L19c:
            r38 = 0
        L19e:
            switch(r38) {
                case 0: goto L384;
                case 1: goto L36c;
                case 2: goto L35c;
                case 3: goto L313;
                case 4: goto L303;
                case 5: goto L2fd;
                case 6: goto L293;
                case 7: goto L28c;
                case 8: goto L282;
                case 9: goto L27b;
                case 10: goto L274;
                case 11: goto L26a;
                case 12: goto L25f;
                case 13: goto L24e;
                case 14: goto L246;
                case 15: goto L23c;
                case 16: goto L22b;
                case 17: goto L224;
                case 18: goto L1e6;
                case 19: goto L1d2;
                case 20: goto L1c9;
                case 21: goto L1c3;
                case 22: goto L1a6;
                default: goto L1a1;
            }
        L1a1:
            r0.skipValue()
            goto L54
        L1a6:
            r0.beginArray()
        L1a9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1b7
            com.bytedance.adsdk.lottie.model.xt.tl r3 = com.bytedance.adsdk.lottie.r.x.j(r39, r40)
            r10.add(r3)
            goto L1a9
        L1b7:
            int r3 = r10.size()
            r1.j(r3)
            r0.endArray()
            goto L54
        L1c3:
            java.lang.String r16 = r0.nextString()
            goto L54
        L1c9:
            int r3 = r0.nextInt()
            long r3 = (long) r3
            r27 = r3
            goto L54
        L1d2:
            int r3 = r0.nextInt()
            com.bytedance.adsdk.lottie.model.layer.tl$j r14 = com.bytedance.adsdk.lottie.model.layer.tl.j.ae
            int r4 = r14.ordinal()
            if (r3 >= r4) goto L54
            com.bytedance.adsdk.lottie.model.layer.tl$j[] r4 = com.bytedance.adsdk.lottie.model.layer.tl.j.values()
            r14 = r4[r3]
            goto L54
        L1e6:
            int r3 = r0.nextInt()
            com.bytedance.adsdk.lottie.model.layer.tl$xt[] r4 = com.bytedance.adsdk.lottie.model.layer.tl.xt.values()
            int r4 = r4.length
            if (r3 < r4) goto L200
            java.lang.String r4 = "Unsupported matte type: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r4.concat(r3)
            r1.j(r3)
            goto L54
        L200:
            com.bytedance.adsdk.lottie.model.layer.tl$xt[] r4 = com.bytedance.adsdk.lottie.model.layer.tl.xt.values()
            r22 = r4[r3]
            int[] r3 = com.bytedance.adsdk.lottie.r.f.AnonymousClass1.j
            int r4 = r22.ordinal()
            r3 = r3[r4]
            if (r3 == r13) goto L21a
            r4 = 2
            if (r3 == r4) goto L214
            goto L21f
        L214:
            java.lang.String r3 = "Unsupported matte type: Luma Inverted"
            r1.j(r3)
            goto L21f
        L21a:
            java.lang.String r3 = "Unsupported matte type: Luma"
            r1.j(r3)
        L21f:
            r1.j(r13)
            goto L54
        L224:
            r3 = 0
            com.bytedance.adsdk.lottie.model.j.xt r23 = com.bytedance.adsdk.lottie.r.r.j(r0, r1, r3)
            goto L54
        L22b:
            r3 = 0
            int r4 = r0.nextInt()
            float r4 = (float) r4
            float r5 = com.bytedance.adsdk.lottie.up.g.j()
            float r4 = r4 * r5
            int r4 = (int) r4
            r29 = r4
            goto L54
        L23c:
            r3 = 0
            double r4 = r0.nextDouble()
            float r4 = (float) r4
            r34 = r4
            goto L54
        L246:
            r3 = 0
            double r4 = r0.nextDouble()
            float r15 = (float) r4
            goto L54
        L24e:
            r3 = 0
            int r4 = r0.nextInt()
            float r4 = (float) r4
            float r5 = com.bytedance.adsdk.lottie.up.g.j()
            float r4 = r4 * r5
            int r4 = (int) r4
            r30 = r4
            goto L54
        L25f:
            r3 = 0
            java.lang.String r4 = r0.nextString()
            int r31 = android.graphics.Color.parseColor(r4)
            goto L54
        L26a:
            r3 = 0
            double r4 = r0.nextDouble()
            float r4 = (float) r4
            r24 = r4
            goto L54
        L274:
            r3 = 0
            java.lang.String r11 = r0.nextString()
            goto L54
        L27b:
            r3 = 0
            com.bytedance.adsdk.lottie.model.j.vl r17 = com.bytedance.adsdk.lottie.r.cw.j(r39, r40)
            goto L54
        L282:
            r3 = 0
            double r4 = r0.nextDouble()
            float r4 = (float) r4
            r21 = r4
            goto L54
        L28c:
            r3 = 0
            boolean r35 = r0.nextBoolean()
            goto L54
        L293:
            r3 = 0
            r0.beginArray()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L29c:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L2eb
            r0.beginObject()
        L2a5:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L2e6
            java.lang.String r13 = r0.nextName()
            r13.getClass()
            boolean r37 = r13.equals(r6)
            if (r37 != 0) goto L2de
            boolean r13 = r13.equals(r5)
            if (r13 != 0) goto L2c2
            r0.skipValue()
            goto L2ce
        L2c2:
            int r13 = r0.nextInt()
            r3 = 29
            if (r13 != r3) goto L2d0
            com.bytedance.adsdk.lottie.model.xt.j r25 = com.bytedance.adsdk.lottie.r.up.j(r39, r40)
        L2ce:
            r3 = 0
            goto L2a5
        L2d0:
            r3 = 25
            if (r13 != r3) goto L2ce
            com.bytedance.adsdk.lottie.r.qv r3 = new com.bytedance.adsdk.lottie.r.qv
            r3.<init>()
            com.bytedance.adsdk.lottie.r.oq r26 = r3.j(r0, r1)
            goto L2ce
        L2de:
            java.lang.String r3 = r0.nextString()
            r4.add(r3)
            goto L2ce
        L2e6:
            r0.endObject()
            r3 = 0
            goto L29c
        L2eb:
            r0.endArray()
            java.lang.String r3 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r3.concat(r4)
            r1.j(r3)
            goto L54
        L2fd:
            java.lang.String r12 = r0.nextString()
            goto L54
        L303:
            double r3 = r0.nextDouble()
            float r5 = com.bytedance.adsdk.lottie.up.g.j()
            double r5 = (double) r5
            double r3 = r3 * r5
            float r3 = (float) r3
            r32 = r3
            goto L54
        L313:
            r0.beginObject()
        L316:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L357
            java.lang.String r3 = r0.nextName()
            r3.getClass()
            java.lang.String r4 = "a"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L33c
            java.lang.String r4 = "d"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L337
            r0.skipValue()
            goto L316
        L337:
            com.bytedance.adsdk.lottie.model.j.oq r19 = com.bytedance.adsdk.lottie.r.r.m(r39, r40)
            goto L316
        L33c:
            r0.beginArray()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L349
            com.bytedance.adsdk.lottie.model.j.qv r20 = com.bytedance.adsdk.lottie.r.xt.j(r39, r40)
        L349:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L353
            r0.skipValue()
            goto L349
        L353:
            r0.endArray()
            goto L316
        L357:
            r0.endObject()
            goto L54
        L35c:
            double r3 = r0.nextDouble()
            float r5 = com.bytedance.adsdk.lottie.up.g.j()
            double r5 = (double) r5
            double r3 = r3 * r5
            float r3 = (float) r3
            r33 = r3
            goto L54
        L36c:
            r0.beginArray()
        L36f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L37f
            com.bytedance.adsdk.lottie.model.xt.cw r3 = com.bytedance.adsdk.lottie.r.tl.j(r39, r40)
            if (r3 == 0) goto L36f
            r9.add(r3)
            goto L36f
        L37f:
            r0.endArray()
            goto L54
        L384:
            int r3 = r0.nextInt()
            long r7 = (long) r3
            goto L54
        L38b:
            r0.endObject()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r0 = (r21 > r36 ? 1 : (r21 == r36 ? 0 : -1))
            if (r0 <= 0) goto L3a9
            com.bytedance.adsdk.lottie.m.j r0 = new com.bytedance.adsdk.lottie.m.j
            r5 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r21)
            r4 = 0
            r3 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r37 = r2
            r13.add(r0)
            goto L3ab
        L3a9:
            r37 = r2
        L3ab:
            int r0 = (r24 > r36 ? 1 : (r24 == r36 ? 0 : -1))
            if (r0 <= 0) goto L3b0
            goto L3b4
        L3b0:
            float r24 = r40.ae()
        L3b4:
            com.bytedance.adsdk.lottie.m.j r0 = new com.bytedance.adsdk.lottie.m.j
            r4 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r24)
            r3 = r18
            r1 = r40
            r2 = r18
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.add(r0)
            com.bytedance.adsdk.lottie.m.j r0 = new com.bytedance.adsdk.lottie.m.j
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            r3 = r37
            r1 = r40
            r5 = r24
            r2 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.add(r0)
            java.lang.String r0 = ".ai"
            boolean r0 = r11.endsWith(r0)
            if (r0 != 0) goto L3f0
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L3f5
        L3f0:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r1.j(r0)
        L3f5:
            com.bytedance.adsdk.lottie.model.layer.tl r0 = new com.bytedance.adsdk.lottie.model.layer.tl
            r2 = r1
            r1 = r9
            r3 = r11
            r21 = r13
            r6 = r14
            r9 = r16
            r11 = r17
            r4 = r27
            r12 = r29
            r13 = r30
            r14 = r31
            r17 = r32
            r18 = r33
            r16 = r34
            r24 = r35
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
    }

    public static com.bytedance.adsdk.lottie.model.layer.tl j(com.bytedance.adsdk.lottie.m r28) {
            android.graphics.Rect r0 = r28.r()
            com.bytedance.adsdk.lottie.model.layer.tl r1 = new com.bytedance.adsdk.lottie.model.layer.tl
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            com.bytedance.adsdk.lottie.model.layer.tl$j r7 = com.bytedance.adsdk.lottie.model.layer.tl.j.j
            com.bytedance.adsdk.lottie.model.j.vl r12 = new com.bytedance.adsdk.lottie.model.j.vl
            r12.<init>()
            int r3 = r0.width()
            float r3 = (float) r3
            int r0 = r0.height()
            float r0 = (float) r0
            com.bytedance.adsdk.lottie.model.layer.tl$xt r23 = com.bytedance.adsdk.lottie.model.layer.tl.xt.j
            r26 = 0
            r27 = 0
            java.lang.String r4 = "__container"
            r5 = -1
            r8 = -1
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r11 = r2
            r22 = r2
            r19 = r0
            r18 = r3
            r3 = r28
            r1.<init>(r2, r3, r4, r5, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r1
    }
}

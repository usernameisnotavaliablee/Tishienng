package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean cw(com.bytedance.adsdk.lottie.model.j.xt r2) {
            if (r2 == 0) goto L22
            boolean r0 = r2.xt()
            r1 = 0
            if (r0 == 0) goto L21
            java.util.List r2 = r2.cw()
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
            T r2 = r2.j
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L21
            goto L22
        L21:
            return r1
        L22:
            r2 = 1
            return r2
    }

    public static com.bytedance.adsdk.lottie.model.j.vl j(android.util.JsonReader r27, com.bytedance.adsdk.lottie.m r28) throws java.io.IOException {
            r0 = r27
            r2 = r28
            r1 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            android.util.JsonToken r1 = r0.peek()
            android.util.JsonToken r4 = android.util.JsonToken.BEGIN_OBJECT
            r9 = 0
            if (r1 != r4) goto L14
            r10 = 1
            goto L15
        L14:
            r10 = 0
        L15:
            if (r10 == 0) goto L1a
            r0.beginObject()
        L1a:
            r11 = 0
            r1 = r11
            r12 = r1
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r22 = r16
            r23 = r22
            r24 = r23
        L28:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L16b
            java.lang.String r4 = r0.nextName()
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1
            switch(r5) {
                case 97: goto La8;
                case 111: goto L9d;
                case 112: goto L92;
                case 114: goto L87;
                case 115: goto L7c;
                case 3242: goto L71;
                case 3656: goto L66;
                case 3662: goto L5b;
                case 3672: goto L4d;
                case 3676: goto L3f;
                default: goto L3d;
            }
        L3d:
            goto Lb2
        L3f:
            java.lang.String r5 = "so"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L49
            goto Lb2
        L49:
            r6 = 9
            goto Lb2
        L4d:
            java.lang.String r5 = "sk"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L57
            goto Lb2
        L57:
            r6 = 8
            goto Lb2
        L5b:
            java.lang.String r5 = "sa"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L64
            goto Lb2
        L64:
            r6 = 7
            goto Lb2
        L66:
            java.lang.String r5 = "rz"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6f
            goto Lb2
        L6f:
            r6 = 6
            goto Lb2
        L71:
            java.lang.String r5 = "eo"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L7a
            goto Lb2
        L7a:
            r6 = 5
            goto Lb2
        L7c:
            java.lang.String r5 = "s"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L85
            goto Lb2
        L85:
            r6 = 4
            goto Lb2
        L87:
            java.lang.String r5 = "r"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L90
            goto Lb2
        L90:
            r6 = 3
            goto Lb2
        L92:
            java.lang.String r5 = "p"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L9b
            goto Lb2
        L9b:
            r6 = 2
            goto Lb2
        L9d:
            java.lang.String r5 = "o"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto La6
            goto Lb2
        La6:
            r6 = 1
            goto Lb2
        La8:
            java.lang.String r5 = "a"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lb1
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            switch(r6) {
                case 0: goto L146;
                case 1: goto L141;
                case 2: goto L13c;
                case 3: goto Lde;
                case 4: goto Ld8;
                case 5: goto Ld2;
                case 6: goto Lcc;
                case 7: goto Lc6;
                case 8: goto Lc0;
                case 9: goto Lba;
                default: goto Lb5;
            }
        Lb5:
            r0.skipValue()
            goto L138
        Lba:
            com.bytedance.adsdk.lottie.model.j.xt r23 = com.bytedance.adsdk.lottie.r.r.j(r0, r2, r9)
            goto L28
        Lc0:
            com.bytedance.adsdk.lottie.model.j.xt r15 = com.bytedance.adsdk.lottie.r.r.j(r0, r2, r9)
            goto L28
        Lc6:
            com.bytedance.adsdk.lottie.model.j.xt r16 = com.bytedance.adsdk.lottie.r.r.j(r0, r2, r9)
            goto L28
        Lcc:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r2.j(r1)
            goto Lde
        Ld2:
            com.bytedance.adsdk.lottie.model.j.xt r24 = com.bytedance.adsdk.lottie.r.r.j(r0, r2, r9)
            goto L28
        Ld8:
            com.bytedance.adsdk.lottie.model.j.ae r14 = com.bytedance.adsdk.lottie.r.r.r(r27, r28)
            goto L28
        Lde:
            com.bytedance.adsdk.lottie.model.j.xt r17 = com.bytedance.adsdk.lottie.r.r.j(r0, r2, r9)
            java.util.List r1 = r17.cw()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L109
            java.util.List r1 = r17.cw()
            r4 = r1
            com.bytedance.adsdk.lottie.m.j r1 = new com.bytedance.adsdk.lottie.m.j
            float r5 = r2.ae()
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            r5 = 0
            r6 = 0
            r18 = r4
            r4 = r3
            r8 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.add(r1)
            goto L130
        L109:
            java.util.List r1 = r17.cw()
            java.lang.Object r1 = r1.get(r9)
            com.bytedance.adsdk.lottie.m.j r1 = (com.bytedance.adsdk.lottie.m.j) r1
            T r1 = r1.j
            if (r1 != 0) goto L136
            java.util.List r8 = r17.cw()
            com.bytedance.adsdk.lottie.m.j r1 = new com.bytedance.adsdk.lottie.m.j
            float r2 = r28.ae()
            java.lang.Float r7 = java.lang.Float.valueOf(r2)
            r5 = 0
            r6 = 0
            r4 = r3
            r2 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.set(r9, r1)
        L130:
            r2 = r28
            r1 = r17
            goto L28
        L136:
            r1 = r17
        L138:
            r2 = r28
            goto L28
        L13c:
            com.bytedance.adsdk.lottie.model.j.jy r13 = com.bytedance.adsdk.lottie.r.j.xt(r27, r28)
            goto L138
        L141:
            com.bytedance.adsdk.lottie.model.j.r r22 = com.bytedance.adsdk.lottie.r.r.xt(r27, r28)
            goto L138
        L146:
            r0.beginObject()
        L149:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L167
            java.lang.String r2 = r0.nextName()
            r2.getClass()
            java.lang.String r4 = "k"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L162
            r0.skipValue()
            goto L149
        L162:
            com.bytedance.adsdk.lottie.model.j.up r12 = com.bytedance.adsdk.lottie.r.j.j(r27, r28)
            goto L149
        L167:
            r0.endObject()
            goto L138
        L16b:
            if (r10 == 0) goto L170
            r0.endObject()
        L170:
            boolean r0 = j(r12)
            if (r0 == 0) goto L179
            r18 = r11
            goto L17b
        L179:
            r18 = r12
        L17b:
            boolean r0 = j(r13)
            if (r0 == 0) goto L184
            r19 = r11
            goto L186
        L184:
            r19 = r13
        L186:
            boolean r0 = j(r1)
            if (r0 == 0) goto L18f
            r21 = r11
            goto L191
        L18f:
            r21 = r1
        L191:
            boolean r0 = j(r14)
            if (r0 == 0) goto L19a
            r20 = r11
            goto L19c
        L19a:
            r20 = r14
        L19c:
            boolean r0 = xt(r15)
            if (r0 == 0) goto L1a5
            r25 = r11
            goto L1a7
        L1a5:
            r25 = r15
        L1a7:
            boolean r0 = cw(r16)
            if (r0 == 0) goto L1b0
            r26 = r11
            goto L1b2
        L1b0:
            r26 = r16
        L1b2:
            com.bytedance.adsdk.lottie.model.j.vl r17 = new com.bytedance.adsdk.lottie.model.j.vl
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r17
    }

    private static boolean j(com.bytedance.adsdk.lottie.model.j.ae r2) {
            if (r2 == 0) goto L21
            boolean r0 = r2.xt()
            r1 = 0
            if (r0 == 0) goto L20
            java.util.List r2 = r2.cw()
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
            T r2 = r2.j
            com.bytedance.adsdk.lottie.m.r r2 = (com.bytedance.adsdk.lottie.m.r) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r2.xt(r0, r0)
            if (r2 == 0) goto L20
            goto L21
        L20:
            return r1
        L21:
            r2 = 1
            return r2
    }

    private static boolean j(com.bytedance.adsdk.lottie.model.j.jy<android.graphics.PointF, android.graphics.PointF> r2) {
            if (r2 == 0) goto L24
            boolean r0 = r2 instanceof com.bytedance.adsdk.lottie.model.j.g
            r1 = 0
            if (r0 != 0) goto L23
            boolean r0 = r2.xt()
            if (r0 == 0) goto L23
            java.util.List r2 = r2.cw()
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
            T r2 = r2.j
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r0 = 0
            boolean r2 = r2.equals(r0, r0)
            if (r2 == 0) goto L23
            goto L24
        L23:
            return r1
        L24:
            r2 = 1
            return r2
    }

    private static boolean j(com.bytedance.adsdk.lottie.model.j.up r2) {
            if (r2 == 0) goto L20
            boolean r0 = r2.xt()
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.List r2 = r2.cw()
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
            T r2 = r2.j
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r0 = 0
            boolean r2 = r2.equals(r0, r0)
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            return r1
        L20:
            r2 = 1
            return r2
    }

    private static boolean j(com.bytedance.adsdk.lottie.model.j.xt r2) {
            if (r2 == 0) goto L22
            boolean r0 = r2.xt()
            r1 = 0
            if (r0 == 0) goto L21
            java.util.List r2 = r2.cw()
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
            T r2 = r2.j
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L21
            goto L22
        L21:
            return r1
        L22:
            r2 = 1
            return r2
    }

    private static boolean xt(com.bytedance.adsdk.lottie.model.j.xt r2) {
            if (r2 == 0) goto L22
            boolean r0 = r2.xt()
            r1 = 0
            if (r0 == 0) goto L21
            java.util.List r2 = r2.cw()
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
            T r2 = r2.j
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L21
            goto L22
        L21:
            return r1
        L22:
            r2 = 1
            return r2
    }
}

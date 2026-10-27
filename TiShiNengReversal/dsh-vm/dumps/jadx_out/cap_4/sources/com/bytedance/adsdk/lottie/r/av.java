package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class av {
    public av() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.up j(android.util.JsonReader r14, com.bytedance.adsdk.lottie.m r15) throws java.io.IOException {
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r1 = 0
            r2 = 0
            r6 = r0
            r4 = r1
            r5 = r4
            r7 = r5
            r9 = r7
            r10 = r9
            r13 = 0
        Lb:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Lee
            java.lang.String r0 = r14.nextName()
            r0.getClass()
            int r3 = r0.hashCode()
            r8 = -1
            r11 = 1
            switch(r3) {
                case 101: goto L71;
                case 103: goto L66;
                case 111: goto L5b;
                case 114: goto L50;
                case 115: goto L45;
                case 116: goto L3a;
                case 3324: goto L2f;
                case 3519: goto L24;
                default: goto L21;
            }
        L21:
            r0 = -1
            goto L7b
        L24:
            java.lang.String r3 = "nm"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L2d
            goto L21
        L2d:
            r0 = 7
            goto L7b
        L2f:
            java.lang.String r3 = "hd"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L38
            goto L21
        L38:
            r0 = 6
            goto L7b
        L3a:
            java.lang.String r3 = "t"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L43
            goto L21
        L43:
            r0 = 5
            goto L7b
        L45:
            java.lang.String r3 = "s"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L4e
            goto L21
        L4e:
            r0 = 4
            goto L7b
        L50:
            java.lang.String r3 = "r"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L59
            goto L21
        L59:
            r0 = 3
            goto L7b
        L5b:
            java.lang.String r3 = "o"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L64
            goto L21
        L64:
            r0 = 2
            goto L7b
        L66:
            java.lang.String r3 = "g"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L6f
            goto L21
        L6f:
            r0 = 1
            goto L7b
        L71:
            java.lang.String r3 = "e"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L7a
            goto L21
        L7a:
            r0 = 0
        L7b:
            switch(r0) {
                case 0: goto Le8;
                case 1: goto Lb5;
                case 2: goto Laf;
                case 3: goto La1;
                case 4: goto L9b;
                case 5: goto L8d;
                case 6: goto L87;
                case 7: goto L82;
                default: goto L7e;
            }
        L7e:
            r14.skipValue()
            goto Lb
        L82:
            java.lang.String r4 = r14.nextString()
            goto Lb
        L87:
            boolean r13 = r14.nextBoolean()
            goto Lb
        L8d:
            int r0 = r14.nextInt()
            if (r0 != r11) goto L98
            com.bytedance.adsdk.lottie.model.xt.ae r0 = com.bytedance.adsdk.lottie.model.xt.ae.j
        L95:
            r5 = r0
            goto Lb
        L98:
            com.bytedance.adsdk.lottie.model.xt.ae r0 = com.bytedance.adsdk.lottie.model.xt.ae.xt
            goto L95
        L9b:
            com.bytedance.adsdk.lottie.model.j.m r9 = com.bytedance.adsdk.lottie.r.r.cw(r14, r15)
            goto Lb
        La1:
            int r0 = r14.nextInt()
            if (r0 != r11) goto Lac
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        La9:
            r6 = r0
            goto Lb
        Lac:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto La9
        Laf:
            com.bytedance.adsdk.lottie.model.j.r r1 = com.bytedance.adsdk.lottie.r.r.xt(r14, r15)
            goto Lb
        Lb5:
            r14.beginObject()
        Lb8:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Le3
            java.lang.String r0 = r14.nextName()
            r0.getClass()
            java.lang.String r3 = "k"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto Lde
            java.lang.String r3 = "p"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Ld9
            r14.skipValue()
            goto Lb8
        Ld9:
            int r8 = r14.nextInt()
            goto Lb8
        Lde:
            com.bytedance.adsdk.lottie.model.j.cw r7 = com.bytedance.adsdk.lottie.r.r.j(r14, r15, r8)
            goto Lb8
        Le3:
            r14.endObject()
            goto Lb
        Le8:
            com.bytedance.adsdk.lottie.model.j.m r10 = com.bytedance.adsdk.lottie.r.r.cw(r14, r15)
            goto Lb
        Lee:
            if (r1 != 0) goto L104
            com.bytedance.adsdk.lottie.model.j.r r1 = new com.bytedance.adsdk.lottie.model.j.r
            com.bytedance.adsdk.lottie.m.j r14 = new com.bytedance.adsdk.lottie.m.j
            r15 = 100
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.<init>(r15)
            java.util.List r14 = java.util.Collections.singletonList(r14)
            r1.<init>(r14)
        L104:
            r8 = r1
            com.bytedance.adsdk.lottie.model.xt.up r3 = new com.bytedance.adsdk.lottie.model.xt.up
            r11 = 0
            r12 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
    }
}

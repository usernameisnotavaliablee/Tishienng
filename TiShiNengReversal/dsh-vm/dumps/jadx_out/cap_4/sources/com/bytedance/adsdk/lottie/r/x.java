package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class x {
    public x() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.tl j(android.util.JsonReader r11, com.bytedance.adsdk.lottie.m r12) throws java.io.IOException {
            r11.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = 0
        L8:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto Ld1
            java.lang.String r5 = r11.nextName()
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r6) {
                case 111: goto L43;
                case 3588: goto L38;
                case 104433: goto L2d;
                case 3357091: goto L22;
                default: goto L20;
            }
        L20:
            r6 = -1
            goto L4d
        L22:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L2b
            goto L20
        L2b:
            r6 = 3
            goto L4d
        L2d:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L36
            goto L20
        L36:
            r6 = 2
            goto L4d
        L38:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L41
            goto L20
        L41:
            r6 = 1
            goto L4d
        L43:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L4c
            goto L20
        L4c:
            r6 = 0
        L4d:
            switch(r6) {
                case 0: goto Lcb;
                case 1: goto Lc5;
                case 2: goto Lbf;
                case 3: goto L54;
                default: goto L50;
            }
        L50:
            r11.skipValue()
            goto L8
        L54:
            java.lang.String r0 = r11.nextString()
            r0.getClass()
            int r6 = r0.hashCode()
            switch(r6) {
                case 97: goto L83;
                case 105: goto L78;
                case 110: goto L6d;
                case 115: goto L64;
                default: goto L62;
            }
        L62:
            r7 = -1
            goto L8d
        L64:
            java.lang.String r6 = "s"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8d
            goto L62
        L6d:
            java.lang.String r6 = "n"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L76
            goto L62
        L76:
            r7 = 2
            goto L8d
        L78:
            java.lang.String r6 = "i"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L81
            goto L62
        L81:
            r7 = 1
            goto L8d
        L83:
            java.lang.String r6 = "a"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8c
            goto L62
        L8c:
            r7 = 0
        L8d:
            switch(r7) {
                case 0: goto Lbb;
                case 1: goto Lb2;
                case 2: goto Lae;
                case 3: goto Laa;
                default: goto L90;
            }
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown mask mode "
            r0.<init>(r6)
            r0.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.up.up.xt(r0)
            com.bytedance.adsdk.lottie.model.xt.tl$j r0 = com.bytedance.adsdk.lottie.model.xt.tl.j.j
            goto L8
        Laa:
            com.bytedance.adsdk.lottie.model.xt.tl$j r0 = com.bytedance.adsdk.lottie.model.xt.tl.j.xt
            goto L8
        Lae:
            com.bytedance.adsdk.lottie.model.xt.tl$j r0 = com.bytedance.adsdk.lottie.model.xt.tl.j.f1876r
            goto L8
        Lb2:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.j(r0)
            com.bytedance.adsdk.lottie.model.xt.tl$j r0 = com.bytedance.adsdk.lottie.model.xt.tl.j.cw
            goto L8
        Lbb:
            com.bytedance.adsdk.lottie.model.xt.tl$j r0 = com.bytedance.adsdk.lottie.model.xt.tl.j.j
            goto L8
        Lbf:
            boolean r4 = r11.nextBoolean()
            goto L8
        Lc5:
            com.bytedance.adsdk.lottie.model.j.tl r2 = com.bytedance.adsdk.lottie.r.r.up(r11, r12)
            goto L8
        Lcb:
            com.bytedance.adsdk.lottie.model.j.r r3 = com.bytedance.adsdk.lottie.r.r.xt(r11, r12)
            goto L8
        Ld1:
            r11.endObject()
            com.bytedance.adsdk.lottie.model.xt.tl r11 = new com.bytedance.adsdk.lottie.model.xt.tl
            r11.<init>(r0, r2, r3, r4)
            return r11
    }
}

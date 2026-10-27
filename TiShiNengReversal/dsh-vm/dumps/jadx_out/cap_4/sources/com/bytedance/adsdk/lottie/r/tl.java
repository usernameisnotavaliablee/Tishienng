package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class tl {
    public tl() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.cw j(android.util.JsonReader r6, com.bytedance.adsdk.lottie.m r7) throws java.io.IOException {
            r6.beginObject()
            r0 = 2
            r1 = 2
        L5:
            boolean r2 = r6.hasNext()
            r3 = 0
            if (r2 == 0) goto L31
            java.lang.String r2 = r6.nextName()
            r2.getClass()
            java.lang.String r4 = "d"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L2c
            java.lang.String r4 = "ty"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L27
            r6.skipValue()
            goto L5
        L27:
            java.lang.String r2 = r6.nextString()
            goto L32
        L2c:
            int r1 = r6.nextInt()
            goto L5
        L31:
            r2 = r3
        L32:
            if (r2 != 0) goto L35
            return r3
        L35:
            int r4 = r2.hashCode()
            r5 = -1
            switch(r4) {
                case 3239: goto Ldb;
                case 3270: goto Lcf;
                case 3295: goto Lc5;
                case 3307: goto Lb9;
                case 3308: goto Lae;
                case 3488: goto La3;
                case 3633: goto L98;
                case 3634: goto L8d;
                case 3646: goto L81;
                case 3669: goto L74;
                case 3679: goto L67;
                case 3681: goto L5a;
                case 3705: goto L4d;
                case 3710: goto L40;
                default: goto L3d;
            }
        L3d:
            r0 = -1
            goto Le6
        L40:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L49
            goto L3d
        L49:
            r0 = 13
            goto Le6
        L4d:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L56
            goto L3d
        L56:
            r0 = 12
            goto Le6
        L5a:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            goto L3d
        L63:
            r0 = 11
            goto Le6
        L67:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L3d
        L70:
            r0 = 10
            goto Le6
        L74:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7d
            goto L3d
        L7d:
            r0 = 9
            goto Le6
        L81:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8a
            goto L3d
        L8a:
            r0 = 8
            goto Le6
        L8d:
            java.lang.String r0 = "rd"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L96
            goto L3d
        L96:
            r0 = 7
            goto Le6
        L98:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La1
            goto L3d
        La1:
            r0 = 6
            goto Le6
        La3:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lac
            goto L3d
        Lac:
            r0 = 5
            goto Le6
        Lae:
            java.lang.String r0 = "gs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb7
            goto L3d
        Lb7:
            r0 = 4
            goto Le6
        Lb9:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc3
            goto L3d
        Lc3:
            r0 = 3
            goto Le6
        Lc5:
            java.lang.String r4 = "gf"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Le6
            goto L3d
        Lcf:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld9
            goto L3d
        Ld9:
            r0 = 1
            goto Le6
        Ldb:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Le5
            goto L3d
        Le5:
            r0 = 0
        Le6:
            switch(r0) {
                case 0: goto L139;
                case 1: goto L134;
                case 2: goto L12f;
                case 3: goto L12a;
                case 4: goto L125;
                case 5: goto L11b;
                case 6: goto L116;
                case 7: goto L111;
                case 8: goto L10c;
                case 9: goto L107;
                case 10: goto L102;
                case 11: goto Lfd;
                case 12: goto Lf8;
                case 13: goto Lf3;
                default: goto Le9;
            }
        Le9:
            java.lang.String r7 = "Unknown shape type "
            java.lang.String r7 = r7.concat(r2)
            com.bytedance.adsdk.lottie.up.up.xt(r7)
            goto L13d
        Lf3:
            com.bytedance.adsdk.lottie.model.j.vl r3 = com.bytedance.adsdk.lottie.r.cw.j(r6, r7)
            goto L13d
        Lf8:
            com.bytedance.adsdk.lottie.model.xt.mi r3 = com.bytedance.adsdk.lottie.r.n.j(r6, r7)
            goto L13d
        Lfd:
            com.bytedance.adsdk.lottie.model.xt.w r3 = com.bytedance.adsdk.lottie.r.gx.j(r6, r7)
            goto L13d
        L102:
            com.bytedance.adsdk.lottie.model.xt.oq r3 = com.bytedance.adsdk.lottie.r.p.j(r6, r7, r1)
            goto L13d
        L107:
            com.bytedance.adsdk.lottie.model.xt.i r3 = com.bytedance.adsdk.lottie.r.c.j(r6, r7)
            goto L13d
        L10c:
            com.bytedance.adsdk.lottie.model.xt.vl r3 = com.bytedance.adsdk.lottie.r.la.j(r6, r7)
            goto L13d
        L111:
            com.bytedance.adsdk.lottie.model.xt.jy r3 = com.bytedance.adsdk.lottie.r.gq.j(r6, r7)
            goto L13d
        L116:
            com.bytedance.adsdk.lottie.model.xt.qv r3 = com.bytedance.adsdk.lottie.r.h.j(r6, r7)
            goto L13d
        L11b:
            com.bytedance.adsdk.lottie.model.xt.g r3 = com.bytedance.adsdk.lottie.r.ch.j(r6)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r7.j(r0)
            goto L13d
        L125:
            com.bytedance.adsdk.lottie.model.xt.m r3 = com.bytedance.adsdk.lottie.r.i.j(r6, r7)
            goto L13d
        L12a:
            com.bytedance.adsdk.lottie.model.xt.av r3 = com.bytedance.adsdk.lottie.r.ed.j(r6, r7)
            goto L13d
        L12f:
            com.bytedance.adsdk.lottie.model.xt.up r3 = com.bytedance.adsdk.lottie.r.av.j(r6, r7)
            goto L13d
        L134:
            com.bytedance.adsdk.lottie.model.xt.az r3 = com.bytedance.adsdk.lottie.r.uf.j(r6, r7)
            goto L13d
        L139:
            com.bytedance.adsdk.lottie.model.xt.xt r3 = com.bytedance.adsdk.lottie.r.m.j(r6, r7, r1)
        L13d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L147
            r6.skipValue()
            goto L13d
        L147:
            r6.endObject()
            return r3
    }
}

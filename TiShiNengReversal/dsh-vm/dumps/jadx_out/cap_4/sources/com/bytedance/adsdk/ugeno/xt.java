package com.bytedance.adsdk.ugeno;

@java.lang.Deprecated
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.ugeno.xt.j<com.bytedance.adsdk.ugeno.swiper.Swiper> {
    private boolean d;
    private float et;
    private float fx;
    private com.bytedance.adsdk.ugeno.xt.cw gr;
    private java.lang.String ll;
    private org.json.JSONArray na;
    private float nu;
    private float ov;
    private boolean oy;
    private float px;
    private float qe;
    private int tk;
    private int wi;
    private java.lang.String xw;
    private boolean yl;

    public xt(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1.oy = r2
            r1.yl = r2
            r0 = 0
            r1.qe = r0
            r0 = 1157234688(0x44fa0000, float:2000.0)
            r1.px = r0
            java.lang.String r0 = "normal"
            r1.xw = r0
            r1.d = r2
            java.lang.String r2 = "#666666"
            int r2 = android.graphics.Color.parseColor(r2)
            r1.wi = r2
            java.lang.String r2 = "#ffffff"
            int r2 = android.graphics.Color.parseColor(r2)
            r1.tk = r2
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public android.view.View j() {
            r2 = this;
            com.bytedance.adsdk.ugeno.swiper.Swiper r0 = new com.bytedance.adsdk.ugeno.swiper.Swiper
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r2.up = r0
            r0.j(r2)
            T extends android.view.View r0 = r2.up
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.j
    public void j(com.bytedance.adsdk.ugeno.xt.cw r1) {
            r0 = this;
            r0.gr = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            super.j(r4, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lb
            goto Lc8
        Lb:
            r4.getClass()
            int r0 = r4.hashCode()
            r1 = 1
            r2 = -1
            switch(r0) {
                case -1657957217: goto Lba;
                case -1575751020: goto Laf;
                case -1453344127: goto La4;
                case -1306084975: goto L99;
                case -962590849: goto L8e;
                case -711999985: goto L83;
                case -202057851: goto L78;
                case 3327652: goto L6d;
                case 109641799: goto L5f;
                case 857882560: goto L51;
                case 1097821469: goto L43;
                case 1196931001: goto L35;
                case 1439562083: goto L27;
                case 1788817256: goto L19;
                default: goto L17;
            }
        L17:
            goto Lc4
        L19:
            java.lang.String r0 = "dataList"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L23
            goto Lc4
        L23:
            r2 = 13
            goto Lc4
        L27:
            java.lang.String r0 = "autoplay"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L31
            goto Lc4
        L31:
            r2 = 12
            goto Lc4
        L35:
            java.lang.String r0 = "indicatorSelectedColor"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3f
            goto Lc4
        L3f:
            r2 = 11
            goto Lc4
        L43:
            java.lang.String r0 = "pageMargin"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4d
            goto Lc4
        L4d:
            r2 = 10
            goto Lc4
        L51:
            java.lang.String r0 = "pageCount"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5b
            goto Lc4
        L5b:
            r2 = 9
            goto Lc4
        L5f:
            java.lang.String r0 = "speed"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L69
            goto Lc4
        L69:
            r2 = 8
            goto Lc4
        L6d:
            java.lang.String r0 = "loop"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L76
            goto Lc4
        L76:
            r2 = 7
            goto Lc4
        L78:
            java.lang.String r0 = "previousMargin"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L81
            goto Lc4
        L81:
            r2 = 6
            goto Lc4
        L83:
            java.lang.String r0 = "indicator"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L8c
            goto Lc4
        L8c:
            r2 = 5
            goto Lc4
        L8e:
            java.lang.String r0 = "direction"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L97
            goto Lc4
        L97:
            r2 = 4
            goto Lc4
        L99:
            java.lang.String r0 = "effect"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La2
            goto Lc4
        La2:
            r2 = 3
            goto Lc4
        La4:
            java.lang.String r0 = "nextMargin"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lad
            goto Lc4
        Lad:
            r2 = 2
            goto Lc4
        Laf:
            java.lang.String r0 = "indicatorColor"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb8
            goto Lc4
        Lb8:
            r2 = 1
            goto Lc4
        Lba:
            java.lang.String r0 = "delayStart"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lc3
            goto Lc4
        Lc3:
            r2 = 0
        Lc4:
            r4 = 0
            switch(r2) {
                case 0: goto L133;
                case 1: goto L12c;
                case 2: goto L11f;
                case 3: goto L11c;
                case 4: goto L119;
                case 5: goto L112;
                case 6: goto L105;
                case 7: goto Lfe;
                case 8: goto Lf5;
                case 9: goto Lec;
                case 10: goto Ldf;
                case 11: goto Ld8;
                case 12: goto Ld1;
                case 13: goto Lc9;
                default: goto Lc8;
            }
        Lc8:
            return
        Lc9:
            r4 = 0
            org.json.JSONArray r4 = com.bytedance.adsdk.ugeno.m.xt.j(r5, r4)
            r3.na = r4
            return
        Ld1:
            boolean r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r1)
            r3.yl = r4
            return
        Ld8:
            int r4 = com.bytedance.adsdk.ugeno.m.j.j(r5)
            r3.tk = r4
            return
        Ldf:
            android.content.Context r0 = r3.xt
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            float r4 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r4)
            r3.et = r4
            return
        Lec:
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            r3.fx = r4
            return
        Lf5:
            r4 = 1140457472(0x43fa0000, float:500.0)
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            r3.px = r4
            return
        Lfe:
            boolean r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r1)
            r3.oy = r4
            return
        L105:
            android.content.Context r0 = r3.xt
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            float r4 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r4)
            r3.ov = r4
            return
        L112:
            boolean r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r1)
            r3.d = r4
            return
        L119:
            r3.ll = r5
            return
        L11c:
            r3.xw = r5
            return
        L11f:
            android.content.Context r0 = r3.xt
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            float r4 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r4)
            r3.nu = r4
            return
        L12c:
            int r4 = com.bytedance.adsdk.ugeno.m.j.j(r5)
            r3.wi = r4
            return
        L133:
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            r3.qe = r4
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(org.json.JSONObject r1) {
            r0 = this;
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.j, com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r4 = this;
            super.xt()
            org.json.JSONArray r0 = r4.na
            if (r0 == 0) goto L9c
            int r0 = r0.length()
            if (r0 > 0) goto Lf
            goto L9c
        Lf:
            T extends android.view.View r0 = r4.up
            com.bytedance.adsdk.ugeno.swiper.Swiper r0 = (com.bytedance.adsdk.ugeno.swiper.Swiper) r0
            float r1 = r4.et
            int r1 = (int) r1
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.r(r1)
            float r1 = r4.ov
            int r1 = (int) r1
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.up(r1)
            float r1 = r4.nu
            int r1 = (int) r1
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.m(r1)
            boolean r1 = r4.d
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.cw(r1)
            int r1 = r4.tk
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.xt(r1)
            int r1 = r4.wi
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.cw(r1)
            java.lang.String r1 = r4.xw
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.xt(r1)
            boolean r1 = r4.oy
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.r(r1)
            float r1 = r4.fx
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.j(r1)
            boolean r1 = r4.yl
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.j(r1)
            float r1 = r4.px
            int r1 = (int) r1
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r0.j(r1)
            boolean r1 = r4.d
            r0.cw(r1)
            r0 = 0
        L5f:
            org.json.JSONArray r1 = r4.na
            int r1 = r1.length()
            if (r0 >= r1) goto L91
            com.bytedance.adsdk.ugeno.cw.az r1 = new com.bytedance.adsdk.ugeno.cw.az
            android.content.Context r2 = r4.xt
            r1.<init>(r2)
            com.bytedance.adsdk.ugeno.cw.w r2 = r4.f2028t
            r1.j(r2)
            com.bytedance.adsdk.ugeno.xt.cw r2 = r4.gr
            com.bytedance.adsdk.ugeno.cw.g$j r2 = r2.l()
            r3 = 0
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt(r2, r3)
            org.json.JSONArray r3 = r4.na
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            r1.xt(r3)
            T extends android.view.View r1 = r4.up
            com.bytedance.adsdk.ugeno.swiper.Swiper r1 = (com.bytedance.adsdk.ugeno.swiper.Swiper) r1
            r1.j(r2)
            int r0 = r0 + 1
            goto L5f
        L91:
            boolean r0 = r4.yl
            if (r0 == 0) goto L9c
            T extends android.view.View r0 = r4.up
            com.bytedance.adsdk.ugeno.swiper.Swiper r0 = (com.bytedance.adsdk.ugeno.swiper.Swiper) r0
            r0.xt()
        L9c:
            return
    }
}

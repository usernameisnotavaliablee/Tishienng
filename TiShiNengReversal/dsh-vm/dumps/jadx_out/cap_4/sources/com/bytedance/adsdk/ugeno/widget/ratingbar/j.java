package com.bytedance.adsdk.ugeno.widget.ratingbar;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.xt.cw<com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar> {
    private static final int px = 0;
    private static final int xw = 0;
    private int j;
    private int ll;
    private float oy;
    private float qe;
    private float yl;

    static {
            java.lang.String r0 = "#FFC642"
            int r0 = android.graphics.Color.parseColor(r0)
            com.bytedance.adsdk.ugeno.widget.ratingbar.j.px = r0
            java.lang.String r0 = "#e3e3e4"
            int r0 = android.graphics.Color.parseColor(r0)
            com.bytedance.adsdk.ugeno.widget.ratingbar.j.xw = r0
            return
    }

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            int r1 = com.bytedance.adsdk.ugeno.widget.ratingbar.j.px
            r0.j = r1
            int r1 = com.bytedance.adsdk.ugeno.widget.ratingbar.j.xw
            r0.ll = r1
            r1 = 1082130432(0x40800000, float:4.0)
            r0.oy = r1
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.yl = r1
            return
    }

    public com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar ae() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar r0 = new com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar r0 = r1.ae()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            super.j(r3, r4)
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1810866385: goto L51;
                case -1804390815: goto L46;
                case 102102: goto L3b;
                case 3530753: goto L30;
                case 109264530: goto L25;
                case 490636047: goto L1a;
                case 497111617: goto Lf;
                default: goto Le;
            }
        Le:
            goto L5b
        Lf:
            java.lang.String r0 = "lowlightColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto L5b
        L18:
            r1 = 6
            goto L5b
        L1a:
            java.lang.String r0 = "highlightColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L23
            goto L5b
        L23:
            r1 = 5
            goto L5b
        L25:
            java.lang.String r0 = "score"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2e
            goto L5b
        L2e:
            r1 = 4
            goto L5b
        L30:
            java.lang.String r0 = "size"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L39
            goto L5b
        L39:
            r1 = 3
            goto L5b
        L3b:
            java.lang.String r0 = "gap"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L44
            goto L5b
        L44:
            r1 = 2
            goto L5b
        L46:
            java.lang.String r0 = "lowLightColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
            goto L5b
        L4f:
            r1 = 1
            goto L5b
        L51:
            java.lang.String r0 = "highLightColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5a
            goto L5b
        L5a:
            r1 = 0
        L5b:
            switch(r1) {
                case 0: goto L82;
                case 1: goto L79;
                case 2: goto L71;
                case 3: goto L68;
                case 4: goto L5f;
                case 5: goto L82;
                case 6: goto L79;
                default: goto L5e;
            }
        L5e:
            return
        L5f:
            r3 = 1082130432(0x40800000, float:4.0)
            float r3 = com.bytedance.adsdk.ugeno.m.cw.j(r4, r3)
            r2.oy = r3
            return
        L68:
            r3 = 1101004800(0x41a00000, float:20.0)
            float r3 = com.bytedance.adsdk.ugeno.m.cw.j(r4, r3)
            r2.yl = r3
            return
        L71:
            r3 = 0
            float r3 = com.bytedance.adsdk.ugeno.m.cw.j(r4, r3)
            r2.qe = r3
            return
        L79:
            int r3 = com.bytedance.adsdk.ugeno.widget.ratingbar.j.xw
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4, r3)
            r2.ll = r3
            return
        L82:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.j = r3
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r8 = this;
            super.xt()
            boolean r0 = r8.p()
            if (r0 == 0) goto L1e
            T extends android.view.View r0 = r8.up
            r1 = r0
            com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar r1 = (com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar) r1
            float r0 = r8.oy
            double r2 = (double) r0
            int r4 = r8.j
            int r5 = r8.ll
            float r6 = r8.yl
            float r0 = r8.qe
            int r7 = (int) r0
            r1.j(r2, r4, r5, r6, r7)
            return
        L1e:
            T extends android.view.View r0 = r8.up
            r1 = r0
            com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar r1 = (com.bytedance.adsdk.ugeno.widget.ratingbar.UGRatingBar) r1
            float r0 = r8.oy
            double r2 = (double) r0
            int r4 = r8.j
            int r5 = r8.ll
            float r6 = r8.yl
            r7 = 5
            r1.j(r2, r4, r5, r6, r7)
            return
    }
}

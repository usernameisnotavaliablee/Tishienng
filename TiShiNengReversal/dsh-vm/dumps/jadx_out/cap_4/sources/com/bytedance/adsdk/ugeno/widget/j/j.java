package com.bytedance.adsdk.ugeno.widget.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.widget.text.xt {
    private com.bytedance.adsdk.ugeno.m.j.C0190j d;
    private boolean fx;
    private java.lang.String oy;
    private java.lang.String px;
    private java.lang.String qe;
    private boolean tk;
    private int wi;
    private int xw;
    private java.lang.String yl;


    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "row"
            r0.yl = r1
            return
    }

    static /* synthetic */ android.content.Context j(com.bytedance.adsdk.ugeno.widget.j.j r0) {
            android.content.Context r0 = r0.xt
            return r0
    }

    static /* synthetic */ void j(com.bytedance.adsdk.ugeno.widget.j.j r0, android.graphics.drawable.Drawable r1) {
            r0.xt(r1)
            return
    }

    private void tl() {
            r4 = this;
            java.lang.String r0 = r4.oy
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9
            goto L30
        L9:
            T extends android.view.View r0 = r4.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r1 = 0
            r0.setCompoundDrawables(r1, r1, r1, r1)
            java.lang.String r0 = r4.oy
            java.lang.String r1 = "local://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L31
            java.lang.String r0 = r4.oy     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L30
            android.content.Context r1 = r4.xt     // Catch: java.lang.Throwable -> L30
            int r0 = com.bytedance.adsdk.ugeno.m.r.xt(r1, r0)     // Catch: java.lang.Throwable -> L30
            android.graphics.drawable.Drawable r0 = com.bytedance.adsdk.ugeno.m.tl.j(r1, r0)     // Catch: java.lang.Throwable -> L30
            r4.xt(r0)     // Catch: java.lang.Throwable -> L30
        L30:
            return
        L31:
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j()
            com.bytedance.adsdk.ugeno.j r0 = r0.xt()
            com.bytedance.adsdk.ugeno.cw.ws r1 = r4.g
            java.lang.String r2 = r4.oy
            com.bytedance.adsdk.ugeno.widget.j.j$1 r3 = new com.bytedance.adsdk.ugeno.widget.j.j$1
            r3.<init>(r4)
            r0.j(r1, r2, r3)
            return
    }

    private void xt(android.graphics.drawable.Drawable r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.yl
            int r1 = r0.hashCode()
            r2 = 0
            switch(r1) {
                case -1781065991: goto L35;
                case -1354837162: goto L25;
                case -207799939: goto L15;
                case 113114: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L45
        Le:
            java.lang.String r1 = "row"
            boolean r0 = r0.equals(r1)
            goto L45
        L15:
            java.lang.String r1 = "row_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r4, r2)
            return
        L25:
            java.lang.String r1 = "column"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r4, r2, r2)
            return
        L35:
            java.lang.String r1 = "column_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r4)
            return
        L45:
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r4, r2, r2, r2)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.widget.text.xt, com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            super.j(r5, r6)
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 1
            r3 = -1
            switch(r0) {
                case -962590849: goto L53;
                case -808924190: goto L48;
                case -104120541: goto L3d;
                case 100313435: goto L32;
                case 496106759: goto L27;
                case 1126933377: goto L1c;
                case 1132404089: goto L11;
                default: goto L10;
            }
        L10:
            goto L5d
        L11:
            java.lang.String r0 = "highlightBackgroundImage"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L1a
            goto L5d
        L1a:
            r3 = 6
            goto L5d
        L1c:
            java.lang.String r0 = "highlightBackgroundColor"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L25
            goto L5d
        L25:
            r3 = 5
            goto L5d
        L27:
            java.lang.String r0 = "highlightImage"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L30
            goto L5d
        L30:
            r3 = 4
            goto L5d
        L32:
            java.lang.String r0 = "image"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3b
            goto L5d
        L3b:
            r3 = 3
            goto L5d
        L3d:
            java.lang.String r0 = "highlightedTextColor"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L46
            goto L5d
        L46:
            r3 = 2
            goto L5d
        L48:
            java.lang.String r0 = "highlightTextColor"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L51
            goto L5d
        L51:
            r3 = 1
            goto L5d
        L53:
            java.lang.String r0 = "direction"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            switch(r3) {
                case 0: goto L8d;
                case 1: goto L84;
                case 2: goto L84;
                case 3: goto L81;
                case 4: goto L7e;
                case 5: goto L64;
                case 6: goto L61;
                default: goto L60;
            }
        L60:
            return
        L61:
            r4.px = r6
            return
        L64:
            boolean r5 = com.bytedance.adsdk.ugeno.m.j.cw(r6)
            if (r5 == 0) goto L73
            r4.f2029u = r2
            com.bytedance.adsdk.ugeno.m.j$j r5 = com.bytedance.adsdk.ugeno.m.j.xt(r6)
            r4.d = r5
            goto L7b
        L73:
            int r5 = com.bytedance.adsdk.ugeno.m.j.j(r6)
            r4.xw = r5
            r4.f2029u = r1
        L7b:
            r4.fx = r2
            return
        L7e:
            r4.qe = r6
            return
        L81:
            r4.oy = r6
            return
        L84:
            int r5 = com.bytedance.adsdk.ugeno.m.j.j(r6)
            r4.wi = r5
            r4.tk = r2
            return
        L8d:
            r4.yl = r6
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    protected void n() {
            r2 = this;
            super.n()
            boolean r0 = r2.tk
            if (r0 == 0) goto L10
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            int r1 = r2.wi
            r0.setTextColor(r1)
        L10:
            boolean r0 = r2.fx
            if (r0 == 0) goto L23
            boolean r0 = r2.f2029u
            if (r0 == 0) goto L1e
            com.bytedance.adsdk.ugeno.m.j$j r0 = r2.d
            r2.j(r0)
            return
        L1e:
            int r0 = r2.xw
            r2.cw(r0)
        L23:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    protected void nd() {
            r2 = this;
            super.nd()
            boolean r0 = r2.tk
            if (r0 == 0) goto L10
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            int r1 = r2.ll
            r0.setTextColor(r1)
        L10:
            boolean r0 = r2.fx
            if (r0 == 0) goto L23
            boolean r0 = r2.f2029u
            if (r0 == 0) goto L1e
            com.bytedance.adsdk.ugeno.m.j$j r0 = r2.wo
            r2.j(r0)
            return
        L1e:
            int r0 = r2.ed
            r2.cw(r0)
        L23:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.widget.text.xt, com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r2 = this;
            super.xt()
            r2.tl()
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r1 = 17
            r0.setGravity(r1)
            return
    }
}

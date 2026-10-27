package com.bytedance.adsdk.ugeno.widget.text;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.xt.cw<com.bytedance.adsdk.ugeno.widget.text.RichTextView> {
    private int d;
    private java.lang.String j;
    private int ll;
    private float oy;
    private int px;
    private int qe;
    private java.lang.String xw;
    private java.lang.String yl;

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.qe = r1
            r1 = 2
            r0.d = r1
            return
    }

    private int qv(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.hashCode()
            r1 = 2
            r2 = -1
            switch(r0) {
                case -1364013995: goto L23;
                case 3317767: goto L18;
                case 108511772: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L2d
        Ld:
            java.lang.String r0 = "right"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L16
            goto L2d
        L16:
            r2 = 2
            goto L2d
        L18:
            java.lang.String r0 = "left"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L21
            goto L2d
        L21:
            r2 = 1
            goto L2d
        L23:
            java.lang.String r0 = "center"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            switch(r2) {
                case 0: goto L35;
                case 1: goto L33;
                case 2: goto L31;
                default: goto L30;
            }
        L30:
            return r1
        L31:
            r4 = 5
            return r4
        L33:
            r4 = 3
            return r4
        L35:
            r4 = 17
            return r4
    }

    public com.bytedance.adsdk.ugeno.widget.text.RichTextView ae() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = new com.bytedance.adsdk.ugeno.widget.text.RichTextView
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ com.bytedance.adsdk.ugeno.widget.text.RichTextView j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = r1.ae()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            goto L72
        L8:
            super.j(r3, r4)
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1065511464: goto L65;
                case -1063571914: goto L5a;
                case -1048634236: goto L4f;
                case -1003668786: goto L44;
                case 3556653: goto L39;
                case 102977279: goto L2e;
                case 390232059: goto L23;
                case 1554823821: goto L18;
                default: goto L16;
            }
        L16:
            goto L6f
        L18:
            java.lang.String r0 = "ellipsize"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L21
            goto L6f
        L21:
            r1 = 7
            goto L6f
        L23:
            java.lang.String r0 = "maxLines"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2c
            goto L6f
        L2c:
            r1 = 6
            goto L6f
        L2e:
            java.lang.String r0 = "lines"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L37
            goto L6f
        L37:
            r1 = 5
            goto L6f
        L39:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto L6f
        L42:
            r1 = 4
            goto L6f
        L44:
            java.lang.String r0 = "textSize"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4d
            goto L6f
        L4d:
            r1 = 3
            goto L6f
        L4f:
            java.lang.String r0 = "textStyle"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L58
            goto L6f
        L58:
            r1 = 2
            goto L6f
        L5a:
            java.lang.String r0 = "textColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L63
            goto L6f
        L63:
            r1 = 1
            goto L6f
        L65:
            java.lang.String r0 = "textAlign"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6e
            goto L6f
        L6e:
            r1 = 0
        L6f:
            switch(r1) {
                case 0: goto L98;
                case 1: goto L91;
                case 2: goto L8e;
                case 3: goto L87;
                case 4: goto L84;
                case 5: goto L7d;
                case 6: goto L76;
                case 7: goto L73;
                default: goto L72;
            }
        L72:
            return
        L73:
            r2.xw = r4
            return
        L76:
            int r3 = java.lang.Integer.parseInt(r4)
            r2.qe = r3
            return
        L7d:
            int r3 = java.lang.Integer.parseInt(r4)
            r2.px = r3
            return
        L84:
            r2.j = r4
            return
        L87:
            float r3 = java.lang.Float.parseFloat(r4)
            r2.oy = r3
            return
        L8e:
            r2.yl = r4
            return
        L91:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.ll = r3
            return
        L98:
            int r3 = r2.qv(r4)
            r2.d = r3
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r3 = this;
            super.xt()
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.RichTextView) r0
            java.lang.String r1 = r3.j
            r0.setRichText(r1)
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.RichTextView) r0
            r1 = 1
            float r2 = r3.oy
            r0.setTextSize(r1, r2)
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.RichTextView) r0
            int r1 = r3.ll
            r0.setTextColor(r1)
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.RichTextView) r0
            int r1 = r3.px
            r0.setLines(r1)
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.RichTextView) r0
            int r1 = r3.qe
            r0.setMaxLines(r1)
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.RichTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.RichTextView) r0
            int r1 = r3.d
            r0.setGravity(r1)
            return
    }
}

package com.bytedance.adsdk.ugeno.widget.input;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.xt.cw<android.widget.EditText> {
    private int d;
    private int j;
    private int ll;
    private float oy;
    private int px;
    private int qe;
    private java.lang.String tk;
    private java.lang.String wi;
    private java.lang.String xw;
    private java.lang.String yl;

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.j = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.qe = r1
            r1 = 2
            r0.d = r1
            return
    }

    private int qv(java.lang.String r2) {
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1034364087: goto L2e;
                case 3556653: goto L28;
                case 96619420: goto L1d;
                case 106642798: goto L13;
                case 1216985755: goto L8;
                default: goto L7;
            }
        L7:
            goto L38
        L8:
            java.lang.String r0 = "password"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L38
            r2 = 128(0x80, float:1.8E-43)
            return r2
        L13:
            java.lang.String r0 = "phone"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L38
            r2 = 3
            return r2
        L1d:
            java.lang.String r0 = "email"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L38
            r2 = 32
            return r2
        L28:
            java.lang.String r0 = "text"
            r2.equals(r0)
            goto L38
        L2e:
            java.lang.String r0 = "number"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L38
            r2 = 2
            return r2
        L38:
            r2 = 1
            return r2
    }

    private int vl(java.lang.String r4) {
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

    public android.widget.EditText ae() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.input.UGEditText r0 = new com.bytedance.adsdk.ugeno.widget.input.UGEditText
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ android.widget.EditText j() {
            r1 = this;
            android.widget.EditText r0 = r1.ae()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            goto L8e
        L8:
            super.j(r3, r4)
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1065511464: goto L81;
                case -1063571914: goto L76;
                case -1048634236: goto L6b;
                case -1003668786: goto L60;
                case 3202695: goto L55;
                case 3556653: goto L4a;
                case 102977279: goto L3f;
                case 390232059: goto L34;
                case 1554823821: goto L26;
                case 1706976804: goto L18;
                default: goto L16;
            }
        L16:
            goto L8b
        L18:
            java.lang.String r0 = "inputType"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L22
            goto L8b
        L22:
            r1 = 9
            goto L8b
        L26:
            java.lang.String r0 = "ellipsize"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L30
            goto L8b
        L30:
            r1 = 8
            goto L8b
        L34:
            java.lang.String r0 = "maxLines"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3d
            goto L8b
        L3d:
            r1 = 7
            goto L8b
        L3f:
            java.lang.String r0 = "lines"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L48
            goto L8b
        L48:
            r1 = 6
            goto L8b
        L4a:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L53
            goto L8b
        L53:
            r1 = 5
            goto L8b
        L55:
            java.lang.String r0 = "hint"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5e
            goto L8b
        L5e:
            r1 = 4
            goto L8b
        L60:
            java.lang.String r0 = "textSize"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L69
            goto L8b
        L69:
            r1 = 3
            goto L8b
        L6b:
            java.lang.String r0 = "textStyle"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L74
            goto L8b
        L74:
            r1 = 2
            goto L8b
        L76:
            java.lang.String r0 = "textColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7f
            goto L8b
        L7f:
            r1 = 1
            goto L8b
        L81:
            java.lang.String r0 = "textAlign"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8a
            goto L8b
        L8a:
            r1 = 0
        L8b:
            switch(r1) {
                case 0: goto Lbe;
                case 1: goto Lb7;
                case 2: goto Lb4;
                case 3: goto Lad;
                case 4: goto Laa;
                case 5: goto La7;
                case 6: goto La0;
                case 7: goto L99;
                case 8: goto L96;
                case 9: goto L8f;
                default: goto L8e;
            }
        L8e:
            return
        L8f:
            int r3 = r2.qv(r4)
            r2.j = r3
            return
        L96:
            r2.xw = r4
            return
        L99:
            int r3 = java.lang.Integer.parseInt(r4)
            r2.qe = r3
            return
        La0:
            int r3 = java.lang.Integer.parseInt(r4)
            r2.px = r3
            return
        La7:
            r2.wi = r4
            return
        Laa:
            r2.tk = r4
            return
        Lad:
            float r3 = java.lang.Float.parseFloat(r4)
            r2.oy = r3
            return
        Lb4:
            r2.yl = r4
            return
        Lb7:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.ll = r3
            return
        Lbe:
            int r3 = r2.vl(r4)
            r2.d = r3
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r3 = this;
            super.xt()
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            int r1 = r3.j
            r0.setInputType(r1)
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = r3.wi
            r0.setText(r1)
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1 = 1
            float r2 = r3.oy
            r0.setTextSize(r1, r2)
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            int r1 = r3.ll
            r0.setTextColor(r1)
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            int r1 = r3.px
            r0.setLines(r1)
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            int r1 = r3.qe
            r0.setMaxLines(r1)
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            int r1 = r3.d
            r0.setGravity(r1)
            T extends android.view.View r0 = r3.up
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = r3.tk
            r0.setHint(r1)
            return
    }
}

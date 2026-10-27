package com.bytedance.adsdk.ugeno.widget.text;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.ugeno.xt.cw<com.bytedance.adsdk.ugeno.widget.text.UGTextView> {
    private int d;
    private boolean et;
    private float fx;
    private int gr;
    protected java.lang.String j;
    protected int ll;
    private float na;

    @java.lang.Deprecated
    private float nu;
    private float om;

    @java.lang.Deprecated
    private float ov;
    private float oy;
    private int px;
    private int qe;
    private float qg;
    private float rs;
    private android.text.TextUtils.TruncateAt tk;

    @java.lang.Deprecated
    private android.text.TextUtils.TruncateAt wi;
    private int xw;
    private int yl;
    private float zs;

    public xt(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.ll = r1
            r1 = 1094713344(0x41400000, float:12.0)
            r0.oy = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.qe = r1
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.xw = r1
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.tk = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.fx = r1
            r1 = 1137180672(0x43c80000, float:400.0)
            r0.na = r1
            return
    }

    private int av(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1026963764: goto L22;
                case -972521773: goto L17;
                case 3387192: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L2c
        Lc:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L15
            goto L2c
        L15:
            r1 = 2
            goto L2c
        L17:
            java.lang.String r0 = "strikethrough"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L20
            goto L2c
        L20:
            r1 = 1
            goto L2c
        L22:
            java.lang.String r0 = "underline"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r3 = 2147483647(0x7fffffff, float:NaN)
            switch(r1) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L32;
                default: goto L32;
            }
        L32:
            return r3
        L33:
            r3 = 16
            return r3
        L36:
            r3 = 8
            return r3
    }

    private int az(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 3
            r3 = -1
            switch(r0) {
                case -1364013995: goto L3a;
                case -348726240: goto L2f;
                case 3317767: goto L24;
                case 108511772: goto L19;
                case 1063616078: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L44
        Le:
            java.lang.String r0 = "center_horizontal"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L17
            goto L44
        L17:
            r3 = 4
            goto L44
        L19:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L22
            goto L44
        L22:
            r3 = 3
            goto L44
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L2d
            goto L44
        L2d:
            r3 = 2
            goto L44
        L2f:
            java.lang.String r0 = "center_vertical"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L38
            goto L44
        L38:
            r3 = 1
            goto L44
        L3a:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L43
            goto L44
        L43:
            r3 = 0
        L44:
            switch(r3) {
                case 0: goto L4f;
                case 1: goto L4c;
                case 2: goto L4b;
                case 3: goto L49;
                case 4: goto L48;
                default: goto L47;
            }
        L47:
            return r2
        L48:
            return r1
        L49:
            r5 = 5
            return r5
        L4b:
            return r2
        L4c:
            r5 = 16
            return r5
        L4f:
            r5 = 17
            return r5
    }

    private android.text.TextUtils.TruncateAt jy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "none"
            boolean r2 = android.text.TextUtils.equals(r2, r0)
            if (r2 == 0) goto La
            r2 = 0
            return r2
        La:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            return r2
    }

    private void qb() {
            r5 = this;
            float r0 = r5.fx
            r1 = 1077936128(0x40400000, float:3.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L11
            T extends android.view.View r1 = r5.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r1 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r1
            r2 = 0
            r1.setLineSpacing(r2, r0)
            return
        L11:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L67
            android.content.Context r1 = r5.xt
            float r2 = r5.oy
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r2 = r2 * r3
            float r0 = r0 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r0 = com.bytedance.adsdk.ugeno.m.tl.j(r1, r0)
            int r0 = java.lang.Math.round(r0)
            T extends android.view.View r1 = r5.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r1 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r1
            int r1 = r1.getPaddingTop()
            int r1 = r1 + r0
            T extends android.view.View r2 = r5.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r2 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r2
            int r2 = r2.getPaddingBottom()
            int r2 = r2 + r0
            T extends android.view.View r0 = r5.up
            r3 = r0
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r3 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r3
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            int r0 = r0.getPaddingLeft()
            T extends android.view.View r4 = r5.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r4 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r4
            int r4 = r4.getPaddingRight()
            r3.setPadding(r0, r1, r4, r2)
            T extends android.view.View r0 = r5.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            android.content.Context r1 = r5.xt
            float r2 = r5.fx
            float r1 = com.bytedance.adsdk.ugeno.m.tl.j(r1, r2)
            int r1 = java.lang.Math.round(r1)
            com.bytedance.adsdk.ugeno.widget.text.a.a(r0, r1)
        L67:
            return
    }

    private void tl() {
            r3 = this;
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r1 = 0
            float r2 = r3.fx
            r0.setLineSpacing(r1, r2)
            return
    }

    private android.text.TextUtils.TruncateAt vl(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1364013995: goto L22;
                case 100571: goto L17;
                case 109757538: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L2c
        Lc:
            java.lang.String r0 = "start"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L15
            goto L2c
        L15:
            r1 = 2
            goto L2c
        L17:
            java.lang.String r0 = "end"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L20
            goto L2c
        L20:
            r1 = 1
            goto L2c
        L22:
            java.lang.String r0 = "center"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L38;
                case 2: goto L33;
                default: goto L2f;
            }
        L2f:
            r3 = 0
            r2.wi = r3
            goto L41
        L33:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.START
            r2.wi = r3
            goto L41
        L38:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r2.wi = r3
            goto L41
        L3d:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.MIDDLE
            r2.wi = r3
        L41:
            android.text.TextUtils$TruncateAt r3 = r2.wi
            return r3
    }

    private int ws(java.lang.String r3) {
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            if (r0 == r1) goto L24
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L1e
            r1 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r0 == r1) goto L14
            goto L2e
        L14:
            java.lang.String r0 = "bold"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r3 = 1
            return r3
        L1e:
            java.lang.String r0 = "normal"
            r3.equals(r0)
            goto L2e
        L24:
            java.lang.String r0 = "italic"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r3 = 2
            return r3
        L2e:
            r3 = 0
            return r3
    }

    public com.bytedance.adsdk.ugeno.widget.text.UGTextView ae() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = new com.bytedance.adsdk.ugeno.widget.text.UGTextView
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ com.bytedance.adsdk.ugeno.widget.text.UGTextView j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = r1.ae()
            return r0
    }

    public void j(android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            T extends android.view.View r0 = r1.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r0.setEllipsize(r2)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L8
            goto L16c
        L8:
            super.j(r5, r6)
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case -1621067310: goto L10f;
                case -1589741021: goto L104;
                case -1230714651: goto Lf9;
                case -1230714650: goto Lee;
                case -1065511464: goto Le3;
                case -1063571914: goto Ld8;
                case -1048634236: goto Lcd;
                case -1021145689: goto Lc2;
                case -1003668786: goto Lb4;
                case -879295043: goto La6;
                case -756368940: goto L98;
                case -756368939: goto L8a;
                case -734428249: goto L7c;
                case -515807685: goto L6e;
                case 3556653: goto L60;
                case 102977279: goto L52;
                case 188702929: goto L44;
                case 390232059: goto L36;
                case 1554823821: goto L28;
                case 2111078717: goto L1a;
                default: goto L18;
            }
        L18:
            goto L119
        L1a:
            java.lang.String r0 = "letterSpacing"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L24
            goto L119
        L24:
            r3 = 19
            goto L119
        L28:
            java.lang.String r0 = "ellipsize"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L32
            goto L119
        L32:
            r3 = 18
            goto L119
        L36:
            java.lang.String r0 = "maxLines"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L40
            goto L119
        L40:
            r3 = 17
            goto L119
        L44:
            java.lang.String r0 = "ellipsis"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L4e
            goto L119
        L4e:
            r3 = 16
            goto L119
        L52:
            java.lang.String r0 = "lines"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5c
            goto L119
        L5c:
            r3 = 15
            goto L119
        L60:
            java.lang.String r0 = "text"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L119
        L6a:
            r3 = 14
            goto L119
        L6e:
            java.lang.String r0 = "lineHeight"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L78
            goto L119
        L78:
            r3 = 13
            goto L119
        L7c:
            java.lang.String r0 = "fontWeight"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L86
            goto L119
        L86:
            r3 = 12
            goto L119
        L8a:
            java.lang.String r0 = "shadowDy"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L94
            goto L119
        L94:
            r3 = 11
            goto L119
        L98:
            java.lang.String r0 = "shadowDx"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto La2
            goto L119
        La2:
            r3 = 10
            goto L119
        La6:
            java.lang.String r0 = "textDecoration"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lb0
            goto L119
        Lb0:
            r3 = 9
            goto L119
        Lb4:
            java.lang.String r0 = "textSize"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lbe
            goto L119
        Lbe:
            r3 = 8
            goto L119
        Lc2:
            java.lang.String r0 = "shadowBlur"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lcb
            goto L119
        Lcb:
            r3 = 7
            goto L119
        Lcd:
            java.lang.String r0 = "textStyle"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Ld6
            goto L119
        Ld6:
            r3 = 6
            goto L119
        Ld8:
            java.lang.String r0 = "textColor"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Le1
            goto L119
        Le1:
            r3 = 5
            goto L119
        Le3:
            java.lang.String r0 = "textAlign"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lec
            goto L119
        Lec:
            r3 = 4
            goto L119
        Lee:
            java.lang.String r0 = "shadowOffsetY"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lf7
            goto L119
        Lf7:
            r3 = 3
            goto L119
        Lf9:
            java.lang.String r0 = "shadowOffsetX"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L102
            goto L119
        L102:
            r3 = 2
            goto L119
        L104:
            java.lang.String r0 = "shadowColor"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L10d
            goto L119
        L10d:
            r3 = 1
            goto L119
        L10f:
            java.lang.String r0 = "shadowRadius"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L118
            goto L119
        L118:
            r3 = 0
        L119:
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            switch(r3) {
                case 0: goto L1c6;
                case 1: goto L1bd;
                case 2: goto L1b0;
                case 3: goto L1a3;
                case 4: goto L19c;
                case 5: goto L195;
                case 6: goto L18e;
                case 7: goto L1c6;
                case 8: goto L187;
                case 9: goto L180;
                case 10: goto L179;
                case 11: goto L172;
                case 12: goto L159;
                case 13: goto L152;
                case 14: goto L14f;
                case 15: goto L148;
                case 16: goto L141;
                case 17: goto L134;
                case 18: goto L12d;
                case 19: goto L120;
                default: goto L11f;
            }
        L11f:
            goto L16c
        L120:
            android.content.Context r5 = r4.xt
            float r6 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            float r5 = com.bytedance.adsdk.ugeno.m.tl.j(r5, r6)
            r4.rs = r5
            return
        L12d:
            android.text.TextUtils$TruncateAt r5 = r4.vl(r6)
            r4.wi = r5
            return
        L134:
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r6 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r5)
            if (r6 <= 0) goto L13e
            r5 = r6
        L13e:
            r4.qe = r5
            return
        L141:
            android.text.TextUtils$TruncateAt r5 = r4.jy(r6)
            r4.tk = r5
            return
        L148:
            int r5 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r2)
            r4.px = r5
            return
        L14f:
            r4.j = r6
            return
        L152:
            float r5 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r5)
            r4.fx = r5
            return
        L159:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            r4.na = r6
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L16d
            r5 = 1148846080(0x447a0000, float:1000.0)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L16c
            goto L16d
        L16c:
            return
        L16d:
            r5 = 1137180672(0x43c80000, float:400.0)
            r4.na = r5
            return
        L172:
            float r5 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            r4.nu = r5
            return
        L179:
            float r5 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            r4.ov = r5
            return
        L180:
            int r5 = r4.av(r6)
            r4.d = r5
            return
        L187:
            float r5 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            r4.oy = r5
            return
        L18e:
            int r5 = r4.ws(r6)
            r4.yl = r5
            return
        L195:
            int r5 = com.bytedance.adsdk.ugeno.m.j.j(r6)
            r4.ll = r5
            return
        L19c:
            int r5 = r4.az(r6)
            r4.xw = r5
            return
        L1a3:
            android.content.Context r5 = r4.xt
            float r6 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            float r5 = com.bytedance.adsdk.ugeno.m.tl.j(r5, r6)
            r4.zs = r5
            return
        L1b0:
            android.content.Context r5 = r4.xt
            float r6 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            float r5 = com.bytedance.adsdk.ugeno.m.tl.j(r5, r6)
            r4.om = r5
            return
        L1bd:
            int r5 = com.bytedance.adsdk.ugeno.m.j.j(r6)
            r4.gr = r5
            r4.et = r1
            return
        L1c6:
            float r5 = com.bytedance.adsdk.ugeno.m.cw.j(r6, r0)
            r4.qg = r5
            return
    }

    public void m(int r2) {
            r1 = this;
            r1.d = r2
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L8
            return
        L8:
            T extends android.view.View r0 = r1.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r0.setPaintFlags(r2)
            return
    }

    public void qv(java.lang.String r2) {
            r1 = this;
            r1.j = r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "null"
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            if (r2 == 0) goto L15
            java.lang.String r2 = ""
            r1.j = r2
        L15:
            T extends android.view.View r2 = r1.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r2 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r2
            java.lang.String r0 = r1.j
            r2.setText(r0)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r9 = this;
            super.xt()
            java.lang.String r0 = "null"
            java.lang.String r1 = r9.j
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = ""
            r9.j = r0
        L11:
            java.lang.String r0 = r9.j
            r9.qv(r0)
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            float r1 = r9.oy
            r2 = 1
            r0.setTextSize(r2, r1)
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            int r1 = r9.ll
            r0.setTextColor(r1)
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            int r1 = r9.px
            r0.setLines(r1)
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            int r1 = r9.qe
            r0.setMaxLines(r1)
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            int r1 = r9.xw
            r0.setGravity(r1)
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            r1 = 0
            r0.setIncludeFontPadding(r1)
            int r0 = r9.d
            r9.m(r0)
            boolean r0 = r9.p()
            if (r0 == 0) goto L5d
            android.text.TextUtils$TruncateAt r0 = r9.tk
            r9.j(r0)
            goto L62
        L5d:
            android.text.TextUtils$TruncateAt r0 = r9.wi
            r9.j(r0)
        L62:
            float r0 = r9.fx
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L76
            boolean r0 = r9.p()
            if (r0 == 0) goto L73
            r9.qb()
            goto L76
        L73:
            r9.tl()
        L76:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L83
            T extends android.view.View r4 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r4 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r4
            com.bytedance.adsdk.ugeno.widget.text.b.a(r4, r1)
        L83:
            boolean r4 = r9.p()
            if (r4 == 0) goto La8
            boolean r4 = r9.et
            if (r4 == 0) goto Lb7
            float r4 = r9.qg
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L98
            r4 = 925353388(0x3727c5ac, float:1.0E-5)
            r9.qg = r4
        L98:
            T extends android.view.View r4 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r4 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r4
            float r5 = r9.qg
            float r6 = r9.om
            float r7 = r9.zs
            int r8 = r9.gr
            r4.setShadowLayer(r5, r6, r7, r8)
            goto Lb7
        La8:
            T extends android.view.View r4 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r4 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r4
            float r5 = r9.qg
            float r6 = r9.ov
            float r7 = r9.nu
            int r8 = r9.gr
            r4.setShadowLayer(r5, r6, r7, r8)
        Lb7:
            int r4 = r9.yl
            if (r4 != r2) goto Lc5
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r0.setTypeface(r1, r4)
            goto Lf0
        Lc5:
            r5 = 28
            if (r0 < r5) goto Ldf
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            float r5 = r9.na
            int r5 = (int) r5
            r6 = 2
            if (r4 != r6) goto Ld2
            goto Ld3
        Ld2:
            r2 = 0
        Ld3:
            android.graphics.Typeface r0 = com.bytedance.adsdk.ugeno.widget.text.c.a(r0, r5, r2)
            T extends android.view.View r1 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r1 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r1
            r1.setTypeface(r0)
            goto Lf0
        Ldf:
            float r0 = r9.na
            r1 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lf0
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r0 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r0
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r0.setTypeface(r1, r2)
        Lf0:
            android.content.Context r0 = r9.xt
            float r1 = r9.oy
            float r0 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r1)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L10e
            float r0 = r9.rs
            android.content.Context r1 = r9.xt
            float r2 = r9.oy
            float r1 = com.bytedance.adsdk.ugeno.m.tl.j(r1, r2)
            float r0 = r0 / r1
            T extends android.view.View r1 = r9.up
            com.bytedance.adsdk.ugeno.widget.text.UGTextView r1 = (com.bytedance.adsdk.ugeno.widget.text.UGTextView) r1
            r1.setLetterSpacing(r0)
        L10e:
            return
    }
}

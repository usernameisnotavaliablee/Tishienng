package com.bytedance.adsdk.ugeno.widget.progressbar;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.xt.cw<com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar> {
    private int j;
    private int ll;
    private java.lang.String oy;
    private float px;
    private float qe;
    private int yl;

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar ae() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar r0 = new com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar r0 = r1.ae()
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
                case -1295741135: goto L46;
                case -1063571914: goto L3b;
                case -1003668786: goto L30;
                case -1001078227: goto L25;
                case 3556653: goto L1a;
                case 755159350: goto Lf;
                default: goto Le;
            }
        Le:
            goto L50
        Lf:
            java.lang.String r0 = "progressColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto L50
        L18:
            r1 = 5
            goto L50
        L1a:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L23
            goto L50
        L23:
            r1 = 4
            goto L50
        L25:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2e
            goto L50
        L2e:
            r1 = 3
            goto L50
        L30:
            java.lang.String r0 = "textSize"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L39
            goto L50
        L39:
            r1 = 2
            goto L50
        L3b:
            java.lang.String r0 = "textColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L44
            goto L50
        L44:
            r1 = 1
            goto L50
        L46:
            java.lang.String r0 = "progressBgColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
            goto L50
        L4f:
            r1 = 0
        L50:
            switch(r1) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L66;
                case 3: goto L5e;
                case 4: goto L5b;
                case 5: goto L54;
                default: goto L53;
            }
        L53:
            return
        L54:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.j = r3
            return
        L5b:
            r2.oy = r4
            return
        L5e:
            r3 = 0
            float r3 = com.bytedance.adsdk.ugeno.m.cw.j(r4, r3)
            r2.px = r3
            return
        L66:
            android.content.Context r3 = r2.xt
            float r3 = com.bytedance.adsdk.ugeno.m.tl.j(r3, r4)
            r2.qe = r3
            return
        L6f:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.yl = r3
            return
        L76:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.ll = r3
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r2 = this;
            super.xt()
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar r0 = (com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar) r0
            int r1 = r2.ll
            r0.setBackgroundColor(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar r0 = (com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar) r0
            java.lang.String r1 = r2.oy
            r0.setText(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar r0 = (com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar) r0
            int r1 = r2.ll
            r0.setProgressBgColor(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar r0 = (com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar) r0
            int r1 = r2.j
            r0.setProgressColor(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar r0 = (com.bytedance.adsdk.ugeno.widget.progressbar.UGProgressBar) r0
            int r1 = r2.yl
            r0.setTextColor(r1)
            return
    }
}

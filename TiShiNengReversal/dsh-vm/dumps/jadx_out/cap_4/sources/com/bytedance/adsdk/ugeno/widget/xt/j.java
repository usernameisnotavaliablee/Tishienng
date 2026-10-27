package com.bytedance.adsdk.ugeno.widget.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j extends com.bytedance.adsdk.ugeno.widget.image.xt {
    private int qe;

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.qe = r1
            return
    }

    private java.lang.String jy(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = r1.qv(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            java.lang.String r2 = ""
            return r2
        Ld:
            java.lang.String r0 = "local://"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            return r2
    }

    @Override // com.bytedance.adsdk.ugeno.widget.image.xt
    protected java.lang.String ae() {
            r1 = this;
            java.lang.String r0 = "drawable"
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.widget.image.xt, com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            super.j(r2, r3)
            r2.getClass()
            java.lang.String r0 = "textColor"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lf
            return
        Lf:
            int r2 = com.bytedance.adsdk.ugeno.m.j.j(r3)
            r1.qe = r2
            return
    }

    public abstract java.lang.String qv(java.lang.String r1);

    @Override // com.bytedance.adsdk.ugeno.widget.image.xt, com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r2 = this;
            java.lang.String r0 = r2.j
            java.lang.String r0 = r2.jy(r0)
            r2.j = r0
            super.xt()
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            int r1 = r2.qe
            r0.setColorFilter(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r1)
            return
    }
}

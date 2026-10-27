package com.bytedance.adsdk.ugeno.widget.dislike;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.xt.cw<com.bytedance.adsdk.ugeno.widget.dislike.DislikeView> {
    private int j;
    private int ll;
    private int oy;

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.j = r1
            r0.oy = r1
            return
    }

    public com.bytedance.adsdk.ugeno.widget.dislike.DislikeView ae() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = new com.bytedance.adsdk.ugeno.widget.dislike.DislikeView
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ com.bytedance.adsdk.ugeno.widget.dislike.DislikeView j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = r1.ae()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L39
        L7:
            super.j(r3, r4)
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -991792834: goto L2c;
                case -973508703: goto L21;
                case 95494139: goto L16;
                default: goto L15;
            }
        L15:
            goto L36
        L16:
            java.lang.String r0 = "dislikeFillColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1f
            goto L36
        L1f:
            r1 = 2
            goto L36
        L21:
            java.lang.String r0 = "dislikeWidth"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2a
            goto L36
        L2a:
            r1 = 1
            goto L36
        L2c:
            java.lang.String r0 = "dislikeColor"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L35
            goto L36
        L35:
            r1 = 0
        L36:
            switch(r1) {
                case 0: goto L50;
                case 1: goto L41;
                case 2: goto L3a;
                default: goto L39;
            }
        L39:
            return
        L3a:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.oy = r3
            return
        L41:
            android.content.Context r3 = r2.xt
            int r4 = java.lang.Integer.parseInt(r4)
            float r4 = (float) r4
            float r3 = com.bytedance.adsdk.ugeno.m.tl.j(r3, r4)
            int r3 = (int) r3
            r2.ll = r3
            return
        L50:
            int r3 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            r2.j = r3
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r2 = this;
            super.xt()
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = (com.bytedance.adsdk.ugeno.widget.dislike.DislikeView) r0
            float r1 = r2.ol
            r0.setRadius(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = (com.bytedance.adsdk.ugeno.widget.dislike.DislikeView) r0
            float r1 = r2.sm
            int r1 = (int) r1
            r0.setStrokeWidth(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = (com.bytedance.adsdk.ugeno.widget.dislike.DislikeView) r0
            int r1 = r2.j
            r0.setDislikeColor(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = (com.bytedance.adsdk.ugeno.widget.dislike.DislikeView) r0
            int r1 = r2.xq
            r0.setStrokeColor(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = (com.bytedance.adsdk.ugeno.widget.dislike.DislikeView) r0
            int r1 = r2.ll
            r0.setDislikeWidth(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.dislike.DislikeView r0 = (com.bytedance.adsdk.ugeno.widget.dislike.DislikeView) r0
            int r1 = r2.oy
            r0.setBgColor(r1)
            return
    }
}

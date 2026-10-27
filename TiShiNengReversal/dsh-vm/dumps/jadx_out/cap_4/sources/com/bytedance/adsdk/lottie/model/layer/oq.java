package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oq extends com.bytedance.adsdk.lottie.model.layer.cw {
    private final com.bytedance.adsdk.lottie.j.j.r ae;
    private final com.bytedance.adsdk.lottie.model.layer.r tl;

    oq(com.bytedance.adsdk.lottie.tl r3, com.bytedance.adsdk.lottie.model.layer.tl r4, com.bytedance.adsdk.lottie.model.layer.r r5, com.bytedance.adsdk.lottie.m r6) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.tl = r5
            com.bytedance.adsdk.lottie.model.xt.av r5 = new com.bytedance.adsdk.lottie.model.xt.av
            java.util.List r4 = r4.ws()
            r0 = 0
            java.lang.String r1 = "__container"
            r5.<init>(r1, r4, r0)
            com.bytedance.adsdk.lottie.j.j.r r4 = new com.bytedance.adsdk.lottie.j.j.r
            r4.<init>(r3, r2, r5, r6)
            r2.ae = r4
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            r4.j(r3, r3)
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw, com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r2, android.graphics.Matrix r3, boolean r4) {
            r1 = this;
            super.j(r2, r3, r4)
            com.bytedance.adsdk.lottie.j.j.r r3 = r1.ae
            android.graphics.Matrix r0 = r1.j
            r3.j(r2, r0, r4)
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public com.bytedance.adsdk.lottie.r.oq jy() {
            r1 = this;
            com.bytedance.adsdk.lottie.r.oq r0 = super.jy()
            if (r0 == 0) goto L7
            return r0
        L7:
            com.bytedance.adsdk.lottie.model.layer.r r0 = r1.tl
            com.bytedance.adsdk.lottie.r.oq r0 = r0.jy()
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public com.bytedance.adsdk.lottie.model.xt.j vl() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.xt.j r0 = super.vl()
            if (r0 == 0) goto L7
            return r0
        L7:
            com.bytedance.adsdk.lottie.model.layer.r r0 = r1.tl
            com.bytedance.adsdk.lottie.model.xt.j r0 = r0.vl()
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r2, android.graphics.Matrix r3, int r4) {
            r1 = this;
            super.xt(r2, r3, r4)
            com.bytedance.adsdk.lottie.j.j.r r0 = r1.ae
            r0.j(r2, r3, r4)
            return
    }
}

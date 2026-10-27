package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class jy extends com.bytedance.adsdk.lottie.model.layer.ae {
    private int g;
    private final java.util.Map<java.lang.String, java.lang.Object> oq;
    private int tl;

    public jy(com.bytedance.adsdk.lottie.tl r1, com.bytedance.adsdk.lottie.model.layer.tl r2, android.content.Context r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.tl = r1
            r0.g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.oq = r1
            com.bytedance.adsdk.lottie.g r2 = r0.ae
            if (r2 == 0) goto L66
            float r2 = com.bytedance.adsdk.lottie.up.g.j()
            com.bytedance.adsdk.lottie.g r3 = r0.ae
            int r3 = r3.j()
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            r0.tl = r3
            com.bytedance.adsdk.lottie.g r3 = r0.ae
            int r3 = r3.xt()
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = (int) r3
            r0.g = r2
            com.bytedance.adsdk.lottie.g r2 = r0.ae
            java.lang.String r2 = r2.r()
            java.lang.String r3 = "ugen_url"
            r1.put(r3, r2)
            com.bytedance.adsdk.lottie.g r2 = r0.ae
            java.lang.String r2 = r2.up()
            java.lang.String r3 = "ugen_md5"
            r1.put(r3, r2)
            com.bytedance.adsdk.lottie.g r2 = r0.ae
            java.lang.String r2 = r2.m()
            java.lang.String r3 = "ugen_v"
            r1.put(r3, r2)
            int r2 = r0.tl
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "ugen_w"
            r1.put(r3, r2)
            int r2 = r0.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "ugen_h"
            r1.put(r3, r2)
        L66:
            return
    }

    private static void j(android.view.View r2, int r3, int r4) {
            r0 = 0
            r2.layout(r0, r0, r3, r4)
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            r2.measure(r3, r4)
            int r3 = r2.getMeasuredWidth()
            int r4 = r2.getMeasuredHeight()
            r2.layout(r0, r0, r3, r4)
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.ae, com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r4, android.graphics.Matrix r5, int r6) {
            r3 = this;
            com.bytedance.adsdk.lottie.tl r0 = r3.xt
            com.bytedance.adsdk.lottie.tj r0 = r0.j()
            if (r0 == 0) goto L11
            java.lang.String r1 = "view:"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.oq
            android.view.View r0 = r0.j(r1, r2)
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r3.tl
            if (r1 <= 0) goto L35
            if (r0 == 0) goto L35
            r4.save()
            r4.concat(r5)
            r3.j(r6)
            float r5 = r3.tl()
            int r6 = r3.tl
            int r1 = r3.g
            j(r0, r6, r1)
            r0.setAlpha(r5)
            r0.draw(r4)
            r4.restore()
        L35:
            return
    }
}

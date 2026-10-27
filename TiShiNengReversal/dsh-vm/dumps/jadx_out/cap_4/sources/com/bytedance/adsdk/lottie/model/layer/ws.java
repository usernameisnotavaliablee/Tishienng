package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ws extends com.bytedance.adsdk.lottie.model.layer.ae {
    private int g;
    private int oq;
    private android.graphics.Path tl;

    public ws(com.bytedance.adsdk.lottie.tl r3, com.bytedance.adsdk.lottie.model.layer.tl r4, android.content.Context r5) {
            r2 = this;
            r2.<init>(r3, r4)
            r3 = 0
            r2.tl = r3
            r3 = -1
            r2.g = r3
            r2.oq = r3
            com.bytedance.adsdk.lottie.g r3 = r2.ae
            if (r3 == 0) goto L4a
            float r3 = com.bytedance.adsdk.lottie.up.g.j()
            com.bytedance.adsdk.lottie.g r4 = r2.ae
            int r4 = r4.j()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = (int) r4
            r2.g = r4
            com.bytedance.adsdk.lottie.g r4 = r2.ae
            int r4 = r4.xt()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = (int) r4
            r2.oq = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            int r5 = r2.g
            float r5 = (float) r5
            int r0 = r2.oq
            float r0 = (float) r0
            r1 = 0
            r4.set(r1, r1, r5, r0)
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r2.tl = r5
            r0 = 1109393408(0x42200000, float:40.0)
            float r3 = r3 * r0
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r4, r3, r3, r0)
        L4a:
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
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r2 = "videoview:"
            android.view.View r1 = r0.j(r2, r1)
        Lf:
            int r0 = r3.g
            if (r0 <= 0) goto L37
            if (r1 == 0) goto L37
            r4.save()
            r4.concat(r5)
            r3.j(r6)
            float r5 = r3.tl()
            int r6 = r3.g
            int r0 = r3.oq
            j(r1, r6, r0)
            r1.setAlpha(r5)
            android.graphics.Path r5 = r3.tl
            r4.clipPath(r5)
            r1.draw(r4)
            r4.restore()
        L37:
            return
    }
}

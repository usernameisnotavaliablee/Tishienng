package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.adsdk.lottie.model.layer.ae {
    private float g;
    private com.bytedance.adsdk.lottie.model.layer.VideoFrame oq;
    private com.bytedance.adsdk.lottie.LottieAnimationView qv;
    private float tl;
    private com.bytedance.adsdk.lottie.g.j.C0182j vl;


    public up(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.tl r3, android.content.Context r4, com.bytedance.adsdk.lottie.g.j.C0182j r5) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.tl = r3
            r1.g = r3
            r1.vl = r5
            com.bytedance.adsdk.lottie.g r3 = r1.ae
            if (r3 == 0) goto L5f
            if (r2 == 0) goto L5f
            com.bytedance.adsdk.lottie.LottieAnimationView r3 = r2.xt()
            r1.qv = r3
            if (r3 != 0) goto L1a
            goto L5f
        L1a:
            float r3 = com.bytedance.adsdk.lottie.up.g.j()
            com.bytedance.adsdk.lottie.g r0 = r1.ae
            int r0 = r0.j()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            float r0 = (float) r0
            r1.tl = r0
            com.bytedance.adsdk.lottie.g r0 = r1.ae
            int r0 = r0.xt()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            float r3 = (float) r3
            r1.g = r3
            com.bytedance.adsdk.lottie.tj r2 = r2.j()
            r3 = 0
            if (r2 == 0) goto L45
            java.lang.String r0 = "videoview:"
            android.view.View r3 = r2.j(r0, r3)
        L45:
            boolean r2 = r3 instanceof android.view.TextureView
            if (r2 == 0) goto L52
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r2 = new com.bytedance.adsdk.lottie.model.layer.VideoFrame
            android.view.TextureView r3 = (android.view.TextureView) r3
            r2.<init>(r4, r3, r5)
            r1.oq = r2
        L52:
            com.bytedance.adsdk.lottie.LottieAnimationView r2 = r1.qv
            com.bytedance.adsdk.lottie.model.layer.up$1 r3 = new com.bytedance.adsdk.lottie.model.layer.up$1
            r3.<init>(r1)
            r2.addOnAttachStateChangeListener(r3)
            r1.ws()
        L5f:
            return
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.LottieAnimationView j(com.bytedance.adsdk.lottie.model.layer.up r0) {
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r0.qv
            return r0
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

    private void ws() {
            r3 = this;
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r0 = r3.oq
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L13
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r1 = r3.oq
            r0.removeView(r1)
        L13:
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r3.qv
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L2b
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r1 = r3.oq
            r2 = 1325400064(0x4f000000, float:2.1474836E9)
            r1.setTranslationX(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r1 = r3.oq
            r0.addView(r1)
        L2b:
            return
    }

    static /* synthetic */ void xt(com.bytedance.adsdk.lottie.model.layer.up r0) {
            r0.ws()
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.ae, com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r3, android.graphics.Matrix r4, int r5) {
            r2 = this;
            float r0 = r2.tl
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L30
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r0 = r2.oq
            if (r0 == 0) goto L30
            r3.save()
            r3.concat(r4)
            r2.j(r5)
            float r4 = r2.tl()
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r5 = r2.oq
            float r0 = r2.tl
            int r0 = (int) r0
            float r1 = r2.g
            int r1 = (int) r1
            j(r5, r0, r1)
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r5 = r2.oq
            r5.setAlpha(r4)
            com.bytedance.adsdk.lottie.model.layer.VideoFrame r4 = r2.oq
            r4.draw(r3)
            r3.restore()
        L30:
            return
    }
}

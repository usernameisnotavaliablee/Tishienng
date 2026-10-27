package com.bytedance.adsdk.lottie.model.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g implements com.bytedance.adsdk.lottie.model.j.jy<android.graphics.PointF, android.graphics.PointF> {
    private final com.bytedance.adsdk.lottie.model.j.xt j;
    private final com.bytedance.adsdk.lottie.model.j.xt xt;

    public g(com.bytedance.adsdk.lottie.model.j.xt r1, com.bytedance.adsdk.lottie.model.j.xt r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> cw() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> j() {
            r3 = this;
            com.bytedance.adsdk.lottie.j.xt.ws r0 = new com.bytedance.adsdk.lottie.j.xt.ws
            com.bytedance.adsdk.lottie.model.j.xt r1 = r3.j
            com.bytedance.adsdk.lottie.j.xt.j r1 = r1.j()
            com.bytedance.adsdk.lottie.model.j.xt r2 = r3.xt
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public boolean xt() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.j.xt r0 = r1.j
            boolean r0 = r0.xt()
            if (r0 == 0) goto L12
            com.bytedance.adsdk.lottie.model.j.xt r0 = r1.xt
            boolean r0 = r0.xt()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}

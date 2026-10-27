package com.bytedance.adsdk.lottie.model.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up implements com.bytedance.adsdk.lottie.model.j.jy<android.graphics.PointF, android.graphics.PointF> {
    private final java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> j;

    public up(java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> cw() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r0 = r1.j
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> j() {
            r2 = this;
            java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r0 = r2.j
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.adsdk.lottie.m.j r0 = (com.bytedance.adsdk.lottie.m.j) r0
            boolean r0 = r0.up()
            if (r0 == 0) goto L17
            com.bytedance.adsdk.lottie.j.xt.qv r0 = new com.bytedance.adsdk.lottie.j.xt.qv
            java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r1 = r2.j
            r0.<init>(r1)
            return r0
        L17:
            com.bytedance.adsdk.lottie.j.xt.oq r0 = new com.bytedance.adsdk.lottie.j.xt.oq
            java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r1 = r2.j
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public boolean xt() {
            r3 = this;
            java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r0 = r3.j
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L19
            java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r0 = r3.j
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.adsdk.lottie.m.j r0 = (com.bytedance.adsdk.lottie.m.j) r0
            boolean r0 = r0.up()
            if (r0 == 0) goto L19
            return r2
        L19:
            return r1
    }
}

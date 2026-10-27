package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class kt extends com.bytedance.adsdk.lottie.j.j.j {
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> ae;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1779m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.layer.cw f1780r;
    private com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> tl;
    private final java.lang.String up;

    public kt(com.bytedance.adsdk.lottie.tl r12, com.bytedance.adsdk.lottie.model.layer.cw r13, com.bytedance.adsdk.lottie.model.xt.w r14) {
            r11 = this;
            com.bytedance.adsdk.lottie.model.xt.w$j r0 = r14.ae()
            android.graphics.Paint$Cap r4 = r0.j()
            com.bytedance.adsdk.lottie.model.xt.w$xt r0 = r14.tl()
            android.graphics.Paint$Join r5 = r0.j()
            float r6 = r14.g()
            com.bytedance.adsdk.lottie.model.j.r r7 = r14.cw()
            com.bytedance.adsdk.lottie.model.j.xt r8 = r14.r()
            java.util.List r9 = r14.up()
            com.bytedance.adsdk.lottie.model.j.xt r10 = r14.m()
            r1 = r11
            r2 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.f1780r = r3
            java.lang.String r12 = r14.j()
            r1.up = r12
            boolean r12 = r14.oq()
            r1.f1779m = r12
            com.bytedance.adsdk.lottie.model.j.j r12 = r14.xt()
            com.bytedance.adsdk.lottie.j.xt.j r12 = r12.j()
            r1.ae = r12
            r12.j(r11)
            r3.j(r12)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.j, com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.Canvas r3, android.graphics.Matrix r4, int r5) {
            r2 = this;
            boolean r0 = r2.f1779m
            if (r0 == 0) goto L5
            return
        L5:
            android.graphics.Paint r0 = r2.xt
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r1 = r2.ae
            com.bytedance.adsdk.lottie.j.xt.xt r1 = (com.bytedance.adsdk.lottie.j.xt.xt) r1
            int r1 = r1.g()
            r0.setColor(r1)
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> r0 = r2.tl
            if (r0 == 0) goto L21
            android.graphics.Paint r1 = r2.xt
            java.lang.Object r0 = r0.ae()
            android.graphics.ColorFilter r0 = (android.graphics.ColorFilter) r0
            r1.setColorFilter(r0)
        L21:
            super.j(r3, r4, r5)
            return
    }
}

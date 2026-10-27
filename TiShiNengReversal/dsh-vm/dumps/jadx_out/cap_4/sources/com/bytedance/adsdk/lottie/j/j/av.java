package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class av implements com.bytedance.adsdk.lottie.j.j.jy, com.bytedance.adsdk.lottie.j.j.oq, com.bytedance.adsdk.lottie.j.j.qv, com.bytedance.adsdk.lottie.j.j.up, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> ae;
    private final com.bytedance.adsdk.lottie.tl cw;
    private final com.bytedance.adsdk.lottie.j.xt.av g;
    private final android.graphics.Matrix j;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1770m;
    private com.bytedance.adsdk.lottie.j.j.r oq;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.layer.cw f1771r;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> tl;
    private final java.lang.String up;
    private final android.graphics.Path xt;

    public av(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.cw r3, com.bytedance.adsdk.lottie.model.xt.vl r4) {
            r1 = this;
            r1.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.j = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.xt = r0
            r1.cw = r2
            r1.f1771r = r3
            java.lang.String r2 = r4.j()
            r1.up = r2
            boolean r2 = r4.up()
            r1.f1770m = r2
            com.bytedance.adsdk.lottie.model.j.xt r2 = r4.xt()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.ae = r2
            r3.j(r2)
            r2.j(r1)
            com.bytedance.adsdk.lottie.model.j.xt r2 = r4.cw()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.tl = r2
            r3.j(r2)
            r2.j(r1)
            com.bytedance.adsdk.lottie.model.j.vl r2 = r4.r()
            com.bytedance.adsdk.lottie.j.xt.av r2 = r2.oq()
            r1.g = r2
            r2.j(r3)
            r2.j(r1)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.cw
            r0.invalidateSelf()
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.Canvas r10, android.graphics.Matrix r11, int r12) {
            r9 = this;
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r9.ae
            java.lang.Object r0 = r0.ae()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r1 = r9.tl
            java.lang.Object r1 = r1.ae()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            com.bytedance.adsdk.lottie.j.xt.av r2 = r9.g
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.xt()
            java.lang.Object r2 = r2.ae()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.lottie.j.xt.av r4 = r9.g
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.cw()
            java.lang.Object r4 = r4.ae()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r4 = r4 / r3
            int r3 = (int) r0
            int r3 = r3 + (-1)
        L3f:
            if (r3 < 0) goto L67
            android.graphics.Matrix r5 = r9.j
            r5.set(r11)
            android.graphics.Matrix r5 = r9.j
            com.bytedance.adsdk.lottie.j.xt.av r6 = r9.g
            float r7 = (float) r3
            float r8 = r7 + r1
            android.graphics.Matrix r6 = r6.xt(r8)
            r5.preConcat(r6)
            float r5 = (float) r12
            float r7 = r7 / r0
            float r6 = com.bytedance.adsdk.lottie.up.tl.j(r2, r4, r7)
            float r5 = r5 * r6
            com.bytedance.adsdk.lottie.j.j.r r6 = r9.oq
            android.graphics.Matrix r7 = r9.j
            int r5 = (int) r5
            r6.j(r10, r7, r5)
            int r3 = r3 + (-1)
            goto L3f
        L67:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r2, android.graphics.Matrix r3, boolean r4) {
            r1 = this;
            com.bytedance.adsdk.lottie.j.j.r r0 = r1.oq
            r0.j(r2, r3, r4)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r2, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r3) {
            r1 = this;
            com.bytedance.adsdk.lottie.j.j.r r0 = r1.oq
            r0.j(r2, r3)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.oq
    public void j(java.util.ListIterator<com.bytedance.adsdk.lottie.j.j.cw> r9) {
            r8 = this;
            com.bytedance.adsdk.lottie.j.j.r r0 = r8.oq
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r9.previous()
            if (r0 != r8) goto L5
        L11:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L16:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L16
        L27:
            java.util.Collections.reverse(r6)
            com.bytedance.adsdk.lottie.j.j.r r1 = new com.bytedance.adsdk.lottie.j.j.r
            com.bytedance.adsdk.lottie.tl r2 = r8.cw
            com.bytedance.adsdk.lottie.model.layer.cw r3 = r8.f1771r
            boolean r5 = r8.f1770m
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.oq = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.jy
    public android.graphics.Path r() {
            r6 = this;
            com.bytedance.adsdk.lottie.j.j.r r0 = r6.oq
            android.graphics.Path r0 = r0.r()
            android.graphics.Path r1 = r6.xt
            r1.reset()
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r1 = r6.ae
            java.lang.Object r1 = r1.ae()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r2 = r6.tl
            java.lang.Object r2 = r2.ae()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            int r1 = (int) r1
            int r1 = r1 + (-1)
        L26:
            if (r1 < 0) goto L3f
            android.graphics.Matrix r3 = r6.j
            com.bytedance.adsdk.lottie.j.xt.av r4 = r6.g
            float r5 = (float) r1
            float r5 = r5 + r2
            android.graphics.Matrix r4 = r4.xt(r5)
            r3.set(r4)
            android.graphics.Path r3 = r6.xt
            android.graphics.Matrix r4 = r6.j
            r3.addPath(r0, r4)
            int r1 = r1 + (-1)
            goto L26
        L3f:
            android.graphics.Path r0 = r6.xt
            return r0
    }
}

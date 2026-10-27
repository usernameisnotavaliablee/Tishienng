package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class az implements com.bytedance.adsdk.lottie.j.j.jy, com.bytedance.adsdk.lottie.j.j.qv, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> ae;
    private final java.lang.String cw;
    private final com.bytedance.adsdk.lottie.j.j.xt g;
    private final android.graphics.Path j;

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> f1772m;
    private com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> oq;
    private boolean qv;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f1773r;
    private final com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> tl;
    private final com.bytedance.adsdk.lottie.tl up;
    private final android.graphics.RectF xt;

    public az(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.cw r3, com.bytedance.adsdk.lottie.model.xt.qv r4) {
            r1 = this;
            r1.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.j = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.xt = r0
            com.bytedance.adsdk.lottie.j.j.xt r0 = new com.bytedance.adsdk.lottie.j.j.xt
            r0.<init>()
            r1.g = r0
            r0 = 0
            r1.oq = r0
            java.lang.String r0 = r4.j()
            r1.cw = r0
            boolean r0 = r4.up()
            r1.f1773r = r0
            r1.up = r2
            com.bytedance.adsdk.lottie.model.j.jy r2 = r4.r()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.f1772m = r2
            com.bytedance.adsdk.lottie.model.j.jy r0 = r4.cw()
            com.bytedance.adsdk.lottie.j.xt.j r0 = r0.j()
            r1.ae = r0
            com.bytedance.adsdk.lottie.model.j.xt r4 = r4.xt()
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.j()
            r1.tl = r4
            r3.j(r2)
            r3.j(r0)
            r3.j(r4)
            r2.j(r1)
            r0.j(r1)
            r4.j(r1)
            return
    }

    private void xt() {
            r1 = this;
            r0 = 0
            r1.qv = r0
            com.bytedance.adsdk.lottie.tl r0 = r1.up
            r0.invalidateSelf()
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r0 = this;
            r0.xt()
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r5, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r6) {
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.bytedance.adsdk.lottie.j.j.cw r0 = (com.bytedance.adsdk.lottie.j.j.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.j.j.tj
            if (r1 == 0) goto L25
            r1 = r0
            com.bytedance.adsdk.lottie.j.j.tj r1 = (com.bytedance.adsdk.lottie.j.j.tj) r1
            com.bytedance.adsdk.lottie.model.xt.mi$j r2 = r1.getType()
            com.bytedance.adsdk.lottie.model.xt.mi$j r3 = com.bytedance.adsdk.lottie.model.xt.mi.j.j
            if (r2 != r3) goto L25
            com.bytedance.adsdk.lottie.j.j.xt r0 = r4.g
            r0.j(r1)
            r1.j(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.j.j.i
            if (r1 == 0) goto L31
            com.bytedance.adsdk.lottie.j.j.i r0 = (com.bytedance.adsdk.lottie.j.j.i) r0
            com.bytedance.adsdk.lottie.j.xt.j r0 = r0.xt()
            r4.oq = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.jy
    public android.graphics.Path r() {
            r17 = this;
            r0 = r17
            boolean r1 = r0.qv
            if (r1 == 0) goto L9
            android.graphics.Path r1 = r0.j
            return r1
        L9:
            android.graphics.Path r1 = r0.j
            r1.reset()
            boolean r1 = r0.f1773r
            r2 = 1
            if (r1 == 0) goto L18
            r0.qv = r2
            android.graphics.Path r1 = r0.j
            return r1
        L18:
            com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> r1 = r0.ae
            java.lang.Object r1 = r1.ae()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r3 = r1.x
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = r1.y
            float r1 = r1 / r4
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r5 = r0.tl
            r6 = 0
            if (r5 != 0) goto L2f
            r5 = 0
            goto L35
        L2f:
            com.bytedance.adsdk.lottie.j.xt.r r5 = (com.bytedance.adsdk.lottie.j.xt.r) r5
            float r5 = r5.g()
        L35:
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 != 0) goto L4f
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r7 = r0.oq
            if (r7 == 0) goto L4f
            java.lang.Object r5 = r7.ae()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r7 = java.lang.Math.min(r3, r1)
            float r5 = java.lang.Math.min(r5, r7)
        L4f:
            float r7 = java.lang.Math.min(r3, r1)
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 <= 0) goto L58
            r5 = r7
        L58:
            com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> r7 = r0.f1772m
            java.lang.Object r7 = r7.ae()
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            android.graphics.Path r8 = r0.j
            float r9 = r7.x
            float r9 = r9 + r3
            float r10 = r7.y
            float r10 = r10 - r1
            float r10 = r10 + r5
            r8.moveTo(r9, r10)
            android.graphics.Path r8 = r0.j
            float r9 = r7.x
            float r9 = r9 + r3
            float r10 = r7.y
            float r10 = r10 + r1
            float r10 = r10 - r5
            r8.lineTo(r9, r10)
            r8 = 0
            r9 = 1119092736(0x42b40000, float:90.0)
            int r10 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r10 <= 0) goto L9a
            android.graphics.RectF r11 = r0.xt
            float r12 = r7.x
            float r13 = r12 + r3
            float r14 = r5 * r4
            float r13 = r13 - r14
            float r15 = r7.y
            float r16 = r15 + r1
            float r14 = r16 - r14
            float r12 = r12 + r3
            float r15 = r15 + r1
            r11.set(r13, r14, r12, r15)
            android.graphics.Path r11 = r0.j
            android.graphics.RectF r12 = r0.xt
            r11.arcTo(r12, r6, r9, r8)
        L9a:
            android.graphics.Path r6 = r0.j
            float r11 = r7.x
            float r11 = r11 - r3
            float r11 = r11 + r5
            float r12 = r7.y
            float r12 = r12 + r1
            r6.lineTo(r11, r12)
            if (r10 <= 0) goto Lc2
            android.graphics.RectF r6 = r0.xt
            float r11 = r7.x
            float r12 = r11 - r3
            float r13 = r7.y
            float r14 = r13 + r1
            float r15 = r5 * r4
            float r14 = r14 - r15
            float r11 = r11 - r3
            float r11 = r11 + r15
            float r13 = r13 + r1
            r6.set(r12, r14, r11, r13)
            android.graphics.Path r6 = r0.j
            android.graphics.RectF r11 = r0.xt
            r6.arcTo(r11, r9, r9, r8)
        Lc2:
            android.graphics.Path r6 = r0.j
            float r11 = r7.x
            float r11 = r11 - r3
            float r12 = r7.y
            float r12 = r12 - r1
            float r12 = r12 + r5
            r6.lineTo(r11, r12)
            if (r10 <= 0) goto Lec
            android.graphics.RectF r6 = r0.xt
            float r11 = r7.x
            float r12 = r11 - r3
            float r13 = r7.y
            float r14 = r13 - r1
            float r11 = r11 - r3
            float r15 = r5 * r4
            float r11 = r11 + r15
            float r13 = r13 - r1
            float r13 = r13 + r15
            r6.set(r12, r14, r11, r13)
            android.graphics.Path r6 = r0.j
            android.graphics.RectF r11 = r0.xt
            r12 = 1127481344(0x43340000, float:180.0)
            r6.arcTo(r11, r12, r9, r8)
        Lec:
            android.graphics.Path r6 = r0.j
            float r11 = r7.x
            float r11 = r11 + r3
            float r11 = r11 - r5
            float r12 = r7.y
            float r12 = r12 - r1
            r6.lineTo(r11, r12)
            if (r10 <= 0) goto L116
            android.graphics.RectF r6 = r0.xt
            float r10 = r7.x
            float r11 = r10 + r3
            float r5 = r5 * r4
            float r11 = r11 - r5
            float r4 = r7.y
            float r7 = r4 - r1
            float r10 = r10 + r3
            float r4 = r4 - r1
            float r4 = r4 + r5
            r6.set(r11, r7, r10, r4)
            android.graphics.Path r1 = r0.j
            android.graphics.RectF r3 = r0.xt
            r4 = 1132920832(0x43870000, float:270.0)
            r1.arcTo(r3, r4, r9, r8)
        L116:
            android.graphics.Path r1 = r0.j
            r1.close()
            com.bytedance.adsdk.lottie.j.j.xt r1 = r0.g
            android.graphics.Path r3 = r0.j
            r1.j(r3)
            r0.qv = r2
            android.graphics.Path r1 = r0.j
            return r1
    }
}

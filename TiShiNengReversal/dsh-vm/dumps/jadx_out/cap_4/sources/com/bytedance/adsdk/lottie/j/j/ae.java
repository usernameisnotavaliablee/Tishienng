package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae implements com.bytedance.adsdk.lottie.j.j.qv, com.bytedance.adsdk.lottie.j.j.up, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final java.util.List<com.bytedance.adsdk.lottie.j.j.jy> ae;
    private final android.graphics.Paint cw;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> g;
    float j;
    private com.bytedance.adsdk.lottie.j.xt.cw jy;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1768m;
    private com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> oq;
    private final com.bytedance.adsdk.lottie.tl qv;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.layer.cw f1769r;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> tl;
    private final java.lang.String up;
    private com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> vl;
    private final android.graphics.Path xt;

    public ae(com.bytedance.adsdk.lottie.tl r4, com.bytedance.adsdk.lottie.model.layer.cw r5, com.bytedance.adsdk.lottie.model.xt.az r6) {
            r3 = this;
            r3.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.xt = r0
            com.bytedance.adsdk.lottie.j.j r1 = new com.bytedance.adsdk.lottie.j.j
            r2 = 1
            r1.<init>(r2)
            r3.cw = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.ae = r1
            r3.f1769r = r5
            java.lang.String r1 = r6.j()
            r3.up = r1
            boolean r1 = r6.up()
            r3.f1768m = r1
            r3.qv = r4
            com.bytedance.adsdk.lottie.model.xt.j r4 = r5.vl()
            if (r4 == 0) goto L45
            com.bytedance.adsdk.lottie.model.xt.j r4 = r5.vl()
            com.bytedance.adsdk.lottie.model.j.xt r4 = r4.j()
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.j()
            r3.vl = r4
            r4.j(r3)
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r4 = r3.vl
            r5.j(r4)
        L45:
            com.bytedance.adsdk.lottie.r.oq r4 = r5.jy()
            if (r4 == 0) goto L56
            com.bytedance.adsdk.lottie.j.xt.cw r4 = new com.bytedance.adsdk.lottie.j.xt.cw
            com.bytedance.adsdk.lottie.r.oq r1 = r5.jy()
            r4.<init>(r3, r5, r1)
            r3.jy = r4
        L56:
            com.bytedance.adsdk.lottie.model.j.j r4 = r6.xt()
            if (r4 == 0) goto L8b
            com.bytedance.adsdk.lottie.model.j.r r4 = r6.cw()
            if (r4 != 0) goto L63
            goto L8b
        L63:
            android.graphics.Path$FillType r4 = r6.r()
            r0.setFillType(r4)
            com.bytedance.adsdk.lottie.model.j.j r4 = r6.xt()
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.j()
            r3.tl = r4
            r4.j(r3)
            r5.j(r4)
            com.bytedance.adsdk.lottie.model.j.r r4 = r6.cw()
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.j()
            r3.g = r4
            r4.j(r3)
            r5.j(r4)
            return
        L8b:
            r4 = 0
            r3.tl = r4
            r3.g = r4
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.qv
            r0.invalidateSelf()
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.Canvas r6, android.graphics.Matrix r7, int r8) {
            r5 = this;
            boolean r0 = r5.f1768m
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "FillContent#draw"
            com.bytedance.adsdk.lottie.up.j(r0)
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r1 = r5.tl
            com.bytedance.adsdk.lottie.j.xt.xt r1 = (com.bytedance.adsdk.lottie.j.xt.xt) r1
            int r1 = r1.g()
            float r8 = (float) r8
            r2 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 / r2
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r3 = r5.g
            java.lang.Object r3 = r3.ae()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r8 = r8 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r3
            float r8 = r8 * r2
            int r8 = (int) r8
            android.graphics.Paint r2 = r5.cw
            r3 = 255(0xff, float:3.57E-43)
            r4 = 0
            int r8 = com.bytedance.adsdk.lottie.up.tl.j(r8, r4, r3)
            int r8 = r8 << 24
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r8 = r8 | r1
            r2.setColor(r8)
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> r8 = r5.oq
            if (r8 == 0) goto L4d
            android.graphics.Paint r1 = r5.cw
            java.lang.Object r8 = r8.ae()
            android.graphics.ColorFilter r8 = (android.graphics.ColorFilter) r8
            r1.setColorFilter(r8)
        L4d:
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r8 = r5.vl
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r8.ae()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L67
            android.graphics.Paint r1 = r5.cw
            r2 = 0
            r1.setMaskFilter(r2)
            goto L78
        L67:
            float r1 = r5.j
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L78
            com.bytedance.adsdk.lottie.model.layer.cw r1 = r5.f1769r
            android.graphics.BlurMaskFilter r1 = r1.xt(r8)
            android.graphics.Paint r2 = r5.cw
            r2.setMaskFilter(r1)
        L78:
            r5.j = r8
        L7a:
            com.bytedance.adsdk.lottie.j.xt.cw r8 = r5.jy
            if (r8 == 0) goto L83
            android.graphics.Paint r1 = r5.cw
            r8.j(r1)
        L83:
            android.graphics.Path r8 = r5.xt
            r8.reset()
        L88:
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r8 = r5.ae
            int r8 = r8.size()
            if (r4 >= r8) goto La4
            android.graphics.Path r8 = r5.xt
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r5.ae
            java.lang.Object r1 = r1.get(r4)
            com.bytedance.adsdk.lottie.j.j.jy r1 = (com.bytedance.adsdk.lottie.j.j.jy) r1
            android.graphics.Path r1 = r1.r()
            r8.addPath(r1, r7)
            int r4 = r4 + 1
            goto L88
        La4:
            android.graphics.Path r7 = r5.xt
            android.graphics.Paint r8 = r5.cw
            r6.drawPath(r7, r8)
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r4, android.graphics.Matrix r5, boolean r6) {
            r3 = this;
            android.graphics.Path r6 = r3.xt
            r6.reset()
            r6 = 0
            r0 = 0
        L7:
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r3.ae
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            android.graphics.Path r1 = r3.xt
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r2 = r3.ae
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.adsdk.lottie.j.j.jy r2 = (com.bytedance.adsdk.lottie.j.j.jy) r2
            android.graphics.Path r2 = r2.r()
            r1.addPath(r2, r5)
            int r0 = r0 + 1
            goto L7
        L23:
            android.graphics.Path r5 = r3.xt
            r5.computeBounds(r4, r6)
            float r5 = r4.left
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            float r0 = r4.top
            float r0 = r0 - r6
            float r1 = r4.right
            float r1 = r1 + r6
            float r2 = r4.bottom
            float r2 = r2 + r6
            r4.set(r5, r0, r1, r2)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r3, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r4) {
            r2 = this;
            r3 = 0
        L1:
            int r0 = r4.size()
            if (r3 >= r0) goto L1b
            java.lang.Object r0 = r4.get(r3)
            com.bytedance.adsdk.lottie.j.j.cw r0 = (com.bytedance.adsdk.lottie.j.j.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.j.j.jy
            if (r1 == 0) goto L18
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r2.ae
            com.bytedance.adsdk.lottie.j.j.jy r0 = (com.bytedance.adsdk.lottie.j.j.jy) r0
            r1.add(r0)
        L18:
            int r3 = r3 + 1
            goto L1
        L1b:
            return
    }
}

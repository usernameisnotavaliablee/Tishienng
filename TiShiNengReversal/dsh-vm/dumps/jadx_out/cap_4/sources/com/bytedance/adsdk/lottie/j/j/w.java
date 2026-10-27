package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w implements com.bytedance.adsdk.lottie.j.j.jy, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final com.bytedance.adsdk.lottie.j.j.xt ae;
    private final boolean cw;
    private final android.graphics.Path j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1792m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.tl f1793r;
    private final com.bytedance.adsdk.lottie.j.xt.jy up;
    private final java.lang.String xt;

    public w(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.cw r3, com.bytedance.adsdk.lottie.model.xt.i r4) {
            r1 = this;
            r1.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.j = r0
            com.bytedance.adsdk.lottie.j.j.xt r0 = new com.bytedance.adsdk.lottie.j.j.xt
            r0.<init>()
            r1.ae = r0
            java.lang.String r0 = r4.j()
            r1.xt = r0
            boolean r0 = r4.cw()
            r1.cw = r0
            r1.f1793r = r2
            com.bytedance.adsdk.lottie.model.j.tl r2 = r4.xt()
            com.bytedance.adsdk.lottie.j.xt.jy r2 = r2.r()
            r1.up = r2
            r3.j(r2)
            r2.j(r1)
            return
    }

    private void xt() {
            r1 = this;
            r0 = 0
            r1.f1792m = r0
            com.bytedance.adsdk.lottie.tl r0 = r1.f1793r
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
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r6, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r7) {
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            com.bytedance.adsdk.lottie.j.j.cw r1 = (com.bytedance.adsdk.lottie.j.j.cw) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.j.j.tj
            if (r2 == 0) goto L26
            r2 = r1
            com.bytedance.adsdk.lottie.j.j.tj r2 = (com.bytedance.adsdk.lottie.j.j.tj) r2
            com.bytedance.adsdk.lottie.model.xt.mi$j r3 = r2.getType()
            com.bytedance.adsdk.lottie.model.xt.mi$j r4 = com.bytedance.adsdk.lottie.model.xt.mi.j.j
            if (r3 != r4) goto L26
            com.bytedance.adsdk.lottie.j.j.xt r1 = r5.ae
            r1.j(r2)
            r2.j(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.j.j.mi
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            com.bytedance.adsdk.lottie.j.j.mi r1 = (com.bytedance.adsdk.lottie.j.j.mi) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            com.bytedance.adsdk.lottie.j.xt.jy r6 = r5.up
            r6.j(r7)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.jy
    public android.graphics.Path r() {
            r3 = this;
            boolean r0 = r3.f1792m
            if (r0 == 0) goto L7
            android.graphics.Path r0 = r3.j
            return r0
        L7:
            android.graphics.Path r0 = r3.j
            r0.reset()
            boolean r0 = r3.cw
            r1 = 1
            if (r0 == 0) goto L16
            r3.f1792m = r1
            android.graphics.Path r0 = r3.j
            return r0
        L16:
            com.bytedance.adsdk.lottie.j.xt.jy r0 = r3.up
            java.lang.Object r0 = r0.ae()
            android.graphics.Path r0 = (android.graphics.Path) r0
            if (r0 != 0) goto L23
            android.graphics.Path r0 = r3.j
            return r0
        L23:
            android.graphics.Path r2 = r3.j
            r2.set(r0)
            android.graphics.Path r0 = r3.j
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
            r0.setFillType(r2)
            com.bytedance.adsdk.lottie.j.j.xt r0 = r3.ae
            android.graphics.Path r2 = r3.j
            r0.j(r2)
            r3.f1792m = r1
            android.graphics.Path r0 = r3.j
            return r0
    }
}

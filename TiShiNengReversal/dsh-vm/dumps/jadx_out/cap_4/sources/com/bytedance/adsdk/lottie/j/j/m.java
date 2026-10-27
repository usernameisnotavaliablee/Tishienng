package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m implements com.bytedance.adsdk.lottie.j.j.jy, com.bytedance.adsdk.lottie.j.j.qv, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final com.bytedance.adsdk.lottie.j.j.xt ae;
    private final com.bytedance.adsdk.lottie.tl cw;
    private final android.graphics.Path j;

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.xt.xt f1781m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> f1782r;
    private boolean tl;
    private final com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> up;
    private final java.lang.String xt;

    public m(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.cw r3, com.bytedance.adsdk.lottie.model.xt.xt r4) {
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
            r1.cw = r2
            com.bytedance.adsdk.lottie.model.j.m r2 = r4.cw()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.f1782r = r2
            com.bytedance.adsdk.lottie.model.j.jy r0 = r4.xt()
            com.bytedance.adsdk.lottie.j.xt.j r0 = r0.j()
            r1.up = r0
            r1.f1781m = r4
            r3.j(r2)
            r3.j(r0)
            r2.j(r1)
            r0.j(r1)
            return
    }

    private void xt() {
            r1 = this;
            r0 = 0
            r1.tl = r0
            com.bytedance.adsdk.lottie.tl r0 = r1.cw
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
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r4, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r5) {
            r3 = this;
            r5 = 0
        L1:
            int r0 = r4.size()
            if (r5 >= r0) goto L26
            java.lang.Object r0 = r4.get(r5)
            com.bytedance.adsdk.lottie.j.j.cw r0 = (com.bytedance.adsdk.lottie.j.j.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.j.j.tj
            if (r1 == 0) goto L23
            com.bytedance.adsdk.lottie.j.j.tj r0 = (com.bytedance.adsdk.lottie.j.j.tj) r0
            com.bytedance.adsdk.lottie.model.xt.mi$j r1 = r0.getType()
            com.bytedance.adsdk.lottie.model.xt.mi$j r2 = com.bytedance.adsdk.lottie.model.xt.mi.j.j
            if (r1 != r2) goto L23
            com.bytedance.adsdk.lottie.j.j.xt r1 = r3.ae
            r1.j(r0)
            r0.j(r3)
        L23:
            int r5 = r5 + 1
            goto L1
        L26:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.jy
    public android.graphics.Path r() {
            r23 = this;
            r0 = r23
            boolean r1 = r0.tl
            if (r1 == 0) goto L9
            android.graphics.Path r1 = r0.j
            return r1
        L9:
            android.graphics.Path r1 = r0.j
            r1.reset()
            com.bytedance.adsdk.lottie.model.xt.xt r1 = r0.f1781m
            boolean r1 = r1.up()
            r2 = 1
            if (r1 == 0) goto L1c
            r0.tl = r2
            android.graphics.Path r1 = r0.j
            return r1
        L1c:
            com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> r1 = r0.f1782r
            java.lang.Object r1 = r1.ae()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r3 = r1.x
            r4 = 1073741824(0x40000000, float:2.0)
            float r6 = r3 / r4
            float r1 = r1.y
            float r9 = r1 / r4
            r1 = 1057841721(0x3f0d6239, float:0.55228)
            float r3 = r6 * r1
            float r1 = r1 * r9
            android.graphics.Path r4 = r0.j
            r4.reset()
            com.bytedance.adsdk.lottie.model.xt.xt r4 = r0.f1781m
            boolean r4 = r4.r()
            r14 = 0
            if (r4 == 0) goto L88
            android.graphics.Path r4 = r0.j
            float r5 = -r9
            r4.moveTo(r14, r5)
            android.graphics.Path r15 = r0.j
            float r16 = r14 - r3
            float r8 = -r6
            float r19 = r14 - r1
            r21 = 0
            r20 = r8
            r17 = r5
            r18 = r8
            r15.cubicTo(r16, r17, r18, r19, r20, r21)
            android.graphics.Path r7 = r0.j
            float r1 = r1 + r14
            r12 = 0
            r13 = r9
            r11 = r9
            r10 = r16
            r9 = r1
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            r9 = r11
            android.graphics.Path r5 = r0.j
            float r8 = r3 + r14
            r11 = 0
            r10 = r6
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r9
            r9 = r1
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            r22 = r8
            r8 = r6
            r6 = r22
            android.graphics.Path r5 = r0.j
            r10 = 0
            r11 = r17
            r9 = r17
            r7 = r19
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            goto Lc8
        L88:
            r4 = r9
            android.graphics.Path r5 = r0.j
            float r7 = -r4
            r5.moveTo(r14, r7)
            android.graphics.Path r5 = r0.j
            float r8 = r3 + r14
            float r9 = r14 - r1
            r11 = 0
            r10 = r6
            r22 = r8
            r8 = r6
            r6 = r22
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            r15 = r8
            r8 = r6
            r6 = r15
            r15 = r7
            r16 = r9
            android.graphics.Path r5 = r0.j
            float r7 = r1 + r14
            r10 = 0
            r11 = r4
            r9 = r4
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            android.graphics.Path r1 = r0.j
            float r8 = r14 - r3
            float r10 = -r6
            r13 = 0
            r12 = r10
            r11 = r7
            r7 = r1
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            android.graphics.Path r7 = r0.j
            r12 = 0
            r13 = r15
            r9 = r10
            r10 = r8
            r8 = r9
            r11 = r15
            r9 = r16
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
        Lc8:
            com.bytedance.adsdk.lottie.j.xt.j<?, android.graphics.PointF> r1 = r0.up
            java.lang.Object r1 = r1.ae()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.Path r3 = r0.j
            float r4 = r1.x
            float r1 = r1.y
            r3.offset(r4, r1)
            android.graphics.Path r1 = r0.j
            r1.close()
            com.bytedance.adsdk.lottie.j.j.xt r1 = r0.ae
            android.graphics.Path r3 = r0.j
            r1.j(r3)
            r0.tl = r2
            android.graphics.Path r1 = r0.j
            return r1
    }
}

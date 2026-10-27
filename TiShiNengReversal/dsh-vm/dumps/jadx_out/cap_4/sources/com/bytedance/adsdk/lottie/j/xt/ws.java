package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ws extends com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> {
    private final android.graphics.PointF ae;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> g;

    /* renamed from: m, reason: collision with root package name */
    private final android.graphics.PointF f1811m;

    /* renamed from: r, reason: collision with root package name */
    protected com.bytedance.adsdk.lottie.m.cw<java.lang.Float> f1812r;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> tl;
    protected com.bytedance.adsdk.lottie.m.cw<java.lang.Float> up;

    public ws(com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r2, com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r3) {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.<init>(r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.f1811m = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.ae = r0
            r1.tl = r2
            r1.g = r3
            float r2 = r1.tl()
            r1.j(r2)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    public /* synthetic */ android.graphics.PointF ae() {
            r1 = this;
            android.graphics.PointF r0 = r1.g()
            return r0
    }

    public android.graphics.PointF g() {
            r2 = this;
            r0 = 0
            r1 = 0
            android.graphics.PointF r0 = r2.xt(r0, r1)
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    /* synthetic */ android.graphics.PointF j(com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> r1, float r2) {
            r0 = this;
            android.graphics.PointF r1 = r0.xt(r1, r2)
            return r1
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    public void j(float r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r2.tl
            r0.j(r3)
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r2.g
            r0.j(r3)
            android.graphics.PointF r3 = r2.f1811m
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r2.tl
            java.lang.Object r0 = r0.ae()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r1 = r2.g
            java.lang.Object r1 = r1.ae()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r3.set(r0, r1)
            r3 = 0
        L28:
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r0 = r2.j
            int r0 = r0.size()
            if (r3 >= r0) goto L3e
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r0 = r2.j
            java.lang.Object r0 = r0.get(r3)
            com.bytedance.adsdk.lottie.j.xt.j$j r0 = (com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j) r0
            r0.j()
            int r3 = r3 + 1
            goto L28
        L3e:
            return
    }

    android.graphics.PointF xt(com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> r11, float r12) {
            r10 = this;
            com.bytedance.adsdk.lottie.m.cw<java.lang.Float> r11 = r10.f1812r
            r0 = 0
            if (r11 == 0) goto L30
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r11 = r10.tl
            com.bytedance.adsdk.lottie.m.j r11 = r11.cw()
            if (r11 == 0) goto L30
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r1 = r10.tl
            float r9 = r1.up()
            java.lang.Float r1 = r11.ae
            com.bytedance.adsdk.lottie.m.cw<java.lang.Float> r2 = r10.f1812r
            float r3 = r11.f1820m
            if (r1 != 0) goto L1d
            r4 = r3
            goto L22
        L1d:
            float r1 = r1.floatValue()
            r4 = r1
        L22:
            T r5 = r11.j
            T r6 = r11.xt
            r8 = r12
            r7 = r12
            java.lang.Object r11 = r2.j(r3, r4, r5, r6, r7, r8, r9)
            r6 = r7
            java.lang.Float r11 = (java.lang.Float) r11
            goto L32
        L30:
            r6 = r12
            r11 = r0
        L32:
            com.bytedance.adsdk.lottie.m.cw<java.lang.Float> r12 = r10.up
            if (r12 == 0) goto L5f
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r12 = r10.g
            com.bytedance.adsdk.lottie.m.j r12 = r12.cw()
            if (r12 == 0) goto L5f
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r10.g
            float r8 = r0.up()
            java.lang.Float r0 = r12.ae
            com.bytedance.adsdk.lottie.m.cw<java.lang.Float> r1 = r10.up
            float r2 = r12.f1820m
            if (r0 != 0) goto L4e
            r3 = r2
            goto L53
        L4e:
            float r0 = r0.floatValue()
            r3 = r0
        L53:
            T r4 = r12.j
            T r5 = r12.xt
            r7 = r6
            java.lang.Object r12 = r1.j(r2, r3, r4, r5, r6, r7, r8)
            r0 = r12
            java.lang.Float r0 = (java.lang.Float) r0
        L5f:
            r12 = 0
            if (r11 != 0) goto L6c
            android.graphics.PointF r11 = r10.ae
            android.graphics.PointF r1 = r10.f1811m
            float r1 = r1.x
            r11.set(r1, r12)
            goto L75
        L6c:
            android.graphics.PointF r1 = r10.ae
            float r11 = r11.floatValue()
            r1.set(r11, r12)
        L75:
            if (r0 != 0) goto L83
            android.graphics.PointF r11 = r10.ae
            float r12 = r11.x
            android.graphics.PointF r0 = r10.f1811m
            float r0 = r0.y
            r11.set(r12, r0)
            goto L8e
        L83:
            android.graphics.PointF r11 = r10.ae
            float r12 = r11.x
            float r0 = r0.floatValue()
            r11.set(r12, r0)
        L8e:
            android.graphics.PointF r11 = r10.ae
            return r11
    }
}

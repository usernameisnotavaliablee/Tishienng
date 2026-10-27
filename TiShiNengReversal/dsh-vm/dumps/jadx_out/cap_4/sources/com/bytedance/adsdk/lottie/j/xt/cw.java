package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private boolean ae;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> cw;
    private final com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j j;

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> f1798m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> f1799r;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> up;
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> xt;

    public cw(com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j r2, com.bytedance.adsdk.lottie.model.layer.cw r3, com.bytedance.adsdk.lottie.r.oq r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.ae = r0
            r1.j = r2
            com.bytedance.adsdk.lottie.model.j.j r2 = r4.j()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.xt = r2
            r2.j(r1)
            r3.j(r2)
            com.bytedance.adsdk.lottie.model.j.xt r2 = r4.xt()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.cw = r2
            r2.j(r1)
            r3.j(r2)
            com.bytedance.adsdk.lottie.model.j.xt r2 = r4.cw()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.f1799r = r2
            r2.j(r1)
            r3.j(r2)
            com.bytedance.adsdk.lottie.model.j.xt r2 = r4.r()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.up = r2
            r2.j(r1)
            r3.j(r2)
            com.bytedance.adsdk.lottie.model.j.xt r2 = r4.up()
            com.bytedance.adsdk.lottie.j.xt.j r2 = r2.j()
            r1.f1798m = r2
            r2.j(r1)
            r3.j(r2)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r1 = this;
            r0 = 1
            r1.ae = r0
            com.bytedance.adsdk.lottie.j.xt.j$j r0 = r1.j
            r0.j()
            return
    }

    public void j(android.graphics.Paint r7) {
            r6 = this;
            boolean r0 = r6.ae
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r6.ae = r0
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r6.f1799r
            java.lang.Object r0 = r0.ae()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            double r0 = (double) r0
            r2 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r0 = r0 * r2
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r2 = r6.up
            java.lang.Object r2 = r2.ae()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            double r3 = java.lang.Math.sin(r0)
            float r3 = (float) r3
            float r3 = r3 * r2
            r4 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 + r4
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r0 = r0 * r2
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r1 = r6.xt
            java.lang.Object r1 = r1.ae()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r2 = r6.cw
            java.lang.Object r2 = r2.ae()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            int r2 = java.lang.Math.round(r2)
            int r4 = android.graphics.Color.red(r1)
            int r5 = android.graphics.Color.green(r1)
            int r1 = android.graphics.Color.blue(r1)
            int r1 = android.graphics.Color.argb(r2, r4, r5, r1)
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r2 = r6.f1798m
            java.lang.Object r2 = r2.ae()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r7.setShadowLayer(r2, r3, r0, r1)
            return
    }
}

package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv extends com.bytedance.adsdk.lottie.j.xt.ae<android.graphics.PointF> {

    /* renamed from: r, reason: collision with root package name */
    private final android.graphics.PointF f1808r;

    public qv(java.util.List<com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r0.f1808r = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    public /* synthetic */ java.lang.Object j(com.bytedance.adsdk.lottie.m.j r1, float r2) {
            r0 = this;
            android.graphics.PointF r1 = r0.xt(r1, r2)
            return r1
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    protected /* synthetic */ java.lang.Object j(com.bytedance.adsdk.lottie.m.j r1, float r2, float r3, float r4) {
            r0 = this;
            android.graphics.PointF r1 = r0.xt(r1, r2, r3, r4)
            return r1
    }

    public android.graphics.PointF xt(com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> r1, float r2) {
            r0 = this;
            android.graphics.PointF r1 = r0.xt(r1, r2, r2, r2)
            return r1
    }

    protected android.graphics.PointF xt(com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> r11, float r12, float r13, float r14) {
            r10 = this;
            T r0 = r11.j
            if (r0 == 0) goto L44
            T r1 = r11.xt
            if (r1 == 0) goto L44
            r5 = r0
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            r6 = r1
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            com.bytedance.adsdk.lottie.m.cw<A> r2 = r10.cw
            if (r2 == 0) goto L2c
            float r3 = r11.f1820m
            java.lang.Float r11 = r11.ae
            float r4 = r11.floatValue()
            float r8 = r10.r()
            float r9 = r10.tl()
            r7 = r12
            java.lang.Object r11 = r2.j(r3, r4, r5, r6, r7, r8, r9)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            if (r11 == 0) goto L2c
            return r11
        L2c:
            android.graphics.PointF r11 = r10.f1808r
            float r12 = r5.x
            float r0 = r6.x
            float r0 = r0 - r12
            float r13 = r13 * r0
            float r12 = r12 + r13
            float r13 = r5.y
            float r0 = r6.y
            float r0 = r0 - r13
            float r14 = r14 * r0
            float r13 = r13 + r14
            r11.set(r12, r13)
            android.graphics.PointF r11 = r10.f1808r
            return r11
        L44:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Missing values for keyframe."
            r11.<init>(r12)
            throw r11
    }
}

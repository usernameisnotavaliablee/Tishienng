package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oq extends com.bytedance.adsdk.lottie.j.xt.ae<android.graphics.PointF> {
    private com.bytedance.adsdk.lottie.j.xt.g ae;

    /* renamed from: m, reason: collision with root package name */
    private final android.graphics.PathMeasure f1806m;

    /* renamed from: r, reason: collision with root package name */
    private final android.graphics.PointF f1807r;
    private final float[] up;

    public oq(java.util.List<? extends com.bytedance.adsdk.lottie.m.j<android.graphics.PointF>> r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r0.f1807r = r1
            r1 = 2
            float[] r1 = new float[r1]
            r0.up = r1
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r1.<init>()
            r0.f1806m = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    public /* synthetic */ java.lang.Object j(com.bytedance.adsdk.lottie.m.j r1, float r2) {
            r0 = this;
            android.graphics.PointF r1 = r0.xt(r1, r2)
            return r1
    }

    public android.graphics.PointF xt(com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> r11, float r12) {
            r10 = this;
            r0 = r11
            com.bytedance.adsdk.lottie.j.xt.g r0 = (com.bytedance.adsdk.lottie.j.xt.g) r0
            android.graphics.Path r1 = r0.xt()
            if (r1 != 0) goto Le
            T r11 = r11.j
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            return r11
        Le:
            com.bytedance.adsdk.lottie.m.cw<A> r2 = r10.cw
            if (r2 == 0) goto L30
            float r3 = r0.f1820m
            java.lang.Float r11 = r0.ae
            float r4 = r11.floatValue()
            T r5 = r0.j
            T r6 = r0.xt
            float r7 = r10.r()
            float r9 = r10.tl()
            r8 = r12
            java.lang.Object r11 = r2.j(r3, r4, r5, r6, r7, r8, r9)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            if (r11 == 0) goto L31
            return r11
        L30:
            r8 = r12
        L31:
            com.bytedance.adsdk.lottie.j.xt.g r11 = r10.ae
            r12 = 0
            if (r11 == r0) goto L3d
            android.graphics.PathMeasure r11 = r10.f1806m
            r11.setPath(r1, r12)
            r10.ae = r0
        L3d:
            android.graphics.PathMeasure r11 = r10.f1806m
            float r0 = r11.getLength()
            float r0 = r0 * r8
            float[] r1 = r10.up
            r2 = 0
            r11.getPosTan(r0, r1, r2)
            android.graphics.PointF r11 = r10.f1807r
            float[] r0 = r10.up
            r12 = r0[r12]
            r1 = 1
            r0 = r0[r1]
            r11.set(r12, r0)
            android.graphics.PointF r11 = r10.f1807r
            return r11
    }
}

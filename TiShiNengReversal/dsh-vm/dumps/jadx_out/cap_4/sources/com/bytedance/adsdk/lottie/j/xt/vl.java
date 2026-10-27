package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class vl extends com.bytedance.adsdk.lottie.j.xt.ae<com.bytedance.adsdk.lottie.m.r> {

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.m.r f1810r;

    public vl(java.util.List<com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.m.r>> r1) {
            r0 = this;
            r0.<init>(r1)
            com.bytedance.adsdk.lottie.m.r r1 = new com.bytedance.adsdk.lottie.m.r
            r1.<init>()
            r0.f1810r = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    public /* synthetic */ java.lang.Object j(com.bytedance.adsdk.lottie.m.j r1, float r2) {
            r0 = this;
            com.bytedance.adsdk.lottie.m.r r1 = r0.xt(r1, r2)
            return r1
    }

    public com.bytedance.adsdk.lottie.m.r xt(com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.m.r> r11, float r12) {
            r10 = this;
            T r0 = r11.j
            if (r0 == 0) goto L4d
            T r1 = r11.xt
            if (r1 == 0) goto L4d
            r5 = r0
            com.bytedance.adsdk.lottie.m.r r5 = (com.bytedance.adsdk.lottie.m.r) r5
            r6 = r1
            com.bytedance.adsdk.lottie.m.r r6 = (com.bytedance.adsdk.lottie.m.r) r6
            com.bytedance.adsdk.lottie.m.cw<A> r2 = r10.cw
            if (r2 == 0) goto L2c
            float r3 = r11.f1820m
            java.lang.Float r11 = r11.ae
            float r4 = r11.floatValue()
            float r8 = r10.r()
            float r9 = r10.tl()
            r7 = r12
            java.lang.Object r11 = r2.j(r3, r4, r5, r6, r7, r8, r9)
            com.bytedance.adsdk.lottie.m.r r11 = (com.bytedance.adsdk.lottie.m.r) r11
            if (r11 == 0) goto L2d
            return r11
        L2c:
            r7 = r12
        L2d:
            com.bytedance.adsdk.lottie.m.r r11 = r10.f1810r
            float r12 = r5.j()
            float r0 = r6.j()
            float r12 = com.bytedance.adsdk.lottie.up.tl.j(r12, r0, r7)
            float r0 = r5.xt()
            float r1 = r6.xt()
            float r0 = com.bytedance.adsdk.lottie.up.tl.j(r0, r1, r7)
            r11.j(r12, r0)
            com.bytedance.adsdk.lottie.m.r r11 = r10.f1810r
            return r11
        L4d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Missing values for keyframe."
            r11.<init>(r12)
            throw r11
    }
}

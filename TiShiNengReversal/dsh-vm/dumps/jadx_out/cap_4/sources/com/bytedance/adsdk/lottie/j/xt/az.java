package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class az extends com.bytedance.adsdk.lottie.j.xt.ae<com.bytedance.adsdk.lottie.model.xt> {
    public az(java.util.List<com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    /* synthetic */ java.lang.Object j(com.bytedance.adsdk.lottie.m.j r1, float r2) {
            r0 = this;
            com.bytedance.adsdk.lottie.model.xt r1 = r0.xt(r1, r2)
            return r1
    }

    com.bytedance.adsdk.lottie.model.xt xt(com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt> r9, float r10) {
            r8 = this;
            com.bytedance.adsdk.lottie.m.cw<A> r0 = r8.cw
            if (r0 == 0) goto L30
            float r1 = r9.f1820m
            java.lang.Float r2 = r9.ae
            if (r2 != 0) goto Le
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L12
        Le:
            float r2 = r2.floatValue()
        L12:
            T r3 = r9.j
            T r9 = r9.xt
            if (r9 != 0) goto L1d
            r9 = r3
            com.bytedance.adsdk.lottie.model.xt r9 = (com.bytedance.adsdk.lottie.model.xt) r9
        L1b:
            r4 = r9
            goto L20
        L1d:
            com.bytedance.adsdk.lottie.model.xt r9 = (com.bytedance.adsdk.lottie.model.xt) r9
            goto L1b
        L20:
            float r6 = r8.up()
            float r7 = r8.tl()
            r5 = r10
            java.lang.Object r9 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            com.bytedance.adsdk.lottie.model.xt r9 = (com.bytedance.adsdk.lottie.model.xt) r9
            return r9
        L30:
            r5 = r10
            r10 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L3f
            T r10 = r9.xt
            if (r10 != 0) goto L3c
            goto L3f
        L3c:
            com.bytedance.adsdk.lottie.model.xt r10 = (com.bytedance.adsdk.lottie.model.xt) r10
            return r10
        L3f:
            T r9 = r9.j
            com.bytedance.adsdk.lottie.model.xt r9 = (com.bytedance.adsdk.lottie.model.xt) r9
            return r9
    }
}

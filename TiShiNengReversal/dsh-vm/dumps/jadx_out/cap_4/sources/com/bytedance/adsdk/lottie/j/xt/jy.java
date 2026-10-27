package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class jy extends com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path> {

    /* renamed from: m, reason: collision with root package name */
    private java.util.List<com.bytedance.adsdk.lottie.j.j.mi> f1804m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.xt.ws f1805r;
    private final android.graphics.Path up;

    public jy(java.util.List<com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.ws>> r1) {
            r0 = this;
            r0.<init>(r1)
            com.bytedance.adsdk.lottie.model.xt.ws r1 = new com.bytedance.adsdk.lottie.model.xt.ws
            r1.<init>()
            r0.f1805r = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.up = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    public /* synthetic */ android.graphics.Path j(com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.ws> r1, float r2) {
            r0 = this;
            android.graphics.Path r1 = r0.xt(r1, r2)
            return r1
    }

    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.mi> r1) {
            r0 = this;
            r0.f1804m = r1
            return
    }

    public android.graphics.Path xt(com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.ws> r3, float r4) {
            r2 = this;
            T r0 = r3.j
            com.bytedance.adsdk.lottie.model.xt.ws r0 = (com.bytedance.adsdk.lottie.model.xt.ws) r0
            T r3 = r3.xt
            com.bytedance.adsdk.lottie.model.xt.ws r3 = (com.bytedance.adsdk.lottie.model.xt.ws) r3
            com.bytedance.adsdk.lottie.model.xt.ws r1 = r2.f1805r
            r1.j(r0, r3, r4)
            com.bytedance.adsdk.lottie.model.xt.ws r3 = r2.f1805r
            java.util.List<com.bytedance.adsdk.lottie.j.j.mi> r4 = r2.f1804m
            if (r4 == 0) goto L2a
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L19:
            if (r4 < 0) goto L2a
            java.util.List<com.bytedance.adsdk.lottie.j.j.mi> r0 = r2.f1804m
            java.lang.Object r0 = r0.get(r4)
            com.bytedance.adsdk.lottie.j.j.mi r0 = (com.bytedance.adsdk.lottie.j.j.mi) r0
            com.bytedance.adsdk.lottie.model.xt.ws r3 = r0.j(r3)
            int r4 = r4 + (-1)
            goto L19
        L2a:
            android.graphics.Path r4 = r2.up
            com.bytedance.adsdk.lottie.up.tl.j(r3, r4)
            android.graphics.Path r3 = r2.up
            return r3
    }
}

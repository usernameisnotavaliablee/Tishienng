package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl {
    private final java.util.List<com.bytedance.adsdk.lottie.model.xt.tl> cw;
    private final java.util.List<com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path>> j;
    private final java.util.List<com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer>> xt;

    public tl(java.util.List<com.bytedance.adsdk.lottie.model.xt.tl> r4) {
            r3 = this;
            r3.<init>()
            r3.cw = r4
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            r3.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            r3.xt = r0
            r0 = 0
        L1c:
            int r1 = r4.size()
            if (r0 >= r1) goto L4b
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path>> r1 = r3.j
            java.lang.Object r2 = r4.get(r0)
            com.bytedance.adsdk.lottie.model.xt.tl r2 = (com.bytedance.adsdk.lottie.model.xt.tl) r2
            com.bytedance.adsdk.lottie.model.j.tl r2 = r2.xt()
            com.bytedance.adsdk.lottie.j.xt.jy r2 = r2.r()
            r1.add(r2)
            java.lang.Object r1 = r4.get(r0)
            com.bytedance.adsdk.lottie.model.xt.tl r1 = (com.bytedance.adsdk.lottie.model.xt.tl) r1
            com.bytedance.adsdk.lottie.model.j.r r1 = r1.cw()
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer>> r2 = r3.xt
            com.bytedance.adsdk.lottie.j.xt.j r1 = r1.j()
            r2.add(r1)
            int r0 = r0 + 1
            goto L1c
        L4b:
            return
    }

    public java.util.List<com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer>> cw() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer>> r0 = r1.xt
            return r0
    }

    public java.util.List<com.bytedance.adsdk.lottie.model.xt.tl> j() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.xt.tl> r0 = r1.cw
            return r0
    }

    public java.util.List<com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path>> xt() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path>> r0 = r1.j
            return r0
    }
}

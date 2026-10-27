package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tj implements com.bytedance.adsdk.lottie.j.j.cw, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> ae;
    private final java.util.List<com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j> cw;
    private final java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> f1785m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.xt.mi.j f1786r;
    private final com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> up;
    private final boolean xt;

    public tj(com.bytedance.adsdk.lottie.model.layer.cw r3, com.bytedance.adsdk.lottie.model.xt.mi r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.cw = r0
            java.lang.String r0 = r4.j()
            r2.j = r0
            boolean r0 = r4.up()
            r2.xt = r0
            com.bytedance.adsdk.lottie.model.xt.mi$j r0 = r4.getType()
            r2.f1786r = r0
            com.bytedance.adsdk.lottie.model.j.xt r0 = r4.cw()
            com.bytedance.adsdk.lottie.j.xt.j r0 = r0.j()
            r2.up = r0
            com.bytedance.adsdk.lottie.model.j.xt r1 = r4.xt()
            com.bytedance.adsdk.lottie.j.xt.j r1 = r1.j()
            r2.f1785m = r1
            com.bytedance.adsdk.lottie.model.j.xt r4 = r4.r()
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.j()
            r2.ae = r4
            r3.j(r0)
            r3.j(r1)
            r3.j(r4)
            r0.j(r2)
            r1.j(r2)
            r4.j(r2)
            return
    }

    public com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> cw() {
            r1 = this;
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r0 = r1.f1785m
            return r0
    }

    com.bytedance.adsdk.lottie.model.xt.mi.j getType() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.xt.mi$j r0 = r1.f1786r
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r1 = r2.cw
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r1 = r2.cw
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.j.xt.j$j r1 = (com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j) r1
            r1.j()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    void j(com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j r2) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r0 = r1.cw
            r0.add(r2)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r2) {
            r0 = this;
            return
    }

    public com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r() {
            r1 = this;
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r0 = r1.ae
            return r0
    }

    public boolean up() {
            r1 = this;
            boolean r0 = r1.xt
            return r0
    }

    public com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> xt() {
            r1 = this;
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r0 = r1.up
            return r0
    }
}

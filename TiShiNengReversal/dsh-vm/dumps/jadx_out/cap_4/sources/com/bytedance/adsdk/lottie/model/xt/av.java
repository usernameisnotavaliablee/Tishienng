package com.bytedance.adsdk.lottie.model.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class av implements com.bytedance.adsdk.lottie.model.xt.cw {
    private final boolean cw;
    private final java.lang.String j;
    private final java.util.List<com.bytedance.adsdk.lottie.model.xt.cw> xt;

    public av(java.lang.String r1, java.util.List<com.bytedance.adsdk.lottie.model.xt.cw> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            return
    }

    public boolean cw() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.xt.cw
    public com.bytedance.adsdk.lottie.j.j.cw j(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.m r3, com.bytedance.adsdk.lottie.model.layer.cw r4) {
            r1 = this;
            com.bytedance.adsdk.lottie.j.j.r r0 = new com.bytedance.adsdk.lottie.j.j.r
            r0.<init>(r2, r4, r1, r3)
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShapeGroup{name='"
            r0.<init>(r1)
            java.lang.String r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = "' Shapes: "
            r0.append(r1)
            java.util.List<com.bytedance.adsdk.lottie.model.xt.cw> r1 = r2.xt
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.List<com.bytedance.adsdk.lottie.model.xt.cw> xt() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.xt.cw> r0 = r1.xt
            return r0
    }
}

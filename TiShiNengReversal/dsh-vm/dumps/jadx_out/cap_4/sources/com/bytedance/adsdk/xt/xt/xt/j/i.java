package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class i implements com.bytedance.adsdk.xt.xt.xt.j {
    protected com.bytedance.adsdk.xt.xt.r.cw cw;
    protected com.bytedance.adsdk.xt.xt.xt.j j;
    protected com.bytedance.adsdk.xt.xt.xt.j xt;

    protected i(com.bytedance.adsdk.xt.xt.r.cw r1) {
            r0 = this;
            r0.<init>()
            r0.cw = r1
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public com.bytedance.adsdk.xt.xt.r.up j() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.m r0 = com.bytedance.adsdk.xt.xt.r.m.j
            return r0
    }

    public void j(com.bytedance.adsdk.xt.xt.xt.j r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.xt()
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.String xt() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.adsdk.xt.xt.xt.j r1 = r2.j
            java.lang.String r1 = r1.xt()
            r0.append(r1)
            com.bytedance.adsdk.xt.xt.r.cw r1 = r2.cw
            java.lang.String r1 = r1.j()
            r0.append(r1)
            com.bytedance.adsdk.xt.xt.xt.j r1 = r2.xt
            java.lang.String r1 = r1.xt()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void xt(com.bytedance.adsdk.xt.xt.xt.j r1) {
            r0 = this;
            r0.xt = r1
            return
    }
}

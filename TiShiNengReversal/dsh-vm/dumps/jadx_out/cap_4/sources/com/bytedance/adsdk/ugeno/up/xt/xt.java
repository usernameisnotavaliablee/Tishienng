package com.bytedance.adsdk.ugeno.up.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.ugeno.up.xt.j {
    private java.util.List<com.bytedance.adsdk.ugeno.up.j.r> g;

    public xt(com.bytedance.adsdk.ugeno.xt.cw r1, java.lang.String r2, com.bytedance.adsdk.ugeno.up.m.j r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.g = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.xt.j
    public void j() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            if (r0 == 0) goto L26
            int r0 = r0.size()
            if (r0 > 0) goto Lb
            goto L26
        Lb:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            java.lang.String r1 = "name"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.adsdk.ugeno.xt.cw r1 = r2.cw
            com.bytedance.adsdk.ugeno.up.j.j r1 = r1.gx()
            if (r1 == 0) goto L26
            com.bytedance.adsdk.ugeno.up.j.cw r1 = r1.j(r0)
            if (r1 == 0) goto L26
            r1.j(r0)
        L26:
            return
    }
}

package com.bytedance.adsdk.ugeno.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.adsdk.ugeno.up.j.cw {
    private java.util.List<com.bytedance.adsdk.ugeno.up.j.r> j;

    public xt() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.j = r0
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.j.cw
    public void j(com.bytedance.adsdk.ugeno.up.j.r r2) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.up.j.r> r0 = r1.j
            r0.add(r2)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.j.cw
    public void j(java.lang.String r3) {
            r2 = this;
            java.util.List<com.bytedance.adsdk.ugeno.up.j.r> r0 = r2.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto L1f
        L9:
            java.util.List<com.bytedance.adsdk.ugeno.up.j.r> r0 = r2.j
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.up.j.r r1 = (com.bytedance.adsdk.ugeno.up.j.r) r1
            r1.j(r3)
            goto Lf
        L1f:
            return
    }
}

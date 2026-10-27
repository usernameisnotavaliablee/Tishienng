package com.bytedance.adsdk.ugeno.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private volatile java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> j;

    public j() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.j = r0
            return
    }

    public com.bytedance.adsdk.ugeno.up.j.cw j(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> r0 = r2.j
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L19
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> r0 = r2.j
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L19
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> r0 = r2.j
            java.lang.Object r3 = r0.get(r3)
            com.bytedance.adsdk.ugeno.up.j.cw r3 = (com.bytedance.adsdk.ugeno.up.j.cw) r3
            return r3
        L19:
            com.bytedance.adsdk.ugeno.up.j.xt r0 = new com.bytedance.adsdk.ugeno.up.j.xt
            r0.<init>()
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> r1 = r2.j
            r1.put(r3, r0)
            return r0
    }

    public void j(java.lang.String r2, com.bytedance.adsdk.ugeno.up.j.cw r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> r0 = r1.j
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> r0 = r1.j
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L11
            return
        L11:
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.up.j.cw> r0 = r1.j
            r0.put(r2, r3)
            return
    }
}

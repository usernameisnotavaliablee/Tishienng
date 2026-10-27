package com.bytedance.adsdk.ugeno.up.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.adsdk.ugeno.up.xt.j {


    public r(com.bytedance.adsdk.ugeno.xt.cw r1, java.lang.String r2, com.bytedance.adsdk.ugeno.up.m.j r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.xt.j
    public void j() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            if (r0 == 0) goto L3a
            int r0 = r0.size()
            if (r0 > 0) goto Lb
            goto L3a
        Lb:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            java.lang.String r1 = "name"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1c
            goto L3a
        L1c:
            com.bytedance.adsdk.ugeno.xt.cw r1 = r2.cw
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.xt(r1)
            if (r1 != 0) goto L25
            goto L3a
        L25:
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.m(r0)
            com.bytedance.adsdk.ugeno.j.j r0 = r1.oq(r0)
            if (r0 == 0) goto L3a
            r0.xt()
            com.bytedance.adsdk.ugeno.up.xt.r$1 r1 = new com.bytedance.adsdk.ugeno.up.xt.r$1
            r1.<init>(r2)
            r0.j(r1)
        L3a:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.xt.j
    public void xt() {
            r0 = this;
            return
    }
}

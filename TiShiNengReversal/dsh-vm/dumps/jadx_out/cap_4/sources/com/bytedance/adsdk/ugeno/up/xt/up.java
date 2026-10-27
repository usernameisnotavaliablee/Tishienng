package com.bytedance.adsdk.ugeno.up.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.adsdk.ugeno.up.xt.j {
    public up(com.bytedance.adsdk.ugeno.xt.cw r1, java.lang.String r2, com.bytedance.adsdk.ugeno.up.m.j r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void j(com.bytedance.adsdk.ugeno.xt.cw r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f1991m
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Ld
            java.lang.String r2 = "id"
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 != 0) goto Ld
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.f1991m
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r4.j(r1, r2)
            goto Ld
        L33:
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f1991m
            java.lang.String r1 = "width"
            boolean r0 = r0.containsKey(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f1991m
            java.lang.String r2 = "height"
            boolean r1 = r1.containsKey(r2)
            r4.j(r0, r1)
            r4.xt()
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.xt.j
    public void j() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            if (r0 == 0) goto L31
            int r0 = r0.size()
            if (r0 > 0) goto Lb
            goto L31
        Lb:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            java.lang.String r1 = "id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L21
            com.bytedance.adsdk.ugeno.xt.cw r0 = r2.cw
            r2.j(r0)
            return
        L21:
            com.bytedance.adsdk.ugeno.xt.cw r1 = r2.cw
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.xt(r1)
            if (r1 != 0) goto L2a
            goto L31
        L2a:
            com.bytedance.adsdk.ugeno.xt.cw r0 = r1.r(r0)
            r2.j(r0)
        L31:
            return
    }
}

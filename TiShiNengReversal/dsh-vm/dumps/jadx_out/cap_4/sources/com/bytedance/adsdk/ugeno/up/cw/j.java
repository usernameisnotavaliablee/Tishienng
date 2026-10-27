package com.bytedance.adsdk.ugeno.up.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.up.cw.xt implements com.bytedance.adsdk.ugeno.j.xt {
    private java.lang.String qv;

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt
    public void j() {
            r4 = this;
            java.lang.String r0 = r4.qv
            java.lang.String r1 = "start"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L12
            java.lang.String r0 = r4.qv
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L23
        L12:
            com.bytedance.adsdk.ugeno.up.qv r0 = r4.j
            if (r0 == 0) goto L23
            com.bytedance.adsdk.ugeno.xt.cw r1 = r4.xt
            java.lang.String r2 = r4.f1985m
            com.bytedance.adsdk.ugeno.up.m r3 = r4.cw
            java.util.List r3 = r3.xt()
            r0.j(r1, r2, r3)
        L23:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.cw.xt
    public boolean j(java.lang.Object... r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.up
            r0 = 0
            if (r4 == 0) goto L3f
            int r4 = r4.size()
            if (r4 > 0) goto Lc
            goto L3f
        Lc:
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.up
            java.lang.String r1 = "name"
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.up
            java.lang.String r2 = "state"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r3.qv = r1
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L29
            return r0
        L29:
            com.bytedance.adsdk.ugeno.xt.cw r1 = r3.xt
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.xt(r1)
            if (r1 != 0) goto L32
            return r0
        L32:
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.m(r4)
            com.bytedance.adsdk.ugeno.j.j r4 = r1.oq(r4)
            if (r4 == 0) goto L3f
            r4.j(r3)
        L3f:
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt
    public void xt() {
            r4 = this;
            java.lang.String r0 = r4.qv
            java.lang.String r1 = "complete"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L12
            java.lang.String r0 = r4.qv
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L23
        L12:
            com.bytedance.adsdk.ugeno.up.qv r0 = r4.j
            if (r0 == 0) goto L23
            com.bytedance.adsdk.ugeno.xt.cw r1 = r4.xt
            java.lang.String r2 = r4.f1985m
            com.bytedance.adsdk.ugeno.up.m r3 = r4.cw
            java.util.List r3 = r3.xt()
            r0.j(r1, r2, r3)
        L23:
            return
    }
}

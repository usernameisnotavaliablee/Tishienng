package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl extends com.bytedance.adsdk.xt.xt.xt.j.i {
    public tl() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.cw r0 = com.bytedance.adsdk.xt.xt.r.cw.tl
            r1.<init>(r0)
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.Object j(java.util.Map<java.lang.String, org.json.JSONObject> r4) {
            r3 = this;
            com.bytedance.adsdk.xt.xt.xt.j r0 = r3.j
            java.lang.Object r0 = r0.j(r4)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.bytedance.adsdk.xt.xt.xt.j r2 = r3.xt
            java.lang.Object r4 = r2.j(r4)
            if (r4 != 0) goto L13
            return r1
        L13:
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r4 = com.bytedance.adsdk.xt.xt.up.j.cw.j(r0, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }
}

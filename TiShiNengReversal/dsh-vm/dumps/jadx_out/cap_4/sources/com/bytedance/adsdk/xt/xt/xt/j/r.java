package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.adsdk.xt.xt.xt.j.i {
    public r() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.cw r0 = com.bytedance.adsdk.xt.xt.r.cw.up
            r1.<init>(r0)
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.Object j(java.util.Map<java.lang.String, org.json.JSONObject> r3) {
            r2 = this;
            com.bytedance.adsdk.xt.xt.xt.j r0 = r2.j
            java.lang.Object r0 = r0.j(r3)
            com.bytedance.adsdk.xt.xt.xt.j r1 = r2.xt
            java.lang.Object r3 = r1.j(r3)
            if (r0 != 0) goto L13
            if (r3 != 0) goto L13
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L13:
            if (r0 != 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L1a:
            if (r0 == 0) goto L21
            if (r3 != 0) goto L21
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L21:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L36
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L36
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Number r3 = (java.lang.Number) r3
            boolean r3 = com.bytedance.adsdk.xt.xt.up.j.xt.j(r0, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L36:
            boolean r3 = r0.equals(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
    }
}

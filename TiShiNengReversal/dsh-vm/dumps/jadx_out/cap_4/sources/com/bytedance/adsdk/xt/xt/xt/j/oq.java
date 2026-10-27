package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oq implements com.bytedance.adsdk.xt.xt.xt.j {
    private com.bytedance.adsdk.xt.xt.j.j cw;
    private com.bytedance.adsdk.xt.xt.xt.j[] j;
    private java.lang.String xt;

    public oq(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.xt = r1
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public com.bytedance.adsdk.xt.xt.r.up j() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.xt r0 = com.bytedance.adsdk.xt.xt.r.xt.j
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.Object j(java.util.Map<java.lang.String, org.json.JSONObject> r5) {
            r4 = this;
            com.bytedance.adsdk.xt.xt.j.j r0 = new com.bytedance.adsdk.xt.xt.j.j
            r0.<init>()
            r4.cw = r0
            java.lang.String r1 = r4.xt
            r0.j(r1)
            com.bytedance.adsdk.xt.xt.xt.j[] r0 = r4.j
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L12:
            com.bytedance.adsdk.xt.xt.xt.j[] r2 = r4.j
            int r3 = r2.length
            if (r1 >= r3) goto L24
            r2 = r2[r1]
            if (r2 == 0) goto L21
            java.lang.Object r2 = r2.j(r5)
            r0[r1] = r2
        L21:
            int r1 = r1 + 1
            goto L12
        L24:
            com.bytedance.adsdk.xt.xt.j.j r1 = r4.cw
            r1.j(r0)
            java.lang.String r1 = r4.xt
            com.bytedance.adsdk.xt.tl r1 = com.bytedance.adsdk.xt.qv.j(r1)
            java.lang.String r2 = "default_key"
            java.lang.Object r5 = r5.get(r2)
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.Object r5 = r1.j(r5, r0)
            return r5
    }

    public void j(com.bytedance.adsdk.xt.xt.xt.j[] r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.String xt() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.xt
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            com.bytedance.adsdk.xt.xt.xt.j[] r1 = r4.j
            if (r1 == 0) goto L2d
            int r1 = r1.length
            if (r1 <= 0) goto L2d
            r1 = 0
        L17:
            com.bytedance.adsdk.xt.xt.xt.j[] r2 = r4.j
            int r3 = r2.length
            if (r1 >= r3) goto L2d
            r2 = r2[r1]
            java.lang.String r2 = r2.xt()
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            int r1 = r1 + 1
            goto L17
        L2d:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

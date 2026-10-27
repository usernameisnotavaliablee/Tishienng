package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class az implements com.bytedance.adsdk.xt.xt.xt.j {
    private java.lang.Number j;

    public az(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 46
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto L22
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.j = r0
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 == 0) goto L21
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.j = r2
        L21:
            return
        L22:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L29
            r1.j = r0     // Catch: java.lang.NumberFormatException -> L29
            return
        L29:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.j = r2
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public com.bytedance.adsdk.xt.xt.r.up j() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.m r0 = com.bytedance.adsdk.xt.xt.r.m.ae
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.Object j(java.util.Map<java.lang.String, org.json.JSONObject> r1) {
            r0 = this;
            java.lang.Number r1 = r0.j
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.xt()
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.String xt() {
            r1 = this;
            java.lang.Number r0 = r1.j
            java.lang.String r0 = r0.toString()
            return r0
    }
}

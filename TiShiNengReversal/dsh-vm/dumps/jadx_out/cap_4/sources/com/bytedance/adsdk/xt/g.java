package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g implements com.bytedance.adsdk.xt.tl {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.tl
    public java.lang.Object j(org.json.JSONObject r2, java.lang.Object[] r3) {
            r1 = this;
            if (r3 == 0) goto L2c
            int r2 = r3.length
            r0 = 2
            if (r2 < r0) goto L2c
            r2 = 0
            r2 = r3[r2]
            r0 = 1
            r3 = r3[r0]
            boolean r0 = r2 instanceof org.json.JSONArray
            if (r0 == 0) goto L2c
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L2c
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r0 = r2.length()
            if (r0 <= 0) goto L2c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r0 = r2.length()
            int r3 = r3 % r0
            java.lang.Object r2 = r2.opt(r3)
            return r2
        L2c:
            r2 = 0
            return r2
    }
}

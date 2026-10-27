package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae implements com.bytedance.adsdk.xt.xt.xt.j {
    private final java.lang.Object j;

    public ae(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "true"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L10
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.j = r2
            return
        L10:
            java.lang.String r0 = "false"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.j = r2
            return
        L1d:
            java.lang.String r0 = "null"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L29
            r2 = 0
            r1.j = r2
            return
        L29:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public com.bytedance.adsdk.xt.xt.r.up j() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.m r0 = com.bytedance.adsdk.xt.xt.r.m.qv
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.Object j(java.util.Map<java.lang.String, org.json.JSONObject> r1) {
            r0 = this;
            java.lang.Object r1 = r0.j
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "KeywordNode [keywordValue="
            r0.<init>(r1)
            java.lang.Object r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.String xt() {
            r1 = this;
            java.lang.Object r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            java.lang.String r0 = "NULL"
            return r0
    }
}

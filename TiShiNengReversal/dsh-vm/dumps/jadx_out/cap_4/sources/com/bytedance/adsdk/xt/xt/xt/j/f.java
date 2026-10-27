package com.bytedance.adsdk.xt.xt.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f implements com.bytedance.adsdk.xt.xt.xt.j {
    private final java.lang.String j;

    public f(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    private java.lang.Object j(java.lang.String[] r6, int r7, org.json.JSONObject r8) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L75
            int r1 = r6.length
            if (r1 <= 0) goto L75
            int r1 = r6.length
            if (r7 >= r1) goto L75
            if (r8 != 0) goto Lc
            goto L75
        Lc:
            r1 = r6[r7]
            java.lang.String r2 = "["
            int r2 = r1.indexOf(r2)
            java.lang.String r3 = "]"
            int r3 = r1.indexOf(r3)
            if (r2 < 0) goto L46
            if (r3 < 0) goto L46
            if (r2 <= r3) goto L21
            goto L46
        L21:
            r4 = 0
            java.lang.String r4 = r1.substring(r4, r2)
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.NumberFormatException -> L41
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L41
            java.lang.Object r8 = r8.opt(r4)
            boolean r2 = r8 instanceof org.json.JSONArray
            if (r2 == 0) goto L3f
            org.json.JSONArray r8 = (org.json.JSONArray) r8
            java.lang.Object r8 = r8.opt(r1)
            goto L4a
        L3f:
            r8 = r0
            goto L4a
        L41:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
            return r0
        L46:
            java.lang.Object r8 = r8.opt(r1)
        L4a:
            int r1 = r6.length
            int r1 = r1 + (-1)
            if (r7 != r1) goto L50
            return r8
        L50:
            boolean r1 = r8 instanceof java.lang.String
            if (r1 == 0) goto L68
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L63
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L63
            r0.<init>(r1)     // Catch: org.json.JSONException -> L63
            int r7 = r7 + 1
            java.lang.Object r6 = r5.j(r6, r7, r0)     // Catch: org.json.JSONException -> L63
            return r6
        L63:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
            return r8
        L68:
            boolean r1 = r8 instanceof org.json.JSONObject
            if (r1 == 0) goto L75
            int r7 = r7 + 1
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Object r6 = r5.j(r6, r7, r8)
            return r6
        L75:
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public com.bytedance.adsdk.xt.xt.r.up j() {
            r1 = this;
            com.bytedance.adsdk.xt.xt.r.m r0 = com.bytedance.adsdk.xt.xt.r.m.cw
            return r0
    }

    public java.lang.Object j(java.lang.String r2, org.json.JSONObject r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = "\\."
            java.lang.String[] r2 = r2.split(r0)
            r0 = 0
            java.lang.Object r2 = r1.j(r2, r0, r3)
            return r2
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.Object j(java.util.Map<java.lang.String, org.json.JSONObject> r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1e
            int r1 = r4.size()
            if (r1 > 0) goto La
            goto L1e
        La:
            java.lang.String r1 = r3.j
            java.lang.String r2 = "default_key"
            java.lang.Object r4 = r4.get(r2)
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.Object r4 = r3.j(r1, r4)
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r4 != r1) goto L1d
            return r0
        L1d:
            return r4
        L1e:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VariableNode [literals="
            r0.<init>(r1)
            java.lang.String r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.adsdk.xt.xt.xt.j
    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }
}

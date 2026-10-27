package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j implements com.bytedance.adsdk.xt.tl {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.tl
    public java.lang.Object j(org.json.JSONObject r9, java.lang.Object[] r10) {
            r8 = this;
            if (r10 == 0) goto L54
            int r9 = r10.length
            r0 = 2
            if (r9 == r0) goto L7
            goto L54
        L7:
            r9 = 0
            r0 = r10[r9]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L53
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L53
            r0 = 1
            r10 = r10[r0]     // Catch: java.lang.Throwable -> L53
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L53
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Throwable -> L53
            r0 = 0
        L24:
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L53
            if (r0 >= r3) goto L53
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L53
            r3.<init>()     // Catch: java.lang.Throwable -> L53
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L53
            r5 = 0
        L35:
            if (r5 >= r10) goto L49
            int r6 = r0 + r5
            int r7 = r2.length()     // Catch: java.lang.Throwable -> L53
            if (r6 >= r7) goto L49
            org.json.JSONObject r6 = r2.optJSONObject(r6)     // Catch: java.lang.Throwable -> L53
            r4.put(r6)     // Catch: java.lang.Throwable -> L53
            int r5 = r5 + 1
            goto L35
        L49:
            java.lang.String r5 = "$chunk"
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L53
            r1.put(r3)     // Catch: java.lang.Throwable -> L53
            int r0 = r0 + r10
            goto L24
        L53:
            return r1
        L54:
            r9 = 0
            return r9
    }
}

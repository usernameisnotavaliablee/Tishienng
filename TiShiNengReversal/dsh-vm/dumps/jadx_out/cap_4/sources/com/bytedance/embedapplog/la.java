package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class la extends com.bytedance.embedapplog.l {
    private final android.content.Context up;

    la(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            r1.up = r2
            return
    }

    public static java.lang.String j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L13
            r1 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L13
            return r2
        L13:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r2
    }

    public static java.lang.String xt(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L19
            java.lang.String r1 = "UTF-8"
            byte[] r1 = r3.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L19
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L19
            r0.<init>(r1)     // Catch: java.io.UnsupportedEncodingException -> L19
            return r0
        L19:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r3
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r7) {
            r6 = this;
            android.content.Context r0 = r6.up
            java.lang.String r1 = "snssdk_openudid"
            r2 = 0
            android.content.SharedPreferences r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r0, r1, r2)
            java.lang.String r1 = "custom_a"
            r2 = 0
            java.lang.String r3 = r0.getString(r1, r2)
            java.lang.String r3 = xt(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "clientudid"
            if (r4 == 0) goto L20
            java.lang.String r3 = r0.getString(r5, r2)
        L20:
            boolean r2 = com.bytedance.embedapplog.wq.j(r3)
            if (r2 != 0) goto L43
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = "clientudid.dat"
            java.lang.String r2 = r6.j(r2, r3)     // Catch: java.lang.Exception -> L35
            r3 = r2
        L35:
            java.lang.String r2 = j(r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r1, r2)
            r0.apply()
        L43:
            r7.put(r5, r3)
            r7 = 1
            return r7
    }
}

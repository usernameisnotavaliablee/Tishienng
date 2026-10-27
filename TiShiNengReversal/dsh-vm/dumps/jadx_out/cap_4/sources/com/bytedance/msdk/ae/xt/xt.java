package com.bytedance.msdk.ae.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private static volatile com.bytedance.msdk.ae.xt.xt j;

    private xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.msdk.ae.xt.xt j() {
            com.bytedance.msdk.ae.xt.xt r0 = com.bytedance.msdk.ae.xt.xt.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.ae.xt.xt> r0 = com.bytedance.msdk.ae.xt.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.ae.xt.xt r1 = com.bytedance.msdk.ae.xt.xt.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.ae.xt.xt r1 = new com.bytedance.msdk.ae.xt.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.ae.xt.xt.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.ae.xt.xt r0 = com.bytedance.msdk.ae.xt.xt.j
            return r0
    }

    public void j(org.json.JSONArray r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tt_sdk_test_tool_data_"
            r1.<init>(r2)
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()
            java.lang.String r2 = r2.vl()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.content.SharedPreferences r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r0, r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "rit_conf"
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences$Editor r4 = r0.putString(r1, r4)
            r4.apply()
            return
    }

    public void j(org.json.JSONObject r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tt_sdk_test_tool_data_"
            r1.<init>(r2)
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()
            java.lang.String r2 = r2.vl()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.content.SharedPreferences r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r0, r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "adn_init_conf"
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences$Editor r4 = r0.putString(r1, r4)
            r4.apply()
            return
    }
}

package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class gr {
    private final android.content.SharedPreferences j;

    @androidx.annotation.WorkerThread
    gr(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "device_register_oaid_refine"
            r1 = 0
            android.content.SharedPreferences r3 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r3, r0, r1)
            r2.j = r3
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    com.bytedance.embedapplog.na j() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.j
            java.lang.String r1 = "oaid"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            com.bytedance.embedapplog.na r0 = com.bytedance.embedapplog.na.j(r0)
            return r0
    }

    @androidx.annotation.WorkerThread
    void j(@androidx.annotation.Nullable com.bytedance.embedapplog.na r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            android.content.SharedPreferences r0 = r2.j
            android.content.SharedPreferences$Editor r0 = r0.edit()
            org.json.JSONObject r3 = r3.xt()
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "oaid"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            r3.apply()
            return
    }
}

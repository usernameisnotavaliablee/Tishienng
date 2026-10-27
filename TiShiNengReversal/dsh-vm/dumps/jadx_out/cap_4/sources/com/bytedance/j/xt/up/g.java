package com.bytedance.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {
    private android.content.SharedPreferences a;

    public g(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "npth"
            r1 = 0
            android.content.SharedPreferences r3 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r3, r0, r1)
            r2.a = r3
            return
    }

    public java.lang.String a() {
            r3 = this;
            com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()
            java.lang.String r0 = r0.e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "0"
            if (r1 != 0) goto L18
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "device_id"
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public void b(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "device_id"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            r3.apply()
            return
    }
}

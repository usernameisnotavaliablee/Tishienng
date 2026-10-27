package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class z extends com.bytedance.embedapplog.l {
    private final com.bytedance.embedapplog.rn up;

    z(com.bytedance.embedapplog.rn r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1, r1)
            r2.up = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r11) {
            r10 = this;
            com.bytedance.embedapplog.rn r0 = r10.up
            android.content.SharedPreferences r0 = r0.r()
            java.lang.String r1 = "install_id"
            r2 = 0
            java.lang.String r3 = r0.getString(r1, r2)
            java.lang.String r4 = "device_id"
            java.lang.String r5 = r0.getString(r4, r2)
            java.lang.String r6 = "ssid"
            java.lang.String r2 = r0.getString(r6, r2)
            com.bytedance.embedapplog.wq.j(r11, r1, r3)
            com.bytedance.embedapplog.wq.j(r11, r4, r5)
            com.bytedance.embedapplog.wq.j(r11, r6, r2)
            java.lang.String r1 = "register_time"
            r6 = 0
            long r8 = r0.getLong(r1, r6)
            boolean r2 = com.bytedance.embedapplog.wq.xt(r3)
            if (r2 == 0) goto L36
            boolean r2 = com.bytedance.embedapplog.wq.xt(r5)
            if (r2 != 0) goto L46
        L36:
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L46
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r6)
            r0.apply()
            goto L47
        L46:
            r6 = r8
        L47:
            r11.put(r1, r6)
            r11 = 1
            return r11
    }
}

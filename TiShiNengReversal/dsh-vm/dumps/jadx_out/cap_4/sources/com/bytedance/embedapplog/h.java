package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class h extends com.bytedance.embedapplog.l {
    private final com.bytedance.embedapplog.rn up;

    h(android.content.Context r2, com.bytedance.embedapplog.rn r3) {
            r1 = this;
            r2 = 1
            r0 = 0
            r1.<init>(r2, r0)
            r1.up = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r3) {
            r2 = this;
            com.bytedance.embedapplog.rn r0 = r2.up
            android.content.SharedPreferences r0 = r0.r()
            java.lang.String r0 = com.bytedance.embedapplog.wo.j(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L17
            java.lang.String r1 = "cdid"
            r3.put(r1, r0)
            r3 = 1
            return r3
        L17:
            r3 = 0
            return r3
    }
}

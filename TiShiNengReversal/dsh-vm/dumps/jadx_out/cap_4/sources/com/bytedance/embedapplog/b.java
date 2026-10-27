package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class b extends com.bytedance.embedapplog.l {
    private final android.content.Context up;

    b(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r3) {
            r2 = this;
            android.content.Context r0 = r2.up
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimCountryIso()
            java.lang.String r1 = "sim_region"
            com.bytedance.embedapplog.wq.j(r3, r1, r0)
            r3 = 1
            return r3
    }
}

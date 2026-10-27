package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class e extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2076m;
    private final android.content.Context up;

    e(android.content.Context r3, com.bytedance.embedapplog.rn r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            r2.f2076m = r4
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r5) {
            r4 = this;
            android.content.Context r0 = r4.up
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r1 = 0
            if (r0 == 0) goto L3e
            java.lang.String r2 = r0.getNetworkOperatorName()     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = "carrier"
            com.bytedance.embedapplog.wq.j(r5, r3, r2)     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = r0.getNetworkOperator()     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = "mcc_mnc"
            com.bytedance.embedapplog.wq.j(r5, r3, r2)     // Catch: java.lang.Exception -> L2c
            com.bytedance.embedapplog.rn r2 = r4.f2076m     // Catch: java.lang.Exception -> L2c
            boolean r2 = r2.nd()     // Catch: java.lang.Exception -> L2c
            if (r2 == 0) goto L2e
            java.lang.String r0 = com.bytedance.embedapplog.xp.j(r0)     // Catch: java.lang.Exception -> L2c
            goto L34
        L2c:
            r5 = move-exception
            goto L3b
        L2e:
            com.bytedance.embedapplog.rn r0 = r4.f2076m     // Catch: java.lang.Exception -> L2c
            java.lang.String r0 = r0.gx()     // Catch: java.lang.Exception -> L2c
        L34:
            java.lang.String r2 = "udid"
            com.bytedance.embedapplog.wq.j(r5, r2, r0)     // Catch: java.lang.Exception -> L2c
            r5 = 1
            return r5
        L3b:
            com.bytedance.embedapplog.uc.xt(r5)
        L3e:
            return r1
    }
}

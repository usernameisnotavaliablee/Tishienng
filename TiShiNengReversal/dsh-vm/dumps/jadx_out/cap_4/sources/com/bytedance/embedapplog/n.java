package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class n extends com.bytedance.embedapplog.l {
    private final android.content.Context up;

    n(android.content.Context r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r0)
            r1.up = r2
            return
    }

    @Override // com.bytedance.embedapplog.l
    @android.annotation.SuppressLint({"MissingPermission"})
    protected boolean j(org.json.JSONObject r3) {
            r2 = this;
            android.content.Context r0 = r2.up
            java.lang.String r0 = com.bytedance.embedapplog.ln.j(r0)
            java.lang.String r1 = "access"
            com.bytedance.embedapplog.wq.j(r3, r1, r0)
            r3 = 1
            return r3
    }
}

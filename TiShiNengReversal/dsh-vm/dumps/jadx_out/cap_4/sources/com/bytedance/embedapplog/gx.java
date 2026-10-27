package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class gx extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2081m;
    private final android.content.Context up;

    gx(android.content.Context r3, com.bytedance.embedapplog.rn r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            r2.f2081m = r4
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r3) {
            r2 = this;
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto L13
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            com.bytedance.embedapplog.ae r0 = r0.h()
            java.lang.String r0 = r0.j()
            goto L15
        L13:
            java.lang.String r0 = ""
        L15:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L20
            java.lang.String r1 = "mc"
            r3.put(r1, r0)
        L20:
            r3 = 1
            return r3
    }
}

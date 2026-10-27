package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class nd extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2089m;
    private final android.content.Context up;

    nd(android.content.Context r3, com.bytedance.embedapplog.rn r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            r2.f2089m = r4
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r4) {
            r3 = this;
            com.bytedance.embedapplog.rn r0 = r3.f2089m
            android.content.SharedPreferences r0 = r0.r()
            android.content.Context r1 = r3.up
            java.util.Map r0 = com.bytedance.embedapplog.wo.j(r1, r0)
            r1 = 1
            if (r0 == 0) goto L1a
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            java.lang.String r0 = "oaid"
            r4.put(r0, r2)
            return r1
        L1a:
            boolean r4 = com.bytedance.embedapplog.j.xt
            if (r4 != 0) goto L1f
            return r1
        L1f:
            r4 = 0
            return r4
    }
}

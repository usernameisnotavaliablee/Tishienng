package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class s extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2099m;
    private final android.content.Context up;

    s(android.content.Context r3, com.bytedance.embedapplog.rn r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            r2.f2099m = r4
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r3) {
            r2 = this;
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.wq()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.wq()
            java.lang.String r1 = "ab_client"
            r3.put(r1, r0)
        L17:
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.mi()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4a
            boolean r0 = com.bytedance.embedapplog.uc.xt
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "init config has abversion:"
            r0.<init>(r1)
            com.bytedance.embedapplog.rn r1 = r2.f2099m
            java.lang.String r1 = r1.mi()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.embedapplog.uc.j(r0, r1)
        L3f:
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.mi()
            java.lang.String r1 = "ab_version"
            r3.put(r1, r0)
        L4a:
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.uf()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L61
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.uf()
            java.lang.String r1 = "ab_group"
            r3.put(r1, r0)
        L61:
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.ed()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L78
            com.bytedance.embedapplog.rn r0 = r2.f2099m
            java.lang.String r0 = r0.ed()
            java.lang.String r1 = "ab_feature"
            r3.put(r1, r0)
        L78:
            r3 = 1
            return r3
    }
}

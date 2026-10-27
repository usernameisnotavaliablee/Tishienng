package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class gq extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2080m;
    private final android.content.Context up;

    gq(android.content.Context r2, com.bytedance.embedapplog.rn r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            r1.up = r2
            r1.f2080m = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "sdk_version"
            r1 = 336(0x150, float:4.71E-43)
            r4.put(r0, r1)
            java.lang.String r0 = "sdk_version_name"
            java.lang.String r1 = "3.9.1.baseChina-rc.42"
            r4.put(r0, r1)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.oq()
            java.lang.String r1 = "channel"
            r4.put(r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.g()
            java.lang.String r1 = "aid"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.s()
            java.lang.String r1 = "release_build"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.jy()
            java.lang.String r1 = "app_region"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.vl()
            java.lang.String r1 = "app_language"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.a()
            java.lang.String r1 = "user_agent"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.az()
            java.lang.String r1 = "ab_sdk_version"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.mi()
            java.lang.String r1 = "ab_version"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.j()
            java.lang.String r1 = "aliyun_uuid"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.qv()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L85
            android.content.Context r0 = r3.up
            com.bytedance.embedapplog.rn r1 = r3.f2080m
            java.lang.String r0 = com.bytedance.embedapplog.qa.j(r0, r1)
        L85:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L90
            java.lang.String r1 = "google_aid"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
        L90:
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.ch()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lab
            java.lang.String r1 = "app_track"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La7
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> La7
            goto Lab
        La7:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)
        Lab:
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.ws()
            if (r0 == 0) goto Lc3
            int r1 = r0.length()
            if (r1 <= 0) goto Lc3
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "custom"
            r4.put(r0, r1)
        Lc3:
            com.bytedance.embedapplog.rn r0 = r3.f2080m
            java.lang.String r0 = r0.av()
            java.lang.String r1 = "user_unique_id"
            com.bytedance.embedapplog.wq.j(r4, r1, r0)
            r4 = 1
            return r4
    }
}

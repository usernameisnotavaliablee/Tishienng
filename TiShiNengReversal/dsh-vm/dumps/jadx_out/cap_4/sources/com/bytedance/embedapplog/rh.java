package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class rh extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2095m;
    private final android.content.Context up;

    rh(android.content.Context r2, com.bytedance.embedapplog.rn r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            r1.up = r2
            r1.f2095m = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r9) {
            r8 = this;
            r0 = 0
            com.bytedance.embedapplog.rn r1 = r8.f2095m     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L2c
            boolean r1 = r1.rh()     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L1a
            android.content.Context r1 = r8.up     // Catch: java.lang.Exception -> L18
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r2)     // Catch: java.lang.Exception -> L18
            goto L2d
        L18:
            r1 = move-exception
            goto L27
        L1a:
            com.bytedance.embedapplog.rn r1 = r8.f2095m     // Catch: java.lang.Exception -> L18
            java.lang.String r1 = r1.ol()     // Catch: java.lang.Exception -> L18
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L18
            if (r2 != 0) goto L2c
            goto L2d
        L27:
            java.lang.String r2 = ""
            com.bytedance.embedapplog.uc.cw(r2, r1)
        L2c:
            r1 = r0
        L2d:
            boolean r2 = com.bytedance.embedapplog.wq.j(r1)
            r3 = 1
            java.lang.String r4 = "openudid"
            if (r2 == 0) goto L3e
            java.lang.String r2 = "9774d56d682e549c"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lb4
        L3e:
            android.content.Context r1 = r8.up
            java.lang.String r2 = "snssdk_openudid"
            r5 = 0
            android.content.SharedPreferences r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r1, r2, r5)
            java.lang.String r2 = "custom_b"
            java.lang.String r6 = r1.getString(r2, r0)
            java.lang.String r6 = com.bytedance.embedapplog.la.xt(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L5c
            java.lang.String r0 = r1.getString(r4, r0)
            goto L5d
        L5c:
            r0 = r6
        L5d:
            boolean r6 = com.bytedance.embedapplog.wq.j(r0)
            if (r6 != 0) goto Lb3
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            java.math.BigInteger r6 = new java.math.BigInteger
            r7 = 64
            r6.<init>(r7, r0)
            r0 = 16
            java.lang.String r0 = r6.toString(r0)
            char r5 = r0.charAt(r5)
            r6 = 45
            if (r5 != r6) goto L81
            java.lang.String r0 = r0.substring(r3)
        L81:
            int r5 = r0.length()
            int r5 = 13 - r5
            if (r5 <= 0) goto L9f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L8e:
            if (r5 <= 0) goto L98
            r7 = 70
            r6.append(r7)
            int r5 = r5 + (-1)
            goto L8e
        L98:
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L9f:
            java.lang.String r5 = "openudid.dat"
            java.lang.String r0 = r8.j(r5, r0)     // Catch: java.lang.Exception -> La5
        La5:
            java.lang.String r5 = com.bytedance.embedapplog.la.j(r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r2, r5)
            r1.apply()
        Lb3:
            r1 = r0
        Lb4:
            r9.put(r4, r1)
            return r3
    }
}
